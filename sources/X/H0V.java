package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;

public final class H0V extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AvoidedTopicsFragment";
    public C62320sa A00;
    public final AnonymousClass0eM A01 = C58702IwB.A00(this, 38);
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;
    public final String A05 = "avoided_topics_fragment";

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131953553);
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public H0V() {
        0eO r2 = 0eO.A02;
        this.A02 = C51975G9x.A0r(this, "creator_ai_creator_fbid", r2, 39);
        C58702IwB A012 = C58702IwB.A01(this, 43);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r2, C58702IwB.A01(C58702IwB.A01(this, 40), 41));
        this.A04 = DbS.A0I(C58702IwB.A01(A002, 42), A012, new C58689Ivy(31, A002, (Object) null), DbS.A0z(C52983Gga.class));
        this.A00 = C58702IwB.A01(this, 44);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1201814005);
        H0V.super.onCreate(bundle);
        AnonymousClass0fD.A09(-283169544, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(26779938);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 40), 1433518345);
        AnonymousClass0fD.A09(1553819151, A022);
        return A0H;
    }

    public final void onResume() {
        Object value;
        C54617HLa hLa;
        List list;
        int A022 = AnonymousClass0fD.A02(-1557897729);
        super.onResume();
        C52983Gga gga = (C52983Gga) this.A04.getValue();
        if (((List) ((C59721JVf) gga.A02.getValue()).A01).isEmpty()) {
            05G r5 = gga.A01;
            do {
                value = r5.getValue();
                hLa = C54617HLa.LOADING;
                list = (List) ((C59721JVf) value).A01;
                AnonymousClass7TG.A1N(list, hLa);
            } while (!r5.AIY(value, new C59721JVf(hLa, list, 46)));
        }
        C58102ImO.A02(gga, C318116oQ.A00(gga), 35);
        AnonymousClass0fD.A09(1854488772, A022);
    }
}
