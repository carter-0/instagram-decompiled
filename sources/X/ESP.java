package X;

import android.os.Bundle;
import android.os.Handler;
import com.instagram.urlhandlers.twofacsettingsexternal.TwoFacSettingsExternalUrlHandlerActivity;
import java.util.ArrayList;

public final class ESP extends C47518E6c implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacChooseSecurityMethodFragment";
    public Bundle A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(C51787G1w.A00);
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06 = Dba.A0i(this, 34);
    public final AnonymousClass0eM A07 = Dba.A0i(this, 35);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131975697);
        DbX.A1A(new FP3((Object) this, 34), DbV.A0K(), r4);
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: X.PR9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: X.Oak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: X.PR9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: X.PR9} */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r5 != false) goto L_0x0022;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.ESP r20) {
        /*
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r3 = r20
            android.os.Bundle r0 = r3.A00
            java.lang.String r13 = "twoFacResponseBundle"
            if (r0 == 0) goto L_0x02ef
            java.lang.String r4 = "is_two_factor_enabled"
            boolean r6 = r0.getBoolean(r4)
            android.os.Bundle r0 = r3.A00
            if (r0 == 0) goto L_0x02ef
            java.lang.String r7 = "is_totp_two_factor_enabled"
            boolean r5 = r0.getBoolean(r7)
            r1 = 0
            if (r6 != 0) goto L_0x0022
            r12 = 0
            if (r5 == 0) goto L_0x0023
        L_0x0022:
            r12 = 1
        L_0x0023:
            android.os.Bundle r0 = r3.A00
            if (r0 == 0) goto L_0x02ef
            boolean r0 = r0.getBoolean(r4)
            if (r0 == 0) goto L_0x006e
            android.os.Bundle r4 = r3.A00
            if (r4 == 0) goto L_0x02ef
            java.lang.String r0 = "has_reachable_email"
            boolean r0 = r4.getBoolean(r0)
            if (r0 != 0) goto L_0x006e
            r8 = 2131975627(0x7f135dcb, float:1.9588352E38)
            r4 = 40
            X.FP3 r0 = new X.FP3
            r0.<init>((java.lang.Object) r3, (int) r4)
            X.Oak r9 = new X.Oak
            r9.<init>(r0, r8)
            android.content.Context r8 = r3.requireContext()
            android.content.Context r4 = r3.getContext()
            r0 = 2130970211(0x7f040663, float:1.7549126E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r0 = r8.getColor(r0)
            r9.A01 = r0
            android.view.ViewGroup r0 = X.DbV.A0F(r3)
            r0.setPadding(r1, r1, r1, r1)
            android.view.ViewGroup r0 = X.DbV.A0F(r3)
            r0.setClipToPadding(r1)
            r2.add(r9)
        L_0x006e:
            r0 = 2131975657(0x7f135de9, float:1.9588412E38)
            if (r12 == 0) goto L_0x0076
            r0 = 2131975694(0x7f135e0e, float:1.9588488E38)
        L_0x0076:
            java.lang.String r0 = X.DbU.A0m(r3, r0)
            X.FAZ r8 = new X.FAZ
            r8.<init>((java.lang.CharSequence) r0)
            r0 = 1
            r8.A01 = r0
            r4 = 2131165203(0x7f070013, float:1.7944616E38)
            int r15 = X.Dbb.A07(r3, r4)
            int r16 = X.Dbb.A07(r3, r4)
            int r17 = X.Dbb.A07(r3, r4)
            r4 = 2131165218(0x7f070022, float:1.7944647E38)
            int r18 = X.Dbb.A07(r3, r4)
            r4 = 2131165203(0x7f070013, float:1.7944616E38)
            int r19 = X.Dbb.A07(r3, r4)
            int r20 = X.Dbb.A07(r3, r4)
            X.F0T r14 = new X.F0T
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r8.A05 = r14
            r9 = 2132018414(0x7f1404ee, float:1.9675134E38)
            r8.A03 = r9
            r2.add(r8)
            r8 = 2131975703(0x7f135e17, float:1.9588506E38)
            java.lang.String r8 = r3.getString(r8)
            android.text.SpannableStringBuilder r10 = X.DbS.A0C(r8)
            int r9 = X.Dbb.A06(r3)
            X.ESx r8 = new X.ESx
            r8.<init>((X.ESP) r3, (int) r9)
            X.Dba.A0x(r10, r8)
            r8 = 2131975655(0x7f135de7, float:1.9588408E38)
            java.lang.String r9 = X.DbU.A0m(r3, r8)
            r8 = 2131975656(0x7f135de8, float:1.958841E38)
            java.lang.String r8 = X.DbU.A0m(r3, r8)
            if (r12 != 0) goto L_0x00da
            r9 = r8
        L_0x00da:
            android.text.SpannableStringBuilder r9 = X.DbZ.A0B(r9, r10)
            X.FAZ r8 = new X.FAZ
            r8.<init>((java.lang.CharSequence) r9)
            r8.A01 = r0
            int r15 = X.Dbb.A07(r3, r4)
            int r17 = X.Dbb.A07(r3, r4)
            int r18 = X.Dbb.A07(r3, r4)
            int r19 = X.Dbb.A07(r3, r4)
            int r20 = X.Dbb.A07(r3, r4)
            X.F0T r4 = new X.F0T
            r14 = r4
            r16 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r8.A05 = r4
            r4 = 2132018413(0x7f1404ed, float:1.9675132E38)
            r8.A03 = r4
            r2.add(r8)
            if (r12 == 0) goto L_0x0122
            r4 = 2131975791(0x7f135e6f, float:1.9588684E38)
            X.DfA r8 = X.C46448DfA.A00(r4)
            r4 = 2131165190(0x7f070006, float:1.794459E38)
            int r4 = X.Dbb.A07(r3, r4)
            r8.A07 = r4
            r8.A03 = r4
            r2.add(r8)
        L_0x0122:
            android.os.Bundle r8 = r3.A00
            if (r8 == 0) goto L_0x02ef
            java.lang.String r4 = "is_eligible_for_multiple_totp"
            boolean r9 = r8.getBoolean(r4)
            android.os.Bundle r8 = r3.A00
            if (r8 == 0) goto L_0x02ef
            java.lang.String r4 = "eligible_for_trusted_notifications"
            boolean r11 = r8.getBoolean(r4)
            if (r9 == 0) goto L_0x02c4
            if (r5 == 0) goto L_0x02c4
            X.Oak r10 = new X.Oak
            r9 = 2131975737(0x7f135e39, float:1.9588575E38)
            r8 = 2131975739(0x7f135e3b, float:1.9588579E38)
            r4 = 2131975736(0x7f135e38, float:1.9588573E38)
            java.lang.String r7 = r3.getString(r4)
            r5 = 37
            X.FP3 r4 = new X.FP3
            r4.<init>((java.lang.Object) r3, (int) r5)
            r10.<init>((android.view.View.OnClickListener) r4, (java.lang.String) r7, (int) r9, (int) r8)
        L_0x0153:
            r2.add(r10)
            android.os.Bundle r5 = r3.A00
            if (r5 == 0) goto L_0x02ef
            java.lang.String r4 = "is_eligible_for_whatsapp_two_factor"
            boolean r4 = r5.getBoolean(r4)
            if (r4 == 0) goto L_0x01a9
            android.os.Bundle r5 = r3.A00
            if (r5 == 0) goto L_0x02ef
            java.lang.String r4 = "is_whatsapp_two_factor_enabled"
            boolean r9 = r5.getBoolean(r4)
            if (r9 == 0) goto L_0x02b8
            r8 = 2131975749(0x7f135e45, float:1.95886E38)
            r7 = 2131975751(0x7f135e47, float:1.9588603E38)
            android.os.Bundle r4 = r3.A00
            if (r4 == 0) goto L_0x02ef
            java.lang.String r4 = X.Dbb.A0Z(r4)
            java.lang.String r5 = "****"
            java.lang.String r4 = X.FGN.A00(r4)
            java.lang.String r4 = X.002.A0R(r5, r4)
            X.0qQ.A07(r4)
            java.lang.String r7 = X.DbV.A0z(r3, r4, r7)
        L_0x018d:
            X.0qQ.A0A(r7)
            X.FQ0 r4 = new X.FQ0
            r4.<init>(r0, r3, r9)
            X.PR9 r5 = X.DbS.A0f(r4, r8, r9)
            r5.A0A = r7
            r4 = 2131165218(0x7f070022, float:1.7944647E38)
            int r4 = X.Dbb.A07(r3, r4)
            r5.A05 = r4
            r5.A00 = r4
            r2.add(r5)
        L_0x01a9:
            if (r6 == 0) goto L_0x0295
            r4 = 2131975744(0x7f135e40, float:1.9588589E38)
            java.lang.String r9 = X.DbU.A0m(r3, r4)
            r6 = 2131975743(0x7f135e3f, float:1.9588587E38)
            android.os.Bundle r4 = r3.A00
            if (r4 == 0) goto L_0x02ef
            java.lang.String r4 = X.Dbb.A0Z(r4)
            java.lang.String r5 = "****"
            java.lang.String r4 = X.FGN.A00(r4)
            java.lang.String r4 = X.002.A0R(r5, r4)
            X.0qQ.A07(r4)
            java.lang.String r7 = X.DbV.A0z(r3, r4, r6)
            X.0qQ.A07(r7)
            r4 = 2131975736(0x7f135e38, float:1.9588573E38)
            java.lang.String r6 = r3.getString(r4)
            r5 = 36
            X.FP3 r4 = new X.FP3
            r4.<init>((java.lang.Object) r3, (int) r5)
            X.Oak r8 = new X.Oak
            r8.<init>((android.view.View.OnClickListener) r4, (java.lang.CharSequence) r9, (java.lang.CharSequence) r7, (java.lang.String) r6)
            r4 = 2131165218(0x7f070022, float:1.7944647E38)
            int r5 = X.Dbb.A07(r3, r4)
            r4 = 2131165190(0x7f070006, float:1.794459E38)
            int r4 = X.Dbb.A07(r3, r4)
            r8.A07 = r5
            r8.A02 = r4
        L_0x01f6:
            r2.add(r8)
            if (r11 == 0) goto L_0x021e
            if (r12 == 0) goto L_0x021e
            r4 = 35
            X.FP3 r8 = new X.FP3
            r8.<init>((java.lang.Object) r3, (int) r4)
            r7 = 2131975758(0x7f135e4e, float:1.9588617E38)
            r6 = 2131975755(0x7f135e4b, float:1.9588611E38)
            r4 = 0
            X.Oak r5 = new X.Oak
            r5.<init>((android.view.View.OnClickListener) r8, (java.lang.String) r4, (int) r7, (int) r6)
            r4 = 2131165218(0x7f070022, float:1.7944647E38)
            int r4 = X.Dbb.A07(r3, r4)
            r5.A07 = r4
            r5.A02 = r4
            r2.add(r5)
        L_0x021e:
            android.os.Bundle r5 = r3.A00
            if (r5 == 0) goto L_0x02ef
            java.lang.String r4 = "backup_codes"
            java.util.ArrayList r4 = r5.getStringArrayList(r4)
            if (r12 == 0) goto L_0x0291
            if (r4 == 0) goto L_0x026c
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x026c
            if (r11 != 0) goto L_0x026c
            r4 = 2131975617(0x7f135dc1, float:1.9588331E38)
            X.DfA r5 = X.C46448DfA.A00(r4)
            r4 = 2131165190(0x7f070006, float:1.794459E38)
            int r4 = X.Dbb.A07(r3, r4)
            r5.A07 = r4
            r5.A03 = r4
            r5.A0I = r0
            r2.add(r5)
            r0 = 38
            X.FP3 r7 = new X.FP3
            r7.<init>((java.lang.Object) r3, (int) r0)
            r6 = 2131975742(0x7f135e3e, float:1.9588585E38)
            r5 = 2131975741(0x7f135e3d, float:1.9588583E38)
            r0 = 0
            X.Oak r4 = new X.Oak
            r4.<init>((android.view.View.OnClickListener) r7, (java.lang.String) r0, (int) r6, (int) r5)
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = X.Dbb.A07(r3, r0)
            r4.A07 = r0
            r4.A02 = r1
            r2.add(r4)
        L_0x026c:
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0291
            r0 = 39
            X.FP3 r6 = new X.FP3
            r6.<init>((java.lang.Object) r3, (int) r0)
            r5 = 2131975747(0x7f135e43, float:1.9588595E38)
            r4 = 2131975746(0x7f135e42, float:1.9588593E38)
            r0 = 0
            X.Oak r1 = new X.Oak
            r1.<init>((android.view.View.OnClickListener) r6, (java.lang.String) r0, (int) r5, (int) r4)
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = X.Dbb.A07(r3, r0)
            r1.A07 = r0
            r1.A02 = r0
            r2.add(r1)
        L_0x0291:
            r3.setItems(r2)
            return
        L_0x0295:
            r7 = 2131975744(0x7f135e40, float:1.9588589E38)
            X.FQL r6 = X.FQL.A00
            r5 = 13
            X.FdS r4 = new X.FdS
            r4.<init>(r3, r5)
            X.PR9 r8 = new X.PR9
            r8.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r6, (X.C358618bC) r4, (int) r7, (boolean) r1)
            r4 = 2131975745(0x7f135e41, float:1.958859E38)
            r8.A02 = r4
            r4 = 2131165218(0x7f070022, float:1.7944647E38)
            int r4 = X.Dbb.A07(r3, r4)
            r8.A05 = r4
            r8.A00 = r4
            goto L_0x01f6
        L_0x02b8:
            r8 = 2131975748(0x7f135e44, float:1.9588597E38)
            r4 = 2131975750(0x7f135e46, float:1.9588601E38)
            java.lang.String r7 = r3.getString(r4)
            goto L_0x018d
        L_0x02c4:
            android.os.Bundle r4 = r3.A00
            if (r4 == 0) goto L_0x02ef
            boolean r8 = r4.getBoolean(r7)
            r7 = 2131975740(0x7f135e3c, float:1.958858E38)
            X.FQ3 r4 = new X.FQ3
            r4.<init>(r3, r8, r6, r5)
            X.PR9 r10 = X.DbS.A0f(r4, r7, r8)
            r4 = 2131975738(0x7f135e3a, float:1.9588577E38)
            if (r5 == 0) goto L_0x02e0
            r4 = 2131975739(0x7f135e3b, float:1.9588579E38)
        L_0x02e0:
            r10.A02 = r4
            r4 = 2131165218(0x7f070022, float:1.7944647E38)
            int r4 = X.Dbb.A07(r3, r4)
            r10.A05 = r4
            r10.A00 = r4
            goto L_0x0153
        L_0x02ef:
            X.0qQ.A0F(r13)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ESP.A06(X.ESP):void");
    }

    public final boolean onBackPressed() {
        boolean z = false;
        if (requireActivity() instanceof TwoFacSettingsExternalUrlHandlerActivity) {
            DbT.A1K(this);
            return false;
        }
        Bundle bundle = this.A00;
        if (bundle != null) {
            boolean z2 = bundle.getBoolean("is_two_factor_enabled");
            Bundle bundle2 = this.A00;
            if (bundle2 != null) {
                boolean z3 = bundle2.getBoolean("is_totp_two_factor_enabled");
                if (z2 || z3) {
                    z = true;
                }
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putBoolean(Dbq.A05(326, 15, 101), z);
                DbV.A0I(this).A0z(Dbq.A05(413, 26, 100), A0a);
                getParentFragmentManager().A0y(Dbq.A05(525, 24, 26), 1);
                return true;
            }
        }
        0qQ.A0F("twoFacResponseBundle");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-377397070);
        super.onCreate(bundle);
        this.A00 = requireArguments();
        Dbb.A1N(this);
        0lg A0X = DbT.A0X(this.A05);
        Bundle bundle2 = this.A00;
        if (bundle2 != null) {
            boolean z = bundle2.getBoolean("is_two_factor_enabled");
            Bundle bundle3 = this.A00;
            if (bundle3 != null) {
                boolean z2 = bundle3.getBoolean("is_totp_two_factor_enabled");
                0qQ.A0B(A0X, 0);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(C49852F9r.A01, A0X), "instagram_two_fac_setup_view");
                Dbc.A0W(A0e);
                A0e.AAJ("view", "choose_method");
                A0e.A7p("sms", Boolean.valueOf(z));
                A0e.A7p("totp", Boolean.valueOf(z2));
                A0e.Cgf();
                AnonymousClass0fD.A09(1463857758, A022);
                return;
            }
        }
        0qQ.A0F("twoFacResponseBundle");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-574363441);
        super.onResume();
        A06(this);
        AnonymousClass0fD.A09(562378047, A022);
    }

    public final void onStart() {
        ArrayList<String> stringArrayList;
        int A022 = AnonymousClass0fD.A02(-393352943);
        ESP.super.onStart();
        Bundle bundle = this.A00;
        if (bundle == null) {
            0qQ.A0F("twoFacResponseBundle");
            throw AnonymousClass00P.createAndThrow();
        }
        boolean z = false;
        if (bundle.getBoolean("direct_launch_backup_codes") && !this.A02 && (stringArrayList = bundle.getStringArrayList("backup_codes")) != null && !stringArrayList.isEmpty()) {
            this.A02 = true;
            this.A01 = true;
            ((Handler) this.A04.getValue()).post((Runnable) this.A06.getValue());
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("trusted_devices");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            z = true;
        }
        this.A03 = !z;
        AnonymousClass0fD.A09(-1644764771, A022);
    }
}
