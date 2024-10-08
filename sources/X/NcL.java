package X;

import android.content.res.Resources;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import java.util.ArrayList;
import java.util.List;

public final class NcL extends C16744V4b {
    public final /* synthetic */ C72918PPc A00;
    public final /* synthetic */ List A01;

    public NcL(C72918PPc pPc, List list) {
        this.A00 = pPc;
        this.A01 = list;
    }

    public final void A03() {
        C72918PPc pPc = this.A00;
        DirectSearchInboxFragment directSearchInboxFragment = pPc.A0S;
        Integer num = AnonymousClass05K.A0K;
        1aq r6 = 1as.A04.A01;
        Resources resources = pPc.A0M.getResources();
        AnonymousClass9B9.A00();
        directSearchInboxFragment.A04(r6.A03(resources.getString(2131960273), "", pPc.A08, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, AnonymousClass7TE.A1D(this.A01), 36, -1), num);
    }
}
