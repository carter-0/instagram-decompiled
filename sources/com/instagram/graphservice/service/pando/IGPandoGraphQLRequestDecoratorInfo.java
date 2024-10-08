package com.instagram.graphservice.service.pando;

import X.0qQ;
import X.AnonymousClass2ZH;
import X.AnonymousClass2ZI;
import X.C253253qS;
import X.C253263qT;
import X.C253273qV;
import X.C61930qI;
import X.C62320sa;

public final class IGPandoGraphQLRequestDecoratorInfo {
    public static final C253273qV Companion = new Object();
    public final C253263qT regionHintEligibilityHelper;
    public final AnonymousClass2ZI regionHintStore;
    public final C62320sa requestUrlProvider;

    public IGPandoGraphQLRequestDecoratorInfo(AnonymousClass2ZI r2, C253263qT r3, C62320sa r4) {
        0qQ.A0B(r4, 3);
        this.regionHintStore = r2;
        this.regionHintEligibilityHelper = r3;
        this.requestUrlProvider = r4;
    }

    public final boolean shouldUseRegionHint(String str) {
        0qQ.A0B(str, 0);
        C253263qT r0 = this.regionHintEligibilityHelper;
        if (r0 != null) {
            return ((C253253qS) r0).A00.contains(str);
        }
        return false;
    }

    public final String getRegionHint() {
        String str;
        AnonymousClass2ZI r1 = this.regionHintStore;
        if (r1 != null) {
            AnonymousClass2ZH r12 = (AnonymousClass2ZH) r1;
            synchronized (r12) {
                str = r12.A00;
            }
            if (str == null) {
                return "";
            }
            return str;
        }
        return "";
    }

    public final String getRequestUrl() {
        return (String) this.requestUrlProvider.invoke();
    }

    public final String getAcceptLanguageHeader() {
        return C61930qI.A00();
    }
}
