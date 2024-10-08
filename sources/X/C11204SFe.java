package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.SFe  reason: case insensitive filesystem */
public final class C11204SFe {
    public static final C13137TMv A07;
    public final String A00;
    public final C13481Tb8 A01;
    public final AnonymousClass9GD A02;
    public final AnonymousClass9GD A03;
    public final SGk A04;
    public final Map A05 = AnonymousClass7TE.A1E();
    public final Map A06 = AnonymousClass7TE.A1E();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        A07 = new C13137TMv(objArr, 1);
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.Rkr] */
    public C11204SFe(Context context, C13481Tb8 tb8, SGk sGk, String str) {
        context.getPackageName();
        SC4.A00(context);
        this.A04 = sGk;
        this.A01 = tb8;
        synchronized (C9997Rkr.class) {
            if (C9997Rkr.A00 == null) {
                C9997Rkr.A00 = new Object();
            }
        }
        this.A00 = str;
        this.A02 = SGn.A00().A01(new TN8(this));
        SGn A002 = SGn.A00();
        sGk.getClass();
        this.A03 = A002.A01(new TN9(sGk));
        C13137TMv tMv = A07;
        if (tMv.containsKey(str)) {
            SU6.A01(context, (String) tMv.get(str), false);
        }
    }
}
