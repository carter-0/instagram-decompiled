package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.473  reason: invalid class name */
public final class AnonymousClass473 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C254073rt A01;

    public AnonymousClass473(UserSession userSession, C254073rt r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r5.A0A == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewAttachedToWindow(android.view.View r7) {
        /*
            r6 = this;
            X.3rt r5 = r6.A01
            X.3W1 r4 = r5.A09
            long r0 = r5.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            com.instagram.common.session.UserSession r2 = r6.A00
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0019
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x0019
            boolean r1 = r5.A0A
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            X.AnonymousClass5F6.A00(r2, r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass473.onViewAttachedToWindow(android.view.View):void");
    }

    public final void onViewDetachedFromWindow(View view) {
        C254073rt r3 = this.A01;
        if (r3.A0E) {
            C292905ji A002 = C292885jg.A00(this.A00);
            AnonymousClass3W1 r0 = r3.A09;
            if (r0 != null) {
                A002.A01(r0);
                AnonymousClass5FA A003 = AnonymousClass5F9.A00();
                AnonymousClass3W1 r02 = r3.A09;
                if (r02 != null) {
                    A003.A00(r02);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        if (r3.A0D) {
            UserSession userSession = this.A00;
            AnonymousClass5F2 r1 = (AnonymousClass5F2) userSession.A01(AnonymousClass5F2.class, new C58178Ini(userSession, 33));
            AnonymousClass3W1 r03 = r3.A09;
            if (r03 != null) {
                r1.A00(r03);
            }
        }
    }
}
