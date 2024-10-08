package X;

import android.widget.ImageView;
import android.widget.SeekBar;
import com.instagram.android.R;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

public final class LZO implements SeekBar.OnSeekBarChangeListener {
    public final int A00;
    public final Object A01;

    public LZO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        String str;
        if (this.A00 != 0) {
            if (z) {
                VideoPreviewView videoPreviewView = ((C61420K6r) this.A01).A03;
                if (videoPreviewView == null) {
                    str = "videoPreviewView";
                } else {
                    videoPreviewView.A07(i);
                    return;
                }
            } else {
                return;
            }
        } else if (z) {
            C61422K6t k6t = (C61422K6t) this.A01;
            VideoPreviewView videoPreviewView2 = k6t.A08;
            str = "videoPreviewView";
            if (videoPreviewView2 != null) {
                videoPreviewView2.A07(i);
                VideoPreviewView videoPreviewView3 = k6t.A08;
                if (videoPreviewView3 != null) {
                    if (videoPreviewView3.A08()) {
                        ImageView imageView = k6t.A03;
                        if (imageView == null) {
                            str = "scrubberButton";
                        } else {
                            imageView.setImageResource(R.drawable.play_icon);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
