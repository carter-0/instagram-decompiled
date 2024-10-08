package X;

import android.graphics.Rect;
import android.view.MotionEvent;

/* renamed from: X.90E  reason: invalid class name */
public final /* synthetic */ class AnonymousClass90E implements C353078Ge {
    public final /* synthetic */ C3507686c A00;
    public final /* synthetic */ AnonymousClass86W A01;
    public final /* synthetic */ C352888Fl A02;
    public final /* synthetic */ AnonymousClass80D A03;
    public final /* synthetic */ C3508086k A04;

    public /* synthetic */ AnonymousClass90E(C3507686c r1, AnonymousClass86W r2, C352888Fl r3, AnonymousClass80D r4, C3508086k r5) {
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final boolean EsK(MotionEvent motionEvent) {
        C352888Fl r6 = this.A02;
        AnonymousClass80D r9 = this.A03;
        C3508086k r8 = this.A04;
        AnonymousClass86W r5 = this.A01;
        C3507686c r3 = this.A00;
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        Rect rect = new Rect();
        ((C3497981v) r6.A0t).getView().getGlobalVisibleRect(rect);
        if (new Rect(rect.left + 10, rect.top + 10, rect.right + 10, rect.bottom + 10).contains(rawX, rawY)) {
            C59895JbK.A0H(r9.A0S, r6.A0N());
            r6.A0Z((Runnable) null, (Runnable) null);
        } else if (!r8.A00().CQA(motionEvent)) {
            return false;
        } else {
            if (motionEvent.getAction() == 1) {
                C331157Pu r0 = ((C357358Xo) r5.A00.A00()).A00;
                if (r0 != null) {
                    r0.A07();
                }
                C331157Pu r02 = r3.A00;
                if (r02 != null) {
                    r02.A07();
                    return true;
                }
            }
        }
        return true;
    }
}
