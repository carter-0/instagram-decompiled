package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.textureview.CircularTextureView;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Iaw  reason: case insensitive filesystem */
public final class C57452Iaw implements X7C {
    public static final long A0C = TimeUnit.SECONDS.toMillis(5);
    public ObjectAnimator A00;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final PopupWindow A05;
    public final ProgressBar A06;
    public final TextView A07;
    public final TextView A08;
    public final CircularImageView A09;
    public final CircularTextureView A0A;
    public final View A0B;

    public C57452Iaw(Context context) {
        View A082 = DbU.A08(LayoutInflater.from(context), R.layout.layout_iglive_livewith_autoaccept_popup);
        this.A0B = A082;
        this.A05 = new PopupWindow(A082, -1, -2, true);
        this.A09 = (CircularImageView) AnonymousClass7TE.A0b(A082, R.id.iglive_receiver_avatar_imageview);
        this.A08 = DbW.A0B(A082, R.id.iglive_livewith_auto_accept_title);
        this.A07 = DbW.A0B(A082, R.id.iglive_livewith_auto_accept_subtitle);
        this.A03 = AnonymousClass7TE.A0b(A082, R.id.iglive_livewith_auto_accept_cancel);
        this.A02 = AnonymousClass7TE.A0b(A082, R.id.iglive_livewith_auto_accept_bottom_container);
        this.A06 = (ProgressBar) AnonymousClass7TE.A0b(A082, R.id.iglive_auto_accept_progress_bar);
        this.A0A = (CircularTextureView) AnonymousClass7TE.A0b(A082, R.id.iglive_camera_preview_texture);
        this.A04 = AnonymousClass7TE.A0b(A082, R.id.iglive_livewith_switch_camera);
    }

    public final CircularTextureView Ajl() {
        return this.A0A;
    }

    public final void EQU(C340307l3 r4) {
        AnonymousClass0fU.A00(new LY2(5, r4, this), this.A04);
    }
}
