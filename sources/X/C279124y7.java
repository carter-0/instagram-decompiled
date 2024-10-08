package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.4y7  reason: invalid class name and case insensitive filesystem */
public final class C279124y7 implements C279134y8 {
    public final UserSession A00;
    public final Fragment A01;
    public final AnonymousClass311 A02;
    public final C253843rV A03;

    public C279124y7(Fragment fragment, UserSession userSession, AnonymousClass311 r4, C253843rV r5) {
        0qQ.A0B(r5, 3);
        this.A01 = fragment;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = userSession;
    }

    public final void Dl8(1Xj r12, GQ0 gq0, AnonymousClass3V3 r14, AnonymousClass3W1 r15, int i, int i2) {
        ReboundViewPager reboundViewPager;
        AnonymousClass3V3 r7 = r14;
        1Xj r5 = r12;
        0qQ.A0B(r12, 0);
        AnonymousClass3W1 r8 = r15;
        0qQ.A0B(r15, 1);
        int i3 = i2;
        if (r15.A02 != i3) {
            UserSession userSession = this.A00;
            if (C262574Fa.A00(userSession, r12) && 182.A06(0Tu.A05, userSession, 2342173793973650193L)) {
                if ((r14 instanceof C279064y1) && (reboundViewPager = ((C279064y1) r7).A04) != null) {
                    reboundViewPager.A0L(i3, 0.0f);
                    return;
                }
                return;
            }
        }
        UserSession userSession2 = this.A00;
        if (!C262574Fa.A00(userSession2, r12) || !182.A06(0Tu.A05, userSession2, 36330784760283922L)) {
            this.A03.A00(r14.BQB(), r5, gq0, r7, r8, (AnonymousClass3VF) null, i);
            return;
        }
        FragmentActivity requireActivity = this.A01.requireActivity();
        C270634h3 r1 = new C270634h3(ClipsViewerSource.FEED_TIMELINE, userSession2);
        r1.A1C = r12.getId();
        C250563lf.A0X(requireActivity, r1.A00(), userSession2);
    }

    public final JOE BQ4() {
        return this.A02.BQ4();
    }

    public final void DA2(C279064y1 r7, 1Xj r8, GQ0 gq0, AnonymousClass3W1 r10, int i) {
        if (r7.A0E.getIgImageView().A0G()) {
            this.A03.A01(r7.A0J, r8, gq0, r10, i);
        }
    }
}
