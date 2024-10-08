package X;

import android.graphics.Bitmap;

/* renamed from: X.Apl  reason: case insensitive filesystem */
public final /* synthetic */ class C41187Apl implements Runnable {
    public final /* synthetic */ C226952iF A00;
    public final /* synthetic */ AnonymousClass3LX A01;
    public final /* synthetic */ C355628Qs A02;

    public /* synthetic */ C41187Apl(C226952iF r1, AnonymousClass3LX r2, C355628Qs r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    public final void run() {
        Bitmap bitmap;
        C355628Qs r1 = this.A02;
        C226952iF r0 = this.A00;
        AnonymousClass3LX r4 = this.A01;
        Object C3s = r0.C3s();
        C3s.getClass();
        C349307zv r3 = (C349307zv) C3s;
        C388729oI r2 = (C388729oI) r1.A06.get(r3.A07());
        if (r2 != null && r3.equals(r2.A00) && (bitmap = r4.A01) != null) {
            r2.A0A.setImageBitmap(bitmap);
        }
    }
}
