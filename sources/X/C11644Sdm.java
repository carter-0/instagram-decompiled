package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.Sdm  reason: case insensitive filesystem */
public final class C11644Sdm implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public C11644Sdm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A00 = i;
        this.A01 = obj4;
        this.A06 = str;
        this.A02 = obj3;
        this.A03 = obj;
        this.A04 = obj5;
        this.A05 = obj2;
    }

    public final void onChanged(Object obj) {
        C13735Tg7 tg7;
        2Fk r2;
        IllegalArgumentException illegalArgumentException;
        Object obj2 = obj;
        int i = this.A00;
        SSY ssy = (SSY) this.A01;
        switch (i) {
            case 0:
                Queue queue = (Queue) this.A02;
                AnonymousClass2Fj r10 = (AnonymousClass2Fj) this.A03;
                String str = this.A06;
                Object obj3 = this.A04;
                C10440RsH rsH = (C10440RsH) this.A05;
                SUj sUj = (SUj) obj2;
                if (SUj.A0V(sUj)) {
                    String str2 = (String) SUj.A0D(sUj);
                    02V.A06(!queue.isEmpty(), "factors can not be empty!");
                    Object poll = queue.poll();
                    poll.getClass();
                    C11027S6f s6f = (C11027S6f) poll;
                    if ("SDC".equalsIgnoreCase(s6f.A00)) {
                        AnonymousClass2E0.A0D();
                        throw AnonymousClass7TE.A0w("SDC auth factor not supported");
                    }
                    C10440RsH A002 = C11301SKl.A00(rsH.A01, s6f, str2);
                    C12460Sus sus = ssy.A00;
                    if (sus != null) {
                        sus.A01 = s6f;
                        sus.A00 = A002;
                        tg7 = sus;
                    } else {
                        AnonymousClass5A3 r1 = ssy.A04;
                        FragmentActivity fragmentActivity = ssy.A01;
                        if (fragmentActivity == null) {
                            fragmentActivity = ssy.A02;
                            fragmentActivity.getClass();
                        }
                        tg7 = new C12461Sut(fragmentActivity, r10, ssy.A03, A002, ssy, r1, obj3, str, queue);
                    }
                    Bundle bundle = A002.A01;
                    String A0l = DbU.A0l(bundle, "AUTH_METHOD_TYPE");
                    List list = ssy.A05;
                    list.add(A0l);
                    2FO r4 = AnonymousClass2E0.A03().A01;
                    HashMap A003 = S9s.A00(bundle);
                    A003.put("DYNAMIC_AUTH_OPERATION_NAME", str);
                    A003.put("DYNAMIC_AUTH_AUTH_TYPES", Collections.unmodifiableList(list));
                    r4.Cgl("client_verify_dynamic_auth_display", Collections.unmodifiableMap(A003));
                    if ("BIO".equalsIgnoreCase(A0l)) {
                        2Fk r42 = ssy.A03.A02;
                        FragmentActivity fragmentActivity2 = ssy.A01;
                        if (fragmentActivity2 == null) {
                            fragmentActivity2 = ssy.A02;
                            fragmentActivity2.getClass();
                        }
                        SUj.A0F(fragmentActivity2, r42, new C11650Sds(11, (Object) A002, (Object) ssy, (Object) tg7));
                        return;
                    }
                    SSY.A02(tg7, A002, ssy);
                    return;
                }
                r10.A0A(SUj.A0B(sUj.A02));
                return;
            case 1:
                C10440RsH rsH2 = (C10440RsH) this.A02;
                AnonymousClass2Fj r43 = (AnonymousClass2Fj) this.A03;
                String str3 = this.A06;
                Object obj4 = this.A04;
                1MD r5 = (1MD) this.A05;
                SUj sUj2 = (SUj) obj2;
                if (SUj.A0S(sUj2)) {
                    Throwable th = sUj2.A02;
                    if (th instanceof C8284QnQ) {
                        th.getClass();
                        C8284QnQ qnQ = (C8284QnQ) th;
                        try {
                            rsH2.A01.putString("AUTH_EXCEPTION", Pxf.A0f(qnQ));
                            ArrayDeque arrayDeque = new ArrayDeque();
                            if (qnQ != null) {
                                Iterator<S6A> it = qnQ.A00.A01.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!it.next().A00.isEmpty()) {
                                            for (S6A s6a : qnQ.A00.A01) {
                                                Iterator<C11027S6f> it2 = s6a.A00.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        C11027S6f next = it2.next();
                                                        String str4 = next.A00;
                                                        if ("BIO".equalsIgnoreCase(str4) || "PIN".equalsIgnoreCase(str4) || "CSC".equalsIgnoreCase(str4) || "SDC".equalsIgnoreCase(str4) || "PAYPAL_ACCESS_TOKEN".equalsIgnoreCase(str4) || "FB_ACCESS_TOKEN".equalsIgnoreCase(str4) || "IG_ACCESS_TOKEN".equalsIgnoreCase(str4) || "THREE_DS".equalsIgnoreCase(str4)) {
                                                            arrayDeque.add(next);
                                                        } else {
                                                            illegalArgumentException = AnonymousClass7TF.A0W("Not supported auth factor:", str4);
                                                        }
                                                    }
                                                }
                                            }
                                            C12460Sus sus2 = ssy.A00;
                                            if (sus2 != null) {
                                                Iterator it3 = arrayDeque.iterator();
                                                while (it3.hasNext()) {
                                                    C11027S6f s6f2 = (C11027S6f) it3.next();
                                                    Map map = sus2.A07;
                                                    Iterator A16 = DbV.A16(map);
                                                    while (true) {
                                                        if (A16.hasNext()) {
                                                            Object next2 = A16.next();
                                                            if (0qQ.A0K(((C11027S6f) next2).A00, s6f2.A00)) {
                                                                if (next2 != null) {
                                                                    map.remove(next2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    map.put(s6f2, (Object) null);
                                                }
                                            }
                                            ssy.A06(r43, rsH2, obj4, str3, arrayDeque);
                                            return;
                                        }
                                    }
                                }
                            }
                            illegalArgumentException = AnonymousClass7TE.A0w("AuthException does not have group or any factor.");
                            throw illegalArgumentException;
                        } catch (IllegalArgumentException e) {
                            r43.A0A(SUj.A0B(e));
                            return;
                        }
                    }
                }
                if (ssy.A00 != null) {
                    if (Pxf.A1U(C8284QnQ.A01, C11302SKm.A00(sUj2.A02))) {
                        C12460Sus sus3 = ssy.A00;
                        Map map2 = sus3.A07;
                        Iterator A15 = Pxg.A15(map2.keySet());
                        while (A15.hasNext()) {
                            C11027S6f s6f3 = (C11027S6f) A15.next();
                            if (0qQ.A0K(s6f3.A00, "BIO")) {
                                map2.remove(s6f3);
                            } else {
                                C10586Rug rug = (C10586Rug) map2.get(s6f3);
                                if (!(rug == null || rug.A01 == null)) {
                                    map2.put(s6f3, (Object) null);
                                }
                            }
                        }
                        sus3.A00((C10586Rug) null);
                        return;
                    }
                }
                if (ssy.A00 != null && r5 != null && !SUj.A0T(sUj2) && (r2 = (2Fk) r5.apply(sUj2.A01)) != null) {
                    SUj.A0H(r2, new C11648Sdq(17, (Object) r43, (Object) ssy));
                    return;
                }
                return;
            default:
                String str5 = this.A06;
                C10440RsH rsH3 = (C10440RsH) this.A02;
                1MD r52 = (1MD) this.A03;
                Object obj5 = this.A04;
                AnonymousClass2gB r44 = (AnonymousClass2gB) this.A05;
                SUj sUj3 = (SUj) obj2;
                if (SUj.A0V(sUj3)) {
                    Object A0D = SUj.A0D(sUj3);
                    AnonymousClass5A3 r8 = ssy.A04;
                    SOC A042 = AnonymousClass2E0.A04();
                    HashSet A0v = Pxj.A0v((C11330SNj) A0D);
                    C12497SvT svT = new C12497SvT(0, ssy.A03, rsH3);
                    Bundle bundle2 = rsH3.A01;
                    String string = bundle2.getString("PAYMENT_ACCOUNT_ID");
                    String string2 = bundle2.getString("PAYMENT_OTC_SESSION_ID");
                    String string3 = bundle2.getString("PAYMENT_OTC_TYPE");
                    Map A012 = S9s.A01(bundle2);
                    0qQ.A0B(str5, 0);
                    AnonymousClass7TF.A1E(obj5, 1, A012);
                    C7422QCn A032 = SSC.A03(SQA.A02(r52, A042, r8, new C11214SFo(C11095S9w.A00(svT, A0v), obj5, str5, string, string2, string3, (String) null, (String) null, A012, A0v)));
                    FragmentActivity fragmentActivity3 = ssy.A01;
                    if (fragmentActivity3 == null) {
                        fragmentActivity3 = ssy.A02;
                        fragmentActivity3.getClass();
                    }
                    A032.A06(fragmentActivity3, new C11645Sdn(r52, A032, r44, rsH3, ssy, obj5, str5, 0));
                    return;
                }
                SSY.A01(r52, r44, rsH3, ssy, obj5, str5);
                return;
        }
    }
}
