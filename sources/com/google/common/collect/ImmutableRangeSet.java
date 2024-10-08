package com.google.common.collect;

import X.C11031S6j;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class ImmutableRangeSet extends C11031S6j implements Serializable {
    public static final ImmutableRangeSet A01 = new ImmutableRangeSet(ImmutableList.of(Range.A00));
    public static final ImmutableRangeSet A02 = new ImmutableRangeSet(ImmutableList.of());
    public final transient ImmutableList A00;

    public final class SerializedForm implements Serializable {
        public final ImmutableList ranges;

        public Object readResolve() {
            if (this.ranges.isEmpty()) {
                return ImmutableRangeSet.A02;
            }
            if (this.ranges.equals(ImmutableList.of(Range.A00))) {
                return ImmutableRangeSet.A01;
            }
            return new ImmutableRangeSet(this.ranges);
        }

        public SerializedForm(ImmutableList immutableList) {
            this.ranges = immutableList;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public Object writeReplace() {
        return new SerializedForm(this.A00);
    }

    public ImmutableRangeSet(ImmutableList immutableList) {
        this.A00 = immutableList;
    }
}
