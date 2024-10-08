package X;

import java.util.ArrayList;

/* renamed from: X.I1j  reason: case insensitive filesystem */
public final class C56555I1j {
    public final 02m A00;
    public final Integer A01;
    public final ArrayList A02;
    public final ArrayList A03;

    public final void A02(String str, String str2) {
        0qQ.A0B(str2, 1);
        02m r2 = this.A00;
        Integer num = this.A01;
        if (num != null) {
            r2.markerAnnotate(238951310, num.intValue(), str, str2);
            return;
        }
        throw AnonymousClass7TE.A0z("instanceKey is not set, which means [startLoggingFlow] wasn't properly called for this logger instance");
    }

    public final void A00(String str) {
        02m r3 = this.A00;
        Integer num = this.A01;
        if (num != null) {
            r3.markerPoint(238951310, num.intValue(), 002.A0R(str, "_end"));
            return;
        }
        throw AnonymousClass7TE.A0z("instanceKey is not set, which means [startLoggingFlow] wasn't properly called for this logger instance");
    }

    public final void A01(String str) {
        02m r3 = this.A00;
        Integer num = this.A01;
        if (num != null) {
            r3.markerPoint(238951310, num.intValue(), 002.A0R(str, "_start"));
            return;
        }
        throw AnonymousClass7TE.A0z("instanceKey is not set, which means [startLoggingFlow] wasn't properly called for this logger instance");
    }

    public C56555I1j(Integer num) {
        this.A02 = AnonymousClass7TE.A1C();
        this.A03 = AnonymousClass7TE.A1C();
        this.A01 = num;
        this.A00 = C51965G9l.A0l();
    }

    public C56555I1j() {
        this((Integer) null);
    }
}
