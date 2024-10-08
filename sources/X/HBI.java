package X;

import android.view.View;
import com.instagram.newsfeed.ui.InlineLinkUrn;

public final class HBI extends C253103qD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public HBI(GRE gre, 0sP r5, int i, int i2) {
        this.A00 = 1;
        this.A01 = r5;
        this.A02 = gre;
        this.A01 = "";
        this.A00 = i;
        this.A02 = (i2 & 1) != 1 ? false : true;
    }

    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                AnonymousClass1Nd.A00((0lg) this.A02).A00(new C381909cm((1Xj) this.A01, 1));
                return;
            case 1:
                GRE gre = (GRE) this.A02;
                ((0sP) this.A01).invoke(new InlineLinkUrn(gre.A02, gre.A03));
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HBI(int i, int i2, Object obj, Object obj2) {
        super(true, i);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
