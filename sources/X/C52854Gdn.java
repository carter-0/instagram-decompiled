package X;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.instagram.android.R;

/* renamed from: X.Gdn  reason: case insensitive filesystem */
public final class C52854Gdn extends ViewOutlineProvider {
    public final /* synthetic */ Context A00;

    public final void getOutline(View view, Outline outline) {
        AnonymousClass7TF.A1H(view, outline);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00.getResources().getDimension(R.dimen.account_discovery_bottom_gap));
    }

    public C52854Gdn(Context context) {
        this.A00 = context;
    }
}
