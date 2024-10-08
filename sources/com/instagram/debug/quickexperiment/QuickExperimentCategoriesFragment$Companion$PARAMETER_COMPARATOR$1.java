package com.instagram.debug.quickexperiment;

import X.00p;
import X.0qQ;
import X.0yN;
import X.C21258XRd;
import java.util.Comparator;

public final class QuickExperimentCategoriesFragment$Companion$PARAMETER_COMPARATOR$1 implements Comparator {
    public static final QuickExperimentCategoriesFragment$Companion$PARAMETER_COMPARATOR$1 INSTANCE = new QuickExperimentCategoriesFragment$Companion$PARAMETER_COMPARATOR$1();

    public final int compare(0yN r5, 0yN r6) {
        C21258XRd category = QuickExperimentHelper.getCategory(r5);
        C21258XRd category2 = QuickExperimentHelper.getCategory(r6);
        String str = r5.universeName;
        String str2 = r6.universeName;
        if (category != category2) {
            0qQ.A0A(category2);
            return category.compareTo(category2);
        } else if (00p.A0j(str, str2, true)) {
            return r5.name.compareTo(r6.name);
        } else {
            return str.compareTo(str2);
        }
    }
}
