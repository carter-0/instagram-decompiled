package X;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public final class TLR implements ParameterizedType, Serializable {
    public final ImmutableList A00;
    public final Class A01;
    public final Type A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (!getRawType().equals(parameterizedType.getRawType()) || !2PP.A00(getOwnerType(), parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
            return false;
        }
        return true;
    }

    public final Type[] getActualTypeArguments() {
        return (Type[]) this.A00.toArray(new Type[0]);
    }

    public final Type getOwnerType() {
        return this.A02;
    }

    public final Type getRawType() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A02) ^ this.A00.hashCode()) ^ this.A01.hashCode();
    }

    public TLR(Class cls, Type type, Type[] typeArr) {
        17k.A0E(AnonymousClass7TF.A1S(r4, cls.getTypeParameters().length));
        C11403SRz.A01("type parameter", typeArr);
        this.A02 = type;
        this.A01 = cls;
        RDL rdl = RDL.A00;
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Type A022 : typeArr) {
            builder.add(rdl.A02(A022));
        }
        this.A00 = builder.build();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Type type = this.A02;
        if (type != null) {
            RDL rdl = RDL.A00;
            if (3 - ((C8699R1q) rdl).A00 != 0) {
                A1A.append(rdl.A00(type));
                A1A.append('.');
            }
        }
        Pxe.A1W(this.A01, A1A);
        A1A.append('<');
        C239023El r4 = C11403SRz.A00;
        ImmutableList immutableList = this.A00;
        C12608Szs szs = new C12608Szs((Object) RDL.A00, 8);
        immutableList.getClass();
        A1A.append(r4.A02(new C8675Qzh(1, szs, immutableList)));
        return C51967G9n.A0r(A1A, '>');
    }
}
