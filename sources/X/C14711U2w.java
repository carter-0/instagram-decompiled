package X;

import android.content.Context;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.U2w  reason: case insensitive filesystem */
public final class C14711U2w extends TextureView {
    public static final HeroPlayerSetting A0A;
    public long A00;
    public Surface A01;
    public C284815Oa A02 = new C284815Oa();
    public AnonymousClass4OI A03;
    public C20843X0u A04;
    public String A05 = "";
    public boolean A06;
    public final int A07;
    public final C263634Mt A08;
    public final 274 A09;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4Mi, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.4Mr] */
    public C14711U2w(Context context, int i) {
        super(context);
        this.A07 = i;
        HashMap hashMap = new HashMap();
        HeroPlayerSetting heroPlayerSetting = A0A;
        274 A012 = 274.A01(context, heroPlayerSetting, 273.A00, hashMap, (Executor) null, (ScheduledExecutorService) null);
        this.A09 = A012;
        AtomicLong atomicLong = C263634Mt.A0c;
        C19071WKb wKb = new C19071WKb(this);
        ? obj = new Object();
        HandlerThread A0J = Pxf.A0J("HeroPlayerInternalThread", -2);
        A0J.start();
        C263634Mt r1 = new C263634Mt(AnonymousClass7TF.A0D(), A0J.getLooper(), new Object(), obj, wKb, A012, (C263504Mg) null, heroPlayerSetting);
        r1.A0H(false);
        this.A08 = r1;
        setSurfaceTextureListener(new W8F(this));
    }

    public final void setPlayerListener(C20843X0u x0u) {
        0qQ.A0B(x0u, 0);
        this.A04 = x0u;
    }

    static {
        1wj r3 = new 1wj();
        r3.A01();
        r3.A16 = "TransitionVideoPlayerV1";
        r3.A2s = true;
        r3.A0f = StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
        r3.A1x = true;
        r3.A0a = 1;
        r3.A0C = 12000;
        r3.A0E = 60000;
        r3.A2J = true;
        A0A = new HeroPlayerSetting(r3);
    }

    public final void A00() {
        this.A08.A0B();
    }

    public final void A01() {
        C263634Mt r7 = this.A08;
        C263634Mt.A05(r7, "seekTo: seekTimeMsWithPreview: %d, jumpSeek: %s", 0, false);
        r7.A0T = 0;
        r7.A0U = C263634Mt.A0c.incrementAndGet();
        r7.A0V = SystemClock.elapsedRealtime();
        AnonymousClass7TE.A1S(r7.A0E, new long[]{r7.A0T, r7.A0U, 0}, 4);
    }

    public final void A02(AnonymousClass4OI r3, boolean z) {
        this.A08.A0E(r3);
        this.A06 = z;
        this.A03 = r3;
        String str = r3.A07;
        if (str == null) {
            str = "";
        }
        this.A05 = str;
        this.A00 = 0;
    }

    public final long getCurrentPositionMs() {
        return this.A08.A08();
    }

    public final long getVideoDurationMs() {
        return this.A08.A09();
    }
}
