package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.creation.base.ui.filterview.FilterViewContainer;

public final class M2V implements Runnable {
    public final /* synthetic */ JWH A00;

    public M2V(JWH jwh) {
        this.A00 = jwh;
    }

    public final void run() {
        ImageView imageView;
        JWH jwh = this.A00;
        View findViewById = jwh.A02.findViewById(R.id.creation_image_container);
        if ((findViewById instanceof FilterViewContainer) && (imageView = ((FilterViewContainer) findViewById).A01) != null) {
            imageView.setVisibility(4);
        }
        jwh.A05.A08(AnonymousClass05K.A00);
        JW1.A00(jwh.A03).A0B(true, (String) null);
    }
}
