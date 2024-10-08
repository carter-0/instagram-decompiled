package X;

import com.facebookpay.logging.LoggingContext;

public final class Se5 implements 2YM {
    public final QDL A00;
    public final LoggingContext A01;
    public final QDH A02;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final 2YL create(Class cls) {
        0qQ.A0B(cls, 0);
        if (cls.equals(QDM.class)) {
            return new QDM(this.A00, this.A01, this.A02);
        }
        throw AnonymousClass7TE.A0w("Input class not implemented");
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public Se5(QDL qdl, LoggingContext loggingContext, QDH qdh) {
        AnonymousClass7TG.A1Q(qdh, qdl);
        this.A01 = loggingContext;
        this.A02 = qdh;
        this.A00 = qdl;
    }
}
