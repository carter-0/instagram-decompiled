package X;

import androidx.compose.ui.Modifier;
import com.instagram.wonderwall.model.WallPostItem;

/* renamed from: X.J9v  reason: case insensitive filesystem */
public final class C59191J9v extends 0Yg implements 0sL {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59191J9v(Object obj, Object obj2, float f, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A01 = i3;
        this.A05 = obj;
        this.A06 = z;
        this.A07 = z2;
        this.A00 = f;
        this.A04 = obj2;
        this.A02 = i;
        this.A03 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A01;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        Object obj3 = this.A05;
        if (i != 0) {
            boolean z = this.A06;
            boolean z2 = this.A07;
            C55194Hdk.A00(A0R, (Modifier) obj3, (0sL) this.A04, this.A00, C51966G9m.A01(this.A02), this.A03, z, z2);
        } else {
            I5B.A02(A0R, (WallPostItem) obj3, (0sP) this.A04, this.A00, C51966G9m.A01(this.A02), this.A03, this.A07, this.A06);
        }
        return C60340gF.A00;
    }
}
