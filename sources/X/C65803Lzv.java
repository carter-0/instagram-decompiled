package X;

import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.Lzv  reason: case insensitive filesystem */
public final class C65803Lzv implements AnonymousClass8J8 {
    public final /* synthetic */ C65074Lmu A00;

    public C65803Lzv(C65074Lmu lmu) {
        this.A00 = lmu;
    }

    public final void DrY(int i) {
        ShutterButton shutterButton = this.A00.A01;
        if (shutterButton != null) {
            shutterButton.setInnerText(String.valueOf(i));
        }
    }
}
