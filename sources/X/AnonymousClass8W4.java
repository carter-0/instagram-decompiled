package X;

import android.graphics.Bitmap;

/* renamed from: X.8W4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8W4 implements C61910qF, AnonymousClass2gO {
    public final /* synthetic */ C356918Vs A00;

    public AnonymousClass8W4(C356918Vs r1) {
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2gO) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, C356918Vs.class, "openStoryPostCapFromDraftSubFragment", "openStoryPostCapFromDraftSubFragment(Lcom/instagram/reels/draft/util/StoryDraftOpenConfig;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C362048hG r1;
        C376649Iu r6 = (C376649Iu) obj;
        0qQ.A0B(r6, 0);
        C356918Vs r3 = this.A00;
        C356908Vr r12 = r3.A05;
        String str = r6.A01;
        if (str.isEmpty()) {
            0kD.A01("QccState", "Invalid Activity result from StoryDraftFragment draft selection");
        } else {
            AnonymousClass8WX r0 = r12.A00.A1N;
            if (!(r0 == null || (r1 = r0.A00().A02) == null)) {
                r1.Dnm((Bitmap) r6.A00, str);
            }
        }
        r3.A00 = C356928Vt.PRE_CAPTURE;
        r3.A04.A01.A0U = false;
        r3.A03.A0y("QuickCaptureSubFragmentManager", 1);
    }
}
