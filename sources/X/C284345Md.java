package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Md  reason: invalid class name and case insensitive filesystem */
public final class C284345Md implements AnonymousClass5Gs {
    public final List A00;

    public C284345Md(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final /* bridge */ /* synthetic */ C284395Mi ANJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.activity_tab_tooltip, viewGroup, false);
        0qQ.A07(inflate);
        return new C284385Mh(inflate);
    }

    public final /* bridge */ /* synthetic */ void ADq(C283255Gu r9, C284395Mi r10) {
        C284385Mh r102 = (C284385Mh) r10;
        0qQ.A0B(r102, 0);
        List<C376629Is> list = this.A00;
        List list2 = r102.A00;
        Iterator it = list2.iterator();
        int i = 0;
        for (C376629Is r1 : list) {
            int i2 = r1.A01;
            if (i2 > 0) {
                TextView textView = (TextView) it.next();
                int i3 = r1.A02;
                textView.setVisibility(0);
                textView.setText(String.valueOf(i2));
                textView.setCompoundDrawablesWithIntrinsicBounds(i3, 0, 0, 0);
                Context context = textView.getContext();
                textView.setCompoundDrawableTintList(ColorStateList.valueOf(context.getColor(2Yu.A0H(context, R.attr.igds_color_icon_on_color))));
                i++;
                if (i >= list2.size()) {
                    break;
                }
            }
        }
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
    }
}
