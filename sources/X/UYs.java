package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class UYs extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "UpcomingEventNotFoundBottomSheetFragment";
    public C17719Vco A00;
    public VXG A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "upcoming_event_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = new C17719Vco(view);
        UserSession A0l = AnonymousClass7TE.A0l(this.A02);
        VXG vxg = this.A01;
        if (vxg == null) {
            str = "viewModel";
        } else {
            C17719Vco vco = this.A00;
            if (vco == null) {
                str = "viewHolder";
            } else {
                0qQ.A0B(A0l, 0);
                Context context = vco.A03.getContext();
                vco.A06.setText(vxg.A02);
                vco.A01.setVisibility(8);
                TextView textView = vco.A05;
                0qQ.A0A(context);
                textView.setText(C14240TsN.A02(context, A0l, vxg.A00));
                vco.A0D.setVisibility(8);
                vco.A09.setVisibility(0);
                vco.A0A.setImageResource(R.drawable.instagram_calendar_pano_outline_24);
                vco.A0B.setVisibility(8);
                TextView textView2 = vco.A04;
                textView2.setVisibility(0);
                DbX.A13(context, textView2, vxg.A01, 2131976015);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(1555682146);
        UYs.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(AnonymousClass000.A00(4154));
        if (string != null) {
            long j = requireArguments.getLong(AnonymousClass000.A00(4155));
            String string2 = requireArguments.getString(AnonymousClass000.A00(4153));
            if (string2 != null) {
                this.A01 = new VXG(string, j, string2);
                AnonymousClass0fD.A09(1037580780, A022);
                return;
            }
            illegalStateException = new IllegalStateException("event creator username required");
            i = 197118167;
        } else {
            illegalStateException = new IllegalStateException("event name required");
            i = -458001376;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1590322372);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_upcoming_event_bottom_sheet, false);
        AnonymousClass0fD.A09(192176260, A022);
        return A0D;
    }
}
