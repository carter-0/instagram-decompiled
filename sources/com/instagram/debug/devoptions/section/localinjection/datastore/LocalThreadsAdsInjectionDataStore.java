package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.002;
import X.0Yv;
import X.0sr;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13991Tnr;
import X.C13992Tns;
import X.Dba;
import android.content.Context;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionDataStoreManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class LocalThreadsAdsInjectionDataStore implements LocalMediaInjectionDataStoreManager {
    public /* synthetic */ List getInjectedJSONStrings(Context context, Set set) {
        return LocalMediaInjectionDataStoreManager.CC.$default$getInjectedJSONStrings(this, context, set);
    }

    public Map getInjectionDataStore() {
        List A1I = AnonymousClass7TE.A1I(new LocalInjectionUnit.Item("Single Image Ad Thread", "single_image_ad_thread.json", (String) null));
        ArrayList A0p = AnonymousClass7TF.A0p(A1I);
        int i = 0;
        for (Object next : A1I) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            LocalInjectionUnit.Item item = (LocalInjectionUnit.Item) next;
            A0p.add(new LocalInjectionUnit(C13992Tns.A0L(item), 002.A0R("threads_ads/", item.filename), item.name, LocalInjectionUnit.InjectionUnitType.THREADS_ADS));
            i = i2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(0Yv.A1E(A0p, 10)));
        Iterator it = A0p.iterator();
        while (it.hasNext()) {
            C13991Tnr.A1T(it, linkedHashMap);
        }
        return linkedHashMap;
    }

    public /* synthetic */ List getAllInjectionItems() {
        return Dba.A0e(getInjectionDataStore());
    }
}
