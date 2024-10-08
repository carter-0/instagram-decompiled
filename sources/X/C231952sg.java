package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2sg  reason: invalid class name and case insensitive filesystem */
public final class C231952sg implements C231932se {
    public final UserSession A00;

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c0, code lost:
        if (r11 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0064  */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ADo(X.2bv r13, X.AnonymousClass4UC r14, X.C254113rx r15) {
        /*
            r12 = this;
            r4 = 0
            X.0qQ.A0B(r15, r4)
            r0 = 2
            X.0qQ.A0B(r14, r0)
            X.4V7 r3 = r14.A08
            android.widget.TextView r2 = r15.A00
            android.view.ViewStub r1 = r15.A02
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x01be
            r0 = 2131625296(0x7f0e0550, float:1.8877796E38)
            r1.setLayoutResource(r0)
            r1.inflate()
            android.view.View r1 = r15.itemView
            r0 = 2131437635(0x7f0b2843, float:1.8497174E38)
            android.view.View r11 = r1.requireViewById(r0)
            X.0qQ.A07(r11)
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r11 = (com.instagram.ui.widget.editphonenumber.EditPhoneNumberView) r11
            r15.A01 = r11
            com.instagram.common.session.UserSession r7 = r12.A00
            android.view.View r0 = r15.itemView
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            X.0qQ.A0C(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.0hq r6 = r1.getSupportFragmentManager()
            X.Fmi r10 = new X.Fmi
            r10.<init>(r2, r15, r12)
            r5 = 0
            X.Fg5 r9 = new X.Fg5
            r9.<init>(r15)
            r8 = r5
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView.A01(r5, r6, r7, r8, r9, r10, r11)
        L_0x004f:
            com.instagram.common.session.UserSession r7 = r12.A00
            X.Ewo r0 = X.Ep8.A00(r7, r11)
            r10 = 1
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r0.A00
            if (r0 != r10) goto L_0x00ce
        L_0x005c:
            android.widget.TextView r1 = r15.A05
            X.4V8 r0 = r3.A09
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = ""
        L_0x0066:
            r1.setText(r0)
            r1.setVisibility(r4)
            X.5Jo r0 = r3.A03
            r5 = 8
            android.widget.TextView r1 = r15.A04
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = ""
        L_0x007a:
            r1.setText(r0)
            r1.setVisibility(r4)
        L_0x0080:
            android.view.View r0 = r15.itemView
            r0.setVisibility(r4)
            X.4VG r0 = r3.A00
            android.widget.ImageView r1 = r15.A03
            if (r0 == 0) goto L_0x00c6
            r1.setVisibility(r4)
            X.FNS r0 = new X.FNS
            r0.<init>(r13, r14, r15)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x0096:
            X.4VG r3 = r3.A01
            if (r3 == 0) goto L_0x00c4
            java.lang.Integer r1 = r3.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x00c4
            X.4V8 r0 = r3.A00
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = ""
        L_0x00a8:
            if (r2 == 0) goto L_0x00ba
            if (r0 == 0) goto L_0x00c0
            r2.setVisibility(r4)
            r2.setText(r0)
            X.FNT r0 = new X.FNT
            r0.<init>(r13, r14, r15)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x00ba:
            if (r13 == 0) goto L_0x00bf
            r13.DbK(r14)
        L_0x00bf:
            return
        L_0x00c0:
            r2.setVisibility(r5)
            goto L_0x00ba
        L_0x00c4:
            r0 = 0
            goto L_0x00a8
        L_0x00c6:
            r1.setVisibility(r5)
            goto L_0x0096
        L_0x00ca:
            r1.setVisibility(r5)
            goto L_0x0080
        L_0x00ce:
            X.4VA r1 = r14.A09
            java.lang.String r0 = "inline_prefill_text_from_django"
            X.4VP r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x00ea
            java.lang.String r9 = r0.A03
        L_0x00da:
            android.view.View r0 = r15.itemView
            android.content.Context r0 = r0.getContext()
            com.facebook.phonenumbers.PhoneNumberUtil r0 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r0)
            java.lang.String r5 = "Invalid phone number prefill"
            r6 = 0
            if (r9 == 0) goto L_0x00f1
            goto L_0x00ec
        L_0x00ea:
            r9 = 0
            goto L_0x00da
        L_0x00ec:
            X.74u r6 = r0.A0F(r9, r6)     // Catch:{ 2sh -> 0x0122, NumberFormatException -> 0x0124 }
            goto L_0x012a
        L_0x00f1:
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r15.A01     // Catch:{ 2sh -> 0x0122, NumberFormatException -> 0x0124 }
            if (r0 == 0) goto L_0x011a
            android.content.Context r8 = r0.getContext()     // Catch:{ 2sh -> 0x0122, NumberFormatException -> 0x0124 }
            X.0qQ.A0A(r8)     // Catch:{ 2sh -> 0x0122, NumberFormatException -> 0x0124 }
            X.EW4 r1 = X.EW4.PHONE_NUMBER_SOURCE_SIM     // Catch:{ 2sh -> 0x0122, NumberFormatException -> 0x0124 }
            X.DiE r0 = X.C46634DiE.A0z     // Catch:{ 2sh -> 0x0122, NumberFormatException -> 0x0124 }
            X.EUZ r0 = X.FH2.A00(r8, r7, r1, r0)     // Catch:{ 2sh -> 0x0122, NumberFormatException -> 0x0124 }
            if (r0 == 0) goto L_0x012a
            X.74u r8 = new X.74u     // Catch:{ 2sh -> 0x0122, NumberFormatException -> 0x0124 }
            r8.<init>()     // Catch:{ 2sh -> 0x0122, NumberFormatException -> 0x0124 }
            java.lang.String r0 = r0.A02     // Catch:{ 2sh | NumberFormatException -> 0x0117 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ 2sh | NumberFormatException -> 0x0117 }
            r8.A0B = r10     // Catch:{ 2sh | NumberFormatException -> 0x0117 }
            r8.A02 = r0     // Catch:{ 2sh | NumberFormatException -> 0x0117 }
            r6 = r8
            goto L_0x012a
        L_0x0117:
            r1 = move-exception
            r6 = r8
            goto L_0x0125
        L_0x011a:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ 2sh -> 0x0122, NumberFormatException -> 0x0124 }
            r0.<init>(r1)     // Catch:{ 2sh -> 0x0122, NumberFormatException -> 0x0124 }
            throw r0     // Catch:{ 2sh -> 0x0122, NumberFormatException -> 0x0124 }
        L_0x0122:
            r1 = move-exception
            goto L_0x0125
        L_0x0124:
            r1 = move-exception
        L_0x0125:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.C46436Dey.A00(r7, r0, r5, r1)
        L_0x012a:
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r5 = r15.A01
            if (r5 == 0) goto L_0x005c
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r5.A05
            r0.A03()
            if (r6 == 0) goto L_0x01a3
            android.content.Context r0 = r5.getContext()
            X.0qQ.A07(r0)
            int r8 = r6.A00
            if (r8 == 0) goto L_0x016c
            com.facebook.phonenumbers.PhoneNumberUtil r0 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r0)
            X.79y r0 = r0.A00
            java.lang.String r1 = r0.A01(r8)
            if (r1 == 0) goto L_0x016c
            java.lang.String r0 = "ZZ"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x016c
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x016c
            com.instagram.phonenumber.model.CountryCodeData r9 = new com.instagram.phonenumber.model.CountryCodeData
            r9.<init>(r8, r1)
            long r0 = r6.A02
        L_0x0163:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x0167:
            r5.setupEditPhoneNumberView((com.instagram.phonenumber.model.CountryCodeData) r9, (java.lang.String) r0)
            goto L_0x005c
        L_0x016c:
            int r0 = r6.A00
            if (r0 == 0) goto L_0x017f
            java.lang.String r7 = java.lang.String.valueOf(r0)
            long r0 = r6.A02
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.setupEditPhoneNumberView((java.lang.String) r7, (java.lang.String) r0)
            goto L_0x005c
        L_0x017f:
            java.lang.Integer r8 = X.AnonymousClass05K.A0j
            java.lang.String r0 = "Invalid phone number prefill "
            java.lang.String r1 = X.002.A0R(r0, r9)
            r0 = 0
            X.C46436Dey.A00(r7, r8, r1, r0)
            android.view.View r0 = r15.itemView
            android.content.Context r0 = r0.getContext()
            X.0qQ.A07(r0)
            com.instagram.phonenumber.model.CountryCodeData r9 = X.C3270479e.A00(r0)
            long r0 = r6.A02
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0163
            java.lang.String r0 = ""
            goto L_0x0167
        L_0x01a3:
            android.widget.EditText r0 = r5.A01
            android.text.Editable r0 = r0.getText()
            r0.clear()
            android.view.View r0 = r15.itemView
            android.content.Context r0 = r0.getContext()
            X.0qQ.A07(r0)
            com.instagram.phonenumber.model.CountryCodeData r0 = X.C3270479e.A00(r0)
            r5.setCountryCodeWithCountryPrefix(r0)
            goto L_0x005c
        L_0x01be:
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r11 = r15.A01
            if (r11 == 0) goto L_0x005c
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231952sg.ADo(X.2bv, X.4UC, X.3rx):void");
    }

    public final View CrT(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.inline_editing_megaphone, viewGroup, false);
        0qQ.A07(inflate);
        return inflate;
    }

    public final /* bridge */ /* synthetic */ void ADr(C249703kE r2, 2bv r3, AnonymousClass4UC r4, Map map) {
        C254113rx r22 = (C254113rx) r2;
        0qQ.A0B(r22, 0);
        ADo(r3, r4, r22);
    }

    public C231952sg(UserSession userSession) {
        this.A00 = userSession;
    }
}
