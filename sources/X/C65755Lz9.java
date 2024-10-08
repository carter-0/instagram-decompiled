package X;

import android.app.Activity;
import com.instagram.android.R;

/* renamed from: X.Lz9  reason: case insensitive filesystem */
public final class C65755Lz9 implements C262944Gp {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65755Lz9(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final /* synthetic */ void D4N() {
    }

    public final void D9d() {
        if (this.A00 == 0) {
            C307896Rx r3 = (C307896Rx) this.A01;
            DbX.A1O(r3, new C308276Tl(), (C277014uI) this.A02, r3.A03);
        }
    }

    public final /* synthetic */ void DHB(Integer num) {
        if (this.A00 != 0) {
            Activity activity = (Activity) this.A02;
            2db.A02(activity, AnonymousClass7TF.A03(activity, R.attr.statusBarBackgroundColor));
            2db.A06(activity, true);
        }
    }

    public final /* synthetic */ void DYG(int i, int i2) {
        if (this.A00 != 0) {
            Activity activity = (Activity) this.A02;
            2db.A02(activity, 0);
            2db.A06(activity, false);
        }
    }

    public final /* synthetic */ void Cv6(float f) {
    }

    public final /* synthetic */ void D4O(Integer num) {
    }

    public final /* synthetic */ void Dx6(C61065Jw3 jw3) {
    }

    public final /* synthetic */ void Cv7(Integer num, float f) {
    }
}
