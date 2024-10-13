#include <ArduinoJson.h>


StaticJsonDocument<100> doc;
void setup() {
// put your setup code here, to run once:
Serial.begin(9600);
}
void loop() {
// put your main code here, to run repeatedly:
float value = analogRead(A0);
// Gán giá trị nhiệt độ và độ ẩm vào đối tượng JsonDocument
doc["value"] = value;
serializeJson(doc, Serial);
Serial.println();
delay(1000);
}
