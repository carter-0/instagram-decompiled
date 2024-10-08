package X;

import android.content.DialogInterface;
import androidx.activity.ComponentActivity;

public final class W4V implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;

    public W4V(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 0:
                ((X6V) this.A01).Dqw();
                return;
            case 1:
            case 2:
                X8Y x8y = (X8Y) this.A01;
                if (x8y != null) {
                    x8y.onCancel();
                    return;
                }
                return;
            case 7:
                ((ComponentActivity) this.A01).onBackPressed();
                return;
            case 8:
                G9w.A1O((AnonymousClass6Z5) this.A01);
                return;
            default:
                ((AnonymousClass6ZD) this.A01).A00();
                return;
        }
    }
}
