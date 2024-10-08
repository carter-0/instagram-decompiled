package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import java.util.Iterator;
import java.util.List;

public final class JVQ {
    public static final JVQ A00 = new Object();

    public final void A00(ViewGroup viewGroup, List list) {
        0qQ.A0B(viewGroup, 0);
        viewGroup.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Context context = viewGroup.getContext();
            0qQ.A07(context);
            View A002 = JVP.A00(context, (C376669Iw) it.next());
            Space space = new Space(context);
            space.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
            viewGroup.addView(space);
            viewGroup.addView(A002);
        }
        Space space2 = new Space(AnonymousClass7TE.A0S(viewGroup));
        space2.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        viewGroup.addView(space2);
    }
}
