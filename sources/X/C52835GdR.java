package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GdR  reason: case insensitive filesystem */
public final class C52835GdR extends GestureDetector.SimpleOnGestureListener {
    public View A00;
    public final Context A01;
    public final GestureDetector A02;
    public final UserSession A03;
    public final C267324bN A04;
    public final C52058GDe A05;
    public final C59593JPn A06;
    public final C52046GCs A07;
    public final boolean A08;

    public C52835GdR(Context context, C267324bN r4, C52058GDe gDe, UserSession userSession, C59593JPn jPn, C52046GCs gCs, boolean z) {
        0qQ.A0B(gDe, 3);
        AnonymousClass7TG.A1S(jPn, gCs);
        this.A01 = context;
        this.A04 = r4;
        this.A05 = gDe;
        this.A03 = userSession;
        this.A06 = jPn;
        this.A07 = gCs;
        this.A08 = z;
        this.A02 = new GestureDetector(context, this, AnonymousClass7TF.A0D());
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Float f;
        Float f2;
        MotionEvent motionEvent2 = motionEvent;
        0qQ.A0B(motionEvent2, 0);
        C59593JPn jPn = this.A06;
        C267324bN r14 = this.A04;
        C52058GDe gDe = this.A05;
        UserSession userSession = this.A03;
        User A082 = r14.A08(userSession);
        HLF A012 = AnonymousClass3ZC.A01(r14);
        View view = this.A00;
        String str = "header_expanded_tap_area";
        if (view != null) {
            StringBuilder sb = new StringBuilder(str);
            float x = motionEvent2.getX();
            Context context = this.A01;
            0Tu A0J = DbS.A0J(userSession, 0);
            if (x <= 0nA.A00(context, C51965G9l.A00(A0J, userSession, 37171009211662874L))) {
                sb.append("_start");
            }
            float x2 = motionEvent2.getX();
            float A022 = AnonymousClass7TE.A02(view);
            0qQ.A0B(userSession, 0);
            if (x2 >= A022 - 0nA.A00(context, C51965G9l.A00(A0J, userSession, 37171009211728411L))) {
                sb.append("_end");
            }
            if (motionEvent2.getY() <= 0nA.A00(context, C51965G9l.A00(A0J, userSession, 37171009211793948L))) {
                sb.append("_top");
            }
            if (motionEvent2.getY() >= AnonymousClass7TE.A03(view) - 0nA.A00(context, C51965G9l.A00(A0J, userSession, 37171009211859485L))) {
                sb.append("_bottom");
            }
            str = DbT.A10(sb);
        }
        Float valueOf = Float.valueOf(motionEvent2.getX());
        Float valueOf2 = Float.valueOf(motionEvent2.getY());
        boolean z = this.A08;
        View view2 = this.A00;
        if (view2 != null) {
            f = Float.valueOf(motionEvent2.getX() / AnonymousClass7TE.A02(view2));
        } else {
            f = null;
        }
        View view3 = this.A00;
        if (view3 != null) {
            f2 = Float.valueOf(motionEvent2.getY() / AnonymousClass7TE.A03(view3));
        } else {
            f2 = null;
        }
        jPn.Da6((View) null, r14, gDe, A012, A082, (Boolean) null, (Boolean) null, valueOf, valueOf2, f, f2, str, (String) null, (String) null, (C62320sa) null, false, z);
        View view4 = this.A00;
        if (view4 == null) {
            return true;
        }
        this.A07.A05(view4, (C238863Ds) null, (Integer) null);
        return true;
    }
}
