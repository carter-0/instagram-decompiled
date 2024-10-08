package X;

import android.net.Uri;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.share.handleractivity.BaseShareHandlerActivity;
import com.instagram.share.handleractivity.ShareHandlerActivity;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public final class T8D implements B2G {
    public final /* synthetic */ C365768ne A00;
    public final /* synthetic */ BaseShareHandlerActivity A01;

    public T8D(C365768ne r1, BaseShareHandlerActivity baseShareHandlerActivity) {
        this.A01 = baseShareHandlerActivity;
        this.A00 = r1;
    }

    public final void onFailure(Exception exc) {
        0KC.A0G("BaseShareHandlerActivity", "Unable to load assets to share", exc);
        BaseShareHandlerActivity baseShareHandlerActivity = this.A01;
        baseShareHandlerActivity.A02(exc);
        C59689JTv.A01(baseShareHandlerActivity, "share_intent_media_inaccessible", 2131973480, 1);
        UserSession A012 = baseShareHandlerActivity.A01();
        if (A012 != null) {
            C9851RiQ.A00(A012).A00("io_exception");
        }
        baseShareHandlerActivity.A03(true);
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.KIq, java.lang.Runnable] */
    public final void onSuccess() {
        boolean z;
        0Tu r2;
        long j;
        BaseShareHandlerActivity baseShareHandlerActivity = this.A01;
        if (baseShareHandlerActivity instanceof ShareHandlerActivity) {
            UserSession A012 = baseShareHandlerActivity.A01();
            z = false;
            if (A012 != null) {
                if (0qQ.A0K(Pxi.A0a(baseShareHandlerActivity), "android.intent.action.SEND")) {
                    r2 = 0Tu.A05;
                    j = 36323912811818592L;
                } else if (0qQ.A0K(Pxi.A0a(baseShareHandlerActivity), "android.intent.action.SEND_MULTIPLE")) {
                    r2 = 0Tu.A05;
                    j = 36323912812015203L;
                }
                z = 182.A06(r2, A012, j);
            }
        } else {
            z = false;
        }
        if (z) {
            UserSession A013 = baseShareHandlerActivity.A01();
            List<Medium> list = this.A00.A09;
            if (A013 == null || list.isEmpty()) {
                C59689JTv.A01(baseShareHandlerActivity, "share_intent_app_not_supported", 2131973479, 1);
                baseShareHandlerActivity.A03(true);
                return;
            }
            int i = 3;
            if (list.size() < 3) {
                i = list.size();
            }
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(i);
            0qQ.A0A(newFixedThreadPool);
            0qQ.A0B(newFixedThreadPool, 3);
            for (Medium medium : list) {
                if (medium.A05()) {
                    newFixedThreadPool.execute(new C61700KIq(medium, new C59855JaW(baseShareHandlerActivity, medium.A02(), (Uri) null, A013, false)));
                }
            }
            newFixedThreadPool.shutdown();
            try {
                newFixedThreadPool.awaitTermination(182.A01(0Tu.A05, A013, 36605387788915952L), TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                0KC.A0G("BaseShareHandlerActivity", "Unable to load assets to share", e);
                baseShareHandlerActivity.A02(e);
                C59689JTv.A01(baseShareHandlerActivity, "share_intent_media_inaccessible", 2131973480, 1);
            }
        }
        baseShareHandlerActivity.A03(false);
    }
}
