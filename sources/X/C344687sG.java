package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7sG  reason: invalid class name and case insensitive filesystem */
public final class C344687sG implements C344697sH {
    public C344687sG A00;
    public C344687sG A01;
    public final Handler A02;
    public final C344407ro A03;
    public final C344037rD A04;
    public final C344567s4 A05;
    public final C344707sI A06;
    public final C344717sJ A07;
    public final Map A08 = new HashMap();

    public C344687sG(C344407ro r3, C344567s4 r4, C344707sI r5, C344717sJ r6) {
        this.A03 = r3;
        this.A05 = r4;
        this.A02 = r4.A00;
        this.A06 = r5;
        this.A07 = r6;
        this.A04 = null;
    }

    public final int B9Q(int i) {
        C345037sp r0 = (C345037sp) this.A07.A00.get(0);
        if (r0 != null) {
            return r0.A06.A00.size();
        }
        return 0;
    }

    public final List B9R(int i) {
        C345037sp r0 = (C345037sp) this.A07.A00.get(0);
        if (r0 != null) {
            return r0.A06.A00;
        }
        throw new RuntimeException(002.A0O("GlOutput not set ", 0));
    }

    public final void A8c(C345097sv r9, int i) {
        C344717sJ r0 = this.A07;
        C344567s4 r1 = this.A05;
        C344717sJ.A00(r1, r0, i).A02(r1, r9);
        C344037rD r2 = this.A04;
        if (r2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("output_index", String.valueOf(i));
            hashMap.put("output_class", r9.getClass().getSimpleName());
            r2.CjJ((long) hashCode(), "media_pipeline_add_output", "MediaGraphIOImpl", hashMap);
        }
    }

    public final /* bridge */ /* synthetic */ C344687sG BDu() {
        C344687sG r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C344407ro r4 = this.A03;
        C344687sG r02 = new C344687sG(r4, this.A05, this.A06, new C344717sJ(r4));
        this.A00 = r02;
        return r02;
    }

    public final /* bridge */ /* synthetic */ C344687sG BDv() {
        C344687sG r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C344687sG r02 = new C344687sG(this.A03, this.A05, new C344707sI(), this.A07);
        this.A01 = r02;
        return r02;
    }

    public final C346287uv BHM(int i) {
        C346287uv r0 = (C346287uv) this.A06.A00.get(i);
        if (r0 != null) {
            return r0;
        }
        throw new RuntimeException(002.A0O("input not set ", i));
    }

    public final Object BHP(int i) {
        C346287uv r0 = (C346287uv) this.A06.A00.get(i);
        if (r0 != null) {
            return r0.BHO();
        }
        throw new RuntimeException(002.A0O("input not set ", i));
    }

    public final boolean CVW(int i) {
        if (this.A06.A00.get(i) != null) {
            return true;
        }
        return false;
    }

    public final void EDi(int i, Object obj) {
        C345037sp r0 = (C345037sp) this.A07.A00.get(i);
        if (r0 != null) {
            r0.A04(obj);
        }
        C344037rD r2 = this.A04;
        if (r2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("output_index", String.valueOf(i));
            r2.CjJ((long) hashCode(), "media_pipeline_remove_output", "MediaGraphIOImpl", hashMap);
        }
    }

    public final void EZt(C346287uv r9, int i) {
        C344707sI r4 = this.A06;
        C344567s4 r3 = this.A05;
        Handler handler = this.A02;
        if (r4.A00.get(i) != r9) {
            if (handler.getLooper() == Looper.myLooper()) {
                C344707sI.A00(r3, r9, r4, i);
            } else {
                handler.post(new C366488p0(r3, r9, r4, i));
            }
        }
        C344037rD r2 = this.A04;
        if (r2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("input_index", String.valueOf(i));
            r2.CjJ((long) hashCode(), "media_pipeline_add_input", "MediaGraphIOImpl", hashMap);
        }
    }

    public C344687sG(C344407ro r4, C344037rD r5, C344567s4 r6) {
        C344707sI r2 = new C344707sI();
        C344717sJ r1 = new C344717sJ(r4);
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r6.A00;
        this.A06 = r2;
        this.A07 = r1;
        this.A04 = r5;
    }
}
