package com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram;

import X.0Gb;
import X.0Tu;
import X.0nQ;
import X.0nY;
import X.0xY;
import X.0xa;
import X.182;
import X.1Al;
import X.1An;
import X.C3502583y;
import X.C365478nB;
import X.C392149uI;
import X.C61410nE;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.benchmark.interfaces.IARClassBenchmark;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Executor;

public class InstagramARClassBenchmark implements IARClassBenchmark {
    public final Context A00;
    public final AnalyticsLogger A01;
    public final 0Gb A02;
    public final UserSession A03;
    public final Executor A04 = new 0nQ(0nY.A00(), 813, 3, false, false);
    public final C392149uI A05;
    public final C3502583y A06;

    public final void startBenchmarks() {
        UserSession userSession = this.A03;
        boolean A062 = 182.A06(0Tu.A05, userSession, 36310332125413398L);
        0Tu r2 = 0Tu.A06;
        long A012 = 182.A01(r2, userSession, 36591807102189584L);
        long A013 = 182.A01(r2, userSession, 36591807101927439L);
        double A002 = 182.A00(r2, userSession, 37154757055414272L);
        double A003 = 182.A00(r2, userSession, 37154757055479809L);
        if (A062) {
            C392149uI r6 = this.A05;
            long j = A012 * 1000;
            0xa r22 = r6.A01;
            boolean z = false;
            if (r22.contains("refreshTimeMillis")) {
                if (System.currentTimeMillis() - r22.getLong("refreshTimeMillis", 0) < j) {
                    z = true;
                }
            }
            if (!Boolean.valueOf(z).booleanValue()) {
                long currentTimeMillis = System.currentTimeMillis();
                0xY AR4 = r6.A01.AR4();
                AR4.E5c("refreshTimeMillis", currentTimeMillis);
                AR4.apply();
                if (Math.random() < A002) {
                    this.A06.CgN(new C365478nB(this, A003, A013));
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.9uI] */
    public InstagramARClassBenchmark(Context context, AnalyticsLogger analyticsLogger, C3502583y r9, 0Gb r10, UserSession userSession) {
        this.A01 = analyticsLogger;
        this.A00 = context;
        this.A03 = userSession;
        this.A06 = r9;
        this.A02 = r10;
        ? obj = new Object();
        obj.A01 = 1Al.A01(userSession).A03(1An.A0E);
        obj.A00 = C61410nE.A00;
        this.A05 = obj;
    }
}
