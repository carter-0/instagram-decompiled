package com.google.common.collect;

import X.AnonymousClass42L;
import X.AnonymousClass4W4;
import X.C11307SKv;
import X.C13128TMm;
import X.C9131RQf;
import X.Pxd;
import X.QzH;
import X.R0w;
import X.R1E;
import X.TS8;
import X.TS9;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LinkedListMultimap extends AnonymousClass42L implements AnonymousClass4W4, Serializable {
    public static final long serialVersionUID = 0;
    public transient int A00;
    public transient int A01;
    public transient QzH A02;
    public transient QzH A03;
    public transient Map A04 = new CompactHashMap(12);

    public final boolean E5L(Object obj, Object obj2) {
        A00((QzH) null, this, obj, obj2);
        return true;
    }

    public final void clear() {
        this.A02 = null;
        this.A03 = null;
        this.A04.clear();
        this.A01 = 0;
        this.A00++;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.RQf] */
    public static QzH A00(QzH qzH, LinkedListMultimap linkedListMultimap, Object obj, Object obj2) {
        QzH qzH2 = new QzH(obj, obj2);
        if (linkedListMultimap.A02 == null) {
            linkedListMultimap.A03 = qzH2;
            linkedListMultimap.A02 = qzH2;
        } else {
            if (qzH == null) {
                QzH qzH3 = linkedListMultimap.A03;
                qzH3.getClass();
                qzH3.A00 = qzH2;
                qzH2.A02 = linkedListMultimap.A03;
                linkedListMultimap.A03 = qzH2;
                C9131RQf rQf = (C9131RQf) linkedListMultimap.A04.get(obj);
                if (rQf != null) {
                    rQf.A00++;
                    QzH qzH4 = rQf.A02;
                    qzH4.A01 = qzH2;
                    qzH2.A03 = qzH4;
                    rQf.A02 = qzH2;
                }
            } else {
                C9131RQf rQf2 = (C9131RQf) linkedListMultimap.A04.get(obj);
                rQf2.getClass();
                rQf2.A00++;
                qzH2.A02 = qzH.A02;
                qzH2.A03 = qzH.A03;
                qzH2.A00 = qzH;
                qzH2.A01 = qzH;
                QzH qzH5 = qzH.A03;
                if (qzH5 == null) {
                    rQf2.A01 = qzH2;
                } else {
                    qzH5.A01 = qzH2;
                }
                QzH qzH6 = qzH.A02;
                if (qzH6 == null) {
                    linkedListMultimap.A02 = qzH2;
                } else {
                    qzH6.A00 = qzH2;
                }
                qzH.A02 = qzH2;
                qzH.A03 = qzH2;
            }
            linkedListMultimap.A01++;
            return qzH2;
        }
        Map map = linkedListMultimap.A04;
        ? obj3 = new Object();
        obj3.A01 = qzH2;
        obj3.A02 = qzH2;
        qzH2.A03 = null;
        qzH2.A01 = null;
        obj3.A00 = 1;
        map.put(obj, obj3);
        linkedListMultimap.A00++;
        linkedListMultimap.A01++;
        return qzH2;
    }

    public static void A01(QzH qzH, LinkedListMultimap linkedListMultimap) {
        QzH qzH2 = qzH.A02;
        QzH qzH3 = qzH.A00;
        if (qzH2 != null) {
            qzH2.A00 = qzH3;
        } else {
            linkedListMultimap.A02 = qzH3;
        }
        QzH qzH4 = qzH.A00;
        if (qzH4 != null) {
            qzH4.A02 = qzH2;
        } else {
            linkedListMultimap.A03 = qzH2;
        }
        if (qzH.A03 == null && qzH.A01 == null) {
            C9131RQf rQf = (C9131RQf) linkedListMultimap.A04.remove(qzH.A05);
            rQf.getClass();
            rQf.A00 = 0;
            linkedListMultimap.A00++;
        } else {
            C9131RQf rQf2 = (C9131RQf) linkedListMultimap.A04.get(qzH.A05);
            rQf2.getClass();
            rQf2.A00--;
            QzH qzH5 = qzH.A03;
            QzH qzH6 = qzH.A01;
            if (qzH5 == null) {
                qzH6.getClass();
                rQf2.A01 = qzH6;
            } else {
                qzH5.A01 = qzH6;
            }
            QzH qzH7 = qzH.A01;
            QzH qzH8 = qzH.A03;
            if (qzH7 == null) {
                qzH8.getClass();
                rQf2.A02 = qzH8;
            } else {
                qzH7.A03 = qzH8;
            }
        }
        linkedListMultimap.A01--;
    }

    public static void A02(LinkedListMultimap linkedListMultimap, Object obj) {
        C13128TMm tMm = new C13128TMm(linkedListMultimap, obj);
        while (tMm.hasNext()) {
            tMm.next();
            tMm.remove();
        }
    }

    public final /* bridge */ /* synthetic */ Collection A04() {
        return new TS8(this);
    }

    public final Iterator A05() {
        throw new AssertionError(Pxd.A00(103));
    }

    public final Map A06() {
        return new R0w(this);
    }

    public final Set A07() {
        return new R1E(this);
    }

    public final /* bridge */ /* synthetic */ Collection AXL(Object obj) {
        return new TS9(this, obj);
    }

    public final /* bridge */ /* synthetic */ Collection EDC(Object obj) {
        C13128TMm tMm = new C13128TMm(this, obj);
        ArrayList arrayList = new ArrayList();
        C11307SKv.A02(arrayList, tMm);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        A02(this, obj);
        return unmodifiableList;
    }

    public final boolean containsKey(Object obj) {
        return this.A04.containsKey(obj);
    }

    public final boolean isEmpty() {
        if (this.A02 == null) {
            return true;
        }
        return false;
    }

    public final int size() {
        return this.A01;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.A04 = new CompactLinkedHashMap(3);
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            E5L(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.A01);
        for (Map.Entry entry : (List) super.ASn()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final /* bridge */ /* synthetic */ Collection ASn() {
        return super.ASn();
    }
}
