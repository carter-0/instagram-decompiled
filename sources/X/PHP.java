package X;

import android.content.Context;
import android.widget.TextView;

public final class PHP implements C367608rH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public PHP(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    public final void onClick() {
        boolean z;
        C52971GgO ggO;
        switch (this.A00) {
            case 0:
                ggO = (C52971GgO) this.A02;
                z = false;
                break;
            case 1:
                ggO = (C52971GgO) this.A02;
                z = true;
                break;
            default:
                C336867fJ r1 = (C336867fJ) this.A02;
                2WX r0 = C336867fJ.A0F;
                C70857OOm.A01((Context) this.A01, r1.A03, C69319NjK.COMMENT_CREATOR_SEARCH, this.A03, new C58142In8(r1.A02, 27));
                return;
        }
        AnonymousClass7TF.A1O(ggO.A09.A07, z);
        ((TextView) this.A01).setText(this.A03);
    }
}
