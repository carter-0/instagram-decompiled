package X;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;

/* renamed from: X.2t0  reason: invalid class name and case insensitive filesystem */
public final class C232152t0 implements C232022sn {
    public final AnonymousClass5IN ABt(AnonymousClass4VR r6, AnonymousClass426 r7) {
        C257443xP r0;
        String str;
        C52500GVc gVc;
        C52500GVc gVc2;
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        ImmutableSet immutableSet = r7.A04;
        if (!immutableSet.isEmpty()) {
            PzX A00 = PzX.A00(immutableSet);
            Iterator it = ((Iterable) A00.A00.A05(A00)).iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                r0 = new C257453xQ(next);
            } else {
                r0 = C2612848z.A00;
            }
            Object A04 = r0.A04();
            A04.getClass();
            2cX r02 = ((Trigger) A04).A00;
            if (r02 != null) {
                ImmutableSet keySet = r02.A00.keySet();
                0qQ.A07(keySet);
                ImmutableSet immutableSet2 = keySet;
                0qQ.A0B(immutableSet2, 0);
                AnonymousClass4VS r03 = ((AnonymousClass4VQ) r6).A03;
                if (r03 != null) {
                    AnonymousClass4V7 r3 = r03.A00;
                    String str2 = r3.A09.A00;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C283845Jo r04 = r3.A03;
                    if (r04 != null) {
                        str = r04.A00;
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        str = null;
                    }
                    for (String A002 : 0sr.A1P(new String[]{str2, str})) {
                        AnonymousClass5IN A003 = A00(immutableSet2, A002);
                        if (!A003.A07) {
                            return A003;
                        }
                    }
                    AnonymousClass4VG r05 = r3.A01;
                    if (r05 != null) {
                        gVc = new C52500GVc(r05);
                    } else {
                        gVc = null;
                    }
                    AnonymousClass4VG r1 = r3.A02;
                    if (r1 != null) {
                        gVc2 = new C52500GVc(r1);
                    } else {
                        gVc2 = null;
                    }
                    for (JLZ jlz : 0sr.A1P(new JLZ[]{gVc, gVc2})) {
                        if (jlz != null) {
                            AnonymousClass4VG r2 = ((C52500GVc) jlz).A00;
                            String str3 = r2.A00.A00;
                            if (str3 == null) {
                                str3 = "";
                            }
                            for (String A004 : 0sr.A1P(new String[]{str3, r2.A03})) {
                                AnonymousClass5IN A005 = A00(immutableSet2, A004);
                                if (!A005.A07) {
                                    return A005;
                                }
                            }
                            continue;
                        }
                    }
                }
                return AnonymousClass5IM.A00();
            }
        }
        0qQ.A07(RegularImmutableSet.A03);
        return AnonymousClass5IM.A00();
    }

    public final String FNO() {
        return "client_parameters";
    }

    public static final AnonymousClass5IN A00(ImmutableSet immutableSet, String str) {
        C12204Soz soz;
        String str2;
        if (!(str == null || str.length() == 0)) {
            HashSet hashSet = new HashSet();
            Matcher matcher = SBF.A00.matcher(str);
            while (matcher.find()) {
                hashSet.add(matcher.group(1));
            }
            if (!hashSet.isEmpty()) {
                if (immutableSet.isEmpty()) {
                    soz = new C12204Soz("failingParameters", hashSet);
                    str2 = "missing_context_to_sub_dynamic_params";
                } else {
                    hashSet.removeAll(immutableSet);
                    if (!hashSet.isEmpty()) {
                        soz = new C12204Soz("failingParameters", hashSet);
                        str2 = "leftover_dynamic_params_not_subbed";
                    }
                }
                return AnonymousClass5IM.A02(soz, str2);
            }
        }
        return AnonymousClass5IM.A00();
    }
}
