package X;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.Jp6  reason: case insensitive filesystem */
public final class C60659Jp6 extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final ClipsCreationViewModel A03;
    public final C60426JlJ A04;
    public final Integer A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60659Jp6(View view, ClipsCreationViewModel clipsCreationViewModel, C60426JlJ jlJ, Integer num) {
        super(view);
        0qQ.A0B(num, 4);
        this.A03 = clipsCreationViewModel;
        this.A04 = jlJ;
        this.A05 = num;
        View requireViewById = view.requireViewById(R.id.voice_effect_icon);
        ImageView imageView = (ImageView) requireViewById;
        imageView.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
        0qQ.A07(requireViewById);
        this.A01 = imageView;
        this.A02 = AnonymousClass7TG.A0R(view, R.id.voice_effect_name);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.selection_ring);
    }
}
