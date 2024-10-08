package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.EmS  reason: case insensitive filesystem */
public abstract class C48928EmS {
    public static void A00(Context context, DialogInterface.OnClickListener onClickListener, UserSession userSession, C51873G5k g5k, Integer num) {
        String text;
        String text2;
        String BFd;
        if (context != null) {
            C358248ab A0Y = DbS.A0Y(context);
            int intValue = num.intValue();
            if (intValue == 3) {
                G9Q A05 = DE2.A05();
                if (A05.C7i() == null || C296675qS.A03(A05.C7i().getText())) {
                    throw DbZ.A0a();
                }
                text = A05.C7i().getText();
            } else if (intValue != 4) {
                G9R A06 = DE2.A06();
                if (A06.C7j() == null || C296675qS.A03(A06.C7j().getText())) {
                    throw DbZ.A0a();
                }
                text = A06.C7j().getText();
            } else {
                G9O A03 = DE2.A03();
                if (A03.C7h() == null || C296675qS.A03(A03.C7h().getText())) {
                    throw DbZ.A0a();
                }
                text = A03.C7h().getText();
            }
            A0Y.A05 = text;
            if (intValue == 3) {
                G9Q A052 = DE2.A05();
                if (A052.AgZ() == null || C296675qS.A03(A052.AgZ().getText())) {
                    throw DbZ.A0a();
                }
                text2 = A052.AgZ().getText();
            } else if (intValue != 4) {
                G9R A062 = DE2.A06();
                if (A062.Aga() == null || C296675qS.A03(A062.Aga().getText())) {
                    throw DbZ.A0a();
                }
                text2 = A062.Aga().getText();
            } else {
                G9O A032 = DE2.A03();
                if (A032.AgX() == null || C296675qS.A03(A032.AgX().getText())) {
                    throw DbZ.A0a();
                }
                text2 = A032.AgX().getText();
            }
            A0Y.A0q(text2);
            if (intValue != 3) {
                G9V A01 = DE2.A01();
                if (intValue != 4) {
                    if (!C296675qS.A03(A01.BlX())) {
                        BFd = A01.BlX();
                    } else {
                        throw DbZ.A0a();
                    }
                } else if (A01.BVN() != null) {
                    BFd = A01.BVN();
                } else {
                    throw DbZ.A0a();
                }
            } else {
                G9V A012 = DE2.A01();
                if (A012.BFd() != null) {
                    BFd = A012.BFd();
                } else {
                    throw DbZ.A0a();
                }
            }
            A0Y.A0Y(new C50026FJl(23, (Object) g5k, (Object) userSession, (Object) num), C358278ae.BLUE_BOLD, BFd, true);
            G9V A013 = DE2.A01();
            if (!C296675qS.A03(A013.BlW())) {
                A0Y.A0b(C50025FJk.A00(num, userSession, 25), A013.BlW());
                if (context instanceof C249453jo) {
                    G9V A014 = DE2.A01();
                    if (A014.BlY() != null) {
                        A0Y.A0a(onClickListener, A014.BlY());
                    } else {
                        throw DbZ.A0a();
                    }
                }
                Dialog A02 = A0Y.A02();
                FGS.A02(F5v.A00(num), userSession, "reminder_shown");
                if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01) {
                    0xY A0N = AnonymousClass7TF.A0N(userSession);
                    A0N.E5T("fxim_has_seen_reminder_dialog_on_photo_change", true);
                    A0N.apply();
                }
                if (num == AnonymousClass05K.A0Y) {
                    0xY A0N2 = AnonymousClass7TF.A0N(userSession);
                    A0N2.E5T("fxim_has_seen_reminder_dialog_on_name_update", true);
                    A0N2.apply();
                }
                AnonymousClass0fN.A00(A02);
                return;
            }
            throw DbZ.A0a();
        }
    }
}
