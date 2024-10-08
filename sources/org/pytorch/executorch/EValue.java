package org.pytorch.executorch;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.JTO;
import java.util.Locale;
import java.util.Optional;

public class EValue {
    public String[] TYPE_NAMES = {"None", "Tensor", "String", "Double", "Int", "Bool", "ListBool", "ListDouble", "ListInt", "ListTensor", "ListScalar", "ListOptionalScalar"};
    public Object mData;
    public final int mTypeCode;

    public static EValue from(double d) {
        EValue eValue = new EValue(3);
        eValue.mData = Double.valueOf(d);
        return eValue;
    }

    public static EValue optionalNone() {
        return new EValue(0);
    }

    public static EValue listFrom(long... jArr) {
        EValue eValue = new EValue(8);
        eValue.mData = jArr;
        return eValue;
    }

    private void preconditionType(int i, int i2) {
        String str;
        String str2;
        if (i2 != i) {
            Locale locale = Locale.US;
            String[] strArr = this.TYPE_NAMES;
            int length = strArr.length;
            if (i < length) {
                str = strArr[i];
            } else {
                str = "Unknown";
            }
            if (i2 < 0 || i2 >= length) {
                str2 = "Unknown";
            } else {
                str2 = strArr[i2];
            }
            throw AnonymousClass7TE.A0z(String.format(locale, "Expected EValue type %s, actual type %s", new Object[]{str, str2}));
        }
    }

    public boolean isBool() {
        return AnonymousClass7TF.A1S(5, this.mTypeCode);
    }

    public boolean isBoolList() {
        return AnonymousClass7TF.A1S(6, this.mTypeCode);
    }

    public boolean isDouble() {
        return AnonymousClass7TF.A1S(3, this.mTypeCode);
    }

    public boolean isDoubleList() {
        return AnonymousClass7TF.A1S(7, this.mTypeCode);
    }

    public boolean isInt() {
        return AnonymousClass7TF.A1S(4, this.mTypeCode);
    }

    public boolean isIntList() {
        return AnonymousClass7TF.A1S(8, this.mTypeCode);
    }

    public boolean isNone() {
        return AnonymousClass7TF.A1Q(this.mTypeCode);
    }

    public boolean isOptionalTensorList() {
        return AnonymousClass7TF.A1S(11, this.mTypeCode);
    }

    public boolean isString() {
        return AnonymousClass7TF.A1S(2, this.mTypeCode);
    }

    public boolean isTensor() {
        if (1 != this.mTypeCode) {
            return false;
        }
        return true;
    }

    public boolean isTensorList() {
        return AnonymousClass7TF.A1S(9, this.mTypeCode);
    }

    public boolean toBool() {
        preconditionType(5, this.mTypeCode);
        return AnonymousClass7TE.A1a(this.mData);
    }

    public boolean[] toBoolList() {
        preconditionType(6, this.mTypeCode);
        return (boolean[]) this.mData;
    }

    public double toDouble() {
        preconditionType(3, this.mTypeCode);
        return JTO.A00(this.mData);
    }

    public double[] toDoubleList() {
        preconditionType(7, this.mTypeCode);
        return (double[]) this.mData;
    }

    public long toInt() {
        preconditionType(4, this.mTypeCode);
        return AnonymousClass7TE.A0R(this.mData);
    }

    public long[] toIntList() {
        preconditionType(8, this.mTypeCode);
        return (long[]) this.mData;
    }

    public String toStr() {
        preconditionType(2, this.mTypeCode);
        return (String) this.mData;
    }

    public Tensor toTensor() {
        preconditionType(1, this.mTypeCode);
        return (Tensor) this.mData;
    }

    public Tensor[] toTensorList() {
        preconditionType(9, this.mTypeCode);
        return (Tensor[]) this.mData;
    }

    public EValue(int i) {
        this.mTypeCode = i;
    }

    public static EValue from(long j) {
        EValue eValue = new EValue(4);
        eValue.mData = Long.valueOf(j);
        return eValue;
    }

    public static EValue listFrom(Optional... optionalArr) {
        EValue eValue = new EValue(11);
        eValue.mData = optionalArr;
        return eValue;
    }

    public static EValue from(boolean z) {
        EValue eValue = new EValue(5);
        eValue.mData = Boolean.valueOf(z);
        return eValue;
    }

    public static EValue listFrom(Tensor... tensorArr) {
        EValue eValue = new EValue(9);
        eValue.mData = tensorArr;
        return eValue;
    }

    public static EValue from(Tensor tensor) {
        EValue eValue = new EValue(1);
        eValue.mData = tensor;
        return eValue;
    }

    public static EValue listFrom(boolean... zArr) {
        EValue eValue = new EValue(6);
        eValue.mData = zArr;
        return eValue;
    }

    public static EValue from(String str) {
        EValue eValue = new EValue(2);
        eValue.mData = str;
        return eValue;
    }

    public static EValue listFrom(double... dArr) {
        EValue eValue = new EValue(7);
        eValue.mData = dArr;
        return eValue;
    }
}
