package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D2h  reason: case insensitive filesystem */
public abstract class C45708D2h {
    public static C308416Ue parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C308416Ue r0 = new C308416Ue();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if (C41846B3n.A1Z(r4, r4.A0q())) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C308406Ud parseFromJson = C45122Cqg.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r0.A00 = arrayList;
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r5, C308416Ue r6) {
        r5.A0c();
        if (r6.A00 != null) {
            16P.A03(r5, DialogModule.KEY_ITEMS);
            for (C308406Ud r3 : r6.A00) {
                if (r3 != null) {
                    r5.A0c();
                    String str = r3.A05;
                    if (str != null) {
                        r5.A0R("reel_id", str);
                    }
                    C41846B3n.A11(r5, r3.A02);
                    String str2 = r3.A06;
                    if (str2 != null) {
                        r5.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
                    }
                    r5.A0Q("taken_at_seconds", r3.A01);
                    r5.A0Q("timestamp_seconds", r3.A00);
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        r5.A0Z();
    }
}
