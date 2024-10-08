package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Sok  reason: case insensitive filesystem */
public final class C12195Sok implements C13818Thm {
    public final EventBuilder A00;
    public final C279364yW A01;
    public final AnonymousClass0eM A02;

    public final void A8R(Exception exc) {
    }

    public final void A9M(String str) {
        this.A00.annotate(DialogModule.KEY_MESSAGE, str);
    }

    public final boolean isSampled() {
        return this.A00.isSampled();
    }

    public final void report() {
        EventBuilder eventBuilder = this.A00;
        if (eventBuilder.isSampled()) {
            Iterator it = 0Yt.A0E().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(it);
                eventBuilder.annotate(DbT.A13(A1J), DbS.A0s(A1J));
            }
            eventBuilder.report();
        }
    }

    public C12195Sok(C279364yW r4, Integer num, AnonymousClass0eM r6) {
        AnonymousClass7TG.A1Q(r6, r4);
        this.A02 = r6;
        this.A01 = r4;
        this.A00 = ((LightweightQuickPerformanceLogger) r6.getValue()).markEventBuilder(S96.A00(num), S96.A01(num));
    }

    public final void ABT(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A00.annotate(str, str2);
    }
}
