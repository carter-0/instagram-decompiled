package com.fasterxml.jackson.datatype.guava.deser;

import X.16F;
import X.16L;
import X.1J3;
import X.1R1;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass3W6;
import X.C11287SJg;
import X.C13901TjO;
import X.C268894eF;
import X.C269464fA;
import X.C269674fV;
import X.C269764fe;
import X.C269784fg;
import X.Pxe;
import X.R04;
import X.R0P;
import X.R0Q;
import X.RDC;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.RegularImmutableMultiset;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.RegularImmutableSortedMultiset;
import com.google.common.collect.RegularImmutableSortedSet;
import com.google.common.collect.SingletonImmutableSet;
import java.util.Collection;

public abstract class GuavaCollectionDeserializer extends ContainerDeserializerBase implements C269784fg {
    public final JsonDeserializer A00;
    public final C11287SJg A01;

    public final Integer A0I() {
        return AnonymousClass05K.A01;
    }

    public final Object A0y() {
        if (this instanceof ImmutableSortedSetDeserializer) {
            return RegularImmutableSortedSet.A00;
        }
        if (this instanceof ImmutableSortedMultisetDeserializer) {
            return RegularImmutableSortedMultiset.A03;
        }
        if (this instanceof ImmutableSetDeserializer) {
            return RegularImmutableSet.A03;
        }
        if (this instanceof ImmutableMultisetDeserializer) {
            return RegularImmutableMultiset.A03;
        }
        if (this instanceof ImmutableListDeserializer) {
            return ImmutableList.of();
        }
        return ((GuavaMultisetDeserializer) this).A0z();
    }

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r9) {
        Boolean A0X = A0X(RDC.ACCEPT_SINGLE_VALUE_AS_ARRAY, tjO, r9, Collection.class);
        JsonDeserializer jsonDeserializer = this.A00;
        JsonDeserializer jsonDeserializer2 = jsonDeserializer;
        C11287SJg sJg = this.A01;
        C11287SJg sJg2 = sJg;
        if (jsonDeserializer == null) {
            jsonDeserializer = r9.A0B(tjO, this.A00.A03());
        }
        if (sJg != null) {
            sJg = sJg.A02(tjO);
        }
        C269764fe A0V = A0V(tjO, r9, jsonDeserializer);
        if (A0X == this.A02 && A0V == this.A01 && jsonDeserializer == jsonDeserializer2 && sJg == sJg2) {
            return this;
        }
        if (this instanceof ImmutableSortedSetDeserializer) {
            return new GuavaCollectionDeserializer(this.A00, jsonDeserializer, A0V, sJg, A0X);
        }
        if (this instanceof ImmutableSortedMultisetDeserializer) {
            return new GuavaCollectionDeserializer(this.A00, jsonDeserializer, A0V, sJg, A0X);
        }
        if (this instanceof ImmutableSetDeserializer) {
            return new GuavaCollectionDeserializer(this.A00, jsonDeserializer, A0V, sJg, A0X);
        }
        if (this instanceof ImmutableMultisetDeserializer) {
            return new GuavaCollectionDeserializer(this.A00, jsonDeserializer, A0V, sJg, A0X);
        }
        if (this instanceof ImmutableListDeserializer) {
            return new GuavaCollectionDeserializer(this.A00, jsonDeserializer, A0V, sJg, A0X);
        }
        if (this instanceof TreeMultisetDeserializer) {
            return new GuavaCollectionDeserializer(this.A00, jsonDeserializer, A0V, sJg, A0X);
        }
        boolean z = this instanceof LinkedHashMultisetDeserializer;
        C268894eF r2 = this.A00;
        if (z) {
            return new GuavaCollectionDeserializer(r2, jsonDeserializer, A0V, sJg, A0X);
        }
        return new GuavaCollectionDeserializer(r2, jsonDeserializer, A0V, sJg, A0X);
    }

    public GuavaCollectionDeserializer(C268894eF r1, JsonDeserializer jsonDeserializer, C269764fe r3, C11287SJg sJg, Boolean bool) {
        super(r1, r3, bool);
        this.A01 = sJg;
        this.A00 = jsonDeserializer;
    }

    public final Object A0D(16F r7, C269674fV r8) {
        Object obj;
        1J3 r0p;
        1R1 r2;
        Object A0J;
        Object A0J2;
        if (r7.A16()) {
            if (this instanceof GuavaMultisetDeserializer) {
                GuavaMultisetDeserializer guavaMultisetDeserializer = (GuavaMultisetDeserializer) this;
                JsonDeserializer jsonDeserializer = guavaMultisetDeserializer.A00;
                C11287SJg sJg = guavaMultisetDeserializer.A01;
                AnonymousClass3W6 A0z = guavaMultisetDeserializer.A0z();
                while (true) {
                    16L A1J = r7.A1J();
                    if (A1J == 16L.A08) {
                        return A0z;
                    }
                    if (A1J == 16L.A0G) {
                        if (!guavaMultisetDeserializer.A03) {
                            A0J2 = Pxe.A0q(r8, guavaMultisetDeserializer);
                        }
                    } else if (sJg == null) {
                        A0J2 = jsonDeserializer.A0D(r7, r8);
                    } else {
                        A0J2 = jsonDeserializer.A0J(r7, r8, sJg);
                    }
                    A0z.add(A0J2);
                }
            } else {
                GuavaImmutableCollectionDeserializer guavaImmutableCollectionDeserializer = (GuavaImmutableCollectionDeserializer) this;
                JsonDeserializer jsonDeserializer2 = guavaImmutableCollectionDeserializer.A00;
                C11287SJg sJg2 = guavaImmutableCollectionDeserializer.A01;
                if (guavaImmutableCollectionDeserializer instanceof ImmutableSortedSetDeserializer) {
                    r2 = new R0Q(NaturalOrdering.A00);
                } else if (guavaImmutableCollectionDeserializer instanceof ImmutableSortedMultisetDeserializer) {
                    r2 = new R0P(NaturalOrdering.A00);
                } else if (guavaImmutableCollectionDeserializer instanceof ImmutableSetDeserializer) {
                    r2 = new 1R1();
                } else if (guavaImmutableCollectionDeserializer instanceof ImmutableMultisetDeserializer) {
                    r2 = new R04();
                } else {
                    r2 = ImmutableList.builder();
                }
                while (true) {
                    16L A1J2 = r7.A1J();
                    if (A1J2 == 16L.A08) {
                        return r2.build();
                    }
                    if (A1J2 == 16L.A0G) {
                        if (!guavaImmutableCollectionDeserializer.A03) {
                            A0J = Pxe.A0q(r8, guavaImmutableCollectionDeserializer);
                        }
                    } else if (sJg2 == null) {
                        A0J = jsonDeserializer2.A0D(r7, r8);
                    } else {
                        A0J = jsonDeserializer2.A0J(r7, r8, sJg2);
                    }
                    r2.add(A0J);
                }
            }
        } else if (r8.A0j(C269464fA.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            JsonDeserializer jsonDeserializer3 = this.A00;
            C11287SJg sJg3 = this.A01;
            if (r7.A11() == 16L.A0G) {
                if (this.A03) {
                    return A0y();
                }
                obj = Pxe.A0q(r8, this);
            } else if (sJg3 == null) {
                obj = jsonDeserializer3.A0D(r7, r8);
            } else {
                obj = jsonDeserializer3.A0J(r7, r8, sJg3);
            }
            if (this instanceof ImmutableSortedSetDeserializer) {
                r0p = new R0Q(NaturalOrdering.A00);
            } else if (this instanceof ImmutableSortedMultisetDeserializer) {
                r0p = new R0P(NaturalOrdering.A00);
            } else if (this instanceof ImmutableSetDeserializer) {
                return new SingletonImmutableSet(obj);
            } else {
                if (this instanceof ImmutableMultisetDeserializer) {
                    R04 r04 = new R04();
                    r04.add(new Object[]{obj}[0]);
                    return r04.build();
                } else if (this instanceof ImmutableListDeserializer) {
                    return ImmutableList.of(obj);
                } else {
                    AnonymousClass3W6 A0z2 = ((GuavaMultisetDeserializer) this).A0z();
                    A0z2.add(obj);
                    return A0z2;
                }
            }
            r0p.add(obj);
            return r0p.build();
        } else {
            r8.A0T(r7, this.A00);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final Object A0J(16F r2, C269674fV r3, C11287SJg sJg) {
        return sJg.A04(r2, r3);
    }
}
