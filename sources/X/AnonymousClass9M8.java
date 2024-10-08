package X;

import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9M8  reason: invalid class name */
public final class AnonymousClass9M8 extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9M8(int i, int i2, Object obj, Object obj2) {
        super(0);
        this.A00 = i2;
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AnonymousClass7UL r2 = (AnonymousClass7UL) this.A02;
                AnonymousClass7UL.A01(r2, this.A01, ((AnonymousClass7UM) this.A03).A00);
                AnonymousClass7UL.A00(r2);
                return C60340gF.A00;
            case 1:
                return new C277224uh((2V5) this.A03, (0sP) this.A02, this.A01);
            case 2:
                return new C243763a3((2Wa) this.A03, (0sP) this.A02, this.A01);
            case 3:
                TreeJNI treeJNI = TreeJNI.$redex_init_class;
                ImmutableList optionalTreeListByHashCode = ((TreeJNI) this.A03).getOptionalTreeListByHashCode(this.A01, (Class) this.A02);
                if (optionalTreeListByHashCode == null) {
                    return 0sn.A00;
                }
                return optionalTreeListByHashCode;
            case 4:
                TreeJNI treeJNI2 = TreeJNI.$redex_init_class;
                TreeJNI treeValueByHashCode = ((TreeJNI) this.A03).getTreeValueByHashCode(this.A01, (Class) this.A02);
                0qQ.A0A(treeValueByHashCode);
                return treeValueByHashCode;
            case 5:
                TreeJNI treeJNI3 = TreeJNI.$redex_init_class;
                return ((TreeJNI) this.A03).getOptionalTreeListByHashCode(this.A01, (Class) this.A02);
            case 6:
                TreeJNI treeJNI4 = TreeJNI.$redex_init_class;
                return ((TreeJNI) this.A03).getTreeValueByHashCode(this.A01, (Class) this.A02);
            default:
                return ((11S) this.A03).A06((CharSequence) this.A02, this.A01);
        }
    }
}
