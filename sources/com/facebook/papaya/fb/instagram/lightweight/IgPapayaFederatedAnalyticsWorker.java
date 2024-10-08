package com.facebook.papaya.fb.instagram.lightweight;

import X.0KC;
import X.0Tu;
import X.0qQ;
import X.182;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C10972S3e;
import X.C11172SDq;
import X.C60960kU;
import X.C9946Rjz;
import X.Pxe;
import X.Pxf;
import X.RF8;
import X.RWB;
import android.content.Context;
import android.os.Bundle;
import androidx.work.WorkerParameters;
import com.facebook.jni.HybridData;
import com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker;
import com.facebook.papaya.client.model_loader.IModelLoader;
import com.facebook.papaya.client.transport.ITransport;
import com.facebook.papaya.fb.instagram.executors.mldwfalco.IgAnalyticsMldwFalcoExecutorFactory;
import com.facebook.papaya.fb.instagram.transport.IgPapayaTransport;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class IgPapayaFederatedAnalyticsWorker extends FederatedAnalyticsWorker {
    public String A00 = "";
    public String A01 = "";
    public boolean A02;
    public long A03;
    public final HashSet A04;

    public final ImmutableMap getLogSinks() {
        return null;
    }

    public final IModelLoader getModelLoader() {
        return null;
    }

    public final String getPopulationName() {
        return "ig4a";
    }

    public final ImmutableSet getClientTags() {
        ImmutableSet A032 = ImmutableSet.A03(this.A04);
        0qQ.A07(A032);
        return A032;
    }

    public final String getLocalDataDirectoryPath() {
        return this.A00;
    }

    public final String getSharedDataDirectoryPath() {
        return this.A01;
    }

    public final C11172SDq getSharedPreferences() {
        return C11172SDq.A01;
    }

    public final boolean isFederatedAnalyticsEnabled() {
        return this.A02;
    }

    public final void onWorkStart() {
        long j = this.A03;
        if (j > 0) {
            try {
                Thread.sleep(j * 1000);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgPapayaFederatedAnalyticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass7TG.A1O(context, workerParameters);
        HashSet A1F = AnonymousClass7TE.A1F();
        this.A04 = A1F;
        try {
            UserSession A0a = Pxe.A0a(this);
            0Tu r3 = 0Tu.A05;
            this.A02 = 182.A06(r3, A0a, 36315580577353114L);
            C10972S3e s3e = C9946Rjz.A00;
            this.A00 = s3e.A00(A0a).getCanonicalPath();
            this.A01 = s3e.A01(A0a).getCanonicalPath();
            this.A03 = 182.A01(r3, A0a, 36597055554259676L);
            String A042 = 182.A04(r3, A0a, 36878530530902208L);
            if (A042.length() != 0) {
                A1F.add(A042);
            }
            String A043 = 182.A04(r3, A0a, 36893391116174293L);
            if (A043.length() != 0) {
                A1F.add(A043);
            }
            String A044 = 182.A04(r3, A0a, 36893391116108756L);
            if (A044.length() != 0) {
                A1F.add(A044);
            }
        } catch (Exception e) {
            this.A02 = false;
            0KC.A0F("IgPapayaFederatedAnalyticsWorker", "Failed to initialize FederatedAnalyticsWorker", e);
        }
    }

    public final ImmutableMap getExecutorFactories() {
        ImmutableMap.Builder A0Q = Pxf.A0Q();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("enforce_secure_aggregation", false);
        RWB rwb = IgAnalyticsMldwFalcoExecutorFactory.Companion;
        Context context = C60960kU.A00;
        0qQ.A07(context);
        ImmutableMap A0Z = Pxe.A0Z(A0Q, "batch_mldw_falco_executor", new IgAnalyticsMldwFalcoExecutorFactory(context, A0a));
        0qQ.A07(A0Z);
        return A0Z;
    }

    public final ScheduledExecutorService getScheduledExecutorService() {
        return Pxf.A0z();
    }

    public final ITransport getTransport() {
        RF8 rf8;
        try {
            UserSession A0a = Pxe.A0a(this);
            HybridData hybridData = HybridData.$redex_init_class;
            Context context = C60960kU.A00;
            0qQ.A07(context);
            ScheduledThreadPoolExecutor A0z = Pxf.A0z();
            String str = this.A01;
            0Tu r3 = 0Tu.A05;
            boolean A06 = 182.A06(r3, A0a, 36315580576632211L);
            boolean A062 = 182.A06(r3, A0a, 2342158589790391700L);
            if (!A06) {
                rf8 = RF8.Disabled;
            } else if (A062) {
                rf8 = RF8.EnabledWithFileStorage;
            } else {
                rf8 = RF8.EnabledWithMemoryStorage;
            }
            return new IgPapayaTransport(context, A0a, A0z, str, rf8);
        } catch (IllegalStateException e) {
            0KC.A0F("IgPapayaFederatedAnalyticsWorker", "Failed to create papaya transport due to invalid user session", e);
            throw Pxe.A0u("Failed to create papaya transport due to invalid user session", e);
        }
    }

    public final void onWorkComplete(boolean z, Throwable th) {
    }
}
