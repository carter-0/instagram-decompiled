package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;

public final class A90 {
    public C39781A9a A00;
    public final ViewStub A01;
    public final AnonymousClass7SZ A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, new C73914Plp(this, 9));

    public A90(ViewStub viewStub, AnonymousClass7SZ r5) {
        0qQ.A0B(viewStub, 2);
        this.A02 = r5;
        this.A01 = viewStub;
    }

    public final void A00(A84 a84) {
        View.OnClickListener onClickListener;
        C391549tG r12;
        A84 a842 = a84;
        0qQ.A0B(a842, 0);
        AnonymousClass0eM r4 = this.A03;
        if (!r4.CVQ()) {
            AnonymousClass7SZ r0 = this.A02;
            C391629tO r11 = a842.A03;
            boolean z = a842.A09;
            AnonymousClass9H7 r1 = r0.A00;
            UserSession userSession = r1.A10;
            String A002 = AnonymousClass7SZ.A00(r0);
            String A07 = AnonymousClass9H7.A07(r1);
            boolean z2 = r1.A0b instanceof MsysThreadId;
            AnonymousClass4DU r13 = r1.A1Q;
            if (z) {
                r12 = null;
            } else {
                AnonymousClass3U9 A05 = AnonymousClass9H7.A05(r1);
                if (A05 != null) {
                    User BZK = A05.BZK();
                    C254703su BLG = A05.BLG();
                    if (BZK != null && BZK.A2A()) {
                        r12 = C391549tG.FOLLOWED_BY_RECIPIENT;
                    } else if (!A05.BBQ()) {
                        r12 = C391549tG.EMPTY_THREAD;
                    } else if (!(BLG == null || BZK == null || !0qQ.A0K(BLG.A1u, BZK.getId()))) {
                        r12 = C391549tG.HAS_MESSAGES_FROM_RECIPIENT;
                    }
                }
                r12 = C391549tG.A05;
            }
            0qQ.A0B(r13, 6);
            C3265677h.A05(r11, r12, r13, userSession, A002, A07, 1, z2, z);
        }
        AnonymousClass7TE.A0c(r4).setVisibility(0);
        View A0c = AnonymousClass7TE.A0c(r4);
        View.OnClickListener onClickListener2 = a842.A00;
        AnonymousClass0fU.A00(onClickListener2, A0c);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass7TF.A0F(AnonymousClass7TE.A0c(r4), R.id.top_container);
        viewGroup.removeAllViews();
        C39781A9a A003 = A02.A00(AnonymousClass7TE.A0c(r4).getContext());
        ViewGroup viewGroup2 = A003.A00;
        0qQ.A07(viewGroup2.requireViewById(R.id.icon));
        A003.A02(a842.A05);
        A003.A00(onClickListener2, a842.A08, (Integer) null, a842.A01);
        A003.A01(a842.A04);
        viewGroup.addView(viewGroup2);
        this.A00 = A003;
        ViewGroup viewGroup3 = (ViewGroup) AnonymousClass7TF.A0F(AnonymousClass7TE.A0c(r4), R.id.bottom_container);
        if (viewGroup3.getChildCount() == 0) {
            String str = a842.A07;
            if (str.length() > 0 && (onClickListener = a842.A02) != null) {
                OZD A004 = O0R.A00(AnonymousClass7TE.A0c(r4).getContext());
                Integer num = a842.A06;
                if (num != null) {
                    OZD.A00(onClickListener, A004, str, R.id.permissions_choice_button_right, num.intValue());
                } else {
                    A004.A02(str, onClickListener);
                }
                viewGroup3.addView(A004.A00);
            }
        }
    }
}
