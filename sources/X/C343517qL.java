package X;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7qL  reason: invalid class name and case insensitive filesystem */
public final class C343517qL extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C352888Fl A00;

    public C343517qL(C352888Fl r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r1.contains(r5, r4) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onDoubleTap(android.view.MotionEvent r8) {
        /*
            r7 = this;
            X.8Fl r2 = r7.A00
            boolean r0 = r2.A1S
            r3 = 0
            if (r0 == 0) goto L_0x0070
            boolean r0 = r2.A0Y()
            r4 = 1
            if (r0 == 0) goto L_0x0071
            X.8Yz r1 = r2.A0g
            X.8aL r0 = X.C358088aL.A0p
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x0071
        L_0x001c:
            X.80U r1 = r2.A1C
            X.80V r0 = X.AnonymousClass80V.ROLL_CALL_SEQUENTIAL_CAPTURE
            boolean r0 = r1.CQ0(r0)
            if (r4 != 0) goto L_0x0070
            if (r0 != 0) goto L_0x0070
            X.82W r0 = r2.A0Z
            X.82X r0 = r0.A00()
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r0.A05
            com.instagram.camera.effect.models.CameraAREffect r6 = r0.A09
            X.80V r0 = X.AnonymousClass80V.LAYOUT_CAPTURE
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x005a
            float r0 = r8.getRawX()
            int r5 = (int) r0
            float r0 = r8.getRawY()
            int r4 = (int) r0
            X.JYD r0 = r2.A0C
            if (r0 == 0) goto L_0x0070
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            X.7l2 r0 = r0.A0E
            android.view.View r0 = r0.A0F
            r0.getHitRect(r1)
            boolean r0 = r1.contains(r5, r4)
            if (r0 == 0) goto L_0x0070
        L_0x005a:
            if (r6 == 0) goto L_0x0073
            java.util.Map r1 = r6.A0Z
            java.lang.String r0 = "worldTracker"
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L_0x0070
            java.util.Map r1 = r6.A0Z
            java.lang.String r0 = "tapGestures"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0073
        L_0x0070:
            return r3
        L_0x0071:
            r4 = 0
            goto L_0x001c
        L_0x0073:
            com.instagram.common.session.UserSession r0 = r2.A0f
            java.lang.Integer r1 = r2.A0N()
            X.0qQ.A0B(r0, r3)
            X.27r r0 = X.27p.A01(r0)
            int r6 = X.C59895JbK.A03(r1)
            X.29Z r5 = r0.A0F
            X.283 r4 = r5.A04
            r4.A01 = r6
            X.0wc r3 = r5.A01
            java.lang.String r1 = "ig_camera_ui_tool_click"
            X.0kJ r0 = r3.A00
            X.0Aj r3 = r3.A00(r0, r1)
            boolean r0 = r5.A0P()
            if (r0 == 0) goto L_0x0140
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0140
            X.80P r1 = X.AnonymousClass80P.CAMERA_SWITCH
            java.lang.String r0 = "tool_type"
            r3.A8M(r1, r0)
            java.lang.String r1 = "IG_CAMERA_SWITCH_DOUBLE_TAP"
            java.lang.String r0 = "legacy_falco_event_name"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r4.A0L
            if (r1 != 0) goto L_0x00b4
            java.lang.String r1 = ""
        L_0x00b4:
            java.lang.String r0 = "camera_session_id"
            r3.AAJ(r0, r1)
            java.lang.String r1 = "DOUBLE_TAP"
            java.lang.String r0 = "user_behavior"
            r3.AAJ(r0, r1)
            r0 = 2
            if (r6 == r0) goto L_0x00c4
            r0 = 1
        L_0x00c4:
            java.lang.String r1 = "camera_position"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A8k(r1, r0)
            X.28D r1 = r4.A09
            java.lang.String r0 = "entry_point"
            r3.A8M(r1, r0)
            r0 = 2
            java.lang.String r1 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A8k(r1, r0)
            X.4yP r1 = r5.A0J()
            java.lang.String r0 = "camera_destination"
            r3.A8M(r1, r0)
            X.28t r1 = r4.A0A
            java.lang.String r0 = "media_type"
            r3.A8M(r1, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r3.AAJ(r0, r1)
            X.JVj r1 = X.C59725JVj.PRE_CAPTURE
            java.lang.String r0 = "surface"
            r3.A8M(r1, r0)
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "capture_format_index"
            r3.A9F(r0, r1)
            X.8fP r1 = r5.A0I()
            java.lang.String r0 = "capture_type"
            r3.A8M(r1, r0)
            java.lang.String r1 = r4.A0O
            if (r1 == 0) goto L_0x0123
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = "discovery_session_id"
            r3.AAJ(r0, r1)
        L_0x0123:
            java.lang.String r1 = r4.A0P
            if (r1 == 0) goto L_0x0132
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = "search_session_id"
            r3.AAJ(r0, r1)
        L_0x0132:
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r3.AAJ(r0, r1)
            r3.Cgf()
        L_0x0140:
            r0 = 0
            boolean r3 = r2.A0Z(r0, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343517qL.onDoubleTap(android.view.MotionEvent):boolean");
    }

    public final void onLongPress(MotionEvent motionEvent) {
        C340297l2 r0;
        C352888Fl r2 = this.A00;
        AnonymousClass84E r14 = r2.A0c;
        if (r14 != null && (r0 = r2.A06) != null && r0.CVP() && !r2.A0K) {
            Integer A0N = r2.A0N();
            if ((A0N == null || !A0N.equals(1)) && r2.A0Z.A00().A05.A09 == null && r2.A0g.A0R() && ((double) r2.A00) < 0.01d) {
                AnonymousClass80U r1 = r2.A1C;
                if (r1.CQ0(AnonymousClass80V.CAPTURE) || r1.CQ0(AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY)) {
                    if (r2.A04 == null) {
                        r2.A04 = new C40166AUg(r2);
                        C340297l2 r02 = r2.A06;
                        r02.getClass();
                        Rect A0B = r02.A0B();
                        r14.getClass();
                        int width = A0B.width();
                        int height = A0B.height();
                        LP6 lp6 = r14.A03;
                        if (lp6 == null) {
                            lp6 = new LP6(r14, r14.A0B, r14.A0D);
                            r14.A03 = lp6;
                        }
                        lp6.A02();
                        WJp wJp = r14.A07;
                        if (wJp == null) {
                            Activity activity = r14.A08;
                            UserSession userSession = r14.A0D;
                            AnonymousClass0iw r12 = r14.A0C;
                            wJp = new WJp(activity, (ViewGroup) r14.A0A.requireViewById(R.id.quick_capture_outer_container), new VM8(userSession, r12.getModuleName()), r12, userSession, r14);
                            r14.A07 = wJp;
                        }
                        AnonymousClass1Nd.A00(wJp.A0G).A01(wJp.A0F, C2370836g.class);
                        r14.A01 = 0;
                        LP6 lp62 = r14.A03;
                        if (lp62 != null) {
                            lp62.A01 = width;
                            lp62.A00 = height;
                        }
                        r2.A06.A9b(r2.A04, 1);
                        r2.A0L = true;
                        r2.A01 = System.currentTimeMillis();
                    }
                    Handler handler = r2.A0Q;
                    Runnable runnable = r2.A1K;
                    handler.removeCallbacks(runnable);
                    handler.postDelayed(runnable, 2000);
                }
            }
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return C352888Fl.A0L(this.A00, motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getX(), motionEvent.getY());
    }
}
