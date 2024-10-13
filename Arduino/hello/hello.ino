#include <LiquidCrystal_I2C.h>
LiquidCrystal_I2C lcd(0x3F,16,2);
void setup() {
  // put your setup code here, to run once:
  lcd.init();
  lcd.backlight();
  lcd.setCursor(0,0);
  lcd.print("Hello, world!");// In ra màn hình LCD
  lcd.setCursor(0,1); // Đưa con trỏ tới vị trí hàng 1 cột 2
  lcd.print("IoT LAB"); // In ra màn hình LCD
}

void loop() {
  // put your main code here, to run repeatedly:

}
