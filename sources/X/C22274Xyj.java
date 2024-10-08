package X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Xyj  reason: case insensitive filesystem */
public final class C22274Xyj implements AnonymousClass4PE {
    public Handler A00;
    public 28m A01;
    public C257163wx A02;
    public C290445fK A03;
    public 28w A04;
    public C250853mA A05;
    public final Context A06;
    public final AnonymousClass27J A07;
    public final 28W A08;
    public final ServiceEventCallbackImpl A09;
    public final YAA A0A;
    public final HeroPlayerSetting A0B;
    public final Map A0C;
    public final AtomicBoolean A0D;
    public final AtomicBoolean A0E;
    public final C697127t A0F;
    public final 27s A0G;
    public final C264124Or A0H;
    public final 27k A0I;
    public final AnonymousClass4PF A0J;
    public final AnonymousClass27W A0K;

    public final AnonymousClass4QZ BNX(AnonymousClass4OI r31, 1xV r32, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, boolean z) {
        1xV r0 = r32;
        int i = r0.A00;
        int i2 = r0.A01;
        27s r13 = this.A0G;
        C697127t r10 = this.A0F;
        27k r14 = this.A0I;
        AnonymousClass4QV r15 = new AnonymousClass4QV();
        HeroPlayerSetting heroPlayerSetting = this.A0B;
        AnonymousClass4QT r16 = new AnonymousClass4QT(r14, heroPlayerSetting.A11, new AtomicBoolean(false), new AtomicBoolean(false), IgNetworkConsentStorage.MAX_ENTRIES, IgNetworkConsentStorage.MAX_ENTRIES, 6000, heroPlayerSetting.A0L, heroPlayerSetting.A0K, true, false, false, false);
        boolean z2 = heroPlayerSetting.A3Q;
        int i3 = heroPlayerSetting.A0g;
        int i4 = heroPlayerSetting.A06;
        boolean z3 = true;
        if (r14 == null) {
            z3 = false;
        }
        C256703wD.A03(z3);
        return new AnonymousClass4QY(r10, r16, (AnonymousClass27Y) null, r13, r14, r15, atomicBoolean, atomicBoolean2, i, i2, -1, i3, i4, -1, z2, false, z);
    }

    public static long A00(AnonymousClass4OI r4, C256883wV r5, C22274Xyj xyj) {
        String str;
        if (r5 != null) {
            VideoBandwidthEstimate A002 = xyj.A01.A00();
            Uri uri = r4.A0K.A05;
            if (uri != null) {
                str = uri.getHost();
            } else {
                str = null;
            }
            A002.getEstimatedThroughput(75, str);
            List list = r5.A01;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
        C255653uU r1 = r4.A0K;
        long j = (long) xyj.A0B.A0J;
        long j2 = r1.A02;
        if (j2 > 0) {
            j = Math.max(j2, j);
        }
        return (long) ((int) j);
    }

    public final 28i A01(AnonymousClass4OI r4) {
        28i r2 = new 28i();
        C255653uU r1 = r4.A0K;
        r2.A06(r1.A0M);
        String str = r4.A06;
        synchronized (r2) {
            r2.A00 = str;
        }
        synchronized (r2) {
        }
        r2.A05(r1.A0G);
        boolean z = r1.A0N;
        synchronized (r2) {
            r2.A04 = z;
        }
        r2.A04(r1.A0A);
        synchronized (r2) {
        }
        Uri uri = r1.A05;
        if (uri != null) {
            r2.A03(uri.getHost());
        }
        synchronized (r2) {
        }
        return r2;
    }

    public final 28w AdZ(C250853mA r17, AnonymousClass4OI r18) {
        28g r8;
        HeroPlayerSetting heroPlayerSetting = this.A0B;
        1xk r11 = heroPlayerSetting.A0w;
        if (!r11.A0v) {
            return null;
        }
        AnonymousClass4OI r5 = r18;
        28i A012 = A01(r5);
        27s r12 = this.A0G;
        AbrContextAwareConfiguration abrContextAwareConfiguration = new AbrContextAwareConfiguration(r11, r12, A012, true, false);
        28m r6 = new 28m(abrContextAwareConfiguration, this.A0K);
        if (abrContextAwareConfiguration.getShouldEnableAudioIbrCache()) {
            r8 = new 28g(new 28a(this.A08.A01), (29t) null, r5.A04, heroPlayerSetting);
        } else {
            r8 = null;
        }
        return new 28w(this.A06, r6, A012, r8, this.A04, abrContextAwareConfiguration, r17, r12);
    }

    public final C264544Qh BD1(C290455fL r51, AnonymousClass4OI r52) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        HeroPlayerSetting heroPlayerSetting = this.A0B;
        boolean z6 = heroPlayerSetting.A2o;
        C255653uU r4 = r52.A0K;
        int i = (int) r4.A02;
        int i2 = (int) r4.A03;
        int i3 = heroPlayerSetting.A0V;
        int i4 = heroPlayerSetting.A0S;
        int i5 = heroPlayerSetting.A0R;
        int i6 = heroPlayerSetting.A0a;
        int AOo = r51.AOo();
        int AOp = r51.AOp();
        boolean CWk = r51.CWk();
        boolean z7 = heroPlayerSetting.A2c;
        boolean z8 = heroPlayerSetting.A1U;
        1xn r14 = heroPlayerSetting.A0v;
        1xp r13 = heroPlayerSetting.A0u;
        1xr r12 = heroPlayerSetting.A0t;
        boolean z9 = heroPlayerSetting.A2I;
        int i7 = heroPlayerSetting.A0z.maxAllowed503RetryCount;
        int i8 = heroPlayerSetting.A0H;
        1yD r0 = heroPlayerSetting.A10;
        boolean z10 = r0.A0g;
        1xH r2 = heroPlayerSetting.A01;
        if (r2 != null) {
            z = r2.A0l;
            z2 = r2.A0k;
            z3 = r2.A0j;
            z4 = r2.A0i;
            z5 = r2.A0I;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        return new C264544Qh(r12, r13, r14, i, i2, i3, i4, i5, i6, AOo, AOp, 3, i7, i8, -1000, true, z6, true, CWk, z7, z8, z9, false, z10, z, z2, z3, z4, z5, heroPlayerSetting.A1o, heroPlayerSetting.A3K, r0.A0f);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.5fL, java.lang.Object, X.Xwz] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.5fL, java.lang.Object, X.Xwy] */
    public final C290455fL BOh(AnonymousClass4OI r4) {
        boolean A1W = AnonymousClass7TF.A1W(r4.A0K.A06, C255643uT.GAMING);
        HeroPlayerSetting heroPlayerSetting = this.A0B;
        if (A1W) {
            ? obj = new Object();
            obj.A00 = r4;
            obj.A01 = heroPlayerSetting;
            return obj;
        }
        27s r0 = this.A0G;
        ? obj2 = new Object();
        obj2.A01 = r4;
        obj2.A02 = heroPlayerSetting;
        obj2.A00 = r0;
        return obj2;
    }

    public final 28w CDw(C250853mA r16, AnonymousClass4OI r17, C256633w6 r18) {
        AnonymousClass4OI r1 = r17;
        28i A012 = A01(r1);
        C250853mA r7 = r16;
        this.A05 = r7;
        28a r2 = new 28a(this.A08.A01);
        28e r12 = r1.A04;
        HeroPlayerSetting heroPlayerSetting = this.A0B;
        28g r4 = new 28g(r2, (29t) null, r12, heroPlayerSetting);
        1xk r10 = heroPlayerSetting.A0w;
        27s r8 = this.A0G;
        AbrContextAwareConfiguration abrContextAwareConfiguration = new AbrContextAwareConfiguration(r10, r8, A012, true, false);
        this.A01 = null;
        28m r22 = new 28m(abrContextAwareConfiguration, this.A0K);
        this.A01 = r22;
        28w r0 = new 28w(this.A06, r22, A012, r4, (28w) null, abrContextAwareConfiguration, r7, r8);
        this.A04 = r0;
        return r0;
    }

    public C22274Xyj(Context context, Handler handler, 29t r11, C257163wx r12, C264124Or r13, 28T r14, ServiceEventCallbackImpl serviceEventCallbackImpl, C290445fK r16, YAA yaa, Map map, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.A06 = context;
        this.A0C = map;
        HeroPlayerSetting heroPlayerSetting = r14.A06;
        this.A0B = heroPlayerSetting;
        27k r4 = (27k) r14.A09.get();
        this.A0I = r4;
        AnonymousClass27W r7 = r14.A07;
        this.A0K = r7;
        this.A0G = r14.A03;
        this.A0F = r14.A01;
        this.A08 = r14.A00;
        this.A07 = r14.A02;
        this.A09 = serviceEventCallbackImpl;
        this.A02 = r12;
        29t r2 = r11;
        this.A0J = new AnonymousClass4PF(context, r2, r12, r4, serviceEventCallbackImpl, heroPlayerSetting, r7);
        this.A00 = handler;
        this.A0A = yaa;
        this.A0E = atomicBoolean;
        this.A0D = atomicBoolean2;
        this.A03 = r16;
        this.A0H = r13;
    }

    public final 28m Af6() {
        return this.A01;
    }

    public final 28w Av8() {
        return this.A04;
    }

    /* JADX WARNING: type inference failed for: r35v2, types: [X.4SZ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r35v7, types: [X.4SZ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0410, code lost:
        if (r2.A0K != X.AnonymousClass05K.A00) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0412, code lost:
        r2.A00 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0414, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0416, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x041b, code lost:
        if (r2.A0K != X.AnonymousClass05K.A01) goto L_0x0474;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x041d, code lost:
        r9.Dks(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0422, code lost:
        r21 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0424, code lost:
        if (r65 != null) goto L_0x0463;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0426, code lost:
        r11 = 0;
        r9 = 0;
        r7 = 0;
        r5 = 0;
        r35 = 0;
        r14 = false;
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0432, code lost:
        r22 = X.AnonymousClass4PG.A02(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0436, code lost:
        if (r65 != null) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0438, code lost:
        r15 = r16;
        r4 = false;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0457, code lost:
        return new X.AnonymousClass4T2(r2, r27, r21, r22, r15, r16, r25, r26, r11, r9, r7, r5, r35, r14, r13, r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0458, code lost:
        r15 = r1.A0K;
        r4 = r1.A0W;
        r3 = r1.A0R;
        r16 = r1.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0463, code lost:
        r11 = r1.A0B;
        r9 = r1.A07;
        r7 = r1.A05;
        r5 = r1.A08;
        r35 = android.os.SystemClock.elapsedRealtime();
        r14 = r1.A0S;
        r13 = r1.A0V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0474, code lost:
        r2.A00 = r9;
        r2.A02(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0105, code lost:
        if (r1.A0U == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0109, code lost:
        if (r65 == null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x010b, code lost:
        r38 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x010f, code lost:
        if (r1.A0V != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0111, code lost:
        r38 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0113, code lost:
        if (r65 == null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0115, code lost:
        r39 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0119, code lost:
        if (r1.A0W != false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x011b, code lost:
        r39 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x011d, code lost:
        if (r65 == null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011f, code lost:
        r40 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0123, code lost:
        if (r1.A0R != false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0125, code lost:
        r40 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0127, code lost:
        r15 = r11.A2U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0129, code lost:
        if (r65 == null) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0131, code lost:
        if (r1.A0Q.size() <= 0) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0133, code lost:
        r9 = X.C21055XCg.A07(r1).A02.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x013b, code lost:
        r13 = r3.A07;
        r4 = r0.A02;
        r49 = r4;
        r16 = "";
        r18 = new X.C257173wy((X.28m) null, r54, r21, r4, r23, (X.AnonymousClass27W) null, r25, r16, r27, r9, r13, r34, r31, r32, r8, r8, r8, r37, r38, r39, r40, r8, r15);
        r18.A16 = r11.A3B;
        r4 = new X.C22299Xz9(r18);
        r62.A01 = r4;
        r39 = r58;
        r46 = r66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0175, code lost:
        if (r12.A0V == false) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0177, code lost:
        r7 = r0.A0I;
        r15 = r0.A0G;
        r34 = new X.C264974Sa(new java.lang.Object(), r7, r15, r49, r39, r10, r14, r7, r20, r20, r18, r46, -1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0195, code lost:
        r20 = new com.google.android.exoplayer2.source.dash.DashMediaSource$Factory(r7, r49, r12, r14, r63, r34, new X.C22289Xyy(new X.C257063wn(r3.A04, r51, r56, r55, r52, r50), r4, r53.A05.A18));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01ca, code lost:
        if (r65 == null) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01d2, code lost:
        if (r1.A0Q.size() >= 1) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01d4, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01d6, code lost:
        r10 = r4.A01;
        r25 = r10.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01dc, code lost:
        r9 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01de, code lost:
        if (r9 != null) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01e0, code lost:
        r26 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01e2, code lost:
        if (r25 <= 0) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01e6, code lost:
        if (r1.A0W == false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01e8, code lost:
        r12 = (X.C256733wG) r10.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01f0, code lost:
        if ((r12 instanceof X.AnonymousClass4XD) == false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01f2, code lost:
        ((X.AnonymousClass4XD) r12).BrO(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01f9, code lost:
        r9 = A00(r3, r4, r0);
        r20.A04 = new X.C265134Sr(r11.A0M);
        r20.A00 = r9;
        r20.A05 = new X.C256343vc(r0.A06, r11, r56, true);
        r20.A01 = r15;
        r9 = r5.A05;
        r5 = X.C265144Ss.$redex_init_class;
        r6 = new X.AnonymousClass4RF();
        r6.A00 = r9;
        r6.A07 = "DashMediaSource";
        r6.A08 = "application/dash+xml";
        r33 = r6.A00();
        r21 = r20.A0B;
        r18 = r20.A05;
        r17 = r20.A0A;
        r15 = r20.A03;
        r14 = r20.A02;
        r13 = r20.A04;
        r5 = r20.A00;
        r27 = new X.C265144Ss(r20.A06, r20.A01, r20.A07, r20.A08, r20.A09, r33, r14, r15, r17, (X.C256633w6) null, r21, r13, r18, r5);
        r9 = new X.C22276Xyl(r3, r61, r4, r0, r27, X.DbW.A1a(r1));
        r2.A0G.set(r8 ? 1 : 0);
        r6 = r2.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0283, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0286, code lost:
        if (r25 != 0) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0288, code lost:
        X.27B.A02("HeroExo2LiveInitHelper", "No valid video representation found for live video %s", new java.lang.Object[]{r56});
        r54.callback(new X.C266454Yy(r56, "MANIFEST", "NO_VALID_VIDEO_REPRESENTATION", "No valid video representation found for live video"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x02a7, code lost:
        r26 = r9.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02ad, code lost:
        r4 = r1.A02(r8);
        r10 = X.AnonymousClass7TE.A1C();
        r9 = X.AnonymousClass7TE.A1C();
        r14 = r4.A03.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02c3, code lost:
        if (r14.hasNext() == false) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02c5, code lost:
        r13 = (X.C256773wK) r14.next();
        r12 = r13.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02cd, code lost:
        if (r12 == 1) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02d0, code lost:
        if (r12 != 2) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02d2, code lost:
        r12 = r13.A07.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02dc, code lost:
        if (r12.hasNext() == false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02de, code lost:
        r10.add(r12.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02e6, code lost:
        r12 = r13.A07.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02f0, code lost:
        if (r12.hasNext() == false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02f2, code lost:
        r9.add(r12.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02fa, code lost:
        r10.isEmpty();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0301, code lost:
        if (r10.isEmpty() == false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0303, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0309, code lost:
        if (r9.isEmpty() == false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x030b, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x030d, code lost:
        if (r10 != null) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x030f, code lost:
        if (r9 != null) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0311, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0315, code lost:
        r4 = new X.C256883wV(r10, r9);
        r10 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x031c, code lost:
        if (r10 != null) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x031e, code lost:
        r25 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0322, code lost:
        r4 = null;
        r25 = 0;
        r26 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0329, code lost:
        r7 = r0.A0I;
        r15 = r0.A0G;
        r34 = new X.AnonymousClass5JH(new java.lang.Object(), r7, r15, r49, r39, r10, r14, r7, r20, r20, r18, r46, -1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0349, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0367, code lost:
        if (r65 != null) goto L_0x0369;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4T2 BQp(X.C264114Oq r58, X.C264034Oi r59, X.AnonymousClass4OI r60, X.AnonymousClass4SU r61, X.AnonymousClass4P8 r62, X.C265114Sp r63, X.C256823wP r64, X.C256633w6 r65, X.C250823m7 r66, long r67, boolean r69) {
        /*
            r57 = this;
            r0 = r57
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r11 = r0.A0B
            X.28W r4 = r0.A08
            java.util.Map r12 = r0.A0C
            r4.A00(r11, r12)
            r3 = r60
            X.3uU r5 = r3.A0K
            java.lang.String r1 = r5.A0G
            r56 = r1
            java.util.concurrent.atomic.AtomicReference r1 = r4.A03
            r24 = r1
            java.lang.Object r2 = r24.get()
            android.util.LruCache r2 = (android.util.LruCache) r2
            r1 = r56
            java.lang.Object r2 = r2.get(r1)
            X.5fP r2 = (X.C290495fP) r2
            boolean r6 = r2 instanceof X.C290485fO
            r1 = r65
            r32 = r67
            if (r6 == 0) goto L_0x0366
            X.5fO r2 = (X.C290485fO) r2
            boolean r6 = r2.A0L
            if (r6 == 0) goto L_0x034c
            java.lang.Integer r7 = r2.A0K
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            if (r7 != r6) goto L_0x003d
            X.YAA r6 = r2.A00
            if (r6 == 0) goto L_0x0043
        L_0x003d:
            java.lang.Integer r7 = r2.A0K
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            if (r7 != r6) goto L_0x034c
        L_0x0043:
            r8 = 0
            r2.A0L = r8
            java.lang.String r6 = r5.A0A
            r55 = r6
            boolean r6 = android.text.TextUtils.isEmpty(r55)
            if (r6 != 0) goto L_0x005a
            java.lang.String r9 = r5.A0B
            X.3wy r7 = r2.A09
            r6 = r55
            r7.A0n = r6
            r7.A0o = r9
        L_0x005a:
            r19 = 0
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r6 = r0.A09
            r54 = r6
            X.4SV r17 = new X.4SV
            r7 = r17
            r7.<init>(r6)
            X.4PF r6 = r0.A0J
            r53 = r6
            X.3p9 r23 = X.C252463p9.LIVE_VIDEO
            X.28X r6 = r4.A01
            X.28m r4 = r0.A01
            java.util.concurrent.atomic.AtomicBoolean r7 = r0.A0D
            r34 = r7
            java.util.concurrent.atomic.AtomicBoolean r7 = r0.A0E
            r31 = r7
            X.Xyz r44 = new X.Xyz
            r20 = r44
            r21 = r4
            r22 = r6
            r24 = r3
            r25 = r53
            r26 = r1
            r27 = r34
            r28 = r7
            r29 = r32
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.3p9 r21 = X.C252463p9.LIVE_AUDIO
            X.Xyz r45 = new X.Xyz
            r18 = r45
            r20 = r6
            r22 = r3
            r23 = r53
            r24 = r1
            r25 = r34
            r26 = r7
            r27 = r32
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.3p9 r23 = X.C252463p9.DASH_UNKNOWN
            X.Xyz r43 = new X.Xyz
            r20 = r43
            r21 = r4
            r22 = r6
            r24 = r3
            r25 = r53
            r26 = r1
            r27 = r34
            r28 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r4 = r3.A07
            r6 = 1
            X.4SY r14 = new X.4SY
            r14.<init>(r4, r6)
            r10 = r59
            if (r59 == 0) goto L_0x00cc
            r10.A00 = r6
        L_0x00cc:
            X.5fL r4 = r0.BOh(r3)
            X.4Qh r12 = r0.BD1(r4, r3)
            java.lang.String r4 = r5.A0B
            r52 = r4
            X.28e r4 = r3.A04
            X.3uT r7 = r5.A06
            r51 = r7
            boolean r7 = r3.A0A
            r50 = r7
            X.3wn r23 = new X.3wn
            r24 = r4
            r25 = r51
            r26 = r56
            r27 = r55
            r28 = r52
            r29 = r7
            r23.<init>(r24, r25, r26, r27, r28, r29)
            java.lang.String r4 = r3.A06
            r25 = r4
            X.28N r4 = X.28N.A00
            java.lang.String r27 = r4.A01()
            X.3p9 r21 = X.C252463p9.LIVE_MANIFEST
            if (r65 == 0) goto L_0x0107
            boolean r4 = r1.A0U
            r37 = 1
            if (r4 != 0) goto L_0x010b
        L_0x0107:
            r37 = 0
            if (r65 == 0) goto L_0x0111
        L_0x010b:
            boolean r4 = r1.A0V
            r38 = 1
            if (r4 != 0) goto L_0x0115
        L_0x0111:
            r38 = 0
            if (r65 == 0) goto L_0x011b
        L_0x0115:
            boolean r4 = r1.A0W
            r39 = 1
            if (r4 != 0) goto L_0x011f
        L_0x011b:
            r39 = 0
            if (r65 == 0) goto L_0x0125
        L_0x011f:
            boolean r4 = r1.A0R
            r40 = 1
            if (r4 != 0) goto L_0x0127
        L_0x0125:
            r40 = 0
        L_0x0127:
            boolean r15 = r11.A2U
            if (r65 == 0) goto L_0x0349
            java.util.List r4 = r1.A0Q
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0349
            X.3wG r4 = X.C21055XCg.A07(r1)
            X.3wB r4 = r4.A02
            java.lang.String r9 = r4.A0R
        L_0x013b:
            java.lang.String r13 = r3.A07
            X.3wx r4 = r0.A02
            r49 = r4
            java.lang.String r16 = ""
            X.3wy r7 = new X.3wy
            r24 = r19
            r28 = r9
            r29 = r13
            r30 = r34
            r34 = r8
            r35 = r8
            r36 = r8
            r41 = r8
            r42 = r15
            r18 = r7
            r20 = r54
            r22 = r4
            r26 = r16
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            boolean r4 = r11.A3B
            r7.A16 = r4
            X.Xz9 r4 = new X.Xz9
            r4.<init>(r7)
            r7 = r62
            r7.A01 = r4
            boolean r7 = r12.A0V
            r39 = r58
            r46 = r66
            if (r7 == 0) goto L_0x0329
            r47 = -1
            X.27k r7 = r0.A0I
            X.27s r15 = r0.A0G
            X.4SZ r35 = new X.4SZ
            r35.<init>()
            X.4Sa r34 = new X.4Sa
            r36 = r17
            r37 = r15
            r38 = r49
            r40 = r10
            r41 = r14
            r42 = r7
            r48 = r6
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
        L_0x0195:
            X.28e r7 = r3.A04
            X.3wn r10 = new X.3wn
            r20 = r10
            r21 = r7
            r22 = r51
            r23 = r56
            r24 = r55
            r25 = r52
            r26 = r50
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r7 = r53
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r7 = r7.A05
            java.lang.String r7 = r7.A18
            X.Xyy r9 = new X.Xyy
            r9.<init>(r10, r4, r7)
            com.google.android.exoplayer2.source.dash.DashMediaSource$Factory r7 = new com.google.android.exoplayer2.source.dash.DashMediaSource$Factory
            r25 = r63
            r20 = r7
            r21 = r17
            r22 = r49
            r23 = r12
            r24 = r14
            r26 = r34
            r27 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            if (r65 == 0) goto L_0x0322
            java.util.List r4 = r1.A0Q
            int r4 = r4.size()
            if (r4 >= r6) goto L_0x02ad
            r4 = r19
        L_0x01d6:
            java.util.List r10 = r4.A01
            int r25 = r10.size()
        L_0x01dc:
            java.util.List r9 = r4.A00
            if (r9 != 0) goto L_0x02a7
            r26 = 0
        L_0x01e2:
            if (r25 <= 0) goto L_0x0286
            boolean r9 = r1.A0W
            if (r9 == 0) goto L_0x01f9
            java.lang.Object r12 = r10.get(r8)
            X.3wG r12 = (X.C256733wG) r12
            boolean r9 = r12 instanceof X.AnonymousClass4XD
            if (r9 == 0) goto L_0x01f9
            X.4XD r12 = (X.AnonymousClass4XD) r12
            r9 = -1
            r12.BrO(r9)
        L_0x01f9:
            long r9 = A00(r3, r4, r0)
            int r13 = r11.A0M
            X.4Sr r12 = new X.4Sr
            r12.<init>(r13)
            r7.A04 = r12
            r7.A00 = r9
            android.content.Context r12 = r0.A06
            X.3vc r10 = new X.3vc
            r9 = r56
            r10.<init>(r12, r11, r9, r6)
            r7.A05 = r10
            r7.A01 = r15
            android.net.Uri r9 = r5.A05
            X.4Ss r5 = X.C265144Ss.$redex_init_class
            X.4RF r6 = new X.4RF
            r6.<init>()
            r6.A00 = r9
            java.lang.String r5 = "DashMediaSource"
            r6.A07 = r5
            java.lang.String r5 = "application/dash+xml"
            r6.A08 = r5
            X.4RL r33 = r6.A00()
            X.4SX r5 = r7.A0B
            r21 = r5
            X.3ve r5 = r7.A05
            r18 = r5
            X.4Sb r5 = r7.A0A
            r17 = r5
            X.4So r15 = r7.A03
            X.4Sp r14 = r7.A02
            X.4Sm r13 = r7.A04
            long r5 = r7.A00
            X.4Qh r12 = r7.A08
            X.4SV r11 = r7.A06
            X.27s r10 = r7.A01
            X.3wx r9 = r7.A07
            X.4SY r7 = r7.A09
            X.4Ss r20 = new X.4Ss
            r27 = r20
            r28 = r11
            r29 = r10
            r30 = r9
            r31 = r12
            r32 = r7
            r34 = r14
            r35 = r15
            r36 = r17
            r37 = r19
            r38 = r21
            r39 = r13
            r40 = r18
            r41 = r5
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            boolean r15 = X.DbW.A1a(r1)
            X.Xyl r5 = new X.Xyl
            r11 = r61
            r9 = r5
            r10 = r3
            r12 = r4
            r13 = r0
            r14 = r20
            r9.<init>(r10, r11, r12, r13, r14, r15)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0G
            r0.set(r8)
            java.lang.Object r6 = r2.A0E
            monitor-enter(r6)
            goto L_0x040c
        L_0x0286:
            if (r25 != 0) goto L_0x01f9
            java.lang.Object[] r12 = new java.lang.Object[]{r56}
            java.lang.String r10 = "HeroExo2LiveInitHelper"
            java.lang.String r9 = "No valid video representation found for live video %s"
            X.27B.A02(r10, r9, r12)
            java.lang.String r14 = "MANIFEST"
            java.lang.String r13 = "NO_VALID_VIDEO_REPRESENTATION"
            java.lang.String r12 = "No valid video representation found for live video"
            X.4Yy r10 = new X.4Yy
            r9 = r56
            r10.<init>(r9, r14, r13, r12)
            r9 = r54
            r9.callback(r10)
            goto L_0x01f9
        L_0x02a7:
            int r26 = r9.size()
            goto L_0x01e2
        L_0x02ad:
            X.3wM r4 = r1.A02(r8)
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.List r4 = r4.A03
            java.util.Iterator r14 = r4.iterator()
        L_0x02bf:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x02fa
            java.lang.Object r13 = r14.next()
            X.3wK r13 = (X.C256773wK) r13
            int r12 = r13.A01
            if (r12 == r6) goto L_0x02e6
            r4 = 2
            if (r12 != r4) goto L_0x02bf
            java.util.List r4 = r13.A07
            java.util.Iterator r12 = r4.iterator()
        L_0x02d8:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x02bf
            java.lang.Object r4 = r12.next()
            r10.add(r4)
            goto L_0x02d8
        L_0x02e6:
            java.util.List r4 = r13.A07
            java.util.Iterator r12 = r4.iterator()
        L_0x02ec:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x02bf
            java.lang.Object r4 = r12.next()
            r9.add(r4)
            goto L_0x02ec
        L_0x02fa:
            r10.isEmpty()
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L_0x0305
            r10 = r19
        L_0x0305:
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x030d
            r9 = r19
        L_0x030d:
            if (r10 != 0) goto L_0x0315
            if (r9 != 0) goto L_0x0315
            r4 = r19
            goto L_0x01d6
        L_0x0315:
            X.3wV r4 = new X.3wV
            r4.<init>(r10, r9)
            java.util.List r10 = r4.A01
            if (r10 != 0) goto L_0x01d6
            r25 = 0
            goto L_0x01dc
        L_0x0322:
            r4 = 0
            r25 = 0
            r26 = 0
            goto L_0x01f9
        L_0x0329:
            r47 = -1
            X.27k r7 = r0.A0I
            X.27s r15 = r0.A0G
            X.4SZ r35 = new X.4SZ
            r35.<init>()
            X.5JH r34 = new X.5JH
            r36 = r17
            r37 = r15
            r38 = r49
            r40 = r10
            r41 = r14
            r42 = r7
            r48 = r6
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            goto L_0x0195
        L_0x0349:
            r9 = 0
            goto L_0x013b
        L_0x034c:
            X.3w6 r10 = r2.A01
            if (r10 == 0) goto L_0x0366
            if (r65 == 0) goto L_0x035a
            long r8 = r1.A03
            long r6 = r10.A03
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0366
        L_0x035a:
            java.lang.Object[] r7 = new java.lang.Object[]{r56}
            java.lang.String r6 = "HeroExo2LiveInitHelper"
            java.lang.String r2 = "Creating new fetcher with existing manifest from prev fetcher: %s"
            X.27B.A01(r6, r2, r7)
            goto L_0x0369
        L_0x0366:
            r10 = r1
            if (r65 == 0) goto L_0x0376
        L_0x0369:
            X.28m r6 = r0.A01
            android.net.Uri r2 = r5.A05
            if (r2 == 0) goto L_0x0372
            r2.getHost()
        L_0x0372:
            r2 = 4
            X.0qQ.A0B(r6, r2)
        L_0x0376:
            r8 = 0
            android.content.Context r2 = r0.A06
            r23 = r2
            boolean r7 = r11.A2r
            X.Xyh r6 = new X.Xyh
            r6.<init>(r3, r0)
            X.Xyg r2 = new X.Xyg
            r2.<init>(r3, r0)
            r16 = r64
            r19 = r8
            r20 = r8
            r13 = r23
            r14 = r2
            r15 = r6
            r17 = r10
            r18 = r7
            X.3wV r6 = X.C256373vf.A01(r13, r14, r15, r16, r17, r18, r19, r20)
            android.net.Uri r2 = r5.A05
            r22 = r2
            android.os.Handler r2 = r0.A00
            r21 = r2
            java.lang.String r2 = r5.A0A
            r55 = r2
            java.lang.String r13 = r5.A0B
            X.28e r9 = r3.A04
            X.3uT r7 = r5.A06
            boolean r2 = r3.A0A
            X.3wn r41 = new X.3wn
            r14 = r41
            r15 = r9
            r16 = r7
            r17 = r56
            r18 = r55
            r19 = r13
            r20 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.28Y r2 = r4.A02
            r17 = r2
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r2 = r0.A09
            r16 = r2
            X.28X r15 = r4.A01
            java.util.concurrent.atomic.AtomicBoolean r14 = r0.A0D
            java.util.concurrent.atomic.AtomicBoolean r13 = r0.A0E
            long r6 = A00(r3, r6, r0)
            int r9 = (int) r6
            X.27J r6 = r0.A07
            java.lang.String r45 = ""
            X.5fO r2 = new X.5fO
            r34 = r2
            r35 = r23
            r36 = r22
            r37 = r21
            r38 = r15
            r39 = r6
            r40 = r16
            r42 = r17
            r43 = r11
            r44 = r10
            r46 = r12
            r47 = r14
            r48 = r13
            r49 = r9
            r50 = r32
            r52 = r8
            r53 = r8
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r52, r53)
            java.lang.Object r7 = r24.get()
            android.util.LruCache r7 = (android.util.LruCache) r7
            r6 = r56
            r7.put(r6, r2)
            r2.A0L = r8
            goto L_0x005a
        L_0x040c:
            java.lang.Integer r3 = r2.A0K     // Catch:{ all -> 0x047a }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x047a }
            if (r3 != r0) goto L_0x0416
            r2.A00 = r5     // Catch:{ all -> 0x047a }
            monitor-exit(r6)     // Catch:{ all -> 0x047a }
            goto L_0x0422
        L_0x0416:
            monitor-exit(r6)     // Catch:{ all -> 0x047a }
            java.lang.Integer r3 = r2.A0K
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r3 != r0) goto L_0x0474
            X.3w6 r0 = r2.A01
            r5.Dks(r0)
        L_0x0422:
            java.lang.Integer r21 = X.AnonymousClass05K.A0C
            if (r65 != 0) goto L_0x0463
            r11 = 0
            r9 = 0
            r7 = 0
            r5 = 0
            r35 = 0
            r14 = 0
            r13 = 0
        L_0x0432:
            java.lang.String r22 = X.AnonymousClass4PG.A02(r4)
            if (r65 != 0) goto L_0x0458
            r15 = r16
            r4 = 0
            r3 = 1
        L_0x043c:
            X.4T2 r18 = new X.4T2
            r19 = r2
            r23 = r15
            r24 = r16
            r27 = r11
            r29 = r9
            r31 = r7
            r33 = r5
            r37 = r14
            r38 = r13
            r39 = r4
            r40 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)
            return r18
        L_0x0458:
            java.lang.String r15 = r1.A0K
            boolean r4 = r1.A0W
            boolean r3 = r1.A0R
            java.lang.String r0 = r1.A0O
            r16 = r0
            goto L_0x043c
        L_0x0463:
            long r11 = r1.A0B
            long r9 = r1.A07
            long r7 = r1.A05
            long r5 = r1.A08
            long r35 = android.os.SystemClock.elapsedRealtime()
            boolean r14 = r1.A0S
            boolean r13 = r1.A0V
            goto L_0x0432
        L_0x0474:
            r2.A00 = r5
            r2.A02(r8)
            goto L_0x0422
        L_0x047a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x047a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22274Xyj.BQp(X.4Oq, X.4Oi, X.4OI, X.4SU, X.4P8, X.4Sp, X.3wP, X.3w6, X.3m7, long, boolean):X.4T2");
    }
}
