package X;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: X.ESn  reason: case insensitive filesystem */
public final class C48045ESn extends C2806552w {
    public final /* synthetic */ DialogInterface.OnClickListener A00;
    public final /* synthetic */ C358248ab A01;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        this.A00.onClick(this.A01.A0P, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48045ESn(DialogInterface.OnClickListener onClickListener, C358248ab r3, int i) {
        super(Integer.valueOf(i));
        this.A00 = onClickListener;
        this.A01 = r3;
    }
}
