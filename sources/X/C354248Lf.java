package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* renamed from: X.8Lf  reason: invalid class name and case insensitive filesystem */
public final class C354248Lf implements C3506985v {
    public int A00;
    public AnonymousClass8YU A01;
    public AnonymousClass863 A02;
    public boolean A03 = true;
    public boolean A04;
    public final Fragment A05;
    public final AnonymousClass8LU A06;
    public final AnonymousClass861 A07;
    public final ViewGroup A08;
    public final UserSession A09;
    public final ClipsCreationViewModel A0A;
    public final C3511387s A0B;
    public final LoadingSpinnerView A0C;

    public final void DNQ() {
    }

    public final void DnX() {
        this.A04 = false;
    }

    public final void Dxa() {
    }

    public final void DyD(int i) {
    }

    public C354248Lf(ViewGroup viewGroup, Fragment fragment, UserSession userSession, AnonymousClass8LU r9) {
        this.A09 = userSession;
        this.A05 = fragment;
        FragmentActivity requireActivity = fragment.requireActivity();
        this.A07 = new 2YN(requireActivity).A00(AnonymousClass860.class).A00("post_capture");
        this.A06 = r9;
        this.A0A = new 2YN(new C3500182v(userSession, requireActivity), requireActivity).A00(ClipsCreationViewModel.class);
        this.A0B = new 2YN(C351878Au.A00(requireActivity, userSession), requireActivity).A00(C3511387s.class);
        this.A0C = (LoadingSpinnerView) viewGroup.requireViewById(R.id.loading_track_spinner);
        this.A08 = (ViewGroup) viewGroup.requireViewById(R.id.loading_track_spinner_container);
        AnonymousClass861 r4 = this.A07;
        AnonymousClass2Fj r2 = r4.A0F;
        Fragment fragment2 = this.A05;
        r2.A06(fragment2, new C319096q2(new C354258Lg(this)));
        r4.A0B.A06(fragment2, new C319096q2(new C354268Lh(this)));
        r4.A09.A06(fragment2, new C319096q2(new C354278Li(this)));
        r4.A0A.A06(fragment2, new AnonymousClass8Lj(this));
        r4.A08.A06(fragment2, new C354288Lk(this));
        r4.A05.A06(fragment2, new C354298Ll(this));
        r4.A0G.A06(fragment2, new AnonymousClass8Lm(this));
        AnonymousClass2Fj r22 = r4.A0D;
        AnonymousClass8LU r1 = this.A06;
        r1.getClass();
        r22.A06(fragment2, new C354308Ln(r1));
        AnonymousClass72Y.A00(r4.A02).A06(fragment2, new C354318Lo(this));
        r4.A07.A06(fragment2, new C354328Lp(this));
        r4.A0H.A06(fragment2, new C354338Lq(this));
        r4.A0I.A06(fragment2, new C354348Lr(this));
    }

    private void A00() {
        if (!this.A04) {
            return;
        }
        if (!A02() || !this.A03) {
            this.A0C.setLoadingStatus(JY5.SUCCESS);
            this.A08.setVisibility(8);
            return;
        }
        this.A0C.setLoadingStatus(JY5.LOADING);
        this.A08.setVisibility(0);
        AnonymousClass861 r0 = this.A07;
        r0.A0A.A0B(AnonymousClass8YU.LOADING);
    }

    public static void A01(C354248Lf r5) {
        C378369Pn r1;
        int i;
        int i2;
        C378459Pw r0;
        if (r5.A03 && !r5.A02()) {
            AnonymousClass8LU r4 = r5.A06;
            C378369Pn r02 = r4.A0B;
            if (r02 != null) {
                int i3 = r02.A02;
                C378459Pw r03 = r02.A08;
                if (r03 != null) {
                    i = r03.A07();
                } else {
                    i = -1;
                }
                if (i3 != -1) {
                    C378369Pn r12 = r4.A0B;
                    if (i >= r12.A02) {
                        i2 = r12.A03;
                    }
                    if (!r4.A0B.CnC() && (r0 = r4.A0B.A08) != null) {
                        r0.A0D();
                    }
                } else {
                    if (i >= r4.A0E()) {
                        i2 = 0;
                    }
                    r0.A0D();
                }
                r4.A0K(i2);
                r0.A0D();
            }
        } else if (r5.A02() && (r1 = r5.A06.A0B) != null) {
            r1.A09(false);
        }
        r5.A00();
    }

    private boolean A02() {
        2Fk r1 = this.A0A.A0K.A06;
        if (r1.A02() == null || !((C361278fx) r1.A02()).A01()) {
            Object A022 = this.A07.A02.A02();
            A022.getClass();
            if (((C361278fx) A022).A01()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void DNP() {
        AnonymousClass861 r2 = this.A07;
        AnonymousClass8YU r1 = AnonymousClass8YU.PAUSED;
        if (r1 != r2.A0A.A02()) {
            11Z.A02(new C357688Zf(r1, r2));
        }
    }

    public final void Djd(int i) {
        this.A00 = i;
        this.A04 = true;
    }

    public final void Dy0() {
        this.A07.A0J.Epw(true);
    }

    public final void Dy2() {
        this.A07.A0J.Epw(false);
    }

    public final void DyQ() {
        AnonymousClass861 r2 = this.A07;
        AnonymousClass8YU r1 = AnonymousClass8YU.PLAYING;
        if (r1 != r2.A0A.A02()) {
            11Z.A02(new C357688Zf(r1, r2));
        }
        A00();
    }

    public final void DyY() {
        AnonymousClass861 r2 = this.A07;
        AnonymousClass8YU r1 = AnonymousClass8YU.PAUSED;
        if (r1 != r2.A0A.A02()) {
            11Z.A02(new C357688Zf(r1, r2));
        }
    }

    public final boolean AFv(AnonymousClass8LW r2) {
        return !A02();
    }
}
