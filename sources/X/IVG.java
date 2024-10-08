package X;

import com.instagram.api.schemas.MediaControlEventSourceEnum;

public final class IVG implements C367608rH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public IVG(C267324bN r1, C52058GDe gDe, C52029GCb gCb, int i) {
        this.A00 = i;
        this.A03 = gCb;
        this.A01 = r1;
        this.A02 = gDe;
    }

    public final void onClick() {
        switch (this.A00) {
            case 0:
                ((C52029GCb) this.A03).DYM(MediaControlEventSourceEnum.UFI, (C267324bN) this.A01, (C52058GDe) this.A02);
                return;
            case 1:
                ((C52029GCb) this.A03).DTj(MediaControlEventSourceEnum.UFI, (C267324bN) this.A01, (C52058GDe) this.A02);
                return;
            default:
                return;
        }
    }
}
