package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class GD3 extends C338107hQ {
    public final /* synthetic */ GBY A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GD3(LinearLayoutManager linearLayoutManager, GBY gby) {
        super(linearLayoutManager);
        0qQ.A0B(linearLayoutManager, 2);
        this.A00 = gby;
    }

    public final int AnJ(C338367hq r3, int i) {
        int i2 = this.A00.A06.A00;
        int i3 = AnonymousClass3XX.A00;
        return View.MeasureSpec.makeMeasureSpec(i2, SN3.MAX_SIGNED_POWER_OF_TWO);
    }

    public final int AnM(C338367hq r3, int i) {
        int i2 = this.A00.A06.A01;
        int i3 = AnonymousClass3XX.A00;
        return View.MeasureSpec.makeMeasureSpec(i2, SN3.MAX_SIGNED_POWER_OF_TWO);
    }
}
