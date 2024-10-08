package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.jobscheduler.bgfetch.IgBgFetchJob;
import com.instagram.jobscheduler.bgfetch.IgBgFetchJobRun;
import com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata;
import com.instagram.jobscheduler.bgfetch.IgBgFetchPendingJob;
import java.util.ArrayList;
import java.util.List;

public final class SOU {
    public T7D A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final Context A05;
    public final Handler A06 = AnonymousClass7TF.A0D();
    public final UserSession A07;
    public final IgBgFetchJobRun A08;
    public final IgBgFetchMetadata A09;
    public final IgBgFetchPendingJob A0A;
    public final SHP A0B;
    public final List A0C = AnonymousClass7TE.A1C();
    public final List A0D;
    public final C262224Cq A0E;
    public final OEJ A0F;

    public SOU(Context context, UserSession userSession, IgBgFetchMetadata igBgFetchMetadata, IgBgFetchPendingJob igBgFetchPendingJob, OEJ oej, SHP shp, List list, C262224Cq r12, long j) {
        0qQ.A0B(shp, 5);
        0qQ.A0B(r12, 8);
        this.A05 = context;
        this.A09 = igBgFetchMetadata;
        this.A0A = igBgFetchPendingJob;
        this.A07 = userSession;
        this.A0B = shp;
        this.A0F = oej;
        this.A0D = list;
        this.A0E = r12;
        this.A04 = j;
        this.A08 = new IgBgFetchJobRun(igBgFetchPendingJob.A01.A00, igBgFetchPendingJob.A00);
    }

    private final void A00() {
        if (!this.A03) {
            this.A03 = true;
            IgBgFetchJobRun igBgFetchJobRun = this.A08;
            igBgFetchJobRun.A00 = System.currentTimeMillis();
            T7D t7d = this.A00;
            if (t7d != null) {
                0sn<IgBgFetchJob> r3 = this.A01;
                if (r3 == null) {
                    r3 = 0sn.A00;
                }
                List list = t7d.A06;
                C10637RvW rvW = (C10637RvW) 00k.A0J(list);
                if (rvW != null) {
                    list.remove(0);
                    if (rvW.A00 != igBgFetchJobRun.A02) {
                        0wb.A03("IgBgFetchScheduler", "Missmatch of the job id in the queue");
                    }
                    rvW.A02.invoke();
                } else {
                    0wb.A03("IgBgFetchScheduler", "Complited run for job not in the queue");
                }
                t7d.A00 = null;
                long currentTimeMillis = System.currentTimeMillis();
                T7D.A04(t7d, r3);
                IgBgFetchMetadata A002 = T7D.A00(t7d);
                ArrayList A0r = AnonymousClass7TG.A0r(r3);
                for (IgBgFetchJob igBgFetchPendingJob : r3) {
                    A0r.add(new IgBgFetchPendingJob(igBgFetchPendingJob, currentTimeMillis));
                }
                T7D.A01(new IgBgFetchMetadata(00k.A0T(igBgFetchJobRun, A002.A01), 00k.A0S(A0r, A002.A02), A002.A00), t7d);
                C10637RvW rvW2 = (C10637RvW) 00k.A0J(list);
                if (rvW2 != null) {
                    list.remove(0);
                    T7D.A02(rvW2, t7d);
                }
            }
        }
    }

    public static final void A01(SOU sou) {
        if (sou.A02 && sou.A0C.isEmpty() && sou.A01 != null) {
            sou.A00();
        }
    }

    public final void A02() {
        for (S2B s2b : this.A0C) {
            if (!s2b.A02) {
                s2b.A02 = true;
                C62320sa r0 = s2b.A01;
                if (r0 != null) {
                    r0.invoke();
                }
            }
        }
        A00();
    }
}
