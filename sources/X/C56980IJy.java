package X;

import android.content.Context;
import android.view.LayoutInflater;
import com.instagram.android.R;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.IJy  reason: case insensitive filesystem */
public final class C56980IJy implements AnonymousClass2WT {
    public static final C56980IJy A00 = new C56980IJy();

    public final /* bridge */ /* synthetic */ Object AB5(Context context) {
        0qQ.A0B(context, 0);
        RoundedCornerFrameLayout roundedCornerFrameLayout = new RoundedCornerFrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.clips_viewer_multi_media_card_gradient, roundedCornerFrameLayout, true);
        return roundedCornerFrameLayout;
    }
}
