package androidx.transition;

import X.06y;
import X.C14283TtH;
import X.C14284TtI;
import X.C14915UEz;
import X.C18935WDn;
import X.C18951WEe;
import X.C18952WEf;
import X.C20992X8o;
import X.S4g;
import X.UF0;
import X.UF5;
import X.UF8;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class FragmentTransitionSupport extends 06y {
    public final void A0D(S4g s4g, Fragment fragment, Object obj, Runnable runnable) {
        A0E(s4g, fragment, obj, (Runnable) null, runnable);
    }

    public final boolean A0L() {
        return true;
    }

    public final Object A02(ViewGroup viewGroup, Object obj) {
        return C14283TtH.A01(viewGroup, (C14284TtI) obj);
    }

    public final Object A03(Object obj) {
        if (obj != null) {
            return ((C14284TtI) obj).clone();
        }
        return null;
    }

    public final Object A04(Object obj) {
        if (obj == null) {
            return null;
        }
        UF5 uf5 = new UF5();
        uf5.A0e((C14284TtI) obj);
        return uf5;
    }

    public final Object A05(Object obj, Object obj2, Object obj3) {
        C14284TtI ttI = (C14284TtI) obj;
        C14284TtI ttI2 = (C14284TtI) obj2;
        C14284TtI ttI3 = (C14284TtI) obj3;
        if (ttI == null) {
            ttI = null;
            if (ttI2 != null) {
                ttI = ttI2;
            }
        } else if (ttI2 != null) {
            UF5 uf5 = new UF5();
            uf5.A0e(ttI);
            ttI = uf5;
            uf5.A0e(ttI2);
            uf5.A03 = false;
        }
        if (ttI3 == null) {
            return ttI;
        }
        UF5 uf52 = new UF5();
        if (ttI != null) {
            uf52.A0e(ttI);
        }
        uf52.A0e(ttI3);
        return uf52;
    }

    public final Object A06(Object obj, Object obj2, Object obj3) {
        UF5 uf5 = new UF5();
        if (obj != null) {
            uf5.A0e((C14284TtI) obj);
        }
        uf5.A0e((C14284TtI) obj2);
        return uf5;
    }

    public final void A07(Rect rect, Object obj) {
        ((C14284TtI) obj).A0V(new UF0(rect, this));
    }

    public final void A08(View view, Object obj) {
        ((C14284TtI) obj).A08(view);
    }

    public final void A09(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            06y.A00(view, rect);
            ((C14284TtI) obj).A0V(new C14915UEz(rect, this));
        }
    }

    public final void A0A(View view, Object obj, ArrayList arrayList) {
        ((C14284TtI) obj).A0A(new C18952WEf(view, this, arrayList));
    }

    public final void A0B(View view, Object obj, ArrayList arrayList) {
        C14284TtI ttI = (C14284TtI) obj;
        ArrayList arrayList2 = ttI.A0J;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            06y.A01((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        A0I(ttI, arrayList);
    }

    public final void A0C(ViewGroup viewGroup, Object obj) {
        C14283TtH.A02(viewGroup, (C14284TtI) obj);
    }

    public final void A0E(S4g s4g, Fragment fragment, Object obj, Runnable runnable, Runnable runnable2) {
        C14284TtI ttI = (C14284TtI) obj;
        s4g.A01(new C18935WDn(ttI, runnable, runnable2));
        ttI.A0A(new C18951WEe(this, runnable2));
    }

    public final void A0F(Object obj) {
        ((C20992X8o) obj).ABI();
    }

    public final void A0G(Object obj, float f) {
        C20992X8o x8o = (C20992X8o) obj;
        if (x8o.CaO()) {
            long AzM = x8o.AzM();
            long j = (long) (f * ((float) AzM));
            if (j == 0) {
                j = 1;
            }
            if (j == AzM) {
                j = AzM - 1;
            }
            x8o.ETa(j);
        }
    }

    public final void A0H(Object obj, Object obj2, Object obj3, Object obj4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ((C14284TtI) obj).A0A(new UF8(this, obj2, obj4, arrayList, arrayList3));
    }

    public final void A0I(Object obj, ArrayList arrayList) {
        Object obj2;
        C14284TtI ttI = (C14284TtI) obj;
        if (ttI != null) {
            int i = 0;
            if (ttI instanceof UF5) {
                UF5 uf5 = (UF5) ttI;
                int size = uf5.A02.size();
                while (i < size) {
                    if (i >= 0) {
                        ArrayList arrayList2 = uf5.A02;
                        if (i < arrayList2.size()) {
                            obj2 = arrayList2.get(i);
                            A0I(obj2, arrayList);
                            i++;
                        }
                    }
                    obj2 = null;
                    A0I(obj2, arrayList);
                    i++;
                }
                return;
            }
            ArrayList arrayList3 = ttI.A0I;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                ArrayList arrayList4 = ttI.A0J;
                if (arrayList4 == null || arrayList4.isEmpty()) {
                    int size2 = arrayList.size();
                    while (i < size2) {
                        ttI.A08((View) arrayList.get(i));
                        i++;
                    }
                }
            }
        }
    }

    public final void A0J(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C14284TtI ttI = (C14284TtI) obj;
        if (ttI != null) {
            ArrayList arrayList3 = ttI.A0J;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            A0O(ttI, arrayList, arrayList2);
        }
    }

    public final void A0K(Runnable runnable, Object obj) {
        ((C20992X8o) obj).ABJ(runnable);
    }

    public final boolean A0M(Object obj) {
        return obj instanceof C14284TtI;
    }

    public final boolean A0N(Object obj) {
        return ((C14284TtI) obj).A0a();
    }

    public final void A0O(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Object obj2;
        C14284TtI ttI = (C14284TtI) obj;
        int i = 0;
        if (ttI instanceof UF5) {
            UF5 uf5 = (UF5) ttI;
            int size = uf5.A02.size();
            while (i < size) {
                if (i >= 0) {
                    ArrayList arrayList3 = uf5.A02;
                    if (i < arrayList3.size()) {
                        obj2 = arrayList3.get(i);
                        A0O(obj2, arrayList, arrayList2);
                        i++;
                    }
                }
                obj2 = null;
                A0O(obj2, arrayList, arrayList2);
                i++;
            }
            return;
        }
        ArrayList arrayList4 = ttI.A0I;
        if (arrayList4 == null || arrayList4.isEmpty()) {
            ArrayList arrayList5 = ttI.A0J;
            if (arrayList5.size() == arrayList.size() && arrayList5.containsAll(arrayList)) {
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        ttI.A08((View) arrayList2.get(i));
                        i++;
                    }
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        ttI.A09((View) arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
