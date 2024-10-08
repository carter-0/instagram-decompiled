package X;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class SSM {
    public static final String A09 = AnonymousClass389.A01("WorkContinuationImpl");
    public boolean A00;
    public C375689Eq A01;
    public final AnonymousClass385 A02;
    public final Integer A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public static boolean A01(SSM ssm, Set set) {
        List list = ssm.A05;
        set.addAll(list);
        HashSet A002 = A00(ssm);
        for (Object contains : set) {
            if (A002.contains(contains)) {
                return true;
            }
        }
        List<SSM> list2 = ssm.A06;
        if (list2 != null && !list2.isEmpty()) {
            for (SSM A012 : list2) {
                if (A01(A012, set)) {
                    return true;
                }
            }
        }
        set.removeAll(list);
        return false;
    }

    public final C375689Eq A02() {
        if (!this.A00) {
            TL8 tl8 = new TL8(new C375679Ep(), this);
            this.A02.A06.ATP(tl8);
            this.A01 = tl8.A00;
        } else {
            AnonymousClass389.A00();
            Pxf.A1L("Already enqueued work ids (", TextUtils.join(", ", this.A05), ")", A09);
        }
        return this.A01;
    }

    public SSM(AnonymousClass385 r7, Integer num, String str, List list, List list2) {
        this.A02 = r7;
        this.A04 = str;
        this.A03 = num;
        this.A07 = list;
        this.A06 = list2;
        this.A05 = C51970G9q.A0m(list);
        this.A08 = AnonymousClass7TE.A1C();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.A08.addAll(((SSM) it.next()).A08);
            }
        }
        int i = 0;
        while (i < list.size()) {
            if (num != AnonymousClass05K.A00 || ((C375659En) list.get(i)).A00.A09 == Long.MAX_VALUE) {
                String A10 = DbT.A10(((C375659En) list.get(i)).A02);
                this.A05.add(A10);
                this.A08.add(A10);
                i++;
            } else {
                throw AnonymousClass7TE.A0w("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
        }
    }

    public static HashSet A00(SSM ssm) {
        HashSet A1F = AnonymousClass7TE.A1F();
        List<SSM> list = ssm.A06;
        if (list != null && !list.isEmpty()) {
            for (SSM ssm2 : list) {
                A1F.addAll(ssm2.A05);
            }
        }
        return A1F;
    }

    public SSM() {
    }
}
