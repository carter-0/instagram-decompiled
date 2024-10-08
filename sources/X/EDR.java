package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class EDR extends 1P0 {
    public final long A00;
    public final /* synthetic */ AnonymousClass540 A01;
    public final /* synthetic */ 1OE A02;
    public final /* synthetic */ C278744xS A03;

    public EDR(AnonymousClass540 r5, 1OE r6, C278744xS r7) {
        this.A03 = r7;
        this.A02 = r6;
        this.A01 = r5;
        this.A00 = AnonymousClass7TE.A0q(r7.A02).getLong("last_stories_tray_background_request_timestamp", -1);
    }

    private final void A00(boolean z) {
        AnonymousClass3PH r1 = AnonymousClass3PH.A00;
        C278744xS r0 = this.A03;
        r1.A00(r0.A01, r0.A02, AnonymousClass05K.A01, this.A02.A06, this.A00, z);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(810364395);
        AnonymousClass3HO r9 = (AnonymousClass3HO) obj;
        int A0D = AnonymousClass7TG.A0D(r9, -1472930443);
        C239753Ia A002 = r9.FH3();
        C278744xS r5 = this.A03;
        UserSession userSession = r5.A02;
        1E4.A00(userSession);
        List list = A002.A0J;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            ReelStore A033 = ReelStore.A03(userSession);
            1OE r12 = this.A02;
            A033.A0Z(A002.A04, r12, DbT.A0j(userSession), AnonymousClass3P8.A01(userSession, A002), AnonymousClass3P8.A00(userSession, A002), -1, r9.CPt(), AnonymousClass3P8.A02(A002));
            A00(true);
            1Av A003 = 1Au.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            String A012 = 1NZ.A01(r12.A04);
            0xa r11 = A003.A01;
            0xY AR4 = r11.AR4();
            AR4.E5g("last_stories_tray_fetch_reason", A012);
            0xY A0e = DbU.A0e(AR4, r11);
            A0e.E5c(C273654mx.A00(2967), currentTimeMillis);
            0xY A0e2 = DbU.A0e(A0e, r11);
            A0e2.E5c("last_stories_tray_background_request_timestamp", currentTimeMillis);
            A0e2.apply();
        }
        List A0U = ReelStore.A03(userSession).A0U(true);
        ArrayList A1C = AnonymousClass7TE.A1C();
        while (A1C.size() < 5 && i < A0U.size()) {
            if (!((Reel) A0U.get(i)).A1P && !((Reel) A0U.get(i)).A1a && !((Reel) A0U.get(i)).A0d() && !((Reel) A0U.get(i)).A0p() && !((Reel) A0U.get(i)).A0j() && !((Reel) A0U.get(i)).A1Y) {
                Object obj2 = A0U.get(i);
                0qQ.A07(obj2);
                A1C.add(obj2);
            }
            i++;
        }
        AnonymousClass540 r6 = this.A01;
        r5.A03.clear();
        r5.A04.clear();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        int size = A1C.size();
        for (int i2 = 0; i2 < size; i2++) {
            Reel reel = (Reel) A1C.get(i2);
            if (reel.A0z(userSession)) {
                A1C2.add(reel);
            } else {
                A1C3.add(reel);
            }
        }
        if (A1C3.isEmpty()) {
            C278744xS.A01(r6, r5, A1C2);
        } else {
            HashSet hashSet = new HashSet(C256393vh.A02(new C12608Szs(11, (0sP) C51833G3r.A00), A1C3));
            new AnonymousClass3PT(userSession, AnonymousClass3BU.BACKGROUND_PREFETCH, new C47991EPx(r6, r5, A1C2), AnonymousClass000.A00(3850), (Map) null, hashSet).A06();
        }
        AnonymousClass0fD.A0A(-984985446, A0D);
        AnonymousClass0fD.A0A(-972608806, A032);
    }

    public final void onFail(C268654dm r4) {
        int A032 = AnonymousClass0fD.A03(1397475553);
        this.A01.AVX(AnonymousClass000.A00(3850));
        A00(false);
        AnonymousClass0fD.A0A(-2054684750, A032);
    }
}
