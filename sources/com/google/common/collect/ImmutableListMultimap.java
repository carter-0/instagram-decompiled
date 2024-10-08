package com.google.common.collect;

import X.002;
import X.AnonymousClass00P;
import X.AnonymousClass4W4;
import X.AnonymousClass7TE;
import X.C10091RmT;
import X.C257513xW;
import X.C66580MXl;
import X.Pxe;
import X.Pxf;
import X.SQD;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class ImmutableListMultimap extends ImmutableMultimap implements AnonymousClass4W4 {
    public static final long serialVersionUID = 0;

    public static EmptyImmutableListMultimap A00() {
        return EmptyImmutableListMultimap.A00;
    }

    /* renamed from: A08 */
    public final ImmutableList AXL(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.A01.get(obj);
        if (immutableList == null) {
            return ImmutableList.of();
        }
        return immutableList;
    }

    public ImmutableListMultimap(ImmutableMap immutableMap, int i) {
        super(immutableMap, i);
    }

    public static ImmutableListMultimap A01(C257513xW r2) {
        if (r2.isEmpty()) {
            return A00();
        }
        if (r2 instanceof ImmutableListMultimap) {
            ImmutableListMultimap immutableListMultimap = (ImmutableListMultimap) r2;
            if (!immutableListMultimap.A01.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return A02(r2.ACX().entrySet());
    }

    public static ImmutableListMultimap A02(Collection collection) {
        if (collection.isEmpty()) {
            return A00();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int i = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(it);
            Object key = A1J.getKey();
            ImmutableList copyOf = ImmutableList.copyOf(Pxe.A18(A1J));
            if (!copyOf.isEmpty()) {
                builder.put(key, copyOf);
                i += copyOf.size();
            }
        }
        return new ImmutableListMultimap(builder.buildOrThrow(), i);
    }

    @Deprecated
    public static final void A03() {
        throw C66580MXl.A11();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ImmutableMap.Builder A0Q = Pxf.A0Q();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                readObject.getClass();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    int i3 = 0;
                    do {
                        Object readObject2 = objectInputStream.readObject();
                        readObject2.getClass();
                        builder.add(readObject2);
                        i3++;
                    } while (i3 < readInt2);
                    A0Q.put(readObject, builder.build());
                    i2 += readInt2;
                    i++;
                } else {
                    throw new InvalidObjectException(002.A0O("Invalid value count ", readInt2));
                }
            }
            try {
                C10091RmT.A00.A00(this, A0Q.buildOrThrow());
                try {
                    C10091RmT.A01.A00.set(this, Integer.valueOf(i2));
                } catch (IllegalAccessException e) {
                    throw Pxe.A0e(e);
                }
            } catch (IllegalArgumentException e2) {
                throw new InvalidObjectException(e2.getMessage()).initCause(e2);
            }
        } else {
            throw new InvalidObjectException(002.A0O("Invalid key count ", readInt));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        SQD.A02(this, objectOutputStream);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Collection EDC(Object obj) {
        A03();
        throw AnonymousClass00P.createAndThrow();
    }
}
