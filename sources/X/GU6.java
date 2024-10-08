package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class GU6 implements C46210DQn {
    public final 1Ng A00;
    public final Fragment A01;
    public final UserSession A02;
    public final AnonymousClass32X A03;
    public final AnonymousClass32e A04;

    public GU6(Fragment fragment, 1Ng r3, UserSession userSession, AnonymousClass32X r5, AnonymousClass32e r6) {
        C51973G9u.A0r(3, r3, r6, r5);
        this.A02 = userSession;
        this.A01 = fragment;
        this.A00 = r3;
        this.A04 = r6;
        this.A03 = r5;
    }

    public final void Da0(C254073rt r11, 1Xj r12, AnonymousClass3W1 r13) {
        String str;
        AnonymousClass5HT BYk = r12.A0C.BYk();
        if (BYk != null) {
            AnonymousClass32e.A00(this.A04, r12, AnonymousClass000.A00(2788));
            int ordinal = BYk.AtT().ordinal();
            if (ordinal == 2) {
                C70861OOs.A00(this.A01, this.A02, r12, new C45999DId(this, 0));
                C57076INq.A00(this.A00, true);
            } else if (ordinal == 1) {
                OZW ozw = OZW.A00;
                AnonymousClass0iw r3 = this.A01;
                FragmentActivity requireActivity = r3.requireActivity();
                UserSession userSession = this.A02;
                AnonymousClass0iw r32 = r3;
                String str2 = userSession.A06;
                User A2A = r12.A2A(userSession);
                if (A2A != null) {
                    str = A2A.getId();
                } else {
                    str = "";
                }
                ozw.A01(requireActivity, r32, userSession, C66579MXk.A00(276), str2, str, (String) null, "book_now_cta_media_post");
            } else if (ordinal == 3) {
                C70861OOs.A01(this.A01, r12);
            }
        }
    }

    public final void Da1(View view, 1Xj r7) {
        AnonymousClass32X r4 = this.A03;
        2el r3 = r4.A00;
        C2354830a A002 = AnonymousClass30Y.A00(r7, 0, 002.A0R("media_cta_component_", r7.getId()));
        A002.A00(r4.A01);
        C51967G9n.A0z(view, A002, r3);
    }
}
