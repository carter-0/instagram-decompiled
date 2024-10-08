package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.NEc  reason: case insensitive filesystem */
public abstract class C68376NEc extends C7921Qcs {
    public Button A00;

    public abstract CharSequence A01();

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        Button button = (Button) SKW.A00(view, R.id.btn_camera_access_allow);
        this.A00 = button;
        if (button == null) {
            0qQ.A0F("btnCameraAccessAllow");
            throw AnonymousClass00P.createAndThrow();
        }
        C71403Ok2.A01(SKW.A00(button, R.id.btn_camera_access_allow), 0, this);
        ((TextView) SKW.A00(view, R.id.tv_permissions_explanation)).setText(A01());
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_back_button);
        if (imageView != null) {
            Context requireContext = requireContext();
            if (this.A00 != null) {
                DbU.A13(requireContext, imageView, R.drawable.instagram_arrow_left_pano_outline_24);
            }
            C71403Ok2.A01(imageView, 1, this);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(161117750);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.default_permissions_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-543807253, A02);
        return inflate;
    }
}
