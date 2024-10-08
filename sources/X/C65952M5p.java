package X;

import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.M5p  reason: case insensitive filesystem */
public final /* synthetic */ class C65952M5p implements Runnable {
    public final /* synthetic */ KIe A00;
    public final /* synthetic */ ImageUrl A01;

    public /* synthetic */ C65952M5p(KIe kIe, ImageUrl imageUrl) {
        this.A00 = kIe;
        this.A01 = imageUrl;
    }

    public final void run() {
        KIe kIe = this.A00;
        ImageUrl imageUrl = this.A01;
        if (imageUrl != null) {
            InlineAddHighlightFragment.A03(kIe.A01, imageUrl);
        }
    }
}
