int capteur = A0;
int fl = 11;
int bl = 10;
int fr = 9;
int br = 6;
void setup() {
}
void loop() {
analogWrite(br, 0);
analogWrite(bl, 0);
delay(100);
analogWrite(fr, 255);
analogWrite(fl, 255);
if (analogRead(capteur)>100) {
analogWrite(br, 0);
analogWrite(fl, 0);
delay(100);
analogWrite(fr, 255);
analogWrite(bl, 255);
delay(5000);
analogWrite(fr, 0);
analogWrite(fl, 0);
analogWrite(br, 0);
analogWrite(bl, 0);
analogWrite(fr, 0);
analogWrite(fl, 0);
analogWrite(br, 0);
analogWrite(bl, 0);
}
}
