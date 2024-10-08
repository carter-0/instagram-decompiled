package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Gzn  reason: case insensitive filesystem */
public final class C54118Gzn extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AddKeywordFragment";
    public final String A00 = "add_keyword_fragment";
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;

    public final String getModuleName() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public C54118Gzn() {
        0eO r2 = 0eO.A02;
        this.A02 = C51804G2n.A01(this, "creator_ai_creator_igid", r2, 3);
        this.A01 = C51804G2n.A01(this, "creator_ai_creator_fbid", r2, 4);
        C58706IwF A012 = C58706IwF.A01(this, 34);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r2, C58706IwF.A01(C58706IwF.A01(this, 31), 32));
        this.A05 = DbS.A0I(C58706IwF.A01(A002, 33), A012, new C58689Ivy(46, A002, (Object) null), DbS.A0z(C54184H2e.class));
        this.A03 = DbS.A0I(C58706IwF.A01(this, 30), C58706IwF.A01(this, 29), new C58689Ivy(45, this, (Object) null), DbS.A0z(C54186H2g.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1396517991);
        C54118Gzn.super.onCreate(bundle);
        ((C54184H2e) this.A05.getValue()).A00();
        AnonymousClass0fD.A09(1976030459, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(272468411);
        ComposeView A002 = GTX.A00(this, AnonymousClass5PI.A04(new C59110J6s(this, 1), 896246224, true));
        AnonymousClass0fD.A09(1815521976, A022);
        return A002;
    }
}
