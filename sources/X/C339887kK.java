package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7kK  reason: invalid class name and case insensitive filesystem */
public abstract class C339887kK {
    public static final void A00(C249703kE r2, C339877kJ r3, List list) {
        0qQ.A0B(r3, 2);
        if (r3.ordinal() == 1) {
            Animation loadAnimation = AnimationUtils.loadAnimation(r2.itemView.getContext(), R.anim.fade_in_media);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setAnimation(loadAnimation);
            }
        }
    }
}
