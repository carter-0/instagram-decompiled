package X;

import java.util.List;

/* renamed from: X.UdS  reason: case insensitive filesystem */
public final class C15477UdS extends 2Ru {
    public VTS A00;
    public CharSequence A01;
    public List A02;
    public final V3W A03;
    public final C15514Ue3 A04;
    public final E9X A05;
    public final C15499Udo A06;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Udo, X.2s0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.E9X, X.2s0, java.lang.Object] */
    public C15477UdS(V3W v3w, C15390Ubt ubt) {
        super(false);
        ? obj = new Object();
        this.A06 = obj;
        C15514Ue3 ue3 = new C15514Ue3(ubt);
        this.A04 = ue3;
        ? obj2 = new Object();
        this.A05 = obj2;
        init(new C231642s0[]{obj, ue3, obj2});
        this.A03 = v3w;
        A00(this);
    }

    public static final void A00(C15477UdS udS) {
        udS.clear();
        if (udS.A02 != null) {
            VTS vts = udS.A00;
            if (vts != null) {
                udS.addModel(vts, udS.A06);
            }
            List<Object> list = udS.A02;
            0qQ.A0A(list);
            for (Object addModel : list) {
                udS.addModel(addModel, udS.A03, udS.A04);
            }
            udS.addModel(udS.A01, udS.A05);
        }
        udS.notifyDataSetChanged();
    }
}
