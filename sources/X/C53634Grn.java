package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Grn  reason: case insensitive filesystem */
public final class C53634Grn extends C251343mx {
    public final C60314JjH A00;

    public C53634Grn(C60314JjH jjH) {
        0qQ.A0B(jjH, 1);
        this.A00 = jjH;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r23) {
        AnonymousClass3Y5 r21 = r23;
        boolean A1Z = C51966G9m.A1Z(r21);
        long doubleToRawLongBits = Double.doubleToRawLongBits(56.0d);
        long A0G = C51970G9q.A0G();
        long A0B = C51969G9p.A0B();
        2WX A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A05, A1Z ? 1 : 0, A0B);
        Integer num = AnonymousClass05K.A0u;
        2WX A003 = AnonymousClass9JR.A00(A002, num, A1Z, doubleToRawLongBits);
        Integer num2 = AnonymousClass05K.A1F;
        2WX A10 = G9t.A10(AnonymousClass9JR.A00(A003, num2, A1Z, A0G), num2, new C74193PqZ(this, 25));
        2Wb A0Q = C51972G9s.A0Q(r21);
        Integer num3 = AnonymousClass05K.A00;
        2WX A0y = G9t.A0y((2WX) null, num3, A1Z);
        2Wb A0L = C51973G9u.A0L(A0Q);
        Drawable A0D = C244013aV.A0D(A0L, R.drawable.instagram_eye_off_pano_outline_24);
        2V1 r6 = A0L.A00;
        Context context = r6.A0C;
        A0D.setTint(C51968G9o.A07(context, A0L));
        boolean A1W = C51973G9u.A1W(A0L, C51973G9u.A0X(C51974G9v.A0M((2WX) null, num3, A1Z, C51969G9p.A0F()), num2, 4.0d, A1Z), C51971G9r.A0a(A0D, r6));
        String A0E = C244013aV.A0E(A0L, 2131954254);
        long A0G2 = C51972G9s.A0G(12.0f);
        int A07 = C51968G9o.A07(context, A0L);
        Typeface create = Typeface.create("sans-serif-medium", A1Z);
        Integer num4 = AnonymousClass05K.A0N;
        2WX A004 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num, A1Z, A0B), num2, A1Z, Double.doubleToRawLongBits(18.0d));
        long A0D2 = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r6, (2V5) null, A0E, A1Z);
        C51973G9u.A17(A0L, A0b, A07, A0G2);
        A0b.A0R(A1Z);
        G9w.A12(create, A0L, A0b, A0D2);
        A0b.A0W(num4);
        C51974G9v.A1A(A0b, num3, A1Z, A1W);
        C51971G9r.A1C(C51967G9n.A0R(A004, A0b), A0L, A0Q, A0y);
        return C243563Zg.A03(A0Q, r21, A10);
    }
}
