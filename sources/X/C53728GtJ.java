package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.GtJ  reason: case insensitive filesystem */
public final class C53728GtJ extends C251343mx {
    public final C61072JwA A00;
    public final AnonymousClass0iw A01;
    public final boolean A02;
    public final boolean A03;

    public C53728GtJ(C61072JwA jwA, AnonymousClass0iw r3, boolean z, boolean z2) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = jwA;
        this.A02 = z;
        this.A03 = z2;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.2T3, java.lang.Object] */
    public final C251263mp A0X(AnonymousClass3Y5 r39) {
        2WW r24;
        float f;
        long j;
        2WX r5;
        int i;
        AnonymousClass3Y5 r7 = r39;
        0qQ.A0B(r7, 0);
        Context A002 = C243803a8.A00(r7);
        String A0R = 002.A0R(this.A01.getModuleName(), "NotesMinimizedComponent");
        C61072JwA jwA = this.A00;
        Integer num = AnonymousClass05K.A00;
        Integer num2 = num;
        C244323b0 A05 = C244283aw.A05(A002, (Float) null, num2, 3, (Integer) null, A0R, (List) jwA.A02, (int) 0nA.A00(C243803a8.A00(r7), 16.0f), true);
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num3 = AnonymousClass05K.A01;
        GH5 gh5 = new GH5(A05, (ImageView.ScaleType) null, AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, ((long) A05.getIntrinsicWidth()) | 9221401712017801216L), num3, 0, ((long) A05.getIntrinsicHeight()) | 9221401712017801216L), false);
        int i2 = jwA.A01;
        if (i2 > 0) {
            2WX A003 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A1F, 0, C51970G9q.A0J());
            String A0F = C244013aV.A0F(r7, Integer.valueOf(i2), 2131956654);
            if (!this.A02 || !this.A03) {
                i = R.color.design_dark_default_color_on_background;
            } else {
                i = 2Yu.A07(C243803a8.A00(r7));
            }
            int A08 = C51969G9p.A08(r7, i);
            long A0G = C51972G9s.A0G(12.0f);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(r7.A05, (2V5) null, A0F, 0);
            C51973G9u.A16(r7, A0b, A08, A0G);
            A0b.A0R(1);
            G9w.A11(typeface, r7, A0b, A0D);
            Integer num4 = num;
            A0b.A0W(num4);
            C51974G9v.A1A(A0b, num4, false, true);
            r24 = C51967G9n.A0R(A003, A0b);
        } else {
            r24 = null;
        }
        ? obj = new Object();
        if (r24 != null) {
            r24.A0L(r7.A05, obj, 0, 0);
        }
        boolean z = this.A02;
        float f2 = 4.0f;
        float f3 = 8.0f;
        if (z) {
            f = 8.0f;
            if (obj.A01 > 0) {
                f = 9.0f;
            }
            f2 = 8.0f;
        } else {
            f = 4.0f;
        }
        long A06 = C51965G9l.A06(f2 / 2.0f);
        if (!z) {
            f3 = 2.0f;
        }
        long A062 = C51965G9l.A06(f3);
        long intrinsicWidth = ((long) (A05.getIntrinsicWidth() + obj.A01)) | 9221401712017801216L;
        long max = ((long) Math.max(A05.getIntrinsicHeight(), obj.A00)) | 9221401712017801216L;
        long A022 = ((long) ((int) (C51969G9p.A02(r7, intrinsicWidth) + 0nA.A00(C243803a8.A00(r7), f)))) | 9221401712017801216L;
        long A023 = ((long) ((int) (C51969G9p.A02(r7, max) + 0nA.A00(C243803a8.A00(r7), f2)))) | 9221401712017801216L;
        2WX A004 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num, 0, A022), num3, 0, A023);
        if (z) {
            j = Double.doubleToRawLongBits(38.0d);
        } else {
            j = A023;
        }
        Integer num5 = AnonymousClass05K.A0Y;
        2WX A0S = C51972G9s.A0S(AnonymousClass9JR.A00(A004, num5, 0, j), 0, C51969G9p.A0F());
        if (z) {
            Context A005 = C243803a8.A00(r7);
            int A082 = C51969G9p.A08(r7, R.color.cds_white_a20);
            Context context = r7.A05.A0C;
            boolean z2 = this.A03;
            int i3 = R.attr.igds_color_secondary_button_on_media_panavision_updated;
            if (z2) {
                i3 = R.attr.igds_color_elevated_background;
            }
            r5 = G9t.A10((2WX) null, num, new C59704JUm(A005, C51972G9s.A0A(context, r7, i3), A082, 3442, z2, true, false, false));
        } else {
            r5 = null;
        }
        2WX A006 = A0S.A00(r5);
        2Wb A0Q = C51972G9s.A0Q(r7);
        if (!z) {
            A0Q.A00(new C53889Gvu(A022, A023, false));
        }
        return C51967G9n.A0Q(C243563Zg.A0B(C51973G9u.A0J(gh5, r24, A0Q.A00), A0Q, AnonymousClass9JR.A00(AnonymousClass9JR.A00(G9t.A0z(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num, 0, intrinsicWidth), num3, 0, max), num5, C244413b9.ABSOLUTE), AnonymousClass05K.A0C, 1, A06), AnonymousClass05K.A0N, 1, A062)), A0Q, r7, A006);
    }
}
