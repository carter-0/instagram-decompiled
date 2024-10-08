package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

public final class Q6J extends ContextWrapper {
    public final Context A00;
    public final C9829Rhr A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q6J(Context context, C9829Rhr rhr) {
        super(context);
        0qQ.A0B(rhr, 2);
        this.A00 = context;
        this.A01 = rhr;
    }

    public final Resources getResources() {
        Context context = this.A00;
        0qQ.A0B(context, 0);
        Resources resources = context.getResources();
        0qQ.A07(resources);
        return resources;
    }

    public static Q6J A00(Context context) {
        C9829Rhr A09 = AnonymousClass2E0.A09();
        0qQ.A0A(A09);
        return new Q6J(context, A09);
    }
}
