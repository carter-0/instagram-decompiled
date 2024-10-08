package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.F1u  reason: case insensitive filesystem */
public final class C49684F1u {
    public final Map A00 = AnonymousClass7TE.A1H();

    public final C51892G6h A00(Context context, C49719F3f f3f, Object obj) {
        C51892G6h g6h;
        Object remove = this.A00.remove(new C49717F3d(f3f.A00, obj));
        if (!(remove instanceof C51892G6h) || (g6h = (C51892G6h) remove) == null) {
            return (C51892G6h) f3f.A01.invoke(new C49436Evc(DbT.A05(context)), obj);
        }
        return g6h;
    }
}
