package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.UeP  reason: case insensitive filesystem */
public final class C15536UeP extends C231632rz {
    public final Context A00;
    public final XC2 A01;
    public final XAH A02;
    public final boolean A03;

    public C15536UeP(Context context, XC2 xc2, XAH xah, boolean z) {
        0qQ.A0B(xah, 3);
        this.A00 = context;
        this.A01 = xc2;
        this.A02 = xah;
        this.A03 = z;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0087, code lost:
        if (r10 != null) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r16, android.view.View r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r15 = this;
            r11 = r18
            r12 = r19
            r0 = 1351507963(0x508e5ffb, float:1.91092388E10)
            int r7 = X.AnonymousClass0fD.A03(r0)
            r10 = 1
            r1 = r17
            X.0qQ.A0B(r1, r10)
            r0 = 17
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r12, r0)
            X.Mg0 r12 = (X.C66967Mg0) r12
            android.content.Context r9 = r15.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.model.KeywordSearchEntry"
            X.0qQ.A0C(r11, r0)
            X.Mn4 r11 = (X.C67387Mn4) r11
            X.XC2 r13 = r15.A01
            X.XAH r2 = r15.A02
            java.lang.Object r8 = r1.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.ui.KeywordRowViewBinder.Holder"
            X.0qQ.A0C(r8, r0)
            X.TxK r8 = (X.C14498TxK) r8
            boolean r6 = r12.A0F
            boolean r14 = X.AnonymousClass7TF.A1P(r6)
            boolean r1 = r15.A03
            boolean r5 = X.DbW.A1S(r10, r9, r11)
            r0 = 3
            X.C51973G9u.A0r(r0, r13, r2, r8)
            com.instagram.model.keyword.Keyword r4 = r11.A01
            android.view.View r3 = r8.A02
            r2.ECK(r3, r11, r12)
            com.instagram.common.ui.base.IgTextView r2 = r8.A06
            java.lang.String r0 = r4.A04
            r2.setText(r0)
            X.C13988Tno.A16(r2, r10)
            java.lang.String r0 = r4.A04
            r2.setText(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r8.A07
            if (r1 == 0) goto L_0x00c5
            if (r6 == 0) goto L_0x00c5
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x0062:
            X.C14497TxJ.A00(r9, r2, r0)
            boolean r0 = r12.A0J
            if (r0 == 0) goto L_0x00c2
            java.lang.String r1 = r12.A09
        L_0x006b:
            if (r1 == 0) goto L_0x00ba
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00ba
            com.instagram.common.ui.base.IgTextView r0 = r8.A05
            r0.setVisibility(r5)
            r0.setText(r1)
        L_0x007b:
            com.instagram.common.ui.base.IgSimpleImageView r10 = r8.A00
            if (r10 != 0) goto L_0x0089
            android.view.ViewStub r0 = r8.A03
            com.instagram.common.ui.base.IgSimpleImageView r10 = X.C13989Tnp.A0U(r0)
            r8.A00 = r10
            if (r10 == 0) goto L_0x008d
        L_0x0089:
            r9 = 0
            X.C67429Mnk.A00(r9, r10, r11, r12, r13, r14)
        L_0x008d:
            java.lang.String r2 = "null_state_popular"
            if (r6 != 0) goto L_0x00ae
            java.lang.String r1 = r12.A09
            java.lang.String r0 = "null_state_recent"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "meta_ai_recent"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00ae
            boolean r0 = X.0qQ.A0K(r1, r2)
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "null_state_suggestions"
            X.0qQ.A0K(r1, r0)
        L_0x00ae:
            r0 = 50
            X.WB4.A00(r3, r13, r11, r12, r0)
            r0 = -1962385644(0xffffffff8b085f14, float:-2.6264176E-32)
            X.AnonymousClass0fD.A0A(r0, r7)
            return
        L_0x00ba:
            r1 = 8
            com.instagram.common.ui.base.IgTextView r0 = r8.A05
            r0.setVisibility(r1)
            goto L_0x007b
        L_0x00c2:
            java.lang.String r1 = r4.A06
            goto L_0x006b
        L_0x00c5:
            com.instagram.model.keyword.Keyword r0 = r11.A01
            java.lang.String r1 = r0.A07
            java.lang.String r0 = "meta_ai_suggestion"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00d4
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0062
        L_0x00d4:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15536UeP.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1553318709);
        Context context = this.A00;
        View A0A = DbU.A0A(DbT.A0B(context), viewGroup, R.layout.row_search_keyword_icons, false);
        C14498TxK txK = new C14498TxK(A0A);
        C14497TxJ.A00(context, txK.A07, AnonymousClass05K.A00);
        A0A.setTag(txK);
        AnonymousClass0fD.A0A(-517470689, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
