package X;

/* renamed from: X.QxO  reason: case insensitive filesystem */
public final class C8586QxO extends C8563Qx1 implements C13650TeH {
    public static final C8586QxO zzb;
    public int zzd;
    public C13984Tna zze = C8563Qx1.A06();
    public int zzf;
    public String zzg = "";

    public static /* synthetic */ void A0A(C8586QxO qxO, int i) {
        qxO.zzd |= 1;
        qxO.zzf = i;
    }

    static {
        C8586QxO qxO = new C8586QxO();
        zzb = qxO;
        C8563Qx1.A09(qxO, C8586QxO.class);
    }

    public static C8578QxG A00() {
        return (C8578QxG) zzb.A0L();
    }

    public static /* synthetic */ void A0B(C8586QxO qxO, Iterable iterable) {
        C13984Tna tna = qxO.zze;
        if (!tna.FPP()) {
            tna = C8563Qx1.A05(tna);
            qxO.zze = tna;
        }
        C12586Syl.A0H(iterable, tna);
    }

    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8563Qx1.A07(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C8586QxO();
        } else {
            if (i2 == 4) {
                return new C8578QxG((RPU) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void A0C(C8586QxO qxO, String str) {
        str.getClass();
        qxO.zzd |= 2;
        qxO.zzg = str;
    }
}
