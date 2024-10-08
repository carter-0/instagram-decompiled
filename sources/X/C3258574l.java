package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.74l  reason: invalid class name and case insensitive filesystem */
public final class C3258574l implements C332907Wx {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final Capabilities A03;
    public final Integer A04;
    public final C62320sa A05;
    public final AnonymousClass54L A06;

    public C3258574l(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, Capabilities capabilities, AnonymousClass54L r6, Integer num, C62320sa r8) {
        0qQ.A0B(r3, 3);
        0qQ.A0B(r6, 6);
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = capabilities;
        this.A04 = num;
        this.A06 = r6;
        this.A05 = r8;
    }

    public final void Cpm(C254793t3 r10, int i, boolean z) {
        C254793t3 r5 = r10;
        if (r10 != null) {
            UserSession userSession = this.A02;
            NKQ A002 = C69941Nuh.A00(userSession, this.A03, r5, i, true, false);
            C309516Yo r1 = new C309516Yo(this.A00, userSession);
            r1.A0D(A002);
            r1.A0A = "IgDirectCanUpdateNullStateShortcuts";
            r1.A0F = true;
            r1.A04();
        }
    }

    public final void Cqg(C254793t3 r14, int i, boolean z) {
        C331157Pu r2;
        C254793t3 r3 = r14;
        if (r14 != null) {
            UserSession userSession = this.A02;
            AnonymousClass7S7 r22 = (AnonymousClass7S7) this.A05.invoke();
            0qQ.A0B(r22, 1);
            C254783t2 C6c = r22.C6c();
            0qQ.A07(C6c);
            boolean z2 = C6c instanceof C254773t1;
            AnonymousClass7SD C6Q = r22.C6Q();
            0qQ.A07(C6Q);
            boolean A0C = C308556Us.A0C(userSession, C6Q, z2);
            Bundle A022 = 1as.A04.A01.A02(this.A03, r3, this.A04, i, z, true, A0C);
            AnonymousClass37E r0 = AnonymousClass37D.A00;
            FragmentActivity fragmentActivity = this.A00;
            AnonymousClass37D A012 = r0.A01(fragmentActivity);
            if (A012 != null) {
                r2 = C48943Emh.A00(A012);
            } else {
                r2 = null;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null && valueOf.intValue() == 1014) {
                AnonymousClass7TN A002 = AnonymousClass7TM.A00(userSession);
                AnonymousClass7TN.A00(A002, new MMK(A002, 1));
            }
            if (182.A06(0Tu.A05, userSession, 36314910560619399L)) {
                AnonymousClass6W8 r7 = new AnonymousClass6W8(fragmentActivity, A022, userSession, ModalActivity.class, "direct_thread_detail");
                r7.A08();
                r7.A0C(fragmentActivity);
                return;
            }
            if (r2 != null && r2.A0S()) {
                BottomSheetFragment bottomSheetFragment = r2.A03;
                if (bottomSheetFragment.getActivity() != null && (bottomSheetFragment.A0M() instanceof C273484me)) {
                    NJY njy = new NJY();
                    njy.setArguments(A022);
                    C331127Pr A003 = C69861NtP.A00(userSession);
                    A003.A0u = true;
                    r2.A0F(njy, A003);
                    return;
                }
            }
            NIE nie = this.A06.A00.A0L;
            if (nie != null) {
                nie.A07();
            }
            if (A012 != null) {
                A012.A0B();
            }
            C309516Yo r1 = new C309516Yo(fragmentActivity, userSession);
            r1.A0B(A022, new NJY());
            r1.A0F = true;
            r1.A04();
        }
    }

    public final void CpN(C254793t3 r5, String str, int i) {
        if (r5 != null) {
            UserSession userSession = this.A02;
            C68473NJl A002 = C69939Nuf.A00(userSession, r5, "translation_nux");
            C309516Yo r1 = new C309516Yo(this.A00, userSession);
            r1.A0D(A002);
            r1.A0F = true;
            r1.A04();
        }
    }

    public final void Cqf(AnonymousClass2Ep r10, boolean z) {
        User user;
        if (r10 == null) {
            throw new IllegalStateException("ExtendedDirectThread is null");
        } else if (r10.C6C() == null) {
            List BRZ = r10.BRZ();
            if (!r10.CUG() && !r10.COb()) {
                if (BRZ.isEmpty()) {
                    user = AnonymousClass0t1.A01.A01(this.A02);
                } else {
                    user = (User) BRZ.get(0);
                }
                C48838El0.A00(this.A00, this.A01, this.A02, MessagingUser.A00(user), "direct_thread_user_row", (String) null, false, false);
            }
        } else {
            String C6C = r10.C6C();
            if (C6C != null) {
                Cqg(new C254763t0(C6C), r10.C6a(), z);
            }
        }
    }
}
