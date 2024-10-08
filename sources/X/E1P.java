package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class E1P extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AiStickerDisclosureFragment";
    public C74327Pt3 A00;
    public Integer A01;
    public boolean A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (X.182.A06(X.0Tu.A05, X.AnonymousClass7TF.A0L(r12.A03, 0), 36317732356494829L) == false) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            r6 = 0
            X.0qQ.A0B(r13, r6)
            super.onViewCreated(r13, r14)
            android.os.Bundle r0 = r12.mArguments
            if (r0 == 0) goto L_0x0032
            java.lang.String r5 = X.DbS.A0l(r0)
            if (r5 == 0) goto L_0x0032
            r0 = 2
            java.lang.Integer[] r4 = X.AnonymousClass05K.A00(r0)
            int r3 = r4.length
            r2 = 0
        L_0x0018:
            if (r2 >= r3) goto L_0x0032
            r1 = r4[r2]
            int r0 = r1.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "DIRECT"
        L_0x0026:
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 != 0) goto L_0x0033
            int r2 = r2 + 1
            goto L_0x0018
        L_0x002f:
            java.lang.String r0 = "STORIES_STICKER_TRAY"
            goto L_0x0026
        L_0x0032:
            r1 = 0
        L_0x0033:
            r12.A01 = r1
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            if (r1 != r7) goto L_0x004d
            X.0eM r0 = r12.A03
            X.0lg r3 = X.AnonymousClass7TF.A0L(r0, r6)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317732356494829(0x8106c9002815ed, double:3.0308184097929533E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            r12.A02 = r0
            r0 = 2131427924(0x7f0b0254, float:1.8477478E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r13, r0)
            com.instagram.igds.components.headline.IgdsHeadline r5 = (com.instagram.igds.components.headline.IgdsHeadline) r5
            java.lang.Integer r0 = r12.A01
            r2 = 2131237680(0x7f081b30, float:1.8091617E38)
            if (r0 != r7) goto L_0x0063
            r2 = 2131237702(0x7f081b46, float:1.8091662E38)
        L_0x0063:
            r4 = 0
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = com.instagram.igds.components.headline.IgdsHeadline.A01(r5, r4)
            android.content.Context r0 = r5.getContext()
            X.DbU.A13(r0, r1, r2)
            boolean r1 = r12.A02
            r0 = 2131958598(0x7f131b46, float:1.9553813E38)
            if (r1 == 0) goto L_0x0079
            r0 = 2131958599(0x7f131b47, float:1.9553815E38)
        L_0x0079:
            r5.setHeadline((int) r0)
            java.lang.Integer r0 = r12.A01
            r2 = -1
            if (r0 != 0) goto L_0x008e
            r0 = -1
        L_0x0082:
            r1 = 1
            if (r0 == r2) goto L_0x0093
            if (r0 == r6) goto L_0x0109
            if (r0 == r1) goto L_0x0093
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008e:
            int r0 = r0.intValue()
            goto L_0x0082
        L_0x0093:
            android.content.Context r0 = r12.requireContext()
            X.FGX r8 = X.FGX.A02(r0, r1)
            android.content.res.Resources r1 = X.DbV.A05(r12)
            r0 = 2131974247(0x7f135867, float:1.9585553E38)
            java.lang.String r2 = r1.getString(r0)
            android.content.res.Resources r1 = X.DbV.A05(r12)
            r0 = 2131974246(0x7f135866, float:1.958555E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131238850(0x7f081fc2, float:1.809399E38)
            android.content.res.Resources r1 = X.FGX.A00(r12, r8, r2, r1, r0)
            r0 = 2131974249(0x7f135869, float:1.9585557E38)
            java.lang.String r2 = r1.getString(r0)
            android.content.res.Resources r1 = X.DbV.A05(r12)
            r0 = 2131974248(0x7f135868, float:1.9585555E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131238821(0x7f081fa5, float:1.8093932E38)
            android.content.res.Resources r1 = X.FGX.A00(r12, r8, r2, r1, r0)
            r0 = 2131974251(0x7f13586b, float:1.958556E38)
            java.lang.String r2 = r1.getString(r0)
            android.content.res.Resources r10 = X.DbV.A05(r12)
            r9 = 2131974250(0x7f13586a, float:1.9585559E38)
            X.0eM r0 = r12.A03
            X.0lg r11 = X.AnonymousClass7TF.A0L(r0, r6)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36880682308796762(0x8306c90017015a, double:3.386830226446206E-306)
            java.lang.String r1 = X.182.A04(r3, r11, r0)
            java.lang.String r0 = " <a href=\"%s\">Privacy Policy</a>"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r10, r0, r9)
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = ""
        L_0x00fe:
            android.text.Spanned r1 = android.text.Html.fromHtml(r0)
            r0 = 2131238545(0x7f081e91, float:1.8093372E38)
            r8.A05(r2, r1, r0)
            goto L_0x0162
        L_0x0109:
            android.content.Context r0 = r12.requireContext()
            X.FGX r8 = X.FGX.A02(r0, r1)
            android.content.res.Resources r2 = X.DbV.A05(r12)
            boolean r1 = r12.A02
            r0 = 2131958593(0x7f131b41, float:1.9553803E38)
            if (r1 == 0) goto L_0x011f
            r0 = 2131958594(0x7f131b42, float:1.9553805E38)
        L_0x011f:
            java.lang.String r3 = r2.getString(r0)
            android.content.res.Resources r2 = X.DbV.A05(r12)
            boolean r1 = r12.A02
            r0 = 2131958591(0x7f131b3f, float:1.9553799E38)
            if (r1 == 0) goto L_0x0131
            r0 = 2131958592(0x7f131b40, float:1.95538E38)
        L_0x0131:
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131238850(0x7f081fc2, float:1.809399E38)
            android.content.res.Resources r1 = X.FGX.A00(r12, r8, r3, r1, r0)
            r0 = 2131958597(0x7f131b45, float:1.955381E38)
            java.lang.String r3 = r1.getString(r0)
            android.content.res.Resources r2 = X.DbV.A05(r12)
            boolean r1 = r12.A02
            r0 = 2131958595(0x7f131b43, float:1.9553807E38)
            if (r1 == 0) goto L_0x0151
            r0 = 2131958596(0x7f131b44, float:1.9553809E38)
        L_0x0151:
            java.lang.String r2 = r2.getString(r0)
            boolean r1 = r12.A02
            r0 = 2131238148(0x7f081d04, float:1.8092567E38)
            if (r1 == 0) goto L_0x015f
            r0 = 2131238319(0x7f081daf, float:1.8092913E38)
        L_0x015f:
            r8.A05(r3, r2, r0)
        L_0x0162:
            java.util.List r2 = r8.A04()
            int r1 = r2.size()
            r0 = 3
            if (r1 != r0) goto L_0x017a
            java.lang.Object r1 = X.00k.A0K(r2)
            com.instagram.igds.components.bulletcell.IgdsBulletCell r1 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r1
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r4, r0)
        L_0x017a:
            r5.setBulletList(r2)
            r0 = 2131427922(0x7f0b0252, float:1.8477474E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r13, r0)
            X.61u r1 = (X.C3021461u) r1
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0190
            r0 = 2131956706(0x7f1313e2, float:1.9549975E38)
            X.DbZ.A1A(r12, r1, r0)
        L_0x0190:
            r0 = 41
            X.FP8.A01(r1, r0, r12)
            r0 = 2131427921(0x7f0b0251, float:1.8477472E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r13, r0)
            X.0eM r2 = r12.A03
            X.0lg r4 = X.AnonymousClass7TF.A0L(r2, r6)
            X.0Tu r5 = X.0Tu.A05
            r0 = 36880682308206936(0x8306c9000e0158, double:3.3868302260731974E-306)
            java.lang.String r4 = X.182.A04(r5, r4, r0)
            java.lang.Integer r1 = r12.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0230
            java.lang.String r0 = X.DbV.A12(r4)
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0230
            boolean r0 = r12.A02
            if (r0 != 0) goto L_0x0230
            r1 = 7
            X.FOr r0 = new X.FOr
            r0.<init>((java.lang.String) r4, (java.lang.Object) r12, (int) r1)
            X.AnonymousClass0fU.A00(r0, r3)
        L_0x01ca:
            java.lang.Integer r0 = r12.A01
            if (r0 != r7) goto L_0x01e4
            androidx.fragment.app.FragmentActivity r0 = r12.requireActivity()
            X.00N r4 = r0.getOnBackPressedDispatcher()
            X.07Z r3 = r12.getViewLifecycleOwner()
            r1 = 30
            X.PqN r0 = new X.PqN
            r0.<init>(r12, r1)
            X.AnonymousClass00O.A00(r4, r3, r0)
        L_0x01e4:
            java.lang.Integer r0 = r12.A01
            if (r0 != r7) goto L_0x022c
            boolean r1 = r12.A02
            r0 = 2131427919(0x7f0b024f, float:1.8477468E38)
            if (r1 == 0) goto L_0x01f2
            r0 = 2131427920(0x7f0b0250, float:1.847747E38)
        L_0x01f2:
            android.widget.TextView r8 = X.DbU.A0G(r13, r0)
            X.0qQ.A0A(r8)
            r8.setVisibility(r6)
            android.content.res.Resources r7 = X.DbV.A05(r12)
            boolean r0 = r12.A02
            r4 = 2131958589(0x7f131b3d, float:1.9553794E38)
            if (r0 == 0) goto L_0x022d
            r4 = 2131958590(0x7f131b3e, float:1.9553796E38)
            java.lang.String r3 = " <a href=\"%s\">Meta's AI terms</a>"
        L_0x020c:
            X.0lg r2 = X.AnonymousClass7TF.A0L(r2, r6)
            r0 = 36880682308796762(0x8306c90017015a, double:3.386830226446206E-306)
            java.lang.String r0 = X.182.A04(r5, r2, r0)
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r3, r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r7, r0, r4)
            if (r0 != 0) goto L_0x0225
            java.lang.String r0 = ""
        L_0x0225:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            X.DbX.A1G(r8, r0)
        L_0x022c:
            return
        L_0x022d:
            java.lang.String r3 = " <a href=\"%s\">Privacy Policy</a>"
            goto L_0x020c
        L_0x0230:
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x01ca
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1P.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-86023974);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.ai_sticker_disclosure_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-192393190, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1213487858);
        super.onDestroy();
        this.A00 = null;
        AnonymousClass0fD.A09(-2061015009, A022);
    }
}
