package X;

import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gt6  reason: case insensitive filesystem */
public final class C53715Gt6 extends C251343mx {
    public final C267324bN A00;
    public final AnonymousClass0iw A01;
    public final boolean A02;

    public final C251263mp A0X(AnonymousClass3Y5 r26) {
        AnonymousClass3Y5 r11 = r26;
        0qQ.A0B(r11, 0);
        1Xj r13 = this.A00.A02;
        if (r13 != null) {
            AnonymousClass3XV r1 = 2WX.A02;
            Integer num = AnonymousClass05K.A00;
            2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0b(num, 100.0f, 0));
            Integer num2 = AnonymousClass05K.A01;
            2WX A0X2 = C51971G9r.A0X(A0X, num2, 100.0f, 0);
            2Wb A0Q = C51972G9s.A0Q(r11);
            C244413b9 r3 = C244413b9.ABSOLUTE;
            Integer num3 = AnonymousClass05K.A0Y;
            2WX A0O = C51974G9v.A0O(C51971G9r.A0Y((2WX) null, num3, r3, 3), num, num2, 100.0f, 0);
            ImageUrl A1Q = r13.A1Q();
            if (A1Q != null) {
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
                A0Q.A00(new GYW(scaleType, A0O, this.A01, A1Q, (ImageUrl) null, (C240963Ni) null, (C226632hb) null, (String) null, 3, this.A02, false));
                return C51967G9n.A0N(new C53970GxE(C244013aV.A0D(A0Q, R.drawable.video_indeterminate_progress), scaleType, C51971G9r.A0Y(C51974G9v.A0O((2WX) null, num2, num, 100.0f, 0), num3, r3, 3), A0Q.Bnf().A02(R.color.fds_transparent)), A0Q, r11, A0X2);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public C53715Gt6(C267324bN r1, AnonymousClass0iw r2, boolean z) {
        AnonymousClass7TG.A1O(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }
}
