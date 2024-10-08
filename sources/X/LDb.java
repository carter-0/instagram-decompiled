package X;

import android.content.Context;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

public final class LDb {
    public final AnonymousClass2t9 A00;
    public final C63682L2s A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final C61637KFn A03;

    public final void A00(C64744LhL lhL) {
        List list = this.A02;
        list.clear();
        for (UpcomingEvent lhl : lhL.A00) {
            list.add(new C64769Lhl(lhl));
        }
        if (lhL.A01) {
            list.add(new Object());
        }
        ViewModelListUpdate A0R = DbS.A0R();
        A0R.A01(list);
        this.A00.A05(A0R);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.2tF, java.lang.Object] */
    public LDb(Context context, AnonymousClass0iw r4, C63682L2s l2s) {
        this.A01 = l2s;
        C61637KFn kFn = new C61637KFn(r4, l2s, new C66195MIc(this, 1));
        this.A03 = kFn;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(kFn);
        A002.A01(new Object());
        A002.A02 = new C64740LhH(this);
        this.A00 = A002.A00();
    }
}
