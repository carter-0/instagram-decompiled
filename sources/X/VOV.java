package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.maps.ui.IgStaticMapView;

public final class VOV {
    public final IgStaticMapView A00;

    public VOV(View view) {
        this.A00 = (IgStaticMapView) view.requireViewById(R.id.row_map_header_imageview);
    }
}
