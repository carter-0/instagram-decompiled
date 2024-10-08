package X;

/* renamed from: X.QxJ  reason: case insensitive filesystem */
public final class C8581QxJ extends C8563Qx1 implements C13650TeH {
    public static final C8581QxJ zzb;
    public int zzd;
    public int zze;

    public static C8581QxJ A00() {
        return zzb;
    }

    static {
        C8581QxJ qxJ = new C8581QxJ();
        zzb = qxJ;
        C8563Qx1.A09(qxJ, C8581QxJ.class);
    }

    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8563Qx1.A07(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C12580Syf.A00});
        } else if (i2 == 3) {
            return new C8581QxJ();
        } else {
            if (i2 == 4) {
                return new C8571Qx9((RPV) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
