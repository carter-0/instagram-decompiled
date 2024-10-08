package X;

import android.content.Context;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

public final class OMI {
    public final /* synthetic */ C69094NeZ A00;

    public OMI(C69094NeZ neZ) {
        this.A00 = neZ;
    }

    public final void A00() {
        C69094NeZ neZ = this.A00;
        N9F n9f = neZ.A00;
        if (n9f != null) {
            String str = n9f.A05;
            if (str != null) {
                C70320O1y.A00(neZ.A04);
                OWf.A00(str, 15);
            }
            neZ.A06.A03(new C72812PLa("Open thread"));
            Context context = neZ.A03;
            0kR.A00.A07().A0G(context, F5W.A01(context, neZ.A04.A06, n9f.A04, (String) null, "via_push_notification", (String) null, (List) null));
        }
    }

    public final void A01(int i) {
        String str;
        C69094NeZ neZ = this.A00;
        String A16 = AnonymousClass7TE.A16(neZ.A03, i);
        N9F n9f = neZ.A00;
        if (!(n9f == null || (str = n9f.A04) == null)) {
            C333527Zh.A00(neZ.A04).EMr((C254933tI) null, new DirectThreadKey(str, (List) null), A16, NetInfoModule.CONNECTION_TYPE_NONE, (String) null, false);
        }
        A00();
    }
}
