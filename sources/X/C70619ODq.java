package X;

import android.content.Context;
import android.view.ViewStub;

/* renamed from: X.ODq  reason: case insensitive filesystem */
public final class C70619ODq {
    public final C71662eb A00;
    public final ViewStub A01;
    public final AnonymousClass91K A02;

    public C70619ODq(ViewStub viewStub, AnonymousClass91K r5) {
        this.A01 = viewStub;
        this.A02 = r5;
        Context context = viewStub.getContext();
        C69017Nct nct = new C69017Nct();
        nct.A07 = context.getString(2131973700);
        nct.A04 = context.getString(2131973719);
        nct.A05 = context.getString(2131968772);
        this.A00 = new C71662eb(viewStub);
        OSO.A00(viewStub, r5, nct);
    }
}
