package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

public final class I6B {
    public double A00;
    public String A01;
    public final C268544da A02 = new C268544da();
    public final UserSession A03;
    public final 0xa A04;

    public static final ArrayList A00(I6B i6b) {
        boolean z;
        long j;
        String obj;
        Long A10;
        String obj2;
        Boolean A0A;
        String string = i6b.A04.getString("KEY_SWIPE_HISTORY_V2", (String) null);
        ArrayList A0v = DbS.A0v(20);
        if (string != null) {
            Iterator it = C271114hv.A02((JsonElement) C250863mB.A03.A00(string, JsonElementSerializer.A00)).iterator();
            while (it.hasNext()) {
                JsonElement jsonElement = (JsonElement) it.next();
                Object obj3 = C271114hv.A03(jsonElement).get("goodSwipe");
                if (obj3 == null || (obj2 = obj3.toString()) == null || (A0A = 00l.A0A(obj2)) == null) {
                    z = true;
                } else {
                    z = A0A.booleanValue();
                }
                Object obj4 = C271114hv.A03(jsonElement).get("timeStamp");
                if (obj4 == null || (obj = obj4.toString()) == null || (A10 = AnonymousClass7TE.A10(obj)) == null) {
                    j = 0;
                } else {
                    j = A10.longValue();
                }
                A0v.add(new QP4(j, 2, z));
            }
        }
        return A0v;
    }

    public static final ArrayList A01(I6B i6b) {
        long j;
        String obj;
        String obj2;
        Long A10;
        String string = i6b.A04.getString("KEY_PROFILE_SWIPE_HISTORY", (String) null);
        ArrayList A0v = DbS.A0v(20);
        if (string != null) {
            Iterator it = C271114hv.A02((JsonElement) C250863mB.A03.A00(string, JsonElementSerializer.A00)).iterator();
            while (it.hasNext()) {
                JsonElement jsonElement = (JsonElement) it.next();
                Object obj3 = C271114hv.A03(jsonElement).get("dwellTime");
                long j2 = 0;
                if (obj3 == null || (obj2 = obj3.toString()) == null || (A10 = AnonymousClass7TE.A10(obj2)) == null) {
                    j = 0;
                } else {
                    j = A10.longValue();
                }
                Object obj4 = C271114hv.A03(jsonElement).get("timeStamp");
                if (!(obj4 == null || (obj = obj4.toString()) == null)) {
                    j2 = C51967G9n.A08(AnonymousClass7TE.A10(obj), 0);
                }
                A0v.add(new C381629c4(j, j2, 2));
            }
        }
        return A0v;
    }

    public static final boolean A02(I6B i6b, ArrayList arrayList, ArrayList arrayList2, double d, int i, int i2) {
        int i3;
        String str;
        double d2;
        double d3;
        int i4;
        int i5;
        int i6 = i2;
        long A0l = G9t.A0l(i, System.currentTimeMillis());
        UserSession userSession = i6b.A03;
        long A002 = GP5.A00(userSession);
        boolean A022 = GP5.A02(userSession);
        C58010Ik3.A00(arrayList, new GQ2(A0l, 23), 2);
        if (arrayList2 != null) {
            C58010Ik3.A00(arrayList2, new GQ2(A0l, 24), 2);
        }
        boolean z = false;
        int size = arrayList.size();
        if (!A022 || arrayList2 == null) {
            i3 = 0;
        } else {
            i3 = arrayList2.size();
        }
        if (i3 + size >= i6) {
            List A0h = 00k.A0h(arrayList, i6);
            if (A0h != null) {
                if (!(A0h instanceof Collection) || !A0h.isEmpty()) {
                    Iterator it = A0h.iterator();
                    i5 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            if (((QP4) it.next()).A01 && (i5 = i5 + 1) < 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    i5 = 0;
                }
                d2 = (double) i5;
            } else {
                d2 = 0.0d;
            }
            double d4 = (double) i6;
            double d5 = d2 / d4;
            i6b.A00 = d5;
            if (A022) {
                if (arrayList2 != null) {
                    int i7 = i2 - size;
                    if (i7 <= 0) {
                        i7 = 0;
                    }
                    List<C381629c4> A0h2 = 00k.A0h(arrayList2, i7);
                    if (A0h2 != null) {
                        if (!(A0h2 instanceof Collection) || !A0h2.isEmpty()) {
                            i4 = 0;
                            for (C381629c4 r0 : A0h2) {
                                if (r0.A00 >= A002 && (i4 = i4 + 1) < 0) {
                                    0sr.A1S();
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            }
                        } else {
                            i4 = 0;
                        }
                        d3 = (double) i4;
                        d5 = (d2 + d3) / d4;
                        i6b.A00 = d5;
                    }
                }
                d3 = 0.0d;
                d5 = (d2 + d3) / d4;
                i6b.A00 = d5;
            }
            if (d5 >= d) {
                z = true;
                str = "good_swiper";
            } else {
                str = "bad_swiper";
            }
        } else {
            str = "not_swiper";
        }
        i6b.A01 = str;
        return z;
    }

    public I6B(UserSession userSession) {
        this.A03 = userSession;
        0xa A032 = 1Al.A01(userSession).A03(1An.A0n);
        this.A04 = A032;
        int A042 = DbS.A04(0Tu.A06, userSession, 36599018357394803L);
        if (A042 > DbT.A00(A032, "KEY_SWIPE_HISTORY_VERSION")) {
            0xY AR4 = A032.AR4();
            AR4.ED3("KEY_SWIPE_HISTORY_V2");
            AR4.ED3("KEY_PROFILE_SWIPE_HISTORY");
            AR4.E5Z("KEY_SWIPE_HISTORY_VERSION", A042);
            AR4.apply();
        }
        synchronized (this) {
            long A0l = G9t.A0l(90, System.currentTimeMillis());
            ArrayList A002 = A00(this);
            C58010Ik3.A00(A002, new GQ2(A0l, 27), 2);
            0xa r7 = this.A04;
            0xY AR42 = r7.AR4();
            C268544da r6 = this.A02;
            AR42.E5g("KEY_SWIPE_HISTORY_V2", r6.A0F(A002));
            AR42.apply();
            if (GP5.A02(this.A03)) {
                ArrayList A012 = A01(this);
                C58010Ik3.A00(A012, new GQ2(A0l, 28), 2);
                0xY AR43 = r7.AR4();
                AR43.E5g("KEY_PROFILE_SWIPE_HISTORY", r6.A0F(A012));
                AR43.apply();
            }
        }
    }

    public static final boolean A03(I6B i6b, ArrayList arrayList, ArrayList arrayList2, double d, int i, int i2) {
        int i3;
        String str;
        int i4;
        double d2;
        int i5;
        long A0l = G9t.A0l(i, System.currentTimeMillis());
        UserSession userSession = i6b.A03;
        long A002 = GP5.A00(userSession);
        boolean A022 = GP5.A02(userSession);
        C58010Ik3.A00(arrayList, new GQ2(A0l, 25), 2);
        if (arrayList2 != null) {
            C58010Ik3.A00(arrayList2, new GQ2(A0l, 26), 2);
        }
        boolean z = false;
        int size = arrayList.size();
        if (!A022 || arrayList2 == null) {
            i3 = 0;
        } else {
            i3 = arrayList2.size();
        }
        int i6 = i3 + size;
        if (i6 >= i2) {
            double d3 = 0.0d;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                i4 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (((QP4) it.next()).A01 && (i4 = i4 + 1) < 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                i4 = 0;
            }
            double d4 = (double) i4;
            if (size > 0) {
                d2 = d4 / ((double) size);
            } else {
                d2 = i6b.A00;
            }
            i6b.A00 = d2;
            if (A022) {
                if (arrayList2 != null) {
                    if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        i5 = 0;
                        while (it2.hasNext()) {
                            if (((C381629c4) it2.next()).A00 >= A002 && (i5 = i5 + 1) < 0) {
                                0sr.A1S();
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    } else {
                        i5 = 0;
                    }
                    d3 = (double) i5;
                }
                d2 = (d4 + d3) / ((double) i6);
                i6b.A00 = d2;
            }
            if (d2 >= d) {
                z = true;
                str = "good_swiper";
            } else {
                str = "bad_swiper";
            }
        } else {
            str = "not_swiper";
        }
        i6b.A01 = str;
        return z;
    }
}
