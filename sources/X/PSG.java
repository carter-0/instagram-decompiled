package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.model.direct.DirectShareTarget;

public final class PSG implements 1aV {
    public final /* synthetic */ AnonymousClass7H6 A00;
    public final /* synthetic */ C254783t2 A01;

    public PSG(AnonymousClass7H6 r1, C254783t2 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str;
        if (this.A01 instanceof AnonymousClass9HR) {
            AnonymousClass7H6 r0 = this.A00;
            FragmentActivity fragmentActivity = r0.A0t;
            DirectShareTarget directShareTarget = r0.A0R;
            if (directShareTarget != null) {
                str = DbT.A0y(directShareTarget);
            } else {
                str = null;
            }
            C59689JTv.A09(fragmentActivity, DbW.A0h(fragmentActivity, str, 2131960309));
        }
    }
}
