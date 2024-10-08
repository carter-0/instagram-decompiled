package com.fasterxml.jackson.datatype.guava.deser;

import X.16F;
import X.16L;
import X.17k;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11287SJg;
import X.C13901TjO;
import X.C268894eF;
import X.C269454f9;
import X.C269674fV;
import X.C269784fg;
import X.C66581MXm;
import X.Pxe;
import X.Pxf;
import X.Pxi;
import X.SMm;
import X.T9l;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.google.common.base.Strings;
import com.google.common.collect.BoundType;
import com.google.common.collect.Cut;
import com.google.common.collect.Range;
import java.util.Arrays;

public class RangeDeserializer extends StdDeserializer implements C269784fg {
    public final T9l A00;
    public final BoundType A01;
    public final C268894eF A02;
    public final JsonDeserializer A03;

    private BoundType A00(16F r5, C269674fV r6) {
        16L r3 = 16L.A0J;
        16L A11 = r5.A11();
        if (A11 != r3) {
            r6.A0h(String.format("Problem deserializing %s: expecting %s, found %s", new Object[]{A0H().getName(), r3, A11}), new Object[0]);
            throw AnonymousClass00P.createAndThrow();
        }
        String A1P = r5.A1P();
        try {
            return BoundType.valueOf(A1P);
        } catch (IllegalArgumentException unused) {
            r6.A0e(BoundType.class, A1P, "not a valid BoundType name (should be one oF: %s)", Arrays.asList(BoundType.values()));
            throw AnonymousClass00P.createAndThrow();
        }
    }

    private Comparable A01(16F r5, C269674fV r6) {
        Object A0D = this.A03.A0D(r5, r6);
        if (A0D instanceof Comparable) {
            return (Comparable) A0D;
        }
        Pxf.A1H(r6, this.A02, "Field [%s] deserialized to [%s], which does not implement Comparable.", new Object[]{r5.A0q(), C66581MXm.A0y(A0D)});
        throw AnonymousClass00P.createAndThrow();
    }

    public final Integer A0I() {
        return AnonymousClass05K.A0N;
    }

    public final C268894eF A0T() {
        return this.A02;
    }

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r7) {
        C269454f9 r1 = r7.A02;
        T9l A002 = SMm.A00(r1.A01.A02, r1);
        JsonDeserializer jsonDeserializer = this.A03;
        JsonDeserializer jsonDeserializer2 = jsonDeserializer;
        if (jsonDeserializer == null) {
            jsonDeserializer = r7.A0B(tjO, Pxi.A0L(this.A02, 0));
        } else if (jsonDeserializer instanceof C269784fg) {
            jsonDeserializer = ((C269784fg) jsonDeserializer).ALh(tjO, r7);
        }
        if (jsonDeserializer == jsonDeserializer2 && A002 == this.A00) {
            return this;
        }
        return new RangeDeserializer(this.A02, jsonDeserializer, A002, this.A01);
    }

    public RangeDeserializer(C268894eF r1, JsonDeserializer jsonDeserializer, T9l t9l, BoundType boundType) {
        super(r1);
        this.A02 = r1;
        this.A03 = jsonDeserializer;
        this.A01 = boundType;
        this.A00 = t9l;
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r12, C269674fV r13) {
        Throwable th;
        Cut cut;
        Cut cut2;
        16L A11 = r12.A11();
        if (A11 == 16L.A0D) {
            A11 = r12.A1J();
        }
        BoundType boundType = this.A01;
        Comparable comparable = null;
        BoundType boundType2 = boundType;
        Comparable comparable2 = null;
        while (A11 != 16L.A09) {
            16L r1 = 16L.A0A;
            if (A11 != r1) {
                r13.A0h(String.format("Problem deserializing %s: expecting %s, found %s", new Object[]{A0H().getName(), r1, A11}), new Object[0]);
                throw AnonymousClass00P.createAndThrow();
            }
            String A0q = r12.A0q();
            try {
                T9l t9l = this.A00;
                if (A0q.equals(t9l.A01)) {
                    r12.A1J();
                    comparable2 = A01(r12, r13);
                } else if (A0q.equals(t9l.A03)) {
                    r12.A1J();
                    comparable = A01(r12, r13);
                } else if (A0q.equals(t9l.A00)) {
                    r12.A1J();
                    boundType = A00(r12, r13);
                } else if (A0q.equals(t9l.A02)) {
                    r12.A1J();
                    boundType2 = A00(r12, r13);
                } else {
                    r13.A0S(r12, this, Range.class, A0q);
                }
                A11 = r12.A1J();
            } catch (IllegalStateException e) {
                r13.A09(e.getMessage(), A0H());
                throw AnonymousClass00P.createAndThrow();
            }
        }
        boolean z = true;
        if (comparable2 != null) {
            if (comparable != null) {
                Class<?> cls = comparable2.getClass();
                Class<?> cls2 = comparable.getClass();
                boolean A1W = AnonymousClass7TF.A1W(cls, cls2);
                String name = cls.getName();
                String name2 = cls2.getName();
                if (A1W) {
                    17k.A0H(AnonymousClass7TF.A1V(boundType), "'lowerEndpoint' field found, but not 'lowerBoundType'");
                    if (boundType2 == null) {
                        z = false;
                    }
                    17k.A0H(z, "'upperEndpoint' field found, but not 'upperBoundType'");
                    Range range = Range.A00;
                    boundType.getClass();
                    boundType2.getClass();
                    BoundType boundType3 = BoundType.OPEN;
                    if (boundType == boundType3) {
                        cut = new Cut(comparable2);
                    } else {
                        cut = new Cut(comparable2);
                    }
                    if (boundType2 == boundType3) {
                        cut2 = new Cut(comparable);
                    } else {
                        cut2 = new Cut(comparable);
                    }
                    return new Range(cut, cut2);
                }
                th = AnonymousClass7TE.A0z(Strings.A00("Endpoint types are not the same - 'lowerEndpoint' deserialized to [%s], and 'upperEndpoint' deserialized to [%s].", name, name2));
            } else {
                if (boundType == null) {
                    z = false;
                }
                17k.A0H(z, "'lowerEndpoint' field found, but not 'lowerBoundType'");
                Range range2 = Range.A00;
                int ordinal = boundType.ordinal();
                if (ordinal == 0) {
                    return new Range(new Cut(comparable2), Cut.AboveAll.A00);
                }
                if (ordinal == 1) {
                    return new Range(new Cut(comparable2), Cut.AboveAll.A00);
                }
                th = Pxe.A0d();
            }
        } else if (comparable == null) {
            return Range.A00;
        } else {
            if (boundType2 == null) {
                z = false;
            }
            17k.A0H(z, "'upperEndpoint' field found, but not 'upperBoundType'");
            Range range3 = Range.A00;
            int ordinal2 = boundType2.ordinal();
            if (ordinal2 == 0) {
                return new Range(Cut.BelowAll.A00, new Cut(comparable));
            }
            if (ordinal2 == 1) {
                return new Range(Cut.BelowAll.A00, new Cut(comparable));
            }
            th = Pxe.A0d();
        }
        throw th;
    }

    public final Object A0J(16F r2, C269674fV r3, C11287SJg sJg) {
        return sJg.A05(r2, r3);
    }
}
