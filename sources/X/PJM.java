package X;

import com.instagram.model.reels.Reel;

public final class PJM implements AnonymousClass6VI {
    public final /* synthetic */ OMU A00;
    public final /* synthetic */ C330367Mm A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ 1aV A03;

    public PJM(OMU omu, C330367Mm r2, Reel reel, 1aV r4) {
        this.A00 = omu;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = reel;
    }

    public final void DEU(long j) {
        02m.A0p.markerEnd(18941461, 3);
        OMU omu = this.A00;
        if (omu != null) {
            omu.A00();
        }
        this.A03.accept(this.A02);
    }

    public final void Dom(boolean z, long j) {
        OMU omu = this.A00;
        if (omu != null) {
            omu.A00();
        }
        this.A03.accept(this.A02);
    }

    public final void onCancel() {
        02m.A0p.markerEnd(18941461, 4);
        OMU omu = this.A00;
        if (omu != null) {
            omu.A00();
        }
    }

    public final void onStart() {
        OMU omu = this.A00;
        if (omu != null) {
            omu.A01();
        }
    }
}
