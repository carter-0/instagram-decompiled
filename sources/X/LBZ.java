package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class LBZ {
    public final C60071Jf4 A00(Context context, CharSequence charSequence, int i) {
        View view;
        C70922Yp r4;
        LayoutInflater A0B = DbT.A0B(context);
        try {
            if (C61670oa.A06()) {
                view = A0B.inflate(R.layout.igds_prism_toast, (ViewGroup) null, false);
            } else {
                view = A0B.inflate(R.layout.ig_toast, (ViewGroup) null, false);
            }
        } catch (InflateException e) {
            2Yn.A03(context, e);
            context.getTheme().applyStyle(2Yn.A00(), true);
            if (C61670oa.A06()) {
                view = A0B.inflate(R.layout.igds_prism_toast, (ViewGroup) null, false);
            } else {
                view = A0B.inflate(R.layout.ig_toast, (ViewGroup) null, false);
            }
        }
        AnonymousClass7TG.A0R(view, R.id.text_view).setText(charSequence);
        C60071Jf4 jf4 = new C60071Jf4(context);
        jf4.setDuration(i);
        jf4.setGravity(17, 0, 0);
        jf4.setView(view);
        Drawable background = view.getBackground();
        if ((background instanceof GradientDrawable) && (r4 = C70922Yp.A01) != null) {
            0lg A00 = C70922Yp.A00(r4);
            0Tu r3 = 0Tu.A05;
            if (182.A06(r3, A00, 36320330809680182L) && 182.A06(r3, C70922Yp.A00(r4), 36328405347679567L)) {
                ((GradientDrawable) background).setColor(context.getColor(R.color.igds_prism_gray_08_alpha_80));
            }
        }
        return jf4;
    }
}
