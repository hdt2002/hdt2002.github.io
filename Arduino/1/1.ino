#include <SoftwareSerial.h>

SoftwareSerial mySerial(6, 7); // TX, RX

#define M0 8
#define M1 9  
#define D5 5               

void setup() {
  Serial.begin(9600);
  mySerial.begin(9600);
  
  pinMode(M0, OUTPUT);        
  pinMode(M1, OUTPUT);
  pinMode(D5, OUTPUT);
  digitalWrite(M0, LOW);       // Set 2 chân M0 và M1 xuống LOW 
  digitalWrite(M1, LOW);       // để hoạt động ở chế độ Normal
  digitalWrite(D5, LOW);
}

void loop() {
  if (mySerial.available() > 0) {
    String input = mySerial.readStringUntil('\n');
    Serial.println(input);
    if (input.toInt() == 1) { // Chuyển đổi input thành số và so sánh với 1
      digitalWrite(D5, HIGH); // Bật còi
    } else {
      digitalWrite(D5, LOW);  // Tắt còi
    }
  }
}
