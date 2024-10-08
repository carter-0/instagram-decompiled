package X;

import android.widget.SeekBar;

/* renamed from: X.3fE  reason: invalid class name and case insensitive filesystem */
public final class C246783fE implements SeekBar.OnSeekBarChangeListener {
    public final AnonymousClass2xS A00;

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        1Xj A002;
        0qQ.A0B(seekBar, 0);
        C232722uK r4 = this.A00.A0G;
        int progress = seekBar.getProgress();
        C263744Ne r2 = r4.A02;
        if (!(r2 == null || (A002 = C232722uK.A00(r4)) == null || !A002.CcK())) {
            if (r4.A0D) {
                r2.A07 = progress;
            }
            if (r4.A0B) {
                r2.A03 = progress;
            }
        }
        AnonymousClass4M3 r1 = r4.A05;
        if (r1 != null) {
            r1.EKy(progress, true);
        }
        C232722uK.A07(r4, "start", true, false);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.A00.A0G.A0T("seek");
    }

    public C246783fE(AnonymousClass2xS r1) {
        this.A00 = r1;
    }
}
