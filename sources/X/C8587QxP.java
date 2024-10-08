package X;

/* renamed from: X.QxP  reason: case insensitive filesystem */
public final class C8587QxP extends C8563Qx1 implements C13650TeH {
    public static final C8587QxP zzb;
    public int zzd;
    public int zze;
    public String zzf = "";
    public int zzg;
    public String zzh = "";

    public static /* synthetic */ void A0A(C8587QxP qxP, int i) {
        qxP.zzd |= 1;
        qxP.zze = i;
    }

    public static /* synthetic */ void A0B(C8587QxP qxP, int i) {
        qxP.zzg = i - 1;
        qxP.zzd |= 4;
    }

    static {
        C8587QxP qxP = new C8587QxP();
        zzb = qxP;
        C8563Qx1.A09(qxP, C8587QxP.class);
    }

    public static C8577QxF A00() {
        return (C8577QxF) zzb.A0L();
    }

    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8563Qx1.A07(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C12576Syb.A00, "zzh"});
        } else if (i2 == 3) {
            return new C8587QxP();
        } else {
            if (i2 == 4) {
                return new C8577QxF((RPP) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void A0C(C8587QxP qxP, String str) {
        str.getClass();
        qxP.zzd |= 2;
        qxP.zzf = str;
    }
}
