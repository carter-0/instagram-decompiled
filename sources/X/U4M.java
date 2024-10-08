package X;

import android.widget.FrameLayout;

public final class U4M extends FrameLayout {
    public C19077WKh A00;

    public final void setUrl(String str, String str2) {
        boolean A1Z = AnonymousClass7TG.A1Z(str, str2);
        C19077WKh wKh = this.A00;
        if (wKh != null) {
            W1V w1v = wKh.A00;
            if (w1v != null) {
                w1v.A08 = A1Z;
            }
            wKh.ABi(new C17415VUu(str2, str, str), AnonymousClass05K.A0C, "");
        }
    }
}
