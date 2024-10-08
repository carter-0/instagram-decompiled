package X;

import com.facebook.proxygen.TraceFieldType;

public final class OMq {
    public final int A00;
    public final 02m A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final void A00(String str) {
        02m r3 = this.A01;
        int i = this.A00;
        r3.markerPoint(20132336, i, "preview_fetch_task_completed");
        r3.markerAnnotate(20132336, i, "preview_fetch_task_state", str);
    }

    public final void A01(String str, Integer num) {
        02m r4 = this.A01;
        int i = this.A00;
        r4.markerAnnotate(20132336, i, "error", str);
        if (num != null) {
            r4.markerAnnotate(20132336, i, TraceFieldType.ErrorCode, num.intValue());
        }
        r4.markerEnd(20132336, i, 3);
    }

    public OMq(02m r1, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A05 = z4;
    }
}
