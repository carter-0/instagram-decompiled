package X;

import android.animation.Animator;
import android.os.VibrationEffect;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.I7e  reason: case insensitive filesystem */
public final class C56675I7e implements Animator.AnimatorListener {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ AnonymousClass4DU A01;
    public final /* synthetic */ C317026mb A02;
    public final /* synthetic */ boolean A03;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public C56675I7e(1Xj r1, AnonymousClass4DU r2, C317026mb r3, boolean z) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = z;
    }

    public final void onAnimationStart(Animator animator) {
        String str;
        C317026mb r3 = this.A02;
        1Xj r7 = this.A00;
        AnonymousClass4DU r5 = this.A01;
        boolean z = this.A03;
        AnonymousClass2S0.A01.A07(VibrationEffect.createOneShot(150, 30));
        if (r7 != null) {
            UserSession userSession = r3.A02;
            if (z) {
                1Ln A0I = 1Ln.A0I(AnonymousClass0kN.A01(r5, userSession));
                User A2A = r7.A2A(userSession);
                long j = 0;
                if (A2A != null) {
                    j = C51967G9n.A08(C51972G9s.A0h(A2A), 0);
                }
                A0I.A0Q("a_pk", Long.valueOf(j));
                User A2A2 = r7.A2A(userSession);
                if (A2A2 == null || (str = A2A2.B6o().name()) == null) {
                    str = "";
                }
                A0I.A0R("follow_status", str);
                A0I.A0R("is_coming_from", "");
                A0I.A0O(C273654mx.A00(315), AnonymousClass7TE.A0u());
                String id = r7.getId();
                if (id != null) {
                    A0I.A0m(id);
                    A0I.A0Q("m_t", C51972G9s.A0g(r7));
                    A0I.A0R(AnonymousClass000.A00(53), "");
                    C51976G9y.A0Z(A0I, r5, 0L);
                    A0I.A0R("sticker_id", C273654mx.A00(3131));
                    C51976G9y.A0b(A0I, userSession, 0L, C273654mx.A00(3130));
                    A0I.A0R("viewer_session_id", "");
                    A0I.Cgf();
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            C254523sc A0c = C51967G9n.A0c(userSession, r7, r5, AnonymousClass000.A00(662));
            A0c.A7M = "shake_to_reveal";
            XXC.A00(AnonymousClass0kN.A02(userSession), A0c, r5);
        }
    }
}
