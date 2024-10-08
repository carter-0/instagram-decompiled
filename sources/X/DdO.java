package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Set;

public class DdO implements G88 {
    public final FragmentActivity A00;
    public final Set A01 = AnonymousClass7TE.A1F();
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C230012om A04;

    public void D9T(AnonymousClass3UM r5, String str, int i) {
        0qQ.A0B(r5, 0);
        1ES.A03(F88.A01(this.A03, DbU.A0q(r5), r5.CDC(), r5.getAlgorithm()));
        if (str == null) {
            str = "fullscreen";
        }
        AnonymousClass6KM A0Y = DbZ.A0Y(r5, str, r5.getId(), this.A02.getModuleName(), i);
        DbW.A1M(r5, A0Y);
        DbY.A1Q(r5, A0Y);
        this.A04.A07(new AnonymousClass6KN(A0Y));
    }

    public void DGN(AnonymousClass3UM r4, String str, int i) {
        0qQ.A0B(r4, 0);
        if (str == null) {
            str = "fullscreen";
        }
        AnonymousClass6KM A0Y = DbZ.A0Y(r4, str, r4.getId(), this.A02.getModuleName(), i);
        DbW.A1M(r4, A0Y);
        DbY.A1Q(r4, A0Y);
        C230012om r1 = this.A04;
        A0Y.A0A = C230012om.A00(r4.CCd());
        r1.A08(new AnonymousClass6KN(A0Y));
    }

    public void DgN(AnonymousClass3UM r4, String str, int i) {
        0qQ.A0B(r4, 0);
        if (this.A01.add(DbU.A0q(r4))) {
            if (str == null) {
                str = "fullscreen";
            }
            AnonymousClass6KM r1 = new AnonymousClass6KM(str, r4.getId(), this.A02.getModuleName());
            r1.A00 = i;
            DbW.A1M(r4, r1);
            r1.A04 = r4.getAlgorithm();
            DbY.A1Q(r4, r1);
            DbV.A1T(r1, this.A04);
        }
    }

    public void Dw1(AnonymousClass3UM r5, String str, int i) {
        0qQ.A0B(r5, 0);
        A00(r5, str, i);
        UserSession userSession = this.A03;
        C46474Dfc.A03(DbU.A0Q(this.A00, userSession), userSession, C46447Df9.A02(), C46548Dgp.A01(userSession, DbU.A0q(r5), "recommended_user", this.A02.getModuleName()));
    }

    public final void A00(AnonymousClass3UM r4, String str, int i) {
        if (str == null) {
            str = "fullscreen";
        }
        AnonymousClass6KM A0Y = DbZ.A0Y(r4, str, r4.getId(), this.A02.getModuleName(), i);
        DbW.A1M(r4, A0Y);
        DbY.A1Q(r4, A0Y);
        this.A04.A0B(new AnonymousClass6KN(A0Y));
    }

    public final Integer Auv(String str) {
        E9K e9k;
        if (!(this instanceof EKK) || (e9k = (E9K) ((EKK) this).A00.getAdapter()) == null) {
            return null;
        }
        return (Integer) e9k.A0I.get(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = (X.ELQ) r13;
        r7 = r4.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DcJ(X.F1A r14, java.lang.String r15, int r16) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.ELQ
            if (r0 == 0) goto L_0x001f
            r4 = r13
            X.ELQ r4 = (X.ELQ) r4
            com.instagram.common.session.UserSession r7 = r4.A02
            com.instagram.model.reels.Reel r8 = X.Dba.A0L(r7, r15)
            if (r8 == 0) goto L_0x001f
            X.6VJ r1 = r4.A00
            if (r1 == 0) goto L_0x0025
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0020
            com.instagram.model.reels.Reel r0 = r1.A0D
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x0020
        L_0x001f:
            return
        L_0x0020:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r1.A05(r0)
        L_0x0025:
            X.2jx r5 = r4.A01
            android.content.Context r6 = r5.requireContext()
            X.3PP r10 = X.AnonymousClass3PO.A00(r7)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r3 = r14.A0F
            boolean r2 = r8.A1P
            r1 = 0
            X.FkL r0 = new X.FkL
            r0.<init>(r1, r4, r14, r8)
            X.6VH r9 = new X.6VH
            r9.<init>(r0, r3, r2)
            java.lang.String r11 = r5.getModuleName()
            r12 = -1
            X.6VJ r0 = X.1OP.A04(r6, r7, r8, r9, r10, r11, r12)
            r0.A04()
            r4.A00 = r0
            r14.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DdO.DcJ(X.F1A, java.lang.String, int):void");
    }

    public DdO(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession) {
        AnonymousClass7TG.A1Q(userSession, r3);
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A02 = r3;
        this.A04 = new C230012om(r3, userSession);
    }
}
