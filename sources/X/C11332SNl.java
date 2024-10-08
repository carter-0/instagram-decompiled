package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.SNl  reason: case insensitive filesystem */
public final class C11332SNl {
    public static C8535QwZ A0A;
    public static final C13139TMx A0B;
    public final int A00;
    public final C13646TeD A01;
    public final AnonymousClass9GD A02;
    public final SGk A03;
    public final String A04;
    public final String A05;
    public final Map A06 = AnonymousClass7TE.A1E();
    public final Map A07 = AnonymousClass7TE.A1E();
    public final AnonymousClass9GD A08;
    public final String A09;

    public static final String A00(C11332SNl sNl) {
        AnonymousClass9GD r1 = sNl.A08;
        if (r1.A0E()) {
            return (String) r1.A06();
        }
        return SGm.A01.A00(sNl.A09);
    }

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        A0B = new C13139TMx(objArr, 1);
    }

    public C11332SNl(Context context, C13646TeD teD, SGk sGk, String str) {
        int i;
        this.A04 = context.getPackageName();
        this.A05 = SC4.A00(context);
        this.A03 = sGk;
        this.A01 = teD;
        this.A09 = str;
        this.A08 = SGn.A00().A01(new TND(str));
        SGn A002 = SGn.A00();
        sGk.getClass();
        this.A02 = A002.A01(new TNC(sGk));
        C13139TMx tMx = A0B;
        if (tMx.containsKey(str)) {
            i = SU6.A01(context, (String) tMx.get(str), false);
        } else {
            i = -1;
        }
        this.A00 = i;
    }
}
