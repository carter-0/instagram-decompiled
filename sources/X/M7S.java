package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.List;

public final class M7S implements Runnable {
    public final /* synthetic */ LBR A00;
    public final /* synthetic */ List A01;

    public M7S(LBR lbr, List list) {
        this.A01 = list;
        this.A00 = lbr;
    }

    public final void run() {
        String str;
        ViewModelListUpdate A0R = DbS.A0R();
        A0R.A01(this.A01);
        LBR lbr = this.A00;
        AnonymousClass2t9 r0 = lbr.A01;
        if (r0 == null) {
            str = "magicMediaRemixAdapter";
        } else {
            r0.A05(A0R);
            RecyclerView recyclerView = lbr.A00;
            if (recyclerView == null) {
                str = "recyclerView";
            } else {
                recyclerView.setVisibility(0);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
