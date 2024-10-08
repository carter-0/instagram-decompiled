package X;

import android.view.View;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Me0  reason: case insensitive filesystem */
public final class C66865Me0 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass7E5 A00;
    public final /* synthetic */ C66869Me5 A01;

    public C66865Me0(AnonymousClass7E5 r1, C66869Me5 me5) {
        this.A01 = me5;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(-708299178);
        C66869Me5 me5 = this.A01;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass7D5 r0 = me5.A09;
        AnonymousClass7E5 r4 = this.A00;
        MessageIdentifier messageIdentifier = r4.A09;
        if (messageIdentifier != null) {
            str = messageIdentifier.A01;
        } else {
            str = null;
        }
        String str2 = r4.A0C;
        0Aj A0e = AnonymousClass7TE.A0e(r0.A00, "direct_message_multi_react_reaction_pill");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, "tap");
            A0e.AAJ("message_id", str);
            C66580MXl.A1K(A0e, str2);
            A0e.Cgf();
        }
        C332807Wl r5 = me5.A0B;
        if (r5 != null) {
            long j = r4.A02;
            r5.DRi(r4.A08, messageIdentifier, r4.A0B, NetInfoModule.CONNECTION_TYPE_NONE, "multi_react_pill", (String) null, j, r4.A0E, r4.A0D);
        }
        AnonymousClass0fD.A0C(1014291212, A05);
    }
}
