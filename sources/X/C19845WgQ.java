package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;

/* renamed from: X.WgQ  reason: case insensitive filesystem */
public final class C19845WgQ implements AnonymousClass8Cg {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C19845WgQ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void DHg(boolean z) {
        LEI lei;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod;
        DialogInterface.OnDismissListener onDismissListener;
        AnonymousClass6Z6 r0;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod2;
        int i = this.A00;
        Object obj = this.A02;
        if (i != 0) {
            C19200WPg wPg = (C19200WPg) obj;
            Activity activity = wPg.A01;
            UserSession userSession = wPg.A07;
            0hq r5 = wPg.A04;
            0gy A002 = AnonymousClass07i.A00(wPg.A03);
            1Xj r8 = wPg.A08;
            if (r8 != null) {
                lei = new LEI(activity, r5, A002, userSession, r8);
                if (z) {
                    mediaGenAIDetectionMethod2 = MediaGenAIDetectionMethod.SELF_DISCLOSURE_FLOW;
                } else {
                    mediaGenAIDetectionMethod2 = MediaGenAIDetectionMethod.A0B;
                }
                lei.A02 = mediaGenAIDetectionMethod2;
                onDismissListener = (DialogInterface.OnDismissListener) this.A01;
                r0 = wPg.A0F;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            C19201WPh wPh = (C19201WPh) obj;
            Activity activity2 = wPh.A04;
            UserSession userSession2 = wPh.A0B;
            0hq r52 = wPh.A07;
            0gy A003 = AnonymousClass07i.A00(wPh.A06);
            1Xj r82 = wPh.A0F.A0b;
            if (r82 != null) {
                lei = new LEI(activity2, r52, A003, userSession2, r82);
                if (z) {
                    mediaGenAIDetectionMethod = MediaGenAIDetectionMethod.SELF_DISCLOSURE_FLOW;
                } else {
                    mediaGenAIDetectionMethod = MediaGenAIDetectionMethod.A0B;
                }
                lei.A02 = mediaGenAIDetectionMethod;
                onDismissListener = (DialogInterface.OnDismissListener) this.A01;
                r0 = wPh.A0N;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        lei.A00(onDismissListener, r0);
    }
}
