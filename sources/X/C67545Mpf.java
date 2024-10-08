package X;

import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mpf  reason: case insensitive filesystem */
public final class C67545Mpf implements C13907Tl7 {
    public final /* synthetic */ AnonymousClass50C A00;
    public final /* synthetic */ AnonymousClass4AL A01;

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final void onDestroy(AnonymousClass07Z r7) {
        0qQ.A0B(r7, 0);
        AnonymousClass50C r2 = this.A00;
        r2.A0D.A03.A04(r2.A05);
        r2.A02.removeCallbacks(r2.A0A);
        AnonymousClass4AL r4 = this.A01;
        UserSession userSession = r4.A02;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36326451137492747L)) {
            r4.A00.A0A(this);
        }
    }

    public final void onPause(AnonymousClass07Z r4) {
        0qQ.A0B(r4, 0);
        AnonymousClass50C r2 = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        r2.A02.removeCallbacks(r2.A0A);
    }

    public final void onResume(AnonymousClass07Z r7) {
        List list;
        Object obj;
        MusicNoteResponseInfo musicNoteResponseInfo;
        0qQ.A0B(r7, 0);
        AnonymousClass50C r4 = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass4AB r0 = r4.A01;
        if (r0 != null && (list = r0.A0J) != null) {
            Iterator it = list.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
            } while (!(obj instanceof AnonymousClass912));
            AnonymousClass913 r2 = (AnonymousClass913) obj;
            if (r2 != null) {
                AnonymousClass4AL r1 = this.A01;
                C300845y2 r02 = r2.BWY().A0A;
                if (r02 != null && (musicNoteResponseInfo = r02.A07) != null && musicNoteResponseInfo.A05 != null) {
                    UserSession userSession = r1.A02;
                    if (182.A06(DbS.A0J(userSession, 0), userSession, 36328143354674133L)) {
                        r4.A02.post(r4.A0A);
                    }
                }
            }
        }
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public C67545Mpf(AnonymousClass50C r1, AnonymousClass4AL r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
