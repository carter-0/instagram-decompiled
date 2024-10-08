package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.K9o  reason: case insensitive filesystem */
public final class C61483K9o extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final IngestSessionShim A03;
    public final L1J A04;
    public final C381779cJ A05;
    public final MTF A06;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C61483K9o(Context context, AnonymousClass0iw r4, UserSession userSession, IngestSessionShim ingestSessionShim, L1J l1j, C381779cJ r8, MTF mtf) {
        17k.A0G(ingestSessionShim.A00.size() != 1 ? false : true, "Blast lists only supports one media send for now");
        this.A00 = context;
        this.A02 = userSession;
        this.A06 = mtf;
        this.A03 = ingestSessionShim;
        this.A04 = l1j;
        this.A05 = r8;
        this.A01 = r4;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(749869345);
        L4T l4t = (L4T) obj;
        Set set = l4t.A01;
        Set unmodifiableSet = Collections.unmodifiableSet(set);
        0qQ.A07(unmodifiableSet);
        LMN A012 = this.A06.AXA().A01(C61002Juy.A04);
        L8C l8c = (L8C) DbT.A0o(view);
        C65298Lqr lqr = new C65298Lqr(this, unmodifiableSet);
        C64162LRd lRd = l8c.A03;
        Set unmodifiableSet2 = Collections.unmodifiableSet(set);
        0qQ.A07(unmodifiableSet2);
        lRd.A04(A012, lqr, unmodifiableSet2.size());
        TextView textView = l8c.A02;
        DbX.A13(textView.getContext(), textView, l4t.A00, 2131960312);
        AnonymousClass0fD.A0A(286810593, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-164377399);
        UserSession userSession = this.A02;
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.recipient_picker_blast_list_candidates);
        A0C.setTag(new L8C(A0C, userSession));
        AnonymousClass0fD.A0A(-691841118, A032);
        return A0C;
    }
}
