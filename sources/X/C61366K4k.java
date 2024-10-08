package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.K4k  reason: case insensitive filesystem */
public final class C61366K4k extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ClipsEditMetadataAdvancedSettingsFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131952518);
    }

    public final String getModuleName() {
        return "clips_editor_advanced_settings";
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [com.instagram.common.accessibility.AccessibleTextView, android.widget.TextView] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0155, code lost:
        if (X.AnonymousClass7TE.A1a(r0) != false) goto L_0x0157;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            r5 = 0
            X.0qQ.A0B(r14, r5)
            super.onViewCreated(r14, r15)
            r0 = 2131427423(0x7f0b005f, float:1.8476462E38)
            android.view.ViewGroup r7 = X.DbX.A0I(r14, r0)
            r7.setVisibility(r5)
            android.content.Context r0 = r13.requireContext()
            r6 = 0
            com.instagram.igds.components.textcell.IgdsListCell r4 = new com.instagram.igds.components.textcell.IgdsListCell
            r4.<init>(r0, r6)
            r0 = 2131954778(0x7f130c5a, float:1.9546065E38)
            X.Dba.A14(r13, r4, r0)
            X.Njo r3 = X.C69349Njo.TYPE_SWITCH
            r4.setTextCellType(r3)
            X.0eM r2 = r13.A01
            X.6rJ r1 = X.C60296Jiu.A00(r2)
            java.lang.String r0 = "IS_CAPTIONS_TRANSLATIONS_TOGGLE_ENABLED"
            java.lang.Object r0 = r1.A00(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x01f8
            boolean r0 = r0.booleanValue()
        L_0x003a:
            r4.setChecked(r0)
            r0 = 21
            X.LZJ.A00(r4, r13, r0)
            android.content.Context r0 = r13.requireContext()
            com.instagram.igds.components.textcell.IgdsListCell r8 = new com.instagram.igds.components.textcell.IgdsListCell
            r8.<init>(r0, r6)
            r0 = 2131954772(0x7f130c54, float:1.9546053E38)
            X.Dba.A14(r13, r8, r0)
            r8.setTextCellType(r3)
            X.6rJ r1 = X.C60296Jiu.A00(r2)
            java.lang.String r0 = "IS_CAPTIONS_ENABLED"
            java.lang.Object r0 = r1.A00(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x01e6
            boolean r0 = r0.booleanValue()
        L_0x0066:
            r8.setChecked(r0)
            r1 = 4
            X.LZI r0 = new X.LZI
            r0.<init>(r1, r13, r4)
            r8.A0D(r0)
            r7.addView(r8)
            android.content.Context r0 = r13.requireContext()
            com.instagram.igds.components.textcell.IgdsFooterCell r11 = new com.instagram.igds.components.textcell.IgdsFooterCell
            r11.<init>(r0, r6)
            r0 = 2131955307(0x7f130e6b, float:1.9547138E38)
            java.lang.String r1 = X.DbU.A0m(r13, r0)
            r0 = 2131964896(0x7f1333e0, float:1.9566587E38)
            java.lang.String r10 = X.DbU.A0m(r13, r0)
            android.text.SpannableStringBuilder r8 = X.DbZ.A0B(r1, r10)
            int r1 = X.Dbb.A04(r13)
            r9 = 22
            X.Kaz r0 = new X.Kaz
            r0.<init>((X.C61366K4k) r13, (int) r1)
            X.0qQ.A0A(r8)
            X.AnonymousClass7AV.A05(r8, r0, r10)
            r11.A00(r8)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            X.0qQ.A07(r1)
            com.instagram.common.accessibility.AccessibleTextView r0 = r11.A02
            r0.setMovementMethod(r1)
            r7.addView(r11)
            X.0eM r10 = r13.A00
            X.0lg r7 = X.DbT.A0X(r10)
            X.0Tu r11 = X.0Tu.A05
            r0 = 36322920674503337(0x810b8100022aa9, double:3.0340995229932135E-306)
            boolean r7 = X.182.A06(r11, r7, r0)
            if (r7 != 0) goto L_0x00da
            X.0lg r7 = X.DbT.A0X(r10)
            boolean r7 = X.JTQ.A1Q(r11, r7)
            if (r7 != 0) goto L_0x00da
            X.0lg r7 = X.DbT.A0X(r10)
            boolean r7 = X.JTQ.A1R(r11, r7)
            if (r7 == 0) goto L_0x0177
        L_0x00da:
            r7 = 2131443167(0x7f0b3ddf, float:1.8508394E38)
            android.view.ViewGroup r8 = X.DbX.A0I(r14, r7)
            r7 = 0
            r8.setVisibility(r5)
            X.0lg r12 = X.DbT.A0X(r10)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x0108
            r8.addView(r4)
            android.content.Context r0 = r13.requireContext()
            com.instagram.igds.components.textcell.IgdsFooterCell r1 = new com.instagram.igds.components.textcell.IgdsFooterCell
            r1.<init>(r0, r6)
            r0 = 2131955961(0x7f1310f9, float:1.9548464E38)
            java.lang.String r0 = X.DbU.A0m(r13, r0)
            r1.A00(r0)
            r8.addView(r1)
        L_0x0108:
            X.0lg r0 = X.DbT.A0X(r10)
            boolean r0 = X.JTQ.A1Q(r11, r0)
            if (r0 != 0) goto L_0x011c
            X.0lg r0 = X.DbT.A0X(r10)
            boolean r0 = X.JTQ.A1R(r11, r0)
            if (r0 == 0) goto L_0x0177
        L_0x011c:
            X.6rJ r1 = X.C60296Jiu.A00(r2)
            java.lang.String r0 = "IS_STICKER_TRANSLATIONS_TOGGLE_ENABLED"
            java.lang.Object r0 = r1.A00(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x01d4
            boolean r0 = r0.booleanValue()
        L_0x012e:
            android.content.Context r1 = r13.requireContext()
            com.instagram.igds.components.textcell.IgdsListCell r4 = new com.instagram.igds.components.textcell.IgdsListCell
            r4.<init>(r1, r6)
            r1 = 2131956922(0x7f1314ba, float:1.9550413E38)
            X.Dba.A14(r13, r4, r1)
            r4.setTextCellType(r3)
            r4.setChecked(r0)
            if (r0 != 0) goto L_0x0157
            X.6rJ r1 = X.C60296Jiu.A00(r2)
            java.lang.String r0 = "REEL_CONTAINS_STICKER_TRANSLATIONS"
            java.lang.Object r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x020f
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0158
        L_0x0157:
            r7 = 1
        L_0x0158:
            r4.setEnabled(r7)
            X.LZJ.A00(r4, r13, r9)
            r8.addView(r4)
            android.content.Context r0 = r13.requireContext()
            com.instagram.igds.components.textcell.IgdsFooterCell r1 = new com.instagram.igds.components.textcell.IgdsFooterCell
            r1.<init>(r0, r6)
            r0 = 2131956921(0x7f1314b9, float:1.9550411E38)
            java.lang.String r0 = X.DbU.A0m(r13, r0)
            r1.A00(r0)
            r8.addView(r1)
        L_0x0177:
            X.6rJ r1 = X.C60296Jiu.A00(r2)
            java.lang.String r0 = "IS_TRIAL_REEL"
            java.lang.Object r0 = r1.A00(r0)
            boolean r0 = X.DbX.A1a(r0)
            if (r0 != 0) goto L_0x01d3
            X.6rJ r1 = X.C60296Jiu.A00(r2)
            java.lang.String r0 = "IS_EXCLUSIVE_CONTENT"
            java.lang.Object r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x020a
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x01d3
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r10)
            boolean r0 = X.AnonymousClass2o2.A00(r0)
            if (r0 == 0) goto L_0x01d3
            r0 = 2131427819(0x7f0b01eb, float:1.8477265E38)
            android.view.View r1 = X.DbY.A0F(r14, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            r0 = 2131438634(0x7f0b2c2a, float:1.84992E38)
            android.view.View r3 = X.AnonymousClass7TF.A0F(r1, r0)
            com.instagram.igds.components.textcell.IgdsListCell r3 = (com.instagram.igds.components.textcell.IgdsListCell) r3
            X.Njo r0 = X.C69349Njo.TYPE_CHECKBOX
            r3.setTextCellType(r0)
            r3.setVisibility(r5)
            r0 = 20
            X.LZJ.A00(r3, r13, r0)
            X.0xx r2 = X.DbW.A0E(r13)
            r1 = 19
            X.ImR r0 = new X.ImR
            r0.<init>((java.lang.Object) r13, (java.lang.Object) r3, (X.AnonymousClass4D7) r6, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
        L_0x01d3:
            return
        L_0x01d4:
            X.6rJ r1 = X.C60296Jiu.A00(r2)
            java.lang.String r0 = "IS_STICKER_TRANSLATIONS_ENABLED"
            java.lang.Object r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0214
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            goto L_0x012e
        L_0x01e6:
            X.6rJ r1 = X.C60296Jiu.A00(r2)
            java.lang.String r0 = "IS_ORIGINAL_MEDIA_CAPTIONS_ENABLED"
            java.lang.Object r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0219
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            goto L_0x0066
        L_0x01f8:
            X.6rJ r1 = X.C60296Jiu.A00(r2)
            java.lang.String r0 = "IS_CAPTIONS_TRANSLATIONS_ENABLED"
            java.lang.Object r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x021e
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            goto L_0x003a
        L_0x020a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x020f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0214:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0219:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x021e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61366K4k.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public C61366K4k() {
        0Yh A0z = DbS.A0z(C60296Jiu.class);
        this.A01 = DbS.A0I(new MMH(this, 27), new MMH(this, 28), new C58690Ivz(23, (Object) null, this), A0z);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(938337796);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_edit_advanced_settings_fragment, false);
        AnonymousClass0fD.A09(1729640273, A02);
        return A0D;
    }
}
