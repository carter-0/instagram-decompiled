package X;

import android.content.Context;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.6ao  reason: invalid class name and case insensitive filesystem */
public final class C310326ao {
    public final Context A00;
    public final C310336ap A01;
    public final AnonymousClass3M8 A02;

    public C310326ao(Context context, C249463jp r4) {
        AnonymousClass3M8 r0;
        0qQ.A0B(context, 1);
        this.A00 = context;
        if (r4 != null) {
            r0 = r4.Bx5();
        } else {
            r0 = null;
        }
        this.A02 = r0;
        C310336ap r02 = new C310336ap();
        r02.A0O = true;
        this.A01 = r02;
    }

    public final C70823OMv A00(1Xj r9, C69634NpG npG, UpcomingEvent upcomingEvent, Integer num) {
        0qQ.A0B(upcomingEvent, 0);
        Context context = this.A00;
        AnonymousClass3M8 r4 = this.A02;
        return new C70823OMv(context, r9, this.A01, r4, npG, upcomingEvent, num);
    }
}
