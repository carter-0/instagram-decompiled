package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4Ms  reason: invalid class name and case insensitive filesystem */
public final class C263624Ms {
    public static final Handler A0b = new Handler(Looper.getMainLooper());
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = -1;
    public View A04;
    public AnonymousClass4NB A05;
    public C67664Mru A06;
    public C70827OMz A07;
    public AnonymousClass4OI A08;
    public C263544Mk A09;
    public String A0A;
    public boolean A0B;
    public AudioManager A0C;
    public AnonymousClass4OK A0D;
    public final C263574Mn A0E;
    public final AnonymousClass4N8 A0F;
    public final C263464Mc A0G;
    public final AnonymousClass4MX A0H;
    public final C263634Mt A0I;
    public final HeroPlayerSetting A0J;
    public final HashMap A0K;
    public final HashMap A0L;
    public final AtomicBoolean A0M = new AtomicBoolean(false);
    public final AtomicBoolean A0N = new AtomicBoolean(false);
    public final AtomicBoolean A0O = new AtomicBoolean(false);
    public final AtomicReference A0P = new AtomicReference("Unset");
    public final AtomicReference A0Q = new AtomicReference("Unset");
    public final AtomicReference A0R = new AtomicReference(Float.valueOf(0.0f));
    public final Context A0S;
    public final Handler A0T;
    public final Looper A0U;
    public final AnonymousClass4MZ A0V;
    public final C263444Ma A0W;
    public final C263524Mi A0X;
    public final Runnable A0Y;
    public final AtomicBoolean A0Z = new AtomicBoolean(false);
    public volatile AnonymousClass4OJ A0a;

    public C263624Ms(Context context, Handler handler, Looper looper, C263534Mj r19, C263574Mn r20, C263464Mc r21, C263484Me r22, AnonymousClass4MZ r23, C263444Ma r24, AnonymousClass4MX r25, C263614Mr r26, C263524Mi r27, C263504Mg r28, HeroPlayerSetting heroPlayerSetting, C263544Mk r30) {
        Context context2 = context;
        this.A0S = context2;
        this.A0H = r25;
        this.A0V = r23;
        this.A0W = r24;
        C263574Mn r4 = r20;
        this.A0E = r4;
        C263524Mi r10 = r27;
        this.A0X = r10;
        this.A09 = r30;
        AtomicInteger atomicInteger = C263634Mt.A0b;
        Handler handler2 = handler;
        HeroPlayerSetting heroPlayerSetting2 = heroPlayerSetting;
        Looper looper2 = looper;
        C263634Mt r6 = new C263634Mt(handler2, looper2, r26, r10, new C263644Mu(this), (274) null, r28, heroPlayerSetting2);
        this.A0I = r6;
        0KC.A0C("GrootExperimentConfig", "UNSUPPORTED");
        AnonymousClass4N8 r0 = AnonymousClass4N8.A00;
        0qQ.A07(r0);
        this.A0F = r0;
        this.A0A = "NOT_IN_REUSE";
        this.A0Y = new AnonymousClass4N9(this);
        this.A0L = new HashMap();
        this.A0K = new HashMap();
        if (r20 != null) {
            r4.ADZ(r6);
        }
        Looper looper3 = handler2.getLooper();
        this.A0U = looper3;
        if (!heroPlayerSetting2.A2q) {
            this.A0C = (AudioManager) context2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        }
        if (!heroPlayerSetting2.A1T) {
            0qQ.A0A(looper2);
            this.A07 = new C70827OMz(new Handler(looper2), r19, this, r22, heroPlayerSetting2);
        }
        this.A0J = heroPlayerSetting2;
        this.A0T = handler2;
        if (!heroPlayerSetting2.A1Y) {
            this.A06 = new C67664Mru(looper3, this, this);
        }
        C263464Mc r02 = r21;
        this.A0G = r02;
        if (r02.A01) {
            this.A05 = new AnonymousClass4NB(A0b, new AnonymousClass4NA(this), heroPlayerSetting2);
        }
        synchronized (this) {
        }
    }

    public final void A0A(ViewGroup viewGroup, Integer num) {
        0qQ.A0B(viewGroup, 0);
        C263544Mk r1 = this.A09;
        Context context = viewGroup.getContext();
        0qQ.A07(context);
        View AMc = r1.AMc(context, this, this);
        this.A04 = AMc;
        if (AMc != null) {
            AMc.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        View view = this.A04;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A04);
            }
        }
        if (num != null) {
            viewGroup.addView(this.A04, num.intValue());
        } else {
            viewGroup.addView(this.A04);
        }
    }

    public final void A0C(AnonymousClass4OI r8) {
        AnonymousClass4OL A062;
        this.A08 = r8;
        String str = r8.A0K.A0G;
        this.A0a = new AnonymousClass4OJ(this.A0U, this, this.A0V, this.A0W, str);
        this.A0D = new AnonymousClass4OK(str);
        if (!(!this.A0G.A00 || str == null || (A062 = A06(r8)) == null)) {
            this.A09.ACD(A062);
            AnonymousClass4OJ r1 = this.A0a;
            if (r1 != null) {
                AnonymousClass4OJ.A00(r1, new C292335im(r1, A062));
            }
        }
        this.A0I.A0E(r8);
        C70827OMz oMz = this.A07;
        if (oMz != null) {
            oMz.A05.set(1);
        }
    }

    public final void A0E(String str, float f) {
        C70827OMz oMz;
        if (f <= 0.0f) {
            C70827OMz oMz2 = this.A07;
            if (oMz2 != null) {
                oMz2.A00();
            }
            f = 0.0f;
        } else if (this.A0N.get() && (oMz = this.A07) != null) {
            oMz.A01();
        }
        this.A0R.set(Float.valueOf(f));
        this.A0I.A0G(str, f);
    }

    public static final void A01(C263624Ms r11, String str, boolean z) {
        String str2;
        C263634Mt r1 = r11.A0I;
        r1.A0F(str);
        boolean z2 = r11.A0N.get();
        A03(r11, z);
        if (z2) {
            AnonymousClass4MX r3 = r11.A0H;
            long A082 = (long) ((int) r1.A08());
            C297475ro r4 = C297475ro.A03;
            0qQ.A0A(r4);
            AnonymousClass4OI r0 = r11.A08;
            if (r0 == null || (str2 = r0.A07) == null) {
                str2 = "";
            }
            r3.Dxc(r4, str2, A082, 0, false);
        }
    }

    public static final void A02(C263624Ms r2, boolean z) {
        if (r2.A0Z.compareAndSet(!z, z)) {
            A0b.post(new C40972AmI(r2, z));
        }
    }

    public static final void A03(C263624Ms r3, boolean z) {
        C70827OMz oMz;
        r3.A0N.set(false);
        if (z && (oMz = r3.A07) != null) {
            oMz.A00();
        }
        A02(r3, false);
        C67664Mru mru = r3.A06;
        if (mru != null) {
            C67664Mru.A00(mru);
            mru.removeMessages(2);
            mru.A03 = 0;
            mru.A01.set(C69269NiV.UNKNOWN_OR_UNSET);
        }
    }

    public final int A04() {
        long j;
        C263634Mt r2 = this.A0I;
        C263684My r1 = (C263684My) r2.A0N.get();
        if (r2.A0I()) {
            j = r1.A02;
        } else {
            j = 0;
        }
        return (int) j;
    }

    public final int A05() {
        long j;
        C263634Mt r1 = this.A0I;
        if (r1.A0I()) {
            j = ((C263674Mx) r1.A0B.get()).A0J;
        } else {
            j = 0;
        }
        return (int) j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
        r1 = r0.A0J;
        r3 = r8.A0K.A0G;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4OL A06(X.AnonymousClass4OI r8) {
        /*
            r7 = this;
            X.4Mt r5 = r7.A0I
            r6 = 0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "trySwitchToWarmupPlayer"
            X.C263634Mt.A05(r5, r0, r1)
            r4 = 0
            r5.A0W = r4
            r5.A0R = r6
            X.4Mg r0 = r5.A06
            X.274 r0 = r0.A00()
            if (r0 == 0) goto L_0x003c
            X.2BM r1 = r0.A0J
            X.3uU r0 = r8.A0K
            java.lang.String r3 = r0.A0G
            X.4OL r2 = X.2BM.A01(r1, r3)
            if (r2 == 0) goto L_0x003c
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "found warmup player"
            X.C263634Mt.A05(r5, r0, r1)
            android.os.Handler r1 = r5.A0E
            r0 = 21
            android.os.Message r0 = r1.obtainMessage(r0, r2)
            r1.sendMessage(r0)
            r5.A0W = r3
            int r0 = r2.A00
            r5.A0R = r0
            return r2
        L_0x003c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263624Ms.A06(X.4OI):X.4OL");
    }

    public final void A07() {
        C70827OMz oMz;
        if (((Number) this.A0R.get()).floatValue() > 0.0f && (oMz = this.A07) != null) {
            oMz.A01();
        }
        this.A0I.A0B();
        this.A0N.set(true);
        this.A0O.set(false);
        "unknown".equals("updated");
    }

    public final void A08() {
        this.A09.BdH();
        AnonymousClass4OJ r4 = this.A0a;
        if (r4 != null) {
            27B.A01("GrootPlayerLogger", "PlayerId %d disableHeartbeat for vid %s ", new Object[]{Long.valueOf(r4.A01.A0I.A0S), r4.A04});
            r4.A05.set(true);
        }
        C263634Mt r42 = this.A0I;
        if (r42.A0J() || this.A0N.get()) {
            27B.A01("GrootPlayer", "Calling release while state is playing", new Object[0]);
        }
        C263574Mn r0 = this.A0E;
        0qQ.A0A(r0);
        r0.FIR();
        C263634Mt.A05(r42, "release", new Object[0]);
        Handler handler = r42.A0E;
        handler.sendMessage(handler.obtainMessage(8));
        A03(this, true);
        this.A0O.set(false);
        this.A0R.set(Float.valueOf(0.0f));
        C70827OMz oMz = this.A07;
        if (oMz != null) {
            oMz.A05.set(1);
            oMz.A00();
        }
        this.A0L.clear();
        this.A0K.clear();
        this.A09.Dd6();
    }

    public final void A09(ViewGroup viewGroup) {
        ViewParent viewParent;
        View view;
        ViewParent parent;
        View view2 = this.A04;
        if (!(view2 == null || (parent = view2.getParent()) == viewGroup)) {
            this.A0H.E06(new C284815Oa(C266464Yz.A12, AnonymousClass5OZ.GROOT_INFRA, StringFormatUtil.formatStrLocaleSafe("mPlayerView's parent %s is not consistent with viewGroup %s passed in detachPlayerView", 0KF.A00(parent), 0KF.A00(viewGroup))));
        }
        View view3 = this.A04;
        if (view3 != null) {
            viewParent = view3.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent == viewGroup && (view = this.A04) != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(this.A04);
            }
        }
        this.A09.D8W(viewGroup);
    }

    public final void A0B(AnonymousClass4NN r3) {
        C263634Mt r0 = this.A0I;
        synchronized (r0.A0K) {
            r0.A02 = r3;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.video.heroplayer.client.HeroClientResultReceiver, java.lang.Object, android.os.ResultReceiver] */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.facebook.video.heroplayer.client.HeroClientResultReceiver, java.lang.Object, android.os.ResultReceiver] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(java.lang.Runnable r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x0054
            X.4Mt r3 = r8.A0I
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r4 = r3.A0J
            monitor-enter(r4)
            X.WiQ r5 = new X.WiQ     // Catch:{ all -> 0x0051 }
            r5.<init>(r3)     // Catch:{ all -> 0x0051 }
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "releaseSurface"
            X.C263634Mt.A05(r3, r0, r1)     // Catch:{ all -> 0x0051 }
            r0 = 0
            com.facebook.video.heroplayer.client.HeroClientResultReceiver r2 = new com.facebook.video.heroplayer.client.HeroClientResultReceiver     // Catch:{ all -> 0x0051 }
            r2.<init>(r0)     // Catch:{ all -> 0x0051 }
            r2.A00 = r5     // Catch:{ all -> 0x0051 }
            android.os.Handler r1 = r3.A0E     // Catch:{ all -> 0x0051 }
            r0 = 7
            android.os.Message r0 = r1.obtainMessage(r0, r2)     // Catch:{ all -> 0x0051 }
            r1.sendMessage(r0)     // Catch:{ all -> 0x0051 }
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r3.A08     // Catch:{ all -> 0x0051 }
            boolean r0 = r0.A3F     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x003d
            r0 = 2000(0x7d0, double:9.88E-321)
            r4.wait(r0)     // Catch:{ InterruptedException -> 0x0036 }
            goto L_0x003d
        L_0x0036:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0051 }
            r0.interrupt()     // Catch:{ all -> 0x0051 }
        L_0x003d:
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "releaseSurface time: %d"
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            X.C263634Mt.A05(r3, r2, r0)
            return
        L_0x0051:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            throw r0
        L_0x0054:
            X.4Mt r4 = r8.A0I
            X.5yx r3 = new X.5yx
            r3.<init>(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "releaseSurface"
            X.C263634Mt.A05(r4, r0, r1)
            r0 = 0
            com.facebook.video.heroplayer.client.HeroClientResultReceiver r2 = new com.facebook.video.heroplayer.client.HeroClientResultReceiver
            r2.<init>(r0)
            r2.A00 = r3
            android.os.Handler r1 = r4.A0E
            r0 = 7
            android.os.Message r0 = r1.obtainMessage(r0, r2)
            r1.sendMessage(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263624Ms.A0D(java.lang.Runnable):void");
    }

    public static final void A00(C263624Ms r7, String str, long j, long j2) {
        String valueOf = String.valueOf(j);
        String valueOf2 = String.valueOf(j2);
        HashMap hashMap = new HashMap(3);
        hashMap.put("start_stall_reason", str);
        hashMap.put("exo_start_stall", valueOf);
        hashMap.put("start_stall", valueOf2);
        0qQ.A07(Collections.unmodifiableMap(hashMap));
        C377129Kq r1 = new C377129Kq(r7, 41);
        if (!r7.A0J.A1V) {
            r1.invoke();
        }
    }
}
