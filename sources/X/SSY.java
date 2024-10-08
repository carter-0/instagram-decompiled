package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.fbpay.auth.models.AuthTicketType;
import com.google.gson.Gson;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class SSY {
    public static final 1MD A08 = new C11539Sc0();
    public C12460Sus A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final QDE A03;
    public final AnonymousClass5A3 A04;
    public final List A05 = AnonymousClass7TE.A1C();
    public final 1MD A06;
    public final S7M A07;

    public static void A01(1MD r10, AnonymousClass2gB r11, C10440RsH rsH, SSY ssy, Object obj, String str) {
        C10440RsH rsH2 = rsH;
        Bundle bundle = rsH.A01;
        String A002 = SQ8.A00(bundle, 1);
        if ("VERIFY_BIO_TO_PAY".equalsIgnoreCase(A002)) {
            Pxi.A0x(bundle, "AUTH_FLOW_UTIL_AUTH_FLOW", "VERIFY_PIN_TO_PAY", 1);
        }
        if ("VERIFY_BIO_TO_DISABLE_BIO_HUB".equalsIgnoreCase(A002)) {
            Pxi.A0x(bundle, "AUTH_FLOW_UTIL_AUTH_FLOW", "VERIFY_PIN_TO_DISABLE_BIO_HUB", 1);
        }
        bundle.putString("AUTH_METHOD_TYPE", "PIN");
        QDE qde = ssy.A03;
        SR4.A02(qde.A05, new C11001S4v((RLE) null, (SR5) null, (C10714Rws) null, new C12459Sur(r10, r11, rsH2, ssy, obj, str, 0), rsH2, ssy.A04.A00.A03));
    }

    public final void A06(AnonymousClass2Fj r11, C10440RsH rsH, Object obj, String str, Queue queue) {
        Queue queue2 = queue;
        Object peek = queue.peek();
        if (peek != null) {
            2Fk r1 = (2Fk) this.A06.apply(peek);
            if (r1 != null) {
                FragmentActivity fragmentActivity = this.A01;
                if (fragmentActivity == null) {
                    fragmentActivity = this.A02;
                    fragmentActivity.getClass();
                }
                SUj.A0F(fragmentActivity, r1, new C11644Sdm(r11, rsH, queue2, this, obj, str, 0));
                return;
            }
            throw AnonymousClass7TE.A0w("Caller must provide success or fail live data whether DA should proceed or abort the DA");
        }
        throw AnonymousClass7TE.A0w("Factor Queue can not be empty");
    }

    public static void A00(1MD r15, AnonymousClass2gB r16, C10440RsH rsH, C10586Rug rug, SSY ssy, Object obj, String str) {
        0sl emptySet;
        0sl r0;
        AnonymousClass5A3 r3 = ssy.A04;
        SOC A042 = AnonymousClass2E0.A04();
        SSZ A012 = SOC.A01();
        C10586Rug rug2 = rug;
        if (rug != null) {
            emptySet = Pxj.A0v(rug2.A01);
        } else {
            emptySet = Collections.emptySet();
        }
        Bundle bundle = rsH.A01;
        String string = bundle.getString("PAYMENT_ACCOUNT_ID");
        String string2 = bundle.getString("PAYMENT_OTC_SESSION_ID");
        String string3 = bundle.getString("PAYMENT_OTC_TYPE");
        Map A013 = S9s.A01(bundle);
        Object obj2 = obj;
        String str2 = str;
        AnonymousClass7TG.A1O(str2, obj2);
        0qQ.A0B(A013, 7);
        C12496SvS svS = new C12496SvS(A012, 1);
        if (emptySet == null) {
            r0 = 0sl.A00;
        } else {
            r0 = emptySet;
        }
        C12494SvQ A002 = C11095S9w.A00(svS, r0);
        if (emptySet == null) {
            emptySet = 0sl.A00;
        }
        AnonymousClass2gB r2 = r16;
        r2.A0E(SSC.A03(SQA.A02(r15, A042, r3, new C11214SFo(A002, obj2, str2, string, string2, string3, (String) null, (String) null, A013, emptySet))), C11652Sdu.A00(r2, 30));
    }

    public static void A02(C13735Tg7 tg7, C10440RsH rsH, SSY ssy) {
        0hq childFragmentManager;
        S7M s7m = ssy.A07;
        Bundle bundle = rsH.A01;
        C13734Tg6 tg6 = (0SM) s7m.A04.A01(bundle, "AUTH_CONTAINER");
        if (tg6 instanceof C13734Tg6) {
            tg6.EPF(tg7);
        }
        FragmentActivity fragmentActivity = ssy.A02;
        if (fragmentActivity != null) {
            childFragmentManager = fragmentActivity.getSupportFragmentManager();
        } else {
            Fragment fragment = ssy.A01;
            fragment.getClass();
            childFragmentManager = fragment.getChildFragmentManager();
        }
        0s1 r3 = new 0s1(childFragmentManager);
        String A0l = DbU.A0l(bundle, "AUTH_METHOD_TYPE");
        if ("FB_ACCESS_TOKEN".equalsIgnoreCase(A0l) || "IG_ACCESS_TOKEN".equalsIgnoreCase(A0l)) {
            r3.A0B(tg6, "AUTH_CONTAINER_FRAGMENT_TAG");
            r3.A00();
            return;
        }
        tg6.A0C(r3, "AUTH_CONTAINER_FRAGMENT_TAG");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: X.Sdu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: X.Sdm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: X.Sdm} */
    /* JADX WARNING: type inference failed for: r0v17, types: [X.2gO] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2gB A03(X.1MD r26, X.1MD r27, X.C10440RsH r28, java.lang.Object r29, java.lang.String r30) {
        /*
            r25 = this;
            r4 = r28
            android.os.Bundle r1 = r4.A01
            r9 = 1
            java.lang.String r5 = java.lang.Boolean.toString(r9)
            java.lang.String r3 = "is_dynamic_auth_flow"
            java.lang.String r2 = "AUTH_LOGGING_EXTRA_KEY"
            android.os.Bundle r0 = r1.getBundle(r2)
            if (r0 != 0) goto L_0x0017
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()
        L_0x0017:
            r0.putString(r3, r5)
            r1.putBundle(r2, r0)
            X.S7M r0 = X.AnonymousClass2E0.A03()
            X.2FO r3 = r0.A01
            java.util.HashMap r2 = X.S9s.A00(r1)
            r15 = 0
            java.lang.String r0 = "DYNAMIC_AUTH_OPERATION_NAME"
            r11 = r30
            r2.put(r0, r11)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            java.lang.String r0 = "client_load_dynamic_auth_init"
            r3.Cgl(r0, r2)
            X.2Fj r3 = X.JTO.A0K()
            java.lang.String r0 = "REUSE_ATS_IN_AUTH_PROMPT_OBJ_SCOPED"
            r2 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            r5 = r25
            r10 = r29
            if (r0 == 0) goto L_0x0062
            X.5A3 r7 = r5.A04
            X.QDE r6 = r5.A03
            X.Sus r0 = new X.Sus
            r16 = r0
            r17 = r3
            r18 = r6
            r19 = r5
            r20 = r7
            r21 = r10
            r22 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r5.A00 = r0
        L_0x0062:
            X.QnQ r0 = r4.A00
            r19 = r27
            if (r0 == 0) goto L_0x00c7
            X.S5g r0 = r0.A00
            java.util.List<X.S6A> r0 = r0.A01
            java.util.Iterator r6 = r0.iterator()
        L_0x0070:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r0 = r6.next()
            X.S6A r0 = (X.S6A) r0
            java.util.List<X.S6f> r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0070
            X.QnQ r0 = r4.A00
            X.SUj r0 = X.SUj.A0A(r15, r0)
            X.2Fj r2 = new X.2Fj
            r2.<init>(r0)
            androidx.fragment.app.Fragment r1 = r5.A01
            if (r1 != 0) goto L_0x0098
            androidx.fragment.app.FragmentActivity r1 = r5.A02
            r1.getClass()
        L_0x0098:
            X.Sdm r0 = new X.Sdm
            r20 = r4
            r21 = r5
            r22 = r10
            r23 = r11
            r24 = r9
            r18 = r3
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
        L_0x00ab:
            X.SUj.A0F(r1, r2, r0)
            X.TPU r0 = new X.TPU
            r1 = r26
            r2 = r19
            r6 = r10
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            X.2gB r2 = X.AnonymousClass72Y.A02(r3, r0)
            r1 = 2
            X.Sdd r0 = new X.Sdd
            r0.<init>(r4, r5, r11, r1)
            r2.A09(r0)
            return r2
        L_0x00c7:
            X.5A3 r7 = r5.A04
            X.SOC r6 = X.AnonymousClass2E0.A04()
            X.SSZ r8 = X.SOC.A01()
            X.SNj[] r0 = new X.C11330SNj[r2]
            java.util.HashSet r2 = X.AnonymousClass7TE.A1F()
            java.util.Collections.addAll(r2, r0)
            java.lang.String r0 = "PAYMENT_ACCOUNT_ID"
            java.lang.String r12 = r1.getString(r0)
            java.lang.String r0 = "PAYMENT_OTC_SESSION_ID"
            java.lang.String r13 = r1.getString(r0)
            java.lang.String r0 = "PAYMENT_OTC_TYPE"
            java.lang.String r14 = r1.getString(r0)
            java.util.Map r1 = X.S9s.A01(r1)
            r0 = 2
            X.AnonymousClass7TF.A1E(r10, r0, r1)
            X.SvS r0 = new X.SvS
            r0.<init>(r8, r9)
            X.SvQ r9 = X.C11095S9w.A00(r0, r2)
            X.SFo r8 = new X.SFo
            r16 = r15
            r17 = r1
            r18 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.Qnb r0 = X.SQA.A03(r6, r7, r8)
            X.QCn r2 = X.SSC.A03(r0)
            androidx.fragment.app.Fragment r1 = r5.A01
            if (r1 != 0) goto L_0x0119
            androidx.fragment.app.FragmentActivity r1 = r5.A02
            r1.getClass()
        L_0x0119:
            r0 = 29
            X.Sdu r0 = X.C11652Sdu.A00(r3, r0)
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SSY.A03(X.1MD, X.1MD, X.RsH, java.lang.Object, java.lang.String):X.2gB");
    }

    public final AnonymousClass2gB A04(C10440RsH rsH, Object obj, String str) {
        C11600Scz scz = C11600Scz.A00;
        AnonymousClass2gB A0M = Pxh.A0M();
        C10586Rug rug = null;
        A0M.A0A(SUj.A08((Object) null));
        C10440RsH rsH2 = rsH;
        Bundle bundle = rsH.A01;
        String string = bundle.getString("AUTH_METHOD_TYPE");
        Set set = AuthTicketType.A00;
        if (string != null) {
            string = string.toUpperCase(Locale.US);
        }
        Object obj2 = obj;
        String str2 = str;
        if (!set.contains(string) || (!"BIO_OR_PIN".equalsIgnoreCase(DbU.A0l(bundle, "AUTH_METHOD_TYPE")) && !"BIO".equalsIgnoreCase(DbU.A0l(bundle, "AUTH_METHOD_TYPE")))) {
            String string2 = bundle.getString("AUTH_METHOD_TYPE");
            if (string2 != null) {
                string2 = string2.toUpperCase(Locale.US);
            }
            if (set.contains(string2)) {
                A02(new C12459Sur(scz, A0M, rsH2, this, obj2, str2, 1), rsH, this);
                return A0M;
            }
            C8284QnQ qnQ = rsH.A00;
            if (qnQ == null || !qnQ.A00.A01.isEmpty()) {
                C8284QnQ qnQ2 = (C8284QnQ) new Gson().A08(bundle.getString("AUTH_EXCEPTION"), C8284QnQ.class);
                if (qnQ2 != null) {
                    loop0:
                    for (S6A s6a : qnQ2.A00.A01) {
                        Iterator<C11027S6f> it = s6a.A00.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().A00.equals("CSC")) {
                                    rug = A05("CSC");
                                    break loop0;
                                }
                            }
                        }
                    }
                }
                A0M.A0A(SUj.A0A((Object) null, AnonymousClass7TE.A15("Not supported auth type")));
                return A0M;
            }
            A00(scz, A0M, rsH, rug, this, obj, str2);
            return A0M;
        }
        2Fk r1 = this.A03.A02;
        FragmentActivity fragmentActivity = this.A01;
        if (fragmentActivity == null) {
            fragmentActivity = this.A02;
            fragmentActivity.getClass();
        }
        SUj.A0F(fragmentActivity, r1, new C11644Sdm(scz, A0M, rsH2, this, obj2, str2, 2));
        return A0M;
    }

    public final C10586Rug A05(String str) {
        Object obj;
        C12460Sus sus = this.A00;
        if (sus == null) {
            return null;
        }
        Map map = sus.A07;
        Iterator A16 = DbV.A16(map);
        while (true) {
            if (!A16.hasNext()) {
                obj = null;
                break;
            }
            obj = A16.next();
            if (0qQ.A0K(((C11027S6f) obj).A00, str)) {
                break;
            }
        }
        return (C10586Rug) map.get(obj);
    }

    public SSY(1MD r5, Fragment fragment, FragmentActivity fragmentActivity, S7M s7m, AnonymousClass5A3 r9) {
        this.A04 = r9;
        this.A02 = fragmentActivity;
        this.A07 = s7m;
        this.A01 = fragment;
        this.A06 = r5;
        QDE create = AnonymousClass2E0.A03().A00().create(QDE.class);
        this.A03 = create;
        AnonymousClass2Fj r3 = create.A05;
        FragmentActivity fragmentActivity2 = this.A01;
        if (fragmentActivity2 == null) {
            fragmentActivity2 = this.A02;
            fragmentActivity2.getClass();
        }
        C11651Sdt.A01(fragmentActivity2, r3, C11652Sdu.A00(this, 28), 20);
    }
}
