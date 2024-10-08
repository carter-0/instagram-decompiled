package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Loj  reason: case insensitive filesystem */
public final class C65180Loj implements MVS {
    public KHP A00;
    public final UserSession A01;
    public final KO9 A02;
    public final AnonymousClass80P A03 = AnonymousClass80P.ADD_MESSAGE_BUTTON;
    public final AnonymousClass4DH A04;
    public final LMT A05;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        UserSession userSession = this.A01;
        AnonymousClass4DH r1 = this.A04;
        KHP khp = new KHP(r1, userSession, C62439Kfp.A04, LLF.A00(1iA.A0a.A00), r1.getModuleName());
        JTS.A0x(khp);
        this.A00 = khp;
        return khp;
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A03;
    }

    public final void CsQ() {
        KHP khp = this.A00;
        if (khp != null) {
            khp.A02();
            LMT lmt = this.A05;
            KHP khp2 = this.A00;
            if (khp2 != null) {
                UserSession userSession = lmt.A01;
                if (!lmt.A00) {
                    1Av A002 = 1Au.A00(userSession);
                    0s0 r0 = A002.A7X;
                    AnonymousClass0YZ[] r3 = 1Av.A8a;
                    if (!AnonymousClass7TG.A1a(A002, r0, r3, 408)) {
                        lmt.A00 = true;
                        1Av A003 = 1Au.A00(userSession);
                        AnonymousClass7TF.A1J(A003, A003.A7X, r3, 408, true);
                        LMT.A00(khp2, lmt, (C234222xL) null, C226262fy.ABOVE_ANCHOR, AnonymousClass7TF.A0d(khp2.getResources(), 2131952312));
                    }
                }
                AnonymousClass4DH r02 = this.A04;
                07U r32 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = r02.getViewLifecycleOwner();
                AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r32, this, (AnonymousClass4D7) null, 13), AnonymousClass07a.A00(viewLifecycleOwner));
                return;
            }
        }
        0qQ.A0F("addMessageRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public C65180Loj(AnonymousClass4DH r2, UserSession userSession, LMT lmt, KO9 ko9) {
        C51974G9v.A1P(r2, userSession, ko9, lmt);
        this.A04 = r2;
        this.A01 = userSession;
        this.A02 = ko9;
        this.A05 = lmt;
    }
}
