package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.2fS  reason: invalid class name */
public final class AnonymousClass2fS extends 0px {
    public final UserSession A00;
    public final 1NH A01;

    public final void A0L(LE3 le3) {
        0qQ.A0B(le3, 0);
        String str = le3.A04;
        if (str != null) {
            if (le3.equals(A03(str))) {
                String str2 = le3.A04;
                if (str2 != null) {
                    A0B(str2);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("mediaId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ 1OC A0G(Object obj) {
        LE3 le3 = (LE3) obj;
        0qQ.A0B(le3, 0);
        return le3.A00(this.A00);
    }

    public final Integer A0H() {
        return AnonymousClass05K.A01;
    }

    public final void A0I() {
        1NH r5 = this.A01;
        String str = this.A00.A06;
        AnonymousClass47J r0 = (AnonymousClass47J) r5.A02(002.A0R("pending_story_likes", str), true);
        if (r0 != null) {
            List<LE3> list = r0.A00;
            int A0L = 0se.A0L(0Yv.A1E(list, 10));
            if (A0L < 16) {
                A0L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
            for (LE3 le3 : list) {
                String str2 = le3.A04;
                if (str2 != null) {
                    linkedHashMap.put(str2, le3);
                } else {
                    0qQ.A0F("mediaId");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            A0E(linkedHashMap);
            A08();
        }
        r5.A04(002.A0R("pending_story_likes", str));
    }

    public final void A0J() {
        1NH r2 = this.A01;
        String A0R = 002.A0R("pending_story_likes", this.A00.A06);
        11Z.A05("This operation can't be run on UI thread.");
        new C241133Oa(r2, A0R).run();
    }

    public final void A0K() {
        AnonymousClass47J r3 = new AnonymousClass47J();
        ArrayList A05 = A05();
        0qQ.A0B(A05, 0);
        r3.A00 = A05;
        this.A01.A06(002.A0R("pending_story_likes", this.A00.A06), r3);
    }

    public final boolean A0M(1Xj r4) {
        C243363Yl A1a;
        if (this.A00 == null) {
            A07();
        }
        String id = r4.getId();
        if (id != null) {
            if (A0F(id)) {
                String id2 = r4.getId();
                if (id2 != null) {
                    Object A03 = A03(id2);
                    if (A03 != null) {
                        String str = ((LE3) A03).A01;
                        if (str == null) {
                            0qQ.A0F("action");
                            throw AnonymousClass00P.createAndThrow();
                        } else if (str.equals("send_story_like")) {
                            A1a = C243363Yl.LIKED;
                        } else {
                            A1a = C243363Yl.NOT_LIKED;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                A1a = r4.A1a();
            }
            if (A1a == C243363Yl.LIKED) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass2fS(1NH r1, UserSession userSession) {
        super(userSession);
        this.A00 = userSession;
        this.A01 = r1;
    }
}
