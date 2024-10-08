package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

public final class WOP implements X6N {
    public boolean A00 = false;
    public final View.OnClickListener A01;
    public final C16680UzG A02;
    public final ImageUrl A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public WOP(View.OnClickListener onClickListener, C16680UzG uzG, ImageUrl imageUrl, String str, String str2, boolean z) {
        0qQ.A0B(onClickListener, 5);
        this.A05 = str;
        this.A03 = imageUrl;
        this.A04 = str2;
        this.A02 = uzG;
        this.A01 = onClickListener;
        this.A06 = z;
    }

    public final void Ejb(boolean z) {
        this.A00 = true;
    }

    public final boolean BrJ() {
        return this.A00;
    }
}
