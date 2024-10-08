package X;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.mobilenetwork.DomainInfoUtils;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.net.URI;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class T6T implements AnonymousClass1Cy {
    public SC7 A00;
    public C12770T6e A01;
    public C12771T6f A02;
    public C10626RvK A03;
    public C12769T6d A04;
    public final PowerManager A05;
    public final LightweightQuickPerformanceLogger A06;
    public final S7W A07;
    public final AtomicBoolean A08 = new AtomicBoolean();
    public final AtomicBoolean A09 = new AtomicBoolean();
    public final AtomicBoolean A0A = new AtomicBoolean();
    public final AtomicLong A0B = new AtomicLong();
    public final boolean A0C;
    public final boolean A0D;

    public final AnonymousClass1T9 startRequest(1QS r16, 1QU r17, 1Qe r18) {
        0ng r97;
        String str;
        S7W s7w = this.A07;
        1QS r5 = r16;
        0qQ.A0B(r5, 0);
        if (SRB.A0k) {
            s7w.A00.markerStart(677319650, r5.hashCode());
        }
        s7w.A00.markerStart(926483817, r5.hashCode());
        s7w.A02(r5, AnonymousClass000.A00(367), this.A0B.getAndIncrement());
        s7w.A04(r5, "http_stack", "liger");
        s7w.A04(r5, TraceFieldType.HTTPMethod, 1Qp.A00(r5.A07));
        URI uri = r5.A09;
        s7w.A04(r5, "redacted_url", 1RI.A00(uri));
        1QU r6 = r17;
        s7w.A04(r5, "request_type", r6.A09.A00);
        s7w.A05(r5, "started_in_background", 14i.A08());
        String str2 = r6.A0E;
        if (str2 == null) {
            str2 = "undefined";
        }
        s7w.A04(r5, AnonymousClass000.A00(5275), str2);
        PowerManager powerManager = this.A05;
        if (this.A0C && powerManager != null) {
            s7w.A05(r5, AnonymousClass000.A00(3438), powerManager.isInteractive());
            s7w.A05(r5, AnonymousClass000.A00(3449), powerManager.isPowerSaveMode());
            s7w.A05(r5, "is_device_idle_mode", powerManager.isDeviceIdleMode());
        }
        String host = uri.getHost();
        if (host != null && DomainInfoUtils.isIgCdnOrFnaDomainNative(host) && this.A09.compareAndSet(false, true)) {
            s7w.A05(r5, "is_first_static_request", true);
        }
        String path = uri.getPath();
        if (path != null) {
            if (path.contains("feed/timeline") && this.A08.compareAndSet(false, true)) {
                str = "is_first_feed_request";
            } else if (path.contains("feed/reels_tray") && this.A0A.compareAndSet(false, true)) {
                str = "is_first_stories_request";
            }
            s7w.A05(r5, str, true);
        }
        C10626RvK rvK = this.A03;
        C12772T6g t6g = new C12772T6g(this.A06, r18, r5);
        C61620nx A002 = C61610nw.A00();
        A002.A01 = "LigerRequestExecutor";
        AnonymousClass0vF r14 = new AnonymousClass0vF(A002);
        C12773T6h t6h = new C12773T6h(t6g);
        if (rvK.A02) {
            r97 = new R98(r5, r6, t6h, rvK, r14);
            t6h.A00 = new C12777T6l(r97, rvK);
        } else {
            r97 = new R97(r5, r6, t6h, rvK, r14);
        }
        r14.ATE(r97);
        return new T6Q(this.A00, r5, r6, t6h, s7w, this.A0D);
    }

    public T6T(Context context, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, SC7 sc7, SRB srb, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        PowerManager powerManager;
        C12771T6f t6f = new C12771T6f(lightweightQuickPerformanceLogger, srb, i, z4);
        this.A02 = t6f;
        C12770T6e t6e = new C12770T6e(lightweightQuickPerformanceLogger, t6f);
        this.A01 = t6e;
        C12769T6d t6d = new C12769T6d(t6e);
        this.A04 = t6d;
        this.A03 = new C10626RvK(t6d, z);
        this.A06 = lightweightQuickPerformanceLogger;
        this.A07 = new S7W(lightweightQuickPerformanceLogger);
        this.A0D = z2;
        this.A0C = z3;
        this.A00 = sc7;
        if (z3) {
            powerManager = (PowerManager) context.getSystemService("power");
        } else {
            powerManager = null;
        }
        this.A05 = powerManager;
    }
}
