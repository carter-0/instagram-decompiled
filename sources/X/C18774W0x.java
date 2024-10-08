package X;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* renamed from: X.W0x  reason: case insensitive filesystem */
public final class C18774W0x {
    public static ThreadLocal A00 = new C20567Wuk();

    public static double A01(String str, double d) {
        try {
            if (str.endsWith("%")) {
                return (Double.parseDouble(str.substring(0, str.length() - 1)) * d) / 100.0d;
            }
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            C13989Tnp.A1T("Invalid translate value: ", str);
            return 0.0d;
        }
    }

    public static double A00(ReadableMap readableMap, String str) {
        boolean z = true;
        if (readableMap.getType(str) != ReadableType.String) {
            return readableMap.getDouble(str);
        }
        String string = readableMap.getString(str);
        if (string.endsWith("rad")) {
            string = string.substring(0, string.length() - 3);
        } else if (string.endsWith("deg")) {
            string = string.substring(0, string.length() - 3);
            z = false;
        }
        double parseFloat = (double) Float.parseFloat(string);
        if (!z) {
            return C13989Tnp.A00(parseFloat);
        }
        return parseFloat;
    }
}
