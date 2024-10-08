package X;

import android.content.Context;
import android.view.View;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

public final class UsS extends C2806552w {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsS(N3M n3m, C20900X3r x3r, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A01 = x3r;
        this.A02 = n3m;
    }

    public final void onClick(View view) {
        View view2 = view;
        switch (this.A00) {
            case 0:
                ((C20900X3r) this.A01).CtN((N3M) this.A02);
                return;
            case 1:
                0qQ.A0B(view2, 0);
                SimpleWebViewActivity.A02.A02((Context) this.A01, DbT.A0X(((C15390Ubt) this.A02).A0K), new SimpleWebViewConfig(AnonymousClass000.A00(3253), (String) null, view2.getResources().getString(2131969832), (String) null, false, false, false, false, false, true, false, true, false, false, false, false));
                return;
            case 2:
                0qQ.A0B(view2, 0);
                C15390Ubt ubt = (C15390Ubt) this.A02;
                W35 w35 = ubt.A03;
                if (w35 == null) {
                    DbS.A12();
                    throw AnonymousClass00P.createAndThrow();
                }
                W35.A05(W35.A00(w35, "onboarding_guidelines_clicked"), w35);
                String A0d = AnonymousClass7TF.A0d(view2.getResources(), 2131964219);
                C49906FEe fEe = SimpleWebViewActivity.A02;
                Context context = (Context) this.A01;
                0qQ.A0A(context);
                fEe.A02(context, DbT.A0X(ubt.A0K), new SimpleWebViewConfig("https://help.instagram.com/1627591223954487", (String) null, A0d, (String) null, false, false, false, false, false, true, false, true, false, false, false, false));
                return;
            default:
                ((C17499VYc) this.A02).A03.A00((C16263UrQ) this.A01);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsS(Context context, C15390Ubt ubt, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        if (1 - i2 != 0) {
            this.A02 = ubt;
            this.A01 = context;
        } else {
            this.A01 = context;
            this.A02 = ubt;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsS(C17499VYc vYc, C16263UrQ urQ, int i) {
        super(Integer.valueOf(i));
        this.A00 = 3;
        this.A02 = vYc;
        this.A01 = urQ;
    }
}
