package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import com.instagram.tagging.widget.MediaTagHintsLayout;
import com.instagram.tagging.widget.TagsLayout;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.3s3  reason: invalid class name and case insensitive filesystem */
public final class C254173s3 implements AnonymousClass3V3 {
    public AnonymousClass3W1 A00;
    public final View A01;
    public final SimpleZoomableViewContainer A02;
    public final C256053v9 A03;
    public final IgProgressImageView A04;
    public final IgShowreelCompositionView A05;
    public final ShowreelNativeMediaView A06;
    public final AnonymousClass3VF A07;
    public final LikeActionView A08;
    public final MediaFrameLayout A09;
    public final AnonymousClass0iw A0A;
    public final UserSession A0B;
    public final AnonymousClass3VC A0C;
    public final AnonymousClass3V9 A0D;
    public final MediaTagHintsLayout A0E;
    public final TagsLayout A0F;
    public final AnonymousClass3TN A0G = new Object();

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.3TN] */
    public C254173s3(View view, AnonymousClass0iw r10, UserSession userSession, SimpleZoomableViewContainer simpleZoomableViewContainer, C256053v9 r13, IgProgressImageView igProgressImageView, IgShowreelCompositionView igShowreelCompositionView, ShowreelNativeMediaView showreelNativeMediaView, MediaTagHintsLayout mediaTagHintsLayout, TagsLayout tagsLayout, LikeActionView likeActionView, MediaFrameLayout mediaFrameLayout) {
        0qQ.A0B(view, 2);
        MediaFrameLayout mediaFrameLayout2 = mediaFrameLayout;
        0qQ.A0B(mediaFrameLayout2, 3);
        0qQ.A0B(igProgressImageView, 4);
        ShowreelNativeMediaView showreelNativeMediaView2 = showreelNativeMediaView;
        0qQ.A0B(showreelNativeMediaView2, 5);
        0qQ.A0B(igShowreelCompositionView, 6);
        LikeActionView likeActionView2 = likeActionView;
        0qQ.A0B(likeActionView2, 7);
        0qQ.A0B(simpleZoomableViewContainer, 8);
        TagsLayout tagsLayout2 = tagsLayout;
        0qQ.A0B(tagsLayout2, 9);
        MediaTagHintsLayout mediaTagHintsLayout2 = mediaTagHintsLayout;
        0qQ.A0B(mediaTagHintsLayout2, 10);
        this.A0B = userSession;
        this.A01 = view;
        this.A09 = mediaFrameLayout2;
        this.A04 = igProgressImageView;
        this.A06 = showreelNativeMediaView2;
        this.A05 = igShowreelCompositionView;
        this.A08 = likeActionView2;
        this.A02 = simpleZoomableViewContainer;
        this.A0F = tagsLayout2;
        this.A0E = mediaTagHintsLayout2;
        this.A03 = r13;
        this.A0A = r10;
        mediaFrameLayout2.setTag(R.id.feed_cta_extra_tappable_target, "showreel_view");
        AnonymousClass3V9 r2 = new AnonymousClass3V9(view, userSession, R.id.row_feed_media_tag_indicator_stub);
        this.A0D = r2;
        AnonymousClass3VC r1 = new AnonymousClass3VC(userSession, mediaTagHintsLayout2);
        this.A0C = r1;
        this.A07 = new AnonymousClass3VF(r1, r2, (AnonymousClass3V9) null, (AnonymousClass3V9) null, new AnonymousClass3VD(tagsLayout2), (AnonymousClass3VE) null);
    }

    public final AnonymousClass3TS Adf() {
        return null;
    }

    public final C256043v8 B5X() {
        return null;
    }

    public final C247233fz BQv() {
        return null;
    }

    public final C258253yi BRL() {
        return null;
    }

    public final int C5s() {
        return 0;
    }

    public final void Epi(AnonymousClass0iw r3, ImageUrl imageUrl, boolean z) {
        IgProgressImageView igProgressImageView;
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(r3, 1);
        AnonymousClass6K2 videoView = this.A05.getVideoView();
        if (videoView != null && (igProgressImageView = videoView.A00) != null) {
            igProgressImageView.A08(r3, (0lg) null, imageUrl, z);
        }
    }

    public final AnonymousClass3TN B5Y() {
        return this.A0G;
    }

    public final /* bridge */ /* synthetic */ View BG1() {
        AnonymousClass6K2 videoView = this.A05.getVideoView();
        if (videoView != null) {
            return videoView.A00;
        }
        return null;
    }

    public final View BQB() {
        return this.A09;
    }

    public final AnonymousClass3W1 BQq() {
        return this.A00;
    }

    public final C242423Ua C5r() {
        AnonymousClass6K2 videoView = this.A05.getVideoView();
        if (videoView != null) {
            return videoView.A01;
        }
        return null;
    }

    public final int CEc() {
        AnonymousClass6K2 videoView = this.A05.getVideoView();
        if (videoView != null) {
            return videoView.getWidth();
        }
        return 0;
    }

    public final void EEI(int i) {
        IgProgressImageView igProgressImageView;
        AnonymousClass6K2 videoView = this.A05.getVideoView();
        if (videoView != null && (igProgressImageView = videoView.A00) != null) {
            igProgressImageView.A06(i);
        }
    }
}
