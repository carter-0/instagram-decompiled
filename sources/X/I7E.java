package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

public abstract class I7E {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r2 > 0.0f) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(android.view.View r4, int r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r4, r3)
            boolean r0 = A09()
            if (r0 == 0) goto L_0x0017
            X.Gdo r0 = new X.Gdo
            r0.<init>(r5)
            r4.setOutlineProvider(r0)
        L_0x0012:
            r1 = 1
        L_0x0013:
            r4.setClipToOutline(r1)
            return
        L_0x0017:
            float r2 = (float) r5
            r0 = 1047904911(0x3e75c28f, float:0.24)
            float r2 = r2 * r0
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002f
            X.Gdt r0 = new X.Gdt
            r0.<init>(r2, r3)
        L_0x0026:
            r4.setOutlineProvider(r0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L_0x0013
            goto L_0x0012
        L_0x002f:
            r0 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7E.A06(android.view.View, int):void");
    }

    public static final void A07(ImageView imageView, String str) {
        0qQ.A0B(imageView, 0);
        Resources resources = imageView.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        Spannable spannable = C306386Ly.A0d;
        C306386Ly r1 = new C306386Ly(AnonymousClass7TE.A0S(imageView), dimensionPixelSize2);
        if (str == null) {
            str = "";
        }
        r1.A0L(new SpannableString(str));
        r1.A09();
        r1.A0A((float) dimensionPixelSize);
        imageView.setImageDrawable(r1);
    }

    public static final void A08(UserSession userSession, IgImageView igImageView, int i, int i2) {
        Context A0S = AnonymousClass7TE.A0S(igImageView);
        String A01 = AnonymousClass2dd.A01(igImageView.getResources(), i);
        if (A01 == null) {
            A01 = "";
        }
        String valueOf = String.valueOf(i);
        UserSession userSession2 = userSession;
        igImageView.setImageDrawable(new C321016tR(A0S, userSession2, new C321076tX(i2, i2, i2), AnonymousClass05K.A00, A01, valueOf, (String) null, 1.0f, A0S.getColor(R.color.fds_transparent), A0S.getColor(R.color.fds_transparent), false));
    }

    public static final int A00(Context context, int i) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return resources.getDimensionPixelSize(i);
    }

    public static final ShapeDrawable A03(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(i);
        AnonymousClass7TE.A1Q(paint);
        paint.setAntiAlias(true);
        return shapeDrawable;
    }

    public static final 0t0 A05(Fragment fragment, 0sP r3, int i) {
        return AnonymousClass0eN.A01(new GL8(i, 24, fragment, r3));
    }

    public static final boolean A09() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    public static final LinearGradient A01(Context context, float f, float f2) {
        return new LinearGradient(0.0f, f2, f, 0.0f, new int[]{context.getColor(R.color.quick_snap_caption_gradient_start_color), context.getColor(R.color.quick_snap_caption_gradient_center_color), context.getColor(R.color.quick_snap_caption_gradient_end_color)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public static final Path A02(int i) {
        boolean A09 = A09();
        Path A0C = C51965G9l.A0C();
        int i2 = i;
        if (A09) {
            A0C.moveTo(428.8f, 0.46f);
            A0C.cubicTo(261.14f, 4.97f, 138.6f, 20.73f, 91.25f, 43.86f);
            A0C.cubicTo(72.16f, 53.19f, 56.36f, 68.21f, 46.07f, 86.78f);
            A0C.cubicTo(21.97f, 130.29f, 5.95f, 248.64f, 0.7f, 421.78f);
            A0C.cubicTo(-0.61f, 465.2f, 0.02f, 596.23f, 1.73f, 632.78f);
            A0C.cubicTo(6.99f, 745.8f, 14.89f, 820.98f, 27.41f, 877.28f);
            A0C.cubicTo(39.56f, 931.88f, 56.61f, 958.11f, 91.3f, 975.53f);
            A0C.cubicTo(137.19f, 998.59f, 252.85f, 1013.76f, 421.8f, 1018.88f);
            A0C.cubicTo(465.21f, 1020.19f, 596.25f, 1019.56f, 632.8f, 1017.86f);
            A0C.cubicTo(787.2f, 1010.67f, 886.22f, 996.67f, 926.8f, 976.29f);
            A0C.cubicTo(953.18f, 963.05f, 972.33f, 940.81f, 982.71f, 911.36f);
            A0C.cubicTo(1001.67f, 857.63f, 1014.35f, 747.7f, 1018.89f, 597.78f);
            A0C.cubicTo(1020.2f, 554.37f, 1019.57f, 423.34f, 1017.87f, 386.78f);
            A0C.cubicTo(1010.64f, 231.49f, 996.64f, 132.99f, 976.02f, 92.28f);
            A0C.cubicTo(965.14f, 70.82f, 948.35f, 54.09f, 926.8f, 43.27f);
            A0C.cubicTo(882.93f, 21.25f, 765.77f, 5.93f, 601.8f, 0.78f);
            A0C.cubicTo(574.59f, -0.07f, 456.65f, -0.29f, 428.8f, 0.46f);
            A0C.close();
            Matrix matrix = new Matrix();
            RectF A0Y = AnonymousClass7TE.A0Y();
            A0C.computeBounds(A0Y, true);
            float f = (float) i2;
            matrix.setScale(f / A0Y.width(), f / A0Y.height(), 0.0f, 0.0f);
            A0C.transform(matrix);
            return A0C;
        }
        float f2 = (float) i2;
        float f3 = f2 * 0.24f;
        float f4 = f2 / 2.0f;
        A0C.moveTo(f4, 0.0f);
        A0C.lineTo(f3, 0.0f);
        float f5 = 2.0f * f3;
        A0C.arcTo(0.0f, 0.0f, f5, f5, -90.0f, -90.0f, false);
        float f6 = f2 - f5;
        A0C.lineTo(0.0f, f6);
        Path path = A0C;
        float f7 = f2;
        path.arcTo(0.0f, f6, f5, f7, 180.0f, -90.0f, false);
        A0C.lineTo(f2 - f3, f2);
        float f8 = f6;
        float f9 = f2;
        path.arcTo(f8, f6, f9, f7, 90.0f, -90.0f, false);
        A0C.lineTo(f2, f3);
        path.arcTo(f8, 0.0f, f9, f5, 0.0f, -90.0f, false);
        A0C.lineTo(f4, 0.0f);
        return A0C;
    }

    public static final SpannableStringBuilder A04(Context context, String str) {
        Drawable drawable;
        SpannableStringBuilder A0C = DbS.A0C(str);
        if (!(context == null || (drawable = context.getDrawable(R.drawable.instagram_chevron_right_pano_outline_12)) == null)) {
            BitmapDrawable A01 = AnonymousClass3JT.A01(context, drawable, AnonymousClass7TF.A03(context, R.attr.igds_color_primary_button_on_media));
            int A00 = A00(context, R.dimen.abc_control_corner_material);
            A01.setBounds(0, 0, A01.getIntrinsicWidth(), A01.getIntrinsicHeight());
            C263324Kh.A02(A01, A0C, A0C.length(), A00, 0);
        }
        return A0C;
    }
}
