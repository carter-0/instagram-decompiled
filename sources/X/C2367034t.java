package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.34t  reason: invalid class name and case insensitive filesystem */
public final class C2367034t implements C250603lj {
    public C230252pH A00;

    public final void ATF(AnonymousClass30Y r11, C252093oY r12) {
        String A002;
        0qQ.A0B(r11, 0);
        0qQ.A0B(r12, 1);
        int intValue = r12.CEk(r11).intValue();
        if (intValue == 0 || intValue == 1) {
            this.A00.A01(((C255953uz) r11.A04).A00);
            return;
        }
        C230252pH r1 = this.A00;
        C255953uz r0 = (C255953uz) r11.A04;
        int i = r0.A00;
        long j = r0.A01;
        Integer num = r0.A02;
        0qQ.A0B(num, 2);
        UserSession userSession = r1.A02;
        if (182.A06(0Tu.A05, userSession, 36317517606950112L)) {
            0qQ.A0B(userSession, 0);
            AnonymousClass0kM r02 = new AnonymousClass0kM(userSession);
            r02.A01 = "reel_feed_timeline";
            1Ln A0D = 1Ln.A0D(r02.A00());
            if (A0D.A00.isSampled()) {
                long currentTimeMillis = System.currentTimeMillis() - j;
                switch (num.intValue()) {
                    case 0:
                        A002 = "UNKNOWN";
                        break;
                    case 1:
                        A002 = AnonymousClass000.A00(2290);
                        break;
                    case 2:
                        A002 = "STORY_TRAY_TAIL_FETCH";
                        break;
                    case 3:
                        A002 = "STORY_VIEWER_FETCH";
                        break;
                    default:
                        A002 = "STORIES_HEAD_LOAD_STREAMING";
                        break;
                }
                A0D.A0R(DatePickerDialogModule.ARG_MODE, A002);
                A0D.A0Q("time_elapsed", Long.valueOf(currentTimeMillis));
                A0D.A0n("reel_feed_timeline");
                A0D.A0Q("version", 4L);
                A0D.A0Q("spinner_position", Long.valueOf((long) i));
                A0D.Cgf();
            }
        }
    }
}
