package X;

import android.content.Context;
import android.provider.MediaStore;

/* renamed from: X.8Xi  reason: invalid class name and case insensitive filesystem */
public final class C357298Xi extends 0ng {
    public final /* synthetic */ AnonymousClass8XZ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C357298Xi(AnonymousClass8XZ r4) {
        super(519843181, 2, false, false);
        this.A00 = r4;
    }

    public final void run() {
        AnonymousClass8XZ r5 = this.A00;
        AnonymousClass8XZ.A00(r5);
        Context context = r5.A06;
        context.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, false, r5.A07);
        context.getContentResolver().registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, false, r5.A08);
        r5.A05 = true;
    }
}
