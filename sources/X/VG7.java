package X;

import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public abstract class VG7 {
    public static final void A00(AnonymousClass0iw r17, 1Xj r18, 1Xj r19, C17636VbS vbS, String str, 0sK r22) {
        AnonymousClass0iw r5 = r17;
        0qQ.A0B(r5, 4);
        C17636VbS vbS2 = vbS;
        IgImageView A0R = C66580MXl.A0R(vbS2.A03);
        String A00 = AnonymousClass000.A00(1696);
        1Xj r7 = r18;
        I05 i05 = new I05(r5, A0R, r7, (Integer) null, A00, 192, false, true);
        0sP r1 = vbS2.A05;
        r1.invoke(i05);
        r1.invoke(new I05(r5, C66580MXl.A0R(vbS2.A01), r19, (Integer) null, A00, 240, false, false));
        ((TextView) vbS2.A02.getValue()).setText(str);
        AnonymousClass7TE.A0c(vbS2.A04).setOnTouchListener(new C18899WBr(11, r22, r7));
        vbS2.A00.setVisibility(0);
    }
}
