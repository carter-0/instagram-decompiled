package X;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lqv  reason: case insensitive filesystem */
public final class C65302Lqv implements MV9 {
    public final Context A00;
    public final UserSession A01;
    public final IngestSessionShim A02;
    public final C363008it A03;
    public final C367188qK A04;
    public final Map A05;
    public final AnonymousClass0iw A06;
    public final C65306Lqz A07;
    public final DirectPrivateStoryRecipientController A08;
    public final ELU A09;
    public final MTF A0A;

    public final void D8z() {
    }

    public static void A00(C65302Lqv lqv) {
        LRm AXA = lqv.A0A.AXA();
        C61002Juy juy = C61002Juy.A08;
        Context context = lqv.A00;
        UserSession userSession = lqv.A01;
        UserStoryTarget userStoryTarget = UserStoryTarget.A04;
        AXA.A06(new C65294Lqn(context, userSession, lqv.A02, userStoryTarget, (String) null, "ig_story_composer", false), juy);
        lqv.A07.Djv(userStoryTarget);
    }

    public final int BPM(TextView textView) {
        return this.A07.BPH(textView);
    }

    public final void Dj4() {
        String str;
        String str2;
        UserSession userSession = this.A01;
        CallerContext callerContext = AnonymousClass8PU.A00;
        0qQ.A0B(userSession, 0);
        if (!AnonymousClass8PU.A07(userSession) || !AnonymousClass8PU.A03(userSession)) {
            16V A012 = AnonymousClass0eD.A01(userSession);
            if (!AnonymousClass7TF.A0Q(userSession).CPm() && (16V.A07 == A012 || 16V.A06 == A012)) {
                FFL.A00(C48152EZu.A0L, userSession, "upsell_primary_click");
                DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A08;
                AnonymousClass1Nd.A00(directPrivateStoryRecipientController.A0B).A01(directPrivateStoryRecipientController.A0y, C61149Jy0.class);
                this.A09.A06(EXN.DIRECT_INBOX_TAB.A01(), (List) null);
                return;
            }
        }
        AnonymousClass3Q2 A032 = 28K.A00(userSession).A03(AnonymousClass7TE.A19(this.A02.A00, 0));
        if (A032 != null) {
            str = A032.A0I();
            str2 = C2373637i.A01(A032);
        } else {
            str = null;
            str2 = null;
        }
        C63394KwF.A00(userSession, "primary_click", "share_sheet", str2, str, this.A05);
        Context context = this.A00;
        Activity activity = (Activity) 0mE.A00(context, Activity.class);
        if (activity != null) {
            C367188qK r3 = this.A04;
            LEO A002 = C63435Kwv.A00(activity, AnonymousClass818.IG_STORY_AFTER_SHARE_SHEET, userSession);
            A002.A05 = new C65641LxI(this, 5);
            A002.A04 = this.A03;
            A002.A0A = str;
            A002.A00 = context;
            r3.A01((C376569Im) null, A002, new C65663Lxe(this, 3));
        }
    }

    public final void DuW() {
        this.A0A.AXA().A07(C61002Juy.A08);
        this.A07.Dua(UserStoryTarget.A04);
    }

    public C65302Lqv(Context context, AnonymousClass0iw r3, UserSession userSession, IngestSessionShim ingestSessionShim, C65306Lqz lqz, DirectPrivateStoryRecipientController directPrivateStoryRecipientController, ELU elu, C363008it r9, MTF mtf, Map map) {
        this.A00 = context;
        this.A01 = userSession;
        this.A07 = lqz;
        this.A0A = mtf;
        this.A02 = ingestSessionShim;
        this.A03 = r9;
        this.A09 = elu;
        this.A06 = r3;
        this.A08 = directPrivateStoryRecipientController;
        this.A04 = new C367188qK(userSession);
        this.A05 = map;
    }
}
