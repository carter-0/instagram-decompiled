package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8wg  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C370568wg {
    public static Map A00(C246213eD r5) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = null;
        if (r5.BIO() != null) {
            List<C246193eB> BIO = r5.BIO();
            if (BIO != null) {
                arrayList = new ArrayList();
                for (C246193eB r0 : BIO) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("interested", arrayList);
        }
        if (r5.BWW() != null) {
            List<C246193eB> BWW = r5.BWW();
            if (BWW != null) {
                arrayList2 = new ArrayList();
                for (C246193eB r02 : BWW) {
                    if (r02 != null) {
                        arrayList2.add(r02.FHC());
                    }
                }
            }
            linkedHashMap.put(NetInfoModule.CONNECTION_TYPE_NONE, arrayList2);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
