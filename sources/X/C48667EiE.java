package X;

import com.instagram.android.R;

/* renamed from: X.EiE  reason: case insensitive filesystem */
public abstract class C48667EiE {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        Integer num;
        String str;
        C307786Rm A09 = C308206Td.A09(r8);
        String A0D = C9812Rha.A00(A09, r8, ((C3034368u) DbT.A0p(r9, 0)).A02).A0D();
        if (A0D != null) {
            Integer[] A00 = AnonymousClass05K.A00(3);
            int length = A00.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    num = A00[i];
                    switch (num.intValue()) {
                        case 1:
                            str = "skip_step";
                            break;
                        case 2:
                            str = "revisit_step";
                            break;
                        default:
                            str = "mark_step_complete";
                            break;
                    }
                    if (!str.equals(A0D)) {
                        i++;
                    }
                } else {
                    num = null;
                }
            }
        } else {
            num = null;
        }
        G7W g7w = (G7W) A09.A01.get(R.id.safety_step_handler);
        if (!(g7w == null || num == null)) {
            int intValue = num.intValue();
            if (intValue == 0) {
                g7w.DPc();
                return null;
            } else if (intValue == 1) {
                g7w.DlN();
                return null;
            } else if (intValue == 2) {
                g7w.Dfs();
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        return null;
    }
}
