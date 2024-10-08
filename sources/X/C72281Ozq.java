package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Ozq  reason: case insensitive filesystem */
public final class C72281Ozq implements MS1 {
    public final /* synthetic */ C314226hr A00;

    public final void DBu(View view, String str, String str2) {
        C314226hr r0 = this.A00;
        AnonymousClass6ZN r1 = r0.A0O;
        Context context = r0.A0A;
        0qQ.A07(context);
        C255773uh r5 = r0.A00;
        if (r5 != null) {
            r1.A01(context, view, r0.A0D, r5, str, str2, true);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C72281Ozq(C314226hr r1) {
        this.A00 = r1;
    }
}
