package X;

import com.facebook.litho.ComponentTree;

public final class GYZ {
    public C338347ho A00;
    public boolean A01 = true;
    public ComponentTree A02;
    public final int A03 = C52576GYb.A09.getAndIncrement();
    public final /* synthetic */ C52576GYb A04;

    public GYZ(C52576GYb gYb) {
        this.A04 = gYb;
    }

    public final ComponentTree A00() {
        AnonymousClass2VL.A00();
        ComponentTree componentTree = this.A02;
        if (componentTree != null) {
            return componentTree;
        }
        C52576GYb gYb = this.A04;
        AnonymousClass3X6 A022 = ComponentTree.A02(this.A00.A00, gYb.A03, (AnonymousClass2TL) null);
        A022.A07 = Boolean.valueOf(gYb.A06);
        A022.A03 = null;
        ComponentTree A002 = A022.A00();
        this.A02 = A002;
        this.A01 = false;
        return A002;
    }
}
