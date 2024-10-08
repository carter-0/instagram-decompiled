package X;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.RectF;
import android.os.Debug;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatSparsLogger;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.dataproviders.platformtexture.implementation.PlatformTextureDataProviderObjectsWrapper;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource;
import com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.instagram.react.modules.base.IgReactQEModule;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase14Impl;

/* renamed from: X.8gv  reason: invalid class name and case insensitive filesystem */
public final class C361848gv implements C361858gw, C361868gx, C361878gy, C345237tA {
    public static final C344037rD A0r = new C368708tC();
    public int A00 = -1;
    public int A01 = -1;
    public long A02;
    public C17760VfW A03;
    public C357848Zx A04;
    public AnonymousClass6e9 A05;
    public PlatformAlgorithmDataSource A06;
    public C340407lD A07;
    public C372028zY A08;
    public ASJ A09;
    public C368858tR A0A;
    public C344847sW A0B;
    public C371308xz A0C;
    public C346427v9 A0D;
    public String A0E = null;
    public String A0F = null;
    public boolean A0G;
    public boolean A0H = false;
    public boolean A0I;
    public boolean A0J = false;
    public boolean A0K;
    public boolean A0L = false;
    public boolean A0M = false;
    public boolean A0N;
    public boolean A0O = true;
    public boolean A0P = false;
    public int[] A0Q;
    public C346407v7 A0R;
    public C346397v6 A0S;
    public C346417v8 A0T;
    public boolean A0U = false;
    public final C344227rW A0V;
    public final C368828tO A0W;
    public final C368838tP A0X;
    public final C368808tM A0Y;
    public final C368638t3 A0Z;
    public final C312156dv A0a;
    public final C343967r6 A0b;
    public final C368798tL A0c = new C368798tL();
    public final Object A0d = new Object();
    public final boolean[] A0e;
    public final ActivityManager A0f;
    public final C368698tB A0g;
    public final C368788tK A0h = new Object();
    public final C368688tA A0i;
    public final Executor A0j;
    public volatile C371298xy A0k = null;
    public volatile AnonymousClass82G A0l = null;
    public volatile boolean A0m = false;
    public volatile boolean A0n = false;
    public volatile C371698yt A0o = null;
    public volatile C344037rD A0p;
    public volatile boolean A0q = true;

    private synchronized void A04() {
        C346407v7 r1;
        C346397v6 r0;
        C346417v8 r8;
        int i;
        if (this.A0m && this.A0B != null) {
            C368788tK r5 = this.A0h;
            if (!(!r5.A03 || (r1 = r5.A00) == null || (r0 = r5.A01) == null || (r8 = r5.A02) == null)) {
                int i2 = 0;
                r5.A03 = false;
                C368808tM r7 = this.A0Y;
                int i3 = r0.A01;
                int i4 = r0.A00;
                Integer num = r1.A00;
                Integer num2 = AnonymousClass05K.A00;
                boolean z = false;
                if (num == num2) {
                    z = true;
                }
                int i5 = r8.A00 * 90;
                int i6 = r8.A01;
                if (z) {
                    i = 360 - ((i6 + i5) % 360);
                } else {
                    i = (i6 - i5) + 360;
                }
                int i7 = i % 360;
                boolean z2 = false;
                if (num == num2) {
                    z2 = true;
                }
                r7.A00 = i7;
                r7.A01 = z2;
                r7.A02.ErR(i3, i4, i3, i7, z2);
                C368638t3 r12 = this.A0Z;
                if (r5.A00.A00 != num2) {
                    i2 = 1;
                }
                r12.EQO(i2);
            }
        }
    }

    public final void EOi(C13586TdE tdE) {
    }

    private C344037rD A00(String str) {
        String str2;
        C344037rD r0 = this.A0p;
        if (r0 != null) {
            return r0;
        }
        C371298xy r02 = this.A0k;
        if (r02 != null) {
            str2 = r02.A04;
        } else {
            str2 = "null_config";
        }
        0KC.A0C("FbMsqrdRenderer", "====== No proper logger !!!!!!!!!! ======");
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("use_case", str);
            if (str2 == null) {
                str2 = "null_product_name";
            }
            hashMap.put("product_name", str2);
            qPLInstance.markerGenerateWithAnnotations(11282540, 4, 1, TimeUnit.MILLISECONDS, hashMap);
        }
        return A0r;
    }

    private void A01() {
        if (!this.A0U) {
            this.A0Z.EF9();
            this.A0U = true;
            AnonymousClass82G r1 = this.A0l;
            C371298xy r0 = this.A0k;
            if (r1 != null && r0 != null) {
                r1.A07(r0.A0A);
            }
        }
    }

    private void A02() {
        AnonymousClass6e9 r1 = this.A05;
        if (r1 != null) {
            C346407v7 r0 = this.A0R;
            if (r0 != null) {
                r1.EQP(r0.A00);
                this.A0R = null;
            }
            C346427v9 r02 = this.A0D;
            if (r02 != null) {
                this.A05.setPreviewViewInfo(r02.A02, r02.A01, r02.A00);
                this.A0D = null;
            }
            C346397v6 r03 = this.A0S;
            if (r03 != null) {
                this.A05.setCaptureDeviceSize(r03.A01, r03.A00);
                C346397v6 r04 = this.A0S;
                this.A0Q = new int[]{r04.A01, r04.A00};
                this.A0S = null;
            }
            C346417v8 r05 = this.A0T;
            if (r05 != null) {
                this.A05.setRotation(r05.A00);
                this.A0T = null;
            }
            C371308xz r06 = this.A0C;
            if (r06 != null) {
                this.A05.ER8(r06.A00);
                this.A0C = null;
            }
        }
    }

    private void A03() {
        Arrays.fill(this.A0e, false);
        AnonymousClass9RX.A01(this, this.A0B);
        if (this.A0n || this.A0U) {
            synchronized (this.A0d) {
                A09(this.A0k, (Exception) null, "release", false);
                this.A0n = false;
                this.A0Z.EFB();
                this.A0U = false;
            }
        }
        this.A0l = null;
        this.A0m = false;
        this.A0o = null;
        ASJ asj = this.A09;
        if (asj != null) {
            asj.release();
            this.A09 = null;
        }
        hashCode();
    }

    private void A06(C371298xy r4, int i) {
        String str;
        boolean z;
        String str2;
        C368758tH BY6 = A00(002.A0O("logXEvent ", i)).BY6();
        if (r4 != null) {
            str = r4.A07;
            z = false;
        } else {
            str = "null_config_session";
            z = true;
        }
        boolean onEvent = BY6.onEvent(i, str, z);
        String A0O2 = 002.A0O("event_", i);
        if (r4 != null) {
            str2 = r4.A04;
        } else {
            str2 = "null_config";
        }
        A0B(onEvent, A0O2, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: X.A8o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: X.A8o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: X.A8o} */
    /* JADX WARNING: type inference failed for: r2v20, types: [java.lang.Object, X.A8o] */
    /* JADX WARNING: type inference failed for: r2v22, types: [java.lang.Object, X.A8o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07(X.C371298xy r31, X.AnonymousClass82G r32) {
        /*
            r30 = this;
            r9 = r30
            r9.A04()
            X.8t3 r0 = r9.A0Z
            r29 = r0
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r6 = r29.B0D()
            r8 = r31
            java.lang.String r0 = r8.A05
            if (r0 == 0) goto L_0x0015
            r6.mProductSessionId = r0
        L_0x0015:
            r7 = r32
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r29.B0D()     // Catch:{ EffectsFrameworkException -> 0x040b }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig r0 = r0.mEffectServiceHostConfig     // Catch:{ EffectsFrameworkException -> 0x040b }
            com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig r0 = r0.mFaceTrackerDataProviderConfig     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.Integer r15 = X.AnonymousClass05K.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x0029
            int r0 = r0.executionMode     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x0029
            java.lang.Integer r15 = X.AnonymousClass05K.A01     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x0029:
            X.8tO r4 = r9.A0W     // Catch:{ EffectsFrameworkException -> 0x040b }
            r12 = 0
            X.8yt r0 = r8.A03     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8yu r3 = new X.8yu     // Catch:{ EffectsFrameworkException -> 0x040b }
            r3.<init>(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r4.A00 = r3     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.util.HashMap r2 = r8.A0I     // Catch:{ EffectsFrameworkException -> 0x040b }
            r5 = 0
            if (r2 == 0) goto L_0x007c
            java.util.Set r1 = r2.keySet()     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.Object[] r11 = r1.toArray(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch:{ EffectsFrameworkException -> 0x040b }
            int r0 = r2.size()     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ EffectsFrameworkException -> 0x040b }
            r1 = 0
        L_0x004d:
            int r0 = r2.size()     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r1 >= r0) goto L_0x005e
            r0 = r11[r1]     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r10[r1] = r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            int r1 = r1 + 1
            goto L_0x004d
        L_0x005e:
            java.lang.String r2 = r8.A09     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8yu r3 = r4.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.ARb r1 = new X.ARb     // Catch:{ EffectsFrameworkException -> 0x040b }
            r1.<init>(r4, r8)     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8zq r0 = new X.8zq     // Catch:{ EffectsFrameworkException -> 0x040b }
            r13 = r0
            r14 = r1
            r16 = r12
            r17 = r12
            r18 = r2
            r19 = r11
            r20 = r10
            r21 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r3.A00 = r0     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x007c:
            java.lang.String r2 = r8.A0H     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r2 == 0) goto L_0x00b9
            X.9ZR r1 = X.AnonymousClass9ZR.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0 = 64
            X.AHF r10 = new X.AHF     // Catch:{ EffectsFrameworkException -> 0x040b }
            r10.<init>(r1, r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            int r1 = r10.A03(r2)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0 = 1
            r10.A08(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r10.A0A(r5, r1)     // Catch:{ EffectsFrameworkException -> 0x040b }
            int r0 = r10.A01()     // Catch:{ EffectsFrameworkException -> 0x040b }
            r10.A06(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.Class<X.9ZT> r2 = X.AnonymousClass9ZT.class
            r10.A04()     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.nio.ByteBuffer r1 = r10.A07     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.ACv r0 = new X.ACv     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0.<init>(r2, r1)     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.A8o r2 = new X.A8o     // Catch:{ EffectsFrameworkException -> 0x040b }
            r2.<init>()     // Catch:{ EffectsFrameworkException -> 0x040b }
            r2.A00(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.6eR r1 = X.C312446eR.RuntimeRigMappingDataProvider     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.A4o r0 = new X.A4o     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0.<init>(r1, r2)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r3.A01(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x00b9:
            java.lang.String r2 = r8.A08     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r2 == 0) goto L_0x00f8
            X.8yu r3 = r4.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.9ZR r1 = X.AnonymousClass9ZR.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0 = 64
            X.AHF r10 = new X.AHF     // Catch:{ EffectsFrameworkException -> 0x040b }
            r10.<init>(r1, r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            int r1 = r10.A03(r2)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0 = 4
            r10.A08(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r10.A0A(r5, r1)     // Catch:{ EffectsFrameworkException -> 0x040b }
            int r0 = r10.A01()     // Catch:{ EffectsFrameworkException -> 0x040b }
            r10.A06(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.Class<X.9ZS> r2 = X.AnonymousClass9ZS.class
            r10.A04()     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.nio.ByteBuffer r1 = r10.A07     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.ACv r0 = new X.ACv     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0.<init>(r2, r1)     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.A8o r2 = new X.A8o     // Catch:{ EffectsFrameworkException -> 0x040b }
            r2.<init>()     // Catch:{ EffectsFrameworkException -> 0x040b }
            r2.A00(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.6eR r1 = X.C312446eR.FaceWaveDataProvider     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.A4o r0 = new X.A4o     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0.<init>(r1, r2)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r3.A01(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x00f8:
            java.lang.String r2 = r8.A0F     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r2 != 0) goto L_0x0100
            java.lang.String r0 = r8.A0D     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x018a
        L_0x0100:
            java.lang.String r3 = r8.A0G     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.String r11 = r8.A0D     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.String r13 = r8.A0E     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8yu r0 = r4.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.6eR r14 = X.C312446eR.PersonSegmentationDataProvider     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.util.Map r0 = r0.A07     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.Object r0 = r0.get(r14)     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.A4o r0 = (X.C39674A4o) r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 != 0) goto L_0x011c
            X.A8o r10 = new X.A8o     // Catch:{ EffectsFrameworkException -> 0x040b }
            r10.<init>()     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x0119:
            r4.A01 = r10     // Catch:{ EffectsFrameworkException -> 0x040b }
            goto L_0x011f
        L_0x011c:
            X.A8o r10 = r0.A01     // Catch:{ EffectsFrameworkException -> 0x040b }
            goto L_0x0119
        L_0x011f:
            if (r0 != 0) goto L_0x012b
            X.8yu r1 = r4.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.A4o r0 = new X.A4o     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0.<init>(r14, r10)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r1.A01(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x012b:
            X.8tN r0 = r4.A03     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.Slv r1 = new X.Slv     // Catch:{ EffectsFrameworkException -> 0x040b }
            r1.<init>(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.A8o r0 = r4.A01     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0.A02 = r1     // Catch:{ EffectsFrameworkException -> 0x040b }
            r1 = 512(0x200, float:7.175E-43)
            X.9ZR r0 = X.AnonymousClass9ZR.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.AHF r10 = new X.AHF     // Catch:{ EffectsFrameworkException -> 0x040b }
            r10.<init>(r0, r1)     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r2 != 0) goto L_0x0156
            r2 = 0
        L_0x0142:
            if (r3 != 0) goto L_0x0151
            r3 = 0
        L_0x0145:
            if (r11 != 0) goto L_0x014c
            r11 = 0
        L_0x0148:
            if (r13 != 0) goto L_0x015b
            r1 = 0
            goto L_0x015f
        L_0x014c:
            int r11 = r10.A03(r11)     // Catch:{ EffectsFrameworkException -> 0x040b }
            goto L_0x0148
        L_0x0151:
            int r3 = r10.A03(r3)     // Catch:{ EffectsFrameworkException -> 0x040b }
            goto L_0x0145
        L_0x0156:
            int r2 = r10.A03(r2)     // Catch:{ EffectsFrameworkException -> 0x040b }
            goto L_0x0142
        L_0x015b:
            int r1 = r10.A03(r13)     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x015f:
            r0 = 6
            r10.A08(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0 = 3
            r10.A0A(r0, r1)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0 = 2
            r10.A0A(r0, r11)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0 = 1
            r10.A0A(r0, r3)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r10.A0A(r5, r2)     // Catch:{ EffectsFrameworkException -> 0x040b }
            int r0 = r10.A01()     // Catch:{ EffectsFrameworkException -> 0x040b }
            r10.A06(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.A8o r3 = r4.A01     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.Class<X.9ZU> r2 = X.AnonymousClass9ZU.class
            r10.A04()     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.nio.ByteBuffer r1 = r10.A07     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.ACv r0 = new X.ACv     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0.<init>(r2, r1)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r3.A00(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x018a:
            java.util.Map r2 = r8.A0K     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r2 == 0) goto L_0x01be
            java.util.Set r1 = r2.keySet()     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.Object[] r5 = r1.toArray(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ EffectsFrameworkException -> 0x040b }
            int r0 = r2.size()     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ EffectsFrameworkException -> 0x040b }
            r1 = 0
        L_0x01a1:
            int r0 = r2.size()     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r1 >= r0) goto L_0x01b2
            r0 = r5[r1]     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r3[r1] = r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            int r1 = r1 + 1
            goto L_0x01a1
        L_0x01b2:
            X.8yu r2 = r4.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8yi r1 = X.C380929ak.A02     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.9ak r0 = new X.9ak     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0.<init>(r5, r3)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r2.A00(r1, r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x01be:
            X.8yu r0 = r4.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8yt r10 = new X.8yt     // Catch:{ EffectsFrameworkException -> 0x040b }
            r10.<init>(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8yv r14 = r10.A06     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r14 == 0) goto L_0x01ee
            X.8Zx r1 = r9.A04     // Catch:{ EffectsFrameworkException -> 0x040b }
            r14.A01 = r1     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.ref.WeakReference r2 = r14.A04     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r2 == 0) goto L_0x01dd
            java.lang.Object r0 = r2.get()     // Catch:{ EffectsFrameworkException -> 0x040b }
            com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost r0 = (com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost) r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x01dd
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl r0 = (com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl) r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0.mExternalAudioProvider = r1     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x01dd:
            boolean r1 = r9.A0G     // Catch:{ EffectsFrameworkException -> 0x040b }
            r14.A05 = r1     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r2 == 0) goto L_0x01ee
            java.lang.Object r0 = r2.get()     // Catch:{ EffectsFrameworkException -> 0x040b }
            com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost r0 = (com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost) r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x01ee
            r0.setMuted(r1)     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x01ee:
            X.8yi r1 = X.C371988zT.A01     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.util.HashMap r5 = r10.A08     // Catch:{ EffectsFrameworkException -> 0x040b }
            boolean r0 = r5.containsKey(r1)     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x0202
            X.8yh r0 = r10.A02(r1)     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8zT r0 = (X.C371988zT) r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource r0 = r0.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            r9.A06 = r0     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x0202:
            r9.A0o = r10     // Catch:{ EffectsFrameworkException -> 0x040b }
            com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger r0 = r29.AbS()     // Catch:{ EffectsFrameworkException -> 0x040b }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r1 = r29.B0D()     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.String r15 = r1.mProductSessionId     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x0246
            java.lang.String r13 = r8.A04     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r13 != 0) goto L_0x0216
            java.lang.String r13 = ""
        L_0x0216:
            java.lang.String r11 = r8.A0A     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.String r4 = r8.A0B     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.String r3 = r8.A01     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r3 != 0) goto L_0x0220
            java.lang.String r3 = ""
        L_0x0220:
            java.lang.String r2 = r8.A07     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r2 != 0) goto L_0x0226
            java.lang.String r2 = ""
        L_0x0226:
            X.6el r1 = r8.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            r23 = 0
            com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl r0 = (com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl) r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0.mProductName = r13     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0.mEffectStartIntent = r1     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.6ef r0 = r0.mCameraARAnalyticsLogger     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x0246
            r16 = r1
            r17 = r13
            r18 = r11
            r19 = r4
            r20 = r3
            r21 = r2
            r22 = r15
            r15 = r0
            r15.EZn(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x0246:
            X.6el r1 = r8.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.6el r0 = X.C312596el.USER_INTERACTION     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r1 != r0) goto L_0x0250
            X.6el r0 = X.C312596el.SYSTEM     // Catch:{ EffectsFrameworkException -> 0x040b }
            r8.A00 = r0     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x0250:
            r8.A01 = r12     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r14 == 0) goto L_0x0275
            java.lang.String r0 = "tryPassLoggerToAudioConfiguration"
            X.7rD r0 = r9.A00(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.RoT r2 = new X.RoT     // Catch:{ EffectsFrameworkException -> 0x040b }
            r2.<init>(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r14.A03 = r2     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.ref.WeakReference r1 = r14.A04     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r1 == 0) goto L_0x0275
            java.lang.Object r0 = r1.get()     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x0275
            java.lang.Object r0 = r1.get()     // Catch:{ EffectsFrameworkException -> 0x040b }
            com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost r0 = (com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost) r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl r0 = (com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl) r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0.mAudioLogger = r2     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x0275:
            java.lang.String r11 = r8.A07     // Catch:{ EffectsFrameworkException -> 0x040b }
            r22 = r11
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r29.B0D()     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.String r4 = r0.mProductSessionId     // Catch:{ EffectsFrameworkException -> 0x040b }
            java.lang.String r3 = r8.A01     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.6el r14 = r8.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ EffectsFrameworkException -> 0x040b }
            r2 = 1
            r9.A0J = r2     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            r9.A0K = r2     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            r0 = 0
            r9.A02 = r0     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            r1 = 0
            r9.A0N = r1     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            r0 = r29
            java.util.List r26 = r0.AN1(r10)     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            java.lang.String r0 = r8.A0A     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            r28 = r0
            java.lang.String r13 = r8.A0B     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            java.util.List r0 = r8.A0J     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            if (r0 == 0) goto L_0x02b6
            com.google.common.collect.ImmutableList r18 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
        L_0x02a6:
            X.8zp r0 = r8.A02     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher r15 = new com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            r16 = r28
            r17 = r13
            r19 = r0
            r20 = r1
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            goto L_0x02b9
        L_0x02b6:
            r18 = 0
            goto L_0x02a6
        L_0x02b9:
            java.lang.String r24 = ""
            if (r11 != 0) goto L_0x02bf
            r22 = r24
        L_0x02bf:
            if (r4 != 0) goto L_0x02c3
            r4 = r24
        L_0x02c3:
            if (r3 == 0) goto L_0x02c7
            r24 = r3
        L_0x02c7:
            java.lang.String r3 = r8.A06     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            r3.getClass()     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig r1 = r10.A05     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            X.8tL r0 = r9.A0c     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            r20 = r28
            r21 = r13
            r23 = r4
            r25 = r3
            r27 = r2
            r16 = r1
            r17 = r14
            r18 = r12
            r19 = r0
            r14 = r29
            r14.EUo(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            X.8tP r0 = r9.A0X     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            r0.A01 = r2     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            X.8zY r0 = r9.A08     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            if (r0 == 0) goto L_0x0329
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r1 = r29.BOt()     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            X.8zY r13 = r9.A08     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            boolean r0 = r1.supportsTapGesture     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            r17 = r0
            boolean r15 = r1.supportsPanGesture     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            boolean r14 = r1.supportsPinchGesture     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            boolean r12 = r1.supportsRotateGesture     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            boolean r4 = r1.supportsLongPressGesture     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            boolean r3 = r1.supportsRawTouchGesture     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            boolean r0 = r1.usesTouchService     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            X.8za r1 = new X.8za     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            r21 = r4
            r22 = r3
            r23 = r0
            r16 = r1
            r18 = r15
            r19 = r14
            r20 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            boolean r0 = r13 instanceof X.C372018zX     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            if (r0 == 0) goto L_0x0329
            X.8zX r13 = (X.C372018zX) r13     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            r13.A01 = r1     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            X.8zZ r0 = r13.A00     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            if (r0 == 0) goto L_0x0329
            r0.A0B = r1     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
            X.C372038zZ.A03(r0)     // Catch:{ UnsatisfiedLinkError -> 0x03fb }
        L_0x0329:
            android.os.SystemClock.elapsedRealtime()     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8yi r1 = X.C371678yq.A01     // Catch:{ EffectsFrameworkException -> 0x040b }
            boolean r0 = r5.containsKey(r1)     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x0341
            X.8yh r0 = r10.A02(r1)     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8yq r0 = (X.C371678yq) r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.6e9 r0 = r0.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            r9.A05 = r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            r9.A02()     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x0341:
            X.8yi r1 = X.C372008zW.A01     // Catch:{ EffectsFrameworkException -> 0x040b }
            boolean r0 = r5.containsKey(r1)     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x0399
            X.8yh r0 = r10.A02(r1)     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8zW r0 = (X.C372008zW) r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8zY r0 = r0.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            r9.A08 = r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            boolean r0 = r9.A0J     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x0390
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r29.BOt()     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8zY r14 = r9.A08     // Catch:{ EffectsFrameworkException -> 0x040b }
            boolean r13 = r0.supportsTapGesture     // Catch:{ EffectsFrameworkException -> 0x040b }
            boolean r12 = r0.supportsPanGesture     // Catch:{ EffectsFrameworkException -> 0x040b }
            boolean r10 = r0.supportsPinchGesture     // Catch:{ EffectsFrameworkException -> 0x040b }
            boolean r5 = r0.supportsRotateGesture     // Catch:{ EffectsFrameworkException -> 0x040b }
            boolean r4 = r0.supportsLongPressGesture     // Catch:{ EffectsFrameworkException -> 0x040b }
            boolean r3 = r0.supportsRawTouchGesture     // Catch:{ EffectsFrameworkException -> 0x040b }
            boolean r0 = r0.usesTouchService     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8za r1 = new X.8za     // Catch:{ EffectsFrameworkException -> 0x040b }
            r20 = r4
            r21 = r3
            r22 = r0
            r15 = r1
            r16 = r13
            r17 = r12
            r18 = r10
            r19 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ EffectsFrameworkException -> 0x040b }
            boolean r0 = r14 instanceof X.C372018zX     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x0390
            X.8zX r14 = (X.C372018zX) r14     // Catch:{ EffectsFrameworkException -> 0x040b }
            r14.A01 = r1     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8zZ r0 = r14.A00     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x0390
            r0.A0B = r1     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.C372038zZ.A03(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x0390:
            X.7lD r1 = r9.A07     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r1 == 0) goto L_0x0399
            X.8zY r0 = r9.A08     // Catch:{ EffectsFrameworkException -> 0x040b }
            r1.A00(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x0399:
            X.8tR r3 = r9.A0A     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r3 != 0) goto L_0x03a9
            X.8tS r0 = new X.8tS     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0.<init>(r9)     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8tR r3 = new X.8tR     // Catch:{ EffectsFrameworkException -> 0x040b }
            r3.<init>(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r9.A0A = r3     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x03a9:
            X.8tU r0 = X.C368888tU.A02     // Catch:{ EffectsFrameworkException -> 0x040b }
            r3.A01 = r0     // Catch:{ EffectsFrameworkException -> 0x040b }
            r3.A02 = r2     // Catch:{ EffectsFrameworkException -> 0x040b }
            boolean r0 = r29.CJk()     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x03c3
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r29.BOt()     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8t9 r1 = r0.frameFormatForPostProcessing     // Catch:{ EffectsFrameworkException -> 0x040b }
            X.8t9 r0 = X.C368678t9.YUV     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r1 != r0) goto L_0x03c9
            X.8tU r0 = X.C368888tU.RGBA     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x03c1:
            r3.A01 = r0     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x03c3:
            X.7sW r0 = r9.A0B     // Catch:{ EffectsFrameworkException -> 0x040b }
            r9.A0A(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            goto L_0x03d0
        L_0x03c9:
            X.8t9 r0 = X.C368678t9.Y     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r1 != r0) goto L_0x03c3
            X.8tU r0 = X.C368888tU.LUM     // Catch:{ EffectsFrameworkException -> 0x040b }
            goto L_0x03c1
        L_0x03d0:
            if (r32 == 0) goto L_0x03db
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r2 = r6.mEffectManifest     // Catch:{ EffectsFrameworkException -> 0x040b }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution r1 = r6.mAttribution     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0 = r28
            r7.A08(r1, r2, r6, r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x03db:
            java.lang.String r0 = "setMsqrdConfigStage2"
            boolean r0 = r9.A0C(r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            if (r0 == 0) goto L_0x03eb
            r0 = 5
            r9.A06(r8, r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r9.A05(r8, r0)     // Catch:{ EffectsFrameworkException -> 0x040b }
            goto L_0x0445
        L_0x03eb:
            if (r11 == 0) goto L_0x0445
            X.6dv r3 = r9.A0a     // Catch:{ EffectsFrameworkException -> 0x040b }
            r0 = 16321564(0xf90c1c, float:2.2871383E-38)
            long r0 = r3.getInstanceIdWithString(r0, r11)     // Catch:{ EffectsFrameworkException -> 0x040b }
            r2 = 3
            r3.markPoint(r0, r2, r11)     // Catch:{ EffectsFrameworkException -> 0x040b }
            goto L_0x0445
        L_0x03fb:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0406 }
            com.facebook.cameracore.common.exception.EffectsFrameworkException r0 = new com.facebook.cameracore.common.exception.EffectsFrameworkException     // Catch:{ all -> 0x0406 }
            r0.<init>(r1)     // Catch:{ all -> 0x0406 }
            throw r0     // Catch:{ all -> 0x0406 }
        L_0x0406:
            r0 = move-exception
            android.os.SystemClock.elapsedRealtime()     // Catch:{ EffectsFrameworkException -> 0x040b }
            throw r0     // Catch:{ EffectsFrameworkException -> 0x040b }
        L_0x040b:
            r3 = move-exception
            X.8xy r0 = r9.A0k
            r9.A08(r0, r3)
            r0 = 0
            r9.A0k = r0
            java.lang.String r2 = r8.A06
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "setEffectToEngine failed, file exist: "
            r1.append(r0)
            if (r2 == 0) goto L_0x044b
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r0 = r0.exists()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x042f:
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FbMsqrdRenderer"
            X.0qQ.A0A(r1)
            X.0kD.A07(r0, r1, r3)
            if (r32 == 0) goto L_0x0445
            java.lang.String r0 = r8.A0A
            r7.A0A(r0, r3)
        L_0x0445:
            X.8tP r1 = r9.A0X
            r0 = 1
            r1.A01 = r0
            return
        L_0x044b:
            java.lang.String r0 = "null path"
            goto L_0x042f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361848gv.A07(X.8xy, X.82G):void");
    }

    private void A08(C371298xy r3, Exception exc) {
        String str;
        AnonymousClass9RX.A01(this, this.A0B);
        if (exc != null) {
            str = "ex";
        } else {
            str = "noex";
        }
        A09(r3, exc, 002.A0R("unsetMsqrd-", str), false);
        this.A0l = null;
        this.A0m = false;
        this.A0o = null;
        ASJ asj = this.A09;
        if (asj != null) {
            asj.release();
            this.A09 = null;
        }
    }

    private void A09(C371298xy r12, Exception exc, String str, boolean z) {
        String str2;
        String message;
        String str3;
        String message2;
        AnalyticsLogger AbS;
        AnonymousClass82S r0;
        B2P b2p;
        List list;
        PlatformTextureDataProviderObjectsWrapper platformTextureDataProviderObjectsWrapper;
        if (r12 != null) {
            if (A0C(002.A0R("stopEffect1-", str))) {
                if (z) {
                    A06(r12, 11);
                }
                A06(r12, 12);
                A05(r12, 12);
            } else {
                String str4 = r12.A07;
                if (str4 != null) {
                    C312156dv r3 = this.A0a;
                    r3.markPoint(r3.getInstanceIdWithString(16321564, str4), 7, str4);
                }
            }
        }
        AnonymousClass82G r1 = this.A0l;
        boolean z2 = this.A0J;
        C368638t3 r32 = this.A0Z;
        if (z2) {
            r32.EyA();
        } else {
            r32.AHJ();
        }
        C371698yt r02 = this.A0o;
        if (r02 != null) {
            for (C371618yh r2 : r02.A08.values()) {
                if (r2 instanceof C372078ze) {
                    C367648rL r03 = ((C372078ze) r2).A00;
                    if (!(r03 == null || (platformTextureDataProviderObjectsWrapper = r03.A00) == null)) {
                        platformTextureDataProviderObjectsWrapper.mHybridData.resetNative();
                    }
                } else if (r2 instanceof C372008zW) {
                    C372028zY r22 = ((C372008zW) r2).A00;
                    if (r22 instanceof C372018zX) {
                        list = ((C372018zX) r22).A03;
                    } else {
                        list = ((C381019b2) r22).A01;
                    }
                    list.clear();
                } else if (r2 instanceof C371908zL) {
                    MusicServiceDataSource musicServiceDataSource = ((C371908zL) r2).A00;
                    if (musicServiceDataSource != null) {
                        musicServiceDataSource.stop();
                    }
                } else if (r2 instanceof C371678yq) {
                    AnonymousClass6e9 r04 = ((C371678yq) r2).A00;
                    if (r04 != null) {
                        r04.stop();
                    }
                } else if (!(!(r2 instanceof C371838zD) || (r0 = ((C371838zD) r2).A00) == null || (b2p = r0.A00) == null)) {
                    b2p.stop();
                }
            }
        }
        C340407lD r23 = this.A07;
        String str5 = null;
        if (r23 != null) {
            r23.A00((C372028zY) null);
        }
        this.A0T = null;
        this.A0S = null;
        this.A0R = null;
        this.A0D = null;
        this.A05 = null;
        this.A0J = false;
        ASJ asj = this.A09;
        if (asj != null) {
            asj.release();
            this.A09 = null;
        }
        if (exc == null) {
            if (r32.CJk() && (AbS = r32.AbS()) != null) {
                C312606em r33 = new C312606em(AbS);
                C312626ep r24 = XplatSparsLogger.Companion;
                C312626ep.A00(r33);
            }
            if (r12 != null && A0C(002.A0R("stopEffect3-", str))) {
                A06(r12, 13);
            }
        } else {
            if (r12 != null && !A0C(002.A0R("stopEffect4-", str))) {
                C312156dv r4 = this.A0a;
                String str6 = r12.A07;
                long instanceIdWithString = r4.getInstanceIdWithString(16321564, str6);
                if (exc.getMessage() == null) {
                    message2 = "";
                } else {
                    message2 = exc.getMessage();
                }
                String A0R2 = 002.A0R("Loading effect error: ", message2);
                if (str6 == null) {
                    str6 = "";
                }
                r4.endFail(instanceIdWithString, "renderer", 1, A0R2, str6);
            }
            if (A0C(002.A0R("stopEffect5-", str))) {
                C368758tH BY6 = A00(002.A0R("stopEffect-", str)).BY6();
                if (r12 != null) {
                    str2 = r12.A07;
                } else {
                    str2 = "null_config_session";
                }
                if (exc.getMessage() == null) {
                    message = "EffectsFrameworkException";
                } else {
                    message = exc.getMessage();
                }
                boolean onFailureEvent = BY6.onFailureEvent(6, str2, "renderer", 1, message);
                String A0R3 = 002.A0R("stopEffect5-", str);
                if (r12 != null) {
                    str3 = r12.A04;
                } else {
                    str3 = "null_config";
                }
                A0B(onFailureEvent, A0R3, str3);
            }
        }
        if (r1 != null && this.A0N) {
            if (r12 != null) {
                str5 = r12.A0A;
            }
            r1.A09(str5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cd, code lost:
        if (r0 == false) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0A(X.C344847sW r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0028
            X.8t3 r2 = r7.A0Z
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r2.BOt()
            boolean r0 = r0.platformAlgorithmDataNeeded
            r7.A0H = r0
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r2.BOt()
            boolean r0 = r0.frameDataNeeded
            if (r0 != 0) goto L_0x0029
            X.7sZ r0 = X.C344877sZ.EXTERNAL_WORLD_TRACKING_EVENT
            r8.FIv(r7, r0)
            X.7sZ r0 = X.C344877sZ.PLATFORM_ALGORITHM_DATA_EVENT
            r8.FIv(r7, r0)
            X.7sZ r0 = X.C344877sZ.INPUT_PREVIEW_METADATA
            r8.FIv(r7, r0)
            X.7sZ r0 = X.C344877sZ.INPUT_PREVIEW
            r8.FIv(r7, r0)
        L_0x0028:
            return
        L_0x0029:
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r2.BOt()
            boolean r0 = r0.sLAMNeeded
            if (r0 != 0) goto L_0x0041
            X.7sZ r0 = X.C344877sZ.EXTERNAL_WORLD_TRACKING_EVENT
            r8.FIv(r7, r0)
            X.7sZ r0 = X.C344877sZ.INPUT_PREVIEW_METADATA
        L_0x0038:
            r8.FIv(r7, r0)
        L_0x003b:
            X.7sZ r0 = X.C344877sZ.INPUT_PREVIEW
            r8.EBc(r7, r0)
            return
        L_0x0041:
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r7.A0D()
            if (r0 == 0) goto L_0x003b
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r7.A0D()
            X.6ei r1 = r0.mArExperimentUtil
            if (r1 == 0) goto L_0x003b
            X.933 r0 = X.AnonymousClass933.WorldTracker_ARCoreSupported
            r6 = 0
            boolean r0 = r1.Ags(r0, r6)
            if (r0 == 0) goto L_0x00fb
            X.AVX r4 = new X.AVX
            r4.<init>()
            java.util.HashMap r3 = r4.A00
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r2.BOt()
            if (r0 == 0) goto L_0x00b6
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r2.BOt()
            boolean r0 = r0.usesWorldTrackingEnvironmentLight
        L_0x006b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 1303(0x517, float:1.826E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.put(r0, r1)
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r2.B0D()
            if (r0 == 0) goto L_0x00b4
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r2.BOt()
            boolean r0 = r0.horizontalTrackableDetectionNeeded
        L_0x0084:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 1302(0x516, float:1.824E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.put(r0, r1)
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r2.B0D()
            if (r0 == 0) goto L_0x00b2
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r2.BOt()
            boolean r0 = r0.verticalTrackableDetectionNeeded
        L_0x009d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 1304(0x518, float:1.827E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.put(r0, r1)
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r5 = r2.BOt()
            r2 = 0
            if (r5 == 0) goto L_0x00db
            goto L_0x00b8
        L_0x00b2:
            r0 = 0
            goto L_0x009d
        L_0x00b4:
            r0 = 0
            goto L_0x0084
        L_0x00b6:
            r0 = 0
            goto L_0x006b
        L_0x00b8:
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r7.A0D()     // Catch:{ Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00cf
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r7.A0D()     // Catch:{ Exception -> 0x0104 }
            X.6ei r1 = r0.mArExperimentUtil     // Catch:{ Exception -> 0x0104 }
            if (r1 == 0) goto L_0x00cf
            X.933 r0 = X.AnonymousClass933.WorldTracker_EnableHitTestWithDepth
            boolean r0 = r1.Ags(r0, r6)
            r1 = 1
            if (r0 != 0) goto L_0x00d0
        L_0x00cf:
            r1 = 0
        L_0x00d0:
            boolean r0 = r5.usesSceneDepth
            if (r0 != 0) goto L_0x00da
            boolean r0 = r5.usesMultiplane
            if (r0 == 0) goto L_0x00db
            if (r1 == 0) goto L_0x00db
        L_0x00da:
            r2 = 1
        L_0x00db:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0 = 1301(0x515, float:1.823E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.put(r0, r1)
            r8.E4c(r4)
            X.7sZ r0 = X.C344877sZ.EXTERNAL_WORLD_TRACKING_EVENT
            r8.EBc(r7, r0)
            boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x003b
            X.7sZ r0 = X.C344877sZ.PLATFORM_ALGORITHM_DATA_EVENT
            r8.EBc(r7, r0)
            goto L_0x003b
        L_0x00fb:
            X.7sZ r0 = X.C344877sZ.EXTERNAL_WORLD_TRACKING_EVENT
            r8.FIv(r7, r0)
            X.7sZ r0 = X.C344877sZ.PLATFORM_ALGORITHM_DATA_EVENT
            goto L_0x0038
        L_0x0104:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361848gv.A0A(X.7sW):void");
    }

    public static void A0B(boolean z, String str, String str2) {
        QuickPerformanceLogger qPLInstance;
        if (!z && (qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance()) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("use_case", 002.A0R("jni_null_", str));
            if (str2 == null) {
                str2 = "null_product_name";
            }
            hashMap.put("product_name", str2);
            qPLInstance.markerGenerateWithAnnotations(11282540, 4, 1, TimeUnit.MILLISECONDS, hashMap);
        }
    }

    private boolean A0C(String str) {
        if (!this.A0V.A00.CTO(135) || (A00(002.A0R("useARXLogger-", str)) instanceof C368708tC)) {
            return false;
        }
        return true;
    }

    public final EffectServiceHost A0D() {
        C368638t3 r1 = this.A0Z;
        if (r1.CJk()) {
            return r1.B0D();
        }
        return null;
    }

    public final HashMap A0E() {
        HashMap hashMap = new HashMap();
        hashMap.put("filter_type", "msqrd");
        String str = this.A0E;
        if (str != null) {
            hashMap.put("effect_id", str);
        }
        String str2 = this.A0F;
        if (str2 != null) {
            hashMap.put("effect_instance_id", str2);
        }
        C371298xy r0 = this.A0k;
        if (r0 != null) {
            hashMap.put("effect_session_id", r0.A07);
        }
        return hashMap;
    }

    public final void A0F(C357848Zx r2) {
        C371718yv r0;
        AudioPlatformComponentHost audioPlatformComponentHost;
        this.A04 = r2;
        C371698yt r02 = this.A0o;
        if (r02 != null && (r0 = r02.A06) != null) {
            r0.A01 = r2;
            WeakReference weakReference = r0.A04;
            if (weakReference != null && (audioPlatformComponentHost = (AudioPlatformComponentHost) weakReference.get()) != null) {
                ((AudioPlatformComponentHostImpl) audioPlatformComponentHost).mExternalAudioProvider = r2;
            }
        }
    }

    public final void A0H(C346397v6 r3) {
        C368788tK r1 = this.A0h;
        if (r3 != null && !r3.equals(r1.A01)) {
            r1.A01 = r3;
            r1.A03 = true;
        }
        this.A0S = r3;
        A02();
        A04();
    }

    @Deprecated
    public final void A0I(boolean z) {
        C371718yv r0;
        AudioPlatformComponentHost audioPlatformComponentHost;
        this.A0G = z;
        C371698yt r02 = this.A0o;
        if (r02 != null && (r0 = r02.A06) != null) {
            r0.A05 = z;
            WeakReference weakReference = r0.A04;
            if (weakReference != null && (audioPlatformComponentHost = (AudioPlatformComponentHost) weakReference.get()) != null) {
                audioPlatformComponentHost.setMuted(z);
            }
        }
    }

    public final Integer BHb() {
        return AnonymousClass05K.A01;
    }

    public final boolean CXr() {
        if (!this.A0J) {
            return false;
        }
        C368638t3 r1 = this.A0Z;
        if (r1.CJk()) {
            return r1.BOt().multipleOutputsSupported;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v38, types: [java.lang.Object, X.7v6] */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x023f, code lost:
        if (r8.A00 != r7) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0173, code lost:
        if (CXr() == false) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DAo(X.C368538so r26, long r27) {
        /*
            r25 = this;
            java.lang.String r0 = "FbMsqrdRenderer.onDrawFrameInternal"
            X.C349257zq.A03(r0)
            r4 = r25
            boolean r0 = r4.A0n
            r13 = 0
            if (r0 != 0) goto L_0x006f
            monitor-enter(r4)
            java.lang.Object r3 = r4.A0d     // Catch:{ all -> 0x006c }
            monitor-enter(r3)     // Catch:{ all -> 0x006c }
            boolean r0 = r4.A0n     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.A0m     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x005e
            r4.A01()     // Catch:{ all -> 0x0069 }
            r0 = 1
            r4.A0n = r0     // Catch:{ all -> 0x0069 }
            boolean r0 = r4.A0P     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x002d
            X.8t3 r2 = r4.A0Z     // Catch:{ all -> 0x0069 }
            int r1 = r4.A01     // Catch:{ all -> 0x0069 }
            int r0 = r4.A00     // Catch:{ all -> 0x0069 }
            r2.EFC(r1, r0)     // Catch:{ all -> 0x0069 }
            r4.A0P = r13     // Catch:{ all -> 0x0069 }
        L_0x002d:
            X.8xy r1 = r4.A0k     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x005e
            X.7sW r0 = r4.A0B     // Catch:{ all -> 0x0069 }
            X.AnonymousClass9RX.A00(r4, r0)     // Catch:{ all -> 0x0069 }
            X.82G r0 = r4.A0l     // Catch:{ all -> 0x0069 }
            r4.A07(r1, r0)     // Catch:{ all -> 0x0069 }
            boolean r0 = r4.A0M     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x005e
            X.8tR r2 = r4.A0A     // Catch:{ all -> 0x0069 }
            if (r2 != 0) goto L_0x004f
            X.8tS r0 = new X.8tS     // Catch:{ all -> 0x0069 }
            r0.<init>(r4)     // Catch:{ all -> 0x0069 }
            X.8tR r2 = new X.8tR     // Catch:{ all -> 0x0069 }
            r2.<init>(r0)     // Catch:{ all -> 0x0069 }
            r4.A0A = r2     // Catch:{ all -> 0x0069 }
        L_0x004f:
            java.util.Map r1 = r2.A03     // Catch:{ all -> 0x0069 }
            X.8tU r0 = r2.A01     // Catch:{ all -> 0x0069 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0069 }
            X.X9O r0 = (X.X9O) r0     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x005e
            r0.ELj()     // Catch:{ all -> 0x0069 }
        L_0x005e:
            monitor-exit(r3)     // Catch:{ all -> 0x0069 }
            monitor-exit(r4)
            boolean r0 = r4.A0n
            if (r0 != 0) goto L_0x006f
            X.C349257zq.A01()
            r10 = 0
            return r10
        L_0x0069:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x006f:
            X.8xy r3 = r4.A0k
            boolean r0 = r4.A0K
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = "onDrawFrameInternal1"
            boolean r0 = r4.A0C(r0)
            if (r0 == 0) goto L_0x0084
            r0 = 7
            r4.A06(r3, r0)
            r4.A05(r3, r0)
        L_0x0084:
            X.82G r1 = r4.A0l
            if (r1 == 0) goto L_0x0091
            X.8t3 r0 = r4.A0Z
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r0.BOt()
            r1.A05(r0)
        L_0x0091:
            if (r3 == 0) goto L_0x00c2
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r4.A0D()
            if (r0 == 0) goto L_0x0203
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r4.A0D()
            X.6ei r2 = r0.mArExperimentUtil
        L_0x009f:
            java.lang.String r5 = "forced_fba_enabled"
            java.lang.String r1 = "logEffectForceFBAEnabled"
            if (r2 == 0) goto L_0x01ff
            X.933 r0 = X.AnonymousClass933.AREngine_ForcePhase4Audio
            boolean r0 = r2.Ags(r0, r13)
            java.lang.String r2 = java.lang.String.valueOf(r0)
        L_0x00af:
            java.lang.String r0 = "updateAnnotation "
            java.lang.String r0 = X.002.A0R(r0, r1)
            X.7rD r0 = r4.A00(r0)
            X.8tH r1 = r0.BY6()
            java.lang.String r0 = r3.A07
            r1.updateAnnotation(r0, r5, r2)
        L_0x00c2:
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x00d7
            X.8t3 r0 = r4.A0Z
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r1 = r0.B0D()
            boolean r0 = r4.A0M
            if (r0 == 0) goto L_0x01fb
            X.9rc r0 = X.C390649rc.StillImage
        L_0x00d2:
            r1.setCurrentOptimizationMode(r0)
            r4.A0I = r13
        L_0x00d7:
            boolean r0 = r4.A0M
            if (r0 == 0) goto L_0x0116
            X.ASJ r0 = r4.A09
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r0.get()
            X.ADH r0 = (X.ADH) r0
            int r2 = r0.A04
            int r1 = r0.A02
            X.7v6 r0 = new X.7v6
            r0.<init>()
            r0.A01 = r2
            r0.A00 = r1
            r4.A0H(r0)
            X.8tM r1 = r4.A0Y
            X.ASJ r0 = r4.A09
            r1.A00(r0)
        L_0x00fc:
            X.8t3 r1 = r4.A0Z
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r1.BOt()
            if (r0 == 0) goto L_0x010c
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r1.BOt()
            boolean r0 = r0.usesWorldTracking
            if (r0 != 0) goto L_0x0116
        L_0x010c:
            X.ASJ r0 = r4.A09
            if (r0 == 0) goto L_0x0116
            r0.release()
            r0 = 0
            r4.A09 = r0
        L_0x0116:
            r6 = r26
            X.7v0 r0 = r6.A00()
            X.8t3 r12 = r4.A0Z
            int r5 = r0.A00
            int r2 = r0.A01
            X.7v3 r0 = r0.A02
            int r1 = r0.A01
            int r0 = r0.A00
            r12.EQV(r5, r2, r1, r0)
            boolean r5 = r4.A0K
            r0 = 0
            if (r5 == 0) goto L_0x0134
            android.os.SystemClock.elapsedRealtime()
        L_0x0134:
            if (r3 != 0) goto L_0x01f7
            r2 = 0
        L_0x0137:
            if (r5 == 0) goto L_0x0156
            java.lang.String r5 = "onDrawFrameInternal2"
            boolean r5 = r4.A0C(r5)
            if (r5 != 0) goto L_0x0156
            if (r2 == 0) goto L_0x014c
            X.6dv r1 = r4.A0a
            r0 = 16321564(0xf90c1c, float:2.2871383E-38)
            long r0 = r1.getInstanceIdWithString(r0, r2)
        L_0x014c:
            X.6dv r7 = r4.A0a
            r5 = 4
            if (r2 != 0) goto L_0x0153
            java.lang.String r2 = "null_config_session"
        L_0x0153:
            r7.markPoint(r0, r5, r2)
        L_0x0156:
            boolean r5 = r4.A0m
            r2 = 1
            if (r5 == 0) goto L_0x022f
            boolean r5 = r4.A0O
            if (r5 != 0) goto L_0x0175
            boolean[] r7 = r4.A0e
            X.8tL r5 = r4.A0c
            X.8KV r5 = r5.A00
            int r5 = r5.ordinal()
            boolean r5 = r7[r5]
            if (r5 == 0) goto L_0x0175
            boolean r5 = r4.CXr()
            r24 = 0
            if (r5 != 0) goto L_0x0177
        L_0x0175:
            r24 = 1
        L_0x0177:
            float[] r15 = r6.A04
            float[] r11 = r6.A05
            float[] r10 = r6.A03
            long r5 = r6.A00
            X.8tL r9 = r4.A0c
            X.VfW r7 = r4.A03
            r16 = 0
            if (r7 == 0) goto L_0x0189
            r16 = 1
        L_0x0189:
            X.7rW r7 = r4.A0V
            X.7r6 r14 = r7.A00
            r8 = 82
            r14.CTO(r8)
            if (r16 == 0) goto L_0x01a4
            X.VfW r7 = r4.A03
            r7.getClass()
            r7.A00()
            X.VfW r7 = r4.A03
            r7.getClass()
            r7.A00()
        L_0x01a4:
            X.VfW r7 = r4.A03
            if (r7 == 0) goto L_0x01f4
            boolean r7 = r14.CTO(r8)
            if (r7 == 0) goto L_0x01f4
            X.VfW r7 = r4.A03
            java.lang.Integer r8 = r7.A00()
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            if (r8 == r7) goto L_0x01c2
            X.VfW r7 = r4.A03
            java.lang.Integer r8 = r7.A00()
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            if (r8 != r7) goto L_0x01f4
        L_0x01c2:
            java.lang.Integer r16 = X.AnonymousClass05K.A01
        L_0x01c4:
            r20 = r27
            r22 = r5
            r18 = r11
            r19 = r10
            r17 = r15
            r15 = r9
            r14 = r12
            boolean r10 = r14.APt(r15, r16, r17, r18, r19, r20, r22, r24)
            X.8zY r6 = r4.A08
            if (r6 == 0) goto L_0x021e
            boolean r5 = r6 instanceof X.C372018zX
            if (r5 == 0) goto L_0x0206
            X.8zX r6 = (X.C372018zX) r6
            java.util.List r5 = r6.A03
            java.util.Iterator r6 = r5.iterator()
        L_0x01e4:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x021e
            java.lang.Object r5 = r6.next()
            X.B2h r5 = (X.C41826B2h) r5
            r5.dispatchUnconsumedGestures()
            goto L_0x01e4
        L_0x01f4:
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            goto L_0x01c4
        L_0x01f7:
            java.lang.String r2 = r3.A07
            goto L_0x0137
        L_0x01fb:
            X.9rc r0 = X.C390649rc.Video
            goto L_0x00d2
        L_0x01ff:
            java.lang.String r2 = "unknown"
            goto L_0x00af
        L_0x0203:
            r2 = 0
            goto L_0x009f
        L_0x0206:
            X.9b2 r6 = (X.C381019b2) r6
            java.util.List r5 = r6.A01
            java.util.Iterator r6 = r5.iterator()
        L_0x020e:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x021e
            java.lang.Object r5 = r6.next()
            X.B2h r5 = (X.C41826B2h) r5
            r5.dispatchUnconsumedGestures()
            goto L_0x020e
        L_0x021e:
            if (r10 == 0) goto L_0x0230
            r4.A0L = r13
            r4.A0O = r13
            boolean[] r6 = r4.A0e
            X.8KV r5 = r9.A00
            int r5 = r5.ordinal()
            r6[r5] = r2
            goto L_0x0230
        L_0x022f:
            r10 = 0
        L_0x0230:
            X.8tP r8 = r4.A0X     // Catch:{ Exception -> 0x0279 }
            X.8t3 r5 = r8.A02     // Catch:{ all -> 0x0277 }
            int r7 = r5.B3h()     // Catch:{ all -> 0x0277 }
            boolean r5 = r8.A01     // Catch:{ all -> 0x0277 }
            if (r5 != 0) goto L_0x0241
            int r6 = r8.A00     // Catch:{ all -> 0x0277 }
            r5 = 0
            if (r6 == r7) goto L_0x0242
        L_0x0241:
            r5 = 1
        L_0x0242:
            r8.A01 = r5     // Catch:{ all -> 0x0277 }
            r8.A00 = r7     // Catch:{ all -> 0x0277 }
            r7 = 0
            java.util.Set r6 = r8.A03     // Catch:{ all -> 0x0277 }
            monitor-enter(r6)     // Catch:{ all -> 0x0277 }
            boolean r5 = r6.isEmpty()     // Catch:{ all -> 0x0274 }
            if (r5 != 0) goto L_0x025b
            boolean r5 = r8.A01     // Catch:{ all -> 0x0274 }
            if (r5 == 0) goto L_0x025b
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0274 }
            r7.<init>(r6)     // Catch:{ all -> 0x0274 }
            r8.A01 = r13     // Catch:{ all -> 0x0274 }
        L_0x025b:
            monitor-exit(r6)     // Catch:{ all -> 0x0274 }
            if (r7 == 0) goto L_0x0281
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0277 }
        L_0x0262:
            boolean r5 = r7.hasNext()     // Catch:{ all -> 0x0277 }
            if (r5 == 0) goto L_0x0281
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x0277 }
            X.82I r6 = (X.AnonymousClass82I) r6     // Catch:{ all -> 0x0277 }
            int r5 = r8.A00     // Catch:{ all -> 0x0277 }
            r6.DE9(r5)     // Catch:{ all -> 0x0277 }
            goto L_0x0262
        L_0x0274:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0274 }
            throw r5     // Catch:{ all -> 0x0277 }
        L_0x0277:
            r5 = move-exception
            throw r5     // Catch:{ Exception -> 0x0279 }
        L_0x0279:
            r7 = move-exception
            java.lang.String r6 = "FbMsqrdRenderer"
            java.lang.String r5 = "Exception in handleFaceCountUpdate"
            X.0KC.A0F(r6, r5, r7)
        L_0x0281:
            boolean r5 = r4.A0K
            if (r5 == 0) goto L_0x02bb
            r4.A0K = r13
            X.82G r8 = r4.A0l
            if (r10 != 0) goto L_0x029b
            if (r8 == 0) goto L_0x029b
            if (r3 != 0) goto L_0x034e
            java.lang.String r5 = ""
        L_0x0291:
            java.lang.String r7 = "First AR frame render failed"
            com.facebook.cameracore.common.exception.EffectsFrameworkException r6 = new com.facebook.cameracore.common.exception.EffectsFrameworkException
            r6.<init>(r7)
            r8.A0A(r5, r6)
        L_0x029b:
            java.lang.String r5 = "null_config_session"
            if (r10 == 0) goto L_0x030e
            android.os.SystemClock.elapsedRealtime()
            android.os.Debug.getNativeHeapAllocatedSize()
            java.lang.String r6 = "logFirstFrameFinished1"
            boolean r6 = r4.A0C(r6)
            if (r6 != 0) goto L_0x0305
            if (r3 == 0) goto L_0x02b5
            java.lang.String r5 = r3.A07
            if (r5 != 0) goto L_0x02b5
            java.lang.String r5 = ""
        L_0x02b5:
            X.6dv r7 = r4.A0a
            r6 = 5
            r7.markPoint(r0, r6, r5)
        L_0x02bb:
            long r7 = r4.A02
            r0 = 1
            long r7 = r7 + r0
            r4.A02 = r7
            r5 = 10
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x02ea
            r0 = 16
        L_0x02ca:
            r4.A06(r3, r0)
            r4.A05(r3, r0)
        L_0x02d0:
            X.82G r1 = r4.A0l
            if (r10 == 0) goto L_0x02e6
            if (r1 == 0) goto L_0x02e6
            if (r3 == 0) goto L_0x02e6
            boolean r0 = r4.A0N
            if (r0 != 0) goto L_0x02e3
            r4.A0N = r2
            java.lang.String r0 = r3.A0A
            r1.A06(r0)
        L_0x02e3:
            r1.A04()
        L_0x02e6:
            X.C349257zq.A01()
            return r10
        L_0x02ea:
            r5 = 30
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x02f3
            r0 = 17
            goto L_0x02ca
        L_0x02f3:
            r5 = 150(0x96, double:7.4E-322)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x02fc
            r0 = 18
            goto L_0x02ca
        L_0x02fc:
            r5 = 600(0x258, double:2.964E-321)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x02d0
            r0 = 19
            goto L_0x02ca
        L_0x0305:
            r0 = 8
            r4.A06(r3, r0)
            r4.A05(r3, r0)
            goto L_0x02bb
        L_0x030e:
            if (r3 == 0) goto L_0x0316
            java.lang.String r5 = r3.A07
            if (r5 != 0) goto L_0x0316
            java.lang.String r5 = ""
        L_0x0316:
            java.lang.String r6 = "logFirstFrameFinished2"
            boolean r6 = r4.A0C(r6)
            if (r6 != 0) goto L_0x032c
            X.6dv r11 = r4.A0a
            r15 = 2
            java.lang.String r14 = "renderer"
            java.lang.String r16 = "Render first frame failed"
            r12 = r0
            r17 = r5
            r11.endFail(r12, r14, r15, r16, r17)
            goto L_0x02bb
        L_0x032c:
            java.lang.String r6 = "logFirstFrameFinished"
            X.7rD r0 = r4.A00(r6)
            X.8tH r11 = r0.BY6()
            r12 = 10
            r15 = 2
            java.lang.String r14 = "renderer"
            java.lang.String r16 = "Render first frame failed"
            r13 = r5
            boolean r1 = r11.onFailureEvent(r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x034b
            java.lang.String r0 = r3.A04
        L_0x0346:
            A0B(r1, r6, r0)
            goto L_0x02bb
        L_0x034b:
            java.lang.String r0 = "null_config"
            goto L_0x0346
        L_0x034e:
            java.lang.String r5 = r3.A0A
            goto L_0x0291
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361848gv.DAo(X.8so, long):boolean");
    }

    public final void DpU(int i, int i2) {
        boolean z;
        this.A01 = i;
        this.A00 = i2;
        if (this.A0n) {
            this.A0Z.EFC(i, i2);
            z = false;
        } else {
            z = true;
        }
        this.A0P = z;
    }

    public final void DpY(C345557ti r3) {
        this.A0h.A03 = true;
    }

    public final void DpZ(RectF rectF) {
        DpU(this.A01, this.A00);
    }

    public final void EUE(C368798tL r3) {
        C368798tL r1 = this.A0c;
        r1.A00 = r3.A00;
        r1.A01 = r3.A01;
    }

    public final void EiW(C344847sW r3) {
        C344847sW r1 = this.A0B;
        if (r3 != r1) {
            if (r1 != null) {
                r1.FIv(this, C344877sZ.MSQRD_EFFECT);
                r1.FIv(this, C344877sZ.WARM_UP_EFFECT);
                r1.FIv(this, C344877sZ.INPUT_RESET);
                r1.FIv(this, C344877sZ.WARM_UP_RENDER_SESSION);
            }
            if (r3 != null) {
                r3.EBc(this, C344877sZ.MSQRD_EFFECT);
                r3.EBc(this, C344877sZ.WARM_UP_EFFECT);
                r3.EBc(this, C344877sZ.INPUT_RESET);
                r3.EBc(this, C344877sZ.WARM_UP_RENDER_SESSION);
            }
            if (this.A0m) {
                AnonymousClass9RX.A01(this, this.A0B);
                AnonymousClass9RX.A00(this, r3);
                if (this.A0n) {
                    A0A(r3);
                }
            }
            this.A0B = r3;
        }
    }

    public final boolean EtX() {
        return false;
    }

    public final boolean isEnabled() {
        if (!this.A0q || !this.A0m) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8tK, java.lang.Object] */
    public C361848gv(Context context, C344227rW r4, C368698tB r5, C368638t3 r6, C312156dv r7, C368688tA r8, Executor executor) {
        this.A0i = r8;
        this.A0g = r5;
        this.A0V = r4;
        this.A0b = r4.A00;
        this.A0j = executor;
        this.A0Z = r6;
        this.A0Y = new C368808tM(r6);
        this.A0W = new C368828tO(context, new C368818tN(r8));
        this.A0X = new C368838tP(r5, r6);
        this.A0e = new boolean[AnonymousClass8KV.values().length];
        this.A0a = r7;
        this.A0f = (ActivityManager) context.getSystemService("activity");
        hashCode();
    }

    private void A05(C371298xy r11, int i) {
        ActivityManager activityManager;
        String str;
        String str2;
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance != null && (activityManager = this.A0f) != null && r11 != null && (str = r11.A07) != null) {
            int hashCode = str.hashCode();
            if (qPLInstance.isMarkerOn(16323880, hashCode)) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                Runtime runtime = Runtime.getRuntime();
                long freeMemory = runtime.totalMemory() - runtime.freeMemory();
                long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
                MarkerEditor withMarker = qPLInstance.withMarker(16323880, hashCode);
                switch (i) {
                    case 4:
                        str2 = "effect_setting_started";
                        break;
                    case 5:
                        str2 = "effect_setting_finished";
                        break;
                    case 6:
                        str2 = "effect_setting_failed";
                        break;
                    case 7:
                        str2 = "effect_first_frame_started";
                        break;
                    case 8:
                        str2 = "effect_first_frame_finished";
                        break;
                    case 9:
                        str2 = "effect_first_frame_async";
                        break;
                    case 10:
                        str2 = "effect_first_frame_failed";
                        break;
                    case 11:
                        str2 = "effect_getting_swapped";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        str2 = "effect_deselecting_started";
                        break;
                    case 13:
                        str2 = "effect_deselecting_finished";
                        break;
                    case 14:
                        str2 = "effect_new_selection_requested";
                        break;
                    case 15:
                        str2 = "low_on_memory";
                        break;
                    case 16:
                        str2 = "effect_frame_10";
                        break;
                    case 17:
                        str2 = "effect_frame_30";
                        break;
                    case EglBase14Impl.EGLExt_SDK_VERSION:
                        str2 = "effect_frame_150";
                        break;
                    default:
                        str2 = "effect_frame_600";
                        break;
                }
                withMarker.pointEditor(str2).addPointData("java_heap", freeMemory).addPointData("native_neap", nativeHeapAllocatedSize).addPointData("avail_mem", memoryInfo.availMem).addPointData("is_low_mem", memoryInfo.lowMemory).markerEditingCompleted();
            }
        }
    }

    public final void A0G(C344037rD r10) {
        hashCode();
        if (r10 != null) {
            r10.hashCode();
        }
        this.A0p = r10;
        if (r10 != null) {
            boolean z = r10 instanceof C368708tC;
            if (z) {
                0KC.A0D("FbMsqrdRenderer", "Dummy Logger used !!!");
            }
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance != null) {
                short s = 2;
                if (z) {
                    s = 3;
                }
                qPLInstance.markerGenerate(11282540, s, 1, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x017f, code lost:
        A02();
        A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0185, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x02d3, code lost:
        if (r7.equals(r0) != false) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x011a, code lost:
        A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x011d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ddr(X.C344907sc r12) {
        /*
            r11 = this;
            X.7sZ r0 = r12.CAG()
            int r0 = r0.ordinal()
            switch(r0) {
                case 3: goto L_0x018c;
                case 5: goto L_0x0186;
                case 6: goto L_0x016a;
                case 7: goto L_0x0137;
                case 8: goto L_0x0024;
                case 9: goto L_0x001c;
                case 10: goto L_0x0014;
                case 11: goto L_0x000c;
                case 12: goto L_0x011e;
                case 13: goto L_0x0111;
                case 14: goto L_0x0116;
                case 17: goto L_0x01a1;
                case 18: goto L_0x00ef;
                case 22: goto L_0x002c;
                case 26: goto L_0x02f6;
                case 27: goto L_0x02e7;
                case 30: goto L_0x00c0;
                case 31: goto L_0x003a;
                case 43: goto L_0x02eb;
                default: goto L_0x000b;
            }
        L_0x000b:
            return
        L_0x000c:
            X.6e9 r0 = r11.A05
            if (r0 == 0) goto L_0x000b
            r0.finishCapturePhoto()
            return
        L_0x0014:
            X.6e9 r0 = r11.A05
            if (r0 == 0) goto L_0x000b
            r0.capturePhoto()
            return
        L_0x001c:
            X.6e9 r0 = r11.A05
            if (r0 == 0) goto L_0x000b
            r0.stopRecording()
            return
        L_0x0024:
            X.6e9 r0 = r11.A05
            if (r0 == 0) goto L_0x000b
            r0.startRecording()
            return
        L_0x002c:
            X.8ye r12 = (X.C371588ye) r12
            X.7lD r1 = r12.A00
            if (r1 == 0) goto L_0x000b
            r11.A07 = r1
            X.8zY r0 = r11.A08
            r1.A00(r0)
            return
        L_0x003a:
            X.7mT r12 = (X.C341187mT) r12
            X.7ma r0 = r12.A00
            r0.getClass()
            X.7ma r0 = r12.A00
            X.XYx r0 = r0.A00
            if (r0 == 0) goto L_0x000b
            X.XUS r1 = X.XYZ.A00
            java.util.HashMap r0 = r0.A00
            java.lang.Object r2 = r0.get(r1)
            com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource r2 = (com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource) r2
            if (r2 == 0) goto L_0x0082
            boolean r0 = r2.isRecording()
            if (r0 != 0) goto L_0x0082
            com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource r0 = r11.A06
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r2.isRecording()
            if (r0 != 0) goto L_0x00aa
            com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource r2 = r11.A06
            X.7ma r0 = r12.A00
            X.XYx r0 = r0.A00
            java.util.HashMap r0 = r0.A00
            java.lang.Object r1 = r0.get(r1)
            r1.getClass()
            com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource r1 = (com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource) r1
            X.8zU r2 = (X.C371998zU) r2
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.B2Q r0 = r2.A00
            if (r0 == 0) goto L_0x000b
            r0.onFrameUpdate(r1)
            return
        L_0x0082:
            X.7ma r0 = r12.A00
            X.XYx r0 = r0.A00
            X.XUS r2 = X.XYZ.A02
            java.util.HashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r2)
            com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataNativeFrame r0 = (com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataNativeFrame) r0
            if (r0 == 0) goto L_0x00aa
            com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource r2 = r11.A06
            if (r2 == 0) goto L_0x00aa
            long r3 = r0.A01
            long r5 = r0.A00
            X.7ma r0 = r12.A00
            X.XYx r0 = r0.A00
            java.util.HashMap r0 = r0.A00
            java.lang.Object r7 = r0.get(r1)
            com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource r7 = (com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource) r7
            r2.updateFrame(r3, r5, r7)
            return
        L_0x00aa:
            X.7ma r0 = r12.A00
            X.XYx r0 = r0.A00
            X.XUS r1 = X.XYT.A00
            java.util.HashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x000b
            com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource r0 = r11.A06
            if (r0 == 0) goto L_0x000b
            r0.closeSession()
            return
        L_0x00c0:
            X.7mS r12 = (X.C341177mS) r12
            X.7mZ r0 = r12.A00
            r0.getClass()
            X.7mZ r0 = r12.A00
            X.XYx r0 = r0.A00
            if (r0 == 0) goto L_0x000b
            X.XUS r1 = X.XYT.A01
            java.util.HashMap r0 = r0.A00
            java.lang.Object r4 = r0.get(r1)
            r3 = r4
            com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.ARTrackableDelegate r3 = (com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.ARTrackableDelegate) r3
            if (r3 == 0) goto L_0x000b
            int[] r0 = r11.A0Q
            if (r0 == 0) goto L_0x000b
            monitor-enter(r4)
            int[] r0 = r3.A00     // Catch:{ all -> 0x0306 }
            monitor-exit(r4)
            if (r0 != 0) goto L_0x000b
            int[] r2 = r11.A0Q
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            monitor-enter(r4)
            goto L_0x02fe
        L_0x00ef:
            java.lang.Object r2 = r11.A0d
            monitor-enter(r2)
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x010e }
            r0 = 1
            r11.A0K = r0     // Catch:{ all -> 0x0109 }
            r0 = 0
            r11.A02 = r0     // Catch:{ all -> 0x0109 }
            r0 = 0
            r11.A0N = r0     // Catch:{ all -> 0x0109 }
            X.8t3 r0 = r11.A0Z     // Catch:{ all -> 0x0109 }
            r0.EIk()     // Catch:{ all -> 0x0109 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x010e }
            monitor-exit(r2)     // Catch:{ all -> 0x010e }
            return
        L_0x0109:
            r0 = move-exception
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x010e }
            throw r0     // Catch:{ all -> 0x010e }
        L_0x010e:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x010e }
            throw r1
        L_0x0111:
            X.8xz r12 = (X.C371308xz) r12
            r11.A0C = r12
            goto L_0x011a
        L_0x0116:
            X.7v9 r12 = (X.C346427v9) r12
            r11.A0D = r12
        L_0x011a:
            r11.A02()
            return
        L_0x011e:
            X.7v5 r12 = (X.C346387v5) r12
            X.ASJ r0 = r11.A09
            if (r0 == 0) goto L_0x012a
            r0.release()
            r0 = 0
            r11.A09 = r0
        L_0x012a:
            boolean r2 = r11.A0M
            boolean r1 = r12.A00
            r0 = 0
            if (r2 == r1) goto L_0x0132
            r0 = 1
        L_0x0132:
            r11.A0I = r0
            r11.A0M = r1
            return
        L_0x0137:
            X.7v8 r12 = (X.C346417v8) r12
            X.8tK r1 = r11.A0h
            if (r12 == 0) goto L_0x014a
            X.7v8 r0 = r1.A02
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x014a
            r1.A02 = r12
            r0 = 1
            r1.A03 = r0
        L_0x014a:
            X.7rW r0 = r11.A0V
            X.7r6 r1 = r0.A00
            r0 = 114(0x72, float:1.6E-43)
            boolean r0 = r1.CTO(r0)
            if (r0 == 0) goto L_0x0167
            X.8t3 r1 = r11.A0Z
            boolean r0 = r1.CJk()
            if (r0 == 0) goto L_0x0167
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r1 = r1.B0D()
            int r0 = r12.A01
            r1.setCameraSensorRotation(r0)
        L_0x0167:
            r11.A0T = r12
            goto L_0x017f
        L_0x016a:
            X.7v7 r12 = (X.C346407v7) r12
            X.8tK r1 = r11.A0h
            if (r12 == 0) goto L_0x017d
            X.7v7 r0 = r1.A00
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x017d
            r1.A00 = r12
            r0 = 1
            r1.A03 = r0
        L_0x017d:
            r11.A0R = r12
        L_0x017f:
            r11.A02()
            r11.A04()
            return
        L_0x0186:
            X.7v6 r12 = (X.C346397v6) r12
            r11.A0H(r12)
            return
        L_0x018c:
            X.7sb r12 = (X.C344897sb) r12
            java.lang.Object r2 = r11.A0d
            monitor-enter(r2)
            boolean r0 = r11.A0m     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x019c
            X.8tM r1 = r11.A0Y     // Catch:{ all -> 0x019e }
            X.ASJ r0 = r12.A00     // Catch:{ all -> 0x019e }
            r1.A00(r0)     // Catch:{ all -> 0x019e }
        L_0x019c:
            monitor-exit(r2)     // Catch:{ all -> 0x019e }
            return
        L_0x019e:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x019e }
            throw r1
        L_0x01a1:
            X.7yO r12 = (X.C348407yO) r12
            java.lang.Object r2 = r11.A0d
            monitor-enter(r2)
            X.8xy r3 = r12.A00     // Catch:{ all -> 0x02e4 }
            X.82G r4 = r12.A01     // Catch:{ all -> 0x02e4 }
            r11.hashCode()     // Catch:{ all -> 0x02e4 }
            java.lang.String r5 = "FbMsqrdRenderer"
            X.8xy r6 = r11.A0k     // Catch:{ all -> 0x02e4 }
            r8 = 0
            if (r6 == 0) goto L_0x0200
            if (r3 == 0) goto L_0x0200
            X.7rW r0 = r11.A0V     // Catch:{ all -> 0x02e4 }
            X.7r6 r1 = r0.A00     // Catch:{ all -> 0x02e4 }
            r0 = 20
            long r0 = r1.B4o(r0)     // Catch:{ all -> 0x02e4 }
            int r7 = (int) r0     // Catch:{ all -> 0x02e4 }
            r0 = 1
            if (r7 == r0) goto L_0x01f0
            r0 = 2
            if (r7 == r0) goto L_0x02b5
            r0 = 3
            if (r7 == r0) goto L_0x01eb
            r0 = 4
            if (r7 != r0) goto L_0x0200
            if (r6 == r3) goto L_0x02d5
            java.lang.Class r1 = r6.getClass()     // Catch:{ all -> 0x02e4 }
            java.lang.Class r0 = r3.getClass()     // Catch:{ all -> 0x02e4 }
            if (r1 != r0) goto L_0x0200
            boolean r0 = r6.A00(r3)     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x0200
            java.lang.String r1 = r6.A01     // Catch:{ all -> 0x02e4 }
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x02e4 }
            boolean r0 = X.2Ob.A00(r1, r0)     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x0200
            goto L_0x02d5
        L_0x01eb:
            boolean r8 = r6.A00(r3)     // Catch:{ all -> 0x02e4 }
            goto L_0x0200
        L_0x01f0:
            java.lang.String r1 = r6.A0A     // Catch:{ all -> 0x02e4 }
            java.lang.String r0 = r3.A0A     // Catch:{ all -> 0x02e4 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x0200
            java.lang.String r7 = r6.A0B     // Catch:{ all -> 0x02e4 }
            java.lang.String r0 = r3.A0B     // Catch:{ all -> 0x02e4 }
            goto L_0x02cf
        L_0x0200:
            r1 = 1
            if (r8 == 0) goto L_0x0209
            if (r6 != 0) goto L_0x02d5
            java.lang.String r0 = "null"
            goto L_0x02d9
        L_0x0209:
            r11.A0L = r1     // Catch:{ all -> 0x02e4 }
            r6 = 0
            if (r3 == 0) goto L_0x029f
            java.lang.String r0 = r3.A06     // Catch:{ all -> 0x02e4 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02e4 }
            if (r0 != 0) goto L_0x029f
            X.8xy r5 = r11.A0k     // Catch:{ all -> 0x02e4 }
            java.lang.String r0 = "setMsqrdConfig-swapping"
            r11.A09(r5, r6, r0, r1)     // Catch:{ all -> 0x02e4 }
            java.lang.String r0 = "setMsqrdConfig1"
            boolean r0 = r11.A0C(r0)     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x022c
            r0 = 4
            r11.A06(r3, r0)     // Catch:{ all -> 0x02e4 }
            r11.A05(r3, r0)     // Catch:{ all -> 0x02e4 }
        L_0x022c:
            java.lang.String r10 = r3.A07     // Catch:{ all -> 0x02e4 }
            if (r10 == 0) goto L_0x0256
            java.lang.String r0 = "setMsqrdConfig2"
            boolean r0 = r11.A0C(r0)     // Catch:{ all -> 0x02e4 }
            if (r0 != 0) goto L_0x0256
            X.6dv r5 = r11.A0a     // Catch:{ all -> 0x02e4 }
            r0 = 16321564(0xf90c1c, float:2.2871383E-38)
            long r6 = r5.getInstanceIdWithString(r0, r10)     // Catch:{ all -> 0x02e4 }
            r0 = 2
            r5.markPoint(r6, r0, r10)     // Catch:{ all -> 0x02e4 }
            java.lang.String r0 = "setMsqrdConfig"
            X.7rD r0 = r11.A00(r0)     // Catch:{ all -> 0x02e4 }
            boolean r0 = r0 instanceof X.C368708tC     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x025d
            java.lang.String r9 = "true"
        L_0x0251:
            java.lang.String r8 = "is_fbcameralogger_dummy"
            r5.annotate(r6, r8, r9, r10)     // Catch:{ all -> 0x02e4 }
        L_0x0256:
            r11.A0k = r3     // Catch:{ all -> 0x02e4 }
            r11.A0l = r4     // Catch:{ all -> 0x02e4 }
            r11.A0m = r1     // Catch:{ all -> 0x02e4 }
            goto L_0x0260
        L_0x025d:
            java.lang.String r9 = "false"
            goto L_0x0251
        L_0x0260:
            if (r4 == 0) goto L_0x0265
            r4.A03()     // Catch:{ all -> 0x02e4 }
        L_0x0265:
            java.lang.String r0 = r3.A0A     // Catch:{ all -> 0x02e4 }
            r11.A0E = r0     // Catch:{ all -> 0x02e4 }
            java.lang.String r0 = r3.A0B     // Catch:{ all -> 0x02e4 }
            r11.A0F = r0     // Catch:{ all -> 0x02e4 }
            boolean r0 = r11.A0n     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x027b
            X.7sW r0 = r11.A0B     // Catch:{ all -> 0x02e4 }
            X.AnonymousClass9RX.A00(r11, r0)     // Catch:{ all -> 0x02e4 }
            X.82G r0 = r11.A0l     // Catch:{ all -> 0x02e4 }
            r11.A07(r3, r0)     // Catch:{ all -> 0x02e4 }
        L_0x027b:
            boolean r0 = r11.A0M     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x02e2
            X.8tR r3 = r11.A0A     // Catch:{ all -> 0x02e4 }
            if (r3 != 0) goto L_0x028f
            X.8tS r0 = new X.8tS     // Catch:{ all -> 0x02e4 }
            r0.<init>(r11)     // Catch:{ all -> 0x02e4 }
            X.8tR r3 = new X.8tR     // Catch:{ all -> 0x02e4 }
            r3.<init>(r0)     // Catch:{ all -> 0x02e4 }
            r11.A0A = r3     // Catch:{ all -> 0x02e4 }
        L_0x028f:
            java.util.Map r1 = r3.A03     // Catch:{ all -> 0x02e4 }
            X.8tU r0 = r3.A01     // Catch:{ all -> 0x02e4 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x02e4 }
            X.X9O r0 = (X.X9O) r0     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x02e2
            r0.ELj()     // Catch:{ all -> 0x02e4 }
            goto L_0x02e2
        L_0x029f:
            r1 = 121(0x79, float:1.7E-43)
            X.7r6 r0 = r11.A0b     // Catch:{ all -> 0x02e4 }
            boolean r0 = r0.CTO(r1)     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x02af
            r11.A03()     // Catch:{ all -> 0x02e4 }
        L_0x02ac:
            r11.A0k = r6     // Catch:{ all -> 0x02e4 }
            goto L_0x02e2
        L_0x02af:
            X.8xy r0 = r11.A0k     // Catch:{ all -> 0x02e4 }
            r11.A08(r0, r6)     // Catch:{ all -> 0x02e4 }
            goto L_0x02ac
        L_0x02b5:
            java.lang.String r7 = r6.A07     // Catch:{ all -> 0x02e4 }
            if (r7 == 0) goto L_0x0200
            java.lang.String r1 = r6.A0A     // Catch:{ all -> 0x02e4 }
            java.lang.String r0 = r3.A0A     // Catch:{ all -> 0x02e4 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x0200
            java.lang.String r1 = r6.A0B     // Catch:{ all -> 0x02e4 }
            java.lang.String r0 = r3.A0B     // Catch:{ all -> 0x02e4 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x0200
            java.lang.String r0 = r3.A07     // Catch:{ all -> 0x02e4 }
        L_0x02cf:
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x0200
        L_0x02d5:
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x02e4 }
        L_0x02d9:
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x02e4 }
            java.lang.String r0 = "Effect already set, current=%s"
            X.0KC.A0O(r5, r0, r1)     // Catch:{ all -> 0x02e4 }
        L_0x02e2:
            monitor-exit(r2)     // Catch:{ all -> 0x02e4 }
            return
        L_0x02e4:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02e4 }
            throw r1
        L_0x02e7:
            r0 = 1
            r11.A0O = r0
            return
        L_0x02eb:
            java.lang.Object r0 = r11.A0d
            monitor-enter(r0)
            r11.A01()     // Catch:{ all -> 0x02f3 }
            monitor-exit(r0)     // Catch:{ all -> 0x02f3 }
            return
        L_0x02f3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02f3 }
            throw r1
        L_0x02f6:
            java.lang.String r0 = "getConfig"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x02fe:
            int[] r0 = new int[]{r1, r0}     // Catch:{ all -> 0x0306 }
            r3.A00 = r0     // Catch:{ all -> 0x0306 }
            monitor-exit(r4)
            return
        L_0x0306:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361848gv.Ddr(X.7sc):void");
    }

    public final void Dpb() {
        A03();
    }
}
