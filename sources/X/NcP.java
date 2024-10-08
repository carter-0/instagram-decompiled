package X;

import android.content.res.Resources;
import android.os.Bundle;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectSearchResult;
import java.util.ArrayList;
import java.util.Iterator;

public final class NcP extends C16744V4b {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C72918PPc A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ ArrayList A04;

    public NcP(C72918PPc pPc, Object obj, String str, ArrayList arrayList, int i) {
        this.A01 = pPc;
        this.A04 = arrayList;
        this.A03 = str;
        this.A02 = obj;
        this.A00 = i;
    }

    public final void A03() {
        int i;
        ArrayList arrayList = this.A04;
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                C72918PPc pPc = this.A01;
                C72200OyM.A00(pPc.A0Q).A05(pPc.A0R.A06, "thread_list", "universal_search_cta", false);
                break;
            }
            DirectSearchResult directSearchResult = (DirectSearchResult) it.next();
            if ((directSearchResult instanceof DirectMessageSearchMessage) && ((DirectMessageSearchMessage) directSearchResult).A00()) {
                break;
            }
        }
        C72918PPc pPc2 = this.A01;
        DirectSearchInboxFragment directSearchInboxFragment = pPc2.A0S;
        Integer num = AnonymousClass05K.A06;
        Resources resources = pPc2.A0M.getResources();
        String str = this.A03;
        String A0e = AnonymousClass7TF.A0e(resources, str, 2131964280);
        Object obj = this.A02;
        if (obj instanceof Integer) {
            i = AnonymousClass7TE.A0M(obj);
        }
        int i2 = this.A00;
        Bundle A0A = DbY.A0A(A0e);
        A0A.putString(AnonymousClass000.A00(104), A0e);
        A0A.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", str);
        A0A.putParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGES", arrayList);
        A0A.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX", i2);
        A0A.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_NEXT_OFFSET", i);
        directSearchInboxFragment.A04(A0A, num);
    }
}
