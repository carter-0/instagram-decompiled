package X;

import android.view.View;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.rtc.statemodel.RtcSettingsParticipant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class PM9 implements C74361Ptb {
    public final View A00;
    public final OA7 A01;
    public final AnonymousClass0eM A02 = C73922Pm2.A01(this, 34);
    public final AnonymousClass0eM A03 = C73922Pm2.A01(this, 35);
    public final AnonymousClass0eM A04 = C73922Pm2.A01(this, 36);
    public final AnonymousClass0eM A05 = C73922Pm2.A01(this, 37);

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        boolean z;
        N9S n9s = (N9S) pry;
        0qQ.A0B(n9s, 0);
        if (n9s.A02) {
            JTS.A1W(this.A04, 0);
            ViewModelListUpdate A0R = DbS.A0R();
            List<RtcSettingsParticipant> list = n9s.A01;
            if (AnonymousClass7TE.A1b(list)) {
                A0R.A00(new C68189N5e(AnonymousClass7TF.A0d(AnonymousClass7TE.A0c(this.A05).getResources(), 2131954494), false));
                for (RtcSettingsParticipant n5f : list) {
                    A0R.A00(new C68190N5f(n5f, new C74180PqM(this, 26)));
                }
                z = false;
            } else {
                z = true;
            }
            List list2 = n9s.A00;
            ArrayList<RtcSettingsParticipant> A1C = AnonymousClass7TE.A1C();
            for (Object next : list2) {
                RtcSettingsParticipant rtcSettingsParticipant = (RtcSettingsParticipant) next;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        RtcSettingsParticipant rtcSettingsParticipant2 = (RtcSettingsParticipant) it.next();
                        if (!0qQ.A0K(rtcSettingsParticipant2.A04, rtcSettingsParticipant.A04)) {
                            if (0qQ.A0K(rtcSettingsParticipant2.A06, rtcSettingsParticipant.A06)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                A1C.add(next);
            }
            if (AnonymousClass7TE.A1b(A1C)) {
                A0R.A00(new C68189N5e(AnonymousClass7TF.A0d(AnonymousClass7TE.A0c(this.A05).getResources(), 2131954493), !z));
                for (RtcSettingsParticipant n5f2 : A1C) {
                    A0R.A00(new C68190N5f(n5f2, new C74180PqM(this, 27)));
                }
            }
            ((AnonymousClass2t9) this.A03.getValue()).A05(A0R);
        }
    }

    public PM9(View view, OA7 oa7) {
        this.A00 = view;
        this.A01 = oa7;
    }
}
