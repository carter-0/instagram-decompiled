package X;

import android.content.Context;
import android.graphics.Rect;

public final class LE7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final Rect A04 = AnonymousClass7TE.A0W();
    public final C363198jK[] A05;
    public final C363228jN[] A06;
    public final 2cp A07;

    public LE7(Context context) {
        0qQ.A0B(context, 1);
        2cp A002 = C61340me.A00();
        this.A07 = A002;
        C363198jK r5 = new C363198jK(context, A002, AnonymousClass05K.A0Y);
        C363198jK r4 = new C363198jK(context, A002, AnonymousClass05K.A0j);
        Integer num = AnonymousClass05K.A0C;
        C363198jK r2 = new C363198jK(context, A002, num);
        Integer num2 = AnonymousClass05K.A0N;
        this.A05 = new C363198jK[]{r5, r4, r2, new C363198jK(context, A002, num2)};
        this.A06 = new C363228jN[]{new C363228jN(context, num), new C363228jN(context, num2), new C363228jN(context, AnonymousClass05K.A00), new C363228jN(context, AnonymousClass05K.A01)};
    }

    public final boolean A00(Rect rect) {
        C363228jN[] r3 = this.A06;
        r3[0].A00 = AnonymousClass7TF.A1T(rect.left, this.A01);
        r3[1].A00 = C51970G9q.A1W(rect.right, this.A02);
        r3[2].A00 = AnonymousClass7TF.A1T(rect.top, this.A03);
        r3[3].A00 = C51970G9q.A1W(rect.bottom, this.A00);
        int i = 0;
        while (!r3[i].A00) {
            i++;
            if (i >= 4) {
                return false;
            }
        }
        return true;
    }
}
