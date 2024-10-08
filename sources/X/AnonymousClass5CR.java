package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.5CR  reason: invalid class name */
public final class AnonymousClass5CR implements AnonymousClass4LR {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public AnonymousClass5CR(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    public final Map Bay(String str) {
        UserSession userSession = this.A00;
        C230432pc r6 = C230432pc.FEED;
        1L5 A012 = 1L0.A01(userSession, AnonymousClass1L1.A01.A01(this.A01));
        0qQ.A0B(userSession, 0);
        return new AnonymousClass5CM(userSession, A012, (AnonymousClass5CO) null, new AnonymousClass5CL(r6), r6, 48).AUO(str);
    }
}
