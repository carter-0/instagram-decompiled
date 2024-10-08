package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;

public final class NOT extends C232222tE {
    public final Fragment A00;
    public final C74380Ptv A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public NOT(Fragment fragment, C74380Ptv ptv, AnonymousClass0iw r4, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = fragment;
        this.A01 = ptv;
        this.A02 = r4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: X.Oje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: X.Ojz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.Ojz} */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r27, X.C249703kE r28) {
        /*
            r26 = this;
            r11 = r28
            r1 = r27
            X.N5z r1 = (X.C68210N5z) r1
            X.MzI r11 = (X.C68051MzI) r11
            r12 = 0
            boolean r10 = X.AnonymousClass7TF.A1U(r12, r1, r11)
            com.instagram.user.model.User r9 = r1.A06
            java.lang.Integer r8 = r1.A07
            boolean r13 = r1.A00
            boolean r7 = r1.A09
            X.4Yx r6 = r1.A02
            X.4lo r5 = r1.A04
            java.lang.Integer r0 = r1.A08
            r25 = r0
            X.4lo r0 = r1.A05
            r24 = r0
            X.4Yx r0 = r1.A03
            r23 = r0
            X.4Yx r4 = r1.A01
            r0 = r26
            com.instagram.common.session.UserSession r3 = r0.A03
            androidx.fragment.app.Fragment r2 = r0.A00
            X.0iw r0 = r0.A02
            r22 = r0
            X.0qQ.A0B(r9, r12)
            r0 = r25
            X.C51974G9v.A0d(r10, r8, r6, r5, r0)
            r1 = r24
            r0 = r23
            X.C51974G9v.A1Q(r1, r0, r4, r3)
            r1 = 11
            r0 = r22
            X.DbW.A1P(r2, r1, r0)
            android.content.Context r14 = r2.requireContext()
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r1 = r11.A01
            r1.A01()
            java.lang.String r0 = r9.getUsername()
            r1.A08(r0, r12)
            java.lang.String r0 = r9.getFullName()
            if (r13 == 0) goto L_0x0076
            if (r0 == 0) goto L_0x00da
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00da
            java.lang.String r15 = r9.getFullName()
            java.lang.String r13 = " • "
            r0 = 2131969279(0x7f1344ff, float:1.9575476E38)
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r0 = X.002.A0g(r15, r13, r0)
        L_0x0076:
            r1.A07(r0)
            java.lang.CharSequence r4 = X.C66909Mes.A00(r14, r4)
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0086
            r1.A06(r4)
        L_0x0086:
            java.lang.Integer r21 = X.AnonymousClass05K.A00
            r17 = r3
            r18 = r5
            r19 = r9
            r20 = r8
            r13 = r2
            r14 = r11
            r15 = r22
            r16 = r6
            X.3Z5 r5 = X.C68051MzI.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.Exl r4 = new X.Exl
            r4.<init>(r2, r9)
            if (r7 == 0) goto L_0x00d7
            X.Ojz r0 = new X.Ojz
            r13 = r12
            r14 = r9
            r15 = r11
            r16 = r3
            r17 = r2
            r12 = r0
            r12.<init>((int) r13, (java.lang.Object) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17)
            X.AnonymousClass0fU.A00(r0, r1)
            X.Ojz r0 = new X.Ojz
            r13 = r10
            r12 = r0
            r12.<init>((int) r13, (java.lang.Object) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17)
        L_0x00b8:
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r4.A00 = r0
            r1.A03(r3, r4, r9)
            if (r5 == 0) goto L_0x00d6
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            r10 = r2
            r12 = r22
            r13 = r23
            r14 = r3
            r15 = r24
            r16 = r9
            r17 = r25
            X.3Z5 r0 = X.C68051MzI.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.A05(r5, r0)
        L_0x00d6:
            return
        L_0x00d7:
            X.Oje r0 = X.C71380Oje.A00
            goto L_0x00b8
        L_0x00da:
            r0 = 2131969279(0x7f1344ff, float:1.9575476E38)
            java.lang.String r0 = r14.getString(r0)
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NOT.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C68210N5z.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C68051MzI(this.A01, new IgdsPeopleCell(AnonymousClass7TE.A0S(viewGroup), C66580MXl.A1Y(viewGroup)));
    }
}
