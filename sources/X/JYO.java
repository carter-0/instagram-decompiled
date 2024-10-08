package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.UUID;

public final class JYO {
    public final int A00;
    public final C359218cI A01;
    public final 02m A02;

    public final void A01(C239803Ii r7) {
        02m r2;
        int i;
        String A002;
        String str;
        short s;
        0qQ.A0B(r7, 0);
        boolean z = r7 instanceof C297815sO;
        if (z) {
            r2 = this.A02;
            i = this.A00;
            Object obj = ((C297815sO) r7).A00;
            if ((obj instanceof C61313K2a) || 0qQ.A0K(obj, K2W.A00)) {
                A002 = "http_error";
            } else if ((obj instanceof K2Z) || 0qQ.A0K(obj, K2V.A00)) {
                A002 = "exception";
            } else if (obj instanceof C8753R7r) {
                A002 = "server_error";
            } else if (obj instanceof C61314K2b) {
                A002 = "insufficient_storage";
            } else if (obj instanceof K2Y) {
                A002 = "client_validation";
            } else {
                A002 = "unknown";
            }
            str = TraceFieldType.FailureReason;
        } else if (r7 instanceof C239793Ih) {
            r2 = this.A02;
            i = this.A00;
            A002 = C346207um.A00(((C379319Tj) ((C239793Ih) r7).A00).A01);
            str = "cache_type";
        } else {
            throw AnonymousClass7TE.A1K();
        }
        r2.markerAnnotate(17640860, i, str, A002);
        if (r7 instanceof C239793Ih) {
            s = 2;
        } else if (z) {
            s = 3;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        r2.markerEnd(17640860, i, s);
    }

    public /* synthetic */ JYO(C359218cI r4) {
        02m r2 = 02m.A0p;
        int hashCode = UUID.randomUUID().hashCode();
        0qQ.A0B(r2, 3);
        this.A01 = r4;
        this.A02 = r2;
        this.A00 = hashCode;
    }

    public final void A00(int i) {
        02m r5 = this.A02;
        int i2 = this.A00;
        r5.markerStart(17640860, i2);
        C359218cI r2 = this.A01;
        r5.markerAnnotate(17640860, i2, "product_id", r2.A02);
        r5.markerAnnotate(17640860, i2, "category_id", r2.A01);
        r5.markerAnnotate(17640860, i2, "effects_count", i);
    }
}
