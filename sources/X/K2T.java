package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class K2T extends K80 {
    public static final C63050Kqf A01 = new Object();
    public static final String __redex_internal_original_name = "GreenscreenSceneTabFragment";
    public final AnonymousClass0eM A00;

    public final String getModuleName() {
        return "GREEN_SCREEN_SCENE_TAB_FRAGMENT";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Map A19 = JTO.A19(((C60174Jgt) this.A00.getValue()).A03);
        ArrayList A0f = JTQ.A0f(A19);
        Iterator A0u = AnonymousClass7TF.A0u(A19);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            int hashCode = A1J.hashCode();
            A0f.add(new C64785Li1((C262364Dk) A1J.getValue(), DbT.A13(A1J), hashCode));
        }
        A0B(A0f);
    }

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new KFT(new C63588Kzb(this), DbX.A07(this.A01)));
    }

    public K2T() {
        MMI mmi = new MMI(this, 31);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMI(new MMI(this, 28), 29));
        this.A00 = DbS.A0I(new MMI(A002, 30), mmi, new MMZ(34, (Object) null, (Object) A002), DbS.A0z(C60174Jgt.class));
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(1119983081);
        super.onResume();
        C60174Jgt jgt = (C60174Jgt) this.A00.getValue();
        Iterator A0u = AnonymousClass7TF.A0u(JTO.A18(jgt.A02));
        while (A0u.hasNext()) {
            ((Drawable) C51971G9r.A0p(A0u)).setVisible(true, false);
        }
        Iterator A0u2 = AnonymousClass7TF.A0u(JTO.A18(jgt.A01));
        while (A0u2.hasNext()) {
            ((Drawable) C51971G9r.A0p(A0u2)).setVisible(true, false);
        }
        AnonymousClass0fD.A09(-1258751402, A02);
    }

    public final void onStop() {
        int A02 = AnonymousClass0fD.A02(-1009349980);
        K2T.super.onStop();
        C60174Jgt jgt = (C60174Jgt) this.A00.getValue();
        Iterator A0u = AnonymousClass7TF.A0u(JTO.A18(jgt.A02));
        while (A0u.hasNext()) {
            ((Drawable) C51971G9r.A0p(A0u)).setVisible(false, false);
        }
        Iterator A0u2 = AnonymousClass7TF.A0u(JTO.A18(jgt.A01));
        while (A0u2.hasNext()) {
            ((Drawable) C51971G9r.A0p(A0u2)).setVisible(false, false);
        }
        AnonymousClass0fD.A09(-375130474, A02);
    }
}
