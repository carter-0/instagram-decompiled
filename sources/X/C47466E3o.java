package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.nux.cal.model.FxAccountInfo;
import com.instagram.user.model.User;
import java.util.Locale;

/* renamed from: X.E3o  reason: case insensitive filesystem */
public final class C47466E3o extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ConnectContentFragment";
    public AnonymousClass0wW A00;
    public EVV A01;
    public ConnectContent A02;
    public Integer A03;
    public boolean A04 = false;

    public final String getModuleName() {
        return "signup_account";
    }

    private Drawable A00(String str) {
        Context requireContext;
        int i;
        Locale locale = Locale.US;
        if (0mp.A0G(str.toLowerCase(locale), FxcalAccountType.INSTAGRAM.toString().toLowerCase(locale)) || !0mp.A0G(str.toLowerCase(locale), FxcalAccountType.FACEBOOK.toString().toLowerCase(locale))) {
            requireContext = requireContext();
            i = R.drawable.ig_badge_color_logo;
        } else {
            requireContext = requireContext();
            i = R.drawable.fb_badge_color_logo;
        }
        return requireContext.getDrawable(i);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [com.instagram.nux.cal.model.FxAccountInfo, java.lang.Object] */
    private void A01(View view, AnonymousClass0wW r6) {
        String username;
        FxAccountInfo fxAccountInfo = this.A02.A02;
        FxAccountInfo fxAccountInfo2 = fxAccountInfo;
        if (fxAccountInfo == null) {
            User A0j = DbT.A0j((UserSession) r6);
            String obj = FxcalAccountType.INSTAGRAM.toString();
            if (!TextUtils.isEmpty(A0j.getFullName())) {
                username = A0j.getFullName();
            } else {
                username = A0j.getUsername();
            }
            ImageUrl Bh3 = A0j.Bh3();
            ? obj2 = new Object();
            obj2.A01 = obj;
            obj2.A02 = username;
            obj2.A00 = Bh3;
            obj2.A03 = obj;
            fxAccountInfo2 = obj2;
        }
        IgImageView A0B = DbU.A0B(view, R.id.avatar_container);
        ImageUrl imageUrl = fxAccountInfo2.A00;
        if (imageUrl != null) {
            A0B.setUrl(imageUrl, this);
        } else {
            DbU.A13(requireContext(), A0B, R.drawable.profile_anonymous_user);
        }
        ((ImageView) DbU.A0B(view, R.id.badge_container)).setImageDrawable(A00(fxAccountInfo2.A01));
        TextView A07 = Dba.A07(view, R.id.accountTitle);
        String str = fxAccountInfo2.A02;
        str.getClass();
        A07.setText(str);
        Dba.A07(view, R.id.accountSubtitle).setText(fxAccountInfo2.A03);
    }

    public final C46634DiE A02() {
        int ordinal = this.A01.ordinal();
        if (ordinal == 1) {
            return C46634DiE.A0N;
        }
        if (ordinal == 2) {
            return C46634DiE.A0K;
        }
        if (ordinal == 3) {
            return C46634DiE.A0R;
        }
        if (ordinal != 4) {
            return C46634DiE.A0z;
        }
        return C46634DiE.A13;
    }

    public final boolean onBackPressed() {
        if (this.A04) {
            AnonymousClass0wW r2 = this.A00;
            String obj = EVV.IG_SAC_SIGN_UP.toString();
            AnonymousClass7TG.A1N(r2, obj);
            FG9.A00(r2, "link_accounts_screen_closed", obj);
        }
        EVV evv = this.A01;
        if (evv == null || evv == EVV.IG_SAC_SIGN_UP) {
            return false;
        }
        return true;
    }

    public final AnonymousClass0wW getSession() {
        return DbX.A0T(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0044, code lost:
        if (r2 != X.EVV.A05) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = -485860353(0xffffffffe30a5bff, float:-2.5522797E21)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.C47466E3o.super.onCreate(r5)
            X.0wW r0 = X.DbX.A0T(r4)
            r4.A00 = r0
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "argument_content"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            r0.getClass()
            com.instagram.nux.cal.model.ConnectContent r0 = (com.instagram.nux.cal.model.ConnectContent) r0
            r4.A02 = r0
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "argument_flow"
            java.lang.String r0 = X.DbU.A0l(r1, r0)
            java.lang.Integer r0 = X.Eo6.A00(r0)
            r4.A03 = r0
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "argument_entry_point"
            java.io.Serializable r2 = r1.getSerializable(r0)
            X.EVV r2 = (X.EVV) r2
            r4.A01 = r2
            if (r2 == 0) goto L_0x0046
            X.EVV r1 = X.EVV.IG_SAC_SIGN_UP
            r0 = 1
            if (r2 == r1) goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            r4.A04 = r0
            r0 = 1980528907(0x760c790b, float:7.1228184E32)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47466E3o.onCreate(android.os.Bundle):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r18, android.view.ViewGroup r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r0 = 2061555633(0x7ae0d7b1, float:5.837246E35)
            int r16 = X.AnonymousClass0fD.A02(r0)
            r0 = 2131629408(0x7f0e1560, float:1.8886136E38)
            r10 = 0
            r2 = r18
            r1 = r19
            android.view.View r3 = r2.inflate(r0, r1, r10)
            r0 = 2131427438(0x7f0b006e, float:1.8476492E38)
            android.widget.TextView r9 = X.Dba.A07(r3, r0)
            r0 = 2131436297(0x7f0b2309, float:1.849446E38)
            android.view.View r12 = X.DbU.A0B(r3, r0)
            r0 = 2131427440(0x7f0b0070, float:1.8476496E38)
            android.widget.TextView r8 = X.Dba.A07(r3, r0)
            r0 = 2131427439(0x7f0b006f, float:1.8476494E38)
            android.widget.TextView r7 = X.Dba.A07(r3, r0)
            r0 = 2131432622(0x7f0b14ae, float:1.8487007E38)
            android.view.View r14 = X.DbU.A0B(r3, r0)
            r0 = 2131436296(0x7f0b2308, float:1.8494458E38)
            android.view.View r11 = X.DbU.A0B(r3, r0)
            r2 = r17
            boolean r0 = r2.A04
            r6 = 8
            if (r0 == 0) goto L_0x0222
            X.0wW r5 = r2.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 36320919219676112(0x8109af000123d0, double:3.032833794901265E-306)
            boolean r0 = X.DbY.A1Y(r4, r5, r0)
            if (r0 == 0) goto L_0x0222
            r0 = 2131427436(0x7f0b006c, float:1.8476488E38)
            android.view.View r1 = X.DbU.A0B(r3, r0)
            X.0wW r0 = r2.A00
            r2.A01(r1, r0)
            r1.setVisibility(r10)
            r0 = 2131427435(0x7f0b006b, float:1.8476486E38)
            android.view.View r0 = X.DbU.A0B(r3, r0)
            r0.setVisibility(r6)
        L_0x006d:
            r0 = 2131427437(0x7f0b006d, float:1.847649E38)
            android.view.View r4 = X.DbU.A0B(r3, r0)
            com.instagram.nux.cal.model.ConnectContent r5 = r2.A02
            com.instagram.nux.cal.model.FxAccountInfo r0 = r5.A03
            r0.getClass()
            r0 = 2131428394(0x7f0b042a, float:1.8478431E38)
            android.view.View r13 = X.DbU.A0B(r4, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r13 = (com.instagram.common.ui.widget.imageview.IgImageView) r13
            com.instagram.nux.cal.model.FxAccountInfo r0 = r5.A03
            com.instagram.common.typedurl.ImageUrl r1 = r0.A00
            boolean r0 = X.C253833rU.A02(r1)
            if (r0 == 0) goto L_0x021d
            android.content.Context r1 = r2.requireContext()
            r0 = 2131239607(0x7f0822b7, float:1.8095526E38)
            X.DbU.A13(r1, r13, r0)
        L_0x0098:
            r0 = 2131428567(0x7f0b04d7, float:1.8478782E38)
            android.view.View r1 = X.DbU.A0B(r4, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            com.instagram.nux.cal.model.ConnectContent r0 = r2.A02
            com.instagram.nux.cal.model.FxAccountInfo r0 = r0.A03
            java.lang.String r0 = r0.A01
            android.graphics.drawable.Drawable r0 = r2.A00(r0)
            r1.setImageDrawable(r0)
            r0 = 2131427440(0x7f0b0070, float:1.8476496E38)
            android.widget.TextView r1 = X.Dba.A07(r4, r0)
            com.instagram.nux.cal.model.FxAccountInfo r0 = r5.A03
            java.lang.String r0 = r0.A02
            r1.setText(r0)
            r0 = 2131427439(0x7f0b006f, float:1.8476494E38)
            android.widget.TextView r1 = X.Dba.A07(r4, r0)
            com.instagram.nux.cal.model.FxAccountInfo r0 = r5.A03
            java.lang.String r0 = r0.A03
            r1.setText(r0)
            r0 = 2131440925(0x7f0b351d, float:1.8503847E38)
            android.view.View r1 = X.DbU.A0B(r3, r0)
            com.instagram.nux.cal.model.ConnectContent r0 = r2.A02
            java.util.List r0 = r0.A0J
            if (r0 == 0) goto L_0x00fe
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r0 == 0) goto L_0x00fe
            com.instagram.nux.cal.model.ConnectContent r0 = r2.A02
            java.util.List r0 = r0.A0J
            if (r0 == 0) goto L_0x021a
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
        L_0x00e7:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00fe
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbS.A0D(r4)
            r0.bottomMargin = r10
            r4.setLayoutParams(r0)
            r1.setVisibility(r10)
            r0 = 11
            X.FP0.A00(r1, r0, r2)
        L_0x00fe:
            r0 = 2131433892(0x7f0b19a4, float:1.8489583E38)
            android.widget.TextView r13 = X.Dba.A07(r3, r0)
            r0 = 2131429286(0x7f0b07a6, float:1.848024E38)
            android.view.View r5 = X.DbU.A0B(r3, r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r5 = (com.instagram.ui.widget.progressbutton.ProgressButton) r5
            r0 = 2131429287(0x7f0b07a7, float:1.8480242E38)
            android.widget.TextView r4 = X.Dba.A07(r3, r0)
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0138
            r14.setVisibility(r6)
            X.0wW r15 = r2.A00
            X.0Tu r14 = X.0Tu.A05
            r0 = 36320919219676112(0x8109af000123d0, double:3.032833794901265E-306)
            boolean r0 = X.DbY.A1Y(r14, r15, r0)
            if (r0 == 0) goto L_0x0215
            r12.setVisibility(r10)
            r0 = 2131427471(0x7f0b008f, float:1.847656E38)
            android.view.View r0 = X.DbU.A0B(r3, r0)
            r0.setVisibility(r10)
        L_0x0138:
            com.instagram.nux.cal.model.ConnectContent r0 = r2.A02
            java.lang.String r0 = r0.A08
            boolean r0 = X.0mp.A0B(r0)
            if (r0 != 0) goto L_0x0190
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0209
            r7.setVisibility(r10)
            X.0wW r12 = r2.A00
            X.0Tu r11 = X.0Tu.A05
            r0 = 36320919219872723(0x8109af000423d3, double:3.032833795025602E-306)
            boolean r0 = X.DbY.A1Y(r11, r12, r0)
            if (r0 == 0) goto L_0x0201
            X.0wW r0 = r2.A00
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            java.lang.String r1 = X.DbX.A0q(r0)
            com.instagram.nux.cal.model.ConnectContent r0 = r2.A02
            java.lang.String r12 = r0.A08
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01fd
            if (r12 == 0) goto L_0x01fd
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x01fd
            int r11 = r12.indexOf(r1)
            r0 = -1
            if (r11 == r0) goto L_0x01fd
            android.text.SpannableStringBuilder r12 = X.DbS.A0C(r12)
            r0 = 1
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            int r1 = r1.length()
            int r1 = r1 + r11
            r0 = 33
            r12.setSpan(r6, r11, r1, r0)
        L_0x018d:
            r7.setText(r12)
        L_0x0190:
            X.EVV r1 = r2.A01
            if (r1 == 0) goto L_0x019e
            X.EVV r0 = X.EVV.PROFILE_PIC
            if (r1 != r0) goto L_0x019e
            r0 = 2131964187(0x7f13311b, float:1.9565149E38)
            r9.setText(r0)
        L_0x019e:
            com.instagram.nux.cal.model.ConnectContent r0 = r2.A02
            java.lang.String r0 = r0.A09
            r0.getClass()
            r8.setText(r0)
            com.instagram.nux.cal.model.ConnectContent r0 = r2.A02
            java.lang.String r0 = r0.A07
            if (r0 != 0) goto L_0x01b0
            java.lang.String r0 = ""
        L_0x01b0:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r13.setText(r0)
            java.lang.CharSequence r0 = r13.getText()
            android.text.SpannableStringBuilder r12 = X.DbS.A0C(r0)
            int r1 = r0.length()
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            r11 = 0
            java.lang.Object[] r10 = r12.getSpans(r10, r1, r0)
            android.text.style.ClickableSpan[] r10 = (android.text.style.ClickableSpan[]) r10
            int r9 = r10.length
        L_0x01cd:
            if (r11 >= r9) goto L_0x0230
            r1 = r10[r11]
            boolean r0 = r1 instanceof android.text.style.URLSpan
            if (r0 == 0) goto L_0x01fb
            r0 = r1
            android.text.style.URLSpan r0 = (android.text.style.URLSpan) r0
            java.lang.String r8 = r0.getURL()
        L_0x01dc:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x01f8
            int r7 = r12.getSpanStart(r1)
            int r6 = r12.getSpanEnd(r1)
            r12.removeSpan(r1)
            r0 = 2
            X.DjE r1 = new X.DjE
            r1.<init>(r8, r2, r0)
            r0 = 33
            r12.setSpan(r1, r7, r6, r0)
        L_0x01f8:
            int r11 = r11 + 1
            goto L_0x01cd
        L_0x01fb:
            r8 = 0
            goto L_0x01dc
        L_0x01fd:
            r7.setVisibility(r6)
            goto L_0x0190
        L_0x0201:
            com.instagram.nux.cal.model.ConnectContent r0 = r2.A02
            java.lang.String r12 = r0.A08
            r12.getClass()
            goto L_0x018d
        L_0x0209:
            com.instagram.nux.cal.model.ConnectContent r0 = r2.A02
            java.lang.String r0 = r0.A08
            r0.getClass()
            r9.setText(r0)
            goto L_0x0190
        L_0x0215:
            r11.setVisibility(r10)
            goto L_0x0138
        L_0x021a:
            r0 = 0
            goto L_0x00e7
        L_0x021d:
            r13.setUrl(r1, r2)
            goto L_0x0098
        L_0x0222:
            r0 = 2131427435(0x7f0b006b, float:1.8476486E38)
            android.view.View r1 = X.DbU.A0B(r3, r0)
            X.0wW r0 = r2.A00
            r2.A01(r1, r0)
            goto L_0x006d
        L_0x0230:
            X.DbX.A1G(r13, r12)
            com.instagram.nux.cal.model.ConnectContent r0 = r2.A02
            java.lang.String r0 = r0.A05
            r0.getClass()
            r5.setText((java.lang.CharSequence) r0)
            r0 = 9
            X.FP0.A00(r5, r0, r2)
            com.instagram.nux.cal.model.ConnectContent r0 = r2.A02
            java.lang.String r0 = r0.A06
            r0.getClass()
            r4.setText(r0)
            r0 = 10
            X.FP0.A00(r4, r0, r2)
            X.0wW r1 = r2.A00
            X.DiE r0 = r2.A02()
            java.lang.String r0 = r0.A01
            X.AnonymousClass7TG.A1N(r1, r0)
            X.C49938FFr.A01(r1, r0)
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0273
            X.0wW r2 = r2.A00
            X.EVV r0 = X.EVV.IG_SAC_SIGN_UP
            java.lang.String r1 = r0.toString()
            X.AnonymousClass7TF.A1H(r2, r1)
            java.lang.String r0 = "link_accounts_screen_shown"
            X.FG9.A00(r2, r0, r1)
        L_0x0273:
            r1 = 2123749185(0x7e95d741, float:9.958632E37)
            r0 = r16
            X.AnonymousClass0fD.A09(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47466E3o.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
