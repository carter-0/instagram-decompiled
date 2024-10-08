package X;

import android.graphics.Rect;
import java.util.List;

/* renamed from: X.LzL  reason: case insensitive filesystem */
public final class C65767LzL implements JOZ {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ K6J A01;

    public C65767LzL(Rect rect, K6J k6j) {
        this.A01 = k6j;
        this.A00 = rect;
    }

    public final void DQB(List list) {
        LEB leb = this.A01.A0A;
        if (leb != null) {
            leb.A00(this.A00, C63113Krh.A00(list));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
