package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;

public final class JA4 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JA4(Object obj, Object obj2, String str, int i, int i2, int i3, long j, boolean z) {
        super(2);
        this.A00 = i3;
        this.A05 = obj;
        this.A06 = str;
        this.A07 = z;
        this.A03 = j;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            C286575Wy A0R = C51966G9m.A0R(obj, obj2);
            String str = this.A06;
            boolean z = this.A07;
            C56258HvS.A00((AnonymousClass6FY) this.A05, A0R, str, (C62320sa) this.A04, C51966G9m.A01(this.A01), this.A02, this.A03, z);
        } else {
            C286575Wy A0R2 = C51966G9m.A0R(obj, obj2);
            String str2 = this.A06;
            boolean z2 = this.A07;
            long j = this.A03;
            HVA.A00(A0R2, (Modifier) this.A04, (LineType) this.A05, str2, C51966G9m.A01(this.A01), this.A02, j, z2);
        }
        return C60340gF.A00;
    }
}
