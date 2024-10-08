package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.LinkedHashMap;

/* renamed from: X.Jdj  reason: case insensitive filesystem */
public final class C60033Jdj extends GestureDetector.SimpleOnGestureListener {
    public View A00;
    public boolean A01;
    public final /* synthetic */ AnonymousClass3Y5 A02;
    public final /* synthetic */ C243673Zt A03;
    public final /* synthetic */ C53897Gw3 A04;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        View view;
        C242243Te r0;
        String str;
        MotionEvent motionEvent2 = motionEvent;
        0qQ.A0B(motionEvent2, 0);
        if (!this.A01 && (view = this.A00) != null) {
            C53897Gw3 gw3 = this.A04;
            C243673Zt r02 = this.A03;
            AnonymousClass3Y5 r4 = this.A02;
            view.performHapticFeedback(0);
            C53897Gw3.A00(view, r02);
            C60314JjH jjH = gw3.A03;
            C335907dj r2 = gw3.A00;
            Integer num = r2.A0G;
            int i = 0;
            if (num != null && num.intValue() > 0) {
                i = 16;
            }
            Rect A0W = AnonymousClass7TE.A0W();
            view.getGlobalVisibleRect(A0W);
            A0W.bottom += 2Wd.A00(r4.Bnf(), Double.doubleToRawLongBits((double) i));
            float rawX = motionEvent2.getRawX();
            float rawY = motionEvent2.getRawY();
            05G r1 = jjH.A0D;
            String str2 = r2.A0K;
            String str3 = r2.A0N;
            r1.Epw(new C61203Jyw(new PointF(rawX, rawY), A0W, r2.A05, r2.A0C, str2, str3, r2.A0S, r2.A0Z, jjH.A03.A0e));
            jjH.A05.A0N(str2, str3, true);
            LSm lSm = jjH.A08;
            boolean z = r2.A0V;
            AnonymousClass2Ep A002 = LSm.A00(lSm);
            if (!(A002 == null || (r0 = ((AnonymousClass3U9) A002).A01.A0s) == null)) {
                0eP A022 = LSm.A02(lSm);
                0eP A032 = LSm.A03(lSm, r0, A002);
                if (z) {
                    str = "True";
                } else {
                    str = "False";
                }
                LinkedHashMap A0p = JTS.A0p("is_reply", str, A022, A032);
                DbZ.A0R(lSm.A04).A0W("comment_options_menu_rendered", "tap", AnonymousClass000.A00(1207), "comments_view", A002.C6C(), A002.C6k(), A0p, A002.AdN());
            }
            this.A01 = true;
        }
    }

    public C60033Jdj(AnonymousClass3Y5 r1, C243673Zt r2, C53897Gw3 gw3) {
        this.A04 = gw3;
        this.A02 = r1;
        this.A03 = r2;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C242243Te r0;
        String str;
        C53897Gw3 gw3 = this.A04;
        if (!gw3.A02.A00()) {
            return false;
        }
        C335907dj r5 = gw3.A00;
        if (r5.A0S) {
            return false;
        }
        View view = this.A00;
        if (view != null) {
            view.performHapticFeedback(0);
        }
        C60314JjH jjH = gw3.A03;
        C243803a8.A00(this.A02);
        String str2 = r5.A0K;
        String str3 = r5.A0N;
        C60314JjH.A03(jjH, str2, str3, r5.A0C.getId(), false);
        LSm lSm = jjH.A08;
        boolean A1V = AnonymousClass7TF.A1V(str3);
        AnonymousClass2Ep A002 = LSm.A00(lSm);
        if (!(A002 == null || (r0 = ((AnonymousClass3U9) A002).A01.A0s) == null)) {
            0eP A022 = LSm.A02(lSm);
            0eP A032 = LSm.A03(lSm, r0, A002);
            if (A1V) {
                str = "True";
            } else {
                str = "False";
            }
            LinkedHashMap A0p = JTS.A0p("is_reply", str, A022, A032);
            C313756gx A0R = DbZ.A0R(lSm.A04);
            int AdN = A002.AdN();
            A0R.A0W(AnonymousClass000.A00(1549), "tap", AnonymousClass000.A00(1207), "comments_view", A002.C6C(), A002.C6k(), A0p, AdN);
        }
        this.A01 = true;
        return true;
    }

    public C60033Jdj() {
    }
}
