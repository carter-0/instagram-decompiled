package X;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;

public final class Wj7 implements Runnable {
    public final /* synthetic */ W28 A00;

    public Wj7(W28 w28) {
        this.A00 = w28;
    }

    public final void run() {
        W28 w28 = this.A00;
        int i = W28.A0A;
        ColorDrawable colorDrawable = w28.A05;
        View view = w28.A06;
        colorDrawable.setBounds(new Rect(0, 0, view.getWidth(), view.getHeight()));
        view.getOverlay().add(colorDrawable);
        w28.A02 = true;
        w28.A00 = true;
        view.postDelayed(w28.A07, 1500);
    }
}
