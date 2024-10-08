package X;

import android.view.animation.OvershootInterpolator;
import com.instagram.common.session.UserSession;

public final class GKL extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GKL(int i, Object obj, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        switch (this.A00) {
            case 0:
                return new C56919IHo(new C57584IdB(C51966G9m.A0Q(this.A01)), this.A02);
            case 1:
                if (!this.A02) {
                    return "";
                }
                OvershootInterpolator overshootInterpolator = C53928GwY.A0r;
                GZG gzg = ((C53928GwY) this.A01).A04;
                if (gzg == null || (str = gzg.A01) == null) {
                    return "";
                }
                return str;
            case 2:
                if (this.A02) {
                    ((GFJ) this.A01).A0H.ARk(false);
                }
                return C60340gF.A00;
            case 3:
                if (!this.A02) {
                    return null;
                }
                GFJ gfj = (GFJ) this.A01;
                return new S6e(gfj.A0C, gfj.A0A, C51966G9m.A1B(gfj.A06), (String) null, "caption_and_browse");
            default:
                return new IOH((UserSession) this.A01, this.A02);
        }
    }
}
