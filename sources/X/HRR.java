package X;

import android.view.KeyEvent;

public abstract class HRR {
    public static final int A00(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return C51975G9x.A1Q(action, 1) ? 1 : 0;
        }
        return 2;
    }
}
