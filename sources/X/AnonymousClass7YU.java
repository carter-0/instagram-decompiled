package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7YU  reason: invalid class name */
public final class AnonymousClass7YU implements AnonymousClass0lh {
    public double A00 = Double.MIN_VALUE;
    public int A01 = -1;
    public boolean A02;
    public List A03 = new ArrayList();
    public final UserSession A04;
    public final List A05 = new ArrayList();
    public final List A06 = new ArrayList();
    public final List A07 = new ArrayList();
    public final List A08 = new ArrayList();
    public final Map A09 = new LinkedHashMap();
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LO(this, 28));

    public AnonymousClass7YU(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
    }

    public final int A03(String str) {
        0qQ.A0B(str, 0);
        List A002 = A00(this);
        ArrayList arrayList = new ArrayList();
        for (Object next : A002) {
            if (((AnonymousClass59G) next).A02 != null) {
                arrayList.add(next);
            }
        }
        for (Object next2 : arrayList) {
            if (0qQ.A0K(((AnonymousClass9JD) ((AnonymousClass59G) next2).A01).A03, str)) {
                if (next2 != null) {
                    return arrayList.indexOf(next2);
                }
                return -1;
            }
        }
        return -1;
    }

    public final C254703su A06(String str) {
        0qQ.A0B(str, 0);
        for (AnonymousClass59G r1 : this.A05) {
            if (str.equals(((AnonymousClass9JD) r1.A01).A03)) {
                return (C254703su) r1.A00;
            }
        }
        return null;
    }

    public final void A08(String str, boolean z) {
        ArrayList arrayList;
        Object obj;
        Object obj2;
        C254703su r0;
        if (z) {
            List list = this.A05;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (0qQ.A0K(((C254703su) ((AnonymousClass59G) obj2).A00).A0g(), str)) {
                    break;
                }
            }
            AnonymousClass59G r1 = (AnonymousClass59G) obj2;
            if (!(r1 == null || (r0 = (C254703su) r1.A00) == null || !A02(r0))) {
                ArrayList arrayList2 = new ArrayList();
                for (Object next : list) {
                    if (A02((C254703su) ((AnonymousClass59G) next).A00)) {
                        arrayList2.add(next);
                    }
                }
                arrayList = arrayList2;
                this.A03 = 00k.A0U(arrayList);
            }
        }
        List<List> list2 = ((C331307Qj) this.A0A.getValue()).A00;
        ArrayList arrayList3 = new ArrayList(0Yv.A1E(list2, 10));
        for (List<0eP> list3 : list2) {
            ArrayList arrayList4 = new ArrayList(0Yv.A1E(list3, 10));
            for (0eP r02 : list3) {
                C254703su r12 = (C254703su) r02.A00;
                String A0g = r12.A0g();
                if (A0g == null) {
                    A0g = r12.A0f();
                }
                arrayList4.add(A0g);
            }
            arrayList3.add(arrayList4);
        }
        Iterator it2 = arrayList3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((List) obj).contains(str)) {
                break;
            }
        }
        Iterable iterable = (Iterable) obj;
        if (iterable != null) {
            List A0X = 00k.A0X(iterable);
            if (C328447Ev.A00(this.A04)) {
                List list4 = this.A05;
                ArrayList arrayList5 = new ArrayList();
                for (Object next2 : list4) {
                    if (A0X.contains(((AnonymousClass9JD) ((AnonymousClass59G) next2).A01).A03)) {
                        arrayList5.add(next2);
                    }
                }
                arrayList = 00k.A0Y(arrayList5);
                this.A03 = 00k.A0U(arrayList);
            }
        }
        List list5 = this.A05;
        ArrayList arrayList6 = new ArrayList();
        for (Object next3 : list5) {
            if (0qQ.A0K(((AnonymousClass9JD) ((AnonymousClass59G) next3).A01).A03, str)) {
                arrayList6.add(next3);
            }
        }
        arrayList = arrayList6;
        this.A03 = 00k.A0U(arrayList);
    }

    public static final List A00(AnonymousClass7YU r1) {
        if (C328447Ev.A00(r1.A04)) {
            return r1.A03;
        }
        return r1.A05;
    }

    public static final boolean A02(C254703su r2) {
        Object obj = r2.A1T;
        if (!(obj instanceof List)) {
            return false;
        }
        0qQ.A0C(obj, AnonymousClass000.A00(12));
        if (((List) obj).size() > 1) {
            return true;
        }
        return false;
    }

    public final ImmutableList A05(boolean z) {
        List list;
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass59G r2 : A00(this)) {
            if (z) {
                C254703su r1 = (C254703su) r2.A00;
                if (A02(r1)) {
                    Object obj = r1.A1T;
                    if ((obj instanceof List) && (list = (List) obj) != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            it.next();
                            arrayList.add(r2.A01);
                        }
                    }
                }
            }
            if (r2.A02 != null) {
                arrayList.add(r2.A01);
            }
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
        0qQ.A07(copyOf);
        return copyOf;
    }

    public final void A07() {
        this.A05.clear();
        this.A08.clear();
        this.A03.clear();
        ((C331307Qj) this.A0A.getValue()).A00.clear();
        this.A09.clear();
    }

    public static final void A01(AnonymousClass7YU r10, C254703su r11, List list, int i) {
        C254873tC r0;
        String str;
        List list2;
        String str2;
        Boolean bool = null;
        if (A02(r11)) {
            Map map = r10.A09;
            map.put(r11, new ArrayList());
            Object obj = r11.A1T;
            if ((obj instanceof List) && (list2 = (List) obj) != null) {
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    List list3 = (List) map.get(r11);
                    if (list3 != null) {
                        list3.add(C295375o3.A00());
                    }
                    Object obj2 = r11.A1T;
                    0qQ.A0C(obj2, AnonymousClass000.A00(12));
                    Object obj3 = ((List) obj2).get(i2);
                    if ((obj3 instanceof C254873tC) && (str2 = ((C254873tC) obj3).A0u) != null) {
                        Uri A032 = 0cp.A03(str2);
                        0qQ.A07(A032);
                        String queryParameter = A032.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        if (queryParameter != null) {
                            UserSession userSession = r10.A04;
                            1E8 A002 = 1E7.A00(userSession);
                            String path = A032.getPath();
                            Boolean bool2 = null;
                            if (path != null) {
                                bool2 = Boolean.valueOf(00l.A0d(path, "reel", false));
                            }
                            1Xj A022 = A002.A02(queryParameter);
                            if (A022 != null && 0qQ.A0K(bool2, true)) {
                                List list4 = (List) map.get(r11);
                                if (list4 != null) {
                                    list4.set(i2, C295375o3.A02(A022));
                                }
                            } else if (0qQ.A0K(bool2, true)) {
                                C48898Ely.A00(userSession, 1ES.A01(), new C40514AdN(r10, r11, i2), queryParameter);
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        ImmutableList A0H = r11.A0H();
        if (A0H != null && (r0 = (C254873tC) 00k.A0J(A0H)) != null && (str = r0.A0u) != null) {
            Uri A033 = 0cp.A03(str);
            0qQ.A07(A033);
            String queryParameter2 = A033.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            if (queryParameter2 != null) {
                UserSession userSession2 = r10.A04;
                1E8 A003 = 1E7.A00(userSession2);
                String path2 = A033.getPath();
                if (path2 != null) {
                    bool = Boolean.valueOf(00l.A0d(path2, "reel", false));
                }
                1Xj A023 = A003.A02(queryParameter2);
                if (A023 != null && 0qQ.A0K(bool, true)) {
                    r11.A14(A023);
                } else if (0qQ.A0K(bool, true)) {
                    C48898Ely.A00(userSession2, 1ES.A01(), new C40515AdO(r11, A003, list, i), queryParameter2);
                    int i3 = r10.A01;
                    if (i < i3) {
                        r10.A01 = i3 - 1;
                    }
                }
            }
        }
    }

    public final ImmutableList A04() {
        List A002 = A00(this);
        ArrayList arrayList = new ArrayList();
        int size = A002.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass59G r2 = (AnonymousClass59G) A002.get(i);
            C254703su r3 = (C254703su) r2.A00;
            if (this.A02 || !A02(r3)) {
                if (A02(r3)) {
                    Map map = this.A09;
                    if (map.get(r3) == null) {
                        A01(this, r3, A002, i);
                    }
                    0sn<Object> r0 = (List) map.get(r3);
                    if (r0 == null) {
                        r0 = 0sn.A00;
                    }
                    for (Object r1 : r0) {
                        arrayList.add(new 0eP(r3, r1));
                    }
                } else {
                    if (r3.A0s == null) {
                        A01(this, r3, A002, i);
                    }
                    1Xj r4 = r3.A0s;
                    if (r4 != null) {
                        arrayList.add(new 0eP(r3, C295375o3.A02(r4)));
                        A002.set(i, new AnonymousClass59G(r2.A00, r2.A01, C295375o3.A02(r4)));
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object obj = ((0eP) it.next()).A01;
            ((C267324bN) obj).A08 = 0sn.A00;
            arrayList2.add(obj);
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList2);
        0qQ.A07(copyOf);
        return copyOf;
    }

    public final void onSessionWillEnd() {
        A07();
    }
}
