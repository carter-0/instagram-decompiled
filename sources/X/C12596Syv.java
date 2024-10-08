package X;

import android.app.Activity;
import android.content.IntentSender;

/* renamed from: X.Syv  reason: case insensitive filesystem */
public final class C12596Syv implements C365558nJ {
    public final int A00;
    public final Object A01;

    public C12596Syv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D59(AnonymousClass9GD r5) {
        AnonymousClass4D7 r1;
        Object obj;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r5, 0);
                if (r5.A05) {
                    Q2R q2r = (Q2R) this.A01;
                    q2r.A03 = true;
                    Q2S q2s = q2r.A00;
                    if (q2s != null && q2s.A00.cancel(true)) {
                        q2r.A02 = null;
                        q2r.A00 = null;
                        q2r.A01 = null;
                        return;
                    }
                    return;
                } else if (r5.A0E()) {
                    ((Q2R) this.A01).A00(r5.A06());
                    return;
                } else {
                    Exception A05 = r5.A05();
                    if (A05 != null) {
                        ((Q2R) this.A01).A01(A05);
                        return;
                    }
                    throw Pxe.A0i();
                }
            case 1:
                0qQ.A0B(r5, 0);
                if (!r5.A0E()) {
                    Exception A052 = r5.A05();
                    if (A052 instanceof C8357QpF) {
                        try {
                            ((RKT) A052).A00.A00((Activity) this.A01, 23107);
                            return;
                        } catch (IntentSender.SendIntentException e) {
                            0wb.A07("AymhErrorSaveSmartLock", e);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                1Av r0 = ((C69102Neh) this.A01).A07;
                long currentTimeMillis = System.currentTimeMillis();
                0xY AR4 = r0.A01.AR4();
                AR4.E5c("previous_in_app_review_prompt_time", currentTimeMillis);
                AR4.apply();
                return;
            default:
                Exception A053 = r5.A05();
                if (A053 == null) {
                    boolean z = r5.A05;
                    Object obj2 = this.A01;
                    if (z) {
                        ((1IX) obj2).AG9((Throwable) null);
                        return;
                    } else {
                        r1 = (AnonymousClass4D7) obj2;
                        obj = r5.A06();
                    }
                } else {
                    r1 = (AnonymousClass4D7) this.A01;
                    obj = JTO.A1B(A053);
                }
                r1.resumeWith(obj);
                return;
        }
    }
}
