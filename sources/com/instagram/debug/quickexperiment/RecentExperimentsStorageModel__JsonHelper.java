package com.instagram.debug.quickexperiment;

import X.16F;
import X.16L;
import X.16P;
import X.17W;
import X.17Z;
import X.AnonymousClass15o;
import X.AnonymousClass1FD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41846B3n;
import X.JTO;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

public final class RecentExperimentsStorageModel__JsonHelper {
    public static RecentExperimentsStorageModel parseFromJson(16F r1) {
        return (RecentExperimentsStorageModel) 16P.A01(r1, new AnonymousClass1FD() {
            public RecentExperimentsStorageModel invoke(16F r2) {
                return RecentExperimentsStorageModel__JsonHelper.unsafeParseFromJson(r2);
            }
        });
    }

    public static boolean processSingleField(RecentExperimentsStorageModel recentExperimentsStorageModel, String str, 16F r6) {
        ArrayList arrayList = null;
        if ("parameterNames".equals(str)) {
            if (r6.A11() == 16L.A0C) {
                arrayList = AnonymousClass7TE.A1C();
                while (r6.A1J() != 16L.A08) {
                    AnonymousClass7TG.A1F(r6, arrayList);
                }
            }
            recentExperimentsStorageModel.recentExperimentParameterNames = arrayList;
            return true;
        } else if (!"universeNames".equals(str)) {
            return false;
        } else {
            if (r6.A11() == 16L.A0C) {
                arrayList = AnonymousClass7TE.A1C();
                while (r6.A1J() != 16L.A08) {
                    AnonymousClass7TG.A1F(r6, arrayList);
                }
            }
            recentExperimentsStorageModel.recentUniverseNames = arrayList;
            return true;
        }
    }

    public static void serializeToJson(17Z r2, RecentExperimentsStorageModel recentExperimentsStorageModel, boolean z) {
        if (z) {
            r2.A0c();
        }
        if (recentExperimentsStorageModel.recentExperimentParameterNames != null) {
            16P.A03(r2, "parameterNames");
            Iterator it = recentExperimentsStorageModel.recentExperimentParameterNames.iterator();
            while (it.hasNext()) {
                C41846B3n.A18(r2, it);
            }
            r2.A0Y();
        }
        if (recentExperimentsStorageModel.recentUniverseNames != null) {
            16P.A03(r2, "universeNames");
            Iterator it2 = recentExperimentsStorageModel.recentUniverseNames.iterator();
            while (it2.hasNext()) {
                C41846B3n.A18(r2, it2);
            }
            r2.A0Y();
        }
        if (z) {
            r2.A0Z();
        }
    }

    public static RecentExperimentsStorageModel unsafeParseFromJson(16F r3) {
        RecentExperimentsStorageModel recentExperimentsStorageModel = new RecentExperimentsStorageModel();
        if (r3.A11() != 16L.A0D) {
            r3.A0z();
            return null;
        }
        while (r3.A1J() != 16L.A09) {
            processSingleField(recentExperimentsStorageModel, AnonymousClass7TE.A17(r3), r3);
            r3.A0z();
        }
        recentExperimentsStorageModel.postprocess();
        return recentExperimentsStorageModel;
    }

    public static RecentExperimentsStorageModel parseFromJson(String str) {
        return parseFromJson(16P.A00(str));
    }

    public static String serializeToJson(RecentExperimentsStorageModel recentExperimentsStorageModel) {
        StringWriter A0v = JTO.A0v();
        17W A0A = AnonymousClass15o.A00.A0A(A0v);
        serializeToJson(A0A, recentExperimentsStorageModel, true);
        A0A.close();
        return A0v.toString();
    }
}
