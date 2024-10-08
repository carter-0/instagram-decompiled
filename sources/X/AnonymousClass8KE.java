package X;

import android.os.Build;
import android.view.Display;
import java.util.function.Consumer;

/* renamed from: X.8KE  reason: invalid class name */
public final class AnonymousClass8KE implements Consumer {
    public final /* synthetic */ AnonymousClass80G A00;

    public AnonymousClass8KE(AnonymousClass80G r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Display display = (Display) obj;
        0qQ.A0B(display, 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.A00.A01 = display.getHdrSdrRatio();
        }
        AnonymousClass80G r0 = this.A00;
        B1J b1j = r0.A09;
        if (b1j != null) {
            b1j.DIo(r0.A01);
        }
    }
}
