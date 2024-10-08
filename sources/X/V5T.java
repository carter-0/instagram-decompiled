package X;

public abstract class V5T {
    public static final Integer A00(String str) {
        Integer num = AnonymousClass05K.A00;
        if (str.equals("Success")) {
            return num;
        }
        Integer num2 = AnonymousClass05K.A01;
        if (str.equals("CDL Not Ready")) {
            return num2;
        }
        Integer num3 = AnonymousClass05K.A0C;
        if (str.equals("CDL Error")) {
            return num3;
        }
        Integer num4 = AnonymousClass05K.A0N;
        if (str.equals("No Current Avatar")) {
            return num4;
        }
        Integer num5 = AnonymousClass05K.A0Y;
        if (str.equals("Unknown Request Id")) {
            return num5;
        }
        Integer num6 = AnonymousClass05K.A0j;
        if (str.equals("Duplicate Request Id")) {
            return num6;
        }
        Integer num7 = AnonymousClass05K.A0u;
        if (str.equals("Skipped Request")) {
            return num7;
        }
        Integer num8 = AnonymousClass05K.A15;
        if (!str.equals("Internal Error")) {
            return AnonymousClass05K.A1F;
        }
        return num8;
    }
}
