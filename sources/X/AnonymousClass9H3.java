package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.9H3  reason: invalid class name */
public final class AnonymousClass9H3 implements C228242l4 {
    public static int A0A = 1;
    public static final 18q A0B = 18m.A00("paused");
    public static final 18q A0C = 18m.A00("invalid_state");
    public 0rq A00;
    public final AnonymousClass9H4 A01;
    public final AnonymousClass9H4 A02;
    public final AnonymousClass9H4 A03;
    public final AnonymousClass9H4 A04;
    public final AnonymousClass9H4 A05;
    public final AnonymousClass9H4 A06;
    public final AnonymousClass9H4 A07;
    public final 18g A08;
    public final String A09 = "direct_thread";

    public AnonymousClass9H3(18g r3) {
        0qQ.A0B(r3, 1);
        this.A08 = r3;
        this.A05 = new AnonymousClass9H4(r3, this, "on_create_direct_thread_toggle_fragment");
        this.A06 = new AnonymousClass9H4(r3, this, "on_view_created_direct_thread_toggle_fragment");
        this.A01 = new AnonymousClass9H4(r3, this, "inflate_composer");
        this.A07 = new AnonymousClass9H4(r3, this, "thread_loaded");
        this.A02 = new AnonymousClass9H4(r3, this, "initial_resnapshot");
        this.A03 = new AnonymousClass9H4(r3, this, "initialize_controllers");
        this.A04 = new AnonymousClass9H4(r3, this, "initialize_push_activity");
    }

    public final void A01(18q r4) {
        0qQ.A0B(r4, 0);
        this.A08.A0L(A00(this), r4, (Long) null);
    }

    public final void AJE(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        0qQ.A0B(lightweightQuickPerformanceLogger, 0);
        0rq r0 = this.A00;
        if (r0 != null) {
            r0.A01(lightweightQuickPerformanceLogger);
        }
    }

    public static final LightweightQuickPerformanceLogger A00(AnonymousClass9H3 r0) {
        0rq r02 = r0.A00;
        if (r02 == null) {
            return 1Gq.A00(C638918c.A01(C61170le.A00).A0C());
        }
        return r02;
    }

    public final void A02(String str, boolean z) {
        C228242l4 r0;
        18g r2 = this.A08;
        LightweightQuickPerformanceLogger A002 = A00(this);
        0qQ.A0B(A002, 3);
        C64331Jv r02 = r2.A05;
        if (r02 == null || (r0 = r02.A02) == null || r0 == this) {
            A002.markerAnnotate(15335435, str, z);
        }
    }

    public final void CwG(boolean z) {
        if (z) {
            this.A00 = new 0rq();
        }
    }

    public final void D8V() {
        0rq r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        this.A00 = null;
    }

    public final String getDestination() {
        return this.A09;
    }
}
