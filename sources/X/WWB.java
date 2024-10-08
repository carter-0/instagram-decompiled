package X;

import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.model.keyword.Keyword;

public final /* synthetic */ class WWB implements X45 {
    public final /* synthetic */ WWD A00;

    public /* synthetic */ WWB(WWD wwd) {
        this.A00 = wwd;
    }

    public final void Dcn(Refinement refinement, int i) {
        WWD wwd = this.A00;
        if (!refinement.equals((Object) null)) {
            C15358UbA ubA = wwd.A0A.A00;
            Keyword keyword = refinement.A00.A02;
            if (keyword != null) {
                C15358UbA.A03(keyword, ubA);
            }
        }
        wwd.A08.Ck2(refinement, i);
    }
}
