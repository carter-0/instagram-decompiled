package X;

import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.List;

/* renamed from: X.6np  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C317786np implements C62320sa {
    public final /* synthetic */ C310236ae A00;

    public /* synthetic */ C317786np(C310236ae r1) {
        this.A00 = r1;
    }

    public final Object invoke() {
        List Bkd;
        C310236ae r2 = this.A00;
        C273384mU r1 = r2.A0F;
        C250973mM r6 = ((ReelViewerFragment) r1).A0a;
        C255773uh Au5 = r1.Au5();
        if (!(r6 == null || Au5 == null || (Bkd = Au5.Bkd(AnonymousClass3WT.AVATAR)) == null)) {
            Object obj = Bkd.get(0);
            obj.getClass();
            C14015ToH toH = ((C255783ui) obj).A0C;
            if (toH != null) {
                r2.A0E.A0C(r2.A06, toH, r6, new Lw6(r2), "ig_stories_consumption", "ig_stories_consumption_attribution_bottom_sheet", false, true);
            }
        }
        return C60340gF.A00;
    }
}
