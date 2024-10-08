package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;

/* renamed from: X.Sux  reason: case insensitive filesystem */
public final class C12465Sux implements C13609Tdb {
    public LayoutInflater A00;
    public final C9829Rhr A01 = AnonymousClass2E0.A09();
    public final Context A02;

    public final Context getContext() {
        return this.A02;
    }

    public C12465Sux(Context context, int i) {
        0rm A11 = C51965G9l.A11();
        A11.A00 = context;
        A11.A00 = new ContextThemeWrapper(context, i);
        Q6G q6g = new Q6G(this, A11);
        this.A02 = q6g;
        this.A00 = LayoutInflater.from(q6g);
    }
}
