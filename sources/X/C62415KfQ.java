package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import java.util.List;

/* renamed from: X.KfQ  reason: case insensitive filesystem */
public final class C62415KfQ extends C60255JiC {
    public long A00;
    public final 2Fk A01;
    public final 1Av A02;
    public final IgLiveBroadcastInfoManager A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;
    public final boolean A07;
    public final boolean A08;
    public final UserSession A09;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62415KfQ(com.instagram.common.session.UserSession r10, X.1Av r11, X.C313716gt r12, com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository r13, X.L8Y r14, com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r15, com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r16, X.LES r17, X.C59720JVe r18, boolean r19, boolean r20) {
        /*
            r9 = this;
            r0 = 1
            r3 = r16
            X.0qQ.A0B(r3, r0)
            r1 = r17
            r5 = r18
            X.C51974G9v.A1S(r5, r13, r14, r1, r15)
            r0 = 7
            X.0qQ.A0B(r11, r0)
            r4 = 0
            r2 = 0
            r9.<init>(r12, r15, r1, r5)
            r9.A03 = r15
            r9.A02 = r11
            r9.A09 = r10
            r0 = r19
            r9.A07 = r0
            r0 = r20
            r9.A08 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r9.A04 = r0
            X.1HR r0 = X.JTO.A1G(r2)
            r9.A05 = r0
            X.05Y r0 = X.0u9.A04(r0)
            r9.A06 = r0
            X.0Ud r8 = r1.A0p
            X.0Ud r7 = r3.A08
            X.0Ud r3 = r13.A06
            X.0Ud r6 = r14.A03
            X.0Ud r2 = r15.A06
            X.0Ud r1 = r1.A0n
            com.instagram.video.live.mvvm.viewmodel.ufi.IgLiveViewerUfiViewModel$viewState$1 r5 = new com.instagram.video.live.mvvm.viewmodel.ufi.IgLiveViewerUfiViewModel$viewState$1
            r5.<init>(r9, r4)
            X.MIN r0 = X.MIN.A00
            X.0pt r3 = X.AnonymousClass10H.A00(r0, r8, r7, r3)
            X.MIO r0 = X.MIO.A00
            X.0pt r2 = X.AnonymousClass10H.A00(r0, r6, r2, r1)
            r1 = 44
            X.MHk r0 = new X.MHk
            r0.<init>((X.AnonymousClass4D7) r4, (java.lang.Object) r5, (int) r1)
            X.0pm r2 = X.AnonymousClass10H.A03(r0, r3, r2)
            r1 = 46
            X.MGg r0 = new X.MGg
            r0.<init>(r9, r4, r1)
            X.0pz r0 = X.JTO.A1I(r0, r2)
            androidx.lifecycle.CoroutineLiveData r0 = X.DbT.A0G(r0)
            r9.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62415KfQ.<init>(com.instagram.common.session.UserSession, X.1Av, X.6gt, com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository, X.L8Y, com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager, com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager, X.LES, X.JVe, boolean, boolean):void");
    }

    public final boolean isButtonVisible(C62527KhJ khJ, List list, boolean z) {
        AnonymousClass7TG.A1N(khJ, list);
        if (!list.contains(khJ)) {
            return false;
        }
        if (list.size() <= 4 || list.indexOf(khJ) < 3 || z) {
            return true;
        }
        return false;
    }
}
