package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.6rs  reason: invalid class name and case insensitive filesystem */
public abstract class C320166rs {
    public static final String A00(int i, int i2) {
        StringWriter stringWriter = new StringWriter();
        try {
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0b();
            A0A.A0g(i);
            A0A.A0g(i2);
            A0A.A0Y();
            A0A.close();
        } catch (IOException e) {
            0KC.A0H("AnalyticsEventExtraUtil", "Unable to serialize grid position.", e);
        }
        String obj = stringWriter.toString();
        0qQ.A07(obj);
        return obj;
    }

    public static final String A01(int i, int i2) {
        StringWriter stringWriter = new StringWriter();
        try {
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0b();
            A0A.A0t(String.valueOf(i));
            A0A.A0t(String.valueOf(i2));
            A0A.A0Y();
            A0A.close();
        } catch (IOException e) {
            0KC.A0H("AnalyticsEventExtraUtil", "Unable to serialize grid position.", e);
        }
        String obj = stringWriter.toString();
        0qQ.A07(obj);
        return obj;
    }
}
