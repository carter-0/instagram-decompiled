package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.8VY  reason: invalid class name */
public final class AnonymousClass8VY extends 1P0 {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ UserSession A01;

    public AnonymousClass8VY(1P0 r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(585758569);
        int A032 = AnonymousClass0fD.A03(-1639524746);
        0qQ.A0B(obj, 0);
        this.A00.onSuccess(obj);
        AnonymousClass0fD.A0A(402411001, A032);
        AnonymousClass0fD.A0A(-635457860, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        C317876nz r2;
        int A03 = AnonymousClass0fD.A03(798678585);
        AnonymousClass8VW r7 = (AnonymousClass8VW) obj;
        int A032 = AnonymousClass0fD.A03(-1621697730);
        0qQ.A0B(r7, 0);
        C384589hZ r0 = r7.A00;
        if (!(r0 == null || (r2 = r0.A00) == null)) {
            UserSession userSession = this.A01;
            if (!r2.A0O.isEmpty()) {
                C310396ay A002 = C310386ax.A00(userSession);
                A002.A00.put(r2.A0Z, r2);
                ImageUrl imageUrl = ((C317966o8) r2.A0O.get(0)).A0H;
                0qQ.A07(imageUrl);
                1NK.A00().A0P(imageUrl);
            }
        }
        AnonymousClass0fD.A0A(-1385486818, A032);
        AnonymousClass0fD.A0A(-518900567, A03);
    }
}
