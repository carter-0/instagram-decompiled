package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Gzs  reason: case insensitive filesystem */
public final class C54123Gzs extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "CreatorAIDeletionConfirmationBottomSheetFragment";
    public H0G A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06;
    public final String A07 = "creator_ai_deletion_confirmation_fragment";

    public final String getModuleName() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public C54123Gzs() {
        0eO r2 = 0eO.A02;
        this.A03 = C51975G9x.A0r(this, "creator_ai_entry_point_extra", r2, 48);
        this.A02 = C51975G9x.A0r(this, "creator_ai_creator_igid", r2, 49);
        this.A04 = AnonymousClass1YB.A00(C58706IwF.A01(this, 7));
        C58706IwF A012 = C58706IwF.A01(this, 11);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r2, C58706IwF.A01(C58706IwF.A01(this, 8), 9));
        this.A06 = DbS.A0I(C58706IwF.A01(A002, 10), A012, new C58689Ivy(37, A002, (Object) null), DbS.A0z(C53030GhL.class));
        this.A01 = AnonymousClass1YB.A00(C58706IwF.A01(this, 4));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1918005708);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 47), -1158913817);
        AnonymousClass0fD.A09(1605453837, A022);
        return A0H;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1140546686);
        super.onResume();
        ((C53030GhL) this.A06.getValue()).A00(DbX.A07(this.A04));
        AnonymousClass0fD.A09(-1692179493, A022);
    }
}
