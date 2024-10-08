package X;

import android.content.DialogInterface;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.F9e  reason: case insensitive filesystem */
public abstract class C49839F9e {
    public static boolean A00;

    public static final void A00(DialogInterface.OnClickListener onClickListener, AnonymousClass4DH r12, AnonymousClass0aP r13, ImageUrl imageUrl, C46634DiE diE, String str, String str2, String str3, String str4) {
        AnonymousClass4DH r3 = r12;
        0qQ.A0B(r12, 1);
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        AnonymousClass7TG.A0w(2, str5, str6, str7);
        if (!A00) {
            A00 = true;
            C358248ab A0U = DbW.A0U(r12);
            0qQ.A0A(imageUrl);
            A0U.A0n(imageUrl, r12);
            A0U.A05 = DbV.A0z(r12, str6, 2131976401);
            A0U.A08(2131976398);
            String A0z = DbV.A0z(r12, str6, 2131976399);
            0qQ.A07(A0z);
            A0U.A0c(new C50008FIt(r3, diE, r13, str7, str5, str6, str4, 0), A0z);
            A0U.A0a(onClickListener, DbU.A0m(r12, 2131976400));
            A0U.A0f(new C50027FJm(0));
            DbT.A1V(A0U);
        }
    }

    public static final void A01(AnonymousClass4DH r9, AnonymousClass0aP r10, C50263FVu fVu, RegFlowExtras regFlowExtras, C46634DiE diE) {
        String str;
        String str2;
        String str3;
        C47325Dus dus = fVu.A00;
        if (dus != null && (str = dus.A01) != null && str.length() != 0 && !C253833rU.A02(dus.A00) && (str2 = dus.A02) != null && str2.length() != 0 && (str3 = dus.A03) != null && str3.length() != 0) {
            regFlowExtras.A0k = true;
            0qQ.A0A(str2);
            String str4 = dus.A03;
            0qQ.A0A(str4);
            String str5 = dus.A01;
            0qQ.A0A(str5);
            ImageUrl imageUrl = dus.A00;
            A00(C50020FJf.A00(regFlowExtras, 60), r9, r10, imageUrl, diE, str2, str4, str5, regFlowExtras.A0A);
        }
    }
}
