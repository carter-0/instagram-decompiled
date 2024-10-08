package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mhq  reason: case insensitive filesystem */
public abstract class C67075Mhq {
    public static final void A00(ViewGroup viewGroup, UserSession userSession, List list, int i, int i2) {
        TextView textView;
        Drawable drawable;
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        0qQ.A07(from);
        1Au.A00(userSession);
        Iterator A10 = C66581MXm.A10(list, i2);
        int i3 = 0;
        while (A10.hasNext()) {
            Object next = A10.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C376659Iv r3 = (C376659Iv) next;
            if (i3 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i3);
                0qQ.A0C(childAt, "null cannot be cast to non-null type android.widget.TextView");
                textView = (TextView) childAt;
            } else {
                Object obj = r3.A01;
                if (obj == AnonymousClass05K.A0Y || obj == AnonymousClass05K.A1F || obj == AnonymousClass05K.A0j || obj == AnonymousClass05K.A0u || obj == AnonymousClass05K.A15 || obj == AnonymousClass05K.A02 || obj == AnonymousClass05K.A03 || obj == AnonymousClass05K.A04 || obj == AnonymousClass05K.A05 || obj == AnonymousClass05K.A06) {
                    View inflate = from.inflate(R.layout.direct_thread_tas_label, viewGroup, false);
                    0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
                    textView = (TextView) inflate;
                    Integer A00 = C69998Nvc.A00((Integer) r3.A01);
                    if (A00 != null) {
                        JTS.A0u(context, textView, A00.intValue());
                    }
                    Object obj2 = r3.A01;
                    if ((obj2 == AnonymousClass05K.A05 || obj2 == AnonymousClass05K.A06) && (drawable = context.getDrawable(R.drawable.instagram_atom_pano_outline_12)) != null) {
                        Integer A002 = C69998Nvc.A00((Integer) r3.A01);
                        if (A002 != null) {
                            int intValue = A002.intValue();
                            DbX.A11(context, drawable, 2Yu.A0H(context, intValue));
                            ColorStateList valueOf = ColorStateList.valueOf(intValue);
                            textView.getClass();
                            textView.setCompoundDrawableTintList(valueOf);
                        }
                        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelOffset(R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
                    }
                } else {
                    View inflate2 = from.inflate(i, viewGroup, false);
                    0qQ.A0C(inflate2, "null cannot be cast to non-null type android.widget.TextView");
                    textView = (TextView) inflate2;
                }
                viewGroup.addView(textView);
            }
            textView.setText(r3.A02);
            i3 = i4;
        }
        if (viewGroup.getChildCount() > i2) {
            viewGroup.removeViews(i2, viewGroup.getChildCount() - i2);
        }
    }

    public static final void A01(UserSession userSession, C71662eb r9, List list) {
        boolean A1X = DbW.A1X(r9);
        boolean A06 = 182.A06(DbS.A0J(userSession, A1X ? 1 : 0), userSession, 36328431117483354L);
        if (!A06 || (list != null && !list.isEmpty())) {
            View A01 = r9.A01();
            C66580MXl.A1R(A01);
            ViewGroup viewGroup = (ViewGroup) A01;
            if (viewGroup.getChildCount() > 0) {
                viewGroup.removeAllViews();
            }
            if (A06 || (list != null && !list.isEmpty())) {
                Context context = viewGroup.getContext();
                LayoutInflater from = LayoutInflater.from(context);
                0qQ.A07(from);
                r9.A03(A1X);
                if (list != null) {
                    A00(viewGroup, userSession, list, R.layout.direct_thread_label, 2);
                    int size = list.size() - viewGroup.getChildCount();
                    if (size > 0) {
                        TextView textView = (TextView) viewGroup.findViewWithTag("tag_extra_label_view");
                        if (textView == null) {
                            textView = C66582MXn.A0E(from, viewGroup, R.layout.direct_thread_label, A1X);
                            textView.setTag("tag_extra_label_view");
                            viewGroup.addView(textView);
                        }
                        String A0i = JTS.A0i(context.getResources(), size, 2131959508);
                        0qQ.A07(A0i);
                        textView.setText(A0i);
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }
}
