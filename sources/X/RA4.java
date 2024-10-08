package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class RA4 extends 0ng {
    public final /* synthetic */ T7A A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RA4(T7A t7a) {
        super(804, 3, false, false);
        this.A00 = t7a;
    }

    public final void run() {
        S35 A002;
        long j;
        C8893REk rEk;
        T7A t7a = this.A00;
        11Z.A05("This operation can't be run on UI thread.");
        C11325SNb sNb = t7a.A01;
        1Uk r6 = sNb.A04;
        HashMap Aan = r6.Aan();
        LinkedHashSet<S35> A0y = DbS.A0y();
        Iterator A0s = AnonymousClass7TF.A0s(Aan);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            String A13 = DbT.A13(A1J);
            Object value = A1J.getValue();
            if (value instanceof String) {
                S35 A003 = C11325SNb.A00((String) value);
                if (A003 != null) {
                    A0y.add(A003);
                }
            } else {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("found invalid value: ");
                A1A.append(A13);
                0wb.A03("IgVideoCacheStore", AnonymousClass7TG.A0m(value, " : ", A1A));
            }
            1W3 AR0 = r6.AR0();
            AR0.A06(A13);
            AR0.A03();
        }
        LinkedHashSet A0y2 = DbS.A0y();
        long currentTimeMillis = System.currentTimeMillis();
        for (S35 s35 : A0y) {
            long j2 = s35.A00;
            if (1 > j2 || j2 >= currentTimeMillis) {
                long j3 = s35.A01;
                String str = s35.A02;
                boolean z = s35.A04;
                boolean z2 = s35.A05;
                if (z) {
                    j = t7a.A00;
                } else {
                    if (!z2) {
                        if (str.equals("feed_timeline")) {
                            rEk = C8893REk.MAIN_FEED;
                        } else if (C66580MXl.A1a("reel", 1, str)) {
                            rEk = C8893REk.STORY;
                        } else if (C66580MXl.A1a("clips", 1, str)) {
                            rEk = C8893REk.CLIPS;
                        } else if (str.equals(AnonymousClass000.A00(1329))) {
                            rEk = C8893REk.EXPLORE;
                        } else if (C66580MXl.A1a("feed_contextual", 1, str) || C66580MXl.A1a("explore_video_chaining", 1, str) || C66580MXl.A1a(C273654mx.A00(2330), 1, str)) {
                            rEk = C8893REk.CONTEXTUAL_FEED;
                        } else if (00l.A0d(str, "igtv", false)) {
                            rEk = C8893REk.IGTV;
                        } else {
                            rEk = C8893REk.OTHER;
                        }
                        Number A14 = C51966G9m.A14(rEk, t7a.A03);
                        if (A14 != null) {
                            j = A14.longValue();
                        }
                    }
                    j = T7A.A05;
                }
                if (currentTimeMillis - j3 < j) {
                }
            }
            A0y2.add(s35.A03);
        }
        if (!A0y2.isEmpty()) {
            1wS r0 = t7a.A02;
            List A0a = 00k.A0a(A0y2);
            29t r02 = r0.A00.A06;
            if (r02 != null) {
                r02.A06(A0a);
            }
            Iterator it = A0y2.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                1W3 AR02 = r6.AR0();
                AR02.A06(A18);
                AR02.A03();
            }
        }
        11Z.A05("This operation can't be run on UI thread.");
        int size = r6.getSize();
        int i = sNb.A03;
        if (size > i) {
            HashMap Aan2 = r6.Aan();
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator A0s2 = AnonymousClass7TF.A0s(Aan2);
            while (A0s2.hasNext()) {
                Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
                String A132 = DbT.A13(A1J2);
                Object value2 = A1J2.getValue();
                if (!(value2 instanceof String) || (A002 = C11325SNb.A00((String) value2)) == null) {
                    1W3 AR03 = r6.AR0();
                    AR03.A06(A132);
                    AR03.A03();
                } else {
                    A1C.add(A002);
                }
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            Iterator it2 = A1C.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (0qQ.A0K(((S35) next).A02, C273654mx.A00(140))) {
                    A1C2.add(next);
                } else {
                    A1C3.add(next);
                }
            }
            ArrayList A1C4 = AnonymousClass7TE.A1C();
            ArrayList A1C5 = AnonymousClass7TE.A1C();
            Iterator it3 = A1C3.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (0qQ.A0K(((S35) next2).A02, AnonymousClass000.A00(362))) {
                    A1C4.add(next2);
                } else {
                    A1C5.add(next2);
                }
            }
            ArrayList A1C6 = AnonymousClass7TE.A1C();
            ArrayList A1C7 = AnonymousClass7TE.A1C();
            Iterator it4 = A1C5.iterator();
            while (it4.hasNext()) {
                Object next3 = it4.next();
                if (((S35) next3).A04) {
                    A1C6.add(next3);
                } else {
                    A1C7.add(next3);
                }
            }
            1W3 AR04 = r6.AR0();
            0qQ.A0A(AR04);
            double d = (double) i;
            double d2 = sNb.A02;
            C11325SNb.A01(AR04, A1C4, (int) (d * d2));
            double d3 = sNb.A00;
            C11325SNb.A01(AR04, A1C2, (int) (d * d3));
            double d4 = sNb.A01;
            C11325SNb.A01(AR04, A1C6, (int) (d * d4));
            C11325SNb.A01(AR04, A1C7, (int) (d * (((1.0d - d3) - d4) - d2)));
            AR04.A03();
        }
    }
}
