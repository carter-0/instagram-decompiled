package X;

import android.content.DialogInterface;

/* renamed from: X.Oen  reason: case insensitive filesystem */
public final class C71173Oen implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;

    public C71173Oen(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 2:
                ((C70506O9f) this.A01).A00.A0H.A03(new C72906POq(false));
                return;
            case 3:
                ((C74429Puj) this.A01).D0f();
                return;
            default:
                ((C74419PuZ) this.A01).D0U();
                return;
        }
    }
}
