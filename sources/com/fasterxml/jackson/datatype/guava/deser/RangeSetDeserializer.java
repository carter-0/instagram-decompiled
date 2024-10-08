package com.fasterxml.jackson.datatype.guava.deser;

import X.16F;
import X.17k;
import X.1bD;
import X.AnonymousClass05K;
import X.AnonymousClass4eE;
import X.AnonymousClass7TE;
import X.C10439RsG;
import X.C13901TjO;
import X.C268894eF;
import X.C268924eI;
import X.C269674fV;
import X.C269754fd;
import X.C269784fg;
import X.C51967G9n;
import X.Pxe;
import X.TMG;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.collect.Cut;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RangeSetDeserializer extends JsonDeserializer implements C269784fg {
    public C268894eF A00;

    public final /* bridge */ /* synthetic */ Object A0D(16F r8, C269674fV r9) {
        TMG tmg;
        Cut cut;
        Cut cut2;
        C268894eF r1 = this.A00;
        if (r1 != null) {
            ImmutableRangeSet immutableRangeSet = ImmutableRangeSet.A01;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Range range : (Iterable) r9.A0B((C13901TjO) null, r1).A0D(r8, r9)) {
                17k.A0A(range, "range must not be empty, but was %s", !range.lowerBound.equals(range.upperBound));
                A1C.add(range);
            }
            ImmutableList.Builder builder = new ImmutableList.Builder(A1C.size());
            Range range2 = Range.A00;
            Collections.sort(A1C, Range.RangeLexOrdering.A00);
            Iterator it = A1C.iterator();
            if (it instanceof TMG) {
                tmg = (TMG) it;
            } else {
                tmg = new TMG(it);
            }
            while (tmg.hasNext()) {
                Range range3 = (Range) tmg.next();
                while (tmg.hasNext()) {
                    if (!tmg.A01) {
                        tmg.A00 = tmg.A02.next();
                        tmg.A01 = true;
                    }
                    Range range4 = (Range) tmg.A00;
                    if (range3.lowerBound.A00(range4.upperBound) > 0 || range4.lowerBound.A00(range3.upperBound) > 0) {
                        break;
                    }
                    Range A01 = range3.A01(range4);
                    17k.A09(range3, range4, "Overlapping ranges not permitted but found %s overlapping %s", A01.lowerBound.equals(A01.upperBound));
                    Range range5 = (Range) tmg.next();
                    int A002 = range3.lowerBound.A00(range5.lowerBound);
                    int A003 = range3.upperBound.A00(range5.upperBound);
                    if (A002 > 0) {
                        if (A003 > 0) {
                            cut = range5.lowerBound;
                            cut2 = range3.upperBound;
                        }
                        range3 = range5;
                    } else if (A003 < 0) {
                        if (A002 < 0) {
                            cut = range3.lowerBound;
                            cut2 = range5.upperBound;
                        }
                        range3 = range5;
                    }
                    range5 = new Range(cut, cut2);
                    range3 = range5;
                }
                builder.add(range3);
            }
            ImmutableList build = builder.build();
            if (build.isEmpty()) {
                return ImmutableRangeSet.A02;
            }
            if (build.size() == 1) {
                Iterator it2 = build.iterator();
                Object next = it2.next();
                if (it2.hasNext()) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("expected one element but was: <");
                    A1A.append(next);
                    int i = 0;
                    while (it2.hasNext()) {
                        Pxe.A1Y(A1A);
                        A1A.append(it2.next());
                        i++;
                        if (i >= 4) {
                            break;
                        }
                    }
                    if (it2.hasNext()) {
                        A1A.append(", ...");
                    }
                    throw AnonymousClass7TE.A0w(C51967G9n.A0r(A1A, '>'));
                } else if (next.equals(Range.A00)) {
                    return ImmutableRangeSet.A01;
                }
            }
            return new ImmutableRangeSet(build);
        }
        throw new 1bD(r8, "RangeSetJsonSerializer was not contextualized (no deserialize target type). You need to specify the generic type down to the generic parameter of RangeSet.");
    }

    public final Integer A0I() {
        return AnonymousClass05K.A01;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.fasterxml.jackson.datatype.guava.deser.RangeSetDeserializer, java.lang.Object, com.fasterxml.jackson.databind.JsonDeserializer] */
    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r8) {
        C268894eF r0;
        C10439RsG rsG = r8.A00;
        if (rsG == null) {
            r0 = null;
        } else {
            r0 = (C268894eF) rsG.A01;
        }
        C268894eF A07 = r0.A07(0);
        if (A07 == null) {
            return this;
        }
        ? obj = new Object();
        AnonymousClass4eE A05 = r8.A05();
        Class<Range> cls = Range.class;
        obj.A00 = A05.A0A(A05.A04(A05.A06((C269754fd) null, C268924eI.A02(cls, new C268894eF[]{A07}), cls)), List.class);
        return obj;
    }
}
