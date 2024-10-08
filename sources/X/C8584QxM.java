package X;

/* renamed from: X.QxM  reason: case insensitive filesystem */
public final class C8584QxM extends C8563Qx1 implements C13650TeH {
    public static final C8584QxM zzb;
    public int zzd;
    public String zze = "";
    public String zzf = "";

    static {
        C8584QxM qxM = new C8584QxM();
        zzb = qxM;
        C8563Qx1.A09(qxM, C8584QxM.class);
    }

    public static C8575QxD A00() {
        return (C8575QxD) zzb.A0L();
    }

    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8563Qx1.A07(zzb, C66579MXk.A00(417), new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C8584QxM();
        } else {
            if (i2 == 4) {
                return new C8575QxD((RPQ) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void A0A(C8584QxM qxM, String str) {
        str.getClass();
        qxM.zzd |= 1;
        qxM.zze = str;
    }

    public static /* synthetic */ void A0B(C8584QxM qxM, String str) {
        str.getClass();
        qxM.zzd |= 2;
        qxM.zzf = str;
    }
}
