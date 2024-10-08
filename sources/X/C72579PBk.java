package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.PBk  reason: case insensitive filesystem */
public final class C72579PBk implements C328007Db, C328017Dc, C328027Dd, AnonymousClass76N {
    public AnonymousClass7DU A00;
    public C328087Dj A01;
    public final Drawable A02 = C328037De.A00();
    public final View A03;
    public final FrameLayout A04;
    public final TightTextView A05;
    public final TightTextView A06;
    public final TightTextView A07;
    public final IgProgressImageView A08;

    public final void EdM(AnonymousClass7DU r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public final View BJd() {
        return this.A04;
    }

    public final C328087Dj BY0() {
        return this.A01;
    }

    public final void FHQ(int i) {
        AnonymousClass7PT.A00(this.A04.getBackground(), i);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    /* JADX WARNING: type inference failed for: r0v9, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    /* JADX WARNING: type inference failed for: r0v12, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    public C72579PBk(View view) {
        FrameLayout frameLayout = (FrameLayout) AnonymousClass7TF.A0F(view, R.id.link_preview_container);
        this.A04 = frameLayout;
        IgProgressImageView igProgressImageView = (IgProgressImageView) AnonymousClass7TF.A0F(frameLayout, R.id.link_preview_image);
        this.A08 = igProgressImageView;
        this.A03 = AnonymousClass7TF.A0G(frameLayout, R.id.separator);
        ? r0 = (TightTextView) AnonymousClass7TF.A0F(frameLayout, R.id.link_preview_title);
        Context A0S = AnonymousClass7TE.A0S(frameLayout);
        C66580MXl.A1F(r0, A0S);
        this.A06 = r0;
        ? r02 = (TightTextView) AnonymousClass7TF.A0F(frameLayout, R.id.link_preview_summary);
        0qQ.A07(A0S);
        C66580MXl.A1F(r02, A0S);
        this.A05 = r02;
        ? r03 = (TightTextView) AnonymousClass7TF.A0F(frameLayout, R.id.message_text);
        C66580MXl.A1F(r03, A0S);
        this.A07 = r03;
        igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public final void EeT(C328087Dj r1) {
        this.A01 = r1;
    }
}
