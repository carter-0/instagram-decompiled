package com.facebook.yoga;

import X.002;
import X.AnonymousClass05K;
import X.AnonymousClass2T1;
import X.C20887X2r;
import X.C244143ai;
import X.C244983c4;
import X.C245003c8;
import X.C245033cB;
import X.C245093cJ;
import X.C245103cK;
import java.util.ArrayList;
import java.util.List;

public abstract class YogaNodeJNIBase extends C245003c8 implements Cloneable {
    public float[] arr;
    public C20887X2r mBaselineFunction;
    public List mChildren;
    public C244983c4 mConfig;
    public Object mData;
    public boolean mHasNewLayout;
    public int mLayoutDirection;
    public AnonymousClass2T1 mMeasureFunction;
    public long mNativePointer;
    public YogaNodeJNIBase mOwner;

    public static C245093cJ valueFromLong(long j) {
        Integer num;
        float intBitsToFloat = Float.intBitsToFloat((int) j);
        int i = (int) (j >> 32);
        if (i == 0) {
            num = AnonymousClass05K.A00;
        } else if (i == 1) {
            num = AnonymousClass05K.A01;
        } else if (i == 2) {
            num = AnonymousClass05K.A0C;
        } else if (i == 3) {
            num = AnonymousClass05K.A0N;
        } else {
            throw new IllegalArgumentException(002.A0O("Unknown enum value: ", i));
        }
        return new C245093cJ(num, intBitsToFloat);
    }

    public final long measure(float f, int i, float f2, int i2) {
        C245103cK r2;
        C245103cK r3;
        AnonymousClass2T1 r1 = this.mMeasureFunction;
        if (r1 != null) {
            if (i == 0) {
                r2 = C245103cK.UNDEFINED;
            } else if (i == 1) {
                r2 = C245103cK.EXACTLY;
            } else if (i == 2) {
                r2 = C245103cK.AT_MOST;
            } else {
                throw new IllegalArgumentException(002.A0O("Unknown enum value: ", i));
            }
            if (i2 == 0) {
                r3 = C245103cK.UNDEFINED;
            } else if (i2 == 1) {
                r3 = C245103cK.EXACTLY;
            } else if (i2 == 2) {
                r3 = C245103cK.AT_MOST;
            } else {
                throw new IllegalArgumentException(002.A0O("Unknown enum value: ", i2));
            }
            return r1.Cnu(r2, r3, this, f, f2);
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List list = this.mChildren;
        if (list != null) {
            list.remove(i);
            this.mChildren.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.mOwner = this;
            return yogaNodeJNIBase.mNativePointer;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    public void addChildAt(C245003c8 r5, int i) {
        if (r5 instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) r5;
            if (yogaNodeJNIBase.mOwner == null) {
                List list = this.mChildren;
                if (list == null) {
                    list = new ArrayList(4);
                    this.mChildren = list;
                }
                list.add(i, yogaNodeJNIBase);
                yogaNodeJNIBase.mOwner = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.mNativePointer, yogaNodeJNIBase.mNativePointer, i);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    public final float baseline(float f, float f2) {
        return this.mBaselineFunction.AD8(this, f, f2);
    }

    public void calculateLayout(float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            List<Object> list = ((YogaNodeJNIBase) arrayList.get(i)).mChildren;
            if (list != null) {
                for (Object add : list) {
                    arrayList.add(add);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        int length = yogaNodeJNIBaseArr.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].mNativePointer;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.mNativePointer, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    public float getLayoutBorder(C244143ai r7) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i = 0;
        int i2 = (int) fArr[0];
        if ((i2 & 4) != 4) {
            return 0.0f;
        }
        int i3 = 4;
        if ((i2 & 1) == 1) {
            i3 = 0;
        }
        int i4 = 14 - i3;
        if ((i2 & 2) != 2) {
            i = 4;
        }
        int i5 = i4 - i;
        switch (r7.ordinal()) {
            case 0:
                break;
            case 1:
                i5++;
                break;
            case 2:
                i5 += 2;
                break;
            default:
                i5 += 3;
                break;
        }
        return fArr[i5];
    }

    public C245033cB getLayoutDirection() {
        int i;
        float[] fArr = this.arr;
        if (fArr != null) {
            i = (int) fArr[5];
        } else {
            i = this.mLayoutDirection;
        }
        if (i == 0) {
            return C245033cB.INHERIT;
        }
        if (i == 1) {
            return C245033cB.LTR;
        }
        if (i == 2) {
            return C245033cB.RTL;
        }
        throw new IllegalArgumentException(002.A0O("Unknown enum value: ", i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (getLayoutDirection() == X.C245033cB.A04) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (getLayoutDirection() == X.C245033cB.A04) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float getLayoutPadding(X.C244143ai r6) {
        /*
            r5 = this;
            float[] r4 = r5.arr
            if (r4 == 0) goto L_0x0040
            r3 = 0
            r0 = r4[r3]
            int r2 = (int) r0
            r1 = 2
            r0 = r2 & 2
            if (r0 != r1) goto L_0x0040
            r1 = 1
            r0 = r2 & 1
            if (r0 == r1) goto L_0x0013
            r3 = 4
        L_0x0013:
            int r2 = 10 - r3
            int r0 = r6.ordinal()
            switch(r0) {
                case 0: goto L_0x0032;
                case 1: goto L_0x0024;
                case 2: goto L_0x003d;
                case 3: goto L_0x0027;
                case 4: goto L_0x0035;
                case 5: goto L_0x002a;
                default: goto L_0x001c;
            }
        L_0x001c:
            java.lang.String r1 = "Cannot get layout paddings of multi-edge shorthands"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0024:
            int r2 = r2 + 1
            goto L_0x0032
        L_0x0027:
            int r2 = r2 + 3
            goto L_0x0032
        L_0x002a:
            X.3cB r1 = r5.getLayoutDirection()
            X.3cB r0 = X.C245033cB.RTL
            if (r1 != r0) goto L_0x003d
        L_0x0032:
            r0 = r4[r2]
            return r0
        L_0x0035:
            X.3cB r1 = r5.getLayoutDirection()
            X.3cB r0 = X.C245033cB.RTL
            if (r1 != r0) goto L_0x0032
        L_0x003d:
            int r2 = r2 + 2
            goto L_0x0032
        L_0x0040:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaNodeJNIBase.getLayoutPadding(X.3ai):float");
    }

    public /* bridge */ /* synthetic */ C245003c8 removeChildAt(int i) {
        List list = this.mChildren;
        if (list != null) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) list.remove(i);
            yogaNodeJNIBase.mOwner = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.mNativePointer, yogaNodeJNIBase.mNativePointer);
            return yogaNodeJNIBase;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    public YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        if (j != 0) {
            this.mNativePointer = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    public YogaNodeJNIBase cloneWithChildren() {
        int i;
        try {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) super.clone();
            List list = yogaNodeJNIBase.mChildren;
            if (list != null) {
                yogaNodeJNIBase.mChildren = new ArrayList(list);
            }
            long jni_YGNodeCloneJNI = YogaNative.jni_YGNodeCloneJNI(this.mNativePointer);
            yogaNodeJNIBase.mOwner = null;
            yogaNodeJNIBase.mNativePointer = jni_YGNodeCloneJNI;
            int i2 = 0;
            while (true) {
                List list2 = yogaNodeJNIBase.mChildren;
                if (list2 == null) {
                    i = 0;
                } else {
                    i = list2.size();
                }
                if (i2 >= i) {
                    return yogaNodeJNIBase;
                }
                List list3 = yogaNodeJNIBase.mChildren;
                if (list3 != null) {
                    YogaNodeJNIBase cloneWithChildren = ((YogaNodeJNIBase) list3.get(i2)).cloneWithChildren();
                    yogaNodeJNIBase.mChildren.remove(i2);
                    yogaNodeJNIBase.mChildren.add(i2, cloneWithChildren);
                    cloneWithChildren.mOwner = yogaNodeJNIBase;
                    YogaNative.jni_YGNodeSwapChildJNI(yogaNodeJNIBase.mNativePointer, cloneWithChildren.mNativePointer, i2);
                    i2++;
                } else {
                    throw new IllegalStateException("YogaNode does not have children");
                }
            }
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public /* bridge */ /* synthetic */ C245003c8 cloneWithoutChildren() {
        try {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) super.clone();
            long jni_YGNodeCloneJNI = YogaNative.jni_YGNodeCloneJNI(this.mNativePointer);
            yogaNodeJNIBase.mOwner = null;
            yogaNodeJNIBase.mNativePointer = jni_YGNodeCloneJNI;
            yogaNodeJNIBase.mChildren = null;
            YogaNative.jni_YGNodeRemoveAllChildrenJNI(jni_YGNodeCloneJNI);
            return yogaNodeJNIBase;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }
}
