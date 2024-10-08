package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.clips.animatedthumbnail.AnimatedThumbnailView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.5s1  reason: invalid class name and case insensitive filesystem */
public final class C297595s1 extends C249703kE implements AnonymousClass3V3, C289875eN {
    public int A00;
    public C267324bN A01;
    public AnonymousClass3W1 A02;
    public C68154N2u A03;
    public final View A04;
    public final View A05;
    public final AnimatedThumbnailView A06;
    public final AnonymousClass3TS A07;
    public final IgSimpleImageView A08;
    public final IgTextView A09;
    public final IgTextView A0A;
    public final IgTextView A0B;
    public final IgTextView A0C;
    public final IgImageView A0D;
    public final IgImageView A0E;
    public final IgImageView A0F;
    public final C252063oV A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C297595s1(View view) {
        super(view);
        0qQ.A0B(view, 1);
        IgImageView requireViewById = view.requireViewById(R.id.preview_image);
        0qQ.A07(requireViewById);
        this.A0E = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.animated_thumbnail);
        0qQ.A07(requireViewById2);
        this.A06 = (AnimatedThumbnailView) requireViewById2;
        IgTextView requireViewById3 = view.requireViewById(R.id.card_title);
        0qQ.A07(requireViewById3);
        this.A0C = requireViewById3;
        IgTextView requireViewById4 = view.requireViewById(R.id.card_subtitle_text_view);
        0qQ.A07(requireViewById4);
        this.A0B = requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.card_facepile);
        0qQ.A07(requireViewById5);
        this.A08 = (IgSimpleImageView) requireViewById5;
        IgTextView requireViewById6 = view.requireViewById(R.id.card_count_view);
        0qQ.A07(requireViewById6);
        this.A09 = requireViewById6;
        this.A00 = view.getContext().getResources().getDimensionPixelSize(R.dimen.clips_netego_card_width);
        View requireViewById7 = view.requireViewById(R.id.card_description_container);
        0qQ.A07(requireViewById7);
        this.A05 = requireViewById7;
        View requireViewById8 = view.requireViewById(R.id.background_content_black_gradient);
        0qQ.A07(requireViewById8);
        this.A04 = requireViewById8;
        this.A0G = 2b1.A01(view.requireViewById(R.id.mifu_album_cover_image_view_stub), false, false);
        IgTextView requireViewById9 = view.requireViewById(R.id.dynamic_text_view);
        0qQ.A07(requireViewById9);
        this.A0A = requireViewById9;
        IgImageView requireViewById10 = view.requireViewById(R.id.like_heart_view);
        0qQ.A07(requireViewById10);
        this.A0D = requireViewById10;
        IgImageView requireViewById11 = view.requireViewById(R.id.template_icon_view);
        0qQ.A07(requireViewById11);
        this.A0F = requireViewById11;
        this.A07 = new AnonymousClass3TS((ViewStub) view.requireViewById(R.id.audio_icon_view_stub));
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

    public final void DWX() {
    }

    public final void DWZ() {
    }

    public final void EEI(int i) {
    }

    public final void Epi(AnonymousClass0iw r3, ImageUrl imageUrl, boolean z) {
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(r3, 1);
        this.A0E.A0D(r3, (0lg) null, imageUrl, z);
    }

    public final AnonymousClass3TS Adf() {
        return this.A07;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.3TN] */
    public final AnonymousClass3TN B5Y() {
        return new Object();
    }

    public final View BG1() {
        return this.A0E;
    }

    public final View BQB() {
        View view = this.itemView;
        0qQ.A06(view);
        return view;
    }

    public final AnonymousClass3W1 BQq() {
        return this.A02;
    }

    public final C242423Ua C5r() {
        View view = this.itemView;
        0qQ.A0C(view, "null cannot be cast to non-null type com.instagram.ui.widget.videocontainer.TextureViewContainer");
        return (C242423Ua) view;
    }

    public final /* synthetic */ int C5s() {
        return -1;
    }

    public final int CEc() {
        return this.itemView.getWidth();
    }
}
