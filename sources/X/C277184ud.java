package X;

import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.instagram.android.R;

/* renamed from: X.4ud  reason: invalid class name and case insensitive filesystem */
public final class C277184ud extends C251343mx {
    public final C247113fn A00;
    public final AnonymousClass3W1 A01;
    public final boolean A02;
    public final int A03;
    public final AnonymousClass3ZH A04;
    public final Integer A05;
    public final Integer A06;

    public C277184ud(C247113fn r2, AnonymousClass3ZH r3, AnonymousClass3W1 r4, Integer num, Integer num2, int i, boolean z) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 2);
        this.A04 = r3;
        this.A01 = r4;
        this.A00 = r2;
        this.A03 = i;
        this.A02 = z;
        this.A05 = num;
        this.A06 = num2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r23) {
        AnonymousClass3Y5 r3 = r23;
        0qQ.A0B(r3, 0);
        Object[] objArr = {this.A04.A00.getId()};
        AnonymousClass3W1 r6 = this.A01;
        2V5 A002 = C243753a2.A00(r3, r6, C277214ug.A00, 4, true);
        Object A003 = AnonymousClass3Zw.A00(r3, new C377479Lz(45, r3, this), new Object[0]);
        C243773a4.A00(r3, new C377479Lz(44, A003, this), new Object[]{new Object()});
        int i = r6.A09;
        int i2 = this.A03;
        Integer num = this.A05;
        Integer num2 = this.A06;
        DisplayMetrics displayMetrics = r3.Aqq().A0C.getResources().getDisplayMetrics();
        RectF rectF = 0nA.A01;
        AnonymousClass3XV r2 = 2WX.A02;
        2WX r22 = new 2WX(new 2WX((2WX) null, new AnonymousClass9JR(AnonymousClass05K.A04, 0, ((long) ((int) TypedValue.applyDimension(1, 20.0f, displayMetrics))) | 9221401712017801216L)), new AnonymousClass9JS(AnonymousClass05K.A0D, Integer.valueOf(R.id.carousel_page_indicator), 4));
        Integer num3 = AnonymousClass05K.A0N;
        int i3 = i;
        Integer num4 = num2;
        Integer num5 = num;
        C277194ue r17 = (C277194ue) AnonymousClass3Zw.A00(r3, new AnonymousClass9LP(this, 13), objArr);
        return new AnonymousClass4KG(A002, new 2WX(new 2WX(r22, new AnonymousClass9JS(num3, true, 4)), new AnonymousClass9JR(num3, 0, C244013aV.A0C(r3, R.dimen.abc_list_item_height_large_material))), r17, num5, num4, i3, i2);
    }
}
