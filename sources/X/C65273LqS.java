package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.LqS  reason: case insensitive filesystem */
public final class C65273LqS implements C51870G5h {
    public final /* synthetic */ C369968vc A00;
    public final /* synthetic */ K57 A01;

    public C65273LqS(C369968vc r1, K57 k57) {
        this.A01 = k57;
        this.A00 = r1;
    }

    public final void Erb(List list, String str) {
        K57 k57 = this.A01;
        2YL A0H = DbS.A0H(k57.A0E);
        C369968vc r6 = this.A00;
        LO6 lo6 = new LO6(k57.requireActivity(), AnonymousClass07i.A00(k57.requireActivity()), AnonymousClass7TE.A0l(k57.A0I));
        Context requireContext = k57.requireContext();
        FragmentActivity requireActivity = k57.requireActivity();
        AnonymousClass7TE.A1Z(new C66180MGr(A0H, r6, lo6, requireContext, requireActivity, list, str, (AnonymousClass4D7) null, 1), C318116oQ.A00(A0H));
        C59689JTv.A07(k57.requireContext(), 2131973117);
    }
}
