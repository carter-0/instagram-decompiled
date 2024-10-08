package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Hqx  reason: case insensitive filesystem */
public final class C55991Hqx {
    public C55801Hnh A00;
    public List A01 = 0sn.A00;
    public final C55463Hi7 A02;
    public final UserSession A03;
    public final AnonymousClass7Q6 A04;
    public final List A05 = AnonymousClass7TE.A1C();
    public final Set A06 = AnonymousClass7TE.A1F();

    public C55991Hqx(UserSession userSession, AnonymousClass7Q6 r4) {
        0qQ.A0B(userSession, 2);
        this.A04 = r4;
        this.A03 = userSession;
        C3018960m.A00();
        this.A02 = (C55463Hi7) userSession.A01(C55463Hi7.class, new C58710IwJ(userSession, 49));
    }

    public final void A00(C55801Hnh hnh, AnonymousClass0iw r20) {
        ArrayList arrayList;
        C55801Hnh hnh2;
        C55801Hnh hnh3 = hnh;
        0qQ.A0B(hnh3, 0);
        this.A00 = hnh3;
        0xa r6 = this.A02.A00;
        int i = r6.getInt("KEY_EMOJI_COUNT", -1);
        if (i > 0) {
            arrayList = AnonymousClass7TE.A1C();
            int i2 = 0;
            do {
                String string = r6.getString(002.A0O("emoji_", i2), (String) null);
                if (string == null) {
                    string = "";
                }
                arrayList.add(string);
                i2++;
            } while (i2 < i);
        } else {
            arrayList = A27.A00;
        }
        if (this.A00 != null) {
            List list = this.A05;
            list.clear();
            Set set = this.A06;
            set.clear();
            boolean z = false;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C317486nL A052 = C317486nL.A04.A05(this.A03, AnonymousClass7TE.A18(it));
                if (A052 != null && !set.contains(A052)) {
                    list.add(A052);
                    set.add(A052);
                }
                if (list.size() >= 8) {
                    break;
                }
            }
            if (list.size() < 8) {
                Iterator A1G = AnonymousClass7TE.A1G(A27.A00);
                while (A1G.hasNext()) {
                    String str = (String) AnonymousClass7TF.A0a(A1G);
                    if (list.size() == 8) {
                        break;
                    }
                    C317486nL A053 = C317486nL.A04.A05(this.A03, str);
                    if (A053 != null && !set.contains(A053)) {
                        list.add(A053);
                        set.add(A053);
                    }
                }
            }
            List list2 = this.A01;
            boolean isEmpty = list2.isEmpty();
            if (AnonymousClass7TE.A1b(list2)) {
                z = true;
            }
            if ((isEmpty || z) && (hnh2 = this.A00) != null) {
                AnonymousClass0iw r11 = r20;
                if (list2.isEmpty()) {
                    int i3 = 0;
                    do {
                        View view = (View) hnh2.A03.get(i3);
                        if (i3 < list.size()) {
                            Object tag = view.getTag();
                            0qQ.A0C(tag, C66579MXk.A00(148));
                            C337077fe.A03(r11, this.A03, (C317486nL) list.get(i3), this.A04, (C337057fc) tag, 1.0f, true);
                            view.setVisibility(0);
                        } else {
                            view.setVisibility(4);
                        }
                        i3++;
                    } while (i3 < 8);
                    return;
                }
                ViewGroup viewGroup = hnh2.A02;
                Context context = viewGroup.getContext();
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
                List<View> list3 = hnh2.A03;
                int i4 = 0;
                if (list3.size() != list2.size()) {
                    list3.clear();
                    viewGroup.removeAllViews();
                    int size = list2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        IgFrameLayout A012 = C337077fe.A01(context, dimensionPixelSize, false);
                        list3.add(A012);
                        viewGroup.addView(A012);
                    }
                }
                for (Object next : list2) {
                    int i6 = i4 + 1;
                    if (i4 < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    Object tag2 = ((View) list3.get(i4)).getTag();
                    0qQ.A0C(tag2, C66579MXk.A00(148));
                    C337077fe.A03(r11, this.A03, (C317486nL) next, this.A04, (C337057fc) tag2, 1.0f, true);
                    i4 = i6;
                }
                for (View A0U : list3) {
                    0nA.A0U(A0U, DbY.A01(context));
                }
                viewGroup.requestLayout();
            }
        }
    }
}
