package X;

import android.view.View;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.ProductTag;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.308  reason: invalid class name */
public final class AnonymousClass308 extends C235412zs {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public final void ATF(AnonymousClass30Y r10, C252093oY r11) {
        View view;
        ArrayList A3G;
        0qQ.A0B(r10, 0);
        0qQ.A0B(r11, 1);
        Object obj = r10.A03;
        0qQ.A06(obj);
        AnonymousClass59J A02 = A02((1Xj) obj);
        if (r11.CEk(r10) != AnonymousClass05K.A0C && (view = (View) this.A00.get(obj)) != null) {
            View findViewById = view.findViewById(R.id.indicator_text_view);
            if (findViewById instanceof TextView) {
                A02.A0A = ((TextView) findViewById).getText().toString();
                1Xj r3 = A02.A0K;
                UserSession userSession = this.A01;
                A02.A08 = Long.valueOf((long) C243193Xt.A01(this.A00, userSession, r3).ordinal());
                if (r3.A1e(userSession).CcK()) {
                    A3G = AnonymousClass595.A02(r3);
                } else {
                    A3G = r3.A3G();
                }
                if (A3G != null) {
                    HashMap hashMap = new HashMap();
                    int size = A3G.size();
                    for (int i = 0; i < size; i++) {
                        0bb r2 = new 0bb();
                        ProductDetailsProductItemDict productDetailsProductItemDict = C14502TxO.A00(((ProductTag) A3G.get(i)).A02).A01;
                        String str = productDetailsProductItemDict.A0V;
                        if (str == null) {
                            str = productDetailsProductItemDict.A0T;
                        }
                        r2.A06("current_price", str);
                        r2.A06(DevServerEntity.COLUMN_DESCRIPTION, C14502TxO.A00(((ProductTag) A3G.get(i)).A02).A0E);
                        r2.A06("full_price", C14502TxO.A00(((ProductTag) A3G.get(i)).A02).A0G);
                        boolean z = true;
                        if (((ProductTag) A3G.get(i)).A00 != 1) {
                            z = false;
                        }
                        r2.A03("is_hidden", Boolean.valueOf(z));
                        r2.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, C14502TxO.A00(((ProductTag) A3G.get(i)).A02).A0J);
                        r2.A06("product_id", C14502TxO.A00(((ProductTag) A3G.get(i)).A02).A0H);
                        hashMap.put(Long.valueOf((long) i), r2);
                    }
                    A02.A0H = hashMap;
                }
            }
        }
    }

    public AnonymousClass308(AnonymousClass0iw r1, UserSession userSession, Map map) {
        super(map);
        this.A01 = userSession;
        this.A00 = r1;
    }
}
