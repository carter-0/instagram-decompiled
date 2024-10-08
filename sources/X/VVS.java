package X;

import android.view.View;

public final class VVS {
    public Integer A00;
    public final View.OnClickListener A01;
    public final CharSequence A02;

    public VVS(View.OnClickListener onClickListener, CharSequence charSequence, Integer num) {
        this.A00 = num;
        this.A02 = charSequence;
        this.A01 = onClickListener;
    }
}
