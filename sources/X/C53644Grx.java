package X;

import com.instagram.android.R;

/* renamed from: X.Grx  reason: case insensitive filesystem */
public final class C53644Grx extends C251343mx {
    public final C336617eu A00;
    public final C52971GgO A01;

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        String str;
        int i;
        0qQ.A0B(r13, 0);
        C336617eu r6 = this.A00;
        int intValue = r6.A02.intValue();
        if (intValue == 1) {
            i = 2131963387;
        } else if (intValue == 0 || intValue == 2) {
            int intValue2 = r6.A04.intValue();
            if (intValue2 == 0) {
                2V1 r5 = r13.A05;
                0qQ.A0B(r5, 0);
                int intValue3 = r6.A03.intValue();
                int i2 = r6.A00;
                if (intValue3 != 0) {
                    str = HX2.A00(r5, r6, i2, R.plurals.view_x_previous_replies, 2131976645);
                } else {
                    str = HX2.A00(r5, r6, i2, R.plurals.view_x_more_replies, 2131976645);
                }
                AnonymousClass3XV r0 = 2WX.A02;
                long doubleToRawLongBits = Double.doubleToRawLongBits(54.0d);
                long A0I = C51970G9q.A0I();
                long A0D = C51969G9p.A0D();
                long A0B = C51969G9p.A0B();
                2WX A0G = C51974G9v.A0G((2WX) null, C51965G9l.A0c(AnonymousClass05K.A0u, 0, doubleToRawLongBits), 0, A0D);
                Integer num = AnonymousClass05K.A1F;
                2WX A0Y = C51971G9r.A0Y(C51974G9v.A0E(A0G, C51965G9l.A0c(num, 0, A0I), 0, A0B), num, new J6O(this, 38), 4);
                2Wb A0Q = C51972G9s.A0Q(r13);
                2WX A0T = C51972G9s.A0T((2WX) null, 0, Double.doubleToRawLongBits(1.0d));
                long doubleToRawLongBits2 = Double.doubleToRawLongBits(33.0d);
                Integer num2 = AnonymousClass05K.A00;
                2WX A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0T, num2, 0, doubleToRawLongBits2), AnonymousClass05K.A09, 0, Double.doubleToRawLongBits(9.0d));
                2V1 Aqq = A0Q.Aqq();
                C51967G9n.A1E(AnonymousClass7TG.A0S(Aqq), A0Q, C51971G9r.A0Y(A002, num2, C51965G9l.A0Y(C51968G9o.A08(Aqq.A0C, A0Q, R.attr.igds_color_separator)), 4));
                return C51967G9n.A0P(new C53629Gri(str), A0Q, r13, A0Y);
            } else if (intValue2 == 1) {
                i = 2131965495;
            } else {
                throw AnonymousClass7TE.A1K();
            }
        } else {
            throw AnonymousClass7TE.A1K();
        }
        str = C244013aV.A0E(r13, i);
        AnonymousClass3XV r02 = 2WX.A02;
        long doubleToRawLongBits3 = Double.doubleToRawLongBits(54.0d);
        long A0I2 = C51970G9q.A0I();
        long A0D2 = C51969G9p.A0D();
        long A0B2 = C51969G9p.A0B();
        2WX A0G2 = C51974G9v.A0G((2WX) null, C51965G9l.A0c(AnonymousClass05K.A0u, 0, doubleToRawLongBits3), 0, A0D2);
        Integer num3 = AnonymousClass05K.A1F;
        2WX A0Y2 = C51971G9r.A0Y(C51974G9v.A0E(A0G2, C51965G9l.A0c(num3, 0, A0I2), 0, A0B2), num3, new J6O(this, 38), 4);
        2Wb A0Q2 = C51972G9s.A0Q(r13);
        2WX A0T2 = C51972G9s.A0T((2WX) null, 0, Double.doubleToRawLongBits(1.0d));
        long doubleToRawLongBits22 = Double.doubleToRawLongBits(33.0d);
        Integer num22 = AnonymousClass05K.A00;
        2WX A0022 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0T2, num22, 0, doubleToRawLongBits22), AnonymousClass05K.A09, 0, Double.doubleToRawLongBits(9.0d));
        2V1 Aqq2 = A0Q2.Aqq();
        C51967G9n.A1E(AnonymousClass7TG.A0S(Aqq2), A0Q2, C51971G9r.A0Y(A0022, num22, C51965G9l.A0Y(C51968G9o.A08(Aqq2.A0C, A0Q2, R.attr.igds_color_separator)), 4));
        return C51967G9n.A0P(new C53629Gri(str), A0Q2, r13, A0Y2);
    }

    public C53644Grx(C336617eu r1, C52971GgO ggO) {
        AnonymousClass7TG.A1O(r1, ggO);
        this.A00 = r1;
        this.A01 = ggO;
    }
}
