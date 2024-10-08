package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.E9a  reason: case insensitive filesystem */
public final class C47588E9a extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C47588E9a(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1744968079);
        AnonymousClass7TG.A1O(view, obj);
        C48218Eaz eaz = (C48218Eaz) view.getTag();
        if (eaz != null) {
            FGF fgf = (FGF) obj;
            0qQ.A0B(fgf, 1);
            TextView textView = eaz.A00;
            fgf.A02(textView);
            View.OnClickListener onClickListener = fgf.A04;
            if (onClickListener != null) {
                AnonymousClass0fU.A00(onClickListener, textView);
            }
            AnonymousClass0fD.A0A(190438618, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(259644180, A03);
        throw A0y;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Eaz, java.lang.Object] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1615382445);
        0qQ.A0B(viewGroup, 1);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.secondary_text_view);
        TextView A0R = AnonymousClass7TG.A0R(A0C, R.id.secondary_text);
        0qQ.A0B(A0R, 1);
        ? obj = new Object();
        obj.A00 = A0R;
        A0C.setTag(obj);
        AnonymousClass0fD.A0A(292842302, A03);
        return A0C;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
