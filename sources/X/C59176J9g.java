package X;

import androidx.compose.ui.Modifier;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.J9g  reason: case insensitive filesystem */
public final class C59176J9g extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ GifUrlImpl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59176J9g(Modifier modifier, GifUrlImpl gifUrlImpl, String str, String str2, float f, int i, int i2, int i3) {
        super(2);
        this.A07 = str;
        this.A05 = gifUrlImpl;
        this.A00 = f;
        this.A06 = str2;
        this.A04 = modifier;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        String str = this.A07;
        GifUrlImpl gifUrlImpl = this.A05;
        float f = this.A00;
        HXW.A00(A0R, this.A04, gifUrlImpl, str, this.A06, f, this.A03, C51966G9m.A01(this.A01), this.A02);
        return C60340gF.A00;
    }
}
