package X;

import android.content.DialogInterface;

public final class HJE extends HQD {
    public final DialogInterface.OnClickListener A00;
    public final Integer A01;

    public HJE(DialogInterface.OnClickListener onClickListener, Integer num) {
        this.A01 = num;
        this.A00 = onClickListener;
    }
}
