package X;

import android.content.Context;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaControlSurfaceEnum;
import com.instagram.common.session.UserSession;

/* renamed from: X.32j  reason: invalid class name and case insensitive filesystem */
public final class C2360832j implements C2360932k {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C231332rR A03;
    public final C249763kK A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C377159Kt(this, 38));
    public final C2360732i A06;

    public C2360832j(Context context, UserSession userSession, AnonymousClass4DU r5, C231332rR r6, C2360732i r7, C249763kK r8) {
        0qQ.A0B(r8, 4);
        0qQ.A0B(r7, 5);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r5;
        this.A04 = r8;
        this.A06 = r7;
        this.A03 = r6;
    }

    public final void D9M(1Xj r7, AnonymousClass3W1 r8) {
        int i;
        Long valueOf;
        Long valueOf2;
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        UserSession userSession = this.A01;
        AnonymousClass4DU r3 = this.A02;
        if (r8.A0p()) {
            i = r8.getPosition();
        } else {
            i = -1;
        }
        0wc A012 = AnonymousClass0kN.A01(r3, userSession);
        0Aj A002 = A012.A00(A012.A00, "ig_top_of_funnel_control_dismiss_click");
        if (A002.isSampled()) {
            A002.AAJ("m_pk", r7.getId());
            A002.AAJ("module", r3.getModuleName());
            if (i == -1) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf((long) i);
            }
            A002.A9F("m_ix", valueOf);
            int i2 = r8.A0W;
            if (i2 == -1) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf((long) i2);
            }
            A002.A9F("recs_ix", valueOf2);
            A002.AAJ("event_source", "on_impression");
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.Cgf();
        }
        ((AnonymousClass942) this.A05.getValue()).A00(r7, AnonymousClass05K.A0C);
        this.A03.AV9();
    }

    public final void DTi(1Xj r14, AnonymousClass3W1 r15) {
        0xF r2;
        1Xj r4 = r14;
        0qQ.A0B(r14, 0);
        AnonymousClass3W1 r5 = r15;
        0qQ.A0B(r15, 1);
        r15.A1V = "on_impression";
        UserSession userSession = this.A01;
        AnonymousClass4DU r1 = this.A02;
        String sessionId = this.A04.getSessionId();
        if (r1 instanceof C232682uF) {
            r2 = ((C232682uF) r1).E4l(r14).A00();
        } else {
            r2 = null;
        }
        I7O.A04(r1, r2, userSession, r4, r5, "on_impression", sessionId, (String) null, (String) null, r14.A0C.getLoggingInfoToken(), r15.getPosition(), r15.A2a);
        this.A06.DJB(MediaControlEventSourceEnum.ON_IMPRESSION, r14, AnonymousClass3WA.ORGANIC_SHOW_LESS, r15);
        ((AnonymousClass942) this.A05.getValue()).A00(r14, AnonymousClass05K.A00);
    }

    public final void DYL(MediaControlEventSourceEnum mediaControlEventSourceEnum, 1Xj r15) {
        C257873y6 B5M;
        String Bdv;
        String Bdt;
        1Xj r10 = r15;
        0qQ.A0B(r15, 0);
        MediaControlEventSourceEnum mediaControlEventSourceEnum2 = mediaControlEventSourceEnum;
        int ordinal = mediaControlEventSourceEnum.ordinal();
        if (ordinal == 1) {
            B5M = r15.A0C.B5M();
            if (B5M != null) {
                Bdv = B5M.Bdv();
                Bdt = B5M.Bdt();
            } else {
                return;
            }
        } else if (ordinal == 2) {
            Bdt = this.A00.getString(2131957524);
            B5M = null;
            Bdv = AnonymousClass000.A00(2784);
        } else {
            return;
        }
        UserSession userSession = this.A01;
        C54971Ha4.A00(mediaControlEventSourceEnum2, MediaControlSurfaceEnum.UNCONNECTED_FEED, this.A02, userSession, r10, this.A04.getSessionId(), false);
        if (!(Bdv == null || Bdt == null)) {
            C56314HwR.A01(this.A00, new IVW(mediaControlEventSourceEnum, B5M, this, r15), (Integer) null, Bdt, Bdv);
        }
        ((AnonymousClass942) this.A05.getValue()).A00(r15, AnonymousClass05K.A01);
        if (B5M != null) {
            this.A03.AV9();
        }
    }
}
