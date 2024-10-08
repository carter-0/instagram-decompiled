package com.facebook.odinusecases.ig4a.adsstory.scheduler;

import X.09i;
import X.0KC;
import X.0qQ;
import X.AAG;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0Gt;
import X.AnonymousClass0JP;
import X.AnonymousClass40G;
import X.AnonymousClass5G1;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass94X;
import X.C10736RxF;
import X.C13350TVx;
import X.C258733zY;
import X.C258743zZ;
import X.C258913zq;
import X.C282925Fh;
import X.C282935Fi;
import X.C3731294c;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.facebook.odin.model.Example;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class IgStoryPrefetchServerFeaturesDownloadWorker extends Worker {
    public AnonymousClass0JP A00;
    public C258913zq A01;
    public AnonymousClass94X A02;
    public C258743zZ A03;
    public UserSession A04;
    public final Context A05;

    public final C282935Fi doWork() {
        Class<IgStoryPrefetchServerFeaturesDownloadWorker> cls = IgStoryPrefetchServerFeaturesDownloadWorker.class;
        try {
            UserSession A08 = 09i.A0A.A08(this);
            this.A04 = A08;
            this.A00 = AnonymousClass0Gt.A00;
            String str = "userSession";
            this.A03 = new C258733zY(A08);
            UserSession userSession = this.A04;
            if (userSession != null) {
                this.A02 = C3731294c.A00(userSession).A00;
                UserSession userSession2 = this.A04;
                if (userSession2 != null) {
                    this.A01 = (C258913zq) ((C10736RxF) userSession2.A01(C10736RxF.class, new C13350TVx(userSession2, 6))).A03.getValue();
                    AnonymousClass94X r1 = this.A02;
                    if (r1 == null) {
                        str = "igStoryPrefetchServerFeatureFetcher";
                    } else {
                        C258743zZ r0 = this.A03;
                        if (r0 == null) {
                            str = "igStoryPrefetchPredictorConfig";
                        } else {
                            AnonymousClass40G A002 = r1.A00(AAG.A00(r0));
                            if (A002.A02) {
                                List list = (List) A002.A00;
                                if (!list.isEmpty()) {
                                    Example example = (Example) AnonymousClass7TE.A13(list);
                                    C258913zq r3 = this.A01;
                                    if (r3 == null) {
                                        str = "igStoryPrefetchServerFeatureStore";
                                    } else {
                                        AnonymousClass0JP r02 = this.A00;
                                        if (r02 == null) {
                                            str = "clock";
                                        } else {
                                            r3.EyX(example, "IG_ADS_PREFETCH", r02.now());
                                            return new AnonymousClass5G1();
                                        }
                                    }
                                }
                            }
                            return new C282925Fh();
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        } catch (UnsupportedOperationException e) {
            String message = e.getMessage();
            if (message == null) {
                message = AnonymousClass000.A00(935);
            }
            0KC.A05(cls, message, e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgStoryPrefetchServerFeaturesDownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass7TG.A1O(context, workerParameters);
        this.A05 = context;
    }
}
