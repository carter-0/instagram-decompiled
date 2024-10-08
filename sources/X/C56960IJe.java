package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.instagram.android.R;

/* renamed from: X.IJe  reason: case insensitive filesystem */
public final class C56960IJe implements AnonymousClass2WT {
    public static final C56960IJe A00 = new C56960IJe();

    public final /* bridge */ /* synthetic */ Object AB5(Context context) {
        0qQ.A0B(context, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.video_scrubber_layout, frameLayout, true);
        return frameLayout;
    }
}
