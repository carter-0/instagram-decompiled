package X;

import android.view.View;
import com.facebook.pando.TreeJNI;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9Lj  reason: invalid class name and case insensitive filesystem */
public final class C377319Lj extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377319Lj(Object obj, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        List<Object> list;
        switch (this.A00) {
            case 0:
                C250773m2 r1 = ((C2603045c) this.A02).A0C;
                if (r1 != null) {
                    r1.onNetworkInterfaceChanged(this.A01);
                    break;
                }
                break;
            case 1:
                C246903fQ r3 = (C246903fQ) this.A02;
                r3.A01.A0A.A0W.invoke(Integer.valueOf(this.A01), r3.A02);
                break;
            case 2:
                2aD r32 = 2aD.A0I;
                int i = this.A01;
                List singletonList = Collections.singletonList(new 2aX(r32, (List) null, i, i));
                0qQ.A07(singletonList);
                return 2aV.A00(singletonList, C294245m8.A00);
            case 3:
                int i2 = this.A01;
                TreeJNI treeJNI = TreeJNI.$redex_init_class;
                return Float.valueOf((float) ((TreeJNI) this.A02).getDoubleValueByHashCode(i2));
            case 4:
            case 9:
                int i3 = this.A01;
                TreeJNI treeJNI2 = TreeJNI.$redex_init_class;
                String stringValueByHashCode = ((TreeJNI) this.A02).getStringValueByHashCode(i3);
                if (stringValueByHashCode != null) {
                    return new SimpleImageUrl(stringValueByHashCode);
                }
                return null;
            case 5:
            case 11:
                int i4 = this.A01;
                TreeJNI treeJNI3 = TreeJNI.$redex_init_class;
                return ((TreeJNI) this.A02).getOptionalTimeValueByHashCode(i4);
            case 6:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                int i5 = this.A01;
                TreeJNI treeJNI4 = TreeJNI.$redex_init_class;
                return ((TreeJNI) this.A02).getStringValueByHashCode(i5);
            case 7:
                int i6 = this.A01;
                TreeJNI treeJNI5 = TreeJNI.$redex_init_class;
                return ((TreeJNI) this.A02).getOptionalDoubleListByHashCode(i6);
            case 8:
                int i7 = this.A01;
                TreeJNI treeJNI6 = TreeJNI.$redex_init_class;
                Double optionalDoubleValueByHashCode = ((TreeJNI) this.A02).getOptionalDoubleValueByHashCode(i7);
                if (optionalDoubleValueByHashCode != null) {
                    return Float.valueOf((float) optionalDoubleValueByHashCode.doubleValue());
                }
                return null;
            case 10:
                int i8 = this.A01;
                TreeJNI treeJNI7 = TreeJNI.$redex_init_class;
                return ((TreeJNI) this.A02).getOptionalTimeListByHashCode(i8);
            case 13:
                Object fieldByHashCode_UNTYPED = ((TreeJNI) this.A02).getFieldByHashCode_UNTYPED(this.A01);
                if (!(fieldByHashCode_UNTYPED instanceof List) || (list = (List) fieldByHashCode_UNTYPED) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
                for (Object obj : list) {
                    arrayList.add(obj.toString());
                }
                return arrayList;
            case 16:
                View requireViewById = ((C308586Uv) this.A02).A07.getView().requireViewById(this.A01);
                0qQ.A07(requireViewById);
                return requireViewById;
            default:
                Object fieldByHashCode_UNTYPED2 = ((TreeJNI) this.A02).getFieldByHashCode_UNTYPED(this.A01);
                if (fieldByHashCode_UNTYPED2 != null) {
                    return fieldByHashCode_UNTYPED2.toString();
                }
                return null;
        }
        return C60340gF.A00;
    }
}
