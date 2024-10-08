package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.PYI  reason: case insensitive filesystem */
public final class C73178PYI implements Runnable {
    public final /* synthetic */ AnonymousClass3JD A00;
    public final /* synthetic */ C68466NJe A01;

    public C73178PYI(AnonymousClass3JD r1, C68466NJe nJe) {
        this.A01 = nJe;
        this.A00 = r1;
    }

    public final void run() {
        C250663lr A0U;
        ImmutableList A06;
        C68466NJe nJe = this.A01;
        if (!nJe.mDetached) {
            AnonymousClass3JD r0 = this.A00;
            if (r0 == null || (A0U = C41845B3m.A0U(r0)) == null || (A06 = A0U.A06(C42700Bgx.class, "xfb_genai_thread_subscriptions_query(product_type:$product_type)", 1679701554)) == null || !AnonymousClass7TE.A1b(A06)) {
                C68466NJe.A01(nJe);
                return;
            }
            C67797Mv1 mv1 = nJe.A00;
            if (mv1 == null) {
                0qQ.A0F("itemAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            mv1.A00 = A06;
            mv1.notifyDataSetChanged();
        }
    }
}
