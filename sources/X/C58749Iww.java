package X;

import androidx.compose.ui.Alignment;
import com.facebook.msys.mca.MailboxCallback;
import com.facebookpay.logging.LoggingContext;
import com.fbpay.w3c.CardDetails;
import com.instagram.common.session.UserSession;
import com.instagram.igsignals.core.IgSignalsModelPrediction;
import java.util.HashSet;

/* renamed from: X.Iww  reason: case insensitive filesystem */
public final class C58749Iww extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58749Iww(long j, Object obj, Object obj2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A03 = obj;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                Alignment alignment = ((IES) this.A03).A01;
                C267974cY r3 = (C267974cY) this.A02;
                ((C268104cl) obj).A06(r3, 0.0f, alignment.AB3(AnonymousClass5Q8.Ltr, C289155d7.A00(r3.A01, r3.A00), this.A01));
                break;
            case 1:
                S21 s21 = (S21) obj;
                if (s21 != null) {
                    C7420QCj qCj = (C7420QCj) this.A03;
                    AnonymousClass2gB r1 = qCj.A07;
                    r1.A0D((2Fk) this.A02);
                    Throwable th = s21.A02;
                    if (th != null) {
                        r1.A0B(REL.Error);
                        AnonymousClass2Fj r12 = qCj.A08;
                        HashSet hashSet = C11216SFq.A0C;
                        r12.A0B(new C7608QOq((CardDetails) null, new C11216SFq(qCj.A0D(), th), (String) null, -1, -1, -1, -1));
                        break;
                    } else {
                        qCj.A02 = qCj.A0E.A04();
                        C7420QCj.A01(qCj, qCj.A0D.now() - this.A01);
                        break;
                    }
                }
                break;
            case 5:
                AnonymousClass5RU A0S = C51968G9o.A0S(obj);
                C270284gU r13 = (C270284gU) this.A03;
                A0S.EjG(C51971G9r.A03(r13));
                A0S.EjH(C51971G9r.A03(r13));
                A0S.EOX(C51971G9r.A03((C270284gU) this.A02));
                A0S.EpB(this.A01);
                break;
            case 6:
                return ((C70626ODx) this.A03).A00.A0M(new C72120Owf(58, (0sP) new C73942PmM(this.A01, 1, AnonymousClass7TE.A1a(2HM.A00((UserSession) this.A02).A0K.A00()))));
            case 7:
                return ((AnonymousClass6AW) this.A03).A00((MailboxCallback) null, this.A01, ((AnonymousClass6AT) this.A02).A04);
            case 8:
                IgSignalsModelPrediction igSignalsModelPrediction = (IgSignalsModelPrediction) obj;
                0qQ.A0B(igSignalsModelPrediction, 0);
                AnonymousClass565.A01(igSignalsModelPrediction, (LDU) this.A02, (AnonymousClass565) this.A03, this.A01);
                break;
            case 9:
                ((AnonymousClass2j8) this.A03).A01.post(new C57921Iic((C59554JOa) this.A02, AnonymousClass7TE.A0R(obj), this.A01));
                return C60340gF.A00;
            default:
                1Ln r15 = (1Ln) obj;
                0bb r2 = new 0bb();
                C51971G9r.A1B(r2, (LoggingContext) this.A03);
                r2.A05(Pxd.A00(838), Long.valueOf(this.A01));
                r15.A0N(r2, "event_payload");
                C51969G9p.A1G(r15, this.A02);
                return r15;
        }
        return C60340gF.A00;
    }
}
