package X;

import android.content.DialogInterface;

public final class M8Y implements Runnable {
    public final /* synthetic */ DialogInterface.OnClickListener A00;
    public final /* synthetic */ JWG A01;
    public final /* synthetic */ Integer A02;

    public M8Y(DialogInterface.OnClickListener onClickListener, JWG jwg, Integer num) {
        this.A01 = jwg;
        this.A02 = num;
        this.A00 = onClickListener;
    }

    public final void run() {
        JWG.A04(this.A00, this.A01, this.A02);
    }
}
