package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView;

/* renamed from: X.JoJ  reason: case insensitive filesystem */
public final class C60610JoJ extends C249703kE {
    public final TextView A00;
    public final CircularProgressImageView A01;
    public final /* synthetic */ C60399Jks A02;

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView, android.widget.ImageView] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60610JoJ(View view, C60399Jks jks) {
        super(view);
        this.A02 = jks;
        this.A00 = AnonymousClass7TG.A0R(view, R.id.text_sfx_name);
        ? r1 = (CircularProgressImageView) AnonymousClass7TF.A0F(view, R.id.sfx_icon);
        this.A01 = r1;
        r1.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }
}
