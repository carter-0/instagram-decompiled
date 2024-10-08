package X;

/* renamed from: X.6vV  reason: invalid class name and case insensitive filesystem */
public final class C322256vV implements C230722q8 {
    public final /* synthetic */ C322216vR A00;

    public C322256vV(C322216vR r1) {
        this.A00 = r1;
    }

    public final void DqZ() {
        C321606uS r3 = this.A00.A0C;
        if (r3 != null) {
            int i = r3.A00;
            if (i != 0) {
                r3.A01.markerPoint(i, "tail_load_indicator_end");
            }
            int i2 = r3.A00;
            if (i2 != 0) {
                r3.A01.markerPoint(i2, "grid_render_start");
            }
        }
    }

    public final void Dqa() {
        C322216vR r3 = this.A00;
        C321606uS r2 = r3.A0C;
        if (r2 != null) {
            r2.A01("tail_load", true);
            r3.A00 = r3.A04.B6L();
            r3.A01 = r3.A04.BLQ() - 1;
        }
    }
}
