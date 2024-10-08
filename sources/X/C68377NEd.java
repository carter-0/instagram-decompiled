package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.NEd  reason: case insensitive filesystem */
public final class C68377NEd extends C7921Qcs {
    public Button A00;

    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawable;
        Drawable drawable2;
        0qQ.A0B(view, 0);
        Button button = (Button) SKW.A00(view, R.id.btn_camera_access_allow);
        this.A00 = button;
        if (button == null) {
            0qQ.A0F("btnCameraAccessAllow");
            throw AnonymousClass00P.createAndThrow();
        }
        C71403Ok2.A01(SKW.A00(button, R.id.btn_camera_access_allow), 4, this);
        ImageView imageView = (ImageView) SKW.A00(view, R.id.iv_permissions_statement1);
        ImageView imageView2 = (ImageView) SKW.A00(view, R.id.iv_permissions_statement2);
        ImageView imageView3 = (ImageView) SKW.A00(view, R.id.iv_permissions_statement3);
        Drawable drawable3 = null;
        if (this.A00 != null) {
            drawable = AnonymousClass7TE.A0S(view).getDrawable(R.drawable.instagram_video_chat_pano_filled_24);
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        if (this.A00 == null || (drawable2 = AnonymousClass7TE.A0S(view).getDrawable(R.drawable.instagram_sparkles_pano_outline_24)) == null) {
            drawable2 = null;
        } else {
            C51969G9p.A12(PorterDuff.Mode.SRC_ATOP, drawable2, requireContext().getColor(R.color.abc_decor_view_status_guard_light));
        }
        imageView2.setImageDrawable(drawable2);
        if (this.A00 != null) {
            drawable3 = AnonymousClass7TE.A0S(view).getDrawable(R.drawable.instagram_settings_pano_outline_24);
        }
        imageView3.setImageDrawable(drawable3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1562989461);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.xmds_permissions_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1137842974, A02);
        return inflate;
    }
}
