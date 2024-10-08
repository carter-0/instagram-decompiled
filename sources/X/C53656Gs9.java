package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Gs9  reason: case insensitive filesystem */
public final class C53656Gs9 extends C251343mx {
    public final C246193eB A00;
    public final C55505Hin A01;

    public C53656Gs9(C246193eB r2, C55505Hin hin) {
        0qQ.A0B(hin, 2);
        this.A00 = r2;
        this.A01 = hin;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r15) {
        C54667HMy A002;
        boolean A1Z = C51966G9m.A1Z(r15);
        2WX A003 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A06, A1Z ? 1 : 0, C51969G9p.A0F());
        C59100J6i j6i = new C59100J6i(this, 8);
        Integer num = AnonymousClass05K.A1F;
        2WX A10 = G9t.A10(A003, num, j6i);
        2Wb A0Q = C51972G9s.A0Q(r15);
        C246193eB r2 = this.A00;
        if (r2.BvY() && (A002 = C56315HwS.A00(r2)) != null) {
            int i = A002.A00;
            2V1 r4 = A0Q.A00;
            Context context = r4.A0C;
            Drawable drawable = context.getResources().getDrawable(i, (Resources.Theme) null);
            if (drawable != null) {
                boolean A0K = 0qQ.A0K(r2.C27(), "destructive");
                int i2 = R.attr.igds_color_primary_icon;
                if (A0K) {
                    i2 = R.attr.igds_color_error_or_destructive;
                }
                C51972G9s.A0w(drawable, A0Q, 2Yu.A0H(context, i2));
                C51974G9v.A0h(drawable, r4, A0Q, C51973G9u.A0X((2WX) null, num, 12.0d, A1Z));
            }
        }
        String text = r2.getText();
        long A0G = C51972G9s.A0G(16.0f);
        2V1 r1 = A0Q.A00;
        Context A0B = C51965G9l.A0B(r1);
        boolean A0K2 = 0qQ.A0K(r2.C27(), "destructive");
        int i3 = R.attr.igds_color_primary_icon;
        if (A0K2) {
            i3 = R.attr.igds_color_error_or_destructive;
        }
        int A08 = C51968G9o.A08(A0B, A0Q, i3);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num2 = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(r1, (2V5) null, text, A1Z);
        C51973G9u.A17(A0Q, A0b, A08, A0G);
        A0b.A0R(A1Z);
        G9w.A12(typeface, A0Q, A0b, A0D);
        A0b.A0W(num2);
        A0b.A0C();
        A0b.A0X(num2);
        C51970G9q.A1I(A0b, 1.25f, A1Z);
        A0b.A0E();
        A0b.A0b(true);
        G9t.A1N(A0b, A1Z);
        C51967G9n.A1G(A0Q, A0b);
        return C243563Zg.A0B(A0Q, r15, A10);
    }
}
