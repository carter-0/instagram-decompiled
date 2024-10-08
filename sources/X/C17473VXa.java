package X;

import java.util.HashMap;

/* renamed from: X.VXa  reason: case insensitive filesystem */
public final class C17473VXa {
    public VZ9 A00;
    public final W2O A01;
    public final C17341VRu A02;
    public final C17342VRv A03;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.VZ9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.X8I] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.W2O, X.URy] */
    public C17473VXa(1Uk r6, C17341VRu vRu, C17342VRv vRv) {
        C15147URz uRz;
        if (r6 == null) {
            ? w2o = new W2O();
            w2o.A00 = new HashMap();
            uRz = w2o;
        } else {
            uRz = new C15147URz(r6);
        }
        this.A02 = vRu;
        this.A03 = vRv;
        this.A01 = uRz;
        C17175VLe vLe = new C17175VLe(this);
        ? obj = new Object();
        obj.A04 = "LS_IgdReceiverFetch";
        obj.A03 = "";
        obj.A01 = vLe;
        obj.A02 = uRz;
        obj.A00 = new Object();
        this.A00 = obj;
    }
}
