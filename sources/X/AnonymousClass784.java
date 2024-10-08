package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.784  reason: invalid class name */
public final class AnonymousClass784 implements C228252l5 {
    public final /* synthetic */ AnonymousClass782 A00;

    public AnonymousClass784(AnonymousClass782 r1) {
        this.A00 = r1;
    }

    public final void E5B(float f, float f2) {
        String str;
        if (f == 0.0f && f2 > 0.0f) {
            AnonymousClass782 r1 = this.A00;
            r1.A00 = true;
            if (r1 instanceof AnonymousClass781) {
                AnonymousClass781 r12 = (AnonymousClass781) r1;
                0wc r2 = r12.A00;
                C254793t3 CBU = r12.A02.C6l().CBU();
                if (CBU != null) {
                    str = C300965yF.A07(CBU);
                } else {
                    str = null;
                }
                0qQ.A0B(r2, 0);
                0Aj A002 = r2.A00(r2.A00, "direct_shh_mode_swipe_gesture");
                A002.AAJ("action", "start");
                A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                A002.Cgf();
            }
        }
        AnonymousClass782 r13 = this.A00;
        if ((r13 instanceof AnonymousClass787) && ((AnonymousClass787) r13).A04 != null) {
            RefreshableNestedScrollingParent refreshableNestedScrollingParent = r13.A04;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            refreshableNestedScrollingParent.A00 = 0.8f - (((float) Math.log10((double) ((f2 / 5.5f) + 1.0f))) * 5.5f);
        }
    }
}
