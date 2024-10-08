package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.3e7  reason: invalid class name and case insensitive filesystem */
public final class C246153e7 implements C244333b1 {
    public AnonymousClass4HI A00;
    public UserSession A01;
    public AnonymousClass4DU A02;
    public final 1Xj A03;
    public final String A04;
    public final Set A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C246153e7(AnonymousClass4HI r8, UserSession userSession, 1Xj r10, AnonymousClass4DU r11) {
        this(r8, userSession, r10, r11, (String) null, 0sl.A00);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r11, 3);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.4Lh, java.lang.Object] */
    public final AnonymousClass4Lh AWe() {
        1Xj r6 = this.A03;
        if (r6 == null) {
            return null;
        }
        AnonymousClass4DU r4 = this.A02;
        boolean CcK = r6.CcK();
        String str = this.A04;
        Set set = this.A05;
        AnonymousClass4HI r0 = this.A00;
        ? obj = new Object();
        obj.A01 = r6;
        obj.A02 = r4;
        obj.A06 = CcK;
        obj.A04 = str;
        obj.A05 = set;
        obj.A00 = r0;
        return obj;
    }

    public final String AWo() {
        1Xj r1 = this.A03;
        if (r1 == null) {
            return null;
        }
        return C297065r7.A01(this.A01, r1);
    }

    public final AnonymousClass57r AWp() {
        1Xj r2 = this.A03;
        if (r2 == null) {
            return null;
        }
        return new C297075r8(this.A01, r2);
    }

    public final C2814457q AWq() {
        if (this.A03 == null) {
            return null;
        }
        return new C297055r6(this);
    }

    public C246153e7(AnonymousClass4HI r5, UserSession userSession, 1Xj r7, AnonymousClass4DU r8, String str, Set set) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r8, 3);
        this.A03 = r7;
        this.A01 = userSession;
        this.A00 = r5;
        this.A04 = str;
        this.A05 = set;
        this.A02 = C227942kP.A00(r8);
        if (r7 == null) {
            0wb.A04("ig_automated_logging", "null media for IGAutomatedLoggingDefaultTrackingDataGenerator", Boolean.valueOf(182.A06(0Tu.A06, this.A01, 36312874749003076L)).booleanValue() ? 1 : IgNetworkConsentStorage.MAX_ENTRIES);
        }
    }
}
