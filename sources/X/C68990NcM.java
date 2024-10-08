package X;

import android.os.Bundle;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;

/* renamed from: X.NcM  reason: case insensitive filesystem */
public final class C68990NcM extends C16744V4b {
    public final /* synthetic */ C72918PPc A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C68990NcM(C72918PPc pPc, String str, String str2) {
        this.A00 = pPc;
        this.A02 = str;
        this.A01 = str2;
    }

    public final void A03() {
        DirectSearchInboxFragment directSearchInboxFragment = this.A00.A0S;
        Integer num = AnonymousClass05K.A00;
        String str = this.A02;
        String str2 = this.A01;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", str);
        A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MNET_REQUEST_ID", str2);
        directSearchInboxFragment.A04(A0a, num);
    }
}
