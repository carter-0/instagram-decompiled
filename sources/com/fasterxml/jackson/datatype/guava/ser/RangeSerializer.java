package com.fasterxml.jackson.datatype.guava.ser;

import X.16L;
import X.17Z;
import X.C10798RyK;
import X.C13901TjO;
import X.C268894eF;
import X.C269294et;
import X.C269504fE;
import X.C269714fZ;
import X.Pxe;
import X.Pxi;
import X.SMm;
import X.SPK;
import X.T9l;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.google.common.collect.BoundType;
import com.google.common.collect.Cut;
import com.google.common.collect.Range;

public class RangeSerializer extends StdSerializer implements C269714fZ {
    public final C268894eF A00;
    public final JsonSerializer A01;
    public final T9l A02;

    private void A03(17Z r6, C269504fE r7, Range range) {
        BoundType boundType;
        BoundType boundType2;
        Cut cut = range.lowerBound;
        if (cut != Cut.BelowAll.A00) {
            T9l t9l = this.A02;
            String str = t9l.A01;
            JsonSerializer jsonSerializer = this.A01;
            if (jsonSerializer != null) {
                r6.A0q(str);
                jsonSerializer.A0A(r6, r7, range.lowerBound.A01());
            } else {
                r7.A0U(r6, cut.A01(), str);
            }
            String str2 = t9l.A00;
            Cut cut2 = range.lowerBound;
            if (cut2 instanceof Cut.BelowValue) {
                boundType2 = BoundType.CLOSED;
            } else if (cut2 instanceof Cut.BelowAll) {
                throw Pxe.A0i();
            } else if (cut2 instanceof Cut.AboveValue) {
                boundType2 = BoundType.OPEN;
            } else {
                throw Pxe.A0e("this statement should be unreachable");
            }
            r6.A0R(str2, boundType2.name());
        }
        Cut cut3 = range.upperBound;
        if (cut3 != Cut.AboveAll.A00) {
            T9l t9l2 = this.A02;
            String str3 = t9l2.A03;
            JsonSerializer jsonSerializer2 = this.A01;
            if (jsonSerializer2 != null) {
                r6.A0q(str3);
                jsonSerializer2.A0A(r6, r7, range.upperBound.A01());
            } else {
                r7.A0U(r6, cut3.A01(), str3);
            }
            String str4 = t9l2.A02;
            Cut cut4 = range.upperBound;
            if (cut4 instanceof Cut.BelowValue) {
                boundType = BoundType.OPEN;
            } else if (cut4 instanceof Cut.BelowAll) {
                throw Pxe.A0e("this statement should be unreachable");
            } else if (cut4 instanceof Cut.AboveValue) {
                boundType = BoundType.CLOSED;
            } else {
                throw Pxe.A0i();
            }
            r6.A0R(str4, boundType.name());
        }
    }

    public final /* bridge */ /* synthetic */ void A09(17Z r2, C269504fE r3, SPK spk, Object obj) {
        Range range = (Range) obj;
        r2.A0F(range);
        C10798RyK A002 = SPK.A00(r2, 16L.A0D, spk, range);
        A03(r2, r3, range);
        spk.A04(r2, A002);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r1, C269504fE r2, Object obj) {
        Range range = (Range) obj;
        r1.A0o(range);
        A03(r1, r2, range);
        r1.A0Z();
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r3, Object obj) {
        Range range = (Range) obj;
        return range.lowerBound.equals(range.upperBound);
    }

    public final JsonSerializer ALi(C13901TjO tjO, C269504fE r8) {
        C269294et r1 = r8.A05;
        T9l A002 = SMm.A00(r1.A01.A02, r1);
        JsonSerializer jsonSerializer = this.A01;
        if (jsonSerializer == null) {
            C268894eF r3 = this.A00;
            C268894eF A0L = Pxi.A0L(r3, 0);
            if (A0L.A00 != Object.class) {
                return new RangeSerializer(r3, r8.A0E(tjO, A0L), A002);
            }
        } else {
            jsonSerializer = Pxi.A0M(tjO, jsonSerializer, r8, jsonSerializer instanceof C269714fZ ? 1 : 0);
        }
        return new RangeSerializer(this.A00, jsonSerializer, A002);
    }

    public RangeSerializer(C268894eF r1, JsonSerializer jsonSerializer, T9l t9l) {
        super(r1);
        this.A00 = r1;
        this.A01 = jsonSerializer;
        this.A02 = t9l;
    }
}
