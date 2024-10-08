package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MomentAdsTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.fragment.NewsfeedFragment;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;
import java.util.EnumSet;
import java.util.List;

/* renamed from: X.TrX  reason: case insensitive filesystem */
public final class C14192TrX {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final String A03;
    public final String A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;

    public static final void A00(1Xj r1, AnonymousClass3W1 r2, C14192TrX trX) {
        r2.A1u = false;
        AnonymousClass3W1.A00(r2, 26);
        r1.AE7(trX.A01);
    }

    public static final void A01(1Xj r1, C14192TrX trX) {
        UserSession userSession = trX.A01;
        EnumSet enumSet = 1sx.A01;
        if (C243213Xw.A03(userSession, r1) || r1.A0C.BU1() == MomentAdsTypeEnum.IG_SCHEDULED_LIVE) {
            AnonymousClass3GX.A00(userSession).A06("instagram_feed_timeline");
        }
    }

    public final void A02(1Xj r14, AnonymousClass3W1 r15) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C309516Yo r1 = new C309516Yo(fragmentActivity, userSession);
        r1.A0B((Bundle) null, new NewsfeedFragment());
        r1.A08();
        r1.A05();
        1Xj r4 = r14;
        UpcomingEvent A27 = r14.A27(userSession);
        if (A27 != null) {
            AnonymousClass1Nd.A00(userSession).A00(new WQA(A27));
        }
        W3r.A06(userSession, r4, this.A02, r15, "cta_bar_view_upcoming_event", this.A04, (String) null, (String) null, (List) null, false);
    }

    public final void A03(1Xj r23, AnonymousClass3W1 r24, String str) {
        C16702V2f v2f;
        UpcomingEventReminderAction upcomingEventReminderAction;
        UserSession userSession = this.A01;
        1Xj r8 = r23;
        UpcomingEvent A27 = r8.A27(userSession);
        AnonymousClass3W1 r10 = r24;
        String str2 = str;
        if (A27 != null) {
            r10.A1u = true;
            AnonymousClass3W1.A00(r10, 26);
            r8.AE7(userSession);
            boolean A012 = new C310296al(userSession).A01(A27);
            if (182.A06(0Tu.A05, userSession, 36320339399024979L)) {
                FragmentActivity fragmentActivity = this.A00;
                Context applicationContext = fragmentActivity.getApplicationContext();
                0qQ.A07(applicationContext);
                AnonymousClass4DU r16 = this.A02;
                C17902Vht vht = new C17902Vht(applicationContext, fragmentActivity, userSession, r16, str2, AnonymousClass07a.A00(fragmentActivity));
                1Xj r17 = r8;
                AnonymousClass3W1 r18 = r10;
                C19792WfZ wfZ = new C19792WfZ(r17, r18, new C19791WfY(1, r17, r18, vht, this), vht, this);
                AnonymousClass0eM r0 = this.A08;
                UpcomingEventReminderRepository upcomingEventReminderRepository = (UpcomingEventReminderRepository) r0.getValue();
                if (((UpcomingEventReminderRepository) r0.getValue()).A06.A01(A27)) {
                    upcomingEventReminderAction = UpcomingEventReminderAction.UNSET_REMINDER;
                } else {
                    upcomingEventReminderAction = UpcomingEventReminderAction.SET_REMINDER;
                }
                upcomingEventReminderRepository.A03(wfZ, new L8U(r8, upcomingEventReminderAction, A27, str2), AnonymousClass07a.A00(fragmentActivity));
            } else {
                C17938ViT viT = (C17938ViT) this.A07.getValue();
                viT.A00 = new C19794Wfb(r8, r10, this);
                C17514VYs vYs = new C17514VYs(r8, A27, str2, !A012);
                if (!A012) {
                    v2f = new C16350UtP(vYs, viT);
                } else {
                    v2f = C16352UtR.A00;
                }
                viT.A00(v2f, vYs);
            }
            if ((!C18810W3l.A0B(A27)) || C18810W3l.A0B(A27)) {
                AnonymousClass1Nd.A00(userSession).A00(new WQA(A27));
            }
        }
        W3r.A06(userSession, r8, this.A02, r10, str2, this.A04, (String) null, (String) null, (List) null, false);
    }

    public C14192TrX(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r6, String str, String str2) {
        this.A00 = fragmentActivity;
        this.A02 = r6;
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = str2;
        0eO r2 = 0eO.A02;
        this.A07 = AnonymousClass0eN.A00(r2, new C20698WxU((Object) this, 40));
        this.A08 = AnonymousClass0eN.A00(r2, new C20698WxU((Object) this, 41));
        this.A05 = AnonymousClass0eN.A00(r2, new C20698WxU((Object) this, 38));
        this.A09 = AnonymousClass0eN.A00(r2, new C20698WxU((Object) this, 42));
        this.A06 = AnonymousClass0eN.A00(r2, new C20698WxU((Object) this, 39));
    }
}
