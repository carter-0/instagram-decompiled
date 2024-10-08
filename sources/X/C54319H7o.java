package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.H7o  reason: case insensitive filesystem */
public final class C54319H7o extends AnonymousClass3NK implements C284715Nq {
    public final int A00;
    public final Object A01;

    public C54319H7o(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean Dqe(View view) {
        AnonymousClass3NK r0;
        int i = this.A00;
        0qQ.A0B(view, 0);
        Object obj = this.A01;
        if (i != 0) {
            GHR ghr = (GHR) obj;
            if (ghr.A02.CcK()) {
                ghr.A09.A05(view, (C238863Ds) null, (Integer) null);
            }
            r0 = ghr.A04;
        } else {
            C53923GwT gwT = (C53923GwT) obj;
            AnonymousClass3W1 r02 = gwT.A04.A0E;
            if (r02 == null || !r02.A1q) {
                gwT.A0A.A05(view, (C238863Ds) null, (Integer) null);
                r0 = gwT.A06;
            } else {
                1Xj r1 = gwT.A03.A02;
                if (r1 == null) {
                    return true;
                }
                UserSession userSession = gwT.A05;
                0qQ.A0B(userSession, 0);
                C51974G9v.A1G(userSession, r1);
                return true;
            }
        }
        r0.Dqe(view);
        return true;
    }

    public final void DsM(MotionEvent motionEvent, View view) {
        AnonymousClass3W1 r0;
        if (this.A00 != 0) {
            AnonymousClass3ZC r3 = AnonymousClass3ZC.A00;
            GHR ghr = (GHR) this.A01;
            if (r3.A0a(motionEvent, ghr.A01, ghr.A02)) {
                ghr.A00.onTouch(view, motionEvent);
                return;
            }
            return;
        }
        AnonymousClass3ZC r1 = AnonymousClass3ZC.A00;
        C53923GwT gwT = (C53923GwT) this.A01;
        ClipsViewerConfig clipsViewerConfig = gwT.A02;
        C267324bN r32 = gwT.A03;
        if (r1.A0a(motionEvent, clipsViewerConfig, r32) && (r0 = gwT.A04.A0E) != null && !r0.A1q) {
            gwT.A09.Da7(r32, gwT.A08, gwT.A07.getModuleName());
        }
    }
}
