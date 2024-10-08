package X;

import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;

public final class M02 implements MUQ {
    public final int A00;
    public final Object A01;

    public M02(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DD1(UpcomingEvent upcomingEvent) {
        1Xj r0;
        switch (this.A00) {
            case 0:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                editMediaInfoFragment.A0t = true;
                r0 = editMediaInfoFragment.A0I;
                r0.getClass();
                break;
            case 1:
                r0 = ((C61941KSq) this.A01).A0C;
                if (r0 == null) {
                    0qQ.A0F("editMedia");
                    throw AnonymousClass00P.createAndThrow();
                }
                break;
            case 2:
                AnonymousClass3Q2 A012 = LJ9.A01((C61942KSr) this.A01);
                UpcomingEventImpl upcomingEventImpl = null;
                if (upcomingEvent != null) {
                    upcomingEventImpl = upcomingEvent.FGz((1E6) null);
                }
                A012.A1p = upcomingEventImpl;
                return;
            default:
                ((C64143LQf) this.A01).A04.DvC(upcomingEvent);
                return;
        }
        r0.A0C.Epf(upcomingEvent);
    }

    public final void DD2(UpcomingEvent upcomingEvent) {
        UpcomingEvent upcomingEvent2;
        1Xj r0;
        String id;
        switch (this.A00) {
            case 0:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                editMediaInfoFragment.A0t = true;
                r0 = editMediaInfoFragment.A0I;
                r0.getClass();
                upcomingEvent2 = null;
                break;
            case 1:
                r0 = ((C61941KSq) this.A01).A0C;
                upcomingEvent2 = null;
                if (r0 == null) {
                    0qQ.A0F("editMedia");
                    throw AnonymousClass00P.createAndThrow();
                }
                break;
            case 2:
                C61942KSr kSr = (C61942KSr) this.A01;
                UpcomingEventImpl upcomingEventImpl = LJ9.A01(kSr).A1p;
                if (upcomingEventImpl != null && (id = upcomingEventImpl.getId()) != null && id.equals(upcomingEvent.getId())) {
                    JTT.A0X(kSr).A02.A1p = null;
                    return;
                }
                return;
            default:
                ((C64143LQf) this.A01).A04.DvD(upcomingEvent);
                return;
        }
        r0.A0C.Epf(upcomingEvent2);
    }
}
