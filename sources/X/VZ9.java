package X;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class VZ9 {
    public X8I A00;
    public C17175VLe A01;
    public W2O A02;
    public String A03;
    public String A04;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.V40, java.lang.Object] */
    public static V40 A00(VZ9 vz9, V4K v4k, byte[] bArr, int i) {
        int i2;
        if (v4k == null) {
            return null;
        }
        if (!v4k.A00()) {
            throw new IllegalStateException("Cached token is not redeemable. Neither storage nor ACS should return unredeemable tokens; this should not happen.");
        }
        v4k.A01++;
        for (Integer intValue : AnonymousClass05K.A00(2)) {
            if (1 - intValue.intValue() != 0) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            if (i == i2) {
                Mac instance = Mac.getInstance("HmacSHA512");
                if (instance != null) {
                    instance.init(new SecretKeySpec(v4k.A05, "HmacSHA512"));
                    byte[] doFinal = instance.doFinal(bArr);
                    if (doFinal != null) {
                        String str = vz9.A04;
                        String str2 = vz9.A03;
                        String str3 = v4k.A03;
                        byte[] bArr2 = v4k.A04;
                        byte[] bArr3 = v4k.A05;
                        ? obj = new Object();
                        obj.A01 = str;
                        obj.A00 = str2;
                        obj.A02 = str3;
                        obj.A06 = doFinal;
                        obj.A04 = bArr2;
                        obj.A05 = bArr;
                        obj.A03 = bArr3;
                        return obj;
                    }
                    throw new Exception("Generated tag is null.");
                }
                throw new Exception(002.A0R("Invalid mac instance: ", "HmacSHA512"));
            }
        }
        throw new Exception(002.A0O("Unknown cipher suite: ", i));
    }
}
