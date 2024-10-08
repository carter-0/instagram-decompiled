package X;

import android.os.Bundle;
import android.view.View;

public final class HC1 extends H1Q {
    public static final String __redex_internal_original_name = "MediaKitMediaPickerFragment";
    public final X41 A00 = IRQ.A00;
    public final AnonymousClass0eM A01;
    public final C15812Uiv[] A02 = {new C14386TvF(C14411Tvf.ONE_BY_ONE)};

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, java.lang.Object, X.H1Q, X.HC1, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C14227TsA tsA = this.A00;
        if (tsA != null) {
            tsA.A07 = this.A02;
            C14074TpO A012 = A01();
            A012.A05(view, false);
            C3251871j r0 = A012.A05;
            if (r0 != null) {
                r0.A05 = true;
            }
            A012.A06(new ISY(this, 1));
            A04(true);
            Object value = this.A01.getValue();
            AnonymousClass7TE.A1Z(new MH3(this, value, (AnonymousClass4D7) null, 14), DbW.A0E(this));
            return;
        }
        0qQ.A0F("gridAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public HC1() {
        MMD mmd = new MMD(this, 25);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMD(new MMD(this, 26), 27));
        this.A01 = DbS.A0I(new MMD(A002, 28), mmd, new MMW(15, (Object) null, A002), DbS.A0z(C47912EMg.class));
    }
}
