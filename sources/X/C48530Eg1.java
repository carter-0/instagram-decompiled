package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem;
import libraries.access.src.main.base.common.FXDeviceItem;

/* renamed from: X.Eg1  reason: case insensitive filesystem */
public abstract class C48530Eg1 {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        if (r10.A03 != null) {
            Object A02 = r11.A02();
            String A00 = AnonymousClass000.A00(12);
            0qQ.A0C(A02, A00);
            List list = (List) A02;
            Object A002 = r11.A00();
            0qQ.A0C(A002, A00);
            List list2 = (List) A002;
            DbS.A1Y(DbU.A0j(r11));
            C277014uI A0P = DbW.A0P(r11, 5);
            C277014uI A0P2 = DbW.A0P(r11, 6);
            if (!list.isEmpty() && !list2.isEmpty()) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                if (00k.A0I(list) instanceof String) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            A1C.add(C368108s5.valueOf(AnonymousClass7TE.A18(it)));
                        } catch (IllegalArgumentException | NullPointerException unused) {
                        }
                    }
                    if (00k.A0I(list2) instanceof String) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            try {
                                A1C2.add(C62447Kfx.valueOf(AnonymousClass7TE.A18(it2)));
                            } catch (IllegalArgumentException | NullPointerException unused2) {
                            }
                        }
                        ArrayList A1C3 = AnonymousClass7TE.A1C();
                        Iterator it3 = A1C.iterator();
                        while (it3.hasNext()) {
                            C368108s5 r3 = (C368108s5) it3.next();
                            Iterator it4 = A1C2.iterator();
                            while (it4.hasNext()) {
                                A1C3.add(new FXAccessLibraryDeviceRequestItem(r3, (C62447Kfx) it4.next()));
                            }
                        }
                        ArrayList A003 = A0R.A00(DbU.A0V(r10), "caa_access_library_fetch_device_id", "BKBloksFxActionFetchDeviceIDImpl", new FXAccessLibraryDeviceRequest((List) A1C3));
                        if (A003 == null || A003.isEmpty()) {
                            DbS.A1Q(r10, A0P2);
                        } else {
                            ArrayList A1C4 = AnonymousClass7TE.A1C();
                            Iterator it5 = A003.iterator();
                            while (it5.hasNext()) {
                                FXDeviceItem fXDeviceItem = (FXDeviceItem) it5.next();
                                C368108s5 r0 = fXDeviceItem.A00;
                                C62447Kfx kfx = fXDeviceItem.A03;
                                String str = fXDeviceItem.A02;
                                if (!(r0 == null || kfx == null || str == null)) {
                                    HashMap A1E = AnonymousClass7TE.A1E();
                                    A1E.put("app_source", r0.name());
                                    A1E.put("device_id_type", kfx.name());
                                    A1E.put(Dbp.A02(0, 9, 37), str);
                                    A1C4.add(A1E);
                                }
                            }
                            DbX.A1O(r10, DbS.A0P(), A0P, A1C4);
                            return null;
                        }
                    }
                }
            }
        }
        return null;
    }
}
