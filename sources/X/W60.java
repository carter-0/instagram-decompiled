package X;

import android.media.MediaDrm;

public final /* synthetic */ class W60 implements MediaDrm.OnEventListener {
    public final /* synthetic */ X14 A00;
    public final /* synthetic */ WMG A01;

    public /* synthetic */ W60(X14 x14, WMG wmg) {
        this.A01 = wmg;
        this.A00 = x14;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        C14690U1p u1p = ((WMC) this.A00).A00.A0J;
        u1p.getClass();
        Pxe.A1N(u1p, bArr, i);
    }
}
