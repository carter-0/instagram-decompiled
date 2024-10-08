package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Lv  reason: invalid class name and case insensitive filesystem */
public final class C354388Lv extends C361478gI {
    public C3499582p A00;
    public boolean A01;
    public final UserSession A02;
    public final C3501583m A03;
    public final List A04;
    public final List A05;
    public final List A06 = new ArrayList();
    public final 05G A07;
    public final AnonymousClass0Ud A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C354388Lv(Application application, UserSession userSession, C3501583m r9) {
        super(application);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r9, 3);
        this.A02 = userSession;
        this.A03 = r9;
        ArrayList arrayList = new ArrayList(C353948Ka.A00(userSession).A02(true));
        this.A04 = arrayList;
        02z r1 = new 02z(new C354398Lw(AnonymousClass05K.A0N, 0.0f, 0, 0));
        this.A07 = r1;
        this.A08 = r1;
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            arrayList2.add(new 0eP(Integer.valueOf(intValue), C353948Ka.A00(this.A02).A01(intValue).A04));
        }
        this.A05 = arrayList2;
    }

    public static final void A00(C354388Lv r4, 0sL r5, int i) {
        C64168LRo A002 = C59953JcJ.A00(r4.A02);
        Application application = r4.A00;
        0qQ.A0C(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        List singletonList = Collections.singletonList(new C63695L3f(new C40287AZc(r4, r5), i));
        0qQ.A07(singletonList);
        A002.A07(application, singletonList);
    }
}
