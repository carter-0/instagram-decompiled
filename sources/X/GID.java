package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.instagram.android.R;

public final class GID implements AnonymousClass2WT {
    public static final GID A00 = new GID();

    public final /* bridge */ /* synthetic */ Object AB5(Context context) {
        0qQ.A0B(context, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.layout_clips_viewer_interactive_items, frameLayout, true);
        frameLayout.findViewById(R.id.interactive_sticker_container).setTag(new GIE(frameLayout));
        return frameLayout;
    }
}
