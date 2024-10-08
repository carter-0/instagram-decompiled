package X;

import android.view.View;

public final class IVQ implements MVB {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 0sP A01;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public IVQ(0sP r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void onButtonClick(View view) {
        this.A01.invoke(Long.valueOf(this.A00));
    }
}
