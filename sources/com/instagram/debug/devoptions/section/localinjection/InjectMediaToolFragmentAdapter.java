package com.instagram.debug.devoptions.section.localinjection;

import X.0hq;
import X.AnonymousClass7TG;
import X.DbU;
import X.UFN;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants;
import java.util.ArrayList;
import java.util.List;

public final class InjectMediaToolFragmentAdapter extends UFN {
    public final List injectionGroups;
    public final UserSession userSession;

    public Fragment createItem(int i) {
        InjectMediaFragment injectMediaFragment = new InjectMediaFragment();
        Bundle bundle = new Bundle();
        DbU.A1D(bundle, this.userSession);
        List<LocalMediaInjectionConstants.InjectionContentType> list = ((LocalMediaInjectionConstants.InjectionGroup) this.injectionGroups.get(i)).options;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (LocalMediaInjectionConstants.InjectionContentType value : list) {
            A0r.add(value.getValue());
        }
        bundle.putStringArrayList(LocalMediaInjectionConstants.CONTENT_TYPE_KEY, new ArrayList(A0r));
        injectMediaFragment.setArguments(bundle);
        return injectMediaFragment;
    }

    public int getCount() {
        return this.injectionGroups.size();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InjectMediaToolFragmentAdapter(0hq r1, UserSession userSession2, List list) {
        super(r1);
        AnonymousClass7TG.A1U(r1, userSession2, list);
        this.userSession = userSession2;
        this.injectionGroups = list;
    }
}
