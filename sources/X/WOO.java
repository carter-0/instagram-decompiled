package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

public final class WOO implements X6N {
    public boolean A00 = false;
    public final View.OnClickListener A01;
    public final ImageUrl A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;

    public WOO(View.OnClickListener onClickListener, ImageUrl imageUrl, Integer num, Long l, String str) {
        this.A05 = str;
        this.A02 = imageUrl;
        this.A04 = l;
        this.A03 = num;
        this.A01 = onClickListener;
    }

    public final void Ejb(boolean z) {
        this.A00 = true;
    }

    public final boolean BrJ() {
        return this.A00;
    }
}
