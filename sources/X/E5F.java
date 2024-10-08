package X;

import android.os.Bundle;

public final class E5F extends AnonymousClass4DH implements C51859G4r {
    public static final String __redex_internal_original_name = "PartialContactImportPromptFragment";
    public C311496cm A00;
    public C51950G8t A01;
    public String A02;
    public String A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final 1wn A05 = FXZ.A00(this, 44);

    public final String getModuleName() {
        return "partial_ci_nux_prompt";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1281325907);
        String string = requireArguments().getString("NUX_FLOW_TYPE");
        if (string == null) {
            string = "";
        }
        this.A03 = string;
        this.A01 = C49047EoR.A00(this);
        this.A00 = new C311496cm(this, AnonymousClass7TE.A0l(this.A04));
        E5F.super.onCreate(bundle);
        AnonymousClass0fD.A09(264352955, A022);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            r0 = -939382882(0xffffffffc802279e, float:-133278.47)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r1 = 0
            X.0qQ.A0B(r10, r1)
            r0 = 2131628125(0x7f0e105d, float:1.8883534E38)
            android.view.View r4 = r10.inflate(r0, r11, r1)
            r0 = 2131441424(0x7f0b3710, float:1.850486E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r4, r0)
            r0 = 4
            X.FPD.A00(r1, r0, r9)
            X.0eM r6 = r9.A04
            X.0lg r5 = X.DbT.A0X(r6)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36603802945852372(0x820af7000413d4, double:3.2117306024164676E-306)
            int r0 = X.DbS.A04(r2, r5, r0)
            r7 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0099
            if (r0 != r7) goto L_0x0054
            r0 = 2131437461(0x7f0b2795, float:1.8496821E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r4, r0)
            com.instagram.igds.components.headline.IgdsHeadline r2 = (com.instagram.igds.components.headline.IgdsHeadline) r2
            android.content.Context r1 = r9.getContext()
            if (r1 == 0) goto L_0x0097
            r0 = 2131969149(0x7f13447d, float:1.9575213E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x004a:
            r2.setHeadline((java.lang.CharSequence) r0)
            r2.setBody((java.lang.CharSequence) r5)
            java.lang.String r0 = "content_variant_1"
        L_0x0052:
            r9.A02 = r0
        L_0x0054:
            r0 = 2131429909(0x7f0b0a15, float:1.8481504E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r4, r0)
            r0 = 5
            X.FPD.A00(r1, r0, r9)
            r1 = 2131969142(0x7f134476, float:1.9575198E38)
            r0 = 2131969146(0x7f13447a, float:1.9575207E38)
            java.lang.String r8 = X.DbU.A0m(r9, r0)
            android.text.SpannableStringBuilder r2 = X.DbY.A0E(r9, r8, r1)
            r1 = 6
            X.DjE r0 = new X.DjE
            r0.<init>(r8, r9, r1)
            X.AnonymousClass7AV.A05(r2, r0, r8)
            r0 = 2131429225(0x7f0b0769, float:1.8480117E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r4, r0)
            com.instagram.igds.components.bulletcell.IgdsBulletCell r1 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r1
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r5, r0)
            com.instagram.igds.components.bulletcell.IgdsBulletCell.A00(r1, r5, r2)
            X.6cm r2 = r9.A00
            if (r2 != 0) goto L_0x009c
            java.lang.String r0 = "contactImportLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0097:
            r0 = r5
            goto L_0x004a
        L_0x0099:
            java.lang.String r0 = "content_variant_0"
            goto L_0x0052
        L_0x009c:
            java.lang.String r1 = r9.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r2.A01(r0, r5, r1)
            X.0lg r1 = X.DbT.A0X(r6)
            java.lang.String r0 = "partial_contact_import"
            X.C49938FFr.A01(r1, r0)
            r0 = -705259967(0xffffffffd5f69641, float:-3.38906495E13)
            X.AnonymousClass0fD.A09(r0, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E5F.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-2083637731);
        E5F.super.onStart();
        DbX.A0R(this.A04).A01(this.A05, FW8.class);
        AnonymousClass0fD.A09(-673366777, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1596271321);
        E5F.super.onStop();
        DbX.A0R(this.A04).A02(this.A05, FW8.class);
        AnonymousClass0fD.A09(-1425058208, A022);
    }
}
