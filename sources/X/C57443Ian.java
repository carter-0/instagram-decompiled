package X;

import android.content.Context;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Ian  reason: case insensitive filesystem */
public final class C57443Ian implements G7Q {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ C250973mM A02;
    public final /* synthetic */ AnonymousClass6Z5 A03;

    public C57443Ian(Context context, AnonymousClass4DH r2, C250973mM r3, AnonymousClass6Z5 r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = context;
        this.A02 = r3;
    }

    public final void DwL(String str) {
        if (this.A01.isAdded()) {
            Context context = this.A00;
            C59689JTv.A00(context, context.getString(2131967926), Pxd.A00(35), 0);
        }
    }

    public final void DwN(boolean z, boolean z2) {
        AnonymousClass4DH r5 = this.A01;
        if (r5.isAdded()) {
            AnonymousClass6Z5 r4 = this.A03;
            C273384mU r2 = r4.A17;
            r2.DcT();
            Context context = this.A00;
            if (r4.A09 == null) {
                DbS.A17();
                throw AnonymousClass00P.createAndThrow();
            }
            C49811F7y.A01(context, AnonymousClass05K.A0C, z, z2);
            C313056fm r0 = ((ReelViewerFragment) r2).mViewPager;
            if (r0 != null) {
                ((C313046fl) r0).A02.postDelayed(new C57935Iiq(r5, this.A02, r4), 750);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
