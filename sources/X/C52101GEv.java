package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEv  reason: case insensitive filesystem */
public final class C52101GEv implements JTK, JP7 {
    public final UserSession A00;
    public final C51979GAc A01;
    public final /* synthetic */ C57661IeQ A02 = new Object();

    public final C55996Hr2 Arh() {
        C61083JwL jwL = this.A02.A00;
        if (jwL != null) {
            return (C55996Hr2) DbT.A0r(jwL.A00);
        }
        0qQ.A0F("delayedSkipAction");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CJR(Context context, C267324bN r13, String str, String str2, String str3) {
        1Xj r1;
        0qQ.A0B(r13, 1);
        if (r13.A01 != C295365o2.AD_PREVIEW && (r1 = r13.A02) != null) {
            UserSession userSession = this.A00;
            String A07 = C231122qu.A07(userSession, r1);
            String A0F = C231122qu.A0F(userSession, r1);
            C51979GAc gAc = this.A01;
            C254523sc A012 = C233822wX.A01((C270594gz) null, r1, gAc, "waist_button");
            A012.A0J(userSession, r1);
            C233822wX.A0C(userSession, A012, r1, gAc, (Integer) null);
            Context context2 = context;
            C52030GCc gCc = new C52030GCc(context, userSession, gAc);
            GSY gsy = new GSY((Float) null, (Float) null, "sponsored_label_waist_tap", (String) null);
            C61083JwL jwL = this.A02.A00;
            if (jwL == null) {
                0qQ.A0F("delayedSkipAction");
                throw AnonymousClass00P.createAndThrow();
            }
            if (!C56373HxR.A01(gsy, gCc, r13, AnonymousClass7TE.A0M(((0sP) jwL.A01).invoke(r13)))) {
                gCc.A03(new GSY((Float) null, (Float) null, "sponsored_label_waist_tap", (String) null), r13, "primary");
            }
            I3C.A00(context2, userSession, (C55533HjF) null, A07, A0F, "CLIPS");
        }
    }

    public final void EU6(C61083JwL jwL) {
        this.A02.A00 = jwL;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.IeQ, java.lang.Object] */
    public C52101GEv(UserSession userSession, C51979GAc gAc) {
        this.A00 = userSession;
        this.A01 = gAc;
    }
}
