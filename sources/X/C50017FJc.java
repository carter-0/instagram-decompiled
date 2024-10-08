package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.FJc  reason: case insensitive filesystem */
public final class C50017FJc implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C50017FJc(C319616qu r1, FH4 fh4, int i, boolean z) {
        this.A00 = i;
        this.A01 = fh4;
        if (3 - i != 0) {
            this.A03 = z;
            this.A02 = r1;
        } else {
            this.A02 = r1;
            this.A03 = z;
        }
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [X.R9j, X.11X] */
    /* JADX WARNING: type inference failed for: r8v0, types: [X.Cv2, java.lang.Object] */
    public final void onClick(DialogInterface dialogInterface, int i) {
        C74349PtP ptP;
        Integer num;
        switch (this.A00) {
            case 0:
                LPT.A02((UserSession) this.A02, this.A03, true);
                DbS.A1U(this.A01);
                return;
            case 1:
                boolean z = this.A03;
                H13 h13 = (H13) this.A02;
                if (z) {
                    H13.A03(h13, (DirectThreadThemeInfo) this.A01);
                    return;
                } else {
                    H13.A02(h13);
                    return;
                }
            case 2:
                IllegalArgumentException A0w = AnonymousClass7TE.A0w(002.A0c(C66579MXk.A00(622), " is not supported", i));
                if (i == 0) {
                    if (!((C74516PwB) this.A02).CUG()) {
                        ptP = (C74349PtP) this.A01;
                        num = AnonymousClass05K.A00;
                    } else if (!this.A03) {
                        ptP = (C74349PtP) this.A01;
                        num = AnonymousClass05K.A01;
                    }
                    ptP.DVV(num);
                    return;
                } else if (i != 1 || this.A03) {
                    throw A0w;
                }
                ptP = (C74349PtP) this.A01;
                num = AnonymousClass05K.A0C;
                ptP.DVV(num);
                return;
            case 3:
                FH4 fh4 = (FH4) this.A01;
                UserSession userSession = fh4.A04;
                0qQ.A0B(userSession, 0);
                C319616qu.A01(userSession, "logout_password_saving_logout_clicked", "logout_spi", "logout", "logout_interaction");
                fh4.A0D(EVP.SINGLE, this.A03);
                return;
            case 4:
                FH4 fh42 = (FH4) this.A01;
                UserSession userSession2 = fh42.A04;
                FCF.A01(fh42.A03, userSession2, "logout_d2_cancel_tapped");
                if (this.A03) {
                    0qQ.A0B(userSession2, 0);
                    C319616qu.A01(userSession2, "logout_password_saving_multiaccount_cancel_clicked", "logout_spi", "logout", "logout_interaction");
                    return;
                }
                return;
            case 5:
                1ES.A03(new C8782R9j((ESF) this.A01, (PR9) this.A02, this.A03, true));
                dialogInterface.dismiss();
                return;
            case 6:
                ESF esf = (ESF) this.A01;
                PR9 pr9 = (PR9) this.A02;
                boolean z2 = !this.A03;
                pr9.A0D = z2;
                int i2 = pr9.A04;
                if (i2 == esf.A05.A04) {
                    esf.A01.A1E(z2);
                    ESF.A06(esf);
                }
                if (i2 == esf.A03.A04) {
                    esf.A01.A1f(z2);
                }
                if (i2 == esf.A04.A04) {
                    0xY A0p = AnonymousClass7TE.A0p(esf.A01);
                    A0p.E5T(Pxd.A00(97), z2);
                    A0p.apply();
                }
                dialogInterface.dismiss();
                esf.getAdapter().notifyDataSetChanged();
                return;
            case 7:
                if (this.A03) {
                    Dbb.A0k((Context) this.A01, (UserSession) this.A02, 2EG.A0V, "https://help.instagram.com/contact/735502576838983");
                    return;
                }
                C49845F9k.A00((FragmentActivity) this.A01, (UserSession) this.A02, "https://help.instagram.com/contact/735502576838983");
                return;
            case 8:
                boolean z3 = this.A03;
                WWM wwm = (WWM) this.A02;
                C19476WaO waO = (C19476WaO) this.A01;
                if (z3) {
                    UserSession userSession3 = wwm.A02;
                    AnonymousClass2fH A002 = AnonymousClass2fH.A00(userSession3);
                    String str = waO.A00.A06;
                    if (str != null) {
                        Boolean A0u = AnonymousClass7TE.A0u();
                        ? obj = new Object();
                        obj.A01 = str;
                        obj.A02 = null;
                        obj.A00 = A0u;
                        A002.A0D(str, obj);
                        Activity activity = wwm.A00;
                        AnonymousClass07i r1 = wwm.A01;
                        1OC A003 = C17033VFh.A00(userSession3, obj);
                        A003.A00 = new C15599UfR(4, A002, wwm, waO, obj);
                        1ES.A00(activity, r1, A003);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                UserSession userSession4 = wwm.A02;
                String str2 = waO.A00.A06;
                if (str2 != null) {
                    1NY A0N = DbU.A0N(userSession4);
                    A0N.A0A(StringFormatUtil.formatStrLocaleSafe("media/%s/delete_story_countdown/", str2));
                    1OC A0N2 = DbY.A0N(A0N, 1XP.class, 1XY.class);
                    A0N2.A00 = new C15619Ufl(15, waO, wwm);
                    1ES.A03(A0N2);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            default:
                C19200WPg wPg = (C19200WPg) this.A02;
                DialogInterface.OnDismissListener onDismissListener = wPg.A00;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                VFY.A00((C17589Vah) this.A01, "cancel", "dialog", (String) null, this.A03);
                C49089EpE.A00(wPg.A07).A00();
                return;
        }
    }

    public C50017FJc(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
