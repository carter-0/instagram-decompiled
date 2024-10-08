package X;

import com.facebookpay.logging.LoggingContext;

/* renamed from: X.Se7  reason: case insensitive filesystem */
public final class C11664Se7 implements 2YM {
    public final QDU A00;
    public final C7434QCz A01;
    public final QDR A02;
    public final QDL A03;
    public final LoggingContext A04;
    public final QDH A05;
    public final QDT A06;
    public final QDJ A07;
    public final QDQ A08;
    public final QDS A09;
    public final QD3 A0A;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final 2YL create(Class cls) {
        0qQ.A0B(cls, 0);
        if (cls.equals(QDN.class)) {
            LoggingContext loggingContext = this.A04;
            QDJ qdj = this.A07;
            QDS qds = this.A09;
            QDR qdr = this.A02;
            QDU qdu = this.A00;
            QDQ qdq = this.A08;
            QD3 qd3 = this.A0A;
            QDT qdt = this.A06;
            return new QDN(qdu, this.A01, qdr, this.A03, loggingContext, this.A05, qdt, qdj, qdq, qds, qd3);
        }
        throw AnonymousClass7TE.A0w("Input class not implemented");
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public C11664Se7(QDU qdu, C7434QCz qCz, QDR qdr, QDL qdl, LoggingContext loggingContext, QDH qdh, QDT qdt, QDJ qdj, QDQ qdq, QDS qds, QD3 qd3) {
        this.A04 = loggingContext;
        this.A07 = qdj;
        this.A09 = qds;
        this.A02 = qdr;
        this.A00 = qdu;
        this.A08 = qdq;
        this.A0A = qd3;
        this.A06 = qdt;
        this.A03 = qdl;
        this.A05 = qdh;
        this.A01 = qCz;
    }
}
