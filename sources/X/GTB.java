package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

public final class GTB implements C244333b1 {
    public AnonymousClass4HI A00;
    public C59543JNp A01;
    public UserSession A02;
    public AnonymousClass4DU A03;
    public AnonymousClass3OA A04;
    public final String A05;
    public final Set A06;

    public GTB(AnonymousClass4HI r2, C59543JNp jNp, UserSession userSession, AnonymousClass4DU r5, AnonymousClass3OA r6, String str, Set set) {
        0qQ.A0B(set, 7);
        this.A04 = r6;
        this.A02 = userSession;
        this.A00 = r2;
        this.A05 = str;
        this.A06 = set;
        this.A03 = C227942kP.A00(r5);
        this.A01 = jNp;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4Lh, java.lang.Object] */
    public final AnonymousClass4Lh AWe() {
        1Xj r6 = this.A04.A0K;
        AnonymousClass4DU r5 = this.A03;
        String str = this.A05;
        Set set = this.A06;
        AnonymousClass4HI r2 = this.A00;
        ? obj = new Object();
        obj.A01 = r6;
        obj.A02 = r5;
        obj.A06 = true;
        obj.A04 = str;
        obj.A05 = set;
        obj.A00 = r2;
        return obj;
    }

    public final String AWo() {
        return C297065r7.A00(this.A01, this.A04.A0j, true);
    }

    public final AnonymousClass57r AWp() {
        1Xj r2 = this.A04.A0K;
        UserSession userSession = this.A02;
        0qQ.A0B(r2, 0);
        return new C297075r8(userSession, r2);
    }

    public final C2814457q AWq() {
        return new IHZ(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GTB(AnonymousClass4HI r9, C59543JNp jNp, UserSession userSession, AnonymousClass4DU r12, AnonymousClass3OA r13) {
        this(r9, jNp, userSession, r12, r13, (String) null, 0sl.A00);
        0qQ.A0B(r13, 1);
    }
}
