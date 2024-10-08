package X;

import java.util.Iterator;

/* renamed from: X.QxS  reason: case insensitive filesystem */
public final class C8590QxS extends C8563Qx1 implements C13650TeH {
    public static final C13483TbA zzb = new C12581Syg();
    public static final C8590QxS zzd;
    public int zze;
    public String zzf = "";
    public int zzg;
    public C13956TmJ zzh = C8563Qx1.A04();
    public C13984Tna zzi = C8563Qx1.A06();
    public C8587QxP zzj;
    public boolean zzk;
    public boolean zzl;

    public static /* synthetic */ void A0C(C8590QxS qxS) {
        qxS.zze |= 16;
        qxS.zzl = false;
    }

    public static /* synthetic */ void A0D(C8590QxS qxS, int i) {
        qxS.zzg = i - 1;
        qxS.zze |= 2;
    }

    public static /* synthetic */ void A0G(C8590QxS qxS, boolean z) {
        qxS.zze |= 8;
        qxS.zzk = z;
    }

    static {
        C8590QxS qxS = new C8590QxS();
        zzd = qxS;
        C8563Qx1.A09(qxS, C8590QxS.class);
    }

    public static C8579QxH A00() {
        return (C8579QxH) zzd.A0L();
    }

    public static C8590QxS A0A(C11371SQf sQf, byte[] bArr) {
        return (C8590QxS) C8563Qx1.A01(sQf, zzd, bArr);
    }

    public static /* synthetic */ void A0F(C8590QxS qxS, Iterable iterable) {
        C13956TmJ tmJ = qxS.zzh;
        if (!tmJ.FPP()) {
            int size = tmJ.size();
            int i = size + size;
            if (size == 0) {
                i = 10;
            }
            qxS.zzh = tmJ.FPp(i);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            qxS.zzh.FPw(((RDY) it.next()).A00());
        }
    }

    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8563Qx1.A07(zzd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zze", "zzf", "zzg", C12578Syd.A00, "zzh", C12577Syc.A00, "zzi", C8586QxO.class, "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C8590QxS();
        } else {
            if (i2 == 4) {
                return new C8579QxH((C12581Syg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzd;
        }
    }

    public static /* synthetic */ void A0B(C8587QxP qxP, C8590QxS qxS) {
        qxP.getClass();
        qxS.zzj = qxP;
        qxS.zze |= 4;
    }

    public static /* synthetic */ void A0E(C8590QxS qxS, C8586QxO qxO) {
        qxO.getClass();
        C13984Tna tna = qxS.zzi;
        if (!tna.FPP()) {
            tna = C8563Qx1.A05(tna);
            qxS.zzi = tna;
        }
        tna.add(qxO);
    }
}
