package X;

import android.view.View;

/* renamed from: X.346  reason: invalid class name */
public final class AnonymousClass346 implements AnonymousClass345 {
    public final /* synthetic */ AnonymousClass343 A00;

    public AnonymousClass346(AnonymousClass343 r1) {
        this.A00 = r1;
    }

    public final void FNA(String str, Object obj, int i) {
        this.A00.A01.put(str, obj);
    }

    public final void FNB(String str, Object obj, int i) {
        this.A00.A02.put(str, obj);
    }

    public final void FNC(View view, Object obj, String str, double d) {
        C2355130d A002 = AnonymousClass343.A00(this.A00, obj);
        if (A002 != null) {
            A002.Cs3(view, obj, d);
        }
    }
}
