package X;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ERs  reason: case insensitive filesystem */
public final class C48029ERs extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AppearanceThemeOptionsFragment";
    public final List A00 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final String A02 = "theme_settings";

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131957387);
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(636374232);
        super.onCreate(bundle);
        List list = this.A00;
        list.add(FAR.A04);
        list.add(FAR.A06);
        list.add(FAR.A05);
        AnonymousClass0fD.A09(1181591263, A022);
    }

    public final void onResume() {
        FAR far;
        C70953OTa oTa;
        int A022 = AnonymousClass0fD.A02(-1369524570);
        super.onResume();
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        List<FAR> list = this.A00;
        for (FAR far2 : list) {
            Integer num = far2.A03;
            String str = far2.A00;
            int i = far2.A01;
            if (num != null) {
                oTa = new C70953OTa(str, getString(i), getString(num.intValue()));
            } else {
                oTa = new C70953OTa(str, getString(i));
            }
            A1C2.add(oTa);
        }
        int A002 = DbS.A0e().A00();
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                far = (FAR) it.next();
                if (far.A02 == A002) {
                    break;
                }
            } else {
                Context context = getContext();
                0qQ.A0A(context);
                if (AnonymousClass3HA.A00(context)) {
                    far = FAR.A04;
                } else {
                    far = FAR.A06;
                }
            }
        }
        DbU.A1F(new FQU(this, 4), far.A00, A1C, A1C2);
        setItems(A1C);
        AnonymousClass0fD.A09(1050388200, A022);
    }
}
