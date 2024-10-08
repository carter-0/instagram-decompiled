package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;
import com.instagram.creation.base.ui.grid.GridLinesView;

/* renamed from: X.K5a  reason: case insensitive filesystem */
public abstract class C61382K5a extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ProfileCropFragment";
    public RectF A00;
    public PunchedOverlayView A01;
    public TouchImageView A02;
    public boolean A03;
    public boolean A04;
    public Bitmap A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        this.A04 = 182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A06, 0), 36327438980102589L);
        PunchedOverlayView punchedOverlayView = (PunchedOverlayView) view.findViewById(R.id.punched_overlay_view);
        punchedOverlayView.A01 = AnonymousClass7TF.A03(requireContext, R.attr.backgroundColorSecondary);
        punchedOverlayView.addOnLayoutChangeListener(new LYP(1, punchedOverlayView, this));
        this.A01 = punchedOverlayView;
        TouchImageView touchImageView = (TouchImageView) view.findViewById(R.id.crop_image_preview);
        touchImageView.A06 = new C64881Ljh(this.A04);
        touchImageView.A0G = true;
        touchImageView.A0F = false;
        touchImageView.A02 = 3.0f;
        Bitmap bitmap = this.A05;
        if (bitmap == null) {
            0qQ.A0F("bitmap");
            throw AnonymousClass00P.createAndThrow();
        }
        touchImageView.setImageBitmap(bitmap);
        C64286LYm.A00(touchImageView, 22, this);
        touchImageView.post(new C65996M7h(touchImageView, this));
        this.A02 = touchImageView;
        GridLinesView gridLinesView = (GridLinesView) view.requireViewById(R.id.grid_lines);
        gridLinesView.A02 = false;
        if (this.A04) {
            gridLinesView.A00 = 1.3333334f;
        }
        gridLinesView.post(new M4W(gridLinesView));
    }

    public final MediaCroppingCoordinates A00() {
        String str;
        TouchImageView touchImageView = this.A02;
        if (touchImageView == null) {
            str = "touchImageView";
        } else {
            Rect cropRect = touchImageView.getCropRect();
            Bitmap bitmap = this.A05;
            str = "bitmap";
            if (bitmap != null) {
                float A022 = JTO.A02(bitmap);
                Bitmap bitmap2 = this.A05;
                if (bitmap2 != null) {
                    float A012 = JTO.A01(bitmap2);
                    RectF rectF = new RectF(((float) cropRect.left) / A022, ((float) cropRect.top) / A012, ((float) cropRect.right) / A022, ((float) cropRect.bottom) / A012);
                    float f = rectF.left;
                    float f2 = rectF.top;
                    return new MediaCroppingCoordinates(rectF.bottom, f, rectF.right, f2);
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public void onCreate(Bundle bundle) {
        String A012;
        MediaCroppingCoordinates mediaCroppingCoordinates;
        RectF rectF;
        int A022 = AnonymousClass0fD.A02(724780755);
        C61382K5a.super.onCreate(bundle);
        boolean z = this instanceof KTT;
        if (z) {
            A012 = JTO.A0k(((KTT) this).A01).A0M.A0J;
            0qQ.A0A(A012);
        } else {
            A012 = C320236s2.A01(requireArguments(), "ClipsConstants.ARG_CLIPS_COVER_IMAGE_FILE_PATH");
        }
        this.A05 = BitmapFactory.decodeFile(A012);
        if (z) {
            mediaCroppingCoordinates = JTO.A0k(((KTT) this).A01).A0M.A0A;
        } else {
            mediaCroppingCoordinates = (MediaCroppingCoordinates) ((C60228Jhl) ((KTS) this).A01.getValue()).A01.A00("PROFILE_CROP_COORDINATES_KEY");
        }
        if (mediaCroppingCoordinates != null) {
            rectF = new RectF(mediaCroppingCoordinates.A01, mediaCroppingCoordinates.A03, mediaCroppingCoordinates.A02, mediaCroppingCoordinates.A00);
        } else {
            Bitmap bitmap = this.A05;
            if (bitmap == null) {
                0qQ.A0F("bitmap");
                throw AnonymousClass00P.createAndThrow();
            } else {
                float height = ((float) (bitmap.getHeight() - bitmap.getWidth())) / ((float) (bitmap.getHeight() * 2));
                rectF = new RectF(0.0f, height, 1.0f, 1.0f - height);
            }
        }
        this.A00 = rectF;
        AnonymousClass0fD.A09(-1376636745, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1030545323);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.upload_edit_profile_crop_fragment, false);
        AnonymousClass0fD.A09(-1692309828, A022);
        return A0D;
    }
}
