package X;

import android.os.Bundle;
import android.view.View;
import java.util.Collection;

/* renamed from: X.NKk  reason: case insensitive filesystem */
public final class C68491NKk extends MYR implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ThreadCapabilityOverrideFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final String getModuleName() {
        return "direct_dev_thread_capability_override_fragment";
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, X.NKk, java.lang.Object, X.MYR] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r3 = this.A01;
        Dba.A15(this, C226292g8.A00(19B.A00, ((C67736Mtp) r3.getValue()).A02), new C73933PmD(this, 22), 55);
        ((C67736Mtp) r3.getValue()).A00();
    }

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new NO7(this));
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(C74098Pp1.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public C68491NKk() {
        C73907Pli pli = new C73907Pli(this, 28);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73907Pli(new C73907Pli(this, 25), 26));
        this.A01 = DbS.A0I(new C73907Pli(A002, 27), pli, new C73667Phg(40, (Object) null, A002), DbS.A0z(C67736Mtp.class));
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131971274);
    }
}
