package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.Gtk  reason: case insensitive filesystem */
public final class C53755Gtk extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final JTB A02;
    public final Map A03;

    public C53755Gtk(C267324bN r2, C52058GDe gDe, JTB jtb, Map map) {
        0qQ.A0B(jtb, 3);
        this.A00 = r2;
        this.A01 = gDe;
        this.A02 = jtb;
        this.A03 = map;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r20) {
        String A31;
        AnonymousClass3Y5 r11 = r20;
        0qQ.A0B(r11, 0);
        1Xj r9 = this.A00.A02;
        if (r9 == null || (A31 = r9.A31()) == null) {
            return null;
        }
        AnonymousClass3XV r0 = 2WX.A02;
        long A0I = C51970G9q.A0I();
        Integer num = AnonymousClass05K.A00;
        2WX A002 = AnonymousClass9JR.A00((2WX) null, num, 0, A0I);
        Integer num2 = AnonymousClass05K.A01;
        2WX A0X = C51971G9r.A0X(AnonymousClass9JR.A00(A002, num2, 0, A0I), AnonymousClass05K.A0C, 0.0f, 1);
        Drawable A0K = C51968G9o.A0K(r11, R.drawable.instagram_reply_pano_outline_24);
        C51973G9u.A0x(A0K, r11, R.color.canvas_bottom_sheet_description_text_color);
        2V1 r6 = r11.A05;
        C247373gE A0P = C51974G9v.A0P(A0K, r6, A0X);
        2WX A0U = C51972G9s.A0U(C51972G9s.A0S((2WX) null, 0, C51970G9q.A0D()), num2, 0);
        long A04 = C244013aV.A04(r11);
        Typeface create = Typeface.create("sans-serif", 0);
        int A042 = C51975G9x.A04(r11);
        String A0F = C244013aV.A0F(r11, A31, 2131956147);
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r6, (2V5) null, A0F, 0);
        C51973G9u.A16(r11, A0b, A042, A04);
        A0b.A0R(0);
        G9w.A11(create, r11, A0b, A0D);
        C51974G9v.A19(A0b, num, false);
        A0b.A0M(1);
        A0b.A0b(false);
        G9t.A1N(A0b, false);
        2WW A0R = C51967G9n.A0R(A0U, A0b);
        return C243563Zg.A0G(C51973G9u.A0J(A0P, A0R, r6), r11, C51971G9r.A0Z(C51973G9u.A0Z(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A1I, 0, A0I), J6R.A00(this, r9, 38)), AnonymousClass05K.A0Y, J6F.A00(this, 10), (String) null));
    }
}
