package X;

import android.os.Bundle;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import java.util.ArrayList;

/* renamed from: X.NcN  reason: case insensitive filesystem */
public final class C68991NcN extends C16744V4b {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C72918PPc A02;

    public C68991NcN(C72918PPc pPc, int i, int i2) {
        this.A02 = pPc;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void A03() {
        C72918PPc pPc = this.A02;
        DirectSearchInboxFragment directSearchInboxFragment = pPc.A0S;
        Integer num = AnonymousClass05K.A01;
        String string = pPc.A0M.getResources().getString(2131964292);
        String str = pPc.A08;
        int i = this.A01;
        int i2 = this.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Bundle A0A = DbY.A0A(string);
        A0A.putString(AnonymousClass000.A00(104), string);
        A0A.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", "");
        A0A.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MNET_REQUEST_ID", str);
        A0A.putInt(AnonymousClass000.A00(430), 29);
        A0A.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX", i);
        A0A.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SECTION_POSITION", i2);
        A0A.putParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_RESHARED_CONTENT", A1C);
        A0A.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_NEXT_OFFSET", "");
        directSearchInboxFragment.A04(A0A, num);
    }
}
