package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.KJc  reason: case insensitive filesystem */
public class C61712KJc extends C64944Lkj {
    public final C59974Jcj AWf(Context context, Drawable drawable, C62592KiP kiP) {
        Drawable drawable2;
        Integer num;
        Resources resources = context.getResources();
        if (kiP.equals(C62592KiP.TOOL) || kiP.equals(C62592KiP.TOOL_DARK)) {
            drawable2 = context.getDrawable(this.A00);
            num = AnonymousClass05K.A01;
        } else {
            boolean equals = kiP.equals(C62592KiP.FILTER);
            drawable2 = context.getDrawable(this.A00);
            if (!equals) {
                return new C61717KJi(resources, drawable2);
            }
            num = AnonymousClass05K.A00;
        }
        return new C61718KJj(resources, drawable2, num);
    }
}
