package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.M2u  reason: case insensitive filesystem */
public final class C65879M2u implements Runnable {
    public final /* synthetic */ C59767JXi A00;

    public C65879M2u(C59767JXi jXi) {
        this.A00 = jXi;
    }

    public final void run() {
        ViewGroup viewGroup = this.A00.A0N;
        Context context = viewGroup.getContext();
        AnonymousClass61R A002 = C303756Aq.A00(context, R.raw.animatedInstruction_MediaUploadReels_06);
        ImageView imageView = new ImageView(context);
        if (A002 != null) {
            A002.EL2(0.0f);
            imageView.setImageDrawable(A002);
            A002.EFJ(2);
            A002.E2p();
            JTT.A12(imageView);
            DbT.A1B(context.getResources(), imageView.getLayoutParams(), R.dimen.ad_tag_max_width);
            imageView.getLayoutParams().width = AnonymousClass7TF.A02(context, R.dimen.ad_tag_max_width);
            viewGroup.addView(imageView);
        }
    }
}
