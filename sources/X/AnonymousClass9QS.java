package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* renamed from: X.9QS  reason: invalid class name */
public final class AnonymousClass9QS {
    public final ViewGroup A00;
    public final C252063oV A01;
    public final C252063oV A02;
    public final C252063oV A03;
    public final LoadingSpinnerView A04;

    public AnonymousClass9QS(ViewGroup viewGroup) {
        this.A00 = (ViewGroup) AnonymousClass7TF.A0F(viewGroup, R.id.loading_track_spinner_container);
        this.A03 = 2b1.A00(viewGroup.requireViewById(R.id.spinner_for_processing_video_stub));
        this.A04 = (LoadingSpinnerView) AnonymousClass7TF.A0F(viewGroup, R.id.loading_track_spinner);
        this.A02 = 2b1.A00(viewGroup.requireViewById(R.id.preview_filter_processing_audio_overlay_stub));
        this.A01 = 2b1.A00(viewGroup.requireViewById(R.id.full_filter_processing_audio_overlay_stub));
    }
}
