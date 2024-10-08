package X;

import android.graphics.Rect;
import android.view.View;
import android.widget.Adapter;
import com.instagram.common.session.UserSession;

public final class I4C {
    public long A00;
    public C238133Ar A01;
    public boolean A02;
    public final Rect A03;
    public final Adapter A04;
    public final AnonymousClass0JR A05;
    public final AnonymousClass0iw A06;
    public final 0wc A07;
    public final UserSession A08;
    public final C231292rN A09;
    public final String A0A;
    public final String A0B;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.0JR] */
    public I4C(Adapter adapter, AnonymousClass0iw r4, UserSession userSession, C231292rN r6, String str, String str2) {
        ? obj = new Object();
        Rect A0W = AnonymousClass7TE.A0W();
        this.A08 = userSession;
        this.A06 = r4;
        this.A04 = adapter;
        this.A09 = r6;
        this.A0A = str;
        this.A0B = str2;
        this.A05 = obj;
        this.A03 = A0W;
        this.A07 = AnonymousClass0kN.A01(r4, userSession);
    }

    public static int A00(I4C i4c) {
        int B6L = i4c.A01.B6L();
        int BLQ = i4c.A01.BLQ() - B6L;
        float f = 0.0f;
        int i = B6L;
        for (int i2 = 0; i2 <= BLQ; i2++) {
            View AnC = i4c.A01.AnC(i2);
            if (AnC != null && ((AnC.getTag() instanceof AnonymousClass4EA) || (AnC.getTag() instanceof AnonymousClass3TR))) {
                Rect rect = i4c.A03;
                AnC.getGlobalVisibleRect(rect);
                float height = ((float) rect.height()) / AnonymousClass7TE.A03(AnC);
                if (height > f) {
                    i = i2 + B6L;
                    f = height;
                }
            }
        }
        return i;
    }

    public static int A01(I4C i4c, int i) {
        1Xj A042 = C231122qu.A04(i4c.A04.getItem(i));
        if (A042 != null) {
            return i4c.A09.BQr(A042).getPosition();
        }
        return -1;
    }
}
