package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wes  reason: case insensitive filesystem */
public final class C19751Wes implements MT5 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ PromoteData A01;
    public final /* synthetic */ PromoteState A02;
    public final /* synthetic */ U5O A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;

    public C19751Wes(FragmentActivity fragmentActivity, PromoteData promoteData, PromoteState promoteState, U5O u5o, UserSession userSession, String str) {
        this.A01 = promoteData;
        this.A04 = userSession;
        this.A02 = promoteState;
        this.A00 = fragmentActivity;
        this.A03 = u5o;
        this.A05 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ae, code lost:
        if (r9.A07 == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0185, code lost:
        if (r6.A2h != false) goto L_0x0187;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D1Y(android.view.View r16, boolean r17) {
        /*
            r15 = this;
            com.instagram.business.promote.model.PromoteData r6 = r15.A01
            com.instagram.common.session.UserSession r4 = r15.A04
            X.W3T.A03(r6)
            com.instagram.business.promote.model.PromoteState r9 = r15.A02
            java.util.List r1 = r6.A1p
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            boolean r0 = r1.contains(r0)
            r14 = 0
            r2 = 1
            r7 = r17
            if (r0 == 0) goto L_0x0144
            boolean r0 = X.AnonymousClass9F0.A04(r6)
            if (r0 == 0) goto L_0x0144
            androidx.fragment.app.FragmentActivity r8 = r15.A00
            X.U5O r5 = r15.A03
            java.lang.String r11 = r15.A05
            com.instagram.api.schemas.XIGIGBoostDestination r0 = X.W3T.A00(r6)
            int r1 = r0.ordinal()
            r3 = 1
            r0 = 5
            if (r1 == r0) goto L_0x0130
            r0 = 12
            if (r1 == r0) goto L_0x00d9
            if (r1 != r2) goto L_0x007b
            com.instagram.api.schemas.XIGIGBoostCallToAction r2 = r6.A0e
            r0 = 2131970362(0x7f13493a, float:1.9577673E38)
            java.lang.String r0 = r8.getString(r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r0)
            java.lang.String r1 = "\n"
            r10.append(r1)
            r0 = 64
            java.lang.String r0 = X.002.A0D(r11, r0)
            r10.append(r0)
            if (r2 == 0) goto L_0x005c
            r10.append(r1)
            r0 = 2131970409(0x7f134969, float:1.9577768E38)
            X.C18677Vwa.A02(r8, r2, r10, r0)
        L_0x005c:
            boolean r0 = X.W3E.A03(r6)
            if (r0 == 0) goto L_0x0074
            r10.append(r1)
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r2 = r6.A0a
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r1 = com.instagram.api.schemas.XFBCTXWelcomeMessageStatus.DEFAULT_WELCOME_MESSAGE_OPTED_IN
            r0 = 2131970569(0x7f134a09, float:1.9578093E38)
            if (r2 != r1) goto L_0x0071
            r0 = 2131970568(0x7f134a08, float:1.957809E38)
        L_0x0071:
            X.C13988Tno.A0s(r8, r10, r0)
        L_0x0074:
            java.lang.String r0 = X.DbT.A10(r10)
        L_0x0078:
            r5.setSecondaryText((java.lang.String) r0)
        L_0x007b:
            if (r17 != 0) goto L_0x0086
            boolean r0 = r6.A2h
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = ""
            r5.setSecondaryText((java.lang.String) r0)
        L_0x0086:
            boolean r0 = r6.A2h
            if (r0 != 0) goto L_0x0090
            if (r17 == 0) goto L_0x00d7
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x00d7
        L_0x0090:
            r5.A04(r3)
            X.W3T.A02(r8, r6, r5, r4)
            r0 = 2131970468(0x7f1349a4, float:1.9577888E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r8, r0)
            com.instagram.common.session.UserSession r2 = r6.A0y
            r1 = 42
            X.WBH r0 = new X.WBH
            r0.<init>((androidx.fragment.app.FragmentActivity) r8, (com.instagram.business.promote.model.PromoteData) r6, (int) r1)
            r5.setActionLabel(r3, r2, r0)
            if (r17 == 0) goto L_0x00b0
            boolean r1 = r9.A07
            r0 = 1
            if (r1 != 0) goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            r5.A03(r0)
        L_0x00b4:
            if (r17 != 0) goto L_0x00ba
            boolean r0 = r6.A2h
            if (r0 == 0) goto L_0x00bb
        L_0x00ba:
            r14 = 1
        L_0x00bb:
            r0 = 2131439313(0x7f0b2ed1, float:1.8500578E38)
            android.widget.TextView r2 = X.DbW.A0B(r5, r0)
            java.lang.CharSequence r0 = r2.getText()
            r1 = 0
            if (r0 == 0) goto L_0x00d6
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00d6
            if (r14 != 0) goto L_0x00d3
            r1 = 8
        L_0x00d3:
            r2.setVisibility(r1)
        L_0x00d6:
            return
        L_0x00d7:
            r3 = 0
            goto L_0x0090
        L_0x00d9:
            com.instagram.common.session.UserSession r12 = r6.A0y
            X.0qQ.A06(r12)
            com.instagram.api.schemas.XIGIGBoostCallToAction r10 = r6.A0e
            r0 = 2131976852(0x7f136294, float:1.9590836E38)
            java.lang.String r0 = r8.getString(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r11 = "\n"
            r2.append(r11)
            java.lang.Class<X.WGS> r13 = X.WGS.class
            X.9JK r0 = X.AnonymousClass9F0.A00(r13)
            X.9Ge r0 = X.AnonymousClass9F0.A01(r0, r12)
            if (r0 == 0) goto L_0x012e
            X.9Gd r1 = r0.A00
            if (r1 == 0) goto L_0x012e
            X.9JK r0 = X.AnonymousClass9F0.A00(r13)
            java.lang.String r1 = r1.A00(r0, r12)
            if (r1 == 0) goto L_0x012e
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r0 = android.telephony.PhoneNumberUtils.formatNumber(r1, r0)
        L_0x0117:
            r2.append(r0)
            if (r10 == 0) goto L_0x0125
            r2.append(r11)
            r0 = 2131970409(0x7f134969, float:1.9577768E38)
            X.C18677Vwa.A02(r8, r10, r2, r0)
        L_0x0125:
            java.lang.String r0 = r2.toString()
            X.0qQ.A0A(r0)
            goto L_0x0078
        L_0x012e:
            r0 = 0
            goto L_0x0117
        L_0x0130:
            com.instagram.common.session.UserSession r2 = r6.A0y
            X.0qQ.A06(r2)
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r2)
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r6.A0e
            android.text.SpannableStringBuilder r0 = X.C18779W1e.A00(r8, r0, r2, r1)
            r5.setSecondaryText((java.lang.CharSequence) r0)
            goto L_0x007b
        L_0x0144:
            r1 = 64
            java.lang.String r0 = r15.A05
            java.lang.String r0 = X.002.A0D(r0, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            com.instagram.api.schemas.XIGIGBoostCallToAction r2 = r6.A0e
            if (r2 == 0) goto L_0x0162
            java.lang.String r0 = "\n"
            r3.append(r0)
            androidx.fragment.app.FragmentActivity r1 = r15.A00
            r0 = 2131970409(0x7f134969, float:1.9577768E38)
            X.C18677Vwa.A02(r1, r2, r3, r0)
        L_0x0162:
            X.U5O r5 = r15.A03
            java.lang.String r0 = X.DbT.A10(r3)
            r5.setSecondaryText((java.lang.String) r0)
            boolean r0 = r6.A2h
            if (r0 == 0) goto L_0x0180
            if (r17 == 0) goto L_0x01ab
            java.lang.String r0 = r3.toString()
        L_0x0175:
            X.0qQ.A0A(r0)
            r5.setSecondaryText((java.lang.String) r0)
            androidx.fragment.app.FragmentActivity r0 = r15.A00
            X.W3T.A02(r0, r6, r5, r4)
        L_0x0180:
            if (r17 != 0) goto L_0x0187
            boolean r1 = r6.A2h
            r0 = 0
            if (r1 == 0) goto L_0x0188
        L_0x0187:
            r0 = 1
        L_0x0188:
            r5.A04(r0)
            boolean r0 = X.AnonymousClass9F0.A04(r6)
            if (r0 != 0) goto L_0x00b4
            androidx.fragment.app.FragmentActivity r4 = r15.A00
            r0 = 2131970468(0x7f1349a4, float:1.9577888E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r4, r0)
            com.instagram.common.session.UserSession r2 = r6.A0y
            r1 = 42
            X.WBH r0 = new X.WBH
            r0.<init>((androidx.fragment.app.FragmentActivity) r4, (com.instagram.business.promote.model.PromoteData) r6, (int) r1)
            r5.setActionLabel(r3, r2, r0)
            r5.A03(r7)
            goto L_0x00b4
        L_0x01ab:
            java.lang.String r0 = ""
            goto L_0x0175
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19751Wes.D1Y(android.view.View, boolean):void");
    }
}
