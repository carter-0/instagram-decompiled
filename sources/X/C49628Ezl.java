package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Ezl  reason: case insensitive filesystem */
public final class C49628Ezl {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;

    public C49628Ezl(View view) {
        0qQ.A0B(view, 1);
        this.A01 = DbX.A0J(view, R.id.trusted_device_more_icon);
        this.A00 = DbX.A0J(view, R.id.trusted_device_type_icon);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.trusted_device_platform);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.trusted_device_time);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.trusted_device_location);
    }
}
