package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider;
import com.instagram.model.mediatype.ProductType;
import com.instagram.video.player.common.LiveVideoDebugStatsView;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4MM  reason: invalid class name */
public final class AnonymousClass4MM implements AnonymousClass4MN, AnonymousClass4M5 {
    public static VideoPerformanceProvider A0p;
    public static final 0bY A0q = new 1Q7("IgSecureUriParser").A00;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Uri A07;
    public ViewGroup A08;
    public C263624Ms A09;
    public C263894Nt A0A;
    public AnonymousClass4NN A0B;
    public AnonymousClass4MB A0C;
    public AnonymousClass4P1 A0D;
    public AnonymousClass4Yf A0E;
    public AnonymousClass4Yf A0F;
    public AnonymousClass4Yf A0G;
    public AnonymousClass3uV A0H;
    public C255653uU A0I;
    public ProductType A0J;
    public 2C7 A0K;
    public C263904Nu A0L;
    public C257393xK A0M;
    public C263414Lx A0N;
    public VU5 A0O;
    public C14721U4j A0P;
    public Integer A0Q;
    public Runnable A0R;
    public String A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public Context A0Z;
    public T7A A0a;
    public C256293vX A0b;
    public boolean A0c;
    public final Handler A0d;
    public final HeroPlayerSetting A0e;
    public final UserSession A0f;
    public final AnonymousClass4MT A0g;
    public final AnonymousClass4MY A0h;
    public final AnonymousClass4MO A0i;
    public final 1wS A0j;
    public final List A0k;
    public final boolean A0l;
    public final boolean A0m;
    public volatile long A0n;
    public volatile C18034VkE A0o;

    public final C255623uR CEW() {
        return null;
    }

    public final Integer CEj() {
        return null;
    }

    public final Integer CEr() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v6, types: [X.4OP, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        if (X.182.A06(X.0Tu.A05, r1, 36315189735066699L) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        if (X.1wS.A06(r1, r6, r7) != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (X.182.A06(X.0Tu.A05, r1, 36320270679548049L) == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (X.182.A06(X.0Tu.A05, r1, 36320270679679123L) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if (X.182.A06(X.0Tu.A05, r1, 36320270679613586L) == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ed, code lost:
        if (r2.A07 != X.C255623uR.PROGRESSIVE) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0113, code lost:
        if (r16 != false) goto L_0x0115;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E3n(android.view.ViewGroup r52, java.lang.Integer r53) {
        /*
            r51 = this;
            r5 = 0
            r0 = r51
            r0.A0V = r5
            r1 = r52
            r0.A08 = r1
            X.3uU r2 = r0.A0I
            if (r2 == 0) goto L_0x0240
            com.instagram.common.session.UserSession r1 = r0.A0f
            X.1Q4 r3 = X.1Q3.A00(r1)
            boolean r36 = r3.A02()
            float r4 = r0.A00
            r3 = 0
            r17 = 0
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            r16 = 0
            if (r3 > 0) goto L_0x0024
            r16 = 1
        L_0x0024:
            java.lang.Integer r9 = r0.A0Q
            X.28e r20 = X.28e.A01
            int r15 = r0.A03
            int r14 = r0.A02
            int r13 = r0.A01
            int r12 = r0.A06
            X.4Lx r3 = r0.A0N
            boolean r8 = r3.A02
            X.3uV r11 = r0.A0H
            X.4MB r3 = r0.A0C
            if (r3 == 0) goto L_0x01e9
            java.lang.String r26 = r3.A00()
        L_0x003e:
            com.instagram.model.mediatype.ProductType r6 = r0.A0J
            java.lang.String r7 = r2.A0A
            boolean r48 = X.1wS.A07(r1, r7)
            boolean r3 = X.AnonymousClass4OE.A00(r7)
            if (r3 == 0) goto L_0x005b
            X.0Tu r10 = X.0Tu.A05
            r3 = 36315189735066699(0x810479001c0c4b, double:3.029210445763489E-306)
            boolean r3 = X.182.A06(r10, r1, r3)
            r44 = 1
            if (r3 != 0) goto L_0x005d
        L_0x005b:
            r44 = 0
        L_0x005d:
            if (r8 != 0) goto L_0x0067
            boolean r3 = X.1wS.A06(r1, r6, r7)
            r40 = 0
            if (r3 == 0) goto L_0x0069
        L_0x0067:
            r40 = 1
        L_0x0069:
            boolean r3 = r2.A02()
            if (r3 == 0) goto L_0x007e
            X.0Tu r6 = X.0Tu.A05
            r3 = 36320270679548049(0x81091800002091, double:3.032423655512816E-306)
            boolean r3 = X.182.A06(r6, r1, r3)
            r41 = 1
            if (r3 != 0) goto L_0x0080
        L_0x007e:
            r41 = 0
        L_0x0080:
            boolean r3 = r2.A02()
            if (r3 == 0) goto L_0x0095
            X.0Tu r6 = X.0Tu.A05
            r3 = 36320270679679123(0x81091800022093, double:3.032423655595708E-306)
            boolean r3 = X.182.A06(r6, r1, r3)
            r42 = 1
            if (r3 != 0) goto L_0x0097
        L_0x0095:
            r42 = 0
        L_0x0097:
            boolean r3 = r2.A02()
            if (r3 == 0) goto L_0x00ac
            X.0Tu r6 = X.0Tu.A05
            r3 = 36320270679613586(0x81091800012092, double:3.032423655554262E-306)
            boolean r3 = X.182.A06(r6, r1, r3)
            r43 = 1
            if (r3 != 0) goto L_0x00ae
        L_0x00ac:
            r43 = 0
        L_0x00ae:
            r8 = 0
            X.PwX r3 = X.AnonymousClass4OF.A00
            if (r3 == 0) goto L_0x00c8
            android.net.Uri r3 = r2.A05
            if (r3 == 0) goto L_0x00c8
            java.lang.String r4 = r3.getScheme()
            java.lang.String r3 = "msys"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x00c8
            X.Oqv r8 = new X.Oqv
            r8.<init>(r1)
        L_0x00c8:
            boolean r49 = X.1wS.A05(r2, r1)
            X.0Tu r6 = X.0Tu.A05
            r3 = 36883066018136550(0x8308f4003d01e6, double:3.388337693831115E-306)
            java.lang.String r3 = X.182.A04(r6, r1, r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00ef
            boolean r3 = r7.startsWith(r3)
            if (r3 == 0) goto L_0x00ef
            java.lang.Integer r3 = X.AnonymousClass05K.A15
            if (r9 != r3) goto L_0x00ef
            X.3uR r4 = r2.A07
            X.3uR r3 = X.C255623uR.PROGRESSIVE
            r50 = 1
            if (r4 == r3) goto L_0x00f1
        L_0x00ef:
            r50 = 0
        L_0x00f1:
            java.lang.Integer r3 = X.1wS.A02(r9)
            int r3 = r3.intValue()
            if (r3 == 0) goto L_0x01e5
            r29 = 1
        L_0x00fd:
            java.lang.String r25 = "IgGrootPlayer"
            java.lang.Integer r24 = X.AnonymousClass05K.A00
            java.util.ArrayList r28 = new java.util.ArrayList
            r28.<init>()
            java.util.ArrayList r27 = new java.util.ArrayList
            r27.<init>()
            boolean r3 = X.1wS.A08(r7)
            if (r3 != 0) goto L_0x0115
            r39 = 0
            if (r16 == 0) goto L_0x0117
        L_0x0115:
            r39 = 1
        L_0x0117:
            com.facebook.video.heroplayer.ipc.AudioFocusLossSettings r19 = new com.facebook.video.heroplayer.ipc.AudioFocusLossSettings
            r19.<init>()
            X.4Lx r3 = r0.A0N
            boolean r6 = r3.A00
            r37 = 1
            r4 = -1
            r34 = 2000(0x7d0, float:2.803E-42)
            X.4OI r3 = new X.4OI
            r30 = r15
            r31 = r14
            r32 = r13
            r33 = r12
            r35 = r4
            r38 = r37
            r45 = r5
            r46 = r5
            r47 = r6
            r18 = r3
            r21 = r11
            r22 = r2
            r23 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            X.VkE r6 = r0.A0o
            if (r6 != 0) goto L_0x0168
            X.4Lx r6 = r0.A0N
            boolean r6 = r6.A03
            if (r6 == 0) goto L_0x0168
            int r7 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r7 < r6) goto L_0x0168
            X.VkE r6 = new X.VkE
            r6.<init>()
            r0.A0o = r6
            android.view.Surface r7 = r6.A00()
            if (r7 == 0) goto L_0x0168
            X.4Ms r6 = r0.A09
            X.4Mt r6 = r6.A0I
            r6.A0D(r7)
        L_0x0168:
            X.4Ms r7 = r0.A09
            r7.A0C(r3)
            android.view.ViewGroup r3 = r0.A08
            if (r3 == 0) goto L_0x01ca
            boolean r3 = r0.A0X
            if (r3 == 0) goto L_0x01ca
            if (r53 == 0) goto L_0x017f
            int r3 = r53.intValue()
            if (r3 < 0) goto L_0x017f
            r17 = r3
        L_0x017f:
            X.0tS r3 = X.0tS.A00()
            boolean r3 = r3.A0Y()
            if (r3 == 0) goto L_0x01c1
            X.U4j r3 = r0.A0P
            if (r3 == 0) goto L_0x019a
            android.view.ViewParent r6 = r3.getParent()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            if (r6 == 0) goto L_0x019a
            X.U4j r3 = r0.A0P
            r6.removeView(r3)
        L_0x019a:
            android.view.ViewGroup r8 = r0.A08
            if (r8 == 0) goto L_0x01c1
            java.lang.String r6 = r0.A0S
            java.lang.String r3 = "clips_viewer"
            boolean r3 = r6.startsWith(r3)
            if (r3 == 0) goto L_0x01b8
            android.view.View r6 = r8.getRootView()
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r6.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L_0x01b8
            r8 = r3
        L_0x01b8:
            X.U4j r3 = r0.ALp()
            if (r3 == 0) goto L_0x01c1
            r8.addView(r3, r4)
        L_0x01c1:
            android.view.ViewGroup r4 = r0.A08
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            r7.A0A(r4, r3)
        L_0x01ca:
            X.4Nt r3 = r0.A0A
            if (r3 == 0) goto L_0x0203
            X.4Nr r11 = r3.A01
            X.4NN r10 = r0.A0B
            java.lang.String r9 = r2.A0G
            r3 = 0
            if (r9 == 0) goto L_0x01fb
            java.lang.String r6 = "_"
            java.lang.String[] r8 = r9.split(r6)
            int r7 = r8.length
            r6 = 2
            if (r7 < r6) goto L_0x01f7
            r9 = r8[r5]
            goto L_0x01f7
        L_0x01e5:
            r29 = 0
            goto L_0x00fd
        L_0x01e9:
            com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider r3 = A0p
            if (r3 == 0) goto L_0x01f3
            java.lang.String r26 = r3.generateDebugHeadSessionId()
            goto L_0x003e
        L_0x01f3:
            java.lang.String r26 = ""
            goto L_0x003e
        L_0x01f7:
            long r3 = java.lang.Long.parseLong(r9)     // Catch:{ NumberFormatException -> 0x01fb }
        L_0x01fb:
            X.4OO r6 = new X.4OO
            r6.<init>()
            r10.A0G(r6, r11, r3)
        L_0x0203:
            boolean r3 = r2.A03()
            if (r3 == 0) goto L_0x0216
            boolean r3 = r2.A0L
            if (r3 == 0) goto L_0x0216
            java.lang.String r3 = r2.A0G
            X.2C7 r2 = new X.2C7
            r2.<init>(r1, r3)
            r0.A0K = r2
        L_0x0216:
            X.1wS r2 = r0.A0j
            X.274 r7 = r2.A00
            X.0Tu r4 = X.0Tu.A06
            r2 = 36322392393394312(0x810b0600002888, double:3.033765435892649E-306)
            boolean r2 = X.182.A06(r4, r1, r2)
            if (r2 == 0) goto L_0x0240
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = r0.A0e
            boolean r2 = r2.A25
            if (r2 == 0) goto L_0x0240
            if (r7 == 0) goto L_0x0240
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r6 = r7.A0H
            java.util.concurrent.atomic.AtomicReference r4 = r7.A0S
            java.util.concurrent.atomic.AtomicReference r3 = r7.A0V
            X.3m4 r2 = new X.3m4
            r2.<init>(r6, r4, r3)
            r2.A00 = r1
            X.28N.A01 = r2
            X.28N.A00 = r2
        L_0x0240:
            X.U4j r1 = r0.A0P
            if (r1 == 0) goto L_0x0256
            X.Vav r1 = r1.A0a
            long[] r4 = r1.A03
            r6 = r4[r5]
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0256
            long r1 = android.os.SystemClock.elapsedRealtime()
            r4[r5] = r1
        L_0x0256:
            com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider r2 = A0p
            if (r2 == 0) goto L_0x0263
            java.lang.String r1 = r0.A05()
            com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider$Stalls r0 = com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider.Stalls.INIT
            r2.onPrepare(r1, r0)
        L_0x0263:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MM.E3n(android.view.ViewGroup, java.lang.Integer):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        if (X.1wS.A06(r3, r6, r5) != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36320270679548049L) == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36320270679679123L) == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36320270679613586L) == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e7, code lost:
        if (r4.A07 != X.C255623uR.PROGRESSIVE) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010d, code lost:
        if (r14 != false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0053, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36315189735066699L) == false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4OL FII(X.AnonymousClass3WR r50, java.lang.String r51, int r52, boolean r53) {
        /*
            r49 = this;
            r15 = 0
            r2 = r50
            if (r50 != 0) goto L_0x0006
            return r15
        L_0x0006:
            java.lang.String r1 = r2.A0I
            r35 = 1
            if (r1 != 0) goto L_0x0143
            r4 = r15
        L_0x000d:
            r0 = r49
            com.instagram.common.session.UserSession r3 = r0.A0f
            X.1Q4 r1 = X.1Q3.A00(r3)
            boolean r34 = r1.A02()
            r14 = r53 ^ 1
            r5 = r51
            r0.A03(r2, r5)
            android.content.Context r1 = r0.A0Z
            X.3uU r4 = X.1wS.A00(r1, r4, r3, r2, r5)
            java.lang.Integer r8 = r0.A0Q
            X.28e r18 = X.28e.A01
            int r13 = r0.A02
            int r12 = r0.A01
            int r11 = r0.A06
            X.4Lx r1 = r0.A0N
            boolean r7 = r1.A02
            X.3uV r9 = r0.A0H
            com.instagram.model.mediatype.ProductType r6 = r2.A09
            java.lang.String r24 = ""
            java.lang.String r5 = r4.A0A
            boolean r46 = X.1wS.A07(r3, r5)
            boolean r1 = X.AnonymousClass4OE.A00(r5)
            if (r1 == 0) goto L_0x0055
            X.0Tu r10 = X.0Tu.A05
            r1 = 36315189735066699(0x810479001c0c4b, double:3.029210445763489E-306)
            boolean r1 = X.182.A06(r10, r3, r1)
            r42 = 1
            if (r1 != 0) goto L_0x0057
        L_0x0055:
            r42 = 0
        L_0x0057:
            if (r7 != 0) goto L_0x0061
            boolean r1 = X.1wS.A06(r3, r6, r5)
            r38 = 0
            if (r1 == 0) goto L_0x0063
        L_0x0061:
            r38 = 1
        L_0x0063:
            boolean r1 = r4.A02()
            if (r1 == 0) goto L_0x0078
            X.0Tu r6 = X.0Tu.A05
            r1 = 36320270679548049(0x81091800002091, double:3.032423655512816E-306)
            boolean r1 = X.182.A06(r6, r3, r1)
            r39 = 1
            if (r1 != 0) goto L_0x007a
        L_0x0078:
            r39 = 0
        L_0x007a:
            boolean r1 = r4.A02()
            if (r1 == 0) goto L_0x008f
            X.0Tu r6 = X.0Tu.A05
            r1 = 36320270679679123(0x81091800022093, double:3.032423655595708E-306)
            boolean r1 = X.182.A06(r6, r3, r1)
            r40 = 1
            if (r1 != 0) goto L_0x0091
        L_0x008f:
            r40 = 0
        L_0x0091:
            boolean r1 = r4.A02()
            if (r1 == 0) goto L_0x00a6
            X.0Tu r6 = X.0Tu.A05
            r1 = 36320270679613586(0x81091800012092, double:3.032423655554262E-306)
            boolean r1 = X.182.A06(r6, r3, r1)
            r41 = 1
            if (r1 != 0) goto L_0x00a8
        L_0x00a6:
            r41 = 0
        L_0x00a8:
            r7 = 0
            X.PwX r1 = X.AnonymousClass4OF.A00
            if (r1 == 0) goto L_0x00c2
            android.net.Uri r1 = r4.A05
            if (r1 == 0) goto L_0x00c2
            java.lang.String r2 = r1.getScheme()
            java.lang.String r1 = "msys"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x00c2
            X.Oqv r7 = new X.Oqv
            r7.<init>(r3)
        L_0x00c2:
            boolean r47 = X.1wS.A05(r4, r3)
            X.0Tu r6 = X.0Tu.A05
            r1 = 36883066018136550(0x8308f4003d01e6, double:3.388337693831115E-306)
            java.lang.String r1 = X.182.A04(r6, r3, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x00e9
            boolean r1 = r5.startsWith(r1)
            if (r1 == 0) goto L_0x00e9
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            if (r8 != r1) goto L_0x00e9
            X.3uR r2 = r4.A07
            X.3uR r1 = X.C255623uR.PROGRESSIVE
            r48 = 1
            if (r2 == r1) goto L_0x00eb
        L_0x00e9:
            r48 = 0
        L_0x00eb:
            java.lang.Integer r1 = X.1wS.A02(r8)
            int r1 = r1.intValue()
            if (r1 == 0) goto L_0x0140
            r27 = 1
        L_0x00f7:
            java.lang.String r23 = "IgGrootPlayer"
            java.lang.Integer r22 = X.AnonymousClass05K.A00
            java.util.ArrayList r26 = new java.util.ArrayList
            r26.<init>()
            java.util.ArrayList r25 = new java.util.ArrayList
            r25.<init>()
            boolean r1 = X.1wS.A08(r5)
            if (r1 != 0) goto L_0x010f
            r37 = 0
            if (r14 == 0) goto L_0x0111
        L_0x010f:
            r37 = 1
        L_0x0111:
            com.facebook.video.heroplayer.ipc.AudioFocusLossSettings r17 = new com.facebook.video.heroplayer.ipc.AudioFocusLossSettings
            r17.<init>()
            r43 = 0
            r33 = -1
            r32 = 2000(0x7d0, float:2.803E-42)
            X.4OI r1 = new X.4OI
            r28 = r52
            r29 = r13
            r30 = r12
            r31 = r11
            r36 = r35
            r44 = r43
            r45 = r43
            r19 = r9
            r20 = r4
            r21 = r7
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            X.4Ms r2 = r0.A09
            X.4OL r3 = r2.A06(r1)
            if (r3 != 0) goto L_0x014b
            return r15
        L_0x0140:
            r27 = 0
            goto L_0x00f7
        L_0x0143:
            X.0bY r0 = A0q
            android.net.Uri r4 = X.0cp.A01(r0, r1)
            goto L_0x000d
        L_0x014b:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r2 < r1) goto L_0x0157
            X.VkE r1 = r3.A01()
            r0.A0o = r1
        L_0x0157:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MM.FII(X.3WR, java.lang.String, int, boolean):X.4OL");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.3uV, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r24v0, types: [X.4Mi, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r23v0, types: [java.lang.Object, X.4Mr] */
    /* JADX WARNING: type inference failed for: r7v2, types: [X.4NJ, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x020b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4MM(android.content.Context r30, X.C263574Mn r31, com.instagram.common.session.UserSession r32, X.C256293vX r33, X.1wS r34, java.lang.String r35) {
        /*
            r29 = this;
            r3 = r29
            r17 = r31
            r3.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r14 = new android.os.Handler
            r14.<init>(r0)
            r3.A0d = r14
            X.0nE r1 = X.C61410nE.A00
            X.4MO r0 = new X.4MO
            r0.<init>(r1)
            r3.A0i = r0
            r0 = -1
            r3.A02 = r0
            r3.A01 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.A0k = r0
            X.4Lx r0 = new X.4Lx
            r0.<init>()
            r3.A0N = r0
            X.3uV r0 = new X.3uV
            r0.<init>()
            r3.A0H = r0
            X.4MT r0 = new X.4MT
            r0.<init>()
            r3.A0g = r0
            r7 = 0
            r3.A0U = r7
            r11 = r34
            r3.A0j = r11
            r11.A0B()
            r8 = r35
            r3.A0S = r8
            X.0tS r0 = X.0tS.A00()
            boolean r0 = r0.A0Y()
            r13 = r30
            if (r0 == 0) goto L_0x0058
            r3.A0Z = r13
        L_0x0058:
            r2 = r32
            r3.A0f = r2
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r4 = X.1wd.A0G(r13, r2)
            r3.A0e = r4
            X.3L1 r28 = X.AnonymousClass3L0.A00(r2)
            boolean r0 = r4.A3Y
            if (r0 == 0) goto L_0x0247
            X.0Tu r5 = X.0Tu.A05
            r0 = 36883066016694757(0x8308f4002701e5, double:3.388337692919319E-306)
            java.lang.String r0 = X.182.A04(r5, r2, r0)
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0247
            X.SMO.A00(r7)
            java.util.concurrent.atomic.AtomicReference r1 = X.SMO.A00
            java.lang.Object r0 = r1.get()
            java.lang.Thread r0 = (java.lang.Thread) r0
            if (r0 == 0) goto L_0x0092
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L_0x0092
            r0 = 1
            X.SMO.A00(r0)
        L_0x0092:
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0247
            X.SMO.A00(r7)
            java.lang.Object r0 = r1.get()
            java.lang.Thread r0 = (java.lang.Thread) r0
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L_0x00ad
            r0 = 1
            X.SMO.A00(r0)
        L_0x00ad:
            java.lang.Object r5 = r1.get()
            android.os.HandlerThread r5 = (android.os.HandlerThread) r5
        L_0x00b3:
            android.os.Looper r15 = r5.getLooper()
            X.4MU r9 = new X.4MU
            r9.<init>(r3)
            X.4MW r6 = new X.4MW
            r6.<init>(r3)
            X.2Bs r0 = X.2Bq.A0D
            X.2Bq r0 = r0.A02(r13, r2)
            X.4MY r5 = new X.4MY
            r5.<init>(r0, r3)
            r3.A0h = r5
            boolean r0 = X.C263454Mb.A00(r2, r8)
            r3.A0X = r0
            boolean r0 = X.C263454Mb.A01(r2, r8)
            r3.A0Y = r0
            X.4Mc r10 = new X.4Mc
            r10.<init>()
            boolean r0 = r3.A0X
            r10.A00 = r0
            r1 = 0
            X.0qQ.A0B(r13, r7)
            X.4Md r8 = new X.4Md
            r8.<init>(r3)
            if (r15 == 0) goto L_0x00f8
            android.os.Handler r7 = new android.os.Handler
            r7.<init>(r15)
            X.4Mf r0 = new X.4Mf
            r0.<init>(r7)
        L_0x00f8:
            X.4Mg r7 = new X.4Mg
            r7.<init>(r9)
            if (r15 != 0) goto L_0x0109
            android.os.Looper r15 = android.os.Looper.myLooper()
            if (r15 != 0) goto L_0x0109
            android.os.Looper r15 = android.os.Looper.getMainLooper()
        L_0x0109:
            X.4Mh r24 = new X.4Mh
            r24.<init>()
            java.lang.String r0 = "audio"
            java.lang.Object r9 = r13.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.media.AudioManager"
            X.0qQ.A0C(r9, r0)
            android.media.AudioManager r9 = (android.media.AudioManager) r9
            X.4Mj r0 = new X.4Mj
            r0.<init>(r9)
            X.4Mk r27 = X.C263544Mk.A01
            if (r31 != 0) goto L_0x0126
            X.4Mn r17 = X.C263574Mn.A01
        L_0x0126:
            X.4Mq r23 = new X.4Mq
            r23.<init>()
            X.4Ms r12 = new X.4Ms
            r21 = r5
            r25 = r7
            r26 = r4
            r19 = r8
            r20 = r5
            r22 = r6
            r18 = r10
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3.A09 = r12
            boolean r0 = r3.A0X
            if (r0 == 0) goto L_0x016e
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            r5 = 1
            X.4ND r7 = new X.4ND
            r7.<init>(r5)
            boolean r0 = r3.A0Y
            if (r0 == 0) goto L_0x022b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r7.A01 = r0
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r5 < r0) goto L_0x020f
            X.VjF r0 = new X.VjF
            r0.<init>(r7)
            r0.A01(r8, r6)
            X.WKl r5 = r0.A00()
        L_0x016c:
            r12.A09 = r5
        L_0x016e:
            X.4NJ r7 = new X.4NJ
            r7.<init>()
            X.1yA r8 = r4.A12
            X.4NK r6 = new X.4NK
            r6.<init>(r8, r7)
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r3.A0e
            X.1yA r4 = r0.A12
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L_0x020b
            r0 = 1
        L_0x0185:
            com.instagram.common.session.UserSession r4 = r3.A0f
            if (r0 == 0) goto L_0x0206
            X.0kJ r0 = X.0kJ.A05
            X.0wc r21 = X.AnonymousClass0kN.A00(r1, r0, r4)
        L_0x018f:
            X.02m r0 = X.02m.A0p
            X.4NL r5 = new X.4NL
            r5.<init>(r0)
            X.4Ms r4 = r3.A09
            X.4NM r0 = new X.4NM
            r0.<init>(r2)
            X.4NN r1 = new X.4NN
            r20 = r1
            r22 = r4
            r23 = r6
            r24 = r8
            r25 = r7
            r26 = r0
            r27 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r3.A0B = r1
            X.4Ms r0 = r3.A09
            r0.A0B(r1)
            X.4Ms r0 = r3.A09
            X.4NN r1 = r3.A0B
            X.4Mt r0 = r0.A0I
            X.4Mz r0 = r0.A0G
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            r0.add(r1)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36311251248218589(0x8100e4000001dd, double:3.026719730821731E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            r3.A0l = r0
            X.26s r0 = r11.A06
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A08
            r0.add(r3)
            r0 = r33
            r3.A0b = r0
            r0 = 36313119558993696(0x81029700000720, double:3.027901258078992E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x01ef
            X.Rzx r0 = X.T7A.A06
            X.T7A r0 = r0.A00(r2)
            r3.A0a = r0
        L_0x01ef:
            r0 = 36316761691329148(0x8105e70001127c, double:3.030204557233622E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            r3.A0m = r0
            r0 = 36314730171927315(0x81040e00030b13, double:3.0289198161836305E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            r3.A0c = r0
            return
        L_0x0206:
            X.0wc r21 = X.AnonymousClass0kN.A02(r4)
            goto L_0x018f
        L_0x020b:
            boolean r0 = r4.A0K
            goto L_0x0185
        L_0x020f:
            X.WKn r0 = new X.WKn
            r0.<init>(r6)
            r5 = 2
            X.X68[] r0 = new X.X68[]{r0, r1}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r5)
            X.X68[] r5 = (X.X68[]) r5
            X.WKm r0 = new X.WKm
            r0.<init>(r5)
            X.WKk r5 = new X.WKk
            r5.<init>(r7, r0)
            goto L_0x016c
        L_0x022b:
            X.4NE r0 = new X.4NE
            r0.<init>(r8, r6)
            r5 = 2
            X.4NF[] r0 = new X.AnonymousClass4NF[]{r0, r1}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r5)
            X.4NF[] r5 = (X.AnonymousClass4NF[]) r5
            X.4NG r0 = new X.4NG
            r0.<init>(r5)
            X.4NI r5 = new X.4NI
            r5.<init>(r7, r0)
            goto L_0x016c
        L_0x0247:
            r1 = -2
            java.lang.String r0 = "HeroPlayerInternalThread"
            android.os.HandlerThread r5 = new android.os.HandlerThread
            r5.<init>(r0, r1)
            X.AnonymousClass0fe.A00(r5)
            r5.start()
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MM.<init>(android.content.Context, X.4Mn, com.instagram.common.session.UserSession, X.3vX, X.1wS, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.3uV, java.lang.Object] */
    private void A00() {
        C255653uU r0 = this.A0I;
        if (r0 != null && r0.A03()) {
            this.A0O = null;
        }
        this.A0I = null;
        this.A0H = new Object();
        this.A07 = null;
        this.A05 = -1;
        this.A04 = -1;
        this.A08 = null;
        this.A0N = new C263414Lx();
        this.A0E = null;
        this.A0F = null;
        this.A0G = null;
        AnonymousClass4MT r02 = this.A0g;
        r02.A02 = null;
        r02.A01 = null;
        r02.A00 = -1;
        this.A03 = 0;
        this.A02 = -1;
        this.A01 = -1;
        this.A0J = null;
    }

    public static void A02(AnonymousClass4MM r2) {
        if (r2.A0o != null && Build.VERSION.SDK_INT >= 29) {
            r2.A0o.A02();
            r2.A0o = null;
        }
    }

    private void A03(AnonymousClass3WR r4, String str) {
        T7A t7a = this.A0a;
        if (t7a != null) {
            t7a.A00(r4, str, this.A0f.A06);
            return;
        }
        C256293vX r2 = this.A0b;
        if (r2 != null && r4.A0E != AnonymousClass05K.A0C) {
            r2.A00(r4);
        }
    }

    public final SurfaceControl A04() {
        if (this.A0o == null || Build.VERSION.SDK_INT < 29) {
            return null;
        }
        return this.A0o.A01();
    }

    public final String A05() {
        String str;
        AnonymousClass4OI r0 = this.A09.A08;
        if (r0 == null || (str = r0.A07) == null) {
            return "";
        }
        return str;
    }

    public final void A06(float f) {
        C263634Mt r2 = this.A09.A0I;
        C263634Mt.A05(r2, "setPlaybackSpeed", new Object[0]);
        Handler handler = r2.A0E;
        handler.sendMessage(handler.obtainMessage(26, Float.valueOf(f)));
    }

    public final void A07(C266464Yz r4, AnonymousClass5OZ r5, String str) {
        C257393xK r2 = this.A0M;
        if (r2 != null) {
            r2.E08(this, r5.name(), r4.name(), str);
        }
        C14721U4j u4j = this.A0P;
        if (u4j != null) {
            u4j.setErrorOrWarningCause(r5.name(), r4.name(), str);
        }
    }

    public final void A08(AnonymousClass4Yf r9, List list) {
        if (r9 != null) {
            C257393xK r0 = this.A0M;
            if (r0 != null) {
                r0.DAP(this, r9.A0D, r9.A0E, r9.A05, r9.A04, r9.A02);
            }
            C14721U4j u4j = this.A0P;
            if (u4j != null) {
                u4j.setFormat(r9);
                u4j.setCustomQualities(list);
            }
            VideoPerformanceProvider videoPerformanceProvider = A0p;
            if (videoPerformanceProvider != null && this.A0U) {
                videoPerformanceProvider.calculateVideoQuality(A05(), (long) r9.A02, SystemClock.elapsedRealtime());
            }
        }
    }

    public final void A09(String str, Object... objArr) {
        if (this.A0e.A1y) {
            0KC.A0P("IgGrootPlayer", str, objArr);
        }
    }

    public final C14721U4j ALp() {
        C14721U4j u4j = this.A0P;
        if (u4j != null) {
            return u4j;
        }
        17k.A07(this.A0Z, "Can't create a video debug dialog without context.");
        try {
            C14721U4j u4j2 = new C14721U4j(this.A0Z, new C17297VPy(this));
            this.A0P = u4j2;
            LiveVideoDebugStatsView liveVideoDebugStatsView = u4j2.A0A;
            if (liveVideoDebugStatsView.A07 == null) {
                liveVideoDebugStatsView.A07 = null;
            }
            Timer timer = new Timer();
            liveVideoDebugStatsView.A07 = timer;
            timer.scheduleAtFixedRate(new Wv4(liveVideoDebugStatsView), 0, 100);
            C20101Wkz wkz = new C20101Wkz(this);
            this.A0R = wkz;
            this.A0d.post(wkz);
        } catch (AssertionError | NullPointerException unused) {
        }
        return this.A0P;
    }

    public final void AOz(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (viewGroup != null && this.A0X) {
            C14721U4j u4j = this.A0P;
            if (!(u4j == null || (viewGroup2 = (ViewGroup) u4j.getParent()) == null)) {
                viewGroup2.removeView(this.A0P);
            }
            this.A09.A09(viewGroup);
        }
    }

    public final ArrayList BDg() {
        ArrayList arrayList;
        List<C257293xA> list = this.A0k;
        synchronized (list) {
            arrayList = new ArrayList(list.size());
            for (C257293xA r0 : list) {
                arrayList.add(new AnonymousClass5MU(r0.A09, r0.A0E, r0.A0B));
            }
        }
        return arrayList;
    }

    public final int BdE() {
        int A002;
        AnonymousClass4MO r5 = this.A0i;
        synchronized (r5) {
            AnonymousClass4MS r4 = r5.A00;
            A002 = (int) r4.A00(TimeUnit.MILLISECONDS);
            if (r4.A02) {
                r4.A01();
                r4.A02();
            } else {
                r4.A01();
            }
        }
        return A002;
    }

    public final String BdG() {
        return String.valueOf(this.A09.A0I.A0S);
    }

    public final void ECQ(boolean z) {
        String str;
        ViewGroup viewGroup;
        if (this.A0K != null) {
            C297475ro A0A2 = this.A09.A0I.A0A();
            this.A0K.A01(this.A0I, this.A0Q, getCurrentPosition(), A0A2.A00, (int) A0A2.A02);
        }
        this.A0j.A06.A08.remove(this);
        this.A0Z = null;
        A00();
        this.A0d.removeCallbacksAndMessages((Object) null);
        C14721U4j u4j = this.A0P;
        if (u4j != null) {
            LiveVideoDebugStatsView liveVideoDebugStatsView = u4j.A0A;
            Timer timer = liveVideoDebugStatsView.A07;
            if (timer != null) {
                timer.cancel();
            }
            liveVideoDebugStatsView.A07 = null;
            ViewParent parent = u4j.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.removeView(u4j);
            }
            this.A0P = null;
        }
        if (this.A0o != null) {
            this.A09.A0D(new C40906AlE(this));
        } else if (!z) {
            this.A09.A04 = null;
        }
        C263624Ms r6 = this.A09;
        r6.A08();
        C263894Nt r5 = this.A0A;
        if (r5 != null) {
            AnonymousClass4NN r7 = r5.A00;
            if (r7 != null) {
                String str2 = r7.A06;
                if (str2 == null) {
                    str2 = AnonymousClass4NN.A02(r7);
                }
                AnonymousClass4NP r2 = r7.A0B;
                r2.A00(C264144Ot.RELEASE, str2);
                r2.A01(str2);
                r7.A06 = null;
                AnonymousClass4OY A002 = r7.A0A.A00(r7.A02, str2);
                if (A002 != null) {
                    long A082 = (long) ((int) r7.A09.A0I.A08());
                    if (r7.A0C.A0G) {
                        str = "reset";
                    } else {
                        str = "requested_pause";
                    }
                    A002.A01((C290425fI) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, str, str2, (String) null, (String) null, (String) null, A082, r7.A01, SystemClock.elapsedRealtime(), false);
                    A002.A00();
                }
            }
            r5.A00 = null;
        }
        C263904Nu r1 = this.A0L;
        if (r1 != null) {
            C262514Eo r22 = r1.A00;
            0qQ.A0B(r22, 0);
            ((AbstractCollection) C61150lc.A01.getValue()).remove(r22);
            this.A0L = null;
        }
        AnonymousClass4NN r23 = this.A0B;
        0qQ.A0B(r23, 0);
        r6.A0I.A0G.A00.remove(r23);
        r6.A0B((AnonymousClass4NN) null);
        this.A0M = null;
        C305926Kc.A00(this);
    }

    public final void EJE() {
        C263634Mt r2 = this.A09.A0I;
        C263634Mt.A05(r2, "retry video playback", new Object[0]);
        Handler handler = r2.A0E;
        handler.sendMessage(handler.obtainMessage(28));
    }

    @Deprecated
    public final void ETv(Uri uri, Integer num, String str, String str2, boolean z, boolean z2) {
        Uri uri2 = uri;
        String str3 = str2;
        String str4 = str;
        if (str == null) {
            str4 = uri2.toString();
        }
        if (str2 == null) {
            str3 = "";
        }
        C255623uR r8 = C255623uR.PROGRESSIVE;
        Map map = Collections.EMPTY_MAP;
        Integer num2 = num;
        A01(new C255653uU(uri2, (Uri) null, C255643uT.GENERAL, r8, str4, (String) null, (String) null, str3, (String) null, "UNKNOWN", (String) null, C255633uS.A00(1wS.A02(num2)), (String) null, (List) null, (List) null, map, false, false, false, z2), (ProductType) null);
        this.A0Q = num2;
        this.A03 = 0;
        this.A02 = -1;
        this.A01 = -1;
    }

    public final void Ecb(C263894Nt r3) {
        this.A0A = r3;
        C263904Nu r0 = this.A0L;
        if (r0 != null) {
            C262514Eo r1 = r0.A00;
            0qQ.A0B(r1, 0);
            ((AbstractCollection) C61150lc.A01.getValue()).remove(r1);
        }
        C263904Nu r12 = new C263904Nu();
        this.A0L = r12;
        C263894Nt r02 = this.A0A;
        r12.A00 = r02;
        AnonymousClass4NN r13 = this.A0B;
        r02.A00 = r13;
        if (r13 != null) {
            r13.A03 = r02.A01;
        }
    }

    public final void Ech(boolean z) {
        C255653uU r0;
        if (!182.A06(0Tu.A05, this.A0f, 36312586985931968L) || this.A0J != ProductType.CLIPS || (r0 = this.A0I) == null || !"feed_timeline".equals(r0.A0A)) {
            this.A09.A0I.A0H(z);
        }
    }

    public final void EnS(Uri uri) {
        this.A07 = uri;
        if (uri != null && !11Z.A07()) {
            Uri A012 = AnonymousClass2S1.A02.A01(uri);
            if (A012 != null) {
                this.A07 = A012;
                return;
            }
            String scheme = uri.getScheme();
            if (scheme == null || !scheme.equalsIgnoreCase("file")) {
                UserSession userSession = this.A0f;
                ((C10916S0t) userSession.A01(C10916S0t.class, new TPP())).A00(uri, userSession, false);
            }
        }
    }

    public final void Eqq(float f) {
        this.A00 = f;
        this.A09.A0I.A0G("unknown", f);
    }

    public final boolean FNM() {
        AnonymousClass4OI r0;
        C263634Mt r02 = this.A09.A0I;
        String str = r02.A0W;
        if (str == null || (r0 = r02.A0F.A07) == null || !str.equals(r0.A0K.A0G)) {
            return false;
        }
        return true;
    }

    public final int getCurrentPosition() {
        long j;
        C255653uU r8 = this.A0I;
        if (r8 == null) {
            return 0;
        }
        C263634Mt r7 = this.A09.A0I;
        long j2 = 0;
        if (r7.A0I()) {
            long A062 = r7.A06();
            C263684My r1 = (C263684My) r7.A0N.get();
            if (r7.A0I()) {
                j = r1.A08;
            } else {
                j = 0;
            }
            j2 = Math.max(0, A062 - j);
        }
        int i = (int) j2;
        if (!r8.A03()) {
            return (int) r7.A08();
        }
        return i;
    }

    public final void pause() {
        C263624Ms.A01(this.A09, (String) null, true);
    }

    public final void reset() {
        String str;
        C255653uU r0 = this.A0I;
        if (!(r0 == null || (str = r0.A0G) == null)) {
            AnonymousClass4NZ.A02(str, this.A09.A04);
        }
        A00();
        C263634Mt r2 = this.A09.A0I;
        C263634Mt.A05(r2, "reset", new Object[0]);
        Handler handler = r2.A0E;
        handler.sendMessage(handler.obtainMessage(14));
    }

    public final void seekTo(int i) {
        C263634Mt r2 = this.A09.A0I;
        boolean A0J2 = r2.A0J();
        if (A0J2 && this.A0c) {
            pause();
        }
        r2.A0C(i);
        if (A0J2 && this.A0c) {
            start();
        }
    }

    public final void setSurface(Surface surface) {
        C14721U4j u4j = this.A0P;
        if (u4j != null) {
            String obj = surface.toString();
            if (obj == null) {
                obj = "null";
            }
            u4j.A0C = obj;
        }
        this.A09.A0I.A0D(surface);
        A02(this);
    }

    public final void start() {
        String str;
        C255653uU r0 = this.A0I;
        if (!(r0 == null || (str = r0.A0G) == null)) {
            Deque deque = AnonymousClass4P5.A00;
            deque.offerLast(str);
            if (deque.size() > 5) {
                deque.removeFirst();
            }
        }
        this.A09.A07();
    }

    private void A01(C255653uU r4, ProductType productType) {
        A00();
        this.A0I = r4;
        this.A0J = productType;
        if (r4.A03()) {
            this.A0O = new VU5();
        }
        C255623uR r0 = r4.A07;
        String str = r4.A0G;
        0mp.A06("type:%s, key:%s", new Object[]{r0, str});
        C14721U4j u4j = this.A0P;
        if (u4j != null) {
            u4j.A04();
        }
        VideoPerformanceProvider videoPerformanceProvider = A0p;
        if (videoPerformanceProvider != null) {
            videoPerformanceProvider.resetStallTracker();
        }
        boolean z = AnonymousClass4NZ.A04;
        AnonymousClass4NZ.A03 = new WeakReference(this);
        AnonymousClass4NZ.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.3uV, java.lang.Object] */
    public final void ETx(C263414Lx r4, AnonymousClass3WR r5, String str, int i) {
        int i2;
        A03(r5, str);
        A01(1wS.A00(this.A0Z, this.A07, this.A0f, r5, str), r5.A09);
        this.A0H = new Object();
        this.A0Q = r5.A0E;
        this.A03 = i;
        this.A0N = r4;
        if (this.A0T) {
            this.A02 = r5.A01;
            i2 = r5.A00;
        } else {
            i2 = -1;
            this.A02 = -1;
        }
        this.A01 = i2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4MM(android.content.Context r8, com.instagram.common.session.UserSession r9, java.lang.String r10) {
        /*
            r7 = this;
            r3 = r9
            X.1wS r5 = X.1wS.A01(r9)
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.Class<X.3vX> r2 = X.C256293vX.class
            r1 = 36
            X.MMF r0 = new X.MMF
            r0.<init>(r9, r1)
            java.lang.Object r4 = r9.A01(r2, r0)
            X.3vX r4 = (X.C256293vX) r4
            r2 = 0
            r0 = r7
            r1 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MM.<init>(android.content.Context, com.instagram.common.session.UserSession, java.lang.String):void");
    }
}
