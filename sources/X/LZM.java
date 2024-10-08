package X;

import android.widget.PopupWindow;
import com.instagram.android.R;

public final class LZM implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C324826zy A00;
    public final /* synthetic */ C320286s8 A01;

    public LZM(C324826zy r1, C320286s8 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onDismiss() {
        this.A00.setEndIcon(this.A01.A02.getDrawable(R.drawable.instagram_chevron_down_pano_filled_12));
    }
}
