package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.H7j  reason: case insensitive filesystem */
public final class C54314H7j extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C54314H7j(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
    }

    public final boolean Dqe(View view) {
        UserSession userSession;
        0Tu r2;
        long j;
        switch (this.A00) {
            case 0:
                0qQ.A0B(view, 0);
                C49890FBq fBq = (C49890FBq) this.A02;
                C47034DpQ dpQ = (C47034DpQ) this.A01;
                int absoluteAdapterPosition = dpQ.getAbsoluteAdapterPosition();
                Integer valueOf = Integer.valueOf(absoluteAdapterPosition);
                boolean z = false;
                if (absoluteAdapterPosition >= 0) {
                    z = true;
                }
                Long l = null;
                if (z && valueOf != null) {
                    l = DbS.A0j(absoluteAdapterPosition);
                }
                fBq.A02 = l;
                if (fBq instanceof EK5) {
                    ((C46831Dm7) this.A03).A03.A05 = new C49472EwD(view, (EK5) fBq);
                }
                fBq.A06(dpQ.A00);
                C46831Dm7 dm7 = (C46831Dm7) this.A03;
                String A012 = C49890FBq.A01(fBq.A05, fBq.A06);
                if (fBq instanceof C47849EJv) {
                    userSession = dm7.A02;
                    r2 = 0Tu.A05;
                    j = 36327554944154110L;
                } else if (!(fBq instanceof EK0)) {
                    return true;
                } else {
                    userSession = dm7.A02;
                    r2 = 0Tu.A05;
                    j = 36327554944219647L;
                }
                if (!182.A06(r2, userSession, j) || A012 == null) {
                    return true;
                }
                AnonymousClass4DU r5 = dm7.A04;
                String A04 = fBq.A04();
                String str = fBq.A08;
                0qQ.A07(str);
                C22031Xty.A0J(r5, userSession, A012, A04, str, "");
                return true;
            case 1:
                C69480NmO nmO = C69480NmO.REGULAR;
                int bindingAdapterPosition = ((C249703kE) this.A03).getBindingAdapterPosition();
                C61064Jw2 jw2 = (C61064Jw2) this.A02;
                String A002 = C69844Nt8.A00((Integer) jw2.A01);
                boolean z2 = jw2.A03;
                String str2 = jw2.A02;
                N34 n34 = new N34(nmO, AnonymousClass7TE.A0u(), (Boolean) jw2.A00, (String) null, str2, A002, bindingAdapterPosition, z2);
                C70983OUx oUx = ((C70427O6e) this.A01).A00.A03.A0J.A00.A00;
                if (oUx == null) {
                    return true;
                }
                NJq nJq = oUx.A00;
                IgdsInlineSearchBox igdsInlineSearchBox = nJq.A0A;
                igdsInlineSearchBox.getClass();
                igdsInlineSearchBox.A03();
                O6V o6v = nJq.A07;
                o6v.getClass();
                C68464NJc nJc = o6v.A00;
                C74511Pw6 pw6 = nJc.A02;
                if (pw6 == null) {
                    return true;
                }
                String str3 = nJc.A05;
                if (str3 == null) {
                    0qQ.A0F("bottomSheetSessionId");
                    throw AnonymousClass00P.createAndThrow();
                }
                pw6.DNZ(n34, str3);
                return true;
            case 2:
                0qQ.A0B(view, 0);
                if (!AnonymousClass3ZC.A07(((C52150GGs) this.A03).A00, (C267324bN) this.A01)) {
                    return false;
                }
                C51965G9l.A1W(this.A02, view);
                return true;
            case 3:
                AnonymousClass37E r1 = AnonymousClass37D.A00;
                C52033GCf gCf = (C52033GCf) this.A03;
                AnonymousClass37D A013 = r1.A01(gCf.A06);
                if (A013 == null) {
                    return true;
                }
                HNR hnr = (HNR) this.A02;
                1Xj r22 = (1Xj) this.A01;
                ((AnonymousClass37F) A013).A0H = new C65751Lz5(7, r22, hnr, gCf);
                if (!I5Y.A01(r22, hnr)) {
                    return true;
                }
                A013.A0B();
                return true;
            default:
                return super.Dqe(view);
        }
    }
}
