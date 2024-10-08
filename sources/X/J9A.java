package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

public final class J9A extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9A(Object obj, Object obj2, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A03 = obj2;
        this.A05 = z;
        this.A06 = z2;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                boolean z = this.A06;
                C54832HUo.A00(A0R, (Modifier) this.A03, (LineType) this.A04, C51966G9m.A01(this.A01), this.A02, z, this.A05);
                break;
            case 1:
                boolean z2 = this.A06;
                boolean z3 = this.A05;
                HV6.A00(A0R, (Modifier) this.A03, (C62320sa) this.A04, C51966G9m.A01(this.A01), this.A02, z2, z3);
                break;
            case 2:
                C54918HYa.A00(A0R, (C62320sa) this.A03, (C62320sa) this.A04, C51966G9m.A01(this.A01), this.A02, this.A06, this.A05);
                break;
            default:
                C56358Hx9.A01(A0R, (AudioOverlayTrack) this.A04, (List) this.A03, C51966G9m.A01(this.A01), this.A02, this.A05, this.A06);
                break;
        }
        return C60340gF.A00;
    }
}
