package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

public final class KYc extends K7Y {
    public static final CallerContext A01 = CallerContext.A01(__redex_internal_original_name);
    public static final C63901LBh A02 = new Object();
    public static final String __redex_internal_original_name = "CrosspostingUnifiedOnboardingFragment";
    public final AnonymousClass0eM A00;

    public static Spanned A05(Context context) {
        Spanned A002 = 0bC.A00(context.getResources(), new Object[0], 2131975911);
        0qQ.A07(A002);
        return A002;
    }

    public final String getModuleName() {
        return "crossposting_unified_onboarding_fragment";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:224:0x078c, code lost:
        r1 = new java.lang.Object[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x078e, code lost:
        X.K7Y.A01(r3, r15, r1, r2);
        X.K7Y.A01(r4.getResources(), r14, new java.lang.Object[0], 2131972874);
        r2 = r4.getResources();
        r1 = 2131966530;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x07ad, code lost:
        r1 = new java.lang.Object[]{r21};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x07cd, code lost:
        r14.setText(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x07d2, code lost:
        if (r11 == null) goto L_0x0a68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x07d8, code lost:
        if (r11.length() != 0) goto L_0x097f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ec, code lost:
        if (X.00p.A0j(r3, r8.getString(2131957169), false) == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x08d1, code lost:
        r7.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x08d6, code lost:
        r3 = A0D().A00;
        r1 = A0D().A03;
        r2 = X.GOg.SIZE_24;
        A08(r18, r2, r3, r1);
        A08(r13, r2, A0D().A01, A0D().A04);
        A08(r12, r2, A0D().A02, A0D().A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0909, code lost:
        A07(X.C368278sM.SUPPRESS, r6, "empty_audience");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0916, code lost:
        if (r16 != 2) goto L_0x0918;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0968, code lost:
        if (r11.length() != 0) goto L_0x097f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0972, code lost:
        if (r13 != 2) goto L_0x0974;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0108, code lost:
        if (X.00p.A0j(r3, r8.getString(2131957167), false) == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x097f, code lost:
        r2 = r4.getResources();
        r1 = 2131973903;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x09cf, code lost:
        if (r11.length() != 0) goto L_0x0a81;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x09d1, code lost:
        A07(X.C368278sM.SUPPRESS, r6, "empty_audience");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x09df, code lost:
        if (r13 != 2) goto L_0x09e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0a15, code lost:
        r1 = new java.lang.Object[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0a17, code lost:
        X.K7Y.A01(r3, r15, r1, r2);
        X.K7Y.A01(r4.getResources(), r14, new java.lang.Object[0], 2131972874);
        r2 = r4.getResources();
        r1 = 2131966535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0a2d, code lost:
        r0 = new java.lang.Object[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0a2f, code lost:
        X.K7Y.A01(r2, r7, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0a3b, code lost:
        r1 = new java.lang.Object[]{r21};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0a5b, code lost:
        r14.setText(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0a60, code lost:
        if (r11 == null) goto L_0x0a68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0a66, code lost:
        if (r11.length() != 0) goto L_0x0a81;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0a68, code lost:
        r2 = A03(r4, r6, "empty_audience");
        r1 = 2131976099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0a81, code lost:
        r2 = r4.getResources();
        r1 = 2131973906;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0a88, code lost:
        r0 = new java.lang.Object[]{r11};
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r37, android.os.Bundle r38) {
        /*
            r36 = this;
            r0 = 0
            r1 = r37
            X.0qQ.A0B(r1, r0)
            r6 = r36
            r2 = r38
            super.onViewCreated(r1, r2)
            r2 = 2131443392(0x7f0b3ec0, float:1.850885E38)
            android.view.View r19 = X.AnonymousClass7TF.A0F(r1, r2)
            r2 = 2131443393(0x7f0b3ec1, float:1.8508853E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r1, r2)
            r2 = 2131431056(0x7f0b0e90, float:1.848383E38)
            android.view.View r4 = X.AnonymousClass7TF.A0F(r1, r2)
            int r2 = A02(r6)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r1, r2)
            r20 = 0
            r2.setVisibility(r0)
            boolean r2 = r6.A09
            X.819 r3 = r6.A0B()
            if (r2 == 0) goto L_0x03fe
            X.819 r2 = X.AnonymousClass819.BOTTOMSHEET_UNIFIED_STORIES_FEED_REELS
            if (r3 != r2) goto L_0x0292
            X.0eM r2 = r6.A00
            r16 = r2
            java.lang.Object r2 = r16.getValue()
            X.8jd r2 = (X.C363378jd) r2
            com.facebook.common.callercontext.CallerContext r11 = A01
            X.5wF r10 = r2.A00(r11)
            java.lang.Integer r3 = r10.A01
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r3 != r2) goto L_0x0053
            r20 = 1
        L_0x0053:
            r2 = 2131431066(0x7f0b0e9a, float:1.848385E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r1, r2)
            boolean r2 = A0A(r6)
            if (r2 == 0) goto L_0x03f6
            r2 = 2131431067(0x7f0b0e9b, float:1.8483853E38)
            android.widget.TextView r3 = X.AnonymousClass7TG.A0R(r1, r2)
            r2 = 8
            r7.setVisibility(r2)
            r3.setVisibility(r0)
            r2 = 2131974492(0x7f13595c, float:1.958605E38)
            X.DbU.A1G(r3, r6, r2)
        L_0x0075:
            r2 = 2131443392(0x7f0b3ec0, float:1.850885E38)
            com.instagram.igds.components.button.IgdsButton r8 = X.JTR.A0n(r1, r2)
            com.instagram.common.session.UserSession r9 = r6.getSession()
            X.0Tu r7 = X.0Tu.A05
            r2 = 36603266074743701(0x820a7a00011395, double:3.2113910829655376E-306)
            int r9 = X.DbS.A04(r7, r9, r2)
            r2 = 1
            if (r9 == r2) goto L_0x03f1
            r3 = 2
            r2 = 2131974478(0x7f13594e, float:1.9586021E38)
            if (r9 == r3) goto L_0x0097
            r2 = 2131974476(0x7f13594c, float:1.9586017E38)
        L_0x0097:
            A06(r6, r8, r2)
            boolean r3 = X.C363388je.A02(r10)
            java.lang.String r13 = r10.A04
            int r2 = r13.length()
            r9 = 1
            if (r2 <= 0) goto L_0x03e8
            r2 = 2131431060(0x7f0b0e94, float:1.8483839E38)
            android.widget.TextView r12 = X.AnonymousClass7TG.A0R(r1, r2)
            r12.setVisibility(r0)
            if (r3 == 0) goto L_0x03cd
            android.content.res.Resources r8 = X.DbV.A05(r6)
            r3 = 2131974486(0x7f135956, float:1.9586037E38)
        L_0x00ba:
            java.lang.Object[] r2 = new java.lang.Object[]{r13}
            X.K7Y.A01(r8, r12, r2, r3)
        L_0x00c1:
            android.content.Context r8 = r6.requireContext()
            X.5w9 r2 = X.AnonymousClass5w8.A05
            java.lang.String r12 = X.K7Y.A00(r8, r6)
            com.instagram.common.session.UserSession r2 = r6.getSession()
            java.lang.String r3 = X.C367158qH.A00(r8, r2, r10)
            r2 = 2131976053(0x7f135f75, float:1.9589216E38)
            java.lang.String r2 = r8.getString(r2)
            boolean r2 = X.00p.A0j(r12, r2, r0)
            if (r2 == 0) goto L_0x00ee
            r2 = 2131957169(0x7f1315b1, float:1.9550914E38)
            java.lang.String r2 = r8.getString(r2)
            boolean r2 = X.00p.A0j(r3, r2, r0)
            r13 = 1
            if (r2 != 0) goto L_0x00ef
        L_0x00ee:
            r13 = 0
        L_0x00ef:
            r2 = 2131976049(0x7f135f71, float:1.9589208E38)
            java.lang.String r2 = r8.getString(r2)
            boolean r2 = X.00p.A0j(r12, r2, r0)
            if (r2 == 0) goto L_0x010a
            r2 = 2131957167(0x7f1315af, float:1.955091E38)
            java.lang.String r2 = r8.getString(r2)
            boolean r3 = X.00p.A0j(r3, r2, r0)
            r2 = 1
            if (r3 != 0) goto L_0x010b
        L_0x010a:
            r2 = 0
        L_0x010b:
            if (r13 != 0) goto L_0x0357
            if (r2 != 0) goto L_0x0357
            if (r20 != 0) goto L_0x0357
            r2 = 2131431053(0x7f0b0e8d, float:1.8483824E38)
            android.widget.TextView r15 = X.AnonymousClass7TG.A0R(r1, r2)
            boolean r3 = A0A(r6)
            r2 = 2131431051(0x7f0b0e8b, float:1.848382E38)
            if (r3 == 0) goto L_0x0124
            r2 = 2131431052(0x7f0b0e8c, float:1.8483822E38)
        L_0x0124:
            android.view.View r14 = r1.requireViewById(r2)
            X.0qQ.A0A(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            int r2 = A02(r6)
            android.widget.ImageView r13 = X.DbX.A0J(r1, r2)
            com.instagram.common.session.UserSession r2 = r6.getSession()
            X.5w8 r4 = X.AnonymousClass5w9.A00(r2)
            com.instagram.common.session.UserSession r3 = r6.getSession()
            android.content.Context r2 = r6.requireContext()
            java.lang.String r12 = r4.A05(r2, r3)
            android.content.Context r8 = r6.requireContext()
            r14.setVisibility(r0)
            r15.setVisibility(r0)
            android.content.res.Resources r4 = r8.getResources()
            r3 = 2131974463(0x7f13593f, float:1.958599E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r12}
            X.K7Y.A01(r4, r15, r2, r3)
            android.content.res.Resources r3 = r8.getResources()
            r2 = 2131238638(0x7f081eee, float:1.809356E38)
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r2)
            r13.setImageDrawable(r2)
            r2 = 2131976053(0x7f135f75, float:1.9589216E38)
            boolean r2 = X.JTT.A1Z(r8, r12, r2)
            if (r2 == 0) goto L_0x030a
            r2 = 2131974469(0x7f135945, float:1.9586003E38)
        L_0x017b:
            X.DbT.A18(r8, r14, r2)
        L_0x017e:
            r2 = 2131431059(0x7f0b0e93, float:1.8483837E38)
            android.widget.TextView r13 = X.AnonymousClass7TG.A0R(r1, r2)
            boolean r3 = A0A(r6)
            r2 = 2131431057(0x7f0b0e91, float:1.8483832E38)
            if (r3 == 0) goto L_0x0191
            r2 = 2131431058(0x7f0b0e92, float:1.8483834E38)
        L_0x0191:
            android.view.View r3 = r1.requireViewById(r2)
            X.0qQ.A0A(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2 = 2131431055(0x7f0b0e8f, float:1.8483828E38)
            android.widget.ImageView r12 = X.DbX.A0J(r1, r2)
            android.content.Context r4 = r6.requireContext()
            com.instagram.common.session.UserSession r2 = r6.getSession()
            java.lang.String r8 = X.C367158qH.A00(r4, r2, r10)
            r3.setVisibility(r0)
            r13.setVisibility(r0)
            android.content.res.Resources r14 = r4.getResources()
            r10 = 2131974479(0x7f13594f, float:1.9586023E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r8}
            X.K7Y.A01(r14, r13, r2, r10)
            android.content.res.Resources r10 = r4.getResources()
            r2 = 2131238861(0x7f081fcd, float:1.8094013E38)
            android.graphics.drawable.Drawable r2 = r10.getDrawable(r2)
            r12.setImageDrawable(r2)
            r2 = 2131957169(0x7f1315b1, float:1.9550914E38)
            boolean r2 = X.JTT.A1Z(r4, r8, r2)
            if (r2 == 0) goto L_0x02d9
            r2 = 2131974483(0x7f135953, float:1.9586031E38)
        L_0x01db:
            X.DbT.A18(r4, r3, r2)
        L_0x01de:
            r2 = 2131431065(0x7f0b0e99, float:1.8483849E38)
            android.widget.TextView r14 = X.AnonymousClass7TG.A0R(r1, r2)
            boolean r3 = A0A(r6)
            r2 = 2131431063(0x7f0b0e97, float:1.8483845E38)
            if (r3 == 0) goto L_0x01f1
            r2 = 2131431064(0x7f0b0e98, float:1.8483847E38)
        L_0x01f1:
            android.view.View r10 = r1.requireViewById(r2)
            X.0qQ.A0A(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r2 = 2131431062(0x7f0b0e96, float:1.8483843E38)
            android.widget.ImageView r13 = X.DbX.A0J(r1, r2)
            android.content.Context r8 = r6.requireContext()
            com.instagram.common.session.UserSession r2 = r6.getSession()
            X.Ju9 r12 = X.C367288qV.A01(r11, r2)
            java.lang.Object r2 = r16.getValue()
            X.8jd r2 = (X.C363378jd) r2
            X.5wF r2 = r2.A00(r11)
            boolean r2 = X.C363388je.A02(r2)
            r4 = 0
            if (r2 == 0) goto L_0x02d3
            com.instagram.common.session.UserSession r11 = r6.getSession()
            r2 = 36330703155118818(0x811295000042e2, double:3.039021195071978E-306)
            boolean r2 = X.182.A06(r7, r11, r2)
            if (r2 == 0) goto L_0x02d3
            r2 = 2131973567(0x7f1355bf, float:1.9584173E38)
            java.lang.String r4 = r8.getString(r2)
        L_0x0234:
            r10.setVisibility(r0)
            r14.setVisibility(r0)
            android.content.res.Resources r3 = r8.getResources()
            r2 = 2131974487(0x7f135957, float:1.958604E38)
            r11 = 2
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            X.K7Y.A01(r3, r14, r4, r2)
            android.content.res.Resources r3 = r8.getResources()
            r2 = 2131238690(0x7f081f22, float:1.8093666E38)
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r2)
            r13.setImageDrawable(r2)
            if (r12 == 0) goto L_0x02cd
            com.instagram.share.facebook.model.FBReelsAudienceType r2 = r12.A01
            if (r2 == 0) goto L_0x02cd
            int r3 = r2.ordinal()
            if (r3 == r11) goto L_0x02c9
            r2 = 3
            if (r3 == r2) goto L_0x02c5
            r2 = 5
            if (r3 == r2) goto L_0x02c1
            if (r3 != r9) goto L_0x02cd
            r2 = 2131974491(0x7f13595b, float:1.9586048E38)
        L_0x026e:
            X.DbT.A18(r8, r10, r2)
        L_0x0271:
            com.instagram.common.session.UserSession r4 = r6.getSession()
            r2 = 36321791098103573(0x810a7a00022715, double:3.033385174329564E-306)
            boolean r2 = X.182.A06(r7, r4, r2)
            if (r2 == 0) goto L_0x0292
            r2 = 2131431054(0x7f0b0e8e, float:1.8483826E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r1, r2)
            r2.setVisibility(r0)
            if (r20 == 0) goto L_0x02b4
            r1 = 2131974475(0x7f13594b, float:1.9586015E38)
        L_0x028f:
            X.DbU.A1G(r2, r6, r1)
        L_0x0292:
            r1 = 47
            r0 = r19
            X.C64273LXz.A00(r0, r1, r6)
            r0 = 48
            X.C64273LXz.A00(r5, r0, r6)
            X.8sM r1 = X.C368278sM.VIEW
            r0 = 0
            A07(r1, r6, r0)
            com.instagram.common.session.UserSession r1 = r6.getSession()
            int r0 = r6.A01
            X.FBn r0 = X.C49797F7i.A01(r1, r0)
            if (r0 == 0) goto L_0x02b3
            r0.A00()
        L_0x02b3:
            return
        L_0x02b4:
            boolean r0 = A09(r6)
            r1 = 2131974473(0x7f135949, float:1.9586011E38)
            if (r0 == 0) goto L_0x028f
            r1 = 2131974474(0x7f13594a, float:1.9586013E38)
            goto L_0x028f
        L_0x02c1:
            r2 = 2131974490(0x7f13595a, float:1.9586046E38)
            goto L_0x026e
        L_0x02c5:
            r2 = 2131974489(0x7f135959, float:1.9586043E38)
            goto L_0x026e
        L_0x02c9:
            r2 = 2131974488(0x7f135958, float:1.9586041E38)
            goto L_0x026e
        L_0x02cd:
            r2 = 8
            r10.setVisibility(r2)
            goto L_0x0271
        L_0x02d3:
            if (r12 == 0) goto L_0x0234
            java.lang.String r4 = r12.A02
            goto L_0x0234
        L_0x02d9:
            r2 = 2131957167(0x7f1315af, float:1.955091E38)
            boolean r2 = X.JTT.A1Z(r4, r8, r2)
            if (r2 == 0) goto L_0x02e7
            r2 = 2131974481(0x7f135951, float:1.9586027E38)
            goto L_0x01db
        L_0x02e7:
            r2 = 2131957168(0x7f1315b0, float:1.9550912E38)
            boolean r2 = X.JTT.A1Z(r4, r8, r2)
            if (r2 == 0) goto L_0x02f5
            r2 = 2131974482(0x7f135952, float:1.958603E38)
            goto L_0x01db
        L_0x02f5:
            r2 = 2131957166(0x7f1315ae, float:1.9550908E38)
            boolean r2 = X.JTT.A1Z(r4, r8, r2)
            if (r2 == 0) goto L_0x0303
            r2 = 2131974480(0x7f135950, float:1.9586025E38)
            goto L_0x01db
        L_0x0303:
            r2 = 8
            r3.setVisibility(r2)
            goto L_0x01de
        L_0x030a:
            r2 = 2131976049(0x7f135f71, float:1.9589208E38)
            boolean r2 = X.JTT.A1Z(r8, r12, r2)
            if (r2 == 0) goto L_0x0318
            r2 = 2131974466(0x7f135942, float:1.9585997E38)
            goto L_0x017b
        L_0x0318:
            r2 = 2131976051(0x7f135f73, float:1.9589212E38)
            boolean r2 = X.JTT.A1Z(r8, r12, r2)
            if (r2 == 0) goto L_0x0326
            r2 = 2131974468(0x7f135944, float:1.9586E38)
            goto L_0x017b
        L_0x0326:
            r2 = 2131976048(0x7f135f70, float:1.9589206E38)
            boolean r2 = X.JTT.A1Z(r8, r12, r2)
            if (r2 == 0) goto L_0x0334
            r2 = 2131974465(0x7f135941, float:1.9585995E38)
            goto L_0x017b
        L_0x0334:
            r2 = 2131976050(0x7f135f72, float:1.958921E38)
            boolean r2 = X.JTT.A1Z(r8, r12, r2)
            if (r2 == 0) goto L_0x0342
            r2 = 2131974467(0x7f135943, float:1.9585999E38)
            goto L_0x017b
        L_0x0342:
            r2 = 2131976054(0x7f135f76, float:1.9589218E38)
            boolean r2 = X.JTT.A1Z(r8, r12, r2)
            if (r2 == 0) goto L_0x0350
            r2 = 2131974472(0x7f135948, float:1.958601E38)
            goto L_0x017b
        L_0x0350:
            r2 = 8
            r14.setVisibility(r2)
            goto L_0x017e
        L_0x0357:
            r15 = 8
            r4.setVisibility(r15)
            android.content.Context r14 = r6.requireContext()
            r2 = 2131431053(0x7f0b0e8d, float:1.8483824E38)
            android.widget.TextView r13 = X.AnonymousClass7TG.A0R(r1, r2)
            boolean r3 = A0A(r6)
            r2 = 2131431051(0x7f0b0e8b, float:1.848382E38)
            if (r3 == 0) goto L_0x0373
            r2 = 2131431052(0x7f0b0e8c, float:1.8483822E38)
        L_0x0373:
            android.view.View r12 = r1.requireViewById(r2)
            X.0qQ.A0A(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            int r2 = A02(r6)
            android.widget.ImageView r10 = X.DbX.A0J(r1, r2)
            java.lang.String r8 = X.K7Y.A00(r14, r6)
            r12.setVisibility(r0)
            r13.setVisibility(r0)
            android.content.res.Resources r4 = r14.getResources()
            r3 = 2131974464(0x7f135940, float:1.9585993E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r8}
            X.K7Y.A01(r4, r13, r2, r3)
            android.content.res.Resources r3 = r14.getResources()
            r2 = 2131238638(0x7f081eee, float:1.809356E38)
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r2)
            r10.setImageDrawable(r2)
            r2 = 2131976053(0x7f135f75, float:1.9589216E38)
            boolean r2 = X.JTT.A1Z(r14, r8, r2)
            if (r2 == 0) goto L_0x03bb
            r2 = 2131974471(0x7f135947, float:1.9586007E38)
        L_0x03b6:
            X.DbT.A18(r14, r12, r2)
            goto L_0x01de
        L_0x03bb:
            r2 = 2131976049(0x7f135f71, float:1.9589208E38)
            boolean r2 = X.JTT.A1Z(r14, r8, r2)
            if (r2 == 0) goto L_0x03c8
            r2 = 2131974470(0x7f135946, float:1.9586005E38)
            goto L_0x03b6
        L_0x03c8:
            r12.setVisibility(r15)
            goto L_0x01de
        L_0x03cd:
            com.instagram.common.session.UserSession r8 = r6.getSession()
            r2 = 36321791098103573(0x810a7a00022715, double:3.033385174329564E-306)
            boolean r2 = X.182.A06(r7, r8, r2)
            android.content.res.Resources r8 = X.DbV.A05(r6)
            r3 = 2131974485(0x7f135955, float:1.9586035E38)
            if (r2 == 0) goto L_0x00ba
            r3 = 2131974484(0x7f135954, float:1.9586033E38)
            goto L_0x00ba
        L_0x03e8:
            X.8sM r3 = X.C368278sM.SUPPRESS
            java.lang.String r2 = "empty_name"
            A07(r3, r6, r2)
            goto L_0x00c1
        L_0x03f1:
            r2 = 2131974477(0x7f13594d, float:1.958602E38)
            goto L_0x0097
        L_0x03f6:
            r2 = 2131974492(0x7f13595c, float:1.958605E38)
            X.DbU.A1G(r7, r6, r2)
            goto L_0x0075
        L_0x03fe:
            X.819 r2 = X.AnonymousClass819.BOTTOMSHEET_UNLINKED_USER_EVERGREEN_STORY
            if (r3 != r2) goto L_0x04db
            r2 = 2131443392(0x7f0b3ec0, float:1.850885E38)
            com.instagram.igds.components.button.IgdsButton r4 = X.JTR.A0n(r1, r2)
            r2 = 2131443393(0x7f0b3ec1, float:1.8508853E38)
            com.instagram.igds.components.button.IgdsButton r3 = X.JTR.A0n(r1, r2)
            r2 = 2131431066(0x7f0b0e9a, float:1.848385E38)
            android.widget.TextView r13 = X.AnonymousClass7TG.A0R(r1, r2)
            r2 = 2131431051(0x7f0b0e8b, float:1.848382E38)
            android.widget.TextView r12 = X.AnonymousClass7TG.A0R(r1, r2)
            r2 = 2131431057(0x7f0b0e91, float:1.8483832E38)
            android.widget.TextView r10 = X.AnonymousClass7TG.A0R(r1, r2)
            r2 = 2131431063(0x7f0b0e97, float:1.8483845E38)
            android.view.View r9 = X.AnonymousClass7TF.A0F(r1, r2)
            android.content.Context r14 = r6.requireContext()
            int r2 = A02(r6)
            android.widget.ImageView r2 = X.DbX.A0J(r1, r2)
            r7 = 2131431055(0x7f0b0e8f, float:1.8483828E38)
            android.widget.ImageView r11 = X.DbX.A0J(r1, r7)
            r7 = 2131431062(0x7f0b0e96, float:1.8483843E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r1, r7)
            r7 = 2131431065(0x7f0b0e99, float:1.8483849E38)
            android.view.View r7 = X.AnonymousClass7TF.A0G(r1, r7)
            r1 = 2131961931(0x7f13284b, float:1.9560573E38)
            X.DbU.A1G(r13, r6, r1)
            android.content.res.Resources r13 = r14.getResources()
            r1 = 2131237838(0x7f081bce, float:1.8091938E38)
            android.graphics.drawable.Drawable r1 = r13.getDrawable(r1)
            r2.setImageDrawable(r1)
            com.instagram.common.session.UserSession r1 = r6.getSession()
            X.27y r1 = X.27u.A00(r1)
            boolean r2 = r1.A01()
            r1 = 2131975949(0x7f135f0d, float:1.9589005E38)
            if (r2 == 0) goto L_0x0475
            r1 = 2131975950(0x7f135f0e, float:1.9589007E38)
        L_0x0475:
            X.DbU.A1G(r12, r6, r1)
            r12.setVisibility(r0)
            android.content.res.Resources r2 = r14.getResources()
            r1 = 2131238770(0x7f081f72, float:1.8093828E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r1)
            r11.setImageDrawable(r1)
            boolean r2 = A09(r6)
            r1 = 2131975911(0x7f135ee7, float:1.9588928E38)
            if (r2 == 0) goto L_0x0495
            r1 = 2131975912(0x7f135ee8, float:1.958893E38)
        L_0x0495:
            X.DbU.A1G(r10, r6, r1)
            r10.setVisibility(r0)
            r0 = 8
            X.JTT.A14(r9, r8, r7, r0)
            com.instagram.common.session.UserSession r7 = r6.getSession()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36610541749278766(0x8211180000182e, double:3.2159922488383025E-306)
            long r7 = X.182.A01(r2, r7, r0)
            r1 = 1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x04ce
            r1 = 2131952260(0x7f130284, float:1.9540958E38)
        L_0x04b8:
            A06(r6, r4, r1)
            r0 = 2131968513(0x7f134201, float:1.9573923E38)
            A06(r6, r3, r0)
            r1 = 45
            r0 = r19
            X.C64273LXz.A00(r0, r1, r6)
            r0 = 46
            X.C64273LXz.A00(r5, r0, r6)
            return
        L_0x04ce:
            r1 = 2
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r1 = 2131956706(0x7f1313e2, float:1.9549975E38)
            if (r0 != 0) goto L_0x04b8
            r1 = 2131973560(0x7f1355b8, float:1.958416E38)
            goto L_0x04b8
        L_0x04db:
            android.content.Context r22 = r6.requireContext()
            r23 = 0
            r28 = 1
            r24 = -1
            X.Mhg r11 = new X.Mhg
            r21 = r11
            r25 = r24
            r26 = r24
            r27 = r24
            r29 = r24
            r30 = r0
            r31 = r0
            r32 = r0
            r33 = r0
            r34 = r0
            r35 = r28
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r2 = 2131431051(0x7f0b0e8b, float:1.848382E38)
            android.widget.TextView r8 = X.AnonymousClass7TG.A0R(r1, r2)
            r2 = 2131431057(0x7f0b0e91, float:1.8483832E38)
            android.widget.TextView r13 = X.AnonymousClass7TG.A0R(r1, r2)
            r4 = 2131431063(0x7f0b0e97, float:1.8483845E38)
            android.widget.TextView r9 = X.AnonymousClass7TG.A0R(r1, r4)
            android.content.Context r7 = r6.requireContext()
            X.0eM r2 = r6.A00
            r16 = r2
            java.lang.Object r3 = r16.getValue()
            X.8jd r3 = (X.C363378jd) r3
            com.facebook.common.callercontext.CallerContext r2 = A01
            X.5wF r10 = r3.A00(r2)
            java.lang.Integer r12 = r10.A01
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            boolean r15 = X.AnonymousClass7TF.A1W(r12, r3)
            java.lang.String r14 = r10.A04
            X.5w9 r3 = X.AnonymousClass5w8.A05
            java.lang.String r12 = X.K7Y.A00(r7, r6)
            com.instagram.common.session.UserSession r3 = r6.getSession()
            java.lang.String r10 = X.C367158qH.A00(r7, r3, r10)
            X.JTT.A14(r8, r13, r9, r0)
            if (r15 == 0) goto L_0x05a4
            X.LBI r3 = r6.A0D()
            java.lang.String r3 = r3.A06
            android.text.Editable r3 = A04(r11, r3)
            if (r3 != 0) goto L_0x055d
            android.content.res.Resources r10 = r7.getResources()
            r3 = 2131975907(0x7f135ee3, float:1.958892E38)
            android.text.Spanned r3 = X.JTR.A0T(r10, r14, r3)
        L_0x055d:
            X.DbZ.A14(r8, r3)
            X.LBI r3 = r6.A0D()
            java.lang.String r3 = r3.A07
            android.text.Editable r3 = A04(r11, r3)
            if (r3 != 0) goto L_0x0573
            r3 = 2131975914(0x7f135eea, float:1.9588934E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r7, r3)
        L_0x0573:
            X.DbZ.A14(r13, r3)
            X.LBI r3 = r6.A0D()
            java.lang.String r3 = r3.A08
            android.text.Editable r3 = A04(r11, r3)
            if (r3 != 0) goto L_0x0592
            android.content.res.Resources r8 = r7.getResources()
            r7 = 2131975916(0x7f135eec, float:1.9588938E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            android.text.Spanned r3 = X.0bC.A00(r8, r3, r7)
            X.0qQ.A07(r3)
        L_0x0592:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
        L_0x0594:
            r9.setText(r3)
            X.819 r3 = r6.A0B()
            int r3 = r3.ordinal()
            switch(r3) {
                case 14: goto L_0x064e;
                case 15: goto L_0x064e;
                case 29: goto L_0x064e;
                case 30: goto L_0x064e;
                case 31: goto L_0x064e;
                case 32: goto L_0x064e;
                case 33: goto L_0x064e;
                case 34: goto L_0x064e;
                default: goto L_0x05a2;
            }
        L_0x05a2:
            goto L_0x0292
        L_0x05a4:
            int r15 = r14.length()
            X.LBI r3 = r6.A0D()
            java.lang.String r3 = r3.A06
            android.text.Editable r3 = A04(r11, r3)
            if (r15 <= 0) goto L_0x061c
            if (r3 != 0) goto L_0x05c1
            android.content.res.Resources r15 = r7.getResources()
            r3 = 2131975908(0x7f135ee4, float:1.9588922E38)
            android.text.Spanned r3 = X.JTR.A0T(r15, r14, r3)
        L_0x05c1:
            r8.setText(r3)
        L_0x05c4:
            X.LBI r3 = r6.A0D()
            java.lang.String r3 = r3.A07
            android.text.Editable r3 = A04(r11, r3)
            if (r3 != 0) goto L_0x05e0
            boolean r3 = A09(r6)
            if (r3 == 0) goto L_0x0614
            r3 = 2131975912(0x7f135ee8, float:1.958893E38)
            java.lang.String r3 = r6.getString(r3)
        L_0x05dd:
            X.0qQ.A0A(r3)
        L_0x05e0:
            X.DbZ.A14(r13, r3)
            if (r12 == 0) goto L_0x0630
            int r3 = r12.length()
            if (r3 == 0) goto L_0x0630
            if (r10 == 0) goto L_0x0630
            int r3 = r10.length()
            if (r3 == 0) goto L_0x0630
            X.LBI r3 = r6.A0D()
            java.lang.String r3 = r3.A08
            android.text.Editable r3 = A04(r11, r3)
            if (r3 != 0) goto L_0x0611
            android.content.res.Resources r8 = r7.getResources()
            r7 = 2131975917(0x7f135eed, float:1.958894E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r10, r12}
            android.text.Spanned r3 = X.0bC.A00(r8, r3, r7)
            X.0qQ.A07(r3)
        L_0x0611:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            goto L_0x0594
        L_0x0614:
            r3 = 2131975911(0x7f135ee7, float:1.9588928E38)
            java.lang.String r3 = r7.getString(r3)
            goto L_0x05dd
        L_0x061c:
            if (r3 != 0) goto L_0x0625
            r3 = 2131975906(0x7f135ee2, float:1.9588918E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r7, r3)
        L_0x0625:
            X.DbZ.A14(r8, r3)
            X.8sM r8 = X.C368278sM.SUPPRESS
            java.lang.String r3 = "empty_name"
            A07(r8, r6, r3)
            goto L_0x05c4
        L_0x0630:
            X.8sM r8 = X.C368278sM.SUPPRESS
            java.lang.String r3 = "empty_audience"
            A07(r8, r6, r3)
            X.LBI r3 = r6.A0D()
            java.lang.String r3 = r3.A08
            android.text.Editable r3 = A04(r11, r3)
            if (r3 != 0) goto L_0x064a
            r3 = 2131975915(0x7f135eeb, float:1.9588936E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r7, r3)
        L_0x064a:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            goto L_0x0594
        L_0x064e:
            r3 = 2131443392(0x7f0b3ec0, float:1.850885E38)
            com.instagram.igds.components.button.IgdsButton r10 = X.JTR.A0n(r1, r3)
            r3 = 2131443393(0x7f0b3ec1, float:1.8508853E38)
            com.instagram.igds.components.button.IgdsButton r9 = X.JTR.A0n(r1, r3)
            r3 = 2131431066(0x7f0b0e9a, float:1.848385E38)
            android.widget.TextView r8 = X.AnonymousClass7TG.A0R(r1, r3)
            r3 = 2131431051(0x7f0b0e8b, float:1.848382E38)
            android.widget.TextView r15 = X.AnonymousClass7TG.A0R(r1, r3)
            r3 = 2131431057(0x7f0b0e91, float:1.8483832E38)
            android.widget.TextView r14 = X.AnonymousClass7TG.A0R(r1, r3)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r1, r4)
            int r3 = A02(r6)
            com.instagram.common.ui.widget.imageview.IgImageView r18 = X.DbX.A0b(r1, r3)
            r3 = 2131431055(0x7f0b0e8f, float:1.8483828E38)
            com.instagram.common.ui.widget.imageview.IgImageView r13 = X.DbX.A0b(r1, r3)
            r3 = 2131431062(0x7f0b0e96, float:1.8483843E38)
            com.instagram.common.ui.widget.imageview.IgImageView r12 = X.DbX.A0b(r1, r3)
            android.content.Context r4 = r6.requireContext()
            java.lang.Object r1 = r16.getValue()
            X.8jd r1 = (X.C363378jd) r1
            X.5wF r3 = r1.A00(r2)
            boolean r17 = X.C363388je.A02(r3)
            java.lang.String r1 = r3.A04
            r21 = r1
            X.819 r1 = r6.A0B()
            int r16 = r1.ordinal()
            java.lang.String r1 = "empty_name"
            java.lang.String r2 = "empty_audience"
            switch(r16) {
                case 14: goto L_0x06b2;
                case 15: goto L_0x09ec;
                case 29: goto L_0x070c;
                case 30: goto L_0x07ed;
                case 31: goto L_0x0925;
                case 32: goto L_0x0988;
                case 33: goto L_0x0850;
                case 34: goto L_0x0767;
                default: goto L_0x06b0;
            }
        L_0x06b0:
            goto L_0x0292
        L_0x06b2:
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A0B
            if (r0 != 0) goto L_0x06c1
            r0 = 2131973904(0x7f135710, float:1.9584857E38)
            java.lang.String r0 = X.DbU.A0m(r6, r0)
        L_0x06c1:
            r8.setText(r0)
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A09
            if (r0 != 0) goto L_0x06d3
            r0 = 2131973902(0x7f13570e, float:1.9584853E38)
            java.lang.String r0 = X.DbU.A0m(r6, r0)
        L_0x06d3:
            r10.setText((java.lang.String) r0)
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L_0x06e7
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A0A
            r9.setText((java.lang.String) r0)
        L_0x06e7:
            java.lang.String r3 = X.K7Y.A00(r4, r6)
            if (r3 == 0) goto L_0x0909
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0909
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A08
            android.text.Editable r0 = A04(r11, r0)
            if (r0 != 0) goto L_0x08d1
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131973903(0x7f13570f, float:1.9584855E38)
            android.text.Spanned r0 = X.JTR.A0T(r1, r3, r0)
            goto L_0x08d1
        L_0x070c:
            java.lang.String r11 = X.K7Y.A00(r4, r6)
            r3 = 2131966520(0x7f133a38, float:1.956988E38)
            X.DbU.A1G(r8, r6, r3)
            r3 = 2131973902(0x7f13570e, float:1.9584853E38)
            A06(r6, r10, r3)
            r3 = 2131957170(0x7f1315b2, float:1.9550916E38)
            A06(r6, r9, r3)
            int r3 = r21.length()
            if (r17 == 0) goto L_0x073a
            if (r3 != 0) goto L_0x0732
            android.content.res.Resources r3 = A03(r4, r6, r1)
            r2 = 2131966527(0x7f133a3f, float:1.9569895E38)
            goto L_0x078c
        L_0x0732:
            android.content.res.Resources r3 = r4.getResources()
            r2 = 2131966528(0x7f133a40, float:1.9569897E38)
            goto L_0x07ad
        L_0x073a:
            if (r3 != 0) goto L_0x0756
            android.content.res.Resources r8 = A03(r4, r6, r1)
            r3 = 2131966526(0x7f133a3e, float:1.9569893E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
        L_0x0745:
            X.K7Y.A01(r8, r15, r1, r3)
            boolean r1 = A09(r6)
            if (r1 == 0) goto L_0x0762
            r1 = 2131975912(0x7f135ee8, float:1.958893E38)
            java.lang.String r1 = X.DbU.A0m(r6, r1)
            goto L_0x07cd
        L_0x0756:
            android.content.res.Resources r8 = r4.getResources()
            r3 = 2131966529(0x7f133a41, float:1.9569899E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r21}
            goto L_0x0745
        L_0x0762:
            android.text.Spanned r1 = A05(r4)
            goto L_0x07cd
        L_0x0767:
            java.lang.String r11 = X.K7Y.A00(r4, r6)
            r3 = 2131966520(0x7f133a38, float:1.956988E38)
            X.DbU.A1G(r8, r6, r3)
            r3 = 2131973902(0x7f13570e, float:1.9584853E38)
            A06(r6, r10, r3)
            r3 = 2131957170(0x7f1315b2, float:1.9550916E38)
            A06(r6, r9, r3)
            int r3 = r21.length()
            if (r17 == 0) goto L_0x07b2
            if (r3 != 0) goto L_0x07a6
            android.content.res.Resources r3 = A03(r4, r6, r1)
            r2 = 2131966537(0x7f133a49, float:1.9569915E38)
        L_0x078c:
            java.lang.Object[] r1 = new java.lang.Object[r0]
        L_0x078e:
            X.K7Y.A01(r3, r15, r1, r2)
            android.content.res.Resources r3 = r4.getResources()
            r2 = 2131972874(0x7f13530a, float:1.9582768E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.K7Y.A01(r3, r14, r1, r2)
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2131966530(0x7f133a42, float:1.95699E38)
            goto L_0x0a2d
        L_0x07a6:
            android.content.res.Resources r3 = r4.getResources()
            r2 = 2131966538(0x7f133a4a, float:1.9569917E38)
        L_0x07ad:
            java.lang.Object[] r1 = new java.lang.Object[]{r21}
            goto L_0x078e
        L_0x07b2:
            if (r3 != 0) goto L_0x07e1
            android.content.res.Resources r8 = A03(r4, r6, r1)
            r3 = 2131966536(0x7f133a48, float:1.9569913E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
        L_0x07bd:
            X.K7Y.A01(r8, r15, r1, r3)
            boolean r1 = A09(r6)
            if (r1 == 0) goto L_0x07dc
            r1 = 2131975912(0x7f135ee8, float:1.958893E38)
            java.lang.String r1 = X.DbU.A0m(r6, r1)
        L_0x07cd:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r14.setText(r1)
            if (r11 == 0) goto L_0x0a68
            int r1 = r11.length()
            if (r1 != 0) goto L_0x097f
            goto L_0x0a68
        L_0x07dc:
            android.text.Spanned r1 = A05(r4)
            goto L_0x07cd
        L_0x07e1:
            android.content.res.Resources r8 = r4.getResources()
            r3 = 2131966539(0x7f133a4b, float:1.9569919E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r21}
            goto L_0x07bd
        L_0x07ed:
            r11 = 2131966521(0x7f133a39, float:1.9569882E38)
            X.DbU.A1G(r8, r6, r11)
            r8 = 2131973905(0x7f135711, float:1.958486E38)
            A06(r6, r10, r8)
            r8 = 2131957170(0x7f1315b2, float:1.9550916E38)
            A06(r6, r9, r8)
            com.instagram.common.session.UserSession r8 = r6.getSession()
            java.lang.String r11 = X.C367158qH.A00(r4, r8, r3)
            int r3 = r21.length()
            if (r17 == 0) goto L_0x0821
            if (r3 != 0) goto L_0x0818
            android.content.res.Resources r3 = A03(r4, r6, r1)
            r2 = 2131966532(0x7f133a44, float:1.9569905E38)
            goto L_0x0a15
        L_0x0818:
            android.content.res.Resources r3 = r4.getResources()
            r2 = 2131966533(0x7f133a45, float:1.9569907E38)
            goto L_0x0a3b
        L_0x0821:
            if (r3 != 0) goto L_0x083e
            android.content.res.Resources r8 = A03(r4, r6, r1)
            r3 = 2131966531(0x7f133a43, float:1.9569903E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
        L_0x082c:
            X.K7Y.A01(r8, r15, r1, r3)
            boolean r1 = A09(r6)
            if (r1 == 0) goto L_0x084a
            r1 = 2131975912(0x7f135ee8, float:1.958893E38)
            java.lang.String r1 = X.DbU.A0m(r6, r1)
            goto L_0x0a5b
        L_0x083e:
            android.content.res.Resources r8 = r4.getResources()
            r3 = 2131966534(0x7f133a46, float:1.9569909E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r21}
            goto L_0x082c
        L_0x084a:
            android.text.Spanned r1 = A05(r4)
            goto L_0x0a5b
        L_0x0850:
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A0B
            if (r0 != 0) goto L_0x091d
            X.818 r1 = r6.A02
            if (r1 == 0) goto L_0x0a8d
            X.818 r0 = X.AnonymousClass818.IG_SELF_STORY_VIEW_FB_BUTTON
            if (r1 == r0) goto L_0x0864
            X.818 r0 = X.AnonymousClass818.IG_SELF_STORY_VIEW_OVERFLOW_MENU
            if (r1 != r0) goto L_0x0866
        L_0x0864:
            r20 = 1
        L_0x0866:
            com.instagram.common.session.UserSession r15 = r6.getSession()
            X.0Tu r14 = X.0Tu.A05
            r0 = 36612208196786484(0x82129c00031934, double:3.217046116952429E-306)
            long r16 = X.182.A01(r14, r15, r0)
            if (r20 == 0) goto L_0x0918
            r14 = 1
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x090f
            r1 = 2131973908(0x7f135714, float:1.9584865E38)
        L_0x0880:
            java.lang.String r0 = r6.getString(r1)
        L_0x0884:
            r8.setText(r0)
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A09
            if (r0 != 0) goto L_0x0896
            r0 = 2131973905(0x7f135711, float:1.958486E38)
            java.lang.String r0 = X.DbU.A0m(r6, r0)
        L_0x0896:
            r10.setText((java.lang.String) r0)
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L_0x08aa
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A0A
            r9.setText((java.lang.String) r0)
        L_0x08aa:
            com.instagram.common.session.UserSession r0 = r6.getSession()
            java.lang.String r3 = X.C367158qH.A00(r4, r0, r3)
            if (r3 == 0) goto L_0x0909
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0909
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A08
            android.text.Editable r0 = A04(r11, r0)
            if (r0 != 0) goto L_0x08d1
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131973906(0x7f135712, float:1.9584861E38)
            android.text.Spanned r0 = X.JTR.A0T(r1, r3, r0)
        L_0x08d1:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.setText(r0)
        L_0x08d6:
            X.LBI r0 = r6.A0D()
            java.lang.String r3 = r0.A00
            X.LBI r0 = r6.A0D()
            java.lang.String r1 = r0.A03
            X.GOg r2 = X.GOg.SIZE_24
            r0 = r18
            r6.A08(r0, r2, r3, r1)
            X.LBI r0 = r6.A0D()
            java.lang.String r1 = r0.A01
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A04
            r6.A08(r13, r2, r1, r0)
            X.LBI r0 = r6.A0D()
            java.lang.String r1 = r0.A02
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A05
            r6.A08(r12, r2, r1, r0)
            goto L_0x0292
        L_0x0909:
            X.8sM r0 = X.C368278sM.SUPPRESS
            A07(r0, r6, r2)
            goto L_0x08d6
        L_0x090f:
            r14 = 2
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            r1 = 2131973909(0x7f135715, float:1.9584867E38)
            if (r0 == 0) goto L_0x0880
        L_0x0918:
            r1 = 2131973907(0x7f135713, float:1.9584863E38)
            goto L_0x0880
        L_0x091d:
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A0B
            goto L_0x0884
        L_0x0925:
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A0B
            if (r0 != 0) goto L_0x0978
            com.instagram.common.session.UserSession r11 = r6.getSession()
            X.0Tu r3 = X.0Tu.A05
            r0 = 36612208196589875(0x82129c00001933, double:3.2170461168280926E-306)
            long r13 = X.182.A01(r3, r11, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r11 = 1
            if (r0 == 0) goto L_0x0974
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x096b
            r1 = 2131973908(0x7f135714, float:1.9584865E38)
        L_0x094b:
            java.lang.String r0 = r6.getString(r1)
        L_0x094f:
            r8.setText(r0)
            r0 = 2131962364(0x7f1329fc, float:1.9561451E38)
            A06(r6, r10, r0)
            r0 = 2131962365(0x7f1329fd, float:1.9561453E38)
            A06(r6, r9, r0)
            java.lang.String r11 = X.K7Y.A00(r4, r6)
            if (r11 == 0) goto L_0x09d1
            int r0 = r11.length()
            if (r0 != 0) goto L_0x097f
            goto L_0x09d1
        L_0x096b:
            r11 = 2
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            r1 = 2131973909(0x7f135715, float:1.9584867E38)
            if (r0 == 0) goto L_0x094b
        L_0x0974:
            r1 = 2131973904(0x7f135710, float:1.9584857E38)
            goto L_0x094b
        L_0x0978:
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A0B
            goto L_0x094f
        L_0x097f:
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2131973903(0x7f13570f, float:1.9584855E38)
            goto L_0x0a88
        L_0x0988:
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A0B
            if (r0 != 0) goto L_0x09e5
            com.instagram.common.session.UserSession r12 = r6.getSession()
            X.0Tu r11 = X.0Tu.A05
            r0 = 36612208196917557(0x82129c00051935, double:3.21704611703532E-306)
            long r13 = X.182.A01(r11, r12, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r11 = 1
            if (r0 == 0) goto L_0x09e1
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x09d8
            r1 = 2131973908(0x7f135714, float:1.9584865E38)
        L_0x09ae:
            java.lang.String r0 = r6.getString(r1)
        L_0x09b2:
            r8.setText(r0)
            r0 = 2131974518(0x7f135976, float:1.9586102E38)
            A06(r6, r10, r0)
            r0 = 2131974519(0x7f135977, float:1.9586104E38)
            A06(r6, r9, r0)
            com.instagram.common.session.UserSession r0 = r6.getSession()
            java.lang.String r11 = X.C367158qH.A00(r4, r0, r3)
            if (r11 == 0) goto L_0x09d1
            int r0 = r11.length()
            if (r0 != 0) goto L_0x0a81
        L_0x09d1:
            X.8sM r0 = X.C368278sM.SUPPRESS
            A07(r0, r6, r2)
            goto L_0x0292
        L_0x09d8:
            r11 = 2
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            r1 = 2131973909(0x7f135715, float:1.9584867E38)
            if (r0 == 0) goto L_0x09ae
        L_0x09e1:
            r1 = 2131973907(0x7f135713, float:1.9584863E38)
            goto L_0x09ae
        L_0x09e5:
            X.LBI r0 = r6.A0D()
            java.lang.String r0 = r0.A0B
            goto L_0x09b2
        L_0x09ec:
            com.instagram.common.session.UserSession r11 = r6.getSession()
            java.lang.String r11 = X.C367158qH.A00(r4, r11, r3)
            r3 = 2131966521(0x7f133a39, float:1.9569882E38)
            X.DbU.A1G(r8, r6, r3)
            r3 = 2131973905(0x7f135711, float:1.958486E38)
            A06(r6, r10, r3)
            r3 = 2131957170(0x7f1315b2, float:1.9550916E38)
            A06(r6, r9, r3)
            int r3 = r21.length()
            if (r17 == 0) goto L_0x0a40
            if (r3 != 0) goto L_0x0a34
            android.content.res.Resources r3 = A03(r4, r6, r1)
            r2 = 2131966523(0x7f133a3b, float:1.9569887E38)
        L_0x0a15:
            java.lang.Object[] r1 = new java.lang.Object[r0]
        L_0x0a17:
            X.K7Y.A01(r3, r15, r1, r2)
            android.content.res.Resources r3 = r4.getResources()
            r2 = 2131972874(0x7f13530a, float:1.9582768E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.K7Y.A01(r3, r14, r1, r2)
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2131966535(0x7f133a47, float:1.956991E38)
        L_0x0a2d:
            java.lang.Object[] r0 = new java.lang.Object[r0]
        L_0x0a2f:
            X.K7Y.A01(r2, r7, r0, r1)
            goto L_0x0292
        L_0x0a34:
            android.content.res.Resources r3 = r4.getResources()
            r2 = 2131966524(0x7f133a3c, float:1.9569889E38)
        L_0x0a3b:
            java.lang.Object[] r1 = new java.lang.Object[]{r21}
            goto L_0x0a17
        L_0x0a40:
            if (r3 != 0) goto L_0x0a75
            android.content.res.Resources r8 = A03(r4, r6, r1)
            r3 = 2131966522(0x7f133a3a, float:1.9569884E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
        L_0x0a4b:
            X.K7Y.A01(r8, r15, r1, r3)
            boolean r1 = A09(r6)
            if (r1 == 0) goto L_0x0a70
            r1 = 2131975912(0x7f135ee8, float:1.958893E38)
            java.lang.String r1 = X.DbU.A0m(r6, r1)
        L_0x0a5b:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r14.setText(r1)
            if (r11 == 0) goto L_0x0a68
            int r1 = r11.length()
            if (r1 != 0) goto L_0x0a81
        L_0x0a68:
            android.content.res.Resources r2 = A03(r4, r6, r2)
            r1 = 2131976099(0x7f135fa3, float:1.9589309E38)
            goto L_0x0a2d
        L_0x0a70:
            android.text.Spanned r1 = A05(r4)
            goto L_0x0a5b
        L_0x0a75:
            android.content.res.Resources r8 = r4.getResources()
            r3 = 2131966525(0x7f133a3d, float:1.956989E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r21}
            goto L_0x0a4b
        L_0x0a81:
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2131973906(0x7f135712, float:1.9584861E38)
        L_0x0a88:
            java.lang.Object[] r0 = new java.lang.Object[]{r11}
            goto L_0x0a2f
        L_0x0a8d:
            java.lang.String r0 = "entrypoint"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KYc.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static Resources A03(Context context, KYc kYc, String str) {
        A07(C368278sM.SUPPRESS, kYc, str);
        return context.getResources();
    }

    public static final Editable A04(C67065Mhg mhg, String str) {
        if (str == null) {
            return null;
        }
        Editable newEditable = Editable.Factory.getInstance().newEditable(str);
        0qQ.A0A(newEditable);
        mhg.A01(newEditable, true);
        return newEditable;
    }

    private final void A08(IgImageView igImageView, GOg gOg, String str, String str2) {
        C52337GOf gOf;
        Integer A04;
        int intValue;
        if (str != null && str2 != null) {
            XDU A03 = C14091Tpi.A03(str);
            if (str2.equals("outline")) {
                gOf = C52337GOf.OUTLINE;
            } else {
                gOf = C52337GOf.FILLED;
            }
            if (A03 != null && (A04 = C14091Tpi.A04(A03, gOg, gOf)) != null && (intValue = A04.intValue()) != 0) {
                DbU.A13(requireContext(), igImageView, intValue);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [X.LBI, java.lang.Object] */
    public KYc(Bundle bundle, UserSession userSession) {
        this.A04 = userSession;
        AnonymousClass818 valueOf = AnonymousClass818.valueOf(C320236s2.A01(bundle, "args_entrypoint"));
        0qQ.A0B(valueOf, 0);
        this.A02 = valueOf;
        this.A00 = bundle.getInt("args_num_of_views", -1);
        this.A09 = bundle.getBoolean("args_is_after_fbc", false);
        JTU.A0k(bundle, this);
        this.A01 = bundle.getInt("arg_nux_attempt_qpl_instance_key", 0);
        CallerContext callerContext = C62052KYa.A02;
        C62052KYa A002 = LRS.A00(getSession());
        MUE mue = A002.A05;
        if (mue == null) {
            mue = new C65639LxG(A002);
            A002.A05 = mue;
        }
        this.A05 = mue;
        AnonymousClass819 valueOf2 = AnonymousClass819.valueOf(JTP.A0m(bundle, "args_upsell_variant"));
        0qQ.A0B(valueOf2, 0);
        this.A03 = valueOf2;
        String string = bundle.getString("args_title");
        String string2 = bundle.getString("args_body_icon_name_1");
        String string3 = bundle.getString("args_body_icon_variant_1");
        String string4 = bundle.getString("args_body_markdown_text_1");
        String string5 = bundle.getString("args_body_icon_name_2");
        String string6 = bundle.getString("args_body_icon_variant_2");
        String string7 = bundle.getString("args_body_markdown_text_2");
        String string8 = bundle.getString("args_body_icon_name_3");
        String string9 = bundle.getString("args_body_icon_variant_3");
        String string10 = bundle.getString("args_body_markdown_text_3");
        String string11 = bundle.getString("args_primary_button_text");
        String string12 = bundle.getString("args_secondary_button_text");
        ? obj = new Object();
        obj.A0B = string;
        obj.A00 = string2;
        obj.A03 = string3;
        obj.A06 = string4;
        obj.A01 = string5;
        obj.A04 = string6;
        obj.A07 = string7;
        obj.A02 = string8;
        obj.A05 = string9;
        obj.A08 = string10;
        obj.A09 = string11;
        obj.A0A = string12;
        this.A06 = obj;
        this.A00 = AnonymousClass0eN.A00(0eO.A02, new C20699WxV(this, 9));
    }

    public static int A02(K7Y k7y) {
        if (C63431Kwr.A00(k7y.getSession()).booleanValue()) {
            return R.id.crossposting_unified_onboarding_first_icon_v2;
        }
        return R.id.crossposting_unified_onboarding_first_icon;
    }

    public static void A06(Fragment fragment, IgdsButton igdsButton, int i) {
        igdsButton.setText(fragment.getString(i));
    }

    public static final void A07(C368278sM r7, KYc kYc, String str) {
        UserSession A0C = kYc.getSession();
        AnonymousClass818 r4 = kYc.A02;
        if (r4 != null) {
            AnonymousClass819 A0B = kYc.A0B();
            AnonymousClass81A A0O = JTO.A0O();
            A0O.A0A(Boolean.valueOf(kYc.A09));
            A0O.A09(Boolean.valueOf(C363378jd.A08.A04(A01, kYc.getSession())));
            JTT.A1C(A0O, (long) kYc.A00);
            A0O.A06("ig_media_id", kYc.A07);
            JTQ.A19(A0O, "waterfall_id", kYc.A08, str);
            C368288sN.A00(r4, r7, A0B, A0O, A0C);
            return;
        }
        0qQ.A0F("entrypoint");
        throw AnonymousClass00P.createAndThrow();
    }

    public static boolean A09(K7Y k7y) {
        return 27u.A00(k7y.getSession()).A01();
    }

    public static boolean A0A(K7Y k7y) {
        return C63432Kws.A00(k7y.getSession()).booleanValue();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1323778769);
        super.onCreate(bundle);
        CallerContext callerContext = C62052KYa.A02;
        C62052KYa A002 = LRS.A00(getSession());
        MUE mue = A002.A05;
        if (mue == null) {
            mue = new C65639LxG(A002);
            A002.A05 = mue;
        }
        this.A05 = mue;
        AnonymousClass0fD.A09(449555493, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1810035335);
        0qQ.A0B(layoutInflater, 0);
        boolean A0A = A0A(this);
        int i = R.layout.crossposting_unified_onboarding_bottom_sheet_upsell;
        if (A0A) {
            i = R.layout.crossposting_unified_onboarding_bottom_sheet_upsell_igds;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        AnonymousClass0fD.A09(-643051839, A022);
        return inflate;
    }
}
