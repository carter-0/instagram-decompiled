package X;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;

/* renamed from: X.Slb  reason: case insensitive filesystem */
public final class C12049Slb implements C13923TlR, C13922TlQ {
    public boolean A00 = false;
    public SHX A01;
    public final C41803B1i A02;
    public final C10189Ro5 A03 = new C10189Ro5();
    public final C340027ka A04;
    public final HashSet A05;
    public final boolean A06;
    public final boolean A07;

    public final void AQ3(QLA qla, String str, boolean z) {
    }

    public final void CrW(QLA qla) {
    }

    public final void D9l(QLA qla) {
    }

    public final void DDj(Context context, Intent intent, View view, C340027ka r4, C13847TiP tiP, C340037kb r6) {
    }

    public final void DOE(QLA qla, String str) {
    }

    public final void DW1(QLA qla, String str) {
    }

    public final void DW4(QLA qla, long j) {
    }

    public final void DWB(String str) {
        this.A00 = false;
    }

    public final void DsY(MotionEvent motionEvent, View view) {
    }

    public final void Esf(QLA qla, Boolean bool, Boolean bool2, String str) {
    }

    public final void FNP(QLA qla) {
    }

    public final String getUrl() {
        return null;
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    private boolean A00() {
        Intent intent;
        C340027ka r0 = this.A04;
        if (r0 == null || (intent = r0.getIntent()) == null) {
            return false;
        }
        1Av A002 = 1Au.A00(09i.A0A.A06(C61350mg.A00(intent)));
        return AnonymousClass7TG.A1a(A002, A002.A7C, 1Av.A8a, 168);
    }

    public final boolean EsV(QLA qla, Boolean bool, Boolean bool2, String str) {
        if (this.A00) {
            return false;
        }
        return A01(qla, str);
    }

    public final void destroy() {
        C340027ka r2;
        String str;
        if (this.A06 && (r2 = this.A04) != null && r2.C8U() != null && r2.C8U().A0b) {
            QLA C8U = r2.C8U();
            if (C8U.A0b) {
                str = C8U.A0M;
            } else {
                str = null;
            }
            if (r2.getIntent() != null) {
                C13801ThK A002 = C9224RUb.A00(r2.getIntent());
                if (str == null) {
                    str = "";
                }
                A002.ClI(str);
            }
        }
    }

    public C12049Slb(C41803B1i b1i, C340027ka r3, HashSet hashSet, boolean z, boolean z2) {
        this.A04 = r3;
        this.A02 = b1i;
        this.A05 = hashSet;
        this.A07 = z2;
        this.A06 = z;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.QcV, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v30, types: [X.QcV, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v35, types: [java.lang.Object, X.0bY] */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f4, code lost:
        if (A00() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019f, code lost:
        if (r0 != null) goto L_0x01a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A01(X.QLA r15, java.lang.String r16) {
        /*
            r14 = this;
            boolean r0 = r14.A00()
            r4 = 0
            if (r0 == 0) goto L_0x01a8
            X.Ro5 r7 = r14.A03
            java.util.HashSet r6 = r14.A05
            java.util.HashSet r5 = X.AnonymousClass7TE.A1F()
            r12 = r16
            if (r16 == 0) goto L_0x00aa
            X.0TC r0 = new X.0TC
            r0.<init>()
            android.net.Uri r9 = X.0cp.A00(r0, r12)
            if (r9 == 0) goto L_0x00a2
            java.lang.String r0 = r9.getScheme()
            if (r0 == 0) goto L_0x00a2
            java.lang.String r1 = r9.getHost()
            java.lang.String r2 = ""
            r3 = r2
            if (r1 != 0) goto L_0x007f
            r8 = r2
        L_0x002e:
            java.lang.String r1 = r9.getPath()
            if (r1 == 0) goto L_0x003a
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r1.toLowerCase(r0)
        L_0x003a:
            java.lang.String r1 = "www."
            boolean r0 = r8.startsWith(r1)
            if (r0 == 0) goto L_0x004d
            int r0 = r8.indexOf(r1)
            int r0 = r0 + 4
            java.lang.String r8 = r8.substring(r0)
        L_0x004d:
            java.lang.String r10 = "/"
            java.lang.String[] r0 = r2.split(r10)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.HashSet r9 = X.AnonymousClass7TE.A1F()
            java.lang.StringBuilder r2 = X.Pxe.A16(r3)
            java.util.Iterator r11 = r0.iterator()
        L_0x0063:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.String r1 = X.AnonymousClass7TE.A18(r11)
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = X.Pxg.A0s(r10, r1, r2)
            java.lang.String r0 = X.002.A0R(r8, r0)
            r9.add(r0)
            goto L_0x0063
        L_0x007f:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r8 = r1.toLowerCase(r0)
            goto L_0x002e
        L_0x0086:
            r5.addAll(r9)
            java.util.HashSet r3 = X.AnonymousClass7TE.A1F()
        L_0x008d:
            java.lang.String r2 = "."
            int r1 = r8.indexOf(r2)
            r0 = -1
            if (r1 == r0) goto L_0x00a7
            r3.add(r8)
            int r0 = r8.indexOf(r2)
            java.lang.String r8 = X.Pxe.A0v(r0, r8)
            goto L_0x008d
        L_0x00a2:
            java.util.HashSet r5 = X.AnonymousClass7TE.A1F()
            goto L_0x00aa
        L_0x00a7:
            r5.addAll(r3)
        L_0x00aa:
            java.util.HashSet r0 = r7.A00
            boolean r0 = java.util.Collections.disjoint(r5, r0)
            if (r0 == 0) goto L_0x01a8
            if (r6 == 0) goto L_0x01a8
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x01a8
            boolean r0 = java.util.Collections.disjoint(r5, r6)
            if (r0 != 0) goto L_0x01a8
            boolean r0 = r14.A07
            r3 = 1
            if (r0 == 0) goto L_0x00d9
            X.7ka r1 = r14.A04
            if (r1 == 0) goto L_0x00d9
            X.B1i r0 = r14.A02
            if (r0 == 0) goto L_0x00d9
            com.facebook.browser.lite.BrowserLiteFragment r1 = (com.facebook.browser.lite.BrowserLiteFragment) r1
            X.A9z r1 = r1.A0d
            if (r1 == 0) goto L_0x00d9
            boolean r0 = r1.A0p
            if (r0 == 0) goto L_0x00d9
            r1.A0k = r3
        L_0x00d9:
            X.7ka r11 = r14.A04
            r11.getClass()
            X.SHX r8 = r14.A01
            if (r8 != 0) goto L_0x0103
            r0 = r15
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            android.content.Context r9 = r0.getContext()
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r14.A00()
            r13 = 1
            if (r0 != 0) goto L_0x00f7
        L_0x00f6:
            r13 = 0
        L_0x00f7:
            X.RrG r10 = new X.RrG
            r10.<init>(r14, r15)
            X.SHX r8 = new X.SHX
            r8.<init>(r9, r10, r11, r12, r13)
            r14.A01 = r8
        L_0x0103:
            r8.A02 = r12
            X.7ka r5 = r8.A04
            X.QLA r0 = r5.C8U()
            r0.getClass()
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r1 = r0.A04
            r0 = 4
            r1.setImportantForAccessibility(r0)
            android.content.Intent r1 = r5.getIntent()
            r1.getClass()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_SAFE_BROWSING_IMAGE_ENABLED"
            r1.getBooleanExtra(r0, r4)
            X.C46725DkE.A02 = r8
            X.DkE r2 = new X.DkE
            r2.<init>()
            X.0hq r0 = r5.getChildFragmentManager()
            r0.getClass()
            X.0s1 r1 = new X.0s1
            r1.<init>(r0)
            java.lang.String r0 = "SafeBrowsingWarningFragment"
            r1.A0I(r0)
            r0 = 2131443983(0x7f0b410f, float:1.851005E38)
            r1.A0A(r2, r0)
            r1.A00()
            X.QLA r0 = r5.C8U()
            r0.A0b = r3
            X.QLA r0 = r5.C8U()
            java.lang.String r1 = r8.A02
            r0.A0M = r1
            r6 = r5
            com.facebook.browser.lite.BrowserLiteFragment r6 = (com.facebook.browser.lite.BrowserLiteFragment) r6
            X.TiP r0 = r6.A0U
            if (r0 == 0) goto L_0x016a
            r0.Dvv(r1)
        L_0x015b:
            r0 = 8
            r5.Eow(r0)
            X.ThK r1 = r8.A01
            if (r1 == 0) goto L_0x0169
            java.lang.String r0 = r8.A02
            r1.ClH(r0)
        L_0x0169:
            return r3
        L_0x016a:
            android.content.Context r2 = r8.A00
            if (r2 == 0) goto L_0x015b
            X.QLA r0 = r5.C8U()
            r0.A0b = r4
            X.A8t r1 = r6.A0N
            r1.getClass()
            r0 = 2131951783(0x7f1300a7, float:1.953999E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A00(r0)
            X.QLA r0 = r5.C8U()
            r0.A0b = r3
            X.A8t r0 = r6.A0N
            X.9Y2 r2 = r0.A00
            if (r2 == 0) goto L_0x015b
            java.lang.String r0 = r8.A02
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x01a2
            android.net.Uri r0 = X.Pxg.A0L(r0)
            if (r0 == 0) goto L_0x01a6
            java.lang.String r0 = r0.getHost()
            if (r0 == 0) goto L_0x01a2
        L_0x01a1:
            r1 = r0
        L_0x01a2:
            r2.A01(r1, r4)
            goto L_0x015b
        L_0x01a6:
            r0 = r1
            goto L_0x01a1
        L_0x01a8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12049Slb.A01(X.QLA, java.lang.String):boolean");
    }

    public final boolean EsT(QLA qla, String str) {
        return A01(qla, str);
    }
}
