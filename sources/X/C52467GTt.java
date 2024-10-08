package X;

import com.facebook.litho.ComponentTree;

/* renamed from: X.GTt  reason: case insensitive filesystem */
public final class C52467GTt implements AnonymousClass2WK {
    public final ComponentTree A00;
    public final AnonymousClass3OA A01;
    public final C54705HPk A02;

    public C52467GTt(ComponentTree componentTree, AnonymousClass3OA r3, C54705HPk hPk) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = componentTree;
        this.A02 = hPk;
    }

    public final 2WL Cfk(2WI r6, long j) {
        Object obj = null;
        if (this.A01.A07()) {
            C54705HPk hPk = this.A02;
            if (hPk instanceof HEU) {
                ComponentTree componentTree = this.A00;
                if (componentTree != null) {
                    componentTree.A0N((C251263mp) ((HEU) hPk).A00, C245063cG.A01(j), C245063cG.A00(j));
                }
                obj = new HEU(componentTree);
            } else if (hPk instanceof HET) {
                obj = new HET(((HET) hPk).A00);
            }
        }
        return new 2WL(C245133cN.A00(C245073cH.A01(j), C245073cH.A00(j)), obj);
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }
}
