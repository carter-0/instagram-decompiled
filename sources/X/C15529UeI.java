package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.UeI  reason: case insensitive filesystem */
public final class C15529UeI extends C231632rz {
    public final AnonymousClass0iw A00;
    public final C19376WWr A01;
    public final C19376WWr A02;

    public final int getViewTypeCount() {
        return 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005e, code lost:
        r9 = r5.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r17, android.view.View r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r16 = this;
            r3 = r19
            r0 = 1740745851(0x67c1ac7b, float:1.8291969E24)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r8 = 1
            r6 = r18
            int r1 = X.DbW.A02(r8, r6, r3)
            X.VcT r3 = (X.C17698VcT) r3
            r0 = r17
            r9 = r16
            if (r17 == 0) goto L_0x01fc
            if (r0 == r8) goto L_0x0168
            if (r0 != r1) goto L_0x0161
            java.lang.Object r2 = r6.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.pbiaproxyprofile.adapter.PBIAProxyProfileBioRowViewBinder.Holder"
            X.0qQ.A0C(r2, r0)
            X.Vbp r2 = (X.C17659Vbp) r2
            X.WWr r5 = r9.A01
            android.content.Context r6 = X.AnonymousClass7TE.A0S(r6)
            boolean r15 = X.DbW.A1S(r8, r2, r3)
            X.0qQ.A0B(r5, r1)
            android.widget.TextView r1 = r2.A01
            java.lang.String r0 = r3.A05
            if (r0 == 0) goto L_0x0223
            r1.setText(r0)
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x008c
            X.0eM r7 = r2.A06
            X.DbW.A1R(r7, r15)
            java.lang.Object r1 = r7.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r3.A07
            r1.setText(r0)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r7)
            r0 = 54
            X.WBA.A00(r1, r0, r5)
            X.1Xj r0 = r5.A01
            if (r0 == 0) goto L_0x008c
            com.instagram.common.session.UserSession r9 = r5.A08
            com.instagram.user.model.User r8 = r0.A2A(r9)
            if (r8 == 0) goto L_0x008c
            X.4Cl r0 = r8.A03
            java.lang.String r7 = r0.C9f()
            if (r7 == 0) goto L_0x008c
            android.content.Context r1 = r5.A05
            java.lang.String r0 = r8.getId()
            X.RIv r11 = X.C8956RIv.PBIA_PROXY_PROFILE
            X.AnonymousClass3ZQ.A02(r1, r11, r9, r0, r7)
            X.70U r10 = new X.70U
            r10.<init>(r9)
            java.lang.String r12 = r8.getId()
            X.4Cl r0 = r8.A03
            java.lang.String r13 = r0.C9f()
            r14 = 0
            r10.A00(r11, r12, r13, r14, r15)
        L_0x008c:
            java.util.List r0 = r3.A09
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ac
            X.0eM r0 = r2.A04
            X.DbW.A1R(r0, r15)
            java.lang.Object r7 = r0.getValue()
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.util.List r1 = r3.A09
            java.lang.String r0 = " · "
            java.lang.String r0 = X.0mp.A05(r0, r1)
            r7.setText(r0)
        L_0x00ac:
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x00c6
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00c6
            X.0eM r0 = r2.A02
            X.DbW.A1R(r0, r15)
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r3.A03
            r1.setText(r0)
        L_0x00c6:
            java.lang.String r0 = r3.A06
            if (r0 == 0) goto L_0x00e0
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00e0
            X.0eM r0 = r2.A05
            X.DbW.A1R(r0, r15)
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r3.A06
            r1.setText(r0)
        L_0x00e0:
            java.lang.String r9 = r3.A08
            if (r9 == 0) goto L_0x012d
            int r0 = r9.length()
            if (r0 == 0) goto L_0x012d
            boolean r0 = android.webkit.URLUtil.isValidUrl(r9)
            if (r0 == 0) goto L_0x012d
            X.0eM r8 = r2.A07
            X.DbW.A1R(r8, r15)
            java.lang.Object r1 = r8.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r3.A08
            r1.setText(r0)
            android.view.View r7 = X.AnonymousClass7TE.A0c(r8)
            r1 = 17
            X.FOr r0 = new X.FOr
            r0.<init>((java.lang.String) r9, (java.lang.Object) r5, (int) r1)
            X.AnonymousClass0fU.A00(r0, r7)
            android.view.View r9 = X.AnonymousClass7TE.A0c(r8)
            X.0qQ.A0B(r9, r15)
            com.instagram.common.session.UserSession r8 = r5.A08
            X.0Tu r7 = X.0Tu.A05
            r0 = 36321954306860906(0x810aa00002276a, double:3.03348838820489E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x012d
            X.1Xj r1 = r5.A01
            if (r1 == 0) goto L_0x012d
            X.4DU r0 = r5.A0A
            X.C267154b3.A01(r9, r8, r1, r0, r15)
        L_0x012d:
            X.VW7 r8 = r3.A01
            if (r8 == 0) goto L_0x0161
            java.lang.String r0 = r8.A00
            if (r0 == 0) goto L_0x0161
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0161
            X.0eM r7 = r2.A03
            X.DbW.A1R(r7, r15)
            java.lang.Object r3 = r7.getValue()
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r2 = r8.A01
            java.lang.String r1 = r8.A02
            java.lang.String r0 = r8.A00
            java.lang.String r0 = X.AnonymousClass703.A05(r6, r2, r1, r0)
            r3.setText(r0)
            android.view.View r2 = X.AnonymousClass7TE.A0c(r7)
            r1 = 17
            X.FPG r0 = new X.FPG
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r8)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x0161:
            r0 = 366384640(0x15d69600, float:8.667057E-26)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0168:
            java.lang.Object r5 = r6.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.pbiaproxyprofile.adapter.PBIAProxyProfileHeaderRowViewBinder.Holder"
            X.0qQ.A0C(r5, r0)
            X.VZe r5 = (X.C17525VZe) r5
            android.content.Context r7 = X.AnonymousClass7TE.A0S(r6)
            X.0iw r2 = r9.A00
            r6 = 0
            X.0qQ.A0B(r5, r6)
            X.AnonymousClass7TF.A1C(r3, r8, r2)
            com.instagram.common.typedurl.ImageUrl r1 = r3.A00
            if (r1 == 0) goto L_0x01f3
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A03
            r0.setUrl(r1, r2)
        L_0x0189:
            java.lang.String r1 = r3.A05
            if (r1 == 0) goto L_0x0223
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0198
            android.widget.TextView r0 = r5.A02
            r0.setText(r1)
        L_0x0198:
            java.util.List r0 = r3.A09
            if (r0 == 0) goto L_0x01b8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01b8
            X.0eM r0 = r5.A04
            X.DbW.A1R(r0, r6)
            java.lang.Object r2 = r0.getValue()
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.util.List r1 = r3.A09
            java.lang.String r0 = " · "
            java.lang.String r0 = X.0mp.A05(r0, r1)
            r2.setText(r0)
        L_0x01b8:
            java.lang.Integer r8 = r3.A02
            java.lang.String r1 = r3.A04
            if (r1 == 0) goto L_0x0226
            if (r8 == 0) goto L_0x01df
            android.widget.TextView r5 = r5.A01
            android.content.res.Resources r3 = r7.getResources()
            r2 = 2131969270(0x7f1344f6, float:1.9575458E38)
            android.content.res.Resources r1 = X.AnonymousClass7TF.A0A(r7)
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r0 = X.C253673rC.A04(r1, r8, r0, r6, r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
        L_0x01d7:
            java.lang.String r0 = r3.getString(r2, r0)
            r5.setText(r0)
            goto L_0x0161
        L_0x01df:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0161
            android.widget.TextView r5 = r5.A01
            android.content.res.Resources r3 = r7.getResources()
            r2 = 2131969270(0x7f1344f6, float:1.9575458E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            goto L_0x01d7
        L_0x01f3:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A03
            r0 = 2131239607(0x7f0822b7, float:1.8095526E38)
            X.DbU.A13(r7, r1, r0)
            goto L_0x0189
        L_0x01fc:
            java.lang.Object r2 = r6.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.pbiaproxyprofile.adapter.PBIAProxyProfileInfoRowViewBinder.Holder"
            X.0qQ.A0C(r2, r0)
            X.VOZ r2 = (X.VOZ) r2
            X.WWr r1 = r9.A02
            X.Dba.A0j(r8, r2, r1)
            android.widget.TextView r3 = r2.A00
            r0 = 55
            X.WBA.A00(r3, r0, r1)
            android.content.Context r2 = r3.getContext()
            r1 = 2131954409(0x7f130ae9, float:1.9545316E38)
            java.lang.CharSequence r0 = r3.getText()
            X.C13989Tnp.A0z(r2, r3, r0, r1)
            goto L_0x0161
        L_0x0223:
            java.lang.String r0 = "pageName"
            goto L_0x0228
        L_0x0226:
            java.lang.String r0 = "pageFanCount"
        L_0x0228:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15529UeI.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public C15529UeI(AnonymousClass0iw r1, C19376WWr wWr, C19376WWr wWr2) {
        this.A00 = r1;
        this.A02 = wWr;
        this.A01 = wWr2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        DbW.A1I(r2);
        r2.A7U(1);
        r2.A7U(2);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A0A;
        Object voz;
        int A03 = AnonymousClass0fD.A03(-645935482);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.pbia_proxy_profile_info_row, false);
            voz = new VOZ(A0A);
        } else if (i == 1) {
            A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.pbia_proxy_profile_image_scoreboard, false);
            voz = new C17525VZe(A0A);
        } else if (i == 2) {
            A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.pbia_proxy_profile_bio, false);
            voz = new C17659Vbp(A0A);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Unsupported view type");
            AnonymousClass0fD.A0A(-1245499894, A03);
            throw illegalStateException;
        }
        A0A.setTag(voz);
        AnonymousClass0fD.A0A(1361893742, A03);
        return A0A;
    }
}
