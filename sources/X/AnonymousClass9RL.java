package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import com.instagram.android.R;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.9RL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9RL implements Runnable {
    public final /* synthetic */ AnonymousClass8O4 A00;

    public /* synthetic */ AnonymousClass9RL(AnonymousClass8O4 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass8O4 r3 = this.A00;
        View view = r3.A03;
        view.getClass();
        0nA.A0t(view, new C41318Ary(r3, 4));
        View view2 = r3.A03;
        view2.getClass();
        int width = view2.getWidth();
        FittingTextView fittingTextView = r3.A0K;
        fittingTextView.getClass();
        int minWidth = width + fittingTextView.getMinWidth();
        FittingTextView fittingTextView2 = r3.A0L;
        fittingTextView2.getClass();
        int minWidth2 = minWidth + fittingTextView2.getMinWidth();
        boolean z = false;
        View view3 = r3.A03;
        view3.getClass();
        ViewParent parent = view3.getParent();
        parent.getClass();
        if (((View) parent).getWidth() <= minWidth2) {
            z = true;
        }
        r3.A08 = z;
        if (z) {
            r3.A03 = r3.A0F.A01();
            AnonymousClass8O4.A04(r3);
            Context context = r3.A0C;
            r3.A05 = new C355148Ov(context, r3.A0E, Integer.valueOf(R.drawable.overflow_popup_menu_background_updated_blur), true);
            r3.A04 = r3.A03.requireViewById(R.id.drawing_overflow_button);
            r3.A07 = "NoDisplayedBrush";
            int i = 0;
            while (true) {
                List list = r3.A0T;
                if (i >= list.size()) {
                    break;
                }
                Object obj = list.get(i);
                Object obj2 = r3.A0U.get(obj);
                obj2.getClass();
                r3.A0S.put(obj2, obj);
                i++;
            }
            View view4 = r3.A04;
            view4.getClass();
            view4.setVisibility(0);
            View view5 = r3.A04;
            view5.getClass();
            C386359kT.A01(AnonymousClass7TE.A0m(view5), r3, 5);
            TreeMap treeMap = new TreeMap();
            for (AnonymousClass8O8 r1 : AnonymousClass8O8.values()) {
                if (!r1.equals(r3.A0J)) {
                    treeMap.put(Integer.valueOf(r1.A01), r1);
                }
            }
            Iterator A0t = AnonymousClass7TF.A0t(treeMap);
            while (A0t.hasNext()) {
                AnonymousClass8O8 r12 = (AnonymousClass8O8) A0t.next();
                int i2 = r12.A03;
                String string = context.getString(i2);
                Drawable drawable = context.getDrawable(r12.A02);
                C40546Adt adt = new C40546Adt(r12, r3, i2);
                0qQ.A0B(string, 1);
                C367618rI r7 = new C367618rI((Drawable) null, drawable, (C15048ULb) null, adt, (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false);
                r3.A0R.add(r7);
                r3.A0V.put(Integer.valueOf(i2), r7);
            }
            C355148Ov r13 = r3.A05;
            r13.getClass();
            r13.A02(r3.A0R);
            AnonymousClass8O4.A05(r3, r3.A0I.A03);
        }
    }
}
