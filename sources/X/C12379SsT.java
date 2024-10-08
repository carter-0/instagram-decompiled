package X;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.SsT  reason: case insensitive filesystem */
public final class C12379SsT implements C13828Thz {
    public final C10864RzP A00;
    public final STT A01;
    public final String A02;
    public final C13886Tj9 A03;
    public final C7232Q0d A04;
    public final C13863Tij A05;
    public final C13821Thq A06;
    public final Map A07;

    public final synchronized void Dig(C11284SJc sJc, float f) {
        this.A06.DaE(f);
        this.A05.Dtc(f);
    }

    public final synchronized void Dta(Exception exc) {
        synchronized (this) {
            this.A01.A06();
            this.A06.DEb(exc);
        }
    }

    public final synchronized void Dvj(C10689RwT rwT) {
        this.A06.onSuccess(new C10940S1w(REA.RAW, rwT, AnonymousClass7TE.A1C()));
    }

    public final void EKC() {
    }

    public final void cancel() {
        synchronized (this) {
            this.A01.A06();
        }
        this.A06.D0h(new CancellationException("RawMediaUploadStrategy canceled by user"));
    }

    public final void FMV() {
        File A0t;
        C10939S1u s1u = new C10939S1u(this.A03, (C11354SOn) null, this.A07);
        long j = -1;
        C9596Rda.A00(s1u.A01, (Exception) null, "media_upload_process_skipped", s1u.A02, -1);
        this.A05.DtN();
        this.A06.onStart();
        C10864RzP rzP = this.A00;
        String str = this.A02;
        String A002 = Q1U.A00(str, "video/mp4", false);
        C10249Rp9 rp9 = rzP.A0J;
        if (rp9 != null) {
            List A08 = rp9.A00.A08(C266714aE.VIDEO, 0);
            if (A08 != null) {
                A0t = ((C266754aI) A08.get(0)).A04;
                C266784aL.A05(A0t);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            A0t = AnonymousClass7TE.A0t(str);
            j = A0t.length();
        }
        C11284SJc sJc = new C11284SJc(RF9.Mixed, A0t, A002, 0, j, 0, j);
        STT stt = this.A01;
        stt.A08();
        stt.A09(sJc);
        stt.A07();
    }

    public C12379SsT(C13886Tj9 tj9, C7232Q0d q0d, C10864RzP rzP, RR8 rr8, C13821Thq thq, String str, Map map) {
        C51972G9s.A1C(str, tj9);
        this.A00 = rzP;
        this.A02 = str;
        Map map2 = map;
        this.A07 = map2;
        this.A03 = tj9;
        this.A06 = thq;
        this.A05 = rzP.A02;
        this.A04 = q0d;
        C10746RxQ rxQ = new C10746RxQ(tj9, map2);
        C11187SEn sEn = new C11187SEn(tj9, map2);
        C10542Rtw rtw = new C10542Rtw(tj9, map2, Pxf.A0F(str));
        RR8 rr82 = rr8;
        this.A01 = rr82.A00(rtw, q0d, this, sEn, rxQ, REA.RAW);
    }
}
