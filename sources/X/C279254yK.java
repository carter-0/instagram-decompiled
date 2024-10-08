package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.4yK  reason: invalid class name and case insensitive filesystem */
public final class C279254yK implements Comparator, C61110lV {
    public final int A00;
    public final int A01;
    public final Handler A02;
    public final C279274yM A03 = new C279274yM(this);
    public final 1NH A04;
    public final Map A05;
    public final Map A06;
    public final Set A07 = new HashSet();
    public final TreeSet A08;

    public C279254yK(int i, int i2) {
        1NH r4 = new 1NH(C60960kU.A00, new C279264yL(), 914945323);
        01r r3 = new 01r(0);
        01r r2 = new 01r(0);
        Handler handler = new Handler(C64021Cb.A00());
        this.A04 = r4;
        this.A05 = r3;
        this.A02 = handler;
        this.A06 = r2;
        this.A08 = new TreeSet(this);
        this.A00 = i;
        this.A01 = i2;
        14i.A03(15Y.A03, this);
    }

    public static String A00(String str, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("-");
        sb.append(j2);
        sb.append("-");
        sb.append(str.hashCode());
        return sb.toString();
    }

    public static void A01(C279254yK r4, C17731Vd0 vd0, String str) {
        Map map = r4.A05;
        Object obj = map.get(str);
        if (obj != null) {
            r4.A08.remove(obj);
        }
        map.put(str, vd0);
        r4.A08.add(vd0);
        r4.A07.add(str);
        Handler handler = r4.A02;
        C279274yM r2 = r4.A03;
        handler.removeCallbacks(r2);
        handler.postDelayed(r2, 500);
    }

    public static void A02(C279254yK r2, String str) {
        List<AnonymousClass5AC> list = (List) r2.A06.remove(str);
        if (list != null) {
            for (AnonymousClass5AC A032 : list) {
                r2.A03(A032);
            }
        }
    }

    public final void A03(AnonymousClass5AC r8) {
        String str;
        YAE yae;
        String str2 = r8.A0B;
        if (str2.hashCode() % this.A01 == 0) {
            switch (r8.A09.ordinal()) {
                case 0:
                    long j = r8.A05;
                    str = A00(str2, j, j + r8.A02);
                    yae = new C19141WMx(r8, this, str);
                    break;
                case 1:
                    long j2 = r8.A05;
                    str = A00(str2, j2, j2 + r8.A02);
                    yae = new C19143WMz(r8, this, str);
                    break;
                case 2:
                    long j3 = r8.A04;
                    str = A00(str2, j3, j3 + r8.A03);
                    yae = new C19142WMy(r8, this, str);
                    break;
                default:
                    return;
            }
            C17731Vd0 vd0 = (C17731Vd0) this.A05.get(str);
            if (vd0 != null) {
                yae.DLp(vd0);
                return;
            }
            Map map = this.A06;
            List list = (List) map.get(str);
            if (list != null) {
                list.add(r8);
                return;
            }
            map.put(str, new ArrayList());
            this.A04.A03(new Y00(yae, this, str), str);
        }
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return (((C17731Vd0) obj).A04 > ((C17731Vd0) obj2).A04 ? 1 : (((C17731Vd0) obj).A04 == ((C17731Vd0) obj2).A04 ? 0 : -1));
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-1862185450);
        this.A02.post(this.A03);
        AnonymousClass0fD.A0A(-1735118791, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-30726832, AnonymousClass0fD.A03(-1854713680));
    }
}
