package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.GzY  reason: case insensitive filesystem */
public final class C54103GzY extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "BarcelonaIgFragment";
    public final String A00 = C273654mx.A00(2873);
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;

    public final String getModuleName() {
        return DbS.A0t(this.A04);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public C54103GzY() {
        0eO r2 = 0eO.A02;
        this.A02 = AnonymousClass0eN.A00(r2, new C58707IwG((Object) this, 35));
        this.A01 = AnonymousClass0eN.A00(r2, new C58707IwG((Object) this, 34));
        this.A06 = AnonymousClass0eN.A00(r2, new C58707IwG((Object) this, 38));
        this.A03 = AnonymousClass0eN.A00(r2, new C58707IwG((Object) this, 36));
        this.A04 = AnonymousClass0eN.A00(r2, new C58707IwG((Object) this, 37));
        this.A05 = C227642jf.A02(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-902283021);
        0qQ.A0B(layoutInflater, 0);
        Context context = layoutInflater.getContext();
        0qQ.A07(context);
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0);
        composeView.setContent(AnonymousClass5PI.A03(new C59111J6t(this, 30), -1274811315));
        AnonymousClass0fD.A09(413896972, A022);
        return composeView;
    }
}
