package X;

import android.content.DialogInterface;
import com.instagram.api.schemas.ProductReviewStatus;

/* renamed from: X.6Uq  reason: invalid class name and case insensitive filesystem */
public final class C308536Uq implements DialogInterface.OnClickListener {
    public final /* synthetic */ C308516Uo A00;

    public C308536Uq(C308516Uo r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ProductReviewStatus productReviewStatus;
        C308516Uo r5 = this.A00;
        String str = r5.A0D;
        if (str == null || (productReviewStatus = r5.A07) == null || productReviewStatus != ProductReviewStatus.REJECTED) {
            0kR.A0F(r5.A06, 0cp.A03("https://www.facebook.com/business/help/1944109912526524"));
        } else {
            C249713kF.A00.A1F(r5.A06, r5.A08, str, r5.A0E);
        }
    }
}
