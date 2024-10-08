package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Set;

public final class IWR implements C21029XAi {
    public C324356z9 A00;
    public final UserSession A01;
    public final C228602lw mTagActionsLoaderScheduler;

    public final void ACx(C324596za r3) {
        if (this.A00.A06()) {
            Cla(r3, false);
        }
    }

    public final boolean CKB() {
        return this.A00.A05();
    }

    public final boolean CT5() {
        return C51973G9u.A1Y(this.A00);
    }

    public final void Cla(C324596za r6, boolean z) {
        String str;
        C324356z9 r4 = this.A00;
        UserSession userSession = this.A01;
        String str2 = userSession.A06;
        if (z) {
            str = null;
        } else {
            str = r4.A03.A07;
        }
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0K("usertags/%s/potential_spam_review/", new Object[]{str2});
        A0b.A0R(CHY.class, D22.class);
        C3724090s.A06(A0b, str);
        r4.A03(A0b.A0M(), r6);
    }

    public final void Co2(1P0 r5, Integer num, String str, Set set) {
        C228602lw r2;
        1OC A002;
        int intValue = num.intValue();
        if (intValue == 2) {
            r2 = this.mTagActionsLoaderScheduler;
            A002 = C56333Hwk.A00(this.A01, "approve", "feed_photos_of_you", set);
        } else if (intValue == 1) {
            r2 = this.mTagActionsLoaderScheduler;
            A002 = C56333Hwk.A01(this.A01, "feed_photos_of_you", set);
        } else if (intValue == 3) {
            r2 = this.mTagActionsLoaderScheduler;
            1NY A0L = DbZ.A0L(this.A01);
            Dba.A1H(A0L, "usertags/remove_all_spam_tags/");
            A002 = DbT.A0T(A0L, "container_module", "feed_photos_of_you");
        } else {
            return;
        }
        A002.A00 = r5;
        r2.schedule(A002);
    }

    public final String getNextMaxId() {
        return this.A00.A03.A07;
    }

    public final boolean isLoading() {
        return C51973G9u.A1X(this.A00);
    }

    public IWR(Context context, AnonymousClass07i r3, C228602lw r4, UserSession userSession) {
        this.A01 = userSession;
        this.mTagActionsLoaderScheduler = r4;
        this.A00 = new C324356z9(context, r3, userSession);
    }
}
