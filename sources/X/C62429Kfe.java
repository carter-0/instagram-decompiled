package X;

import android.content.DialogInterface;
import com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel;

/* renamed from: X.Kfe  reason: case insensitive filesystem */
public final class C62429Kfe extends C51086FoG {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C62429Kfe(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void Cyb(boolean z) {
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface dialogInterface;
        C255773uh r0;
        1Xj r1;
        switch (this.A00) {
            case 2:
                JTU.A1J(C60340gF.A00, (1IX) this.A01);
                return;
            case 4:
                onDismissListener = (DialogInterface.OnDismissListener) this.A01;
                dialogInterface = null;
                break;
            case 5:
                onDismissListener = (DialogInterface.OnDismissListener) this.A02;
                dialogInterface = C19201WPh.A0X;
                break;
            case 7:
                if (z) {
                    C51031FnN fnN = (C51031FnN) this.A02;
                    C14631Tzd tzd = (C14631Tzd) this.A01;
                    C247733gp r2 = tzd.A02;
                    if (r2 != null && (r0 = tzd.A0K) != null && (r1 = r0.A0b) != null) {
                        JZW.A04(r1, r2.A0G);
                        fnN.A07.Cs2(tzd);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
        onDismissListener.onDismiss(dialogInterface);
    }

    public final void De7() {
        switch (this.A00) {
            case 3:
                C59689JTv.A0D(DbT.A0E(this.A01), AnonymousClass000.A00(764));
                return;
            case 6:
                IgLiveOptionsDialogViewModel A002 = LRB.A00(this.A02);
                MGU.A02(A002, C318116oQ.A00(A002), 16);
                return;
            default:
                return;
        }
    }

    public final void Do1(String str) {
        AnonymousClass3WA r1;
        Object obj;
        AnonymousClass3WA r12;
        C59555JOb jOb;
        AnonymousClass3WA r0;
        M0V m0v;
        switch (this.A00) {
            case 0:
                if (str != null) {
                    C307896Rx r3 = (C307896Rx) this.A01;
                    DbX.A1O(r3, new C308276Tl(), (C277014uI) this.A02, r3.A03);
                    return;
                }
                return;
            case 1:
                C308206Td.A0E((C307896Rx) this.A01, (C277014uI) this.A02, new Object[0]);
                return;
            case 3:
                if ("ig_spam_v3".equals(str)) {
                    r12 = AnonymousClass3WA.ORGANIC_REPORT_SPAM;
                } else if ("ig_false_news".equals(str)) {
                    r12 = AnonymousClass3WA.ORGANIC_REPORT_FALSE_NEWS;
                } else {
                    r12 = AnonymousClass3WA.ORGANIC_REPORT;
                }
                obj = this.A02;
                break;
            case 4:
                if ("ig_false_news".equals(str)) {
                    jOb = (C59555JOb) this.A02;
                    r0 = AnonymousClass3WA.ORGANIC_REPORT_FALSE_NEWS;
                } else {
                    boolean equals = "ig_spam_v3".equals(str);
                    jOb = (C59555JOb) this.A02;
                    if (equals) {
                        r0 = AnonymousClass3WA.ORGANIC_REPORT_SPAM;
                    } else {
                        r0 = AnonymousClass3WA.ORGANIC_REPORT;
                    }
                }
                jOb.DJA(r0);
                return;
            case 5:
                if ("ig_false_news".equals(str)) {
                    r1 = AnonymousClass3WA.ORGANIC_REPORT_FALSE_NEWS;
                } else {
                    r1 = AnonymousClass3WA.ORGANIC_REPORT;
                }
                obj = this.A01;
                break;
            case 6:
                IgLiveOptionsDialogViewModel A002 = LRB.A00(this.A02);
                MVW mvw = (MVW) this.A01;
                if ((mvw instanceof M0V) && (m0v = (M0V) mvw) != null) {
                    String pk = m0v.getPk();
                    if (pk != null) {
                        DbX.A1V(A002.A03.A00, pk, true);
                    }
                    m0v.A07 = C252883pr.Deleted;
                    m0v.A0E = true;
                    C66169MGg.A01(m0v, A002, C318116oQ.A00(A002), 27);
                    return;
                }
                return;
            default:
                return;
        }
        ((C59555JOb) obj).DJA(r1);
    }
}
