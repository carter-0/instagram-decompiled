package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class VWA {
    public final ViewGroup A00;
    public final C71662eb A01;
    public final IgImageView[] A02;

    public VWA(ViewGroup viewGroup) {
        IgImageView[] igImageViewArr = new IgImageView[3];
        this.A02 = igImageViewArr;
        this.A00 = viewGroup;
        igImageViewArr[0] = viewGroup.requireViewById(R.id.image1);
        igImageViewArr[1] = viewGroup.requireViewById(R.id.image2);
        igImageViewArr[2] = viewGroup.requireViewById(R.id.image3);
        this.A01 = DbY.A0S(viewGroup, R.id.empty_state_container);
    }
}
