package X;

import android.graphics.Bitmap;
import android.view.Surface;
import com.instagram.common.typedurl.ImageUrl;

public final class KHH extends 2Cl {
    public final /* synthetic */ LSQ A00;

    public final int getRunnableId() {
        return 512475589;
    }

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        LSQ lsq = this.A00;
        lsq.A03();
        lsq.A05 = lsq.A0G;
        0wb.A03("IgLiveImageStreamingController", AnonymousClass7TF.A0m("failed to fetch image while streaming due to exception: ", exc));
    }

    public KHH(LSQ lsq) {
        this.A00 = lsq;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Bitmap A0H;
        LSQ lsq = this.A00;
        ImageUrl imageUrl = lsq.A09;
        if (imageUrl != null && (A0H = 1NK.A00().A0H(imageUrl, "IgLiveImageStreamingController")) != null) {
            return A0H;
        }
        lsq.A03();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Fetched image bitmap is null with image url: ");
        A1A.append(lsq.A09);
        A1A.append(" and bitmap returned from cache is null: ");
        A1A.append(true);
        0wb.A03("IgLiveImageStreamingController", A1A.toString());
        return lsq.A0G;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Surface surface;
        Bitmap bitmap = (Bitmap) obj;
        0qQ.A0B(bitmap, 0);
        LSQ lsq = this.A00;
        if (0qQ.A0K(lsq.A05, lsq.A0G) && (surface = lsq.A07) != null) {
            lsq.A06 = surface;
        }
        lsq.A05 = bitmap;
    }

    public final void onFinish() {
        KHH.super.onFinish();
        this.A00.A0D = false;
    }

    public final void onStart() {
        KHH.super.onStart();
        this.A00.A0D = true;
    }
}
