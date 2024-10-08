package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cng  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44946Cng {
    public static Map A00(C46319DUw dUw) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUw.getId() != null) {
            C41845B3m.A0x(dUw.getId(), A1H);
        }
        if (dUw.getMediaId() != null) {
            C41845B3m.A13(dUw.getMediaId(), A1H);
        }
        User BRo = dUw.BRo();
        ArrayList arrayList = null;
        if (BRo != null) {
            C41847B3o.A1S(BRo, A1H);
        }
        if (dUw.Bzq() != null) {
            List<DS9> Bzq = dUw.Bzq();
            if (Bzq != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DS9 ds9 : Bzq) {
                    if (ds9 != null) {
                        arrayList.add(ds9.FHC());
                    }
                }
            }
            A1H.put("stickers", arrayList);
        }
        if (dUw.getText() != null) {
            C41845B3m.A10(dUw.getText(), A1H);
        }
        if (dUw.C5C() != null) {
            A1H.put("text_format", dUw.C5C());
        }
        if (dUw.getUserId() != null) {
            A1H.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, dUw.getUserId());
        }
        if (dUw.CDo() != null) {
            A1H.put("vibrant_text_color", dUw.CDo());
        }
        return 0Yt.A0B(A1H);
    }
}
