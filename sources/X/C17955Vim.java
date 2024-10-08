package X;

import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.Vim  reason: case insensitive filesystem */
public final class C17955Vim {
    public final /* synthetic */ UYH A00;

    public C17955Vim(UYH uyh) {
        this.A00 = uyh;
    }

    public final void A00() {
        String str;
        UYH uyh = this.A00;
        AS8 as8 = uyh.A06;
        if (as8 == null) {
            str = "variantPickerController";
        } else {
            ShutterButton shutterButton = as8.A03;
            if (shutterButton == null) {
                str = "shutterButton";
            } else {
                shutterButton.setLongPressEnabled(false);
                WT1.A00(C16612Uy8.MODE_AR_STARTED, uyh.A02());
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01() {
        String str;
        UYH uyh = this.A00;
        AS8 as8 = uyh.A06;
        if (as8 == null) {
            str = "variantPickerController";
        } else {
            ShutterButton shutterButton = as8.A03;
            if (shutterButton == null) {
                str = "shutterButton";
            } else {
                shutterButton.setLongPressEnabled(true);
                WT1.A00(C16612Uy8.MODE_3D_STARTED, uyh.A02());
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
