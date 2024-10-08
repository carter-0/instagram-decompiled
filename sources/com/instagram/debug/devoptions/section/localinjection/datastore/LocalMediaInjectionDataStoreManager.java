package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.AnonymousClass7TG;
import X.C13989Tnp;
import X.Dba;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface LocalMediaInjectionDataStoreManager {
    List getAllInjectionItems();

    List getInjectedJSONStrings(Context context, Set set);

    Map getInjectionDataStore();

    /* renamed from: com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionDataStoreManager$-CC  reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static List $default$getAllInjectionItems(LocalMediaInjectionDataStoreManager localMediaInjectionDataStoreManager) {
            return Dba.A0e(localMediaInjectionDataStoreManager.getInjectionDataStore());
        }

        public static List $default$getInjectedJSONStrings(LocalMediaInjectionDataStoreManager localMediaInjectionDataStoreManager, Context context, Set set) {
            AnonymousClass7TG.A1O(context, set);
            Map injectionDataStore = localMediaInjectionDataStoreManager.getInjectionDataStore();
            ArrayList<LocalInjectionUnit> arrayList = new ArrayList<>();
            for (Object A1R : set) {
                C13989Tnp.A1R(A1R, arrayList, injectionDataStore);
            }
            ArrayList A0r = AnonymousClass7TG.A0r(arrayList);
            for (LocalInjectionUnit jSONTextForInjectedUnit : arrayList) {
                A0r.add(LocalMediaInjectionUtil.getJSONTextForInjectedUnit(context, jSONTextForInjectedUnit));
            }
            return A0r;
        }
    }
}
