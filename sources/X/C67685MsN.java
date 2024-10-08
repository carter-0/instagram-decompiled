package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MsN  reason: case insensitive filesystem */
public final class C67685MsN extends ArrayAdapter {
    public final C74236PrP A00;
    public final ArrayList A01;
    public final DirectThreadWidgetItem A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67685MsN(Context context, DirectThreadWidgetItem directThreadWidgetItem, C74236PrP prP, List list) {
        super(context, R.layout.direct_recipient_search_row, list);
        0qQ.A0B(list, 1);
        this.A00 = prP;
        this.A02 = directThreadWidgetItem;
        this.A01 = AnonymousClass7TE.A1D(list);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.OHG, java.lang.Object] */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        OHG ohg;
        0ng nsd;
        0qQ.A0B(viewGroup, 2);
        int i2 = 0;
        if (view == null) {
            ? obj = new Object();
            LayoutInflater from = LayoutInflater.from(getContext());
            0qQ.A07(from);
            view = from.inflate(R.layout.direct_recipient_search_row, viewGroup, false);
            obj.A05 = AnonymousClass7TE.A0d(view, R.id.fullname);
            obj.A06 = AnonymousClass7TE.A0d(view, R.id.username);
            obj.A04 = DbS.A0G(view, R.id.select_chat_indicator);
            obj.A03 = DbS.A0G(view, R.id.profile_picture);
            obj.A00 = (ViewGroup) view.findViewById(R.id.group_picture);
            obj.A01 = DbS.A0G(view, R.id.back_picture);
            obj.A02 = DbS.A0G(view, R.id.front_picture);
            view.setTag(obj);
            ohg = obj;
        } else {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.direct.appwidget.RecipientSearchRowAdapter.ViewHolder");
            ohg = (OHG) tag;
        }
        DirectThreadWidgetItem directThreadWidgetItem = (DirectThreadWidgetItem) getItem(i);
        if (directThreadWidgetItem != null) {
            TextView textView = ohg.A05;
            if (textView != null) {
                textView.setText(directThreadWidgetItem.A04);
            }
            TextView textView2 = ohg.A06;
            if (textView2 != null) {
                textView2.setText(directThreadWidgetItem.A05);
            }
            if (directThreadWidgetItem.A01 == null) {
                ViewGroup viewGroup2 = ohg.A00;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
                ImageView imageView = ohg.A03;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                nsd = new NSC(directThreadWidgetItem, ohg, this);
            } else {
                ImageView imageView2 = ohg.A03;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                ViewGroup viewGroup3 = ohg.A00;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                }
                nsd = new NSD(directThreadWidgetItem, ohg, this);
            }
            0nY.A00().ATE(nsd);
            ImageView imageView3 = ohg.A04;
            if (imageView3 != null) {
                imageView3.setColorFilter(DbU.A01(getContext()), PorterDuff.Mode.SRC_ATOP);
            }
            ImageView imageView4 = ohg.A04;
            if (imageView4 != null) {
                if (!0qQ.A0K(this.A02, directThreadWidgetItem)) {
                    i2 = 4;
                }
                imageView4.setVisibility(i2);
            }
            C71405Ok4.A01(view, 12, directThreadWidgetItem, this);
        }
        return view;
    }

    public final Filter getFilter() {
        return new C67690MsU(this);
    }
}
