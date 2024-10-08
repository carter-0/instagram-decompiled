package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.ViT  reason: case insensitive filesystem */
public final class C17938ViT {
    public X7A A00 = null;
    public final Context A01;
    public final AnonymousClass07i A02;
    public final 1Ng A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final AnonymousClass2fP A06;
    public final C310306am A07;
    public final C310316an A08;
    public final C310286ak A09;
    public final AnonymousClass0eM A0A;

    public C17938ViT(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r12, String str) {
        AnonymousClass7TG.A1Q(userSession, r12);
        0gy A002 = AnonymousClass07i.A00(fragmentActivity);
        C310286ak A003 = C310266ai.A00(userSession);
        AnonymousClass2fP A004 = AnonymousClass2fO.A00(userSession);
        C310306am r4 = new C310306am(r12, userSession, str);
        C310316an r3 = new C310316an(userSession);
        AnonymousClass0eM A005 = AnonymousClass1YB.A00(new C20698WxU((Object) fragmentActivity, 36));
        1Ng A006 = AnonymousClass1Nd.A00(userSession);
        C51969G9p.A1N(A003, 5, A006);
        this.A01 = fragmentActivity;
        this.A04 = userSession;
        this.A05 = r12;
        this.A02 = A002;
        this.A09 = A003;
        this.A06 = A004;
        this.A07 = r4;
        this.A08 = r3;
        this.A0A = A005;
        this.A03 = A006;
    }

    public final void A00(C16702V2f v2f, C17514VYs vYs) {
        C16538Uwi uwi;
        String str;
        C310316an r6 = this.A08;
        if (vYs.A03) {
            uwi = C16538Uwi.SET_REMINDER;
        } else {
            uwi = C16538Uwi.UNSET_REMINDER;
        }
        String str2 = vYs.A02;
        UpcomingEvent upcomingEvent = vYs.A01;
        String obj = upcomingEvent.CBz().toString();
        1Xj r1 = vYs.A00;
        if (r1 != null) {
            str = C231122qu.A07(this.A04, r1);
        } else {
            str = null;
        }
        r6.A02(uwi, str2, obj, str);
        new C17888Vhf(this.A01, this.A04, upcomingEvent).A00(new C20704Wxb(33, this, v2f, vYs));
    }
}
