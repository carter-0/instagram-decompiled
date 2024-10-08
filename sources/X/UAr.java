package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class UAr extends C249403jg {
    public final C15678Ugj A00;

    public UAr(C15678Ugj ugj) {
        this.A00 = ugj;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C15678Ugj ugj;
        Integer num;
        LinearLayoutManager linearLayoutManager;
        int A1a;
        int A1b;
        Object obj;
        int A0D = AnonymousClass7TG.A0D(recyclerView, 627008314);
        super.onScrolled(recyclerView, i, i2);
        if (i2 > 0) {
            ugj = this.A00;
            num = AnonymousClass05K.A01;
        } else {
            if (i2 < 0) {
                ugj = this.A00;
                num = AnonymousClass05K.A00;
            }
            AnonymousClass0fD.A0A(-2086262674, A0D);
        }
        ugj.A01 = num;
        Integer num2 = ugj.A00;
        if (num2 == AnonymousClass05K.A00 || num2 == AnonymousClass05K.A01) {
            C252553pI r5 = recyclerView.A0D;
            if ((r5 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) r5) != null && (A1a = linearLayoutManager.A1a()) <= (A1b = linearLayoutManager.A1b())) {
                while (true) {
                    View A0X = linearLayoutManager.A0X(A1a);
                    if (A0X != null) {
                        obj = A0X.getTag();
                    } else {
                        obj = null;
                    }
                    if (obj instanceof UDV) {
                        A0X.getTop();
                    }
                    if (A1a == A1b) {
                        break;
                    }
                    A1a++;
                }
            }
        }
        AnonymousClass0fD.A0A(-2086262674, A0D);
    }
}
