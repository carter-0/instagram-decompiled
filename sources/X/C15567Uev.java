package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Uev  reason: case insensitive filesystem */
public final class C15567Uev extends C336937fQ {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C15567Uev(Context context) {
        this.A00 = context;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-952848986);
        if (view == null) {
            view = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.block_commenters_empty_state);
        }
        AnonymousClass0fD.A0A(-1400348129, A03);
        return view;
    }
}
