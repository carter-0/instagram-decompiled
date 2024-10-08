package X;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.Fvj  reason: case insensitive filesystem */
public final /* synthetic */ class C51537Fvj implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ AVK A01;
    public final /* synthetic */ AnonymousClass351 A02;
    public final /* synthetic */ AnonymousClass3N2 A03;
    public final /* synthetic */ List A04;

    public /* synthetic */ C51537Fvj(Rect rect, AVK avk, AnonymousClass351 r3, AnonymousClass3N2 r4, List list) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = rect;
        this.A01 = avk;
        this.A04 = list;
    }

    public final void run() {
        AnonymousClass351 r5 = this.A02;
        AnonymousClass3N2 r0 = this.A03;
        Rect rect = this.A00;
        AVK avk = this.A01;
        List list = this.A04;
        r0.AeH().getGlobalVisibleRect(rect);
        avk.A01(new RectF(rect), new C49688F1y(r5, list));
    }
}
