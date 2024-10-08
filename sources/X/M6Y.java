package X;

import androidx.constraintlayout.widget.ConstraintLayout;

public final class M6Y implements Runnable {
    public final /* synthetic */ ConstraintLayout A00;
    public final /* synthetic */ JYD A01;

    public M6Y(ConstraintLayout constraintLayout, JYD jyd) {
        this.A01 = jyd;
        this.A00 = constraintLayout;
    }

    public final void run() {
        this.A01.A0C.removeView(this.A00);
    }
}
