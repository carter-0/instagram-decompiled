package X;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Fv2  reason: case insensitive filesystem */
public final class C51494Fv2 implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ boolean A03;

    public C51494Fv2(Fragment fragment, AnonymousClass0iw r2, ImageUrl imageUrl, boolean z) {
        this.A00 = fragment;
        this.A03 = z;
        this.A02 = imageUrl;
        this.A01 = r2;
    }

    public final void run() {
        Context context = this.A00.getContext();
        if (context != null) {
            boolean z = this.A03;
            ImageUrl imageUrl = this.A02;
            AnonymousClass0iw r2 = this.A01;
            C358248ab A0Y = DbS.A0Y(context);
            A0Y.A09(2131970641);
            int i = 2131970638;
            if (z) {
                i = 2131970639;
            }
            A0Y.A08(i);
            A0Y.A06();
            if (!z) {
                imageUrl = null;
            }
            A0Y.A0h((Bitmap) null, r2, imageUrl);
            DbT.A1V(A0Y);
        }
    }
}
