package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.fragment.CategorySearchFragment;

/* renamed from: X.E9t  reason: case insensitive filesystem */
public final class C47607E9t extends C231632rz {
    public final Context A00;
    public final CategorySearchFragment A01;

    public final int getViewTypeCount() {
        return 4;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        int i;
        if (obj instanceof FYO) {
            i = 0;
        } else if (obj instanceof String) {
            i = 1;
        } else if (obj instanceof EyQ) {
            i = 2;
        } else if (obj instanceof Integer) {
            i = 3;
            if (AnonymousClass7TE.A0M(obj) != 3) {
                return;
            }
        } else {
            return;
        }
        r3.A7U(i);
    }

    public C47607E9t(Context context, CategorySearchFragment categorySearchFragment) {
        this.A00 = context;
        this.A01 = categorySearchFragment;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        TextView textView;
        int i2;
        int A03 = AnonymousClass0fD.A03(365983717);
        if (i == 0) {
            FYO fyo = (FYO) obj;
            CategorySearchFragment categorySearchFragment = this.A01;
            textView = ((EtP) DbT.A0o(view)).A00;
            textView.setText(fyo.A02);
            FPE.A01(textView, 23, fyo, categorySearchFragment);
            i2 = 1;
        } else if (i != 1) {
            if (i == 2) {
                EyQ eyQ = (EyQ) obj;
                View view2 = ((C249703kE) DbT.A0o(view)).itemView;
                AnonymousClass0fU.A00(eyQ.A01, view2);
                CompoundButton compoundButton = (CompoundButton) view2;
                compoundButton.setText(eyQ.A02);
                compoundButton.setChecked(eyQ.A00);
            } else if (i != 3) {
                UnsupportedOperationException A1B = AnonymousClass7TE.A1B("Unhandled view type");
                AnonymousClass0fD.A0A(927317546, A03);
                throw A1B;
            }
            AnonymousClass0fD.A0A(-1492256036, A03);
        } else {
            textView = ((C48217Eay) DbT.A0o(view)).A00;
            textView.setText((String) obj);
            i2 = 0;
        }
        03v.A0B(textView, new U7C(i2));
        AnonymousClass0fD.A0A(-1492256036, A03);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.Eay, java.lang.Object] */
    public final View createView(int i, ViewGroup viewGroup) {
        View A0C;
        int i2;
        int A03 = AnonymousClass0fD.A03(201135655);
        if (i == 0) {
            A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_category);
            A0C.setTag(new EtP(A0C));
            i2 = -1951458875;
        } else if (i == 1) {
            A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.categories_header);
            ? obj = new Object();
            obj.A00 = DbU.A0G(A0C, R.id.categories_header_text);
            A0C.setTag(obj);
            i2 = -553750416;
        } else if (i == 2) {
            A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_selection_item);
            A0C.setTag(new C249703kE(A0C));
            i2 = 1061642694;
        } else if (i == 3) {
            A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.divider_layout);
            i2 = -848552359;
        } else {
            UnsupportedOperationException A1B = AnonymousClass7TE.A1B("Unhandled view type");
            AnonymousClass0fD.A0A(-475478758, A03);
            throw A1B;
        }
        AnonymousClass0fD.A0A(i2, A03);
        return A0C;
    }
}
