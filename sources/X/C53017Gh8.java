package X;

import android.app.Application;
import com.meta.metaai.shared.feedback.data.FeedbackRepository;

/* renamed from: X.Gh8  reason: case insensitive filesystem */
public final class C53017Gh8 extends 2YL {
    public final Application A00;
    public final C55750Hml A01;
    public final FeedbackRepository A02;
    public final 05G A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;
    public final AnonymousClass0Ud A06;
    public final boolean A07;

    public C53017Gh8(Application application, C55750Hml hml, FeedbackRepository feedbackRepository, boolean z) {
        this.A07 = z;
        this.A02 = feedbackRepository;
        this.A00 = application;
        this.A01 = hml;
        02z A10 = DbS.A10(new C56549I1d((C56107Hsu) null, "WriteWithAIFeedbackBottomSheet"));
        this.A03 = A10;
        this.A05 = 10b.A03(A10);
        02z A012 = 106.A01(I1M.A00);
        this.A04 = A012;
        this.A06 = A012;
    }

    public final void A00(HMN hmn, String str, String str2) {
        int A022 = DbW.A02(1, str, str2);
        C55750Hml hml = this.A01;
        C56507Hzd hzd = hml.A00;
        XSJ A002 = XXw.A00(((C54552HIn) hml.A01).A00);
        C54673HOe hOe = C54673HOe.WRITE;
        0qQ.A0B(A002, 0);
        0qQ.A0B(hOe, A022);
        C56507Hzd.A00(hOe, A002, hzd, "feedback_submitted", "thumbs_down");
        C67391tE r0 = C67391tE.A00;
        HMN hmn2 = hmn;
        AnonymousClass7TE.A1Z(new MGN(this, hmn2, str2, str, (AnonymousClass4D7) null, 22), r0);
        05G r2 = this.A04;
        do {
        } while (!r2.AIY(r2.getValue(), I1Q.A00));
        do {
        } while (!r2.AIY(r2.getValue(), I1L.A00));
    }

    public final void A01(String str) {
        05G r1;
        Object obj;
        if (0qQ.A0K(str, "WriteWithAIFeedbackBottomSheet") || (0qQ.A0K(str, "WriteWithAIBadReasonBottomSheet") && this.A07)) {
            r1 = this.A04;
            obj = I1L.A00;
        } else {
            r1 = this.A04;
            obj = I1N.A00;
        }
        r1.Epw(obj);
    }
}
