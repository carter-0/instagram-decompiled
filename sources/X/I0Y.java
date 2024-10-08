package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import java.util.List;

public final class I0Y {
    public static final I0Y A00 = new Object();

    public final 0eP A00(Context context, UserSession userSession, 1Xj r11) {
        List list;
        String str;
        int i;
        EffectPreviewIntf effectPreviewIntf;
        GNW gnw;
        Resources resources = context.getResources();
        CreativeConfigIntf A0r = C51966G9m.A0r(r11);
        List list2 = null;
        if (A0r != null) {
            list2 = A0r.B02();
            list = C284745Nt.A07(context, A0r);
            if (list == null || (gnw = (GNW) 00k.A0J(list)) == null) {
                if (!(list2 == null || (effectPreviewIntf = (EffectPreviewIntf) 00k.A0J(list2)) == null)) {
                    str = effectPreviewIntf.getName();
                    boolean booleanValue = C306096Kt.A00(userSession).booleanValue();
                    i = R.drawable.instagram_sparkles_pano_outline_12;
                    if (booleanValue) {
                        i = R.drawable.instagram_effects_pano_filled_12;
                    }
                }
                str = "";
                i = 0;
            } else {
                str = resources.getString(gnw.A01);
                i = gnw.A00;
            }
        } else {
            list = null;
            str = "";
            i = 0;
        }
        int i2 = 0;
        int A0H = C51971G9r.A0H(list2) + C51971G9r.A0H(list);
        if (r11.A23() != null) {
            i2 = 1;
        }
        int i3 = A0H + i2;
        if (i3 > 1) {
            str = DbV.A0w(resources, str, Integer.valueOf(i3 - 1), 2131967738);
        }
        return AnonymousClass7TE.A1L(Integer.valueOf(i), str);
    }
}
