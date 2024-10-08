package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;

public final class JBD extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JBD(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A03 = obj2;
        this.A07 = obj3;
        this.A08 = obj4;
        this.A09 = z;
        this.A05 = obj5;
        this.A06 = obj6;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            Modifier modifier = (Modifier) this.A04;
            boolean z = this.A09;
            C56575I2f.A00(A0R, modifier, (C59494JLs) this.A08, (MagicModPostCaptureTransform) this.A03, (C62320sa) this.A06, (0sL) this.A07, (0sL) this.A05, C51966G9m.A01(this.A01), this.A02, z);
        } else {
            LineType lineType = (LineType) this.A07;
            boolean z2 = this.A09;
            C56239Hv6.A00(A0R, (Modifier) this.A05, lineType, (C299515vK) this.A04, (C53310Glw) this.A03, (C53256Gl4) this.A08, (C62320sa) this.A06, C51966G9m.A01(this.A01), this.A02, z2);
        }
        return C60340gF.A00;
    }
}
