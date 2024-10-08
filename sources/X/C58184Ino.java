package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.Ino  reason: case insensitive filesystem */
public final class C58184Ino extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58184Ino(Object obj, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return AnonymousClass7TF.A0G((View) this.A02, this.A01);
            case 1:
                C57466IbA.A00((C57466IbA) this.A02, this.A01);
                break;
            case 4:
                ((ReboundViewPager) this.A02).A0L(this.A01, 0.0f);
                break;
            default:
                C276014sL r0 = (C276014sL) 00k.A0O(((C53452Gok) this.A02).A06.A08, this.A01);
                if (r0 != null) {
                    return r0.A00;
                }
                return null;
        }
        return C60340gF.A00;
    }
}
