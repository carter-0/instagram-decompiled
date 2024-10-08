package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager;
import com.instagram.creation.photo.crop.CropImageView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class K6F extends AnonymousClass4DH implements AnonymousClass4DR, C273544ml {
    public static final String __redex_internal_original_name = "PhotoCropFragment";
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public Bitmap A03;
    public GalleryItem A04;
    public L0B A05;
    public C59761JWz A06;
    public float[] A07;
    public View A08;
    public JX2 A09;
    public JX0 A0A;
    public CropImageView A0B;
    public final AnonymousClass0eM A0C = C227642jf.A02(this);
    public final String A0D = __redex_internal_original_name;

    public final /* synthetic */ void D0W() {
    }

    public final /* synthetic */ void D7H(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Medium medium;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        GalleryItem galleryItem = (GalleryItem) requireArguments().getParcelable("PhotoCropFragment.previewItem");
        this.A04 = galleryItem;
        JX0 jx0 = new JX0();
        jx0.A03 = getActivity();
        jx0.A04 = this;
        jx0.A0A = this.A07;
        CropImageView cropImageView = this.A0B;
        Uri uri = null;
        if (cropImageView == null) {
            str = "cropImageView";
        } else {
            jx0.A05 = cropImageView;
            if (!(galleryItem == null || (medium = galleryItem.A00) == null)) {
                uri = medium.A02();
            }
            jx0.A01 = uri;
            jx0.A07 = 0;
            jx0.A06 = Integer.valueOf(AnonymousClass7TF.A03(getContext(), R.attr.igds_color_primary_text_on_media));
            this.A0A = jx0;
            C59761JWz jWz = new C59761JWz(requireContext(), JTU.A0J(this.A0C));
            this.A06 = jWz;
            jWz.A03 = this.A0A;
            jWz.A01();
            JX2 jx2 = this.A09;
            if (jx2 == null) {
                str = "cropBorderOverlayController";
            } else {
                jx2.A01(this.A02, this.A01, this.A00);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    public final void DFf(Location location, Uri uri, MediaUploadMetadata mediaUploadMetadata, CropInfo cropInfo, String str, String str2, HashMap hashMap, int i, int i2) {
        Object obj;
        Canvas A0B2 = JTO.A0B(AnonymousClass7TF.A0B(this.A02, this.A01));
        ? r0 = this.A0B;
        if (r0 != 0) {
            r0.draw(A0B2);
            float[] fArr = new float[9];
            CropImageView cropImageView = this.A0B;
            if (cropImageView != null) {
                cropImageView.A08.getValues(fArr);
                L0B l0b = this.A05;
                if (l0b != null) {
                    JW7 jw7 = l0b.A00;
                    JX0 jx0 = jw7.A1B;
                    jx0.A0A = fArr;
                    C59761JWz jWz = jw7.A1C;
                    jWz.A03 = jx0;
                    jWz.A01();
                    GalleryPreviewMultiselectPager galleryPreviewMultiselectPager = jw7.A0I;
                    if (galleryPreviewMultiselectPager != null && jw7.A0B != null) {
                        0qQ.A0A(galleryPreviewMultiselectPager);
                        GalleryItem galleryItem = jw7.A0B;
                        JTQ.A1K(galleryItem);
                        Iterator it = galleryPreviewMultiselectPager.A02.iterator();
                        do {
                            obj = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            obj = it.next();
                        } while (!0qQ.A0K(((C60974JuW) obj).A0B.A0A, galleryItem.A0A));
                        C60974JuW juW = (C60974JuW) obj;
                        if (juW != null) {
                            juW.A09 = fArr;
                            GalleryPreviewMultiselectPager.A01((UserSession) null, galleryPreviewMultiselectPager, (List) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        0qQ.A0F("cropImageView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return this.A0D;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final boolean onBackPressed() {
        DbV.A0I(this).A0c();
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1847751808);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.gallery_picker_crop_photo_layout, viewGroup, false);
        this.A09 = new JX2(JTR.A0X(inflate, R.id.crop_border_overlay_stub));
        CropImageView cropImageView = (CropImageView) inflate.requireViewById(R.id.crop_fragment_image_view);
        cropImageView.A05 = true;
        cropImageView.setSameProportionalGrid(true);
        if (this.A00 == 1.0f) {
            cropImageView.setForcedMinZoom(1.0f);
        }
        this.A0B = cropImageView;
        View requireViewById = inflate.requireViewById(R.id.crop_fragment_done_button);
        this.A08 = requireViewById;
        if (requireViewById == null) {
            0qQ.A0F("doneButton");
            throw AnonymousClass00P.createAndThrow();
        }
        LY0.A00(requireViewById, 25, this);
        Bitmap bitmap = this.A03;
        if (bitmap != null) {
            inflate.setBackground(new BitmapDrawable(DbV.A05(this), BlurUtil.blur(bitmap, 0.1f, 4)));
        }
        AnonymousClass0fD.A09(766999725, A022);
        return inflate;
    }
}
