package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import kotlin.enums.EnumEntries;

/* renamed from: X.HKm  reason: case insensitive filesystem */
public final class C54603HKm extends Enum {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C54603HKm[] A01;
    public static final C54603HKm A02;

    public final boolean A00(UserSession userSession, C233812wV r11, AnonymousClass1PB r12) {
        Integer num;
        0qQ.A0B(userSession, 0);
        if (r12.equals(AnonymousClass1PA.A00)) {
            C233172vA A03 = 1PG.A00(userSession).A03(r12);
            Boolean bool = A03.A07;
            Long l = A03.A0I;
            if (!AnonymousClass7TF.A1Y(bool, true)) {
                num = AnonymousClass05K.A01;
            } else if (l != null && 182.A01(0Tu.A05, userSession, 36592017560305796L) >= System.currentTimeMillis() - l.longValue()) {
                return true;
            } else {
                num = AnonymousClass05K.A00;
            }
            if (num == AnonymousClass05K.A00) {
                r11.A0X.Cgx(r11.A0Y.A03(), "hp0_unavailable", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            }
        }
        return false;
    }

    static {
        C54603HKm hKm = new C54603HKm();
        A02 = hKm;
        C54603HKm[] hKmArr = {hKm};
        A01 = hKmArr;
        A00 = 0oU.A00(hKmArr);
    }

    public C54603HKm() {
        super("STORIES_HP1", 0);
    }
}
