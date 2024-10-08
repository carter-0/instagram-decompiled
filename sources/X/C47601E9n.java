package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.E9n  reason: case insensitive filesystem */
public final class C47601E9n extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47601E9n(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(539454865);
        view.getTag().getClass();
        ((C48227Eb8) view.getTag()).A00.setText((String) obj);
        AnonymousClass0fD.A0A(1670185522, A03);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Eb8] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1182392564);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.login_history_simple_text_item);
        TextView A0G = DbU.A0G(A0C, R.id.header_text_view);
        ? obj = new Object();
        obj.A00 = A0G;
        A0C.setTag(obj);
        AnonymousClass0fD.A0A(-1336859932, A03);
        return A0C;
    }
}
