package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6IK  reason: invalid class name */
public final class AnonymousClass6IK implements AnonymousClass6IL {
    public float A00;
    public float A01;
    public AnonymousClass5Q8 A02 = AnonymousClass5Q8.Rtl;
    public final /* synthetic */ AnonymousClass6IJ A03;

    public final /* synthetic */ int EJS(float f) {
        return C289055cw.A01(this, f);
    }

    public final /* synthetic */ float Ezu(long j) {
        return C291905i4.A00(this, j);
    }

    public final /* synthetic */ float Ezw(int i) {
        return ((float) i) / this.A00;
    }

    public final /* synthetic */ long Ezx(long j) {
        return C289055cw.A03(this, j);
    }

    public final /* synthetic */ float F05(long j) {
        return C289055cw.A00(this, j);
    }

    public final /* synthetic */ long FH8(long j) {
        return C289055cw.A04(this, j);
    }

    public final /* synthetic */ long FH9(float f) {
        return C291905i4.A01(this, f);
    }

    public AnonymousClass6IK(AnonymousClass6IJ r2) {
        this.A03 = r2;
    }

    public final float AwL() {
        return this.A00;
    }

    public final float B77() {
        return this.A01;
    }

    public final boolean CWf() {
        Integer num = this.A03.A09.A0U.A06;
        if (num == AnonymousClass05K.A0N || num == AnonymousClass05K.A01) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ C289145d6 Cfi(Map map, 0sP r9, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if ((i & -16777216) == 0 && (-16777216 & i2) == 0) {
            return new AnonymousClass6JP(this, this.A03, map, r9, i3, i4);
        }
        I2E.A01(002.A0n("Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215.", i, i2));
        throw AnonymousClass00P.createAndThrow();
    }

    public final List Eyi(Object obj, 0sL r11) {
        AnonymousClass5R6 r3;
        String str;
        AnonymousClass6IJ r6 = this.A03;
        r6.A05();
        AnonymousClass5R6 r7 = r6.A09;
        Integer num = r7.A0U.A06;
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2 || num == AnonymousClass05K.A0C || num == AnonymousClass05K.A01 || num == AnonymousClass05K.A0N) {
            HashMap hashMap = r6.A0C;
            Object obj2 = hashMap.get(obj);
            AnonymousClass5R6 r32 = obj2;
            if (obj2 == null) {
                AnonymousClass5R6 r33 = (AnonymousClass5R6) r6.A0B.remove(obj);
                if (r33 != null) {
                    int i = r6.A02;
                    if (i > 0) {
                        r6.A02 = i - 1;
                        r3 = r33;
                    } else {
                        str = "Check failed.";
                    }
                } else {
                    AnonymousClass5R6 A002 = AnonymousClass6IJ.A00(r6, obj);
                    r3 = A002;
                    if (A002 == null) {
                        int i2 = r6.A00;
                        AnonymousClass5R6 r34 = new AnonymousClass5R6(true, AnonymousClass5R5.A00.addAndGet(1));
                        r7.A0J = true;
                        r7.A0V(r34, i2);
                        r7.A0J = false;
                        r3 = r34;
                    }
                }
                hashMap.put(obj, r3);
                r32 = r3;
            }
            AnonymousClass5R6 r35 = (AnonymousClass5R6) r32;
            if (00k.A0O(r7.A0G(), r6.A00) != r35) {
                int indexOf = r7.A0G().indexOf(r35);
                int i3 = r6.A00;
                if (indexOf < i3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Key \"");
                    sb.append(obj);
                    sb.append("\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                    throw new IllegalArgumentException(sb.toString());
                } else if (i3 != indexOf) {
                    AnonymousClass6IJ.A01(r6, indexOf, i3);
                }
            }
            r6.A00++;
            AnonymousClass6IJ.A02(r6, r35, obj, r11);
            if (num == num2 || num == AnonymousClass05K.A0C) {
                return r35.A0U.A0J.A0K();
            }
            return r35.A0E();
        }
        str = "subcompose can only be used inside the measure or layout blocks";
        I2E.A01(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ float Ezv(float f) {
        return f / this.A00;
    }

    public final /* synthetic */ float F06(float f) {
        return f * this.A00;
    }

    public final AnonymousClass5Q8 getLayoutDirection() {
        return this.A02;
    }

    public final /* synthetic */ long FHA(float f) {
        return FH9(Ezv(f));
    }
}
