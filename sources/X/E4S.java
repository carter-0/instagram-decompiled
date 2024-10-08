package X;

import android.os.Bundle;
import android.view.View;
import java.util.AbstractCollection;

public final class E4S extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PartnerProgramWelcomeFragment";
    public C46788DlI A00;
    public final AnonymousClass0eM A01 = C51791G2a.A00(this, 30);
    public final AnonymousClass0eM A02 = C51793G2c.A00(this, 38);
    public final AnonymousClass0eM A03 = C51791G2a.A00(this, 31);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Eom(A01().A01());
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean onBackPressed() {
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C51645Fy4.A01(this, DbV.A0J(this), 17);
    }

    public static void A00(CharSequence charSequence, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new FAA(charSequence, i));
    }

    public final C46788DlI A01() {
        C46788DlI dlI = this.A00;
        if (dlI != null) {
            return dlI;
        }
        0qQ.A0F("productOnboardingViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A02(String str, String str2, String str3) {
        ((C50332FYn) this.A02.getValue()).A02(FCG.A01(A01().A02()), FCG.A02(A01().A02()), str, str2, __redex_internal_original_name, A01().A04(), str3);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-690850485);
        E4S.super.onCreate(bundle);
        C46788DlI A002 = C47742EFc.A00(requireActivity(), this.A04);
        0qQ.A0B(A002, 0);
        this.A00 = A002;
        AnonymousClass0fD.A09(-2097010678, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01ba, code lost:
        if (r2 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x00bd, code lost:
        if (r2 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r19, android.view.ViewGroup r20, android.os.Bundle r21) {
        /*
            r18 = this;
            r0 = -792008366(0xffffffffd0cae952, float:-2.72343081E10)
            int r1 = X.AnonymousClass0fD.A02(r0)
            r0 = 0
            r4 = r19
            X.0qQ.A0B(r4, r0)
            r2 = 2131624700(0x7f0e02fc, float:1.8876587E38)
            r3 = r20
            android.view.View r8 = r4.inflate(r2, r3, r0)
            r9 = r18
            X.0eM r2 = r9.A03
            int r4 = X.Dba.A00(r2)
            r3 = 2
            X.0qQ.A0A(r8)
            X.0eM r2 = r9.A04
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            com.instagram.monetization.repository.MonetizationRepository r2 = X.AnonymousClass2o3.A00(r2)
            if (r4 != r3) goto L_0x0110
            java.lang.String r3 = r2.A00
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r2 = com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting.TOGGLED_ON
            java.lang.String r2 = r2.A00
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x01d0
            r2 = 2131963630(0x7f132eee, float:1.9564019E38)
            java.lang.String r14 = X.DbU.A0m(r9, r2)
            r2 = 2131963629(0x7f132eed, float:1.9564017E38)
            java.lang.String r15 = X.DbU.A0m(r9, r2)
            android.content.Context r3 = r9.requireContext()
            r2 = 2131237558(0x7f081ab6, float:1.809137E38)
            android.graphics.drawable.Drawable r10 = r3.getDrawable(r2)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            r2 = 2131963616(0x7f132ee0, float:1.956399E38)
            java.lang.String r3 = r9.getString(r2)
            r11 = 0
            r2 = 2131238113(0x7f081ce1, float:1.8092496E38)
            A00(r3, r7, r2)
            r2 = 2131963615(0x7f132edf, float:1.9563988E38)
            java.lang.String r3 = r9.getString(r2)
            r2 = 2131238555(0x7f081e9b, float:1.8093392E38)
            A00(r3, r7, r2)
            r2 = 2131963614(0x7f132ede, float:1.9563986E38)
            java.lang.String r3 = r9.getString(r2)
            r2 = 2131238469(0x7f081e45, float:1.8093218E38)
            A00(r3, r7, r2)
            r2 = 2131963647(0x7f132eff, float:1.9564053E38)
            java.lang.String r6 = X.DbU.A0m(r9, r2)
            r2 = 2131963613(0x7f132edd, float:1.9563984E38)
            android.text.SpannableStringBuilder r5 = X.DbY.A0E(r9, r6, r2)
            int r4 = X.Dbb.A06(r9)
            r3 = 39
            X.ESx r2 = new X.ESx
            r2.<init>((X.E4S) r9, (int) r4, (int) r3)
            X.AnonymousClass7AV.A05(r5, r2, r6)
            r2 = 2131238802(0x7f081f92, float:1.8093893E38)
            A00(r5, r7, r2)
            r12 = r8
            r13 = r9
            r16 = r11
            r17 = r7
            X.C49003Enf.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            r2 = 2131963617(0x7f132ee1, float:1.9563992E38)
            java.lang.String r3 = X.DbU.A0m(r9, r2)
            X.0qQ.A0B(r8, r0)
            r2 = 2131428901(0x7f0b0625, float:1.847946E38)
            android.view.View r2 = r8.findViewById(r2)
            X.61u r2 = (X.C3021461u) r2
            if (r2 == 0) goto L_0x00c9
        L_0x00bf:
            r5 = 12
            X.FOr r4 = new X.FOr
            r4.<init>((java.lang.String) r3, (java.lang.Object) r9, (int) r5)
            r2.setSecondaryAction(r3, r4)
        L_0x00c9:
            r2 = 2131960992(0x7f1324a0, float:1.9558668E38)
            java.lang.String r3 = X.DbU.A0m(r9, r2)
            X.0qQ.A0B(r8, r0)
            r0 = 2131428901(0x7f0b0625, float:1.847946E38)
            android.view.View r5 = r8.findViewById(r0)
            X.61u r5 = (X.C3021461u) r5
            if (r5 == 0) goto L_0x0101
            r5.setPrimaryActionText(r3)
            r2 = 11
            X.FOr r0 = new X.FOr
            r0.<init>((java.lang.String) r3, (java.lang.Object) r9, (int) r2)
            r5.setPrimaryActionOnClickListener(r0)
            X.DlI r0 = r9.A01()
            X.2Fj r4 = r0.A02
            X.07Z r3 = r9.getViewLifecycleOwner()
            r0 = 24
            X.MP7 r2 = new X.MP7
            r2.<init>(r5, r0)
            r0 = 22
            X.DbV.A1F(r3, r4, r2, r0)
        L_0x0101:
            r3 = 0
            java.lang.String r2 = "impression"
            java.lang.String r0 = "welcome"
            r9.A02(r2, r0, r3)
            r0 = 899129192(0x35979f68, float:1.129677E-6)
            X.AnonymousClass0fD.A09(r0, r1)
            return r8
        L_0x0110:
            java.lang.String r3 = r2.A01
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r2 = com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting.TOGGLED_ON
            java.lang.String r2 = r2.A00
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x01be
            r2 = 2131963664(0x7f132f10, float:1.9564088E38)
            java.lang.String r14 = X.DbU.A0m(r9, r2)
            X.0eM r4 = r9.A01
            boolean r3 = X.AnonymousClass7TF.A1Z(r4)
            r2 = 2131963663(0x7f132f0f, float:1.9564086E38)
            if (r3 == 0) goto L_0x0131
            r2 = 2131963704(0x7f132f38, float:1.9564169E38)
        L_0x0131:
            java.lang.String r15 = r9.getString(r2)
            X.0qQ.A0A(r15)
            android.content.Context r3 = r9.requireContext()
            r2 = 2131237558(0x7f081ab6, float:1.809137E38)
            android.graphics.drawable.Drawable r10 = r3.getDrawable(r2)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            r2 = 2131963650(0x7f132f02, float:1.956406E38)
            java.lang.String r3 = r9.getString(r2)
            r11 = 0
            r2 = 2131238538(0x7f081e8a, float:1.8093358E38)
            A00(r3, r6, r2)
            boolean r3 = X.AnonymousClass7TF.A1Z(r4)
            r2 = 2131963649(0x7f132f01, float:1.9564057E38)
            if (r3 == 0) goto L_0x0161
            r2 = 2131963697(0x7f132f31, float:1.9564155E38)
        L_0x0161:
            java.lang.String r3 = r9.getString(r2)
            r2 = 2131238555(0x7f081e9b, float:1.8093392E38)
            A00(r3, r6, r2)
            r2 = 2131963648(0x7f132f00, float:1.9564055E38)
            java.lang.String r3 = r9.getString(r2)
            r2 = 2131238469(0x7f081e45, float:1.8093218E38)
            A00(r3, r6, r2)
            r2 = 2131963647(0x7f132eff, float:1.9564053E38)
            java.lang.String r7 = X.DbU.A0m(r9, r2)
            r3 = 2131963646(0x7f132efe, float:1.9564051E38)
            java.lang.String r2 = r9.getString(r2)
            android.text.SpannableStringBuilder r5 = X.DbY.A0E(r9, r2, r3)
            int r4 = X.Dbb.A06(r9)
            r3 = 40
            X.ESx r2 = new X.ESx
            r2.<init>((X.E4S) r9, (int) r4, (int) r3)
            X.AnonymousClass7AV.A05(r5, r2, r7)
            r2 = 2131238802(0x7f081f92, float:1.8093893E38)
            A00(r5, r6, r2)
            r12 = r8
            r13 = r9
            r16 = r11
            r17 = r6
            X.C49003Enf.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            r2 = 2131963617(0x7f132ee1, float:1.9563992E38)
            java.lang.String r3 = X.DbU.A0m(r9, r2)
            X.0qQ.A0B(r8, r0)
            r2 = 2131428901(0x7f0b0625, float:1.847946E38)
            android.view.View r2 = r8.findViewById(r2)
            X.61u r2 = (X.C3021461u) r2
            if (r2 == 0) goto L_0x00c9
            goto L_0x00bf
        L_0x01be:
            X.0eM r2 = r9.A01
            boolean r2 = X.AnonymousClass7TF.A1Z(r2)
            r4 = 2131963665(0x7f132f11, float:1.956409E38)
            if (r2 == 0) goto L_0x01cc
            r4 = 2131963705(0x7f132f39, float:1.956417E38)
        L_0x01cc:
            r2 = 2131963664(0x7f132f10, float:1.9564088E38)
            goto L_0x01d6
        L_0x01d0:
            r4 = 2131963631(0x7f132eef, float:1.956402E38)
            r2 = 2131963632(0x7f132ef0, float:1.9564023E38)
        L_0x01d6:
            r7 = 0
            X.0sn r13 = X.0sn.A00
            java.lang.String r10 = X.DbU.A0m(r9, r2)
            android.content.Context r3 = r9.requireContext()
            r2 = 2131237558(0x7f081ab6, float:1.809137E38)
            android.graphics.drawable.Drawable r6 = r3.getDrawable(r2)
            java.lang.String r11 = r9.getString(r4)
            r12 = r7
            X.C49003Enf.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E4S.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
