package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Tzo  reason: case insensitive filesystem */
public final class C14642Tzo extends C231632rz {
    public final Context A00;
    public final ReelDashboardFragment A01;

    public final int getViewTypeCount() {
        return 4;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r5, Object obj, Object obj2) {
        int i;
        C14641Tzn tzn = (C14641Tzn) obj;
        VWC vwc = tzn.A01;
        if (vwc != null) {
            int intValue = vwc.A01.intValue();
            i = 1;
            if (!(intValue == 9 || intValue == 10)) {
                r5.A7U(2);
                return;
            }
        } else {
            i = 0;
            if (tzn.A02 != null) {
                i = 3;
            }
        }
        r5.A7U(i);
    }

    public C14642Tzo(Context context, ReelDashboardFragment reelDashboardFragment) {
        this.A00 = context;
        this.A01 = reelDashboardFragment;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        ReelDashboardFragment reelDashboardFragment;
        VWC vwc;
        IgImageView igImageView;
        int i2;
        int A03 = AnonymousClass0fD.A03(-1939534064);
        C14641Tzn tzn = (C14641Tzn) obj;
        if (i != 0) {
            if (i == 1) {
                VYJ vyj = (VYJ) DbT.A0o(view);
                reelDashboardFragment = this.A01;
                vwc = tzn.A01;
                vwc.getClass();
                vyj.A00.setBackground(tzn.A00);
                vyj.A03.setText(tzn.A03);
                vyj.A02.setText(vwc.A02);
                igImageView = vyj.A01;
                i2 = 13;
            } else if (i == 2) {
                VWF vwf = (VWF) DbT.A0o(view);
                reelDashboardFragment = this.A01;
                Dba.A0j(1, vwf, tzn);
                0qQ.A0B(reelDashboardFragment, 2);
                vwc = tzn.A01;
                vwf.A00.setBackground(tzn.A00);
                vwf.A01.setText(tzn.A03);
                igImageView = vwf.A02;
                i2 = 14;
            } else if (i == 3) {
                VWG vwg = (VWG) DbT.A0o(view);
                Dba.A0j(1, vwg, tzn);
                vwg.A00.setBackground(tzn.A00);
                vwg.A02.setText(tzn.A03);
                vwg.A01.setText(tzn.A02);
            } else {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                AnonymousClass0fD.A0A(-792981801, A03);
                throw unsupportedOperationException;
            }
            AnonymousClass0fU.A00(new WBD(vwc, reelDashboardFragment, i2), igImageView);
        } else {
            TextView textView = ((C17254VOh) DbT.A0o(view)).A00;
            textView.setText(tzn.A03);
            textView.setBackground(tzn.A00);
        }
        AnonymousClass0fD.A0A(1432704387, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A0C;
        int i2;
        int A03 = AnonymousClass0fD.A03(-1911671666);
        if (i == 0) {
            A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.reel_dashboard_section_title);
            A0C.setTag(new C17254VOh((TextView) A0C));
            i2 = 1697268621;
        } else if (i == 1) {
            A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.reel_dashboard_section_title_with_cta);
            A0C.setTag(new VYJ(A0C));
            i2 = -2003594039;
        } else if (i == 2) {
            A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.reel_dashboard_section_title_with_info_icon);
            0qQ.A0A(A0C);
            A0C.setTag(new VWF(A0C));
            i2 = -50020973;
        } else if (i == 3) {
            A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.reel_dashboard_section_title_with_subtitle);
            0qQ.A0A(A0C);
            A0C.setTag(new VWG(A0C));
            i2 = 578227036;
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
            AnonymousClass0fD.A0A(1516527383, A03);
            throw unsupportedOperationException;
        }
        AnonymousClass0fD.A0A(i2, A03);
        return A0C;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }
}
