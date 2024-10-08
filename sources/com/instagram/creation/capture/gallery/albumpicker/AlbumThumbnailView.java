package com.instagram.creation.capture.gallery.albumpicker;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass3NG;
import X.AnonymousClass7TE;
import X.AnonymousClass9I9;
import X.C355608Qq;
import X.C357268Xf;
import X.C361518gM;
import X.C53368Gms;
import X.C61080JwI;
import X.C61685KHt;
import X.C64286LYm;
import X.C65792Lzk;
import X.C65796Lzo;
import X.DbS;
import X.JTR;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AlbumThumbnailView extends IgLinearLayout {
    public C61080JwI A00;
    public C361518gM A01;
    public C53368Gms A02;
    public final FrameLayout A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final MediaPickerItemView A07;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AlbumThumbnailView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    private final AnonymousClass9I9 getGalleryItemState() {
        AnonymousClass9I9 r0 = new AnonymousClass9I9((DefaultConstructorMarker) null, 0, 0, 15, 3, false, false);
        r0.A02 = false;
        return r0;
    }

    public final void A00(C53368Gms gms, C61080JwI jwI, UserSession userSession) {
        RemoteMedia A002;
        GalleryItem galleryItem;
        this.A00 = jwI;
        TextView textView = this.A05;
        String name = ((C357268Xf) jwI.A00).getName();
        textView.setText(name);
        TextView textView2 = this.A06;
        C357268Xf r2 = (C357268Xf) jwI.A00;
        String subtitle = r2.getSubtitle();
        if (subtitle.length() == 0) {
            subtitle = String.valueOf(r2.getSize());
        }
        textView2.setText(subtitle);
        this.A02 = gms;
        setContentDescription(name);
        C61080JwI jwI2 = this.A00;
        if (jwI2 != null) {
            C357268Xf r22 = (C357268Xf) jwI2.A00;
            Folder ACT = r22.ACT();
            if (ACT == null || r22.getSize() <= 0) {
                C65796Lzo ACa = r22.ACa();
                if (!(ACa == null || ACa.A00() == null || (A002 = ACa.A00()) == null)) {
                    galleryItem = new GalleryItem(A002);
                }
            } else {
                galleryItem = JTR.A0f((Medium) ACT.A01().get(0));
            }
            setupThumbnailImage(userSession, galleryItem);
            return;
        }
        setupThumbnailIcon(R.drawable.instagram_no_photo_pano_outline_24);
    }

    private final void setupThumbnailIcon(int i) {
        this.A07.setVisibility(8);
        FrameLayout frameLayout = this.A03;
        frameLayout.setVisibility(0);
        frameLayout.getLayoutParams().height = this.A02.A00;
        frameLayout.getLayoutParams().width = this.A02.A01;
        this.A04.setImageResource(i);
    }

    private final void setupThumbnailImage(UserSession userSession, GalleryItem galleryItem) {
        MediaPickerItemView mediaPickerItemView = this.A07;
        mediaPickerItemView.setVisibility(0);
        this.A03.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = mediaPickerItemView.getLayoutParams();
        C53368Gms gms = this.A02;
        layoutParams.width = gms.A01;
        layoutParams.height = gms.A00;
        mediaPickerItemView.setLayoutParams(layoutParams);
        GalleryItem galleryItem2 = galleryItem;
        if (galleryItem2.A02()) {
            Context A0S = AnonymousClass7TE.A0S(this);
            C53368Gms gms2 = this.A02;
            UserSession userSession2 = userSession;
            MediaPickerItemView mediaPickerItemView2 = mediaPickerItemView;
            mediaPickerItemView2.A03(getGalleryItemState(), new C355608Qq(A0S, userSession2, AnonymousClass05K.A00, gms2.A01, gms2.A00, false), galleryItem2, false, false, false, false);
        } else if (galleryItem2.A04()) {
            mediaPickerItemView.A04(getGalleryItemState(), galleryItem2, C65792Lzk.A00, false, false, true, true, true, true);
        }
    }

    public final void setAlbumPickerListener(C361518gM r1) {
        this.A01 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A02 = new C53368Gms(context.getResources().getDimensionPixelOffset(R.dimen.album_thumbnail_image_size), context.getResources().getDimensionPixelOffset(R.dimen.album_thumbnail_image_size), 8);
        LayoutInflater.from(context).inflate(R.layout.album_with_thumbnail_layout, this, true);
        setOrientation(1);
        setGravity(1);
        this.A05 = AnonymousClass7TE.A0d(this, R.id.album_title);
        this.A06 = AnonymousClass7TE.A0d(this, R.id.album_media_count_text);
        MediaPickerItemView mediaPickerItemView = (MediaPickerItemView) findViewById(R.id.album_thumbnail_image);
        this.A07 = mediaPickerItemView;
        this.A03 = (FrameLayout) findViewById(R.id.album_thumbnail_icon_frame);
        this.A04 = DbS.A0G(this, R.id.album_thumbnail_icon);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(this);
        A0m.A06 = false;
        A0m.A04 = new C61685KHt(this, 11);
        C64286LYm.A00(mediaPickerItemView, 7, A0m.A00());
    }

    public /* synthetic */ AlbumThumbnailView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AlbumThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
