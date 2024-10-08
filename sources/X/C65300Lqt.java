package X;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.pendingmedia.model.AllUserStoryTarget;
import com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Map;

/* renamed from: X.Lqt  reason: case insensitive filesystem */
public final class C65300Lqt implements MV9 {
    public final Context A00;
    public final UserSession A01;
    public final IngestSessionShim A02;
    public final C61002Juy A03;
    public final MVA A04;
    public final UserStoryTarget A05;
    public final MTF A06;
    public final AnonymousClass0iw A07;
    public final C363008it A08;
    public final boolean A09;

    public final void D8z() {
    }

    public final int BPM(TextView textView) {
        return this.A04.BPH(textView);
    }

    public final void Dj4() {
        String str;
        Integer num;
        AnonymousClass3QO r0;
        UserSession userSession = this.A01;
        PendingMediaStore A002 = 28K.A00(userSession);
        IngestSessionShim ingestSessionShim = this.A02;
        AnonymousClass3Q2 A032 = A002.A03((String) AnonymousClass7TE.A13(ingestSessionShim.A00));
        if (A032 != null) {
            UserStoryTarget userStoryTarget = this.A05;
            if (userStoryTarget == UserStoryTarget.A02) {
                r0 = AnonymousClass3QO.CLOSE_FRIENDS;
            } else if (userStoryTarget == UserStoryTarget.A06) {
                r0 = AnonymousClass3QO.HALLPASS;
            } else if (userStoryTarget == UserStoryTarget.A09) {
                r0 = AnonymousClass3QO.CUSTOM;
            }
            A032.A1F = r0;
        }
        Context context = this.A00;
        0mE.A00(context, Activity.class);
        String obj = C61002Juy.A07.toString();
        C61002Juy juy = this.A03;
        if (!JTQ.A1Y(juy, obj) || A032 == null || !C271404in.A0E(A032.A4b)) {
            boolean z = this.A09;
            String str2 = null;
            if (z) {
                if (A032 != null) {
                    str = C2373637i.A01(A032);
                    str2 = A032.A0I();
                } else {
                    str = null;
                }
                C63394KwF.A00(userSession, "primary_click", "share_sheet", str, str2, (Map) null);
                if (C363018iu.A00(userSession)) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = AnonymousClass05K.A0j;
                }
                str2 = C63422Kwi.A00(num);
            }
            MVA mva = this.A04;
            if (mva.Cbi()) {
                LRm AXA = this.A06.AXA();
                UserStoryTarget userStoryTarget2 = this.A05;
                AXA.A06(new C65294Lqn(context, userSession, ingestSessionShim, userStoryTarget2, (String) null, str2, z), juy);
                mva.Djv(userStoryTarget2);
                return;
            }
            return;
        }
        FGM.A04(userSession, context);
    }

    public final void DuW() {
        MTF mtf = this.A06;
        mtf.AXA().A07(this.A03);
        mtf.AXA().A07(C61002Juy.A08);
        this.A04.Dua(this.A05);
    }

    public C65300Lqt(Context context, AnonymousClass0iw r3, UserSession userSession, IngestSessionShim ingestSessionShim, MVA mva, UserStoryTarget userStoryTarget, C363008it r8, MTF mtf, boolean z) {
        C61002Juy A012;
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = mva;
        this.A06 = mtf;
        this.A09 = z;
        this.A05 = userStoryTarget;
        this.A02 = ingestSessionShim;
        if (userStoryTarget instanceof AllUserStoryTarget) {
            A012 = C61002Juy.A03;
        } else if (userStoryTarget instanceof CloseFriendsUserStoryTarget) {
            A012 = C61002Juy.A05;
        } else {
            C61002Juy juy = C61002Juy.A02;
            A012 = C64010LIx.A01(userStoryTarget);
        }
        this.A03 = A012;
        this.A07 = r3;
        this.A08 = r8;
    }
}
