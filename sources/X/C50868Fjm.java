package X;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.Fjm  reason: case insensitive filesystem */
public final class C50868Fjm implements G6H {
    public final Dialog A00;
    public final Context A01;
    public final C358248ab A02;

    public final void CI0(Uri uri, Bundle bundle) {
        AnonymousClass0fN.A00(this.A00);
    }

    public C50868Fjm(Context context) {
        this.A01 = context;
        C358248ab A0Y = DbS.A0Y(context);
        this.A02 = A0Y;
        DbT.A19(context, A0Y, 2131960674);
        DbU.A17(context, A0Y, 2131960673);
        A0Y.A0c(new C49969FHc(11), AnonymousClass7TE.A16(context, 2131960672));
        this.A00 = A0Y.A02();
    }
}
