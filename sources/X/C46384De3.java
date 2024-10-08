package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.De3  reason: case insensitive filesystem */
public final class C46384De3 implements C322776wO {
    public final /* synthetic */ C322726wJ A00;
    public final /* synthetic */ boolean A01;

    public final void DBx() {
    }

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public C46384De3(C322726wJ r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void DBy() {
        EXF exf;
        AnonymousClass14B A0e = DbT.A0e();
        Context context = this.A00.A00;
        Intent A012 = A0e.A01(context);
        Uri.Builder A07 = DbW.A07("ig://share");
        if (this.A01) {
            exf = EXF.A0L;
        } else {
            exf = EXF.A0M;
        }
        Dba.A0o(context, A012, A07.appendQueryParameter("source", exf.A00));
    }
}
