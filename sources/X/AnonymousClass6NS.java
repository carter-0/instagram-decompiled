package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.android.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6NS  reason: invalid class name */
public final class AnonymousClass6NS {
    public C273694n2 A00;
    public final Object A01;
    public final Executor A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AtomicReference A04;
    public final AnonymousClass6NY A05;
    public final AnonymousClass6NZ A06;
    public final C307786Rm A07;
    public final C307446Qd A08;
    public final Object A09;
    public final List A0A;
    public final AtomicReference A0B;
    public final boolean A0C;

    public final void A03() {
        A05();
        C307476Qg.A09(A02());
        this.A03.set(true);
        C276984uE.A00().removeCallbacksAndMessages(this.A01);
        C276614tc.A03.incrementAndGet();
    }

    public static AnonymousClass6NR A00(Context context, C3034368u r2, C229392nJ r3) {
        return new AnonymousClass6NR(context, r2, r3);
    }

    public static void A01(AnonymousClass6NS r7) {
        AnonymousClass6SE r2;
        C307426Qb r22;
        synchronized (r7.A09) {
            if (!r7.A03.get()) {
                AnonymousClass6S3 r6 = (AnonymousClass6S3) r7.A04.get();
                Map map = (Map) r7.A0B.get();
                if (r6 == null || map == null) {
                    throw new IllegalStateException("TreeState was null but it should have been initialised by the constructor");
                }
                if (r7.A0C) {
                    r22 = new C56950IIu(r7.A07, r6, new SGl(r7.A08), map);
                } else {
                    AnonymousClass6S6 r0 = ((AnonymousClass6NX) r7.A05).A00;
                    if (r0 != null) {
                        r2 = r0.A01;
                    } else {
                        r2 = null;
                    }
                    r22 = new C307416Qa(new AnonymousClass6QY(r7.A07, r6, r2, map));
                }
                AnonymousClass6NZ.A00(r22, r7.A06, true);
            }
        }
    }

    public final C307786Rm A02() {
        if (this.A03.get()) {
            1Kn.A02("BloksHostingComponent", "Trying to access a BloksContext form a destroyed BloksHostingComponent");
        }
        return this.A07;
    }

    public final void A05() {
        if (this.A03.get()) {
            1Kn.A02("BloksHostingComponent", "Trying to detach a view from a destroyed BloksHostingComponent");
            return;
        }
        C273694n2 r2 = this.A00;
        if (r2 != null) {
            r2.setTag(R.id.bk_context_debug, (Object) null);
            this.A00.setRenderState((AnonymousClass6NZ) null);
            this.A00 = null;
        }
    }

    public final void A06() {
        if (this.A03.get()) {
            1Kn.A02("BloksHostingComponent", "Notifying bounds on a destroyed BloksHostingComponent");
            return;
        }
        C273694n2 r0 = this.A00;
        if (r0 != null) {
            r0.CsJ();
        }
    }

    public final void A07(C273694n2 r3) {
        if (this.A03.get()) {
            1Kn.A02("BloksHostingComponent", "Trying to attach a view to a destroyed BloksHostingComponent");
            return;
        }
        C273694n2 r0 = this.A00;
        if (!(r0 == null || r0 == r3)) {
            A05();
        }
        this.A00 = r3;
        r3.setRenderState(this.A06);
        this.A00.requestLayout();
        C64361Kj.A00();
    }

    public final void A08(Map map) {
        if (this.A03.get()) {
            1Kn.A02("BloksHostingComponent", "Trying to update variables on a destroyed BloksHostingComponent");
            return;
        }
        boolean z = false;
        HashMap A052 = C3034368u.A05(this.A0A, map);
        AtomicReference atomicReference = this.A0B;
        Map map2 = (Map) atomicReference.get();
        if (map2 != null) {
            Map map3 = map2;
            for (Map.Entry entry : A052.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (map2.get(key) != value) {
                    if (map3 == map2) {
                        z = true;
                        map3 = new HashMap(map2);
                    }
                    map3.put(key, value);
                }
            }
            if (z) {
                atomicReference.set(map3);
                A01(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("External variables should never be set to null");
    }

    public AnonymousClass6NS(Context context, SparseArray sparseArray, C3034368u r16, C229392nJ r17, Map map, Map map2) {
        AnonymousClass6NY r9;
        boolean z = false;
        AtomicReference atomicReference = new AtomicReference();
        this.A04 = atomicReference;
        this.A09 = new Object();
        this.A01 = new Object();
        AnonymousClass6NT r11 = new AnonymousClass6NT(this);
        this.A02 = r11;
        C3034368u r8 = r16;
        List list = r8.A01.A02;
        this.A0A = list;
        C229392nJ r7 = r17;
        C229682nr AgI = r7.AgE().AgI();
        C276614tc.A01.incrementAndGet();
        SparseArray clone = sparseArray.clone();
        clone.put(R.id.bk_context_key_render_callback_queue, new AnonymousClass6QX(AgI.Cfn()));
        sparseArray.get(R.id.bk_context_key_app_id);
        z = C276714tm.A00() ? true : z;
        clone.put(R.id.bk_context_key_is_signals_enabled, Boolean.valueOf(z));
        this.A0C = z;
        C307446Qd r1 = new C307446Qd(r8, r7.AgE().AgJ(), C307436Qc.A00);
        String str = r8.A03;
        Context context2 = context;
        C307786Rm A012 = C307476Qg.A01(context, clone, r1, r7, str);
        this.A07 = A012;
        C307446Qd A022 = C307476Qg.A02(A012);
        this.A08 = A022;
        this.A0B = new AtomicReference(C3034368u.A05(list, map));
        if (z) {
            r9 = new C56949IIt(A022);
        } else {
            r9 = new AnonymousClass6NX(A022);
        }
        this.A05 = r9;
        this.A06 = new AnonymousClass6NZ(context2, r9, A012, r11, C307806Ro.A00(A012));
        1FH.A00((Object) null, A022.A04(A012, new C306676Nb(this), map2), atomicReference);
        A01(this);
    }

    public final void A04() {
        A05();
    }
}
