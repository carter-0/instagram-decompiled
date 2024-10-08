package X;

/* renamed from: X.Kvc  reason: case insensitive filesystem */
public abstract class C63355Kvc {
    public static final C283135Gg A00(C283155Gi r11, String str) {
        Object obj;
        long currentTimeMillis;
        0qQ.A0B(r11, 0);
        try {
            String A00 = C283145Gh.A00(r11);
            0qQ.A07(A00);
            obj = A00.getBytes(AnonymousClass15Q.A05);
            0qQ.A07(obj);
        } catch (Throwable th) {
            obj = JTO.A1B(th);
        }
        if (obj instanceof 0eQ) {
            obj = null;
        }
        byte[] bArr = (byte[]) obj;
        if (bArr == null) {
            return null;
        }
        String str2 = r11.A09;
        0qQ.A07(str2);
        int i = r11.A00;
        Double A05 = r11.A05();
        if (A05 != null) {
            currentTimeMillis = (long) A05.doubleValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        return new C283135Gg((Long) null, str2, str, bArr, i, 0, 0, currentTimeMillis, 0qQ.A0K(r11.A0D, C273654mx.A00(3147)));
    }
}
