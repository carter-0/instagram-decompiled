package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.discovery.related.model.RelatedItem;
import java.util.List;

/* renamed from: X.UlL  reason: case insensitive filesystem */
public final class C15950UlL extends U9j {
    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        TextView textView;
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            Context context = viewGroup.getContext();
            View inflate = LayoutInflater.from(context).inflate(R.layout.related_item_label_view, viewGroup, false);
            if (!(inflate instanceof TextView) || (textView = (TextView) inflate) == null) {
                throw new IllegalStateException("Label view should be a TextView");
            }
            DbU.A1A(context.getResources(), textView, 2131971923);
        } else if (i == 1) {
            View inflate2 = DbV.A0D(viewGroup).inflate(R.layout.related_item_item_view, viewGroup, false);
            if (!(inflate2 instanceof TextView) || (textView = (TextView) inflate2) == null) {
                throw new IllegalStateException("itemView should be a TextView");
            }
        } else {
            throw new IllegalArgumentException("Unsupported view type!");
        }
        return new C14842UBw(textView);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r4, int i) {
        RelatedItem relatedItem;
        C14842UBw uBw = (C14842UBw) r4;
        if (JTP.A07(this, uBw, 0, i) != 0 && (relatedItem = (RelatedItem) 00k.A0O(this.A04, i - 1)) != null) {
            TextView textView = uBw.A00;
            textView.setText(relatedItem.A01());
            WBG.A01(textView, 25, this, relatedItem);
        }
    }

    public final int getItemCount() {
        int size;
        int A03 = AnonymousClass0fD.A03(-155193120);
        List list = this.A04;
        if (list.isEmpty()) {
            size = 0;
        } else {
            size = list.size() + 1;
        }
        AnonymousClass0fD.A0A(-2048745702, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int A03 = AnonymousClass0fD.A03(269912115);
        int i2 = 1;
        if (i == 0) {
            i2 = 0;
        }
        AnonymousClass0fD.A0A(720299112, A03);
        return i2;
    }
}
