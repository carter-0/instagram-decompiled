package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.EAv  reason: case insensitive filesystem */
public final class C47635EAv extends C231632rz {
    public static final EWD A04 = EWD.DISCOVER_PEOPLE_INTERSTITIAL;
    public final Activity A00;
    public final F07 A01;
    public final UserSession A02;
    public final Context A03;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r6, Object obj, Object obj2) {
        0qQ.A0B(r6, 0);
        r6.A7U(0);
        F07 f07 = this.A01;
        EWD ewd = A04;
        0qQ.A0B(ewd, 0);
        f07.A04.A01(DbU.A0a(f07.A00, AnonymousClass30Y.A00(ewd, C60340gF.A00, "discover_people_interstitial")), "discover_people_interstitial");
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47635EAv(Activity activity, Context context, F07 f07, UserSession userSession) {
        this.A02 = userSession;
        this.A03 = context;
        this.A00 = activity;
        this.A01 = f07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (X.182.A06(X.0Tu.A05, r5, 36314859022912338L) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r8, android.view.View r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r7 = this;
            r0 = -803031597(0xffffffffd022b5d3, float:-1.09193001E10)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r6 = 1
            X.0qQ.A0B(r9, r6)
            r4 = r9
            com.instagram.igds.components.headline.IgdsHeadline r4 = (com.instagram.igds.components.headline.IgdsHeadline) r4
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r5 = r7.A02
            com.instagram.user.model.User r0 = r0.A01(r5)
            boolean r0 = r0.A2L()
            if (r0 == 0) goto L_0x002a
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314859022912338(0x81042c00210b52, double:3.0290013020654004E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r1 = 1
            if (r0 != 0) goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            r0 = 2131237690(0x7f081b3a, float:1.8091638E38)
            r4.setImageResource(r0)
            r4.A02 = r6
            r0 = 2131973508(0x7f135584, float:1.9584054E38)
            if (r1 == 0) goto L_0x003b
            r0 = 2131973509(0x7f135585, float:1.9584056E38)
        L_0x003b:
            r4.setHeadline((int) r0)
            r0 = 2131973506(0x7f135582, float:1.958405E38)
            if (r1 == 0) goto L_0x0046
            r0 = 2131973507(0x7f135583, float:1.9584052E38)
        L_0x0046:
            r4.setBody((int) r0)
            r1 = 2131973505(0x7f135581, float:1.9584048E38)
            r0 = 60
            X.FP8 r0 = X.FP8.A00(r7, r0)
            r4.ENc(r0, r1)
            X.F07 r2 = r7.A01
            X.EWD r1 = A04
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.2oe r1 = r2.A04
            java.lang.String r0 = "discover_people_interstitial"
            X.30Y r1 = r1.A00(r0)
            X.30Y r0 = X.AnonymousClass30Y.A07
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0072
            X.2el r0 = r2.A03
            r0.A05(r9, r1)
        L_0x0072:
            r0 = 385058786(0x16f387e2, float:3.9344521E-25)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47635EAv.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(367536412);
        IgdsHeadline igdsHeadline = new IgdsHeadline(this.A03, (AttributeSet) null, 0, 0);
        AnonymousClass0fD.A0A(-1466700910, A032);
        return igdsHeadline;
    }
}
