package X;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.Npp  reason: case insensitive filesystem */
public abstract class C69667Npp {
    public final Collection A00(Collection collection) {
        LinkedList linkedList;
        if (this instanceof C69246Ni0) {
            C69246Ni0 ni0 = (C69246Ni0) this;
            if (collection != null) {
                LinkedList linkedList2 = new LinkedList();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    if (A18 != null) {
                        linkedList2.add(A18.toLowerCase(ni0.A00));
                    }
                }
                linkedList = linkedList2;
            }
            throw null;
        } else if (this instanceof C69245Nhz) {
            C69245Nhz nhz = (C69245Nhz) this;
            if (collection != null) {
                LinkedList linkedList3 = new LinkedList();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    String A182 = AnonymousClass7TE.A18(it2);
                    if (A182 != null) {
                        BreakIterator breakIterator = nhz.A00;
                        breakIterator.setText(A182);
                        int first = breakIterator.first();
                        while (true) {
                            int next = breakIterator.next();
                            int i = first;
                            first = next;
                            if (next != -1) {
                                String substring = A182.substring(i, next);
                                if (Character.isLetterOrDigit(substring.charAt(0))) {
                                    linkedList3.add(substring);
                                }
                            }
                        }
                    }
                }
                linkedList = linkedList3;
            }
            throw null;
        } else if (this instanceof C69244Nhy) {
            C69244Nhy nhy = (C69244Nhy) this;
            if (collection != null) {
                LinkedList linkedList4 = new LinkedList();
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    String A183 = AnonymousClass7TE.A18(it3);
                    if (A183 != null) {
                        int i2 = 0;
                        while (true) {
                            int i3 = nhy.A00;
                            if (i3 + i2 <= A183.length()) {
                                linkedList4.add(A183.substring(i2, i3 + i2));
                                i2++;
                            }
                        }
                    }
                }
                linkedList = linkedList4;
            }
            throw null;
        } else {
            C69243Nhx nhx = (C69243Nhx) this;
            if (collection != null) {
                ArrayList A1D = AnonymousClass7TE.A1D(collection);
                ArrayList arrayList = A1D;
                for (C69667Npp npp : nhx.A00) {
                    if (npp != null) {
                        arrayList = npp.A00(arrayList);
                    }
                }
                linkedList = arrayList;
            }
            throw null;
        }
        return linkedList;
    }
}
