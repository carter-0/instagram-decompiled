package X;

/* renamed from: X.QxQ  reason: case insensitive filesystem */
public final class C8588QxQ extends C8563Qx1 implements C13650TeH {
    public static final C8588QxQ zzb;
    public int zzd;
    public int zze = 0;
    public Object zzf;
    public int zzg;
    public C8587QxP zzh;

    public static /* synthetic */ void A0B(C8588QxQ qxQ, int i) {
        qxQ.zzg = i - 1;
        qxQ.zzd |= 1;
    }

    static {
        C8588QxQ qxQ = new C8588QxQ();
        zzb = qxQ;
        C8563Qx1.A09(qxQ, C8588QxQ.class);
    }

    public static C8576QxE A00() {
        return (C8576QxE) zzb.A0L();
    }

    public static C8588QxQ A0A(C11371SQf sQf, byte[] bArr) {
        return (C8588QxQ) C8563Qx1.A01(sQf, zzb, bArr);
    }

    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8563Qx1.A07(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C12575Sya.A00, "zzh", C8582QxK.class});
        } else if (i2 == 3) {
            return new C8588QxQ();
        } else {
            if (i2 == 4) {
                return new C8576QxE((RPN) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void A0C(C8588QxQ qxQ, C8587QxP qxP) {
        qxP.getClass();
        qxQ.zzh = qxP;
        qxQ.zzd |= 2;
    }

    public static /* synthetic */ void A0D(C8588QxQ qxQ, C8582QxK qxK) {
        qxK.getClass();
        qxQ.zzf = qxK;
        qxQ.zze = 4;
    }
}
