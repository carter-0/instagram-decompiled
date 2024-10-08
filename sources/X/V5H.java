package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public abstract class V5H {
    /* JADX WARNING: type inference failed for: r0v19, types: [X.52S, X.52V] */
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        Integer num;
        Object A03 = r11.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        Object A032 = r11.A03(1);
        0qQ.A0C(A032, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r2 = (C276544tV) A032;
        Ty7 A0P = C13989Tnp.A0P(r10, (C276544tV) A03, r11, 2);
        Object A00 = C276544tV.A00(r2, 36);
        if (!(A00 instanceof String) || A00 == null) {
            A00 = String.valueOf(C276544tV.A00(r2, 36));
        }
        if (A0P != null) {
            String A0D = r2.A0D();
            boolean A0T = r2.A0T(true);
            String A0E = r2.A0E();
            if (C245983dn.A03()) {
                List list = A0P.A01.A03;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    String A0C = ((C14538Txy) list.get(i)).A01.A0C();
                    if (A0C == null || !A0C.equals(A00)) {
                        i++;
                    } else if (i >= 0) {
                        int i2 = 0;
                        if (A0E != null) {
                            if (A0E.endsWith("%")) {
                                1Kn.A02("CollectionBinderUtils", "Offsets defined as a percentage value are not supported");
                            } else {
                                try {
                                    i2 = (int) AnonymousClass6Su.A01(A0E);
                                } catch (C258053yO unused) {
                                    1Kn.A02("CollectionBinderUtils", "Error parsing offset when scrolling to index");
                                }
                            }
                        }
                        C14544Ty5 ty5 = A0P.A02;
                        RecyclerView recyclerView = ty5.A07;
                        if (recyclerView != null) {
                            if (A0P.A00 == null) {
                                ? r0 = new AnonymousClass52S(recyclerView.getContext());
                                r0.A00 = 0;
                                r0.A03 = true;
                                r0.A01 = 0;
                                A0P.A00 = r0;
                            }
                            C228432lf r8 = A0P.A05;
                            VUP vup = null;
                            if (!(r8 == null || i2 == 0 || (num = A0P.A07) == null || A0D == null || !(!C16922VAz.A00(num).equalsIgnoreCase(A0D)))) {
                                vup = new VUP(ty5.A07, r8, A0P.A00);
                            }
                            AnonymousClass52V r1 = A0P.A00;
                            r1.A02 = vup;
                            r1.A0F(A0D);
                            r1.A00 = i2;
                            r1.A03 = A0T;
                            r1.A00 = i;
                            C252553pI r02 = ty5.A07.A0D;
                            if (r02 != null) {
                                r02.A0t(r1);
                            }
                        } else {
                            ty5.A00 = i;
                            if (A0D == null) {
                                A0D = "";
                            }
                            ty5.A09 = A0D;
                            ty5.A03 = i2;
                            ty5.A0C = A0T;
                            return null;
                        }
                    }
                }
            } else {
                throw new RuntimeException("scrollToIndexById cannot be called from a background thread.");
            }
        }
        return null;
    }
}
