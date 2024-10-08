package X;

import android.media.MediaFormat;

/* renamed from: X.5N0  reason: invalid class name */
public final class AnonymousClass5N0 implements AnonymousClass4SC, AnonymousClass4PM, AnonymousClass5N1 {
    public AnonymousClass4SC A00;
    public AnonymousClass5N1 A01;

    public final void CIs(int i, Object obj) {
        if (i == 7) {
            this.A00 = (AnonymousClass4SC) obj;
        } else if (i == 8) {
            this.A01 = (AnonymousClass5N1) obj;
        }
    }

    public final void DxT(MediaFormat mediaFormat, C256683wB r9, long j, long j2) {
        AnonymousClass4SC r0 = this.A00;
        if (r0 != null) {
            r0.DxT(mediaFormat, r9, j, j2);
        }
    }
}
