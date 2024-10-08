package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.business.PublicPhoneContact;
import java.io.IOException;

/* renamed from: X.Fpl  reason: case insensitive filesystem */
public final class C51175Fpl implements Runnable {
    public final /* synthetic */ C47492E4w A00;

    public C51175Fpl(C47492E4w e4w) {
        this.A00 = e4w;
    }

    public final void run() {
        String str;
        Fragment fragment = this.A00;
        Context requireContext = fragment.requireContext();
        0gy A002 = AnonymousClass07i.A00(fragment);
        UserSession userSession = fragment.A05;
        PublicPhoneContact submitPublicPhoneContact = fragment.A03.getSubmitPublicPhoneContact();
        0qQ.A0B(userSession, 2);
        String str2 = null;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("business/account/validate_phone_number/");
        A0a.A0R = true;
        if (!(submitPublicPhoneContact == null || (str = submitPublicPhoneContact.A02) == null || str.length() == 0)) {
            try {
                str2 = C48992EnU.A00(submitPublicPhoneContact);
            } catch (IOException unused) {
                0wb.A03("edit_business_profile", "Couldn't serialize create business public phone contact");
            }
            A0a.A9m("public_phone_contact", str2);
        }
        A0a.A0P(new C64842Lj4(C375889Fq.A00, new FVE(1)));
        1OC A0M = A0a.A0M();
        EDV.A00(A0M, requireContext, fragment, 10);
        1ES.A00(requireContext, A002, A0M);
    }
}
