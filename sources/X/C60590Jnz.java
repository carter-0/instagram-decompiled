package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jnz  reason: case insensitive filesystem */
public final class C60590Jnz extends C249703kE {
    public final IgLinearLayout A00;
    public final IgImageView A01;

    public C60590Jnz(View view, C62320sa r3, int i) {
        super(view);
        this.A00 = (IgLinearLayout) view.findViewById(R.id.clips_editor_video_original_audio_volume_toggle_button);
        this.A01 = JTO.A0Y(view, R.id.clips_editor_video_original_audio_volume_toggle_button_image);
        LY4.A01(view, 67, r3);
        0nA.A0f(view, i);
        view.setImportantForAccessibility(2);
    }
}
