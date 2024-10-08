package X;

import android.view.TextureView;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.util.Map;

/* renamed from: X.8HR  reason: invalid class name */
public final class AnonymousClass8HR implements C3493580b {
    public final /* synthetic */ AnonymousClass8HG A00;

    public AnonymousClass8HR(AnonymousClass8HG r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        C344377rl r0;
        FilmstripTimelineView filmstripTimelineView;
        AnonymousClass80X r10 = (AnonymousClass80X) obj2;
        AnonymousClass8HG r4 = this.A00;
        if (r4.A0G.A0V(C358088aL.A0B)) {
            r4.A0U = r10;
            AnonymousClass80X r6 = AnonymousClass80X.POST_CAPTURE;
            if (r10 == r6 && (filmstripTimelineView = r4.A09) != null) {
                filmstripTimelineView.A01(0.0f, 1.0f);
            }
            if (r10 == AnonymousClass80X.PRE_CAPTURE) {
                r4.A0T = AnonymousClass8HJ.NORMAL;
                TextureView textureView = r4.A03;
                if (textureView != null) {
                    r4.A0E.removeView(textureView);
                    r4.A03 = null;
                }
                r4.A01 = 0;
                r4.A00 = 0;
                r4.A0E.removeAllViews();
                r4.A03 = null;
                Map map = r4.A0L;
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue() != null) {
                        C39735A7b a7b = (C39735A7b) entry.getValue();
                        C39735A7b.A00(a7b.A04);
                        C39735A7b.A00(a7b.A05);
                    }
                }
                0nY.A00().ATE(new C386499kh(r4));
                map.clear();
            }
            if (obj == r6) {
                if (r4 instanceof AnonymousClass8HF) {
                    AnonymousClass8HF r1 = (AnonymousClass8HF) r4;
                    C342917pN r02 = r1.A05;
                    if (!(r02 == null || (r0 = ((C345367tN) C342917pN.A00(r02)).A00) == null)) {
                        r0.AOr();
                    }
                    AnonymousClass8HF.A02(r1);
                } else {
                    C387389m8.A01((C387389m8) r4);
                }
                AnonymousClass80U r2 = r4.A08;
                C3493580b r12 = r4.A0K;
                AnonymousClass80T r22 = (AnonymousClass80T) r2;
                0qQ.A0B(r12, 0);
                r22.A02.A02.remove(r12);
                C3493580b r13 = r4.A0J;
                0qQ.A0B(r13, 0);
                r22.A01.A02.remove(r13);
                if (r4.A0O) {
                    ((C353308Hc) r4.A0N.getValue()).CL9(true);
                }
            }
        }
    }
}
