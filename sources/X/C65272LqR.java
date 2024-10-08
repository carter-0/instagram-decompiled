package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import java.util.List;

/* renamed from: X.LqR  reason: case insensitive filesystem */
public final class C65272LqR implements C51870G5h {
    public final /* synthetic */ K66 A00;
    public final /* synthetic */ C62320sa A01;

    public C65272LqR(K66 k66, C62320sa r2) {
        this.A00 = k66;
        this.A01 = r2;
    }

    public final void Erb(List list, String str) {
        K66 k66 = this.A00;
        AnonymousClass3Q2 A02 = C61829KNs.A02(k66);
        if (A02 != null) {
            C62320sa r1 = this.A01;
            2YL A0H = DbS.A0H(k66.A0Q);
            Context requireContext = k66.requireContext();
            FragmentActivity requireActivity = k66.requireActivity();
            C293505kq A002 = ClipsSharingDraftViewModel.A00(k66);
            AnonymousClass7TE.A1Z(new C66152MEu(requireContext, requireActivity, A0H, A02, list, A002, str, (AnonymousClass4D7) null, 1), C318116oQ.A00(A0H));
            r1.invoke();
        }
    }
}
