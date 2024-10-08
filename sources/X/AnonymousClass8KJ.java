package X;

import android.graphics.Rect;
import java.util.List;

/* renamed from: X.8KJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8KJ implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8K4 A00;

    public /* synthetic */ AnonymousClass8KJ(AnonymousClass8K4 r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        Rect A002;
        AnonymousClass84L r0;
        Rect A003;
        List A1P;
        AnonymousClass8K4 r5 = this.A00;
        C352218Cl A03 = r5.A0I.A02.A01.A03();
        if (A03 != null && A03.A0z && AnonymousClass8K4.A0D(r5)) {
            if (obj == C351968Bd.SMART_CROP_FILL_FROM_FIT || obj == C351968Bd.SMART_CROP_FILL_FROM_FREE_TRANSFORM) {
                C354168Kx r02 = r5.A0Q;
                String A06 = A03.A06();
                if (A06 == null || (r0 = r02.A01) == null || (A003 = r0.A00(A06)) == null) {
                    A002 = JW0.A00(AnonymousClass514.NINE_BY_SIXTEEN.A00, A03.A09, A03.A06, A03.A07, false);
                } else {
                    A002 = JW0.A03(A003, AnonymousClass514.NINE_BY_SIXTEEN.A00, A03.A09, A03.A06, A03.A07);
                    int i = A002.left;
                    if (i == 0 && A002.top == 0 && A002.right == 0 && A002.bottom == 0) {
                        A1P = null;
                    } else {
                        A1P = 0sr.A1P(new Long[]{Long.valueOf((long) i), Long.valueOf((long) A002.top), Long.valueOf((long) A002.right), Long.valueOf((long) A002.bottom)});
                    }
                    A03.A0r = A1P;
                }
                r5.A0M.A07(A002);
            } else if (obj == C351968Bd.SMART_CROP_FIT || obj == C351968Bd.SMART_CROP_FREE_TRANSFORM || obj == C351968Bd.SMART_CROP_FREE_TRANSFORM_CACHED) {
                r5.A0M.A07((Rect) null);
            }
        }
    }
}
