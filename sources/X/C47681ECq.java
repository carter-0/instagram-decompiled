package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.nux.cal.model.ConnectContent;
import java.util.HashMap;

/* renamed from: X.ECq  reason: case insensitive filesystem */
public final class C47681ECq extends 1P0 {
    public final /* synthetic */ E59 A00;

    public C47681ECq(E59 e59) {
        this.A00 = e59;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-73495242);
        C47681ECq.super.onFail(r4);
        E59 e59 = this.A00;
        e59.A0D = true;
        e59.A03 = null;
        E59.A03(e59);
        AnonymousClass0fD.A0A(-1259406401, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(562536679);
        C47681ECq.super.onFinish();
        this.A00.A0E = false;
        AnonymousClass0fD.A0A(1289497317, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1551456905);
        C47681ECq.super.onStart();
        this.A00.A0E = true;
        AnonymousClass0fD.A0A(-1385974922, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = AnonymousClass0fD.A03(1985533374);
        ConnectContent connectContent = (ConnectContent) obj;
        int A032 = AnonymousClass0fD.A03(1712231303);
        C47681ECq.super.onSuccess(connectContent);
        E59 e59 = this.A00;
        e59.A0D = true;
        e59.A03 = connectContent;
        if (!E59.A05(connectContent)) {
            UserSession A002 = E59.A00(e59);
            A002.getClass();
            String obj2 = EVV.IG_SAC_SIGN_UP.toString();
            ConnectContent connectContent2 = e59.A03;
            HashMap A1E = AnonymousClass7TE.A1E();
            if (connectContent2 == null) {
                str = "content";
            } else {
                if (connectContent2.A09 == null) {
                    A1E.put(DialogModule.KEY_TITLE, "null");
                }
                if (connectContent2.A05 == null) {
                    A1E.put(Pxd.A00(38), "null");
                }
                if (connectContent2.A06 == null) {
                    A1E.put(C66579MXk.A00(388), "null");
                }
                if (connectContent2.A03 == null) {
                    str = "target_accounts";
                }
                FG9.A02(A002, obj2, A1E.toString());
            }
            A1E.put(str, "null");
            FG9.A02(A002, obj2, A1E.toString());
        }
        E59.A03(e59);
        AnonymousClass0fD.A0A(1537463763, A032);
        AnonymousClass0fD.A0A(-440996921, A03);
    }
}
