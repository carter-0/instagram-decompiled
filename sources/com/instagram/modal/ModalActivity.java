package com.instagram.modal;

import X.002;
import X.0eO;
import X.0hq;
import X.18g;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass2Rc;
import X.AnonymousClass3GL;
import X.AnonymousClass6W9;
import X.AnonymousClass6WB;
import X.C229102mq;
import X.C238833Dp;
import X.C309516Yo;
import X.C340057kd;
import X.C59843JaJ;
import X.C61170le;
import X.C61190ls;
import X.C62880wX;
import X.C638918c;
import X.C9153RRe;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import java.util.HashSet;
import java.util.Set;

public class ModalActivity extends BaseFragmentActivity {
    public static final int[] A06;
    public static final int[] A07;
    public static final int[] A08;
    public View A00;
    public AnonymousClass0wW A01;
    public String A02;
    public Boolean A03 = true;
    public final Set A04 = new HashSet();
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass6W9(this));

    static {
        int[] iArr;
        int[] iArr2 = {0, 0, 0, 0};
        A08 = iArr2;
        boolean z = AnonymousClass2Rc.A00;
        if (z) {
            iArr = new int[]{R.anim.fade_in, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.fade_out};
        } else {
            iArr = iArr2;
        }
        A06 = iArr;
        if (z) {
            iArr2 = new int[]{R.anim.fade_in, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.modal_empty_animation};
        }
        A07 = iArr2;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.instagram.modal.ModalActivity, android.content.Context, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cf A[Catch:{ RuntimeException -> 0x005d, all -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00da A[Catch:{ RuntimeException -> 0x005d, all -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ee A[Catch:{ RuntimeException -> 0x005d, all -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0107 A[Catch:{ RuntimeException -> 0x005d, all -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0108 A[Catch:{ RuntimeException -> 0x005d, all -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0159 A[Catch:{ RuntimeException -> 0x005d, all -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0169 A[Catch:{ RuntimeException -> 0x005d, all -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016a A[Catch:{ RuntimeException -> 0x005d, all -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0174 A[Catch:{ RuntimeException -> 0x005d, all -> 0x0197 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r5 = 0
            java.lang.String r9 = "navigation_bar_color"
            java.lang.String r10 = "display_cutout_mode"
            java.lang.String r8 = "status_bar_color"
            r0 = 974291974(0x3a128406, float:5.589131E-4)
            int r4 = X.AnonymousClass0fD.A00(r0)
            android.os.Bundle r11 = X.C66588MXu.A00(r14)
            java.lang.String r3 = "ModalActivity.onCreate"
            r0 = -1048962553(0xffffffffc17a1a07, float:-15.631354)
            X.0fh.A01(r3, r0)
            r2 = 0
            X.08y r0 = X.09i.A0A     // Catch:{ all -> 0x0197 }
            X.0wW r0 = r0.A05(r13)     // Catch:{ all -> 0x0197 }
            r13.A01 = r0     // Catch:{ all -> 0x0197 }
            android.content.Intent r1 = r13.getIntent()     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "fragment_animation"
            int[] r6 = r1.getIntArrayExtra(r0)     // Catch:{ all -> 0x0197 }
            if (r6 == 0) goto L_0x004e
            int r1 = r6.length     // Catch:{ all -> 0x0197 }
            r0 = 4
            if (r1 != r0) goto L_0x004e
        L_0x0033:
            X.0eM r0 = r13.A05     // Catch:{ all -> 0x0197 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0197 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0197 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0197 }
            if (r0 != 0) goto L_0x0069
            android.content.Intent r7 = r13.getIntent()     // Catch:{ all -> 0x0197 }
            java.lang.String r1 = "fragment_arguments"
            android.os.Bundle r0 = r7.getBundleExtra(r1)     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x0069
            goto L_0x0050
        L_0x004e:
            r6 = 0
            goto L_0x0033
        L_0x0050:
            android.os.Bundle r1 = r7.getBundleExtra(r1)     // Catch:{ RuntimeException -> 0x005d }
            java.lang.String r0 = "DirectFragment.DIRECT_THREAD_FRAGMENT_ARGUMENT_CREATE_BACKSTACK"
            boolean r0 = r1.getBoolean(r0)     // Catch:{ RuntimeException -> 0x005d }
            if (r0 == 0) goto L_0x0069
            goto L_0x0075
        L_0x005d:
            r7 = move-exception
            r0 = 1308(0x51c, float:1.833E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x0197 }
            java.lang.String r1 = "Swallowing RuntimeException related to unmarshalling"
            X.0KC.A0F(r0, r1, r7)     // Catch:{ all -> 0x0197 }
        L_0x0069:
            X.0wX r12 = X.C61170le.A00     // Catch:{ all -> 0x0197 }
            X.18g r1 = X.C638918c.A01(r12)     // Catch:{ all -> 0x0197 }
            X.0wW r0 = r13.A01     // Catch:{ all -> 0x0197 }
            r1.A0J(r13, r0)     // Catch:{ all -> 0x0197 }
            goto L_0x008a
        L_0x0075:
            boolean r0 = r13.isTaskRoot()     // Catch:{ all -> 0x0197 }
            if (r0 != 0) goto L_0x0069
            X.0wX r12 = X.C61170le.A00     // Catch:{ all -> 0x0197 }
            X.18g r7 = X.C638918c.A01(r12)     // Catch:{ all -> 0x0197 }
            android.content.Intent r1 = r13.getIntent()     // Catch:{ all -> 0x0197 }
            X.0wW r0 = r13.A01     // Catch:{ all -> 0x0197 }
            r7.A0I(r13, r1, r0)     // Catch:{ all -> 0x0197 }
        L_0x008a:
            X.18g r7 = X.C638918c.A01(r12)     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "_begin"
            java.lang.String r1 = X.002.A0R(r3, r0)     // Catch:{ all -> 0x0197 }
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r7.A02     // Catch:{ all -> 0x0197 }
            r7.A0O(r0, r1)     // Catch:{ all -> 0x0197 }
            r5 = r3
            r2 = 1
            android.content.Intent r1 = r13.getIntent()     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "do_not_inflate_action_bar"
            r7 = 0
            boolean r0 = r1.getBooleanExtra(r0, r7)     // Catch:{ all -> 0x0197 }
            r13.A06 = r0     // Catch:{ all -> 0x0197 }
            android.content.Intent r1 = r13.getIntent()     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "will_fit_system_windows"
            boolean r0 = r1.getBooleanExtra(r0, r2)     // Catch:{ all -> 0x0197 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0197 }
            r13.A03 = r0     // Catch:{ all -> 0x0197 }
            super.onCreate(r11)     // Catch:{ all -> 0x0197 }
            r13.A0h()     // Catch:{ all -> 0x0197 }
            r13.setupColorTheme()     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "translucent_navigation_bar"
            boolean r11 = r1.getBooleanExtra(r0, r7)     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "will_hide_system_ui"
            boolean r0 = r1.getBooleanExtra(r0, r7)     // Catch:{ all -> 0x0197 }
            if (r11 == 0) goto L_0x0108
            X.AnonymousClass2uJ.A03(r13)     // Catch:{ all -> 0x0197 }
        L_0x00d2:
            boolean r0 = r1.hasExtra(r8)     // Catch:{ all -> 0x0197 }
            r11 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 == 0) goto L_0x00e8
            int r8 = r1.getIntExtra(r8, r11)     // Catch:{ all -> 0x0197 }
            android.view.Window r0 = r13.getWindow()     // Catch:{ all -> 0x0197 }
            r0.getClass()     // Catch:{ all -> 0x0197 }
            r0.setStatusBarColor(r8)     // Catch:{ all -> 0x0197 }
        L_0x00e8:
            boolean r0 = r1.hasExtra(r10)     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x0100
            int r8 = r1.getIntExtra(r10, r7)     // Catch:{ all -> 0x0197 }
            android.view.Window r0 = r13.getWindow()     // Catch:{ all -> 0x0197 }
            r0.getClass()     // Catch:{ all -> 0x0197 }
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()     // Catch:{ all -> 0x0197 }
            X.C61290mR.A06(r0, r8)     // Catch:{ all -> 0x0197 }
        L_0x0100:
            boolean r8 = X.AnonymousClass1GD.A03()     // Catch:{ all -> 0x0197 }
            r0 = 0
            if (r8 != 0) goto L_0x0150
            goto L_0x014f
        L_0x0108:
            if (r0 != 0) goto L_0x00d2
            boolean r0 = X.0lz.A02(r13)     // Catch:{ all -> 0x0197 }
            if (r0 != 0) goto L_0x0124
            r0 = 2131435212(0x7f0b1ecc, float:1.849226E38)
            android.view.View r11 = r13.findViewById(r0)     // Catch:{ all -> 0x0197 }
            r13.A00 = r11     // Catch:{ all -> 0x0197 }
            if (r11 == 0) goto L_0x0124
            java.lang.Boolean r0 = r13.A03     // Catch:{ all -> 0x0197 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0197 }
            r11.setFitsSystemWindows(r0)     // Catch:{ all -> 0x0197 }
        L_0x0124:
            java.lang.Boolean r0 = r13.A03     // Catch:{ all -> 0x0197 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0197 }
            if (r0 != 0) goto L_0x0134
            X.TsK r0 = new X.TsK     // Catch:{ all -> 0x0197 }
            r0.<init>(r13)     // Catch:{ all -> 0x0197 }
            X.C226112fe.A00(r13, r0, r7)     // Catch:{ all -> 0x0197 }
        L_0x0134:
            r11 = 1280(0x500, float:1.794E-42)
            java.lang.String r0 = "will_hide_navigation_bar"
            boolean r0 = r1.getBooleanExtra(r0, r7)     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x0140
            r11 = 1792(0x700, float:2.511E-42)
        L_0x0140:
            android.view.Window r0 = r13.getWindow()     // Catch:{ all -> 0x0197 }
            r0.getClass()     // Catch:{ all -> 0x0197 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x0197 }
            r0.setSystemUiVisibility(r11)     // Catch:{ all -> 0x0197 }
            goto L_0x00d2
        L_0x014f:
            r0 = 1
        L_0x0150:
            X.2db.A06(r13, r0)     // Catch:{ all -> 0x0197 }
            boolean r0 = r1.hasExtra(r9)     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x016a
            int r0 = r1.getIntExtra(r9, r11)     // Catch:{ all -> 0x0197 }
            X.AnonymousClass2uJ.A04(r13, r0)     // Catch:{ all -> 0x0197 }
        L_0x0160:
            java.lang.String r0 = "lock_to_portrait"
            boolean r1 = r1.getBooleanExtra(r0, r7)     // Catch:{ all -> 0x0197 }
            r0 = 0
            if (r1 != 0) goto L_0x016f
            goto L_0x016e
        L_0x016a:
            X.AnonymousClass2uJ.A01(r13)     // Catch:{ all -> 0x0197 }
            goto L_0x0160
        L_0x016e:
            r0 = 1
        L_0x016f:
            r13.A0l(r0)     // Catch:{ all -> 0x0197 }
            if (r6 == 0) goto L_0x017b
            r1 = r6[r7]     // Catch:{ all -> 0x0197 }
            r0 = r6[r2]     // Catch:{ all -> 0x0197 }
            r13.overridePendingTransition(r1, r0)     // Catch:{ all -> 0x0197 }
        L_0x017b:
            r0 = -112331762(0xfffffffff94df40e, float:-6.683568E34)
            X.0fh.A00(r0)
            X.18g r2 = X.C638918c.A01(r12)
            java.lang.String r0 = "_end"
            java.lang.String r1 = X.002.A0R(r3, r0)
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r2.A02
            r2.A0O(r0, r1)
            r0 = 1833925813(0x6d4f7cb5, float:4.013385E27)
            X.AnonymousClass0fD.A07(r0, r4)
            return
        L_0x0197:
            r3 = move-exception
            r0 = 1823831325(0x6cb5751d, float:1.754949E27)
            X.0fh.A00(r0)
            if (r2 == 0) goto L_0x01b1
            X.0wX r0 = X.C61170le.A00
            X.18g r2 = X.C638918c.A01(r0)
            java.lang.String r0 = "_end"
            java.lang.String r1 = X.002.A0R(r5, r0)
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r2.A02
            r2.A0O(r0, r1)
        L_0x01b1:
            r0 = 23611305(0x16847a9, float:4.2663084E-38)
            X.AnonymousClass0fD.A07(r0, r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.modal.ModalActivity.onCreate(android.os.Bundle):void");
    }

    public final void configureWindowInsetsAndroid15() {
        if (this.A03.booleanValue()) {
            super.configureWindowInsetsAndroid15();
        }
    }

    public final C340057kd getGnvGestureHandler() {
        if (!AnonymousClass3GL.A02(this.A01)) {
            return null;
        }
        C340057kd A002 = C340057kd.A00(this.A01);
        C238833Dp A003 = C238833Dp.A00(this.A01);
        A002.A03(A003);
        A002.A02(A003);
        return A002;
    }

    public AnonymousClass0wW getSession() {
        return this.A01;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v134, resolved type: android.app.Activity} */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0545, code lost:
        if (X.C226122ff.A03() == false) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0547, code lost:
        r2 = X.C226122ff.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x054b, code lost:
        r0.A0G = new android.graphics.Rect(0, 0, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0554, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0809, code lost:
        r0.A16 = false;
        r0.A10 = true;
        r0.A0k = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x088f, code lost:
        r5.A00 = r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x08d3, code lost:
        r0.A03 = 0.5f;
        r0.A0a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x097c, code lost:
        X.1Yk.A00(r1, r4, r2, (X.C331157Pu) null, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0980, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0a17, code lost:
        r0.A0a = java.lang.Boolean.valueOf(r2);
        r0.A10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0c0f, code lost:
        r0.A0d = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0c69, code lost:
        r0.A16 = false;
        r0.A10 = true;
        r0.A0k = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0c97, code lost:
        r7.setArguments(r6);
        r0.A16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0c9c, code lost:
        r0.A10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0c9f, code lost:
        r5.A00 = r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0ca5, code lost:
        r5.A00.A02(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x090f  */
    /* JADX WARNING: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r4 = r22
            r0 = r23
            super.onPostCreate(r0)
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "bottom_sheet"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0caa
            X.1Yk r5 = X.1Yk.A01
            if (r5 == 0) goto L_0x0c79
            X.0wW r2 = r4.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r14 = "fragment_arguments"
            android.os.Bundle r1 = r0.getBundleExtra(r14)
            r1.getClass()
            java.lang.String r0 = "bottom_sheet_content_fragment"
            java.lang.String r8 = r1.getString(r0)
            java.lang.String r9 = "iab_session_id"
            java.lang.String r7 = r1.getString(r9)
            java.lang.String r12 = "ad_id"
            r1.getString(r12)
            if (r8 == 0) goto L_0x0c71
            X.7Pr r0 = new X.7Pr
            r0.<init>(r2)
            java.lang.String r10 = "bottom_sheet_title"
            java.lang.String r3 = r1.getString(r10)
            r0.A0d = r3
            java.lang.String r6 = "finish_host_activity_on_dismissed"
            r3 = 0
            boolean r6 = r1.getBoolean(r6, r3)
            r0.A10 = r6
            r21 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1697331178: goto L_0x02a3;
                case -1686148540: goto L_0x0293;
                case -1591943428: goto L_0x0283;
                case -1219817557: goto L_0x0273;
                case -1110735954: goto L_0x0263;
                case -1056252145: goto L_0x0257;
                case -958781094: goto L_0x0247;
                case -906172105: goto L_0x023b;
                case -683006444: goto L_0x022b;
                case -589943698: goto L_0x021b;
                case -409684267: goto L_0x020b;
                case 41854264: goto L_0x01fb;
                case 93832589: goto L_0x01ef;
                case 95317024: goto L_0x01df;
                case 336903147: goto L_0x01cf;
                case 612094377: goto L_0x01c3;
                case 724050716: goto L_0x01b3;
                case 745783643: goto L_0x01a7;
                case 782280939: goto L_0x0197;
                case 880031440: goto L_0x0187;
                case 884871936: goto L_0x0177;
                case 961040044: goto L_0x0167;
                case 1061998152: goto L_0x0157;
                case 1082739744: goto L_0x0147;
                case 1084380233: goto L_0x0137;
                case 1128454515: goto L_0x012b;
                case 1174031640: goto L_0x011b;
                case 1492730014: goto L_0x010b;
                case 1508521767: goto L_0x00fb;
                case 1558628473: goto L_0x00eb;
                case 1572165302: goto L_0x00db;
                case 1682498069: goto L_0x00cb;
                case 1757072946: goto L_0x00bc;
                case 1761075538: goto L_0x00b1;
                case 1980888351: goto L_0x00a2;
                case 2021362345: goto L_0x0093;
                case 2058352428: goto L_0x0084;
                case 2113621640: goto L_0x0075;
                default: goto L_0x0058;
            }
        L_0x0058:
            java.lang.String r11 = "No valid bottom sheet content fragment specified"
            java.lang.String r8 = "external_link_thread_viewer_session_id"
            java.lang.String r20 = "ARG_MEDIA_ID"
            java.lang.String r19 = "ARG_MODULE_NAME"
            java.lang.String r18 = "ARG_WATERFALL_ID"
            java.lang.String r17 = "ARG_UPSELL_VARIANT"
            java.lang.String r16 = "ARG_UPSELL_ENTRY_POINT"
            java.lang.String r15 = "ARG_MEDIA_SOURCE_TYPE"
            java.lang.String r13 = "product"
            java.lang.String r6 = "entry_point"
            switch(r21) {
                case 0: goto L_0x0b38;
                case 1: goto L_0x03ae;
                case 2: goto L_0x0acb;
                case 3: goto L_0x0a85;
                case 4: goto L_0x0a40;
                case 5: goto L_0x0a21;
                case 6: goto L_0x09ec;
                case 7: goto L_0x098b;
                case 8: goto L_0x0981;
                case 9: goto L_0x0c83;
                case 10: goto L_0x097a;
                case 11: goto L_0x0959;
                case 12: goto L_0x08e0;
                case 13: goto L_0x0340;
                case 14: goto L_0x03a4;
                case 15: goto L_0x08a7;
                case 16: goto L_0x0897;
                case 17: goto L_0x0c52;
                case 18: goto L_0x0812;
                case 19: goto L_0x07e3;
                case 20: goto L_0x0738;
                case 21: goto L_0x0734;
                case 22: goto L_0x0c3d;
                case 23: goto L_0x06ec;
                case 24: goto L_0x0c13;
                case 25: goto L_0x0695;
                case 26: goto L_0x0628;
                case 27: goto L_0x0bef;
                case 28: goto L_0x0ba8;
                case 29: goto L_0x05bd;
                case 30: goto L_0x0b58;
                case 31: goto L_0x055e;
                case 32: goto L_0x04e4;
                case 33: goto L_0x049e;
                case 34: goto L_0x0458;
                case 35: goto L_0x0419;
                case 36: goto L_0x02b3;
                case 37: goto L_0x03c8;
                default: goto L_0x006f;
            }
        L_0x006f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        L_0x0075:
            r6 = 1397(0x575, float:1.958E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 37
            goto L_0x0058
        L_0x0084:
            r6 = 3004(0xbbc, float:4.21E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 36
            goto L_0x0058
        L_0x0093:
            r6 = 3537(0xdd1, float:4.956E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 35
            goto L_0x0058
        L_0x00a2:
            r6 = 2591(0xa1f, float:3.631E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 34
            goto L_0x0058
        L_0x00b1:
            java.lang.String r6 = "reels_share_to_fb_upsell"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 33
            goto L_0x0058
        L_0x00bc:
            r6 = 760(0x2f8, float:1.065E-42)
            java.lang.String r6 = X.C66579MXk.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 32
            goto L_0x0058
        L_0x00cb:
            r6 = 1810(0x712, float:2.536E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 31
            goto L_0x0058
        L_0x00db:
            r6 = 653(0x28d, float:9.15E-43)
            java.lang.String r6 = X.C66579MXk.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 30
            goto L_0x0058
        L_0x00eb:
            r6 = 4725(0x1275, float:6.621E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 29
            goto L_0x0058
        L_0x00fb:
            r6 = 3697(0xe71, float:5.18E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 28
            goto L_0x0058
        L_0x010b:
            r6 = 654(0x28e, float:9.16E-43)
            java.lang.String r6 = X.C66579MXk.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 27
            goto L_0x0058
        L_0x011b:
            r6 = 796(0x31c, float:1.115E-42)
            java.lang.String r6 = X.C66579MXk.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 26
            goto L_0x0058
        L_0x012b:
            java.lang.String r6 = "link_history_opt_in_nux"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 25
            goto L_0x0058
        L_0x0137:
            r6 = 3861(0xf15, float:5.41E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 24
            goto L_0x0058
        L_0x0147:
            r6 = 1249(0x4e1, float:1.75E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 23
            goto L_0x0058
        L_0x0157:
            r6 = 3011(0xbc3, float:4.22E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 22
            goto L_0x0058
        L_0x0167:
            r6 = 889(0x379, float:1.246E-42)
            java.lang.String r6 = X.Pxd.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 21
            goto L_0x0058
        L_0x0177:
            r6 = 36
            java.lang.String r6 = X.C66579MXk.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 20
            goto L_0x0058
        L_0x0187:
            r6 = 4017(0xfb1, float:5.629E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 19
            goto L_0x0058
        L_0x0197:
            r6 = 824(0x338, float:1.155E-42)
            java.lang.String r6 = X.Pxd.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 18
            goto L_0x0058
        L_0x01a7:
            java.lang.String r6 = "direct_invite_model_nux"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 17
            goto L_0x0058
        L_0x01b3:
            r6 = 4184(0x1058, float:5.863E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 16
            goto L_0x0058
        L_0x01c3:
            java.lang.String r6 = "direct_share_sheet"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 15
            goto L_0x0058
        L_0x01cf:
            r6 = 2958(0xb8e, float:4.145E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 14
            goto L_0x0058
        L_0x01df:
            r6 = 123(0x7b, float:1.72E-43)
            java.lang.String r6 = X.C66579MXk.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 13
            goto L_0x0058
        L_0x01ef:
            java.lang.String r6 = "bloks"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 12
            goto L_0x0058
        L_0x01fb:
            r6 = 3007(0xbbf, float:4.214E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 11
            goto L_0x0058
        L_0x020b:
            r6 = 890(0x37a, float:1.247E-42)
            java.lang.String r6 = X.Pxd.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 10
            goto L_0x0058
        L_0x021b:
            r6 = 2485(0x9b5, float:3.482E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 9
            goto L_0x0058
        L_0x022b:
            r6 = 1241(0x4d9, float:1.739E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 8
            goto L_0x0058
        L_0x023b:
            java.lang.String r6 = "primer_bottom_sheet"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 7
            goto L_0x0058
        L_0x0247:
            r6 = 261(0x105, float:3.66E-43)
            java.lang.String r6 = X.C66579MXk.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 6
            goto L_0x0058
        L_0x0257:
            java.lang.String r6 = "NEW_REMIX_INTRODUCTION_NUX_MANAGER"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 5
            goto L_0x0058
        L_0x0263:
            r6 = 853(0x355, float:1.195E-42)
            java.lang.String r6 = X.C66579MXk.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 4
            goto L_0x0058
        L_0x0273:
            r6 = 3017(0xbc9, float:4.228E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 3
            goto L_0x0058
        L_0x0283:
            r6 = 3083(0xc0b, float:4.32E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 2
            goto L_0x0058
        L_0x0293:
            r6 = 2589(0xa1d, float:3.628E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 1
            goto L_0x0058
        L_0x02a3:
            r6 = 4148(0x1034, float:5.813E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0058
            r21 = 0
            goto L_0x0058
        L_0x02b3:
            r6 = 3003(0xbbb, float:4.208E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            android.os.Parcelable r11 = r1.getParcelable(r6)
            r11.getClass()
            r6 = 902(0x386, float:1.264E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r6)
            java.lang.String r10 = r1.getString(r9)
            X.0qQ.A0B(r2, r3)
            r8 = 1
            java.lang.String r7 = "account_theme"
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r1 = 2199(0x897, float:3.081E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putParcelable(r1, r11)
            r1 = 105(0x69, float:1.47E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putInt(r1, r3)
            r1 = 903(0x387, float:1.265E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putBoolean(r1, r3)
            r1 = 218(0xda, float:3.05E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putBoolean(r1, r3)
            r1 = 2202(0x89a, float:3.086E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putBoolean(r1, r3)
            r1 = 32
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putInt(r1, r3)
            r1 = 904(0x388, float:1.267E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putBoolean(r1, r8)
            r1 = 219(0xdb, float:3.07E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putString(r1, r7)
            r6.putString(r9, r10)
            X.AnonymousClass0Dg.A00(r6, r2)
            X.NKI r7 = new X.NKI
            r7.<init>()
            r7.setArguments(r6)
            r0.A16 = r3
            r0.A10 = r8
            r0.A0k = r8
            X.7Pu r0 = r0.A00()
            r5.A00 = r0
            X.P1y r0 = new X.P1y
            r0.<init>(r5)
            r7.A05 = r0
            goto L_0x0ca5
        L_0x0340:
            r6 = 1694(0x69e, float:2.374E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            java.lang.String r9 = r1.getString(r6)
            r6 = 1693(0x69d, float:2.372E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            java.lang.String r10 = r1.getString(r6)
            r6 = 3754(0xeaa, float:5.26E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            boolean r8 = r1.getBoolean(r6)
            X.0qQ.A0B(r2, r3)
            r1 = 1
            X.0qQ.A0B(r9, r1)
            r1 = 2
            X.0qQ.A0B(r10, r1)
            X.NJd r7 = new X.NJd
            r7.<init>()
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r1 = 514(0x202, float:7.2E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r6.putString(r1, r10)
            r1 = 515(0x203, float:7.22E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r6.putString(r1, r9)
            r1 = 513(0x201, float:7.19E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r6.putBoolean(r1, r8)
            X.AnonymousClass0Dg.A00(r6, r2)
            r7.setArguments(r6)
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.A0a = r1
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r0.A03 = r1
            r0.A0T = r7
            goto L_0x0541
        L_0x03a4:
            com.facebook.common.callercontext.CallerContext r0 = X.C62052KYa.A02
            X.KYa r0 = X.LRS.A00(r2)
            r0.A07()
            return
        L_0x03ae:
            X.AnonymousClass9B9.A00()
            X.E0k r7 = new X.E0k
            r7.<init>()
            android.os.Bundle r8 = r1.getBundle(r14)
            X.Nml r2 = X.C69503Nml.A0E
            r8.putSerializable(r6, r2)
            android.os.Bundle r1 = r1.getBundle(r14)
            r7.setArguments(r1)
            goto L_0x0809
        L_0x03c8:
            r7 = 719(0x2cf, float:1.008E-42)
            java.lang.String r7 = X.C273654mx.A00(r7)
            java.lang.String r10 = r1.getString(r7)
            r7 = 295(0x127, float:4.13E-43)
            java.lang.String r7 = X.C273654mx.A00(r7)
            java.lang.String r11 = r1.getString(r7)
            java.lang.String r7 = "media_id"
            java.lang.String r12 = r1.getString(r7)
            java.lang.String r7 = "media_owner_id"
            java.lang.String r13 = r1.getString(r7)
            r7 = 5378(0x1502, float:7.536E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            java.lang.String r14 = r1.getString(r7)
            java.lang.String r7 = r1.getString(r6)
            if (r10 == 0) goto L_0x0caa
            if (r11 == 0) goto L_0x0caa
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r6 = r1.toString()
            if (r7 == 0) goto L_0x0417
            X.EZX r7 = X.EZX.valueOf(r7)
        L_0x0408:
            X.0qQ.A0B(r2, r3)
            r1 = 1
            X.0qQ.A0B(r6, r1)
            r8 = r2
            r9 = r6
            X.E64 r7 = X.C48942Emg.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x088f
        L_0x0417:
            r7 = 0
            goto L_0x0408
        L_0x0419:
            r6 = 1
            r0.A0q = r3
            r0.A11 = r3
            r0.A0y = r6
            X.7Pu r0 = r0.A00()
            r5.A00 = r0
            r0 = 3536(0xdd0, float:4.955E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r7 = r1.getParcelable(r0)
            r7.getClass()
            X.FLR r6 = new X.FLR
            r6.<init>(r5)
            X.0qQ.A0B(r2, r3)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r1 = r2.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r3.putString(r0, r1)
            java.lang.String r0 = "arg_config"
            r3.putParcelable(r0, r7)
            X.K5L r7 = new X.K5L
            r7.<init>()
            r7.setArguments(r3)
            r7.A00 = r6
            goto L_0x0ca5
        L_0x0458:
            r2 = 1
            r6 = 3481(0xd99, float:4.878E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            java.lang.String r9 = r1.getString(r6)
            r9.getClass()
            r8 = 0
            X.NgJ r7 = new X.NgJ
            r7.<init>()
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r1 = 475(0x1db, float:6.66E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r6.putString(r1, r9)
            r1 = 476(0x1dc, float:6.67E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r6.putBoolean(r1, r3)
            r1 = 473(0x1d9, float:6.63E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r6.putString(r1, r8)
            r1 = 474(0x1da, float:6.64E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r6.putString(r1, r8)
            r7.setArguments(r6)
            r1 = 1048576000(0x3e800000, float:0.25)
            r0.A03 = r1
            goto L_0x0a17
        L_0x049e:
            java.lang.String r2 = r1.getString(r15)
            r2.getClass()
            X.JYm r9 = X.C59793JYm.valueOf(r2)
            r2 = r16
            java.lang.String r2 = r1.getString(r2)
            r2.getClass()
            X.818 r7 = X.AnonymousClass818.valueOf(r2)
            r2 = r17
            java.lang.String r2 = r1.getString(r2)
            r2.getClass()
            X.819 r8 = X.AnonymousClass819.valueOf(r2)
            r2 = r18
            java.lang.String r10 = r1.getString(r2)
            r2 = r19
            java.lang.String r11 = r1.getString(r2)
            r12 = 0
            r2 = r20
            java.lang.String r13 = r1.getString(r2)
            X.FBQ r6 = new X.FBQ
            r14 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            X.E27 r7 = X.Eq8.A00(r6)
            r0.A16 = r3
            goto L_0x0c9f
        L_0x04e4:
            r6 = 708(0x2c4, float:9.92E-43)
            java.lang.String r6 = X.C66579MXk.A00(r6)
            java.lang.String r6 = r1.getString(r6)
            X.0qQ.A0B(r2, r3)
            r10 = 1
            X.0qQ.A0B(r6, r10)
            X.2Dm r1 = X.1bJ.A00(r2)
            X.2Dr r1 = (X.2Dr) r1
            X.3U9 r1 = r1.A0N(r6)
            if (r1 == 0) goto L_0x0556
            java.lang.String r11 = r1.C6C()
            java.lang.String r9 = r1.C6k()
            int r8 = r1.AdN()
            X.EJc r7 = new X.EJc
            r7.<init>()
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r2 = r2.A05
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r6.putString(r1, r2)
            java.lang.String r1 = "thread_id"
            r6.putString(r1, r11)
            java.lang.String r1 = "thread_v2_id"
            r6.putString(r1, r9)
            java.lang.String r1 = "audience_type"
            r6.putInt(r1, r8)
            r7.setArguments(r6)
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r0.A03 = r1
            r0.A1G = r10
            r0.A17 = r10
            r0.A1O = r10
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.A0a = r1
        L_0x0541:
            boolean r1 = X.C226122ff.A03()
            if (r1 == 0) goto L_0x0554
            int r2 = X.C226122ff.A00()
        L_0x054b:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r3, r3, r3, r2)
            r0.A0G = r1
            goto L_0x0c9f
        L_0x0554:
            r2 = 0
            goto L_0x054b
        L_0x0556:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x055e:
            android.os.Parcelable r10 = r1.getParcelable(r13)
            com.instagram.user.model.Product r10 = (com.instagram.user.model.Product) r10
            java.lang.String r6 = "product_group"
            android.os.Parcelable r9 = r1.getParcelable(r6)
            com.instagram.model.shopping.ProductGroup r9 = (com.instagram.model.shopping.ProductGroup) r9
            X.7Pu r0 = r0.A00()
            r5.A00 = r0
            X.W27 r8 = new X.W27
            r8.<init>(r4, r2)
            X.7Pu r7 = r5.A00
            X.0qQ.A0B(r10, r3)
            r0 = 2
            X.0qQ.A0B(r7, r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.List r0 = r10.A0O
            if (r0 == 0) goto L_0x05b5
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x05b5
            r6 = 1
            X.VTt r3 = new X.VTt
            r3.<init>(r10, r1)
            if (r9 == 0) goto L_0x05ab
            X.VX6 r2 = r8.A05
            r2.A00 = r9
            java.util.List r1 = r9.A00()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r2.A01 = r0
            java.util.Map r0 = r2.A02
            r0.clear()
        L_0x05ab:
            r8.A02 = r6
            r8.A00 = r7
            com.instagram.shopping.fragment.variantselector.MultiVariantSelectorLoadingFragment r7 = X.W27.A00(r3, r8)
            goto L_0x0ca5
        L_0x05b5:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x05bd:
            r2 = 4726(0x1276, float:6.623E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r7 = r1.getString(r2)
            X.EbX r6 = X.C48252EbX.A00
            if (r6 == 0) goto L_0x0caa
            if (r7 == 0) goto L_0x0caa
            r2 = 3784(0xec8, float:5.303E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r2 = r7.equals(r2)
            if (r2 != 0) goto L_0x05f7
            java.lang.String r1 = "discovery"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0622
            X.G71 r1 = r6.A00()
            androidx.fragment.app.Fragment r7 = r1.Cr1()
        L_0x05e9:
            r0.A16 = r3
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r0.A03 = r1
            r1 = r7
            X.4mf r1 = (X.C273494mf) r1
            r0.A0T = r1
            goto L_0x0c9f
        L_0x05f7:
            X.G71 r8 = r6.A00()
            r2 = 3028(0xbd4, float:4.243E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r7 = r1.getString(r2)
            r2 = 3026(0xbd2, float:4.24E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r6 = r1.getString(r2)
            r2 = 3027(0xbd3, float:4.242E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r1 = r1.getBoolean(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            androidx.fragment.app.Fragment r7 = r8.Cr0(r1, r7, r6)
            goto L_0x05e9
        L_0x0622:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        L_0x0628:
            r3 = 1
            r0.A10 = r3
            X.7Pu r0 = r0.A00()
            r5.A00 = r0
            X.OCX r6 = new X.OCX
            r6.<init>(r4, r5)
            r0 = 2
            X.0qQ.A0B(r2, r0)
            r0 = 1166(0x48e, float:1.634E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            android.os.Bundle r1 = r1.getBundle(r0)
            if (r1 == 0) goto L_0x0caa
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES"
            android.os.Parcelable r7 = r1.getParcelable(r0)
            com.instagram.direct.capabilities.Capabilities r7 = (com.instagram.direct.capabilities.Capabilities) r7
            r0 = 2204(0x89c, float:3.088E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3t3 r0 = X.OXL.A00(r1, r0)
            if (r0 == 0) goto L_0x0caa
            if (r7 == 0) goto L_0x0caa
            X.Pv4 r11 = X.C330397Mp.A01(r4, r2, r7, r0)
            X.Pwj r12 = r11.BNa()
            X.4fh r5 = X.C318146oT.A01
            X.1a8 r4 = new X.1a8
            r4.<init>(r5)
            X.1aU r3 = r12.APA()
            X.PoH r1 = X.C74052PoH.A00
            X.Oxi r0 = new X.Oxi
            r0.<init>(r1)
            X.1aU r0 = r3.A0N(r0)
            X.1aU r0 = r0.A0P(r5)
            X.1aU r1 = r0.A0B()
            X.PSZ r0 = new X.PSZ
            r8 = r0
            r9 = r2
            r10 = r7
            r13 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r4.A02(r1, r0)
            r12.start()
            r12.CgC()
            return
        L_0x0695:
            if (r7 == 0) goto L_0x0caa
            com.instagram.bloks.hosting.IgBloksScreenConfig r6 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r6.<init>((X.0lg) r2)
            java.lang.String r11 = "com.bloks.www.bloks.link_history.nux.opt_in_screen"
            r6.A0S = r11
            r8 = 0
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r1 = 1
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>(r1)
            r10.put(r9, r7)
            r0.set(r3)
            int r0 = r0.nextClearBit(r3)
            if (r0 < r1) goto L_0x06e4
            java.util.HashMap r0 = X.C359608dC.A01(r10)
            X.DiU r2 = X.C46649DiU.A06(r11, r0, r2)
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            r2.A00 = r0
            r2.A05 = r8
            r0 = 0
            r2.A01 = r0
            r2.A06 = r8
            r2.A03 = r8
            r2.A02 = r8
            r2.A04 = r8
            r2.A0H(r5)
            r2.A0E(r4, r6)
            return
        L_0x06e4:
            java.lang.String r1 = "Missing Required Props"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x06ec:
            r7 = 0
            X.LBg r6 = X.C64839Lj1.A0F
            boolean r6 = r6.A00(r7, r2)
            if (r6 == 0) goto L_0x071c
            r7 = r2
            X.0qQ.A0B(r2, r3)
            X.08y r3 = X.09i.A0A
            com.instagram.common.session.UserSession r3 = r3.A07(r1)
            if (r3 == 0) goto L_0x0702
            r7 = r3
        L_0x0702:
            X.KYc r6 = new X.KYc
            r6.<init>(r1, r7)
            r6.setArguments(r1)
            r7 = r6
            com.facebook.common.callercontext.CallerContext r1 = X.C62052KYa.A02
            X.KYa r1 = X.LRS.A00(r2)
        L_0x0711:
            r0.A0T = r6
            X.Lyt r2 = new X.Lyt
            r2.<init>(r1)
            r0.A0U = r2
            goto L_0x0c9f
        L_0x071c:
            X.KYb r6 = X.C63429Kwp.A00(r1, r2)
            r7 = r6
            X.0qQ.A0B(r2, r3)
            r1 = 11
            X.WxV r3 = new X.WxV
            r3.<init>(r2, r1)
            java.lang.Class<X.KYZ> r1 = X.KYZ.class
            java.lang.Object r1 = r2.A01(r1, r3)
            X.Lj1 r1 = (X.C64839Lj1) r1
            goto L_0x0711
        L_0x0734:
            X.UzD r3 = X.C16677UzD.MEDIA
            goto L_0x097c
        L_0x0738:
            r6 = 432(0x1b0, float:6.05E-43)
            java.lang.String r12 = X.AnonymousClass000.A00(r6)
            android.os.Parcelable r10 = r1.getParcelable(r12)
            com.instagram.user.model.Product r10 = (com.instagram.user.model.Product) r10
            com.instagram.user.model.User r9 = r10.A0B
            android.os.Parcelable$Creator r6 = com.instagram.user.model.User.CREATOR
            java.lang.String r7 = X.AnonymousClass3ZA.A00(r9)
            X.4Cl r6 = r9.A03
            java.lang.String r6 = r6.getUsername()
            com.instagram.user.model.User r8 = new com.instagram.user.model.User
            r8.<init>(r7, r6)
            X.4Cl r6 = r9.A03
            com.instagram.common.typedurl.ImageUrl r6 = r6.Bh3()
            r6.getClass()
            r8.A0l(r6)
            r6 = 220(0xdc, float:3.08E-43)
            java.lang.String r13 = X.AnonymousClass000.A00(r6)
            java.lang.String r11 = r1.getString(r13)
            X.0qQ.A0B(r2, r3)
            r6 = 1
            X.0qQ.A0B(r11, r6)
            java.lang.String r9 = r2.A05
            java.lang.String r7 = "IgSessionManager.SESSION_TOKEN_KEY"
            X.0eP r6 = new X.0eP
            r6.<init>(r7, r9)
            X.0eP[] r6 = new X.0eP[]{r6}
            android.os.Bundle r7 = X.Q21.A00(r6)
            r7.putString(r13, r11)
            android.os.Parcelable r6 = r1.getParcelable(r12)
            X.0qQ.A0B(r6, r3)
            r7.putParcelable(r12, r6)
            r6 = 2208(0x8a0, float:3.094E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            java.lang.String r17 = r1.getString(r6)
            r6 = 2207(0x89f, float:3.093E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            java.lang.String r16 = r1.getString(r6)
            r6 = 2209(0x8a1, float:3.095E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            android.os.Parcelable r9 = r1.getParcelable(r6)
            r9.getClass()
            com.instagram.shopping.model.analytics.ShoppingNavigationInfo r9 = (com.instagram.shopping.model.analytics.ShoppingNavigationInfo) r9
            X.WVM r6 = new X.WVM
            r11 = r6
            r12 = r2
            r13 = r5
            r14 = r9
            r15 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r2 = 908(0x38c, float:1.272E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            android.os.Parcelable r2 = r1.getParcelable(r2)
            if (r2 == 0) goto L_0x07d4
            r1 = 433(0x1b1, float:6.07E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r7.putParcelable(r1, r2)
        L_0x07d4:
            r1 = 2206(0x89e, float:3.091E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r7.putBoolean(r1, r3)
            X.E5l r7 = X.C48839El1.A00(r7, r6, r8)
            goto L_0x08d3
        L_0x07e3:
            r6 = 4046(0xfce, float:5.67E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            java.lang.String r8 = r1.getString(r6)
            X.0qQ.A0B(r2, r3)
            X.E1E r7 = new X.E1E
            r7.<init>()
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            X.C227642jf.A03(r6, r2)
            r1 = 2628(0xa44, float:3.683E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putString(r1, r8)
            r7.setArguments(r6)
        L_0x0809:
            r0.A16 = r3
            r1 = 1
            r0.A10 = r1
            r0.A0k = r1
            goto L_0x0c9f
        L_0x0812:
            if (r7 == 0) goto L_0x0caa
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r3 = r1.getString(r9)
            r7.put(r9, r3)
            java.lang.String r3 = r1.getString(r12)
            r7.put(r12, r3)
            r3 = 881(0x371, float:1.235E-42)
            java.lang.String r6 = X.Pxd.A00(r3)
            java.lang.String r3 = r1.getString(r6)
            r7.put(r6, r3)
            java.lang.String r9 = "url"
            java.lang.String r6 = r1.getString(r9)
            java.lang.String r3 = "target_url"
            r7.put(r3, r6)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r3 = 863(0x35f, float:1.21E-42)
            java.lang.String r3 = X.Pxd.A00(r3)
            java.lang.String r3 = r1.getString(r3)
            r8.putString(r10, r3)
            java.lang.String r3 = r1.getString(r9)
            r8.putString(r9, r3)
            java.lang.String r6 = "initial_url"
            java.lang.String r3 = r1.getString(r6)
            r8.putString(r6, r3)
            java.lang.String r3 = "tracking"
            android.os.Bundle r1 = r1.getBundle(r3)
            r8.putBundle(r3, r1)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            X.Fx0 r1 = new X.Fx0
            r1.<init>(r8, r4, r2, r5)
            X.Q3B r3 = new X.Q3B
            r3.<init>(r1)
            java.lang.String r1 = "open_report_flow_callback"
            r6.put(r1, r3)
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r3.<init>((X.0lg) r2)
            java.lang.String r1 = "com.bloks.www.bloks.buy_with_prime.iab_more_info.bottom_sheet"
            r3.A0S = r1
            X.DiU r1 = X.C46649DiU.A06(r1, r7, r6)
            X.Di2 r7 = X.C49891FBs.A01(r3, r1)
        L_0x088f:
            X.7Pu r0 = r0.A00()
            r5.A00 = r0
            goto L_0x0ca5
        L_0x0897:
            X.R8Y r7 = new X.R8Y
            r7.<init>()
            android.os.Bundle r1 = r1.getBundle(r14)
            r7.setArguments(r1)
            r0.A0T = r7
            goto L_0x0c9f
        L_0x08a7:
            java.lang.String r6 = "prior_module_name"
            java.lang.String r8 = r1.getString(r6)
            r8.getClass()
            android.os.Parcelable r7 = r1.getParcelable(r13)
            r7.getClass()
            X.0qQ.A0B(r2, r3)
            X.2FW r1 = X.2FW.A1Y
            X.F3w r6 = new X.F3w
            r6.<init>(r2, r1, r8)
            android.os.Bundle r2 = r6.A07
            r1 = 19
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r2.putParcelable(r1, r7)
            r6.A08(r3)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r7 = r6.A00()
        L_0x08d3:
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.A03 = r1
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.A0a = r1
            goto L_0x0c9f
        L_0x08e0:
            java.lang.String r0 = "bloks_screen_config"
            android.os.Bundle r7 = r1.getBundle(r0)
            java.lang.String r0 = "bloks_screen_query"
            android.os.Bundle r6 = r1.getBundle(r0)
            if (r6 == 0) goto L_0x0918
            X.UbR r3 = new X.UbR
            r3.<init>()
            r3.setArguments(r6)
            X.VtN r0 = X.C18972WEz.A0A
            X.WEz r0 = r0.A01(r6)
            X.7Pr r0 = X.C48722Ej7.A00(r4, r0, r2, r3)
            X.7Pu r0 = r0.A00()
        L_0x0904:
            r0.A02(r4, r3)
        L_0x0907:
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r1 = r0.A01(r4)
            if (r1 == 0) goto L_0x0caa
            X.ERJ r0 = new X.ERJ
            r0.<init>(r4, r5)
            r1.A0Q(r0)
            return
        L_0x0918:
            if (r7 == 0) goto L_0x0933
            X.Di2 r3 = new X.Di2
            r3.<init>()
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = com.instagram.bloks.hosting.IgBloksScreenConfig.A01(r7, r2)
            X.0lg r0 = r1.A0B
            X.7Pr r0 = X.FH9.A09(r4, r1, r0, r3)
            X.7Pu r0 = r0.A00()
            r3.A0C = r0
            r3.setArguments(r7)
            goto L_0x0904
        L_0x0933:
            java.lang.String r0 = "bloks_data"
            int r1 = r1.getInt(r0)
            X.DiG r0 = X.C46636DiG.A00(r2)
            java.lang.Object r3 = r0.A02(r1)
            X.4tV r3 = (X.C276544tV) r3
            if (r3 == 0) goto L_0x0caa
            X.FUn r1 = new X.FUn
            r1.<init>(r3)
            r0 = 0
            X.2nI r7 = X.C229382nI.A01(r0, r4, r1, r2)
            r6 = r4
            r8 = r0
            r9 = r0
            r10 = r3
            r11 = r2
            r12 = r0
            X.FH9.A0C(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0907
        L_0x0959:
            java.lang.String r6 = "thread_id"
            java.lang.String r10 = ""
            java.lang.String r9 = r1.getString(r6, r10)
            java.lang.String r6 = "fan_club_id"
            java.lang.String r8 = r1.getString(r6, r10)
            X.NjJ r7 = X.C69318NjJ.NOTIFICATION
            X.Fb4 r6 = new X.Fb4
            r6.<init>(r1, r2, r0, r5)
            java.lang.String r2 = "invite_id"
            java.lang.String r1 = r1.getString(r2, r10)
            X.NKN r7 = X.C71045OaN.A02(r7, r6, r9, r8, r1)
            goto L_0x0c69
        L_0x097a:
            X.UzD r3 = X.C16677UzD.FRX_OBJECT
        L_0x097c:
            r0 = 0
            X.1Yk.A00(r1, r4, r2, r0, r3)
            return
        L_0x0981:
            X.AnonymousClass1q4.A00()
            X.H1c r7 = new X.H1c
            r7.<init>()
            goto L_0x0c9c
        L_0x098b:
            java.lang.String r0 = r1.getString(r15)
            r0.getClass()
            X.JYm r10 = X.C59793JYm.valueOf(r0)
            r0 = r16
            java.lang.String r0 = r1.getString(r0)
            r0.getClass()
            X.818 r8 = X.AnonymousClass818.valueOf(r0)
            r0 = r17
            java.lang.String r0 = r1.getString(r0)
            r0.getClass()
            X.819 r9 = X.AnonymousClass819.valueOf(r0)
            r0 = r18
            java.lang.String r11 = r1.getString(r0)
            r0 = r19
            java.lang.String r12 = r1.getString(r0)
            r13 = 0
            r0 = r20
            java.lang.String r14 = r1.getString(r0)
            X.FBQ r7 = new X.FBQ
            r15 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            X.FNJ r6 = new X.FNJ
            r6.<init>(r4, r2, r7)
            X.FNK r1 = new X.FNK
            r1.<init>(r4, r2, r7)
            X.Fwr r0 = new X.Fwr
            r0.<init>(r2, r7)
            X.E1t r7 = X.FV2.A00(r6, r1, r7, r0)
            X.7Pr r0 = new X.7Pr
            r0.<init>(r2)
            r1 = 1
            r0.A16 = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.A0a = r1
            goto L_0x0c9f
        L_0x09ec:
            X.1as r6 = X.1as.A04
            X.1ap r8 = r6.A02
            X.2FW r7 = X.2FW.A0H
            java.lang.String r6 = "prior_module"
            java.lang.String r6 = r1.getString(r6)
            r6.getClass()
            X.F3w r6 = r8.A08(r2, r7, r6)
            java.lang.String r2 = "content_id"
            java.lang.String r1 = r1.getString(r2)
            r1.getClass()
            r6.A06(r1)
            r6.A08(r3)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r7 = r6.A00()
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.A03 = r1
            r2 = 1
        L_0x0a17:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.A0a = r1
            r0.A10 = r2
            goto L_0x0c9f
        L_0x0a21:
            java.lang.String r8 = "KEY_IS_NEW_REMIX_VERSION"
            boolean r7 = r1.getBoolean(r8, r3)
            X.0qQ.A0B(r2, r3)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r2 = r2.A05
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r6.putString(r1, r2)
            r6.putBoolean(r8, r7)
            X.E0i r7 = new X.E0i
            r7.<init>()
            goto L_0x0c97
        L_0x0a40:
            r10 = 1
            java.lang.String r9 = r1.getString(r8)
            r6 = 315(0x13b, float:4.41E-43)
            java.lang.String r7 = X.C66579MXk.A00(r6)
            java.lang.String r6 = r1.getString(r7)
            X.0qQ.A0B(r2, r3)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            X.AnonymousClass0Dg.A00(r1, r2)
            if (r9 == 0) goto L_0x0a5f
            r1.putString(r8, r9)
        L_0x0a5f:
            if (r6 == 0) goto L_0x0a64
            r1.putString(r7, r6)
        L_0x0a64:
            X.NK4 r7 = new X.NK4
            r7.<init>()
            r7.setArguments(r1)
            r0.A10 = r10
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.A03 = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            r0.A0a = r1
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2131963012(0x7f132c84, float:1.9562765E38)
            java.lang.String r1 = r2.getString(r1)
            goto L_0x0c0f
        L_0x0a85:
            r6 = 900(0x384, float:1.261E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r6)
            android.os.Parcelable r6 = r1.getParcelable(r8)
            r6.getClass()
            com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData r6 = (com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData) r6
            X.0qQ.A0B(r6, r3)
            X.E0y r7 = new X.E0y
            r7.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r1.putParcelable(r8, r6)
            r7.setArguments(r1)
            r3 = 1
            r0.A10 = r3
            java.lang.String r1 = r6.A03
            r0.A0g = r1
            X.FNu r1 = new X.FNu
            r1.<init>(r4, r2, r6, r5)
            r0.A0K = r1
            java.lang.String r1 = r6.A04
            r0.A0h = r1
            X.FNL r1 = new X.FNL
            r1.<init>(r2, r6, r5)
            r0.A0L = r1
            X.7Pu r0 = r0.A00()
            r5.A00 = r0
            r0.A0R(r3, r3)
            goto L_0x0ca5
        L_0x0acb:
            r0 = 3089(0xc11, float:4.329E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r12 = r1.getString(r0)
            r12.getClass()
            r0 = 3087(0xc0f, float:4.326E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r13 = r1.getString(r0)
            java.lang.String r14 = r1.getString(r8)
            r14.getClass()
            r0 = 3086(0xc0e, float:4.324E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r15 = r1.getString(r0)
            r15.getClass()
            r0 = 3084(0xc0c, float:4.322E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r16 = r1.getString(r0)
            r16.getClass()
            r0 = 3085(0xc0d, float:4.323E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r17 = r1.getString(r0)
            r0 = 3088(0xc10, float:4.327E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3sy r11 = X.C67002Mga.A00(r1, r0)
            r11.getClass()
            r0 = 3090(0xc12, float:4.33E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r1.getParcelable(r0)
            r0.getClass()
            com.facebook.privacy.zone.policy.ZonePolicy r0 = (com.facebook.privacy.zone.policy.ZonePolicy) r0
            X.1as r6 = X.1as.A04
            r18 = 1
            r7 = r4
            r8 = r4
            r9 = r0
            r10 = r2
            X.7Pu r0 = r6.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r5.A00 = r0
            return
        L_0x0b38:
            java.lang.String r3 = r1.getString(r6)
            r3.getClass()
            r0 = 4354(0x1102, float:6.101E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x0caa
            android.content.Context r0 = r4.getApplicationContext()
            X.KRs r1 = X.C63267KuC.A00(r0, r2, r1)
            r0 = 0
            r1.showUpsell(r0, r4)
            return
        L_0x0b58:
            X.0qQ.A0B(r2, r3)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>(r1)
            X.AnonymousClass0Dg.A00(r3, r2)
            X.NJe r7 = new X.NJe
            r7.<init>()
            r7.setArguments(r3)
            r3 = 1
            r0.A10 = r3
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.A03 = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r0.A0a = r2
            r2 = 655(0x28f, float:9.18E-43)
            java.lang.String r2 = X.C66579MXk.A00(r2)
            java.lang.String r2 = r1.getString(r2)
            r1 = 238(0xee, float:3.34E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0b96
            r1 = 2131974623(0x7f1359df, float:1.9586315E38)
        L_0x0b91:
            java.lang.String r1 = r4.getString(r1)
            goto L_0x0c0f
        L_0x0b96:
            r1 = 237(0xed, float:3.32E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0ba6
            r1 = 2131974622(0x7f1359de, float:1.9586313E38)
            goto L_0x0b91
        L_0x0ba6:
            r1 = 0
            goto L_0x0c0f
        L_0x0ba8:
            X.0qQ.A0B(r2, r3)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            X.C227642jf.A03(r8, r2)
            r2 = 1111(0x457, float:1.557E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r2)
            boolean r2 = r1.getBoolean(r6)
            r8.putBoolean(r6, r2)
            r2 = 1110(0x456, float:1.555E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r2)
            boolean r2 = r1.getBoolean(r6)
            r8.putBoolean(r6, r2)
            r2 = 1112(0x458, float:1.558E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r1 = r1.getBoolean(r2)
            r8.putBoolean(r2, r1)
            X.E1p r7 = new X.E1p
            r7.<init>()
            r7.setArguments(r8)
            r0.A16 = r3
            r1 = 1
            r0.A10 = r1
            r0.A0k = r1
            r0.A0y = r3
            r0.A13 = r1
            goto L_0x0c9f
        L_0x0bef:
            X.0qQ.A0B(r2, r3)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>(r1)
            X.AnonymousClass0Dg.A00(r3, r2)
            X.NIQ r7 = new X.NIQ
            r7.<init>()
            r7.setArguments(r3)
            r2 = 1
            r0.A10 = r2
            r2 = 657(0x291, float:9.2E-43)
            java.lang.String r2 = X.C66579MXk.A00(r2)
            java.lang.String r1 = r1.getString(r2)
        L_0x0c0f:
            r0.A0d = r1
            goto L_0x0c9f
        L_0x0c13:
            X.0qQ.A0B(r2, r3)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            X.C227642jf.A03(r6, r2)
            r2 = 1104(0x450, float:1.547E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r1 = r1.getBoolean(r2)
            r6.putBoolean(r2, r1)
            X.E0h r7 = new X.E0h
            r7.<init>()
            r7.setArguments(r6)
            r0.A16 = r3
            r1 = 1
            r0.A10 = r1
            r0.A0k = r1
            r0.A0y = r3
            goto L_0x0c9f
        L_0x0c3d:
            X.0qQ.A0B(r2, r3)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r2 = r2.A05
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r6.putString(r1, r2)
            X.E0l r7 = new X.E0l
            r7.<init>()
            goto L_0x0c97
        L_0x0c52:
            X.0qQ.A0B(r2, r3)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r2 = r2.A05
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r6.putString(r1, r2)
            X.E0m r7 = new X.E0m
            r7.<init>()
            r7.setArguments(r6)
        L_0x0c69:
            r0.A16 = r3
            r1 = 1
            r0.A10 = r1
            r0.A0k = r1
            goto L_0x0c9f
        L_0x0c71:
            java.lang.String r1 = "No bottom sheet content fragment specified"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0c79:
            java.lang.String r0 = "instance"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0c83:
            X.0qQ.A0B(r2, r3)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r2 = r2.A05
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r6.putString(r1, r2)
            X.E0j r7 = new X.E0j
            r7.<init>()
        L_0x0c97:
            r7.setArguments(r6)
            r0.A16 = r3
        L_0x0c9c:
            r1 = 1
            r0.A10 = r1
        L_0x0c9f:
            X.7Pu r0 = r0.A00()
            r5.A00 = r0
        L_0x0ca5:
            X.7Pu r0 = r5.A00
            r0.A02(r4, r7)
        L_0x0caa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.modal.ModalActivity.onPostCreate(android.os.Bundle):void");
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        this.A04.add(Integer.valueOf(i));
        ModalActivity.super.startActivityForResult(intent, i, bundle);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.A04.add(Integer.valueOf(i));
        ModalActivity.super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void A0n(Intent intent) {
        if ((intent.getFlags() & 268435456) == 268435456) {
            String stringExtra = intent.getStringExtra("fragment_name");
            stringExtra.getClass();
            Bundle bundleExtra = intent.getBundleExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS);
            bundleExtra.getClass();
            String stringExtra2 = intent.getStringExtra("initial_fragment_backstack_name");
            Fragment A002 = AnonymousClass6WB.A00(bundleExtra, this, this.A01, stringExtra);
            if (A002 != null) {
                C309516Yo r2 = new C309516Yo(this, this.A01);
                r2.A0B(bundleExtra, A002);
                if (stringExtra2 != null) {
                    r2.A0A = stringExtra2;
                    0hq A003 = C229102mq.A00(this);
                    A003.A0s(new C59843JaJ(A003, this));
                } else {
                    r2.A0D = false;
                }
                r2.A04();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.modal.ModalActivity, android.app.Activity] */
    public final void finish() {
        ModalActivity.super.finish();
        int[] intArrayExtra = getIntent().getIntArrayExtra("fragment_animation");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[2], intArrayExtra[3]);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.modal.ModalActivity, android.app.Activity] */
    public final void finishAndRemoveTask() {
        ModalActivity.super.finishAndRemoveTask();
        int[] intArrayExtra = getIntent().getIntArrayExtra("fragment_animation");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[2], intArrayExtra[3]);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Fragment A0P;
        super.onActivityResult(i, i2, intent);
        if (this.A04.remove(Integer.valueOf(i)) && (A0P = getSupportFragmentManager().A0P(R.id.layout_container_main)) != null) {
            A0P.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.modal.ModalActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onConfigurationChanged(Configuration configuration) {
        C61190ls.A01(this, configuration);
        super.onConfigurationChanged(configuration);
    }

    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(-85305697);
        C62880wX r5 = C61170le.A00;
        18g A012 = C638918c.A01(r5);
        A012.A0O(A012.A02, 002.A0R("ModalActivity.onResume", "_begin"));
        try {
            super.onResume();
            18g A013 = C638918c.A01(r5);
            A013.A0O(A013.A02, 002.A0R("ModalActivity.onResume", "_end"));
            AnonymousClass0fD.A07(648655408, A002);
            return;
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        AnonymousClass0fD.A07(-852538925, A002);
        throw th;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.modal.ModalActivity, android.content.Context, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onStart() {
        int A002 = AnonymousClass0fD.A00(1336886252);
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            C638918c.A01(C61170le.A00).A0I(this, getIntent(), this.A01);
        }
        C62880wX r5 = C61170le.A00;
        18g A012 = C638918c.A01(r5);
        A012.A0O(A012.A02, 002.A0R("ModalActivity.onStart", "_begin"));
        try {
            super.onStart();
            18g A013 = C638918c.A01(r5);
            A013.A0O(A013.A02, 002.A0R("ModalActivity.onStart", "_end"));
            AnonymousClass0fD.A07(-1587677028, A002);
            return;
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        AnonymousClass0fD.A07(2007328404, A002);
        throw th;
    }
}
