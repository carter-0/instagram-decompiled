package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.KdH  reason: case insensitive filesystem */
public abstract class C62283KdH extends C60262JiJ {
    public Map A00 = AnonymousClass7TE.A1H();
    public C262204Co A01;
    public C262204Co A02;
    public C262204Co A03;
    public final 2Fk A04;
    public final LR1 A05;
    public final AnonymousClass2f1 A06;
    public final LM9 A07;
    public final IgLiveCommentsRepository A08;
    public final IgLiveHeartbeatManager A09;
    public final Set A0A;
    public final C249513ju A0B;
    public final AnonymousClass0r6 A0C;
    public final C339667jy A0D;
    public final IgLiveModerationRepository A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62283KdH(X.LR1 r20, X.AnonymousClass0iw r21, com.instagram.common.session.UserSession r22, X.C339667jy r23, X.AnonymousClass0t1 r24, X.AnonymousClass2f1 r25, X.L7I r26, X.L5M r27, X.LM9 r28, com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r29, com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository r30, com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r31, X.C313816h4 r32, com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r33, X.LES r34, X.C59720JVe r35, boolean r36) {
        /*
            r19 = this;
            r14 = r31
            r13 = r27
            r18 = r36
            r7 = r35
            r10 = r22
            r1 = r34
            r9 = r21
            r15 = r32
            r8 = r19
            r11 = r24
            r12 = r26
            r17 = r7
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = r29
            r8.A08 = r2
            r0 = r30
            r8.A0E = r0
            r0 = r33
            r8.A09 = r0
            r0 = r20
            r8.A05 = r0
            r0 = r28
            r8.A07 = r0
            r0 = r23
            r8.A0D = r0
            r0 = r25
            r8.A06 = r0
            java.util.LinkedHashMap r0 = X.AnonymousClass7TE.A1H()
            r8.A00 = r0
            r6 = 0
            X.1HR r0 = X.G9w.A0w()
            r8.A0B = r0
            X.05Y r0 = X.0u9.A04(r0)
            r8.A0C = r0
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            r8.A0A = r0
            X.0Ud r5 = r1.A0k
            X.0Ud r4 = r1.A0d
            X.0Ud r3 = r2.A0L
            X.0Ud r2 = r2.A0J
            r1 = 0
            X.Ime r0 = new X.Ime
            r0.<init>(r1, r6)
            X.0pq r0 = X.AnonymousClass10H.A01(r0, r5, r4, r3, r2)
            androidx.lifecycle.CoroutineLiveData r0 = X.DbT.A0G(r0)
            r8.A04 = r0
            X.0pa r2 = r7.A00
            r1 = 40
            X.MGD r0 = new X.MGD
            r0.<init>(r8, r6, r1)
            X.JTS.A13(r8, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62283KdH.<init>(X.LR1, X.0iw, com.instagram.common.session.UserSession, X.7jy, X.0t1, X.2f1, X.L7I, X.L5M, X.LM9, com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository, com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository, com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager, X.6h4, com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager, X.LES, X.JVe, boolean):void");
    }

    public final void A03() {
        if (this.A01 == null) {
            this.A01 = AnonymousClass11O.A03(C318116oQ.A00(this), JTO.A1I(new MHK(this, (AnonymousClass4D7) null, 5), this.A08.A0I));
        }
        if (this.A02 == null) {
            this.A02 = AnonymousClass11O.A03(C318116oQ.A00(this), JTO.A1I(new MHK(this, (AnonymousClass4D7) null, 6), this.A08.A0E));
        }
        if (this.A03 == null) {
            this.A03 = AnonymousClass11O.A03(C318116oQ.A00(this), JTO.A1I(new MGD(this, (AnonymousClass4D7) null, 41), this.A08.A0F));
        }
    }

    public final void A00(MVW mvw) {
        super.A00(mvw);
        AnonymousClass7TE.A1Z(new MGD(mvw, this, (AnonymousClass4D7) null, 43), C318116oQ.A00(this));
    }

    public final void A02(List list, int i, boolean z, boolean z2, boolean z3) {
        super.A02(list, i, z, z2, z3);
        this.A08.A08 = list;
    }
}
