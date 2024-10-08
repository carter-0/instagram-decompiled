package X;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: X.54Y  reason: invalid class name */
public final class AnonymousClass54Y implements WildcardType, Serializable {
    public final Type A00;
    public final Type A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType) || !2HD.A06(this, (Type) obj)) {
            return false;
        }
        return true;
    }

    public final Type[] getLowerBounds() {
        Type type = this.A00;
        if (type != null) {
            return new Type[]{type};
        }
        return 2HD.A00;
    }

    public final Type[] getUpperBounds() {
        return new Type[]{this.A01};
    }

    public final int hashCode() {
        int i;
        Type type = this.A00;
        if (type != null) {
            i = type.hashCode() + 31;
        } else {
            i = 1;
        }
        return i ^ (this.A01.hashCode() + 31);
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        Type type = this.A00;
        if (type != null) {
            sb = new StringBuilder();
            str = "? super ";
        } else {
            type = this.A01;
            if (type == Object.class) {
                return "?";
            }
            sb = new StringBuilder();
            str = "? extends ";
        }
        sb.append(str);
        sb.append(2HD.A01(type));
        return sb.toString();
    }

    public AnonymousClass54Y(Type[] typeArr, Type[] typeArr2) {
        Type A04;
        int length = typeArr2.length;
        if (length > 1) {
            throw new IllegalArgumentException();
        } else if (typeArr.length == 1) {
            if (length == 1) {
                typeArr2[0].getClass();
                2HD.A05(typeArr2[0]);
                A04 = Object.class;
                if (typeArr[0] == A04) {
                    this.A00 = 2HD.A04(typeArr2[0]);
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                typeArr[0].getClass();
                2HD.A05(typeArr[0]);
                A04 = 2HD.A04(typeArr[0]);
            }
            this.A01 = A04;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
