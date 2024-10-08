package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.P8n  reason: case insensitive filesystem */
public final class C72504P8n implements C332947Xb {
    public final UserSession A00;
    public final C332837Wo A01;
    public final AnonymousClass0eM A02;
    public final Context A03;
    public final C332887Wv A04;
    public final AnonymousClass7XL A05;

    public final void Etu(2FW r21, MessageIdentifier messageIdentifier, String str, long j, boolean z) {
        int i;
        List list;
        C74317Pst pst;
        if (this.A05.CnR() && z) {
            Context context = this.A03;
            if (context instanceof Activity) {
                i = ((int) (((float) C66581MXm.A0A((Activity) context).getHeight()) * 0.65f)) - AnonymousClass2uJ.A00;
            } else {
                i = -2;
            }
            UserSession userSession = this.A00;
            AnonymousClass0eM r1 = this.A02;
            int i2 = C66581MXm.A0Z((C333517Zg) r1.getValue()).A08;
            String A09 = C66647MaG.A09(((C333517Zg) r1.getValue()).C6l().B8S());
            String C6k = ((C333517Zg) r1.getValue()).C6l().C6k();
            int AdN = ((C333517Zg) r1.getValue()).C6l().AdN();
            C242243Te BiC = ((C333517Zg) r1.getValue()).C6l().BiC();
            if (BiC == null || (list = BiC.A09) == null) {
                list = AnonymousClass7TE.A1C();
            }
            NKM A002 = C70139Nxt.A00(userSession, A09, C6k, list, i, 0, i2, AdN, true, false);
            C331127Pr A0W = DbS.A0W(userSession);
            A0W.A0T = new C72944PQc(A002, 2);
            C331157Pu A003 = A0W.A00();
            A002.A01 = new C72631PDk(this, A003, r21, messageIdentifier, str, j);
            AnonymousClass37D r12 = null;
            if ((context instanceof C74317Pst) && (pst = (C74317Pst) context) != null) {
                r12 = pst.AhO();
            }
            C331157Pu.A00(context, context, A002, A003, r12);
        }
    }

    public final void FHP(MessageIdentifier messageIdentifier, boolean z) {
        if (this.A05.CnR() && z) {
            ((C333517Zg) this.A02.getValue()).BSN().Drx(messageIdentifier);
            if (182.A06(0Tu.A05, this.A00, 36320266384646282L)) {
                this.A04.EKd(messageIdentifier.A01);
            }
        }
    }

    public C72504P8n(Context context, UserSession userSession, C332837Wo r4, C332887Wv r5, AnonymousClass7XL r6, AnonymousClass0eK r7) {
        C51972G9s.A1D(r7, r4);
        DbW.A1O(r5, 5, r6);
        this.A03 = context;
        this.A00 = userSession;
        this.A01 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = C73920Pm0.A00(r7, 5);
    }
}
