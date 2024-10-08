package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.71V  reason: invalid class name */
public final class AnonymousClass71V extends C231632rz {
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1135784536);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        C49588Eyx eyx = (C49588Eyx) obj;
        0qQ.A0B(eyx, 1);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.ui.rows.notice.FeedBottomNoticeRowViewBinder.Holder");
        C49544Exf exf = (C49544Exf) tag;
        exf.A02.setText(eyx.A03);
        exf.A01.setText(eyx.A02);
        String str = eyx.A01;
        TextView textView = exf.A00;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
            AnonymousClass0fU.A00(eyx.A00, textView);
        }
        AnonymousClass0fD.A0A(1134162617, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(663249207);
        0qQ.A0B(viewGroup, 1);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_feed_bottom_notice, viewGroup, false);
        0qQ.A0A(inflate);
        inflate.setTag(new C49544Exf(inflate));
        AnonymousClass0fD.A0A(-482058097, A03);
        return inflate;
    }
}
