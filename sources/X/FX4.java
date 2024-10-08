package X;

import com.instagram.ui.widget.progressbutton.ProgressButton;

public final class FX4 implements 1wn {
    public final /* synthetic */ C47448E2u A00;

    public FX4(C47448E2u e2u) {
        this.A00 = e2u;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1497918525);
        int A032 = AnonymousClass0fD.A03(1774063858);
        C47448E2u e2u = this.A00;
        Dbb.A0y(e2u);
        e2u.A02.setText(((C50255FVm) obj).A00);
        ProgressButton progressButton = e2u.A0F;
        if (progressButton != null && progressButton.isEnabled()) {
            e2u.A0F.performClick();
        }
        AnonymousClass0fD.A0A(798680621, A032);
        AnonymousClass0fD.A0A(1495039326, A03);
    }
}
