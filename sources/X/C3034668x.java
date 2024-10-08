package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.68x  reason: invalid class name and case insensitive filesystem */
public final class C3034668x {
    public static final C3034768y A0J = new Object();
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass3P4 A03;
    public AnonymousClass6MM A04;
    public boolean A05;
    public C306006Kk A06;
    public final long A07;
    public final 2TT A08;
    public final C3034868z A09;
    public final C2595542d A0A;
    public final C338627iG A0B;
    public final A6S A0C;
    public final C3034568w A0D;
    public final List A0E;
    public final Map A0F;
    public final Map A0G;
    public final C262224Cq A0H;
    public final C262224Cq A0I;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.3P4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: X.6LU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: X.6LU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: X.6LU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: X.6Nk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: X.6LU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: X.6LU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: X.72j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v84, resolved type: X.3Lo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v87, resolved type: X.3P4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: X.6LU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: X.6LU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: X.6LU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: X.6LU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: X.6LU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: X.6LU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: X.6LU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: X.6LU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: X.6LU} */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0236, code lost:
        if (r0 != false) goto L_0x0238;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.1Jn r15) {
        /*
            r14 = this;
            r4 = 0
            X.0qQ.A0B(r15, r4)
            boolean r0 = r14.A05
            if (r0 != 0) goto L_0x0049
            boolean r5 = r15 instanceof X.AnonymousClass37J
            if (r5 != 0) goto L_0x002a
            X.68w r3 = r14.A0D
            long r11 = r15.A00
            long r0 = r3.A02
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x002a
            com.facebook.quicklog.QuickPerformanceLogger r6 = r3.A03
            r7 = 220138478(0xd1f0bee, float:4.9010018E-31)
            int r8 = r3.A01
            java.lang.String r9 = r15.A00()
            java.lang.String r10 = r15.toString()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6.markerPoint(r7, r8, r9, r10, r11, r13)
        L_0x002a:
            X.2TT r7 = r14.A08
            boolean r0 = r7.A0D
            X.42d r9 = r14.A0A
            if (r0 == 0) goto L_0x0390
            X.1Jm r0 = r9.A03
        L_0x0034:
            long r0 = r0.A00
            long r2 = r15.A00
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0049
            boolean r0 = r15 instanceof X.AnonymousClass3FJ
            if (r0 == 0) goto L_0x004a
            r0 = r15
            X.3FJ r0 = (X.AnonymousClass3FJ) r0
            boolean r0 = X.AnonymousClass5FP.A00(r0)
            if (r0 == 0) goto L_0x004a
        L_0x0049:
            return
        L_0x004a:
            X.6Kk r6 = r14.A06
            if (r6 == 0) goto L_0x00b2
            boolean r0 = r15 instanceof X.1Jq
            if (r0 == 0) goto L_0x0085
            X.1Jq r0 = r9.A01
            X.0qQ.A0B(r0, r4)
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r15.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0085
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x007d
            short r10 = r6.A02
            r0 = 4
            if (r10 == r0) goto L_0x0072
            r0 = 615(0x267, float:8.62E-43)
            if (r10 == r0) goto L_0x0072
            r0 = 630(0x276, float:8.83E-43)
            if (r10 != r0) goto L_0x007d
        L_0x0072:
            r11 = 615(0x267, float:8.62E-43)
            long r8 = r6.A00
            X.9J0 r7 = r6.A01
            X.6Kk r6 = new X.6Kk
            r6.<init>(r7, r8, r10, r11)
        L_0x007d:
            X.1Jq r15 = (X.1Jq) r15
            java.lang.String r0 = r15.A03
        L_0x0081:
            A03(r6, r14, r0)
            return
        L_0x0085:
            boolean r0 = r15 instanceof X.AnonymousClass42Y
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x00a5
            short r10 = r6.A02
            r0 = 4
            if (r10 == r0) goto L_0x009a
            r0 = 615(0x267, float:8.62E-43)
            if (r10 == r0) goto L_0x009a
            r0 = 630(0x276, float:8.83E-43)
            if (r10 != r0) goto L_0x00a5
        L_0x009a:
            r11 = 630(0x276, float:8.83E-43)
            long r8 = r6.A00
            X.9J0 r7 = r6.A01
            X.6Kk r6 = new X.6Kk
            r6.<init>(r7, r8, r10, r11)
        L_0x00a5:
            java.lang.String r0 = "app_backgrounded"
            goto L_0x0081
        L_0x00a8:
            boolean r0 = r15 instanceof X.C2595442c
            if (r0 != 0) goto L_0x00b0
            boolean r0 = r15 instanceof X.C2595342b
            if (r0 == 0) goto L_0x0049
        L_0x00b0:
            r0 = 0
            goto L_0x0081
        L_0x00b2:
            if (r5 == 0) goto L_0x00ba
            java.util.List r0 = r14.A0E
            r0.add(r15)
            return
        L_0x00ba:
            X.1Jq r0 = r9.A01
            X.0qQ.A0B(r0, r4)
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r15.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0049
            X.3P4 r0 = r14.A03
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r15 instanceof X.AnonymousClass3P4
            if (r0 == 0) goto L_0x00d6
            r0 = r15
            X.3P4 r0 = (X.AnonymousClass3P4) r0
            r14.A03 = r0
        L_0x00d6:
            boolean r0 = r15 instanceof X.C3254172h
            if (r0 == 0) goto L_0x00e1
            java.lang.String r1 = "timed out"
            r0 = 1
            r14.A00(r15, r1, r4, r0)
            return
        L_0x00e1:
            boolean r0 = r15 instanceof X.1Jm
            if (r0 == 0) goto L_0x00eb
            r0 = r15
            X.1Jm r0 = (X.1Jm) r0
            A01(r0, r14)
        L_0x00eb:
            boolean r0 = r15 instanceof X.1Jp
            if (r0 == 0) goto L_0x0049
            boolean r0 = r15 instanceof X.1Jo
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = "user navigate away"
        L_0x00f5:
            r14.A00(r15, r0, r4, r4)
            return
        L_0x00f9:
            boolean r0 = r15 instanceof X.C252823pl
            r8 = 1
            if (r0 == 0) goto L_0x010c
            X.3pl r15 = (X.C252823pl) r15
            java.lang.String r1 = "user see error message "
            java.lang.String r0 = r15.A00
            java.lang.String r0 = X.002.A0R(r1, r0)
            r14.A00(r15, r0, r8, r8)
            return
        L_0x010c:
            boolean r0 = r15 instanceof X.C317976o9
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = "activity paused"
            goto L_0x00f5
        L_0x0113:
            boolean r0 = r15 instanceof X.AnonymousClass3P4
            if (r0 == 0) goto L_0x0139
            r11 = r15
            X.1Jp r11 = (X.1Jp) r11
            X.1Jm r1 = r11.A00
            X.1Jm r0 = r9.A04
            X.0qQ.A0B(r0, r4)
            long r5 = r1.A00
            long r0 = r0.A00
            int r10 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0139
            java.util.Map r1 = r14.A0F
            java.lang.String r0 = r11.A01
            java.lang.Object r0 = r1.get(r0)
            X.72i r0 = (X.C3254272i) r0
            if (r0 == 0) goto L_0x0162
            boolean r0 = r0.A04
            if (r0 != r8) goto L_0x0162
        L_0x0139:
            boolean r0 = r15 instanceof X.C252813pk
            if (r0 == 0) goto L_0x0165
            r10 = r15
            X.1Jp r10 = (X.1Jp) r10
            X.1Jm r1 = r10.A00
            X.1Jm r0 = r9.A04
            X.0qQ.A0B(r0, r4)
            long r5 = r1.A00
            long r0 = r0.A00
            int r9 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0165
            java.util.Map r1 = r14.A0F
            java.lang.String r0 = r10.A01
            java.lang.Object r0 = r1.get(r0)
            X.72i r0 = (X.C3254272i) r0
            if (r0 == 0) goto L_0x0165
            boolean r0 = r0.A04
            if (r0 != r8) goto L_0x0165
            java.lang.String r0 = "component went off screen after interaction"
            goto L_0x00f5
        L_0x0162:
            java.lang.String r0 = "component came on screen after interaction"
            goto L_0x00f5
        L_0x0165:
            X.1Jp r15 = (X.1Jp) r15
            java.util.Map r5 = r14.A0F
            java.lang.String r1 = r15.A01
            java.lang.Object r6 = r5.get(r1)
            X.72i r6 = (X.C3254272i) r6
            if (r6 != 0) goto L_0x017f
            boolean r0 = r15 instanceof X.C257383xJ
            if (r0 == 0) goto L_0x0287
            X.6Nk r6 = new X.6Nk
            r6.<init>(r7, r1)
        L_0x017c:
            r5.put(r1, r6)
        L_0x017f:
            java.lang.String r0 = r6.A05
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x01dd
            boolean r9 = r6.A04
            boolean r0 = r15 instanceof X.AnonymousClass3P4
            if (r0 == 0) goto L_0x027f
            r6.A04 = r8
            r0 = r15
            X.3P4 r0 = (X.AnonymousClass3P4) r0
            android.graphics.Rect r0 = r0.B9X()
            r6.A00 = r0
            java.lang.Long r0 = r6.A02
            if (r0 != 0) goto L_0x01a4
            long r0 = r15.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A02 = r0
        L_0x01a4:
            r6.A03 = r8
        L_0x01a6:
            boolean r0 = r6 instanceof X.C3254372j
            if (r0 == 0) goto L_0x0215
            X.72j r6 = (X.C3254372j) r6
            boolean r0 = r15 instanceof X.C240613Lo
            if (r0 == 0) goto L_0x020e
            r6.A02 = r8
            r0 = r15
            X.3Lo r0 = (X.C240613Lo) r0
            java.lang.String r0 = r0.A00
            r6.A00 = r0
        L_0x01b9:
            X.9IL r0 = r6.A01
            r4 = 0
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x01dd
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x01dd
        L_0x01c8:
            boolean r1 = r6.A04
            if (r1 == 0) goto L_0x0277
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x0238
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0277
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x01d6:
            X.9IL r4 = new X.9IL
            r4.<init>(r15, r0)
        L_0x01db:
            r6.A01 = r4
        L_0x01dd:
            X.68w r8 = r14.A0D
            java.util.Collection r0 = r5.values()
            java.util.List r9 = X.00k.A0a(r0)
            r1 = 3
            X.0I2 r0 = X.0KC.A01
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L_0x02e9
            X.C3034568w.A00(r8, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r9.iterator()
        L_0x01fc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02aa
            java.lang.Object r1 = r4.next()
            boolean r0 = r1 instanceof X.C306336Lt
            if (r0 == 0) goto L_0x01fc
            r6.add(r1)
            goto L_0x01fc
        L_0x020e:
            boolean r0 = r15 instanceof X.C252863pp
            if (r0 == 0) goto L_0x01b9
            r6.A01 = r8
            goto L_0x01b9
        L_0x0215:
            boolean r0 = r6 instanceof X.C306766Nk
            if (r0 == 0) goto L_0x023b
            X.6Nk r6 = (X.C306766Nk) r6
            boolean r0 = r15 instanceof X.C257493xU
            if (r0 == 0) goto L_0x0221
            r6.A00 = r8
        L_0x0221:
            X.9IL r0 = r6.A01
            r4 = 0
            if (r0 == 0) goto L_0x0230
            java.lang.Object r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x01dd
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x01dd
        L_0x0230:
            boolean r1 = r6.A04
            if (r1 == 0) goto L_0x0277
            boolean r0 = r6.A00
        L_0x0236:
            if (r0 == 0) goto L_0x0277
        L_0x0238:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x01d6
        L_0x023b:
            boolean r0 = r6 instanceof X.C306336Lt
            if (r0 == 0) goto L_0x0259
            X.9IL r0 = r6.A01
            if (r0 == 0) goto L_0x0247
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x01dd
        L_0x0247:
            if (r9 == 0) goto L_0x0257
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x0257
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.9IL r0 = new X.9IL
            r0.<init>(r15, r1)
        L_0x0254:
            r6.A01 = r0
            goto L_0x01dd
        L_0x0257:
            r0 = 0
            goto L_0x0254
        L_0x0259:
            X.6LU r6 = (X.AnonymousClass6LU) r6
            boolean r0 = r15 instanceof X.C348907zD
            if (r0 == 0) goto L_0x0261
            r6.A00 = r8
        L_0x0261:
            X.9IL r0 = r6.A01
            r4 = 0
            if (r0 == 0) goto L_0x0270
            java.lang.Object r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x01dd
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x01dd
        L_0x0270:
            boolean r1 = r6.A04
            if (r1 == 0) goto L_0x0277
            boolean r0 = r6.A00
            goto L_0x0236
        L_0x0277:
            if (r9 == 0) goto L_0x01db
            if (r1 != 0) goto L_0x01db
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x01d6
        L_0x027f:
            boolean r0 = r15 instanceof X.C252813pk
            if (r0 == 0) goto L_0x01a6
            r6.A04 = r4
            goto L_0x01a6
        L_0x0287:
            boolean r0 = r15 instanceof X.C240623Lp
            if (r0 == 0) goto L_0x0292
            X.72j r6 = new X.72j
            r6.<init>(r7, r1)
            goto L_0x017c
        L_0x0292:
            boolean r0 = r15 instanceof X.AnonymousClass3P5
            if (r0 == 0) goto L_0x029d
            X.6Lt r6 = new X.6Lt
            r6.<init>(r7, r1)
            goto L_0x017c
        L_0x029d:
            boolean r0 = r15 instanceof X.C3254472k
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "camera"
            X.6LU r6 = new X.6LU
            r6.<init>(r7, r0)
            goto L_0x017c
        L_0x02aa:
            X.C3034568w.A01(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r9.iterator()
        L_0x02b6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02c8
            java.lang.Object r1 = r4.next()
            boolean r0 = r1 instanceof X.C3254372j
            if (r0 == 0) goto L_0x02b6
            r6.add(r1)
            goto L_0x02b6
        L_0x02c8:
            X.C3034568w.A01(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r9.iterator()
        L_0x02d4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02e6
            java.lang.Object r1 = r4.next()
            boolean r0 = r1 instanceof X.C306766Nk
            if (r0 == 0) goto L_0x02d4
            r6.add(r1)
            goto L_0x02d4
        L_0x02e6:
            X.C3034568w.A01(r6)
        L_0x02e9:
            java.util.Collection r1 = r5.values()
            X.3P4 r0 = r14.A03
            boolean r10 = X.C3034768y.A01(r7, r0, r1)
            java.util.Collection r0 = r5.values()
            java.util.List r1 = X.00k.A0a(r0)
            boolean r0 = r1 instanceof java.util.Collection
            r5 = 0
            if (r0 == 0) goto L_0x036f
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x036f
            r4 = 0
        L_0x0307:
            X.6MM r9 = r14.A04
            r7 = r9
            if (r9 == 0) goto L_0x034a
            if (r10 == 0) goto L_0x0312
            int r0 = r9.A06
            if (r4 <= r0) goto L_0x034c
        L_0x0312:
            X.C3034568w.A00(r8, r2)
            com.facebook.quicklog.QuickPerformanceLogger r7 = r8.A03
            r6 = 220138478(0xd1f0bee, float:4.9010018E-31)
            int r5 = r8.A01
            java.lang.String r1 = "idle wait "
            if (r10 == 0) goto L_0x036c
            java.lang.String r0 = "reset"
        L_0x0322:
            java.lang.String r0 = X.002.A0R(r1, r0)
            r7.markerPoint(r6, r5, r0)
            r9.A00()
            r7 = 0
            r14.A04 = r7
            int r1 = r14.A00
            int r0 = r9.A00
            int r0 = java.lang.Math.max(r1, r0)
            r14.A00 = r0
            long r5 = r14.A02
            long r0 = r9.A01
            long r0 = java.lang.Math.max(r5, r0)
            r14.A02 = r0
            int r0 = r14.A01
            int r0 = r0 + 1
            r14.A01 = r0
            r5 = 1
        L_0x034a:
            if (r10 == 0) goto L_0x0049
        L_0x034c:
            if (r7 != 0) goto L_0x0049
            if (r5 != 0) goto L_0x035f
            X.C3034568w.A00(r8, r2)
            com.facebook.quicklog.QuickPerformanceLogger r3 = r8.A03
            int r2 = r8.A01
            r1 = 220138478(0xd1f0bee, float:4.9010018E-31)
            java.lang.String r0 = "idle wait begin..."
            r3.markerPoint(r1, r2, r0)
        L_0x035f:
            long r2 = r14.A07
            r1 = 8
            X.9LR r0 = new X.9LR
            r0.<init>(r14, r1)
            r14.A04(r0, r4, r2)
            return
        L_0x036c:
            java.lang.String r0 = "canceled"
            goto L_0x0322
        L_0x036f:
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L_0x0374:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0307
            java.lang.Object r0 = r1.next()
            X.72i r0 = (X.C3254272i) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0374
            int r4 = r4 + 1
            if (r4 >= 0) goto L_0x0374
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0390:
            X.1Jm r0 = r9.A04
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3034668x.A05(X.1Jn):void");
    }

    public /* synthetic */ C3034668x(2TT r3, C2595542d r4, C338627iG r5, A6S a6s, C3034568w r7, C262224Cq r8, C262224Cq r9) {
        long j;
        C3034868z r0 = new C3034868z(r3, r7, r8);
        this.A0A = r4;
        this.A0D = r7;
        this.A0B = r5;
        this.A0C = a6s;
        this.A0I = r8;
        this.A0H = r9;
        this.A08 = r3;
        this.A09 = r0;
        String str = r4.A01.A01;
        Map map = r3.A07;
        if (map != null) {
            Object obj = map.get(str);
            j = ((Number) (obj == null ? Long.valueOf(r3.A01) : obj)).longValue();
        } else {
            j = r3.A01;
        }
        this.A07 = j;
        this.A0F = new LinkedHashMap();
        this.A0G = new LinkedHashMap();
        this.A0E = new ArrayList();
    }

    private final void A00(1Jn r14, String str, boolean z, boolean z2) {
        C3034568w r5 = this.A0D;
        0qQ.A0B(str, 1);
        long j = r14.A00;
        C3034568w.A00(r5, j);
        r5.A03.markerPoint(220138478, r5.A01, "interrupt", str);
        AnonymousClass9J0 r8 = new AnonymousClass9J0(r14, str, z);
        C3034768y r7 = A0J;
        2TT r9 = this.A08;
        Map map = this.A0F;
        C306006Kk A022 = r7.A02(r8, r9, this.A0A, map.values(), C3034768y.A01(r9, this.A03, map.values()));
        if (!z2) {
            C3034568w.A00(r5, j);
            this.A06 = A022;
            A04(new C377439Lv(44, A022, this), 0, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        } else {
            A03(A022, this, (String) null);
        }
        A02(A022, this);
    }

    public static final void A01(1Jm r8, C3034668x r9) {
        long j = r8.A00;
        Map map = r9.A0G;
        Long valueOf = Long.valueOf(j);
        C3254072g r3 = (C3254072g) map.get(valueOf);
        if (r3 == null) {
            r3 = new C3254072g(r8);
        }
        if (j == r3.A01 && ((r8 instanceof C277364uz) || (r8 instanceof AnonymousClass5FR))) {
            r3.A00 = r8;
        }
        map.put(valueOf, r3);
    }

    public static final void A02(C306006Kk r4, C3034668x r5) {
        C262224Cq r3 = r5.A0H;
        AnonymousClass9K0 r2 = new AnonymousClass9K0(r4, r5, (AnonymousClass4D7) null, 6);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
    }

    public static final void A03(C306006Kk r21, C3034668x r22, String str) {
        String str2;
        int i;
        StringBuilder sb;
        String str3;
        String str4;
        C3034668x r1 = r22;
        if (!r1.A05) {
            r1.A05 = true;
            AnonymousClass6MM r0 = r1.A04;
            if (r0 != null) {
                r0.A00();
            }
            r1.A04 = null;
            C338627iG r5 = r1.A0B;
            if (r5 != null) {
                C306006Kk r4 = r21;
                short s = r4.A03;
                long j = r4.A00;
                AnonymousClass9J0 r10 = r4.A01;
                List A0a = 00k.A0a(r1.A0F.values());
                List A0a2 = 00k.A0a(r1.A0G.values());
                List<AnonymousClass37J> A0a3 = 00k.A0a(r1.A0E);
                int i2 = r1.A01;
                long j2 = r1.A02;
                int i3 = r1.A00;
                02m r02 = r5.A01;
                02m r20 = r02;
                MarkerEditor withMarker = r02.withMarker(220142130, r5.A00);
                0qQ.A0A(withMarker);
                if (r5.A06) {
                    withMarker.annotate("user_sample_rate", 1);
                }
                String str5 = r5.A02.A05;
                if (str5.length() > 0) {
                    withMarker.annotate("treatment_name", str5);
                }
                C2595542d r12 = r5.A04;
                1Jq r11 = r12.A01;
                withMarker.point("enter_new_module", r11.A00);
                withMarker.point("exit_previous_module", r11.A00);
                if (r12.A06) {
                    str2 = "cold";
                } else {
                    str2 = "hot";
                }
                withMarker.annotate(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
                withMarker.annotate("navigation_source", r11.A06);
                withMarker.annotate("trigger_down_source", r12.A03.A01);
                withMarker.annotate("click_point", r11.A05);
                1Jo r03 = r12.A02;
                if (!(r03 == null || (str4 = r03.A02) == null)) {
                    withMarker.annotate("source_nav_chain", str4);
                }
                String str6 = r11.A04;
                if (str6 != null) {
                    withMarker.annotate("dest_nav_chain", str6);
                }
                String str7 = str;
                if (str != null) {
                    withMarker.annotate("nav_destination", str7);
                }
                if (r10 != null) {
                    withMarker.annotate("interrupt_event", ((1Jn) r10.A00).A00());
                    1Jn r112 = (1Jn) r10.A04;
                    withMarker.annotate("interrupt_trigger", r112.A00());
                    withMarker.annotate("interrupt_reason", r10.A01);
                    long j3 = r112.A00;
                    if (j3 <= j) {
                        withMarker.point("interrupt", j3);
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object next : A0a) {
                    if (((C3254272i) next).A03) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (next2 instanceof C306336Lt) {
                        arrayList2.add(next2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next3 = it2.next();
                    if (next3 instanceof C3254372j) {
                        arrayList3.add(next3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next4 = it3.next();
                    if (next4 instanceof C306766Nk) {
                        arrayList4.add(next4);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    Object next5 = it4.next();
                    if (next5 instanceof AnonymousClass6LU) {
                        arrayList5.add(next5);
                    }
                }
                C3254272i r122 = (C3254272i) 00k.A0J(arrayList5);
                C338627iG.A01(withMarker, "images", "image_rendered", arrayList3);
                C338627iG.A01(withMarker, "videos", "videos_rendered", arrayList4);
                C338627iG.A01(withMarker, "loading_indicators", "loading_indicators_completed", arrayList2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    Object next6 = it5.next();
                    String str8 = ((C3254372j) next6).A00;
                    Object obj = linkedHashMap.get(str8);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(str8, obj);
                    }
                    ((List) obj).add(next6);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str9 = (String) entry.getKey();
                    if (str9 != null) {
                        withMarker.annotate(002.A0g("images_loaded_", str9, "_total"), ((List) entry.getValue()).size());
                    }
                }
                Iterator it6 = arrayList3.iterator();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (it6.hasNext()) {
                        Object next7 = it6.next();
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            break;
                        }
                        C338627iG.A00(withMarker, (C3254272i) next7, 002.A0O("/media_rendering/image_", i5));
                        i5 = i6;
                    } else {
                        Iterator it7 = arrayList2.iterator();
                        int i7 = 0;
                        while (true) {
                            if (it7.hasNext()) {
                                Object next8 = it7.next();
                                int i8 = i7 + 1;
                                if (i7 < 0) {
                                    break;
                                }
                                C338627iG.A00(withMarker, (C3254272i) next8, 002.A0O("loading_", i7));
                                i7 = i8;
                            } else {
                                Iterator it8 = arrayList4.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        Object next9 = it8.next();
                                        int i9 = i4 + 1;
                                        if (i4 < 0) {
                                            break;
                                        }
                                        C338627iG.A00(withMarker, (C3254272i) next9, 002.A0O("/media_rendering/video_", i4));
                                        i4 = i9;
                                    } else {
                                        if (r122 != null) {
                                            C338627iG.A00(withMarker, r122, "camera");
                                        }
                                        ArrayList arrayList6 = new ArrayList();
                                        Iterator it9 = A0a2.iterator();
                                        while (true) {
                                            i = 0;
                                            if (!it9.hasNext()) {
                                                break;
                                            }
                                            Object next10 = it9.next();
                                            if (((C3254072g) next10).A02 != AnonymousClass05K.A0Y) {
                                                arrayList6.add(next10);
                                            }
                                        }
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object next11 : arrayList6) {
                                            if (((C3254072g) next11).A01 <= j) {
                                                arrayList7.add(next11);
                                            }
                                        }
                                        for (Object next12 : arrayList7) {
                                            int i10 = i + 1;
                                            if (i >= 0) {
                                                C3254072g r123 = (C3254072g) next12;
                                                Integer num = r123.A02;
                                                int intValue = num.intValue();
                                                if (intValue == 0) {
                                                    sb = new StringBuilder();
                                                    sb.append("/input/");
                                                    sb.append(i);
                                                    str3 = "/touch";
                                                } else if (intValue == 1) {
                                                    sb = new StringBuilder();
                                                    sb.append("/input/");
                                                    sb.append(i);
                                                    str3 = "/key";
                                                } else if (intValue == 2) {
                                                    sb = new StringBuilder();
                                                    sb.append("/input/");
                                                    sb.append(i);
                                                    str3 = "/back_button";
                                                } else if (intValue == 3) {
                                                    sb = new StringBuilder();
                                                    sb.append("/input/");
                                                    sb.append(i);
                                                    str3 = "/background";
                                                } else {
                                                    i = i10;
                                                }
                                                sb.append(str3);
                                                String obj2 = sb.toString();
                                                if (num == AnonymousClass05K.A0N) {
                                                    withMarker.point(obj2, r123.A01);
                                                } else {
                                                    withMarker.point(002.A0R(obj2, "_start"), r123.A01);
                                                    1Jm r04 = r123.A00;
                                                    if (r04 != null) {
                                                        long j4 = r04.A00;
                                                        if (Long.valueOf(j4) != null) {
                                                            withMarker.point(002.A0R(obj2, "_end"), j4);
                                                        }
                                                    }
                                                }
                                                i = i10;
                                            }
                                        }
                                        for (AnonymousClass37J ABp : A0a3) {
                                            ABp.ABp(withMarker);
                                        }
                                        withMarker.annotate("idle_reset_count", i2);
                                        if (i2 > 0) {
                                            withMarker.annotate("idle_max_wait_before_reset", j2);
                                        }
                                        withMarker.annotate("idle_max_pings_before_responsive", i3);
                                        withMarker.markerEditingCompleted();
                                        int i11 = r5.A00;
                                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                        r20.markerEnd(220142130, i11, s, j, timeUnit);
                                        C3034568w r42 = r5.A05;
                                        C3034568w.A00(r42, SystemClock.uptimeMillis());
                                        QuickPerformanceLogger quickPerformanceLogger = r42.A03;
                                        int i12 = r42.A01;
                                        quickPerformanceLogger.markerPoint(220138478, i12, "markerEnd (backdated)", j, timeUnit);
                                        quickPerformanceLogger.markerEnd(220138478, i12, s);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    private final void A04(0sP r14, int i, long j) {
        AnonymousClass6MM r0 = this.A04;
        if (r0 != null) {
            r0.A00();
        }
        C3034868z r02 = this.A09;
        C3034568w r3 = r02.A01;
        C262224Cq r5 = r02.A02;
        2TT r03 = r02.A00;
        AnonymousClass6MM r2 = new AnonymousClass6MM(r3, r14, r5, i, r03.A02, r03.A03, j);
        r2.A02 = SystemClock.uptimeMillis();
        r2.A00++;
        r2.A08.post(r2);
        this.A04 = r2;
    }
}
