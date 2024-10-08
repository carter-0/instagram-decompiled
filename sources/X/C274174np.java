package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.4np  reason: invalid class name and case insensitive filesystem */
public final class C274174np implements C274184nq {
    public final UserSession A00;
    public final Fragment A01;
    public final AnonymousClass311 A02;
    public final C253843rV A03;

    public C274174np(Fragment fragment, UserSession userSession, AnonymousClass311 r4, C253843rV r5) {
        0qQ.A0B(r5, 3);
        this.A01 = fragment;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = userSession;
    }

    public final void Dl4(C262804Gb r12, 1Xj r13, GQ0 gq0, AnonymousClass3W1 r15, int i, int i2) {
        1Xj r5 = r13;
        0qQ.A0B(r13, 0);
        if (r12.A0F.getIgImageView().A0G()) {
            AnonymousClass3W1 r8 = r15;
            int i3 = i2;
            if (r15.A02 != i3) {
                UserSession userSession = this.A00;
                if (C262574Fa.A00(userSession, r13) && 182.A06(0Tu.A05, userSession, 2342173793973650193L)) {
                    ReboundViewPager reboundViewPager = r12.A01;
                    if (reboundViewPager != null) {
                        reboundViewPager.A0L(i3, 0.0f);
                        return;
                    }
                    return;
                }
            }
            UserSession userSession2 = this.A00;
            if (!C262574Fa.A00(userSession2, r13) || !182.A06(0Tu.A05, userSession2, 36330784760283922L)) {
                this.A03.A00(r12.A0J, r5, gq0, (AnonymousClass3V3) null, r8, r12.A0I, i);
                return;
            }
            FragmentActivity requireActivity = this.A01.requireActivity();
            C270634h3 r1 = new C270634h3(ClipsViewerSource.FEED_TIMELINE, userSession2);
            r1.A1C = r13.getId();
            C250563lf.A0X(requireActivity, r1.A00(), userSession2);
        }
    }

    public final JOE BQ4() {
        return this.A02.BQ4();
    }

    public final void D9z(C262804Gb r7, 1Xj r8, GQ0 gq0, AnonymousClass3W1 r10, int i) {
        if (r7.A0F.getIgImageView().A0G()) {
            this.A03.A01(r7.A0J, r8, gq0, r10, i);
        }
    }
}
