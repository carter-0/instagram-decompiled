package X;

import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.ui.Modifier;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;
import com.instagram.profilecard.domain.ProfileCardViewModel;

public final class JCK extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JCK(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A06 = obj2;
        this.A07 = obj3;
        this.A08 = obj4;
        this.A0C = z;
        this.A0B = z2;
        this.A09 = obj5;
        this.A04 = obj6;
        this.A05 = obj7;
        this.A0A = z3;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj2;
        if (this.A00 != 0) {
            C286575Wy A0R = C51966G9m.A0R(obj, obj3);
            boolean z = this.A0A;
            C53397GnU gnU = (C53397GnU) this.A08;
            View view = (View) this.A05;
            Modifier modifier = (Modifier) this.A06;
            L3W l3w = (L3W) this.A04;
            I7V.A01((Bitmap) this.A03, view, A0R, modifier, l3w, gnU, (ProfileCardViewModel) this.A09, (AnonymousClass62P) this.A07, C51966G9m.A01(this.A01), this.A02, z, this.A0C, this.A0B);
        } else {
            boolean z2 = this.A0C;
            boolean z3 = this.A0B;
            HYA.A00(C51966G9m.A0R(obj, obj3), (C3018260f) this.A03, (C3018260f) this.A06, (C3018260f) this.A09, (HPM) this.A04, (MagicModPostCaptureTransform) this.A05, (C55638Hkx) this.A07, (0sP) this.A08, C51966G9m.A01(this.A01), this.A02, z2, z3, this.A0A);
        }
        return C60340gF.A00;
    }
}
