package X;

import com.facebook.litho.ComponentsSystrace;

/* renamed from: X.GYc  reason: case insensitive filesystem */
public final class C52577GYc implements C59549JNv {
    public final /* synthetic */ C52576GYb A00;

    public C52577GYc(C52576GYb gYb) {
        this.A00 = gYb;
    }

    public final void DlI(int i, int i2) {
        C52576GYb gYb = this.A00;
        AnonymousClass2VL.A00();
        1Kb A002 = ComponentsSystrace.A00("LithoViewPagerAdapter.setDimensions");
        A002.ACO("widthPx", i);
        A002.ACO("heightPx", i2);
        A002.flush();
        gYb.A02 = i;
        gYb.A01 = i2;
        C52576GYb.A00(gYb);
        ComponentsSystrace.A01();
    }
}
