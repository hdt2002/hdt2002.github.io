#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int maxProductOfSums(const vector<int>& A, int N) {
    int totalSum = 0;
    for (int i = 0; i < N; ++i) {
        totalSum += A[i];
    }
    
    int halfSum = totalSum / 2;
    vector<vector<bool>> dp(N + 1, vector<bool>(halfSum + 1, false));
    dp[0][0] = true;

    for (int i = 1; i <= N; ++i) {
        int current = A[i - 1];
        for (int j = halfSum; j >= current; --j) {
            dp[i][j] = dp[i-1][j] || dp[i-1][j-current];
        }
    }

    int maxSum = 0;
    for (int j = 0; j <= halfSum; ++j) {
        if (dp[N][j]) {
            maxSum = j;
        }
    }

    int S1 = maxSum;
    int S2 = totalSum - S1;
    return S1 * S2;
}

int main() {
    int t;
    cin >> t; // Số lượng testcase
    while (t--) {
        int N;
        cin >> N; // Số lượng phần tử trong dãy A
        vector<int> A(N);
        for (int i = 0; i < N; ++i) {
            cin >> A[i];
        }
        cout << maxProductOfSums(A, N) << endl;
    }
    return 0;
}
