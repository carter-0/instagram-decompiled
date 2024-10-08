package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.model.reels.ReelViewerContextButtonType;
import java.util.List;

/* renamed from: X.VgC  reason: case insensitive filesystem */
public final class C17799VgC {
    public final AnonymousClass4DH A00;
    public final UserSession A01;

    public C17799VgC(AnonymousClass4DH r2, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = r2;
        this.A01 = userSession;
    }

    public final Object A00(AnonymousClass5VN r16, Reel reel, AnonymousClass3BQ r18, AnonymousClass6UX r19, List list, AnonymousClass4D7 r21, C62320sa r22, int i, boolean z, boolean z2) {
        List list2;
        List list3 = list;
        AnonymousClass6UX r0 = r19;
        AnonymousClass5VN r7 = r16;
        C19518Wb4 wb4 = new C19518Wb4(r7, 4);
        1IW A0q = C51973G9u.A0q(r21);
        UserSession userSession = this.A01;
        AnonymousClass4DH r3 = this.A00;
        AnonymousClass32A r8 = new AnonymousClass32A(r3, userSession, new AnonymousClass328(r3));
        r8.A0C = AnonymousClass7TF.A0b();
        r8.A06 = new C19494Wag(A0q, 3);
        if (r19 == null) {
            r0 = new C16165Upq((Activity) r3.requireActivity(), I2D.A01(r7), (C230222pE) new C19489Wab(r22, 2), AnonymousClass05K.A01);
        }
        r8.A05 = r0;
        r8.A0D = userSession.A06;
        r8.A0F = z;
        AnonymousClass32D r1 = new AnonymousClass32D();
        r1.A00 = ReelViewerContextButtonType.VIEW_ON_MAP;
        r1.A06 = false;
        r1.A07 = z2;
        r8.A03 = new ReelViewerConfig(r1);
        Reel reel2 = reel;
        if (list == null) {
            list3 = AnonymousClass7TE.A1I(reel2);
            list2 = AnonymousClass7TE.A1I(reel2);
        } else {
            list2 = list3;
        }
        r8.A06(reel2, r18, wb4, list3, list2, i);
        Object A0E = A0q.A0E();
        if (A0E != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A0E;
    }
}
