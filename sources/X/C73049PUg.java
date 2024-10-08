package X;

import com.facebook.quicklog.EventBuilder;

/* renamed from: X.PUg  reason: case insensitive filesystem */
public final /* synthetic */ class C73049PUg implements Runnable {
    public final /* synthetic */ C249733kH A00;

    public /* synthetic */ C73049PUg(C249733kH r1) {
        this.A00 = r1;
    }

    public final void run() {
        C249733kH r1 = this.A00;
        AnonymousClass0eK r0 = r1.A00;
        if (r0 != null) {
            EventBuilder eventBuilder = r1.A01;
            eventBuilder.annotate(AnonymousClass000.A00(765), (String) r0.get());
            eventBuilder.report();
            return;
        }
        throw AnonymousClass7TE.A0z("mReportSourceRefProvider is null");
    }
}
