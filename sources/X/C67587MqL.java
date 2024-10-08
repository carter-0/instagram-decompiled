package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.TypedValue;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MqL  reason: case insensitive filesystem */
public abstract class C67587MqL {
    public static final int A01(Context context) {
        int A02 = AnonymousClass7TF.A02(context, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        int A022 = AnonymousClass7TF.A02(context, R.dimen.avatar_size_ridiculously_xlarge);
        int A023 = AnonymousClass7TF.A02(context, R.dimen.action_bar_item_spacing_left);
        int A024 = AnonymousClass7TF.A02(context, R.dimen.annotation_cluster_name_plate_padding_top);
        float A00 = A00(context);
        int A025 = AnonymousClass7TF.A02(context, R.dimen.abc_dialog_padding_top_material);
        return Math.max(((A02 * 2) - ((int) ((float) Math.ceil((double) (((float) (Math.max(1, 0) * A02)) * A00))))) + A024 + A025, A022 + A023 + A025);
    }

    public static final int A02(Context context) {
        int A02 = AnonymousClass7TF.A02(context, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        return Math.max((A02 * 5) - ((int) ((float) Math.ceil((double) (((float) (Math.max(4, 0) * A02)) * A00(context))))), AnonymousClass7TF.A02(context, R.dimen.avatar_size_ridiculously_xlarge));
    }

    public static final LayerDrawable A03(Context context) {
        int A01 = C61380mr.A01(context, 16);
        int A012 = C61380mr.A01(context, 10);
        int color = context.getColor(2Yu.A0C(context));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(color);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setBounds(new Rect(0, 0, A01, A01));
        C306386Ly r1 = new C306386Ly(context, A012);
        r1.A0A((float) A012);
        r1.A0M("❤️");
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, r1});
        int A013 = C61380mr.A01(context, 4);
        layerDrawable.setLayerInset(1, A013, A013, A013, A013);
        return layerDrawable;
    }

    public static final String A04(Context context, User user) {
        AnonymousClass7TF.A1H(user, context);
        String fullName = user.getFullName();
        if (fullName != null) {
            String A05 = A05(AnonymousClass7TE.A19(DbV.A18(fullName, " "), 0));
            if (DbV.A12(A05).length() > 0 && A05 != null) {
                return A05;
            }
        }
        return user.getUsername();
    }

    public static final String A05(String str) {
        if (C66581MXm.A04(str) == 0) {
            return str;
        }
        String A12 = DbT.A12(AnonymousClass1Q2.A02(), str);
        String upperCase = C51967G9n.A0q(str, 0, 1).toUpperCase(AnonymousClass1Q2.A02());
        0qQ.A07(upperCase);
        return 002.A0R(upperCase, C66580MXl.A0z(A12, 1));
    }

    public static final 0eP A06(Context context, long j) {
        String A04 = 1G0.A04(context, (double) j);
        if (JTR.A0L() - j < TimeUnit.MINUTES.toSeconds(10)) {
            return C66581MXm.A14(A05(A04), true);
        }
        return C66581MXm.A14(A04, false);
    }

    public static final void A07(IgSimpleImageView igSimpleImageView, int i) {
        Context A0C = JTP.A0C(igSimpleImageView, 0);
        Drawable drawable = A0C.getDrawable(i);
        if (drawable != null) {
            igSimpleImageView.setImageDrawable(new C52794Gcl(A0C, drawable));
        }
    }

    public static final float A00(Context context) {
        0qQ.A0B(context, 0);
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.cluster_item_horizontal_overlap_factor, typedValue, true);
        int i = typedValue.type;
        if (i == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException(002.A11("Resource ID #0x", Integer.toHexString(R.dimen.cluster_item_horizontal_overlap_factor), " type #0x", Integer.toHexString(i), AnonymousClass000.A00(834)));
    }
}
