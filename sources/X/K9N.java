package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class K9N extends C231632rz {
    public final C65634LxB A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public K9N(C65634LxB lxB) {
        this.A00 = lxB;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1284411135);
        0qQ.A0B(view, 1);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.MessageRowViewBinder.Holder");
        L6F l6f = (L6F) tag;
        C65634LxB lxB = this.A00;
        Dba.A0j(1, l6f, lxB);
        LY0.A00(l6f.A00, 69, lxB);
        l6f.A01.setImageResource(R.drawable.instagram_direct_pano_outline_16);
        l6f.A02.setText(2131966184);
        AnonymousClass0fD.A0A(378881820, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1361031303);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.recipient_picker_share_to_destination_row, false);
        A0A.setTag(new L6F(A0A));
        AnonymousClass0fD.A0A(1036470691, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
