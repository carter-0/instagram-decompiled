package X;

import android.graphics.Rect;
import java.util.List;

/* renamed from: X.FvR  reason: case insensitive filesystem */
public final class C51519FvR implements Runnable {
    public final /* synthetic */ AVK A00;
    public final /* synthetic */ AnonymousClass351 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public C51519FvR(AVK avk, AnonymousClass351 r2, String str, List list) {
        this.A01 = r2;
        this.A00 = avk;
        this.A02 = str;
        this.A03 = list;
    }

    public final void run() {
        AnonymousClass351 r5 = this.A01;
        AVK avk = this.A00;
        String str = this.A02;
        List list = this.A03;
        if (avk != null) {
            r5.A04.A0D(false);
            if (AnonymousClass351.A01(r5, list) != null) {
                avk.A03(false, str);
                Rect rect = new Rect();
                AnonymousClass3N2 A012 = AnonymousClass351.A01(r5, list);
                if (A012 != null) {
                    C226112fe.A0B.A05(r5.A01, new C51537Fvj(rect, avk, r5, A012, list));
                    return;
                }
            }
            avk.A02(str);
            AnonymousClass351.A02(r5, list);
        }
    }
}
