package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.compose.ui.Modifier;

/* renamed from: X.JGk  reason: case insensitive filesystem */
public final class C59358JGk extends 0Yg implements 0sK {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59358JGk(Object obj, int i, int i2, int i3) {
        super(3);
        this.A00 = i3;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        if (this.A00 != 0) {
            Modifier modifier = (Modifier) obj;
            C286575Wy r9 = (C286575Wy) obj2;
            boolean A1b = C51972G9s.A1b(obj3, modifier);
            if (C51967G9n.A1U(r9, -1610575008)) {
                0fL.A01(505922081, "com.instagram.creation.genai.magicmod.common.ui.detectMagicModImageTaps.<anonymous> (MagicModBackdropSegmentedImage.kt:90)");
            }
            0sP r6 = (0sP) this.A03;
            if (r6 != null) {
                C60340gF r5 = C60340gF.A00;
                r9.ExS(-697148493);
                int i = this.A02;
                boolean AGs = r9.AGs(i);
                int i2 = this.A01;
                boolean A1U = C51968G9o.A1U(r9, r6, AGs, r9.AGs(i2));
                Object ECw = r9.ECw();
                if (A1U || ECw == AnonymousClass5XT.A00) {
                    ECw = new MGI((AnonymousClass4D7) null, r6, i, i2);
                    r9.FLL(ECw);
                }
                C51965G9l.A1X(r9, A1b);
                obj4 = C304916Fs.A00(modifier, r5, (0sL) ECw);
            } else {
                obj4 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A00(-1997100009);
            }
            C51965G9l.A1X(r9, A1b);
            return obj4;
        }
        int A0M = AnonymousClass7TE.A0M(obj);
        int A0M2 = AnonymousClass7TE.A0M(obj2);
        int A0M3 = AnonymousClass7TE.A0M(obj3);
        if (Color.alpha(A0M3) != this.A02) {
            ((Bitmap) this.A03).setPixel(A0M, A0M2, C51973G9u.A01(this.A01, Color.alpha(A0M3)));
        }
        return C60340gF.A00;
    }
}
