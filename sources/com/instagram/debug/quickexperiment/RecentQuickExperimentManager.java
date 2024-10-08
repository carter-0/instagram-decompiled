package com.instagram.debug.quickexperiment;

import X.0KC;
import X.0qQ;
import X.0tS;
import X.0yN;
import X.16P;
import X.AnonymousClass7TE;
import X.DbS;
import X.DbT;
import X.DbV;
import java.io.IOException;
import java.util.List;

public final class RecentQuickExperimentManager {
    public static final RecentQuickExperimentManager INSTANCE = new Object();
    public static final int NUM_RECENT_EXPERIMENTS = 5;
    public static final Class TAG = RecentQuickExperimentManager.class;

    public static final void markRecentExperimentParameter(0yN r5) {
        0qQ.A0B(r5, 0);
        RecentQuickExperimentManager recentQuickExperimentManager = INSTANCE;
        List recentExperimentParameters = getRecentExperimentParameters();
        recentExperimentParameters.remove(r5);
        if (recentExperimentParameters.size() == 5) {
            recentExperimentParameters.remove(4);
        }
        recentExperimentParameters.add(0, r5);
        recentQuickExperimentManager.save(recentExperimentParameters);
    }

    private final void save(List list) {
        RecentExperimentsStorageModel recentExperimentsStorageModel = new RecentExperimentsStorageModel(list);
        try {
            0tS A0h = DbT.A0h();
            DbS.A1a(A0h, RecentExperimentsStorageModel__JsonHelper.serializeToJson(recentExperimentsStorageModel), A0h.A2Q, 0tS.A4G, 135);
        } catch (IOException e) {
            0KC.A05(TAG, "failed to save Recent Experiments json", e);
        }
    }

    public static final List getRecentExperimentParameters() {
        List list;
        0tS A0h = DbT.A0h();
        String A13 = DbV.A13(A0h, A0h.A2Q, 0tS.A4G, 135);
        if (A13 == null) {
            return AnonymousClass7TE.A1C();
        }
        try {
            list = RecentExperimentsStorageModel__JsonHelper.parseFromJson(16P.A00(A13)).recentExperimentParameters;
        } catch (IOException unused) {
            list = AnonymousClass7TE.A1C();
        }
        0qQ.A0A(list);
        return list;
    }
}
