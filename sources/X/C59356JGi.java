package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.JGi  reason: case insensitive filesystem */
public final class C59356JGi extends 0Yg implements 0sK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 0sP A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59356JGi(String str, 0sP r3, int i, int i2) {
        super(3);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A03 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy r10 = (C286575Wy) obj2;
        if (C51968G9o.A0E(obj3) != 16 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1834960844, "com.instagram.creation.genai.themes.ui.AiThemesImagePickerHScrollSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AiThemesImagePickerHScrollSelector.kt:65)");
            }
            r10.ExS(-1269404028);
            int i = this.A00;
            int i2 = this.A01;
            Modifier modifier = Modifier.A00;
            if (i == i2) {
                modifier = C51968G9o.A0Q(modifier, 4.0f, 2.0f, C51966G9m.A0I(r10));
            }
            C286565Wx r5 = (C286565Wx) r10;
            C286565Wx.A0L(r5, false);
            String str = this.A02;
            r10.ExS(-1269394200);
            0sP r2 = this.A03;
            boolean AGu = r10.AGu(r2) | r10.AGs(i);
            Object ECw = r10.ECw();
            if (AGu || ECw == AnonymousClass5XT.A00) {
                ECw = new MJ3(i, 22, r2);
                r10.FLL(ECw);
            }
            C56281Hvp.A01(r10, modifier, str, C51965G9l.A0y(r5, ECw, false), 0);
            if (0fL.A02()) {
                0fL.A00(-970520248);
            }
        } else {
            r10.Evl();
        }
        return C60340gF.A00;
    }
}
