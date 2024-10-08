package X;

import com.instagram.wonderwall.model.WallPostItem;

public final class J8K extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ WallPostItem A03;
    public final /* synthetic */ C66528MVg A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J8K(WallPostItem wallPostItem, C66528MVg mVg, float f, int i, int i2, boolean z) {
        super(2);
        this.A03 = wallPostItem;
        this.A00 = f;
        this.A04 = mVg;
        this.A05 = z;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        WallPostItem wallPostItem = this.A03;
        float f = this.A00;
        I5C.A03(A0R, wallPostItem, this.A04, f, C51966G9m.A01(this.A01), this.A02, this.A05);
        return C60340gF.A00;
    }
}
