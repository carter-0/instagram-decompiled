package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Ct  reason: invalid class name and case insensitive filesystem */
public final class C282355Ct implements 2Ag {
    public Handler A00;
    public final Context A01;
    public final UserSession A02;

    public C282355Ct(Context context, UserSession userSession) {
        this.A01 = context.getApplicationContext();
        this.A02 = userSession;
    }

    public final void D0Y(1OS r1) {
    }

    public final void D9f(1OS r1, String str, boolean z) {
    }

    public final /* synthetic */ void D9g(1OS r1, boolean z) {
    }

    public final void DB7(1OS r1) {
    }

    public final void DTK(0xF r1, 1OS r2, boolean z) {
    }

    public final void DTL(0xF r1, 1OS r2, C270214gN r3, boolean z) {
    }

    public final /* synthetic */ void DYZ(String str, String str2, String str3) {
    }

    public final /* synthetic */ void DYd(1OS r1, String str, String str2) {
    }

    public final void Dfi(1OS r1, String str, boolean z) {
    }

    private void A00(1OS r8) {
        String str;
        String str2;
        Runnable runnable;
        String str3;
        DirectPendingLayeredXma directPendingLayeredXma;
        String A022 = r8.A02();
        boolean z = true;
        switch (A022.hashCode()) {
            case -1698180071:
                if (A022.equals("send_link_message")) {
                    1cX r82 = (1cX) r8;
                    List C6L = r82.C6L();
                    if (C6L.size() != 1) {
                        z = false;
                    }
                    17k.A0E(z);
                    str2 = ((DirectThreadKey) C6L.get(0)).A00;
                    str = r82.A04;
                    break;
                } else {
                    return;
                }
            case -62852893:
                if (A022.equals(AnonymousClass000.A00(3953))) {
                    List C6L2 = ((1bp) r8).C6L();
                    if (C6L2.size() != 1) {
                        z = false;
                    }
                    17k.A0E(z);
                    str2 = ((DirectThreadKey) C6L2.get(0)).A00;
                    str = "toast";
                    break;
                } else {
                    return;
                }
            case 1174963788:
                if (A022.equals("send_text_message")) {
                    1cE r83 = (1cE) r8;
                    List C6L3 = r83.C6L();
                    if (C6L3.size() != 1) {
                        z = false;
                    }
                    17k.A0E(z);
                    str2 = ((DirectThreadKey) C6L3.get(0)).A00;
                    str = r83.A0F;
                    if (str == null) {
                        str = NetInfoModule.CONNECTION_TYPE_NONE;
                        break;
                    }
                } else {
                    return;
                }
                break;
            case 2046682813:
                if (A022.equals(AnonymousClass000.A00(1796)) && (r8 instanceof C65621em) && (directPendingLayeredXma = ((C65621em) r8).A00) != null && directPendingLayeredXma.A06) {
                    String string = this.A01.getString(2131973117);
                    Handler handler = this.A00;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        this.A00 = handler;
                    }
                    handler.post(new C51357Fsp(this, string));
                    return;
                }
                return;
            default:
                return;
        }
        if (str == null) {
            0wb.A04("DirectSendTextToVisualMessageMutationObserver_nullPostAction", "postAction null.", 1);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -155349541) {
            if (hashCode != 3387192) {
                if (hashCode == 110532135 && str.equals("toast")) {
                    c = 0;
                }
            } else if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                c = 2;
            }
        } else if (str.equals("snackbar_individual_message")) {
            c = 1;
        }
        if (c == 0) {
            0qQ.A0B(str2, 0);
            AnonymousClass3U9 A0N = 1bJ.A00(this.A02).A0N(str2);
            if (A0N == null) {
                str3 = "thread null for SHOW_IN_APP_NOTIFICATION_CONFIRMATION";
            } else {
                ArrayList A012 = AnonymousClass48M.A01(A0N.BRZ());
                DirectShareTarget directShareTarget = new DirectShareTarget(C66662MaV.A00(A0N.C6C(), A012), A0N.C6f(), A012, true);
                Context context = this.A01;
                String str4 = directShareTarget.A0I;
                if (str4 == null) {
                    str4 = "";
                }
                String string2 = context.getString(2131960309, new Object[]{str4});
                Handler handler2 = this.A00;
                if (handler2 == null) {
                    handler2 = new Handler(Looper.getMainLooper());
                    this.A00 = handler2;
                }
                runnable = new C51357Fsp(this, string2);
                r3.post(runnable);
                return;
            }
        } else if (c == 1) {
            UserSession userSession = this.A02;
            0qQ.A0B(str2, 0);
            AnonymousClass3U9 A0N2 = 1bJ.A00(userSession).A0N(str2);
            if (A0N2 == null) {
                str3 = "thread null for SHOW_IN_APP_NOTIFICATION_CONFIRMATION when using AfterPostAction.SNACKBAR_INDIVIDUAL_MESSAGE";
            } else {
                List BRZ = A0N2.BRZ();
                BRZ.remove(AnonymousClass0t1.A01.A01(userSession));
                if (BRZ.size() == 1) {
                    User user = (User) BRZ.get(0);
                    String fullName = user.getFullName();
                    if (fullName == null) {
                        fullName = user.getUsername();
                    }
                    ImageUrl Bh3 = user.Bh3();
                    Handler handler3 = this.A00;
                    if (handler3 == null) {
                        handler3 = new Handler(Looper.getMainLooper());
                        this.A00 = handler3;
                    }
                    runnable = new C51503FvB(Bh3, A0N2, this, fullName);
                    handler3.post(runnable);
                    return;
                }
                return;
            }
        } else {
            return;
        }
        0wb.A04("DirectSendTextToVisualMessageMutationObserver_nullThreadSummary", str3, 1);
    }

    public final void D5W(1OS r1) {
        A00(r1);
    }

    public final void DTP(0xF r1, 1OS r2) {
        A00(r2);
    }
}
