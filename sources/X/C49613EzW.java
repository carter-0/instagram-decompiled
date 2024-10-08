package X;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;

/* renamed from: X.EzW  reason: case insensitive filesystem */
public final class C49613EzW {
    public final Activity A00;
    public final Dialog A01;
    public final Bitmap A02;
    public final UserSession A03;
    public final String A04;

    public C49613EzW(Activity activity, Bitmap bitmap, UserSession userSession, String str) {
        C244303ay r14;
        Activity activity2 = activity;
        this.A00 = activity2;
        UserSession userSession2 = userSession;
        this.A03 = userSession2;
        this.A02 = bitmap;
        this.A04 = str;
        C358248ab A0X = DbS.A0X(activity2);
        Activity activity3 = this.A00;
        int round = Math.round(0nA.A04(activity3, 2));
        int round2 = Math.round(0nA.A04(activity3, 1));
        int round3 = Math.round((float) Dbb.A01(activity3));
        int i = round3 + ((round + round2) * 2);
        int i2 = (round2 * 2) + round3;
        Rect rect = new Rect(0, 0, i2, i2);
        Rect rect2 = new Rect(0, 0, i, i);
        int color = activity3.getColor(R.color.grey_1);
        int color2 = activity3.getColor(R.color.baseline_neutral_80);
        int[] iArr = new int[5];
        C267014am.A03(activity3, (AttributeSet) null, iArr, R.style.GradientPatternStyle);
        LinearGradient A022 = C267014am.A02(iArr, round3, round3);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setBounds(rect2);
        AnonymousClass7TE.A1R(shapeDrawable, -1);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        shapeDrawable2.setBounds(rect);
        BitmapDrawable A002 = AnonymousClass3JT.A00(activity3, A022, shapeDrawable2);
        Drawable drawable = activity3.getDrawable(R.drawable.archive_prompt);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, A002, drawable});
        LayerDrawable layerDrawable2 = layerDrawable;
        layerDrawable2.setLayerInset(1, round, round, round, round);
        int round4 = Math.round(((float) (i - drawable.getIntrinsicWidth())) / 2.0f);
        layerDrawable2.setLayerInset(2, round4, round4, round4, round4);
        Bitmap bitmap2 = this.A02;
        if (bitmap2 != null) {
            r14 = new C244303ay((ImageUrl) null, this.A04, i, round, -1, round2, color2, color, false);
            r14.A01(bitmap2);
        } else {
            r14 = new C244303ay(DbX.A0X(this.A03), this.A04, i, round, -1, round2, color2, color, false);
        }
        ArrayList A14 = DbV.A14(r14);
        A14.add(layerDrawable);
        A0X.A0j(new C244323b0(activity3, AnonymousClass05K.A00, A14, 0.27f, i, false));
        A0X.A09(2131953149);
        A0X.A08(2131953147);
        A0X.A0r(false);
        A0X.A0s(false);
        C50023FJi.A01(A0X, this, 6);
        C50025FJk.A02(A0X, this, userSession2, 3, 2131953148);
        this.A01 = A0X.A02();
    }
}
