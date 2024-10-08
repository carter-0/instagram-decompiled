package X;

/* renamed from: X.QxR  reason: case insensitive filesystem */
public final class C8589QxR extends C8563Qx1 implements C13650TeH {
    public static final C8589QxR zzb;
    public int zzd;
    public int zze = 0;
    public Object zzf;
    public C8584QxM zzg;
    public C8583QxL zzh;

    public static /* synthetic */ void A0A(C8588QxQ qxQ, C8589QxR qxR) {
        qxR.zzf = qxQ;
        qxR.zze = 2;
    }

    public static /* synthetic */ void A0B(C8585QxN qxN, C8589QxR qxR) {
        qxR.zzf = qxN;
        qxR.zze = 3;
    }

    public static /* synthetic */ void A0C(C8590QxS qxS, C8589QxR qxR) {
        qxR.zzf = qxS;
        qxR.zze = 5;
    }

    public static /* synthetic */ void A0D(C8584QxM qxM, C8589QxR qxR) {
        qxR.zzg = qxM;
        qxR.zzd |= 1;
    }

    public static /* synthetic */ void A0F(C8589QxR qxR, C8581QxJ qxJ) {
        qxR.zzf = qxJ;
        qxR.zze = 4;
    }

    static {
        C8589QxR qxR = new C8589QxR();
        zzb = qxR;
        C8563Qx1.A09(qxR, C8589QxR.class);
    }

    public static C8580QxI A00() {
        return (C8580QxI) zzb.A0L();
    }

    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8563Qx1.A07(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", C8588QxQ.class, C8585QxN.class, C8581QxJ.class, C8590QxS.class, "zzh"});
        } else if (i2 == 3) {
            return new C8589QxR();
        } else {
            if (i2 == 4) {
                return new C8580QxI((RPT) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void A0E(C8583QxL qxL, C8589QxR qxR) {
        qxL.getClass();
        qxR.zzh = qxL;
        qxR.zzd |= 2;
    }
}
