package X;

public final class SK0 {
    public SK0() {
        this(0);
    }

    public SK0(int i) {
    }

    public final /* synthetic */ int A00(Object obj) {
        return ((STV) obj).A04();
    }

    public final /* synthetic */ int A01(Object obj) {
        return ((STV) obj).A05();
    }

    public final /* synthetic */ STV A02(Object obj) {
        return ((C8563Qx1) obj).zzc;
    }

    public final /* bridge */ /* synthetic */ STV A03(Object obj) {
        C8563Qx1 qx1 = (C8563Qx1) obj;
        STV stv = qx1.zzc;
        if (stv != STV.A00()) {
            return stv;
        }
        STV A01 = STV.A01();
        qx1.zzc = A01;
        return A01;
    }

    public final /* synthetic */ void A05(C13865Tim tim, Object obj) {
        ((STV) obj).A0A(tim);
    }

    public final void A06(Object obj) {
        ((C8563Qx1) obj).zzc.A07();
    }

    public final /* bridge */ /* synthetic */ void A07(Object obj, int i, long j) {
        ((STV) obj).A08(i << 3, Long.valueOf(j));
    }

    public final /* synthetic */ void A08(Object obj, Object obj2) {
        ((C8563Qx1) obj).zzc = (STV) obj2;
    }

    public final /* bridge */ /* synthetic */ Object A04(Object obj, Object obj2) {
        STV A00 = STV.A00();
        if (A00.equals(obj2)) {
            return obj;
        }
        STV stv = (STV) obj2;
        if (A00.equals(obj)) {
            return STV.A02((STV) obj, stv);
        }
        ((STV) obj).A09(stv);
        return obj;
    }
}
