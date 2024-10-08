package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

public final class Q6G extends ContextWrapper {
    public final /* synthetic */ C12465Sux A00;
    public final /* synthetic */ 0rm A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q6G(C12465Sux sux, 0rm r3) {
        super((Context) r3.A00);
        this.A01 = r3;
        this.A00 = sux;
    }

    public final Resources getResources() {
        Context context = (Context) this.A01.A00;
        0qQ.A0B(context, 0);
        Resources resources = context.getResources();
        0qQ.A07(resources);
        return resources;
    }
}
