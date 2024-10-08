package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Wx  reason: invalid class name and case insensitive filesystem */
public abstract class C265944Wx {
    public static void A00(UserSession userSession, C249693kD r17, C265914Wu r18, C265924Wv r19, boolean z) {
        boolean z2;
        int i;
        View inflate;
        C249693kD r5 = r17;
        C255783ui A00 = C265894Ws.A00(r5);
        C19471WaJ A01 = C265894Ws.A01(r5);
        C265924Wv r15 = r19;
        if (A00 == null || A01 == null) {
            r15.A09.setVisibility(8);
            return;
        }
        UserSession userSession2 = userSession;
        C225952fD A002 = C225952fD.A00(userSession2);
        Iterator it = A002.A04().iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            String str = (String) it.next();
            String str2 = A01.A02.A08;
            if (str2 == null) {
                str2 = "";
            }
            str2.getClass();
            if (str.contains(002.A0g("_", str2, "_"))) {
                z2 = true;
                break;
            }
        }
        if (r15.A01 == null) {
            View view = r15.A09.getView();
            r15.A01 = view;
            TextView textView = (TextView) view.findViewById(R.id.quiz_sticker_question);
            r15.A03 = textView;
            textView.getClass();
            C306466Mg.A02(textView);
            r15.A02 = (LinearLayout) r15.A01.findViewById(R.id.quiz_sticker_answer_list);
        }
        C252063oV r4 = r15.A09;
        r4.setVisibility(0);
        r15.A04 = r5;
        r15.A07 = A01;
        r15.A05 = r18;
        UNZ unz = A01.A02;
        Integer num = unz.A03;
        if (num == null || (i = num.intValue()) == -1) {
            if (z2) {
                Iterator it2 = A002.A04().iterator();
                while (it2.hasNext()) {
                    String str3 = (String) it2.next();
                    String str4 = unz.A08;
                    if (str4 == null) {
                        str4 = "";
                    }
                    str4.getClass();
                    if (str3.contains(002.A0g("_", str4, "_"))) {
                        A002.A03(str3);
                    }
                }
            }
            i = -1;
        }
        r15.A00 = i;
        TextView textView2 = r15.A03;
        textView2.getClass();
        C19471WaJ waJ = r15.A07;
        waJ.getClass();
        textView2.setText(waJ.A01);
        r15.A03.setTextColor(0nH.A0C(r15.A07.A02.A0A, -1));
        int[] iArr = {0nH.A0C(r15.A07.A02.A09, -14277082), 0nH.A0C(r15.A07.A02.A05, -14277082)};
        Drawable background = r15.A03.getBackground();
        background.getClass();
        ((GradientDrawable) background.mutate()).setColors(iArr);
        List list = r15.A07.A02.A0C;
        list.getClass();
        LinearLayout linearLayout = r15.A02;
        linearLayout.getClass();
        LayoutInflater from = LayoutInflater.from(linearLayout.getContext());
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < r15.A02.getChildCount(); i2++) {
            arrayList.add(r15.A02.getChildAt(i2));
        }
        r15.A02.removeAllViews();
        ArrayList arrayList2 = r15.A08;
        arrayList2.clear();
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!arrayList.isEmpty()) {
                inflate = (View) arrayList.remove(0);
            } else {
                inflate = from.inflate(R.layout.quiz_sticker_response_composer_answer_row, r15.A02, false);
            }
            inflate.getClass();
            arrayList2.add(new C18587Vue(inflate, (C21026XAf) list.get(i3), r15.A06, iArr, i3));
            r15.A02.addView(inflate);
        }
        if (r15.A00 != -1) {
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                C18587Vue vue = (C18587Vue) arrayList2.get(i4);
                boolean z3 = false;
                if (i4 == r15.A00) {
                    z3 = true;
                }
                boolean z4 = false;
                if (i4 == r15.A07.A00()) {
                    z4 = true;
                }
                vue.A01(z3, z4);
                if (i4 == r15.A07.A00()) {
                    Drawable drawable = vue.A03;
                    int i5 = vue.A02;
                    C18587Vue.A00(drawable, i5);
                    View view2 = vue.A05;
                    TransitionDrawable transitionDrawable = vue.A04;
                    view2.setBackground(transitionDrawable);
                    vue.A06.setBackground(drawable);
                    vue.A07.setTextColor(i5);
                    transitionDrawable.startTransition(0);
                }
            }
        }
        View view3 = r4.getView();
        ViewParent parent = view3.getParent();
        parent.getClass();
        ViewGroup viewGroup = (ViewGroup) parent;
        if (z) {
            view3.addOnLayoutChangeListener(new IDF(view3, viewGroup, userSession2, A00, r15));
        } else {
            0nA.A0q(view3, new C57967IjM(view3, viewGroup, userSession2, A00, r15));
        }
    }
}
