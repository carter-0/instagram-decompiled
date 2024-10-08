package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.OiO  reason: case insensitive filesystem */
public final class C71317OiO implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass7E8 A00;
    public final /* synthetic */ C68014Myg A01;

    public C71317OiO(AnonymousClass7E8 r1, C68014Myg myg) {
        this.A00 = r1;
        this.A01 = myg;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1523739566);
        AnonymousClass7E8 r3 = this.A00;
        MessageIdentifier messageIdentifier = r3.A03;
        if (messageIdentifier != null) {
            C68014Myg myg = this.A01;
            C332807Wl r4 = myg.A04;
            if (r4 != null) {
                r4.Etu(r3.A02, messageIdentifier, "multi_react_pill", r3.A00, r3.A05);
            }
            view.performHapticFeedback(3);
            0nA.A0N(view);
            AnonymousClass7D5 r0 = myg.A03;
            String str = messageIdentifier.A01;
            String str2 = r3.A04;
            0Aj A0e = AnonymousClass7TE.A0e(r0.A00, "direct_message_multi_react_add_pill");
            if (A0e.isSampled()) {
                DbS.A1J(A0e, "tap");
                A0e.AAJ("message_id", str);
                C66580MXl.A1K(A0e, str2);
                A0e.Cgf();
            }
        }
        AnonymousClass0fD.A0C(421583386, A05);
    }
}
