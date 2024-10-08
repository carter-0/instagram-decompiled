package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.K9e  reason: case insensitive filesystem */
public final class C61473K9e extends C231632rz {
    public final int A00 = R.layout.title_row;
    public final L1H A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C61473K9e(L1H l1h) {
        this.A01 = l1h;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1921310715);
        ((TextView) view).setText(((C63668L2e) obj).A00);
        AnonymousClass0fD.A0A(1738667362, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(910683936);
        Context context = viewGroup.getContext();
        TextView textView = (TextView) DbT.A0C(LayoutInflater.from(context), viewGroup, this.A00);
        textView.setTypeface(AnonymousClass7TG.A0N(context));
        AnonymousClass0fD.A0A(571359792, A03);
        return textView;
    }
}
