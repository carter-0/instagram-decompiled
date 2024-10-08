package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.Djj  reason: case insensitive filesystem */
public final class C46713Djj extends BaseAdapter implements Filterable {
    public CharSequence A00 = "";
    public List A01 = AnonymousClass7TE.A1C();
    public boolean A02 = false;
    public final int A03;
    public final Context A04;
    public final AnonymousClass0iw A05;
    public final C46717Djo A06;
    public final 0BQ A07;
    public final Comparator A08 = Comparator.comparing(new C51568FwI(1));
    public final List A09 = AnonymousClass7TE.A1C();
    public final boolean A0A;

    public final boolean hasStableIds() {
        return false;
    }

    public final boolean areAllItemsEnabled() {
        return !this.A0A;
    }

    public final int getCount() {
        int size = this.A01.size();
        if (this.A0A) {
            return size + 1;
        }
        return size;
    }

    public final Filter getFilter() {
        return this.A06;
    }

    public final Object getItem(int i) {
        List list;
        if (!this.A0A) {
            list = this.A01;
        } else if (i == 0) {
            return null;
        } else {
            list = this.A01;
            i--;
        }
        return list.get(i);
    }

    public final int getItemViewType(int i) {
        if (i != 0 || !this.A0A) {
            return 0;
        }
        return 1;
    }

    public final int getViewTypeCount() {
        if (this.A0A) {
            return 2;
        }
        return 1;
    }

    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public final boolean isEnabled(int i) {
        if (!this.A0A || i > 0) {
            return true;
        }
        return false;
    }

    public C46713Djj(Context context, AnonymousClass0iw r4, 0lg r5, C49366EuU euU, int i, boolean z) {
        this.A04 = context;
        this.A05 = r4;
        this.A07 = AnonymousClass0BO.A00(r5);
        this.A0A = z;
        this.A03 = i;
        this.A06 = new C46717Djo(euU, this);
    }

    public final long getItemId(int i) {
        Object item = getItem(i);
        if (item == null) {
            return Long.MIN_VALUE;
        }
        return (long) ((G8G) item).getUsername().hashCode();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Drawable drawable;
        if (getItemViewType(i) != 1) {
            if (view == null) {
                view = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.autocomplete_user_row);
                0nA.A0Y(view, this.A03);
                view.setTag(new C49559Exu(view));
            }
            Object item = getItem(i);
            item.getClass();
            G8G g8g = (G8G) item;
            C49559Exu exu = (C49559Exu) DbT.A0o(view);
            ImageUrl BGJ = g8g.BGJ();
            if (BGJ != null) {
                exu.A02.setUrl(BGJ, this.A05);
            }
            exu.A01.setText(g8g.getUsername());
            String A002 = C46717Djo.A00(g8g, C46717Djo.A01(this.A00));
            if (A002 == null || A002.equals(g8g.getUsername())) {
                exu.A00.setVisibility(8);
                return view;
            }
            TextView textView = exu.A00;
            textView.setVisibility(0);
            textView.setText(002.A0R(A002, " "));
            int Ad8 = g8g.Ad8();
            if (Ad8 != 0) {
                drawable = this.A04.getDrawable(Ad8);
            } else {
                drawable = null;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            AnonymousClass4Ed.A04(textView);
            return view;
        } else if (view != null) {
            return view;
        } else {
            View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.autocomplete_user_dropdown_header);
            0nA.A0Y(A0C.requireViewById(R.id.dropdown_header), this.A03);
            return A0C;
        }
    }
}
