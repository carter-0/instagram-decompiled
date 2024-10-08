package X;

import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.TreeJNI;
import java.util.List;

/* renamed from: X.TtZ  reason: case insensitive filesystem */
public final class C14299TtZ implements AnonymousClass07Y {
    public final /* synthetic */ C307786Rm A00;

    public C14299TtZ(C307786Rm r1) {
        this.A00 = r1;
    }

    @OnLifecycleEvent(07T.ON_PAUSE)
    public void onActivityPause() {
        int i;
        X1H[] x1hArr;
        C307446Qd A02 = C307476Qg.A02(this.A00);
        if (!A02.A0N) {
            List list = A02.A0F;
            synchronized (list) {
                x1hArr = (X1H[]) list.toArray(new X1H[0]);
            }
            for (X1H x1h : x1hArr) {
                C19207WPn wPn = (C19207WPn) x1h;
                Object obj = A02.A08.get(wPn.A06);
                Runnable runnable = wPn.A01;
                if (runnable != null && (obj instanceof TreeJNI)) {
                    wPn.A00 = (TreeJNI) obj;
                    runnable.run();
                    wPn.A01 = null;
                }
            }
        }
    }

    @OnLifecycleEvent(07T.ON_RESUME)
    public void onActivityResume() {
        int i;
        X1H[] x1hArr;
        C307446Qd A02 = C307476Qg.A02(this.A00);
        if (!A02.A0N) {
            List list = A02.A0F;
            synchronized (list) {
                x1hArr = (X1H[]) list.toArray(new X1H[0]);
            }
            for (X1H x1h : x1hArr) {
                C307776Rk r10 = A02.A02;
                C19207WPn wPn = (C19207WPn) x1h;
                PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI = wPn.A04.mGraphqlConsistency;
                TreeJNI treeJNI = wPn.A00;
                if (treeJNI != null) {
                    C50176FSi fSi = wPn.A02;
                    if (pandoGraphQLConsistencyJNI != null) {
                        C19921Whq whq = new C19921Whq(pandoGraphQLConsistencyJNI.subscribe(treeJNI, TreeJNI.class, fSi, AnonymousClass6RY.A01).cancelToken);
                        wPn.A01 = whq;
                        r10.A01(whq);
                        wPn.A00 = null;
                    }
                }
            }
        }
    }
}
