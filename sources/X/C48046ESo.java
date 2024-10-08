package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.ESo  reason: case insensitive filesystem */
public final class C48046ESo extends C2806552w {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48046ESo(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, int i) {
        super(Integer.valueOf(i));
        this.A01 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = fragmentActivity;
    }

    public final void onClick(View view) {
        UserSession userSession = this.A01;
        Bundle A012 = C46447Df9.A02().A01(userSession, C46474Dfc.A01(userSession, this.A02, "direct_thread_ugc_ai", this.A03));
        DbU.A0w(this.A00, A012, userSession, ModalActivity.class, "profile");
    }
}
