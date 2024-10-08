package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5jG  reason: invalid class name and case insensitive filesystem */
public final class C292625jG extends 0ng {
    public final /* synthetic */ AnonymousClass9IY A00;
    public final /* synthetic */ 2ec A01;
    public final /* synthetic */ C292435iw A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C292625jG(AnonymousClass9IY r4, 2ec r5, C292435iw r6) {
        super(1659109772, 3, false, false);
        this.A01 = r5;
        this.A00 = r4;
        this.A02 = r6;
    }

    public final void run() {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        Long l9;
        Long l10;
        Long l11;
        2ed r11 = this.A01.A01;
        AnonymousClass9IY r3 = this.A00;
        C292435iw r4 = this.A02;
        C292615jF r0 = (C292615jF) r3.A04;
        if (r0 != null) {
            long nanoTime = System.nanoTime();
            long j = nanoTime + r0.A0C;
            long j2 = j + r0.A03;
            long j3 = j2 + r0.A00;
            long j4 = j3 + r0.A04;
            long j5 = j4 + r0.A02;
            long j6 = j5 + r0.A09;
            long j7 = j6 + r0.A0A;
            long j8 = j7 + r0.A01;
            long j9 = nanoTime + r0.A0B;
            QuickPerformanceLogger quickPerformanceLogger = r11.A00;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            quickPerformanceLogger.markerStart(725680129, 0, nanoTime, timeUnit);
            C292615jF r02 = (C292615jF) r3.A05;
            Long l12 = null;
            if (r02 != null) {
                l = Long.valueOf(r02.A0C);
            } else {
                l = null;
            }
            2ed.A00(r11, l, "MESSAGE_QUEUE_DELAY", nanoTime, j);
            if (r02 != null) {
                l2 = Long.valueOf(r02.A03);
            } else {
                l2 = null;
            }
            2ed.A00(r11, l2, "HANDLE_INPUT", j, j2);
            if (r02 != null) {
                l3 = Long.valueOf(r02.A00);
            } else {
                l3 = null;
            }
            2ed.A00(r11, l3, "ANIMATION", j2, j3);
            if (r02 != null) {
                l4 = Long.valueOf(r02.A04);
            } else {
                l4 = null;
            }
            2ed.A00(r11, l4, "LAYOUT_MEASURE", j3, j4);
            if (r02 != null) {
                l5 = Long.valueOf(r02.A02);
            } else {
                l5 = null;
            }
            2ed r39 = r11;
            2ed.A00(r39, l5, "DRAW", j4, j5);
            if (r02 != null) {
                l6 = Long.valueOf(r02.A09);
            } else {
                l6 = null;
            }
            2ed.A00(r11, l6, "SYNC_DELAY", j5, j6);
            if (r02 != null) {
                l7 = Long.valueOf(r02.A0A);
            } else {
                l7 = null;
            }
            2ed r53 = r11;
            2ed.A00(r53, l7, "SYNC", j6, j7);
            if (r02 != null) {
                l8 = Long.valueOf(r02.A01);
            } else {
                l8 = null;
            }
            2ed.A00(r11, l8, "ISSUE_DRAW_COMMAND", j7, j8);
            if (r02 != null) {
                l9 = Long.valueOf(r02.A08);
            } else {
                l9 = null;
            }
            2ed.A00(r11, l9, "SWAP_BUFFERS", j8, j9);
            if (r02 != null) {
                l10 = Long.valueOf(r02.A06);
            } else {
                l10 = null;
            }
            2ed.A00(r39, l10, "MAIN_THREAD_BUSY", nanoTime, j5);
            if (r02 != null) {
                l11 = Long.valueOf(r02.A05);
            } else {
                l11 = null;
            }
            2ed.A00(r53, l11, "MAIN_THREAD_AWAIT", j5, j7);
            if (r02 != null) {
                l12 = Long.valueOf(r02.A07);
            }
            2ed.A00(r11, l12, "RENDER_THREAD", j6, j9);
            quickPerformanceLogger.markerAnnotate(725680129, "scroll_duration_ms", r4.A01);
            quickPerformanceLogger.markerAnnotate(725680129, "scroll_distance_dp", (double) r4.A00);
            quickPerformanceLogger.markerAnnotate(725680129, "scroll_context", r4.A02);
            quickPerformanceLogger.markerAnnotate(725680129, "large_frame_drops", r3.A02);
            quickPerformanceLogger.markerAnnotate(725680129, "small_frame_drops", r3.A03);
            quickPerformanceLogger.markerAnnotate(725680129, "frame_count", r3.A01);
            quickPerformanceLogger.markerEnd(725680129, 2, j9, timeUnit);
        }
    }
}
