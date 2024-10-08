package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.UtL  reason: case insensitive filesystem */
public final class C16346UtL extends C16701V2e {
    public final C16349UtO A00;

    public final void A00(1Xj r10) {
        C16349UtO utO = this.A00;
        C16345UtK utK = utO.A00;
        UpcomingEvent upcomingEvent = utK.A00;
        String id = r10.getId();
        AnonymousClass4DU r2 = utK.A02;
        ((C310306am) utO.A00.getValue()).A04(upcomingEvent, id, "edit_event", r2.getModuleName());
        C2601144i.A00().A01((Fragment) null, utK.A00, (FragmentActivity) null, utK.A01, upcomingEvent, r2.getModuleName(), true);
    }

    public C16346UtL(C16349UtO utO) {
        this.A00 = utO;
    }
}
