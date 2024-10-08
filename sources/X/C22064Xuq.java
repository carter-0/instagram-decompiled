package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Xuq  reason: case insensitive filesystem */
public final class C22064Xuq implements Y8w {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C22064Xuq(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void CNv(Object obj) {
        switch (this.A00) {
            case 4:
                C22553YAc yAc = (C22553YAc) obj;
                yAc.DXn((C21281XSl) this.A02, (C21490Xch) this.A01);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C22553YAc yAc2 = (C22553YAc) obj;
                yAc2.DxK((C21459XbP) this.A02, (C21490Xch) this.A01);
                return;
            default:
                return;
        }
    }
}
