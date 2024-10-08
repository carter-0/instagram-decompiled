package X;

import android.os.Handler;
import android.view.ViewGroup;
import com.facebook.secure.securewebview.SecureWebView;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.SQo  reason: case insensitive filesystem */
public final class C11377SQo {
    public long A00;
    public ViewGroup A01;
    public boolean A02;
    public final Handler A03 = AnonymousClass7TF.A0D();
    public final AnonymousClass0JR A04 = new Object();
    public final Map A05 = AnonymousClass7TE.A1E();
    public final Set A06 = AnonymousClass7TE.A1F();
    public final UserSession A07;
    public final List A08;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.0JR] */
    public C11377SQo(UserSession userSession, List list) {
        0qQ.A0B(userSession, 1);
        this.A07 = userSession;
        this.A08 = list;
    }

    public static final synchronized void A01(C11377SQo sQo, String str) {
        synchronized (sQo) {
            C17331VRk vRk = (C17331VRk) sQo.A05.get(str);
            if (vRk != null) {
                vRk.A00 = AnonymousClass05K.A01;
            }
        }
    }

    public static final SecureWebView A00(C11377SQo sQo, String str) {
        ViewGroup viewGroup = sQo.A01;
        if (viewGroup == null) {
            return null;
        }
        SecureWebView secureWebView = new SecureWebView(viewGroup.getContext().getApplicationContext());
        secureWebView.setWebViewClient(new Q90(sQo, str));
        SAG.A01(secureWebView, sQo.A07, sQo.A08);
        secureWebView.setTag(-1309867116, str);
        viewGroup.addView(secureWebView);
        return secureWebView;
    }

    public static final boolean A02(C11377SQo sQo, String str) {
        ViewGroup viewGroup = sQo.A01;
        if (viewGroup != null) {
            Collection A0C = C229632nm.A0C(0, viewGroup.getChildCount());
            if (!(A0C instanceof Collection) || !A0C.isEmpty()) {
                0sh it = A0C.iterator();
                while (it.hasNext()) {
                    Object tag = viewGroup.getChildAt(it.A00()).getTag(-1309867116);
                    DbS.A1Y(tag);
                    if (0qQ.A0K(tag, str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
