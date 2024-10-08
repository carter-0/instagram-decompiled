package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import java.util.List;

public final class FNW implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C249703kE A01;
    public final /* synthetic */ C2365834h A02;

    public FNW(C249703kE r1, C2365834h r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1271307379);
        C2365834h r0 = this.A02;
        Reel reel = r0.A00;
        if (reel != null) {
            C230242pG r3 = r0.A0C;
            C249703kE r4 = this.A01;
            List list = r0.A03;
            r3.E0D(r4, reel, r0.A07, r0.A09, ((AnonymousClass3BT) r0.A04.get(this.A00)).A04.A00, list);
        }
        AnonymousClass0fD.A0C(-916563654, A05);
    }
}
