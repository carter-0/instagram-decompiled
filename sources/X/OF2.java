package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class OF2 {
    public List A00;
    public final UserSession A01;
    public final AnonymousClass0Ud A02;
    public final 05G A03;

    public OF2(Bundle bundle, UserSession userSession) {
        this.A01 = userSession;
        ArrayList arrayList = 0sn.A00;
        this.A00 = arrayList;
        02z A10 = DbS.A10(new C61078JwG((List) arrayList, 0));
        this.A03 = A10;
        this.A02 = 10b.A03(A10);
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("DirectThreadMemberPickFragment.THREAD_MEMBER");
            parcelableArrayList = parcelableArrayList == null ? arrayList : parcelableArrayList;
            this.A00 = parcelableArrayList;
            A10.FIA(new C61078JwG((List) parcelableArrayList, 0));
        }
    }
}
