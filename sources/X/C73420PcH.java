package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.fragment.DirectSearchInboxSeeAllFragment;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.PcH  reason: case insensitive filesystem */
public final /* synthetic */ class C73420PcH implements Runnable {
    public final /* synthetic */ DirectSearchInboxSeeAllFragment A00;

    public /* synthetic */ C73420PcH(DirectSearchInboxSeeAllFragment directSearchInboxSeeAllFragment) {
        this.A00 = directSearchInboxSeeAllFragment;
    }

    public static void A00(ViewModelListUpdate viewModelListUpdate, Integer num) {
        viewModelListUpdate.A00(new C71982OuE((C16744V4b) null, num, AnonymousClass05K.A0N, (Object) null));
    }

    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        C47765EGc eGc;
        DirectSearchInboxSeeAllFragment directSearchInboxSeeAllFragment = this.A00;
        ViewModelListUpdate A0R = DbS.A0R();
        ArrayList arrayList = directSearchInboxSeeAllFragment.A0F;
        if (!directSearchInboxSeeAllFragment.A0R || arrayList == null || arrayList.isEmpty()) {
            ArrayList arrayList2 = directSearchInboxSeeAllFragment.A0G;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i = 0;
                i2 = 0;
            } else {
                A00(A0R, AnonymousClass05K.A0j);
                A0R.A01(C48843El5.A00(directSearchInboxSeeAllFragment.A06, directSearchInboxSeeAllFragment.A09, arrayList2, 15, 0, directSearchInboxSeeAllFragment.A02, 0, false, false, false));
                i = arrayList2.size();
                i2 = 1;
            }
            ArrayList arrayList3 = directSearchInboxSeeAllFragment.A0K;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i5 = 16;
                if (directSearchInboxSeeAllFragment.A0S) {
                    i5 = 24;
                }
                A00(A0R, AnonymousClass05K.A1I);
                ArrayList arrayList4 = arrayList3;
                A0R.A01(FYR.A00(arrayList4, i5, i, directSearchInboxSeeAllFragment.A02, i2, directSearchInboxSeeAllFragment.A0T));
                i += arrayList3.size();
                i2++;
            }
            ArrayList arrayList5 = directSearchInboxSeeAllFragment.A0H;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                A00(A0R, AnonymousClass05K.A03);
                A0R.A01(FYR.A00(arrayList5, 17, i, directSearchInboxSeeAllFragment.A02, i2, false));
                i += arrayList5.size();
                i2++;
            }
            ArrayList arrayList6 = directSearchInboxSeeAllFragment.A0J;
            if (arrayList6 == null || arrayList6.isEmpty()) {
                i3 = i2;
            } else {
                A00(A0R, AnonymousClass05K.A04);
                i3 = i2 + 1;
                A0R.A01(FYR.A00(arrayList6, 22, i, directSearchInboxSeeAllFragment.A02, i2, directSearchInboxSeeAllFragment.A0T));
                i += arrayList6.size();
            }
            ArrayList arrayList7 = directSearchInboxSeeAllFragment.A0I;
            if (arrayList7 != null && !arrayList7.isEmpty()) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                Iterator it = arrayList7.iterator();
                while (it.hasNext()) {
                    DirectShareTarget A0f = DbT.A0f(it);
                    Boolean bool = A0f.A0C;
                    if (bool == null || !bool.booleanValue()) {
                        A1C2.add(A0f);
                    } else {
                        A1C.add(A0f);
                    }
                }
                if (!A1C.isEmpty()) {
                    A00(A0R, AnonymousClass05K.A0H);
                    i4 = i3 + 1;
                    A0R.A01(C48843El5.A00(directSearchInboxSeeAllFragment.A06, (C251033mS) null, A1C, 37, i, directSearchInboxSeeAllFragment.A02, i3, false, false, directSearchInboxSeeAllFragment.A0U));
                    i += A1C.size();
                } else {
                    i4 = i3;
                }
                if (!A1C2.isEmpty()) {
                    A00(A0R, AnonymousClass05K.A0I);
                    UserSession userSession = directSearchInboxSeeAllFragment.A06;
                    i3 = i4 + 1;
                    UserSession userSession2 = userSession;
                    A0R.A01(C48843El5.A00(userSession2, (C251033mS) null, A1C2, 37, i, directSearchInboxSeeAllFragment.A02, i4, false, false, directSearchInboxSeeAllFragment.A0U));
                    i += A1C2.size();
                } else {
                    i3 = i4;
                }
            }
            ArrayList arrayList8 = directSearchInboxSeeAllFragment.A0E;
            if (arrayList8 != null && !arrayList8.isEmpty()) {
                A0R.A01(FYR.A00(arrayList8, 36, i, directSearchInboxSeeAllFragment.A02, i3, false));
            }
        } else {
            A0R.A01(FYR.A00(arrayList, 33, 0, directSearchInboxSeeAllFragment.A02, 0, false));
            arrayList.size();
        }
        C337257fy r4 = directSearchInboxSeeAllFragment.A0B;
        if (r4 != null) {
            if (r4.isLoading()) {
                eGc = new C47765EGc(directSearchInboxSeeAllFragment.A04.getString(2131972868), directSearchInboxSeeAllFragment.A00, true);
            } else if (r4.CT5()) {
                eGc = new C47765EGc(DbW.A0h(directSearchInboxSeeAllFragment.A04, directSearchInboxSeeAllFragment.A0D, 2131972817), directSearchInboxSeeAllFragment.A00, false);
            }
            A0R.A00(eGc);
        }
        directSearchInboxSeeAllFragment.A05.A05(A0R);
    }
}
