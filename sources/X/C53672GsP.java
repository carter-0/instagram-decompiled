package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.GsP  reason: case insensitive filesystem */
public final class C53672GsP extends C251343mx {
    public final int A00;
    public final Integer A01;

    public final C251263mp A0X(AnonymousClass3Y5 r23) {
        C52733Gbk gbk;
        AnonymousClass3Y5 r6 = r23;
        C59535JNh A002 = I3I.A00(r6);
        JSK A003 = I41.A00(A002);
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            gbk = C52733Gbk.RECTANGLE;
        } else if (intValue == 1) {
            gbk = C52733Gbk.CIRCLE;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        int A004 = I61.A00(r6, HNO.A0C);
        0eP A1L = AnonymousClass7TE.A1L(HLQ.GlimmerMinOpacity, HLQ.GlimmerMaxOpacity);
        long A02 = I61.A02(r6, AnonymousClass05K.A0Q);
        long A022 = I61.A02(r6, AnonymousClass05K.A0R);
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(A004);
        2Wd A0e = C51965G9l.A0e(A02);
        Object obj = A1L.A00;
        Drawable A005 = C55218He9.A00(r6, new C58227IoV(A002, r6, gbk, A003, this, A1L, A004, A02), new Object[]{A002, A003, gbk, valueOf, valueOf2, A0e, obj, A1L.A01});
        AnonymousClass3XV r3 = 2WX.A02;
        return new C53949Gwt(A005, ImageView.ScaleType.CENTER_CROP, r3.A00(r3).A00(r3).A00(C51972G9s.A0T((2WX) null, 0, A022)).A00(r3), 0, false);
    }

    public C53672GsP(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
    }
}
