package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.3ou  reason: invalid class name and case insensitive filesystem */
public class C252313ou extends C252323ov {
    public final UserSession A00;
    public final boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C252313ou(UserSession userSession, AnonymousClass4DU r3, String str, boolean z) {
        super(r3, str);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = z;
    }

    public C263974Ob A0D(C263974Ob r11, 1Xj r12) {
        0qQ.A0B(r12, 0);
        C263974Ob r5 = r11;
        0qQ.A0B(r11, 1);
        super.A06(r11, r12);
        AnonymousClass3WR A002 = A00(r12, this);
        UserSession userSession = this.A00;
        r11.A06("video_format", C263984Oc.A01(A002, false, r12.A4p()));
        String BIl = r12.A0C.BIl();
        if (BIl != null) {
            r11.A06("inventory_source", BIl);
        }
        Set set = AnonymousClass4O4.A0I;
        AnonymousClass4O4 r4 = (AnonymousClass4O4) userSession.A01(AnonymousClass4O4.class, new C377169Ku(userSession, 41));
        if (r4 != null) {
            r4.A03(r5, (0xI) null, (AnonymousClass4O3) null, A00(r12, this), A03(r12));
        }
        String AmH = C264044Oj.A00(userSession).AmH(r12.A2b());
        if (AmH != null) {
            r11.A06("channel_pk", AmH);
        }
        User A2A = r12.A2A(userSession);
        if (A2A != null) {
            r11.A01(C263984Oc.A00(A2A.B6o()), "instagram_follow_status");
        }
        return r11;
    }

    public final /* bridge */ /* synthetic */ C263974Ob A06(C263974Ob r1, Object obj) {
        A0D(r1, (1Xj) obj);
        return r1;
    }

    public AnonymousClass4OR A0C(1Xj r5) {
        String str;
        if (this instanceof C232802uT) {
            C232802uT r3 = (C232802uT) this;
            0qQ.A0B(r5, 0);
            C257443xP r1 = (C257443xP) r3.A01.get();
            if (!r1.A06() || !((AnonymousClass3W1) r1.A03()).A2p || !r5.A5G()) {
                str = null;
            } else {
                str = "clips_netego";
                AnonymousClass4NZ r12 = AnonymousClass4NZ.A05;
                if (AnonymousClass4NZ.A03()) {
                    String id = r5.getId();
                    if (id != null) {
                        r12.A04(id, str);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            AnonymousClass4OR A012 = r3.A01(r3.A00, r5);
            A012.A06("subtype", str);
            return A012;
        }
        0qQ.A0B(r5, 0);
        return A01(this.A00, r5);
    }

    public static final AnonymousClass3WR A00(1Xj r1, C252313ou r2) {
        if (r1.CeS() || r1.A5A() || (r2.A01 && r1.A5D())) {
            return r1.CEL();
        }
        return null;
    }
}
