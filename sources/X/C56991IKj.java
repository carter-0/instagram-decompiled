package X;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import com.instagram.api.schemas.ReelsMediaInteractivityType;
import com.instagram.common.session.UserSession;

/* renamed from: X.IKj  reason: case insensitive filesystem */
public final class C56991IKj implements JQA {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ DU9 A01;
    public final /* synthetic */ C267324bN A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ AnonymousClass3W1 A05;
    public final /* synthetic */ AnonymousClass3OA A06;
    public final /* synthetic */ S6e A07;
    public final /* synthetic */ C55571Hjr A08;
    public final /* synthetic */ C52046GCs A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ C62320sa A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;

    public C56991IKj(Activity activity, DU9 du9, C267324bN r3, AnonymousClass0iw r4, UserSession userSession, AnonymousClass3W1 r6, AnonymousClass3OA r7, S6e s6e, C55571Hjr hjr, C52046GCs gCs, String str, C62320sa r12, boolean z, boolean z2, boolean z3) {
        this.A02 = r3;
        this.A01 = du9;
        this.A0A = str;
        this.A0E = z;
        this.A0B = r12;
        this.A09 = gCs;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = userSession;
        this.A03 = r4;
        this.A08 = hjr;
        this.A00 = activity;
        this.A07 = s6e;
        this.A0D = z2;
        this.A0C = z3;
    }

    public final void D2N(C55981Hqm hqm) {
        C52124GFs gFs = C52124GFs.A00;
        C267324bN r11 = this.A02;
        DU9 du9 = this.A01;
        String str = this.A0A;
        C55981Hqm hqm2 = hqm;
        View view = hqm2.A02;
        PointF pointF = hqm2.A00;
        ReelsMediaInteractivityType reelsMediaInteractivityType = ReelsMediaInteractivityType.SINGLE_TAP;
        C62320sa r8 = this.A0B;
        C52046GCs gCs = this.A09;
        AnonymousClass3OA r6 = this.A06;
        AnonymousClass3W1 r5 = this.A05;
        UserSession userSession = this.A04;
        AnonymousClass0iw r3 = this.A03;
        C55571Hjr hjr = this.A08;
        Activity activity = this.A00;
        C52046GCs gCs2 = gCs;
        C55571Hjr hjr2 = hjr;
        S6e s6e = this.A07;
        AnonymousClass3OA r22 = r6;
        AnonymousClass3W1 r21 = r5;
        UserSession userSession2 = userSession;
        AnonymousClass0iw r19 = r3;
        C267324bN r18 = r11;
        DU9 du92 = du9;
        gFs.A02(activity, pointF, view, reelsMediaInteractivityType, du92, r18, r19, userSession2, r21, r22, s6e, hjr2, gCs2, str, r8, this.A0D, false);
    }

    public final void DP1(C55981Hqm hqm) {
        C52124GFs gFs = C52124GFs.A00;
        C267324bN r15 = this.A02;
        DU9 du9 = this.A01;
        String str = this.A0A;
        C55981Hqm hqm2 = hqm;
        View view = hqm2.A02;
        PointF pointF = hqm2.A00;
        ReelsMediaInteractivityType reelsMediaInteractivityType = ReelsMediaInteractivityType.LONG_PRESS_RELEASE;
        C62320sa r10 = this.A0B;
        C52046GCs gCs = this.A09;
        AnonymousClass3OA r8 = this.A06;
        AnonymousClass3W1 r7 = this.A05;
        UserSession userSession = this.A04;
        AnonymousClass0iw r5 = this.A03;
        C55571Hjr hjr = this.A08;
        Activity activity = this.A00;
        S6e s6e = this.A07;
        String str2 = str;
        C62320sa r31 = r10;
        C55571Hjr hjr2 = hjr;
        C52046GCs gCs2 = gCs;
        AnonymousClass3OA r26 = r8;
        S6e s6e2 = s6e;
        UserSession userSession2 = userSession;
        AnonymousClass3W1 r25 = r7;
        C267324bN r22 = r15;
        AnonymousClass0iw r23 = r5;
        DU9 du92 = du9;
        View view2 = view;
        PointF pointF2 = pointF;
        Activity activity2 = activity;
        gFs.A02(activity2, pointF2, view2, reelsMediaInteractivityType, du92, r22, r23, userSession2, r25, r26, s6e2, hjr2, gCs2, str2, r31, this.A0D, this.A0C);
    }

    public final void D20(C55981Hqm hqm) {
        D2N(hqm);
    }
}
