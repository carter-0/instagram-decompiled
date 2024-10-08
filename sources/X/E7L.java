package X;

import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import java.util.concurrent.CancellationException;

public final class E7L extends MYR implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ChannelXpostingSelectionFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C46570DhC(this, 29));
    public final AnonymousClass0eM A02 = DbS.A0I(new C46570DhC(this, 28), new C46570DhC(this, 30), new C73915Plq(24, this, (Object) null), DbS.A0z(C60189Jh8.class));
    public final C49330Etl A03 = new C49330Etl(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.E7L, java.lang.Object, X.MYR] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r3 = this.A02;
        Dba.A15(this, ((C60189Jh8) r3.getValue()).A02, new C74184PqQ(this, 26), 43);
        C60189Jh8 jh8 = (C60189Jh8) r3.getValue();
        String A0t = DbS.A0t(this.A01);
        0qQ.A0B(A0t, 0);
        05G r2 = jh8.A05;
        if (r2.getValue() != C62486Kgb.SUCCESS) {
            r2.Epw(C62486Kgb.INITIAL_LOAD);
            C262204Co r0 = jh8.A01;
            if (r0 != null) {
                r0.AG7((CancellationException) null);
            }
            C318136oS A002 = C318116oQ.A00(jh8);
            jh8.A01 = 1Eo.A04(19B.A00, new MFW(jh8, A0t, (AnonymousClass4D7) null, 23), A002);
        }
    }

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new C15769UiE(this, this.A03));
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(G3I.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131958957);
    }
}
