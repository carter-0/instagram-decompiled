package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public abstract class HX7 {
    public static final C254523sc A00(C333827aD r11, C333777a7 r12, 0wc r13, AnonymousClass4DU r14, List list) {
        C335907dj r112;
        C61084JwM jwM;
        String str;
        String str2;
        String str3;
        Long l;
        String str4;
        Object obj;
        Object obj2;
        Object obj3;
        0qQ.A0B(r11, 0);
        AnonymousClass7TG.A1P(list, r13);
        C300145wb r2 = null;
        if (!(r14 == null || r12 == null || !(r11 instanceof C335907dj) || (r112 = (C335907dj) r11) == null)) {
            boolean z = true;
            if (r112.A0H == AnonymousClass05K.A00) {
                Iterator it = list.iterator();
                int i = 0;
                int i2 = 0;
                loop0:
                while (true) {
                    if (!it.hasNext()) {
                        jwM = null;
                        break;
                    }
                    Object next = it.next();
                    int i3 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C333827aD r3 = (C333827aD) next;
                    if (r3 instanceof C335907dj) {
                        String str5 = ((C335907dj) r3).A0K;
                        if (!0qQ.A0K(str5, r112.A0N)) {
                            if (0qQ.A0K(str5, r112.A0K)) {
                                Integer valueOf = Integer.valueOf(i2);
                                jwM = new C61084JwM(valueOf, valueOf, (Integer) null, 12);
                                break;
                            }
                        } else {
                            int A06 = C51966G9m.A06(list);
                            if (i3 <= A06) {
                                int i4 = i3;
                                int i5 = 0;
                                while (!0qQ.A0K(((C333827aD) list.get(i4)).A00, r112.A00)) {
                                    i5++;
                                    if (i4 != A06) {
                                        i4++;
                                    }
                                }
                                Integer valueOf2 = Integer.valueOf(i2);
                                jwM = new C61084JwM(valueOf2, valueOf2, Integer.valueOf(i5), 12);
                                break loop0;
                            }
                        }
                        i2++;
                    }
                    i = i3;
                }
                C254523sc A0n = C51965G9l.A0n(r14, "comment_impression");
                A0n.A4o = r112.A0K;
                A0n.A5u = r12.A0I;
                A0n.A3c = DbS.A0j(AnonymousClass7TG.A0A(r112.A0G));
                A0n.A1e = Boolean.valueOf(r14.isOrganicEligible());
                if (r112.A05 != C335857de.COVERED_COMMENT) {
                    z = false;
                }
                A0n.A1H = Boolean.valueOf(z);
                A0n.A60 = r12.A0J;
                A0n.A4q = r112.A0C.getId();
                A0n.A4W = C51968G9o.A15(r12.A0A);
                A0n.A6J = r112.A0N;
                if (jwM == null || (obj3 = jwM.A01) == null) {
                    str = null;
                } else {
                    str = obj3.toString();
                }
                A0n.A4p = str;
                if (jwM == null || (obj2 = jwM.A02) == null) {
                    str2 = null;
                } else {
                    str2 = obj2.toString();
                }
                A0n.A6K = str2;
                if (jwM == null || (obj = jwM.A00) == null) {
                    str3 = null;
                } else {
                    str3 = obj.toString();
                }
                A0n.A4h = str3;
                A0n.A1r = Boolean.valueOf(r112.A0c);
                A0n.A0N(r12.A05);
                A0n.A6Z = r12.A0L;
                A0n.A1m = false;
                A0n.A1t = Boolean.valueOf(r112.A0d);
                C335847dd r6 = r112.A07;
                if (r6.A05) {
                    0Aj A0e = AnonymousClass7TE.A0e(r13, "instagram_thumbnail_impression");
                    User user = r6.A02;
                    if (user != null) {
                        l = C51972G9s.A0h(user);
                    } else {
                        l = null;
                    }
                    A0e.A9F("entity_id", l);
                    if (user != null) {
                        str4 = user.getUsername();
                    } else {
                        str4 = null;
                    }
                    A0e.AAJ("entity_name", str4);
                    String str6 = r6.A04;
                    A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str6);
                    C51965G9l.A1I(A0e, str6);
                    C51965G9l.A1E(A0e, C51972G9s.A0j(r6.A03));
                    1iA r0 = r6.A01;
                    if (r0 != null) {
                        r2 = r0.A00();
                    }
                    A0e.A8M(r2, "media_type");
                    G9w.A17(A0e);
                }
                C51972G9s.A1A(A0n);
                return A0n;
            }
        }
        return null;
    }
}
