package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.ESt  reason: case insensitive filesystem */
public final class C48050ESt extends C2806552w {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48050ESt(FragmentActivity fragmentActivity, UserSession userSession, C49470EwB ewB, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A03 = ewB;
        this.A02 = userSession;
        this.A01 = fragmentActivity;
    }

    public final void onClick(View view) {
        SUL sul;
        switch (this.A00) {
            case 0:
                C49906FEe fEe = SimpleWebViewActivity.A02;
                Context context = (Context) this.A01;
                0qQ.A0A(context);
                C49906FEe.A01(context, ((AnonymousClass9QZ) this.A03).A04, fEe, new C11225SFz(AnonymousClass000.A00(16)), ((Resources) this.A02).getString(2131964884));
                return;
            case 1:
                ExS exS = (ExS) this.A02;
                Dbb.A0k((Context) this.A01, (UserSession) this.A03, 2EG.A1V, exS.A01);
                exS.A02.invoke();
                return;
            case 2:
                sul = Dba.A0J((Context) this.A01, (UserSession) this.A03, 2EG.A1m, ((N49) this.A02).A01);
                break;
            case 3:
                ((C49470EwB) this.A03).A00.onActionClicked();
                Bundle A0B = DbY.A0B("origin", "MESSAGING_LED");
                DbU.A0w((Activity) this.A01, A0B, (0lg) this.A02, ModalActivity.class, C273654mx.A00(281));
                return;
            case 4:
                sul = Dba.A0J((Context) this.A01, (UserSession) this.A03, 2EG.A1U, ((C47257Dtl) ((C51862G4v) this.A02)).A02);
                break;
            case 5:
                ((TextView) this.A03).setHighlightColor(((Context) this.A02).getColor(R.color.fds_transparent));
                E55 e55 = (E55) this.A01;
                C47883ELd eLd = new C47883ELd();
                Bundle A0a = AnonymousClass7TE.A0a();
                DbW.A0w(A0a, e55.A00);
                eLd.setArguments(A0a);
                AnonymousClass37D A022 = AnonymousClass37D.A00.A02(e55.getContext());
                A022.getClass();
                A022.A0I(eLd);
                return;
            default:
                super.onClick(view);
                return;
        }
        sul.A0A();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48050ESt(Context context, TextView textView, ELZ elz, Integer num) {
        super(num);
        this.A00 = 5;
        this.A01 = elz;
        this.A03 = textView;
        this.A02 = context;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48050ESt(Context context, N49 n49, UserSession userSession, int i) {
        super(Integer.valueOf(i));
        this.A00 = 2;
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = n49;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48050ESt(Context context, UserSession userSession, C51862G4v g4v, int i) {
        super(Integer.valueOf(i));
        this.A00 = 4;
        this.A03 = userSession;
        this.A01 = context;
        this.A02 = g4v;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48050ESt(Context context, Resources resources, AnonymousClass9QZ r4, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A01 = context;
        this.A03 = r4;
        this.A02 = resources;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48050ESt(Context context, UserSession userSession, ExS exS, int i) {
        super(Integer.valueOf(i));
        this.A00 = 1;
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = exS;
    }
}
