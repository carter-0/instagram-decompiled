package X;

import android.graphics.Bitmap;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.W3CCardDetail;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.IxA  reason: case insensitive filesystem */
public final class C58763IxA extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58763IxA(int i, long j, long j2, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A03 = obj;
        this.A04 = obj2;
        this.A02 = j2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                AnonymousClass5Q4 r4 = (AnonymousClass5Q4) obj2;
                r4.AQW();
                long j = this.A01;
                long j2 = this.A02;
                r4.AQr((C304786Ff) this.A03, (C288195bW) null, (C289645dx) this.A04, 1.0f, 3, j, j2);
                break;
            case 1:
                S21 s21 = (S21) obj2;
                if (s21 != null) {
                    C7419QCi qCi = (C7419QCi) this.A04;
                    AnonymousClass2gB r7 = qCi.A03;
                    r7.A0D((2Fk) this.A03);
                    Throwable th = s21.A02;
                    if (DbW.A1a(th)) {
                        AnonymousClass2Fj r3 = qCi.A04;
                        Object obj3 = s21.A01;
                        if (obj3 != null) {
                            r3.A0B(new C7606QOo(((W3CCardDetail) obj3).A00, (C11216SFq) null, (String) null, qCi.A07.now() - this.A02, this.A01, C11288SJh.A02.now()));
                            break;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        List list = qCi.A02;
                        if (th != null) {
                            list.add(th);
                            long j3 = this.A02;
                            HashSet hashSet = C11216SFq.A0C;
                            C11216SFq sFq = new C11216SFq(qCi.A0D(), th);
                            r7.A0B(REK.Error);
                            qCi.A04.A0B(new C7606QOo((CardDetails) null, sFq, (String) null, qCi.A07.now() - j3, -1, -1));
                            C7419QCi.A00(qCi);
                            break;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                }
                break;
            case 2:
                AnonymousClass5Q4 r42 = (AnonymousClass5Q4) obj2;
                C51970G9q.A15(r42);
                long Bwg = r42.Bwg();
                float A022 = C288025bF.A02(Bwg) * 0.75f;
                long A002 = C289325dP.A00(C288025bF.A02(Bwg) * 0.9f, C288025bF.A00(Bwg) * 0.15f);
                long j4 = this.A01;
                float f = A022 / 2.0f;
                C289635dw r19 = C289635dw.A00;
                r42.AQV((C288195bW) null, r19, f, 1.0f, 3, j4, A002);
                float F06 = r42.F06(4.0f);
                float F062 = r42.F06(6.0f);
                long Bwg2 = r42.Bwg();
                long A003 = AnonymousClass5TW.A00((int) ((C288025bF.A02(Bwg2) * 0.9f) - f), (int) ((C288025bF.A00(Bwg2) * 0.15f) - f));
                C55828HoB hoB = (C55828HoB) this.A03;
                int A004 = (int) (C51975G9x.A00(hoB.A01) * F06);
                C3018260f r15 = (C3018260f) this.A04;
                int i = A004 / 2;
                int i2 = (int) (0.5f * A022);
                long A012 = C289165d8.A01(A003, AnonymousClass5TW.A00(((int) (0.25f * A022)) - i, i2 - i));
                long A005 = C289155d7.A00(A004, A004);
                long j5 = this.A02;
                C288185bV r2 = new C288185bV(j5, 5);
                Bitmap bitmap = ((C3018360g) r15).A00;
                AnonymousClass5Q4 r16 = r42;
                C288185bV r17 = r2;
                r16.AQb(r17, r15, r19, 1.0f, 3, 1, 0, C51975G9x.A08(bitmap), A012, A005);
                int A006 = (int) (F06 * C51975G9x.A00(hoB.A00));
                int i3 = A006 / 2;
                long A013 = C289165d8.A01(A003, AnonymousClass5TW.A00(i2 - i3, ((int) (0.75f * A022)) - i3));
                long A007 = C289155d7.A00(A006, A006);
                AnonymousClass5Q4 r25 = r42;
                C3018260f r27 = r15;
                C289635dw r28 = r19;
                r25.AQb(new C288185bV(j5, 5), r27, r28, 1.0f, 3, 1, 0, C51975G9x.A08(bitmap), A013, A007);
                int A008 = (int) (F062 * C51975G9x.A00(hoB.A02));
                int i4 = A008 / 2;
                long A014 = C289165d8.A01(A003, AnonymousClass5TW.A00(((int) (0.67f * A022)) - i4, ((int) (A022 * 0.33f)) - i4));
                long A009 = C289155d7.A00(A008, A008);
                r25.AQb(new C288185bV(j5, 5), r27, r28, 1.0f, 3, 1, 0, C51975G9x.A08(bitmap), A014, A009);
                break;
            default:
                AnonymousClass6GH r43 = (AnonymousClass6GH) obj2;
                0qQ.A0B(r43, 0);
                return r43.A00(new C58763IxA(2, this.A01, this.A02, this.A03, this.A04));
        }
        return C60340gF.A00;
    }
}
