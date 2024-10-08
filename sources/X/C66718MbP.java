package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.MbP  reason: case insensitive filesystem */
public abstract class C66718MbP {
    public static final String A00(Context context, UserSession userSession, C74514Pw9 pw9, C74516PwB pwB) {
        int i;
        Object[] objArr;
        C272074k3 r1;
        C272074k3 r12;
        C74516PwB pwB2 = pwB;
        Context context2 = context;
        UserSession userSession2 = userSession;
        if (pwB2.CUG()) {
            HashSet hashSet = new HashSet();
            for (Object add : pw9.BrL()) {
                hashSet.add(add);
            }
            2FW Aqm = pw9.Aqm();
            2FW r11 = 2FW.A0q;
            if (Aqm == r11) {
                C282485Dg AxK = pw9.AxK();
                if (AxK != null) {
                    r12 = AxK.A02;
                } else {
                    r12 = null;
                }
                if (r12 == C272074k3.RAVEN_OPENED) {
                    hashSet = 094.A00(hashSet, new HashSet(pw9.CFi()));
                }
            }
            int size = hashSet.size();
            String str = userSession2.A06;
            long j = 0;
            AnonymousClass177 r16 = null;
            for (Map.Entry entry : pwB2.CCp().entrySet()) {
                String str2 = (String) entry.getKey();
                C66709MbG mbG = (C66709MbG) entry.getValue();
                if (!0qQ.A0K(str, str2) && !0qQ.A0K(pw9.BsJ(), str2)) {
                    long C7a = pw9.C7a();
                    AnonymousClass0eM r13 = (AnonymousClass0eM) mbG.A02;
                    if (C7a <= ((Number) r13.getValue()).longValue()) {
                        AnonymousClass177 CCg = pwB2.CCg(str2, (String) null);
                        if (((Number) r13.getValue()).longValue() > j && CCg != null) {
                            j = ((Number) r13.getValue()).longValue();
                            r16 = CCg;
                        }
                    }
                }
            }
            if (pw9.Aqm() == r11) {
                C282485Dg AxK2 = pw9.AxK();
                if (AxK2 != null) {
                    r1 = AxK2.A02;
                } else {
                    r1 = null;
                }
                if (r1 == C272074k3.RAVEN_OPENED) {
                    Iterator it = pw9.CFh().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AnonymousClass177 CCg2 = pwB2.CCg((String) it.next(), (String) null);
                        if (CCg2 != null) {
                            r16 = CCg2;
                            break;
                        }
                    }
                }
            }
            if (r16 == null) {
                return null;
            }
            String A08 = AnonymousClass50n.A08(r16);
            Object obj = null;
            if (A08 == null) {
                return null;
            }
            if (hashSet.size() >= pwB2.BkC().size()) {
                return context2.getString(2131958554);
            }
            if (size <= 1) {
                i = 2131958527;
                objArr = new Object[]{A08};
            } else if (size == 2) {
                Iterator it2 = hashSet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (!0qQ.A0K(next, A08)) {
                        obj = next;
                        break;
                    }
                }
                i = 2131958529;
                objArr = new Object[]{A08, obj};
            } else {
                i = 2131958528;
                objArr = new Object[]{A08, Integer.valueOf(size - 1)};
            }
            return context2.getString(i, objArr);
        } else if (pw9.Aqm() == 2FW.A0q) {
            C282485Dg AxK3 = pw9.AxK();
            if (AxK3 == null || AxK3.A02 != C272074k3.RAVEN_OPENED) {
                return null;
            }
            return context2.getString(2131958523);
        } else {
            String str3 = userSession2.A06;
            LinkedHashMap CCp = pwB2.CCp();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : CCp.entrySet()) {
                if (!str3.equals(entry2.getKey())) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            C66709MbG mbG2 = (C66709MbG) 00k.A0A(linkedHashMap.values());
            if (mbG2 == null || !0qQ.A0K(str3, pw9.BsJ()) || pw9.C7a() > ((Number) ((AnonymousClass0eM) mbG2.A02).getValue()).longValue()) {
                return null;
            }
            return C66683Maq.A02(context2, mbG2.A01);
        }
    }
}
