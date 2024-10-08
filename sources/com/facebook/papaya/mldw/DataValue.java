package com.facebook.papaya.mldw;

import X.0dV;
import X.AnonymousClass7TE;
import X.C8940RGi;
import java.util.Locale;

public final class DataValue {
    public static final DataValue $redex_init_class = null;
    public C8940RGi mDataType;
    public Float mFloatValue;
    public Long mIntValue;
    public boolean mIsNull;
    public String mStringValue;

    private void checkType(C8940RGi rGi) {
        C8940RGi rGi2 = this.mDataType;
        if (rGi2 != rGi) {
            throw AnonymousClass7TE.A15(String.format(Locale.US, "Trying to access %s as %s!", new Object[]{rGi2.toString(), rGi.toString()}));
        }
    }

    private int getDataTypeValue() {
        if (!this.mIsNull) {
            return this.mDataType.A00;
        }
        throw AnonymousClass7TE.A15("The data value is null!");
    }

    public float getFloatValue() {
        if (!this.mIsNull) {
            checkType(C8940RGi.FLOAT);
            Float f = this.mFloatValue;
            f.getClass();
            return f.floatValue();
        }
        throw AnonymousClass7TE.A15("The data value is null!");
    }

    public long getIntValue() {
        if (!this.mIsNull) {
            checkType(C8940RGi.INTEGER);
            Long l = this.mIntValue;
            l.getClass();
            return l.longValue();
        }
        throw AnonymousClass7TE.A15("The data value is null!");
    }

    public boolean getIsNull() {
        return this.mIsNull;
    }

    public String getStringValue() {
        if (!this.mIsNull) {
            checkType(C8940RGi.STRING);
            String str = this.mStringValue;
            str.getClass();
            return str;
        }
        throw AnonymousClass7TE.A15("The data value is null!");
    }

    static {
        0dV.A0C("papaya-mldw");
    }

    public DataValue(Float f) {
        this.mIsNull = true;
        this.mDataType = C8940RGi.INTEGER;
        this.mIntValue = null;
        this.mFloatValue = null;
        this.mStringValue = null;
        this.mIsNull = false;
        this.mDataType = C8940RGi.FLOAT;
        this.mFloatValue = f;
    }

    public DataValue(String str) {
        this.mIsNull = true;
        this.mDataType = C8940RGi.INTEGER;
        this.mIntValue = null;
        this.mFloatValue = null;
        this.mStringValue = null;
        this.mIsNull = false;
        this.mDataType = C8940RGi.STRING;
        this.mStringValue = str;
    }

    public DataValue(Long l) {
        this.mIsNull = true;
        C8940RGi rGi = C8940RGi.INTEGER;
        this.mDataType = rGi;
        this.mIntValue = null;
        this.mFloatValue = null;
        this.mStringValue = null;
        this.mIsNull = false;
        this.mDataType = rGi;
        this.mIntValue = l;
    }

    public DataValue() {
        this.mIsNull = true;
        this.mDataType = C8940RGi.INTEGER;
        this.mIntValue = null;
        this.mFloatValue = null;
        this.mStringValue = null;
        this.mIsNull = true;
    }
}
