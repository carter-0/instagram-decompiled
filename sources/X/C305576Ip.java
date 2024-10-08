package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Ip  reason: invalid class name and case insensitive filesystem */
public final class C305576Ip implements C268004cb, C305586Iq {
    public final AnonymousClass6I5 A00;
    public final AnonymousClass6J1 A01;
    public final AnonymousClass6IL A02;
    public final HashMap A03 = new HashMap();

    public final float AwL() {
        return this.A02.AwL();
    }

    public final float B77() {
        return this.A02.B77();
    }

    public final boolean CWf() {
        return this.A02.CWf();
    }

    public final C289145d6 Cfi(Map map, 0sP r3, int i, int i2) {
        return this.A02.Cfi(map, r3, i, i2);
    }

    public final int EJS(float f) {
        return this.A02.EJS(f);
    }

    public final float F05(long j) {
        return this.A02.F05(j);
    }

    public final float F06(float f) {
        return this.A02.F06(f);
    }

    public final AnonymousClass5Q8 getLayoutDirection() {
        return this.A02.getLayoutDirection();
    }

    public final List Cnw(int i, long j) {
        HashMap hashMap = this.A03;
        Integer valueOf = Integer.valueOf(i);
        List list = (List) hashMap.get(valueOf);
        ArrayList arrayList = list;
        if (list == null) {
            AnonymousClass6J1 r0 = this.A01;
            Object BK0 = r0.BK0(i);
            List Eyi = this.A02.Eyi(BK0, this.A00.A01(BK0, r0.Aqn(i), i));
            int size = Eyi.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(((C268074ci) Eyi.get(i2)).Cnz(j));
            }
            hashMap.put(valueOf, arrayList2);
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public final float Ezu(long j) {
        return this.A02.Ezu(j);
    }

    public final float Ezv(float f) {
        return this.A02.Ezv(f);
    }

    public final float Ezw(int i) {
        return this.A02.Ezw(i);
    }

    public final long Ezx(long j) {
        return this.A02.Ezx(j);
    }

    public final long FH8(long j) {
        return this.A02.FH8(j);
    }

    public final long FH9(float f) {
        return this.A02.FH9(f);
    }

    public final long FHA(float f) {
        return this.A02.FHA(f);
    }

    public C305576Ip(AnonymousClass6I5 r2, AnonymousClass6IL r3) {
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = (AnonymousClass6J1) r2.A01.invoke();
    }
}
