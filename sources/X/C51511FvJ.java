package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;

/* renamed from: X.FvJ  reason: case insensitive filesystem */
public final class C51511FvJ implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0aP A01;
    public final /* synthetic */ DwI A02;
    public final /* synthetic */ boolean A03;

    public C51511FvJ(FragmentActivity fragmentActivity, AnonymousClass0aP r2, DwI dwI, boolean z) {
        this.A02 = dwI;
        this.A03 = z;
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public final void run() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, this.A02.A07);
        boolean z = this.A03;
        if (z) {
            A1E.put("present_as_modal", String.valueOf(z));
            C46649DiU A04 = C46649DiU.A04("com.instagram.account_security.contact_form", A1E);
            FragmentActivity fragmentActivity = this.A00;
            AnonymousClass0aP r3 = this.A01;
            IgBloksScreenConfig A0N = DbS.A0N(r3);
            A0N.A0k = false;
            A0N.A0P = AnonymousClass05K.A01;
            AnonymousClass3M3 A0C = A04.A0C(fragmentActivity, A0N);
            C309516Yo A0M = DbS.A0M(fragmentActivity, r3);
            A0M.A0E = true;
            0qQ.A0A(A0C);
            A0M.A0D(A0C);
            A0M.A04();
            return;
        }
        C46649DiU A042 = C46649DiU.A04("com.instagram.account_security.contact_form", A1E);
        FragmentActivity fragmentActivity2 = this.A00;
        IgBloksScreenConfig A0N2 = DbS.A0N(this.A01);
        A0N2.A0k = false;
        C46649DiU.A07(fragmentActivity2, A0N2, A042);
    }
}
