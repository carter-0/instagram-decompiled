package X;

import com.instagram.newsfeed.fragment.NewsfeedFragment;
import java.util.List;
import java.util.Map;

public final class F21 {
    public final /* synthetic */ NewsfeedFragment A00;
    public final /* synthetic */ C46356DdJ A01;

    public final void A00(C61079JwH jwH, C46539Dgg dgg, boolean z) {
        C46356DdJ ddJ = this.A01;
        Map map = ddJ.A02;
        Object obj = map.get(jwH);
        if (obj == null) {
            obj = AnonymousClass7TE.A1C();
            map.put(jwH, obj);
        }
        List list = (List) obj;
        if (jwH.A01 == AnonymousClass05K.A00) {
            list.clear();
        }
        if (z) {
            list.add(dgg);
        } else {
            list.remove(dgg);
        }
        boolean A1R = AnonymousClass7TF.A1R(ddJ.A03().size());
        NewsfeedFragment newsfeedFragment = this.A00;
        C331157Pu r1 = newsfeedFragment.A03;
        if (r1 != null) {
            r1.A0K(NewsfeedFragment.A00(newsfeedFragment, ddJ, A1R), true);
        }
    }

    public F21(NewsfeedFragment newsfeedFragment, C46356DdJ ddJ) {
        this.A01 = ddJ;
        this.A00 = newsfeedFragment;
    }
}
