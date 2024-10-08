package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.NJw  reason: case insensitive filesystem */
public final class C68479NJw extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "GenAIStickerAttributionBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "gen_ai_sticker_attribution_bottomsheet_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        TextView A0F = C66582MXn.A0F(view2);
        View A0G = AnonymousClass7TF.A0G(view2, R.id.icon);
        Context context = getContext();
        if (context != null) {
            A0F.setText(0bC.A01(context.getResources(), new String[0], 2131963017));
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            shapeDrawable.setIntrinsicWidth(context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
            shapeDrawable.setIntrinsicHeight(AnonymousClass7TF.A02(context, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
            Integer[] numArr = {DbV.A0n(context, R.color.netego_su_background_gradient_end_4), DbV.A0n(context, R.color.clips_gradient_redesign_color_1), DbV.A0n(context, R.color.clips_gradient_redesign_color_2), DbV.A0n(context, R.color.clips_gradient_redesign_color_3)};
            int[] iArr = new int[4];
            int i = 0;
            do {
                iArr[i] = numArr[i].intValue();
                i++;
            } while (i < 4);
            Paint paint2 = AnonymousClass3JT.A00;
            Rect A0X = AnonymousClass7TE.A0X(shapeDrawable);
            int width = A0X.width();
            int height = A0X.height();
            if (width <= 0 || height <= 0) {
                width = shapeDrawable.getIntrinsicWidth();
                height = shapeDrawable.getIntrinsicWidth();
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{AnonymousClass3JT.A00(context, new LinearGradient(0.0f, (float) height, (float) width, 0.0f, iArr, (float[]) null, Shader.TileMode.REPEAT), shapeDrawable), AnonymousClass3JT.A05(context, R.drawable.instagram_gen_ai_pano_filled_24, context.getColor(R.color.design_dark_default_color_on_background))});
            int A01 = AnonymousClass1GB.A01(0nA.A04(context, 10));
            layerDrawable.setLayerInset(0, 0, 0, 0, 0);
            layerDrawable.setLayerInset(1, A01, A01, A01, A01);
            A0G.setBackground(layerDrawable);
        }
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1983244936);
        C68479NJw.super.onCreate(bundle);
        AnonymousClass0fD.A09(-927598112, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1849133950);
        0qQ.A0B(layoutInflater, 0);
        C68479NJw.super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.gen_ai_sticker_attribution_bottomsheet_fragment, false);
        AnonymousClass0fD.A09(811803370, A02);
        return A0D;
    }
}
