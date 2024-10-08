package X;

import com.facebook.react.uimanager.ViewManager;
import java.util.List;

/* renamed from: X.Wm3  reason: case insensitive filesystem */
public final class C20143Wm3 implements Runnable {
    public final /* synthetic */ W4T A00;
    public final /* synthetic */ List A01;

    public C20143Wm3(W4T w4t, List list) {
        this.A00 = w4t;
        this.A01 = list;
    }

    public final void run() {
        for (ViewManager trimMemory : this.A01) {
            trimMemory.trimMemory();
        }
    }
}
