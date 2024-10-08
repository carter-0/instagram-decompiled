package X;

import android.os.Handler;
import android.widget.SeekBar;

public final class WD9 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C15642Ug8 A00;
    public final /* synthetic */ C17728Vcx A01;
    public final /* synthetic */ C307786Rm A02;
    public final /* synthetic */ C276544tV A03;
    public final /* synthetic */ C277014uI A04;
    public final /* synthetic */ C277014uI A05;

    public WD9(C15642Ug8 ug8, C17728Vcx vcx, C307786Rm r3, C276544tV r4, C277014uI r5, C277014uI r6) {
        this.A00 = ug8;
        this.A01 = vcx;
        this.A05 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r6;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Handler handler = C18701Vx2.A00;
        C17728Vcx vcx = this.A01;
        handler.removeMessages(0, vcx);
        vcx.A07 = i;
        AnonymousClass7TE.A1S(handler, vcx, 0);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        C277014uI r3 = this.A05;
        if (r3 != null) {
            C276544tV r2 = this.A03;
            C308276Tl r1 = new C308276Tl();
            C307786Rm r0 = this.A02;
            r1.A01(r0);
            DbT.A1R(r0, r2, r1, r3);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        C277014uI r3 = this.A04;
        if (r3 != null) {
            C276544tV r2 = this.A03;
            C308276Tl r1 = new C308276Tl();
            C307786Rm r0 = this.A02;
            r1.A01(r0);
            DbT.A1R(r0, r2, r1, r3);
        }
    }
}
