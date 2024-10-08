package X;

import android.content.Context;
import com.instagram.model.reels.Reel;
import java.util.List;

public final class WZV implements C46202DQe {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ C15343Uat A02;

    public WZV(Context context, Reel reel, C15343Uat uat) {
        this.A02 = uat;
        this.A01 = reel;
        this.A00 = context;
    }

    public final void Doh(List list) {
        C47173Dro dro;
        if (list != null && (dro = (C47173Dro) 00k.A0J(list)) != null) {
            C15343Uat uat = this.A02;
            Reel reel = this.A01;
            Context context = this.A00;
            Reel A0F = 1OP.A05(AnonymousClass7TE.A0l(uat.A0C)).A0F(dro);
            if (A0F != null) {
                reel = A0F;
            }
            C15343Uat.A00(reel, uat, dro.A01, true);
            C59689JTv.A07(context, 2131963424);
        }
    }
}
