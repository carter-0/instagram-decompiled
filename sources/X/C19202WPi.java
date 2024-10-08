package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.view.MotionEvent;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.facebook.gputimer.GPUTimerImpl;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.WPi  reason: case insensitive filesystem */
public final class C19202WPi implements AnonymousClass0iw, C340397lC {
    public static final String __redex_internal_original_name = "IgMediaPipelineControllerImpl";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public SurfaceTexture A05;
    public HandlerThread A06;
    public C18660VwH A07;
    public C3496081a A08;
    public boolean A09;
    public final Context A0A;
    public final C344037rD A0B;
    public final C340307l3 A0C;
    public final XBS A0D;
    public final C17895Vhm A0E;
    public final A7S A0F;
    public final C344227rW A0G;
    public final C340407lD A0H;
    public final C341047mF A0I;
    public final C344897sb A0J = new Object();
    public final C3496381d A0K;
    public final UserSession A0L;
    public final String A0M;
    public volatile C341427mr A0N;
    public volatile boolean A0O;
    public volatile boolean A0P;

    public static synchronized void A01(C19202WPi wPi) {
        int i;
        synchronized (wPi) {
            if (wPi.A05 != null && wPi.A04 > 0 && wPi.A03 > 0 && wPi.A07 != null) {
                if (!wPi.A0O) {
                    C17895Vhm vhm = wPi.A0E;
                    vhm.A00(wPi.A05, wPi.A04, wPi.A03);
                    int i2 = wPi.A01;
                    if (i2 > 0 && (i = wPi.A00) > 0) {
                        XBS xbs = vhm.A04;
                        xbs.EQR(i2, i);
                        C18660VwH vwH = (C18660VwH) vhm.A05.get();
                        if (vwH != null) {
                            vwH.A03(xbs.CE6(), xbs);
                        }
                        A7S a7s = wPi.A0F;
                        int i3 = wPi.A02;
                        A97 a97 = a7s.A04;
                        if (i3 != a97.A00) {
                            a97.A00 = i3;
                        }
                        a97.A00();
                    }
                    WG9.A00(wPi.A07.A0J, true, 32);
                    C18660VwH vwH2 = wPi.A07;
                    vwH2.A06(AnonymousClass05K.A00);
                    WG9.A01(vwH2.A0J, new Object[0], 6);
                    wPi.A0O = true;
                    wPi.A09 = false;
                    wPi.A0K.onResumed();
                } else if (wPi.A09) {
                    wPi.A0E.A00(wPi.A05, wPi.A04, wPi.A03);
                    wPi.A09 = false;
                }
            }
        }
    }

    public final synchronized void A02() {
        this.A0O = false;
        C18660VwH vwH = this.A07;
        if (vwH != null) {
            vwH.A02();
        }
        if (this.A0N != null) {
            this.A0N.A05();
        }
        this.A0K.onPaused();
        C18660VwH vwH2 = this.A07;
        if (vwH2 != null) {
            WG9.A00(vwH2.A0J, false, 32);
        }
        this.A0E.A04.onCameraClosed();
        C40169AUj aUj = this.A0F.A04.A04;
        synchronized (aUj) {
            if (aUj.A00 != null) {
                aUj.A00 = null;
                aUj.A01 = false;
            }
        }
    }

    public final synchronized void AOq(boolean z) {
        if (!this.A0P) {
            this.A0P = true;
            this.A0C.disconnect();
            A02();
            if (this.A0N != null) {
                this.A0N.A04();
                this.A0N = null;
            }
            C18660VwH vwH = this.A07;
            if (vwH != null) {
                vwH.A01();
                this.A07 = null;
            }
        }
    }

    public final boolean CL7(String str, String str2) {
        return true;
    }

    public final synchronized void D0A() {
        this.A0C.disconnect();
        if (this.A0N != null) {
            this.A0N.A05();
            this.A0N.A04();
            this.A0N = null;
        }
    }

    public static void A00(C19202WPi wPi) {
        if (wPi.A0N == null) {
            Context context = wPi.A0A;
            String str = wPi.A0M;
            wPi.A0N = C345247tB.A00(context, wPi.A0B, wPi.A0G.A00, str);
        }
    }

    public final void A9i(AnonymousClass8KU r2) {
        C18660VwH vwH = this.A07;
        if (vwH != null) {
            vwH.A04(r2);
        }
    }

    public final void ARO(boolean z) {
        WeakReference weakReference;
        A7S a7s = this.A0F;
        C341277mc r2 = a7s.A01;
        if (z) {
            weakReference = new WeakReference(a7s.A00);
        } else {
            WeakReference weakReference2 = r2.A00;
            if (weakReference2 != null) {
                weakReference2.clear();
                weakReference = null;
            } else {
                return;
            }
        }
        r2.A00 = weakReference;
    }

    public final GPUTimerImpl B8n() {
        C18660VwH vwH = this.A07;
        if (vwH != null) {
            return vwH.A0J.A03.A0A;
        }
        return null;
    }

    public final C341047mF C3L() {
        return this.A0I;
    }

    public final boolean DsV(MotionEvent motionEvent) {
        if (this.A0O) {
            return this.A0H.A02(motionEvent);
        }
        return false;
    }

    public final void Dza() {
        this.A0B.Egs(AnonymousClass7TF.A0b());
    }

    public final void EEM(AnonymousClass8KU r2) {
        C18660VwH vwH = this.A07;
        if (vwH != null) {
            vwH.A0J.A04(r2);
        }
    }

    public final void ELe(C344907sc r2) {
        C18660VwH vwH = (C18660VwH) this.A0F.A05.get();
        if (vwH != null) {
            vwH.A05(r2);
        }
    }

    public final void EMW(ASJ asj) {
        C344897sb r1 = this.A0J;
        r1.A00 = asj;
        C18660VwH vwH = this.A07;
        if (vwH != null) {
            vwH.A05(r1);
        }
    }

    public final void ErK(List list) {
        C18660VwH vwH = this.A07;
        if (vwH != null) {
            vwH.A07(list);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r6.A0L.DD9(7);
        r4 = (X.C14965UHd) r6.A0V.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r4 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        r4 = new X.C14965UHd(r6.A0N);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        r6.A0V = new java.lang.ref.WeakReference(r4);
        r0 = X.C392439uo.A00(r8, r6.A03.BHc(), r6.A03.BHR());
        r1 = r0.A01;
        r0 = r0.A00;
        r4.A02 = r1;
        r4.A01 = r0;
        r4.A09 = false;
        r2 = r6.A0J;
        r1 = new java.util.ArrayList(1);
        r1.add(r4);
        X.WG9.A00(r2, r1, 8);
        r2 = new X.C17813VgQ(r3, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0099, code lost:
        if (r4.A06 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
        r2.A00(new java.lang.IllegalStateException("savePhoto called while already in the process of saving"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a5, code lost:
        r3.D16();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        if (r4.A04 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ad, code lost:
        r4.A08 = new java.lang.ref.WeakReference((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b4, code lost:
        r4.A04 = null;
        r4.A06 = new X.VLI(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Eza(X.XBR r10) {
        /*
            r9 = this;
            X.7rD r4 = r9.A0B
            java.lang.String r3 = "IgMediaPipelineControllerImpl"
            int r1 = r9.hashCode()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.C363798kM.A00(r4, r0, r3, r1)
            X.VwH r6 = r9.A07
            if (r6 == 0) goto L_0x00c1
            int r1 = r9.A04
            int r0 = r9.A03
            X.8qr r8 = new X.8qr
            r8.<init>(r1, r0)
            r5 = 0
            X.WG0 r3 = new X.WG0
            r3.<init>(r10, r9)
            r2 = 0
            r7 = 1
            X.8n3 r0 = r6.A03
            if (r0 != 0) goto L_0x0033
            java.lang.String r2 = "Cannot take snapshot. mInput is null"
            r1 = 30000(0x7530, float:4.2039E-41)
            X.UOx r0 = new X.UOx
            r0.<init>((int) r1, (java.lang.String) r2)
            r3.D0y(r0)
            return
        L_0x0033:
            java.lang.Object r4 = r6.A0P
            monitor-enter(r4)
            boolean r0 = r6.A0W     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0048
            java.lang.String r2 = "Already taking preview photo."
            r1 = 10000(0x2710, float:1.4013E-41)
            X.9dR r0 = new X.9dR     // Catch:{ all -> 0x00be }
            r0.<init>((int) r1, (java.lang.String) r2)     // Catch:{ all -> 0x00be }
            r3.D0y(r0)     // Catch:{ all -> 0x00be }
            monitor-exit(r4)     // Catch:{ all -> 0x00be }
            return
        L_0x0048:
            r6.A0W = r7     // Catch:{ all -> 0x00be }
            monitor-exit(r4)     // Catch:{ all -> 0x00be }
            r1 = 7
            X.7rD r0 = r6.A0L
            r0.DD9(r1)
            java.lang.ref.WeakReference r0 = r6.A0V
            java.lang.Object r4 = r0.get()
            X.UHd r4 = (X.C14965UHd) r4
            if (r4 != 0) goto L_0x0062
            X.VAo r0 = r6.A0N
            X.UHd r4 = new X.UHd
            r4.<init>(r0)
        L_0x0062:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r6.A0V = r0
            X.8n3 r0 = r6.A03
            int r1 = r0.BHc()
            X.8n3 r0 = r6.A03
            int r0 = r0.BHR()
            X.8qr r0 = X.C392439uo.A00(r8, r1, r0)
            int r1 = r0.A01
            int r0 = r0.A00
            r4.A02 = r1
            r4.A01 = r0
            r4.A09 = r2
            X.WG9 r2 = r6.A0J
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r7)
            r1.add(r4)
            r0 = 8
            X.WG9.A00(r2, r1, r0)
            X.VgQ r2 = new X.VgQ
            r2.<init>(r3, r6, r4)
            X.VLI r0 = r4.A06
            if (r0 == 0) goto L_0x00a9
            java.lang.String r1 = "savePhoto called while already in the process of saving"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            r2.A00(r0)
        L_0x00a5:
            r3.D16()
            return
        L_0x00a9:
            android.graphics.RectF r0 = r4.A04
            if (r0 == 0) goto L_0x00b4
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r4.A08 = r0
        L_0x00b4:
            r4.A04 = r5
            X.VLI r0 = new X.VLI
            r0.<init>(r2)
            r4.A06 = r0
            goto L_0x00a5
        L_0x00be:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00be }
            throw r0
        L_0x00c1:
            java.lang.String r1 = "MediaPipelineController is null"
            r0 = 10015(0x271f, float:1.4034E-41)
            X.9dR r2 = new X.9dR
            r2.<init>((int) r0, (java.lang.String) r1)
            r10.D0y(r2)
            int r1 = r9.hashCode()
            java.lang.String r0 = "high"
            X.C363808kN.A00(r2, r4, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19202WPi.Eza(X.XBR):void");
    }

    public final String getModuleName() {
        return this.A0B.BgN();
    }

    public final AudioServiceConfigurationAnnouncer Adn() {
        A00(this);
        if (this.A0N == null) {
            return null;
        }
        C341427mr r1 = this.A0N;
        AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer = r1.A05;
        if (audioServiceConfigurationAnnouncer != null) {
            return audioServiceConfigurationAnnouncer;
        }
        AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer2 = new AudioServiceConfigurationAnnouncer();
        r1.A05 = audioServiceConfigurationAnnouncer2;
        return audioServiceConfigurationAnnouncer2;
    }

    public final boolean CSz(String str) {
        return C345247tB.A01(str);
    }

    public final AudioGraphClientProvider getAudioGraphClientProvider() {
        A00(this);
        if (this.A0N != null) {
            return this.A0N.A02();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.7sb] */
    /* JADX WARNING: type inference failed for: r15v0, types: [X.VAo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object, X.9uR] */
    /* JADX WARNING: type inference failed for: r4v5, types: [X.AXP] */
    /* JADX WARNING: type inference failed for: r0v22, types: [X.7lD, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19202WPi(android.content.Context r25, android.view.View r26, X.C344227rW r27, X.C344037rD r28, X.C40183AUx r29, X.C341897nh r30, X.C340307l3 r31, X.A3V r32, X.A97 r33, X.C3496381d r34, X.C3496081a r35, com.instagram.common.session.UserSession r36, java.lang.String r37) {
        /*
            r24 = this;
            r2 = r24
            r2.<init>()
            X.7sb r0 = new X.7sb
            r0.<init>()
            r2.A0J = r0
            r0 = r37
            r2.A0M = r0
            r0 = 0
            r2.A0P = r0
            r17 = r25
            android.content.Context r8 = r17.getApplicationContext()
            r2.A0A = r8
            r1 = r36
            r2.A0L = r1
            r0 = r31
            r2.A0C = r0
            java.lang.String r0 = "window"
            java.lang.Object r3 = r8.getSystemService(r0)
            r3.getClass()
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            r0 = r35
            if (r35 != 0) goto L_0x0037
            X.WOu r0 = new X.WOu
            r0.<init>(r2)
        L_0x0037:
            r2.A08 = r0
            r12 = r27
            r2.A0G = r12
            r0 = r28
            r2.A0B = r0
            android.view.Display r0 = r3.getDefaultDisplay()
            int r16 = r0.getRotation()
            r13 = 0
            X.VMd r4 = new X.VMd
            r4.<init>(r2)
            java.lang.String r5 = "IgMediaPipelineControllerRenderHandlerThread"
            r0 = -8
            android.os.HandlerThread r0 = X.Pxf.A0J(r5, r0)
            r2.A06 = r0
            X.WG1 r11 = new X.WG1
            r11.<init>()
            android.os.Handler r9 = X.AnonymousClass7TF.A0D()
            X.VAo r15 = new X.VAo
            r15.<init>()
            android.os.HandlerThread r10 = r2.A06
            X.7rD r14 = r2.A0B
            X.VwH r7 = new X.VwH
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.7r6 r5 = r12.A00
            r0 = 86
            boolean r0 = r5.CTO(r0)
            if (r0 == 0) goto L_0x0084
            com.facebook.gputimer.GPUTimerImpl r5 = new com.facebook.gputimer.GPUTimerImpl
            r5.<init>()
            X.WG9 r0 = r7.A0J
            X.W3v r0 = r0.A03
            r0.A0A = r5
        L_0x0084:
            r7.A07 = r4
            r2.A07 = r7
            X.7lD r4 = r7.A05
            r5 = r26
            if (r4 != 0) goto L_0x0101
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r5)
            X.7lD r0 = new X.7lD
            r0.<init>()
            r0.A00 = r4
            r7.A05 = r0
        L_0x009c:
            X.WG3 r0 = new X.WG3
            r0.<init>(r7)
            r7.A00 = r0
            X.7lD r0 = r7.A05
            r2.A0H = r0
            r7 = r29
            r6 = r30
            if (r30 != 0) goto L_0x00e8
            if (r29 != 0) goto L_0x00e8
            X.AXP r4 = new X.AXP
            r4.<init>(r3)
        L_0x00b4:
            r2.A0D = r4
            X.VwH r3 = r2.A07
            X.Vhm r0 = new X.Vhm
            r0.<init>(r3, r4)
            r2.A0E = r0
            X.VwH r3 = r2.A07
            X.A7S r0 = new X.A7S
            r5 = r32
            r4 = r33
            r0.<init>(r3, r5, r4)
            r2.A0F = r0
            X.WIf r0 = new X.WIf
            r0.<init>(r7, r6, r2, r1)
            r2.A0I = r0
            r0 = r34
            r2.A0K = r0
            X.VwH r0 = r2.A07
            if (r0 == 0) goto L_0x00e7
            X.WG9 r2 = r0.A0J
            X.VLo r1 = new X.VLo
            r1.<init>()
            r0 = 30
            X.WG9.A00(r2, r1, r0)
        L_0x00e7:
            return
        L_0x00e8:
            X.UHb r19 = new X.UHb
            r19.<init>()
            boolean r23 = X.C3495180r.A01(r8)
            X.AXQ r4 = new X.AXQ
            r20 = r7
            r21 = r6
            r22 = r1
            r16 = r4
            r18 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x00b4
        L_0x0101:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r4.A01(r0)
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19202WPi.<init>(android.content.Context, android.view.View, X.7rW, X.7rD, X.AUx, X.7nh, X.7l3, X.A3V, X.A97, X.81d, X.81a, com.instagram.common.session.UserSession, java.lang.String):void");
    }
}
