package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ia6  reason: case insensitive filesystem */
public final class C57400Ia6 implements C262944Gp {
    public String A00 = "partial_sheet";
    public boolean A01;
    public final FragmentActivity A02;
    public final View A03;
    public final UserSession A04;
    public final 1Xj A05;
    public final AnonymousClass4DU A06;
    public final AnonymousClass3W1 A07;
    public final C52016GBn A08;
    public final GDT A09;
    public final GDU A0A;
    public final boolean A0B;

    public final /* synthetic */ void Cv7(Integer num, float f) {
    }

    public final /* synthetic */ void D4N() {
    }

    public final void D4O(Integer num) {
        String str;
        View findViewById;
        0qQ.A0B(num, 0);
        if (this.A0B && (findViewById = this.A02.findViewById(R.id.action_bar_right_side_buttons_wrapper)) != null) {
            findViewById.setVisibility(0);
        }
        this.A07.A0N(GJF.COLLAPSED);
        this.A00 = "collapse";
        int intValue = num.intValue();
        if (intValue == 0) {
            str = "browser_left_icon_tap";
        } else if (intValue == 11) {
            str = "back_press";
        } else if (intValue == 2 || intValue == 3) {
            str = "drag";
        } else if (intValue != 9) {
            str = "unknown";
        } else {
            str = "on_entry";
        }
        if (!str.equals("on_entry")) {
            GDT.A00(this.A04, this.A05, this.A06, str, "collapse");
        }
    }

    public final void Dx6(C61065Jw3 jw3) {
        String str;
        String str2;
        0qQ.A0B(jw3, 0);
        1Xj r4 = this.A05;
        int i = jw3.A00;
        if (i == 1) {
            str = "swipe_up";
        } else if (i != 2) {
            str = "swipe_vertical";
        } else {
            str = "swipe_down";
        }
        int i2 = jw3.A01;
        if (i2 == 1) {
            str2 = "dismiss";
        } else if (i2 == 2) {
            str2 = "fullscreen";
        } else if (i2 != 4) {
            str2 = "partial_sheet";
        } else {
            str2 = "collapse";
        }
        if (str2.equals(this.A00)) {
            str2 = "no_change";
        }
        GDT.A00(this.A04, r4, this.A06, str, str2);
    }

    public final void Cv6(float f) {
        AnonymousClass7TH.A0R(this.A02.findViewById(R.id.action_bar_right_side_buttons_wrapper));
        this.A07.A0N(GJF.ANCHORED);
        this.A00 = "partial_sheet";
    }

    public final void D9d() {
        ViewGroup viewGroup;
        AnonymousClass7TF.A16(this.A02.findViewById(R.id.action_bar_right_side_buttons_wrapper));
        this.A07.A0N(GJF.CLOSED);
        GDU gdu = this.A0A;
        View view = gdu.A03;
        0nA.A0V(view, gdu.A02);
        View findViewById = view.getRootView().findViewById(R.id.clips_video_container);
        if ((findViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) findViewById) != null) {
            0nA.A10(viewGroup)[0].setY(0.0f);
        }
        this.A00 = "dismiss";
        if (this.A01) {
            this.A08.A0R("resume", false);
            this.A01 = false;
        }
        this.A03.setVisibility(8);
    }

    public final void DHB(Integer num) {
        JRN A022;
        C52016GBn gBn = this.A08;
        C52078GDy A023 = C52019GBq.A02(gBn);
        if (!(A023 == null || (A022 = C52016GBn.A02(gBn, A023)) == null || !A022.CeZ())) {
            gBn.A0N((C267324bN) null, "bottom_sheet", true, false);
            this.A01 = true;
        }
        this.A00 = "fullscreen";
        this.A07.A0N(GJF.EXPANDED);
    }

    public final void DYG(int i, int i2) {
        View view = this.A03;
        if (view == null || view.getVisibility() != 8) {
            view.setVisibility(8);
        }
        GDU gdu = this.A0A;
        Integer num = gdu.A04.A0f;
        if (num != null) {
            int intValue = num.intValue();
            int i3 = gdu.A00;
            if (i3 == -1) {
                gdu.A00 = i;
                i3 = i;
            }
            int i4 = gdu.A02;
            int i5 = gdu.A01;
            if (i <= i4 - i5 && i >= Math.min(i3, intValue - i5)) {
                0nA.A0V(gdu.A03, i + i5);
            }
        }
        if (this.A01) {
            this.A08.A0R("resume", false);
            this.A01 = false;
        }
        AnonymousClass3W1 r2 = this.A07;
        GJF gjf = r2.A0n;
        GJF gjf2 = GJF.IN_TRANSITION;
        if (gjf != gjf2) {
            r2.A0N(gjf2);
        }
    }

    public C57400Ia6(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r4, AnonymousClass4DU r5, AnonymousClass3W1 r6, C52016GBn gBn, GDU gdu, boolean z) {
        this.A05 = r4;
        this.A07 = r6;
        this.A04 = userSession;
        this.A06 = r5;
        this.A02 = fragmentActivity;
        this.A0A = gdu;
        this.A08 = gBn;
        this.A0B = z;
        this.A09 = new GDT(userSession);
        this.A03 = fragmentActivity.findViewById(R.id.action_bar_title);
    }
}
