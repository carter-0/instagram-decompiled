package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.OHt  reason: case insensitive filesystem */
public final class C70724OHt {
    public final ImageView A00;
    public final ImageView A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;

    public C70724OHt(View view) {
        this.A04 = (LinearLayout) view.requireViewById(R.id.video_settings_auto_play_enabled_option);
        this.A03 = (LinearLayout) view.requireViewById(R.id.video_settings_auto_play_disabled_option);
        this.A06 = DbU.A0G(view, R.id.subtitle_photos_free);
        this.A05 = DbU.A0G(view, R.id.video_settings_confirm_button);
        this.A02 = DbU.A0F(view, R.id.auto_play_enabled_image);
        this.A01 = DbU.A0F(view, R.id.auto_play_disabled_image);
        this.A07 = DbU.A0G(view, R.id.subtitle_video_settings);
        this.A00 = DbU.A0F(view, R.id.animated_cloud_set);
    }
}
