package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public final class JGT extends 0Yg implements 0sK {
    public final float A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGT(float f, int i) {
        super(3);
        this.A01 = i;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.A01 != 0) {
            C286575Wy A0R = C51966G9m.A0R(obj2, obj3);
            if (C51967G9n.A1U(A0R, 1696281411)) {
                0fL.A01(217117845, "com.instagram.creation.genai.common.ui.legacyKeyboardBottomPadding.<anonymous> (ImeUtils.kt:35)");
            }
            Modifier A0C = C51967G9n.A0C(Modifier.A00, this.A00);
            if (0fL.A02()) {
                0fL.A00(-260330446);
            }
            C51965G9l.A1V(A0R);
            return A0C;
        }
        C286575Wy r6 = (C286575Wy) obj2;
        if (C51968G9o.A0D(obj3) != 16 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1732205217, "com.instagram.barcelona.feed.post.ui.QuotePostCaption.<anonymous> (PostPreview.kt:605)");
            }
            C288165bT.A05(r6, C287205Zk.A0C(Modifier.A00, this.A00), C51967G9n.A0J(r6, R.drawable.barcelona_quote_filled_14), C51966G9m.A0M(r6));
            if (0fL.A02()) {
                0fL.A00(-1318870117);
            }
        } else {
            r6.Evl();
        }
        return C60340gF.A00;
    }
}
