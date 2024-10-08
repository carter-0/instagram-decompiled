package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.api.schemas.RingSpecPoint;
import com.instagram.api.schemas.RingSpecPointImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CzW  reason: case insensitive filesystem */
public abstract class C45620CzW {
    public static RingSpecImpl parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            ArrayList arrayList = null;
            RingSpecPointImpl ringSpecPointImpl = null;
            ArrayList arrayList2 = null;
            String str = null;
            RingSpecPointImpl ringSpecPointImpl2 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("colors".equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r14, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("end_point".equals(A17)) {
                    ringSpecPointImpl = C44326Cd8.parseFromJson(r14);
                } else if ("locations".equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            arrayList2.add(AnonymousClass7TF.A0U(r14));
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("start_point".equals(A17)) {
                    ringSpecPointImpl2 = C44326Cd8.parseFromJson(r14);
                }
                r14.A0z();
            }
            if (arrayList == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("colors", r14, "RingSpecImpl");
            } else if (ringSpecPointImpl == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("end_point", r14, "RingSpecImpl");
            } else if (arrayList2 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("locations", r14, "RingSpecImpl");
            } else if (str == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r14, "RingSpecImpl");
            } else if (ringSpecPointImpl2 != null || !(r14 instanceof 0c9)) {
                return new RingSpecImpl(ringSpecPointImpl, ringSpecPointImpl2, str, arrayList, arrayList2);
            } else {
                AnonymousClass7TF.A1L("start_point", r14, "RingSpecImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, RingSpecImpl ringSpecImpl) {
        r3.A0c();
        List list = ringSpecImpl.A03;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r3, "colors", list);
            while (A0s.hasNext()) {
                C41846B3n.A18(r3, A0s);
            }
            r3.A0Y();
        }
        RingSpecPoint ringSpecPoint = ringSpecImpl.A00;
        if (ringSpecPoint != null) {
            r3.A0q("end_point");
            RingSpecPointImpl F8m = ringSpecPoint.F8m();
            r3.A0c();
            r3.A0O("x", F8m.A00);
            r3.A0O("y", F8m.A01);
            r3.A0Z();
        }
        List list2 = ringSpecImpl.A04;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(r3, "locations", list2);
            while (A0s2.hasNext()) {
                Number number = (Number) A0s2.next();
                if (number != null) {
                    r3.A0f(number.floatValue());
                }
            }
            r3.A0Y();
        }
        String str = ringSpecImpl.A02;
        if (str != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        RingSpecPoint ringSpecPoint2 = ringSpecImpl.A01;
        if (ringSpecPoint2 != null) {
            r3.A0q("start_point");
            RingSpecPointImpl F8m2 = ringSpecPoint2.F8m();
            r3.A0c();
            r3.A0O("x", F8m2.A00);
            r3.A0O("y", F8m2.A01);
            r3.A0Z();
        }
        r3.A0Z();
    }
}
