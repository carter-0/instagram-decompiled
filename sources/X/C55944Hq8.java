package X;

import com.instagram.ui.animation.timeline.linear.AdvanceTargetTaskDisabledException;
import com.instagram.ui.animation.timeline.linear.MultipleAdvanceInTimelineException;
import com.instagram.ui.animation.timeline.linear.TaskNotAvailableException;
import com.instagram.ui.animation.timeline.linear.TimelineNotStartedException;
import java.util.ArrayList;

/* renamed from: X.Hq8  reason: case insensitive filesystem */
public final class C55944Hq8 {
    public JMF A00;
    public final C52054GDa A01;

    public final C52206GIx A00(JMF jmf) {
        JMF jmf2;
        Throwable th;
        C52206GIx gIx;
        if (this.A00 != null) {
            th = MultipleAdvanceInTimelineException.A00;
        } else {
            ArrayList<C52056GDc> A1C = AnonymousClass7TE.A1C();
            C52054GDa gDa = this.A01;
            C52056GDc gDc = gDa.A01;
            while (true) {
                if (gDc == null) {
                    jmf2 = null;
                    break;
                }
                jmf2 = gDc.A01.A04;
                if (jmf.equals(jmf2)) {
                    break;
                }
                A1C.add(gDc);
                gDc = gDc.A00;
            }
            if (jmf.equals(jmf2)) {
                GL1 gl1 = gDc.A01;
                if (!gl1.A03) {
                    if (gl1.A02) {
                        th = AdvanceTargetTaskDisabledException.A00;
                    } else {
                        for (C52056GDc gDc2 : A1C) {
                            gDc2.A01.A01 = AnonymousClass05K.A0C;
                        }
                        gl1.A01 = AnonymousClass05K.A01;
                        AnonymousClass0eM r3 = gDa.A08;
                        GYK gyk = (GYK) r3.getValue();
                        JMF jmf3 = gDa.A01.A01.A04;
                        0qQ.A0B(jmf3, 0);
                        if (!gyk.A01.get()) {
                            TimelineNotStartedException timelineNotStartedException = TimelineNotStartedException.A00;
                            0qQ.A0B(timelineNotStartedException, 0);
                            gIx = new C52206GIx(false, timelineNotStartedException);
                        } else {
                            GYK.A00(jmf3, gyk);
                            gIx = C52206GIx.A02;
                        }
                        if (!gIx.A01) {
                            ((GYK) r3.getValue()).A01();
                            return gIx;
                        }
                        this.A00 = jmf;
                        return C52206GIx.A02;
                    }
                }
            }
            th = TaskNotAvailableException.A00;
        }
        return new C52206GIx(false, th);
    }

    public C55944Hq8(C52054GDa gDa) {
        this.A01 = gDa;
    }
}
