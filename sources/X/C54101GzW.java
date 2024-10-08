package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.GzW  reason: case insensitive filesystem */
public final class C54101GzW extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FriendMapPagerBottomSheetFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C73905Plg(this, 47));
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public C54101GzW() {
        C73898PlZ plZ = new C73898PlZ(this, 2);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73898PlZ(new C73905Plg(this, 49), 0));
        this.A04 = DbS.A0I(new C73898PlZ(A002, 1), plZ, new C58185Inp(22, (Object) null, A002), DbS.A0z(HBM.class));
        this.A00 = AnonymousClass1YB.A00(new C73905Plg(this, 42));
        this.A02 = AnonymousClass1YB.A00(new C73905Plg(this, 48));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-610182232);
        ComposeView A0H = DbV.A0H(this, new C59341JFt(this, 25), -1485420948);
        AnonymousClass0fD.A09(-1447008322, A022);
        return A0H;
    }
}
