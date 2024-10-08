package X;

import androidx.compose.ui.Modifier;
import com.instagram.wonderwall.model.WallPostItem;

public final class JAY extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ WallPostItem A03;
    public final /* synthetic */ C66528MVg A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JAY(Modifier modifier, WallPostItem wallPostItem, C66528MVg mVg, String str, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A03 = wallPostItem;
        this.A02 = modifier;
        this.A05 = str;
        this.A04 = mVg;
        this.A08 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        WallPostItem wallPostItem = this.A03;
        Modifier modifier = this.A02;
        String str = this.A05;
        I5C.A00(A0R, modifier, wallPostItem, this.A04, str, C51966G9m.A01(this.A00), this.A01, this.A08, this.A06, this.A07);
        return C60340gF.A00;
    }
}
