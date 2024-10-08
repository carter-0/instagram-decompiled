package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;

public final class GZ5 extends C251343mx {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final 2WX A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public final C251263mp A0X(AnonymousClass3Y5 r28) {
        long A0C2;
        AnonymousClass3Y5 r7 = r28;
        0qQ.A0B(r7, 0);
        float AYI = (float) 2dZ.A0t.A03(C51969G9p.A0J(r7)).AYI();
        boolean z = this.A0D;
        int i = this.A08;
        if (z) {
            A0C2 = C51969G9p.A0G((int) (C51969G9p.A02(r7, C244013aV.A0C(r7, i)) + AYI));
        } else {
            A0C2 = C244013aV.A0C(r7, i);
        }
        2WX A002 = 2WX.A02.A00(this.A0A);
        2Wb A0S = AnonymousClass7TG.A0S(r7.A05);
        Integer num = AnonymousClass05K.A08;
        2WX A003 = AnonymousClass9JR.A00((2WX) null, num, 0, A0C2);
        long A032 = C244013aV.A03(A0S);
        Integer num2 = AnonymousClass05K.A04;
        2WX A004 = AnonymousClass9JR.A00(A003, num2, 0, A032);
        String str = this.A0C;
        if (str != null) {
            A004 = C51971G9r.A0Y(A004, AnonymousClass05K.A0N, str, 0);
        }
        Integer num3 = AnonymousClass05K.A01;
        2WX A0Y = C51971G9r.A0Y(A004, num3, false, 4);
        J6P A005 = J6P.A00(this, 46);
        Integer num4 = AnonymousClass05K.A1F;
        2WX A0Y2 = C51971G9r.A0Y(A0Y, num4, A005, 4);
        int i2 = this.A07;
        2V1 r10 = A0S.A00;
        Context context = r10.A0C;
        int A082 = C51968G9o.A08(context, A0S, this.A06);
        long j = this.A09;
        float f = this.A01;
        Typeface create = Typeface.create("sans-serif-medium", 0);
        long A0D2 = C51969G9p.A0D();
        Integer num5 = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(r10, (2V5) null, str, 0);
        C51973G9u.A17(A0S, A0b, A082, j);
        A0b.A0R(0);
        G9w.A12(create, A0S, A0b, A0D2);
        A0b.A0B();
        C51973G9u.A1A(A0b, num5, f, false);
        A0b.A0M(i2);
        C51974G9v.A0z(A0Y2, A0b, false);
        C51967G9n.A1G(A0S, A0b);
        Integer num6 = num2;
        2WX A0W = C51973G9u.A0W(C51973G9u.A0W((2WX) null, A0S, num, this.A05, 0), A0S, num6, this.A03, 0);
        String str2 = this.A0B;
        if (str2 != null) {
            A0W = C51971G9r.A0Y(A0W, AnonymousClass05K.A0N, str2, 0);
        }
        2WX A0Y3 = C51971G9r.A0Y(C51971G9r.A0Y(A0W, num3, false, 4), num4, J6P.A00(this, 47), 4);
        int A083 = C51968G9o.A08(context, A0S, this.A02);
        long A0C3 = C244013aV.A0C(A0S, this.A04);
        float f2 = this.A00;
        Typeface typeface = Typeface.SANS_SERIF;
        C244103ae A0b2 = C51971G9r.A0b(r10, (2V5) null, str2, 0);
        C51973G9u.A17(A0S, A0b2, A083, A0C3);
        A0b2.A0R(0);
        G9w.A12(typeface, A0S, A0b2, A0D2);
        A0b2.A0B();
        C51973G9u.A1A(A0b2, num5, f2, false);
        A0b2.A0M(3);
        C51974G9v.A0z(A0Y3, A0b2, false);
        C51967G9n.A1G(A0S, A0b2);
        return C243563Zg.A03(A0S, r7, A002);
    }

    public /* synthetic */ GZ5(2WX r15, String str, String str2, float f, float f2, int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z) {
        float f3 = f2;
        float f4 = f;
        int i7 = i2;
        int i8 = i;
        int i9 = i4;
        int i10 = i3;
        int i11 = i6;
        int i12 = i5;
        long j2 = j;
        int i13 = (i6 & 16) != 0 ? 2 : 0;
        r15 = (i6 & 64) != 0 ? null : r15;
        i8 = (i11 & 128) != 0 ? R.attr.igds_color_text_on_color : i8;
        i7 = (i11 & 256) != 0 ? R.attr.igds_color_text_on_color : i7;
        i10 = (i11 & 1024) != 0 ? R.dimen.abc_dialog_padding_material : i10;
        i9 = (i11 & C249703kE.FLAG_MOVED) != 0 ? R.dimen.ab_test_media_thumbnail_preview_item_internal_padding : i9;
        i12 = (i11 & 4096) != 0 ? R.dimen.abc_dropdownitem_icon_width : i12;
        j2 = (i11 & 8192) != 0 ? C51972G9s.A0G(20.0f) : j2;
        int i14 = (i11 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? R.dimen.abc_text_size_menu_header_material : 0;
        boolean A1Q = C51966G9m.A1Q(32768 & i6, z);
        f4 = (65536 & i6) != 0 ? 1.09f : f4;
        f3 = (i6 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0 ? 1.28f : f3;
        this.A0C = str;
        this.A0B = str2;
        this.A07 = i13;
        this.A0A = r15;
        this.A06 = i8;
        this.A02 = i7;
        this.A08 = i10;
        this.A05 = i9;
        this.A03 = i12;
        this.A09 = j2;
        this.A04 = i14;
        this.A0D = A1Q;
        this.A01 = f4;
        this.A00 = f3;
    }
}
