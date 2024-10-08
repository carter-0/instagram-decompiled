package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;

public final class AOK implements View.OnClickListener {
    public final /* synthetic */ C3263576k A00;
    public final /* synthetic */ C69445Nlp A01;
    public final /* synthetic */ 2Er A02;
    public final /* synthetic */ C39758A7y A03;

    public AOK(C3263576k r1, C69445Nlp nlp, 2Er r3, C39758A7y a7y) {
        this.A03 = a7y;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = nlp;
    }

    public final void onClick(View view) {
        String C6C;
        int A05 = AnonymousClass0fD.A05(-120653337);
        AnonymousClass9H5 r1 = this.A03.A07;
        2Er r3 = this.A02;
        C3263576k r6 = this.A00;
        C69445Nlp nlp = this.A01;
        User user = (User) AnonymousClass7TE.A13(r3.BRZ());
        if (r3.BJz() instanceof MsysThreadId) {
            r3.BJz();
            C6C = "-1";
        } else {
            C6C = r3.C6C();
        }
        String str = "DEFAULT";
        C49936FFp fFp = new C49936FFp(r6, nlp, Boolean.valueOf(r3.isPending()), Boolean.valueOf(r3.CUG()), r1.A01.getModuleName(), "direct_thread", user.B6o().name(), C6C, "DEFAULT", str, AnonymousClass7TF.A0b(), user.BIW());
        Fragment fragment = r1.A00;
        FragmentActivity requireActivity = fragment.requireActivity();
        UserSession userSession = r1.A02;
        C48887Eln.A00(requireActivity, fragment, fragment.requireActivity(), userSession, new C49475EwG(r3.AZs().contains(userSession.A06), r3.C6a()), (C331157Pu) null, (C331127Pr) null, user, fFp, (C51922G7q) null, (G8B) null);
        AnonymousClass0fD.A0C(-580002893, A05);
    }
}
