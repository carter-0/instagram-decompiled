package com.instagram.business.fragment;

import X.0eE;
import X.0hq;
import X.0nA;
import X.1NY;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0t1;
import X.AnonymousClass0wW;
import X.AnonymousClass3Jb;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass6ST;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C253543qx;
import X.C274674os;
import X.C324066yY;
import X.C358248ab;
import X.C358278ae;
import X.C47335Dv2;
import X.C47690ECz;
import X.C49935FFo;
import X.C50022FJh;
import X.C50023FJi;
import X.C59904JbT;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbZ;
import X.F5B;
import X.FP5;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.Serializable;

public class SupportServiceEditUrlFragment extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public ActionButton A00;
    public SMBPartnerType A01;
    public C49935FFo A02;
    public UserSession A03;
    public AnonymousClass6ST A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public String A0E;
    public String A0F;
    public final Handler A0G = AnonymousClass7TF.A0D();
    public BusinessNavBar mBusinessNavBar;
    public EditText mURLEditText;
    public TextView mURLTitleTextView;

    public final String getModuleName() {
        return "service_partner_edit_url";
    }

    public static void A00(C274674os r3, SupportServiceEditUrlFragment supportServiceEditUrlFragment) {
        User A0j = DbT.A0j(supportServiceEditUrlFragment.A03);
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        if (sMBPartnerType.equals(SMBPartnerType.GIFT_CARD)) {
            A0j.A03.ElW(r3);
        } else if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
            A0j.A03.ElT(r3);
        } else if (sMBPartnerType.equals(SMBPartnerType.DONATION)) {
            A0j.A03.ElU(r3);
        }
        DbT.A1S(supportServiceEditUrlFragment.A03, A0j);
    }

    public static void A01(SupportServiceEditUrlFragment supportServiceEditUrlFragment) {
        String str = supportServiceEditUrlFragment.A0A;
        if ("sticker".equals(str) || "business_hub".equals(str)) {
            DbT.A1K(supportServiceEditUrlFragment);
        } else {
            supportServiceEditUrlFragment.getParentFragmentManager().A0y(SupportLinksFragment.A06, 1);
        }
    }

    public static void A02(SupportServiceEditUrlFragment supportServiceEditUrlFragment, String str) {
        UserSession userSession = supportServiceEditUrlFragment.A03;
        String str2 = supportServiceEditUrlFragment.A05;
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        C47690ECz eCz = new C47690ECz(str, supportServiceEditUrlFragment, 1);
        AnonymousClass7TF.A1D(userSession, 0, sMBPartnerType);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("accounts/update_smb_partner/");
        A0a.A0Q(C47335Dv2.class, F5B.class);
        A0a.A0R = true;
        A0a.A9m("smb_partner_type", sMBPartnerType.toString());
        A0a.A9m("url", str);
        A0a.A9m("app_id", str2);
        DbW.A1E(A0a, eCz, supportServiceEditUrlFragment);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r5) {
        int i;
        ? obj = new Object();
        boolean z = this.A0C;
        boolean equals = this.A0A.equals("sticker");
        if (z) {
            i = 2131961514;
            if (equals) {
                i = 2131961511;
            }
        } else {
            i = 2131952133;
            if (equals) {
                i = 2131974805;
            }
        }
        obj.A02 = getString(i);
        this.A00 = C59904JbT.A00(FP5.A00(this, 4), r5, obj);
        if (getParentFragmentManager().A0M() != 0) {
            r5.ErG(new AnonymousClass3Jb(DbV.A0K()));
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A03;
    }

    public final boolean onBackPressed() {
        View view = this.mView;
        if (view != null) {
            0nA.A0N(view);
        }
        if (getParentFragmentManager().A0M() == 0) {
            DbT.A1K(this);
            return true;
        }
        0hq r0 = this.mFragmentManager;
        if (r0 == null) {
            return true;
        }
        r0.A0c();
        return true;
    }

    public static void A03(SupportServiceEditUrlFragment supportServiceEditUrlFragment, String str) {
        int i;
        String string;
        DialogInterface.OnClickListener fJh;
        C358278ae r0;
        int i2;
        C358248ab A0V = DbW.A0V(supportServiceEditUrlFragment);
        boolean isEmpty = TextUtils.isEmpty(str);
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        boolean equals = sMBPartnerType.equals(SMBPartnerType.DONATION);
        if (isEmpty) {
            if (equals) {
                A0V.A09(2131972069);
                i2 = 2131972068;
            } else if (sMBPartnerType.equals(SMBPartnerType.GIFT_CARD)) {
                A0V.A09(2131972067);
                i2 = 2131972070;
            } else {
                if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                    A0V.A09(2131972067);
                    i2 = 2131972066;
                }
                string = supportServiceEditUrlFragment.getString(2131972065);
                fJh = C50023FJi.A00(supportServiceEditUrlFragment, 22);
                r0 = C358278ae.RED_BOLD;
            }
            A0V.A08(i2);
            string = supportServiceEditUrlFragment.getString(2131972065);
            fJh = C50023FJi.A00(supportServiceEditUrlFragment, 22);
            r0 = C358278ae.RED_BOLD;
        } else {
            if (equals) {
                A0V.A09(2131976064);
                i = 2131976063;
            } else if (sMBPartnerType.equals(SMBPartnerType.GIFT_CARD)) {
                A0V.A09(2131976062);
                i = 2131976065;
            } else {
                if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                    A0V.A09(2131976062);
                    i = 2131976061;
                }
                string = supportServiceEditUrlFragment.getString(2131976060);
                fJh = new C50022FJh(str, (Object) supportServiceEditUrlFragment, 0);
                r0 = C358278ae.DEFAULT;
            }
            A0V.A08(i);
            string = supportServiceEditUrlFragment.getString(2131976060);
            fJh = new C50022FJh(str, (Object) supportServiceEditUrlFragment, 0);
            r0 = C358278ae.DEFAULT;
        }
        A0V.A0Y(fJh, r0, string, true);
        A0V.A0a(C50023FJi.A00(supportServiceEditUrlFragment, 19), supportServiceEditUrlFragment.getString(2131954730));
        DbT.A1V(A0V);
    }

    public final void onCreate(Bundle bundle) {
        boolean A1V;
        int i;
        int A022 = AnonymousClass0fD.A02(264595987);
        SupportServiceEditUrlFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = DbX.A0U(this);
        this.A0F = DbU.A0l(requireArguments, "args_session_id");
        this.A05 = requireArguments.getString("APP_ID");
        this.A0B = requireArguments.getString("PARTNER_NAME");
        this.A0E = requireArguments.getString("PLACEHOLDER_URL");
        this.A06 = requireArguments.getString("AUTOFILL_URL");
        String string = requireArguments.getString("args_entry_point");
        this.A0A = string;
        this.A02 = new C49935FFo(this, this.A03, this.A0F, string);
        this.A0D = "profile".equals(this.A0A);
        String str = null;
        if (requireArguments.getString("args_category_type") != null) {
            String string2 = requireArguments.getString("args_category_type");
            this.A07 = string2;
            this.A01 = C253543qx.A00(string2);
            C274674os AyK = DbV.A0k(this.A03).AyK();
            if (AyK != null) {
                str = AyK.AmM();
            }
            this.A08 = str;
            if (AyK != null) {
                this.A09 = AyK.Ay3();
            }
            A1V = !TextUtils.isEmpty(this.A06);
        } else {
            Serializable serializable = requireArguments.getSerializable("args_service_type");
            serializable.getClass();
            SMBPartnerType sMBPartnerType = (SMBPartnerType) serializable;
            this.A01 = sMBPartnerType;
            this.A07 = sMBPartnerType.toString();
            UserSession userSession = this.A03;
            0eE r4 = AnonymousClass0t1.A01;
            SMBPartnerType AyL = DbS.A0h(userSession, r4).AyL();
            if (AyL != null) {
                str = AyL.toString();
            }
            this.A08 = str;
            if (AyL != null) {
                int ordinal = AyL.ordinal();
                if (ordinal == 6) {
                    i = 2131963077;
                } else if (ordinal == 3) {
                    i = 2131957624;
                } else if (ordinal == 2) {
                    i = 2131960991;
                } else {
                    throw DbZ.A0p(AyL);
                }
                this.A09 = getString(i);
            }
            A1V = AnonymousClass7TF.A1V(C324066yY.A00(this.A01, r4.A01(this.A03)));
        }
        this.A0C = A1V;
        AnonymousClass0fD.A09(770879893, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(777482716);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.support_service_edit_url_fragment);
        AnonymousClass0fD.A09(1793741416, A022);
        return A0C2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            r9 = this;
            super.onViewCreated(r10, r11)
            X.FFo r8 = r9.A02
            java.lang.String r7 = r9.A07
            boolean r6 = r9.A0C
            java.lang.String r5 = r9.A05
            java.lang.String r3 = r9.A0B
            java.lang.String r2 = r9.A06
            X.DbY.A1S(r7, r5)
            r4 = 3
            X.0qQ.A0B(r3, r4)
            X.0Aj r1 = X.C49935FFo.A00(r8)
            java.lang.String r0 = "add_url"
            X.DbS.A1H(r1, r0)
            java.lang.String r0 = "view"
            X.DbS.A1J(r1, r0)
            X.C49935FFo.A01(r1, r8, r7, r5, r6)
            X.Dba.A1A(r1, r3, r2)
            r1.Cgf()
            android.widget.TextView r3 = X.Dba.A06(r10)
            com.instagram.api.schemas.SMBPartnerType r0 = r9.A01
            com.instagram.api.schemas.SMBPartnerType r1 = com.instagram.api.schemas.SMBPartnerType.DONATION
            boolean r2 = r0.equals(r1)
            r0 = 2131952414(0x7f13031e, float:1.954127E38)
            if (r2 == 0) goto L_0x0041
            r0 = 2131952296(0x7f1302a8, float:1.954103E38)
        L_0x0041:
            X.DbU.A1G(r3, r9, r0)
            android.widget.TextView r6 = X.Dba.A05(r10)
            java.lang.String r2 = r9.A0A
            java.lang.String r0 = "sticker"
            boolean r3 = r2.equals(r0)
            com.instagram.api.schemas.SMBPartnerType r2 = r9.A01
            com.instagram.api.schemas.SMBPartnerType r0 = com.instagram.api.schemas.SMBPartnerType.GIFT_CARD
            boolean r0 = r2.equals(r0)
            if (r3 == 0) goto L_0x0145
            if (r0 == 0) goto L_0x0138
            r0 = 2131973129(0x7f135409, float:1.9583285E38)
        L_0x005f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x0063:
            r0 = 2131954400(0x7f130ae0, float:1.9545298E38)
            java.lang.String r8 = r9.getString(r0)
            int r0 = r2.intValue()
            r7 = 1
            r3 = 0
            android.text.SpannableStringBuilder r5 = X.DbY.A0E(r9, r8, r0)
            int r0 = X.DbZ.A01(r9)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.ESx r0 = new X.ESx
            r0.<init>((java.lang.Integer) r2, (java.lang.Object) r9, (int) r4)
            X.AnonymousClass7AV.A05(r5, r0, r8)
            r6.setText(r5)
            r6.setHighlightColor(r3)
            X.DbT.A1H(r6)
            r0 = 2131443492(0x7f0b3f24, float:1.8509054E38)
            android.widget.EditText r2 = X.DbU.A0E(r10, r0)
            r9.mURLEditText = r2
            java.lang.String r0 = r9.A0E
            r2.setHint(r0)
            java.lang.String r0 = r9.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00aa
            android.widget.EditText r2 = r9.mURLEditText
            java.lang.String r0 = r9.A06
            r2.setText(r0)
        L_0x00aa:
            r0 = 2131432236(0x7f0b132c, float:1.8486224E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r10, r0)
            r9.mURLTitleTextView = r0
            r0 = 2131429021(0x7f0b069d, float:1.8479703E38)
            android.widget.TextView r2 = X.DbU.A0G(r10, r0)
            com.instagram.api.schemas.SMBPartnerType r0 = r9.A01
            boolean r1 = r0.equals(r1)
            r0 = 2131952412(0x7f13031c, float:1.9541266E38)
            if (r1 == 0) goto L_0x00c8
            r0 = 2131952295(0x7f1302a7, float:1.9541029E38)
        L_0x00c8:
            r2.setText(r0)
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x0122
            r0 = 2131439804(0x7f0b30bc, float:1.8501573E38)
            android.view.View r0 = r10.requireViewById(r0)
            com.instagram.business.ui.BusinessNavBar r0 = (com.instagram.business.ui.BusinessNavBar) r0
            r9.mBusinessNavBar = r0
            r0.setVisibility(r3)
            com.instagram.business.ui.BusinessNavBar r0 = r9.mBusinessNavBar
            android.view.View r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.business.ui.BusinessNavBar r6 = r9.mBusinessNavBar
            r0 = 2131972083(0x7f134ff3, float:1.9581164E38)
            java.lang.String r5 = r9.getString(r0)
            android.content.Context r1 = r9.requireContext()
            android.content.Context r0 = r9.requireContext()
            int r0 = X.2Yu.A03(r0)
            int r2 = r1.getColor(r0)
            android.content.res.Resources r1 = X.DbV.A05(r9)
            r0 = 2131165249(0x7f070041, float:1.794471E38)
            int r0 = r1.getDimensionPixelSize(r0)
            com.instagram.common.ui.text.TitleTextView r1 = r6.A03
            r1.setText(r5)
            r1.setIsBold(r7)
            r1.setTextColor(r2)
            float r0 = (float) r0
            r1.setTextSize(r3, r0)
            com.instagram.business.ui.BusinessNavBar r1 = r9.mBusinessNavBar
            X.FP5 r0 = X.FP5.A00(r9, r4)
            r1.setSecondaryButtonOnclickListeners(r0)
        L_0x0122:
            X.6ST r2 = X.DbW.A0Y(r9)
            r9.A04 = r2
            android.content.Context r1 = r9.requireContext()
            r0 = 2131969783(0x7f1346f7, float:1.9576499E38)
            X.DbU.A18(r1, r2, r0)
            X.6ST r0 = r9.A04
            r0.setCancelable(r3)
            return
        L_0x0138:
            com.instagram.api.schemas.SMBPartnerType r0 = com.instagram.api.schemas.SMBPartnerType.FOOD_DELIVERY
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0164
            r0 = 2131973128(0x7f135408, float:1.9583283E38)
            goto L_0x005f
        L_0x0145:
            if (r0 == 0) goto L_0x014c
            r0 = 2131952413(0x7f13031d, float:1.9541268E38)
            goto L_0x005f
        L_0x014c:
            com.instagram.api.schemas.SMBPartnerType r0 = com.instagram.api.schemas.SMBPartnerType.FOOD_DELIVERY
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0159
            r0 = 2131952410(0x7f13031a, float:1.9541262E38)
            goto L_0x005f
        L_0x0159:
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x0164
            r0 = 2131952411(0x7f13031b, float:1.9541264E38)
            goto L_0x005f
        L_0x0164:
            r2 = 0
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.SupportServiceEditUrlFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
