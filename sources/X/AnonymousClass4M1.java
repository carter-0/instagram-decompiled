package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.endtoend.EndToEnd;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4M1  reason: invalid class name */
public final class AnonymousClass4M1 extends AnonymousClass4M2 implements AnonymousClass4M3, AnonymousClass4M5, C257403xL, C257413xM, C257423xN {
    public static final 0bY A1L = new 1Q7("IgSecureUriParser").A00;
    public static final EnumSet A1M = EnumSet.of(AnonymousClass3OB.PLAYING, AnonymousClass3OB.PAUSED, AnonymousClass3OB.STOPPING);
    public static final List A1N = Arrays.asList(new String[]{"explore_event_viewer", "feed_contextual_chain", "explore_video_chaining"});
    public double A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public PowerManager.WakeLock A0C;
    public ViewGroup A0D;
    public AnonymousClass4OK A0E;
    public C290275f3 A0F;
    public C263894Nt A0G;
    public C290245f0 A0H;
    public AnonymousClass4M7 A0I = AnonymousClass4M7.FILL;
    public C242423Ua A0J;
    public AnonymousClass4MM A0K;
    public C14721U4j A0L;
    public AnonymousClass3OB A0M;
    public C232732uM A0N;
    public C263814Nl A0O;
    public AnonymousClass4X8 A0P;
    public String A0Q;
    public AtomicBoolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public int A0d;
    public AnonymousClass4MB A0e;
    public AnonymousClass4NY A0f;
    public boolean A0g;
    public boolean A0h;
    public final int A0i;
    public final long A0j;
    public final Context A0k;
    public final 1NW A0l;
    public final UserSession A0m;
    public final AnonymousClass4MH A0n;
    public final AnonymousClass4MF A0o;
    public final C252323ov A0p;
    public final AnonymousClass4NX A0q;
    public final AnonymousClass4NW A0r;
    public final AnonymousClass4NT A0s;
    public final AnonymousClass4MI A0t;
    public final AnonymousClass4M6 A0u = new AnonymousClass4M6(this);
    public final C290415fH A0v;
    public final Runnable A0w;
    public final Runnable A0x;
    public final Runnable A0y;
    public final String A0z;
    public final HashSet A10;
    public final AtomicBoolean A11;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final boolean A15;
    public final boolean A16;
    public final boolean A17;
    public final boolean A18;
    public final boolean A19;
    public final boolean A1A;
    public final int A1B;
    public final AnonymousClass4NV A1C;
    public final AnonymousClass5MR A1D;
    public final boolean A1E;
    public final boolean A1F;
    public final boolean A1G;
    public final boolean A1H;
    public final boolean A1I;
    public final boolean A1J;
    public final int[] A1K;

    public static C263834Nn A00(C263754Nf r7, AnonymousClass4M1 r8) {
        return A02(r7, r8, (String) null, r8.A0B, r8.A07, r8.A03, r8.getCurrentPositionMs(), r7.A00);
    }

    public static C263834Nn A01(C263754Nf r6, AnonymousClass4M1 r7, int i) {
        return A02(r6, r7, (String) null, r7.A0B, r7.A07, r7.A03, i, r6.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (X.182.A06(X.0Tu.A05, r7.A0m, 36316246295253160L) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0N(X.AnonymousClass4X8 r8, java.lang.Object r9) {
        /*
            r7 = this;
            r6 = 0
            r7.A0T = r6
            X.4MM r4 = r7.A0K
            r5 = 1
            if (r4 == 0) goto L_0x003e
            boolean r0 = r9 instanceof android.graphics.SurfaceTexture
            if (r0 != 0) goto L_0x001f
            boolean r0 = r9 instanceof android.view.Surface
            if (r0 == 0) goto L_0x002f
            com.instagram.common.session.UserSession r3 = r7.A0m
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316246295253160(0x81056f000110a8, double:3.0298786186798335E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002f
        L_0x001f:
            X.5jJ r0 = new X.5jJ
            r0.<init>(r7, r8, r9)
            X.65I r1 = new X.65I
            r1.<init>(r4, r0)
            X.4Ms r0 = r4.A09
            r0.A0D(r1)
            return r6
        L_0x002f:
            X.4Nl r0 = r7.A0O
            if (r0 == 0) goto L_0x0039
            X.4Lx r0 = r0.A03
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0043
        L_0x0039:
            r1 = 0
            X.4Ms r0 = r4.A09
            r0.A04 = r1
        L_0x003e:
            X.2uM r0 = r7.A0N
            r0.onSurfaceTextureDestroyed()
        L_0x0043:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M1.A0N(X.4X8, java.lang.Object):boolean");
    }

    public final C255623uR CEW() {
        return null;
    }

    public final void Cwa(int i, int i2) {
        if (this.A0O != null && this.A0M == AnonymousClass3OB.PLAYING) {
            int i3 = 25;
            if (i2 > i) {
                i3 = 24;
            }
            Integer valueOf = Integer.valueOf(i3);
            AnonymousClass4NW r0 = this.A0r;
            int intValue = valueOf.intValue();
            r0.A03(i2, intValue);
            AnonymousClass4MF r3 = this.A0o;
            C263754Nf r5 = this.A0O.A0B;
            Object obj = r5.A03;
            boolean z = false;
            if (Float.compare((float) i2, 0.0f) != 0) {
                z = true;
            }
            r3.EGs(A02(r5, this, (String) null, this.A0B, this.A07, this.A03, getCurrentPositionMs(), z), obj, intValue, false);
        }
    }

    public final void Eqr(float f, int i) {
        float min = Math.min(Math.max(f, 0.0f), 1.0f);
        this.A0K.getClass();
        int i2 = i;
        this.A0r.A02(min, i2);
        this.A0K.Eqq(min);
        this.A02 = min;
        C263814Nl r2 = this.A0O;
        if (r2 != null && this.A0M == AnonymousClass3OB.PLAYING) {
            AnonymousClass4MF r3 = this.A0o;
            C263754Nf r7 = r2.A0B;
            Object obj = r7.A03;
            boolean z = false;
            if (Float.compare(min, 0.0f) != 0) {
                z = true;
            }
            r3.EGs(A02(r7, this, (String) null, this.A0B, this.A07, this.A03, getCurrentPositionMs(), z), obj, i2, false);
        }
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [java.lang.Object, X.4MB] */
    /* JADX WARNING: type inference failed for: r0v27, types: [java.lang.Object, X.4MF] */
    /* JADX WARNING: type inference failed for: r0v73, types: [X.4NT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v76, types: [X.4NX, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v77, types: [X.4NY, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00c2, code lost:
        if (r5.A08().equals(X.AnonymousClass05K.A04) == false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00dd, code lost:
        if (r5.A08().equals(X.AnonymousClass05K.A01) == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e7, code lost:
        if (r12 != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0228, code lost:
        if (X.182.A06(r2, r13, 36312110243447717L) == false) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x00a7, code lost:
        if (r5.A08().equals(X.AnonymousClass05K.A01) != false) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4M1(android.content.Context r18, com.instagram.common.session.UserSession r19, X.C252323ov r20, X.C232732uM r21, java.lang.String r22) {
        /*
            r17 = this;
            r3 = r17
            r3.<init>()
            r9 = 0
            X.4M6 r0 = new X.4M6
            r0.<init>(r3)
            r3.A0u = r0
            X.4M7 r0 = X.AnonymousClass4M7.FILL
            r3.A0I = r0
            r6 = 1
            r3.A0X = r6
            r3.A0V = r6
            r4 = 0
            r3.A0Z = r4
            r8 = 100
            r3.A06 = r8
            r3.A08 = r4
            r3.A0c = r4
            r3.A0h = r4
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r4)
            r3.A11 = r0
            r3.A0b = r4
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.A10 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r4)
            r3.A0R = r0
            X.4M8 r0 = new X.4M8
            r0.<init>(r3)
            r3.A0x = r0
            X.4M9 r0 = new X.4M9
            r0.<init>(r3)
            r3.A0y = r0
            android.content.Context r7 = r18.getApplicationContext()
            r3.A0k = r7
            r0 = r21
            r3.A0N = r0
            r5 = r20
            r3.A0p = r5
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314730171730705(0x81040e00000b11, double:3.0289198160592936E-306)
            r13 = r19
            boolean r0 = X.182.A06(r2, r13, r0)
            r3.A18 = r0
            r0 = 36314730171992852(0x81040e00040b14, double:3.0289198162250764E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            r3.A1F = r0
            r0 = 36883091784073706(0x8308fa000201ea, double:3.3883539883135233E-306)
            java.lang.String r1 = X.182.A04(r2, r13, r0)
            if (r20 == 0) goto L_0x0086
            java.lang.Integer r0 = r5.A08()
            java.lang.String r0 = X.AnonymousClass4MA.A00(r0)
            r1.contains(r0)
        L_0x0086:
            r0 = 36320141830987836(0x8108fa0007203c, double:3.032342171164506E-306)
            boolean r12 = X.182.A06(r2, r13, r0)
            r0 = 36320141831053373(0x8108fa0008203d, double:3.032342171205952E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 == 0) goto L_0x00a9
            if (r20 == 0) goto L_0x00a9
            java.lang.Integer r1 = r5.A08()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r0 = r1.equals(r0)
            r11 = 1
            if (r0 == 0) goto L_0x00aa
        L_0x00a9:
            r11 = 0
        L_0x00aa:
            r0 = 36320141831118910(0x8108fa0009203e, double:3.032342171247398E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 == 0) goto L_0x00c4
            if (r20 == 0) goto L_0x00c4
            java.lang.Integer r1 = r5.A08()
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            boolean r0 = r1.equals(r0)
            r10 = 1
            if (r0 != 0) goto L_0x00c5
        L_0x00c4:
            r10 = 0
        L_0x00c5:
            r0 = 36320141831184447(0x8108fa000a203f, double:3.0323421712888436E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 == 0) goto L_0x00df
            if (r20 == 0) goto L_0x00df
            java.lang.Integer r1 = r5.A08()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00e0
        L_0x00df:
            r0 = 0
        L_0x00e0:
            r3.A17 = r0
            if (r11 != 0) goto L_0x00e9
            if (r10 != 0) goto L_0x00e9
            r0 = 0
            if (r12 == 0) goto L_0x00ea
        L_0x00e9:
            r0 = 1
        L_0x00ea:
            r3.A14 = r0
            r0 = 36314730171861778(0x81040e00020b12, double:3.0289198161421847E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            r3.A1E = r0
            X.4MB r0 = new X.4MB
            r0.<init>()
            r3.A0e = r0
            X.1wD r1 = X.1w8.A00()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r1.A03 = r0
            X.4MB r0 = r3.A0e
            X.4ME r1 = X.AnonymousClass4MC.A00(r7, r0, r13, r5)
            X.4MF r0 = new X.4MF
            r0.<init>()
            r0.A00 = r1
            r3.A0o = r0
            X.0qQ.A0B(r13, r4)
            r0 = 36328787599703640(0x8110d700003e58, double:3.037809790114097E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 == 0) goto L_0x017e
            X.0Tu r5 = X.0Tu.A06
            r0 = 36610262576535538(0x8210d7000217f2, double:3.215815698871347E-306)
            long r0 = X.182.A01(r5, r13, r0)
            X.Flu r5 = new X.Flu
            r5.<init>(r13, r0)
        L_0x0136:
            r3.A0n = r5
            X.4MI r0 = new X.4MI
            r0.<init>(r7, r13)
            r3.A0t = r0
            X.4MK r0 = r0.A05
            int[] r0 = r0.A05
            r3.A1K = r0
            r0 = 50
            r3.A1B = r0
            r3.A0S = r4
            X.3OB r0 = X.AnonymousClass3OB.IDLE
            r3.A0M = r0
            r0 = 2342154531051536940(0x208101230066022c, double:4.058397117910549E-152)
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 == 0) goto L_0x017b
            X.1qX r0 = X.C66791qW.A00(r13)
            X.5MR r4 = new X.5MR
            r4.<init>(r0)
            java.util.Set r1 = r0.A02
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r1.add(r0)
            r3.A1D = r4
        L_0x016f:
            r0 = 36312251975599121(0x8101cd00000411, double:3.027352594846785E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 == 0) goto L_0x01c6
            goto L_0x0184
        L_0x017b:
            r3.A1D = r9
            goto L_0x016f
        L_0x017e:
            X.4MG r5 = new X.4MG
            r5.<init>()
            goto L_0x0136
        L_0x0184:
            X.5f0 r1 = X.C290245f0.A06     // Catch:{ AssertionError -> 0x0193 }
            if (r1 == 0) goto L_0x018b
            r3.A0H = r1     // Catch:{ AssertionError -> 0x0193 }
            goto L_0x01bf
        L_0x018b:
            java.lang.String r1 = "Please call init first"
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ AssertionError -> 0x0193 }
            r0.<init>(r1)     // Catch:{ AssertionError -> 0x0193 }
            throw r0     // Catch:{ AssertionError -> 0x0193 }
        L_0x0193:
            X.0wb r5 = X.0wb.A01
            com.facebook.common.time.AwakeTimeSinceBootClock r1 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            X.5f0 r0 = X.C290245f0.A06
            if (r0 != 0) goto L_0x01b8
            java.lang.Class<X.5f0> r4 = X.C290245f0.class
            monitor-enter(r4)
            X.5f0 r0 = X.C290245f0.A06     // Catch:{ all -> 0x01b4 }
            if (r0 != 0) goto L_0x01b7
            if (r1 == 0) goto L_0x01ac
            X.5f0 r0 = new X.5f0     // Catch:{ all -> 0x01b4 }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x01b4 }
            X.C290245f0.A06 = r0     // Catch:{ all -> 0x01b4 }
            goto L_0x01b7
        L_0x01ac:
            java.lang.String r1 = "Please init with valid values"
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x01b4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01b4 }
            throw r0     // Catch:{ all -> 0x01b4 }
        L_0x01b4:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x01b7:
            monitor-exit(r4)
        L_0x01b8:
            X.5f0 r1 = X.C290245f0.A06
            X.0qQ.A0A(r1)
            r3.A0H = r1
        L_0x01bf:
            X.5f3 r0 = new X.5f3
            r0.<init>(r1)
            r3.A0F = r0
        L_0x01c6:
            r1 = r22
            r3.A0Q = r1
            android.content.Context r11 = r3.A0k
            X.5f3 r12 = r3.A0F
            X.1wS r15 = X.1wS.A01(r13)
            java.lang.Class<X.3vX> r5 = X.C256293vX.class
            r4 = 36
            X.MMF r0 = new X.MMF
            r0.<init>(r13, r4)
            java.lang.Object r14 = r13.A01(r5, r0)
            X.3vX r14 = (X.C256293vX) r14
            X.4MM r10 = new X.4MM
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r3.A0K = r10
            r10.A0M = r3
            X.4MB r0 = r3.A0e
            r10.A0C = r0
            r3.A0m = r13
            android.content.Context r4 = r3.A0k
            java.lang.String r0 = "power"
            java.lang.Object r5 = r4.getSystemService(r0)
            android.os.PowerManager r5 = (android.os.PowerManager) r5
            if (r5 == 0) goto L_0x0216
            r4 = 10
            java.util.List r0 = A1N
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x020b
            r4 = 536870922(0x2000000a, float:1.0842035E-19)
        L_0x020b:
            java.lang.String r1 = "VideoPlayerImpl:IgVideoPlayerlockTag"
            android.os.PowerManager$WakeLock r0 = r5.newWakeLock(r4, r1)
            X.0BX.A02(r0, r1)
            r3.A0C = r0
        L_0x0216:
            r3.A04 = r8
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L_0x022a
            r0 = 36312110243447717(0x8101ac001b03a5, double:3.0272629628635275E-306)
            boolean r1 = X.182.A06(r2, r13, r0)
            r0 = 1
            if (r1 != 0) goto L_0x022b
        L_0x022a:
            r0 = 0
        L_0x022b:
            r3.A13 = r0
            com.instagram.common.session.UserSession r4 = r3.A0m
            r0 = 36319291427003495(0x81083400001c67, double:3.031804372260507E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x036f
            X.0eM r0 = X.AnonymousClass4NQ.A01
            java.lang.Object r1 = r0.getValue()
            android.os.HandlerThread r1 = (android.os.HandlerThread) r1
        L_0x0242:
            r1.getId()
            android.os.Looper r1 = r1.getLooper()
            r1.getClass()
            X.1NW r0 = new X.1NW
            r0.<init>(r1)
            r3.A0l = r0
            r0 = 36592434167546355(0x8200a0000601f3, double:3.2045409412373466E-306)
            long r0 = X.182.A01(r2, r13, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r0 = r0.intValue()
            r3.A09 = r0
            r0 = 36313476041279514(0x8102ea0000081a, double:3.0281266989119824E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            r3.A1A = r0
            r0 = 36311212593512918(0x8100db000001d6, double:3.0266952854302145E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            r3.A16 = r0
            r0 = 36874162546999322(0x8300db0001001a, double:3.382707102832531E-306)
            java.lang.String r0 = X.182.A04(r2, r13, r0)
            r3.A0z = r0
            r0 = 36311251248218589(0x8100e4000001dd, double:3.026719730821731E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 != 0) goto L_0x029b
            X.4MH r0 = r3.A0n
            boolean r0 = r0.CSf()
            if (r0 != 0) goto L_0x029b
            r6 = 0
        L_0x029b:
            r3.A12 = r6
            r0 = 36592726224994976(0x8200e4000102a0, double:3.2047256395438755E-306)
            long r4 = X.182.A01(r2, r13, r0)
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x02b2
            X.4MH r0 = r3.A0n
            long r4 = r0.Awp()
        L_0x02b2:
            r3.A0j = r4
            X.4NS r0 = new X.4NS
            r0.<init>(r3)
            r3.A0w = r0
            r0 = 36312110241940371(0x8101ac00040393, double:3.027262961910276E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            r3.A1H = r0
            r0 = 36324806165016953(0x810d3800003179, double:3.035291914786285E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            r3.A1I = r0
            r0 = 36312110242530202(0x8101ac000d039a, double:3.0272629622832874E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            r3.A1J = r0
            r0 = 36312110242333591(0x8101ac000a0397, double:3.02726296215895E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            r3.A1G = r0
            r0 = 36312110242726813(0x8101ac0010039d, double:3.027262962407625E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            r3.A15 = r0
            X.4NT r0 = new X.4NT
            r0.<init>()
            r3.A0s = r0
            X.4NV r0 = new X.4NV
            r0.<init>()
            r3.A1C = r0
            X.4NW r0 = new X.4NW
            r0.<init>()
            r3.A0r = r0
            X.4NX r0 = new X.4NX
            r0.<init>()
            r3.A0q = r0
            X.4NY r0 = new X.4NY
            r0.<init>()
            r3.A0f = r0
            r0 = 36605027011335343(0x820c14000114af, double:3.2125047063568145E-306)
            long r0 = X.182.A01(r2, r13, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r0 = r0.intValue()
            r3.A0i = r0
            r0 = 36324277884891067(0x810cbd000d2fbb, double:3.0349578283074615E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            r3.A19 = r0
            r0 = 36315202619444310(0x81047c00140c56, double:3.0292185938957716E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 == 0) goto L_0x035f
            X.4Nb r0 = X.AnonymousClass4NZ.A01
            if (r0 != 0) goto L_0x0353
            r0 = 38
            X.MMF r1 = new X.MMF
            r1.<init>(r13, r0)
            java.lang.Class<X.4Nb> r0 = X.C263714Nb.class
            java.lang.Object r0 = r13.A01(r0, r1)
            X.4Nb r0 = (X.C263714Nb) r0
            X.AnonymousClass4NZ.A01 = r0
        L_0x0353:
            X.2ew r1 = X.2ev.A00(r13)
            java.util.WeakHashMap r0 = r1.A03
            r0.put(r3, r9)
            X.2ew.A03(r1)
        L_0x035f:
            boolean r0 = X.AnonymousClass3OC.A03()
            if (r0 == 0) goto L_0x037e
            android.content.Context r1 = r3.A0k
            X.5fH r0 = new X.5fH
            r0.<init>(r1, r13, r3)
            r3.A0v = r0
            return
        L_0x036f:
            java.lang.String r0 = "VideoPlayerWorkerThread"
            android.os.HandlerThread r1 = new android.os.HandlerThread
            r1.<init>(r0)
            X.AnonymousClass0fe.A00(r1)
            r1.start()
            goto L_0x0242
        L_0x037e:
            r3.A0v = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M1.<init>(android.content.Context, com.instagram.common.session.UserSession, X.3ov, X.2uM, java.lang.String):void");
    }

    public static C263834Nn A02(C263754Nf r33, AnonymousClass4M1 r34, String str, int i, int i2, int i3, int i4, boolean z) {
        Float f;
        Float f2;
        boolean z2;
        boolean z3;
        int i5;
        String str2;
        String str3;
        AnonymousClass4M1 r7 = r34;
        AnonymousClass4X8 r0 = r7.A0P;
        if (r0 != null) {
            f = Float.valueOf((float) r0.A02().getWidth());
            f2 = Float.valueOf((float) r7.A0P.A02().getHeight());
        } else {
            f = null;
            f2 = null;
        }
        int i6 = r7.A0t.A01.A00;
        Integer valueOf = Integer.valueOf(i6);
        int i7 = i4;
        if (r7.A13) {
            if (i6 >= r7.A1B) {
                r7.A0S = true;
                r7.A05 = i7;
                r7.A0d = 0;
            } else {
                r7.A0S = false;
            }
        }
        C263814Nl r1 = r7.A0O;
        if (r1 != null) {
            z2 = !r1.A03.A02;
        } else {
            z2 = true;
        }
        C263754Nf r6 = r33;
        int i8 = r6.A01;
        int AzN = r7.AzN();
        C263814Nl r12 = r7.A0O;
        if (r12 != null) {
            z3 = r12.A05;
        } else {
            z3 = false;
        }
        if (r12 == null) {
            i5 = -1;
        } else {
            i5 = r12.A01;
        }
        int i9 = r7.A08;
        r7.A0K.getClass();
        String BdG = r7.A0K.BdG();
        r7.A0K.getClass();
        AnonymousClass4OI r13 = r7.A0K.A09.A08;
        if (r13 != null) {
            str2 = r13.A07;
        } else {
            str2 = null;
        }
        float f3 = r7.A02;
        boolean z4 = r7.A0b;
        String str4 = r7.A0Q;
        int i10 = r7.A0k.getResources().getConfiguration().orientation;
        if (i10 == 1) {
            str3 = "portrait";
        } else if (i10 != 2) {
            str3 = null;
        } else {
            str3 = "landscape";
        }
        return new C263834Nn((Boolean) null, f, f2, valueOf, BdG, str2, str4, str3, r6.A04, str, f3, i8, i7, i3, -1, -1, AzN, i, i2, -1, -1, i5, i9, z, z3, z4, z2);
    }

    private void A03() {
        if (this.A0X) {
            1NW r4 = this.A0l;
            Runnable runnable = this.A0x;
            r4.removeCallbacks(runnable);
            r4.A02(runnable, 1827799077, 120000);
            r4.A01(1827799077, this.A0y);
        }
    }

    private void A04() {
        C263814Nl r3 = this.A0O;
        AnonymousClass4MM r0 = this.A0K;
        if (r3 != null && r0 != null) {
            this.A0o.EH0(r3.A0B.A03, r0.BdE());
        }
    }

    private void A05() {
        C263814Nl r1 = this.A0O;
        if (r1 != null) {
            try {
                if (r1.A08 > 0) {
                    AnonymousClass3WR r12 = r1.A0A;
                    if (!this.A0Z && (r12 == null || !r12.A0T)) {
                        this.A0K.getClass();
                        this.A0K.seekTo(this.A0O.A08);
                    }
                }
                C263814Nl r2 = this.A0O;
                if (r2.A08 > 0) {
                    C263814Nl r0 = new C263814Nl(r2, getCurrentPositionMs());
                    this.A0O = r0;
                    r2 = r0;
                }
                if (!r2.A0E) {
                    return;
                }
                if (!this.A14 || !this.A0R.get()) {
                    A0K(this.A0O.A0D, false, true);
                }
            } catch (IllegalStateException e) {
                this.A0N.onVideoPlayerError(this.A0O.A0B, e.toString());
            }
        }
    }

    private void A06() {
        C262204Co r1;
        View A022;
        ViewGroup A002;
        AnonymousClass4X8 r0 = this.A0P;
        if (!(r0 == null || (A002 = C3019160o.A00(A022)) == null)) {
            A002.removeView((A022 = r0.A02()));
        }
        C290415fH r2 = this.A0v;
        if (r2 != null && (r1 = r2.A01) != null) {
            r1.AG7((CancellationException) null);
            r2.A01 = null;
            C290415fH.A05--;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.4Nt, java.lang.Object] */
    private void A08(C263864Nq r4) {
        if (this.A0G == null && this.A0K != null) {
            ? obj = new Object();
            obj.A01 = r4;
            this.A0G = obj;
            AnonymousClass4NV r0 = this.A1C;
            0qQ.A0B(r0, 0);
            r0.A00 = obj;
            C263894Nt r1 = this.A0G;
            AnonymousClass4NT r02 = this.A0s;
            0qQ.A0B(r02, 0);
            r02.A00 = r1;
            C263894Nt r12 = this.A0G;
            AnonymousClass4NX r03 = this.A0q;
            0qQ.A0B(r03, 0);
            r03.A00 = r12;
            C263894Nt r13 = this.A0G;
            AnonymousClass4NW r04 = this.A0r;
            0qQ.A0B(r04, 0);
            r04.A00 = r13;
            C263894Nt r14 = this.A0G;
            AnonymousClass4NY r05 = this.A0f;
            0qQ.A0B(r05, 0);
            r05.A00 = r14;
            C263874Nr r15 = this.A0G.A01;
            if (r15 != null) {
                ((C263864Nq) r15).A01 = new WeakReference(this);
            }
            this.A0K.Ecb(this.A0G);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.4X7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: X.4X7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: X.4Yt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.4Yt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: X.4Yt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: X.4Yt} */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c2, code lost:
        if (r6.A03.A03 == false) goto L_0x00c4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(X.C242423Ua r18, X.AnonymousClass4M1 r19, int r20, boolean r21) {
        /*
            r4 = r18
            r12 = r19
            X.4MM r0 = r12.A0K
            if (r0 == 0) goto L_0x0066
            X.U4j r0 = r12.A0L
            if (r0 == 0) goto L_0x0041
            android.view.ViewParent r1 = r0.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x0019
            X.U4j r0 = r12.A0L
            r1.removeView(r0)
        L_0x0019:
            java.lang.String r1 = r12.A0Q
            r2 = -1
            if (r1 == 0) goto L_0x02bf
            java.lang.String r0 = "clips_viewer"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x02bf
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x02bf
            r0 = r4
            android.view.View r0 = (android.view.View) r0
            android.view.View r1 = r0.getRootView()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x02bf
            X.U4j r0 = r12.A0L
            r1.addView(r0, r2)
        L_0x0041:
            boolean r0 = r12.A0a
            if (r0 != 0) goto L_0x0067
            com.instagram.common.session.UserSession r1 = r12.A0m
            java.lang.String r0 = r12.A0Q
            boolean r0 = X.C263454Mb.A00(r1, r0)
            if (r0 == 0) goto L_0x0067
        L_0x004f:
            X.4Nl r0 = r12.A0O
            if (r0 == 0) goto L_0x0066
            X.4Nf r0 = r0.A0B
            java.lang.Object r4 = r0.A03
            if (r4 == 0) goto L_0x0066
            X.3ov r3 = r12.A0p
            X.4MB r2 = r12.A0e
            r1 = 0
            X.4Nq r0 = new X.4Nq
            r0.<init>(r2, r1, r3, r4)
            r12.A08(r0)
        L_0x0066:
            return
        L_0x0067:
            X.4MM r0 = r12.A0K
            if (r0 == 0) goto L_0x004f
            boolean r0 = r12.A0Y
            if (r0 == 0) goto L_0x0080
            X.4X8 r0 = r12.A0P
            if (r0 == 0) goto L_0x0080
            android.view.View r0 = r0.A02()
            if (r0 == 0) goto L_0x0080
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != r4) goto L_0x0080
            goto L_0x004f
        L_0x0080:
            r12.A06()
            X.4Nl r6 = r12.A0O
            r3 = 0
            if (r6 == 0) goto L_0x00ac
            X.3WR r0 = r6.A0A
            if (r0 == 0) goto L_0x00ac
            java.lang.Integer r1 = r0.A0E
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r1 == r0) goto L_0x0096
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r1 != r0) goto L_0x00ac
        L_0x0096:
            com.instagram.common.session.UserSession r1 = r12.A0m
            X.0qQ.A0B(r1, r3)
            r0 = 0
            boolean r4 = X.C255613uQ.A00(r1, r0, r3, r3)
            X.4MM r2 = r12.A0K
            X.4Nl r0 = r12.A0O
            X.3WR r1 = r0.A0A
            java.lang.String r0 = r12.A0Q
            r2.FII(r1, r0, r3, r4)
            goto L_0x004f
        L_0x00ac:
            X.4X8 r9 = r12.A0P
            r8 = 1
            r13 = r20
            if (r9 != 0) goto L_0x0125
            com.instagram.common.session.UserSession r11 = r12.A0m
            X.4M7 r2 = r12.A0I
            float r5 = r12.A01
            boolean r1 = r12.A0a
            if (r6 == 0) goto L_0x00c4
            X.4Lx r0 = r6.A03
            boolean r0 = r0.A03
            r14 = 1
            if (r0 != 0) goto L_0x00c5
        L_0x00c4:
            r14 = 0
        L_0x00c5:
            X.0qQ.A0B(r11, r3)
            r0 = 3
            X.0qQ.A0B(r2, r0)
            r0 = 0
            if (r1 == 0) goto L_0x00d0
            r0 = 1
        L_0x00d0:
            if (r20 < 0) goto L_0x0261
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r10 = r0.getChildAt(r13)
            boolean r0 = r10 instanceof android.view.SurfaceView
            if (r0 == 0) goto L_0x0254
            android.view.SurfaceView r10 = (android.view.SurfaceView) r10
            X.4Yt r9 = new X.4Yt
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x00e4:
            X.4X8 r9 = (X.AnonymousClass4X8) r9
            boolean r1 = r9 instanceof X.AnonymousClass4X7
            if (r1 == 0) goto L_0x00f2
            r0 = r9
            X.4X7 r0 = (X.AnonymousClass4X7) r0
            com.instagram.ui.widget.textureview.ScalingTextureView r0 = r0.A02
            r0.setScaleType(r2)
        L_0x00f2:
            if (r1 == 0) goto L_0x00fb
            r0 = r9
            X.4X7 r0 = (X.AnonymousClass4X7) r0
            com.instagram.ui.widget.textureview.ScalingTextureView r0 = r0.A02
            r0.A00 = r5
        L_0x00fb:
            android.view.View r5 = r9.A02()
            int r0 = r4.getMeasuredWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r4.getMeasuredHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r5.measure(r1, r0)
            int r1 = r5.getMeasuredWidth()
            int r0 = r5.getMeasuredHeight()
            r5.layout(r3, r3, r1, r0)
            r12.A0P = r9
            X.4MI r0 = r12.A0t
            r0.A00 = r5
        L_0x0125:
            X.U4j r5 = r12.A0L
            if (r5 == 0) goto L_0x0142
            android.view.View r0 = r9.A02()
            int r2 = r0.getWidth()
            X.4X8 r0 = r12.A0P
            android.view.View r0 = r0.A02()
            int r1 = r0.getHeight()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            r5.A07 = r0
        L_0x0142:
            if (r21 == 0) goto L_0x024f
            X.4Nl r1 = r12.A0O
            if (r1 == 0) goto L_0x01f4
            X.4X8 r0 = r12.A0P
            android.view.View r0 = r0.A02()
            boolean r0 = r0 instanceof android.view.TextureView
            if (r0 == 0) goto L_0x01f4
            com.instagram.common.session.UserSession r1 = r12.A0m
            X.0qQ.A0B(r1, r3)
            r0 = 0
            boolean r7 = X.C255613uQ.A00(r1, r0, r3, r3)
            X.4MM r6 = r12.A0K
            X.4Nl r5 = r12.A0O
            X.3WR r2 = r5.A0A
            java.lang.String r1 = r12.A0Q
            boolean r0 = r12.A0Z
            if (r0 != 0) goto L_0x016e
            if (r2 == 0) goto L_0x01f1
            boolean r0 = r2.A0T
            if (r0 == 0) goto L_0x01f1
        L_0x016e:
            int r0 = r5.A08
        L_0x0170:
            X.4OL r0 = r6.FII(r2, r1, r0, r7)
            if (r0 == 0) goto L_0x024f
            X.5gx r5 = r0.A02
            if (r5 == 0) goto L_0x024f
            X.4X8 r0 = r12.A0P
            android.view.View r2 = r0.A02()
            android.view.TextureView r2 = (android.view.TextureView) r2
            if (r13 < 0) goto L_0x01ed
            android.view.ViewParent r1 = r2.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x01ed
            int r0 = r1.indexOfChild(r2)
            r1.removeView(r2)
            r2.setSurfaceTexture(r5)
            r1.addView(r2, r0)
        L_0x0199:
            X.2uM r1 = r12.A0N
            if (r1 == 0) goto L_0x01af
            X.4Nl r0 = r12.A0O
            X.4Nf r0 = r0.A0B
            r1.onVideoSwitchToWarmupPlayer(r0)
            X.4MF r1 = r12.A0o
            X.4Nl r0 = r12.A0O
            X.4Nf r0 = r0.A0B
            java.lang.Object r0 = r0.A03
            r1.EHA(r0)
        L_0x01af:
            r12.A0T = r3
            X.4X8 r0 = r12.A0P
            r0.A05(r4)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            boolean r0 = A0L(r12)
            if (r0 == 0) goto L_0x01c3
            X.4MI r0 = r12.A0t
            r0.A01(r4, r12)
        L_0x01c3:
            if (r8 != 0) goto L_0x004f
            X.4X8 r1 = r12.A0P
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x004f
            X.4Nl r0 = r12.A0O
            if (r0 == 0) goto L_0x01d7
            X.4Lx r0 = r0.A03
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x004f
        L_0x01d7:
            boolean r0 = r1 instanceof X.AnonymousClass4X7
            if (r0 == 0) goto L_0x01e8
            X.4X7 r1 = (X.AnonymousClass4X7) r1
            android.view.Surface r1 = r1.A00
        L_0x01df:
            if (r1 == 0) goto L_0x004f
            X.4MM r0 = r12.A0K
            r0.setSurface(r1)
            goto L_0x004f
        L_0x01e8:
            X.4Yt r1 = (X.C266404Yt) r1
            android.view.Surface r1 = r1.A01
            goto L_0x01df
        L_0x01ed:
            r2.setSurfaceTexture(r5)
            goto L_0x0199
        L_0x01f1:
            r0 = 0
            goto L_0x0170
        L_0x01f4:
            X.4MM r0 = r12.A0K
            if (r0 == 0) goto L_0x024f
            if (r1 == 0) goto L_0x024f
            X.4X8 r0 = r12.A0P
            if (r0 == 0) goto L_0x024f
            android.view.View r0 = r0.A02()
            boolean r0 = r0 instanceof android.view.SurfaceView
            if (r0 == 0) goto L_0x024f
            com.instagram.common.session.UserSession r1 = r12.A0m
            X.0qQ.A0B(r1, r3)
            r0 = 0
            boolean r7 = X.C255613uQ.A00(r1, r0, r3, r3)
            X.4MM r6 = r12.A0K
            X.4Nl r5 = r12.A0O
            X.3WR r2 = r5.A0A
            java.lang.String r1 = r12.A0Q
            boolean r0 = r12.A0Z
            if (r0 != 0) goto L_0x0222
            if (r2 == 0) goto L_0x0252
            boolean r0 = r2.A0T
            if (r0 == 0) goto L_0x0252
        L_0x0222:
            int r0 = r5.A08
        L_0x0224:
            X.4OL r2 = r6.FII(r2, r1, r0, r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x024f
            if (r2 == 0) goto L_0x024f
            X.VkE r0 = r2.A01()
            if (r0 == 0) goto L_0x024f
            A0G(r12)
            X.2uM r1 = r12.A0N
            if (r1 == 0) goto L_0x024f
            X.4Nl r0 = r12.A0O
            X.4Nf r0 = r0.A0B
            r1.onVideoSwitchToWarmupPlayer(r0)
            X.4MF r1 = r12.A0o
            X.4Nl r0 = r12.A0O
            X.4Nf r0 = r0.A0B
            java.lang.Object r0 = r0.A03
            r1.EHA(r0)
        L_0x024f:
            r8 = 0
            goto L_0x01af
        L_0x0252:
            r0 = 0
            goto L_0x0224
        L_0x0254:
            boolean r0 = r10 instanceof com.instagram.ui.widget.textureview.ScalingTextureView
            if (r0 == 0) goto L_0x02c6
            com.instagram.ui.widget.textureview.ScalingTextureView r10 = (com.instagram.ui.widget.textureview.ScalingTextureView) r10
            X.4X7 r9 = new X.4X7
            r9.<init>(r10, r12, r13)
            goto L_0x00e4
        L_0x0261:
            android.content.Context r6 = r4.getContext()
            if (r0 == 0) goto L_0x02b2
            X.0qQ.A07(r6)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36316246295777453(0x81056f000910ad, double:3.0298786190113985E-306)
            boolean r0 = X.182.A06(r7, r11, r0)
            if (r0 == 0) goto L_0x02ac
            r0 = 36597721272421267(0x82056f00080b93, double:3.2078845276497035E-306)
            long r0 = X.182.A01(r7, r11, r0)
            int r7 = (int) r0
            java.util.List r1 = X.Pzm.A00
            int r0 = r1.size()
            if (r0 >= r7) goto L_0x02a3
            android.view.SurfaceView r0 = new android.view.SurfaceView
            r0.<init>(r6)
        L_0x028e:
            r1.add(r0)
        L_0x0291:
            X.4Yt r9 = new X.4Yt
            r15 = r9
            r17 = r11
            r18 = r12
            r19 = r3
            r20 = r14
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            goto L_0x00e4
        L_0x02a3:
            java.lang.Object r0 = X.018.A13(r1)
            if (r0 == 0) goto L_0x02ce
            android.view.SurfaceView r0 = (android.view.SurfaceView) r0
            goto L_0x028e
        L_0x02ac:
            android.view.SurfaceView r0 = new android.view.SurfaceView
            r0.<init>(r6)
            goto L_0x0291
        L_0x02b2:
            r1 = 0
            com.instagram.ui.widget.textureview.ScalingTextureView r0 = new com.instagram.ui.widget.textureview.ScalingTextureView
            r0.<init>(r6, r1)
            X.4X7 r9 = new X.4X7
            r9.<init>(r0, r12, r3)
            goto L_0x00e4
        L_0x02bf:
            X.U4j r0 = r12.A0L
            r4.addView(r0, r2)
            goto L_0x0041
        L_0x02c6:
            java.lang.String r0 = "Video view needs to be either SurfaceView or ScalingTextureView"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x02ce:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M1.A09(X.3Ua, X.4M1, int, boolean):void");
    }

    private void A0A(C263834Nn r10, Object obj, String str, String str2) {
        String A002;
        AnonymousClass4MF r2 = this.A0o;
        AnonymousClass4OK r0 = this.A0E;
        if (r0 == null) {
            A002 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            r0.A00.drainTo(arrayList);
            A002 = AnonymousClass4OK.A00(arrayList);
        }
        r2.EH2(r10, obj, str, str2, A002, (String) null);
    }

    private void A0B(AnonymousClass4MJ r6, Boolean bool) {
        C263754Nf r4;
        if (this.A0O != null && CE4() != null) {
            if (this.A1I || !this.A1H || CcN()) {
                if (this.A13) {
                    if (r6.A00 >= this.A1B) {
                        this.A0S = true;
                        this.A05 = getCurrentPositionMs();
                        this.A0d = 0;
                    } else {
                        this.A0S = false;
                    }
                }
                AnonymousClass4NV r1 = this.A1C;
                boolean booleanValue = bool.booleanValue();
                r1.A02(r6, booleanValue);
                if (!booleanValue && (r4 = this.A0O.A0B) != null && this.A1H && CcN()) {
                    this.A0o.EHE(A00(r4, this), r4.A03, r6.A00);
                }
            }
        }
    }

    public static void A0C(AnonymousClass3OB r7, AnonymousClass4M1 r8) {
        boolean z;
        boolean z2;
        AnonymousClass3OB r0 = r8.A0M;
        AnonymousClass3OB r6 = AnonymousClass3OB.IDLE;
        if (r0 != r6 || (!(r7 == AnonymousClass3OB.PLAYING || r7 == AnonymousClass3OB.PREPARED) || !r8.A14)) {
            r8.A0M = r7;
            AnonymousClass5MR r02 = r8.A1D;
            if (r02 != null) {
                r02.A00 = r7;
                C66801qX r3 = r02.A01;
                synchronized (r3) {
                    Set<Reference> set = r3.A02;
                    for (Reference reference : set) {
                        AnonymousClass5MR r03 = (AnonymousClass5MR) reference.get();
                        if (r03 != null) {
                            AnonymousClass3OB r2 = r03.A00;
                            if (C66801qX.A00(r6) <= C66801qX.A00(r2)) {
                                r6 = r2;
                            }
                        } else {
                            set.remove(reference);
                        }
                    }
                    if (C66801qX.A00(r6) > r3.A00) {
                        C61520nU r22 = r3.A01;
                        synchronized (r22.A01) {
                            try {
                                z2 = r22.A00;
                            } catch (Throwable th) {
                                while (true) {
                                    th = th;
                                    break;
                                }
                            }
                        }
                        if (!z2) {
                            r22.A02();
                        }
                    } else {
                        C61520nU r23 = r3.A01;
                        synchronized (r23.A01) {
                            try {
                                z = r23.A00;
                            } catch (Throwable th2) {
                                while (true) {
                                    th = th2;
                                }
                                throw th;
                            }
                        }
                        if (z) {
                            r23.A01();
                        }
                    }
                }
            }
            Iterator it = r8.A10.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("onStateChanged");
            }
            return;
        }
        return;
        throw th;
    }

    public static void A0E(AnonymousClass4M1 r10) {
        C263814Nl r0;
        AnonymousClass3WR r6;
        if (r10.A0O == null || !1yG.A00().A02) {
            A0I(r10);
            return;
        }
        C20102Wl0 wl0 = new C20102Wl0(r10);
        long elapsedRealtime = SystemClock.elapsedRealtime() - r10.A0O.A04.A00;
        if (!(r10.A0Q == null || !1yG.A00().A02 || (r0 = r10.A0O) == null || (r6 = r0.A0A) == null || elapsedRealtime <= 0)) {
            long A012 = ((long) 1yG.A00().A01(r6)) - elapsedRealtime;
            if (A012 > 0) {
                r10.A0u.postDelayed(new C20260Wnz(r6, wl0), A012);
                return;
            }
        }
        wl0.run();
    }

    public static void A0F(AnonymousClass4M1 r2) {
        View view;
        if ((r2.A1G || r2.A1I) && A0L(r2)) {
            AnonymousClass4X8 r0 = r2.A0P;
            if (r0 != null) {
                view = r0.A02();
            } else {
                view = null;
            }
            AnonymousClass4MI r1 = r2.A0t;
            r1.A00 = view;
            r1.A02(r2);
            if (r2.A0U || r2.A15) {
                r2.A0B(r1.A01, Boolean.valueOf(r2.A1J));
            }
        }
    }

    public static void A0G(AnonymousClass4M1 r5) {
        View view;
        View view2;
        C263814Nl r0;
        AnonymousClass4X8 r02 = r5.A0P;
        SurfaceControl surfaceControl = null;
        if (r02 != null) {
            view = r02.A02();
            if (view != null) {
                view2 = (View) view.getParent();
            }
            view2 = null;
        } else {
            view = null;
            view2 = null;
        }
        AnonymousClass4MM r03 = r5.A0K;
        if (r03 != null) {
            surfaceControl = r03.A04();
        }
        if (!r5.A0T && r5.A0a && (r0 = r5.A0O) != null && view2 != null && r0.A03.A03 && Build.VERSION.SDK_INT >= 29 && (view instanceof SurfaceView)) {
            SurfaceView surfaceView = (SurfaceView) view;
            if (surfaceView.getHolder().getSurface() != null && surfaceView.getHolder().getSurface().isValid() && surfaceControl != null) {
                new SurfaceControl.Transaction().reparent(surfaceControl, surfaceView.getSurfaceControl()).setBufferSize(surfaceControl, view2.getWidth(), view2.getHeight()).setVisibility(surfaceControl, true).apply();
                r5.A0T = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = (X.C266404Yt) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(X.AnonymousClass4M1 r9) {
        /*
            X.4X8 r1 = r9.A0P
            boolean r0 = r1 instanceof X.C266404Yt
            if (r0 == 0) goto L_0x0059
            X.4Yt r1 = (X.C266404Yt) r1
            X.A4W r7 = r1.A00
            if (r7 == 0) goto L_0x0059
            android.view.SurfaceView r0 = r1.A02
            android.view.ViewParent r6 = r0.getParent()
            X.0qQ.A07(r6)
            java.lang.Boolean r1 = r7.A00
            r0 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r1, r5)
            if (r0 != 0) goto L_0x0059
            android.view.ViewParent r4 = r6.getParent()
            boolean r0 = r4 instanceof android.view.ViewGroup
            r3 = 0
            if (r0 == 0) goto L_0x0059
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L_0x0059
            X.0kx r2 = new X.0kx
            r2.<init>(r4)
        L_0x0034:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof com.instagram.common.ui.widget.imageview.IgImageView
            if (r0 == 0) goto L_0x0034
            r3 = r1
        L_0x0043:
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x0059
            boolean r0 = r6 instanceof android.view.View
            if (r0 == 0) goto L_0x0059
            r4.removeView(r3)
            android.view.View r6 = (android.view.View) r6
            int r0 = r4.indexOfChild(r6)
            r4.addView(r3, r0)
            r7.A00 = r5
        L_0x0059:
            boolean r0 = r9.A0V
            if (r0 != 0) goto L_0x0095
            X.4MM r0 = r9.A0K
            r0.getClass()
            r1 = 1
            r9.A0V = r1
            X.4M6 r0 = r9.A0u
            r0.removeMessages(r1)
            X.4Nl r2 = r9.A0O
            if (r2 == 0) goto L_0x0095
            X.4MM r0 = r9.A0K
            if (r0 == 0) goto L_0x0095
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r0 = r2.A09
            long r7 = r7 - r0
            X.2uM r1 = r9.A0N
            X.4Nf r0 = r2.A0B
            r1.onVideoViewPrepared(r0)
            X.4MM r0 = r9.A0K
            X.4MT r1 = r0.A0g
            X.4MF r2 = r9.A0o
            X.4Nl r0 = r9.A0O
            X.4Nf r0 = r0.A0B
            java.lang.Object r3 = r0.A03
            java.lang.String r4 = r1.A02
            java.lang.String r5 = r1.A01
            int r6 = r1.A00
            r2.EH9(r3, r4, r5, r6, r7)
        L_0x0095:
            X.4Nl r0 = r9.A0O
            if (r0 == 0) goto L_0x00a0
            X.2uM r1 = r9.A0N
            X.4Nf r0 = r0.A0B
            r1.onSurfaceTextureUpdated(r0)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M1.A0H(X.4M1):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0I(X.AnonymousClass4M1 r4) {
        /*
            boolean r3 = r4.A14
            r2 = r3 ^ 1
            X.3OB r1 = r4.A0M
            X.3OB r0 = X.AnonymousClass3OB.PREPARING
            if (r1 != r0) goto L_0x0022
            X.4Nl r0 = r4.A0O
            if (r0 == 0) goto L_0x0022
            X.3OB r0 = X.AnonymousClass3OB.PREPARED
            A0C(r0, r4)
            if (r3 != 0) goto L_0x0024
            r4.A05()
            X.2uM r1 = r4.A0N
            X.4Nl r0 = r4.A0O
        L_0x001c:
            X.4Nf r0 = r0.A0B
            r1.onVideoPrepared(r0, r2)
        L_0x0021:
            return
        L_0x0022:
            if (r3 == 0) goto L_0x0021
        L_0x0024:
            X.4Nl r0 = r4.A0O
            if (r0 == 0) goto L_0x0021
            X.2uM r1 = r4.A0N
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M1.A0I(X.4M1):void");
    }

    public static void A0J(AnonymousClass4M1 r6, int i) {
        View view;
        if (r6.A13) {
            int[] iArr = r6.A1K;
            int length = iArr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr[i2];
                if (i3 <= r6.A0d || i3 > i) {
                    i2++;
                } else {
                    r6.A0d = i3;
                    AnonymousClass4MI r0 = r6.A0t;
                    String CE4 = r6.CE4();
                    AnonymousClass4MK r7 = r0.A05;
                    int i4 = r0.A01.A00;
                    if (CE4 != null && r7.A04) {
                        r7.A00 = i3;
                        String str = (String) 00l.A0R(CE4, new String[]{"_"}, 0).get(0);
                        int[] iArr2 = r7.A05;
                        int i5 = 0;
                        do {
                            int i6 = iArr2[i5];
                            if (i6 != r7.A00) {
                                i5++;
                            } else if (50 <= i4) {
                                int i7 = i6 / IgNetworkConsentStorage.MAX_ENTRIES;
                                WeakReference weakReference = r7.A02;
                                if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                    view.setContentDescription(002.A05(i7, "Played ", "s ", str));
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } while (i5 < 2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r1 == X.AnonymousClass3OB.PAUSED) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0K(java.lang.String r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A0R
            r3 = 1
            r0.set(r3)
            android.content.Context r0 = r6.A0k
            boolean r0 = X.2eO.A00(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "autoplay"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            return
        L_0x0017:
            X.4Nl r4 = r6.A0O
            if (r4 == 0) goto L_0x0028
            if (r9 != 0) goto L_0x0028
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.4Nm r2 = new X.4Nm
            r2.<init>(r7, r0)
            r4.A04 = r2
        L_0x0028:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A11
            r4 = 0
            r0.set(r4)
            X.4MM r0 = r6.A0K
            r0.getClass()
            X.4Nl r0 = r6.A0O
            if (r0 == 0) goto L_0x00cc
            X.4Lx r1 = r0.A03
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x00cc
            boolean r1 = r1.A00
        L_0x003f:
            X.4MM r0 = r6.A0K
            r0.Ech(r1)
            X.4MM r0 = r6.A0K
            r0.start()
            com.instagram.common.session.UserSession r5 = r6.A0m
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310959190704520(0x8100a000040188, double:3.0265350324738124E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x00ca
            r0 = 36310959190770057(0x8100a000050189, double:3.026535032515258E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x00ca
            X.3OB r1 = r6.A0M
            X.3OB r0 = X.AnonymousClass3OB.PREPARED
            if (r1 != r0) goto L_0x00ca
            int r0 = r6.A08
            if (r0 <= 0) goto L_0x00ca
        L_0x006d:
            X.3OB r1 = r6.A0M
            X.3OB r0 = X.AnonymousClass3OB.PREPARED
            if (r1 == r0) goto L_0x00a9
            X.3OB r0 = X.AnonymousClass3OB.PAUSED
            if (r1 != r0) goto L_0x0099
        L_0x0077:
            if (r8 != 0) goto L_0x0091
            boolean r0 = r6.A18
            if (r0 == 0) goto L_0x0081
            boolean r0 = r6.A1F
            if (r0 == 0) goto L_0x0091
        L_0x0081:
            int r2 = r6.getCurrentPositionMs()
            r6.A03 = r2
        L_0x0087:
            boolean r0 = r6.A0S
            if (r0 == 0) goto L_0x0091
            int r0 = r6.A05
            int r2 = r2 - r0
            A0J(r6, r2)
        L_0x0091:
            X.4Nl r0 = r6.A0O
            if (r0 == 0) goto L_0x0099
            if (r3 != 0) goto L_0x0099
            r0.A01 = r4
        L_0x0099:
            boolean r0 = r6.A14
            if (r0 != 0) goto L_0x0016
            X.3OB r0 = X.AnonymousClass3OB.PLAYING
            A0C(r0, r6)
            X.4M6 r1 = r6.A0u
            r0 = 2
            r1.sendEmptyMessage(r0)
            return
        L_0x00a9:
            X.4Nl r1 = r6.A0O
            if (r1 == 0) goto L_0x0077
            boolean r0 = r6.A18
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r6.A1F
            if (r0 == 0) goto L_0x0091
        L_0x00b5:
            int r1 = r1.A08
            if (r3 == 0) goto L_0x00c8
            int r2 = r6.A03
        L_0x00bb:
            r6.A03 = r2
            boolean r0 = r6.A13
            if (r0 == 0) goto L_0x0091
            if (r1 != r2) goto L_0x0087
            r6.A05 = r2
            r6.A0d = r4
            goto L_0x0091
        L_0x00c8:
            r2 = r1
            goto L_0x00bb
        L_0x00ca:
            r3 = 0
            goto L_0x006d
        L_0x00cc:
            boolean r1 = r6.A0g
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M1.A0K(java.lang.String, boolean, boolean):void");
    }

    public static boolean A0L(AnonymousClass4M1 r2) {
        if (r2.A0O == null || r2.CE4() == null) {
            return false;
        }
        if (!r2.A1H || r2.CcN() || EndToEnd.isRunningEndToEndTest() || r2.A1I) {
            return true;
        }
        return false;
    }

    public static boolean A0M(AnonymousClass4M1 r3) {
        C263814Nl r0 = r3.A0O;
        if (r0 == null) {
            return false;
        }
        C263764Ng r2 = r0.A0B.A02;
        if (r2.A00 == C257183wz.CACHED || r2.A03) {
            return true;
        }
        return false;
    }

    public final C376689Iy Ato() {
        AnonymousClass4MM r0 = this.A0K;
        if (r0 == null) {
            return null;
        }
        C263634Mt r1 = r0.A09.A0I;
        if (r1.A0I()) {
            return ((C263674Mx) r1.A0B.get()).A0K;
        }
        return null;
    }

    public final int AzN() {
        this.A0K.getClass();
        return (int) this.A0K.A09.A0I.A09();
    }

    public final Object BdF() {
        C263754Nf r0;
        C263814Nl r02 = this.A0O;
        if (r02 == null || (r0 = r02.A0B) == null) {
            return null;
        }
        return r0.A03;
    }

    public final String CE4() {
        AnonymousClass3WR r0;
        C263814Nl r02 = this.A0O;
        if (r02 == null || (r0 = r02.A0A) == null) {
            return null;
        }
        return r0.A0G;
    }

    public final String CEM() {
        return this.A0Q;
    }

    public final View CEZ() {
        AnonymousClass4X8 r0 = this.A0P;
        if (r0 != null) {
            return r0.A02();
        }
        AnonymousClass4MM r02 = this.A0K;
        if (r02 != null) {
            return r02.A09.A04;
        }
        return null;
    }

    public final Integer CEj() {
        int i;
        AnonymousClass4X8 r0 = this.A0P;
        if (r0 != null) {
            i = r0.A02().getHeight();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public final Integer CEr() {
        int i;
        AnonymousClass4X8 r0 = this.A0P;
        if (r0 != null) {
            i = r0.A02().getWidth();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public final boolean CJa() {
        C263814Nl r0;
        AnonymousClass3WR r1;
        C256883wV A002;
        List list;
        if (this.A0K == null || (r0 = this.A0O) == null || (r1 = r0.A0A) == null || (A002 = r1.A00(this.A0k)) == null || (list = A002.A00) == null) {
            return false;
        }
        for (Object next : list) {
            if ((((C256733wG) next).A02.A0E & 2) != 0) {
                if (next != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean CcN() {
        AnonymousClass3WR r2;
        C263754Nf r1;
        C263814Nl r0 = this.A0O;
        if (r0 == null || (r2 = r0.A0A) == null || (r1 = r0.A0B) == null || r1.A03 == null) {
            return false;
        }
        if (r2.A0T) {
            return true;
        }
        return r1.A05;
    }

    public final boolean Ce9() {
        AnonymousClass4X8 r0 = this.A0P;
        if (r0 == null || !(r0 instanceof AnonymousClass4X7)) {
            return false;
        }
        return true;
    }

    public final void Dyi() {
        A0B(this.A0t.A01, false);
    }

    public final void E21(String str) {
        if ("fragment_paused".equals(str)) {
            A07();
            if (this.A0X) {
                1NW r2 = this.A0l;
                r2.removeCallbacks(this.A0y);
                Runnable runnable = this.A0x;
                r2.removeCallbacks(runnable);
                r2.A01(1827799077, runnable);
            }
            this.A0h = true;
        }
        AnonymousClass3OB r1 = this.A0M;
        if (r1 != AnonymousClass3OB.PLAYING) {
            if (r1 == AnonymousClass3OB.PREPARING) {
                if (!182.A06(0Tu.A05, this.A0m, 36328100404935616L)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.A0K.getClass();
        this.A0K.pause();
        this.A0R.set(false);
        A04();
        A0C(AnonymousClass3OB.PAUSED, this);
        C263814Nl r0 = this.A0O;
        if (r0 != null) {
            C263834Nn A002 = A00(r0.A0B, this);
            C263814Nl r22 = this.A0O;
            A0A(A002, r22.A0B.A03, r22.A0D, str);
            this.A0o.EH1(this.A0O.A0B.A03);
            Runnable runnable2 = this.A0w;
            if (runnable2 != null && this.A12) {
                this.A0l.removeCallbacks(runnable2);
            }
        }
    }

    public final void E2q(String str, boolean z) {
        UserSession userSession = this.A0m;
        0qQ.A0B(userSession, 0);
        C263804Nk r2 = (C263804Nk) userSession.A01(C263804Nk.class, new MMF(userSession, 37));
        WeakReference weakReference = r2.A00;
        if (weakReference.get() != this) {
            weakReference.clear();
            r2.A00 = new WeakReference(this);
        }
        if (this.A0O == null) {
            C290245f0 r1 = this.A0H;
            if (r1 != null) {
                r1.A00.Ew9("VideoPlayerImpl", "play_with_null_video");
                C290245f0.A00(r1, "VideoPlayerImpl", "play_with_null_video");
                return;
            }
            0wb.A03("VideoPlayerImpl", "play_with_null_video");
            return;
        }
        boolean z2 = true;
        if (!this.A14 || !this.A0R.get()) {
            if (this.A0h) {
                A03();
                this.A0h = false;
            }
            if (!2eO.A00(this.A0k) || !"start".equals(str)) {
                z2 = false;
            }
            String str2 = "resume";
            if (!str2.equals(str) && !z2) {
                str2 = "autoplay";
            }
            A0K(str2, z, false);
            C263814Nl r0 = this.A0O;
            this.A0o.EH4(A01(r0.A0B, this, r0.A08), this.A0O.A0B.A03, str);
        }
    }

    public final void EKy(int i, boolean z) {
        boolean z2;
        C263814Nl r2;
        boolean z3;
        String str;
        String str2;
        AnonymousClass3OB r0 = this.A0M;
        AnonymousClass3OB r4 = AnonymousClass3OB.PLAYING;
        boolean z4 = false;
        if (r0 == r4) {
            z4 = true;
        }
        if (this.A0K != null) {
            int i2 = i;
            if (!z || this.A0O == null) {
                z2 = false;
            } else {
                boolean z5 = this.A1E;
                if (z5 && z4) {
                    E21("seek");
                }
                C263754Nf r10 = this.A0O.A0B;
                C263834Nn A022 = A02(r10, this, "seek_user_scrub_or_fast_forward_or_backward", this.A0B, this.A07, this.A03, getCurrentPositionMs(), r10.A00);
                if (this.A0M == r4) {
                    if (!z5) {
                        C263814Nl r8 = this.A0O;
                        A0A(A022, r8.A0B.A03, r8.A0D, "seek");
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.A0o.EH5(A022, this.A0O.A0B.A03, i2);
            }
            this.A0K.seekTo(i2);
            if (!this.A18 || this.A1F) {
                this.A03 = i2;
                this.A05 = i2;
                this.A0d = 0;
            }
            if (z4 && this.A1E) {
                E2q("resume", true);
            }
            if (z && (r2 = this.A0O) != null && (this.A0M == r4 || z2)) {
                r2.A01 = 0;
                if (!this.A1E) {
                    this.A0s.A02("resume");
                    AnonymousClass4MF r12 = this.A0o;
                    C263754Nf r22 = this.A0O.A0B;
                    Object obj = r22.A03;
                    boolean A0M2 = A0M(this);
                    boolean z6 = r22.A02.A03;
                    C263834Nn A012 = A01(r22, this, i2);
                    if (this.A16 || ((str = this.A0Q) != null && (str2 = this.A0z) != null && CcN() && str.equals(str2))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    r12.EH7(A012, obj, "resume", 0, A0M2, z6, z3);
                    A0F(this);
                }
            }
            int AzN = AzN();
            C263814Nl r23 = this.A0O;
            if (r23 != null && AzN != 0) {
                r23.A00 = ((float) i2) / ((float) AzN);
            }
        }
    }

    public final boolean EOZ() {
        if (this.A0K == null || !CJa()) {
            return false;
        }
        C263634Mt r3 = this.A0K.A09.A0I;
        C263634Mt.A05(r3, "selectAudioRole %b", 2);
        Handler handler = r3.A0E;
        handler.sendMessage(handler.obtainMessage(46, 2));
        return true;
    }

    public final void EPC(boolean z) {
        AnonymousClass4MM r0 = this.A0K;
        if (r0 != null) {
            C263634Mt r3 = r0.A09.A0I;
            Boolean valueOf = Boolean.valueOf(z);
            C263634Mt.A05(r3, "selectAudioLangRole %b", valueOf);
            Handler handler = r3.A0E;
            handler.sendMessage(handler.obtainMessage(44, valueOf));
        }
    }

    public final void ERk(boolean z) {
        AnonymousClass4MM r0 = this.A0K;
        if (r0 != null) {
            r0.A0T = z;
        }
    }

    public final void Ech(boolean z) {
        this.A0K.getClass();
        this.A0g = z;
        this.A0K.Ech(z);
    }

    public final void EgQ(String str) {
        AnonymousClass4MM r0 = this.A0K;
        if (r0 != null) {
            C263634Mt r2 = r0.A09.A0I;
            C263634Mt.A05(r2, "selectPreferredAudioLang %s", str);
            Handler handler = r2.A0E;
            handler.sendMessage(handler.obtainMessage(45, str));
        }
    }

    public final void EjF(AnonymousClass4M7 r3) {
        this.A0I = r3;
        AnonymousClass4X8 r1 = this.A0P;
        if (r1 != null && (r1 instanceof AnonymousClass4X7)) {
            ((AnonymousClass4X7) r1).A02.setScaleType(r3);
        }
    }

    public final void EnT(boolean z, String str) {
        AnonymousClass4MM r0 = this.A0K;
        if (r0 != null) {
            C263634Mt r1 = r0.A09.A0I;
            274 A002 = r1.A06.A00();
            long j = r1.A0S;
            28J.A03("id [%d]: setSubtitleLanguage: %s:%s", new Object[]{Long.valueOf(j), str, Boolean.valueOf(z)});
            AnonymousClass4OS A003 = A002.A0c.A00(j);
            if (A003 != null) {
                AnonymousClass4OS.A07(A003.A0G.obtainMessage(33, new C263994Od(str, Collections.emptyList(), z)), A003);
            }
        }
    }

    public final int getCurrentPositionMs() {
        AnonymousClass4MM r0;
        int currentPosition;
        AnonymousClass3OB r1 = this.A0M;
        if (r1 == AnonymousClass3OB.IDLE || r1 == AnonymousClass3OB.PREPARING || this.A0U || (r0 = this.A0K) == null || (currentPosition = r0.getCurrentPosition()) > 86400000) {
            return 0;
        }
        return currentPosition;
    }

    public final boolean isPlaying() {
        this.A0K.getClass();
        return this.A0K.A09.A0I.A0J();
    }

    private void A07() {
        View view;
        if (A0L(this)) {
            AnonymousClass4X8 r0 = this.A0P;
            if (r0 != null) {
                view = r0.A02();
            } else {
                view = null;
            }
            AnonymousClass4MI r2 = this.A0t;
            r2.A00 = view;
            r2.A07.remove(this);
            AnonymousClass4MI.A0D.removeCallbacks(r2.A06);
            AnonymousClass4MJ r1 = new AnonymousClass4MJ(-2);
            r2.A01 = r1;
            A0B(r1, Boolean.valueOf(this.A1J));
        }
    }

    public static void A0D(C263814Nl r10, AnonymousClass4M1 r11) {
        boolean z;
        AnonymousClass4MM r3;
        int i;
        ViewGroup viewGroup;
        AnonymousClass4MM r32;
        Integer num;
        String str;
        11Z.A00();
        AnonymousClass4MM r1 = r11.A0K;
        if (r1 != null) {
            float f = r10.A07;
            r1.Eqq(f);
            r11.A02 = f;
        }
        AnonymousClass3WR r5 = r10.A0A;
        if (r5 == null || !r5.A07()) {
            z = false;
        } else {
            z = true;
            C256623w5 A002 = C256623w5.A00();
            if (A002 != null) {
                A002.A01();
            }
        }
        String str2 = r10.A0C;
        if (str2 != null && new File(str2).exists() && !z) {
            Uri fromFile = Uri.fromFile(new File(str2));
            C263814Nl r0 = r11.A0O;
            if (!(r0 == null || (r32 = r11.A0K) == null)) {
                AnonymousClass3WR r02 = r0.A0A;
                ViewGroup viewGroup2 = null;
                if (r02 != null) {
                    num = r02.A0E;
                    str = r02.A0G;
                } else {
                    num = null;
                    str = null;
                }
                r32.ETv(fromFile, num, str, r11.A0Q, true, false);
                AnonymousClass4MM r12 = r11.A0K;
                if (!r11.A0a) {
                    viewGroup2 = r11.A0D;
                }
                r12.E3n(viewGroup2, Integer.valueOf(r11.A0A));
            }
        } else if (r5 != null) {
            C263814Nl r4 = r11.A0O;
            if (!(r4 == null || (r3 = r11.A0K) == null)) {
                String str3 = r11.A0Q;
                if (r11.A0Z || r5.A0T) {
                    i = r4.A08;
                } else {
                    i = 0;
                }
                r3.ETx(r4.A03, r5, str3, i);
                AnonymousClass4MM r2 = r11.A0K;
                if (r11.A0a) {
                    viewGroup = null;
                } else {
                    viewGroup = r11.A0D;
                }
                r2.E3n(viewGroup, Integer.valueOf(r11.A0A));
            }
            r11.A0u.sendEmptyMessageDelayed(1, 200);
        } else {
            C290245f0 r13 = r11.A0H;
            if (r13 != null) {
                r13.A00.Ew0("VIDEO_PLAYER_FAILED_TO_START", "Failed to start video player because of invalid video source");
                C290245f0.A00(r13, "VIDEO_PLAYER_FAILED_TO_START", "Failed to start video player because of invalid video source");
            } else {
                0wb.A03("VIDEO_PLAYER_FAILED_TO_START", "Failed to start video player because of invalid video source");
            }
        }
        r11.A0N.onPrepare(r10.A0B);
        if (r11.A14) {
            r11.A05();
            if (r11.A17) {
                A0E(r11);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Object, X.4Np] */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0295, code lost:
        if (r1.startsWith("feed_") == false) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02b6, code lost:
        if (r0 == false) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02cf, code lost:
        if (X.182.A06(r4, r15, 2342165929888393900L) == false) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02d5, code lost:
        if (r1 != false) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r4 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0136, code lost:
        if (r4 == null) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02da A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0333  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E4H(X.C263794Nj r27) {
        /*
            r26 = this;
            X.11Z.A00()
            r5 = r27
            X.3WR r4 = r5.A05
            java.lang.String r13 = r5.A07
            java.lang.String r12 = r5.A08
            X.4Nf r8 = r5.A06
            X.3Ua r3 = r5.A03
            int r9 = r5.A02
            float r10 = r5.A00
            boolean r14 = r5.A09
            int r7 = r5.A01
            X.4Lx r11 = r5.A04
            X.0tS r0 = X.0tS.A00()
            boolean r0 = r0.A0Y()
            r2 = r26
            if (r0 == 0) goto L_0x003d
            com.instagram.common.session.UserSession r1 = r2.A0m
            java.lang.String r0 = r2.A0Q
            boolean r0 = X.C263454Mb.A00(r1, r0)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x003d
        L_0x0033:
            X.4MM r0 = r2.A0K
            if (r0 == 0) goto L_0x003d
            X.U4j r0 = r0.ALp()
            r2.A0L = r0
        L_0x003d:
            X.5fH r1 = r2.A0v
            if (r1 == 0) goto L_0x004f
            boolean r0 = X.AnonymousClass3OC.A02()
            if (r0 == 0) goto L_0x004f
            r1.A00 = r5
            X.3OB r0 = X.AnonymousClass3OB.PAUSED
            A0C(r0, r2)
            return
        L_0x004f:
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x006e
            boolean r0 = r2.A19
            if (r0 == 0) goto L_0x005e
            boolean r0 = X.Ri8.A00()
            if (r0 == 0) goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            boolean r1 = r2.A0a
            boolean r0 = r11.A03
            r1 = r1 | r0
            r2.A0a = r1
            if (r13 != 0) goto L_0x0073
            if (r4 == 0) goto L_0x0132
            boolean r0 = r4.A0U
            if (r0 != 0) goto L_0x0075
            return
        L_0x006e:
            int r0 = r2.A0i
            if (r7 >= r0) goto L_0x005e
            goto L_0x005d
        L_0x0073:
            if (r4 == 0) goto L_0x0132
        L_0x0075:
            java.lang.Double r0 = r4.A0C
            if (r0 == 0) goto L_0x0132
            double r5 = r0.doubleValue()
            r0 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r0 = java.lang.Math.max(r5, r0)
            r2.A00 = r0
        L_0x0085:
            X.0tS r6 = X.0tS.A00()
            X.0s0 r5 = r6.A12
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 12
            r0 = r1[r0]
            java.lang.Object r0 = r5.CDM(r6, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4.A02 = r0
        L_0x009d:
            com.instagram.common.session.UserSession r15 = r2.A0m
            r5 = 0
            X.0qQ.A0B(r15, r5)
            r0 = 37
            X.MMF r1 = new X.MMF
            r1.<init>(r15, r0)
            java.lang.Class<X.4Nk> r0 = X.C263804Nk.class
            java.lang.Object r1 = r15.A01(r0, r1)
            X.4Nk r1 = (X.C263804Nk) r1
            java.lang.ref.WeakReference r6 = r1.A00
            java.lang.Object r0 = r6.get()
            if (r0 == r2) goto L_0x00c4
            r6.clear()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.A00 = r0
        L_0x00c4:
            X.4MM r6 = r2.A0K
            if (r6 == 0) goto L_0x00d1
            X.3OB r1 = r2.A0M
            X.3OB r0 = X.AnonymousClass3OB.IDLE
            if (r1 == r0) goto L_0x00d1
            r6.reset()
        L_0x00d1:
            X.3OB r0 = X.AnonymousClass3OB.PREPARING
            A0C(r0, r2)
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r10, r0)
            float r21 = java.lang.Math.min(r0, r1)
            boolean r0 = r2.A0c
            if (r0 == 0) goto L_0x0130
            X.4Nl r0 = r2.A0O
            if (r0 == 0) goto L_0x0130
            int r1 = r0.A01
        L_0x00eb:
            android.content.Context r0 = r2.A0k
            boolean r25 = X.2eO.A00(r0)
            X.4Nl r0 = new X.4Nl
            r20 = r13
            r22 = r7
            r23 = r1
            r24 = r14
            r19 = r8
            r18 = r4
            r17 = r11
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.A0O = r0
            X.0tS r7 = X.0tS.A00()
            X.0s0 r6 = r7.A19
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 11
            r0 = r1[r0]
            java.lang.Object r0 = r6.CDM(r7, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x012a
            X.3ov r0 = r2.A0p
            X.C17163VKp.A02 = r4
            X.C17163VKp.A00 = r21
            X.C17163VKp.A03 = r8
            X.C17163VKp.A01 = r0
        L_0x012a:
            X.4MB r11 = r2.A0e
            if (r11 == 0) goto L_0x0149
            monitor-enter(r11)
            goto L_0x013a
        L_0x0130:
            r1 = 0
            goto L_0x00eb
        L_0x0132:
            r0 = 0
            r2.A00 = r0
            if (r4 == 0) goto L_0x009d
            goto L_0x0085
        L_0x013a:
            java.util.UUID r0 = X.AnonymousClass0HM.A00()     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0145 }
            r11.A00 = r0     // Catch:{ all -> 0x0145 }
            goto L_0x0148
        L_0x0145:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x0148:
            monitor-exit(r11)
        L_0x0149:
            X.4MF r6 = r2.A0o
            X.4Nl r0 = r2.A0O
            X.4Nf r0 = r0.A0B
            java.lang.Object r1 = r0.A03
            X.4Nn r0 = A00(r0, r2)
            r6.EGz(r0, r1)
            X.4MM r0 = r2.A0K
            r7 = 0
            if (r0 == 0) goto L_0x018d
            r2.A0G = r7
            X.4Nl r0 = r2.A0O
            X.4Nf r1 = r0.A0B
            java.lang.Object r13 = r1.A03
            if (r13 == 0) goto L_0x018d
            X.4Np r10 = new X.4Np
            r10.<init>()
            java.lang.String r0 = r8.A04
            r10.A01 = r0
            int r1 = r1.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x017c
            if (r1 < 0) goto L_0x017c
            r10.A00 = r0
        L_0x017c:
            X.3ov r1 = r2.A0p
            X.4Nq r0 = new X.4Nq
            r0.<init>(r11, r10, r1, r13)
            r2.A08(r0)
            boolean r0 = r2.A15
            if (r0 == 0) goto L_0x018d
            A0F(r2)
        L_0x018d:
            if (r4 == 0) goto L_0x01a7
            boolean r0 = r2.A16
            if (r0 != 0) goto L_0x0324
            java.lang.String r8 = r2.A0Q
            if (r8 == 0) goto L_0x01a7
            java.lang.String r1 = r2.A0z
            if (r1 == 0) goto L_0x01a7
            boolean r0 = r2.CcN()
            if (r0 == 0) goto L_0x01a7
            boolean r0 = r8.equals(r1)
            if (r0 != 0) goto L_0x0324
        L_0x01a7:
            r2.A0E = r7
        L_0x01a9:
            r2.A0Q = r12
            r2.A0J = r3
            r2.A0A = r9
            r2.A03()
            if (r3 == 0) goto L_0x01bb
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x01bb
            r7 = r3
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
        L_0x01bb:
            r2.A0D = r7
            boolean r0 = r2.A0c
            if (r0 != 0) goto L_0x01c3
            r2.A08 = r5
        L_0x01c3:
            if (r4 == 0) goto L_0x0321
            java.lang.Integer r8 = r4.A0E
            X.0Tu r7 = X.0Tu.A05
            r0 = 36310959190704520(0x8100a000040188, double:3.0265350324738124E-306)
            boolean r0 = X.182.A06(r7, r15, r0)
            if (r0 == 0) goto L_0x0321
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r8 == r0) goto L_0x031a
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r8 == r0) goto L_0x031a
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r8 == r0) goto L_0x031a
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r8 != r0) goto L_0x0302
            r0 = 36592434167218674(0x8200a0000101f2, double:3.20454094103012E-306)
        L_0x01e9:
            long r0 = X.182.A01(r7, r15, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r0 = r0.intValue()
        L_0x01f5:
            r2.A09 = r0
            r2.A0c = r5
            r2.A0b = r5
            if (r3 == 0) goto L_0x022c
            r0 = 1
            A09(r3, r2, r9, r0)
            X.4X8 r0 = r2.A0P
            if (r0 == 0) goto L_0x022c
            if (r4 == 0) goto L_0x02fd
            java.util.List r1 = r4.A0M
            if (r1 == 0) goto L_0x02fb
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02fb
            java.lang.Object r0 = r1.get(r5)
            com.instagram.model.mediasize.VideoUrlImpl r0 = (com.instagram.model.mediasize.VideoUrlImpl) r0
            X.4X8 r4 = r2.A0P
            int r3 = r0.A02
            int r1 = r0.A00
            boolean r0 = r4 instanceof X.AnonymousClass4X7
            if (r0 == 0) goto L_0x022c
            X.4X7 r4 = (X.AnonymousClass4X7) r4
            com.instagram.ui.widget.textureview.ScalingTextureView r0 = r4.A02
            r0.A02 = r3
            r0.A01 = r1
            com.instagram.ui.widget.textureview.ScalingTextureView.A00(r0)
        L_0x022c:
            X.4Nl r3 = r2.A0O
            X.0Tu r4 = X.0Tu.A05
            r0 = 36324655841161419(0x810d15000030cb, double:3.03519684937474E-306)
            boolean r0 = X.182.A06(r4, r15, r0)
            java.lang.String r8 = "start"
            if (r0 == 0) goto L_0x02ef
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x024c
            X.4Nf r7 = r3.A0B
            java.lang.Object r1 = r7.A03
        L_0x0245:
            X.4Nn r0 = A00(r7, r2)
            r6.EH6(r0, r1, r8, r5)
        L_0x024c:
            java.lang.String r1 = r3.A0C
            if (r1 == 0) goto L_0x0258
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r0.exists()
        L_0x0258:
            X.3WR r9 = r3.A0A
            r7 = 0
            if (r9 == 0) goto L_0x02ed
            java.lang.String r5 = r9.A0I
            if (r5 == 0) goto L_0x02ed
            if (r1 == 0) goto L_0x027b
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x027b
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            java.lang.String r5 = r0.toString()
        L_0x027b:
            X.4MM r6 = r2.A0K
            r24 = 1
            if (r9 == 0) goto L_0x02b8
            X.4Nf r8 = r3.A0B
            boolean r0 = r8.A00
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = r2.A0Q
            if (r1 == 0) goto L_0x0297
            java.lang.String r0 = "feed_"
            boolean r0 = r1.startsWith(r0)
            r21 = 1
            if (r0 != 0) goto L_0x0299
        L_0x0297:
            r21 = 0
        L_0x0299:
            boolean r11 = r8.A05
            boolean r10 = r9.A0U
            boolean r8 = r9.A0V
            java.util.List r1 = r9.A0N
            java.lang.String r0 = r9.A0H
            r20 = r1
            r22 = r11
            r23 = r10
            r25 = r8
            r19 = r7
            r18 = r0
            r16 = r9
            boolean r0 = X.AnonymousClass3WP.A09(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r8 = 1
            if (r0 != 0) goto L_0x02ea
        L_0x02b8:
            r8 = 0
            if (r9 != 0) goto L_0x02ea
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
        L_0x02bf:
            boolean r0 = X.AnonymousClass3WP.A0A(r15, r9, r0)
            if (r0 == 0) goto L_0x02d1
            r0 = 2342165929888393900(0x20810b8100052aac, double:4.068062364629055E-152)
            boolean r0 = X.182.A06(r4, r15, r0)
            r1 = 1
            if (r0 != 0) goto L_0x02d2
        L_0x02d1:
            r1 = 0
        L_0x02d2:
            if (r8 == 0) goto L_0x02d7
            r0 = 1
            if (r1 == 0) goto L_0x02d8
        L_0x02d7:
            r0 = 0
        L_0x02d8:
            if (r5 == 0) goto L_0x032f
            if (r0 == 0) goto L_0x032f
            X.1NW r4 = r2.A0l
            r1 = 1827799077(0x6cf20025, float:2.3404858E27)
            X.WpQ r0 = new X.WpQ
            r0.<init>(r6, r3, r2, r5)
            r4.A01(r1, r0)
            return
        L_0x02ea:
            java.util.List r0 = r9.A0N
            goto L_0x02bf
        L_0x02ed:
            r5 = r7
            goto L_0x027b
        L_0x02ef:
            X.4Nf r7 = r3.A0B
            java.lang.Object r1 = r7.A03
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x0245
            java.lang.String r8 = "early"
            goto L_0x0245
        L_0x02fb:
            X.4X8 r0 = r2.A0P
        L_0x02fd:
            r0.A03()
            goto L_0x022c
        L_0x0302:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r8 != r0) goto L_0x0313
            com.instagram.model.mediatype.ProductType r1 = r4.A09
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.IGTV
            if (r1 != r0) goto L_0x0313
            r0 = 36592434167611892(0x8200a0000701f4, double:3.2045409412787925E-306)
            goto L_0x01e9
        L_0x0313:
            r0 = 36592434167677429(0x8200a0000801f5, double:3.2045409413202384E-306)
            goto L_0x01e9
        L_0x031a:
            r0 = 36592434167742966(0x8200a0000901f6, double:3.204540941361684E-306)
            goto L_0x01e9
        L_0x0321:
            r0 = 3
            goto L_0x01f5
        L_0x0324:
            java.lang.String r1 = r4.A0G
            X.4OK r0 = new X.4OK
            r0.<init>(r1)
            r2.A0E = r0
            goto L_0x01a9
        L_0x032f:
            X.4MM r1 = r2.A0K
            if (r1 == 0) goto L_0x0340
            if (r5 == 0) goto L_0x0344
            if (r8 == 0) goto L_0x0344
            X.0bY r0 = A1L
            android.net.Uri r0 = X.0cp.A01(r0, r5)
            r1.EnS(r0)
        L_0x0340:
            A0D(r3, r2)
            return
        L_0x0344:
            r1.A07 = r7
            goto L_0x0340
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M1.E4H(X.4Nj):void");
    }

    public final void ECP(String str) {
        AnonymousClass3WR r0;
        11Z.A00();
        A06();
        EyP(str, true);
        C263814Nl r02 = this.A0O;
        if (!(r02 == null || (r0 = r02.A0A) == null)) {
            0nY.A00().ATE(new C292705jO(this, r0.A0G));
        }
        AnonymousClass4MM r03 = this.A0K;
        if (r03 != null) {
            r03.ECQ(true);
            this.A0K.A0M = null;
        }
        this.A0J = null;
        this.A0D = null;
        this.A0K = null;
        this.A0P = null;
        this.A0O = null;
        this.A08 = 0;
        this.A0b = false;
        this.A0o.A00 = null;
        this.A0G = null;
        this.A10.clear();
        this.A0R.set(false);
        Runnable runnable = this.A0w;
        if (runnable != null && this.A12) {
            this.A0l.removeCallbacks(runnable);
        }
        1NW r3 = this.A0l;
        Thread thread = r3.getLooper().getThread();
        0qQ.A0B(thread, 0);
        if (AnonymousClass4NQ.A00) {
            AnonymousClass0eM r1 = AnonymousClass4NQ.A01;
            if (r1.getValue() == thread) {
                r1.getValue();
                return;
            }
        }
        r3.A01(1827799077, new C40907AlF(this));
    }

    public final void EyP(String str, boolean z) {
        ViewGroup viewGroup;
        AnonymousClass3OB r5;
        AnonymousClass3WR r0;
        11Z.A00();
        C290415fH r1 = this.A0v;
        if (r1 == null || !AnonymousClass3OC.A02()) {
            if (this.A0X) {
                1NW r2 = this.A0l;
                r2.removeCallbacks(this.A0y);
                Runnable runnable = this.A0x;
                r2.removeCallbacks(runnable);
                r2.A01(1827799077, runnable);
            }
            this.A0h = false;
            this.A0u.removeCallbacksAndMessages((Object) null);
            AnonymousClass3OB r6 = this.A0M;
            C263814Nl r02 = this.A0O;
            AnonymousClass3OB r12 = AnonymousClass3OB.IDLE;
            if (r6 == r12 || r6 == (r5 = AnonymousClass3OB.STOPPING) || r02 == null) {
                A04();
            } else {
                boolean z2 = false;
                if (r6 == AnonymousClass3OB.PLAYING) {
                    z2 = true;
                }
                A0C(r5, this);
                if (!this.A0W && !this.A0Y) {
                    A06();
                }
                A04();
                if (z2) {
                    C263834Nn A002 = A00(this.A0O.A0B, this);
                    C263814Nl r52 = this.A0O;
                    A0A(A002, r52.A0B.A03, r52.A0D, str);
                }
                this.A0N.onStopVideo(str, z);
                AnonymousClass4MM r22 = this.A0K;
                if (r22 != null) {
                    r22.AOz(this.A0D);
                }
                int currentPositionMs = getCurrentPositionMs();
                this.A0o.EH1(this.A0O.A0B.A03);
                if (!"fragment_paused".equals(str) || this.A1I) {
                    A07();
                }
                if (this.A0M != r12) {
                    AnonymousClass4MM r03 = this.A0K;
                    if (r03 != null) {
                        r03.reset();
                        this.A0R.set(false);
                    }
                    A0C(r12, this);
                    this.A0V = true;
                }
                this.A0N.onStopped(this.A0O.A0B, currentPositionMs);
                C263814Nl r04 = this.A0O;
                if (!(r04 == null || (r0 = r04.A0A) == null)) {
                    0nY.A00().ATE(new C292705jO(this, r0.A0G));
                }
                this.A0O = null;
            }
            C14721U4j u4j = this.A0L;
            if (!(u4j == null || (viewGroup = (ViewGroup) u4j.getParent()) == null)) {
                viewGroup.removeView(this.A0L);
            }
            Runnable runnable2 = this.A0w;
            if (runnable2 != null && this.A12) {
                this.A0l.removeCallbacks(runnable2);
            }
            this.A0b = false;
            return;
        }
        r1.A00 = null;
        A0C(AnonymousClass3OB.IDLE, this);
    }
}
