package X;

import com.instagram.api.schemas.MediaNoteMimicryTrigger;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3gF  reason: invalid class name and case insensitive filesystem */
public final class C247383gF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final UserSession A05;
    public final C247353gC A06;
    public final C247003fc A07;

    public final void A03(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        C247353gC r1 = this.A06;
        r1.A02 = true;
        GPJ.A02(this.A05, str, str2);
        AnonymousClass0eM r4 = r1.A07;
        if (((1Av) r4.getValue()).A01.getInt("content_note_feed_nux_shown_count", 0) < this.A01) {
            int i = ((1Av) r4.getValue()).A01.getInt("content_note_feed_nux_shown_count", 0) + 1;
            0xY AR4 = ((1Av) r4.getValue()).A01.AR4();
            AR4.E5Z("content_note_feed_nux_shown_count", i);
            AR4.apply();
        }
    }

    public final void A04(String str, String str2) {
        0qQ.A0B(str, 0);
        C247353gC r1 = this.A06;
        r1.A03 = true;
        GPJ.A02(this.A05, str, str2);
        AnonymousClass0eM r4 = r1.A07;
        if (((1Av) r4.getValue()).A01.getInt("content_note_reels_nux_shown_count", 0) < this.A03) {
            int i = ((1Av) r4.getValue()).A01.getInt("content_note_reels_nux_shown_count", 0) + 1;
            0xY AR4 = ((1Av) r4.getValue()).A01.AR4();
            AR4.E5Z("content_note_reels_nux_shown_count", i);
            AR4.apply();
        }
    }

    public final C247003fc A00(MediaNoteMimicryTrigger mediaNoteMimicryTrigger, 1Xj r5, Integer num, String str, boolean z) {
        C247353gC r1 = this.A06;
        if (r1.A00()) {
            if (!r1.A03 && ((1Av) r1.A07.getValue()).A01.getInt("content_note_reels_nux_shown_count", 0) < this.A03) {
                C247003fc r12 = this.A07;
                if (r12 == C247003fc.A03) {
                    return C247003fc.SHARE_BUTTON;
                }
                return r12;
            } else if (z && C297495rq.A00(this.A05).A00(mediaNoteMimicryTrigger, r5, num, str)) {
                return C247003fc.SHARE_BUTTON_NUDGE;
            }
        }
        return C247003fc.A03;
    }

    public final C247003fc A01(boolean z) {
        C247353gC r1 = this.A06;
        if (r1.A00()) {
            if (!r1.A02 && ((1Av) r1.A07.getValue()).A01.getInt("content_note_feed_nux_shown_count", 0) < this.A01) {
                C247003fc r12 = this.A07;
                if (r12 == C247003fc.A03) {
                    return C247003fc.SHARE_BUTTON;
                }
                return r12;
            } else if (z) {
                return C247003fc.SHARE_BUTTON_NUDGE;
            }
        }
        return C247003fc.A03;
    }

    public final void A02() {
        C247353gC r4 = this.A06;
        AnonymousClass0eM r5 = r4.A07;
        0xa r3 = ((1Av) r5.getValue()).A01;
        String A002 = AnonymousClass000.A00(1221);
        int i = r3.getInt(A002, 0) + 1;
        0xY AR4 = r3.AR4();
        AR4.E5Z(A002, i);
        AR4.apply();
        r4.A06.getValue();
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR42 = ((1Av) r5.getValue()).A01.AR4();
        AR42.E5c("content_note_share_tooltip_nux_last_shown_timestamp", currentTimeMillis);
        AR42.apply();
        r4.A04 = true;
    }

    public final boolean A05() {
        C247353gC r8 = this.A06;
        AnonymousClass0eM r2 = r8.A07;
        if (((1Av) r2.getValue()).A01.getInt(AnonymousClass000.A00(1221), 0) < this.A04) {
            r8.A06.getValue();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            UserSession userSession = r8.A05;
            0qQ.A0B(userSession, 0);
            if (System.currentTimeMillis() - ((1Av) r2.getValue()).A01.getLong("content_note_share_tooltip_nux_last_shown_timestamp", 0) < timeUnit.toMillis(182.A01(0Tu.A05, userSession, 36602127914046027L))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A06() {
        return ((1Av) this.A06.A07.getValue()).A01.getBoolean(AnonymousClass000.A00(1402), false);
    }

    public final boolean A07(boolean z) {
        int i;
        int i2;
        C247353gC r1 = this.A06;
        if (z) {
            if (!r1.A03) {
                i = ((1Av) r1.A07.getValue()).A01.getInt("content_note_reels_nux_shown_count", 0);
                i2 = this.A03;
            }
            return false;
        }
        if (!r1.A02) {
            i = ((1Av) r1.A07.getValue()).A01.getInt("content_note_feed_nux_shown_count", 0);
            i2 = this.A01;
        }
        return false;
        if (i >= i2) {
            return false;
        }
        return true;
    }

    public C247383gF(UserSession userSession, C247353gC r6) {
        C247003fc r0;
        this.A05 = userSession;
        this.A06 = r6;
        0Tu r3 = 0Tu.A05;
        this.A01 = (int) 182.A01(r3, userSession, 36602127910113850L);
        this.A03 = (int) 182.A01(r3, userSession, 36602127910244924L);
        this.A02 = (int) 182.A01(r3, userSession, 36602127914242637L);
        this.A00 = (int) 182.A01(r3, userSession, 36602127913652809L);
        this.A04 = (int) 182.A01(r3, userSession, 36602127913914954L);
        int A012 = (int) 182.A01(r3, userSession, 36602127912145475L);
        if (A012 == 1) {
            r0 = C247003fc.SHARE_BUTTON;
        } else if (A012 == 2) {
            r0 = C247003fc.COMMENT_BUTTON;
        } else if (A012 != 3) {
            r0 = C247003fc.A03;
        } else {
            r0 = C247003fc.REPLY_SHEET_MIMICRY_TOOLTIP;
        }
        this.A07 = r0;
    }
}
