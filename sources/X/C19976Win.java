package X;

import android.view.View;
import java.util.Set;

/* renamed from: X.Win  reason: case insensitive filesystem */
public final class C19976Win implements Runnable {
    public final /* synthetic */ UYH A00;

    public C19976Win(UYH uyh) {
        this.A00 = uyh;
    }

    public final void run() {
        String str;
        UYH uyh = this.A00;
        if (uyh.A01 != null) {
            VVD vvd = uyh.A08;
            if (vvd == null) {
                str = "tooltipController";
            } else {
                View view = uyh.A00;
                if (view == null) {
                    str = "anchor";
                } else {
                    Set set = vvd.A02;
                    if (!set.contains(view)) {
                        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(vvd.A00, 2131975558);
                        A0e.A03(view);
                        A0e.A01();
                        A0e.A07(C283255Gu.A07);
                        A0e.A00 = 5000;
                        A0e.A00().A07(vvd.A01);
                        set.add(view);
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
