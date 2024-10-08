package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView;

public final class IEH implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ SeekBar.OnSeekBarChangeListener A00;
    public final /* synthetic */ C246483eg A01;
    public final /* synthetic */ C258253yi A02;

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        0qQ.A0B(seekBar, 0);
        this.A00.onProgressChanged(seekBar, i, z);
        AnonymousClass0eM r1 = this.A02.A05;
        if (AnonymousClass7TE.A0c(r1).getVisibility() == 0) {
            ((ScrubberPreviewThumbnailView) r1.getValue()).A00(i, seekBar.getMax());
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        0qQ.A0B(seekBar, 0);
        this.A00.onStartTrackingTouch(seekBar);
        C258253yi r5 = this.A02;
        ((ProgressBar) r5.A03.getValue()).setProgressDrawable((Drawable) AnonymousClass7TE.A14(r5.A04));
        if (this.A01.A03) {
            View A0c = AnonymousClass7TE.A0c(r5.A05);
            C59250Ng r3 = C59250Ng.A00;
            C61210lx.A02(A0c, r3, 0, 200);
            C61210lx.A02(AnonymousClass7TE.A0c(r5.A06), r3, 0, 200);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        0qQ.A0B(seekBar, 0);
        this.A00.onStopTrackingTouch(seekBar);
        C258253yi r5 = this.A02;
        ((ProgressBar) r5.A03.getValue()).setProgressDrawable((Drawable) AnonymousClass7TE.A14(r5.A02));
        if (this.A01.A03) {
            View A0c = AnonymousClass7TE.A0c(r5.A05);
            C59250Ng r3 = C59250Ng.A00;
            C61210lx.A02(A0c, r3, 8, 200);
            C61210lx.A02(AnonymousClass7TE.A0c(r5.A06), r3, 8, 200);
        }
    }

    public IEH(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, C246483eg r2, C258253yi r3) {
        this.A00 = onSeekBarChangeListener;
        this.A02 = r3;
        this.A01 = r2;
    }
}
