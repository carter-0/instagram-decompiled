package X;

import android.view.View;

public final class EyP {
    public final View.OnClickListener A00;
    public final Integer A01;
    public final String A02;

    public EyP(View.OnClickListener onClickListener, Integer num, String str) {
        this.A02 = str;
        this.A00 = onClickListener;
        this.A01 = num;
    }
}
