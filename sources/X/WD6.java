package X;

import android.widget.SeekBar;
import com.facebook.react.uimanager.UIManagerHelper;

public final class WD6 implements SeekBar.OnSeekBarChangeListener {
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C20877X2e A0K = C13990Tnq.A0K(seekBar, (Q6H) seekBar.getContext());
        if (A0K != null) {
            A0K.APe(new UTJ(seekBar.getId(), z, ((U6D) seekBar).A01(i)));
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        C20877X2e A0K = C13990Tnq.A0K(seekBar, (Q6H) seekBar.getContext());
        if (A0K != null) {
            A0K.APe(new UTH(UIManagerHelper.A01(seekBar), seekBar.getId(), ((U6D) seekBar).A01(seekBar.getProgress())));
        }
    }
}
