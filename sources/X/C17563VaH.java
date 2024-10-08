package X;

import android.view.View;
import android.widget.CheckBox;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.VaH  reason: case insensitive filesystem */
public final class C17563VaH {
    public VRI A00;
    public final View A01;
    public final CheckBox A02;
    public final AnonymousClass3NM A03;
    public final IgImageView A04;
    public final MediaFrameLayout A05;

    public C17563VaH(View view, CheckBox checkBox, IgImageView igImageView, MediaFrameLayout mediaFrameLayout) {
        AnonymousClass7TG.A1Q(igImageView, checkBox);
        this.A05 = mediaFrameLayout;
        this.A04 = igImageView;
        this.A02 = checkBox;
        this.A01 = view;
        AnonymousClass3NG r2 = new AnonymousClass3NG(mediaFrameLayout);
        r2.A07 = true;
        r2.A02 = 0.98f;
        r2.A04 = new C15848UjY(this, 1);
        this.A03 = r2.A00();
    }
}
