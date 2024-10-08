package X;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class T7I implements 1DN {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public T7I(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A03 = obj2;
        this.A01 = obj;
    }

    public final void DWm(Map map) {
        AnonymousClass4OB r0;
        AnonymousClass4OB r02;
        Object obj;
        Object obj2;
        Map map2 = map;
        switch (this.A00) {
            case 0:
                obj = map.get("android.permission.READ_EXTERNAL_STORAGE");
                if (obj == C346927vz.GRANTED) {
                    AnonymousClass6Tm r03 = (AnonymousClass6Tm) this.A02;
                    0qQ.A0A(r03);
                    SS4.A01((Context) this.A03, (C307896Rx) this.A04, r03);
                    return;
                }
                break;
            case 1:
                Object obj3 = map.get("android.permission.CAMERA");
                if (obj3 == C346927vz.GRANTED) {
                    SL9.A01((Context) this.A03, (C307896Rx) this.A04, (AnonymousClass6Tm) this.A02);
                    return;
                } else if (obj3 == C346927vz.DENIED_DONT_ASK_AGAIN) {
                    W38.A03((Activity) this.A01, 2131954557);
                    return;
                } else {
                    return;
                }
            case 2:
                0qQ.A0B(map, 0);
                Context context = (Context) this.A03;
                obj = map.get(SL9.A00(context));
                if (obj == C346927vz.GRANTED) {
                    SL9.A02(context, (C307896Rx) this.A04, (AnonymousClass6Tm) this.A02);
                    return;
                }
                break;
            case 3:
                0qQ.A0B(map, 0);
                if (map.get(AnonymousClass000.A00(10)) == C346927vz.GRANTED) {
                    C11337SNs.A00((Fragment) this.A03, (C307786Rm) this.A01, (C307896Rx) this.A02, (C277014uI) this.A04);
                    return;
                }
                C308206Td.A0E((C307896Rx) this.A02, (C277014uI) this.A04, (C307786Rm) this.A01, false);
                return;
            case 4:
                0qQ.A0A(map);
                ArrayList A0f = JTQ.A0f(map);
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    Object key = A1J.getKey();
                    C346927vz r04 = (C346927vz) A1J.getValue();
                    0qQ.A0A(r04);
                    int ordinal = r04.ordinal();
                    if (ordinal == 1) {
                        r0 = AnonymousClass4OB.DENIED;
                    } else if (ordinal == 0) {
                        r0 = AnonymousClass4OB.GRANTED;
                    } else if (ordinal == 2) {
                        r0 = AnonymousClass4OB.NEVER_ASK_AGAIN;
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                    AnonymousClass7TF.A1I(key, r0, A0f);
                }
                ((C20882X2k) this.A02).DWn(((C17965Viz) this.A01).A00(0Yt.A08(A0f)), (Integer) this.A03);
                return;
            case 5:
                0qQ.A0A(map);
                C11398SRs sRs = (C11398SRs) this.A04;
                ArrayList A0f2 = JTQ.A0f(map);
                Iterator A0u2 = AnonymousClass7TF.A0u(map);
                while (A0u2.hasNext()) {
                    Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
                    Object key2 = A1J2.getKey();
                    C346927vz r05 = (C346927vz) A1J2.getValue();
                    0qQ.A0A(r05);
                    int ordinal2 = r05.ordinal();
                    if (ordinal2 == 1) {
                        r02 = AnonymousClass4OB.DENIED;
                    } else if (ordinal2 == 0) {
                        r02 = AnonymousClass4OB.GRANTED;
                    } else if (ordinal2 == 2) {
                        r02 = AnonymousClass4OB.NEVER_ASK_AGAIN;
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                    AnonymousClass7TF.A1I(key2, r02, A0f2);
                }
                Map A08 = 0Yt.A08(A0f2);
                C10623RvH rvH = (C10623RvH) this.A02;
                0qQ.A07(((Context) this.A01).getApplicationContext());
                Map A012 = C11398SRs.A01((C61084JwM) this.A03, sRs, A08);
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                Iterator A16 = DbV.A16(A012);
                while (A16.hasNext()) {
                    Object next = A16.next();
                    Object obj4 = A012.get(next);
                    if (obj4 != null) {
                        if (rvH.A02 && obj4 == AnonymousClass4OB.NEVER_ASK_AGAIN) {
                            obj4 = AnonymousClass4OB.DENIED;
                        }
                        A1H.put(next, obj4);
                    }
                }
                C277014uI r2 = rvH.A01;
                C299275ur.A00(rvH.A00, Pxj.A0a(A1H), r2);
                return;
            default:
                C346927vz A013 = 1DL.A01(map, (String[]) this.A02);
                0qQ.A07(A013);
                C346927vz r06 = C346927vz.GRANTED;
                C10640RvZ rvZ = (C10640RvZ) this.A01;
                if (A013 == r06) {
                    rvZ.A00.A05.DWp();
                } else {
                    List list = rvZ.A01;
                    SJD sjd = rvZ.A00;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (Object next2 : list) {
                        C13791Th6 th6 = (C13791Th6) next2;
                        String Bbi = th6.Bbi();
                        C70777OKx oKx = sjd.A04;
                        0qQ.A0B(Bbi, 0);
                        if (!1DL.A07(oKx.A01, Bbi) && th6.Cam()) {
                            A1C.add(next2);
                        }
                    }
                    if (A1C.isEmpty()) {
                        sjd.A05.DWp();
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                String Bbi2 = ((C13791Th6) obj2).Bbi();
                                C70777OKx oKx2 = sjd.A04;
                                0qQ.A0B(Bbi2, 0);
                                if (!1DL.A07(oKx2.A01, Bbi2)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        C13791Th6 th62 = (C13791Th6) obj2;
                        if (th62 != null) {
                            if (!th62.Cam()) {
                                SJD.A00(sjd, A1C, rvZ.A02);
                            } else if ((th62 instanceof QPm) || (th62 instanceof QPn)) {
                                sjd.A05.DWo();
                                sjd.A04.A00(sjd.A03, th62.Bbj());
                            }
                        }
                    }
                    Map map3 = ((C70777OKx) this.A04).A02;
                    map3.clear();
                    0qQ.A0A(map);
                    map3.putAll(map);
                }
                AnonymousClass4O9 r07 = AnonymousClass4O9.CAMERA;
                AnonymousClass4OA r22 = AnonymousClass4OA.UNSPECIFIED;
                List A1P = 0sr.A1P(new Pair[]{Pxe.A0K(r07, r22), Pxe.A0K(AnonymousClass4O9.MICROPHONE, r22)});
                UserSession userSession = (UserSession) this.A03;
                0qQ.A0A(map);
                new AnonymousClass4O6(new 0xG("RtcCallPermissionsManager"), userSession).A01(AnonymousClass4O7.A00(userSession), "RTC_CALL_PERMISSIONS_MANAGER", A1P, AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN), map2);
                return;
        }
        if (obj == C346927vz.DENIED_DONT_ASK_AGAIN) {
            W38.A01((Activity) this.A01);
        }
    }
}
