package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;

/* renamed from: X.Ngx  reason: case insensitive filesystem */
public final class C69199Ngx extends C2806552w {
    public final int A00 = 2;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69199Ngx(NOH noh, int i) {
        super(Integer.valueOf(i));
        this.A01 = noh;
    }

    public final void onClick(View view) {
        FragmentActivity fragmentActivity;
        UserSession userSession;
        2EG r1;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                NKF nkf = (NKF) this.A01;
                fragmentActivity = nkf.requireContext();
                userSession = nkf.getSession();
                r1 = 2EG.A1x;
                str = "https://help.instagram.com/700284123459336";
                break;
            case 1:
                C72343P2i p2i = (C72343P2i) this.A01;
                fragmentActivity = p2i.A00;
                userSession = p2i.A01;
                r1 = 2EG.A1V;
                str = "https://help.instagram.com/5980581705291018";
                break;
            case 2:
                ((NOH) this.A01).A00.DNh();
                return;
            case 3:
                C16235Uqy uqy = ((C18497Vss) this.A01).A03;
                C18782W1i w1i = uqy.A01;
                User user = uqy.A03.BTa().Bft().A0B;
                FragmentActivity fragmentActivity2 = w1i.A05;
                UserSession userSession2 = w1i.A08;
                if (user != null) {
                    str2 = user.A03.getUsername();
                } else {
                    str2 = null;
                }
                String moduleName = w1i.A09.getModuleName();
                String str3 = w1i.A0J;
                Bundle bundle = new Bundle();
                bundle.putString("merchant_username", str2);
                bundle.putString("prior_module_name", moduleName);
                bundle.putString(AnonymousClass000.A00(741), "attribute_section");
                bundle.putString(AnonymousClass000.A00(55), str3);
                DbU.A0w(fragmentActivity2, bundle, userSession2, ModalActivity.class, "checkout_awareness");
                return;
            default:
                C249713kF r4 = C249713kF.A00;
                C71440Okf okf = (C71440Okf) this.A01;
                LSN lsn = (LSN) okf.A01;
                r4.A0c(lsn.A0I, lsn.A0K, ((AnonymousClass0iw) okf.A02).getModuleName(), false);
                return;
        }
        Dbb.A0k(fragmentActivity, userSession, r1, str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69199Ngx(C71440Okf okf, Integer num) {
        super(num);
        this.A01 = okf;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69199Ngx(NVV nvv, int i) {
        super(Integer.valueOf(i));
        this.A01 = nvv;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69199Ngx(C18497Vss vss, int i) {
        super(Integer.valueOf(i));
        this.A01 = vss;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69199Ngx(C72343P2i p2i, int i) {
        super(Integer.valueOf(i));
        this.A01 = p2i;
    }
}
