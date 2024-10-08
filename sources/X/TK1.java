package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class TK1 implements Runnable {
    public final /* synthetic */ C13904TjR A00;
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public TK1(C13904TjR tjR, IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule, String str, String str2) {
        this.A01 = igReactPurchaseExperienceBridgeModule;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = tjR;
    }

    public final void run() {
        FragmentActivity A002 = Pxe.A0T(this.A01).A00();
        A002.getClass();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putInt("STYLE_RES", 2132017771);
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putSerializable("viewmodel_class", C8270QnC.class);
        C11249SHj sHj = new C11249SHj();
        sHj.A01(this.A03);
        Pxi.A0y(A0a2, sHj);
        A0a2.putString(IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY, this.A02);
        Fragment fragment = new Fragment();
        fragment.setArguments(A0a2);
        C8608Qxp qxp = new C8608Qxp();
        qxp.setArguments(A0a);
        0hq supportFragmentManager = A002.getSupportFragmentManager();
        AnonymousClass7TG.A1N(supportFragmentManager, fragment);
        qxp.A06 = fragment;
        qxp.A0B(supportFragmentManager, (String) null);
        fragment.A00 = new C12499SvV(qxp, this);
    }
}
