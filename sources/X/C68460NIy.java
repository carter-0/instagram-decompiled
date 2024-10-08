package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.NIy  reason: case insensitive filesystem */
public final class C68460NIy extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiStudioRecipientPickerFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;
    public final String A02 = "direct_ai_recipient_picker";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public C68460NIy() {
        C67570Mq4 mq4 = new C67570Mq4(this, 39);
        AnonymousClass0eM A002 = C67570Mq4.A00(new C67570Mq4(this, 36), 0eO.A02, 37);
        this.A01 = DbS.A0I(new C67570Mq4(A002, 38), mq4, C73915Plq.A00(A002, (Object) null, 37), DbS.A0z(C67725Mte.class));
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131960125);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(494458407);
        C68460NIy.super.onCreate(bundle);
        2YL A0H = DbS.A0H(this.A01);
        C73565Pfm.A02(A0H, C318116oQ.A00(A0H), 3);
        AnonymousClass0fD.A09(-81813344, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1046958726);
        ComposeView A0H = DbV.A0H(this, new C59110J6s(this, 24), 2006931643);
        AnonymousClass0fD.A09(-1830610916, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1279761163);
        super.onDestroy();
        AnonymousClass0fD.A09(-2131198887, A022);
    }
}
