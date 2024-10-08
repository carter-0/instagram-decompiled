package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.OQy  reason: case insensitive filesystem */
public abstract class C70906OQy {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r7, android.content.Intent r8, X.C71111Ocu r9, X.OK7 r10, int r11, int r12, int r13, boolean r14) {
        /*
            r3 = 0
            X.AnonymousClass7TG.A1O(r10, r9)
            r0 = 101(0x65, float:1.42E-43)
            if (r11 != r0) goto L_0x0058
            r0 = -1
            if (r12 != r0) goto L_0x0058
            if (r8 == 0) goto L_0x0058
            java.lang.String r0 = "screen_capture_share_types"
            java.util.ArrayList r4 = r8.getStringArrayListExtra(r0)
            java.lang.String r0 = "screen_capture_is_success"
            boolean r6 = r8.getBooleanExtra(r0, r3)
            java.lang.String r0 = "screen_capture_is_discarded"
            boolean r1 = r8.getBooleanExtra(r0, r3)
            java.lang.String r0 = "screen_capture_error_message"
            java.lang.String r5 = r8.getStringExtra(r0)
            if (r4 == 0) goto L_0x0058
            if (r1 == 0) goto L_0x006d
            X.OKY r2 = r10.A00
            java.lang.String r0 = r4.toString()
            X.PJl r1 = new X.PJl
            r1.<init>(r0, r5)
        L_0x0034:
            r2.A00(r1)
        L_0x0037:
            java.lang.String r2 = "story"
            boolean r0 = r4.contains(r2)
            java.lang.String r1 = "direct"
            if (r0 == 0) goto L_0x0059
            boolean r0 = r4.contains(r1)
            if (r0 == 0) goto L_0x0059
            r0 = 2131972742(0x7f135286, float:1.95825E38)
        L_0x004a:
            java.lang.String r1 = r7.getString(r0)
            if (r1 == 0) goto L_0x0058
            X.PNS r0 = new X.PNS
            r0.<init>(r1, r3)
            r9.A05(r0)
        L_0x0058:
            return
        L_0x0059:
            boolean r0 = r4.contains(r2)
            if (r0 == 0) goto L_0x0063
            r0 = 2131972743(0x7f135287, float:1.9582502E38)
            goto L_0x004a
        L_0x0063:
            boolean r0 = r4.contains(r1)
            if (r0 == 0) goto L_0x0058
            r0 = 2131972741(0x7f135285, float:1.9582498E38)
            goto L_0x004a
        L_0x006d:
            if (r14 == 0) goto L_0x0092
            X.0xE r2 = new X.0xE
            r2.<init>()
            java.util.Iterator r1 = r4.iterator()
        L_0x0078:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            r2.A04(r0)
            goto L_0x0078
        L_0x0086:
            X.OKY r2 = r10.A00
            java.lang.String r0 = r4.toString()
            X.IX1 r1 = new X.IX1
            r1.<init>(r0, r5, r13, r6)
            goto L_0x0034
        L_0x0092:
            r10.A00(r5, r4, r6)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70906OQy.A01(android.content.Context, android.content.Intent, X.Ocu, X.OK7, int, int, int, boolean):void");
    }

    public static final void A00(Activity activity, UserSession userSession, DirectCameraViewModel directCameraViewModel, String str, boolean z) {
        boolean A1Z = DbW.A1Z(str);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable("screen_capture_share_arguments_key_entry_point", 28D.A5U);
        A0a.putBoolean("screen_capture_is_photobooth", A1Z);
        A0a.putString("screen_capture_share_arguments_key_file_path", str);
        if (z) {
            A0a.putString("media_type", MediaStreamTrack.VIDEO_TRACK_KIND);
        }
        if (directCameraViewModel != null) {
            A0a.putParcelable("screen_capture_share_arguments_camera_view_model", directCameraViewModel);
        }
        AnonymousClass6W8.A02(activity, A0a, userSession, ModalActivity.class, C273654mx.A00(1011)).A0A(activity, 101);
    }
}
