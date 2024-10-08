package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/* renamed from: X.Src  reason: case insensitive filesystem */
public final class C12330Src implements C13834Ti9 {
    public final /* synthetic */ N4L A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass3Q2 A02;
    public final /* synthetic */ String A03;

    public final void D0g(SJL sjl) {
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.4nB] */
    public final void D5E(List list) {
        C11185SEl sEl;
        0qQ.A0B(list, 0);
        if (!list.isEmpty()) {
            try {
                String str = this.A03;
                File A0t = AnonymousClass7TE.A0t(str);
                if (!A0t.exists() || A0t.length() <= 0) {
                    throw new FileNotFoundException();
                }
                SRW srw = (SRW) list.get(0);
                AnonymousClass3Q2 r10 = this.A02;
                r10.A0i(str);
                int i = srw.A0D;
                int i2 = srw.A0B;
                r10.A0S = i;
                r10.A0R = i2;
                int i3 = (int) srw.A0H;
                ? obj = new Object();
                obj.A01 = i3;
                obj.A00 = (int) srw.A0I;
                r10.A1W = obj;
                N4L n4l = this.A00;
                if (n4l != null && n4l.A04) {
                    boolean z = n4l.A05;
                    C11354SOn sOn = srw.A00;
                    if (sOn != null) {
                        UserSession userSession = this.A01;
                        if (z) {
                            sEl = new C11185SEl(userSession);
                        } else {
                            sEl = null;
                        }
                        r10.A1j.A00 = new C7946Qdn(sEl, sOn, srw, (C10748RxS) null, userSession, r10).A00();
                    }
                }
            } catch (FileNotFoundException e) {
                0kD.A0C("VideoRenderUtil", "Local Render - couldn't find output file", e);
            }
        }
    }

    public final void DiY(File file, long j) {
    }

    public final void Dia(SRW srw) {
    }

    public final void onStart() {
    }

    public C12330Src(N4L n4l, UserSession userSession, AnonymousClass3Q2 r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = n4l;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ void DDE(SJL sjl, Object obj) {
        Throwable th = (Throwable) obj;
        0qQ.A0B(th, 0);
        0kD.A0C("VideoRenderUtil", "Video Transcode has failed.", th);
    }

    public final void DaK(double d) {
        this.A02.A0g(AnonymousClass05K.A00, d);
    }
}
