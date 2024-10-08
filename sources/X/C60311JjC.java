package X;

import com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JjC  reason: case insensitive filesystem */
public final class C60311JjC extends 2YL {
    public boolean A00;
    public final QP5 A01;
    public final LRN A02;
    public final C63582KzV A03;
    public final 2BJ A04;
    public final C63044KqZ A05;
    public final AppreciationGiftFeedRepository A06;
    public final C249513ju A07;
    public final AnonymousClass0r6 A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;

    public C60311JjC(QP5 qp5, LRN lrn, C63582KzV kzV, 2BJ r6, C63044KqZ kqZ, AppreciationGiftFeedRepository appreciationGiftFeedRepository) {
        0qQ.A0B(r6, 5);
        this.A06 = appreciationGiftFeedRepository;
        this.A05 = kqZ;
        this.A01 = qp5;
        this.A02 = lrn;
        this.A04 = r6;
        this.A03 = kzV;
        02z A012 = 106.A01(C64486Lcn.A00);
        this.A09 = A012;
        this.A0A = 10b.A03(A012);
        1HR A0w = G9w.A0w();
        this.A07 = A0w;
        this.A08 = 0u9.A04(A0w);
        MHA.A03(this, C318116oQ.A00(this), 40);
    }

    public final void setViewStateForTest(C66383MPp mPp) {
        0qQ.A0B(mPp, 0);
        this.A09.Epw(mPp);
    }

    public static final C53379Gn9 A00(C60311JjC jjC) {
        C66383MPp mPp = (C66383MPp) jjC.A09.getValue();
        if (C61137Jxn.A00(1, mPp)) {
            return (C53379Gn9) ((C61137Jxn) mPp).A01;
        }
        return null;
    }

    public static final List A01(C53379Gn9 gn9) {
        List<C60961JuJ> list;
        if (gn9 == null || (list = (List) gn9.A03) == null) {
            return null;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C60961JuJ juJ : list) {
            A0r.add(juJ.A06);
        }
        return A0r;
    }

    public static final boolean A02(List list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C61006Jv5) it.next()).A01 != -1) {
                return true;
            }
        }
        return false;
    }

    public final Long A03() {
        long j = this.A06.A00;
        if (j == -1) {
            return null;
        }
        return Long.valueOf(j);
    }
}
