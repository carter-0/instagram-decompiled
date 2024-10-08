package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import java.util.List;

/* renamed from: X.PBz  reason: case insensitive filesystem */
public final class C72594PBz implements C74334PtA {
    public final AnonymousClass9HO A00;

    public final /* bridge */ /* synthetic */ AnonymousClass7FW ALM(Context context, C74541Pwa pwa, UserSession userSession, AnonymousClass7FE r34, AnonymousClass9HC r35, AnonymousClass7L2 r36, MessagingUser messagingUser, C74552Pwl pwl, MsysThreadSubtype msysThreadSubtype, String str, List list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        boolean A1U = AnonymousClass7TF.A1U(0, context2, userSession2);
        AnonymousClass9HC r13 = r35;
        MessagingUser messagingUser2 = messagingUser;
        C74552Pwl pwl2 = pwl;
        C51974G9v.A1M(r13, messagingUser2, pwl2);
        AnonymousClass7L2 r2 = r36;
        C51972G9s.A1E(r34, r2);
        0qQ.A0B(msysThreadSubtype, 12);
        int i2 = i;
        boolean A02 = C74552Pwl.A02(messagingUser2, pwl2, i2);
        C329987Kz A04 = AnonymousClass7FB.A04(r2, A02);
        String C4n = pwl2.C4n(i2);
        if (C4n == null) {
            0wb.A03("LinkMessageContentViewModelInstructionGenerator", "No text found for link message");
            C4n = "No Text found for link message";
        }
        C74541Pwa pwa2 = pwa;
        if (pwa != null) {
            C4n = pwa2.ANc(C4n);
        }
        List A07 = C253053q8.A07(C4n);
        Context context3 = context2;
        CharSequence A002 = C3270279b.A00(context3, AnonymousClass5FV.None, userSession2, this.A00, A04, new AnonymousClass5H7(478, C3270279b.A03(A07, C4n), (List) null, A07), C4n, A1U, false);
        C68858NZq nZq = new C68858NZq(AnonymousClass7FB.A04(r2, A02).A04, (int) 0nA.A04(context2, 10));
        if (A002 == null) {
            A002 = "";
        }
        String valueOf = String.valueOf(pwl2.BsH(i2));
        C74541Pwa pwa3 = pwa2;
        AnonymousClass9HC r22 = r13;
        AnonymousClass7L2 r23 = r2;
        MessagingUser messagingUser3 = messagingUser2;
        C74552Pwl pwl3 = pwl2;
        AnonymousClass7FE A003 = C70101NxH.A00(pwa3, r22, r23, messagingUser3, pwl3, Boolean.valueOf(C71057Oaa.A00(pwa2, pwl2, i2)), Boolean.valueOf(C71057Oaa.A01(pwa2, pwl2, i2)), AnonymousClass0eN.A01(C73792Pjr.A00), i2);
        boolean z5 = A1U;
        boolean z6 = A1U;
        int i3 = i2;
        return new NYI(C71136Ode.A01(context2, r13, messagingUser2, pwl2, 2FW.A17, new C73668Phh(userSession2, r13, pwl2), i3, false, A1U, z5, z6, false, z, z2, A1U), A003, nZq, A002, valueOf);
    }

    public C72594PBz(AnonymousClass9HO r1) {
        this.A00 = r1;
    }
}
