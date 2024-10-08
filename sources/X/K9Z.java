package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.model.venue.Venue;

public final class K9Z extends C231632rz {
    public final K5H A00;
    public final boolean A01;

    public final int getViewTypeCount() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        int i;
        if (obj instanceof Venue) {
            i = 0;
        } else if (obj instanceof C62460KgA) {
            i = 1;
        } else {
            throw new UnsupportedOperationException();
        }
        r2.A7U(i);
    }

    public K9Z(K5H k5h, boolean z) {
        this.A00 = k5h;
        this.A01 = z;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1818537103);
        if (i == 0) {
            Venue venue = (Venue) obj;
            L94 l94 = (L94) DbT.A0o(view);
            K5H k5h = this.A00;
            boolean z = this.A01;
            C51973G9u.A1E(l94, venue, k5h);
            l94.A04.setText(venue.A00.getName());
            l94.A00.setVisibility(8);
            l94.A02.setVisibility(DbW.A01(k5h.A0U ? 1 : 0));
            String address = venue.A00.getAddress();
            if (address == null || address.length() == 0) {
                l94.A03.setVisibility(8);
            } else {
                TextView textView = l94.A03;
                textView.setText(venue.A00.getAddress());
                textView.setVisibility(0);
            }
            View view2 = l94.A01;
            LYG.A02(view2, 36, venue, k5h);
            if (z) {
                view2.setBackground((Drawable) null);
            }
        } else if (i == 1) {
            C48234EbF ebF = (C48234EbF) DbT.A0o(view);
            0qQ.A0B(ebF, 0);
            ebF.A01.setText(2131968403);
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            AnonymousClass0fD.A0A(613757879, A03);
            throw unsupportedOperationException;
        }
        AnonymousClass0fD.A0A(-1644468071, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A0A;
        int i2;
        int A03 = AnonymousClass0fD.A03(220848562);
        LayoutInflater A0D = DbV.A0D(viewGroup);
        if (i == 0) {
            0qQ.A0B(A0D, 0);
            A0A = DbU.A0A(A0D, viewGroup, R.layout.row_venue, false);
            A0A.setTag(new L94(A0A));
            i2 = 552295785;
        } else if (i == 1) {
            A0A = C49162EqT.A00(A0D, viewGroup);
            i2 = -93093454;
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            AnonymousClass0fD.A0A(562943766, A03);
            throw unsupportedOperationException;
        }
        AnonymousClass0fD.A0A(i2, A03);
        return A0A;
    }
}
