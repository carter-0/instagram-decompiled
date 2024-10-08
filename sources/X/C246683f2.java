package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3f2  reason: invalid class name and case insensitive filesystem */
public final class C246683f2 implements 1Xl, AnonymousClass1Xn {
    public final AnonymousClass3f1 A00;

    public C246683f2(AnonymousClass3f1 r7) {
        1Xj r0;
        1Xj r02;
        this.A00 = r7;
        1Xj r4 = r7.A02;
        if (r4 != null) {
            String str = r7.A0C;
            if (str != null) {
                r4.A0C.Ea7(str);
            }
            String str2 = r7.A0A;
            if (str2 != null) {
                r4.A0C.EWf(str2);
            }
            List list = r7.A0F;
            if (list != null) {
                ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
                for (Object next : list) {
                    0qQ.A0C(next, "null cannot be cast to non-null type com.instagram.api.schemas.FeedRecsHideReasonImpl");
                    arrayList.add(next);
                }
                r4.A0S = arrayList;
            }
            AnonymousClass3f1 r03 = this.A00;
            Boolean bool = r03.A05;
            if (!(bool == null || (r02 = r03.A02) == null)) {
                r02.A0C.EVX(bool);
            }
            AnonymousClass3f1 r04 = this.A00;
            String str3 = r04.A0D;
            if (!(str3 == null || (r0 = r04.A02) == null)) {
                r0.A0C.EdZ(str3);
            }
            AnonymousClass3f1 r05 = this.A00;
            1Xj r2 = r05.A02;
            if (r2 != null) {
                r2.A0C.EjY(Boolean.valueOf(0qQ.A0K(r05.A06, true)));
            }
            1Xj r06 = this.A00.A02;
            if (r06 != null) {
                r06.A0C.EPS(true);
            }
        }
    }

    public final /* synthetic */ String ByO(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        return BPf().A2v();
    }

    public final /* synthetic */ boolean CUz() {
        return C56306HwJ.A00(this);
    }

    public final /* synthetic */ boolean CYg() {
        return C56306HwJ.A01(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
            return false;
        }
        getId();
        return 0qQ.A0K(getId(), ((C246683f2) obj).getId());
    }

    public final 1UQ B5J() {
        return 1UQ.A0H;
    }

    public final Integer B9V() {
        return this.A00.A08;
    }

    public final C67241sS BJP() {
        return this.A00.A00;
    }

    public final 1Xj BPf() {
        1Xj r0 = this.A00.A02;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final String C9L() {
        1Xj r0 = this.A00.A02;
        if (r0 != null) {
            return r0.C9L();
        }
        return null;
    }

    public final Integer CBd() {
        return AnonymousClass05K.A01;
    }

    public final Integer CEl() {
        return this.A00.A09;
    }

    public final String getId() {
        String str = this.A00.A0B;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final /* synthetic */ boolean CcK() {
        return BPf().CcK();
    }

    public final int hashCode() {
        return getId().hashCode();
    }
}
