package X;

import android.content.res.Resources;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import java.util.ArrayList;

public final class NcO extends C16744V4b {
    public final /* synthetic */ C72918PPc A00;
    public final /* synthetic */ ON1 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public NcO(C72918PPc pPc, ON1 on1, String str, String str2) {
        this.A00 = pPc;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = on1;
    }

    public final void A03() {
        C72918PPc pPc = this.A00;
        DirectSearchInboxFragment directSearchInboxFragment = pPc.A0S;
        Integer num = AnonymousClass05K.A0K;
        1aq r5 = 1as.A04.A01;
        Resources resources = pPc.A0M.getResources();
        AnonymousClass9B9.A00();
        directSearchInboxFragment.A04(r5.A03(resources.getString(2131960273), this.A03, this.A02, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, this.A01.A01, 36, -1), num);
    }
}
