package X;

import android.content.DialogInterface;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import java.util.Set;

public final class HH3 extends C51086FoG {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public HH3(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj;
        this.A01 = obj2;
    }

    public final void Cyb(boolean z) {
        switch (this.A00) {
            case 1:
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.A03;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss((DialogInterface) this.A01);
                    return;
                }
                return;
            case 2:
                ((C52031GCd) this.A02).A0A.Cud();
                return;
            default:
                return;
        }
    }

    public final void De7() {
        switch (this.A00) {
            case 0:
                ((05G) this.A01).Epw(new AnonymousClass9IK(new C53499GpV("showReportCommentBottomSheet_request_error")));
                return;
            case 2:
                C52031GCd.A08((AnonymousClass3W1) this.A03, (C52031GCd) this.A02, "report_button", (String) null);
                return;
            default:
                return;
        }
    }

    public final void Do0(String str, String str2, String str3) {
        if (2 - this.A00 == 0) {
            C52031GCd.A08((AnonymousClass3W1) this.A03, (C52031GCd) this.A02, "report_button", str);
        }
    }

    public final void Do1(String str) {
        AnonymousClass3WA r1;
        switch (this.A00) {
            case 0:
                MediaCommentListRepository mediaCommentListRepository = ((I47) this.A03).A01;
                C61084JwM jwM = (C61084JwM) this.A02;
                mediaCommentListRepository.A0P((Set) jwM.A01, (Set) jwM.A02);
                if (1Wj.A00 != null) {
                    ((05G) this.A01).Epw(new C376589Io("2533754420104857", 2));
                    return;
                }
                return;
            case 1:
                if ("ig_false_news".equals(str)) {
                    r1 = AnonymousClass3WA.ORGANIC_REPORT_FALSE_NEWS;
                } else {
                    r1 = AnonymousClass3WA.ORGANIC_REPORT;
                }
                ((C59555JOb) this.A02).DJA(r1);
                return;
            default:
                C52031GCd gCd = (C52031GCd) this.A02;
                C52031GCd.A08((AnonymousClass3W1) this.A03, gCd, "report_button", C56460Hys.A00(gCd.A07, str, AnonymousClass7TF.A1W(this.A01, C16666Uz2.REPORT_AD_BUTTON)));
                return;
        }
    }
}
