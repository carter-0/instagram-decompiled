package X;

import java.nio.ByteBuffer;

/* renamed from: X.3H8  reason: invalid class name */
public abstract class AnonymousClass3H8 {
    /* JADX INFO: finally extract failed */
    public static final String A00(String str) {
        2RM r3 = AnonymousClass2RJ.A00;
        int length = str.length();
        int i = length * 2;
        boolean z = false;
        if (i >= 0) {
            z = true;
        }
        17k.A0C("expectedInputSize must be >= 0 but was %s", i, z);
        2RO A02 = r3.A02();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            ByteBuffer byteBuffer = A02.A00;
            byteBuffer.putChar(charAt);
            try {
                A02.A02(byteBuffer.array(), 0, 2);
                byteBuffer.clear();
                i2++;
            } catch (Throwable th) {
                byteBuffer.clear();
                throw th;
            }
        }
        String obj = A02.A03().toString();
        0qQ.A07(obj);
        return 002.A0R("switcher_snooze_end_time_", obj);
    }
}
