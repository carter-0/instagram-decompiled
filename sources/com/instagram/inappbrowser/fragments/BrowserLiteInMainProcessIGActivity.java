package com.instagram.inappbrowser.fragments;

import X.0eO;
import X.1wn;
import X.1xC;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass3GP;
import X.AnonymousClass3M8;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C10913S0o;
import X.C11209SFj;
import X.C249463jp;
import X.C41785B0o;
import X.C66299MMi;
import X.DbS;
import X.QLA;
import X.S4Q;
import X.SRY;
import X.SSR;
import X.T72;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class BrowserLiteInMainProcessIGActivity extends IgFragmentActivity implements AnonymousClass0iw, C249463jp, C41785B0o {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, new C66299MMi(this, 32));
    public final C11209SFj A01;
    public final 1wn A02 = new T72(this, 3);

    public final String getModuleName() {
        return "BrowserLiteInMainProcessIGActivity";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r14.getBooleanExtra("BrowserLiteIntent.EXTRA_SKIP_SAME_INTENT_DATA_CHECK", false) == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNewIntent(android.content.Intent r14) {
        /*
            r13 = this;
            r9 = 0
            X.0qQ.A0B(r14, r9)
            com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity.super.onNewIntent(r14)
            X.SFj r8 = r13.A01
            com.facebook.browser.lite.BrowserLiteFragment r0 = r8.A02
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_BROWSER_HISTORY_ITEM_ID"
            java.lang.String r0 = r14.getStringExtra(r0)
            r2 = 1
            boolean r12 = X.AnonymousClass7TF.A1V(r0)
            android.net.Uri r1 = r14.getData()
            androidx.fragment.app.FragmentActivity r7 = r8.A01
            android.content.Intent r0 = r7.getIntent()
            android.net.Uri r0 = r0.getData()
            if (r1 != 0) goto L_0x010f
            if (r0 == 0) goto L_0x0115
        L_0x002a:
            r10 = 0
        L_0x002b:
            if (r1 == 0) goto L_0x0036
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_SKIP_SAME_INTENT_DATA_CHECK"
            boolean r0 = r14.getBooleanExtra(r0, r9)
            r3 = 1
            if (r0 != 0) goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            r11 = 4
            if (r12 == 0) goto L_0x0044
            com.facebook.browser.lite.BrowserLiteFragment r1 = r8.A02
            java.lang.String r0 = "NEW_INTENT_FROM_LINK_HISTORY"
            com.facebook.browser.lite.BrowserLiteFragment.A0G(r1, r0)
            r1.A0W(r11)
        L_0x0044:
            java.lang.String r6 = "Try to commit fragment when activity is not created"
            java.lang.String r5 = "BrowserLiteActivityBaseDelegate"
            java.lang.String r4 = "BROWSER_LITE_FRAGMENT_TAG"
            if (r12 != 0) goto L_0x00d3
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_RELOAD_URL_IN_CURRENT_IAB"
            boolean r0 = r14.getBooleanExtra(r0, r9)
            if (r0 != 0) goto L_0x00d3
            if (r10 == 0) goto L_0x0058
            if (r3 == 0) goto L_0x00d2
        L_0x0058:
            java.lang.String r1 = "browser_tab_selection"
            java.lang.String r0 = "iab_click_source"
            java.lang.String r0 = r14.getStringExtra(r0)
            boolean r0 = r1.equals(r0)
            r10 = 13
            if (r0 == 0) goto L_0x006a
            r11 = 13
        L_0x006a:
            com.facebook.browser.lite.BrowserLiteFragment r3 = r8.A02
            java.lang.String r1 = "NEW_INTENT"
            r0 = 4
            if (r11 != r0) goto L_0x0074
            com.facebook.browser.lite.BrowserLiteFragment.A0G(r3, r1)
        L_0x0074:
            r3.A0W(r11)
            X.0s1 r3 = X.DbW.A0D(r7)
            com.facebook.browser.lite.BrowserLiteFragment r0 = r8.A02
            r3.A03(r0)
            r7.setIntent(r14)
            X.C11209SFj.A01(r8)
            if (r11 != r10) goto L_0x00a0
            java.lang.String r0 = "BrowserLiteIntent.PERFORMANCE_LOGGER_SKIP_LOGGING"
            boolean r0 = r14.getBooleanExtra(r0, r9)
            if (r0 == 0) goto L_0x00a0
            X.SSR r1 = X.SSR.A00()
            java.util.Set r0 = r1.A05
            r0.clear()
            java.util.Map r0 = r1.A04
            r0.clear()
            r1.A03 = r2
        L_0x00a0:
            X.S0o r0 = r8.A06
            X.7kY r2 = r0.A00()
            r8.A02 = r2
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "BrowserLiteIntent.ACTIVITY_INTENT"
            r1.putParcelable(r0, r14)
            r2.setArguments(r1)
            r1 = 2131429128(0x7f0b0708, float:1.847992E38)
            com.facebook.browser.lite.BrowserLiteFragment r0 = r8.A02
            r3.A0C(r0, r4, r1)
        L_0x00bc:
            r3.A01()
            X.07V r0 = r7.getLifecycle()
            X.07U r1 = r0.A07()
            X.07U r0 = X.07U.A01
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L_0x00d2
            X.0KC.A0E(r5, r6)
        L_0x00d2:
            return
        L_0x00d3:
            android.os.Bundle r9 = X.AnonymousClass7TE.A0a()
            com.facebook.browser.lite.BrowserLiteFragment r0 = r8.A02
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ON_SAVED_INSTANCE_STATE_ENABLED"
            r1.putExtra(r0, r2)
            com.facebook.browser.lite.BrowserLiteFragment r0 = r8.A02
            r0.onSaveInstanceState(r9)
            X.0s1 r3 = X.DbW.A0D(r7)
            com.facebook.browser.lite.BrowserLiteFragment r0 = r8.A02
            r3.A03(r0)
            r7.setIntent(r14)
            X.C11209SFj.A01(r8)
            X.S0o r0 = r8.A06
            X.7kY r0 = r0.A00()
            r8.A02 = r0
            java.lang.String r0 = "BrowserLiteIntent.ACTIVITY_INTENT"
            r9.putParcelable(r0, r14)
            com.facebook.browser.lite.BrowserLiteFragment r1 = r8.A02
            r1.setArguments(r9)
            r0 = 2131429128(0x7f0b0708, float:1.847992E38)
            r3.A0C(r1, r4, r0)
            goto L_0x00bc
        L_0x010f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002a
        L_0x0115:
            r10 = 1
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity.onNewIntent(android.content.Intent):void");
    }

    public final AnonymousClass3M8 Bx5() {
        return (AnonymousClass3M8) this.A00.getValue();
    }

    public final void Cz9(int i, String str, Bundle bundle) {
        C11209SFj.A00(bundle, this.A01, str, i);
    }

    public final void onBackPressed() {
        C11209SFj sFj = this.A01;
        BrowserLiteFragment browserLiteFragment = sFj.A02;
        if (browserLiteFragment == null) {
            C11209SFj.A00(AnonymousClass7TE.A0a(), sFj, (String) null, 2);
        } else if (!browserLiteFragment.DIV(true)) {
            sFj.A02.AI4(2, (String) null);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.SFj] */
    public BrowserLiteInMainProcessIGActivity() {
        C10913S0o s0o = new C10913S0o(this);
        ? obj = new Object();
        obj.A00 = 1.0d;
        obj.A01 = this;
        obj.A06 = s0o;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity, android.app.Activity] */
    public final void onActionModeFinished(ActionMode actionMode) {
        BrowserLiteFragment browserLiteFragment;
        List list;
        BrowserLiteInMainProcessIGActivity.super.onActionModeFinished(actionMode);
        if (actionMode != null && (browserLiteFragment = this.A01.A02) != null && (list = browserLiteFragment.A0n) != null) {
            StringBuilder A012 = SSR.A01("onActionModeFinished");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            SSR.A03(A012);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity, android.app.Activity] */
    public final void onActionModeStarted(ActionMode actionMode) {
        BrowserLiteFragment browserLiteFragment;
        List list;
        BrowserLiteInMainProcessIGActivity.super.onActionModeStarted(actionMode);
        if (actionMode != null && (browserLiteFragment = this.A01.A02) != null && (list = browserLiteFragment.A0n) != null) {
            StringBuilder A012 = SSR.A01("onActionModeStarted");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            SSR.A03(A012);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        BrowserLiteFragment browserLiteFragment = this.A01.A02;
        if (browserLiteFragment != null) {
            browserLiteFragment.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [X.RU5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.Object, X.RQW] */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cd, code lost:
        if (r11.isEmpty() == false) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = -1429159620(0xffffffffaad0c13c, float:-3.7082306E-13)
            int r8 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r13)
            X.SFj r7 = r12.A01
            r6 = 2131624341(0x7f0e0195, float:1.8875859E38)
            X.C11209SFj.A01(r7)
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLA.onCreate.Start"
            r1.A04(r0)
            androidx.fragment.app.FragmentActivity r5 = r7.A01
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "extra_hide_system_status_bar"
            r4 = 0
            boolean r0 = r1.getBooleanExtra(r0, r4)
            r7.A07 = r0
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ACTIVITY_THEME_RES"
            int r0 = r1.getIntExtra(r0, r4)
            if (r0 == 0) goto L_0x0039
            r5.setTheme(r0)
        L_0x0039:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ACTIVITY_THEME_STYLES"
            int[] r10 = r1.getIntArrayExtra(r0)
            r3 = 1
            if (r10 == 0) goto L_0x0056
            int r9 = r10.length
            r2 = 0
        L_0x0048:
            if (r2 >= r9) goto L_0x0056
            r1 = r10[r2]
            android.content.res.Resources$Theme r0 = r5.getTheme()
            r0.applyStyle(r1, r3)
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0056:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_TRANSPARENT_IAB_ENABLED"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x006c
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r0 = 2132018406(0x7f1404e6, float:1.9675118E38)
            r1.applyStyle(r0, r3)
        L_0x006c:
            if (r13 == 0) goto L_0x0083
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            android.os.Bundle r1 = r13.getBundle(r0)
            if (r1 == 0) goto L_0x0083
            java.lang.ClassLoader r0 = r5.getClassLoader()
            if (r0 == 0) goto L_0x0083
            java.lang.ClassLoader r0 = r5.getClassLoader()
            r1.setClassLoader(r0)
        L_0x0083:
            java.util.regex.Pattern r0 = X.SCX.A01
            boolean r0 = X.SQY.A02(r5)
            if (r0 == 0) goto L_0x008d
            X.AnonymousClass2DC.A00 = r3
        L_0x008d:
            if (r13 != 0) goto L_0x0095
            int r0 = X.C9121RPt.A00
            int r0 = r0 + 1
            X.C9121RPt.A00 = r0
        L_0x0095:
            androidx.fragment.app.FragmentActivity r9 = r7.A01
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ANIMATION"
            int[] r2 = r1.getIntArrayExtra(r0)
            if (r2 == 0) goto L_0x00ae
            int r1 = r2.length
            r0 = 4
            if (r1 != r0) goto L_0x00ae
            r1 = r2[r4]
            r0 = r2[r3]
            r9.overridePendingTransition(r1, r0)
        L_0x00ae:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_LOGCAT"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            X.SQO.A00 = r0
            X.S3N r2 = X.S3N.A09
            if (r2 == 0) goto L_0x00fb
            monitor-enter(r2)
            android.webkit.WebView r0 = r2.A01     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r2.A06     // Catch:{ all -> 0x00f7 }
            if (r0 != 0) goto L_0x00cf
            java.util.LinkedList r11 = r2.A08     // Catch:{ all -> 0x00f7 }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x00f7 }
            if (r0 != 0) goto L_0x00e6
        L_0x00cf:
            java.lang.String r10 = "BrowserHtmlResourceExtractor"
            java.lang.String r9 = "HtmlResourceExtractor is still working when browser opened, current url %s, in queue %d"
            java.lang.String r1 = r2.A04     // Catch:{ all -> 0x00f7 }
            java.util.LinkedList r11 = r2.A08     // Catch:{ all -> 0x00f7 }
            int r0 = r11.size()     // Catch:{ all -> 0x00f7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f7 }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x00f7 }
            X.SQO.A01(r10, r9, r0)     // Catch:{ all -> 0x00f7 }
        L_0x00e6:
            r11.clear()     // Catch:{ all -> 0x00f7 }
            java.util.List r0 = r2.A05     // Catch:{ all -> 0x00f7 }
            r0.clear()     // Catch:{ all -> 0x00f7 }
            android.webkit.WebView r0 = r2.A01     // Catch:{ all -> 0x00f7 }
            r0.destroy()     // Catch:{ all -> 0x00f7 }
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x00f7 }
            goto L_0x00fa
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00fa:
            monitor-exit(r2)
        L_0x00fb:
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLA.setContentView.Start"
            r1.A04(r0)
            r5.setContentView(r6)
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLA.setContentView.End"
            r1.A04(r0)
            android.view.Window r6 = r5.getWindow()
            if (r6 == 0) goto L_0x014c
            android.view.WindowManager$LayoutParams r0 = r6.getAttributes()
            int r0 = r0.flags
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x014c
            X.RQW r2 = new X.RQW
            r2.<init>()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.getChildAt(r4)
            r2.A01 = r0
            if (r0 == 0) goto L_0x014c
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.SbZ r0 = new X.SbZ
            r0.<init>(r2, r4)
            r1.addOnGlobalLayoutListener(r0)
            android.view.View r0 = r2.A01
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r2.A02 = r0
        L_0x014c:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENABLED"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x017b
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_PAYMENT_ENABLED"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            if (r0 != 0) goto L_0x017b
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_FRAMEWORK_FORM_DETECTION_LOGGING"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            if (r6 == 0) goto L_0x017b
            if (r0 != 0) goto L_0x017b
            android.view.View r1 = r6.getDecorView()
            r0 = 8
            r1.setImportantForAutofill(r0)
        L_0x017b:
            java.lang.String r10 = "BROWSER_LITE_FRAGMENT_TAG"
            if (r13 == 0) goto L_0x024a
            X.0hq r0 = r5.getSupportFragmentManager()
            androidx.fragment.app.Fragment r0 = r0.A0R(r10)
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            r7.A02 = r0
        L_0x018b:
            X.SRY r0 = X.SRY.A00()
            r7.A04 = r0
            X.S4Q r0 = X.S4Q.A02
            if (r0 != 0) goto L_0x019c
            X.S4Q r0 = new X.S4Q
            r0.<init>()
            X.S4Q.A02 = r0
        L_0x019c:
            r7.A05 = r0
            X.RU5 r0 = new X.RU5
            r0.<init>()
            r7.A03 = r0
            androidx.fragment.app.FragmentActivity r2 = r7.A01
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_RAGE_SHAKE_AVAILABLE"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x01d7
            X.RU5 r0 = r7.A03
            if (r0 == 0) goto L_0x01d7
            X.0hq r9 = r2.getSupportFragmentManager()
            java.lang.String r2 = "rageshake_listener_fragment"
            androidx.fragment.app.Fragment r0 = r9.A0R(r2)
            if (r0 != 0) goto L_0x01d7
            X.QCC r1 = new X.QCC
            r1.<init>()
            X.0s1 r0 = new X.0s1
            r0.<init>(r9)
            r0.A0C(r1, r2, r4)
            r0.A05()
            r0.A00()
        L_0x01d7:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_PERSISTENT_COOKIE"
            boolean r0 = r1.getBooleanExtra(r0, r3)
            r7.A08 = r0
            android.content.Intent r3 = r5.getIntent()
            java.lang.String r2 = "BrowserLiteIntent.DISPLAY_HEIGHT_RATIO"
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r3.getDoubleExtra(r2, r0)
            r7.A00 = r2
            if (r6 == 0) goto L_0x0211
            r10 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            r9 = -1
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x0244
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0244
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r5)
            int r0 = r0.heightPixels
            double r1 = (double) r0
            double r3 = r7.A00
            double r1 = r1 * r3
            int r0 = (int) r1
            r6.setLayout(r9, r0)
            r0 = 87
            r6.setGravity(r0)
        L_0x0211:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.RrC r0 = new X.RrC
            r0.<init>(r7)
            r3.add(r0)
            androidx.fragment.app.FragmentActivity r1 = r7.A01
            r0 = 2131429128(0x7f0b0708, float:1.847992E38)
            android.view.View r2 = r1.findViewById(r0)
            if (r2 == 0) goto L_0x0234
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            X.Sbc r0 = new X.Sbc
            r0.<init>(r2, r7, r3)
            r1.addOnGlobalLayoutListener(r0)
        L_0x0234:
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLA.onCreate.End"
            r1.A04(r0)
            r0 = 109534216(0x6875c08, float:5.0916584E-35)
            X.AnonymousClass0fD.A07(r0, r8)
            return
        L_0x0244:
            r7.A00 = r0
            r6.setLayout(r9, r9)
            goto L_0x0211
        L_0x024a:
            X.S0o r0 = r7.A06
            X.7kY r9 = r0.A00()
            r7.A02 = r9
            android.content.Intent r2 = r5.getIntent()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "BrowserLiteIntent.ACTIVITY_INTENT"
            r1.putParcelable(r0, r2)
            r9.setArguments(r1)
            X.0hq r9 = r5.getSupportFragmentManager()
            X.0s1 r2 = new X.0s1
            r2.<init>(r9)
            r1 = 2131429128(0x7f0b0708, float:1.847992E38)
            com.facebook.browser.lite.BrowserLiteFragment r0 = r7.A02
            r2.A0C(r0, r10, r1)
            r2.A00()
            r9.A0a()
            goto L_0x018b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(101347216);
        super.onDestroy();
        this.A01.A01.isFinishing();
        AnonymousClass0fD.A07(1492326365, A002);
    }

    public final void onPause() {
        Fragment A0R;
        int A002 = AnonymousClass0fD.A00(1014129688);
        super.onPause();
        C11209SFj sFj = this.A01;
        if (!(sFj.A03 == null || (A0R = sFj.A01.getSupportFragmentManager().A0R("rageshake_listener_fragment")) == null)) {
            A0R.onPause();
        }
        1xC.A01.A03(this.A02, AnonymousClass3GP.class);
        AnonymousClass0fD.A07(96352270, A002);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        QLA C8U;
        BrowserLiteWebChromeClient A03;
        AnonymousClass7TG.A1O(strArr, iArr);
        BrowserLiteInMainProcessIGActivity.super.onRequestPermissionsResult(i, strArr, iArr);
        BrowserLiteFragment browserLiteFragment = this.A01.A02;
        if (browserLiteFragment != null && (C8U = browserLiteFragment.C8U()) != null && (A03 = C8U.A03()) != null) {
            A03.A06(i, iArr);
        }
    }

    public final void onResume() {
        Window window;
        Fragment A0R;
        int A002 = AnonymousClass0fD.A00(1355415194);
        super.onResume();
        C11209SFj sFj = this.A01;
        if (!(sFj.A03 == null || (A0R = sFj.A01.getSupportFragmentManager().A0R("rageshake_listener_fragment")) == null)) {
            A0R.onResume();
        }
        if (sFj.A07 && (window = sFj.A01.getWindow()) != null) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4);
            window.setFlags(1024, 1024);
        }
        1xC.A01.A02(this.A02, AnonymousClass3GP.class);
        AnonymousClass0fD.A07(39338813, A002);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStop() {
        /*
            r7 = this;
            r0 = -563401530(0xffffffffde6b2cc6, float:-4.2365343E18)
            int r4 = X.AnonymousClass0fD.A00(r0)
            super.onStop()
            X.SFj r3 = r7.A01
            int r1 = X.C9121RPt.A00
            r0 = 1
            int r1 = r1 - r0
            X.C9121RPt.A00 = r1
            if (r1 >= 0) goto L_0x0020
            java.lang.String r2 = "ActivityCounter"
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r1)
            java.lang.String r0 = "sCounter = %d < 0! This should not happen!"
            X.SQO.A02(r2, r0, r1)
        L_0x0020:
            r6 = 0
            androidx.fragment.app.FragmentActivity r5 = r3.A01
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_SHOULD_FORCE_SOFT_KEYBOARD_CLOSE_ON_BROWSER_EXIT"
            boolean r2 = r1.getBooleanExtra(r0, r6)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_DISMISS_SOFT_KEYBOARD_ON_FINISH"
            boolean r0 = r1.getBooleanExtra(r0, r6)
            if (r2 != 0) goto L_0x003b
            if (r0 == 0) goto L_0x0054
        L_0x003b:
            androidx.fragment.app.FragmentActivity r2 = r3.A01
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = r2.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            android.view.View r0 = r2.getCurrentFocus()
            if (r1 == 0) goto L_0x0054
            if (r0 == 0) goto L_0x0054
            android.os.IBinder r0 = r0.getWindowToken()
            r1.hideSoftInputFromWindow(r0, r6)
        L_0x0054:
            int r0 = X.C9121RPt.A00
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x0066
            java.util.regex.Pattern r0 = X.SCX.A01     // Catch:{  }
            X.SlD r1 = X.RUF.A00()     // Catch:{  }
            r0 = 0
            r1.EDE(r0)     // Catch:{ NameNotFoundException -> 0x0066 }
        L_0x0066:
            androidx.fragment.app.FragmentActivity r3 = r3.A01
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ANIMATION"
            int[] r2 = r1.getIntArrayExtra(r0)
            if (r2 == 0) goto L_0x0081
            int r1 = r2.length
            r0 = 4
            if (r1 != r0) goto L_0x0081
            r0 = 2
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            r3.overridePendingTransition(r1, r0)
        L_0x0081:
            r0 = 2127024133(0x7ec7d005, float:1.3279824E38)
            X.AnonymousClass0fD.A07(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity.onStop():void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity, android.app.Activity] */
    public final void onUserInteraction() {
        Bundle bundle;
        SRY sry;
        BrowserLiteInMainProcessIGActivity.super.onUserInteraction();
        C11209SFj sFj = this.A01;
        if (!(sFj.A02 == null || (sry = sFj.A04) == null)) {
            sry.A07(sFj.A02.A08, Collections.singletonMap("action", "ig_browser_touch_interaction"));
        }
        S4Q s4q = sFj.A05;
        if (s4q != null) {
            BrowserLiteFragment browserLiteFragment = sFj.A02;
            if (browserLiteFragment == null) {
                bundle = null;
            } else {
                bundle = browserLiteFragment.A08;
            }
            s4q.A00(bundle);
        }
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
