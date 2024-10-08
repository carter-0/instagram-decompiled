package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import com.facebookpay.common.models.ErrorDialogContent;

/* renamed from: X.SRm  reason: case insensitive filesystem */
public abstract class C11394SRm {
    public static final void A01(Context context, C62320sa r17, int i, int i2) {
        C62320sa r3 = r17;
        0qQ.A0B(r3, 3);
        SIG A0H = AnonymousClass2E0.A0H();
        Context context2 = context;
        Drawable A04 = AnonymousClass2E0.A0A().A04(context2);
        String A16 = AnonymousClass7TE.A16(context2, i);
        SIG.A00(context2, new C11351SOk((DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null, SVE.A00(r3, 14), A04, AnonymousClass7TE.A16(context2, i2), (String) null, AnonymousClass7TE.A16(context2, 2131961301), A16, 0, 0, 0, 0, 2, 0, 0, true), A0H);
    }

    public static final void A00(Context context, C8911RFe rFe, Throwable th, C62320sa r17, 0sP r18) {
        SR4 sr4;
        String str;
        String str2;
        Throwable th2 = th;
        0sP r1 = r18;
        Context context2 = context;
        AnonymousClass7TF.A1C(context, 0, r1);
        if (th2 instanceof C8286QnS) {
            sr4 = SPz.A00((C8286QnS) th2);
        } else {
            sr4 = new SR4(new ErrorDialogContent(rFe, (C8911RFe) null, (C10576RuV) null, (C10576RuV) null, 2131961290, 2131961289, (Integer) null, (Integer) null, (String) null, (String) null));
        }
        ErrorDialogContent errorDialogContent = (ErrorDialogContent) sr4.A03();
        if (errorDialogContent != null) {
            SIG A0H = AnonymousClass2E0.A0H();
            Drawable A04 = AnonymousClass2E0.A0A().A04(context);
            String A05 = errorDialogContent.A05(context);
            String A02 = errorDialogContent.A02(context);
            String A03 = errorDialogContent.A03(context);
            C8937RGf A00 = errorDialogContent.A00();
            boolean A06 = errorDialogContent.A06();
            C10576RuV ruV = errorDialogContent.A00;
            if (ruV != null) {
                str = ruV.A02;
            } else {
                str = null;
            }
            String A042 = errorDialogContent.A04(context);
            C8937RGf A01 = errorDialogContent.A01();
            C10576RuV ruV2 = errorDialogContent.A01;
            if (ruV2 != null) {
                str2 = ruV2.A02;
            } else {
                str2 = null;
            }
            SIG.A00(context2, SA0.A01(A04, A00, A01, new TPV(r1), new TPX(r17), A05, A02, A03, str, A042, str2, A06), A0H);
        }
    }

    public static final void A02(Context context, C62320sa r12, C62320sa r13) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        SVE A00;
        int i6;
        boolean A1Y = C51970G9q.A1Y(r13);
        182.A06(0Tu.A05, C11431STx.A00(), 36314498245986961L);
        SIG A0H = AnonymousClass2E0.A0H();
        if (182.A06(0Tu.A06, C11431STx.A00(), 36314498245986961L)) {
            i = 2131961358;
            i2 = 2131961355;
            i3 = 2131961356;
            i4 = 2131961357;
            i5 = 2131961170;
            A00 = SVE.A00(r12, 15);
            i6 = 16;
        } else {
            i = 2131961321;
            i2 = 2131961304;
            i3 = 2131961308;
            i4 = 2131961303;
            i5 = 2131961170;
            A00 = SVE.A00(r12, 17);
            i6 = 18;
        }
        SIG.A00(context, SA0.A00(A00, SVE.A00(r13, i6), i, i2, i3, i4, i5, A1Y ? 1 : 0), A0H);
    }

    public static final void A03(Context context, C62320sa r11, C62320sa r12) {
        boolean A1Y = C51970G9q.A1Y(r12);
        SIG.A00(context, SA0.A00(SVE.A00(r11, 19), SVE.A00(r12, 20), 2131961358, 2131961384, 2131961356, 2131961357, 2131961170, A1Y ? 1 : 0), AnonymousClass2E0.A0H());
    }

    public static final void A04(Context context, C62320sa r11, boolean z) {
        SIG A0H = AnonymousClass2E0.A0H();
        int i = 0;
        if (z) {
            i = 2;
        }
        SIG.A00(context, SA0.A00(SVE.A00(r11, 13), SVB.A00, 2131961307, 2131961306, 2131961305, 2131961309, 2131961172, i), A0H);
    }
}
