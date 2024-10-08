package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: X.9lG  reason: invalid class name and case insensitive filesystem */
public final class C386849lG extends 0ng {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ AnonymousClass05V A01;
    public final /* synthetic */ AnonymousClass8ME A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386849lG(Uri uri, AnonymousClass05V r5, AnonymousClass8ME r6) {
        super(84, 3, false, false);
        this.A02 = r6;
        this.A00 = uri;
        this.A01 = r5;
    }

    public final void run() {
        AnonymousClass8ME r3 = this.A02;
        Context context = r3.A0f;
        Uri uri = this.A00;
        Bitmap A022 = 1MF.A02(context, uri);
        this.A01.A00.A00.releasePermission();
        11Z.A02(new C41151ApB(A022, uri, r3));
    }
}
