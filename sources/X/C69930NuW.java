package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.NuW  reason: case insensitive filesystem */
public abstract class C69930NuW {
    public static Drawable A00(Context context, int[] iArr, int i, int i2) {
        int[] iArr2 = iArr;
        int length = iArr.length;
        if (length == 0) {
            return AnonymousClass3JT.A05(context, i2, i);
        }
        if (length == 1) {
            return AnonymousClass3JT.A05(context, i2, iArr[0]);
        }
        Drawable drawable = context.getDrawable(i2);
        return AnonymousClass3JT.A00(context, new LinearGradient(0.0f, 0.0f, 0.0f, (float) drawable.getIntrinsicHeight(), iArr2, (float[]) null, Shader.TileMode.CLAMP), drawable);
    }
}
