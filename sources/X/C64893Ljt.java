package X;

import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Ljt  reason: case insensitive filesystem */
public final class C64893Ljt implements C250603lj {
    public final /* synthetic */ AnonymousClass7EI A00;
    public final /* synthetic */ HashMap A01;

    public C64893Ljt(AnonymousClass7EI r1, HashMap hashMap) {
        this.A01 = hashMap;
        this.A00 = r1;
    }

    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        int intValue = r10.CEk(r9).intValue();
        if (intValue == 0 || intValue == 1) {
            C59671JTb jTb = (C59671JTb) r9.A04;
            if (!jTb.A00) {
                jTb.A00 = true;
                HashMap hashMap = this.A01;
                Iterator it = hashMap.keySet().iterator();
                while (it.hasNext()) {
                    String str = (String) AnonymousClass7TF.A0a(it);
                    UserSession userSession = this.A00.A02;
                    String A0r = DbS.A0r(str, hashMap);
                    if (str != null) {
                        WearablesAppAttributionType wearablesAppAttributionType = null;
                        if (A0r != null) {
                            if (A0r.equals("Hammerhead")) {
                                wearablesAppAttributionType = WearablesAppAttributionType.HAMMERHEAD;
                            } else if (A0r.equals("Stella")) {
                                wearablesAppAttributionType = WearablesAppAttributionType.STELLA;
                            }
                        }
                        HWP.A00(C54676HOh.ATTRIBUTE_IMPRESSION, wearablesAppAttributionType, userSession, str, "igd_message");
                    }
                }
                return;
            }
            return;
        }
        ((C59671JTb) r9.A04).A00 = false;
    }
}
