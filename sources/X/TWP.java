package X;

import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.W3CCardDetail;
import java.util.HashSet;
import java.util.List;

public final class TWP extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 2Fk A02;
    public final /* synthetic */ C7421QCk A03;
    public final /* synthetic */ 0rl A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TWP(2Fk r2, C7421QCk qCk, 0rl r4, long j, long j2) {
        super(1);
        this.A03 = qCk;
        this.A02 = r2;
        this.A04 = r4;
        this.A01 = j;
        this.A00 = j2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass2Fj r5;
        Object lg6;
        S21 s21 = (S21) obj;
        if (s21 != null) {
            C7421QCk qCk = this.A03;
            AnonymousClass2gB r6 = qCk.A08;
            r6.A0D(this.A02);
            Throwable th = s21.A02;
            if (DbW.A1a(th)) {
                AnonymousClass2Fj r2 = qCk.A09;
                Object obj2 = s21.A01;
                if (obj2 != null) {
                    r2.A0B(new LG6(((W3CCardDetail) obj2).A00, (C11216SFq) null, (String) null, qCk.A0D.now() - this.A04.A00, this.A01, this.A00, C11288SJh.A02.now()));
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                List list = qCk.A06;
                if (th != null) {
                    list.add(th);
                    long j = this.A04.A00;
                    HashSet hashSet = C11216SFq.A0C;
                    C11216SFq sFq = new C11216SFq(qCk.A0D(), th);
                    if (AnonymousClass7TF.A1Z(sFq.A07)) {
                        r5 = qCk.A0A;
                        if (r5.A02() == RDS.A02) {
                            lg6 = RDS.A03;
                            r5.A0B(lg6);
                            C7421QCk.A01(qCk);
                        }
                    }
                    r6.A0B(RER.Error);
                    r5 = qCk.A09;
                    lg6 = new LG6((CardDetails) null, sFq, (String) null, qCk.A0D.now() - j, -1, -1, -1);
                    r5.A0B(lg6);
                    C7421QCk.A01(qCk);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        }
        return C60340gF.A00;
    }
}
