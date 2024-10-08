package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;

public final class AZL implements C262424Dq {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass825 A01;

    public AZL(Context context, AnonymousClass825 r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void CyE(Bitmap bitmap) {
        File A04 = 0mb.A04(this.A00);
        0qQ.A07(A04);
        if (A04.exists()) {
            1MF.A0M(bitmap, A04);
            AnonymousClass825 r0 = this.A01;
            r0.A00 = A04;
            r0.A05.A01(0, A04.getCanonicalPath(), true);
        }
    }
}
