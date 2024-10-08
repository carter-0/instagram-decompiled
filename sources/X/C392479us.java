package X;

import android.content.Context;

/* renamed from: X.9us  reason: invalid class name and case insensitive filesystem */
public abstract class C392479us {
    public static final C40161AUb A00(Context context, C13554TcQ tcQ, Integer num, boolean z) {
        C343647qZ r1 = new C343647qZ("SmartCaptureSelfie");
        C343647qZ.A00(r1, B36.A04, z);
        ATD A00 = C343897qz.A00(context, r1);
        A00.A02(new C368708tC());
        C345707tx r6 = new C345707tx(A00);
        C340607lX r5 = r6.A0e;
        if (!r5.isConnected()) {
            r6.A01 = 1920;
            r6.A00 = (int) Math.ceil((double) (1920.0f / (((float) Math.max(1920, 1920)) / ((float) Math.min(1920, 1920)))));
        }
        A00.A01(r6, C345607tn.A00);
        A00.A01(new C380749Zj(A00), C345547th.A00);
        A00.A01(new C345827u9(A00), C344397rn.A00);
        C343717qg r2 = C345697tw.A00;
        A00.A01(new C345687tv(A00), r2);
        A00.A01(new C345617to(A00), C345627tp.A00);
        A00.A01(new C345667tt(A00), C345677tu.A00);
        if (!r6.A0Q && r6.A0P && r5.isConnected()) {
            B17 b17 = r6.A0H;
            if (b17 == null) {
                b17 = new C40167AUh(r6, 0);
                r6.A0H = b17;
            }
            r5.A9a(b17);
        }
        r6.A07 = tcQ;
        if (num != null) {
            r6.A0N = num;
            C382459dj r0 = r6.A0B;
            if (r0 != null) {
                r0.A01 = num;
            }
        }
        ((C345697tw) A00.Ape(r2)).EP5(false);
        return new C40161AUb(A00);
    }
}
