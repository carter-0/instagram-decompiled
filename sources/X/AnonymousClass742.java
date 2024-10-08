package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.742  reason: invalid class name */
public final class AnonymousClass742 extends AnonymousClass743 {
    public C70762OKi A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgImageView A04;

    public AnonymousClass742(View view) {
        super(view.requireViewById(R.id.audio_playback_button));
        this.A03 = (CircularImageView) view.requireViewById(R.id.avatar);
        this.A02 = (TextView) view.requireViewById(R.id.title);
        this.A01 = (TextView) view.requireViewById(R.id.subtitle);
        this.A04 = view.requireViewById(R.id.header_icons);
    }
}
