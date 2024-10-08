package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.textureview.CircularTextureView;
import com.instagram.user.model.User;

/* renamed from: X.Iav  reason: case insensitive filesystem */
public final class C57451Iav implements X7C {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final PopupWindow A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final View A08;
    public final CircularImageView A09;
    public final CircularImageView A0A;
    public final CircularTextureView A0B;

    public C57451Iav(Context context) {
        View A082 = DbU.A08(LayoutInflater.from(context), R.layout.layout_iglive_livewith_invitation_popup);
        this.A08 = A082;
        this.A03 = new PopupWindow(A082, -1, -2, true);
        CircularImageView circularImageView = (CircularImageView) AnonymousClass7TE.A0b(A082, R.id.iglive_sender_avatar_imageview);
        this.A0A = circularImageView;
        CircularImageView circularImageView2 = (CircularImageView) AnonymousClass7TE.A0b(A082, R.id.iglive_camera_preview_overlay_stroke);
        this.A09 = circularImageView2;
        this.A04 = DbW.A0B(A082, R.id.iglive_invitation_attribution_message);
        this.A07 = DbW.A0B(A082, R.id.iglive_invitation_privacy_description);
        this.A0B = (CircularTextureView) AnonymousClass7TE.A0b(A082, R.id.iglive_camera_preview_texture);
        this.A06 = DbW.A0B(A082, R.id.iglive_livewith_invitation_confirm);
        this.A05 = DbW.A0B(A082, R.id.iglive_livewith_invitation_cancel);
        circularImageView2.A02 = true;
        circularImageView.A02 = true;
    }

    public final void A00(View view, PopupWindow.OnDismissListener onDismissListener, AnonymousClass0iw r8, User user, User user2) {
        0qQ.A0B(view, 0);
        AnonymousClass7TF.A1C(user, 1, r8);
        this.A02 = false;
        this.A00 = false;
        DbU.A1S(r8, this.A0A, user);
        DbU.A1S(r8, this.A09, user2);
        ID1.A01(this.A06, 44, this);
        ID1.A01(this.A05, 45, this);
        this.A0B.setVisibility(8);
        PopupWindow popupWindow = this.A03;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setSoftInputMode(16);
        popupWindow.setAnimationStyle(R.style.PopupAnimationStyle);
        popupWindow.showAtLocation(view, 80, 0, 0);
        popupWindow.setOnDismissListener(onDismissListener);
        popupWindow.setTouchInterceptor(new C56815IDm(this, 11));
    }

    public final void EQU(C340307l3 r1) {
    }

    public final CircularTextureView Ajl() {
        return this.A0B;
    }
}
