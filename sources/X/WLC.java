package X;

import java.util.HashMap;

public final class WLC implements X2v {
    /* JADX WARNING: type inference failed for: r4v0, types: [X.Vk4, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object EB6(Object obj, Object obj2) {
        C18473VsP vsP;
        C18474VsQ vsQ = (C18474VsQ) obj;
        V33 v33 = (V33) obj2;
        if (v33 instanceof UW1) {
            UW1 uw1 = (UW1) v33;
            if (!uw1.A01) {
                return vsQ;
            }
            vsP = new C18473VsP(vsQ);
            vsP.A00 = uw1.A00;
        } else if (v33 instanceof C15218UVv) {
            C15218UVv uVv = (C15218UVv) v33;
            C18026Vk4 vk4 = vsQ.A01;
            ? obj3 = new Object();
            HashMap hashMap = new HashMap(vk4.A00);
            obj3.A00 = hashMap;
            Pxe.A1X(uVv.A01.A01, hashMap, uVv.A00);
            vsP = new C18473VsP(vsQ);
            vsP.A01 = obj3;
        } else if (!(v33 instanceof UVM)) {
            return vsQ;
        } else {
            vsP = new C18473VsP(vsQ);
            vsP.A03 = ((UVM) v33).A00;
        }
        return new C18474VsQ(vsP.A00, vsP.A01, vsP.A02, vsP.A03);
    }
}
