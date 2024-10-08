package X;

import android.graphics.drawable.GradientDrawable;
import com.instagram.genai.imageutils.MaskUtilsKt;

/* renamed from: X.IxW  reason: case insensitive filesystem */
public final class C58785IxW extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58785IxW(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        super(1);
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        GradientDrawable gradientDrawable;
        int i2;
        if (this.A00 != 0) {
            C53927GwX gwX = (C53927GwX) this.A05;
            if (!182.A06(0Tu.A06, gwX.A03, 36315133900229647L)) {
                if (gwX.A06) {
                    gradientDrawable = (GradientDrawable) this.A03;
                    i2 = this.A01;
                } else {
                    C51973G9u.A18((C243673Zt) this.A04);
                    gradientDrawable = (GradientDrawable) this.A03;
                    i2 = this.A02;
                }
                gradientDrawable.setColor(i2);
            }
        } else {
            int A0M = AnonymousClass7TE.A0M(obj);
            for (int i3 = 0; i3 < this.A01; i3++) {
                int i4 = (this.A02 * i3) + A0M;
                boolean A0P = 03t.A0P((int[]) this.A03, ((int[]) this.A05)[i4]);
                int[] iArr = (int[]) this.A04;
                if (A0P) {
                    i = MaskUtilsKt.A01;
                } else {
                    i = MaskUtilsKt.A00;
                }
                iArr[i4] = i;
            }
        }
        return C60340gF.A00;
    }
}
