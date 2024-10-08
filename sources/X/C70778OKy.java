package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.OKy  reason: case insensitive filesystem */
public final class C70778OKy {
    public final AnonymousClass5HJ A00;
    public final AnonymousClass0eM A01 = C58685Ivu.A00(this, 5);
    public final Context A02;

    public final String A00() {
        return ((Uri) this.A01.getValue()).getQueryParameter("group_details");
    }

    public C70778OKy(Context context, AnonymousClass5HJ r3) {
        this.A02 = context;
        this.A00 = r3;
    }
}
