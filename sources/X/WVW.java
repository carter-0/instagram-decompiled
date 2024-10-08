package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.instagram.android.R;

public final class WVW implements C20896X3n {
    public final /* synthetic */ AnonymousClass7EF A00;
    public final /* synthetic */ AnonymousClass7EF A01;
    public final /* synthetic */ C332297Uk A02;

    public WVW(AnonymousClass7EF r1, AnonymousClass7EF r2, C332297Uk r3) {
        this.A02 = r3;
        this.A01 = r1;
        this.A00 = r2;
    }

    public final C20895X3m ALe(Bitmap bitmap) {
        AnonymousClass4DH r1 = this.A02.A03;
        if (!r1.isResumed()) {
            return null;
        }
        Context requireContext = r1.requireContext();
        AnonymousClass7EF r4 = this.A01;
        if (r4 == null) {
            r4 = this.A00;
        }
        0qQ.A0A(r4);
        0qQ.A0B(r4, 2);
        Resources resources = requireContext.getResources();
        return new WVT(requireContext, bitmap, r4, (float) resources.getDimensionPixelSize(R.dimen.reaction_min_gravity), (float) resources.getDimensionPixelSize(R.dimen.reaction_max_gravity), (float) resources.getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height), (float) resources.getDimensionPixelSize(R.dimen.reaction_max_pos_y_delta));
    }
}
