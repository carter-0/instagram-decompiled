package X;

import com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel;
import com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PaP  reason: case insensitive filesystem */
public final class C73304PaP implements Runnable {
    public final /* synthetic */ C71067Oam A00;
    public final /* synthetic */ NHM A01;
    public final /* synthetic */ List A02;

    public C73304PaP(C71067Oam oam, NHM nhm, List list) {
        this.A00 = oam;
        this.A01 = nhm;
        this.A02 = list;
    }

    public final void run() {
        C71067Oam oam = this.A00;
        NHM nhm = this.A01;
        List list = this.A02;
        String str = nhm.A02;
        if (str == null) {
            str = "";
        }
        String str2 = nhm.A00;
        if (str2 == null) {
            str2 = "";
        }
        oam.A03 = new C68186N5b(str, str2);
        List list2 = oam.A0C;
        list2.clear();
        List<OHQ> list3 = nhm.A03;
        ArrayList A0r = AnonymousClass7TG.A0r(list3);
        for (OHQ ohq : list3) {
            long j = ohq.A01;
            String str3 = oam.A0A;
            String str4 = ohq.A02;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = ohq.A03;
            if (str5 == null) {
                str5 = "";
            }
            boolean z = ohq.A06;
            ArrayList<N3E> A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                Long l = ((N3E) next).A04;
                if (l != null && l.longValue() == j) {
                    A1C.add(next);
                }
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (N3E n3e : A1C) {
                Long l2 = n3e.A05;
                if (l2 != null) {
                    String obj = l2.toString();
                    String str6 = "";
                    if (obj == null) {
                        obj = str6;
                    }
                    String str7 = n3e.A08;
                    String str8 = n3e.A0A;
                    if (str8 != null) {
                        str6 = str8;
                    }
                    A1C2.add(new PollMessageVoterInfoViewModel(DbS.A0V(n3e.A09), obj, str7, str6));
                }
            }
            A0r.add(new PollMessageOptionViewModel(str3, str4, str5, A1C2, ohq.A00, j, z));
        }
        list2.addAll(A0r);
        List list4 = oam.A0B;
        list4.clear();
        if (oam.A0E) {
            int i = oam.A00;
            oam.A00 = i + 1;
            list4.add(new C68197N5m(i));
        }
        C71067Oam.A01(oam);
    }
}
