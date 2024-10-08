package X;

import java.util.Comparator;

/* renamed from: X.Ijy  reason: case insensitive filesystem */
public final class C58005Ijy implements Comparator {
    public static final C58005Ijy A00 = new Object();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C268794e0 r8 = (C268794e0) obj;
        C268794e0 r9 = (C268794e0) obj2;
        boolean A03 = C56608I4i.A03(r8);
        int i = 0;
        boolean A032 = C56608I4i.A03(r9);
        if (A03) {
            if (!A032) {
                return -1;
            }
            AnonymousClass5R6 A02 = AnonymousClass5WH.A02(r8);
            AnonymousClass5R6 A022 = AnonymousClass5WH.A02(r9);
            if (0qQ.A0K(A02, A022)) {
                return 0;
            }
            C285045Pl r5 = new C285045Pl(new AnonymousClass5R6[16]);
            while (A02 != null) {
                r5.A04(0, A02);
                A02 = A02.A0B();
            }
            C285045Pl r4 = new C285045Pl(new AnonymousClass5R6[16]);
            while (A022 != null) {
                r4.A04(0, A022);
                A022 = A022.A0B();
            }
            int min = Math.min(r5.A00 - 1, r4.A00 - 1);
            if (min >= 0) {
                while (0qQ.A0K(r5.A02[i], r4.A02[i])) {
                    if (i != min) {
                        i++;
                    }
                }
                return 0qQ.A00(((AnonymousClass5R6) r5.A02[i]).A0U.A0J.A03, ((AnonymousClass5R6) r4.A02[i]).A0U.A0J.A03);
            }
            throw AnonymousClass7TE.A0z("Could not find a common ancestor between the two FocusModifiers.");
        } else if (!A032) {
            return 0;
        } else {
            return 1;
        }
    }
}
