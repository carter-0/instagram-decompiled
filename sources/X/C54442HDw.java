package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.HDw  reason: case insensitive filesystem */
public final class C54442HDw extends C54432HDf {
    public final Context A00;

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.HQT] */
    public final void A01(1P0 r12, AnonymousClass4D6 r13, C3723390k r14) {
        AnonymousClass4D6 r8 = r13;
        0qQ.A0B(r13, 3);
        C55518Hj0 hj0 = new C55518Hj0(this.A00);
        UserSession userSession = this.A05;
        C63881LAk A002 = A00(userSession, r14);
        C266474Za r0 = this.A00;
        L70 l70 = this.A06;
        if (!C55103HcC.A00(r0, userSession, l70, A002) && !I0U.A00.A00(userSession, l70, A002) && this.A01 == null) {
            ? obj = new Object();
            obj.A00 = true;
            AnonymousClass7TE.A1Z(new MGO(this, A002, obj, r12, hj0, r8, (AnonymousClass4D7) null, 8), this.A01);
        }
    }

    public static final C63881LAk A00(UserSession userSession, C3723390k r10) {
        String str;
        String str2 = r10.A06;
        String str3 = r10.A04;
        ExploreTopicCluster exploreTopicCluster = r10.A02.A00;
        if (exploreTopicCluster != null) {
            str = exploreTopicCluster.A06;
        } else {
            str = null;
        }
        return new C63881LAk(userSession, str2, str3, str, r10.A07, r10.A05, r10.A08, r10.A0G);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54442HDw(Context context, UserSession userSession, L70 l70) {
        super(userSession, l70);
        AnonymousClass7TG.A1O(userSession, context);
        this.A00 = context;
    }
}
