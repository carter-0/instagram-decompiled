package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.Jpq  reason: case insensitive filesystem */
public final class C60705Jpq extends C249703kE implements C20976X7p, X1S {
    public final int A00 = DbS.A02(JTQ.A06(this), 178);
    public final AnonymousClass0iw A01 = DbS.A0O("media_kit_media_item");
    public final IgTextView A02;
    public final C252063oV A03;
    public final FixedAspectRatioVideoLayout A04;
    public final IgImageButton A05;
    public final SlideInAndOutIconView A06;
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new C51793G2c(this, 1));
    public final boolean A08;

    public C60705Jpq(View view, boolean z) {
        super(view);
        this.A08 = z;
        C252063oV A012 = 2b1.A01(view.requireViewById(R.id.mk_audio_icon_view_stub), false, false);
        this.A03 = A012;
        this.A06 = (SlideInAndOutIconView) AnonymousClass7TF.A0F(A012.getView(), R.id.indicator);
        View requireViewById = view.requireViewById(R.id.media_frame);
        0qQ.A07(requireViewById);
        this.A04 = (FixedAspectRatioVideoLayout) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.image_preview);
        IgImageButton igImageButton = (IgImageButton) requireViewById2;
        igImageButton.A00 = 1.0f;
        igImageButton.setEnableTouchOverlay(false);
        igImageButton.A0A = new C247833gz();
        0qQ.A07(requireViewById2);
        this.A05 = igImageButton;
        this.A02 = DbX.A0Z(view, R.id.media_likes);
        view.setTag(this);
    }

    public final void ABK(C232822uV r6, int i) {
        0qQ.A0B(r6, 1);
        Resources A052 = DbU.A05(this.itemView);
        0qQ.A07(A052);
        SlideInAndOutIconView slideInAndOutIconView = this.A06;
        TitleTextView titleTextView = slideInAndOutIconView.A0C;
        int lineHeight = titleTextView.getLineHeight() + (A052.getDimensionPixelSize(R.dimen.media_tag_indicator_padding) * 2);
        int lineHeight2 = (titleTextView.getLineHeight() - A052.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
        slideInAndOutIconView.A03(DbS.A07(this).getDrawable(i), lineHeight, lineHeight);
        slideInAndOutIconView.A0B.setPadding(lineHeight2, lineHeight2, lineHeight2, lineHeight2);
        JTU.A1G(r6, slideInAndOutIconView, AnonymousClass7TE.A09(DbS.A07(this)));
    }

    public final IgImageButton BGE() {
        return this.A05;
    }

    public final FixedAspectRatioVideoLayout BLn() {
        return this.A04;
    }
}
