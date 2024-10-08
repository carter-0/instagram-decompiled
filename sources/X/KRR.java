package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.direct.stella.api.IpcConstants$RequestAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public final class KRR extends ONU {
    public List A00;

    public final ImmutableMap A00() {
        Object obj;
        JSONArray jSONArray = new JSONArray();
        List<C60965JuN> list = this.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C60965JuN juN : list) {
            String str = juN.A04;
            if (str != null) {
                A1C.add(str);
            }
        }
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            DbT.A1W(it, jSONArray);
        }
        C60965JuN juN2 = (C60965JuN) 00k.A0J(list);
        Object obj2 = "";
        if (juN2 == null || (obj = juN2.A03) == null) {
            obj = obj2;
        }
        C60965JuN juN3 = (C60965JuN) 00k.A0J(list);
        if (juN3 != null) {
            obj2 = Integer.valueOf(juN3.A02);
        }
        return ImmutableMap.of(AnonymousClass000.A00(3569), jSONArray, C66955Mfo.A01(), obj, AnonymousClass000.A00(2997), obj2);
    }

    public final String A01() {
        return IpcConstants$RequestAction.IMPORT_MEDIA_ITEM.toString();
    }
}
