package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;

/* renamed from: X.JfD  reason: case insensitive filesystem */
public final class C60077JfD extends ConstraintLayout {
    public int A00 = Integer.MAX_VALUE;
    public final List A01 = AnonymousClass7TE.A1C();

    /* JADX WARNING: type inference failed for: r4v1, types: [X.Jdv, android.view.View] */
    public static final C60075Jf8 A00(C60077JfD jfD, C63832L8n l8n, int i) {
        C60077JfD jfD2 = jfD;
        C60075Jf8 jf8 = new C60075Jf8(AnonymousClass7TE.A0S(jfD2));
        JTP.A13(jf8);
        jf8.setOnBarLayoutListener(new C58728Iwb(jfD2, 37));
        int i2 = jfD2.A00;
        C63832L8n l8n2 = l8n;
        0qQ.A0B(l8n2, 0);
        Context context = jf8.A02;
        TextView textView = new TextView(context);
        JTP.A13(textView);
        textView.setText(l8n2.A03);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        jf8.addView(textView, new ViewGroup.LayoutParams(0, -2));
        int i3 = i;
        LDz lDz = new LDz(l8n2.A04, l8n2.A00, l8n2.A01, i3);
        lDz.A00 = i2;
        0qQ.A0B(context, 1);
        ? view = new View(context);
        JTP.A13(view);
        view.setBarViewModel(lDz);
        0sP r1 = jf8.A01;
        if (r1 != null) {
            view.A00 = r1;
        }
        jf8.A00 = view;
        jf8.addView(view, new ViewGroup.LayoutParams(0, (int) TypedValue.applyDimension(1, (float) i3, AnonymousClass7TF.A0E(context))));
        String str = l8n2.A02;
        TextView textView2 = new TextView(context);
        JTP.A13(textView2);
        textView2.setText(str);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        jf8.addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        C270354gb A0C = JTQ.A0C(jf8);
        A0C.A0E(textView.getId(), 3, 0, 3, C51972G9s.A08(context));
        A0C.A0C(textView.getId(), 6, 0, 6);
        A0C.A0C(textView.getId(), 7, 0, 7);
        C270354gb r14 = A0C;
        r14.A0E(view.getId(), 3, textView.getId(), 4, DbY.A01(context));
        A0C.A0C(view.getId(), 6, 0, 6);
        r14.A0E(view.getId(), 7, textView2.getId(), 6, AnonymousClass7TG.A02(context));
        A0C.A0C(textView2.getId(), 7, 0, 7);
        A0C.A0C(textView2.getId(), 3, view.getId(), 3);
        A0C.A0C(textView2.getId(), 4, view.getId(), 4);
        A0C.A0G(jf8);
        return jf8;
    }

    public C60077JfD(Context context) {
        super(context);
        JTP.A13(this);
    }

    public static final void A01(C60077JfD jfD, List list) {
        int id;
        C270354gb A0C = JTQ.A0C(jfD);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            View view = (View) next;
            A0C.A0C(view.getId(), 6, 0, 6);
            A0C.A0C(view.getId(), 7, 0, 7);
            int id2 = view.getId();
            if (i == 0) {
                id = 0;
            } else {
                id = ((View) list.get(i - 1)).getId();
            }
            int i3 = 4;
            if (i == 0) {
                i3 = 3;
            }
            A0C.A0C(id2, 3, id, i3);
            i = i2;
        }
        A0C.A0G(jfD);
    }
}
