package X;

import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: X.ApB  reason: case insensitive filesystem */
public final class C41151ApB implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ AnonymousClass8ME A02;

    public C41151ApB(Bitmap bitmap, Uri uri, AnonymousClass8ME r3) {
        this.A00 = bitmap;
        this.A01 = uri;
        this.A02 = r3;
    }

    public final void run() {
        Bitmap bitmap = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (bitmap != null) {
            A1A.append("keyboard_content__");
            String A0i = AnonymousClass7TF.A0i(this.A01, A1A);
            C317876nz r0 = C317876nz.A0a;
            C317876nz A04 = C317886o0.A04(bitmap, C318046oG.KEYBOARD_CONTENT_STICKER, "keyboard_content_id", A0i, 0.6f);
            AnonymousClass8ME r2 = this.A02;
            r2.Dn1(C347017w8.A01(r2.A0f, r2.A0r, A04), A04, (Long) null);
            return;
        }
        A1A.append("failed to import image ");
        0kD.A0E("StickerOverlayController", AnonymousClass7TF.A0i(this.A01, A1A), (Throwable) null);
        C59689JTv.A0A(this.A02.A0f, "failed_to_import_image");
    }
}
