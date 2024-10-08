package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.PHo  reason: case insensitive filesystem */
public final class C72734PHo implements MVB {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C56058Hs7 A02;
    public final /* synthetic */ 1pX A03;
    public final /* synthetic */ String A04;

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C72734PHo(Fragment fragment, UserSession userSession, C56058Hs7 hs7, 1pX r4, String str) {
        this.A02 = hs7;
        this.A04 = str;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A03 = r4;
    }

    public final void onButtonClick(View view) {
        this.A02.A02("upsell_snackbar", this.A04, "comment_custom_filter", "contextual_upsell_tap");
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("dictionary_manager_entrypoint", "upsell");
        Fragment fragment = this.A00;
        DbT.A1M(fragment, DbV.A0Y(fragment.getActivity(), A0a, this.A01, ModalActivity.class, C273654mx.A00(47)));
    }

    public final void onDismiss() {
        this.A03.A00 = null;
    }
}
