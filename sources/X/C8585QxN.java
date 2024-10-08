package X;

/* renamed from: X.QxN  reason: case insensitive filesystem */
public final class C8585QxN extends C8563Qx1 implements C13650TeH {
    public static final C8585QxN zzb;
    public int zzd;
    public int zze = 0;
    public Object zzf;
    public int zzg;

    public static /* synthetic */ void A0A(C8585QxN qxN, int i) {
        qxN.zzg = i - 1;
        qxN.zzd |= 1;
    }

    static {
        C8585QxN qxN = new C8585QxN();
        zzb = qxN;
        C8563Qx1.A09(qxN, C8585QxN.class);
    }

    public static C8574QxC A00() {
        return (C8574QxC) zzb.A0L();
    }

    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8563Qx1.A07(zzb, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C12575Sya.A00, C8582QxK.class});
        } else if (i2 == 3) {
            return new C8585QxN();
        } else {
            if (i2 == 4) {
                return new C8574QxC((RPO) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void A0B(C8585QxN qxN, C8582QxK qxK) {
        qxK.getClass();
        qxN.zzf = qxK;
        qxN.zze = 2;
    }
}
