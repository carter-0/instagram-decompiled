package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.SFp  reason: case insensitive filesystem */
public final class C11215SFp {
    public static C8518QwE A0A;
    public static final C13138TMw A0B;
    public final int A00;
    public final C13644TeB A01;
    public final AnonymousClass9GD A02;
    public final AnonymousClass9GD A03;
    public final SGk A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Map A08 = AnonymousClass7TE.A1E();
    public final Map A09 = AnonymousClass7TE.A1E();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        A0B = new C13138TMw(objArr, 1);
    }

    public C11215SFp(Context context, C13644TeB teB, SGk sGk, String str) {
        int i;
        this.A05 = context.getPackageName();
        this.A06 = SC4.A00(context);
        this.A04 = sGk;
        this.A01 = teB;
        C11143SBy.A00();
        this.A07 = str;
        this.A02 = SGn.A00().A01(new TNB(this));
        SGn A002 = SGn.A00();
        sGk.getClass();
        this.A03 = A002.A01(new TNA(sGk));
        C13138TMw tMw = A0B;
        if (tMw.containsKey(str)) {
            i = SU6.A01(context, (String) tMw.get(str), false);
        } else {
            i = -1;
        }
        this.A00 = i;
    }
}
