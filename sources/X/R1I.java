package X;

import com.google.common.collect.LinkedHashMultimap;
import java.util.Arrays;
import java.util.Iterator;

public final class R1I extends TSD<V> implements C13787Th2<K, V> {
    public int A00 = 0;
    public int A01 = 0;
    public C13787Th2 A02;
    public C13787Th2 A03;
    public final Object A04;
    public final /* synthetic */ LinkedHashMultimap A05;
    public LinkedHashMultimap.ValueEntry[] hashTable;

    public R1I(LinkedHashMultimap linkedHashMultimap, Object obj, int i) {
        this.A05 = linkedHashMultimap;
        this.A04 = obj;
        this.A02 = this;
        this.A03 = this;
        this.hashTable = new LinkedHashMultimap.ValueEntry[1J7.A00(i)];
    }

    public final C13787Th2 C2i() {
        return this.A02;
    }

    public final void EgO(C13787Th2 th2) {
        this.A03 = th2;
    }

    public final void EnU(C13787Th2 th2) {
        this.A02 = th2;
    }

    public final void clear() {
        Arrays.fill(this.hashTable, (Object) null);
        this.A01 = 0;
        for (C13787Th2 th2 = this.A02; th2 != this; th2 = th2.C2i()) {
            LinkedHashMultimap.ValueEntry valueEntry = (LinkedHashMultimap.ValueEntry) th2;
            LinkedHashMultimap.ValueEntry valueEntry2 = valueEntry.predecessorInMultimap;
            valueEntry2.getClass();
            LinkedHashMultimap.ValueEntry valueEntry3 = valueEntry.successorInMultimap;
            valueEntry3.getClass();
            valueEntry2.successorInMultimap = valueEntry3;
            valueEntry3.predecessorInMultimap = valueEntry2;
        }
        this.A02 = this;
        this.A03 = this;
        this.A00++;
    }

    public final Iterator iterator() {
        return new TMZ(this);
    }

    public final int size() {
        return this.A01;
    }

    public final boolean add(Object obj) {
        int A022 = 1J7.A02(obj);
        LinkedHashMultimap.ValueEntry[] valueEntryArr = this.hashTable;
        int length = (valueEntryArr.length - 1) & A022;
        LinkedHashMultimap.ValueEntry valueEntry = valueEntryArr[length];
        for (LinkedHashMultimap.ValueEntry valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
            if (valueEntry2.smearedValueHash == A022 && 2PP.A00(valueEntry2.getValue(), obj)) {
                return false;
            }
        }
        LinkedHashMultimap.ValueEntry valueEntry3 = new LinkedHashMultimap.ValueEntry(valueEntry, this.A04, obj, A022);
        C13787Th2 th2 = this.A03;
        th2.EnU(valueEntry3);
        valueEntry3.predecessorInValueSet = th2;
        valueEntry3.successorInValueSet = this;
        this.A03 = valueEntry3;
        LinkedHashMultimap linkedHashMultimap = this.A05;
        LinkedHashMultimap.ValueEntry valueEntry4 = linkedHashMultimap.A00.predecessorInMultimap;
        valueEntry4.getClass();
        valueEntry4.successorInMultimap = valueEntry3;
        valueEntry3.predecessorInMultimap = valueEntry4;
        LinkedHashMultimap.ValueEntry valueEntry5 = linkedHashMultimap.A00;
        valueEntry3.successorInMultimap = valueEntry5;
        valueEntry5.predecessorInMultimap = valueEntry3;
        LinkedHashMultimap.ValueEntry[] valueEntryArr2 = this.hashTable;
        valueEntryArr2[length] = valueEntry3;
        int i = this.A01 + 1;
        this.A01 = i;
        this.A00++;
        int length2 = valueEntryArr2.length;
        if (((double) i) <= 1.0d * ((double) length2) || length2 >= 1073741824) {
            return true;
        }
        int i2 = length2 * 2;
        LinkedHashMultimap.ValueEntry[] valueEntryArr3 = new LinkedHashMultimap.ValueEntry[i2];
        this.hashTable = valueEntryArr3;
        int i3 = i2 - 1;
        for (C13787Th2 th22 = this.A02; th22 != this; th22 = th22.C2i()) {
            LinkedHashMultimap.ValueEntry valueEntry6 = (LinkedHashMultimap.ValueEntry) th22;
            int i4 = valueEntry6.smearedValueHash & i3;
            valueEntry6.nextInValueBucket = valueEntryArr3[i4];
            valueEntryArr3[i4] = valueEntry6;
        }
        return true;
    }

    public final boolean contains(Object obj) {
        int A022 = 1J7.A02(obj);
        LinkedHashMultimap.ValueEntry[] valueEntryArr = this.hashTable;
        for (LinkedHashMultimap.ValueEntry valueEntry = valueEntryArr[(valueEntryArr.length - 1) & A022]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
            if (valueEntry.smearedValueHash == A022 && 2PP.A00(valueEntry.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean remove(Object obj) {
        int A022 = 1J7.A02(obj);
        LinkedHashMultimap.ValueEntry[] valueEntryArr = this.hashTable;
        int length = (valueEntryArr.length - 1) & A022;
        LinkedHashMultimap.ValueEntry valueEntry = valueEntryArr[length];
        LinkedHashMultimap.ValueEntry valueEntry2 = null;
        while (valueEntry != null) {
            if (valueEntry.smearedValueHash != A022 || !2PP.A00(valueEntry.getValue(), obj)) {
                valueEntry2 = valueEntry;
                valueEntry = valueEntry.nextInValueBucket;
            } else {
                if (valueEntry2 == null) {
                    this.hashTable[length] = valueEntry.nextInValueBucket;
                } else {
                    valueEntry2.nextInValueBucket = valueEntry.nextInValueBucket;
                }
                C13787Th2 th2 = valueEntry.predecessorInValueSet;
                th2.getClass();
                C13787Th2 th22 = valueEntry.successorInValueSet;
                th22.getClass();
                th2.EnU(th22);
                th22.EgO(th2);
                LinkedHashMultimap.ValueEntry valueEntry3 = valueEntry.predecessorInMultimap;
                valueEntry3.getClass();
                LinkedHashMultimap.ValueEntry valueEntry4 = valueEntry.successorInMultimap;
                valueEntry4.getClass();
                valueEntry3.successorInMultimap = valueEntry4;
                valueEntry4.predecessorInMultimap = valueEntry3;
                this.A01--;
                this.A00++;
                return true;
            }
        }
        return false;
    }
}
