package X;

import android.os.Bundle;

public final class ES1 extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CaptionOptionsFragment";
    public String A00;
    public boolean A01;
    public final String A02 = "caption_options";
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        if (!this.A01) {
            AnonymousClass0eM r1 = this.A03;
            if (AnonymousClass3WS.A04(AnonymousClass7TE.A0l(r1)) || AnonymousClass3WS.A02(AnonymousClass7TE.A0l(r1))) {
                r3.Eom(2131973372);
            }
        }
    }

    public final int getBottomPadding() {
        return 0;
    }

    public final int getTopPadding() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r3 != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        if (r3 != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            super.onViewCreated(r8, r9)
            boolean r5 = r7.A01
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            X.0eM r1 = r7.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            boolean r6 = X.AnonymousClass3WS.A04(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            boolean r3 = X.AnonymousClass3WS.A02(r0)
            if (r6 != 0) goto L_0x0026
            r2 = 2131954776(0x7f130c58, float:1.954606E38)
            if (r3 == 0) goto L_0x0029
        L_0x0026:
            r2 = 2131954769(0x7f130c51, float:1.9546047E38)
        L_0x0029:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            boolean r1 = X.AnonymousClass3WP.A07(r0)
            r0 = 3
            X.C47518E6c.A05(r7, r4, r0, r2, r1)
            if (r6 != 0) goto L_0x003c
            r0 = 2131954767(0x7f130c4f, float:1.9546043E38)
            if (r3 == 0) goto L_0x003f
        L_0x003c:
            r0 = 2131954770(0x7f130c52, float:1.9546049E38)
        L_0x003f:
            java.lang.String r1 = r7.getString(r0)
            X.0qQ.A0A(r1)
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x0058
            X.FGF r0 = new X.FGF
            r0.<init>((java.lang.CharSequence) r1)
        L_0x004f:
            r4.add(r0)
            if (r5 == 0) goto L_0x0075
            r7.setBottomSheetMenuItems(r4)
            return
        L_0x0058:
            r0 = 2131964896(0x7f1333e0, float:1.9566587E38)
            java.lang.String r3 = X.DbU.A0m(r7, r0)
            android.text.SpannableStringBuilder r2 = X.DbZ.A0B(r1, r3)
            r1 = 2
            X.Dj8 r0 = new X.Dj8
            r0.<init>(r7, r1)
            X.0qQ.A0A(r2)
            X.AnonymousClass7AV.A05(r2, r0, r3)
            X.FGF r0 = new X.FGF
            r0.<init>((android.text.SpannableStringBuilder) r2)
            goto L_0x004f
        L_0x0075:
            r7.setItems(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ES1.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean isElevated() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1638379019);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        requireArguments.getBoolean("should_show_captions_toggle_description");
        this.A01 = requireArguments.getBoolean("is_surface_elevated");
        String string = requireArguments.getString("entrypoint");
        C320236s2.A03(requireArguments, string, "entrypoint");
        this.A00 = string;
        requireArguments.getString("media_id");
        requireArguments.getBoolean("media_has_caption_translations");
        requireArguments.getBoolean("media_has_sticker_dubbing");
        requireArguments.getBoolean("media_has_dubbing");
        AnonymousClass0fD.A09(-279220168, A022);
    }
}
