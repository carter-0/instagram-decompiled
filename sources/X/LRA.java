package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LRA {
    public final Context A00;
    public final C355608Qq A01;
    public final AnonymousClass2t9 A02;
    public final UserSession A03;
    public final C328767Gd A04;
    public final C361698ge A05;
    public final LinkedHashMap A06;

    public LRA(Context context, C355608Qq r17, UserSession userSession, C328767Gd r19, C361698ge r20) {
        C328767Gd r1 = r19;
        UserSession userSession2 = userSession;
        DbW.A1N(userSession2, 2, r1);
        Context context2 = context;
        this.A00 = context2;
        this.A03 = userSession2;
        this.A05 = r20;
        this.A01 = r17;
        this.A04 = r1;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context2);
        UserSession userSession3 = this.A03;
        Integer num = AnonymousClass05K.A01;
        A002.A01(new C362508i1(new AnonymousClass9IV(4, (Object) new C376529Ii(num, num, num, (Integer) null, 24), (Object) new C376509Ig(num, num, AnonymousClass05K.A00, Integer.valueOf(DbS.A04(0Tu.A05, userSession3, 36602080663900705L) != 24 ? 16 : 24))), (C348297yD) null, this.A01, userSession3, this.A05, (String) null, MKC.A00));
        A002.A08 = true;
        this.A02 = A002.A00();
        this.A06 = AnonymousClass7TE.A1H();
    }

    public final void A02(List list) {
        LinkedHashMap linkedHashMap = this.A06;
        linkedHashMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Medium A0W = JTO.A0W(it);
            int CMJ = this.A04.CMJ(A0W);
            Integer valueOf = Integer.valueOf(A0W.A05);
            String A002 = C362968io.A00.A00(A0W, this.A03);
            linkedHashMap.put(valueOf, new C361718gg(new AnonymousClass9I9((DefaultConstructorMarker) null, CMJ, 0, 12, 3, JTQ.A1O(CMJ, -1), false), JTR.A0f(A0W), new C362958in((Integer) null, (Integer) null, true, false, true, false, false, false, false), A002));
        }
        A01(this);
    }

    public static final void A00(Medium medium, LRA lra) {
        LRA lra2 = lra;
        LinkedHashMap linkedHashMap = lra2.A06;
        Medium medium2 = medium;
        if (linkedHashMap.containsKey(Integer.valueOf(medium2.A05))) {
            int CMJ = lra2.A04.CMJ(medium2);
            String A002 = C362968io.A00.A00(medium2, lra2.A03);
            C51967G9n.A1O(new C361718gg(new AnonymousClass9I9((DefaultConstructorMarker) null, CMJ, 0, 12, 3, JTQ.A1O(CMJ, -1), false), JTR.A0f(medium2), new C362958in((Integer) null, (Integer) null, true, false, true, false, false, false, false), A002), linkedHashMap, medium2.A05);
        }
    }

    public static final void A01(LRA lra) {
        ViewModelListUpdate A0R = DbS.A0R();
        Iterator A0t = AnonymousClass7TF.A0t(lra.A06);
        while (A0t.hasNext()) {
            A0R.A00((C361718gg) AnonymousClass7TF.A0a(A0t));
        }
        lra.A02.A05(A0R);
    }
}
