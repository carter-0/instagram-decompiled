package X;

import com.instagram.common.session.UserSession;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class F6S {
    public static final OnboardingRepository A00(UserSession userSession, HashMap hashMap) {
        0qQ.A0B(userSession, 0);
        return (OnboardingRepository) userSession.A01(OnboardingRepository.class, new MMW(33, hashMap, userSession));
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo, java.lang.Object] */
    public static final List A01(List list) {
        0qQ.A0B(list, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C47208Dsv dsv = (C47208Dsv) ((DRG) it.next());
            int i = dsv.A00;
            String str = dsv.A01.A00;
            ? obj = new Object();
            obj.A00 = i;
            obj.A02 = str;
            obj.A01 = "incomplete";
            A0r.add(obj);
        }
        return A0r;
    }
}
