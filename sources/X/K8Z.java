package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs;

public final class K8Z extends UZ3 {
    public static final String __redex_internal_original_name = "BrandedContentConsolidatedDisclosureFragment";
    public C231002qi A00;
    public String A01;
    public final 1wn A02;
    public final AnonymousClass2qU A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(MMG.A00(this, 11));
    public final AnonymousClass0eM A05;

    public final X8a A0B() {
        return new C65612Lwn(this, 1);
    }

    public final VWN A0C() {
        return new VWN(requireContext(), (FragmentActivity) null, this, A06(), new C65619Lwu(this, 1), new KXN(this, 1), (Integer) null, (String) null, false, false, false);
    }

    public final String A0D() {
        return "branded_content_add_partner_page";
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00a7, code lost:
        X.DbX.A1G(r6, X.C49946FGa.A02(r5, r4, __redex_internal_original_name, r1));
        r7 = r2.getValue();
        r9 = X.07U.A04;
        r6 = getViewLifecycleOwner();
        X.AnonymousClass7TE.A1Z(new X.MHG(r6, r7, r8, r9, (X.AnonymousClass4D7) null, 27), X.AnonymousClass07a.A00(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x00c6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00ec, code lost:
        if (r0 == false) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            r17 = this;
            r2 = 0
            r3 = r18
            X.0qQ.A0B(r3, r2)
            r8 = r17
            r0 = r19
            super.onViewCreated(r3, r0)
            X.1YN r11 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r14 = r8.A06()
            com.instagram.quickpromotion.intf.QuickPromotionSlot r16 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0C
            X.AnonymousClass2bO.A00()
            r10 = 0
            r0 = 1
            X.LvT r1 = new X.LvT
            r1.<init>(r8, r0)
            X.LvW r0 = X.LvW.A00
            X.2bW r15 = X.2bV.A02(r1, r0)
            r12 = r8
            r13 = r8
            X.2qi r1 = r11.A01(r12, r13, r14, r15, r16)
            r8.A00 = r1
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0F
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            X.0qQ.A07(r0)
            r1.AVg(r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r8.A07()
            java.lang.String r0 = r8.A01
            java.lang.String r7 = "live"
            boolean r0 = X.0qQ.A0K(r0, r7)
            int r0 = X.DbW.A00(r0)
            r1.setVisibility(r0)
            r0 = 2131427505(0x7f0b00b1, float:1.8476628E38)
            android.view.View r4 = X.JTS.A0C(r3, r0)
            r0 = 2131427559(0x7f0b00e7, float:1.8476738E38)
            android.widget.TextView r3 = X.DbU.A0G(r4, r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131952328(0x7f1302c8, float:1.9541096E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            r3.setText(r0)
            r0 = 2131427512(0x7f0b00b8, float:1.8476642E38)
            android.view.View r1 = r4.requireViewById(r0)
            r0 = 68
            X.LYC.A00(r1, r0, r8)
            r0 = 2131436967(0x7f0b25a7, float:1.849582E38)
            android.view.View r1 = r4.requireViewById(r0)
            r0 = 69
            X.LYC.A00(r1, r0, r8)
            android.widget.TextView r6 = r8.A05()
            r6.setVisibility(r2)
            androidx.fragment.app.FragmentActivity r5 = r8.requireActivity()
            com.instagram.common.session.UserSession r4 = r8.A06()
            java.lang.String r3 = "BrandedContentConsolidatedDisclosureFragment"
            X.0eM r2 = r8.A05
            java.lang.Object r0 = r2.getValue()
            X.JjM r0 = (X.C60318JjM) r0
            java.lang.String r1 = r0.A05
            int r0 = r1.hashCode()
            switch(r0) {
                case 3230752: goto L_0x00d1;
                case 3322092: goto L_0x00db;
                case 3496474: goto L_0x00e3;
                case 109770997: goto L_0x00c7;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            r1 = 2131954133(0x7f1309d5, float:1.9544757E38)
        L_0x00a7:
            android.text.SpannableStringBuilder r0 = X.C49946FGa.A02(r5, r4, r3, r1)
            X.DbX.A1G(r6, r0)
            java.lang.Object r7 = r2.getValue()
            X.07U r9 = X.07U.A04
            X.07Z r6 = r8.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r6)
            r11 = 27
            X.MHG r5 = new X.MHG
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.AnonymousClass7TE.A1Z(r5, r0)
            return
        L_0x00c7:
            java.lang.String r0 = "story"
            boolean r0 = r1.equals(r0)
            r1 = 2131954137(0x7f1309d9, float:1.9544765E38)
            goto L_0x00ec
        L_0x00d1:
            java.lang.String r0 = "igtv"
            boolean r0 = r1.equals(r0)
            r1 = 2131954134(0x7f1309d6, float:1.9544759E38)
            goto L_0x00ec
        L_0x00db:
            boolean r0 = r1.equals(r7)
            r1 = 2131954135(0x7f1309d7, float:1.954476E38)
            goto L_0x00ec
        L_0x00e3:
            java.lang.String r0 = "reel"
            boolean r0 = r1.equals(r0)
            r1 = 2131954136(0x7f1309d8, float:1.9544763E38)
        L_0x00ec:
            if (r0 != 0) goto L_0x00a7
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K8Z.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.2qU] */
    public K8Z() {
        MMG A002 = MMG.A00(this, 15);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, MMG.A00(MMG.A00(this, 12), 13));
        this.A05 = DbS.A0I(MMG.A00(A003, 14), A002, new C58716IwP(38, (Object) null, (Object) A003), DbS.A0z(C60318JjM.class));
        this.A01 = "feed";
        AnonymousClass2bO.A00();
        this.A03 = new Object();
        this.A02 = C64698LgT.A00(this, 1);
    }

    public final int A04() {
        return R.layout.branded_content_consildated_search_base;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1932216321);
        super.onCreate(bundle);
        this.A01 = ((BrandedContentDisclosureArgs) this.A04.getValue()).A03;
        AnonymousClass0fD.A09(-96309732, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-352874927);
        super.onResume();
        AnonymousClass1Nd.A00(A06()).A02(this.A02, C64643LfV.class);
        AnonymousClass0fD.A09(646805000, A022);
    }
}
