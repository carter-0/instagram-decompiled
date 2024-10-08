package X;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;

public final class TLS implements WildcardType, Serializable {
    public final ImmutableList A00;
    public final ImmutableList A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        if (this.A00.equals(Arrays.asList(wildcardType.getLowerBounds()))) {
            return Pxi.A1W(this.A01, Arrays.asList(wildcardType.getUpperBounds()));
        }
        return false;
    }

    public final Type[] getLowerBounds() {
        return (Type[]) this.A00.toArray(new Type[0]);
    }

    public final Type[] getUpperBounds() {
        return (Type[]) this.A01.toArray(new Type[0]);
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("?");
        C249803kO it = this.A00.iterator();
        while (it.hasNext()) {
            A16.append(" super ");
            A16.append(RDL.A00.A00((Type) it.next()));
        }
        ImmutableList immutableList = this.A01;
        T02 t02 = new T02(new T01());
        immutableList.getClass();
        Iterator it2 = new C8675Qzh(0, immutableList, t02).iterator();
        while (it2.hasNext()) {
            A16.append(" extends ");
            A16.append(RDL.A00.A00((Type) it2.next()));
        }
        return A16.toString();
    }

    public TLS(Type[] typeArr, Type[] typeArr2) {
        C11403SRz.A01("lower bound for wildcard", typeArr);
        C11403SRz.A01("upper bound for wildcard", typeArr2);
        RDL rdl = RDL.A00;
        ImmutableList.Builder builder = ImmutableList.builder();
        int length = typeArr.length;
        for (int i = 0; i < length; i = 1) {
            builder.add(rdl.A02(typeArr[i]));
        }
        this.A00 = builder.build();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        builder2.add(rdl.A02(typeArr2[0]));
        this.A01 = builder2.build();
    }
}
