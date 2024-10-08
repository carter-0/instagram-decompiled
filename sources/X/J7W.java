package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class J7W extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C270284gU A01;
    public final /* synthetic */ C53472Gp4 A02;
    public final /* synthetic */ 0sP A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J7W(C270284gU r2, C53472Gp4 gp4, 0sP r4, float f, boolean z) {
        super(2);
        this.A02 = gp4;
        this.A00 = f;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r2 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2033440651, "com.instagram.barcelona.feed.mediaviewer.ui.ImageMediaBox.<anonymous> (ImageMediaBox.kt:49)");
            }
            C53472Gp4 gp4 = this.A02;
            String str = gp4.A06;
            float f = this.A00;
            ImageUrl imageUrl = (ImageUrl) 00k.A0J((List) gp4.A03);
            String str2 = gp4.A05;
            JV7 jv7 = (JV7) gp4.A04;
            C270284gU r3 = this.A01;
            0sP r9 = this.A03;
            r2.ExS(447702512);
            boolean z = this.A04;
            boolean AGv = r2.AGv(z);
            Object ECw = r2.ECw();
            if (AGv || ECw == AnonymousClass5XT.A00) {
                ECw = new C52649GaN(z, 0);
                r2.FLL(ECw);
            }
            boolean A1Y = C51968G9o.A1Y(r2);
            C56228Huv.A00(r2, r3, jv7, imageUrl, str, str2, (C62320sa) ECw, r9, f, A1Y ? 1 : 0, A1Y ? 1 : 0);
            if (0fL.A02()) {
                0fL.A00(1013286916);
            }
        } else {
            r2.Evl();
        }
        return C60340gF.A00;
    }
}
