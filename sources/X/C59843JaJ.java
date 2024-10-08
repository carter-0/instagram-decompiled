package X;

import com.instagram.modal.ModalActivity;

/* renamed from: X.JaJ  reason: case insensitive filesystem */
public final class C59843JaJ implements AnonymousClass06Q {
    public final /* synthetic */ 0hq A00;
    public final /* synthetic */ ModalActivity A01;

    public C59843JaJ(0hq r1, ModalActivity modalActivity) {
        this.A01 = modalActivity;
        this.A00 = r1;
    }

    public final void onBackStackChanged() {
        0hq r1 = this.A00;
        if (r1.A0M() <= 0) {
            r1.A0F.remove(this);
            this.A01.finish();
        }
    }
}
