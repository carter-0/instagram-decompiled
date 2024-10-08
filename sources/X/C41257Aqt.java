package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.camera.DirectCameraViewModel;

/* renamed from: X.Aqt  reason: case insensitive filesystem */
public final class C41257Aqt implements Runnable {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ RectF A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ 28D A03;
    public final /* synthetic */ Medium A04;
    public final /* synthetic */ C15294Ua0 A05;
    public final /* synthetic */ String A06;

    public C41257Aqt(RectF rectF, RectF rectF2, ViewGroup viewGroup, 28D r4, Medium medium, C15294Ua0 ua0, String str) {
        this.A05 = ua0;
        this.A02 = viewGroup;
        this.A03 = r4;
        this.A00 = rectF;
        this.A01 = rectF2;
        this.A04 = medium;
        this.A06 = str;
    }

    public final void run() {
        C15294Ua0 ua0 = this.A05;
        if (ua0.mView != null) {
            ViewGroup viewGroup = this.A02;
            0qQ.A0A(viewGroup);
            28D r11 = this.A03;
            RectF rectF = this.A00;
            RectF rectF2 = this.A01;
            DirectCameraViewModel directCameraViewModel = ua0.A02;
            Medium medium = this.A04;
            String str = this.A06;
            AnonymousClass80D A002 = AnonymousClass80D.A00();
            C41837B2s b2s = ua0.A04;
            b2s.getClass();
            A002.A0l = b2s;
            AnonymousClass0eM r1 = ua0.A05;
            UserSession A0l = AnonymousClass7TE.A0l(r1);
            A0l.getClass();
            A002.A0S = A0l;
            Activity rootActivity = ua0.getRootActivity();
            0qQ.A0A(rootActivity);
            rootActivity.getClass();
            A002.A05 = rootActivity;
            A002.A0M = ua0;
            AnonymousClass80D.A08(AnonymousClass7TE.A0l(r1), AnonymousClass80H.A02, AnonymousClass80M.A00, A002);
            A002.A3h = true;
            A002.A0R = ua0.volumeKeyPressController;
            AnonymousClass80C r0 = ua0.A01;
            r0.getClass();
            A002.A0t = r0;
            viewGroup.getClass();
            A002.A09 = viewGroup;
            A002.A0B = r11;
            A002.A0O = ua0;
            A002.A3I = true;
            AnonymousClass80D.A01(rectF, rectF2, A002);
            A002.A0P = medium;
            A002.A0w = null;
            A002.A2G = str;
            A002.A3y = true;
            AnonymousClass80D.A0A(A002);
            A002.A3Q = true;
            if (directCameraViewModel != null) {
                A002.A1I = directCameraViewModel;
                A002.A28 = AnonymousClass05K.A01;
                A002.A3C = true;
                A002.A3n = true;
                A002.A2q = null;
                A002.A1K = null;
                A002.A2l = null;
                A002.A37 = true;
                A002.A3V = false;
                A002.A03 = 2;
            }
            AnonymousClass80Q r12 = new AnonymousClass80Q(A002);
            ua0.A00 = r12;
            if (ua0.isResumed()) {
                r12.A01();
            }
        }
    }
}
