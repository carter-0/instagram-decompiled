package X;

import android.view.View;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.8HQ  reason: invalid class name */
public final class AnonymousClass8HQ implements C3493580b {
    public final /* synthetic */ AnonymousClass8HG A00;

    public AnonymousClass8HQ(AnonymousClass8HG r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        int i;
        AnonymousClass80V r12 = (AnonymousClass80V) obj2;
        AnonymousClass8HG r2 = this.A00;
        C357638Yz r9 = r2.A0G;
        if (r9.A0V(C358088aL.A0B)) {
            if (obj == AnonymousClass80V.POST_CAPTURE_BOOMERANG_EDIT) {
                if (r2.A0O) {
                    ((C353308Hc) r2.A0N.getValue()).CL9(true);
                }
                FilmstripTimelineView filmstripTimelineView = r2.A09;
                if (filmstripTimelineView != null) {
                    C294975nL.A05(new View[]{filmstripTimelineView}, false);
                }
                C314446iH r0 = r2.A07;
                if (r0 != null) {
                    r0.D48(r2);
                }
                AnonymousClass8HT r7 = r2.A06;
                r7.A00 = r7.A03.A02(518927814, r7.A00);
            }
            int ordinal = r12.ordinal();
            if (ordinal == 7) {
                AnonymousClass8HT r8 = r2.A06;
                String str = ((C279284yO) r9.A08.A00).A02;
                29E r72 = r8.A03;
                long A03 = r72.A03(518927814, 600000);
                r8.A00 = A03;
                r72.A09(A03, "camera_destination", str);
                r72.A09(r8.A00, "camera_tool_cf", "BOOMERANG");
                if (r2.A0O) {
                    r2.A07(r2.A0T);
                    C387669ma r1 = (C387669ma) r2.A0N.getValue();
                    r1.A03(r2.A0T);
                    r1.A01(true);
                }
                FilmstripTimelineView A04 = r2.A04();
                r2.A09 = A04;
                if (A04 != null) {
                    A04.setShowSeekbar(false);
                    A04.A00 = r2;
                    C39735A7b a7b = (C39735A7b) r2.A0L.get(r2.A0T);
                    if (a7b != null) {
                        i = a7b.A02;
                    } else {
                        i = 0;
                    }
                    if (i == 0) {
                        i = 40;
                    }
                    A04.setTrimmerMinimumRange(Math.max(0.0f, Math.min(20.0f / ((float) i), 1.0f)));
                    C294975nL.A04((C295005nO) null, new View[]{A04}, false);
                    0nA.A0t(A04, new C41348AsV(a7b, r2, A04));
                    if (A04.getParent() instanceof View) {
                        0nA.A0m(A04, (View) A04.getParent());
                    }
                }
                C314446iH r02 = r2.A07;
                if (r02 != null) {
                    r02.DV9(r2);
                }
            } else if (ordinal == 11 && r2.A0O) {
                ((C353308Hc) r2.A0N.getValue()).CL9(true);
            }
        }
    }
}
