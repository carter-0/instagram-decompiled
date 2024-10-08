package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.K9c  reason: case insensitive filesystem */
public final class C61471K9c extends C231632rz {
    public final Context A00;
    public final C66469MSx A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public C61471K9c(Context context, C66469MSx mSx) {
        this.A00 = context;
        this.A01 = mSx;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1123648881);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.tagging.activity.TagMoreRowViewBinder.Holder");
        L5E l5e = (L5E) tag;
        String string = this.A00.getResources().getString(AnonymousClass7TE.A0M(obj));
        C66469MSx mSx = this.A01;
        l5e.A01.setText(string);
        C64273LXz.A00(l5e.A00, 63, mSx);
        AnonymousClass0fD.A0A(617780062, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        C51965G9l.A1U(obj);
        DbW.A1I(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 474128071);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_tag_more);
        A0C.setTag(new L5E(A0C));
        AnonymousClass0fD.A0A(1549793593, A04);
        return A0C;
    }
}
