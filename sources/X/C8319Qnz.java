package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: X.Qnz  reason: case insensitive filesystem */
public abstract class C8319Qnz extends Qo0 {
    public static void A01(C256873wU r10, C256683wB r11, C256823wP r12, List list, int i) {
        String A00 = C273654mx.A00(1023);
        String A002 = C273654mx.A00(1024);
        try {
            int A01 = AnonymousClass4PI.A01(r11, r12, false);
            if (A01 != (i & 63)) {
                List<2Km> Ave = r12.Ave(r11.A0W, AnonymousClass7TF.A1V(r11.A0O), false);
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append(C273654mx.A00(1297));
                A1A.append(Integer.toBinaryString(A01));
                A1A.append(A002);
                A1A.append(Integer.toBinaryString(i));
                Pxf.A1K(r11, " for ", A00, A1A);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A1A.append("\t");
                    A1A.append(((2Km) it.next()).A03);
                    A1A.append("\n");
                }
                A1A.append(C273654mx.A00(1296));
                for (2Km r0 : Ave) {
                    A1A.append("\t");
                    A1A.append(r0.A03);
                    A1A.append("\n");
                }
                String obj = A1A.toString();
                2AG.A04("MCVR3", obj);
                r10.ClG(obj);
            }
        } catch (AnonymousClass275 e) {
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            Pxf.A1K(e, C273654mx.A00(1298), A002, A1A2);
            A1A2.append(Integer.toBinaryString(i));
            Pxf.A1K(r11, " for ", A00, A1A2);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A1A2.append("\t");
                A1A2.append(((2Km) it2.next()).A03);
                A1A2.append("\n");
            }
            String obj2 = A1A2.toString();
            2AG.A04("MCVR3", obj2);
            r10.ClG(obj2);
        }
    }

    public static List A00(Context context, C256683wB r3, C256823wP r4, boolean z, boolean z2) {
        List Ave;
        String str = r3.A0W;
        if (str == null) {
            return ImmutableList.of();
        }
        if ("video/dolby-vision".equals(str) && !C9694RfC.A00(context)) {
            String A03 = 2BR.A03(r3);
            if (A03 == null) {
                Ave = ImmutableList.of();
            } else {
                Ave = r4.Ave(A03, z, z2);
            }
            if (!Ave.isEmpty()) {
                return Ave;
            }
        }
        return 2BR.A02(r3, r4, z, z2);
    }
}
