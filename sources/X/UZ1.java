package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashSet;

public final class UZ1 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FundraiserDonationBottomsheetFragment";
    public Context A00;
    public View A01;
    public ScrollView A02;
    public TextView A03;
    public UserSession A04;
    public C263134Hw A05;
    public X4V A06;
    public C16506Uw2 A07;
    public C18742VzN A08;
    public User A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G = false;
    public C39771A8l A0H;

    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z = true;
        if (i == 1 && intent != null && i2 == -1) {
            if (AnonymousClass000.A00(2194).equals(intent.getStringExtra(AnonymousClass000.A00(428)))) {
                C39771A8l a8l = this.A0H;
                String str = this.A0E;
                str.getClass();
                0xa r7 = a8l.A00.A01;
                String A002 = AnonymousClass000.A00(3767);
                HashSet hashSet = new HashSet(r7.C1t(A002));
                StringBuilder A0n = AnonymousClass7TF.A0n(str);
                A0n.append(':');
                A0n.append(System.currentTimeMillis());
                DbU.A1X(A0n, hashSet);
                0xY AR4 = r7.AR4();
                AR4.ED3(A002);
                AR4.apply();
                0xY AR42 = r7.AR4();
                AR42.E5h(A002, hashSet);
                AR42.apply();
            } else {
                z = false;
            }
            X4V x4v = this.A06;
            if (x4v != null) {
                x4v.D1d(z, intent.getBooleanExtra(AnonymousClass000.A00(2317), false));
            }
        }
    }

    public final String getModuleName() {
        if (C16506Uw2.LIVE.equals(this.A07)) {
            return "live_fundraiser_consumption_sheet_fragment";
        }
        return "reel_fundraiser_sticker_consumption_sheet_fragment";
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x049c, code lost:
        if (r3.Akv().booleanValue() == false) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0466, code lost:
        if (r12 == null) goto L_0x0468;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x063e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x048d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r0 = r18
            r2 = r19
            r1 = r20
            super.onViewCreated(r2, r1)
            r0.A01 = r2
            android.content.Context r1 = r2.getContext()
            r0.A00 = r1
            r1 = 2131433287(0x7f0b1747, float:1.8488355E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            r0.A02 = r1
            com.instagram.common.session.UserSession r1 = X.DbX.A0U(r0)
            r0.A04 = r1
            X.A8l r1 = X.C39575A0r.A00(r1)
            r0.A0H = r1
            android.os.Bundle r5 = r0.requireArguments()
            r1 = 2403(0x963, float:3.367E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            java.io.Serializable r1 = r5.getSerializable(r1)
            r1.getClass()
            X.Uw2 r1 = (X.C16506Uw2) r1
            r0.A07 = r1
            int r2 = r1.ordinal()
            r1 = 1
            java.lang.String r4 = "FundraiserDonationBottomsheetFragment"
            if (r2 == r1) goto L_0x0410
            r1 = 0
            java.lang.String r6 = "Could not parse json FundraiserStickerModel for the fundraiser consumption sheet."
            if (r2 == r1) goto L_0x03d0
            r1 = 2
            if (r2 == r1) goto L_0x03b8
            r1 = 3
            if (r2 == r1) goto L_0x0385
            java.lang.String r1 = "Fragment launched with invalid entrypoint - json model cannot be parsed"
            X.0wb.A03(r4, r1)
        L_0x0056:
            com.instagram.user.model.User r1 = r0.A09
            if (r1 == 0) goto L_0x0638
            X.Uw2 r1 = r0.A07
            int r1 = r1.ordinal()
            r2 = 0
            android.view.View r3 = r0.A01
            if (r1 == r2) goto L_0x01af
            r1 = 2131433281(0x7f0b1741, float:1.8488343E38)
            android.view.View r4 = X.DbY.A0F(r3, r1)
            r1 = 2131433279(0x7f0b173f, float:1.848834E38)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = X.DbT.A0b(r4, r1)
            com.instagram.user.model.User r1 = r0.A09
            r1.getClass()
            X.DbU.A1S(r0, r3, r1)
            r1 = 2131433280(0x7f0b1740, float:1.8488341E38)
            android.widget.TextView r5 = X.DbU.A0G(r4, r1)
            com.instagram.user.model.User r1 = r0.A09
            java.lang.String r1 = r1.B8Q()
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r1)
            com.instagram.user.model.User r1 = r0.A09
            boolean r1 = r1.isVerified()
            if (r1 == 0) goto L_0x009b
            android.content.Context r3 = r0.A00
            r1 = 1
            X.C244273av.A08(r3, r4, r1)
        L_0x009b:
            r5.setText(r4)
        L_0x009e:
            android.view.View r3 = r0.A01
            r1 = 2131433289(0x7f0b1749, float:1.848836E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r3, r1)
            r0.A03 = r1
            r1.getClass()
            X.2eS.A01(r1)
            X.4Hw r1 = r0.A05
            if (r1 == 0) goto L_0x0614
            android.widget.ScrollView r4 = r0.A02
            r4.getClass()
            X.4Hw r3 = r0.A05
            boolean r1 = r0.A0G
            X.VzN r7 = new X.VzN
            r7.<init>(r4, r3, r0, r1)
            r0.A08 = r7
            android.view.ViewStub r1 = r7.A0J
            android.view.View r1 = r1.inflate()
            r7.A02 = r1
            X.4Hw r1 = r7.A0L
            r16 = r1
            java.util.List r1 = r16.AyT()
            r7.A09 = r1
            r8 = -1
            X.G9w.A0x(r8, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7.A0A = r1
            android.view.View r1 = r7.A02
            r1.getClass()
            r6 = 2131433294(0x7f0b174e, float:1.848837E38)
            android.view.ViewGroup r11 = X.DbU.A0C(r1, r6)
            r10 = 0
        L_0x00ed:
            java.util.List r1 = r7.A09
            int r1 = r1.size()
            if (r10 >= r1) goto L_0x04d1
            java.util.List r1 = r7.A09
            int r4 = X.C51971G9r.A0I(r1, r10)
            android.content.Context r9 = r7.A0I
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r9)
            int r1 = r7.A0F
            r5.setPadding(r1, r2, r1, r2)
            r14 = 1
            r5.setOrientation(r14)
            r13 = 17
            r5.setGravity(r13)
            r1 = 2130969991(0x7f040587, float:1.754868E38)
            int r1 = X.2Yu.A0H(r9, r1)
            X.DbU.A11(r9, r5, r1)
            if (r4 != r8) goto L_0x01a2
            r15 = 0
        L_0x011d:
            android.content.res.Resources r3 = r9.getResources()
            r1 = 2131165294(0x7f07006e, float:1.7944801E38)
            int r12 = r3.getDimensionPixelSize(r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r2, r12, r3)
            r1.setMargins(r2, r2, r15, r2)
            r5.setLayoutParams(r1)
            r1 = 0
            X.3Tj r12 = new X.3Tj
            r12.<init>(r9, r1)
            r12.setMaxLines(r14)
            r1 = -2
            X.C66581MXm.A1B(r12, r8, r1)
            r3 = 14
            r1 = 2
            r12.setAutoSizeTextTypeUniformWithConfiguration(r14, r3, r14, r1)
            int r1 = r7.A0H
            r12.setTextColor(r1)
            r12.setGravity(r13)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT_BOLD
            r12.setTypeface(r1)
            if (r4 != r8) goto L_0x0189
            r1 = 2131962834(0x7f132bd2, float:1.9562404E38)
            java.lang.String r1 = r9.getString(r1)
        L_0x015e:
            r12.setText(r1)
            boolean r3 = r7.A0D
            if (r3 != 0) goto L_0x016b
            r1 = 2131099734(0x7f060056, float:1.781183E38)
            X.DbT.A17(r9, r12, r1)
        L_0x016b:
            r5.addView(r12)
            java.lang.Integer r1 = X.AnonymousClass05K.A02
            X.2eS.A04(r5, r1)
            r11.addView(r5)
            java.util.List r1 = r7.A0A
            r1.getClass()
            r1.add(r5)
            if (r3 == 0) goto L_0x0185
            r1 = 11
            X.WBC.A00(r5, r1, r7)
        L_0x0185:
            int r10 = r10 + 1
            goto L_0x00ed
        L_0x0189:
            double r3 = (double) r4
            java.lang.Double r4 = java.lang.Double.valueOf(r3)
            java.util.Locale r3 = X.AnonymousClass1Q2.A02()
            java.lang.String r1 = r16.CCj()
            r1.getClass()
            java.util.Currency r1 = java.util.Currency.getInstance(r1)
            java.lang.String r1 = X.C18237Vo4.A01(r4, r1, r3)
            goto L_0x015e
        L_0x01a2:
            android.content.res.Resources r3 = r9.getResources()
            r1 = 2131165228(0x7f07002c, float:1.7944667E38)
            int r15 = r3.getDimensionPixelSize(r1)
            goto L_0x011d
        L_0x01af:
            r1 = 2131433315(0x7f0b1763, float:1.8488412E38)
            X.2eb r1 = X.DbY.A0T(r3, r1)
            X.Vai r5 = new X.Vai
            r5.<init>(r1)
            com.instagram.user.model.User r6 = r0.A09
            boolean r4 = r0.A0G
            androidx.fragment.app.FragmentActivity r13 = r0.requireActivity()
            com.instagram.common.session.UserSession r3 = r0.A04
            X.2eb r1 = r5.A05
            r1.A03(r2)
            X.VTD r7 = r5.A04
            r7.getClass()
            X.2eb r1 = r7.A01
            r1.A03(r2)
            X.Vcw r8 = r7.A00
            r8.getClass()
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r8.A0D
            X.DbU.A1S(r0, r7, r6)
            android.content.Context r1 = r8.A01
            android.content.res.Resources r9 = r1.getResources()
            X.4Cl r1 = r6.A03
            java.lang.Integer r1 = r1.BPt()
            if (r1 != 0) goto L_0x0334
            r1 = 0
        L_0x01ed:
            android.widget.TextView r10 = r8.A0C
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = X.C253673rC.A02(r9, r1)
            r10.setText(r1)
            android.widget.TextView r10 = r8.A0B
            r1 = 2131962841(0x7f132bd9, float:1.9562419E38)
            r10.setText(r1)
            X.4Cl r1 = r6.A03
            java.lang.Integer r1 = r1.B6v()
            if (r1 != 0) goto L_0x0328
            r1 = 0
        L_0x020b:
            android.widget.TextView r10 = r8.A07
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = X.C253673rC.A02(r9, r1)
            r10.setText(r1)
            android.widget.TextView r10 = r8.A06
            r1 = 2131962840(0x7f132bd8, float:1.9562417E38)
            r10.setText(r1)
            X.4Cl r1 = r6.A03
            java.lang.Integer r1 = r1.B70()
            if (r1 != 0) goto L_0x031c
            r1 = 0
        L_0x0229:
            android.widget.TextView r10 = r8.A09
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = X.C253673rC.A02(r9, r1)
            r10.setText(r1)
            android.widget.TextView r9 = r8.A08
            r1 = 2131962849(0x7f132be1, float:1.9562435E38)
            r9.setText(r1)
            X.2eb r1 = r8.A00
            r1.A03(r2)
            android.widget.TextView r10 = r8.A0A
            java.lang.String r1 = r6.B8Q()
            r10.setText(r1)
            X.4Cl r1 = r6.A03
            java.lang.String r1 = r1.getCategory()
            android.widget.TextView r9 = r8.A05
            if (r1 == 0) goto L_0x0318
            X.4Cl r1 = r6.A03
            java.lang.String r1 = r1.getCategory()
            r9.setText(r1)
            r1 = 0
        L_0x0260:
            r9.setVisibility(r1)
            r12 = 3
            X.WA8 r11 = new X.WA8
            r14 = r0
            r15 = r3
            r16 = r8
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.AnonymousClass0fU.A00(r11, r7)
            X.AnonymousClass0fU.A00(r11, r10)
            android.view.View r1 = r8.A04
            X.AnonymousClass0fU.A00(r11, r1)
            android.view.View r1 = r8.A02
            X.AnonymousClass0fU.A00(r11, r1)
            android.view.View r1 = r8.A03
            X.AnonymousClass0fU.A00(r11, r1)
            java.lang.String r7 = r0.getModuleName()
            java.lang.String r1 = r6.A0O()
            r1.getClass()
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r1)
            X.WXD r8 = new X.WXD
            r8.<init>(r13, r3, r5, r7)
            android.content.Context r7 = r5.A00
            r7.getClass()
            X.4Cl r1 = r6.A03
            X.3qt r1 = r1.Afr()
            if (r1 == 0) goto L_0x0316
            java.util.List r1 = r1.B1p()
        L_0x02aa:
            X.C318726pQ.A01(r7, r9, r3, r8, r1)
            com.instagram.feed.ui.text.LinkTextView r1 = r5.A03
            r1.getClass()
            r1.setText(r9)
            java.util.List r1 = r6.A0V()
            boolean r1 = X.AnonymousClass3S1.A04(r1)
            if (r1 == 0) goto L_0x02db
            android.widget.TextView r7 = r5.A02
            r7.getClass()
            r1 = 8
            r7.setVisibility(r1)
        L_0x02c9:
            java.lang.String r10 = r0.getModuleName()
            if (r4 == 0) goto L_0x0340
            android.widget.TextView r3 = r5.A01
            r3.getClass()
            r1 = 8
            r3.setVisibility(r1)
            goto L_0x009e
        L_0x02db:
            android.widget.TextView r1 = r5.A02
            r1.getClass()
            r1.setVisibility(r2)
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>()
            android.content.Context r1 = r5.A00
            r1.getClass()
            android.content.res.Resources r8 = r1.getResources()
            android.content.Context r7 = r5.A00
            r7.getClass()
            r12 = 2
            r10 = r3
            r11 = r6
            X.C243483Yy.A02(r7, r8, r9, r10, r11, r12)
            android.widget.TextView r7 = r5.A02
            r7.getClass()
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.SPANNABLE
            r7.setText(r9, r1)
            android.widget.TextView r8 = r5.A02
            r8.getClass()
            r7 = 52
            X.FPH r1 = new X.FPH
            r1.<init>((int) r7, (java.lang.Object) r13, (java.lang.Object) r3, (java.lang.Object) r6)
            X.AnonymousClass0fU.A00(r1, r8)
            goto L_0x02c9
        L_0x0316:
            r1 = 0
            goto L_0x02aa
        L_0x0318:
            r1 = 8
            goto L_0x0260
        L_0x031c:
            X.4Cl r1 = r6.A03
            java.lang.Integer r1 = r1.B70()
            int r1 = r1.intValue()
            goto L_0x0229
        L_0x0328:
            X.4Cl r1 = r6.A03
            java.lang.Integer r1 = r1.B6v()
            int r1 = r1.intValue()
            goto L_0x020b
        L_0x0334:
            X.4Cl r1 = r6.A03
            java.lang.Integer r1 = r1.BPt()
            int r1 = r1.intValue()
            goto L_0x01ed
        L_0x0340:
            X.4Cl r1 = r6.A03
            java.lang.String r9 = r1.getExternalUrl()
            r9.getClass()
            android.widget.TextView r1 = r5.A01
            r1.getClass()
            r1.setVisibility(r2)
            java.lang.String r1 = "https"
            java.lang.String r8 = "^"
            java.lang.String r7 = "://"
            java.lang.String r1 = X.002.A0g(r8, r1, r7)
            java.lang.String r6 = ""
            java.lang.String r4 = r9.replaceFirst(r1, r6)
            java.lang.String r1 = "http"
            java.lang.String r1 = X.002.A0g(r8, r1, r7)
            java.lang.String r4 = r4.replaceFirst(r1, r6)
            android.widget.TextView r1 = r5.A01
            r1.getClass()
            r1.setText(r4)
            android.widget.TextView r1 = r5.A01
            r1.getClass()
            r11 = 5
            X.FOv r6 = new X.FOv
            r7 = r13
            r8 = r3
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11)
            X.AnonymousClass0fU.A00(r6, r1)
            goto L_0x009e
        L_0x0385:
            r1 = 3376(0xd30, float:4.731E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)     // Catch:{ IOException -> 0x03b1 }
            java.lang.String r2 = r5.getString(r1)     // Catch:{ IOException -> 0x03b1 }
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x03b1 }
            com.instagram.user.model.User r3 = X.1aC.A04(r2)     // Catch:{ IOException -> 0x03b1 }
            r3.getClass()
            X.4Cl r1 = r3.A03
            X.4I0 r2 = r1.Amx()
            if (r2 == 0) goto L_0x0056
            r0.A09 = r3
            java.lang.String r1 = r2.getPk()
            r1.getClass()
            r0.A0E = r1
            X.4Hy r3 = r2.AqD()
            goto L_0x048b
        L_0x03b1:
            java.lang.String r1 = "Could not parse json User for the UNF fundraiser consumption sheet."
            X.0wb.A03(r4, r1)
            goto L_0x0056
        L_0x03b8:
            com.instagram.common.session.UserSession r3 = r0.A04     // Catch:{ IOException -> 0x03cb }
            java.lang.String r1 = "fundraiser_live_model_json"
            java.lang.String r2 = X.DbU.A0l(r5, r1)     // Catch:{ IOException -> 0x03cb }
            X.0c5 r1 = X.0c9.A04     // Catch:{ IOException -> 0x03cb }
            X.0c9 r1 = r1.A01(r3, r2)     // Catch:{ IOException -> 0x03cb }
            X.4wA r2 = X.C45561CyZ.parseFromJson(r1)     // Catch:{ IOException -> 0x03cb }
            goto L_0x0440
        L_0x03cb:
            X.0wb.A03(r4, r6)
            goto L_0x0056
        L_0x03d0:
            com.instagram.common.session.UserSession r3 = r0.A04     // Catch:{ IOException -> 0x0407 }
            r1 = 2404(0x964, float:3.369E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)     // Catch:{ IOException -> 0x0407 }
            java.lang.String r2 = X.DbU.A0l(r5, r1)     // Catch:{ IOException -> 0x0407 }
            X.0c5 r1 = X.0c9.A04     // Catch:{ IOException -> 0x0407 }
            X.0c9 r1 = r1.A01(r3, r2)     // Catch:{ IOException -> 0x0407 }
            X.8YF r2 = X.AB9.parseFromJson(r1)     // Catch:{ IOException -> 0x0407 }
            r2.getClass()     // Catch:{ IOException -> 0x0407 }
            int[] r1 = X.C19475WaN.A03     // Catch:{ IOException -> 0x0407 }
            com.instagram.user.model.User r1 = r2.A02
            r1.getClass()
            r0.A09 = r1
            java.lang.String r1 = r2.A08
            r1.getClass()
            r0.A0E = r1
            X.4Hy r3 = r2.A01
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = r3.Akv()
            boolean r1 = r2.equals(r1)
            goto L_0x049f
        L_0x0407:
            r3 = move-exception
            com.instagram.common.session.UserSession r2 = r0.A04
            r1 = 0
            X.LTM.A00(r0, r2, r3, r1)
            goto L_0x04cc
        L_0x0410:
            com.instagram.common.session.UserSession r3 = r0.A04     // Catch:{ IOException -> 0x04ca }
            r1 = 2402(0x962, float:3.366E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)     // Catch:{ IOException -> 0x04ca }
            java.lang.String r2 = X.DbU.A0l(r5, r1)     // Catch:{ IOException -> 0x04ca }
            X.0c5 r1 = X.0c9.A04     // Catch:{ IOException -> 0x04ca }
            X.0c9 r1 = r1.A01(r3, r2)     // Catch:{ IOException -> 0x04ca }
            X.4Hz r3 = X.C263094Hs.parseFromJson(r1)     // Catch:{ IOException -> 0x04ca }
            if (r3 == 0) goto L_0x0056
            java.lang.String r1 = r3.A03
            r1.getClass()
            r0.A0E = r1
            com.instagram.common.session.UserSession r1 = r0.A04
            X.17i r2 = X.17h.A00(r1)
            java.lang.String r1 = r0.A0E
            com.instagram.user.model.User r1 = r2.A02(r1)
            r0.A09 = r1
            X.4Hy r3 = r3.A00
            goto L_0x048b
        L_0x0440:
            com.instagram.user.model.User r1 = r2.A01
            r1.getClass()
            r0.A09 = r1
            java.lang.String r1 = "fundraiser_live_broadcaster_user_id"
            java.lang.String r1 = X.DbU.A0l(r5, r1)
            r0.A0E = r1
            java.lang.String r1 = "broadcast_id"
            java.lang.String r1 = r5.getString(r1)
            r0.A0A = r1
            X.BIa r2 = r2.A00
            r11 = 0
            if (r2 == 0) goto L_0x0056
            java.lang.Boolean r5 = r2.A01
            X.BEr r1 = r2.A00
            if (r1 == 0) goto L_0x04c8
            java.lang.Integer r7 = r1.A00
            java.util.List r12 = r1.A05
            if (r12 != 0) goto L_0x046a
        L_0x0468:
            X.0sn r12 = X.0sn.A00
        L_0x046a:
            if (r1 == 0) goto L_0x04c4
            java.lang.Integer r8 = r1.A01
            java.lang.Integer r9 = r1.A02
            java.lang.Integer r10 = r1.A03
            java.lang.String r11 = r1.A04
        L_0x0474:
            X.4Hv r4 = new X.4Hv
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.lang.String r8 = r2.A02
            java.lang.String r9 = r2.A03
            java.lang.String r10 = r2.A04
            java.lang.String r11 = r2.A05
            java.lang.String r12 = r2.A06
            r6 = 0
            X.4Hx r3 = new X.4Hx
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x048b:
            if (r3 == 0) goto L_0x0056
            java.lang.Boolean r1 = r3.Akv()
            if (r1 == 0) goto L_0x049e
            java.lang.Boolean r1 = r3.Akv()
            boolean r2 = r1.booleanValue()
            r1 = 1
            if (r2 != 0) goto L_0x049f
        L_0x049e:
            r1 = 0
        L_0x049f:
            r0.A0G = r1
            if (r1 == 0) goto L_0x04bd
            java.lang.String r1 = r3.Bfj()
            r0.A0F = r1
            java.lang.String r1 = r3.CHX()
            r0.A0B = r1
        L_0x04af:
            X.4Hw r1 = r3.AyS()
            r0.A05 = r1
            java.lang.String r1 = r3.AyV()
            r0.A0D = r1
            goto L_0x0056
        L_0x04bd:
            java.lang.String r1 = r3.AyU()
            r0.A0C = r1
            goto L_0x04af
        L_0x04c4:
            r8 = r11
            r9 = r11
            r10 = r11
            goto L_0x0474
        L_0x04c8:
            r7 = r11
            goto L_0x0468
        L_0x04ca:
            java.lang.String r6 = "Could not parse json FundraiserDonateActionButtonModel for the fundraiser consumption sheet."
        L_0x04cc:
            X.0wb.A03(r4, r6)
            goto L_0x0056
        L_0x04d1:
            boolean r1 = r7.A0D
            if (r1 == 0) goto L_0x0614
            android.view.View r3 = r7.A02
            r3.getClass()
            r1 = 2131433295(0x7f0b174f, float:1.8488372E38)
            android.widget.EditText r1 = X.DbU.A0E(r3, r1)
            r7.A03 = r1
            android.view.View r3 = r7.A02
            r1 = 2131433296(0x7f0b1750, float:1.8488374E38)
            android.widget.TextView r1 = X.DbU.A0G(r3, r1)
            r7.A06 = r1
            r9 = 1
            X.W7c r1 = new X.W7c
            r1.<init>(r7)
            r7.A01 = r1
            r7.A0E = r2
            android.view.View r3 = r7.A02
            r1 = 2131433297(0x7f0b1751, float:1.8488376E38)
            android.view.View r1 = r3.requireViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r7.A04 = r1
            r1.getClass()
            android.view.ViewTreeObserver r4 = r1.getViewTreeObserver()
            r3 = 9
            X.WC9 r1 = new X.WC9
            r1.<init>(r7, r3)
            r4.addOnGlobalLayoutListener(r1)
            java.lang.Integer r1 = r16.Avz()
            if (r1 == 0) goto L_0x0651
            java.lang.Integer r1 = r16.Avz()
            int r1 = r1.intValue()
        L_0x0524:
            r7.A00 = r1
            java.util.List r4 = r7.A0A
            r4.getClass()
            java.util.List r3 = r7.A09
            r3.getClass()
            int r1 = r7.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r3.indexOf(r1)
            java.lang.Object r5 = r4.get(r1)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            android.view.View r3 = r5.getChildAt(r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r1 = r7.A0G
            r3.setTextColor(r1)
            android.content.Context r4 = r7.A0I
            r1 = 2130969990(0x7f040586, float:1.7548677E38)
            int r1 = X.2Yu.A0H(r4, r1)
            X.DbU.A11(r4, r5, r1)
            r7.A05 = r5
            r5.setSelected(r9)
            X.C18742VzN.A01(r7)
            java.lang.Integer r1 = r16.Bem()
            if (r1 == 0) goto L_0x0614
            java.lang.Integer r1 = r16.Bem()
            int r1 = r1.intValue()
            if (r1 <= 0) goto L_0x0614
            java.lang.Integer r1 = r16.Bem()
            int r9 = X.C13988Tno.A0D(r1)
            r7.A00 = r8
            android.view.View r1 = r7.A02
            r1.getClass()
            X.DbX.A1B(r1, r6)
            android.widget.LinearLayout r1 = r7.A04
            r1.getClass()
            r1.setVisibility(r2)
            android.widget.EditText r3 = r7.A03
            r3.getClass()
            r1 = 17
            r3.setGravity(r1)
            android.widget.EditText r3 = r7.A03
            android.text.TextWatcher r1 = r7.A01
            r1.getClass()
            r3.addTextChangedListener(r1)
            android.content.res.Resources r6 = r4.getResources()
            android.widget.EditText r8 = r7.A03
            r1 = 2131165200(0x7f070010, float:1.794461E38)
            r3 = 2131165200(0x7f070010, float:1.794461E38)
            int r5 = r6.getDimensionPixelSize(r1)
            r1 = 2131165206(0x7f070016, float:1.7944623E38)
            int r4 = r6.getDimensionPixelSize(r1)
            int r3 = r6.getDimensionPixelSize(r3)
            int r1 = X.JTP.A03(r6)
            r8.setPadding(r5, r4, r3, r1)
            android.widget.EditText r1 = r7.A03
            android.view.ViewGroup$MarginLayoutParams r3 = X.DbS.A0D(r1)
            r3.setMargins(r2, r2, r2, r2)
            android.widget.EditText r1 = r7.A03
            r1.setLayoutParams(r3)
            android.widget.EditText r3 = r7.A03
            r1 = 2131165504(0x7f070140, float:1.7945227E38)
            X.C13990Tnq.A0o(r6, r3, r1)
            java.lang.String r4 = java.lang.Integer.toString(r9)
            java.util.Locale r6 = X.AnonymousClass1Q2.A02()
            java.lang.String r1 = r16.CCj()
            r1.getClass()
            java.util.Currency r5 = java.util.Currency.getInstance(r1)
            java.lang.String r3 = "\\D"
            java.lang.String r1 = ""
            java.lang.String r3 = r4.replaceAll(r3, r1)
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0602
            double r3 = java.lang.Double.parseDouble(r3)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            java.lang.String r3 = X.C18237Vo4.A01(r1, r5, r6)
        L_0x0602:
            X.C18742VzN.A00(r7, r3)
            X.C18742VzN.A01(r7)
            boolean r1 = r7.A0B
            if (r1 == 0) goto L_0x0614
            android.widget.TextView r1 = r7.A06
            r1.getClass()
            r1.setVisibility(r2)
        L_0x0614:
            java.lang.String r3 = r0.A0B
            if (r3 == 0) goto L_0x0626
            android.view.View r2 = r0.A01
            r1 = 2131433288(0x7f0b1748, float:1.8488357E38)
            android.view.View r1 = X.DbY.A0F(r2, r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r3)
        L_0x0626:
            android.view.View r2 = r0.A01
            r1 = 2131433290(0x7f0b174a, float:1.8488362E38)
            android.widget.TextView r2 = X.DbU.A0G(r2, r1)
            java.lang.String r1 = r0.A0F
            if (r1 != 0) goto L_0x0635
            java.lang.String r1 = r0.A0C
        L_0x0635:
            r2.setText(r1)
        L_0x0638:
            boolean r1 = r0.A0G
            android.widget.TextView r2 = r0.A03
            if (r1 != 0) goto L_0x0654
            r2.getClass()
            r1 = 10
            X.WBC.A00(r2, r1, r0)
            android.widget.TextView r2 = r0.A03
            android.content.Context r1 = r0.A00
            r0 = 2131099734(0x7f060056, float:1.781183E38)
            X.DbT.A16(r1, r2, r0)
            return
        L_0x0651:
            r1 = 0
            goto L_0x0524
        L_0x0654:
            r2.getClass()
            r1 = 8
            X.WBC.A00(r2, r1, r0)
            android.widget.TextView r1 = r0.A03
            r0 = 2131237351(0x7f0819e7, float:1.809095E38)
            r1.setBackgroundResource(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UZ1.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1796120304);
        UZ1.super.onCreate(bundle);
        AnonymousClass0fD.A09(-1725261479, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-285034191);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.fragment_fundraiser_sticker_consumption_sheet);
        AnonymousClass0fD.A09(1819074181, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2039909584);
        super.onDestroyView();
        Object systemService = this.A00.getSystemService("input_method");
        systemService.getClass();
        C13989Tnp.A1A(this.A01, (InputMethodManager) systemService);
        AnonymousClass0fD.A09(-26699518, A022);
    }
}
