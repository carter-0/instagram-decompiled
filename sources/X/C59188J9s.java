package X;

import androidx.compose.ui.Modifier;
import com.instagram.wonderwall.model.WallPostInfo;

/* renamed from: X.J9s  reason: case insensitive filesystem */
public final class C59188J9s extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ WallPostInfo A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59188J9s(Modifier modifier, WallPostInfo wallPostInfo, C62320sa r4, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A03 = wallPostInfo;
        this.A02 = modifier;
        this.A05 = z;
        this.A07 = z2;
        this.A06 = z3;
        this.A04 = r4;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        WallPostInfo wallPostInfo = this.A03;
        C55197Hdn.A00(A0R, this.A02, wallPostInfo, this.A04, C51966G9m.A01(this.A00), this.A01, this.A05, this.A07, this.A06);
        return C60340gF.A00;
    }
}
