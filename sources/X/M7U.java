package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.List;

public final class M7U implements Runnable {
    public final /* synthetic */ K4X A00;
    public final /* synthetic */ List A01;

    public M7U(K4X k4x, List list) {
        this.A01 = list;
        this.A00 = k4x;
    }

    public final void run() {
        ViewModelListUpdate A0R = DbS.A0R();
        A0R.A01(this.A01);
        K4X k4x = this.A00;
        AnonymousClass2t9 r0 = k4x.A04;
        if (r0 == null) {
            0qQ.A0F("magicMediaRemixTemplateAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A05(A0R);
        AnonymousClass7TF.A16(k4x.A03);
    }
}
