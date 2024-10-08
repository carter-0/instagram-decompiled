package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.NJr  reason: case insensitive filesystem */
public final class C68474NJr extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DeviceListFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, java.lang.Object, X.NJr] */
    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        C73568Pfp.A02(r3, this, DbW.A0E(this), 16);
        r3.Eu4(true);
    }

    public final String getModuleName() {
        return "direct_thread_one_one_one_device_list";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public C68474NJr() {
        C73655PhU phU = new C73655PhU(this, 32);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73655PhU(new C73655PhU(this, 29), 30));
        this.A01 = DbS.A0I(new C73655PhU(A002, 31), phU, new C73665Phe(11, A002, (Object) null), DbS.A0z(C67751Mu4.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1132976840);
        ComposeView A0H = DbV.A0H(this, new C59110J6s(this, 33), -346555090);
        AnonymousClass0fD.A09(-952793644, A02);
        return A0H;
    }
}
