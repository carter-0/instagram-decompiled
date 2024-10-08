package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.Lza  reason: case insensitive filesystem */
public final class C65782Lza implements AnonymousClass7Q6 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ LN9 A02;

    public C65782Lza(Context context, View view, LN9 ln9) {
        this.A00 = context;
        this.A02 = ln9;
        this.A01 = view;
    }

    public final void DBs(Drawable drawable, View view, C317486nL r8) {
        if (r8 != null) {
            Context context = this.A00;
            LN9 ln9 = this.A02;
            View view2 = this.A01;
            C317456nI r2 = new C317456nI(r8);
            1QU r0 = LN9.A0C;
            C369898vV A0K = JTU.A0K(context, r8);
            C314236hs r02 = ln9.A01;
            if (r02 != null) {
                r02.Cw2(A0K, view2, r2);
            }
        }
    }
}
