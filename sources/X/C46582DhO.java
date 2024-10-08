package X;

import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import com.instagram.android.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DhO  reason: case insensitive filesystem */
public final class C46582DhO implements C360008dq {
    public C273694n2 A00 = null;
    public AnonymousClass6NS A01 = null;
    public final Context A02;
    public final SparseArray A03;
    public final C46587DhT A04 = new C46587DhT(Looper.getMainLooper(), new C46588DhU(this));
    public final C229392nJ A05;
    public final C360018dr A06;
    public final Map A07;
    public final Map A08;
    public final Set A09 = AnonymousClass7TE.A1F();
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final AtomicReference A0B = new AtomicReference();
    public volatile boolean A0C = false;

    public static void A00(C46582DhO dhO, int i) {
        AnonymousClass3M5 r1 = (AnonymousClass3M5) dhO.A0B.get();
        if (r1 != null) {
            1KZ.A01(002.A0O("BloksSurface_notify_on_render_surface_", i));
            try {
                r1.Ddp(i);
            } finally {
                1KZ.A00();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static void A01(C46582DhO dhO, C361128fi r6, int i, int i2) {
        A00(dhO, 10);
        C46584DhQ dhQ = new C46584DhQ(dhO, i2);
        1KZ.A01("BloksSurface_create_bloks_hosting_component");
        try {
            Map map = dhO.A08;
            map.putAll(r6.A03);
            AnonymousClass6NR A002 = AnonymousClass6NS.A00(dhO.A02, r6.A00, dhO.A05);
            A002.A01 = map;
            A002.A02 = dhO.A07;
            SparseArray clone = dhO.A03.clone();
            clone.put(R.id.bloks_surface_on_data_rendered_runnable, dhQ);
            A002.A00 = clone;
            AnonymousClass6NS A003 = A002.A00();
            1KZ.A00();
            C46585DhR dhR = new C46585DhR(A003, i);
            C46587DhT dhT = dhO.A04;
            dhT.A00(dhT.obtainMessage(1, dhR));
        } catch (Throwable th) {
            1KZ.A00();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r3 == 2) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DfA(X.C360018dr r7) {
        /*
            r6 = this;
            X.8fh r0 = r7.A00
            int r3 = r0.A00
            r2 = 4
            if (r3 == r2) goto L_0x003a
            r0 = 5
            if (r3 == r0) goto L_0x003a
            r1 = 3
            r5 = 1
            r0 = 0
            if (r3 != r1) goto L_0x0011
            r0 = 1
            r2 = 5
        L_0x0011:
            A00(r6, r2)
            if (r0 != 0) goto L_0x003a
            r0 = 6
            A00(r6, r0)
            if (r3 == 0) goto L_0x0022
            if (r3 == r5) goto L_0x0022
            r0 = 2
            r1 = -1
            if (r3 != r0) goto L_0x0024
        L_0x0022:
            r1 = 9
        L_0x0024:
            boolean r0 = r7 instanceof X.C361128fi
            r4 = 7
            if (r0 == 0) goto L_0x003b
            X.8fi r7 = (X.C361128fi) r7
            boolean r0 = r6.A0C
            r3 = 13
            r2 = 12
            if (r0 == 0) goto L_0x004f
            java.util.List r1 = r7.A02
            java.util.Map r0 = r7.A03
            r6.A02(r1, r0, r2, r3)
        L_0x003a:
            return
        L_0x003b:
            boolean r0 = r7 instanceof X.C385529j5
            if (r0 == 0) goto L_0x003a
            X.9j5 r7 = (X.C385529j5) r7
            X.Di0 r0 = r7.A00
            java.util.List r2 = java.util.Collections.singletonList(r0)
            java.util.Map r1 = r7.A01
            r0 = 11
            r6.A02(r2, r1, r0, r4)
            return
        L_0x004f:
            A01(r6, r7, r4, r1)
            java.util.List r1 = r7.A02
            java.util.Map r0 = r7.A03
            r6.A02(r1, r0, r2, r3)
            r6.A0C = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46582DhO.DfA(X.8dr):void");
    }

    public C46582DhO(Context context, SparseArray sparseArray, C3034368u r7, C229392nJ r8, Map map, Map map2) {
        C361128fi r2 = null;
        this.A05 = r8;
        this.A02 = context;
        this.A03 = sparseArray;
        this.A06 = r7 != null ? new C361128fi(r7, C361118fh.A02) : r2;
        this.A08 = map;
        this.A07 = map2;
    }

    private void A02(List list, Map map, int i, int i2) {
        if (!list.isEmpty()) {
            A00(this, i);
            C46587DhT dhT = this.A04;
            dhT.A00(dhT.obtainMessage(2, new C47044Dpe(list, map, i2)));
        }
    }
}
