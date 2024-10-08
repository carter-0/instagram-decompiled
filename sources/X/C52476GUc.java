package X;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.GUc  reason: case insensitive filesystem */
public final class C52476GUc extends C231262rJ implements C231272rL, C59609JQd, C231302rO, C231312rP, C231322rQ, AnonymousClass7Q7, AnonymousClass2rS {
    public AnonymousClass310 A00;
    public boolean A01;
    public final C231602rw A02;
    public final AnonymousClass4DU A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final Map A05 = AnonymousClass7TE.A1E();
    public final Map A06 = AnonymousClass7TE.A1E();
    public final Map A07 = AnonymousClass7TE.A1E();
    public final Map A08 = AnonymousClass7TE.A1E();
    public final Map A09 = AnonymousClass7TE.A1E();
    public final Map A0A = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A0B;
    public final Context A0C;
    public final FragmentActivity A0D;
    public final AnonymousClass2s2 A0E;
    public final AnonymousClass0iw A0F;
    public final 0xF A0G;
    public final UserSession A0H;
    public final JT2 A0I;
    public final AnonymousClass57L A0J;
    public final H48 A0K;
    public final AnonymousClass2s3 A0L;
    public final C231622ry A0M;
    public final GTP A0N;
    public final C231712s9 A0O;
    public final C231782sN A0P;
    public final 1sy A0Q;
    public final C232542tt A0R;
    public final C231742sF A0S;
    public final C231692s7 A0T;
    public final C230072os A0U;
    public final C232552tv A0V;
    public final AnonymousClass2tu A0W;
    public final C229122ms A0X;
    public final C231762sK A0Y;
    public final H47 A0Z;
    public final Map A0a = AnonymousClass7TE.A1E();
    public final Map A0b = AnonymousClass7TE.A1E();
    public final Set A0c = AnonymousClass7TE.A1F();
    public final Set A0d = AnonymousClass7TE.A1F();
    public final Set A0e = AnonymousClass7TE.A1F();
    public final boolean A0f;
    public final boolean A0g;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.5jX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: X.5jX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: X.5O4} */
    /* JADX WARNING: type inference failed for: r0v42, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e0, code lost:
        if (r14 == X.1UQ.A0t) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f1, code lost:
        if (r0 != -1) goto L_0x02b1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C52476GUc r23) {
        /*
            r8 = 1
            r19 = 2
            r9 = r23
            r9.A01 = r8
            X.2rX r7 = r9.A00
            X.IWI r7 = (X.IWI) r7
            r7.A02()
            r9.clear()
            java.util.List r6 = r9.A04
            r6.clear()
            java.util.Set r0 = r9.A0d
            r23 = r0
            r23.clear()
            java.util.Set r0 = r9.A0c
            r22 = r0
            r22.clear()
            java.util.Map r5 = r9.A07
            r5.clear()
            java.util.Set r0 = r9.A0e
            r21 = r0
            r21.clear()
            X.2s2 r1 = r9.A0E
            r0 = 0
            r9.addModel(r0, r1)
            java.util.HashSet r18 = X.AnonymousClass7TE.A1F()
            X.3Bb r1 = X.C238233Bb.A02
            X.0qQ.A07(r1)
            android.util.SparseArray r0 = r1.A00
            r20 = r0
            r20.clear()
            android.util.SparseArray r10 = r1.A01
            r10.clear()
            java.util.List r0 = r7.A01
            int r17 = r0.size()
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x0054:
            r0 = r17
            if (r3 >= r0) goto L_0x02ce
            java.util.List r0 = r7.A01
            java.lang.Object r11 = r0.get(r3)
            boolean r0 = r11 instanceof X.1Xj
            java.lang.String r15 = "Required value was null."
            if (r0 == 0) goto L_0x00d9
            r13 = r11
            X.1Xj r13 = (X.1Xj) r13
            X.3W1 r12 = r9.BQr(r13)
            X.3WA r1 = r12.A0m
            X.3WA r0 = X.AnonymousClass3WA.A0F
            if (r1 == r0) goto L_0x007c
            java.lang.String r1 = r13.getId()
            if (r1 == 0) goto L_0x02bf
            r0 = r18
            r0.add(r1)
        L_0x007c:
            boolean r0 = r13.CcK()
            if (r0 == 0) goto L_0x008c
            X.4ai r1 = X.C267004ai.AD
            r0 = r20
            r0.put(r3, r1)
            r10.put(r3, r1)
        L_0x008c:
            r13.A3q()
            r12.A0D(r2)
            X.2ry r14 = r9.A0M
            if (r14 == 0) goto L_0x00cd
            boolean r0 = r14.A03(r13)
            if (r0 != r8) goto L_0x00cd
            X.2rv r0 = X.C231592rv.FULL_HEIGHT_SINGLE_MEDIA
            int r1 = r0.ordinal()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r14.E3r(r13, r12, r0, r1)
            int r13 = r9.addModel(r11, r12, r14)
            r12 = 0
        L_0x00ac:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r6.add(r1)
            r0 = r23
            r0.add(r1)
            int r13 = r13 + r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r12 = r11
            X.1Nv r12 = (X.1Nv) r12
        L_0x00c0:
            X.HiT r0 = new X.HiT
            r0.<init>(r12)
            r5.put(r1, r0)
        L_0x00c8:
            int r2 = r2 + 1
        L_0x00ca:
            int r3 = r3 + 1
            goto L_0x0054
        L_0x00cd:
            X.1Xg r1 = X.1Xi.A01(r13)
            X.2s3 r0 = r9.A0L
            int r13 = r9.addModel(r1, r12, r0)
            r12 = 1
            goto L_0x00ac
        L_0x00d9:
            boolean r0 = r11 instanceof X.AnonymousClass3OA
            if (r0 == 0) goto L_0x0128
            r12 = r11
            X.3OA r12 = (X.AnonymousClass3OA) r12
            X.1Xj r14 = r12.A0K
            X.3W1 r13 = r9.BQr(r14)
            r13.A0D(r2)
            X.4ai r1 = X.C267004ai.AD
            r0 = r20
            r0.put(r3, r1)
            r10.put(r3, r1)
            X.2ry r15 = r9.A0M
            if (r15 == 0) goto L_0x0120
            boolean r0 = r15.A03(r14)
            if (r0 != r8) goto L_0x0120
            int r16 = r9.addModel(r14, r13, r15)
            X.2rv r0 = X.C231592rv.FULL_HEIGHT_SINGLE_MEDIA
            int r1 = r0.ordinal()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r15.E3r(r14, r13, r0, r1)
            r11 = 0
        L_0x010d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r6.add(r1)
            r0 = r23
            r0.add(r1)
            int r16 = r16 + r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            goto L_0x00c0
        L_0x0120:
            X.H48 r0 = r9.A0K
            int r16 = r9.addModel(r11, r13, r0)
            r11 = 1
            goto L_0x010d
        L_0x0128:
            boolean r0 = r11 instanceof X.C274594oe
            if (r0 == 0) goto L_0x016a
            r13 = r11
            X.4oe r13 = (X.C274594oe) r13
            X.0qQ.A0B(r13, r4)
            java.util.Map r1 = r9.A0A
            X.4oc r0 = r13.A03
            java.lang.String r0 = r0.A09
            java.lang.Object r12 = r1.get(r0)
            X.5O4 r12 = (X.AnonymousClass5O4) r12
            if (r12 != 0) goto L_0x014c
            X.5O4 r12 = new X.5O4
            r12.<init>()
            if (r0 != 0) goto L_0x0149
            java.lang.String r0 = ""
        L_0x0149:
            r1.put(r0, r12)
        L_0x014c:
            r12.A00 = r2
            java.util.List r0 = r13.A09
            java.util.Iterator r1 = r0.iterator()
        L_0x0154:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0166
            X.1Xj r0 = X.C51966G9m.A0t(r1)
            X.3W1 r0 = r9.BQr(r0)
            r0.A0D(r2)
            goto L_0x0154
        L_0x0166:
            X.2sN r0 = r9.A0P
            goto L_0x02ad
        L_0x016a:
            boolean r0 = r11 instanceof X.AnonymousClass3Y6
            if (r0 == 0) goto L_0x01af
            r13 = r11
            X.3Y6 r13 = (X.AnonymousClass3Y6) r13
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r13.A0E = r0
            java.util.Map r1 = r9.A06
            java.lang.String r0 = r13.getId()
            java.lang.Object r12 = r1.get(r0)
            X.5jX r12 = (X.C292795jX) r12
            if (r12 != 0) goto L_0x018f
            X.5jX r12 = new X.5jX
            r12.<init>()
            java.lang.String r0 = r13.getId()
            r1.put(r0, r12)
        L_0x018f:
            r12.A00 = r2
            java.util.List r0 = r13.A0M
            java.util.Iterator r1 = r0.iterator()
        L_0x0197:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02ab
            java.lang.Object r0 = r1.next()
            X.4sL r0 = (X.C276014sL) r0
            X.1Xj r0 = r0.A00
            if (r0 == 0) goto L_0x0197
            X.3W1 r0 = r9.BQr(r0)
            r0.A0D(r2)
            goto L_0x0197
        L_0x01af:
            boolean r0 = r11 instanceof X.AnonymousClass3UH
            r12 = -1
            if (r0 == 0) goto L_0x0204
            X.57L r1 = r9.A0J
            if (r1 == 0) goto L_0x01c2
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x01c2
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x01c2
            goto L_0x00ca
        L_0x01c2:
            r0 = r11
            X.3UH r0 = (X.AnonymousClass3UH) r0
            r15 = r0
            X.4aa r1 = r9.C2r(r0)
            r1.A00(r2)
            X.1UQ r14 = r0.B5J()
            X.1UQ r0 = X.1UQ.A0q
            if (r14 == r0) goto L_0x01e2
            X.1UQ r0 = X.1UQ.A0p
            if (r14 == r0) goto L_0x01e2
            X.1UQ r0 = X.1UQ.A0L
            if (r14 == r0) goto L_0x01e2
            X.1UQ r13 = X.1UQ.A0t
            r0 = 1
            if (r14 != r13) goto L_0x01e3
        L_0x01e2:
            r0 = 0
        L_0x01e3:
            r1.A0A = r0
            boolean r0 = r15.A07()
            if (r0 != 0) goto L_0x01f5
            X.2s9 r0 = r9.A0O
        L_0x01ed:
            int r0 = r9.addModel(r11, r1, r0)
            if (r0 == r12) goto L_0x00c8
            goto L_0x02b1
        L_0x01f5:
            java.util.List r0 = r15.A04()
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c8
            X.2sF r0 = r9.A0S
            goto L_0x01ed
        L_0x0204:
            boolean r0 = r11 instanceof X.C268364dG
            if (r0 == 0) goto L_0x0286
            r1 = r11
            X.4dG r1 = (X.C268364dG) r1
            X.UxV r0 = r1.A02
            int r13 = r0.ordinal()
            r0 = r19
            if (r13 == r0) goto L_0x024b
            if (r13 == r8) goto L_0x021e
            if (r13 == r4) goto L_0x021e
            r0 = 3
            if (r13 == r0) goto L_0x021e
            goto L_0x00c8
        L_0x021e:
            java.util.Map r13 = r9.A09
            java.lang.String r0 = r1.A05
            java.lang.Object r14 = r13.get(r0)
            if (r14 != 0) goto L_0x0230
            X.VZd r14 = new X.VZd
            r14.<init>(r1, r2)
            r13.put(r0, r14)
        L_0x0230:
            java.util.concurrent.atomic.AtomicBoolean r0 = X.1Xj.A0i
            java.lang.String r13 = r1.A07
            if (r13 == 0) goto L_0x02c9
            java.lang.String r1 = r1.A06
            if (r1 == 0) goto L_0x02c4
            r0 = 95
            java.lang.String r1 = X.002.A0T(r13, r1, r0)
            r0 = r18
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x00c8
            X.2tu r0 = r9.A0W
            goto L_0x0268
        L_0x024b:
            java.util.Map r15 = r9.A08
            java.lang.String r13 = r1.A05
            java.lang.Object r14 = r15.get(r13)
            if (r14 != 0) goto L_0x0266
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = new androidx.recyclerview.widget.LinearLayoutManager$SavedState
            r0.<init>()
            X.VTs r14 = new X.VTs
            r14.<init>(r0, r1)
            r15.put(r13, r14)
        L_0x0266:
            X.2tv r0 = r9.A0V
        L_0x0268:
            int r0 = r9.addModel(r11, r14, r0)
            if (r0 == r12) goto L_0x00c8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r6.add(r1)
            r0 = r22
            r0.add(r1)
            int r0 = r23.size()
            int r0 = r0 - r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r21
            goto L_0x02ba
        L_0x0286:
            boolean r0 = r11 instanceof X.C270464gm
            if (r0 == 0) goto L_0x00c8
            r0 = r11
            X.4gm r0 = (X.C270464gm) r0
            java.util.Map r12 = r9.A05
            java.lang.String r0 = r0.A06
            java.lang.Object r1 = r12.get(r0)
            X.GY3 r1 = (X.GY3) r1
            if (r1 != 0) goto L_0x02a1
            X.GY3 r1 = new X.GY3
            r1.<init>()
            r12.put(r0, r1)
        L_0x02a1:
            r1.A02(r2)
            X.H47 r0 = r9.A0Z
            int r0 = r9.addModel(r11, r1, r0)
            goto L_0x02b1
        L_0x02ab:
            X.2s7 r0 = r9.A0T
        L_0x02ad:
            int r0 = r9.addModel(r11, r12, r0)
        L_0x02b1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r6.add(r1)
            r0 = r22
        L_0x02ba:
            r0.add(r1)
            goto L_0x00c8
        L_0x02bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x02c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x02c9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x02ce:
            X.2ms r1 = r9.A0X
            X.2sK r0 = r9.A0Y
            r9.addModel(r1, r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r6)
            if (r0 == 0) goto L_0x02ed
            java.lang.Object r0 = r6.get(r4)
            java.lang.Object r1 = r5.remove(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r6.set(r4, r0)
            X.C51967G9n.A1O(r1, r5, r8)
        L_0x02ed:
            r9.notifyDataSetChangedSmart()
            X.0xF r1 = r9.A0G
            if (r1 == 0) goto L_0x0306
            X.GTP r0 = r9.A0N
            X.3pR r0 = r0.A02
            if (r0 != 0) goto L_0x0304
            java.lang.String r0 = "mediaHeaderViewBinder"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0304:
            r0.A00 = r1
        L_0x0306:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52476GUc.A00(X.GUc):void");
    }

    public final 1Xg A03() {
        AnonymousClass1Xn r2;
        String id;
        IWI iwi = (IWI) this.A00;
        if (1 >= iwi.A01.size()) {
            return null;
        }
        Object obj = iwi.A01.get(1);
        if (obj instanceof 1Xj) {
            return 1Xi.A01((1Xj) obj);
        }
        if (obj instanceof AnonymousClass3OA) {
            id = ((AnonymousClass3OA) obj).A0S;
            r2 = (AnonymousClass1Xn) obj;
        } else if (!(obj instanceof AnonymousClass3O9)) {
            return null;
        } else {
            r2 = (AnonymousClass1Xn) obj;
            id = r2.getId();
            if (id == null) {
                throw AnonymousClass7TE.A0y();
            }
        }
        return new 1Xg(r2, r2.B5J(), id);
    }

    public final void A05(List list, int i) {
        0qQ.A0B(list, 1);
        IWI iwi = (IWI) this.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object A002 : list) {
            IWI.A00(iwi, A002, A1C, i);
        }
        IWI.A01(iwi, A1C);
        A00(this);
    }

    public final void A8l(Object obj, int i) {
        0qQ.A0B(obj, 0);
        IWI iwi = (IWI) this.A00;
        iwi.A04.add(i, obj);
        C228382la r0 = iwi.A00;
        if (r0 != null) {
            r0.DLo(obj, i);
        }
        A00(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x000e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AJe(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.2rX r3 = r4.A00
            X.IWI r3 = (X.IWI) r3
            java.util.List r0 = r3.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x000e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.1Xj
            if (r0 == 0) goto L_0x0033
            X.1Xj r1 = (X.1Xj) r1
        L_0x001e:
            com.instagram.common.session.UserSession r0 = r3.A03
            com.instagram.user.model.User r0 = r1.A2A(r0)
            r0.getClass()
            java.lang.String r0 = r0.getId()
            boolean r0 = X.0qQ.A0K(r0, r5)
        L_0x002f:
            if (r0 == 0) goto L_0x000e
            r0 = 1
            return r0
        L_0x0033:
            boolean r0 = r1 instanceof X.AnonymousClass3OA
            if (r0 == 0) goto L_0x003c
            X.3OA r1 = (X.AnonymousClass3OA) r1
            X.1Xj r1 = r1.A0K
            goto L_0x001e
        L_0x003c:
            boolean r0 = r1 instanceof X.AnonymousClass3UH
            if (r0 == 0) goto L_0x000e
            X.3UH r1 = (X.AnonymousClass3UH) r1
            boolean r0 = r1.A09(r5)
            goto L_0x002f
        L_0x0047:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52476GUc.AJe(java.lang.String):boolean");
    }

    public final int BJU(String str) {
        0qQ.A0B(str, 0);
        IWI iwi = (IWI) this.A00;
        int size = iwi.A01.size();
        for (int i = 0; i < size; i++) {
            Object obj = iwi.A01.get(i);
            if ((obj instanceof AnonymousClass1Xn) && 0qQ.A0K(((AnonymousClass1Xn) obj).getId(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (X.C228342lQ.A08(r1, X.1Au.A00(r1)) != false) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3W1 BQr(X.1Xj r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            boolean r0 = r6.CcK()
            if (r0 == 0) goto L_0x0048
            boolean r0 = r5.A0g
            if (r0 != 0) goto L_0x001a
            com.instagram.common.session.UserSession r1 = r5.A0H
            X.1Av r0 = X.1Au.A00(r1)
            boolean r0 = X.C228342lQ.A08(r1, r0)
            if (r0 == 0) goto L_0x0048
        L_0x001a:
            java.lang.String r4 = r6.A2R()
        L_0x001e:
            java.util.Map r3 = r5.A0a
            java.lang.Object r2 = r3.get(r4)
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            if (r2 != 0) goto L_0x0047
            int r1 = r6.A0o()
            boolean r0 = r6.A4o()
            X.3W1 r2 = new X.3W1
            r2.<init>(r1, r0)
            X.1sy r0 = r5.A0Q
            r2.A0O(r0)
            boolean r0 = r5.A0f
            r2.A35 = r0
            if (r4 != 0) goto L_0x004d
            java.lang.String r1 = "MediaFeedAdapter"
            java.lang.String r0 = "getMediaState() called on media with null id, unable to store in mediaStateMap."
            X.0wb.A03(r1, r0)
        L_0x0047:
            return r2
        L_0x0048:
            java.lang.String r4 = r6.getId()
            goto L_0x001e
        L_0x004d:
            r3.put(r4, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52476GUc.BQr(X.1Xj):X.3W1");
    }

    public final C266934aa C2r(AnonymousClass3UH r4) {
        0qQ.A0B(r4, 0);
        Map map = this.A0b;
        C266934aa r1 = (C266934aa) map.get(r4.getId());
        if (r1 != null) {
            return r1;
        }
        C266934aa r12 = new C266934aa();
        map.put(r4.getId(), r12);
        return r12;
    }

    public final void Crn() {
        this.A01 = false;
    }

    public final void EU8(AnonymousClass310 r4) {
        0qQ.A0B(r4, 0);
        this.A0L.A08(r4);
        this.A0K.A00 = r4;
        this.A0N.A03(r4);
        C231622ry r0 = this.A0M;
        if (r0 != null) {
            r0.A02(r4);
        }
        this.A0P.A00(r4.C7D(), r4.C87());
        this.A00 = r4;
    }

    public final void EWg(AnonymousClass2xS r2) {
        0qQ.A0B(r2, 0);
        this.A0N.A03 = r2;
        this.A0L.A03 = r2;
        C231622ry r0 = this.A0M;
        if (r0 != null) {
            r0.A01 = r2;
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        AnonymousClass2u0 r0 = (AnonymousClass2u0) this.A0B.getValue();
        if (r0 != null) {
            r0.A00 = recyclerView;
        }
    }

    public final void onBindViewHolder(AnonymousClass3MY r3, int i) {
        0qQ.A0B(r3, 0);
        AnonymousClass0eM r1 = this.A0B;
        if (r1.getValue() != null) {
            0qQ.A06(r3.itemView);
            Set set = AnonymousClass2u0.A05;
        }
        C52476GUc.super.onBindViewHolder(r3, i);
        AnonymousClass2u0 r12 = (AnonymousClass2u0) r1.getValue();
        if (r12 != null) {
            View view = r3.itemView;
            0qQ.A06(view);
            r12.A01(view);
        }
        this.A07.get(Integer.valueOf(i));
        this.A04.indexOf(Integer.valueOf(i - 1));
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        AnonymousClass2u0 r1 = (AnonymousClass2u0) this.A0B.getValue();
        if (r1 != null) {
            r1.A00 = null;
        }
    }

    public final void onViewRecycled(AnonymousClass3MY r2) {
        0qQ.A0B(r2, 0);
        C52476GUc.super.onViewRecycled(r2);
        if (this.A0B.getValue() != null) {
            View view = r2.itemView;
            0qQ.A06(view);
            AnonymousClass2u0.A00(view);
        }
    }

    public final Object A04(int i) {
        if (i < 0) {
            return null;
        }
        IWI iwi = (IWI) this.A00;
        if (i < iwi.A01.size()) {
            return iwi.A01.get(i);
        }
        return null;
    }

    public final Set AZN() {
        return this.A0c;
    }

    public final List AZO() {
        return this.A04;
    }

    public final int B5I() {
        return ((IWI) this.A00).A01.size();
    }

    public final Set B5K() {
        return this.A0e;
    }

    public final Pair BL8() {
        Object obj;
        boolean z;
        AnonymousClass2rX r4 = this.A00;
        IWI iwi = (IWI) r4;
        int size = iwi.A01.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return null;
            }
            if (!(r4 == null || iwi.A01.get(size) == null)) {
                obj = iwi.A01.get(size);
                if (obj instanceof 1Xj) {
                    z = C51966G9m.A1Y(obj);
                } else if (obj instanceof AnonymousClass3OA) {
                    obj = ((AnonymousClass3OA) obj).A0K;
                    0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.feeditem.base.FeedImpressionItem");
                    break;
                } else {
                    z = obj instanceof AnonymousClass3O9;
                }
                if (z) {
                    break;
                }
            }
        }
        return new Pair(obj, Integer.valueOf(size));
    }

    public final Pair BLD() {
        IWI iwi = (IWI) this.A00;
        int size = iwi.A01.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return null;
            }
            Object obj = iwi.A01.get(size);
            if ((obj instanceof 1Xj) && !C51966G9m.A1Y(obj)) {
                return new Pair(obj, Integer.valueOf(size));
            }
        }
    }

    public final boolean CRD() {
        return this.A01;
    }

    public final Object EDl(int i) {
        Object remove = ((IWI) this.A00).A04.remove(i);
        A00(this);
        return remove;
    }

    public final void EZ4(int i) {
        this.A0E.A03 = i;
        A00(this);
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final C232642u8 getLithoPrepareHelperCallback() {
        AnonymousClass2u0 r0 = (AnonymousClass2u0) this.A0B.getValue();
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public final ImmutableList A01() {
        String str;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : ((IWI) this.A00).A01) {
            if (next instanceof 1Xj) {
                str = C51966G9m.A1E(next);
                if (str == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else if (next instanceof AnonymousClass3OA) {
                str = ((AnonymousClass3OA) next).A0S;
            } else if (!(next instanceof AnonymousClass3O9)) {
                continue;
            } else {
                str = ((AnonymousClass1Xn) next).getId();
                if (str == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            A1C.add(str);
        }
        return DbU.A0K(A1C);
    }

    public final ImmutableList A02() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : ((IWI) this.A00).A01) {
            if (next instanceof 1Xj) {
                1Xj r1 = (1Xj) next;
                if (r1.CcK()) {
                    continue;
                } else {
                    String id = r1.getId();
                    if (id != null) {
                        A1C.add(id);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
        }
        return DbU.A0K(A1C);
    }

    public final void AV9() {
        A00(this);
    }

    public final HashMap C8M() {
        return AnonymousClass7TE.A1E();
    }

    public final List CBH() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : ((IWI) this.A00).A01) {
            if (next instanceof 1Xj) {
                A1C.add(next);
            }
        }
        return DbU.A0K(A1C);
    }

    public final void FK4() {
        A00(this);
    }

    public final void Cs9(1Xj r1) {
        A00(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.2s2} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52476GUc(androidx.fragment.app.Fragment r61, X.C229382nI r62, X.AnonymousClass0iw r63, X.0xF r64, X.C55626Hkl r65, X.JT2 r66, X.AnonymousClass57L r67, X.AnonymousClass2oD r68, X.C228162kt r69, X.AnonymousClass2kR r70, X.C229992ok r71, X.C230022on r72, X.C228412ld r73, X.1sy r74, X.AnonymousClass2p0 r75, X.C230162p3 r76, X.C229332nD r77, X.C229182my r78, X.C230072os r79, X.AnonymousClass4DV r80, X.AnonymousClass57M r81, X.C231172qz r82, X.C231032ql r83, X.C229122ms r84, X.C230682q1 r85, X.C249763kK r86, X.C55742Hmd r87, java.lang.Integer r88, java.lang.Integer r89, java.lang.String r90, boolean r91, boolean r92) {
        /*
            r60 = this;
            r3 = 1
            r0 = 2
            r1 = r80
            X.0qQ.A0B(r1, r0)
            r4 = r70
            com.instagram.common.session.UserSession r6 = r4.A01
            X.4DU r1 = r4.A02
            r36 = 0
            X.IWI r8 = new X.IWI
            r11 = r65
            r2 = r63
            r9 = r2
            r10 = r6
            r12 = r1
            r13 = r36
            r8.<init>(r9, r10, r11, r12, r13)
            android.content.Context r5 = r4.A00
            X.IWJ r7 = new X.IWJ
            r7.<init>(r3)
            X.2lZ r0 = new X.2lZ
            r0.<init>(r5, r2, r6, r7)
            r7 = r60
            r9 = r91
            r7.<init>(r0, r8, r3, r9)
            r0 = r84
            r7.A0X = r0
            r7.A0F = r2
            r0 = r74
            r7.A0Q = r0
            r11 = r67
            r7.A0J = r11
            r12 = r64
            r7.A0G = r12
            r0 = r66
            r7.A0I = r0
            r59 = r79
            r0 = r59
            r7.A0U = r0
            r0 = r92
            r7.A0f = r0
            r7.A0H = r6
            r7.A03 = r1
            r7.A0C = r5
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r7.A04 = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r7.A0d = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r7.A0e = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r7.A0c = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r7.A0a = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r7.A06 = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r7.A0b = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r7.A09 = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r7.A08 = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r7.A05 = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r7.A07 = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r7.A0A = r0
            r20 = r61
            androidx.fragment.app.FragmentActivity r0 = r20.getActivity()
            if (r0 == 0) goto L_0x0232
            r7.A0D = r0
            X.2rw r8 = new X.2rw
            r8.<init>(r6)
            r7.A02 = r8
            r8 = 42
            X.0t0 r8 = X.C51970G9q.A0p(r7, r8)
            r7.A0B = r8
            if (r91 == 0) goto L_0x00bf
            r7.enableItemIdFromBinderGroup()
            r7.setHasStableIds(r3)
        L_0x00bf:
            X.2s2 r17 = new X.2s2
            r17.<init>()
            r8 = r17
            r7.A0E = r8
            java.lang.Integer r30 = X.AnonymousClass05K.A01
            r15 = 0
            X.3Yp r10 = new X.3Yp
            r10.<init>(r2, r6, r15, r7)
            X.0Pk r9 = X.0Pl.A0n
            X.0Pl r27 = r9.A00(r5, r6)
            X.GTP r8 = new X.GTP
            r31 = r88
            r29 = r86
            r24 = r68
            r32 = r90
            r26 = r10
            r28 = r15
            r33 = r3
            r34 = r3
            r35 = r3
            r37 = r13
            r38 = r13
            r39 = r13
            r19 = r0
            r21 = r15
            r22 = r12
            r23 = r11
            r25 = r4
            r18 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r7.A0N = r8
            X.0Pl r46 = r9.A00(r5, r6)
            r10 = r0
            X.3jo r10 = (X.C249453jo) r10
            r8 = 4757(0x1295, float:6.666E-42)
            java.lang.String r53 = X.AnonymousClass000.A00(r8)
            X.2s3 r8 = new X.2s3
            r34 = r62
            r37 = r8
            r38 = r0
            r39 = r20
            r40 = r10
            r41 = r34
            r42 = r12
            r43 = r11
            r44 = r24
            r45 = r4
            r47 = r15
            r48 = r29
            r49 = r15
            r50 = r30
            r51 = r31
            r52 = r32
            r54 = r15
            r55 = r15
            r56 = r3
            r57 = r3
            r58 = r13
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r7.A0L = r8
            X.0Pl r24 = r9.A00(r5, r6)
            X.2ry r16 = new X.2ry
            r18 = r16
            r21 = r10
            r22 = r34
            r23 = r4
            r25 = r29
            r26 = r32
            r27 = r3
            r28 = r13
            r29 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3 = r16
            r7.A0M = r3
            X.H48 r10 = new X.H48
            r10.<init>(r6, r8)
            r7.A0K = r10
            X.2s7 r14 = new X.2s7
            r25 = r73
            r26 = r77
            r27 = r78
            r21 = r14
            r22 = r5
            r23 = r2
            r24 = r6
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r7.A0T = r14
            java.lang.Integer r26 = X.AnonymousClass05K.A00
            X.2s9 r13 = new X.2s9
            r23 = r71
            r25 = r72
            r18 = r13
            r19 = r5
            r21 = r2
            r22 = r6
            r24 = r15
            r27 = r36
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r7.A0O = r13
            X.2sF r9 = new X.2sF
            r31 = r75
            r32 = r76
            r27 = r9
            r28 = r5
            r29 = r1
            r30 = r6
            r33 = r26
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r7.A0S = r9
            X.2tu r11 = new X.2tu
            r26 = r89
            r25 = r83
            r21 = r11
            r22 = r5
            r23 = r1
            r24 = r6
            r27 = r36
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r7.A0W = r11
            X.2tv r4 = new X.2tv
            r2 = r82
            r4.<init>(r5, r1, r2)
            r7.A0V = r4
            X.H47 r12 = new X.H47
            r2 = r87
            r1 = r34
            r12.<init>(r1, r2)
            r7.A0Z = r12
            X.2sK r3 = new X.2sK
            r1 = r85
            r2 = r81
            r3.<init>(r5, r2, r1, r15)
            r7.A0Y = r3
            java.lang.String r1 = "ig_threads_in_explore_unit"
            X.0xG r21 = X.DbS.A0O(r1)
            X.2sN r2 = new X.2sN
            r18 = r2
            r19 = r0
            r22 = r6
            r23 = r59
            r24 = r36
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r7.A0P = r2
            X.0Tu r15 = X.0Tu.A05
            r0 = 36312879040955741(0x81025f0002055d, double:3.027749153503301E-306)
            boolean r0 = X.182.A06(r15, r6, r0)
            r7.A0g = r0
            X.0eM r0 = r7.A0B
            java.lang.Object r0 = r0.getValue()
            X.3je r0 = (X.C249383je) r0
            if (r0 == 0) goto L_0x020f
            r1 = r69
            r1.EBt(r0)
        L_0x020f:
            X.2tt r15 = new X.2tt
            r15.<init>(r5, r6)
            r7.A0R = r15
            java.util.ArrayList r1 = X.DbV.A14(r17)
            r1.add(r8)
            r0 = r16
            r1.add(r0)
            X.C51970G9q.A1P(r10, r14, r13, r1)
            X.C51970G9q.A1P(r9, r11, r4, r1)
            X.C51970G9q.A1P(r12, r3, r15, r1)
            r1.add(r2)
            r7.init(r1)
            return
        L_0x0232:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52476GUc.<init>(androidx.fragment.app.Fragment, X.2nI, X.0iw, X.0xF, X.Hkl, X.JT2, X.57L, X.2oD, X.2kt, X.2kR, X.2ok, X.2on, X.2ld, X.1sy, X.2p0, X.2p3, X.2nD, X.2my, X.2os, X.4DV, X.57M, X.2qz, X.2ql, X.2ms, X.2q1, X.3kK, X.Hmd, java.lang.Integer, java.lang.Integer, java.lang.String, boolean, boolean):void");
    }
}
