package X;

/* renamed from: X.QxL  reason: case insensitive filesystem */
public final class C8583QxL extends C8563Qx1 implements C13650TeH {
    public static final C8583QxL zzb;
    public int zzd;
    public boolean zze;
    public boolean zzf;

    public static /* synthetic */ void A0A(C8583QxL qxL) {
        qxL.zzd |= 2;
        qxL.zzf = false;
    }

    static {
        C8583QxL qxL = new C8583QxL();
        zzb = qxL;
        C8563Qx1.A09(qxL, C8583QxL.class);
    }

    public static C8572QxA A00() {
        return (C8572QxA) zzb.A0L();
    }

    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8563Qx1.A07(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C8583QxL();
        } else {
            if (i2 == 4) {
                return new C8572QxA((RPR) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
