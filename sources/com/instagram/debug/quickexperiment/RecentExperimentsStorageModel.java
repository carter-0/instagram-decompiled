package com.instagram.debug.quickexperiment;

import X.0yN;
import X.AnonymousClass7TE;
import java.util.Iterator;
import java.util.List;

public final class RecentExperimentsStorageModel {
    public List recentExperimentParameterNames;
    public List recentExperimentParameters;
    public List recentUniverseNames;

    public List getRecentExperimentParameters() {
        return AnonymousClass7TE.A1D(this.recentExperimentParameters);
    }

    public RecentExperimentsStorageModel() {
        this.recentExperimentParameters = AnonymousClass7TE.A1C();
    }

    public RecentExperimentsStorageModel postprocess() {
        this.recentExperimentParameters = AnonymousClass7TE.A1C();
        for (int i = 0; i < this.recentExperimentParameterNames.size(); i++) {
            String A19 = AnonymousClass7TE.A19(this.recentExperimentParameterNames, i);
            String A192 = AnonymousClass7TE.A19(this.recentUniverseNames, i);
            Iterator it = QuickExperimentHelper.getAllExperiments().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                0yN r1 = (0yN) it.next();
                if (A19.equals(r1.name) && A192.equals(r1.universeName)) {
                    this.recentExperimentParameters.add(r1);
                    break;
                }
            }
        }
        return this;
    }

    public RecentExperimentsStorageModel(List list) {
        this.recentExperimentParameters = AnonymousClass7TE.A1C();
        this.recentExperimentParameterNames = AnonymousClass7TE.A1C();
        this.recentUniverseNames = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            0yN r2 = (0yN) it.next();
            this.recentExperimentParameterNames.add(r2.name);
            this.recentUniverseNames.add(r2.universeName);
        }
    }
}
