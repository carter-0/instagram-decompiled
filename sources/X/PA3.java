package X;

import android.app.Activity;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.HashMap;
import java.util.List;

public final class PA3 implements AnonymousClass7X2 {
    public final Activity A00;
    public final UserSession A01;
    public final OJa A02;
    public final OT9 A03;
    public final AnonymousClass7XB A04;
    public final C72194OyE A05;
    public final AnonymousClass0eK A06;
    public final AnonymousClass0eK A07;
    public final AnonymousClass0iw A08;
    public final AnonymousClass0eK A09;

    public PA3(Activity activity, AnonymousClass0iw r4, UserSession userSession, OJa oJa, OT9 ot9, AnonymousClass7XB r8, AnonymousClass0eK r9, AnonymousClass0eK r10, AnonymousClass0eK r11) {
        C51974G9v.A0d(3, r9, r10, r4, oJa);
        AnonymousClass7TF.A1G(ot9, 8, r8);
        this.A01 = userSession;
        this.A00 = activity;
        this.A06 = r9;
        this.A07 = r10;
        this.A08 = r4;
        this.A02 = oJa;
        this.A09 = r11;
        this.A03 = ot9;
        this.A04 = r8;
        this.A05 = (C72194OyE) userSession.A01(C72194OyE.class, new C73660PhZ(userSession, 20));
    }

    public static final void A00(View view, AnonymousClass7FU r10, PA3 pa3, C69668Npq npq, C254743sy r13, C62320sa r14, 0sP r15, 0sL r16, 0sJ r17, boolean z) {
        1Xj r0;
        List Br5;
        PA3 pa32 = pa3;
        C333547Zj BsD = C66580MXl.A0V(pa3.A06).BsD();
        C69668Npq npq2 = npq;
        boolean z2 = npq instanceof C68964Nbr;
        C254743sy r8 = r13;
        if (!z2) {
            C254703su r2 = ((C68965Nbs) npq2).A00;
            Integer num = r2.A1F;
            if (AnonymousClass48R.A01(num) || num == AnonymousClass05K.A0Y) {
                if (npq instanceof C68965Nbs) {
                    BsD.AGJ(pa3.A08, r2, C66647MaG.A03(r13));
                    return;
                }
                throw AnonymousClass7TE.A1K();
            }
        }
        if ((z2 || (r0 = ((C68965Nbs) npq2).A00.A0s) == null || (Br5 = r0.A0C.Br5()) == null || !AnonymousClass7TE.A1b(Br5) || z) && !AnonymousClass7TE.A1a(r17.invoke(r13, npq, view, r10))) {
            C71810OrC.A00(BsD.FJE(npq, r13, (String) null), new C58799Ixk(11, npq2, pa32, r14, r8, r16, r15), 1Lf.A01, 1);
        }
    }

    public final void AAr(MessageIdentifier messageIdentifier, long j) {
        C254703su A002;
        if (182.A06(0Tu.A05, this.A01, 36315881222966926L)) {
            C72194OyE oyE = this.A05;
            String str = messageIdentifier.A01;
            C72194OyE.A00(oyE, "remove_message_initiation", "tap", "message_options_dialog", str, AnonymousClass7TF.A0w("message_id", str));
            C254743sy r6 = (C254743sy) this.A07.get();
            if ((r6 instanceof DirectThreadKey) && (A002 = OT9.A00(this.A03, str, (String) null, true)) != null) {
                0qQ.A0A(r6);
                C68965Nbs nbs = new C68965Nbs(A002, r6);
                nbs.A00 = ((AnonymousClass7L5) this.A09.get()).A00();
                C73576PgA pgA = new C73576PgA(this, 0);
                A00((View) null, (AnonymousClass7FU) null, this, nbs, r6, (C62320sa) null, C66580MXl.A14(this, 25), new C73607Pgi(this, 3), pgA, false);
            }
        }
    }

    public final void FJD(View view, AnonymousClass7FU r20, MessageIdentifier messageIdentifier, C62320sa r22, long j) {
        C254743sy r12;
        MessageIdentifier messageIdentifier2 = messageIdentifier;
        0qQ.A0B(messageIdentifier2, 0);
        String str = messageIdentifier2.A01;
        AnonymousClass0eK r9 = this.A06;
        AnonymousClass7S7 A0d = C66582MXn.A0d(r9);
        if (C66580MXl.A05(A0d) == 29) {
            C313756gx A002 = C313746gw.A00(this.A01);
            int AdN = A0d.AdN();
            String C6C = A0d.C6C();
            String C6k = A0d.C6k();
            1Ln A0J = DbT.A0J(A002);
            if (DbT.A1Y(A0J)) {
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("mid", str);
                DbW.A17(A0J, A002);
                DbV.A1M(A0J, "unsend_message_attempt");
                A0J.A0p("message_options_dialog");
                JTQ.A1C(A0J, DbZ.A0b(A0J, "thread_view", C6C, C6k, AdN), A1E);
            }
        }
        C69668Npq E4G = C66580MXl.A0V(r9).E4G(str);
        if (E4G != null) {
            E4G.A00 = ((AnonymousClass7L5) this.A09.get()).A00();
            if (E4G instanceof C68964Nbr) {
                r12 = ((C68964Nbr) E4G).A01;
            } else {
                r12 = ((C68965Nbs) E4G).A01;
            }
            C73576PgA pgA = new C73576PgA(this, 3);
            View view2 = view;
            AnonymousClass7FU r92 = r20;
            C62320sa r13 = r22;
            A00(view2, r92, this, E4G, r12, r13, C74061PoQ.A00, new C73607Pgi(this, 6), pgA, false);
        }
    }

    public final void FJF(MessageIdentifier messageIdentifier) {
        int i;
        int i2;
        C254873tC r3 = null;
        C254703su A002 = OT9.A00(this.A03, messageIdentifier.A01, (String) null, true);
        if (A002 != null) {
            ImmutableList A0H = A002.A0H();
            if (A0H != null) {
                r3 = (C254873tC) 00k.A0I(A0H);
            }
            if (r3 != null) {
                String str = r3.A0u;
                if (str != null) {
                    String queryParameter = 0cp.A03(str).getQueryParameter("collection_type");
                    if (queryParameter != null) {
                        Long l = r3.A0m;
                        if (queryParameter.equals("challenges")) {
                            i = 2131954954;
                            i2 = 2131954953;
                        } else if (queryParameter.equals("daily_prompt")) {
                            i = 2131958887;
                            i2 = 2131958886;
                        } else {
                            return;
                        }
                        C358248ab A0X = DbS.A0X(this.A00);
                        A0X.A09(i);
                        A0X.A08(i2);
                        A0X.A0K(new C71186Of4(l, this, queryParameter, 3), 2131960643);
                        A0X.A0C(C71235Og0.A00);
                        AnonymousClass7TH.A0a(A0X, true);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
