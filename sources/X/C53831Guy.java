package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Guy  reason: case insensitive filesystem */
public final class C53831Guy extends C251343mx {
    public final C62320sa A00;
    public final float A01;
    public final int A02;
    public final 2WX A03;
    public final AnonymousClass4DU A04;
    public final String A05;
    public final List A06;
    public final boolean A07;

    public final C251263mp A0X(AnonymousClass3Y5 r21) {
        Drawable mutate;
        double d;
        AnonymousClass3Y5 r19 = r21;
        boolean A1Z = C51966G9m.A1Z(r19);
        AnonymousClass3Y5 r0 = r19;
        2V1 r3 = r0.A05;
        long A0H = C51970G9q.A0H();
        C52790Gch gch = new C52790Gch(C51965G9l.A0B(r3), (float) C51972G9s.A0B(r0, 30.0d), C51969G9p.A02(r19, A0H));
        Integer num = AnonymousClass05K.A00;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0d(num, gch, 4));
        long doubleToRawLongBits = Double.doubleToRawLongBits(106.0d);
        Integer num2 = AnonymousClass05K.A01;
        2WX A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0X, num2, A1Z ? 1 : 0, doubleToRawLongBits), num, A1Z, doubleToRawLongBits);
        long A0B = C51969G9p.A0B();
        2WX A003 = IIV.A00(C51972G9s.A0V(AnonymousClass9JR.A00(A002, AnonymousClass05K.A06, A1Z, A0B), new J6H(this, 30)), AnonymousClass05K.A0Y, this.A01).A00(this.A03);
        2Wb A0S = AnonymousClass7TG.A0S(r3);
        2V1 r32 = A0S.A00;
        Context context = r32.A0C;
        Drawable drawable = context.getDrawable(R.drawable.instagram_add_pano_filled_24);
        if (!(drawable == null || (mutate = drawable.mutate()) == null)) {
            if (this.A07) {
                d = 28.0d;
            } else {
                d = 24.0d;
            }
            long doubleToRawLongBits2 = Double.doubleToRawLongBits(d);
            AnonymousClass7TE.A1R(mutate, A0S.Bnf().A01(R.attr.igds_color_primary_text));
            C51974G9v.A0h(mutate, r32, A0S, C51974G9v.A0F(AnonymousClass9JR.A00((2WX) null, num2, A1Z, doubleToRawLongBits2), C51965G9l.A0c(num, A1Z, doubleToRawLongBits2), A1Z, A0H));
        }
        String str = this.A05;
        if (str != null && !this.A07) {
            long A0G = C51972G9s.A0G(12.0f);
            int A062 = C51968G9o.A06(context, A0S);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(r32, (2V5) null, str, A1Z);
            C51973G9u.A17(A0S, A0b, A062, A0G);
            A0b.A0R(1);
            G9w.A12(typeface, A0S, A0b, A0D);
            C51974G9v.A17(A0b, num, A1Z);
            A0b.A0M(1);
            A0b.A0b(true);
            G9t.A1N(A0b, A1Z);
            C51967G9n.A1G(A0S, A0b);
        }
        List list = this.A06;
        if (AnonymousClass7TE.A1b(list) && !this.A07) {
            int max = Math.max(A1Z, this.A02 - list.size());
            Context A004 = C243803a8.A00(A0S);
            ArrayList A0p = AnonymousClass7TF.A0p(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0p.add(DbT.A0k(it).Bh3());
            }
            ON3 on3 = new ON3(A004, this.A04.getModuleName(), A0p, DbS.A02(C243803a8.A00(A0S), 20));
            on3.A0B = true;
            on3.A07 = num;
            on3.A01(DbS.A02(C243803a8.A00(A0S), 2));
            on3.A0G = true;
            on3.A02 = max;
            on3.A0E = true;
            on3.A05 = Integer.valueOf(C51968G9o.A06(context, A0S));
            on3.A06 = 10;
            on3.A0C = true;
            on3.A01 = DbS.A02(C243803a8.A00(A0S), 20);
            on3.A04 = Integer.valueOf(A0S.Bnf().A02(R.color.context_line_color));
            C51974G9v.A0h(on3.A00(), r32, A0S, AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A08, A1Z, A0B));
        }
        return C243563Zg.A05(A0S, r19, A003);
    }

    public C53831Guy(2WX r1, AnonymousClass4DU r2, String str, List list, C62320sa r5, float f, int i, boolean z) {
        C51972G9s.A1E(r2, r5);
        this.A07 = z;
        this.A01 = f;
        this.A05 = str;
        this.A06 = list;
        this.A02 = i;
        this.A04 = r2;
        this.A00 = r5;
        this.A03 = r1;
    }
}
