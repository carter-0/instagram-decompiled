package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;

public final class IKB implements AnonymousClass2WK {
    public final AnonymousClass90O A00;
    public final CharSequence A01;

    public final 2WL Cfk(2WI r6, long j) {
        0qQ.A0B(r6, 0);
        Context context = r6.A00.A04;
        int A012 = C245063cG.A01(j);
        int A002 = C245063cG.A00(j);
        Pair A013 = C308176Ta.A01(context, this.A00, this.A01, A012, A002);
        0qQ.A0A(A013);
        Rect rect = (Rect) A013.first;
        return new 2WL(A013.second, Math.max(rect.width(), C245073cH.A03(j)), Math.max(rect.height(), C245073cH.A02(j)));
    }

    public IKB(AnonymousClass90O r1, CharSequence charSequence) {
        this.A01 = charSequence;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }
}
