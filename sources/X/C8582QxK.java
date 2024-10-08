package X;

/* renamed from: X.QxK  reason: case insensitive filesystem */
public final class C8582QxK extends C8563Qx1 implements C13650TeH {
    public static final C8582QxK zzb;
    public int zzd;
    public int zze;

    public static /* synthetic */ void A0A(C8582QxK qxK) {
        qxK.zze = 9;
        qxK.zzd |= 1;
    }

    static {
        C8582QxK qxK = new C8582QxK();
        zzb = qxK;
        C8563Qx1.A09(qxK, C8582QxK.class);
    }

    public static C8573QxB A00() {
        return (C8573QxB) zzb.A0L();
    }

    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8563Qx1.A07(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C12579Sye.A00});
        } else if (i2 == 3) {
            return new C8582QxK();
        } else {
            if (i2 == 4) {
                return new C8573QxB((RPS) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
