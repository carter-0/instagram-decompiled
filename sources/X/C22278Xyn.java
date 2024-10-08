package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Xyn  reason: case insensitive filesystem */
public final class C22278Xyn implements X2w {
    public final X2w[] A00;
    public final XZC A01;
    public volatile Object[] A02;

    public final Object get(Object obj) {
        boolean z;
        int i;
        Object[] objArr = this.A02;
        Object[] objArr2 = new Object[2];
        objArr2[0] = this.A00[0].get(obj);
        if (objArr != null) {
            Object obj2 = objArr2[0];
            Object obj3 = objArr[0];
            if (obj2 != null ? obj2.equals(obj3) : obj2 == obj3) {
                return objArr[1];
            }
        }
        switch (((C22282Xyr) this.A01.A00).A00) {
            case 0:
            case 8:
                z = true;
                break;
            case 2:
            case 3:
                i = 0;
                break;
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = "";
                break;
            default:
                z = false;
                break;
        }
        i = Boolean.valueOf(z);
        objArr2[1] = i;
        this.A02 = objArr2;
        return i;
    }

    public C22278Xyn(XZC xzc, X2w[] x2wArr) {
        this.A00 = x2wArr;
        this.A01 = xzc;
    }
}
