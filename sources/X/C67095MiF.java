package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.List;

/* renamed from: X.MiF  reason: case insensitive filesystem */
public final class C67095MiF {
    public DirectThreadKey A00;
    public String A01;
    public final Activity A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final 1aq A05;
    public final C67087Mi3 A06;
    public final C273434mZ A07;
    public final ReelViewerConfig A08;
    public final 1XZ A09;
    public final boolean A0A;

    public final void A00(RectF rectF, DirectThreadKey directThreadKey, boolean z) {
        RectF rectF2 = rectF;
        DirectThreadKey directThreadKey2 = directThreadKey;
        Bundle A012 = this.A05.A01(rectF2, directThreadKey2, this.A08, (Boolean) null, (String) null, (String) null, (String) null, this.A01, "inbox", (List) null, (List) null, z, false, false, this.A0A, true, false);
        UserSession userSession = this.A04;
        Activity activity = this.A02;
        AnonymousClass6W8 A0b = DbS.A0b(activity, A012, userSession, TransparentModalActivity.class, "direct_expiring_media_viewer");
        A0b.A0E(this.A07);
        A0b.A0J = ModalActivity.A08;
        A0b.A0C(activity);
        activity.overridePendingTransition(0, 0);
        1XZ r3 = this.A09;
        r3.A02.A04(userSession, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AnonymousClass7QG.A02(userSession.A06, directThreadKey2.A00, "ds"));
    }

    public C67095MiF(Activity activity, AnonymousClass0iw r2, UserSession userSession, 1aq r4, C67087Mi3 mi3, C273434mZ r6, ReelViewerConfig reelViewerConfig, 1XZ r8, boolean z) {
        this.A04 = userSession;
        this.A02 = activity;
        this.A03 = r2;
        this.A08 = reelViewerConfig;
        this.A07 = r6;
        this.A05 = r4;
        this.A09 = r8;
        this.A0A = z;
        this.A06 = mi3;
    }
}
