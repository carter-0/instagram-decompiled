package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.ReelViewerConfig;

/* renamed from: X.6ac  reason: invalid class name and case insensitive filesystem */
public final class C310216ac {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final AnonymousClass4DU A02;
    public final C310016aI A03;
    public final C273384mU A04;
    public final C317116mk A05;
    public final C310186aZ A06;
    public final C310196aa A07;
    public final ReelViewerConfig A08;
    public final C310096aQ A09;

    public C310216ac(UserSession userSession, AnonymousClass4DU r3, ReelViewerConfig reelViewerConfig, AnonymousClass3BQ r5, C310016aI r6, C273384mU r7, C317116mk r8, C310096aQ r9, C310186aZ r10, C310196aa r11, String str) {
        0qQ.A0B(str, 2);
        0qQ.A0B(r6, 3);
        0qQ.A0B(r10, 4);
        0qQ.A0B(r9, 5);
        0qQ.A0B(reelViewerConfig, 7);
        0qQ.A0B(r5, 8);
        0qQ.A0B(r8, 9);
        0qQ.A0B(r11, 10);
        0qQ.A0B(userSession, 11);
        this.A01 = r3;
        this.A03 = r6;
        this.A06 = r10;
        this.A09 = r9;
        this.A04 = r7;
        this.A08 = reelViewerConfig;
        this.A05 = r8;
        this.A07 = r11;
        this.A00 = userSession;
        this.A02 = r3;
    }

    public final void A01(C250973mM r9, C255783ui r10) {
        this.A03.A0G(r9, r10, true, "tag", -1, -1);
    }

    public final void A00(Hashtag hashtag, C250973mM r9, C255783ui r10) {
        0qQ.A0B(hashtag, 0);
        C310016aI r1 = this.A03;
        String name = hashtag.getName();
        if (name != null) {
            r1.A0H(r9, r10, true, "hashtag", name);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
