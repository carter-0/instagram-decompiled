package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

public final class TK0 implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ IgReactNavigatorModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public TK0(FragmentActivity fragmentActivity, IgReactNavigatorModule igReactNavigatorModule, String str, String str2) {
        this.A01 = igReactNavigatorModule;
        this.A00 = fragmentActivity;
        this.A03 = str;
        this.A02 = str2;
    }

    public final void run() {
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            IgReactNavigatorModule igReactNavigatorModule = this.A01;
            View view = igReactNavigatorModule.mCustomActionBarView;
            if (view == null || view.getParent() == null) {
                igReactNavigatorModule.mCustomActionBarView = LayoutInflater.from(fragmentActivity).inflate(R.layout.action_bar_image_title, (ViewGroup) null);
            } else {
                ((ViewGroup) igReactNavigatorModule.mCustomActionBarView.getParent()).removeView(igReactNavigatorModule.mCustomActionBarView);
            }
            ImageView A0F = DbU.A0F(igReactNavigatorModule.mCustomActionBarView, R.id.action_bar_title_imageview);
            A0F.setColorFilter(AnonymousClass37O.A00(2Yu.A01(fragmentActivity)));
            DbU.A0G(igReactNavigatorModule.mCustomActionBarView, R.id.action_bar_title_textview).setText(this.A03);
            DbU.A13(fragmentActivity, A0F, IgReactNavigatorModule.resourceForIconType(this.A02));
            2dZ.A0t.A03(fragmentActivity).ETh(igReactNavigatorModule.mCustomActionBarView);
        }
    }
}
