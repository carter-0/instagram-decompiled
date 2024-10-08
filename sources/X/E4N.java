package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;

public final class E4N extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorRevshareAccountLevelMonetizationToggleFragment";
    public C46788DlI A00;
    public final AnonymousClass0eM A01 = C51791G2a.A00(this, 20);
    public final AnonymousClass0eM A02 = C51791G2a.A00(this, 21);
    public final AnonymousClass0eM A03 = C51791G2a.A00(this, 22);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        int i;
        0qQ.A0B(r4, 0);
        if (Dba.A00(this.A03) == 2) {
            i = 2131963599;
        } else {
            i = 2131963642;
            if (AnonymousClass7TF.A1Z(this.A01)) {
                i = 2131963692;
            }
        }
        r4.Eom(i);
        r4.Eu4(true);
    }

    public final String getModuleName() {
        return "creator_revshare_account_level_monetization_toggle";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.4DH} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r0 = 0
            r8 = r19
            X.0qQ.A0B(r8, r0)
            r9 = r18
            r0 = r20
            super.onViewCreated(r8, r0)
            X.0xx r1 = X.DbV.A0J(r9)
            r7 = 0
            r0 = 11
            X.C51647Fy6.A02(r9, r1, r0)
            X.0eM r0 = r9.A03
            int r1 = X.Dba.A00(r0)
            r2 = 2
            if (r1 != r2) goto L_0x00d3
            r1 = 2131963598(0x7f132ece, float:1.9563954E38)
            r4 = 2131963597(0x7f132ecd, float:1.9563952E38)
            X.0sn r13 = X.0sn.A00
            java.lang.String r10 = X.DbU.A0m(r9, r1)
            android.content.Context r3 = r9.requireContext()
            r1 = 2131237528(0x7f081a98, float:1.809131E38)
            android.graphics.drawable.Drawable r6 = r3.getDrawable(r1)
            java.lang.String r11 = r9.getString(r4)
            r12 = r7
            X.C49003Enf.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            X.0eM r1 = r9.A04
            X.0lg r5 = X.DbT.A0X(r1)
            X.0Tu r1 = X.0Tu.A06
            r3 = 36315133899574283(0x81046c000e0c0b, double:3.029175135173254E-306)
            boolean r1 = X.182.A06(r1, r5, r3)
            if (r1 == 0) goto L_0x0099
            r1 = 2131442385(0x7f0b3ad1, float:1.8506808E38)
            int r3 = X.Dbb.A03(r8, r1)
            r1 = 2131442384(0x7f0b3ad0, float:1.8506806E38)
            X.DbT.A1F(r8, r1, r3)
            r1 = 2131442382(0x7f0b3ace, float:1.8506802E38)
            X.DbT.A1F(r8, r1, r3)
        L_0x0065:
            r1 = 2131442382(0x7f0b3ace, float:1.8506802E38)
            android.view.View r6 = X.AnonymousClass7TF.A0F(r8, r1)
            android.widget.CompoundButton r6 = (android.widget.CompoundButton) r6
            r1 = 2131428901(0x7f0b0625, float:1.847946E38)
            android.view.View r5 = r8.findViewById(r1)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r5 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r5
            r1 = 2131956706(0x7f1313e2, float:1.9549975E38)
            java.lang.String r4 = X.DbU.A0m(r9, r1)
            r3 = 7
            X.FNn r1 = new X.FNn
            r1.<init>(r6, r9, r4, r3)
            r5.setPrimaryAction(r4, r1)
            r1 = 1
            r6.setChecked(r1)
            X.DlI r1 = r9.A00
            if (r1 != 0) goto L_0x0169
            java.lang.String r0 = "productOnboardingViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0099:
            r1 = 2131442385(0x7f0b3ad1, float:1.8506808E38)
            android.widget.TextView r3 = X.DbU.A0G(r8, r1)
            r1 = 2131963595(0x7f132ecb, float:1.9563948E38)
            r3.setText(r1)
            r1 = 2131442384(0x7f0b3ad0, float:1.8506806E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r8, r1)
            r1 = 2131963594(0x7f132eca, float:1.9563946E38)
            java.lang.String r6 = X.DbU.A0m(r9, r1)
            r3 = 2131963593(0x7f132ec9, float:1.9563944E38)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r5 = X.DbV.A0z(r9, r1, r3)
            android.content.Context r3 = r8.getContext()
            android.content.Context r1 = r9.getContext()
            int r1 = X.2Yu.A0D(r1)
            int r4 = r3.getColor(r1)
            r3 = 37
            goto L_0x015f
        L_0x00d3:
            X.0eM r5 = r9.A01
            boolean r1 = X.AnonymousClass7TF.A1Z(r5)
            r3 = 2131963641(0x7f132ef9, float:1.9564041E38)
            if (r1 == 0) goto L_0x00e1
            r3 = 2131963691(0x7f132f2b, float:1.9564143E38)
        L_0x00e1:
            boolean r1 = X.AnonymousClass7TF.A1Z(r5)
            r6 = 2131963638(0x7f132ef6, float:1.9564035E38)
            if (r1 == 0) goto L_0x00ed
            r6 = 2131963690(0x7f132f2a, float:1.956414E38)
        L_0x00ed:
            r4 = 2131963639(0x7f132ef7, float:1.9564037E38)
            r1 = 39
            X.FPD r11 = new X.FPD
            r11.<init>((java.lang.Object) r9, (int) r1)
            X.0sn r17 = X.0sn.A00
            java.lang.String r14 = X.DbU.A0m(r9, r3)
            android.content.Context r3 = r9.requireContext()
            r1 = 2131237528(0x7f081a98, float:1.809131E38)
            android.graphics.drawable.Drawable r10 = r3.getDrawable(r1)
            java.lang.String r15 = r9.getString(r6)
            java.lang.String r16 = r9.getString(r4)
            r12 = r8
            r13 = r9
            X.C49003Enf.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = 2131442385(0x7f0b3ad1, float:1.8506808E38)
            android.widget.TextView r4 = X.DbU.A0G(r8, r1)
            boolean r3 = X.AnonymousClass7TF.A1Z(r5)
            r1 = 2131963637(0x7f132ef5, float:1.9564033E38)
            if (r3 == 0) goto L_0x0128
            r1 = 2131963689(0x7f132f29, float:1.9564138E38)
        L_0x0128:
            r4.setText(r1)
            r1 = 2131442384(0x7f0b3ad0, float:1.8506806E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r8, r1)
            r4 = 2131963640(0x7f132ef8, float:1.956404E38)
            java.lang.String r6 = X.DbU.A0m(r9, r4)
            boolean r1 = X.AnonymousClass7TF.A1Z(r5)
            r3 = 2131963636(0x7f132ef4, float:1.956403E38)
            if (r1 == 0) goto L_0x0145
            r3 = 2131963688(0x7f132f28, float:1.9564136E38)
        L_0x0145:
            java.lang.String r1 = r9.getString(r4)
            java.lang.String r5 = X.DbV.A0z(r9, r1, r3)
            android.content.Context r3 = r8.getContext()
            android.content.Context r1 = r9.getContext()
            int r1 = X.2Yu.A0D(r1)
            int r4 = r3.getColor(r1)
            r3 = 36
        L_0x015f:
            X.ESx r1 = new X.ESx
            r1.<init>((X.E4N) r9, (int) r4, (int) r3)
            X.AnonymousClass7AV.A07(r1, r7, r6, r5)
            goto L_0x0065
        L_0x0169:
            X.2Fj r3 = r1.A02
            r1 = 31
            X.C50139FQw.A01(r9, r3, r5, r1)
            int r0 = X.Dba.A00(r0)
            r1 = 2131964000(0x7f133060, float:1.956477E38)
            if (r0 != r2) goto L_0x017c
            r1 = 2131963596(0x7f132ecc, float:1.956395E38)
        L_0x017c:
            r0 = 2131966721(0x7f133b01, float:1.9570288E38)
            java.lang.String r4 = X.DbU.A0m(r9, r0)
            java.lang.String r0 = r9.getString(r0)
            android.text.SpannableStringBuilder r3 = X.DbY.A0E(r9, r0, r1)
            android.content.Context r1 = r8.getContext()
            android.content.Context r0 = r5.getContext()
            int r0 = X.2Yu.A0D(r0)
            int r2 = r1.getColor(r0)
            r1 = 35
            X.ESx r0 = new X.ESx
            r0.<init>((X.E4N) r9, (int) r2, (int) r1)
            X.AnonymousClass7AV.A05(r3, r0, r4)
            r5.setFooterText(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E4N.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(E4N e4n, String str, String str2) {
        C50332FYn fYn = (C50332FYn) e4n.A02.getValue();
        C46788DlI dlI = e4n.A00;
        if (dlI != null) {
            String A012 = FCG.A01(dlI.A02());
            C46788DlI dlI2 = e4n.A00;
            if (dlI2 != null) {
                String A022 = FCG.A02(dlI2.A02());
                C46788DlI dlI3 = e4n.A00;
                if (dlI3 != null) {
                    fYn.A02(A012, A022, str, "igtv_ads_account_toggle", "creator_revshare_account_level_monetization_toggle", dlI3.A04(), str2);
                    return;
                }
            }
        }
        0qQ.A0F("productOnboardingViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean onBackPressed() {
        C46788DlI dlI = this.A00;
        if (dlI != null) {
            OnboardingRepository onboardingRepository = dlI.A05;
            C47184Drz drz = (C47184Drz) onboardingRepository.A00.get(dlI.A02());
            if (drz == null || drz.A00 == 0) {
                C46788DlI dlI2 = this.A00;
                if (dlI2 != null) {
                    C49004Eng.A00(this, dlI2);
                    return true;
                }
            } else {
                C46788DlI dlI3 = this.A00;
                if (dlI3 != null) {
                    dlI3.A05();
                    DbT.A1I(this);
                    return true;
                }
            }
        }
        0qQ.A0F("productOnboardingViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-243993200);
        E4N.super.onCreate(bundle);
        this.A00 = C47742EFc.A00(requireActivity(), this.A04);
        AnonymousClass0fD.A09(1802606165, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1029895705);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.igtv_account_level_monetization_toggle, viewGroup, false);
        A00(this, "impression", (String) null);
        AnonymousClass0fD.A09(286490844, A022);
        return inflate;
    }
}
