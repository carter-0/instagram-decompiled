package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.M8d  reason: case insensitive filesystem */
public final class C66018M8d implements Runnable {
    public final /* synthetic */ C347017w8 A00;
    public final /* synthetic */ C64724Lh1 A01;
    public final /* synthetic */ boolean A02;

    public C66018M8d(C347017w8 r1, C64724Lh1 lh1, boolean z) {
        this.A01 = lh1;
        this.A00 = r1;
        this.A02 = z;
    }

    public final void run() {
        String str;
        C64724Lh1 lh1 = this.A01;
        if (lh1.A0H.getVisibility() == 0) {
            C61750KKp kKp = lh1.A05;
            if (kKp == null) {
                str = "snapPickerController";
            } else {
                C16609Uy5[] values = C16609Uy5.values();
                boolean z = this.A02;
                ArrayList<C16609Uy5> A1C = AnonymousClass7TE.A1C();
                for (C16609Uy5 uy5 : values) {
                    if (z || uy5 != C16609Uy5.KARAOKE) {
                        A1C.add(uy5);
                    }
                }
                ArrayList A0r = AnonymousClass7TG.A0r(A1C);
                for (C16609Uy5 ldi : A1C) {
                    A0r.add(new C64541Ldi(ldi));
                }
                kKp.A01.A05(A0r);
                0nA.A0t(kKp.A01.A0P, new MB5((Object) kKp, 0, 0));
                C64724Lh1.A06(lh1);
                C66540MVu mVu = lh1.A06;
                if (mVu != null) {
                    mVu.FHa(lh1.A0F);
                }
                C64724Lh1.A09(lh1, AnonymousClass05K.A01);
                View view = lh1.A02;
                if (view == null) {
                    str = "stickerPreview";
                } else {
                    view.setBackground(new C380079Wn(this.A00));
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
