package X;

import com.facebook.gputimer.GPUTimerImpl;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8qk  reason: invalid class name and case insensitive filesystem */
public final class C367438qk implements C367448ql {
    public static final String __redex_internal_original_name = "IntegratedOneCameraPostCaptureMediaPipelineController";
    public final C344207rU A00;
    public final C365408n3 A01;
    public final boolean A02;

    public final void A9i(AnonymousClass8KU r1) {
    }

    public final GPUTimerImpl B8n() {
        return null;
    }

    public final boolean CL7(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        C344277rb A022 = this.A00.A02(C345487tZ.A00);
        0qQ.A07(A022);
        return ((C345487tZ) A022).CL7(str, str2);
    }

    public final void EUt(UserSession userSession, List list) {
        0qQ.A0B(list, 0);
        C344207rU r3 = this.A00;
        if (r3.A08()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C368848tQ) it.next()).A05);
            }
            C344277rb A022 = r3.A02(C345487tZ.A00);
            0qQ.A07(A022);
            C345167t2 r0 = ((C345467tX) ((C345487tZ) A022)).A00;
            if (r0 != null) {
                ((C345157t1) r0).A03.A02(arrayList);
            }
            try {
                C365408n3 r02 = this.A01;
                boolean z = true;
                if (r02 == null || !r02.EFH()) {
                    z = false;
                }
                EMX(new C367458qm(z));
            } catch (RuntimeException e) {
                0kD.A0I("IntegratedOneCameraPostCaptureMediaPipelineController EnableSingleFrameSourceEvent", e, 0Yt.A0E());
            }
        }
    }

    public final void destroy() {
    }

    public final C352718Eo ALQ() {
        C344207rU r0 = this.A00;
        C352718Eo ALQ = ((C344037rD) r0.A00.Apf(C344037rD.A00)).ALQ();
        0qQ.A07(ALQ);
        return ALQ;
    }

    public final void EIx() {
        if (this.A02) {
            this.A00.A06();
        }
    }

    public final void EMX(C344907sc r3) {
        C344277rb A022 = this.A00.A02(C345487tZ.A00);
        0qQ.A07(A022);
        C345167t2 r0 = ((C345467tX) ((C345487tZ) A022)).A00;
        if (r0 != null) {
            r0.Ddr(r3);
        }
    }

    public final void EMY(C344907sc r3, C345237tA r4) {
        C344277rb A022 = this.A00.A02(C345487tZ.A00);
        0qQ.A07(A022);
        C345167t2 r1 = ((C345467tX) ((C345487tZ) A022)).A00;
        if (r1 != null) {
            C345157t1 r12 = (C345157t1) r1;
            if (r12.A02) {
                C344767sO r0 = r12.A03.A02;
                if (r0 != null) {
                    C344767sO.A05(r0, r3, r4);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final String getModuleName() {
        return "instagram_post_capture";
    }

    public final boolean isConnected() {
        return this.A00.A08();
    }

    public final void pause() {
        if (this.A02) {
            this.A00.A05();
        }
    }

    public C367438qk(C365408n3 r1, C344207rU r2, boolean z) {
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = z;
    }
}
