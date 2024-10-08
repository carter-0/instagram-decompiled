package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import java.util.ArrayList;

/* renamed from: X.4Wp  reason: invalid class name and case insensitive filesystem */
public final class C265864Wp implements C265854Wo {
    public View A00;
    public IgLinearLayout A01;
    public IgTextView A02;
    public C249693kD A03;
    public C272024jy A04;
    public C265834Wm A05;
    public C309426Yf A06;
    public String A07;
    public String A08;
    public final C252063oV A09;
    public final C265874Wq A0A = new C265874Wq(this);
    public final ArrayList A0B = new ArrayList();

    public final void Ext(UserSession userSession, Runnable runnable) {
        Integer A042;
        0qQ.A0B(userSession, 0);
        if (this.A03 != null) {
            int[] A043 = C297825sP.A04(userSession, A00(), true);
            ArrayList arrayList = this.A0B;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C56010HrI hrI = (C56010HrI) 00k.A0O(arrayList, i);
                if (!(hrI == null || (A042 = 03t.A04(A043, i)) == null)) {
                    hrI.A00(A042.intValue(), runnable);
                }
            }
        }
    }

    public final C272024jy A00() {
        C272024jy r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("pollModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01() {
        this.A09.setVisibility(8);
    }

    public C265864Wp(C252063oV r2) {
        this.A09 = r2;
    }
}
