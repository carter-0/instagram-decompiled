package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Id1  reason: case insensitive filesystem */
public final class C57574Id1 implements C59584JPe {
    public final Drawable Ayx(Context context, HLN hln) {
        HLN hln2 = hln;
        0qQ.A0B(hln2, 1);
        HLN hln3 = HLN.MEMU_SHUTTER_BUTTON_ENABLED;
        int i = R.color.igds_prism_gray_03;
        if (hln2 == hln3) {
            i = R.color.memu_shutter_blue_100;
        }
        Context context2 = context;
        int color = context2.getColor(i);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new OvalShape());
        shapeDrawable.getPaint().setColor(color);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(15, color);
        Paint paint = AnonymousClass3JT.A00;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, gradientDrawable, AnonymousClass3JT.A05(context2, R.drawable.instagram_camera_pano_outline_24, context2.getColor(R.color.igds_icon_on_color))});
        layerDrawable.setLayerInset(0, 20, 20, 20, 20);
        layerDrawable.setLayerInset(2, 120, 120, 120, 120);
        return layerDrawable;
    }

    public final int BEJ(HNN hnn) {
        switch (hnn.ordinal()) {
            case 0:
                if (1AW.A06(0Tu.A05, 18315849379168805L)) {
                    return R.drawable.gen_ai_assets_metaaicontextheader_new;
                }
                return R.drawable.gen_ai_assets_metaaicontextheader;
            case 1:
                return R.drawable.instagram_gen_ai_pano_outline_24;
            case 2:
            case 3:
                return R.drawable.instagram_gen_ai_pano_filled_24;
            case 4:
            case 20:
                return R.drawable.instagram_arrow_cw_pano_outline_24;
            case 5:
                return R.drawable.instagram_circle_play_pano_outline_24;
            case 6:
                return R.drawable.meta_ai_select_crosshairs;
            case 7:
                return R.drawable.instagram_palette_gen_ai_pano_outline_24;
            case 8:
                return R.drawable.instagram_x_pano_outline_24;
            case 9:
                return R.drawable.instagram_more_horizontal_pano_filled_24;
            case 10:
                return R.drawable.instagram_arrow_right_pano_filled_24;
            case 11:
                return R.drawable.instagram_undo_pano_outline_24;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return R.drawable.instagram_undo_pano_filled_24;
            case 13:
                return R.drawable.instagram_redo_pano_filled_24;
            case 14:
                return R.drawable.instagram_chevron_left_pano_filled_24;
            case 15:
                return R.drawable.instagram_photo_gen_ai_pano_outline_24;
            case 16:
                return R.drawable.instagram_meta_gen_ai_pano_outline_24;
            case 17:
                return R.drawable.instagram_beaker_pano_outline_24;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return R.drawable.instagram_photo_pano_outline_24;
            case 19:
                return R.drawable.instagram_sparkles_pano_outline_24;
            case 21:
                return R.drawable.instagram_thumb_up_pano_outline_24;
            case 22:
                return R.drawable.instagram_thumb_down_pano_outline_24;
            case 23:
                return R.drawable.instagram_chevron_right_pano_outline_24;
            case 24:
                return R.drawable.instagram_download_pano_outline_24;
            case 25:
                return R.drawable.instagram_edit_ai_pano_outline_24;
            case 26:
                return R.drawable.instagram_edit_pano_outline_24;
            case 27:
                return R.drawable.memu_brand_assets_consent;
            case 28:
                return R.drawable.memu_brand_assets_nux;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return R.drawable.memu_brand_assets_card_mid;
            case 30:
                return R.drawable.memu_brand_assets_card_left;
            case 31:
                return R.drawable.memu_brand_assets_card_right;
            case 32:
                return R.drawable.memu_brand_assets_simplified_ring;
            case 33:
                return R.drawable.instagram_direct_gen_ai_pano_filled_24;
            case 34:
                return R.drawable.instagram_face2_gen_ai_pano_outline_24;
            case 35:
                return R.drawable.radio_button_checked;
            case 36:
                return R.drawable.radio_button_unchecked;
            case 37:
                return R.drawable.instagram_verified_pano_filled_24;
            case 38:
                return R.drawable.ig_illustrations_illo_write_with_ai_refresh;
            default:
                throw AnonymousClass7TE.A0w("Unknown icon name");
        }
    }
}
