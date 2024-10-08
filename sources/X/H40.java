package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class H40 extends C231632rz {
    public final JO8 A00;

    public final int getViewTypeCount() {
        return 2;
    }

    public H40(JO8 jo8) {
        this.A00 = jo8;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-141766213);
        AnonymousClass7TF.A1B(view, 1, obj);
        C55629Hko hko = (C55629Hko) obj;
        if (i == 0) {
            DbU.A0G(view, R.id.sponsored_debug_text_view).setText(hko.A00);
            C56800ICx.A00(view, 65, this);
        } else if (i == 1) {
            ID2.A02(view, 20, hko, this);
            DbU.A0G(view, R.id.notice_text_view).setText(hko.A01);
        } else {
            IllegalStateException A0z = AnonymousClass7TE.A0z(AnonymousClass000.A00(1051));
            AnonymousClass0fD.A0A(-553548781, A03);
            throw A0z;
        }
        AnonymousClass0fD.A0A(1803836534, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        DbW.A1I(r2);
        r2.A7U(1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A0D;
        int i2;
        int A03 = AnonymousClass0fD.A03(-1883444173);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            A0D = DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.row_feed_sponsored_debug, false);
            i2 = 247423807;
        } else if (i == 1) {
            A0D = DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.row_feed_notice, false);
            i2 = -1977510036;
        } else {
            IllegalStateException A0z = AnonymousClass7TE.A0z(AnonymousClass000.A00(1051));
            AnonymousClass0fD.A0A(-1228129201, A03);
            throw A0z;
        }
        AnonymousClass0fD.A0A(i2, A03);
        return A0D;
    }
}
