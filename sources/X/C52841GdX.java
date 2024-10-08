package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.GdX  reason: case insensitive filesystem */
public final class C52841GdX extends TouchDelegate {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ AnonymousClass3W1 A04;
    public final /* synthetic */ String A05;

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass47L r1;
        float f;
        Integer num;
        C238863Ds r0;
        C55951HqF hqF;
        0qQ.A0B(motionEvent, 0);
        if (!this.A00.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        motionEvent.getX();
        motionEvent.getY();
        UserSession userSession = this.A02;
        1Xj r6 = this.A03;
        AnonymousClass3W1 r3 = this.A04;
        AndroidLink androidLink = (AndroidLink) 00k.A0J(r6.A3P());
        if (androidLink != null) {
            r1 = C271714jT.A01(androidLink);
        } else {
            r1 = null;
        }
        View view = this.A01;
        if (motionEvent.getActionMasked() == 1) {
            C238833Dp A0X = C51967G9n.A0X(userSession);
            if (r6.A5D()) {
                hqF = new C55951HqF(C238863Ds.CTA_MARGIN_AREA);
                hqF.A01 = Integer.valueOf(r3.A03);
            } else {
                if (r1 == AnonymousClass47L.AD_DESTINATION_AR_CAMERA) {
                    r0 = C238863Ds.AR_ADS_OPEN_CAMERA;
                } else {
                    r0 = C238863Ds.CTA_MARGIN_AREA;
                }
                hqF = new C55951HqF(r0);
            }
            A0X.A09(view, hqF.A00(), new String[0], 1);
        }
        String str = this.A05;
        String A002 = C273654mx.A00(643);
        boolean A0K = 0qQ.A0K(str, A002);
        String A003 = AnonymousClass000.A00(4677);
        if (A0K) {
            f = AnonymousClass7TE.A03(view) - motionEvent.getY();
        } else if (0qQ.A0K(str, A003)) {
            f = motionEvent.getY();
        } else {
            f = 0.0f;
        }
        motionEvent.setLocation(motionEvent.getX(), f);
        r3.A0e = motionEvent;
        Integer num2 = null;
        if (0qQ.A0K(str, A002)) {
            num2 = AnonymousClass05K.A00;
        } else if (0qQ.A0K(str, A003)) {
            num2 = AnonymousClass05K.A01;
        }
        if (!(r3.A12 == null || r3.A11 == num2)) {
            r3.A11 = num2;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            num = AnonymousClass05K.A00;
        } else if (action != 1) {
            if (action == 3) {
                num = AnonymousClass05K.A0C;
            }
            return true;
        } else {
            num = AnonymousClass05K.A01;
        }
        if (r3.A12 != num) {
            r3.A12 = num;
            AnonymousClass3W1.A00(r3, 56);
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52841GdX(Rect rect, View view, View view2, UserSession userSession, 1Xj r5, AnonymousClass3W1 r6, String str) {
        super(rect, view);
        this.A00 = rect;
        this.A02 = userSession;
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = view2;
        this.A05 = str;
    }
}
