package X;

import java.util.EnumMap;

public abstract class V6S {
    public static final C16529UwZ A00(C16529UwZ uwZ, Integer num) {
        EnumMap enumMap;
        int intValue = num.intValue();
        if (intValue == 2) {
            enumMap = C16529UwZ.A00;
        } else if (intValue != 1) {
            enumMap = C16529UwZ.A02;
        } else {
            enumMap = C16529UwZ.A01;
        }
        return (C16529UwZ) enumMap.get(uwZ);
    }
}
