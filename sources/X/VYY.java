package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

public final class VYY {
    public final Context A00;
    public final IgProgressImageView A01;
    public final MediaFrameLayout A02;
    public final SlideInAndOutIconView A03;

    public VYY(View view) {
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A02 = (MediaFrameLayout) AnonymousClass7TE.A0b(view, R.id.video_container);
        this.A01 = (IgProgressImageView) AnonymousClass7TE.A0b(view, R.id.thumbnail);
        View findViewById = view.findViewById(R.id.audio_icon);
        SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) findViewById;
        slideInAndOutIconView.setIconColor(-1);
        slideInAndOutIconView.setIconScale(0.5f);
        0qQ.A07(findViewById);
        this.A03 = slideInAndOutIconView;
    }
}
