package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instagram.android.R;
import com.instagram.user.model.Product;

public final class U4A extends BaseAdapter {
    public final C15697Uh3 A00;
    public final C15435Ucl A01;
    public final AnonymousClass0iw A02;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        if (view == null) {
            view = DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.canvas_media_block, false);
            view.setTag(new UD5(view));
        }
        Context A0S = AnonymousClass7TE.A0S(view);
        Object tag = view.getTag();
        if (tag != null) {
            UD5 ud5 = (UD5) tag;
            C15435Ucl ucl = this.A01;
            C21051XBs xBs = (C21051XBs) ucl.A00.A00.get(i);
            0qQ.A0C(xBs, AnonymousClass000.A00(332));
            C15433Ucj ucj = (C15433Ucj) xBs;
            C15697Uh3 uh3 = this.A00;
            AnonymousClass0iw r7 = this.A02;
            String id = ucl.getId();
            if (id != null) {
                C16913VAq.A00(A0S, uh3, ucj, ud5, r7, (Product) null, id);
                return view;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final int getCount() {
        return this.A01.A00.A00.size();
    }

    public final Object getItem(int i) {
        return this.A01.A00.A00.get(i);
    }

    public U4A(C15697Uh3 uh3, C15435Ucl ucl, AnonymousClass0iw r3) {
        this.A01 = ucl;
        this.A00 = uh3;
        this.A02 = r3;
    }
}
