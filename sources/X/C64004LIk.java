package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.LIk  reason: case insensitive filesystem */
public abstract class C64004LIk {
    public static final C60076JfA A00(Context context, View.OnClickListener onClickListener, Integer num, int i) {
        C60076JfA jfA = new C60076JfA(context);
        jfA.setTitle(context.getResources().getString(i));
        AnonymousClass0fU.A00(onClickListener, jfA);
        if (num != null) {
            jfA.setIcon(JTP.A0E(context, num));
        }
        JTS.A0x(jfA);
        return jfA;
    }

    public static final KHY A01(Context context, Boolean bool, CharSequence charSequence, Integer num, int i) {
        String string = context.getResources().getString(i);
        KHY khy = new KHY(context);
        DbY.A0z(khy);
        khy.setOrientation(1);
        khy.setTitle(string);
        if (num != null) {
            khy.setIcon(JTP.A0E(context, num));
        }
        if (charSequence != null) {
            khy.setSubtitle(charSequence);
            if (bool != null) {
                khy.setInlineSubtitleLinkable(bool.booleanValue());
            }
        }
        return khy;
    }
}
