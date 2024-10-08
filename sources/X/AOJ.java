package X;

import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.BitSet;
import java.util.HashMap;

public final class AOJ implements View.OnClickListener {
    public final /* synthetic */ C391629tO A00;
    public final /* synthetic */ AnonymousClass7SZ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public AOJ(C391629tO r1, AnonymousClass7SZ r2, String str, String str2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-303565974);
        AnonymousClass7SZ r1 = this.A01;
        C391629tO r6 = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        0qQ.A0B(r6, 0);
        AnonymousClass9H7 r4 = r1.A00;
        UserSession userSession = r4.A10;
        AnonymousClass4DU r8 = r4.A1Q;
        0qQ.A0B(r8, 6);
        C3265677h.A05(r6, (C391549tG) null, r8, userSession, AnonymousClass7SZ.A00(r1), str2, 2, r4.A0b instanceof MsysThreadId, false);
        C40241AXf aXf = C40241AXf.A00;
        FragmentActivity requireActivity = r4.A0u.requireActivity();
        C229382nI A012 = C229382nI.A01((SparseArray) null, requireActivity, aXf, userSession);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        BitSet bitSet = new BitSet(1);
        A1E.put("appealable_entity_id", str);
        bitSet.set(0);
        A1E.put(AnonymousClass000.A00(305), str2);
        INE ine = new INE(2);
        if (bitSet.nextClearBit(0) >= 1) {
            FBO A002 = HX9.A00("com.bloks.www.xfac.lightweight.intervention");
            A002.A04 = C359608dC.A01(A1E);
            A002.A03 = A1E2;
            A002.A02 = ine;
            A002.A01(requireActivity, A012);
            AnonymousClass0fD.A0C(-1010961018, A05);
            return;
        }
        throw AnonymousClass7TE.A0z("Missing Required Props");
    }
}
