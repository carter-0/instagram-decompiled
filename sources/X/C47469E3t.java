package X;

import android.os.Bundle;

/* renamed from: X.E3t  reason: case insensitive filesystem */
public abstract class C47469E3t extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DataDownloadBaseFragment";
    public AnonymousClass0wW A00;

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        0hq parentFragmentManager;
        if (this instanceof C48008EQr) {
            C48008EQr eQr = (C48008EQr) this;
            0nA.A0N(eQr.A02);
            parentFragmentManager = eQr.getParentFragmentManager();
        } else if (this instanceof C48007EQq) {
            0hq r1 = this.mFragmentManager;
            if (r1 == null || r1.A0M() <= 0 || r1.A0G) {
                DbX.A1J(this);
                return true;
            }
            r1.A19((String) null, 1);
            return true;
        } else {
            parentFragmentManager = getParentFragmentManager();
        }
        parentFragmentManager.A13();
        return true;
    }

    public void configureActionBar(2da r4) {
        DbW.A1B(r4, 2131963004);
        DbX.A1A(new FP9((Object) this, 69), DbV.A0K(), r4);
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1449483412);
        C47469E3t.super.onCreate(bundle);
        this.A00 = DbX.A0T(this);
        Dbc.A0p(this);
        AnonymousClass0fD.A09(1114717213, A02);
    }
}
