package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.instagram.android.R;

/* renamed from: X.VaT  reason: case insensitive filesystem */
public final class C17575VaT {
    public final View A00;
    public final View A01;
    public final View A02;
    public final EditText A03;
    public final ImageView A04;
    public final SeekBar A05;

    public C17575VaT(ViewStub viewStub) {
        View inflate = viewStub.inflate();
        this.A01 = inflate;
        View requireViewById = inflate.requireViewById(R.id.slider_sticker_editor);
        this.A00 = requireViewById;
        this.A02 = inflate.requireViewById(R.id.slider_particle_system);
        this.A04 = DbU.A0F(inflate, R.id.slider_sticker_color_button);
        this.A03 = DbU.A0E(requireViewById, R.id.slider_sticker_question);
        this.A05 = (SeekBar) requireViewById.requireViewById(R.id.slider_sticker_slider);
    }
}
