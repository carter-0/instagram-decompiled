package X;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: X.5Pp  reason: invalid class name and case insensitive filesystem */
public final class C285085Pp extends ContentObserver {
    public final /* synthetic */ C249513ju A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C285085Pp(Handler handler, C249513ju r2) {
        super(handler);
        this.A00 = r2;
    }

    public final void onChange(boolean z, Uri uri) {
        this.A00.FIG(C60340gF.A00);
    }
}
