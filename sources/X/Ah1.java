package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

public final class Ah1 implements C51922G7q {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ A44 A02;
    public final /* synthetic */ AnonymousClass2Ep A03;
    public final /* synthetic */ MessageIdentifier A04;

    public final void onDismiss() {
    }

    public Ah1(FragmentActivity fragmentActivity, UserSession userSession, A44 a44, AnonymousClass2Ep r4, MessageIdentifier messageIdentifier) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = r4;
        this.A02 = a44;
        this.A04 = messageIdentifier;
    }

    public final void D84() {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass7TG.A1N(fragmentActivity, userSession);
        new C67100MiK(fragmentActivity, userSession).A03(this.A03.BJy(), AnonymousClass05K.A01);
    }

    public final void De2() {
        A44 a44 = this.A02;
        if (a44 != null) {
            MessageIdentifier messageIdentifier = this.A04;
            C332637Vu r2 = a44.A00;
            ((C332807Wl) r2.A0E.invoke()).EGD(messageIdentifier, AnonymousClass7TF.A1V(r2.A0G.invoke()));
        }
    }
}
