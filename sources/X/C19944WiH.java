package X;

import com.facebook.react.bridge.BaseJavaModule;
import java.util.List;

/* renamed from: X.WiH  reason: case insensitive filesystem */
public final /* synthetic */ class C19944WiH implements Runnable {
    public final /* synthetic */ List A00;

    public /* synthetic */ C19944WiH(List list) {
        this.A00 = list;
    }

    public final void run() {
        for (BaseJavaModule invalidate : this.A00) {
            invalidate.invalidate();
        }
    }
}
