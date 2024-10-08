package X;

import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.instagram.common.session.UserSession;

/* renamed from: X.MdI  reason: case insensitive filesystem */
public final class C66826MdI extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C66989MgN A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66826MdI(UserSession userSession, C66989MgN mgN) {
        super(1238804958, 3, false, false);
        this.A00 = userSession;
        this.A01 = mgN;
    }

    public final void run() {
        UserSession userSession = this.A00;
        if (!userSession.A07()) {
            PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative((SqliteHolder) null, "FBLegacyBroker", "SafetyInterventions");
            0qQ.A07(newPrivacyContextNative);
            C295615oa.A01.A02(new C74188PqU(14, (Object) newPrivacyContextNative, (Object) this.A01, (Object) userSession), userSession);
        }
    }
}
