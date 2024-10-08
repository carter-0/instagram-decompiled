package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.video.heroplayer.service.errorcallback.ErrorCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4OS  reason: invalid class name */
public final class AnonymousClass4OS implements Handler.Callback {
    public float A00 = 1.0f;
    public float A01;
    public int A02 = 1;
    public int A03 = 10;
    public int A04 = 1;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public Context A0F;
    public Handler A0G;
    public Handler A0H;
    public Surface A0I;
    public Surface A0J;
    public Surface A0K;
    public 29t A0L;
    public C257163wx A0M;
    public C264124Or A0N;
    public AnonymousClass4SE A0O;
    public 29n A0P;
    public C264184Ox A0Q = null;
    public AnonymousClass4T5 A0R;
    public AnonymousClass4UL A0S;
    public C266094Xn A0T = null;
    public Integer A0U = AnonymousClass05K.A0N;
    public String A0V = "";
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z = "";
    public Map A0a;
    public AtomicReference A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f = false;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public long A0l;
    public Integer A0m = null;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public final long A0q;
    public final HandlerThread A0r;
    public final C264034Oi A0s;
    public final 28T A0t;
    public final C264004Oe A0u;
    public final C264014Of A0v;
    public final HeroPlayerSetting A0w;
    public final AtomicBoolean A0x;
    public final AtomicBoolean A0y;
    public final AtomicBoolean A0z;
    public final AtomicBoolean A10;
    public final AtomicInteger A11 = new AtomicInteger();
    public final AtomicReference A12;
    public volatile C263684My A13 = C263684My.A0D;
    public volatile C263674Mx A14 = new C263674Mx();
    public volatile AnonymousClass4OI A15;
    public volatile C263994Od A16 = new C263994Od();
    public volatile AnonymousClass4SO A17;
    public volatile AnonymousClass4SG A18;
    public volatile AnonymousClass4P4 A19;
    public volatile String A1A;
    public volatile String A1B;
    public volatile boolean A1C;
    public volatile boolean A1D;
    public volatile boolean A1E;
    public volatile boolean A1F;
    public volatile boolean A1G;
    public volatile boolean A1H;

    private void A02() {
        this.A15 = null;
        this.A0d = false;
        this.A0U = AnonymousClass05K.A0N;
        this.A0o = false;
        this.A0f = false;
        this.A1F = false;
        this.A0p = false;
        this.A0j = false;
        this.A01 = 0.0f;
        this.A00 = 1.0f;
        this.A02 = 1;
        this.A0i = false;
        this.A04 = 1;
        this.A03 = 10;
        this.A09 = -1;
        this.A0c = false;
        this.A1D = false;
        this.A1C = false;
        this.A06 = 0;
        this.A05 = 0;
        this.A0A = 0;
        this.A14 = new C263674Mx();
        this.A13 = C263684My.A0D;
        AnonymousClass4P4 r1 = this.A19;
        r1.A0R.clear();
        r1.A0A.EDF();
        this.A0h = false;
        this.A0e = false;
        this.A0k = false;
        this.A0x.set(true);
        this.A0n = false;
        this.A0l = -1;
        this.A0T = null;
        this.A0Z = "";
        this.A0X = null;
        this.A0W = null;
        AnonymousClass4P4 r0 = this.A19;
        r0.A0C = null;
        r0.A04 = null;
        if (A0J(this)) {
            this.A19.A0A.EiZ(0);
        }
    }

    public static synchronized void A09(AnonymousClass4OS r2) {
        HandlerThread BIU;
        synchronized (r2) {
            A0E(r2, "restorePlaybackPriority", new Object[0]);
            if (!(r2.A0m == null || r2.A19 == null || (BIU = r2.A19.A0A.BIU()) == null)) {
                int threadId = BIU.getThreadId();
                if (Integer.valueOf(threadId) != null) {
                    try {
                        Process.setThreadPriority(threadId, r2.A0m.intValue());
                        r2.A0m = null;
                    } catch (Exception | IllegalArgumentException unused) {
                    }
                }
            }
        }
    }

    public static void A0B(AnonymousClass4OS r4, float f) {
        A0E(r4, "setVolumeInternal to: %d (x100)", Integer.valueOf((int) (100.0f * f)));
        r4.A01 = f;
        if (f > 0.0f) {
            r4.A0I(true);
        }
        AnonymousClass4P4 r0 = r4.A19;
        AnonymousClass4SA AMN = r0.A0A.AMN(r0.A0G[1]);
        AMN.A01(2);
        AMN.A02(Float.valueOf(f));
        AMN.A00();
    }

    public static void A0C(AnonymousClass4OS r4, int i) {
        A0E(r4, "setAudioUsageInternal: %d", Integer.valueOf(i));
        r4.A02 = i;
        AnonymousClass4P4 r0 = r4.A19;
        AnonymousClass4QB r2 = new AnonymousClass4QB(i);
        AnonymousClass4SA AMN = r0.A0A.AMN(r0.A0G[1]);
        AMN.A01(3);
        AMN.A02(r2);
        AMN.A00();
    }

    public static synchronized void A0D(AnonymousClass4OS r2, int i) {
        HandlerThread BIU;
        synchronized (r2) {
            A0E(r2, "downgradePlaybackPriority", new Object[0]);
            if (!(r2.A0m != null || r2.A19 == null || (BIU = r2.A19.A0A.BIU()) == null)) {
                int threadId = BIU.getThreadId();
                if (Integer.valueOf(threadId) != null) {
                    try {
                        r2.A0m = Integer.valueOf(Process.getThreadPriority(threadId));
                        Process.setThreadPriority(threadId, i);
                    } catch (Exception | IllegalArgumentException unused) {
                    }
                }
            }
        }
    }

    private void A0H(boolean z) {
        A0E(this, "resetInternal", new Object[0]);
        if (this.A1E) {
            this.A0v.E07("EXOPLAYER2_UNEXPECTED", "RESET_INTERNAL_REQUESTED_AFTER_RELEASED", "resetInternal requested after released");
        }
        A0G(false);
        HeroPlayerSetting heroPlayerSetting = this.A0w;
        if (!heroPlayerSetting.A2J) {
            A05(this.A04, SystemClock.elapsedRealtime(), false, false);
        }
        Surface surface = this.A0J;
        if (heroPlayerSetting.A31) {
            this.A0K = null;
            this.A0I = null;
            this.A0J = null;
            this.A0D = -1;
            this.A08 = -1;
            this.A19.A0A((Surface) null, true);
            this.A0I = null;
        }
        this.A0J = surface;
        this.A19.A0A.stop(true);
        this.A19.A0A.EiI(0);
        A02();
        AnonymousClass4P4 r4 = this.A19;
        AnonymousClass4SE r3 = this.A0O;
        List list = r4.A0R;
        if (list.isEmpty()) {
            AnonymousClass4SF r1 = new AnonymousClass4SF(r4);
            r4.A06 = r1;
            r4.A0A.A8z(r1);
        }
        list.add(r3);
        if (z) {
            this.A0G.removeMessages(9);
        }
    }

    public final synchronized void A0L() {
        A0E(this, "Stop player", new Object[0]);
        A07(this.A0G.obtainMessage(41), this);
    }

    public final void A0M(float f) {
        A0E(this, "Set volume", new Object[0]);
        A07(this.A0G.obtainMessage(5, Float.valueOf(f)), this);
    }

    public final void A0N(long j, boolean z) {
        A0E(this, "Play", new Object[0]);
        this.A0x.set(false);
        this.A0y.compareAndSet(false, z);
        A07(this.A0G.obtainMessage(2, new Object[]{Long.valueOf(j)}), this);
    }

    public final void A0O(Surface surface, int i, int i2) {
        A0E(this, "Set surface", new Object[0]);
        A07(this.A0G.obtainMessage(6, new Object[]{surface, Integer.valueOf(i), Integer.valueOf(i2)}), this);
    }

    public final void A0P(AnonymousClass5OZ r12, C2612448v r13) {
        ErrorCallback errorCallback;
        C2612448v r6 = r13;
        C284815Oa A0K2 = A0K(r12, r13);
        String str = A0K2.A02;
        this.A0Z = str;
        Handler handler = this.A0G;
        AnonymousClass5OZ r2 = A0K2.A01;
        String str2 = r2.A00;
        String name = A0K2.A00.name();
        String str3 = A0K2.A03;
        if (str3 == null) {
            str3 = "";
        }
        A07(handler.obtainMessage(12, new Object[]{str2, name, str, str3}), this);
        if (this.A0w.A33 && (errorCallback = AnonymousClass2CR.A01.A00) != null) {
            String name2 = r2.name();
            HashMap hashMap = new HashMap();
            AnonymousClass4OI r0 = this.A15;
            if (r0 != null) {
                C255653uU r4 = r0.A0K;
                String str4 = this.A1B;
                String str5 = this.A1A;
                hashMap.put("player_origin", r4.A0A);
                hashMap.put("play_sub_origin", r4.A0B);
                hashMap.put("video_id", r4.A0G);
                hashMap.put("is_live", String.valueOf(r4.A03()));
                hashMap.put(TraceFieldType.StreamType, C296375px.A01(this.A0U));
                hashMap.put("video_decoder", str4);
                hashMap.put("audio_decoder", str5);
            }
            errorCallback.onError(r6, name2, name, str, hashMap);
        }
    }

    public final void A0Q(AnonymousClass4OI r6) {
        C255653uU r4 = r6.A0K;
        A0E(this, "Prepare: %s", r4);
        this.A0v.DWg(r4.A0G, "prepare_player_start");
        if (this.A0w.A34 && this.A0t.A04 != null && BreakpadManager.isActive()) {
            BreakpadManager.setCustomData("last_video", "%s", Arrays.copyOf(new Object[]{r4}, 1));
        }
        this.A0x.set(true);
        A07(this.A0G.obtainMessage(1, new Object[]{r6}), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        if (r2.A1F == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018b, code lost:
        r5 = (X.AnonymousClass4PJ) r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0204  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C263674Mx A00(long r60, boolean r62) {
        /*
            r59 = this;
            r13 = 0
            r0 = -1
            r8 = 0
            r2 = r59
            r28 = r60
            if (r62 == 0) goto L_0x021f
            long r9 = r2.A09
            int r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x021f
            boolean r15 = r2.A0c
            r2.A09 = r0
            r2.A0c = r8
            r46 = r28
        L_0x0019:
            long r0 = r2.A0l
            int r3 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r3 > 0) goto L_0x0029
            X.4P4 r0 = r2.A19
            X.4R5 r0 = r0.A0A
            long r0 = r0.AzG()
            r2.A0l = r0
        L_0x0029:
            X.4P4 r0 = r2.A19
            X.4R5 r0 = r0.A0A
            android.util.SparseArray r1 = r0.Aar()
            r4 = 1
            r5 = 2
            int r0 = r1.indexOfKey(r5)
            if (r0 < 0) goto L_0x021b
            java.lang.Object r0 = r1.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            long r6 = r0.longValue()
            java.util.UUID r0 = X.AnonymousClass4T7.A04
            long r50 = com.google.android.exoplayer2.util.Util.A08(r6)
        L_0x0049:
            int r0 = r1.indexOfKey(r4)
            if (r0 < 0) goto L_0x005a
            java.lang.Object r0 = r1.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            r0.longValue()
            java.util.UUID r0 = X.AnonymousClass4T7.A04
        L_0x005a:
            X.4OI r12 = r2.A15
            X.4P4 r0 = r2.A19
            X.4R5 r0 = r0.A0A
            boolean r0 = r0.Bd1()
            if (r0 == 0) goto L_0x006c
            boolean r0 = r2.A1F
            r52 = 1
            if (r0 != 0) goto L_0x006e
        L_0x006c:
            r52 = 0
        L_0x006e:
            boolean r0 = r2.A0p
            r53 = r0
            long r0 = r2.A09
            int r3 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            r54 = 0
            if (r3 <= 0) goto L_0x007c
            r54 = 1
        L_0x007c:
            long r0 = r2.A0l
            r32 = r0
            long r0 = r2.A07
            r42 = r0
            X.4P4 r1 = r2.A19
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r1.A0Q
            boolean r0 = r0.A2k
            if (r0 == 0) goto L_0x0213
            boolean r0 = X.AnonymousClass4P4.A04(r1)
            if (r0 != 0) goto L_0x0213
            X.4R5 r0 = r1.A0A
            long r34 = r0.Atl()
        L_0x0098:
            X.4P4 r0 = r2.A19
            X.4R5 r0 = r0.A0A
            long r36 = r0.BlI()
            X.4P4 r1 = r2.A19
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r1.A0Q
            boolean r0 = r0.A2k
            if (r0 == 0) goto L_0x020b
            boolean r0 = X.AnonymousClass4P4.A04(r1)
            if (r0 != 0) goto L_0x020b
            X.4R5 r0 = r1.A0A
            long r38 = r0.AiQ()
        L_0x00b4:
            X.4P4 r0 = r2.A19
            X.4R5 r0 = r0.A0A
            long r40 = r0.AiR()
            X.4P4 r0 = r2.A19
            X.4Qa r0 = r0.A09
            if (r0 == 0) goto L_0x0208
            X.4QZ r0 = r0.A00
            X.4QW r0 = r0.Ab1()
            if (r0 == 0) goto L_0x0208
            int r0 = r0.C8e()
        L_0x00ce:
            long r0 = (long) r0
            r44 = r0
            java.lang.Integer r0 = r2.A0U
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x01f0;
                case 2: goto L_0x01f4;
                case 3: goto L_0x01f8;
                case 4: goto L_0x0200;
                case 5: goto L_0x0204;
                default: goto L_0x00da;
            }
        L_0x00da:
            java.lang.String r16 = "UNKNOWN"
        L_0x00dc:
            int r0 = r2.A06
            r20 = r0
            int r0 = r2.A05
            r21 = r0
            long r0 = r2.A0A
            r55 = r0
            X.4Xn r0 = r2.A0T
            if (r0 == 0) goto L_0x01ea
            int r6 = r0.A04
            int r1 = r0.A0E
            int r6 = r6 + r1
            int r14 = r0.A09
            int r13 = r0.A00
            int r11 = r0.A01
        L_0x00f7:
            X.4SG r0 = r2.A18
            float r0 = r0.A01
            r58 = r0
            X.4SG r0 = r2.A18
            X.4Ox r0 = r0.A0Q
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r0.A0B
            int r3 = r1.A0f
            if (r3 == r5) goto L_0x010b
            if (r3 == r4) goto L_0x010b
            int r3 = r0.A01
        L_0x010b:
            X.4SG r0 = r2.A18
            X.4Ox r0 = r0.A0Q
            X.214 r1 = r0.A05
            X.217 r0 = X.C264184Ox.A00(r1, r0)
            java.lang.String r0 = r0.A0Z
            r19 = r0
            X.4P4 r0 = r2.A19
            X.4R5 r0 = r0.A0A
            int r27 = r0.Auj()
            X.4P4 r0 = r2.A19
            if (r0 == 0) goto L_0x01e7
            X.3w6 r0 = r0.A0D
            if (r0 == 0) goto L_0x01e7
            boolean r7 = r0.A0T
        L_0x012b:
            boolean r0 = r2.A1H
            r17 = r0
            X.4SG r0 = r2.A18
            X.4Ox r1 = r0.A0Q
            X.214 r0 = r1.A05
            X.214 r5 = X.214.A05
            if (r0 == r5) goto L_0x0147
            X.214 r5 = X.214.A02
            if (r0 != r5) goto L_0x01e3
            java.lang.String r1 = r1.A06
            java.lang.String r0 = "force disable ull"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01e3
        L_0x0147:
            java.lang.String r18 = "is_eligible_for_boost"
        L_0x0149:
            X.4Mx r0 = new X.4Mx
            r22 = r6
            r23 = r14
            r24 = r13
            r25 = r11
            r26 = r3
            r30 = r32
            r32 = r42
            r42 = r44
            r44 = r9
            r48 = r55
            r55 = r15
            r56 = r7
            r57 = r17
            r15 = r0
            r17 = r19
            r19 = r58
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r53, r54, r55, r56, r57)
            X.4P4 r1 = r2.A19
            if (r1 == 0) goto L_0x0181
            X.3w6 r3 = r1.A0D
            if (r3 == 0) goto L_0x0181
            java.lang.String r1 = r3.A01
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0181
            java.lang.String r1 = r3.A01
            r0.A0L = r1
        L_0x0181:
            X.4P4 r1 = r2.A19
            X.4PL[] r1 = r1.A0G
            r5 = r1[r8]
            boolean r1 = r5 instanceof X.AnonymousClass4PI
            if (r1 == 0) goto L_0x01db
            X.4PJ r5 = (X.AnonymousClass4PJ) r5
            X.3n3 r3 = r5.A0B
            if (r3 == 0) goto L_0x01db
            X.3wB r1 = r5.A08
            if (r1 == 0) goto L_0x01db
            int r1 = r1.A0L
            boolean r1 = r3.isSREnabled(r1)
            if (r1 == 0) goto L_0x01db
        L_0x019d:
            X.4P4 r11 = r2.A19
            X.4R5 r1 = r11.A0A
            X.4TK r10 = r1.Auc()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r6 = ""
            r9 = 0
            r5 = 0
        L_0x01ae:
            int r1 = r10.A01
            if (r9 >= r1) goto L_0x0226
            X.4RX[] r3 = r10.A02
            r2 = r3[r9]
            if (r2 == 0) goto L_0x01d8
            X.4Ro r1 = r2.C98()
            if (r1 == 0) goto L_0x01d8
            X.4Ro r1 = r2.C98()
            int r1 = r1.A02
            if (r4 != r1) goto L_0x01d8
            r1 = r3[r9]
            X.3wB r3 = r1.Brg()
            if (r3 == 0) goto L_0x01d8
            int r2 = r3.A0E
            r1 = 16
            r5 = 0
            if (r2 != r1) goto L_0x01d6
            r5 = 1
        L_0x01d6:
            java.lang.String r6 = r3.A0V
        L_0x01d8:
            int r9 = r9 + 1
            goto L_0x01ae
        L_0x01db:
            if (r12 == 0) goto L_0x019d
            java.util.List r1 = r12.A0N
            r1.isEmpty()
            goto L_0x019d
        L_0x01e3:
            r18 = 0
            goto L_0x0149
        L_0x01e7:
            r7 = 0
            goto L_0x012b
        L_0x01ea:
            r6 = 0
            r14 = 0
            r13 = 0
            r11 = 0
            goto L_0x00f7
        L_0x01f0:
            java.lang.String r16 = "DASH"
            goto L_0x00dc
        L_0x01f4:
            java.lang.String r16 = "DASH_LIVE"
            goto L_0x00dc
        L_0x01f8:
            r0 = 1333(0x535, float:1.868E-42)
            java.lang.String r16 = X.C273654mx.A00(r0)
            goto L_0x00dc
        L_0x0200:
            java.lang.String r16 = "RTC_LIVE"
            goto L_0x00dc
        L_0x0204:
            java.lang.String r16 = "HLS"
            goto L_0x00dc
        L_0x0208:
            r0 = 0
            goto L_0x00ce
        L_0x020b:
            X.4R5 r0 = r1.A0A
            long r38 = r0.AiT()
            goto L_0x00b4
        L_0x0213:
            X.4R5 r0 = r1.A0A
            long r34 = r0.AuI()
            goto L_0x0098
        L_0x021b:
            r50 = -1
            goto L_0x0049
        L_0x021f:
            r9 = -1
            r46 = -1
            r15 = 0
            goto L_0x0019
        L_0x0226:
            X.4R5 r1 = r11.A0A
            X.4Rn r9 = r1.Aub()
            r3 = 0
        L_0x022d:
            int r1 = r9.A01
            if (r3 >= r1) goto L_0x0257
            com.google.common.collect.ImmutableList r2 = r9.A02
            java.lang.Object r1 = r2.get(r3)
            if (r1 == 0) goto L_0x0254
            java.lang.Object r1 = r2.get(r3)
            X.4Ro r1 = (X.C264854Ro) r1
            int r1 = r1.A02
            if (r4 != r1) goto L_0x0254
            java.lang.Object r1 = r2.get(r3)
            X.4Ro r1 = (X.C264854Ro) r1
            X.3wB[] r1 = r1.A04
            r1 = r1[r8]
            if (r1 == 0) goto L_0x0254
            java.lang.String r1 = r1.A0V
            r7.add(r1)
        L_0x0254:
            int r3 = r3 + 1
            goto L_0x022d
        L_0x0257:
            X.9Iy r1 = new X.9Iy
            r1.<init>((java.lang.String) r6, (java.util.List) r7, (boolean) r5)
            r0.A0K = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4OS.A00(long, boolean):X.4Mx");
    }

    private 1xV A01() {
        27k r4;
        Integer num;
        int A002;
        int i;
        HeroPlayerSetting heroPlayerSetting = this.A0w;
        if (heroPlayerSetting.A3U && (r4 = (27k) this.A12.get()) != null) {
            if (this.A15 == null || !this.A15.A0K.A03()) {
                if (this.A15 == null || !"fb_stories".equalsIgnoreCase(this.A15.A0K.A0A)) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A00;
                }
                int intValue = num.intValue();
                if (intValue != 0) {
                    int i2 = 16;
                    if (intValue != 1) {
                        i2 = 2;
                    }
                    A002 = 27k.A00(r4, i2);
                    i = 3;
                } else {
                    A002 = 27k.A00(r4, 6);
                    i = 7;
                }
            } else {
                A002 = 27k.A00(r4, 4);
                i = 5;
            }
            1xV r1 = new 1xV(A002, 27k.A00(r4, i));
            if (r1.A00 > 0 && r1.A01 > 0) {
                return r1;
            }
        }
        return heroPlayerSetting.A14;
    }

    private void A03() {
        if (this.A0w.A2W) {
            boolean A012 = this.A0t.A03.A01();
            boolean z = false;
            AnonymousClass4UL r2 = this.A0S;
            if (A012) {
                if (r2 == null) {
                    z = true;
                }
                if (r2 == null) {
                    r2 = new AnonymousClass4UL(this.A0F);
                    this.A0S = r2;
                }
                r2.setEnabled(true);
                A0E(this, "Setting the WifiLockManager state to %s", "enabled");
                if (z) {
                    A04(this.A04);
                }
            } else if (r2 != null) {
                r2.setEnabled(false);
                A0E(this, "Setting the WifiLockManager state to %s", "disabled");
            }
        }
    }

    private void A04(int i) {
        boolean z;
        if (this.A0R != null || this.A0S != null) {
            if (i == 1 || !(i == 2 || i == 3)) {
                z = false;
            } else {
                z = this.A19.A0A.Bd1();
            }
            AnonymousClass4T5 r1 = this.A0R;
            if (r1 != null) {
                r1.Elw(z);
            }
            AnonymousClass4UL r12 = this.A0S;
            if (r12 != null) {
                r12.Elw(z);
                A0E(this, "Setting StayAwake on WifiLockManager to: %b", Boolean.valueOf(z));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0092, code lost:
        if (r41 == false) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05(int r38, long r39, boolean r41, boolean r42) {
        /*
            r37 = this;
            r21 = 4
            r19 = r41
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r19)
            r6 = 0
            r12 = r38
            java.lang.Integer r17 = java.lang.Integer.valueOf(r12)
            r5 = 1
            r7 = r37
            boolean r0 = r7.A1F
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r7.A0o
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r20 = 3
            r1 = r18
            r0 = r17
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0, r3, r2}
            java.lang.String r0 = "onPlayerStateChanged start: play=%b, state=%d, startedPlaying=%b, isPrepared=%b"
            A0E(r7, r0, r1)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r1 = "play_when_ready"
            r0 = r18
            r4.put(r1, r0)
            java.lang.String r1 = "playback_state"
            r0 = r17
            r4.put(r1, r0)
            boolean r0 = r7.A0o
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_prepared"
            r4.put(r0, r1)
            r0 = r39
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.String r2 = "state_change_time"
            r4.put(r2, r3)
            boolean r2 = r7.A1F
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            java.lang.String r2 = "started_playing"
            r4.put(r2, r3)
            boolean r2 = r7.A1G
            if (r2 == 0) goto L_0x006e
            if (r12 != r5) goto L_0x006e
            r7.A1G = r6
            X.4Of r2 = r7.A0v
            r2.onStopped()
        L_0x006e:
            X.4OI r2 = r7.A15
            if (r2 != 0) goto L_0x007a
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "onPlayerStateChanged, play request not set yet, skip the state change"
            A0E(r7, r0, r1)
            return
        L_0x007a:
            X.4OI r2 = r7.A15
            if (r2 == 0) goto L_0x0499
            X.3uU r2 = r2.A0K
            java.lang.String r2 = r2.A0G
        L_0x0082:
            android.text.TextUtils.isEmpty(r2)
            java.lang.String r15 = ""
            r36 = r15
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = r7.A0w
            r35 = r2
            r2 = r20
            if (r12 != r2) goto L_0x0094
            r2 = 1
            if (r41 != 0) goto L_0x0095
        L_0x0094:
            r2 = 0
        L_0x0095:
            r7.A0p = r2
            r13 = 0
            if (r41 != 0) goto L_0x048e
            boolean r2 = r7.A1F
            if (r2 == 0) goto L_0x0406
            r7.A1F = r6
            X.4Mx r4 = r7.A00(r0, r5)
            long r10 = r7.A0D
            r8 = -1
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x00c3
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r10
            r7.A08 = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r2}
            java.lang.String r2 = "blackscreen detected for %d ms"
            X.28J.A02(r7, r2, r3)
            r7.A0D = r8
        L_0x00c3:
            X.4Of r2 = r7.A0v
            r22 = r2
            java.lang.String r11 = r7.A0W
            java.lang.String r10 = r7.A0X
            long r2 = r7.A08
            java.lang.String r9 = r7.A0Z
            r16 = 0
            boolean r8 = android.text.TextUtils.isEmpty(r16)
            r27 = r15
            if (r8 != 0) goto L_0x00db
            r27 = r16
        L_0x00db:
            X.4OI r8 = r7.A15
            java.lang.String r8 = r8.A07
            r31 = r42
            r24 = r11
            r25 = r10
            r26 = r9
            r28 = r8
            r29 = r2
            r23 = r4
            r22.DWV(r23, r24, r25, r26, r27, r28, r29, r31)
            X.4SG r3 = r7.A18
            boolean r2 = X.AnonymousClass4SG.A03(r3)
            if (r2 == 0) goto L_0x00fb
            X.AnonymousClass4SG.A01(r3)
        L_0x00fb:
            r7.A08 = r13
        L_0x00fd:
            r7.A0Z = r15
        L_0x00ff:
            if (r12 == r5) goto L_0x03fc
            r10 = 2
            if (r12 == r10) goto L_0x0351
            r2 = r20
            if (r12 == r2) goto L_0x0179
            r2 = r21
            if (r12 != r2) goto L_0x049c
            boolean r3 = r7.A1F
            boolean r2 = r7.A0j
            if (r2 != 0) goto L_0x0114
            r7.A1F = r6
        L_0x0114:
            X.4Mx r4 = r7.A00(r0, r5)
            if (r3 == 0) goto L_0x0133
            X.4Of r8 = r7.A0v
            java.lang.String r5 = r7.A0W
            java.lang.String r3 = r7.A0X
            X.4OI r2 = r7.A15
            java.lang.String r2 = r2.A07
            r20 = r8
            r21 = r4
            r22 = r5
            r23 = r3
            r24 = r2
            r25 = r6
            r20.D5J(r21, r22, r23, r24, r25)
        L_0x0133:
            boolean r2 = r7.A0j
            if (r2 == 0) goto L_0x0142
            boolean r2 = A0J(r7)
            if (r2 != 0) goto L_0x0142
            X.4P4 r2 = r7.A19
            r2.A09(r13, r6)
        L_0x0142:
            r3 = 10
            r7.A03 = r3
            if (r4 != 0) goto L_0x016e
            r7.A06(r0)
        L_0x014b:
            r7.A04 = r12
            r0 = r19
            r7.A0i = r0
            r7.A04(r12)
            boolean r0 = r7.A1F
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r7.A0o
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1 = r18
            r0 = r17
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0, r3, r2}
            java.lang.String r0 = "onPlayerStateChanged end: play=%b, state=%d, startedPlaying=%b, isPrepared=%b"
            X.28J.A02(r7, r0, r1)
            return
        L_0x016e:
            r7.A14 = r4
            android.os.Handler r2 = r7.A0G
            int r0 = r7.A03
            long r0 = (long) r0
            r2.sendEmptyMessageDelayed(r3, r0)
            goto L_0x014b
        L_0x0179:
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r2 = "Player is ready"
            A0E(r7, r2, r3)
            r2 = r35
            boolean r2 = r2.A1R
            if (r2 == 0) goto L_0x0192
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.A10
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x0192
            r2 = -1
            r7.A09 = r2
        L_0x0192:
            X.4P4 r2 = r7.A19
            X.4PL[] r2 = r2.A0G
            r9 = 0
            if (r2 == 0) goto L_0x01a4
            r2 = r2[r6]
            X.4PK r2 = (X.AnonymousClass4PK) r2
            int r2 = r2.A01
            if (r2 == r5) goto L_0x01a3
            if (r2 != r10) goto L_0x01a4
        L_0x01a3:
            r9 = 1
        L_0x01a4:
            X.4SG r3 = r7.A18
            boolean r2 = r3.A0J
            r8 = 0
            if (r2 == 0) goto L_0x01ae
            r3.A0J = r6
            r8 = 1
        L_0x01ae:
            boolean r2 = r7.A0o
            if (r2 != 0) goto L_0x01cd
            android.view.Surface r2 = r7.A0I
            if (r2 != 0) goto L_0x01c0
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.A10
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x01c0
            if (r9 != 0) goto L_0x01cd
        L_0x01c0:
            r7.A0o = r5
            X.4Mx r4 = r7.A00(r0, r6)
            X.4Of r3 = r7.A0v
            java.lang.String r2 = r7.A0V
            r3.DZ0(r4, r2)
        L_0x01cd:
            if (r41 == 0) goto L_0x029f
            boolean r2 = r7.A1F
            if (r2 != 0) goto L_0x029f
            r7.A1F = r5
            X.4Mx r4 = r7.A00(r0, r5)
            X.4P4 r2 = r7.A19
            X.4R5 r2 = r2.A0A
            java.lang.Integer r2 = r2.Byk()
            int r2 = r2.intValue()
            switch(r2) {
                case 1: goto L_0x0287;
                case 2: goto L_0x028b;
                case 3: goto L_0x028f;
                case 4: goto L_0x0293;
                case 5: goto L_0x0297;
                case 6: goto L_0x029b;
                default: goto L_0x01e8;
            }
        L_0x01e8:
            java.lang.String r14 = "unknown"
        L_0x01ea:
            java.lang.String r2 = "buffer_below_threshold"
            boolean r2 = r14.equals(r2)
            java.lang.String r5 = ":"
            if (r2 == 0) goto L_0x01fe
            X.1xV r2 = r7.A01()
            int r2 = r2.A00
            java.lang.String r14 = X.002.A0b(r14, r5, r2)
        L_0x01fe:
            X.4P4 r2 = r7.A19
            X.4R5 r2 = r2.A0A
            boolean r3 = r2.BIz()
            if (r3 == 0) goto L_0x0227
            java.lang.String r2 = "audio_stall"
            java.lang.String r14 = X.002.A0g(r14, r5, r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            X.4OI r2 = r7.A15
            if (r2 == 0) goto L_0x0285
            X.3uU r2 = r2.A0K
            java.lang.String r2 = r2.A0G
        L_0x021a:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2}
            java.lang.String r2 = "handleStartedPlaying isAudioStall: %s %s"
            A0E(r7, r2, r3)
        L_0x0227:
            X.4Of r2 = r7.A0v
            r16 = r2
            java.lang.String r15 = r7.A0W
            java.lang.String r13 = r7.A0X
            boolean r11 = r7.A0h
            boolean r10 = r7.A0e
            java.lang.String r5 = r7.A0Y
            long r2 = r4.A0H
            long r8 = r7.A0C
            long r2 = r2 - r8
            java.lang.String r9 = r7.A0Z
            r27 = 0
            X.4OI r8 = r7.A15
            if (r8 == 0) goto L_0x0282
            X.4OI r8 = r7.A15
            java.lang.String r8 = r8.A07
        L_0x0246:
            r22 = r15
            r23 = r13
            r24 = r14
            r25 = r5
            r26 = r9
            r28 = r8
            r29 = r2
            r31 = r11
            r32 = r10
            r20 = r16
            r21 = r4
            r20.Dmm(r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32)
            X.4P4 r2 = r7.A19
            X.4R5 r2 = r2.A0A
            r2.EXr(r6)
            r7.A0f = r6
            r2 = r36
            r7.A0Z = r2
            android.view.Surface r3 = r7.A0I
            if (r3 == 0) goto L_0x027a
            android.view.Surface r2 = r7.A0K
            if (r2 != r3) goto L_0x027a
            boolean r2 = r2.isValid()
            if (r2 != 0) goto L_0x0142
        L_0x027a:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7.A0D = r2
            goto L_0x0142
        L_0x0282:
            r8 = r36
            goto L_0x0246
        L_0x0285:
            r2 = 0
            goto L_0x021a
        L_0x0287:
            java.lang.String r14 = "null_format"
            goto L_0x01ea
        L_0x028b:
            java.lang.String r14 = "waiting_for_keys"
            goto L_0x01ea
        L_0x028f:
            java.lang.String r14 = "no_output_buffer"
            goto L_0x01ea
        L_0x0293:
            java.lang.String r14 = "surface_not_ready"
            goto L_0x01ea
        L_0x0297:
            java.lang.String r14 = "force_end"
            goto L_0x01ea
        L_0x029b:
            java.lang.String r14 = "buffer_below_threshold"
            goto L_0x01ea
        L_0x029f:
            if (r4 != 0) goto L_0x0142
            if (r8 != 0) goto L_0x0142
            X.4Mx r4 = r7.A00(r0, r5)
            android.view.Surface r5 = r7.A0K
            android.view.Surface r2 = r7.A0I
            r3 = 0
            if (r5 == r2) goto L_0x02af
            r3 = 1
        L_0x02af:
            X.4Of r2 = r7.A0v
            r2.CzG(r4, r3)
            X.4SG r11 = r7.A18
            boolean r2 = X.AnonymousClass4SG.A03(r11)
            if (r2 == 0) goto L_0x0310
            long r8 = r4.A0F
            long r5 = r4.A0E
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r13 = r11.A0S
            r2 = 20
            long r14 = r5 + r2
            int r2 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x0310
            int r2 = r11.A04
            int r2 = r2 + 1
            r11.A04 = r2
            long r2 = r11.A07
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x02e1
            long r2 = android.os.SystemClock.elapsedRealtime()
            r11.A07 = r2
        L_0x02e1:
            long r14 = android.os.SystemClock.elapsedRealtime()
            java.util.TreeMap r3 = r11.A0U
            int r2 = r13.A0d
            r20 = r3
            r21 = r2
            r22 = r5
            r24 = r8
            boolean r2 = X.27B.A04(r20, r21, r22, r24)
            if (r2 == 0) goto L_0x033a
            java.util.Deque r5 = r11.A0T
            int r2 = r5.size()
            if (r2 < r10) goto L_0x0302
            r5.poll()
        L_0x0302:
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r5.offer(r2)
        L_0x030d:
            X.AnonymousClass4SG.A01(r11)
        L_0x0310:
            X.4SO r5 = r7.A17
            boolean r2 = r5.A03
            if (r2 == 0) goto L_0x0334
            X.4ST r2 = r5.A00
            if (r2 == 0) goto L_0x0334
            int r3 = r2.A03
            if (r3 <= 0) goto L_0x0334
            java.util.Deque r5 = r5.A02
            int r2 = r5.size()
            if (r2 < r3) goto L_0x0329
            r5.poll()
        L_0x0329:
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r5.offer(r2)
        L_0x0334:
            X.4SP r2 = X.AnonymousClass4SP.A01
            monitor-enter(r2)
            monitor-exit(r2)
            goto L_0x0142
        L_0x033a:
            X.4SH r2 = r11.A0O
            java.util.List r3 = r2.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            r3.add(r2)
            X.4Ox r3 = r11.A0Q
            int r2 = r3.A02
            int r2 = r2 + 1
            r3.A02 = r2
            r3.A05()
            goto L_0x030d
        L_0x0351:
            boolean r2 = r7.A1F
            if (r2 != 0) goto L_0x035b
            r2 = r35
            boolean r2 = r2.A2e
            if (r2 == 0) goto L_0x03e4
        L_0x035b:
            X.4SG r2 = r7.A18
            boolean r2 = r2.A0J
            if (r2 != 0) goto L_0x03e4
            r7.A09 = r0
            X.4P4 r2 = r7.A19
            X.4R5 r2 = r2.A0A
            boolean r2 = r2.BIz()
            r7.A0c = r2
            X.4Mx r4 = r7.A00(r0, r6)
            android.view.Surface r3 = r7.A0K
            android.view.Surface r2 = r7.A0I
            r8 = 0
            if (r3 == r2) goto L_0x0379
            r8 = 1
        L_0x0379:
            X.4Of r3 = r7.A0v
            X.4My r2 = r7.A13
            r3.CzF(r2, r4, r8)
            X.4SG r3 = r7.A18
            boolean r2 = X.AnonymousClass4SG.A03(r3)
            if (r2 == 0) goto L_0x03a7
            android.os.SystemClock.elapsedRealtime()
            X.AnonymousClass4SG.A01(r3)
            X.4My r3 = r3.A0C
            if (r3 == 0) goto L_0x03a7
            int r2 = r3.A00
            if (r2 <= 0) goto L_0x03a7
            long r2 = r3.A02
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r8 = new java.lang.Object[]{r2}
            java.lang.String r3 = "LiveLatencyManager"
            java.lang.String r2 = "Starting broadcaster stall with last staled manifest live edge of %s in Ms"
            X.27B.A01(r3, r2, r8)
        L_0x03a7:
            X.4SO r9 = r7.A17
            boolean r2 = r9.A03
            if (r2 == 0) goto L_0x03e0
            X.4ST r11 = r9.A00
            if (r11 == 0) goto L_0x03e0
            int r8 = r11.A03
            if (r8 <= 0) goto L_0x03e0
            java.util.Deque r3 = r9.A02
            int r2 = r3.size()
            if (r2 < r8) goto L_0x03e0
            long r13 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r2 = r3.peekLast()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            long r13 = r13 - r2
            int r2 = r11.A00
            long r2 = (long) r2
            int r8 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x03e0
            X.4P4 r10 = r9.A01
            int r2 = r11.A02
            long r8 = (long) r2
            int r2 = r11.A01
            long r2 = (long) r2
            X.4Qa r10 = r10.A09
            r10.EUg(r8, r2)
        L_0x03e0:
            X.4SP r2 = X.AnonymousClass4SP.A01
            monitor-enter(r2)
            monitor-exit(r2)
        L_0x03e4:
            boolean r2 = r7.A0k
            if (r2 == 0) goto L_0x0142
            if (r41 != 0) goto L_0x0142
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r2 = "Sending delayed play now due to seek"
            A0E(r7, r2, r3)
            X.4P4 r2 = r7.A19
            X.4R5 r2 = r2.A0A
            r2.Efw(r5)
            r7.A0k = r6
            goto L_0x0142
        L_0x03fc:
            r2 = r35
            boolean r2 = r2.A38
            if (r2 != 0) goto L_0x0142
            r7.A1F = r6
            goto L_0x0142
        L_0x0406:
            boolean r2 = r7.A0i
            if (r2 == 0) goto L_0x048e
            r2 = r21
            if (r12 == r2) goto L_0x048e
            boolean r2 = r7.A0f
            if (r2 != 0) goto L_0x048e
            X.4Mx r4 = r7.A00(r0, r5)
            X.4P4 r2 = r7.A19
            X.4R5 r2 = r2.A0A
            boolean r30 = r2.BIz()
            boolean r2 = r7.A0n
            if (r2 != 0) goto L_0x044b
            X.4Of r11 = r7.A0v
            java.lang.String r10 = r7.A0Z
            r3 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            r25 = r15
            if (r2 != 0) goto L_0x0431
            r25 = r3
        L_0x0431:
            long r2 = r4.A0H
            long r8 = r7.A0C
            long r2 = r2 - r8
            X.4OI r8 = r7.A15
            java.lang.String r8 = r8.A07
            r22 = r11
            r23 = r4
            r24 = r10
            r26 = r15
            r27 = r8
            r28 = r2
            r22.D0i(r23, r24, r25, r26, r27, r28, r30)
            goto L_0x00fd
        L_0x044b:
            X.4Of r10 = r7.A0v
            java.lang.String r9 = r7.A0W
            java.lang.String r8 = r7.A0X
            java.lang.String r26 = "force_end"
            r27 = 0
            r31 = -1
            java.lang.String r3 = r7.A0Z
            boolean r2 = android.text.TextUtils.isEmpty(r27)
            if (r2 != 0) goto L_0x0460
            r15 = 0
        L_0x0460:
            X.4OI r2 = r7.A15
            java.lang.String r2 = r2.A07
            r24 = r9
            r25 = r8
            r28 = r3
            r29 = r15
            r30 = r2
            r33 = r6
            r34 = r6
            r22 = r10
            r23 = r4
            r22.Dmm(r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34)
            java.lang.String r8 = r7.A0W
            java.lang.String r3 = r7.A0X
            X.4OI r2 = r7.A15
            java.lang.String r2 = r2.A07
            r24 = r8
            r25 = r3
            r26 = r2
            r27 = r5
            r22.D5J(r23, r24, r25, r26, r27)
            goto L_0x00ff
        L_0x048e:
            boolean r2 = r7.A0i
            if (r2 != 0) goto L_0x0496
            if (r41 == 0) goto L_0x0496
            r7.A0C = r0
        L_0x0496:
            r4 = 0
            goto L_0x00ff
        L_0x0499:
            r2 = 0
            goto L_0x0082
        L_0x049c:
            java.lang.String r1 = "Invalid playbackState"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4OS.A05(int, long, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r0 > 200) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0401, code lost:
        if ((r12 / ((long) r7.A04)) < 60) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0298, code lost:
        if (r1 != false) goto L_0x029a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A06(long r30) {
        /*
            r29 = this;
            r21 = 0
            r8 = r29
            r1 = r30
            r0 = r21
            X.4Mx r9 = r8.A00(r1, r0)
            X.4Mx r6 = r8.A14
            r2 = 250(0xfa, double:1.235E-321)
            r10 = 10
            long r4 = r9.A0H
            long r0 = r6.A0H
            long r4 = r4 - r0
            boolean r1 = r9.A0Q
            boolean r0 = r6.A0Q
            if (r1 != r0) goto L_0x027f
            boolean r1 = r9.A0R
            boolean r0 = r6.A0R
            if (r1 != r0) goto L_0x027f
            boolean r1 = r9.A0O
            boolean r0 = r6.A0O
            if (r1 != r0) goto L_0x027f
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x027f
            long r2 = r9.A08
            long r0 = r6.A08
            long r2 = r2 - r0
            long r2 = r2 - r4
            long r1 = java.lang.Math.abs(r2)
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x027f
            long r2 = r9.A0D
            long r0 = r6.A0D
            long r2 = r2 - r0
            long r2 = r2 - r4
            long r1 = java.lang.Math.abs(r2)
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x027f
            int r0 = r8.A03
            int r0 = r0 + 5
            r8.A03 = r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 <= r1) goto L_0x0055
        L_0x0053:
            r8.A03 = r1
        L_0x0055:
            X.4SG r7 = r8.A18
            r7.A0D = r9
            boolean r0 = X.AnonymousClass4SG.A03(r7)
            if (r0 == 0) goto L_0x038b
            X.4Ox r6 = r7.A0Q
            X.214 r0 = r6.A05
            X.217 r14 = X.C264184Ox.A00(r0, r6)
            boolean r0 = r14.A0h
            if (r0 == 0) goto L_0x0275
            long r0 = r7.A05
        L_0x006d:
            int r2 = (int) r0
            r28 = r2
            long r0 = (long) r2
            r16 = r0
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r7.A0S
            r22 = r0
            boolean r0 = r0.A27
            if (r0 == 0) goto L_0x0093
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r2 = r7.A0A
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x00cc
            long r0 = r4 - r2
            double r2 = (double) r0
            double r0 = r7.A00
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00cc
        L_0x0093:
            long r4 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = r14.A0b
            if (r0 == 0) goto L_0x0352
            boolean r0 = r7.A0H
            if (r0 != 0) goto L_0x0352
            int r2 = r14.A0N
            int r1 = r7.A03
            r0 = r22
            int r0 = r0.A0d
            r10 = 1
            if (r1 > r0) goto L_0x0349
            long r0 = r7.A0B
            long r11 = r4 - r0
            long r0 = (long) r2
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0349
            int r12 = r14.A0P
            int r11 = r14.A0O
            X.4SI r13 = X.AnonymousClass4SI.INITIAL_BUFFER_TRIM
            X.214 r0 = r6.A05
            X.217 r0 = X.C264184Ox.A00(r0, r6)
            boolean r0 = r0.A0c
            if (r0 == 0) goto L_0x029a
            X.4Op r2 = r7.A0M
            long r0 = android.os.SystemClock.elapsedRealtime()
            monitor-enter(r2)
            goto L_0x028a
        L_0x00cc:
            double r2 = r7.A00
            float r0 = r7.A0L
            double r0 = (double) r0
            double r2 = r2 * r0
            r7.A00 = r2
            int r0 = r7.A02
            double r0 = (double) r0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x00dd
            r7.A00 = r0
        L_0x00dd:
            r7.A0A = r4
            r6.A05()
            X.214 r0 = r6.A05
            X.217 r5 = X.C264184Ox.A00(r0, r6)
            X.4SL r2 = r7.A0E
            if (r2 == 0) goto L_0x0093
            r0 = r16
            int r12 = (int) r0
            float r0 = r7.A01
            float r0 = r2.BVz(r5, r0, r12)
            java.lang.Float r11 = java.lang.Float.valueOf(r0)
            if (r11 == 0) goto L_0x0093
            float r10 = r11.floatValue()
            X.214 r0 = r6.A05
            X.217 r4 = X.C264184Ox.A00(r0, r6)
            double r0 = r4.A02
            float r2 = (float) r0
            boolean r13 = X.AnonymousClass4SG.A04(r7, r2)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            java.lang.String r0 = "has_enough_bandwidth"
            r3.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r21)
            java.lang.String r0 = "has_bad_vsr_score"
            r3.put(r0, r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x0271
            double r0 = r4.A03
            float r13 = (float) r0
            float r13 = r13 + r2
        L_0x012b:
            double r0 = r4.A04
            float r15 = (float) r0
            float r1 = r2 - r15
            java.lang.Float r15 = java.lang.Float.valueOf(r13)
            java.lang.String r0 = "max_speed"
            r3.put(r0, r15)
            java.lang.Float r15 = java.lang.Float.valueOf(r1)
            java.lang.String r0 = "min_speed"
            r3.put(r0, r15)
            java.lang.String r0 = "speed"
            r3.put(r0, r11)
            float r0 = java.lang.Math.max(r10, r1)
            float r0 = java.lang.Math.min(r0, r13)
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 * r1
            int r0 = X.AnonymousClass1GB.A01(r0)
            float r11 = (float) r0
            float r11 = r11 / r1
            double r0 = r4.A06
            float r10 = (float) r0
            double r0 = r4.A07
            float r13 = (float) r0
            double r0 = r4.A05
            float r15 = (float) r0
            float r0 = r7.A01
            float r0 = r0 - r11
            float r0 = java.lang.Math.abs(r0)
            r20 = 0
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r10 = 0
            if (r0 >= 0) goto L_0x0170
            r10 = 1
        L_0x0170:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = "below_threshold_adjust"
            r3.put(r0, r1)
            java.lang.String r4 = " latencyLevel:"
            if (r10 == 0) goto L_0x01fa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ACFB below threshold, lastSet:"
            r1.append(r0)
            float r0 = r7.A01
            r1.append(r0)
            java.lang.String r0 = ", sanitized:"
            r1.append(r0)
            r1.append(r11)
            r1.append(r4)
            X.214 r0 = r6.A05
            r1.append(r0)
            r1.toString()
            X.2AG.A01()
        L_0x01a2:
            boolean r0 = X.AnonymousClass4SG.A03(r7)
            if (r0 == 0) goto L_0x0093
            int r3 = r5.A0A
            int r0 = r5.A0B
            int r0 = r0 + r3
            if (r0 <= r12) goto L_0x0093
            long r0 = r7.A06
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 == 0) goto L_0x0093
            boolean r2 = r7.A0G
            if (r2 != 0) goto L_0x0093
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10 - r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = "time_to_target_buffer_ms"
            r2.put(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.String r0 = "at_target_buffer_time"
            r2.put(r0, r1)
            long r0 = r7.A06
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "buffer_start_time"
            r2.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "target_buffer_ms"
            r2.put(r0, r1)
            X.214 r0 = r6.A05
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "client_latency_level"
            r2.put(r0, r1)
            r0 = 1
            r7.A0G = r0
            goto L_0x0093
        L_0x01fa:
            float r0 = r11 - r2
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            r10 = 0
            if (r0 > 0) goto L_0x0206
            r10 = 1
        L_0x0206:
            float r0 = r7.A01
            float r0 = r11 - r0
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0214
            r20 = 1
        L_0x0214:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = "below_threshold_regular"
            r3.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r20)
            java.lang.String r0 = "above_threshold_between_speeds"
            r3.put(r0, r1)
            if (r10 != 0) goto L_0x022b
            if (r20 != 0) goto L_0x022b
            r2 = r11
        L_0x022b:
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            java.lang.String r0 = "set_speed"
            r3.put(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ACFB speed debug extra, lastSet:"
            r1.append(r0)
            float r0 = r7.A01
            r1.append(r0)
            java.lang.String r0 = ", extra:"
            r1.append(r0)
            r1.append(r3)
            r1.append(r4)
            X.214 r0 = r6.A05
            r1.append(r0)
            r1.toString()
            X.2AG.A01()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r0, r2)
            X.4P4 r3 = r7.A0R
            X.4P7 r1 = new X.4P7
            r1.<init>(r2, r0)
            X.4R5 r0 = r3.A0A
            r0.Efz(r1)
            r3.A0B = r1
            r7.A01 = r2
            goto L_0x01a2
        L_0x0271:
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x012b
        L_0x0275:
            X.4P4 r0 = r7.A0R
            X.4R5 r0 = r0.A0A
            long r0 = r0.AiR()
            goto L_0x006d
        L_0x027f:
            X.4Of r0 = r8.A0v
            r0.DXq(r9)
            r8.A14 = r9
            r1 = 10
            goto L_0x0053
        L_0x028a:
            X.C264104Op.A00(r2, r0)     // Catch:{ all -> 0x0346 }
            java.util.Queue r0 = r2.A00     // Catch:{ all -> 0x0346 }
            int r0 = r0.size()     // Catch:{ all -> 0x0346 }
            r1 = 1
            if (r0 < r10) goto L_0x0297
            r1 = 0
        L_0x0297:
            monitor-exit(r2)
            if (r1 == 0) goto L_0x0352
        L_0x029a:
            java.lang.String r2 = "EXCELLENT"
            java.lang.String r1 = "UNKNOWN"
            r0 = r21
            boolean r0 = X.00l.A0d(r2, r1, r0)
            if (r0 == 0) goto L_0x0352
            X.5fN r2 = r7.A0P
            if (r2 == 0) goto L_0x02ba
            java.util.Queue r0 = r2.A04
            int r1 = r0.size()
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x0352
            int r1 = r2.A00
            r0 = 20
            if (r1 > r0) goto L_0x0352
        L_0x02ba:
            r0 = -1
            if (r12 == r0) goto L_0x0352
            if (r11 == r0) goto L_0x0352
            android.os.SystemClock.elapsedRealtime()
            long r0 = r9.A08
            r18 = 0
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x0352
            long r2 = r9.A0B
            int r9 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r9 <= 0) goto L_0x0352
            long r26 = r2 - r0
            X.4P4 r9 = r7.A0R
            X.4R5 r0 = r9.A0A
            long r24 = r0.AiR()
            long r0 = r26 - r24
            long r22 = java.lang.Math.abs(r0)
            r18 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            r18 = 0
            if (r0 <= 0) goto L_0x02ea
            r18 = 1
        L_0x02ea:
            long r0 = (long) r12
            int r15 = (r26 > r0 ? 1 : (r26 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x0352
            int r15 = (r24 > r0 ? 1 : (r24 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x0352
            if (r18 != 0) goto L_0x0352
            long r0 = (long) r11
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r24)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r13, r0, r1, r11}
            java.lang.String r1 = "LiveLatencyManager"
            java.lang.String r0 = "Jump by trimming buffer: action type: %s, bufferedDurationMs: %s, threshold: %s, target: %s"
            X.27B.A02(r1, r0, r11)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            X.4P6 r11 = new X.4P6
            r11.<init>(r0, r0)
            X.4R5 r0 = r9.A0A
            r0.EjX(r11)
            X.4R5 r0 = r9.A0A
            r0.EL1(r2)
            r7.A0J = r10
            X.214 r0 = r6.A05
            X.217 r0 = X.C264184Ox.A00(r0, r6)
            boolean r0 = r0.A0c
            if (r0 == 0) goto L_0x034d
            X.4Op r2 = r7.A0M
            long r0 = android.os.SystemClock.elapsedRealtime()
            monitor-enter(r2)
            X.C264104Op.A00(r2, r0)     // Catch:{ all -> 0x0346 }
            java.util.Queue r6 = r2.A00     // Catch:{ all -> 0x0346 }
            int r3 = r6.size()     // Catch:{ all -> 0x0346 }
            if (r3 >= r10) goto L_0x034c
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0346 }
            r6.offer(r0)     // Catch:{ all -> 0x0346 }
            goto L_0x034c
        L_0x0346:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0349:
            r7.A0H = r10
            goto L_0x0352
        L_0x034c:
            monitor-exit(r2)
        L_0x034d:
            r7.A0H = r10
            X.AnonymousClass4SG.A01(r7)
        L_0x0352:
            X.5fN r6 = r7.A0P
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == 0) goto L_0x0363
            long r0 = r7.A06
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x042f
            r7.A06 = r4
        L_0x0363:
            X.4Oq r9 = r7.A0N
            int r0 = r14.A0V
            java.util.concurrent.atomic.AtomicLong r4 = r9.A06
            long r0 = (long) r0
            r4.set(r0)
            java.util.concurrent.atomic.AtomicLong r0 = r9.A03
            r0.set(r2)
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r0 = r7.A09
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x03d7
            long r12 = r4 - r0
            r10 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x03d7
        L_0x0384:
            if (r6 == 0) goto L_0x038b
            java.util.Queue r0 = r6.A04
            r0.size()
        L_0x038b:
            X.4OI r0 = r8.A15
            if (r0 == 0) goto L_0x03b5
            X.4OI r0 = r8.A15
            X.3uU r0 = r0.A0K
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x03b5
            X.4My r0 = r8.A13
            int r0 = r0.A00
            r3 = 3
            r2 = 1
            r1 = 0
            if (r0 < r3) goto L_0x03a3
            r1 = 1
        L_0x03a3:
            boolean r0 = r8.A0g
            if (r0 != 0) goto L_0x03c7
            if (r1 == 0) goto L_0x03b5
            int r1 = r8.A04
            r0 = 2
            if (r1 != r0) goto L_0x03b5
            X.4Of r0 = r8.A0v
            r0.DNp(r2)
            r8.A0g = r2
        L_0x03b5:
            android.os.Handler r3 = r8.A0G
            r2 = 10
            r3.removeMessages(r2)
            boolean r0 = r8.A1F
            if (r0 == 0) goto L_0x03c6
            int r0 = r8.A03
            long r0 = (long) r0
            r3.sendEmptyMessageDelayed(r2, r0)
        L_0x03c6:
            return
        L_0x03c7:
            if (r1 == 0) goto L_0x03cd
            int r0 = r8.A04
            if (r0 != r3) goto L_0x03b5
        L_0x03cd:
            X.4Of r1 = r8.A0v
            r0 = r21
            r1.DNp(r0)
            r8.A0g = r0
            goto L_0x03b5
        L_0x03d7:
            java.lang.String r10 = "EXCELLENT"
            java.lang.String r1 = "UNKNOWN"
            r0 = r21
            boolean r0 = X.00l.A0d(r10, r1, r0)
            if (r0 == 0) goto L_0x0403
            r1 = 3
            int r0 = r7.A03
            if (r1 < r0) goto L_0x0403
            long r0 = r7.A07
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x040f
            long r12 = r4 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r0
            r10 = 5
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x040f
            int r0 = r7.A04
            long r0 = (long) r0
            long r12 = r12 / r0
            r10 = 60
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x040f
        L_0x0403:
            java.util.concurrent.atomic.AtomicLong r0 = r9.A04
            r0.set(r2)
        L_0x0408:
            java.util.concurrent.atomic.AtomicLong r0 = r9.A05
            r0.set(r2)
            goto L_0x0384
        L_0x040f:
            r7.A09 = r4
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            boolean r0 = X.AnonymousClass4SG.A04(r7, r0)
            if (r0 == 0) goto L_0x0424
            r0 = 1000(0x3e8, double:4.94E-321)
        L_0x041c:
            r2 = 6000(0x1770, double:2.9644E-320)
            java.util.concurrent.atomic.AtomicLong r4 = r9.A04
            r4.set(r0)
            goto L_0x0408
        L_0x0424:
            r0 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = X.AnonymousClass4SG.A04(r7, r0)
            if (r0 == 0) goto L_0x0403
            r0 = 2000(0x7d0, double:9.88E-321)
            goto L_0x041c
        L_0x042f:
            r9 = 2500(0x9c4, double:1.235E-320)
            long r0 = r0 + r9
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x0363
            long r0 = r7.A08
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x0443
            r9 = 450(0x1c2, double:2.223E-321)
            long r0 = r0 + r9
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x0363
        L_0x0443:
            r7.A08 = r4
            java.util.Queue r11 = r6.A04
            int r0 = r11.size()
            r9 = 400(0x190, float:5.6E-43)
            if (r0 < r9) goto L_0x045f
            java.lang.Object r0 = r11.poll()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r4 = r6.A03
            long r0 = (long) r0
            long r4 = r4 - r0
            r6.A03 = r4
        L_0x045f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r28)
            r11.offer(r4)
            long r0 = r6.A03
            long r0 = r0 + r16
            r6.A03 = r0
            int r0 = r11.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r17 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r4}
            java.lang.String r10 = "BufferMeter"
            java.lang.String r0 = "Accepting buffer, Buffer queue size %s, buffer duration of %s Ms "
            X.27B.A01(r10, r0, r1)
            int r0 = r11.size()
            if (r0 < r9) goto L_0x0363
            long r0 = r6.A03
            int r4 = r11.size()
            long r4 = (long) r4
            long r0 = r0 / r4
            int r9 = (int) r0
            r0 = 0
            r15 = 2147483647(0x7fffffff, float:NaN)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            java.util.Iterator r16 = r11.iterator()
        L_0x049b:
            boolean r4 = r16.hasNext()
            if (r4 == 0) goto L_0x04b9
            java.lang.Object r4 = r16.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r12 = r4.intValue()
            int r4 = r12 - r9
            int r4 = r4 * r4
            long r4 = (long) r4
            long r0 = r0 + r4
            int r15 = java.lang.Math.min(r15, r12)
            int r13 = java.lang.Math.max(r13, r12)
            goto L_0x049b
        L_0x04b9:
            r6.A02 = r15
            r6.A01 = r13
            double r4 = (double) r0
            int r0 = r11.size()
            int r0 = r0 - r17
            double r0 = (double) r0
            double r4 = r4 / r0
            double r4 = java.lang.Math.sqrt(r4)
            double r0 = (double) r9
            double r4 = r4 / r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r0
            int r0 = (int) r4
            r6.A00 = r0
            int r0 = r11.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            int r0 = r6.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            int r0 = r6.A02
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r0 = r6.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r9, r5, r4, r1, r0}
            java.lang.String r0 = "Buffer queue size %s, CV %s, minBuffer Size %s, maxBuffer Size %s, fluctuation limit %s"
            X.27B.A01(r10, r0, r1)
            goto L_0x0363
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4OS.A06(long):void");
    }

    public static void A07(Message message, AnonymousClass4OS r2) {
        if (!r2.A1E) {
            r2.A0G.sendMessage(message);
        }
    }

    private void A08(C263684My r8) {
        Number number;
        if (!r8.equals(this.A13)) {
            this.A13 = r8;
            this.A0v.DNw(r8);
            AnonymousClass4SG r6 = this.A18;
            r6.A0C = r8;
            if (AnonymousClass4SG.A03(r6)) {
                int i = r8.A00;
                if (i >= r6.A0S.A0d) {
                    SystemClock.elapsedRealtime();
                }
                TreeMap treeMap = r6.A0U;
                if (treeMap.isEmpty() || (number = (Number) treeMap.lastEntry().getValue()) == null || i != number.intValue()) {
                    long j = r8.A09;
                    if (treeMap.size() > 100) {
                        treeMap.pollFirstEntry();
                    }
                    treeMap.put(Long.valueOf(j), Integer.valueOf(i));
                    if (i > r6.A03) {
                        r6.A03 = i;
                    }
                }
            }
        }
    }

    public static void A0A(AnonymousClass4OS r2, float f) {
        A0E(r2, "setPlaybackSpeedInternal to: %d (x100)", Integer.valueOf((int) (100.0f * f)));
        r2.A00 = f;
        AnonymousClass4P4 r22 = r2.A19;
        AnonymousClass4P7 r1 = new AnonymousClass4P7(f, r22.A0B.A00);
        r22.A0A.Efz(r1);
        r22.A0B = r1;
    }

    public static void A0E(AnonymousClass4OS r1, String str, Object... objArr) {
        28J.A00(r1, "HeroServicePlayer", str, objArr);
    }

    public static void A0F(AnonymousClass4OS r16, boolean z, boolean z2) {
        HeroPlayerSetting heroPlayerSetting;
        long j;
        long j2;
        C265164Su r11;
        AnonymousClass4OS r2 = r16;
        boolean z3 = r2.A0d;
        if (z2) {
            if (z3 && r2.A1D && r2.A1C) {
                A0E(r2, "Call ExoPlayer.addMediaSource() from prepareExoPlayerIfNotYet", new Object[0]);
                AnonymousClass4P4 r7 = r2.A19;
                if (r7.A0C != null) {
                    if (!r7.A02.A0N.isEmpty()) {
                        r7.A0A.Eq9(new ArrayList(r7.A02.A0N));
                    }
                    AnonymousClass4OI r9 = r7.A02;
                    int i = r9.A0F;
                    if (i == -1 && r9.A0E == -1) {
                        r11 = r7.A0C;
                    } else {
                        if (i != -1) {
                            j = ((long) i) * 1000;
                        } else {
                            j = 0;
                        }
                        int i2 = r9.A0E;
                        if (i2 != -1) {
                            j2 = ((long) i2) * 1000;
                        } else {
                            j2 = -9223372036854775807L;
                        }
                        r11 = new AnonymousClass5EH(r7.A0C, j, j2);
                    }
                    r7.A0A.A9I(r11);
                }
                r2.A1C = false;
            }
            if (!z && z3 && r2.A1D) {
                heroPlayerSetting = r2.A0w;
                boolean z4 = heroPlayerSetting.A10.A0Y;
                if (!z4) {
                    A0E(r2, "Call ExoPlayer.prepareV2() from prepareExoPlayerIfNotYet", new Object[0]);
                    r2.A19.A0A.E3m();
                }
                if (r2.A01 <= 0.0f) {
                    r2.A0I(false);
                }
                if (z4) {
                    A0E(r2, "Call ExoPlayer.prepareV2() from prepareExoPlayerIfNotYet", new Object[0]);
                    r2.A19.A0A.E3m();
                }
            } else {
                return;
            }
        } else if (z3 && r2.A1D) {
            heroPlayerSetting = r2.A0w;
            boolean z5 = heroPlayerSetting.A10.A0Y;
            if (!z5) {
                A0E(r2, "Call ExoPlayer.prepare()", new Object[0]);
                r2.A19.A06();
            }
            if (r2.A01 <= 0.0f) {
                r2.A0I(false);
            }
            if (z5) {
                A0E(r2, "Call ExoPlayer.prepare()", new Object[0]);
                r2.A19.A06();
            }
        } else {
            return;
        }
        r2.A03();
        AnonymousClass4OI r4 = r2.A15;
        Set set = heroPlayerSetting.A1H;
        if (!set.isEmpty() && r4 != null && (set.contains("all_origin") || set.contains(r4.A0K.A0B))) {
            AnonymousClass4T5 r3 = r2.A0R;
            if (r3 == null) {
                r3 = new AnonymousClass4T5(r2.A0F);
                r2.A0R = r3;
            }
            r3.setEnabled(true);
        }
        r2.A1D = false;
    }

    private void A0I(boolean z) {
        String str;
        if (this.A15 != null && this.A15.A0R) {
            C255623uR r1 = this.A15.A0K.A07;
            if (this.A19.A05(1) == -1 && z) {
                28J.A02(this, "Enable audio track", new Object[0]);
                this.A19.A07(1, 0);
            } else if (this.A19.A05(1) != -1 && !z) {
                if (r1 == C255623uR.DASH_VOD || (r1 == C255623uR.PROGRESSIVE && this.A0w.A28)) {
                    28J.A02(this, "Disable audio track", new Object[0]);
                    this.A19.A07(1, -1);
                } else {
                    return;
                }
            } else {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.A0B < 100) {
                String str2 = "";
                if (this.A15 != null) {
                    str = this.A15.A0K.A0A;
                } else {
                    str = str2;
                }
                if (this.A15 != null) {
                    str2 = this.A15.A0K.A0B;
                }
                this.A0v.E07("AUDIO", "AUDIO_TRACK_UPDATED_TOO_FREQUENTLY", String.format("audio track is updated again in 100ms in origin: %s, subOrigin: %s. ", new Object[]{str, str2}));
            }
            this.A0B = elapsedRealtime;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r0.A0P == false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0J(X.AnonymousClass4OS r3) {
        /*
            X.4OI r0 = r3.A15
            r2 = 1
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.A0P
            r1 = 1
            if (r0 != 0) goto L_0x000b
        L_0x000a:
            r1 = 0
        L_0x000b:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r3.A0w
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.A2d
            if (r0 == 0) goto L_0x0016
            if (r1 != 0) goto L_0x0016
            return r2
        L_0x0016:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4OS.A0J(X.4OS):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        r1 = (java.util.List) r1.get("Proxy-Status");
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C284815Oa A0K(X.AnonymousClass5OZ r13, X.C2612448v r14) {
        /*
            r12 = this;
            X.4Yz r3 = X.C266464Yz.A0P
            java.lang.String r5 = r14.getMessage()
            java.lang.Throwable r0 = r14.getCause()
            boolean r0 = r0 instanceof java.io.IOException
            r4 = 1
            java.lang.String r2 = ""
            r11 = r2
            if (r0 == 0) goto L_0x021a
            java.lang.Throwable r1 = r14.getCause()
            boolean r0 = r1 instanceof X.C2609347p
            if (r0 == 0) goto L_0x001e
            X.5OZ r13 = X.AnonymousClass5OZ.ATOM_PARSE
            X.4Yz r3 = X.C266464Yz.A04
        L_0x001e:
            boolean r0 = r1 instanceof X.C2609447q
            if (r0 == 0) goto L_0x0204
            r6 = r1
        L_0x0023:
            X.47q r6 = (X.C2609447q) r6
            if (r6 == 0) goto L_0x0212
            int r2 = r6.A00
            r0 = 200(0xc8, float:2.8E-43)
            r7 = 417(0x1a1, float:5.84E-43)
            if (r2 == r0) goto L_0x01dc
            r0 = 302(0x12e, float:4.23E-43)
            if (r2 == r0) goto L_0x01d8
            r0 = 410(0x19a, float:5.75E-43)
            if (r2 == r0) goto L_0x01d4
            if (r2 == r7) goto L_0x01dc
            r0 = 429(0x1ad, float:6.01E-43)
            if (r2 == r0) goto L_0x01d0
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 == r0) goto L_0x01cc
            r0 = 403(0x193, float:5.65E-43)
            if (r2 == r0) goto L_0x01c8
            r0 = 404(0x194, float:5.66E-43)
            if (r2 == r0) goto L_0x01c4
            switch(r2) {
                case 502: goto L_0x01b8;
                case 503: goto L_0x01bc;
                case 504: goto L_0x01c0;
                default: goto L_0x004c;
            }
        L_0x004c:
            java.util.Map r1 = r6.A01
            if (r1 == 0) goto L_0x01b5
            java.lang.String r0 = "Proxy-Status"
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x01b5
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01b5
            r0 = 0
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
        L_0x0067:
            r10 = 5
            r8 = 0
            if (r5 == 0) goto L_0x0185
            java.lang.String r0 = "TigonError"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0185
            X.5OZ r13 = X.AnonymousClass5OZ.NETWORK
            java.lang.String r0 = "TigonLigerErrorDomain"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x016d
            X.4Yz r3 = X.C266464Yz.A1X
        L_0x007f:
            X.5OZ r0 = X.AnonymousClass5OZ.DECODER
            if (r13 != r0) goto L_0x0090
            r7 = r14
            java.lang.String r6 = r14.getMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0102
            java.lang.String r5 = "Decoder init failed"
        L_0x0090:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r6 = 2
            if (r0 == 0) goto L_0x00bb
            java.lang.Throwable r1 = r14.getCause()
            java.lang.Class r0 = r14.getClass()
            if (r1 == 0) goto L_0x00fd
            java.lang.String r1 = r0.getSimpleName()
            java.lang.Throwable r0 = r14.getCause()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "%s. Cause: %s"
            java.lang.String r5 = java.lang.String.format(r0, r1)
        L_0x00bb:
            X.4Yz r0 = X.C266464Yz.A0a
            if (r3 != r0) goto L_0x029f
            java.lang.Throwable r9 = r14.getCause()
            r8 = 1
        L_0x00c4:
            if (r9 == 0) goto L_0x029f
            java.lang.Throwable r0 = r9.getCause()
            if (r0 == 0) goto L_0x029f
            java.lang.Throwable r0 = r9.getCause()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r7 = r0.getSimpleName()
            boolean r0 = r5.contains(r7)
            if (r0 != 0) goto L_0x00f4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Throwable r0 = r9.getCause()
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1, r7, r1, r0}
            java.lang.String r0 = "%s [Cause%d: %s; Message%d: %s]"
            java.lang.String r5 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
        L_0x00f4:
            java.lang.Throwable r9 = r9.getCause()
            int r8 = r8 + 1
            if (r8 >= r10) goto L_0x029f
            goto L_0x00c4
        L_0x00fd:
            java.lang.String r5 = r0.getSimpleName()
            goto L_0x00bb
        L_0x0102:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r6.split(r0)
            r1 = r0[r8]
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0111
            r6 = r1
        L_0x0111:
            java.lang.Throwable r0 = r14.getCause()
            java.lang.String r5 = "%s. Cause: %s"
            r1 = 2
            if (r0 == 0) goto L_0x0164
            java.lang.Throwable r0 = r14.getCause()
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x0164
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r6
            java.lang.Throwable r0 = r14.getCause()
            java.lang.String r0 = r0.getMessage()
        L_0x0130:
            r1[r4] = r0
            java.lang.String r5 = java.lang.String.format(r5, r1)
        L_0x0136:
            java.lang.Throwable r0 = r7.getCause()
            boolean r0 = r0 instanceof X.AnonymousClass4UG
            if (r0 == 0) goto L_0x015d
            java.lang.Throwable r0 = r7.getCause()
            X.4UG r0 = (X.AnonymousClass4UG) r0
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x015d
            r6 = 0
            java.lang.Throwable r0 = r7.getCause()
            X.4UG r0 = (X.AnonymousClass4UG) r0
            java.lang.String r0 = r0.A02
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r0}
            java.lang.String r0 = "%s. DiagnosticInfo: %s"
            java.lang.String r5 = java.lang.String.format(r6, r0, r1)
            goto L_0x0090
        L_0x015d:
            java.lang.Throwable r7 = r7.getCause()
            if (r7 == 0) goto L_0x0090
            goto L_0x0136
        L_0x0164:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r6
            java.lang.Throwable r0 = r14.getCause()
            goto L_0x0130
        L_0x016d:
            java.lang.String r0 = "TigonIdleTimeoutDomain"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0179
            X.4Yz r3 = X.C266464Yz.A1W
            goto L_0x007f
        L_0x0179:
            java.lang.String r0 = "TigonConnectionTimeoutDomain"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x007f
            X.4Yz r3 = X.C266464Yz.A1V
            goto L_0x007f
        L_0x0185:
            X.4Yz r7 = X.C266464Yz.A0H
            if (r3 != r7) goto L_0x018d
            X.5OZ r13 = X.AnonymousClass5OZ.DECODER
            goto L_0x007f
        L_0x018d:
            X.4Yz r0 = X.C266464Yz.A0S
            if (r3 != r0) goto L_0x0195
            X.5OZ r13 = X.AnonymousClass5OZ.FAILOVER
            goto L_0x007f
        L_0x0195:
            r6 = r14
            r1 = 0
        L_0x0197:
            java.lang.Throwable r0 = r6.getCause()
            if (r0 == 0) goto L_0x007f
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof X.AnonymousClass4UG
            if (r0 == 0) goto L_0x01aa
            X.5OZ r13 = X.AnonymousClass5OZ.DECODER
            r3 = r7
            goto L_0x007f
        L_0x01aa:
            java.lang.Throwable r6 = r6.getCause()
            int r1 = r1 + 1
            if (r1 >= r10) goto L_0x007f
            if (r6 == 0) goto L_0x007f
            goto L_0x0197
        L_0x01b5:
            r2 = 0
            goto L_0x0067
        L_0x01b8:
            X.4Yz r3 = X.C266464Yz.A1H
            goto L_0x004c
        L_0x01bc:
            X.4Yz r3 = X.C266464Yz.A1I
            goto L_0x004c
        L_0x01c0:
            X.4Yz r3 = X.C266464Yz.A1J
            goto L_0x004c
        L_0x01c4:
            X.4Yz r3 = X.C266464Yz.A1C
            goto L_0x004c
        L_0x01c8:
            X.4Yz r3 = X.C266464Yz.A1B
            goto L_0x004c
        L_0x01cc:
            X.4Yz r3 = X.C266464Yz.A1G
            goto L_0x004c
        L_0x01d0:
            X.4Yz r3 = X.C266464Yz.A1F
            goto L_0x004c
        L_0x01d4:
            X.4Yz r3 = X.C266464Yz.A1D
            goto L_0x004c
        L_0x01d8:
            X.4Yz r3 = X.C266464Yz.A1A
            goto L_0x004c
        L_0x01dc:
            r12.A0f = r4
            java.util.Map r1 = r6.A01
            java.lang.String r0 = "x-fb-video-replica"
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x01fd
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01fd
            r0 = 0
            java.lang.Object r5 = r1.get(r0)
            java.lang.String r5 = (java.lang.String) r5
        L_0x01f7:
            if (r2 != r7) goto L_0x0200
            X.4Yz r3 = X.C266464Yz.A1E
            goto L_0x004c
        L_0x01fd:
            java.lang.String r5 = "invalid-replica-number"
            goto L_0x01f7
        L_0x0200:
            X.4Yz r3 = X.C266464Yz.A0S
            goto L_0x004c
        L_0x0204:
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof X.C2609447q
            if (r0 == 0) goto L_0x0212
            java.lang.Throwable r6 = r1.getCause()
            goto L_0x0023
        L_0x0212:
            boolean r0 = r1 instanceof X.C68389NEv
            if (r0 == 0) goto L_0x0067
            X.4Yz r3 = X.C266464Yz.A0j
            goto L_0x0067
        L_0x021a:
            java.lang.String r0 = r14.getMessage()
            java.lang.String r1 = "Decoder init failed"
            if (r0 == 0) goto L_0x0230
            java.lang.String r0 = r14.getMessage()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0230
        L_0x022c:
            X.4Yz r3 = X.C266464Yz.A0H
            goto L_0x0067
        L_0x0230:
            java.lang.Throwable r0 = r14.getCause()
            if (r0 == 0) goto L_0x025d
            java.lang.Throwable r0 = r14.getCause()
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x025d
            java.lang.Throwable r0 = r14.getCause()
            java.lang.String r0 = r0.getMessage()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x025d
            java.lang.Throwable r0 = r14.getCause()
            java.lang.String r0 = r0.getMessage()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x025d
            goto L_0x022c
        L_0x025d:
            java.lang.Throwable r0 = r14.getCause()
            boolean r0 = r0 instanceof X.AnonymousClass4UI
            if (r0 == 0) goto L_0x0269
            X.4Yz r3 = X.C266464Yz.A05
            goto L_0x0067
        L_0x0269:
            java.lang.Throwable r0 = r14.getCause()
            boolean r1 = r0 instanceof java.lang.IllegalStateException
            java.lang.Throwable r0 = r14.getCause()
            if (r1 == 0) goto L_0x0293
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x028f
            java.lang.Throwable r0 = r14.getCause()
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "Media source is null"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x028f
            X.4Yz r3 = X.C266464Yz.A10
            goto L_0x0067
        L_0x028f:
            X.4Yz r3 = X.C266464Yz.A0a
            goto L_0x0067
        L_0x0293:
            boolean r0 = r0 instanceof X.V20
            if (r0 == 0) goto L_0x029b
            X.4Yz r3 = X.C266464Yz.A1Z
            goto L_0x0067
        L_0x029b:
            X.4Yz r3 = X.C266464Yz.A14
            goto L_0x0067
        L_0x029f:
            boolean r7 = r14 instanceof X.C2612348u
            if (r7 == 0) goto L_0x02f9
            r9 = r14
            X.48u r9 = (X.C2612348u) r9
            int r0 = r9.A02
            if (r0 != r4) goto L_0x02f9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r0 = ". Renderer index="
            r8.append(r0)
            int r1 = r9.A01
            r8.append(r1)
            java.lang.String r0 = ", type="
            r8.append(r0)
            X.4P4 r0 = r12.A19
            if (r0 == 0) goto L_0x02da
            X.4PL[] r0 = r0.A0G
            if (r0 == 0) goto L_0x0332
            r0 = r0[r1]
            X.4PK r0 = (X.AnonymousClass4PK) r0
            int r1 = r0.A0B
            if (r1 == r10) goto L_0x032f
            if (r1 == r4) goto L_0x032c
            if (r1 == r6) goto L_0x0329
            r0 = 3
            if (r1 != r0) goto L_0x0332
            java.lang.String r11 = "text"
        L_0x02da:
            r8.append(r11)
            java.lang.String r0 = ", format="
            r8.append(r0)
            X.3wB r0 = r9.A03
            r8.append(r0)
            java.lang.String r0 = ", rendererSupport="
            r8.append(r0)
            int r0 = r9.A00
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.A0B(r0)
            r8.append(r0)
            java.lang.String r5 = r8.toString()
        L_0x02f9:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r12.A0w
            X.1xH r0 = r0.A01
            if (r0 == 0) goto L_0x0323
            boolean r0 = r0.A0a
            if (r0 == 0) goto L_0x0323
            if (r7 == 0) goto L_0x0323
            X.48u r14 = (X.C2612348u) r14
            int r0 = r14.A02
            if (r6 != r0) goto L_0x0323
            r1 = 1003(0x3eb, float:1.406E-42)
            int r0 = r14.A00
            if (r1 != r0) goto L_0x0323
            java.lang.Throwable r1 = r14.getCause()
            boolean r0 = r1 instanceof X.Y5H
            if (r0 == 0) goto L_0x0323
            X.Y5H r1 = (X.Y5H) r1
            int r0 = r1.A00
            if (r4 != r0) goto L_0x0323
            X.4Yz r3 = X.C266464Yz.A14
            X.5OZ r13 = X.AnonymousClass5OZ.PLAYER_RELEASE_TIMEOUT
        L_0x0323:
            X.5Oa r0 = new X.5Oa
            r0.<init>(r3, r13, r5, r2)
            return r0
        L_0x0329:
            java.lang.String r11 = "video"
            goto L_0x02da
        L_0x032c:
            java.lang.String r11 = "audio"
            goto L_0x02da
        L_0x032f:
            java.lang.String r11 = "metadata"
            goto L_0x02da
        L_0x0332:
            java.lang.String r11 = "?"
            goto L_0x02da
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4OS.A0K(X.5OZ, X.48v):X.5Oa");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02d2, code lost:
        if (r8.A0F == false) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0504, code lost:
        r1 = r0.A0A.AMN(r0.A0G[1]);
        r1.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0511, code lost:
        r1.A02(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0561, code lost:
        A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0564, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0581, code lost:
        A06(android.os.SystemClock.elapsedRealtime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0588, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0611, code lost:
        if (r5.equals(r1.A16) != false) goto L_0x0b5c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0613, code lost:
        r1.A16 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0615, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x07eb, code lost:
        X.27B.A01(r1, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x07ee, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0898, code lost:
        if (r5 != false) goto L_0x0b0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x08e5, code lost:
        A0E(r1, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x08e8, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0a77, code lost:
        r1.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0a7a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0ad0, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0b04, code lost:
        r6.A07(r4);
        r6.A08(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0b0a, code lost:
        r8.A0E.A05(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0b0f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0b5c, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r63) {
        /*
            r62 = this;
            r4 = r63
            int r3 = r4.what
            r5 = 3
            r7 = 2
            r0 = 0
            r2 = 1
            r1 = r62
            switch(r3) {
                case 1: goto L_0x0014;
                case 2: goto L_0x0297;
                case 3: goto L_0x0327;
                case 4: goto L_0x0338;
                case 5: goto L_0x0371;
                case 6: goto L_0x037d;
                case 7: goto L_0x03cb;
                case 8: goto L_0x023a;
                case 9: goto L_0x03f3;
                case 10: goto L_0x0581;
                case 11: goto L_0x0420;
                case 12: goto L_0x0424;
                case 13: goto L_0x04ff;
                case 14: goto L_0x04f8;
                case 15: goto L_0x051b;
                case 16: goto L_0x0565;
                case 17: goto L_0x058e;
                case 18: goto L_0x0616;
                case 19: goto L_0x063b;
                case 20: goto L_0x000d;
                case 21: goto L_0x0679;
                case 22: goto L_0x06a5;
                case 23: goto L_0x06b9;
                case 24: goto L_0x0516;
                case 25: goto L_0x06c5;
                case 26: goto L_0x0702;
                case 27: goto L_0x0719;
                case 28: goto L_0x0b4e;
                case 29: goto L_0x0725;
                case 30: goto L_0x07ba;
                case 31: goto L_0x0763;
                case 32: goto L_0x000d;
                case 33: goto L_0x0812;
                case 34: goto L_0x08a3;
                case 35: goto L_0x08e1;
                case 36: goto L_0x000e;
                case 37: goto L_0x0589;
                case 38: goto L_0x08e9;
                case 39: goto L_0x09c5;
                case 40: goto L_0x09fc;
                case 41: goto L_0x0a00;
                case 42: goto L_0x0a0d;
                case 43: goto L_0x04d3;
                case 44: goto L_0x0a43;
                case 45: goto L_0x0a7b;
                case 46: goto L_0x0ad7;
                case 47: goto L_0x07f7;
                case 48: goto L_0x0b5c;
                case 49: goto L_0x0b10;
                case 50: goto L_0x04a3;
                case 51: goto L_0x0b5d;
                default: goto L_0x000d;
            }
        L_0x000d:
            return r0
        L_0x000e:
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "onRenderInternal"
            goto L_0x08e5
        L_0x0014:
            java.lang.Object r3 = r4.obj
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r15 = r3[r0]
            X.4OI r15 = (X.AnonymousClass4OI) r15
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "prepareInternal"
            A0E(r1, r3, r4)
            r15.getClass()
            X.3uU r6 = r15.A0K
            X.4OI r3 = r1.A15
            if (r3 == 0) goto L_0x0062
            X.4OI r3 = r1.A15
            X.3uU r3 = r3.A0K
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0062
            X.4OI r3 = r1.A15
            if (r3 == 0) goto L_0x0048
            X.4OI r3 = r1.A15
            X.28e r4 = r3.A04
            X.28e r3 = r15.A04
            if (r4 == r3) goto L_0x0048
            X.4OI r4 = r1.A15
            X.28e r3 = r15.A04
            r4.A04 = r3
        L_0x0048:
            X.4OI r3 = r1.A15
            if (r3 == 0) goto L_0x005c
            X.4OI r3 = r1.A15
            java.lang.String r3 = r3.A07
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x005c
            X.4OI r4 = r1.A15
            java.lang.String r3 = r15.A07
            r4.A07 = r3
        L_0x005c:
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "skip prepareInternal due to same request"
            goto L_0x08e5
        L_0x0062:
            r1.A15 = r15
            X.4P4 r3 = r1.A19
            X.4R5 r3 = r3.A0A
            int r3 = r3.BdC()
            if (r3 == r2) goto L_0x007c
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "Stopping non idle exoplayer"
            A0E(r1, r3, r4)
            X.4P4 r3 = r1.A19
            X.4R5 r3 = r3.A0A
            r3.stop(r2)
        L_0x007c:
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.A0z
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x008e
            r4 = 19
            A0D(r1, r4)
            java.util.concurrent.atomic.AtomicInteger r3 = r1.A11
            r3.set(r4)
        L_0x008e:
            X.4OI r3 = r1.A15
            int r3 = r3.A01
            if (r3 <= 0) goto L_0x00a4
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r3 = r1.A0w
            boolean r3 = r3.A32
            if (r3 != 0) goto L_0x00a4
            X.4P4 r5 = r1.A19
            X.4OI r3 = r1.A15
            int r3 = r3.A01
            long r3 = (long) r3
            r5.A09(r3, r0)
        L_0x00a4:
            X.1xV r5 = r1.A01()
            X.4P4 r3 = r1.A19
            if (r3 == 0) goto L_0x00c6
            int r4 = r5.A00
            int r7 = r5.A01
            X.4Qa r3 = r3.A09
            if (r3 == 0) goto L_0x00c6
            X.4QZ r5 = r3.A00
            boolean r3 = r5 instanceof X.AnonymousClass4QY
            if (r3 == 0) goto L_0x00c6
            X.4QY r5 = (X.AnonymousClass4QY) r5
            int r3 = r4 * 1000
            long r3 = (long) r3
            r5.A03 = r3
            int r3 = r7 * 1000
            long r3 = (long) r3
            r5.A02 = r3
        L_0x00c6:
            X.4Oi r14 = r1.A0s
            X.4Of r4 = r1.A0v
            java.lang.String r13 = r6.A0G
            java.lang.String r3 = "exoplayer_build_media_source_start"
            r4.DWg(r13, r3)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "buildMediaSource"
            A0E(r1, r3, r4)
            r1.A1D = r2
            r1.A1C = r2
            X.4P4 r9 = r1.A19
            long r3 = r1.A0q
            X.4SU r5 = new X.4SU
            r5.<init>(r15, r1)
            X.4OI r7 = r9.A02
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto L_0x0118
            r7 = 0
            r9.A0D = r7
            java.lang.String r7 = r6.A09     // Catch:{ 2A6 | IOException -> 0x00ff }
            if (r7 == 0) goto L_0x0118
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r8 = r9.A0Q     // Catch:{ 2A6 | IOException -> 0x00ff }
            android.content.Context r7 = r9.A0L     // Catch:{ 2A6 | IOException -> 0x00ff }
            X.3w6 r7 = X.AnonymousClass4PG.A01(r7, r15, r8)     // Catch:{ 2A6 | IOException -> 0x00ff }
            r9.A0D = r7     // Catch:{ 2A6 | IOException -> 0x00ff }
            goto L_0x0118
        L_0x00ff:
            r7 = move-exception
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r12 = r9.A03
            java.lang.String r11 = "MANIFEST"
            java.lang.String r10 = "MANIFEST_PARSE_ERROR"
            java.lang.String r8 = "Exception: "
            java.lang.String r7 = r7.getMessage()
            java.lang.String r8 = X.002.A0R(r8, r7)
            X.4Yy r7 = new X.4Yy
            r7.<init>(r13, r11, r10, r8)
            r12.callback(r7)
        L_0x0118:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r8 = r9.A0Q
            boolean r7 = r8.A2t
            if (r7 != 0) goto L_0x0122
            boolean r7 = r8.A2l
            if (r7 == 0) goto L_0x0145
        L_0x0122:
            X.4OI r7 = r9.A02
            if (r7 == 0) goto L_0x0145
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x0145
            X.4R5 r7 = r9.A0A
            if (r7 == 0) goto L_0x0142
            r7.release()
            r9.A0B(r15)
            X.4PG r10 = r9.A08
            X.4OS r8 = r9.A0O
            X.3w6 r7 = r9.A0D
            X.4PL[] r7 = r10.A05(r15, r8, r7)
            r9.A0G = r7
        L_0x0142:
            X.AnonymousClass4P4.A02(r15, r9, r2)
        L_0x0145:
            X.4PE r12 = r9.A07
            X.3wP r19 = X.C256823wP.A00
            X.4PG r7 = r9.A08
            X.4Sp r11 = r7.A00
            X.3w6 r10 = r9.A0D
            X.4P8 r8 = r9.A0P
            X.4Oq r13 = r9.A01
            boolean r24 = r7.A04(r6)
            X.4OS r7 = r9.A0O
            X.4SG r6 = r7.A18
            if (r6 != 0) goto L_0x0236
            r6 = 0
        L_0x015e:
            r16 = r5
            r17 = r8
            r18 = r11
            r20 = r10
            r21 = r6
            r22 = r3
            X.4T2 r10 = r12.BQp(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24)
            if (r10 != 0) goto L_0x0185
            java.lang.String r4 = "Media source is null"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r4)
            r5.A00(r3)
        L_0x017a:
            r3 = -1
            r1.A09 = r3
            r1.A0c = r0
            r0 = 10
            r1.A03 = r0
            return r2
        L_0x0185:
            r8.A00 = r15
            X.4Su r4 = r10.A08
            android.os.Handler r3 = r9.A0M
            r4.A8P(r3, r8)
            r9.A0C = r4
            X.5fO r3 = r10.A07
            r9.A04 = r3
            r9.A02 = r15
            X.3w6 r3 = r9.A0D
            long[] r9 = X.C256373vf.A03(r3)
            java.lang.Integer r3 = r10.A09
            r43 = r3
            int r3 = r10.A01
            r26 = r3
            int r3 = r10.A00
            r25 = r3
            long r3 = r10.A06
            r23 = r3
            long r14 = r10.A03
            long r12 = r10.A05
            long r6 = r10.A04
            long r3 = r10.A02
            boolean r8 = r10.A0F
            r19 = r8
            boolean r8 = r10.A0D
            r18 = r8
            java.lang.String r8 = r10.A0A
            r20 = r8
            java.lang.String r8 = r10.A0B
            r22 = r8
            boolean r8 = r10.A0E
            r17 = r8
            r35 = r9[r0]
            r37 = r9[r2]
            boolean r8 = r10.A0G
            r16 = r8
            java.lang.String r8 = r10.A0C
            r21 = r8
            X.4OS r10 = r5.A01
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r8 = "prepareMediaSource onCompleted"
            A0E(r10, r8, r9)
            X.4Of r9 = r10.A0v
            X.4OI r8 = r10.A15
            if (r8 == 0) goto L_0x022e
            X.3uU r8 = r8.A0K
            java.lang.String r8 = r8.A0G
            if (r8 == 0) goto L_0x022e
            X.4OI r8 = r10.A15
            if (r8 == 0) goto L_0x022c
            X.3uU r8 = r8.A0K
            java.lang.String r8 = r8.A0G
        L_0x01f1:
            java.lang.String r11 = "exoplayer_build_media_source_end"
            r9.DWg(r8, r11)
            X.4OI r8 = r5.A00
            X.4T4 r5 = new X.4T4
            r27 = r12
            r29 = r6
            r31 = r23
            r33 = r3
            r39 = r17
            r40 = r16
            r41 = r19
            r42 = r18
            r16 = r5
            r17 = r8
            r18 = r10
            r19 = r43
            r23 = r26
            r24 = r25
            r25 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31, r33, r35, r37, r39, r40, r41, r42)
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Handler r4 = r10.A0G
            android.os.Looper r3 = r4.getLooper()
            if (r6 == r3) goto L_0x0231
            r4.post(r5)
            goto L_0x017a
        L_0x022c:
            r8 = 0
            goto L_0x01f1
        L_0x022e:
            java.lang.String r8 = "null"
            goto L_0x01f1
        L_0x0231:
            r5.run()
            goto L_0x017a
        L_0x0236:
            X.4SG r6 = r7.A18
            goto L_0x015e
        L_0x023a:
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "releaseInternal"
            A0E(r1, r3, r4)
            boolean r3 = r1.A1E
            if (r3 != 0) goto L_0x0581
            X.4P4 r4 = r1.A19
            java.util.List r3 = r4.A0R
            r3.clear()
            X.4R5 r3 = r4.A0A
            r3.release()
            android.os.HandlerThread r4 = r1.A0r
            java.util.concurrent.ConcurrentLinkedQueue r3 = X.C300515xK.A00
            boolean r3 = X.00k.A0u(r3, r4)
            if (r3 != 0) goto L_0x0264
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r3 = r1.A0w
            boolean r3 = r3.A2z
            if (r3 == 0) goto L_0x0293
            r4.quitSafely()
        L_0x0264:
            r1.A1E = r2
            r1.A02()
            r3 = 0
            r1.A0K = r3
            r1.A0I = r3
            r1.A0J = r3
            r3 = -1
            r1.A0D = r3
            r1.A08 = r3
            X.4T5 r3 = r1.A0R
            if (r3 == 0) goto L_0x027d
            r3.Elw(r0)
        L_0x027d:
            X.4UL r3 = r1.A0S
            if (r3 == 0) goto L_0x0581
            r3.Elw(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Setting StayAwake on WifiLockManager to: %b"
            A0E(r1, r0, r3)
            goto L_0x0581
        L_0x0293:
            r4.quit()
            goto L_0x0264
        L_0x0297:
            java.lang.Object r3 = r4.obj
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r3 = r3[r0]
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            X.4Of r8 = r1.A0v
            X.4OI r6 = r1.A15
            if (r6 == 0) goto L_0x0324
            X.3uU r6 = r6.A0K
            java.lang.String r6 = r6.A0G
            if (r6 == 0) goto L_0x0324
            X.4OI r6 = r1.A15
            if (r6 == 0) goto L_0x0322
            X.3uU r6 = r6.A0K
            java.lang.String r6 = r6.A0G
        L_0x02b7:
            java.lang.String r7 = "play_internal"
            r8.DWg(r6, r7)
            X.4P4 r8 = r1.A19
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r7 = new java.lang.Object[]{r6}
            java.lang.String r6 = "playInternal: %d"
            A0E(r1, r6, r7)
            boolean r6 = r1.A1C
            if (r6 != 0) goto L_0x02d4
            boolean r7 = r8.A0F
            r6 = 1
            if (r7 != 0) goto L_0x02d5
        L_0x02d4:
            r6 = 0
        L_0x02d5:
            A0F(r1, r0, r6)
            r9 = 0
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x0310
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r6 = r8.A0Q
            boolean r6 = r6.A2k
            if (r6 == 0) goto L_0x031b
            boolean r6 = X.AnonymousClass4P4.A04(r8)
            if (r6 != 0) goto L_0x031b
            X.4R5 r6 = r8.A0A
            long r9 = r6.Atl()
        L_0x02f0:
            int r6 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0310
            X.4P4 r6 = r1.A19
            X.4R5 r6 = r6.A0A
            int r7 = r6.BdC()
            r6 = 0
            if (r7 != r5) goto L_0x0300
            r6 = 1
        L_0x0300:
            r1.A0k = r6
            r8.A08(r3)
            boolean r3 = r1.A0k
            if (r3 == 0) goto L_0x0310
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Delay sending play due to seek"
            A0E(r1, r0, r3)
        L_0x0310:
            boolean r0 = r1.A0k
            if (r0 != 0) goto L_0x0581
            X.4R5 r0 = r8.A0A
            r0.Efw(r2)
            goto L_0x0581
        L_0x031b:
            X.4R5 r6 = r8.A0A
            long r9 = r6.AuI()
            goto L_0x02f0
        L_0x0322:
            r6 = 0
            goto L_0x02b7
        L_0x0324:
            java.lang.String r6 = "null"
            goto L_0x02b7
        L_0x0327:
            java.lang.Object r3 = r4.obj
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = r3[r0]
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1.A0G(r0)
            goto L_0x0581
        L_0x0338:
            java.lang.Object r8 = r4.obj
            long[] r8 = (long[]) r8
            r3 = r8[r0]
            r5 = r8[r2]
            r10 = 1
            r8 = r8[r7]
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L_0x034a
            r8 = 1
        L_0x034a:
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.String r0 = "seekToInternal"
            A0E(r1, r0, r7)
            boolean r0 = r1.A0i
            if (r0 == 0) goto L_0x036b
            X.4P4 r0 = r1.A19
            r0.A09(r3, r8)
        L_0x035a:
            r1.A0A = r5
            X.4Of r7 = r1.A0v
            long r5 = android.os.SystemClock.elapsedRealtime()
            X.4Mx r0 = r1.A00(r5, r2)
            r7.DiV(r0, r3)
            goto L_0x0581
        L_0x036b:
            X.4P4 r0 = r1.A19
            r0.A08(r3)
            goto L_0x035a
        L_0x0371:
            java.lang.Object r0 = r4.obj
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            A0B(r1, r0)
            return r2
        L_0x037d:
            java.lang.Object r4 = r4.obj
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r6 = r4[r0]
            android.view.Surface r6 = (android.view.Surface) r6
            r3 = r4[r2]
            java.lang.Number r3 = (java.lang.Number) r3
            int r8 = r3.intValue()
            r3 = r4[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r7 = r3.intValue()
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "setSurfaceInternal"
            A0E(r1, r3, r4)
            r1.A0J = r6
            r3 = -1
            if (r8 == r3) goto L_0x03c5
            if (r7 == r3) goto L_0x03c5
            X.4P4 r3 = r1.A19
            X.4S7 r5 = new X.4S7
            r5.<init>(r8, r7)
            r3.A0A(r6, r0)
            X.4R5 r4 = r3.A0A
            X.4PL[] r3 = r3.A0G
            r0 = r3[r0]
            X.4SA r3 = r4.AMN(r0)
            r0 = 14
            r3.A01(r0)
            r3.A02(r5)
            r3.A00()
        L_0x03c2:
            r1.A0I = r6
            return r2
        L_0x03c5:
            X.4P4 r3 = r1.A19
            r3.A0A(r6, r0)
            goto L_0x03c2
        L_0x03cb:
            java.lang.Object r6 = r4.obj
            android.os.ResultReceiver r6 = (android.os.ResultReceiver) r6
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "releaseSurfaceInternal"
            A0E(r1, r0, r3)
            r5 = 0
            r1.A0K = r5     // Catch:{ all -> 0x03ee }
            r1.A0I = r5     // Catch:{ all -> 0x03ee }
            r1.A0J = r5     // Catch:{ all -> 0x03ee }
            r3 = -1
            r1.A0D = r3     // Catch:{ all -> 0x03ee }
            r1.A08 = r3     // Catch:{ all -> 0x03ee }
            X.4P4 r0 = r1.A19     // Catch:{ all -> 0x03ee }
            r0.A0A(r5, r2)     // Catch:{ all -> 0x03ee }
            r1.A0I = r5     // Catch:{ all -> 0x03ee }
            r6.send(r2, r5)
            return r2
        L_0x03ee:
            r0 = move-exception
            r6.send(r2, r5)
            throw r0
        L_0x03f3:
            java.lang.Object r3 = r4.obj
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = r3[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r9 = 0
            if (r0 != r2) goto L_0x0403
            r9 = 1
        L_0x0403:
            r0 = r3[r2]
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            r0 = r3[r7]
            java.lang.Number r0 = (java.lang.Number) r0
            long r7 = r0.longValue()
            r0 = r3[r5]
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r10 = r0.booleanValue()
            r5 = r1
            r5.A05(r6, r7, r9, r10)
            return r2
        L_0x0420:
            r1.A0H(r2)
            return r2
        L_0x0424:
            java.lang.Object r6 = r4.obj
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r4 = r6[r0]
            java.lang.String r4 = (java.lang.String) r4
            r3 = r6[r2]
            java.lang.String r3 = (java.lang.String) r3
            r9 = r6[r7]
            java.lang.String r9 = (java.lang.String) r9
            r10 = r6[r5]
            java.lang.String r10 = (java.lang.String) r10
            X.5OZ r5 = X.AnonymousClass5OZ.A00(r4)
            X.4Yz r4 = X.C266464Yz.valueOf(r3)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0441 }
            goto L_0x0443
        L_0x0441:
            X.4Yz r4 = X.C266464Yz.A1Y
        L_0x0443:
            X.4OI r3 = r1.A15
            if (r3 == 0) goto L_0x0488
            X.3uU r3 = r3.A0K
            java.lang.String r3 = r3.A0G
        L_0x044b:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object[] r6 = new java.lang.Object[]{r5, r4, r3}
            java.lang.String r3 = "onPlayerError: %s, %s, %s"
            A0E(r1, r3, r6)
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r3 = r1.A0w
            boolean r3 = r3.A38
            if (r3 == 0) goto L_0x046f
            X.4P4 r3 = r1.A19
            X.4R5 r3 = r3.A0A
            boolean r3 = r3.Bd1()
            if (r3 == 0) goto L_0x046f
            X.4P4 r3 = r1.A19
            X.4R5 r3 = r3.A0A
            r3.Efw(r0)
        L_0x046f:
            X.4Yz r0 = X.C266464Yz.A14
            if (r0 != r4) goto L_0x048a
            X.5OZ r0 = X.AnonymousClass5OZ.PLAYER_RELEASE_TIMEOUT
            if (r0 != r5) goto L_0x048a
            X.4Of r5 = r1.A0v
            java.lang.String r4 = "PLAYER_RELEASE_TIMEOUT"
            java.lang.String r3 = "PLAYBACK_EXCEPTION"
            java.lang.String r1 = ", "
            r0 = 0
            java.lang.String r0 = X.002.A0g(r9, r1, r0)
            r5.E07(r4, r3, r0)
            return r2
        L_0x0488:
            r3 = 0
            goto L_0x044b
        L_0x048a:
            X.4Of r6 = r1.A0v
            java.lang.String r7 = r5.name()
            java.lang.String r8 = r4.name()
            X.4OI r0 = r1.A15
            if (r0 == 0) goto L_0x04a0
            X.4OI r0 = r1.A15
            java.lang.String r11 = r0.A07
        L_0x049c:
            r6.DCs(r7, r8, r9, r10, r11)
            return r2
        L_0x04a0:
            java.lang.String r11 = ""
            goto L_0x049c
        L_0x04a3:
            java.lang.Object r3 = r4.obj
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            if (r3 == 0) goto L_0x0b5c
            r0 = r3[r0]
            if (r0 == 0) goto L_0x0b5c
            r6 = r3[r2]
            if (r6 == 0) goto L_0x0b5c
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            X.2Co r6 = (X.2Co) r6
            X.4P4 r5 = r1.A19
            if (r5 == 0) goto L_0x0b5c
            X.4R5 r1 = r5.A0A
            X.WM3 r0 = new X.WM3
            r0.<init>(r6, r5)
            X.4SA r1 = r1.AMN(r0)
            boolean r0 = r1.A07
            r0 = r0 ^ 1
            X.C256703wD.A04(r0)
            r1.A02 = r3
            goto L_0x0a77
        L_0x04d3:
            java.lang.Object r3 = r4.obj
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r5 = r3.booleanValue()
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "enableSRInternal"
            A0E(r1, r3, r4)
            X.4P4 r1 = r1.A19
            X.4R5 r3 = r1.A0A
            X.4PL[] r1 = r1.A0G
            r0 = r1[r0]
            X.4SA r1 = r3.AMN(r0)
            r0 = 10001(0x2711, float:1.4014E-41)
            r1.A01(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            goto L_0x0511
        L_0x04f8:
            java.lang.Object r4 = r4.obj
            X.4P4 r0 = r1.A19
            r3 = 10002(0x2712, float:1.4016E-41)
            goto L_0x0504
        L_0x04ff:
            r4 = 0
            X.4P4 r0 = r1.A19
            r3 = 10001(0x2711, float:1.4014E-41)
        L_0x0504:
            X.4R5 r1 = r0.A0A
            X.4PL[] r0 = r0.A0G
            r0 = r0[r2]
            X.4SA r1 = r1.AMN(r0)
            r1.A01(r3)
        L_0x0511:
            r1.A02(r4)
            goto L_0x0a77
        L_0x0516:
            java.lang.Object r0 = r4.obj
            X.4My r0 = (X.C263684My) r0
            goto L_0x0561
        L_0x051b:
            java.lang.Object r6 = r4.obj
            long[] r6 = (long[]) r6
            X.4My r11 = r1.A13
            r4 = r6[r2]
            int r3 = (int) r4
            r37 = r3
            r23 = r6[r0]
            long r25 = android.os.SystemClock.elapsedRealtime()
            long r3 = r11.A03
            r35 = r3
            long r14 = r11.A07
            long r12 = r11.A06
            long r9 = r11.A08
            long r7 = r11.A01
            boolean r0 = r11.A0B
            r17 = r0
            long r5 = r11.A04
            long r3 = r11.A05
            boolean r0 = r11.A0C
            r16 = r0
            java.lang.String r11 = r11.A0A
            X.4My r0 = new X.4My
            r27 = r7
            r29 = r5
            r31 = r3
            r33 = r17
            r34 = r16
            r17 = r14
            r19 = r12
            r21 = r9
            r12 = r0
            r13 = r11
            r14 = r37
            r15 = r35
            r12.<init>(r13, r14, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r34)
        L_0x0561:
            r1.A08(r0)
            return r2
        L_0x0565:
            java.lang.Object r3 = r4.obj
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.String r0 = "setRelativePositionInternal"
            A0E(r1, r0, r5)
            java.lang.Integer r5 = r1.A0U
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r5 != r0) goto L_0x0581
            X.4P4 r0 = r1.A19
            X.4R5 r0 = r0.A0A
            r0.EiI(r3)
        L_0x0581:
            long r3 = android.os.SystemClock.elapsedRealtime()
            r1.A06(r3)
            return r2
        L_0x0589:
            java.lang.Object r5 = r4.obj
            X.4Od r5 = (X.C263994Od) r5
            goto L_0x060b
        L_0x058e:
            java.lang.Object r3 = r4.obj
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            X.4My r4 = r1.A13
            r0 = r3[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            long r9 = r0.longValue()
            r0 = r3[r7]
            java.lang.Number r0 = (java.lang.Number) r0
            long r11 = r0.longValue()
            r0 = r3[r5]
            java.lang.Number r0 = (java.lang.Number) r0
            long r13 = r0.longValue()
            r0 = r3[r2]
            java.lang.Number r0 = (java.lang.Number) r0
            long r15 = r0.longValue()
            long r19 = android.os.SystemClock.elapsedRealtime()
            r0 = 4
            r0 = r3[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            long r21 = r0.longValue()
            r0 = 5
            r0 = r3[r0]
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r27 = r0.booleanValue()
            r0 = 6
            r0 = r3[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            long r23 = r0.longValue()
            r0 = 7
            r0 = r3[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            long r25 = r0.longValue()
            r0 = 8
            r0 = r3[r0]
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r28 = r0.booleanValue()
            r0 = 10
            r7 = r3[r0]
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r4.A00
            long r4 = r4.A02
            X.4My r6 = new X.4My
            r17 = r4
            r6.<init>(r7, r8, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r28)
            r1.A08(r6)
            X.4Od r5 = r1.A16
            r0 = 9
            r4 = r3[r0]
            java.util.List r4 = (java.util.List) r4
            java.lang.String r3 = r5.A00
            boolean r0 = r5.A02
            X.4Od r5 = new X.4Od
            r5.<init>(r3, r4, r0)
        L_0x060b:
            X.4Od r0 = r1.A16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0b5c
            r1.A16 = r5
            return r2
        L_0x0616:
            java.lang.Object r0 = r4.obj
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            java.lang.String r0 = "setLoopingInternal %b"
            A0E(r1, r0, r3)
            r1.A0j = r5
            boolean r0 = A0J(r1)
            if (r0 == 0) goto L_0x0b5c
            X.4P4 r0 = r1.A19
            if (r5 == 0) goto L_0x0635
            r4 = 2
        L_0x0635:
            X.4R5 r0 = r0.A0A
            r0.EiZ(r4)
            return r2
        L_0x063b:
            java.lang.Object r7 = r4.obj
            X.4N6 r7 = (X.AnonymousClass4N6) r7
            android.view.Surface r3 = r1.A0J
            java.lang.Object[] r4 = new java.lang.Object[]{r3}
            java.lang.String r3 = "leaveWarmUpInternal, surface: %s"
            A0E(r1, r3, r4)
            X.4Of r6 = r1.A0v
            X.4N6 r5 = r6.A01
            boolean r3 = r5 instanceof X.AnonymousClass4Og
            if (r3 == 0) goto L_0x0b5c
            X.4Og r5 = (X.AnonymousClass4Og) r5
            X.4OS r3 = r6.A00
            long r3 = r3.A0q
            r6.DjL(r3)
            r6.A01 = r7
            r5.A00 = r6
        L_0x065f:
            java.util.Queue r4 = r5.A01
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x0673
            java.lang.Object r3 = r4.poll()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            if (r3 == 0) goto L_0x065f
            r3.run()
            goto L_0x065f
        L_0x0673:
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A10
            r1.set(r0)
            return r2
        L_0x0679:
            java.lang.Object r5 = r4.obj
            java.util.List r5 = (java.util.List) r5
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "onTimestampGapsChanged"
            A0E(r1, r0, r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r5.iterator()
        L_0x068d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x069f
            r3.next()
            X.XVZ r0 = new X.XVZ
            r0.<init>()
            r4.add(r0)
            goto L_0x068d
        L_0x069f:
            X.4Of r0 = r1.A0v
            r0.Drl(r4)
            return r2
        L_0x06a5:
            java.lang.Object r3 = r4.obj
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r4 = r3.booleanValue()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "liveLatencyMode"
            A0E(r1, r0, r3)
            X.4Oi r0 = r1.A0s
            r0.A00 = r4
            return r2
        L_0x06b9:
            java.lang.Object r0 = r4.obj
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            A0C(r1, r0)
            return r2
        L_0x06c5:
            java.lang.Object r8 = r4.obj
            java.lang.String r8 = (java.lang.String) r8
            X.4P4 r0 = r1.A19
            X.4PE r0 = r0.A07
            X.28w r7 = r0.Av8()
            if (r7 == 0) goto L_0x0b5c
            r6 = 0
            if (r8 == 0) goto L_0x06df
            X.3wB[] r0 = r7.A0F
            if (r0 != 0) goto L_0x06e4
            X.28i r0 = r7.A02
            monitor-enter(r0)
            monitor-exit(r0)
            return r2
        L_0x06df:
            X.28i r0 = r7.A02
            monitor-enter(r0)
            monitor-exit(r0)
            goto L_0x06fc
        L_0x06e4:
            X.3wB[] r5 = r7.A0F
            int r4 = r5.length
            r3 = 0
        L_0x06e8:
            if (r3 >= r4) goto L_0x06df
            r1 = r5[r3]
            X.3wA r0 = r1.A0N
            java.lang.String r0 = r0.A07
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x06ff
            X.28i r0 = r7.A02
            monitor-enter(r0)
            monitor-exit(r0)
            java.lang.String r6 = r1.A0T
        L_0x06fc:
            r7.A0E = r6
            return r2
        L_0x06ff:
            int r3 = r3 + 1
            goto L_0x06e8
        L_0x0702:
            java.lang.Object r3 = r4.obj
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.String r0 = "preSeekToInternal"
            A0E(r1, r0, r5)
            X.4P4 r0 = r1.A19
            X.4R5 r0 = r0.A0A
            r0.E3P(r3)
            return r2
        L_0x0719:
            java.lang.Object r0 = r4.obj
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            A0A(r1, r0)
            return r2
        L_0x0725:
            java.lang.Object r3 = r4.obj
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r6 = r3.booleanValue()
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "enableVideoTrackInternal"
            A0E(r1, r3, r4)
            X.4P4 r3 = r1.A19
            int r3 = r3.A05(r0)
            r5 = -1
            if (r3 != r5) goto L_0x074c
            if (r6 == 0) goto L_0x074c
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "Enable video track"
            X.28J.A02(r1, r3, r4)
            X.4P4 r1 = r1.A19
            r1.A07(r0, r0)
            return r2
        L_0x074c:
            X.4P4 r3 = r1.A19
            int r3 = r3.A05(r0)
            if (r3 == r5) goto L_0x0b5c
            if (r6 != 0) goto L_0x0b5c
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "Disable video track"
            X.28J.A02(r1, r3, r4)
            X.4P4 r1 = r1.A19
            r1.A07(r0, r5)
            return r2
        L_0x0763:
            java.lang.Object r3 = r4.obj
            java.lang.Number r3 = (java.lang.Number) r3
            int r6 = r3.intValue()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "setStreamLatencyMode"
            A0E(r1, r0, r3)
            X.4SG r0 = r1.A18
            if (r0 == 0) goto L_0x0b5c
            X.4SG r5 = r1.A18
            X.4Ox r4 = r5.A0Q
            int r0 = r4.A01
            if (r0 == r6) goto L_0x079e
            r4.A01 = r6
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r4.A0B
            int r0 = r0.A0f
            if (r0 == r7) goto L_0x07b7
            if (r0 == r2) goto L_0x07b4
            if (r6 == r2) goto L_0x07b4
            if (r6 == r7) goto L_0x07b7
            java.lang.String r0 = "Classifier"
        L_0x078e:
            r4.A06 = r0
            X.214 r3 = X.214.A04
        L_0x0792:
            r4.A05 = r3
            X.214 r1 = r4.A09
            java.lang.String r0 = "Toggle"
            X.C264184Ox.A01(r1, r3, r4, r0)
            X.C264184Ox.A02(r4)
        L_0x079e:
            X.214 r1 = r4.A05
            X.214 r0 = X.214.A04
            if (r1 != r0) goto L_0x07a7
            X.AnonymousClass4SG.A02(r5)
        L_0x07a7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            java.lang.String r1 = "LiveLatencyManager"
            java.lang.String r0 = "Stream latency mode now %s "
            goto L_0x07eb
        L_0x07b4:
            X.214 r3 = X.214.A02
            goto L_0x0792
        L_0x07b7:
            java.lang.String r0 = "ToggleNormal"
            goto L_0x078e
        L_0x07ba:
            java.lang.Object r3 = r4.obj
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r5 = r3.booleanValue()
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "enableLiveLowLatencyOptimization"
            A0E(r1, r3, r4)
            X.4SG r3 = r1.A18
            if (r3 == 0) goto L_0x0b5c
            X.4SG r3 = r1.A18
            java.lang.String r1 = ""
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0b5c
            boolean r1 = r3.A0I
            if (r1 == 0) goto L_0x07ef
            if (r5 != 0) goto L_0x07df
            r3.A0I = r0
        L_0x07df:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            java.lang.String r1 = "LiveLatencyManager"
            java.lang.String r0 = "Enabling low latency mode now %s "
        L_0x07eb:
            X.27B.A01(r1, r0, r3)
            return r2
        L_0x07ef:
            if (r5 == 0) goto L_0x07df
            r3.A0I = r2
            X.AnonymousClass4SG.A02(r3)
            goto L_0x07df
        L_0x07f7:
            java.lang.Object r0 = r4.obj
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            X.4P4 r8 = r1.A19
            if (r8 == 0) goto L_0x0b5c
            X.4Qo r0 = r8.A0E
            X.4Qb r0 = r0.A04()
            X.4Qd r6 = new X.4Qd
            r6.<init>(r0)
            r6.A0B = r3
            goto L_0x0ad0
        L_0x0812:
            java.lang.Object r4 = r4.obj
            X.4Od r4 = (X.C263994Od) r4
            if (r4 == 0) goto L_0x0b5c
            java.lang.String r3 = r4.A00
            if (r3 != 0) goto L_0x0840
            boolean r3 = r4.A02
            if (r3 == 0) goto L_0x0840
            X.4Od r3 = r1.A16
            java.util.List r3 = r3.A01
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r3)
            int r3 = r5.size()
            if (r3 != r2) goto L_0x0840
            java.util.Iterator r3 = r5.iterator()
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.List r3 = r4.A01
            X.4Od r4 = new X.4Od
            r4.<init>(r5, r3, r2)
        L_0x0840:
            X.4P4 r8 = r1.A19
            X.4Qo r1 = r8.A0E
            X.4Qb r1 = r1.A04()
            X.4Qd r6 = new X.4Qd
            r6.<init>(r1)
            int r3 = r8.A05(r7)
            boolean r1 = r4.A02
            r9 = 0
            if (r1 == 0) goto L_0x089c
            r1 = -1
            if (r3 != r1) goto L_0x0896
            r6.A09(r7, r0)
            java.lang.String r1 = r4.A00
            if (r1 != 0) goto L_0x088e
            r6.A0P = r2
        L_0x0862:
            r5 = 1
        L_0x0863:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r8.A0Q
            boolean r1 = r1.A2S
            if (r1 == 0) goto L_0x0898
            if (r3 != 0) goto L_0x0898
            java.lang.String r4 = r4.A00
            r3 = 0
            if (r4 != 0) goto L_0x0871
            r3 = 1
        L_0x0871:
            X.4Qo r1 = r8.A0E
            X.4Qb r1 = r1.A04()
            boolean r1 = r1.A0P
            if (r1 == r3) goto L_0x0898
            if (r4 != 0) goto L_0x087e
            r9 = 1
        L_0x087e:
            r6.A0P = r9
            if (r4 != 0) goto L_0x0889
            java.lang.String[] r0 = new java.lang.String[r0]
        L_0x0884:
            r6.A06(r0)
            goto L_0x0b0a
        L_0x0889:
            java.lang.String[] r0 = new java.lang.String[]{r4}
            goto L_0x0884
        L_0x088e:
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r6.A06(r1)
            goto L_0x0862
        L_0x0896:
            r5 = 0
            goto L_0x0863
        L_0x0898:
            if (r5 == 0) goto L_0x0b5c
            goto L_0x0b0a
        L_0x089c:
            if (r3 != 0) goto L_0x0b5c
            r6.A09(r7, r2)
            goto L_0x0b0a
        L_0x08a3:
            java.lang.Object r3 = r4.obj
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r5 = r3.booleanValue()
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "enableVideoTrackInternal"
            A0E(r1, r3, r4)
            X.4P4 r3 = r1.A19
            int r3 = r3.A05(r7)
            r4 = -1
            if (r3 != r4) goto L_0x08ca
            if (r5 == 0) goto L_0x08ca
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "Enable Text track"
            X.28J.A02(r1, r3, r4)
            X.4P4 r1 = r1.A19
            r1.A07(r7, r0)
            return r2
        L_0x08ca:
            X.4P4 r3 = r1.A19
            int r3 = r3.A05(r7)
            if (r3 == r4) goto L_0x0b5c
            if (r5 != 0) goto L_0x0b5c
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Disable Text track"
            X.28J.A02(r1, r0, r3)
            X.4P4 r0 = r1.A19
            r0.A07(r7, r4)
            return r2
        L_0x08e1:
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "onBeforeRenderInternal"
        L_0x08e5:
            A0E(r1, r0, r3)
            return r2
        L_0x08e9:
            java.lang.Object r4 = r4.obj
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r3 = r4[r0]
            java.lang.Number r3 = (java.lang.Number) r3
            int r7 = r3.intValue()
            r3 = r4[r2]
            java.lang.Number r3 = (java.lang.Number) r3
            long r4 = r3.longValue()
            java.lang.String r3 = "onPositionDiscontinuity "
            java.lang.String r6 = X.002.A0O(r3, r7)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            A0E(r1, r6, r3)
            boolean r3 = A0J(r1)
            if (r3 == 0) goto L_0x0b5c
            if (r7 == 0) goto L_0x0913
            r3 = 5
            if (r7 != r3) goto L_0x0b5c
        L_0x0913:
            X.4Mx r3 = r1.A14
            int r6 = r3.A0T
            X.4P4 r3 = r1.A19
            X.4R5 r3 = r3.A0A
            int r3 = r3.Auj()
            if (r6 != r3) goto L_0x0b5c
            X.4Mx r13 = r1.A00(r4, r2)
            long r14 = r13.A0H
            boolean r3 = r13.A0Q
            r50 = r3
            boolean r3 = r13.A0R
            r51 = r3
            long r9 = r13.A0U
            long r7 = r13.A09
            r36 = 0
            long r5 = r13.A0I
            java.lang.String r3 = r13.A0M
            r61 = r3
            java.lang.String r11 = ""
            int r3 = r13.A05
            r60 = r3
            int r3 = r13.A04
            r59 = r3
            long r3 = r13.A0C
            int r12 = r13.A03
            r58 = r12
            int r12 = r13.A06
            r57 = r12
            int r12 = r13.A01
            r56 = r12
            int r12 = r13.A02
            r23 = r12
            float r12 = r13.A00
            r22 = r12
            int r12 = r13.A07
            r21 = r12
            boolean r12 = r13.A0N
            r20 = r12
            java.lang.String r12 = r13.A0V
            r19 = r12
            int r12 = r13.A0T
            r18 = r12
            boolean r12 = r13.A0P
            r17 = r12
            boolean r12 = r13.A0S
            r16 = r12
            java.lang.String r12 = r13.A0W
            X.4Mx r13 = new X.4Mx
            r24 = r21
            r25 = r18
            r26 = r14
            r28 = r9
            r30 = r7
            r32 = r9
            r34 = r9
            r38 = r36
            r40 = r5
            r42 = r36
            r44 = r36
            r46 = r3
            r48 = r36
            r52 = r0
            r53 = r20
            r54 = r17
            r55 = r16
            r14 = r61
            r15 = r19
            r16 = r12
            r17 = r22
            r18 = r60
            r19 = r59
            r20 = r58
            r21 = r57
            r22 = r56
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r51, r52, r53, r54, r55)
            X.4Of r6 = r1.A0v
            java.lang.String r5 = r1.A0W
            java.lang.String r4 = r1.A0X
            X.4OI r3 = r1.A15
            if (r3 == 0) goto L_0x09bc
            X.4OI r1 = r1.A15
            java.lang.String r11 = r1.A07
        L_0x09bc:
            r7 = r13
            r8 = r5
            r9 = r4
            r10 = r11
            r11 = r0
            r6.D5J(r7, r8, r9, r10, r11)
            return r2
        L_0x09c5:
            java.lang.Object r4 = r4.obj
            X.3wB r4 = (X.C256683wB) r4
            java.lang.String r3 = r4.A0S
            if (r3 == 0) goto L_0x09f1
            java.lang.String r0 = "video"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x09f1
            java.lang.String r0 = r4.A0T
            r1.A0X = r0
        L_0x09d9:
            X.4SG r0 = r1.A18
            X.4Ox r3 = r0.A0Q
            java.lang.String r1 = r4.A0S
            if (r1 == 0) goto L_0x0b5c
            java.lang.String r0 = "video"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0b5c
            int r0 = r4.A05
            r3.A00 = r0
            r3.A05()
            return r2
        L_0x09f1:
            boolean r0 = X.C256933wa.A02(r4)
            if (r0 == 0) goto L_0x09d9
            java.lang.String r0 = r4.A0T
            r1.A0W = r0
            goto L_0x09d9
        L_0x09fc:
            r1.A03()
            return r2
        L_0x0a00:
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "stopInternal"
            A0E(r1, r3, r4)
            r1.A1G = r2
            r1.A0H(r0)
            return r2
        L_0x0a0d:
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "moveToWarmupInternal"
            A0E(r1, r3, r4)
            X.4OI r3 = r1.A15
            if (r3 == 0) goto L_0x0b5c
            X.4Og r6 = new X.4Og
            r6.<init>()
            long r3 = android.os.SystemClock.elapsedRealtime()
            X.4Mx r3 = r1.A00(r3, r0)
            java.lang.String r0 = r1.A0V
            r6.DZ0(r3, r0)
            boolean r0 = r3.A0Q
            if (r0 == 0) goto L_0x0a32
            r0 = 0
            android.text.TextUtils.isEmpty(r0)
        L_0x0a32:
            X.4Of r5 = r1.A0v
            X.4OS r0 = r5.A00
            long r3 = r0.A0q
            r5.DjL(r3)
            r5.A01 = r6
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A10
            r0.set(r2)
            return r2
        L_0x0a43:
            java.lang.Object r4 = r4.obj
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r3 = r4[r0]
            java.lang.Number r3 = (java.lang.Number) r3
            int r6 = r3.intValue()
            r3 = r4[r2]
            java.lang.Number r3 = (java.lang.Number) r3
            int r5 = r3.intValue()
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "enableSetVideoOutputResolutionInternal"
            A0E(r1, r3, r4)
            X.4P4 r1 = r1.A19
            X.4S7 r4 = new X.4S7
            r4.<init>(r6, r5)
            X.4R5 r3 = r1.A0A
            X.4PL[] r1 = r1.A0G
            r0 = r1[r0]
            X.4SA r1 = r3.AMN(r0)
            r0 = 14
            r1.A01(r0)
            r1.A02(r4)
        L_0x0a77:
            r1.A00()
            return r2
        L_0x0a7b:
            java.lang.Object r0 = r4.obj
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            X.4P4 r0 = r1.A19
            if (r0 == 0) goto L_0x0b5c
            X.4P4 r8 = r1.A19
            X.4R5 r0 = r8.A0A
            X.4TK r5 = r0.Auc()
            r4 = 0
        L_0x0a90:
            int r0 = r5.A01
            if (r4 >= r0) goto L_0x0ad5
            X.4RX[] r0 = r5.A02
            r1 = r0[r4]
            if (r1 == 0) goto L_0x0ad2
            X.4Ro r0 = r1.C98()
            if (r0 == 0) goto L_0x0ad2
            X.4Ro r0 = r1.C98()
            int r0 = r0.A02
            if (r2 != r0) goto L_0x0ad2
            X.3wB r0 = r1.Brg()
            if (r0 == 0) goto L_0x0ad2
            int r1 = r0.A0E
            r0 = 16
            if (r1 != r0) goto L_0x0ad2
            r0 = 1
        L_0x0ab5:
            if (r0 == r3) goto L_0x0b5c
            X.4Qo r0 = r8.A0E
            X.4Qb r0 = r0.A04()
            X.4Qd r6 = new X.4Qd
            r6.<init>(r0)
            r1 = 16
            r0 = 0
            if (r3 == 0) goto L_0x0ac9
            r0 = 16
        L_0x0ac9:
            r6.A0B = r0
            if (r3 != 0) goto L_0x0ace
            r1 = 0
        L_0x0ace:
            r6.A0D = r1
        L_0x0ad0:
            r4 = 0
            goto L_0x0b04
        L_0x0ad2:
            int r4 = r4 + 1
            goto L_0x0a90
        L_0x0ad5:
            r0 = 0
            goto L_0x0ab5
        L_0x0ad7:
            java.lang.Object r4 = r4.obj
            java.lang.String r4 = (java.lang.String) r4
            X.4P4 r8 = r1.A19
            if (r8 == 0) goto L_0x0b5c
            X.4Qo r1 = r8.A0E
            X.4Qb r1 = r1.A04()
            java.util.List r3 = r1.A0I
            int r1 = r3.size()
            if (r1 != r2) goto L_0x0af9
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 != 0) goto L_0x0b5c
        L_0x0af9:
            X.4Qo r0 = r8.A0E
            X.4Qb r0 = r0.A04()
            X.4Qd r6 = new X.4Qd
            r6.<init>(r0)
        L_0x0b04:
            r6.A07(r4)
            r6.A08(r4)
        L_0x0b0a:
            X.4Qo r0 = r8.A0E
            r0.A05(r6)
            return r2
        L_0x0b10:
            java.lang.Object r3 = r4.obj
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r5 = r3.booleanValue()
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "enableAudioTrackInternal"
            A0E(r1, r3, r4)
            X.4P4 r3 = r1.A19
            int r3 = r3.A05(r2)
            r4 = -1
            if (r3 != r4) goto L_0x0b37
            if (r5 == 0) goto L_0x0b37
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "Enable audio track"
            X.28J.A02(r1, r3, r4)
            X.4P4 r1 = r1.A19
            r1.A07(r2, r0)
            return r2
        L_0x0b37:
            X.4P4 r3 = r1.A19
            int r3 = r3.A05(r2)
            if (r3 == r4) goto L_0x0b5c
            if (r5 != 0) goto L_0x0b5c
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Disable audio track"
            X.28J.A02(r1, r0, r3)
            X.4P4 r0 = r1.A19
            r0.A07(r2, r4)
            return r2
        L_0x0b4e:
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "retryInternal"
            A0E(r1, r0, r3)
            X.4P4 r0 = r1.A19
            X.4R5 r0 = r0.A0A
            r0.EJE()
        L_0x0b5c:
            return r2
        L_0x0b5d:
            java.lang.Object r3 = r4.obj
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r7 = r3[r0]
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r5 = r3[r2]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "handleExternalErrorInternal"
            A0E(r1, r0, r3)
            r1.A0L()
            X.5OZ r4 = X.AnonymousClass5OZ.PLAYER_EXTERNAL_ERROR
            java.lang.String r3 = r7.getMessage()
            java.lang.String r0 = " Session: "
            java.lang.String r6 = X.002.A0g(r3, r0, r5)
            r8 = 2102(0x836, float:2.946E-42)
            long r9 = android.os.SystemClock.elapsedRealtime()
            X.48v r5 = new X.48v
            r5.<init>(r6, r7, r8, r9)
            r1.A0P(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4OS.handleMessage(android.os.Message):boolean");
    }

    public AnonymousClass4OS(Context context, Handler handler, HandlerThread handlerThread, 29t r12, AnonymousClass4OI r13, AnonymousClass4N6 r14, 28T r15, 29n r16, Map map, AtomicBoolean atomicBoolean, AtomicReference atomicReference, long j) {
        AtomicBoolean atomicBoolean2 = new AtomicBoolean();
        this.A10 = atomicBoolean2;
        this.A0x = new AtomicBoolean(true);
        this.A0y = new AtomicBoolean(false);
        this.A0D = -1;
        this.A08 = -1;
        this.A0d = false;
        this.A0n = false;
        this.A0l = -1;
        this.A0E = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        this.A1G = false;
        this.A1H = false;
        this.A0X = null;
        this.A0W = null;
        this.A0M = null;
        this.A0u = new C264004Oe(this);
        this.A0q = j;
        this.A0v = new C264014Of(r14, this);
        if (r14 instanceof AnonymousClass4Og) {
            atomicBoolean2.set(true);
        }
        this.A0t = r15;
        this.A0w = r15.A06;
        this.A12 = r15.A09;
        this.A09 = -1;
        this.A0c = false;
        this.A0F = context;
        this.A0H = handler;
        this.A0b = atomicReference;
        this.A0P = r16;
        this.A0L = r12;
        this.A0a = map;
        this.A0r = handlerThread;
        Handler handler2 = new Handler(handlerThread.getLooper(), this);
        this.A0G = handler2;
        this.A0s = new C264034Oi();
        this.A0z = atomicBoolean;
        handler2.post(new C264054Ok(r13, this));
    }

    private void A0G(boolean z) {
        A0E(this, "pauseInternal %b", Boolean.valueOf(z));
        this.A0k = false;
        this.A0n = z;
        this.A19.A0A.Efw(false);
        if (this.A0w.A2J) {
            A05(this.A04, SystemClock.elapsedRealtime(), false, false);
        }
    }
}
