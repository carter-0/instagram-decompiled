package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.3b6  reason: invalid class name and case insensitive filesystem */
public final class C244383b6 extends 0Yg implements 0sL {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ AnonymousClass4DU A01;
    public final /* synthetic */ C242813Wa A02;
    public final /* synthetic */ C244363b4 A03;
    public final /* synthetic */ AnonymousClass3W1 A04;
    public final /* synthetic */ User A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C244383b6(1Xj r2, AnonymousClass4DU r3, C242813Wa r4, C244363b4 r5, AnonymousClass3W1 r6, User user, String str, boolean z) {
        super(2);
        this.A03 = r5;
        this.A00 = r2;
        this.A05 = user;
        this.A04 = r6;
        this.A07 = z;
        this.A06 = str;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        boolean z;
        View.OnTouchListener Dsc;
        View view = (View) obj;
        MotionEvent motionEvent = (MotionEvent) obj2;
        0qQ.A0B(view, 0);
        0qQ.A0B(motionEvent, 1);
        UserSession userSession = this.A03.A00;
        1Xj r7 = this.A00;
        User user = this.A05;
        AnonymousClass3W1 r1 = this.A04;
        boolean z2 = this.A07;
        String str = this.A06;
        AnonymousClass4DU r3 = this.A01;
        C242813Wa r2 = this.A02;
        Reel A002 = AnonymousClass3X0.A00.A00(userSession, r7, r1);
        if (C244393b7.A00(userSession, r7, str) || ((A002 != null && !z2) || motionEvent.getAction() != 0 || (Dsc = r2.Dsc(r7, user.getId(), r3.getModuleName())) == null)) {
            z = false;
        } else {
            z = Dsc.onTouch(view, motionEvent);
        }
        return Boolean.valueOf(z);
    }
}
