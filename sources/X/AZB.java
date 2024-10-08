package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.io.File;

public final class AZB implements MTS, B1T {
    public final AnonymousClass889 A00;
    public final Context A01;
    public final ImageInfo A02;

    public final void ALX(C369948va r8) {
        Context context = this.A01;
        ExtendedImageUrl A012 = 1iI.A01(context, this.A02);
        0qQ.A0C(A012, "null cannot be cast to non-null type com.instagram.model.mediasize.ExtendedImageUrl");
        LTL.A04(context, A012, this, 2RR.A02(context, false), context.getColor(R.color.badge_color), false);
    }

    public final void onFailure(Exception exc) {
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        0qQ.A0B(file, 0);
        this.A00.A01(C282665Eg.A03(file, 1, 0));
    }

    public AZB(Context context, AnonymousClass889 r2, ImageInfo imageInfo) {
        AnonymousClass7TG.A1P(context, r2);
        this.A01 = context;
        this.A02 = imageInfo;
        this.A00 = r2;
    }
}
