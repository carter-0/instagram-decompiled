package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass00P;
import X.AnonymousClass4iD;
import X.AnonymousClass7TF;
import X.C12441SuX;
import X.C268894eF;
import X.C269454f9;
import X.C269464fA;
import X.C269574fL;
import X.C269674fV;
import X.C269764fe;
import X.C273654mx;
import X.C66581MXm;
import X.C8218QkR;
import X.Pxf;
import X.SK6;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaImmutableCollectionDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaMultisetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableBiMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableSortedMapDeserializer;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.RegularImmutableBiMap;
import com.google.common.collect.RegularImmutableMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

public abstract class ContainerDeserializerBase extends StdDeserializer {
    public final C268894eF A00;
    public final C269764fe A01;
    public final Boolean A02;
    public final boolean A03;

    public final C8218QkR A0E(String str) {
        JsonDeserializer jsonDeserializer;
        if (this instanceof GuavaMapDeserializer) {
            jsonDeserializer = ((GuavaMapDeserializer) this).A00;
        } else if (this instanceof GuavaCollectionDeserializer) {
            jsonDeserializer = ((GuavaCollectionDeserializer) this).A00;
        } else if (this instanceof StringCollectionDeserializer) {
            jsonDeserializer = ((StringCollectionDeserializer) this).A01;
        } else if (this instanceof ObjectArrayDeserializer) {
            jsonDeserializer = ((ObjectArrayDeserializer) this).A00;
        } else if (this instanceof MapEntryDeserializer) {
            jsonDeserializer = ((MapEntryDeserializer) this).A00;
        } else if (this instanceof MapDeserializer) {
            jsonDeserializer = ((MapDeserializer) this).A06;
        } else if (this instanceof EnumMapDeserializer) {
            jsonDeserializer = ((EnumMapDeserializer) this).A01;
        } else {
            jsonDeserializer = ((CollectionDeserializer) this).A01;
        }
        if (jsonDeserializer != null) {
            return jsonDeserializer.A0E(str);
        }
        throw Pxf.A0X("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", new Object[]{str, C66581MXm.A0y(this)});
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ContainerDeserializerBase(X.C269764fe r2, com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase r3, java.lang.Boolean r4) {
        /*
            r1 = this;
            X.4eF r0 = r3.A00
            r1.<init>((X.C268894eF) r0)
            r1.A00 = r0
            r1.A01 = r2
            r1.A02 = r4
            X.SuX r0 = X.C12441SuX.A02
            boolean r0 = X.AnonymousClass7TF.A1W(r2, r0)
            r1.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.<init>(X.4fe, com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, java.lang.Boolean):void");
    }

    public static final void A01(C269674fV r1, Object obj, String str, Throwable th) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        Iterator it = C269574fL.A00;
        if (!(th instanceof Error)) {
            if (r1 != null && !r1.A0j(C269464fA.WRAP_EXCEPTIONS)) {
                C269574fL.A0F(th);
            }
            if (!(th instanceof IOException) || (th instanceof AnonymousClass4iD)) {
                if (str == null) {
                    str = "N/A";
                }
                throw AnonymousClass4iD.A02(obj, str, th);
            }
        }
        throw th;
    }

    public final Boolean A0G(C269454f9 r2) {
        if (this instanceof GuavaImmutableCollectionDeserializer) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public final Object A0K(C269674fV r4) {
        if (this instanceof ImmutableSortedMapDeserializer) {
            return ImmutableSortedMap.A03;
        }
        if (this instanceof ImmutableMapDeserializer) {
            return RegularImmutableMap.A02;
        }
        if (this instanceof ImmutableBiMapDeserializer) {
            return RegularImmutableBiMap.A04;
        }
        if (this instanceof GuavaMultisetDeserializer) {
            return ((GuavaMultisetDeserializer) this).A0z();
        }
        if (this instanceof GuavaImmutableCollectionDeserializer) {
            return ((GuavaCollectionDeserializer) this).A0y();
        }
        if (this instanceof ObjectArrayDeserializer) {
            return ((ObjectArrayDeserializer) this).A04;
        }
        if (this instanceof EnumMapDeserializer) {
            return ((EnumMapDeserializer) this).A0y(r4);
        }
        SK6 A0W = A0W();
        if (A0W == null || !A0W.A0L()) {
            C268894eF r2 = this.A00;
            Pxf.A1H(r4, r2, C273654mx.A00(1212), new Object[]{r2});
            throw AnonymousClass00P.createAndThrow();
        }
        try {
            return A0W.A04(r4);
        } catch (IOException e) {
            C269574fL.A0D(r4, e);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final C268894eF A0T() {
        return this.A00;
    }

    public ContainerDeserializerBase(C268894eF r2, C269764fe r3, Boolean bool) {
        super(r2);
        this.A00 = r2;
        this.A02 = bool;
        this.A01 = r3;
        this.A03 = AnonymousClass7TF.A1W(r3, C12441SuX.A02);
    }
}
