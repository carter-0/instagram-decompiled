package org.webrtc;

import X.AnonymousClass7TE;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class JniHelper {
    public static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            throw AnonymousClass7TE.A15("ISO-8859-1 is unsupported");
        }
    }

    public static Object getStringClass() {
        return String.class;
    }

    public static Object getKey(Map.Entry entry) {
        return entry.getKey();
    }

    public static Object getValue(Map.Entry entry) {
        return entry.getValue();
    }
}
