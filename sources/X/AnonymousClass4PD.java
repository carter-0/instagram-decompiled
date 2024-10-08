package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.video.heroplayer.ipc.SubtitleConfiguration;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.android.exoplayer2.util.Util;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4PD  reason: invalid class name */
public final class AnonymousClass4PD implements AnonymousClass4PE {
    public 28m A00;
    public C250853mA A01;
    public 28w A02;
    public C696927h A03;
    public final 27s A04;
    public final C257163wx A05;
    public final 27k A06;
    public final ServiceEventCallbackImpl A07;
    public final AnonymousClass4PF A08;
    public final HeroPlayerSetting A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;
    public final Context A0C;
    public final C697127t A0D;
    public final 29t A0E;
    public final AnonymousClass27Y A0F;
    public final AnonymousClass27W A0G;
    public final Map A0H;

    private C265164Su A01(AnonymousClass4OI r12, C265164Su r13, long j) {
        String str;
        AnonymousClass4OI r7 = r12;
        C255653uU r1 = r12.A0K;
        List list = r1.A0H;
        int i = 0;
        long j2 = j;
        if (!this.A09.A2S || list == null || list.isEmpty()) {
            Uri uri = r1.A04;
            if (uri != null) {
                return new C295965pC(r13, A02(uri, r7, (String) null, j2));
            }
            return r13;
        }
        C265164Su[] r2 = new C265164Su[(list.size() + 1)];
        while (true) {
            r2[i] = r13;
            if (i >= list.size()) {
                return new C295965pC(r2);
            }
            SubtitleConfiguration subtitleConfiguration = (SubtitleConfiguration) list.get(i);
            i++;
            Uri uri2 = subtitleConfiguration.A00;
            if (subtitleConfiguration.A01 != null) {
                str = Util.A0C(subtitleConfiguration.A01);
            } else {
                str = null;
            }
            r13 = A02(uri2, r7, str, j2);
        }
    }

    public final C290455fL BOh(AnonymousClass4OI r2) {
        return null;
    }

    public static final 28i A00(AnonymousClass4OI r4) {
        28i r3 = new 28i();
        C255653uU r2 = r4.A0K;
        boolean z = true;
        if (!r2.A0M) {
            z = false;
        }
        r3.A06(z);
        String str = r4.A06;
        synchronized (r3) {
            r3.A00 = str;
        }
        synchronized (r3) {
        }
        r3.A05(r2.A0G);
        boolean z2 = r2.A0N;
        synchronized (r3) {
            r3.A04 = z2;
        }
        r3.A04(r2.A0A);
        synchronized (r3) {
        }
        boolean z3 = r4.A0C;
        synchronized (r3) {
            r3.A06 = z3;
        }
        boolean z4 = r4.A0A;
        synchronized (r3) {
            r3.A05 = z4;
        }
        Uri uri = r2.A05;
        if (uri != null) {
            r3.A03(uri.getHost());
        }
        synchronized (r3) {
        }
        return r3;
    }

    private C295945pA A02(Uri uri, AnonymousClass4OI r19, String str, long j) {
        long j2;
        C256653w8 r1 = new C256653w8();
        r1.A0R = "0";
        r1.A0U = "application/x-subrip";
        r1.A0F = 2;
        r1.A0T = str;
        C256683wB r12 = new C256683wB(r1);
        AnonymousClass4OI r5 = r19;
        AnonymousClass4SW r2 = new AnonymousClass4SW((28m) null, C252463p9.DASH_TEXT, r5, this.A08, (C256633w6) null, this.A0B, this.A0A, j);
        C250813m6 r0 = r5.A03;
        if (r0 != null) {
            r2.A00 = r0;
        }
        C265074Sl r14 = new C265074Sl(-1);
        if (this.A09.A3I) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = -2;
        }
        return new C295945pA(uri, r12, r2, r14, j2);
    }

    public final 28w AdZ(C250853mA r18, AnonymousClass4OI r19) {
        28g r9;
        HeroPlayerSetting heroPlayerSetting = this.A09;
        1xk r12 = heroPlayerSetting.A0w;
        boolean z = r12.A0t;
        if (z || r12.A0r || r12.A0v) {
            AnonymousClass4OI r7 = r19;
            28i A002 = A00(r7);
            27s r13 = this.A04;
            AbrContextAwareConfiguration abrContextAwareConfiguration = new AbrContextAwareConfiguration(r12, r13, A002, false, false);
            if (abrContextAwareConfiguration.getShouldEnableAudioIbrCache()) {
                29t r2 = this.A0E;
                r9 = new 28g(new C264534Qg(r2), r2, r7.A04, heroPlayerSetting);
            } else {
                r9 = null;
            }
            28m r72 = new 28m(abrContextAwareConfiguration, this.A0G);
            if (r12.A0v || z) {
                return new 28w(this.A0C, r72, A002, r9, this.A02, abrContextAwareConfiguration, r18, r13);
            }
        }
        return null;
    }

    public final 28m Af6() {
        return this.A00;
    }

    public final 28w Av8() {
        return this.A02;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.1xr, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Object, X.1xp] */
    public final C264544Qh BD1(C290455fL r47, AnonymousClass4OI r48) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ? obj = new Object();
        HeroPlayerSetting heroPlayerSetting = this.A09;
        1xn r15 = 1xn.A00;
        ? obj2 = new Object();
        boolean z6 = heroPlayerSetting.A2I;
        int i = heroPlayerSetting.A0H;
        boolean z7 = heroPlayerSetting.A1S;
        1yD r0 = heroPlayerSetting.A10;
        boolean z8 = r0.A0h;
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
        return new C264544Qh(obj, obj2, r15, -1, -1, 0, -1, 0, 0, 0, 0, 0, -1, i, -1000, false, false, true, false, false, false, z6, z7, z8, z, z2, z3, z4, z5, heroPlayerSetting.A1o, heroPlayerSetting.A3K, r0.A0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (java.lang.Integer.parseInt((java.lang.String) r3.get("dash.use_play_when_ready_for_load_control")) == 0) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4QZ BNX(X.AnonymousClass4OI r48, X.1xV r49, java.util.concurrent.atomic.AtomicBoolean r50, java.util.concurrent.atomic.AtomicBoolean r51, boolean r52) {
        /*
            r47 = this;
            r6 = r48
            X.3uU r7 = r6.A0K
            r18 = 0
            r27 = -1
            r30 = -1
            r1 = r49
            int r0 = r1.A00
            r19 = r0
            int r0 = r1.A01
            r17 = r0
            int r9 = r6.A02
            r2 = r47
            if (r9 > 0) goto L_0x0032
            java.util.Map r3 = r2.A0H
            java.lang.String r1 = "dash.use_play_when_ready_for_load_control"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            r32 = 1
            if (r0 != 0) goto L_0x0034
        L_0x0032:
            r32 = 0
        L_0x0034:
            X.27s r15 = r2.A04
            X.27t r14 = r2.A0D
            X.27k r8 = r2.A06
            X.27Y r13 = r2.A0F
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r5 = r2.A09
            X.1xZ r12 = r5.A11
            boolean r11 = r6.A0T
            int r4 = r6.A0H
            if (r4 >= 0) goto L_0x0048
            r4 = 1000(0x3e8, float:1.401E-42)
        L_0x0048:
            boolean r0 = r5.A1L
            if (r0 == 0) goto L_0x011d
            int r3 = r6.A0G
            if (r3 < 0) goto L_0x011d
        L_0x0050:
            int r10 = r5.A0B
            int r2 = r5.A0A
            boolean r1 = r5.A3a
            boolean r0 = r5.A3N
            r43 = 0
            X.4QT r33 = new X.4QT
            r23 = r50
            r24 = r51
            r34 = r8
            r35 = r12
            r36 = r23
            r37 = r24
            r38 = r4
            r39 = r3
            r40 = r9
            r41 = r10
            r42 = r2
            r44 = r11
            r45 = r1
            r46 = r0
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            android.net.Uri r0 = r7.A05
            boolean r0 = X.AnonymousClass4QU.A00(r0)
            if (r0 != 0) goto L_0x0094
            X.3uR r2 = r7.A07
            X.3uR r1 = X.C255623uR.DASH_LIVE
            r0 = 0
            if (r2 == r1) goto L_0x008b
            r0 = 1
        L_0x008b:
            X.C256703wD.A03(r0)
            java.lang.String r0 = r7.A09
            if (r0 == 0) goto L_0x0094
            r18 = r33
        L_0x0094:
            X.4QV r22 = new X.4QV
            r22.<init>()
            X.3uR r1 = r7.A07
            X.3uR r0 = X.C255623uR.PROGRESSIVE
            if (r1 != r0) goto L_0x00ab
            boolean r0 = r5.A3Z
            if (r0 == 0) goto L_0x00a5
            r18 = r33
        L_0x00a5:
            boolean r0 = r5.A3S
            if (r0 != 0) goto L_0x00ab
            r27 = 2097152(0x200000, float:2.938736E-39)
        L_0x00ab:
            int r7 = r5.A0g
            int r4 = r5.A06
            java.util.concurrent.atomic.AtomicReference r0 = X.2CY.A0G
            java.lang.Object r2 = r0.get()
            java.util.concurrent.atomic.AtomicReference r0 = X.2CY.A0F
            java.lang.Object r1 = r0.get()
            boolean r0 = r5.A2G
            if (r0 == 0) goto L_0x00cd
            X.2Ce r0 = X.2Ce.A06
            if (r2 == r0) goto L_0x00c5
            if (r1 != r0) goto L_0x00cd
        L_0x00c5:
            double r0 = (double) r7
            double r2 = r5.A04
            double r0 = r0 * r2
            int r7 = (int) r0
            double r0 = (double) r4
            double r0 = r0 * r2
            int r4 = (int) r0
        L_0x00cd:
            boolean r1 = r5.A3Q
            java.util.List r2 = r6.A0M
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00f5
            X.2Cz r3 = X.2Cz.A0E
            java.util.Iterator r5 = r2.iterator()
        L_0x00dd:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r2 = r5.next()
            X.2D2 r2 = (X.2D2) r2
            X.2Cz r0 = r2.A01
            if (r0 != r3) goto L_0x00dd
            int r0 = X.2CY.A01(r2)
            if (r0 <= 0) goto L_0x00f5
            r30 = r0
        L_0x00f5:
            r0 = 1
            if (r18 != 0) goto L_0x00fd
            X.4QT r18 = new X.4QT
            r18.<init>()
        L_0x00fd:
            if (r8 != 0) goto L_0x0100
            r0 = 0
        L_0x0100:
            X.C256703wD.A03(r0)
            X.4QY r16 = new X.4QY
            r33 = r52
            r28 = r7
            r29 = r4
            r31 = r1
            r21 = r8
            r25 = r19
            r26 = r17
            r17 = r14
            r19 = r13
            r20 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r16
        L_0x011d:
            r3 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PD.BNX(X.4OI, X.1xV, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, boolean):X.4QZ");
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [X.4Su] */
    /* JADX WARNING: type inference failed for: r28v0, types: [X.4SZ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v3, types: [X.4Su] */
    /* JADX WARNING: type inference failed for: r28v2, types: [X.4SZ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0300, code lost:
        if (r6 != null) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01be, code lost:
        if (r1.A0H != null) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0269, code lost:
        if (r8.isEmpty() == false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x028a, code lost:
        if (r11 == false) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0292, code lost:
        if (r1.A0H != null) goto L_0x0294;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4T2 BQp(X.C264114Oq r48, X.C264034Oi r49, X.AnonymousClass4OI r50, X.AnonymousClass4SU r51, X.AnonymousClass4P8 r52, X.C265114Sp r53, X.C256823wP r54, X.C256633w6 r55, X.C250823m7 r56, long r57, boolean r59) {
        /*
            r47 = this;
            r5 = r50
            r42 = r53
            X.3uU r1 = r5.A0K
            android.net.Uri r0 = r1.A05
            boolean r2 = X.AnonymousClass4QU.A00(r0)
            java.lang.String r17 = "HeroExo2VodInitHelper"
            r14 = 0
            r0 = r47
            r45 = r57
            if (r2 != 0) goto L_0x00fe
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r15 = r0.A09
            boolean r2 = r1.A04()
            if (r2 == 0) goto L_0x0027
            java.lang.String r2 = "system_decoder"
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x00fe
        L_0x0027:
            boolean r2 = r1.A02()
            if (r2 == 0) goto L_0x002f
            if (r59 != 0) goto L_0x00fe
        L_0x002f:
            X.3uR r4 = r1.A07
            X.3uR r3 = X.C255623uR.DASH_LIVE
            r2 = 0
            if (r4 == r3) goto L_0x0037
            r2 = 1
        L_0x0037:
            X.C256703wD.A03(r2)
            java.lang.String r2 = r1.A09
            if (r2 == 0) goto L_0x00fe
            r16 = 0
            r4 = r55
            if (r55 == 0) goto L_0x00fe
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r2 = r0.A07
            java.lang.String r3 = r1.A0G
            X.4SV r13 = new X.4SV
            r13.<init>(r2)
            X.4PF r12 = r0.A08
            X.3p9 r20 = X.C252463p9.DASH_VIDEO
            X.28m r6 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r9 = r0.A0B
            java.util.concurrent.atomic.AtomicBoolean r7 = r0.A0A
            X.4SW r11 = new X.4SW
            r18 = r11
            r19 = r6
            r21 = r5
            r22 = r12
            r23 = r4
            r24 = r9
            r25 = r7
            r26 = r45
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            X.3m6 r6 = r5.A03
            if (r6 == 0) goto L_0x0072
            r11.A00 = r6
        L_0x0072:
            X.3p9 r20 = X.C252463p9.DASH_AUDIO
            X.4SW r10 = new X.4SW
            r18 = r10
            r19 = r16
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            if (r6 == 0) goto L_0x0081
            r10.A00 = r6
        L_0x0081:
            X.3p9 r20 = X.C252463p9.DASH_UNKNOWN
            X.4SW r8 = new X.4SW
            r18 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            if (r6 == 0) goto L_0x008e
            r8.A00 = r6
        L_0x008e:
            X.27k r6 = r0.A06
            r19 = r6
            java.lang.String r6 = r5.A07
            r26 = 0
            X.4SY r9 = new X.4SY
            r9.<init>(r6, r14)
            r6 = r16
            X.4Qh r6 = r0.BD1(r6, r5)
            boolean r12 = r6.A0V
            r7 = 1
            if (r12 == 0) goto L_0x037f
            X.27s r12 = r0.A04
            r18 = r12
            X.3wx r12 = r0.A05
            X.4SZ r28 = new X.4SZ
            r28.<init>()
            X.4Sa r27 = new X.4Sa
            r29 = r13
            r30 = r18
            r31 = r12
            r32 = r16
            r33 = r16
            r34 = r9
            r35 = r19
            r36 = r8
            r37 = r11
            r38 = r10
            r39 = r16
            r40 = r14
            r41 = r14
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            com.google.android.exoplayer2.source.dash.DashMediaSource$Factory r8 = new com.google.android.exoplayer2.source.dash.DashMediaSource$Factory
            r37 = r8
            r38 = r13
            r39 = r12
            r40 = r6
            r41 = r9
            r43 = r27
            r44 = r16
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)
        L_0x00e3:
            int r9 = r15.A0h
            X.4Sr r6 = new X.4Sr
            r6.<init>(r9)
            r8.A04 = r6
            boolean r6 = r4.A0R
            if (r6 == 0) goto L_0x01ef
            java.lang.String r8 = "MANIFEST"
            java.lang.String r7 = "DYNAMIC_MANIFEST_FOR_VOD"
            java.lang.String r6 = "Trying to play VOD with dynamic manifest"
            X.4Yy r4 = new X.4Yy
            r4.<init>(r3, r8, r7, r6)
            r2.callback(r4)
        L_0x00fe:
            android.net.Uri r4 = r1.A05
            r6 = 0
            if (r4 != 0) goto L_0x0127
            X.3uR r3 = r1.A07
            X.3uR r2 = X.C255623uR.BYTEARRAY
            if (r3 == r2) goto L_0x0127
        L_0x0109:
            boolean r2 = r1.A02()
            if (r2 == 0) goto L_0x0126
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.String r4 = "AV1 decoding falls back to progressive"
            r2 = r17
            X.27B.A01(r2, r4, r3)
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r3 = r0.A07
            java.lang.String r2 = r1.A0G
            java.lang.String r1 = "AV1_INSTANTIATION"
            X.4Yy r0 = new X.4Yy
            r0.<init>(r2, r1, r1, r4)
            r3.callback(r0)
        L_0x0126:
            return r6
        L_0x0127:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = r0.A09
            boolean r2 = r2.A2D
            if (r2 == 0) goto L_0x0167
            if (r4 == 0) goto L_0x0150
            java.lang.String r2 = r4.getLastPathSegment()
            if (r2 == 0) goto L_0x0150
            android.net.Uri r2 = r1.A05
            java.lang.String r3 = r2.getLastPathSegment()
            java.lang.String r2 = ".mp3"
            boolean r2 = r3.endsWith(r2)
            if (r2 == 0) goto L_0x0150
        L_0x0143:
            X.WMH r4 = new X.WMH
            r4.<init>(r5, r0)
        L_0x0148:
            X.3uR r3 = r1.A07
            X.3uR r2 = X.C255623uR.BYTEARRAY
            if (r3 != r2) goto L_0x016d
            goto L_0x03be
        L_0x0150:
            java.util.List r2 = r1.A0I
            java.lang.String r3 = "undefined"
            if (r2 == 0) goto L_0x015c
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0143
        L_0x015c:
            java.lang.String r2 = r1.A0F
            if (r2 == 0) goto L_0x0167
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0167
            goto L_0x0143
        L_0x0167:
            X.TsR r4 = new X.TsR
            r4.<init>(r0)
            goto L_0x0148
        L_0x016d:
            X.4PF r7 = r0.A08
            X.3p9 r20 = X.C252463p9.PROGRESSIVE
            java.util.concurrent.atomic.AtomicBoolean r3 = r0.A0B
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.A0A
            X.4SW r11 = new X.4SW
            r18 = r11
            r19 = r6
            r21 = r5
            r22 = r7
            r23 = r6
            r24 = r3
            r25 = r2
            r26 = r45
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            X.3m6 r2 = r5.A03
            if (r2 == 0) goto L_0x0190
            r11.A00 = r2
        L_0x0190:
            android.net.Uri r2 = r1.A05
            if (r2 == 0) goto L_0x0109
            X.4RF r3 = new X.4RF
            r3.<init>()
            android.net.Uri r2 = r1.A05
            r3.A00 = r2
            X.4RL r8 = r3.A00()
            X.XEi r10 = new X.XEi
            r10.<init>(r4)
            if (r53 != 0) goto L_0x01aa
            X.4Sp r42 = X.C265114Sp.A00
        L_0x01aa:
            r2 = 3
            X.4Sl r12 = new X.4Sl
            r12.<init>(r2)
            X.XEY r4 = new X.XEY
            r7 = r4
            r9 = r42
            r7.<init>(r8, r9, r10, r11, r12)
            android.net.Uri r2 = r1.A04
            if (r2 != 0) goto L_0x01c0
            java.util.List r2 = r1.A0H
            if (r2 == 0) goto L_0x01c6
        L_0x01c0:
            r2 = r45
            X.4Su r4 = r0.A01(r5, r4, r2)
        L_0x01c6:
            java.lang.Integer r21 = X.AnonymousClass05K.A0N
            r27 = 0
            java.lang.String r22 = ""
            X.4T2 r18 = new X.4T2
            r23 = r22
            r24 = r22
            r25 = r14
            r26 = r14
            r29 = r27
            r31 = r27
            r33 = r27
            r35 = r27
            r37 = r14
            r38 = r14
            r39 = r14
            r40 = r14
            r20 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)
            r6 = r18
            goto L_0x0109
        L_0x01ef:
            X.4RF r9 = new X.4RF
            r9.<init>()
            android.net.Uri r11 = android.net.Uri.EMPTY
            r9.A00 = r11
            java.lang.String r6 = "DashMediaSource"
            r9.A07 = r6
            java.lang.String r10 = "application/dash+xml"
            r9.A08 = r10
            X.4RL r6 = r9.A00()
            X.4RF r9 = new X.4RF
            r9.<init>(r6)
            r9.A08 = r10
            X.4RK r6 = r6.A03
            if (r6 != 0) goto L_0x0211
            r9.A00 = r11
        L_0x0211:
            X.4RL r33 = r9.A00()
            X.4Sb r6 = r8.A0A
            r21 = r6
            X.4So r6 = r8.A03
            r20 = r6
            X.4Sp r6 = r8.A02
            r19 = r6
            X.4Sm r6 = r8.A04
            r18 = r6
            long r9 = r8.A00
            X.4Qh r15 = r8.A08
            X.4SV r12 = r8.A06
            X.27s r11 = r8.A01
            X.3wx r6 = r8.A07
            X.4SY r8 = r8.A09
            X.4Ss r13 = new X.4Ss
            r27 = r13
            r28 = r12
            r29 = r11
            r30 = r6
            r31 = r15
            r32 = r8
            r34 = r19
            r35 = r20
            r36 = r21
            r37 = r4
            r38 = r16
            r39 = r18
            r40 = r16
            r41 = r9
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            java.util.List r6 = r4.A0Q
            int r6 = r6.size()
            if (r6 >= r7) goto L_0x030e
            r6 = r16
        L_0x025c:
            r15 = 1
            if (r6 == 0) goto L_0x030b
            java.util.List r8 = r6.A01
            if (r8 == 0) goto L_0x030b
            r12 = 0
            boolean r8 = r8.isEmpty()
            r11 = 1
            if (r8 != 0) goto L_0x026c
        L_0x026b:
            r11 = 0
        L_0x026c:
            int r8 = r5.A00
            java.lang.Integer r21 = X.AnonymousClass05K.A01
            if (r8 == r7) goto L_0x028c
            if (r12 != 0) goto L_0x0305
            if (r11 == 0) goto L_0x0303
            java.lang.String r10 = "all dash representation filtered out"
            X.4Yz r7 = X.C266464Yz.A03
        L_0x027a:
            java.lang.String r9 = "MANIFEST"
            java.lang.String r8 = r7.name()
            X.4Yy r7 = new X.4Yy
            r7.<init>(r3, r9, r8, r10)
            r2.callback(r7)
            if (r12 != 0) goto L_0x028c
            if (r11 == 0) goto L_0x0303
        L_0x028c:
            android.net.Uri r2 = r1.A04
            if (r2 != 0) goto L_0x0294
            java.util.List r2 = r1.A0H
            if (r2 == 0) goto L_0x029a
        L_0x0294:
            r2 = r45
            X.4Su r13 = r0.A01(r5, r13, r2)
        L_0x029a:
            if (r15 != 0) goto L_0x02fe
            if (r6 == 0) goto L_0x02fe
            java.util.List r0 = r6.A01
            if (r0 == 0) goto L_0x02fe
            int r25 = r0.size()
        L_0x02a6:
            java.util.List r0 = r6.A00
            if (r0 == 0) goto L_0x02ae
            int r26 = r0.size()
        L_0x02ae:
            boolean r0 = r4.A0U
            r11 = 0
            if (r0 == 0) goto L_0x02f7
            long r9 = r4.A0B
            long r7 = r4.A07
            long r2 = r4.A05
            long r11 = r4.A08
        L_0x02bc:
            r35 = 0
            boolean r15 = r4.A0V
            java.lang.String r22 = X.AnonymousClass4PG.A02(r6)
            java.lang.String r5 = r4.A0K
            java.lang.String r4 = r4.A0O
            X.4T2 r6 = new X.4T2
            r23 = r5
            r24 = r4
            r27 = r9
            r29 = r7
            r31 = r2
            r33 = r11
            r37 = r0
            r38 = r15
            r39 = r14
            r40 = r14
            r19 = r16
            r20 = r13
            r18 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0126
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.String r1 = "AV1 decoding using dash media source"
            r0 = r17
            X.27B.A01(r0, r1, r2)
            return r6
        L_0x02f7:
            r9 = 0
            r7 = 0
            r2 = 0
            goto L_0x02bc
        L_0x02fe:
            r25 = 0
            if (r6 == 0) goto L_0x02ae
            goto L_0x02a6
        L_0x0303:
            r15 = 0
            goto L_0x028c
        L_0x0305:
            java.lang.String r10 = "no valid dash representations"
            X.4Yz r7 = X.C266464Yz.A0y
            goto L_0x027a
        L_0x030b:
            r12 = 1
            goto L_0x026b
        L_0x030e:
            X.3wM r6 = r4.A02(r14)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r6 = r6.A03
            java.util.Iterator r12 = r6.iterator()
        L_0x0322:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x035d
            java.lang.Object r11 = r12.next()
            X.3wK r11 = (X.C256773wK) r11
            int r10 = r11.A01
            if (r10 == r7) goto L_0x0349
            r6 = 2
            if (r10 != r6) goto L_0x0322
            java.util.List r6 = r11.A07
            java.util.Iterator r10 = r6.iterator()
        L_0x033b:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x0322
            java.lang.Object r6 = r10.next()
            r9.add(r6)
            goto L_0x033b
        L_0x0349:
            java.util.List r6 = r11.A07
            java.util.Iterator r10 = r6.iterator()
        L_0x034f:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x0322
            java.lang.Object r6 = r10.next()
            r8.add(r6)
            goto L_0x034f
        L_0x035d:
            r9.isEmpty()
            boolean r6 = r9.isEmpty()
            if (r6 == 0) goto L_0x0368
            r9 = r16
        L_0x0368:
            boolean r6 = r8.isEmpty()
            if (r6 == 0) goto L_0x0370
            r8 = r16
        L_0x0370:
            if (r9 != 0) goto L_0x0378
            if (r8 != 0) goto L_0x0378
            r6 = r16
            goto L_0x025c
        L_0x0378:
            X.3wV r6 = new X.3wV
            r6.<init>(r9, r8)
            goto L_0x025c
        L_0x037f:
            X.27s r12 = r0.A04
            r18 = r12
            X.3wx r12 = r0.A05
            X.4SZ r28 = new X.4SZ
            r28.<init>()
            X.5JH r27 = new X.5JH
            r29 = r13
            r30 = r18
            r31 = r12
            r32 = r16
            r33 = r16
            r34 = r9
            r35 = r19
            r36 = r8
            r37 = r11
            r38 = r10
            r39 = r16
            r40 = r14
            r41 = r14
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            com.google.android.exoplayer2.source.dash.DashMediaSource$Factory r8 = new com.google.android.exoplayer2.source.dash.DashMediaSource$Factory
            r37 = r8
            r38 = r13
            r39 = r12
            r40 = r6
            r41 = r9
            r43 = r27
            r44 = r16
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)
            goto L_0x00e3
        L_0x03be:
            java.lang.String r3 = "bytes:///video"
            X.TRY r2 = new X.TRY     // Catch:{ MalformedURLException -> 0x03e9, URISyntaxException -> 0x03e2 }
            r2.<init>()     // Catch:{ MalformedURLException -> 0x03e9, URISyntaxException -> 0x03e2 }
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x03e9, URISyntaxException -> 0x03e2 }
            r0.<init>(r6, r3, r2)     // Catch:{ MalformedURLException -> 0x03e9, URISyntaxException -> 0x03e2 }
            java.net.URI r0 = r0.toURI()     // Catch:{ MalformedURLException -> 0x03e9, URISyntaxException -> 0x03e2 }
            java.lang.String r0 = r0.toString()     // Catch:{ MalformedURLException -> 0x03e9, URISyntaxException -> 0x03e2 }
            android.net.Uri r0 = X.0cp.A03(r0)     // Catch:{ MalformedURLException -> 0x03e9, URISyntaxException -> 0x03e2 }
            r1.A05 = r0
            X.QoP r0 = new X.QoP
            r0.<init>()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03e2:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x03e9:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PD.BQp(X.4Oq, X.4Oi, X.4OI, X.4SU, X.4P8, X.4Sp, X.3wP, X.3w6, X.3m7, long, boolean):X.4T2");
    }

    public final 28w CDw(C250853mA r20, AnonymousClass4OI r21, C256633w6 r22) {
        AnonymousClass4OI r0 = r21;
        28i A002 = A00(r0);
        HeroPlayerSetting heroPlayerSetting = this.A09;
        1xk r14 = heroPlayerSetting.A0w;
        29t r2 = this.A0E;
        28g r8 = new 28g(new C264534Qg(r2), r2, r0.A04, heroPlayerSetting);
        C250853mA r11 = r20;
        this.A01 = r11;
        27s r12 = this.A04;
        AbrContextAwareConfiguration abrContextAwareConfiguration = new AbrContextAwareConfiguration(r14, r12, A002, false, false);
        28m r6 = new 28m(abrContextAwareConfiguration, this.A0G);
        this.A00 = r6;
        28w r4 = new 28w(this.A0C, r6, A002, r8, (28w) null, abrContextAwareConfiguration, r11, r12);
        this.A02 = r4;
        return r4;
    }

    public AnonymousClass4PD(Context context, 29t r10, C257163wx r11, 28T r12, ServiceEventCallbackImpl serviceEventCallbackImpl, Map map, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.A0C = context;
        this.A0H = map;
        HeroPlayerSetting heroPlayerSetting = r12.A06;
        this.A09 = heroPlayerSetting;
        27k r4 = (27k) r12.A09.get();
        this.A06 = r4;
        this.A07 = serviceEventCallbackImpl;
        AnonymousClass27W r7 = r12.A07;
        this.A0G = r7;
        29t r2 = r10;
        this.A08 = new AnonymousClass4PF(context, r2, new C257153ww(), r4, serviceEventCallbackImpl, heroPlayerSetting, r7);
        this.A04 = r12.A03;
        this.A0D = r12.A01;
        this.A0E = r10;
        this.A0B = atomicBoolean;
        this.A0A = atomicBoolean2;
        this.A0F = (AnonymousClass27Y) r12.A08.get();
        this.A05 = r11;
        this.A03 = r12.A04;
    }
}
