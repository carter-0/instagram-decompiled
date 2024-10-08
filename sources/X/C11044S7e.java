package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.S7e  reason: case insensitive filesystem */
public final class C11044S7e {
    public final 02U A00;
    public final C10365Rr2 A01;
    public final S09 A02;
    public final C10176Rnr A03;
    public final C10177Rns A04;
    public final SEN A05 = new SEN();
    public final C10370Rr7 A06 = new C10370Rr7();
    public final S12 A07;
    public final S0A A08;
    public final C11170SDn A09;

    public final C13694TfC A00(Object obj) {
        C13694TfC AEF;
        C11170SDn sDn = this.A09;
        synchronized (sDn) {
            C9217RTu.A00(obj);
            Map map = sDn.A00;
            Class<?> cls = obj.getClass();
            C13693TfB tfB = (C13693TfB) map.get(cls);
            if (tfB == null) {
                Iterator A0v = AnonymousClass7TF.A0v(map);
                while (true) {
                    if (!A0v.hasNext()) {
                        tfB = C11170SDn.A01;
                        break;
                    }
                    tfB = (C13693TfB) A0v.next();
                    if (tfB.AvH().isAssignableFrom(cls)) {
                        break;
                    }
                }
            }
            AEF = tfB.AEF(obj);
        }
        return AEF;
    }

    public final List A01() {
        List list;
        C10177Rns rns = this.A04;
        synchronized (rns) {
            list = rns.A00;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new C7502QGt();
    }

    public final List A02(Object obj) {
        List list;
        ArrayList A1C;
        C10365Rr2 rr2 = this.A01;
        Class<?> cls = obj.getClass();
        synchronized (rr2) {
            Map map = rr2.A00.A00;
            C10173Rno rno = (C10173Rno) map.get(cls);
            if (rno == null) {
                list = null;
            } else {
                list = rno.A00;
            }
            if (list == null) {
                SHV shv = rr2.A01;
                synchronized (shv) {
                    try {
                        A1C = AnonymousClass7TE.A1C();
                        for (C10529Rti rti : shv.A02) {
                            Set set = shv.A03;
                            if (!set.contains(rti) && rti.A02.isAssignableFrom(cls)) {
                                set.add(rti);
                                C13698TfG AEG = rti.A00.AEG(shv);
                                C9217RTu.A00(AEG);
                                A1C.add(AEG);
                                set.remove(rti);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                list = Collections.unmodifiableList(A1C);
                if (map.put(cls, new C10173Rno(list)) != null) {
                    th = C66582MXn.A0k(cls, "Already cached loaders for model: ", AnonymousClass7TE.A1A());
                    throw th;
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                C13698TfG tfG = (C13698TfG) list.get(i);
                if (tfG.CJT(obj)) {
                    if (z) {
                        emptyList = DbS.A0v(size - i);
                        z = false;
                    }
                    emptyList.add(tfG);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Found ModelLoaders for model class: ");
            A1A.append(list);
            throw new RuntimeException(AnonymousClass7TG.A0m(obj, ", but none that handle this specific model instance: ", A1A));
        }
        throw new RuntimeException(AnonymousClass7TG.A0m(cls, "Failed to find any ModelLoaders registered for model class: ", AnonymousClass7TE.A1A()));
    }

    public final void A03(C13691Tf9 tf9, Class cls, Class cls2, String str) {
        S12 s12 = this.A07;
        synchronized (s12) {
            JTR.A1T(str, s12.A00);
            Map map = s12.A01;
            List A13 = C66580MXl.A13(str, map);
            if (A13 == null) {
                A13 = AnonymousClass7TE.A1C();
                map.put(str, A13);
            }
            A13.add(new C10531Rtk(tf9, cls, cls2));
        }
    }

    public final void A04(C13915TlH tlH, Class cls) {
        S0A s0a = this.A08;
        synchronized (s0a) {
            s0a.A00.add(new C10371Rr8(tlH, cls));
        }
    }

    public final void A05(C13693TfB tfB) {
        C11170SDn sDn = this.A09;
        synchronized (sDn) {
            sDn.A00.put(tfB.AvH(), tfB);
        }
    }

    public final void A06(C13535Tc7 tc7, Class cls, Class cls2) {
        C10365Rr2 rr2 = this.A01;
        synchronized (rr2) {
            SHV shv = rr2.A01;
            synchronized (shv) {
                C10529Rti rti = new C10529Rti(tc7, cls, cls2);
                List list = shv.A02;
                list.add(list.size(), rti);
            }
            rr2.A00.A00.clear();
        }
    }

    public final void A07(C13538TcA tcA, Class cls, Class cls2) {
        S09 s09 = this.A02;
        synchronized (s09) {
            s09.A00.add(new C10530Rtj(tcA, cls, cls2));
        }
    }

    public C11044S7e() {
        C11608SdB sdB = new C11608SdB(new 0l2(20), new C12002SkL(1), new C12007SkQ());
        this.A00 = sdB;
        this.A01 = new C10365Rr2(sdB);
        this.A03 = new C10176Rnr();
        this.A07 = new S12();
        this.A08 = new S0A();
        this.A09 = new C11170SDn();
        this.A02 = new S09();
        this.A04 = new C10177Rns();
        List asList = Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"});
        ArrayList A0m = C51970G9q.A0m(asList);
        A0m.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            JTT.A1U(A0m, it);
        }
        A0m.add("legacy_append");
        S12 s12 = this.A07;
        synchronized (s12) {
            List list = s12.A00;
            ArrayList A1D = AnonymousClass7TE.A1D(list);
            list.clear();
            Iterator it2 = A0m.iterator();
            while (it2.hasNext()) {
                list.add(AnonymousClass7TE.A18(it2));
            }
            Iterator it3 = A1D.iterator();
            while (it3.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it3);
                if (!A0m.contains(A18)) {
                    list.add(A18);
                }
            }
        }
    }
}
