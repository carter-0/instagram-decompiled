package X;

import android.content.Context;
import android.view.View;
import com.facebook.litho.ComponentHost;

/* renamed from: X.IIx  reason: case insensitive filesystem */
public final class C56953IIx implements C253183qL {
    public static final C56953IIx A00 = new Object();

    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        ComponentHost componentHost = (View) obj;
        C61083JwL jwL = (C61083JwL) obj2;
        AnonymousClass7TF.A1B(componentHost, 1, jwL);
        0lg r3 = (0lg) jwL.A01;
        if (!182.A06(C51965G9l.A0Z(r3, 0), r3, 36319239888509993L)) {
            return null;
        }
        C54310H7f h7f = new C54310H7f(jwL, 9);
        if (componentHost instanceof ComponentHost) {
            ComponentHost componentHost2 = componentHost;
            componentHost2.A0J = true;
            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(componentHost);
            A0m.A04 = h7f;
            A0m.A0A = true;
            A0m.A08 = false;
            A0m.A07 = false;
            A0m.A02 = 0.99f;
            A0m.A01 = 0.005d;
            A0m.A00 = 0.005d;
            A0m.A09 = true;
            AnonymousClass3NM A002 = A0m.A00();
            componentHost2.A0J = false;
            return A002;
        }
        AnonymousClass3NG A0m2 = AnonymousClass7TE.A0m(componentHost);
        A0m2.A04 = h7f;
        A0m2.A0A = true;
        A0m2.A08 = false;
        A0m2.A07 = false;
        A0m2.A02 = 0.99f;
        A0m2.A01 = 0.005d;
        A0m2.A00 = 0.005d;
        A0m2.A09 = true;
        return A0m2.A00();
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ComponentHost componentHost = (View) obj;
        AnonymousClass3NM r7 = (AnonymousClass3NM) obj4;
        0qQ.A0B(componentHost, 1);
        if (componentHost instanceof ComponentHost) {
            ComponentHost componentHost2 = componentHost;
            componentHost2.A0J = true;
            if (r7 != null) {
                r7.A03();
            }
            componentHost2.A0J = false;
        } else if (r7 != null) {
            r7.A03();
        }
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
