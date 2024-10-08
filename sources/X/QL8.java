package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.iabadscontext.IABAdsContext;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.webrtc.ScreenCapturerAndroid;

public final class QL8 extends S78 {
    public static final 0TC A0R = new Object();
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public long A03 = -1;
    public SslError A04 = null;
    public C13887TjA A05;
    public C10380RrH A06;
    public String A07 = null;
    public List A08;
    public boolean A09 = true;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C;
    public final Intent A0D;
    public final BrowserLiteFragment A0E;
    public final SRY A0F;
    public final C13847TiP A0G;
    public final C340037kb A0H;
    public final 0fA A0I;
    public final boolean A0J;
    public final Context A0K;
    public final C7574QKp A0L;
    public final C10646Rvf A0M;
    public final C39774A8t A0N;
    public final C13906Tl6 A0O;
    public final Map A0P = AnonymousClass7TE.A1E();
    public final boolean A0Q;

    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f A[LOOP:0: B:45:0x0089->B:47:0x008f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.webkit.WebResourceResponse A01(X.QL8 r16, X.QLA r17, java.lang.String r18) {
        /*
            r12 = r16
            X.Rvf r5 = r12.A0M
            r2 = 0
            r1 = r18
            X.0qQ.A0B(r1, r2)
            com.facebook.browser.lite.ipc.PrefetchCacheEntry r0 = r5.A00
            r6 = 1
            r11 = 0
            if (r0 == 0) goto L_0x002d
            java.lang.String r3 = r0.A03
            boolean r3 = X.0qQ.A0K(r3, r1)
            if (r3 == 0) goto L_0x002d
            r5.A00 = r11
        L_0x001a:
            if (r0 == 0) goto L_0x0082
            java.lang.String r4 = r0.A01
            if (r4 == 0) goto L_0x0027
            int r3 = r4.length()
            if (r3 == 0) goto L_0x0027
            r6 = 0
        L_0x0027:
            if (r6 != 0) goto L_0x0082
            r5 = 0
            if (r4 == 0) goto L_0x0082
            goto L_0x0068
        L_0x002d:
            java.util.HashSet r0 = r5.A01
            if (r0 == 0) goto L_0x0082
            r4 = r1
            X.0bq r0 = X.C11429STt.A00
            int r3 = r1.length()
            r0 = 32
            if (r3 < r0) goto L_0x0040
            java.lang.String r4 = X.0JX.A00(r1)
        L_0x0040:
            X.0qQ.A07(r4)
            monitor-enter(r5)
            java.util.HashSet r0 = r5.A01     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0073
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x0075 }
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 != 0) goto L_0x0073
            monitor-exit(r5)
            X.SRY r0 = r5.A02
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r0.A06
            if (r0 == 0) goto L_0x0066
            com.facebook.browser.lite.ipc.PrefetchCacheEntry r0 = r0.Bei(r1)     // Catch:{ RemoteException -> 0x005e }
            goto L_0x001a
        L_0x005e:
            r4 = move-exception
            java.lang.String r3 = "BrowserLiteCallbacker"
            java.lang.String r0 = "Error in getPrefetchedEntry"
            X.0KC.A0J(r3, r0, r4)
        L_0x0066:
            r0 = 0
            goto L_0x001a
        L_0x0068:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0081 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0081 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0081 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0081 }
            goto L_0x0078
        L_0x0073:
            monitor-exit(r5)
            goto L_0x0082
        L_0x0075:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0078:
            java.lang.String r3 = r0.A02
            java.lang.String r0 = r0.A00
            android.webkit.WebResourceResponse r5 = new android.webkit.WebResourceResponse
            r5.<init>(r3, r0, r4)
        L_0x0081:
            r11 = r5
        L_0x0082:
            java.util.List r0 = r12.A08
            java.util.Iterator r3 = r0.iterator()
            r9 = 0
        L_0x0089:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0093
            r3.next()
            goto L_0x0089
        L_0x0093:
            boolean r0 = r12.A0Q
            if (r0 == 0) goto L_0x00b8
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r14 = 0
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "https://connect.facebook.net/en_US/fbevents.js"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d2
            java.lang.String r14 = "fbevents"
        L_0x00a8:
            long r15 = java.lang.System.currentTimeMillis()
            if (r14 == 0) goto L_0x00b8
            X.TK3 r10 = new X.TK3
            r13 = r17
            r10.<init>(r11, r12, r13, r14, r15)
            X.SB5.A00(r10)
        L_0x00b8:
            int r0 = r12.A02
            int r0 = r0 + 1
            r12.A02 = r0
            if (r11 == 0) goto L_0x0104
            java.lang.String r2 = "BrowserLiteFragment"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "Use prefetched response for %s"
            X.SQO.A01(r2, r0, r1)
            int r0 = r12.A01
            int r0 = r0 + 1
            r12.A01 = r0
            return r11
        L_0x00d2:
            java.lang.String r0 = "https://www.facebook.com/tr?"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0100
            java.lang.String r0 = "https://www.facebook.com/tr/?"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0100
            java.lang.String r0 = "https://www.google-analytics.com/analytics.js"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ed
            java.lang.String r14 = "ga_js"
            goto L_0x00a8
        L_0x00ed:
            java.lang.String r0 = "https://www.google-analytics.com/r/collect?"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00fd
            java.lang.String r0 = "https://www.google-analytics.com/r/collect/?"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00a8
        L_0x00fd:
            java.lang.String r14 = "ga_collect"
            goto L_0x00a8
        L_0x0100:
            java.lang.String r14 = "tr"
            goto L_0x00a8
        L_0x0104:
            boolean r0 = X.S2G.A04
            if (r0 == 0) goto L_0x011d
            java.lang.String r0 = X.C11429STt.A03(r1)
            boolean r0 = X.C11429STt.A06(r0)
            if (r0 == 0) goto L_0x011d
            java.lang.String r4 = "BrowserLiteFragment"
            java.lang.Object[] r3 = new java.lang.Object[]{r1}
            java.lang.String r0 = "Download from Internet for %s"
            X.SQO.A01(r4, r0, r3)
        L_0x011d:
            com.facebook.browser.lite.BrowserLiteFragment r5 = r12.A0E
            java.lang.String r0 = r5.A1Q
            if (r0 == 0) goto L_0x01b3
            java.lang.String r4 = r5.A1Q
            int r3 = r4.hashCode()
            r0 = -1573203972(0xffffffffa23acffc, float:-2.5317807E-18)
            if (r3 == r0) goto L_0x0191
            r0 = 2402104(0x24a738, float:3.366065E-39)
            if (r3 == r0) goto L_0x01b3
            r0 = 1838690780(0x6d9831dc, float:5.88775E27)
            if (r3 != r0) goto L_0x01b3
            java.lang.String r0 = "DOMAINS_ONLY"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01b3
            r0 = 1
        L_0x0141:
            r4 = 50
            X.ADg r7 = r5.A0O
            if (r0 == 0) goto L_0x014e
            r7.A00(r1)
        L_0x014a:
            java.util.Set r3 = r7.A02
            monitor-enter(r3)
            goto L_0x019b
        L_0x014e:
            java.util.Set r6 = r7.A02
            monitor-enter(r6)
            r7.A00(r1)     // Catch:{ all -> 0x01b0 }
            java.lang.String r8 = X.C11429STt.A03(r1)     // Catch:{ all -> 0x01b0 }
            if (r8 == 0) goto L_0x0188
            java.lang.String r0 = "image/"
            boolean r0 = r8.startsWith(r0)     // Catch:{ all -> 0x01b0 }
            if (r0 == 0) goto L_0x0188
        L_0x0162:
            java.util.Map r3 = r7.A00     // Catch:{ all -> 0x01b0 }
            boolean r0 = r3.containsKey(r8)     // Catch:{ all -> 0x01b0 }
            if (r0 == 0) goto L_0x0186
            java.lang.Object r0 = r3.get(r8)     // Catch:{ all -> 0x01b0 }
            int r0 = X.Pxe.A09(r0)     // Catch:{ all -> 0x01b0 }
        L_0x0172:
            int r0 = r0 + 1
            X.C66580MXl.A1T(r8, r3, r0)     // Catch:{ all -> 0x01b0 }
            java.lang.String r0 = "image/"
            boolean r0 = r8.startsWith(r0)     // Catch:{ all -> 0x01b0 }
            if (r0 == 0) goto L_0x0184
            java.util.Set r0 = r7.A01     // Catch:{ all -> 0x01b0 }
            r0.add(r1)     // Catch:{ all -> 0x01b0 }
        L_0x0184:
            monitor-exit(r6)     // Catch:{ all -> 0x01b0 }
            goto L_0x014a
        L_0x0186:
            r0 = 0
            goto L_0x0172
        L_0x0188:
            boolean r0 = X.C11429STt.A06(r8)     // Catch:{ all -> 0x01b0 }
            if (r0 == 0) goto L_0x0184
            if (r8 == 0) goto L_0x0184
            goto L_0x0162
        L_0x0191:
            java.lang.String r0 = "DOMAINS_WITH_RESOURCES"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01b3
            r0 = 0
            goto L_0x0141
        L_0x019b:
            java.util.Map r0 = r7.A00     // Catch:{ all -> 0x01ad }
            int r1 = r0.size()     // Catch:{ all -> 0x01ad }
            int r0 = r3.size()     // Catch:{ all -> 0x01ad }
            int r1 = r1 + r0
            monitor-exit(r3)     // Catch:{ all -> 0x01ad }
            if (r1 < r4) goto L_0x01b3
            com.facebook.browser.lite.BrowserLiteFragment.A0I(r5, r2)
            return r9
        L_0x01ad:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01ad }
            throw r0
        L_0x01b0:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01b0 }
            throw r0
        L_0x01b3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QL8.A01(X.QL8, X.QLA, java.lang.String):android.webkit.WebResourceResponse");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d3, code lost:
        if (r0 == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01db, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        X.0KC.A0J("BrowserLiteCallbacker", "Error in handleShareUriRedirectSync", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        r14 = r8.A05();
        r13 = r10.A0F;
        r0 = r13.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (r0 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r17 = r0.Cn4(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r17 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        r9 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0309, code lost:
        if (r1.equals(r14.getScheme()) != false) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x036a, code lost:
        if (r13.getPath().equals(r14.getPath()) == false) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03c9, code lost:
        if (com.facebook.browser.lite.BrowserLiteFragment.A0O(r8, r9) != false) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (r0.CIr(r11, r1, r9) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.0KC.A0J("BrowserLiteCallbacker", "Error in handleMDotMeUriRedirectSync", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        if (com.facebook.browser.lite.BrowserLiteFragment.A0O(r8, r9) == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        r1 = r3.A1M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        if (r1.size() <= 1) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        r14 = ((X.QLA) r1.get(r1.size() - 2)).A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c3, code lost:
        if (r14 == null) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c5, code lost:
        r1 = r7.toString();
        r0 = r13.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        if (r0 == null) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d1, code lost:
        if (r0.CJC(r1, r14) == false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0148, code lost:
        r7 = X.C11429STt.A01(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014c, code lost:
        if (r14 == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014e, code lost:
        r1 = X.0cp.A03(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0158, code lost:
        if (r1.getHost() == null) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0168, code lost:
        if (r1.getHost().toLowerCase().endsWith(".facebook.com") == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x016a, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0176, code lost:
        if ("m.me".equals(r1.getQueryParameter("handler")) != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0178, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x017a, code lost:
        if (r7 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0180, code lost:
        if (r7.getHost() == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0182, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0191, code lost:
        if (X.C11429STt.A07(r7.getHost().toLowerCase(java.util.Locale.ENGLISH), "m.me") != false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0193, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0194, code lost:
        if (r7 == null) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x019a, code lost:
        if (r7.getHost() == null) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x019c, code lost:
        r0 = r7.getHost();
        r1 = java.util.Locale.ENGLISH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ad, code lost:
        if (X.C11429STt.A07(r0.toLowerCase(r1), "messenger.com") == false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b3, code lost:
        if (r7.getEncodedPath() == null) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b5, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01c4, code lost:
        if (r7.getEncodedPath().toLowerCase(r1).startsWith("/t/") != false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c6, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c7, code lost:
        if (r16 != false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c9, code lost:
        if (r15 != false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01cb, code lost:
        if (r0 == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01cd, code lost:
        r11 = r3.A08;
        r1 = r3.A0e;
        r0 = r13.A06;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0212 A[Catch:{ RemoteException -> 0x005e, all -> 0x040d }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0227 A[Catch:{ RemoteException -> 0x005e, all -> 0x040d }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x026f A[Catch:{ RemoteException -> 0x005e, all -> 0x040d }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0277 A[Catch:{ RemoteException -> 0x005e, all -> 0x040d }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02b4 A[Catch:{ RemoteException -> 0x005e, all -> 0x040d }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02d1 A[Catch:{ RemoteException -> 0x005e, all -> 0x040d }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x02d7 A[Catch:{ RemoteException -> 0x005e, all -> 0x040d }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0374 A[Catch:{ RemoteException -> 0x005e, all -> 0x040d }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03b8 A[Catch:{ RemoteException -> 0x005e, all -> 0x040d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.QL8 r20, X.QLA r21, java.lang.Boolean r22, java.lang.Boolean r23, java.lang.String r24) {
        /*
            r9 = r24
            java.lang.String r4 = "BLWVC.shouldOverrideUrlLoading.End"
            r5 = 0
            X.SSR r1 = X.SSR.A00()     // Catch:{ all -> 0x040d }
            java.lang.String r0 = "BLWVC.shouldOverrideUrlLoading.Start"
            r1.A04(r0)     // Catch:{ all -> 0x040d }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x040d }
            r2 = 1
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "about:blank"
            boolean r0 = r9.startsWith(r0)     // Catch:{ all -> 0x040d }
            if (r0 != 0) goto L_0x006b
            r10 = r20
            android.content.Intent r6 = r10.A0D     // Catch:{ all -> 0x040d }
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_TABS_ENABLED"
            r6.getBooleanExtra(r0, r5)     // Catch:{ all -> 0x040d }
            java.util.List r0 = r10.A08     // Catch:{ all -> 0x040d }
            r18 = r0
            java.util.Iterator r7 = r18.iterator()     // Catch:{ all -> 0x040d }
        L_0x002e:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x040d }
            r8 = r21
            r20 = r22
            r19 = r23
            if (r0 == 0) goto L_0x004b
            java.lang.Object r3 = r7.next()     // Catch:{ all -> 0x040d }
            X.TlQ r3 = (X.C13922TlQ) r3     // Catch:{ all -> 0x040d }
            r1 = r20
            r0 = r19
            boolean r0 = r3.EsV(r8, r1, r0, r9)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x002e
            goto L_0x006b
        L_0x004b:
            java.lang.String r14 = r8.A05()     // Catch:{ all -> 0x040d }
            X.SRY r13 = r10.A0F     // Catch:{ all -> 0x040d }
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r13.A06     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0066
            java.lang.String r17 = r0.Cn4(r9)     // Catch:{ RemoteException -> 0x005e }
            if (r17 == 0) goto L_0x00d4
            r9 = r17
            goto L_0x00d4
        L_0x005e:
            r3 = move-exception
            java.lang.String r1 = "BrowserLiteCallbacker"
            java.lang.String r0 = "Error in maybeOverrideUrl"
            X.0KC.A0J(r1, r0, r3)     // Catch:{ all -> 0x040d }
        L_0x0066:
            r17 = 0
            goto L_0x00d4
        L_0x0069:
            if (r0 == 0) goto L_0x007b
        L_0x006b:
            X.SSR r0 = X.SSR.A00()
            r0.A04(r4)
            return r2
        L_0x0073:
            r11 = move-exception
            java.lang.String r1 = "BrowserLiteCallbacker"
            java.lang.String r0 = "Error in handleMDotMeUriRedirectSync"
            X.0KC.A0J(r1, r0, r11)     // Catch:{ all -> 0x040d }
        L_0x007b:
            java.util.List r11 = X.C11429STt.A01     // Catch:{ all -> 0x040d }
            if (r7 == 0) goto L_0x01e3
            java.util.Set r1 = X.C11429STt.A02     // Catch:{ all -> 0x040d }
            java.lang.String r0 = r7.getHost()     // Catch:{ all -> 0x040d }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x01e3
            java.lang.String r1 = r7.getEncodedPath()     // Catch:{ all -> 0x040d }
            if (r1 == 0) goto L_0x01e3
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x040d }
        L_0x0095:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x01e3
            java.lang.String r0 = X.AnonymousClass7TE.A18(r11)     // Catch:{ all -> 0x040d }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0095
            boolean r0 = com.facebook.browser.lite.BrowserLiteFragment.A0O(r8, r9)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x00c3
            java.util.Stack r1 = r3.A1M     // Catch:{ all -> 0x040d }
            int r0 = r1.size()     // Catch:{ all -> 0x040d }
            if (r0 <= r2) goto L_0x00c3
            int r0 = r1.size()     // Catch:{ all -> 0x040d }
            int r0 = r0 + -2
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x040d }
            X.QLA r0 = (X.QLA) r0     // Catch:{ all -> 0x040d }
            java.lang.String r14 = r0.A05()     // Catch:{ all -> 0x040d }
        L_0x00c3:
            if (r14 == 0) goto L_0x01e3
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x040d }
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r13.A06     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x01e3
            boolean r0 = r0.CJC(r1, r14)     // Catch:{ RemoteException -> 0x01db }
            if (r0 == 0) goto L_0x01e3
            goto L_0x0140
        L_0x00d4:
            com.facebook.browser.lite.BrowserLiteFragment r3 = r10.A0E     // Catch:{ all -> 0x040d }
            boolean r0 = r3.A0s     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x00dd
            X.0cp.A03(r9)     // Catch:{ all -> 0x040d }
        L_0x00dd:
            r12 = 0
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IAB_PLAY_STORE_ALLEYOOP_ENABLED"
            boolean r11 = r6.getBooleanExtra(r0, r5)     // Catch:{ all -> 0x040d }
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ALLEYOOP_CAMPAIGN_GROUP_IDS"
            java.lang.String r7 = r6.getStringExtra(r0)     // Catch:{ all -> 0x040d }
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ALLEYOOP_AD_ACCOUNT_IDS"
            java.lang.String r1 = r6.getStringExtra(r0)     // Catch:{ all -> 0x040d }
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ALLEYOOP_PACKAGE_NAME"
            java.lang.String r0 = r6.getStringExtra(r0)     // Catch:{ all -> 0x040d }
            boolean r7 = X.QL3.A01(r9, r7, r1, r0, r11)     // Catch:{ all -> 0x040d }
            java.util.List r0 = X.SQY.A00     // Catch:{ all -> 0x040d }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x040d }
        L_0x0100:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0148
            java.lang.Object r11 = r15.next()     // Catch:{ all -> 0x040d }
            X.Tgh r11 = (X.C13769Tgh) r11     // Catch:{ all -> 0x040d }
            android.os.Bundle r1 = r11.ALa(r9, r12, r7)     // Catch:{ all -> 0x040d }
            android.content.Context r0 = r10.A0K     // Catch:{ all -> 0x040d }
            boolean r0 = r11.FID(r0, r1)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0100
            java.lang.String r0 = "package_names"
            java.util.ArrayList r1 = r1.getStringArrayList(r0)     // Catch:{ all -> 0x040d }
            java.util.ArrayList r0 = X.QL3.A00     // Catch:{ all -> 0x040d }
            if (r1 != r0) goto L_0x0137
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()     // Catch:{ all -> 0x040d }
            X.SRY r6 = r3.A0L     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0137
            X.07V r1 = r0.getLifecycle()     // Catch:{ all -> 0x040d }
            X.SdR r0 = new X.SdR     // Catch:{ all -> 0x040d }
            r0.<init>(r3, r6, r9, r7)     // Catch:{ all -> 0x040d }
            r1.A09(r0)     // Catch:{ all -> 0x040d }
        L_0x0137:
            X.B2o r0 = r3.A0V     // Catch:{ all -> 0x040d }
            X.2Fj r0 = r0.Avi()     // Catch:{ all -> 0x040d }
            r0.A0B(r9)     // Catch:{ all -> 0x040d }
        L_0x0140:
            boolean r0 = com.facebook.browser.lite.BrowserLiteFragment.A0O(r8, r9)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x006b
            goto L_0x03cb
        L_0x0148:
            android.net.Uri r7 = X.C11429STt.A01(r9)     // Catch:{ all -> 0x040d }
            if (r14 == 0) goto L_0x007b
            android.net.Uri r1 = X.0cp.A03(r14)     // Catch:{ all -> 0x040d }
            java.lang.String r0 = r1.getHost()     // Catch:{ all -> 0x040d }
            java.lang.String r11 = "m.me"
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = r1.getHost()     // Catch:{ all -> 0x040d }
            java.lang.String r15 = r0.toLowerCase()     // Catch:{ all -> 0x040d }
            java.lang.String r0 = ".facebook.com"
            boolean r0 = r15.endsWith(r0)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = "handler"
            java.lang.String r0 = r1.getQueryParameter(r0)     // Catch:{ all -> 0x040d }
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x040d }
            r16 = 1
            if (r0 != 0) goto L_0x017a
        L_0x0178:
            r16 = 0
        L_0x017a:
            if (r7 == 0) goto L_0x0193
            java.lang.String r0 = r7.getHost()     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0193
            java.lang.String r1 = r7.getHost()     // Catch:{ all -> 0x040d }
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x040d }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ all -> 0x040d }
            boolean r0 = X.C11429STt.A07(r0, r11)     // Catch:{ all -> 0x040d }
            r15 = 1
            if (r0 != 0) goto L_0x0196
        L_0x0193:
            r15 = 0
            if (r7 == 0) goto L_0x01c6
        L_0x0196:
            java.lang.String r0 = r7.getHost()     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = r7.getHost()     // Catch:{ all -> 0x040d }
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x040d }
            java.lang.String r11 = r0.toLowerCase(r1)     // Catch:{ all -> 0x040d }
            java.lang.String r0 = "messenger.com"
            boolean r0 = X.C11429STt.A07(r11, r0)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = r7.getEncodedPath()     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = r7.getEncodedPath()     // Catch:{ all -> 0x040d }
            java.lang.String r1 = r0.toLowerCase(r1)     // Catch:{ all -> 0x040d }
            java.lang.String r0 = "/t/"
            boolean r1 = r1.startsWith(r0)     // Catch:{ all -> 0x040d }
            r0 = 1
            if (r1 != 0) goto L_0x01c7
        L_0x01c6:
            r0 = 0
        L_0x01c7:
            if (r16 != 0) goto L_0x01cd
            if (r15 != 0) goto L_0x01cd
            if (r0 == 0) goto L_0x007b
        L_0x01cd:
            android.os.Bundle r11 = r3.A08     // Catch:{ all -> 0x040d }
            com.facebook.privacy.zone.policy.ZonePolicy r1 = r3.A0e     // Catch:{ all -> 0x040d }
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r13.A06     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x007b
            boolean r0 = r0.CIr(r11, r1, r9)     // Catch:{ RemoteException -> 0x0073 }
            goto L_0x0069
        L_0x01db:
            r11 = move-exception
            java.lang.String r1 = "BrowserLiteCallbacker"
            java.lang.String r0 = "Error in handleShareUriRedirectSync"
            X.0KC.A0J(r1, r0, r11)     // Catch:{ all -> 0x040d }
        L_0x01e3:
            android.net.Uri r11 = X.0cp.A03(r9)     // Catch:{ all -> 0x040d }
            if (r11 == 0) goto L_0x0227
            java.lang.String r1 = r11.getHost()     // Catch:{ all -> 0x040d }
            if (r1 == 0) goto L_0x0227
            java.lang.String r0 = "our.intern."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x040d }
            if (r0 != 0) goto L_0x0227
            java.lang.String r0 = ".facebook.com"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0227
            boolean r0 = X.C11429STt.A04(r11)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0227
            java.util.Set r1 = r11.getQueryParameterNames()     // Catch:{ all -> 0x040d }
            java.lang.String r0 = "force_faceweb"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0227
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r13.A06     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0222
            r0.Cff(r9)     // Catch:{ RemoteException -> 0x021a }
            goto L_0x0222
        L_0x021a:
            r6 = move-exception
            java.lang.String r1 = "BrowserLiteCallbacker"
            java.lang.String r0 = "Error in launchUrlInFaceweb"
            X.0KC.A0J(r1, r0, r6)     // Catch:{ all -> 0x040d }
        L_0x0222:
            X.DbT.A1K(r3)     // Catch:{ all -> 0x040d }
            goto L_0x006b
        L_0x0227:
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r13.A06     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x023b
            boolean r0 = r0.CJ3(r9)     // Catch:{ RemoteException -> 0x0233 }
            if (r0 == 0) goto L_0x023b
            goto L_0x006b
        L_0x0233:
            r13 = move-exception
            java.lang.String r1 = "BrowserLiteCallbacker"
            java.lang.String r0 = "Error in handleOpenBrowserExtensionUrl"
            X.0KC.A0J(r1, r0, r13)     // Catch:{ all -> 0x040d }
        L_0x023b:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_GOOGLE_OAUTH2_LOGGING_ENABLED"
            boolean r0 = r6.getBooleanExtra(r0, r5)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x02d3
            X.0TC r0 = A0R     // Catch:{ all -> 0x040d }
            android.net.Uri r14 = X.0cp.A00(r0, r9)     // Catch:{ all -> 0x040d }
            if (r14 == 0) goto L_0x02d3
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x040d }
            java.lang.String r0 = "https://accounts.google.com/signin/oauth/error"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0271
            java.lang.String r1 = "authError"
            java.lang.String r0 = r14.getQueryParameter(r1)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0271
            java.lang.String r0 = r14.getQueryParameter(r1)     // Catch:{ all -> 0x040d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x040d }
            if (r0 != 0) goto L_0x0271
            X.A9z r1 = r3.A0d     // Catch:{ all -> 0x040d }
            boolean r0 = r1.A0p     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0271
            r1.A0f = r2     // Catch:{ all -> 0x040d }
        L_0x0271:
            java.lang.String r1 = r14.getPath()     // Catch:{ all -> 0x040d }
            if (r1 != 0) goto L_0x0279
            java.lang.String r1 = ""
        L_0x0279:
            java.lang.String r0 = "^/o/oauth2/(v[0-9]+/)?auth(/)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x040d }
            java.util.regex.Matcher r13 = r0.matcher(r1)     // Catch:{ all -> 0x040d }
            java.lang.String r0 = r14.getHost()     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x02d3
            java.lang.String r1 = r14.getHost()     // Catch:{ all -> 0x040d }
            java.lang.String r0 = "accounts.google.com"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x02d3
            boolean r0 = r13.find()     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x02d3
            java.lang.String r13 = "redirect_uri"
            java.lang.String r0 = r14.getQueryParameter(r13)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x02d3
            java.lang.String r0 = r14.getQueryParameter(r13)     // Catch:{ all -> 0x040d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x040d }
            if (r0 != 0) goto L_0x02d3
            X.A9z r1 = r3.A0d     // Catch:{ all -> 0x040d }
            boolean r0 = r1.A0p     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x02b6
            r1.A0e = r2     // Catch:{ all -> 0x040d }
        L_0x02b6:
            java.lang.String r1 = r14.getQueryParameter(r13)     // Catch:{ all -> 0x040d }
            if (r1 == 0) goto L_0x02d3
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ all -> 0x040d }
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch:{ all -> 0x040d }
            java.lang.String r0 = "storagerelay"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x02d3
            X.A9z r1 = r3.A0d     // Catch:{ all -> 0x040d }
            boolean r0 = r1.A0p     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x02d3
            r1.A0h = r2     // Catch:{ all -> 0x040d }
        L_0x02d3:
            android.content.Intent r0 = r3.A06     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x036c
            java.lang.String r1 = "OAUTH_REDIRECT_URI"
            boolean r0 = r0.hasExtra(r1)     // Catch:{ all -> 0x040d }
            java.lang.String r13 = "OAUTH_REDIRECT_SCHEME"
            if (r0 != 0) goto L_0x02eb
            android.content.Intent r0 = r3.A06     // Catch:{ all -> 0x040d }
            boolean r0 = r0.hasExtra(r13)     // Catch:{ all -> 0x040d }
            if (r0 != 0) goto L_0x02eb
            goto L_0x036c
        L_0x02eb:
            android.net.Uri r14 = X.0cp.A03(r9)     // Catch:{ all -> 0x040d }
            android.content.Intent r0 = r3.A06     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0319
            boolean r0 = r0.hasExtra(r13)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x0319
            android.content.Intent r0 = r3.A06     // Catch:{ all -> 0x040d }
            java.lang.String r1 = r0.getStringExtra(r13)     // Catch:{ all -> 0x040d }
            if (r1 == 0) goto L_0x036c
            java.lang.String r0 = r14.getScheme()     // Catch:{ all -> 0x040d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x036c
        L_0x030b:
            r0 = -1
            r3.A00 = r0     // Catch:{ all -> 0x040d }
            java.lang.String r1 = "OAUTH_REDIRECT"
            r0 = 4
            com.facebook.browser.lite.BrowserLiteFragment.A0G(r3, r1)     // Catch:{ all -> 0x040d }
            r3.AI4(r0, r9)     // Catch:{ all -> 0x040d }
            goto L_0x006b
        L_0x0319:
            android.content.Intent r0 = r3.A06     // Catch:{ all -> 0x040d }
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x036c
            android.content.Intent r0 = r3.A06     // Catch:{ all -> 0x040d }
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ all -> 0x040d }
            android.net.Uri r13 = X.0cp.A03(r0)     // Catch:{ all -> 0x040d }
            java.lang.String r1 = r13.getHost()     // Catch:{ all -> 0x040d }
            if (r1 == 0) goto L_0x036c
            java.lang.String r0 = r14.getHost()     // Catch:{ all -> 0x040d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x036c
            int r1 = r13.getPort()     // Catch:{ all -> 0x040d }
            int r0 = r14.getPort()     // Catch:{ all -> 0x040d }
            if (r1 != r0) goto L_0x036c
            android.content.Intent r1 = r3.A06     // Catch:{ all -> 0x040d }
            if (r1 == 0) goto L_0x030b
            java.lang.String r0 = "OAUTH_STRICT_URI_MATCHING"
            boolean r0 = r1.getBooleanExtra(r0, r5)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x030b
            java.lang.String r0 = r13.getPath()     // Catch:{ all -> 0x040d }
            if (r0 != 0) goto L_0x035e
            java.lang.String r0 = r14.getPath()     // Catch:{ all -> 0x040d }
            if (r0 != 0) goto L_0x036c
            goto L_0x030b
        L_0x035e:
            java.lang.String r1 = r13.getPath()     // Catch:{ all -> 0x040d }
            java.lang.String r0 = r14.getPath()     // Catch:{ all -> 0x040d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x040d }
            if (r0 != 0) goto L_0x030b
        L_0x036c:
            if (r17 != 0) goto L_0x03b8
            boolean r0 = r11.equals(r7)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x03b8
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x040d }
            long r0 = r10.A03     // Catch:{ all -> 0x040d }
            long r12 = r6 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x039e
            int r0 = r3.A04     // Catch:{ all -> 0x040d }
            int r0 = r0 + 1
            r3.A04 = r0     // Catch:{ all -> 0x040d }
            android.net.Uri r0 = r3.A07     // Catch:{ all -> 0x040d }
            java.lang.String r1 = r0.getHost()     // Catch:{ all -> 0x040d }
            java.lang.String r0 = r11.getHost()     // Catch:{ all -> 0x040d }
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x039e
            int r0 = r3.A03     // Catch:{ all -> 0x040d }
            int r0 = r0 + 1
            r3.A03 = r0     // Catch:{ all -> 0x040d }
        L_0x039e:
            r10.A03 = r6     // Catch:{ all -> 0x040d }
            java.util.Iterator r3 = r18.iterator()     // Catch:{ all -> 0x040d }
        L_0x03a4:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x041a
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x040d }
            X.TlQ r2 = (X.C13922TlQ) r2     // Catch:{ all -> 0x040d }
            r1 = r20
            r0 = r19
            r2.Esf(r8, r1, r0, r9)     // Catch:{ all -> 0x040d }
            goto L_0x03a4
        L_0x03b8:
            if (r7 != 0) goto L_0x0404
            java.lang.String r0 = "BrowserLiteIntent.IAB_EXTERNAL_INTERSTITIAL_ENABLED"
            boolean r0 = r6.getBooleanExtra(r0, r5)     // Catch:{ all -> 0x040d }
            if (r0 != 0) goto L_0x03d0
            r3.A0f(r9)     // Catch:{ all -> 0x040d }
            boolean r0 = com.facebook.browser.lite.BrowserLiteFragment.A0O(r8, r9)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x03dd
        L_0x03cb:
            com.facebook.browser.lite.BrowserLiteFragment.A0D(r3)     // Catch:{ all -> 0x040d }
            goto L_0x006b
        L_0x03d0:
            boolean r0 = r3.A0f(r9)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x006b
            boolean r0 = com.facebook.browser.lite.BrowserLiteFragment.A0O(r8, r9)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x03dd
            goto L_0x03cb
        L_0x03dd:
            X.T9q r1 = r8.A01()     // Catch:{ all -> 0x040d }
            java.util.List r0 = r1.A01     // Catch:{ all -> 0x040d }
            int r0 = r0.size()     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x03ff
            int r0 = r1.A00     // Catch:{ all -> 0x040d }
            X.TA1 r0 = r1.A00(r0)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x03ff
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x040d }
            android.net.Uri r0 = X.0cp.A03(r0)     // Catch:{ all -> 0x040d }
            boolean r0 = X.C11429STt.A04(r0)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x03ff
            goto L_0x006b
        L_0x03ff:
            r3.A0e(r2)     // Catch:{ all -> 0x040d }
            goto L_0x006b
        L_0x0404:
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x040d }
            r3.CgD(r7, r8, r12, r0)     // Catch:{ all -> 0x040d }
            goto L_0x006b
        L_0x040d:
            r3 = move-exception
            java.lang.String r2 = "BrowserLiteFragment"
            java.lang.String r1 = "shouldOverrideUrlLoading error"
            boolean r0 = X.SQO.A00     // Catch:{ all -> 0x0422 }
            if (r0 == 0) goto L_0x041a
            android.util.Log.e(r2, r1, r3)     // Catch:{ all -> 0x0422 }
        L_0x041a:
            X.SSR r0 = X.SSR.A00()
            r0.A04(r4)
            return r5
        L_0x0422:
            r1 = move-exception
            X.SSR r0 = X.SSR.A00()
            r0.A04(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QL8.A02(X.QL8, X.QLA, java.lang.Boolean, java.lang.Boolean, java.lang.String):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.RQP, java.lang.Object] */
    public final C10537Rtr A04(String str) {
        String str2;
        String[] stringArrayExtra;
        int length;
        Intent intent = this.A0D;
        if (!intent.getBooleanExtra("BrowserLiteIntent.EXTRA_ENABLE_BROWSER_PROPERTY_CLICK_ID", false)) {
            return new C10537Rtr((Long) null, (String) null, "Handling is disabled");
        }
        if (intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_EPD_OPT_OUT", false)) {
            return new C10537Rtr((Long) null, (String) null, "User is EPD opt-out");
        }
        Map map = this.A0P;
        RQP rqp = (RQP) map.get(str);
        if (rqp != null) {
            String str3 = rqp.A01;
            if (!TextUtils.isEmpty(str3)) {
                return new C10537Rtr(rqp.A00, str3, (String) null);
            }
        }
        if (!this.A0C) {
            if (intent.getBooleanExtra("BrowserLiteIntent.EXTRA_GET_CLICKID_FROM_IAB_ADS_CONTEXT", false)) {
                IABAdsContext iABAdsContext = (IABAdsContext) intent.getParcelableExtra("EXTRA_ADS_CONTEXT", IABAdsContext.class);
                if (iABAdsContext != null) {
                    List list = iABAdsContext.A0B;
                    if (!list.isEmpty()) {
                        str2 = AnonymousClass7TE.A19(list, 0);
                    }
                }
                str2 = null;
            } else {
                str2 = intent.getStringExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID");
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = A09(intent.getData());
            }
            this.A0C = true;
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2) && (stringArrayExtra = intent.getStringArrayExtra("BrowserLiteIntent.EXTRA_CLICK_IDS")) != null && (length = stringArrayExtra.length) > 0) {
            str2 = stringArrayExtra[new Random().nextInt(length)];
        }
        if (TextUtils.isEmpty(str2)) {
            return new C10537Rtr((Long) null, (String) null, 002.A0O("Cannot fetch from pool, state: ", intent.getIntExtra("BrowserLiteIntent.EXTRA_CLICK_ID_POOL_FETCH_STATE", -1)));
        }
        Long valueOf = Long.valueOf(AnonymousClass7TG.A0I());
        ? obj = new Object();
        obj.A01 = str2;
        obj.A00 = valueOf;
        map.put(str, obj);
        return new C10537Rtr(valueOf, str2, (String) null);
    }

    public final String A09(Uri uri) {
        String queryParameter;
        if (uri == null) {
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("fbclid");
        if (queryParameter2 != null || (queryParameter = uri.getQueryParameter("u")) == null) {
            return queryParameter2;
        }
        return A09(0cp.A00(A0R, queryParameter));
    }

    public final void A0A(String str) {
        AnonymousClass9Y2 r0;
        BrowserLiteFragment browserLiteFragment = this.A0E;
        browserLiteFragment.A0l = str;
        TextUtils.isEmpty(str);
        C39774A8t a8t = this.A0N;
        if (a8t != null) {
            QLA C8U = a8t.A03.C8U();
            if ((C8U == null || !C8U.A0b) && (r0 = a8t.A00) != null) {
                r0.A00(str);
            }
        } else {
            C13847TiP tiP = this.A0G;
            if (tiP != null && !this.A0A) {
                tiP.Dvv(str);
            }
        }
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            it.next();
        }
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = browserLiteFragment.A0G;
        if (browserLiteJSBridgeProxy != null) {
            browserLiteJSBridgeProxy.A0A(str);
        }
        C13906Tl6 tl6 = this.A0O;
        if (tl6 != null) {
            tl6.Dvu(str);
        }
        SRY sry = this.A0F;
        if (sry != null && str != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            BrowserLiteCallback browserLiteCallback = sry.A06;
            if (browserLiteCallback != null) {
                try {
                    browserLiteCallback.Dvt(str, A0a);
                } catch (RemoteException e) {
                    0KC.A0J("BrowserLiteCallbacker", "Error in onUrlChange", e);
                }
            }
        }
    }

    public QL8(Context context, Intent intent, BrowserLiteFragment browserLiteFragment, C7574QKp qKp, C10646Rvf rvf, SRY sry, C39774A8t a8t, C13906Tl6 tl6, C13847TiP tiP, 0fA r16, boolean z) {
        C10536Rtq rtq;
        this.A0N = a8t;
        this.A0F = sry;
        this.A0O = tl6;
        this.A0L = qKp;
        this.A0E = browserLiteFragment;
        this.A0H = browserLiteFragment;
        this.A0M = rvf;
        this.A0K = context;
        this.A0D = intent;
        this.A0Q = z;
        this.A0I = r16;
        this.A08 = AH7.A01().A02(C13922TlQ.class);
        this.A0G = tiP;
        this.A0J = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IAB_NEW_URL_CHECK_ENABLED_FOR_SSL_ERROR", false);
        Intent intent2 = this.A0D;
        Bundle bundleExtra = intent2.getBundleExtra("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER");
        if (bundleExtra != null) {
            rtq = new C10536Rtq(bundleExtra.getByteArray("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_BITS"), bundleExtra.getInt("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_NUM_HASHES"), bundleExtra.getInt("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_NUM_BITS"));
        } else {
            rtq = null;
        }
        boolean z2 = false;
        this.A06 = new C10380RrH(rtq, (!intent2.getBooleanExtra("BrowserLiteIntent.EXTRA_ENABLE_BROWSER_PROPERTY_CLICK_ID", false) || intent2.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_EPD_OPT_OUT", false)) ? true : z2);
    }

    public static WebResourceResponse A00(Uri uri, QL8 ql8, String str) {
        int i;
        String str2;
        String str3;
        if (!"properties".equals(uri.getScheme())) {
            return null;
        }
        if (!"browser".equals(uri.getHost()) || !"/clickID".equals(uri.getPath())) {
            i = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
            str2 = "Bad Request";
            str3 = "";
        } else {
            C10537Rtr A042 = ql8.A04(str);
            str3 = A042.A01;
            if (str3 != null) {
                i = 200;
                str2 = "OK";
            } else {
                str3 = A042.A02;
                if (str3 == null) {
                    str3 = "";
                }
                i = 404;
                str2 = "Not Found";
            }
        }
        return C9228RUf.A00(str2, str3, i);
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [X.SlN, X.TZv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v42, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        r1 = r10.A0E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(android.webkit.WebResourceError r11, android.webkit.WebResourceRequest r12, X.QLA r13) {
        /*
            r10 = this;
            int r4 = r11.getErrorCode()
            java.lang.CharSequence r0 = r11.getDescription()
            java.lang.String r1 = r0.toString()
            java.lang.String r8 = X.Pxf.A0c(r12)
            boolean r9 = r12.isForMainFrame()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3 = 0
            r5 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1, r8}
            java.lang.String r0 = "onReceivedError %d, %s, %s"
            X.SQO.A03(r0, r1)
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLWVC.onReceivedError"
            r1.A04(r0)
            r0 = -10
            if (r0 != r4) goto L_0x0073
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0073
            X.7kb r0 = r10.A0H
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            java.lang.String r0 = r0.A0l
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0073
            X.0TC r0 = A0R
            android.net.Uri r0 = X.0cp.A01(r0, r8)
            boolean r0 = X.C11429STt.A04(r0)
            if (r0 != 0) goto L_0x0073
            com.facebook.browser.lite.BrowserLiteFragment r0 = r10.A0E
            boolean r0 = r0.A0f(r8)
            if (r0 == 0) goto L_0x0073
            r0 = r13
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            r0.stopLoading()
            X.TIN r7 = new X.TIN
            r7.<init>(r10, r13, r8)
            r0 = 1000(0x3e8, double:4.94E-321)
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r6 != r2) goto L_0x011f
            r7.run()
        L_0x0073:
            X.7kb r0 = r10.A0H
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            java.lang.String r0 = r0.A0l
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x008d
            com.facebook.browser.lite.BrowserLiteFragment r1 = r10.A0E
            X.QLA r0 = r1.C8U()
            if (r0 == 0) goto L_0x010f
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x010f
        L_0x008d:
            if (r9 == 0) goto L_0x0103
            r10.A0A = r5
            X.TiP r0 = r10.A0G
            if (r0 == 0) goto L_0x0098
            r0.EVZ(r4)
        L_0x0098:
            com.facebook.browser.lite.BrowserLiteFragment r2 = r10.A0E
            android.content.Intent r0 = r2.A06
            if (r0 == 0) goto L_0x0103
            r0 = 0
            com.facebook.browser.lite.views.BrowserLiteErrorScreen r6 = r2.A0Q(r0)
            if (r6 == 0) goto L_0x0103
            X.TZv r1 = r2.A0S
            if (r1 != 0) goto L_0x00c2
            X.SlN r1 = new X.SlN
            r1.<init>()
            r1.A01 = r3
            r1.A00 = r3
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.A02 = r0
            X.TFR r0 = new X.TFR
            r0.<init>(r1, r13)
            r1.A03 = r0
            r2.A0S = r1
        L_0x00c2:
            r6.A02 = r1
            X.SbM r5 = X.C11499SbM.A00(r2, r13, r3)
            android.widget.TextView r0 = r6.A01
            if (r0 != 0) goto L_0x00db
            r0 = 2131432462(0x7f0b140e, float:1.8486682E38)
            android.widget.TextView r1 = X.DbU.A0G(r6, r0)
            r6.A01 = r1
            r0 = 2131971905(0x7f134f41, float:1.9580803E38)
            r1.setText(r0)
        L_0x00db:
            android.widget.TextView r2 = r6.A00
            if (r2 != 0) goto L_0x00e8
            r0 = 2131432461(0x7f0b140d, float:1.848668E38)
            android.widget.TextView r2 = X.DbU.A0G(r6, r0)
            r6.A00 = r2
        L_0x00e8:
            r0 = -9
            if (r4 == r0) goto L_0x010b
            r0 = -8
            if (r4 == r0) goto L_0x0107
            r1 = -1
            r0 = 2131964362(0x7f1331ca, float:1.9565503E38)
            if (r4 == r1) goto L_0x00f8
            r0 = 2131964363(0x7f1331cb, float:1.9565506E38)
        L_0x00f8:
            r2.setText(r0)
            android.widget.TextView r0 = r6.A01
            r0.setOnClickListener(r5)
            r6.setVisibility(r3)
        L_0x0103:
            super.A05(r11, r12, r13)
            return
        L_0x0107:
            r0 = 2131964364(0x7f1331cc, float:1.9565508E38)
            goto L_0x00f8
        L_0x010b:
            r0 = 2131964365(0x7f1331cd, float:1.956551E38)
            goto L_0x00f8
        L_0x010f:
            int r0 = r1.A01
            if (r0 != 0) goto L_0x008d
            r1.A01 = r4
            X.A9z r1 = r1.A0d
            boolean r0 = r1.A0p
            if (r0 == 0) goto L_0x008d
            r1.A02 = r4
            goto L_0x008d
        L_0x011f:
            android.os.Handler r2 = X.SB5.A00
            r2.postDelayed(r7, r0)
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QL8.A05(android.webkit.WebResourceError, android.webkit.WebResourceRequest, X.QLA):void");
    }
}
