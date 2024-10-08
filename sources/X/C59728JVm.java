package X;

import android.os.Handler;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.JVm  reason: case insensitive filesystem */
public final class C59728JVm implements AnonymousClass0lh {
    public long A00 = 585177486;
    public LRV A01 = LRV.A04;
    public boolean A02;
    public final 04u A03 = new 04u(0);
    public final 29E A04;
    public final UserSession A05;
    public final Handler A06 = AnonymousClass7TF.A0D();
    public final Runnable A07;

    public C59728JVm(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
        hashCode();
        this.A04 = new 29E(14i.A08, userSession, new C59726JVk(), new C59727JVl());
        this.A07 = new C65859M2a(this);
    }

    public final void A06(C279294yP r9, 28D r10) {
        0qQ.A0B(r10, 0);
        this.A04.A0D("falco_start_camera_session", this.A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r10.toString(), "camera_destination", r9.toString());
    }

    public final void A08(String str) {
        String str2 = str;
        0JA.A01();
        29E r0 = this.A04;
        long j = this.A00;
        if (str == null) {
            str2 = "reshare_failed";
        }
        this.A00 = r0.A07(str2, "", 585177486, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r2.contains("draft_list_view_created") != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C59728JVm r6) {
        /*
            X.29E r5 = r6.A04
            long r0 = r6.A00
            r4 = 585177486(0x22e1198e, float:6.101343E-18)
            boolean r0 = r5.A0E(r4, r0)
            if (r0 == 0) goto L_0x006b
            X.04u r2 = r6.A03
            X.0JA.A01()
            java.lang.String r0 = "qcc_fully_visible"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "direct_gallery_visible"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "draft_list_view_created"
            boolean r0 = r2.contains(r0)
            r1 = 0
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            r1 = 1
        L_0x002c:
            java.lang.String r0 = "gallery_items_loaded"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = "first_frame_rendered"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = "post_capture_media_ready"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = "draft_list_items_loaded"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x006b
        L_0x004c:
            if (r1 == 0) goto L_0x006b
            long r2 = r6.A00
            com.instagram.common.session.UserSession r0 = r6.A05
            X.27r r0 = X.27p.A01(r0)
            X.4yP r0 = r0.A0J()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "camera_destination"
            r5.A09(r2, r0, r1)
            long r0 = r6.A00
            long r0 = r5.A02(r4, r0)
            r6.A00 = r0
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59728JVm.A00(X.JVm):void");
    }

    public static final void A01(C59728JVm jVm, String str) {
        29E r2 = jVm.A04;
        if (r2.A0E(585177486, jVm.A00)) {
            jVm.A00 = r2.A06(CancelReason.USER_CANCELLED, str, 585177486, jVm.A00);
        }
    }

    public final void A03() {
        29E r4 = this.A04;
        if (r4.A0E(585177486, this.A00)) {
            r4.A09(this.A00, "is_cold_start", "true");
        }
    }

    public final void onSessionWillEnd() {
        LRV lrv = LRV.A03;
        this.A01.A00 = "d_";
        this.A01 = lrv;
        this.A02 = false;
        A01(this, "logout");
    }

    public final void A02() {
        0JA.A01();
        29E r4 = this.A04;
        if (r4.A0E(585177486, this.A00)) {
            r4.A0C("gallery_items_loaded", this.A00);
            this.A03.add("gallery_items_loaded");
        }
        A00(this);
    }

    public final void A04(float f) {
        0JA.A01();
        if (((double) f) > 0.95d) {
            this.A06.postDelayed(this.A07, 200);
        } else if (f > 0.99f) {
            Handler handler = this.A06;
            Runnable runnable = this.A07;
            handler.removeCallbacksAndMessages(runnable);
            handler.post(runnable);
        }
    }

    public final void A05(long j) {
        0JA.A01();
        System.nanoTime();
        29E r6 = this.A04;
        if (r6.A0E(585177486, this.A00)) {
            long j2 = this.A00;
            PointEditor markPointWithEditor = r6.A00.markPointWithEditor(j2, "first_frame_rendered", 29E.A00(r6, "", j2, false));
            markPointWithEditor.pointCustomTimestamp(j / 1000000);
            markPointWithEditor.markerEditingCompleted();
            this.A03.add("first_frame_rendered");
        }
        A00(this);
    }

    public final void A07(28D r8, boolean z) {
        long j;
        0JA.A01();
        if (!this.A02) {
            LRV lrv = new LRV(r8);
            this.A02 = true;
            String str = "d_";
            this.A01.A00 = str;
            this.A01 = lrv;
            boolean z2 = !z;
            0JA.A01();
            29E r4 = this.A04;
            if (r8 == 28D.A5B) {
                j = 3600000;
            } else {
                j = 10000;
            }
            long A032 = r4.A03(585177486, j);
            this.A00 = A032;
            LRV lrv2 = this.A01;
            if (!0qQ.A0K(lrv2.A00, str)) {
                str = lrv2.A02;
            }
            r4.A0A(A032, "extended_creation_session_id", str);
            r4.A0A(this.A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r8.toString());
            r4.A09(this.A00, "is_cold_start", String.valueOf(z2));
            this.A03.clear();
        }
    }
}
