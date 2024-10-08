package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.instagram.android.R;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.H0h  reason: case insensitive filesystem */
public final class C54137H0h extends AnonymousClass4DH implements AnonymousClass4DS, JO8 {
    public static final String __redex_internal_original_name = "IgMediaDebugFragment";
    public String A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131965899);
    }

    public final String getModuleName() {
        return "media_debug";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        String obj;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("media_id", "");
        String str = "Unknown";
        String string2 = requireArguments.getString(Py2.A00(), str);
        AnonymousClass0eM r10 = this.A01;
        1Xj A02 = DbX.A0d(r10).A02(string);
        if (A02 != null) {
            boolean A03 = 1UX.A00(requireContext(), AnonymousClass7TE.A0l(r10)).A03(string);
            int i = requireArguments.getInt("position", -1);
            User A2A = A02.A2A(AnonymousClass7TE.A0l(r10));
            if (A2A != null) {
                C55629Hko hko = new C55629Hko("Handle", A2A.getUsername());
                0qQ.A0A(string2);
                C55629Hko hko2 = new C55629Hko("MainSession Id", string2);
                String str2 = A02.A0R;
                if (str2 != null) {
                    str = str2;
                }
                C55629Hko hko3 = new C55629Hko("Request Id", str);
                String id = A02.getId();
                if (id != null) {
                    C55629Hko hko4 = new C55629Hko("Media Id", id);
                    C55629Hko hko5 = new C55629Hko("Delivery Method", C243413Yr.A01(A02.A0e));
                    C55629Hko hko6 = new C55629Hko("Position", String.valueOf(i));
                    long currentTimeMillis = System.currentTimeMillis();
                    Long BLM = A02.A0C.BLM();
                    if (BLM != null) {
                        j = BLM.longValue();
                    } else {
                        j = -1;
                    }
                    C55629Hko hko7 = new C55629Hko("Time Since Last Synced (MS)", String.valueOf(currentTimeMillis - j));
                    C55629Hko hko8 = new C55629Hko("Was Seen Previously", String.valueOf(A03));
                    1FI r0 = A02.A0D;
                    if (r0 != null) {
                        obj = String.valueOf(r0);
                    } else {
                        obj = 1FI.A0F.toString();
                    }
                    List<C55629Hko> A1P = 0sr.A1P(new C55629Hko[]{hko, hko2, hko3, hko4, hko5, hko6, hko7, hko8, new C55629Hko("Reason", obj)});
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    for (C55629Hko hko9 : A1P) {
                        A1A.append(hko9.A00);
                        A1A.append(": ");
                        A1A.append(hko9.A01);
                        A1A.append(10);
                        A1A.append(10);
                    }
                    this.A00 = A1A.toString();
                    AbsListView absListView = (AbsListView) view2.findViewById(R.id.debug_ad_view);
                    C54221H3q h3q = new C54221H3q(this, A1P);
                    if (absListView != null) {
                        absListView.setAdapter(h3q);
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void DjJ() {
        0nC.A00(requireContext(), this.A00);
        C59689JTv.A09(getContext(), getString(2131956743));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1314716815);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_sponsored_debug, false);
        AnonymousClass0fD.A09(-477737350, A02);
        return A0D;
    }
}
