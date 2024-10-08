package X;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2rI  reason: invalid class name */
public final class AnonymousClass2rI extends C231262rJ implements C231272rL, C231282rM, C231302rO, ListAdapter, C231312rP, C231322rQ, AnonymousClass2rS, C231342rT {
    public int A00;
    public View A01;
    public View A02;
    public AnonymousClass2uD A03;
    public AnonymousClass4ZI A04;
    public AnonymousClass3UH A05;
    public C233412vg A06;
    public AnonymousClass57Q A07;
    public C270374gd A08;
    public AnonymousClass4UE A09;
    public final AnonymousClass2s2 A0A;
    public final AnonymousClass2s2 A0B;
    public final UserSession A0C;
    public final AnonymousClass2sJ A0D;
    public final AnonymousClass2s3 A0E;
    public final C231622ry A0F;
    public final AnonymousClass2sC A0G;
    public final AnonymousClass2sM A0H;
    public final C231602rw A0I;
    public final AnonymousClass2sH A0J;
    public final AnonymousClass4DU A0K;
    public final C231712s9 A0L;
    public final C231752sI A0M;
    public final C231782sN A0N;
    public final C231502rm A0O;
    public final C231742sF A0P;
    public final C231832sU A0Q;
    public final AnonymousClass2rB A0R;
    public final C228392lb A0S;
    public final C231772sL A0T;
    public final C231692s7 A0U;
    public final C231682s6 A0V;
    public final C229782oC A0W;
    public final C249383je A0X;
    public final AnonymousClass4DV A0Y;
    public final AnonymousClass2sD A0Z;
    public final C229122ms A0a;
    public final C231762sK A0b;
    public final C229722nv A0c;
    public final List A0d = new ArrayList();
    public final List A0e;
    public final Map A0f = new HashMap();
    public final Set A0g = new HashSet();
    public final Set A0h = new HashSet();
    public final Set A0i = new HashSet();
    public final Set A0j = new HashSet();
    public final AnonymousClass0eM A0k;
    public final AnonymousClass0eM A0l = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9L7(this, 19));
    public final boolean A0m;
    public final Context A0n;
    public final AnonymousClass2s2 A0o;
    public final AnonymousClass2sP A0p;
    public final C228162kt A0q;
    public final AnonymousClass2lC A0r;
    public final C229732nw A0s;
    public final boolean A0t;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        X.VEZ.A00("Null view in getMostVisibleMediaIndex.", r12, r13, r14, r15, r16, r17);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(int r19) {
        /*
            r18 = this;
            r10 = -1
            r7 = r18
            X.4DV r0 = r7.A0Y     // Catch:{ IllegalStateException -> 0x00c5 }
            X.3Ar r3 = r0.getScrollingViewProxy()     // Catch:{ IllegalStateException -> 0x00c5 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ IllegalStateException -> 0x00c5 }
            r6.<init>()     // Catch:{ IllegalStateException -> 0x00c5 }
            java.util.List r0 = r7.A07()     // Catch:{ IllegalStateException -> 0x00c5 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IllegalStateException -> 0x00c5 }
        L_0x0016:
            boolean r0 = r2.hasNext()     // Catch:{ IllegalStateException -> 0x00c5 }
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r2.next()     // Catch:{ IllegalStateException -> 0x00c5 }
            X.1Xg r0 = (X.1Xg) r0     // Catch:{ IllegalStateException -> 0x00c5 }
            X.1Xn r1 = r0.A05     // Catch:{ IllegalStateException -> 0x00c5 }
            X.1Xj r0 = X.1Xi.A02(r1)     // Catch:{ IllegalStateException -> 0x00c5 }
            if (r0 != 0) goto L_0x002b
            r0 = r1
        L_0x002b:
            r6.add(r0)     // Catch:{ IllegalStateException -> 0x00c5 }
            goto L_0x0016
        L_0x002f:
            int r12 = r3.B6L()     // Catch:{ IllegalStateException -> 0x00c5 }
            int r13 = r3.BLQ()     // Catch:{ IllegalStateException -> 0x00c5 }
            if (r12 < 0) goto L_0x00c3
            if (r13 < 0) goto L_0x00c3
            r5 = 0
            r14 = r12
            r2 = 0
            r9 = -1
        L_0x003f:
            if (r14 > r13) goto L_0x00b3
            java.lang.Object r4 = r7.getItem(r14)     // Catch:{ IndexOutOfBoundsException -> 0x00a3 }
            if (r4 == 0) goto L_0x00c3
            boolean r0 = r4 instanceof X.1Xl     // Catch:{ IllegalStateException -> 0x00c4 }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r11 = "Null view in getMostVisibleMediaIndex."
            android.view.View r0 = r3.AnE(r14)     // Catch:{ IllegalStateException -> 0x00c4 }
            if (r0 != 0) goto L_0x0061
            int r15 = r3.AnH()     // Catch:{ IllegalStateException -> 0x00c4 }
            int r16 = r3.getCount()     // Catch:{ IllegalStateException -> 0x00c4 }
            r17 = 1
        L_0x005d:
            X.VEZ.A00(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IllegalStateException -> 0x00c4 }
            goto L_0x00b3
        L_0x0061:
            int r0 = r0.getTop()     // Catch:{ IllegalStateException -> 0x00c4 }
            int r8 = java.lang.Math.max(r0, r5)     // Catch:{ IllegalStateException -> 0x00c4 }
        L_0x0069:
            if (r14 > r13) goto L_0x0074
            java.lang.Object r0 = r7.getItem(r14)     // Catch:{ IllegalStateException -> 0x00c4 }
            if (r0 != r4) goto L_0x0074
            int r14 = r14 + 1
            goto L_0x0069
        L_0x0074:
            int r0 = r14 + -1
            android.view.View r0 = r3.AnE(r0)     // Catch:{ IllegalStateException -> 0x00c4 }
            if (r0 != 0) goto L_0x0087
            int r15 = r3.AnH()     // Catch:{ IllegalStateException -> 0x00c4 }
            int r16 = r3.getCount()     // Catch:{ IllegalStateException -> 0x00c4 }
            r17 = r5
            goto L_0x005d
        L_0x0087:
            int r1 = r0.getBottom()     // Catch:{ IllegalStateException -> 0x00c4 }
            android.view.ViewGroup r0 = r3.CEd()     // Catch:{ IllegalStateException -> 0x00c4 }
            int r0 = r0.getBottom()     // Catch:{ IllegalStateException -> 0x00c4 }
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ IllegalStateException -> 0x00c4 }
            int r0 = r0 - r8
            if (r0 <= r2) goto L_0x003f
            int r9 = r6.indexOf(r4)     // Catch:{ IllegalStateException -> 0x00c4 }
            r2 = r0
            goto L_0x003f
        L_0x00a0:
            int r14 = r14 + 1
            goto L_0x003f
        L_0x00a3:
            java.lang.String r11 = "IndexOutOfBounds in getMostVisibleMediaIndex."
            int r15 = r3.AnH()     // Catch:{ IllegalStateException -> 0x00c4 }
            int r16 = r3.getCount()     // Catch:{ IllegalStateException -> 0x00c4 }
            r17 = 1
            X.VEZ.A00(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IllegalStateException -> 0x00c4 }
            return r10
        L_0x00b3:
            r0 = r19
            if (r19 <= 0) goto L_0x00c2
            float r2 = (float) r2     // Catch:{ IllegalStateException -> 0x00c4 }
            float r1 = (float) r0     // Catch:{ IllegalStateException -> 0x00c4 }
            r0 = 1060320051(0x3f333333, float:0.7)
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c2
            return r10
        L_0x00c2:
            return r9
        L_0x00c3:
            return r10
        L_0x00c4:
            r10 = r9
        L_0x00c5:
            java.lang.String r1 = "MainFeedAdapter"
            java.lang.String r0 = "getMostVisibleMediaIndex called after fragment is destroyed"
            X.0wb.A03(r1, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2rI.A02(int):int");
    }

    public final void A0B(1Xg r12, int i, boolean z) {
        AnonymousClass57Q r0;
        List<Object> list;
        List list2;
        0qQ.A0B(r12, 0);
        boolean z2 = false;
        if (C242583Vb.A00 != null) {
            z2 = true;
        }
        if (!z2) {
            AnonymousClass2rW.A01((AnonymousClass2rW) this.A00, r12, i, z);
            if (z) {
                A0A(-1);
            }
        }
        AnonymousClass1Xn r4 = r12.A05;
        1Xj A022 = 1Xi.A02(r4);
        boolean z3 = true;
        if (A022 != null && (r0 = this.A07) != null && r0.A08(A022, false)) {
            C228392lb r3 = this.A0S;
            if (!r3.BQr(A022).A2b) {
                if (C242583Vb.A00 == null) {
                    z3 = false;
                }
                AnonymousClass2rW r2 = (AnonymousClass2rW) this.A00;
                ImmutableList copyOf = ImmutableList.copyOf((Collection) r2.A02);
                0qQ.A07(copyOf);
                if (z3) {
                    int size = i - copyOf.size();
                    GSY gsy = C242583Vb.A00;
                    if (!(gsy == null || (list2 = (List) gsy.A00) == null || size > list2.size())) {
                        list2.add(i - copyOf.size(), r12);
                    }
                } else {
                    C242583Vb.A00 = new GSY((Object) new ArrayList(), (Object) 00k.A0U(copyOf.subList(i + 1, copyOf.size())), (String) null, (String) null, 16);
                }
                1Xj A023 = 1Xi.A02(r4);
                if (A023 != null) {
                    AnonymousClass3W1 BQr = r3.BQr(A023);
                    BQr.A3A = true;
                    AnonymousClass57Q r02 = this.A07;
                    if (r02 != null && r02.A0K.A00()) {
                        BQr.A38 = true;
                    }
                }
                this.A0A.A03 = this.A00;
                GSY gsy2 = C242583Vb.A00;
                if (gsy2 != null && (list = (List) gsy2.A00) != null && !list.isEmpty()) {
                    for (Object A0C2 : list) {
                        r2.A0C(A0C2);
                    }
                    A0A(-1);
                }
            }
        }
    }

    public final void A0C(AnonymousClass3UH r10, String str, String str2, List list, boolean z) {
        AnonymousClass57Q r0;
        C242583Vb r6 = C242583Vb.A01;
        if (C242583Vb.A00 != null) {
            r6.A00(str, str2, list);
            return;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            1Xj A022 = 1Xi.A02(((1Xg) it.next()).A05);
            if (!(A022 == null || (r0 = this.A07) == null || !r0.A08(A022, false))) {
                C228392lb r4 = this.A0S;
                if (!r4.BQr(A022).A2b) {
                    if (i != -1) {
                        int i2 = i + 1;
                        ((C231352rU) this.A00).A0F(r4, str, list.subList(0, i2), z);
                        this.A0A.A03 = this.A00;
                        r6.A00(str, str2, list.subList(i2, list.size()));
                        1Xj A023 = 1Xi.A02(((1Xg) list.get(i)).A05);
                        if (A023 != null) {
                            AnonymousClass3W1 BQr = r4.BQr(A023);
                            BQr.A3A = true;
                            AnonymousClass57Q r02 = this.A07;
                            if (r02 != null && r02.A0K.A00()) {
                                BQr.A38 = true;
                            }
                        }
                    }
                }
            }
            i++;
        }
        ((C231352rU) this.A00).A0F(this.A0S, str, list, z);
        this.A05 = r10;
        if (z) {
            A0A(-1);
        }
    }

    public final void A0E(User user) {
        String str;
        User A2A;
        AnonymousClass2rW r3 = (AnonymousClass2rW) this.A00;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = r3.A02.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            1Xg r2 = (1Xg) next;
            0qQ.A0B(r2, 0);
            if (r2.A06 == 1UQ.A0Y) {
                1Xj A022 = 1Xi.A02(r2.A05);
                if (A022 == null || (A2A = A022.A2A(this.A0C)) == null) {
                    str = null;
                } else {
                    str = A2A.getId();
                }
                if (0qQ.A0K(str, user.getId())) {
                    arrayList.add(next);
                }
            }
            arrayList2.add(next);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            r3.A0C(it2.next());
        }
        r3.A01 = Collections.unmodifiableList(arrayList2);
        AnonymousClass2rW.A00(r3);
        A0A(-1);
    }

    public final void A8l(Object obj, int i) {
        0qQ.A0B(obj, 0);
        if (obj instanceof 1Xg) {
            A0B((1Xg) obj, i, true);
        }
    }

    public final void AV9() {
        A0A(-1);
    }

    public final int BJU(String str) {
        0qQ.A0B(str, 0);
        Number number = (Number) ((AnonymousClass2rW) this.A00).A03.get(str);
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public final AnonymousClass3W1 BQr(1Xj r2) {
        0qQ.A0B(r2, 0);
        return this.A0S.BQr(r2);
    }

    public final C266934aa C2r(AnonymousClass3UH r2) {
        0qQ.A0B(r2, 0);
        return this.A0S.A00(r2);
    }

    public final boolean CRD() {
        return false;
    }

    public final void Crn() {
    }

    public final void Cs9(1Xj r2) {
        A0A(-1);
    }

    public final void EWg(AnonymousClass2xS r2) {
        0qQ.A0B(r2, 0);
        this.A0E.A03 = r2;
        this.A0Z.A00 = r2;
        this.A0U.A00 = r2;
        C231622ry r0 = this.A0F;
        if (r0 != null) {
            r0.A01 = r2;
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        AnonymousClass2u0 r0 = (AnonymousClass2u0) this.A0l.getValue();
        if (r0 != null) {
            r0.A00 = recyclerView;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (X.182.A06(X.0Tu.A05, r8.A0C, 36315005049899959L) != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        if (r4 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c2, code lost:
        if (X.182.A06(X.0Tu.A05, r8.A0C, 2342158014263659448L) != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.AnonymousClass3MY r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            int r7 = r8.A01(r10)
            X.2rX r2 = r8.A00
            X.2rW r2 = (X.AnonymousClass2rW) r2
            java.util.List r0 = r2.A01
            int r0 = r0.size()
            r1 = -1
            if (r0 <= r7) goto L_0x00c5
            if (r7 == r1) goto L_0x00c5
            X.1Xg r4 = r8.A03(r7)
        L_0x001b:
            boolean r0 = r8.A0t
            if (r0 == 0) goto L_0x00b2
            X.2lC r5 = r8.A0r
            if (r5 == 0) goto L_0x00b2
            java.util.List r0 = r2.A01
            int r0 = r0.size()
            if (r0 <= r7) goto L_0x00b2
            if (r7 == r1) goto L_0x00b2
            int r0 = r8.getItemViewType(r10)
            int r1 = r8.getBinderGroupViewType(r0, r10)
            X.2rv[] r0 = X.C231592rv.values()
            int r0 = r0.length
            if (r1 <= r0) goto L_0x00a2
            r6 = 0
        L_0x003d:
            X.1Xg r2 = r8.A03(r7)
            X.1UQ r1 = r2.A06
            X.1UQ r0 = X.1UQ.A0T
            if (r1 == r0) goto L_0x005c
            X.1Xn r0 = r2.A05
            boolean r0 = r0 instanceof X.AnonymousClass3O9
            if (r0 == 0) goto L_0x00a9
            com.instagram.common.session.UserSession r3 = r8.A0C
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315005049899959(0x81044e00040bb7, double:3.0290936501203754E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00a9
        L_0x005c:
            if (r4 == 0) goto L_0x00ed
            android.view.View r6 = r9.itemView
            X.0qQ.A06(r6)
            int r3 = r9.mItemViewType
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            X.1Xn r0 = r4.A05
            r1 = 58
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = X.002.A0H(r0, r1, r3)
            X.30Y r0 = X.AnonymousClass30Y.A07
            X.30a r3 = new X.30a
            r3.<init>(r4, r2, r1)
            java.util.Set r0 = r5.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x0082:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r1 = r2.next()
            X.2w1 r1 = (X.C233612w1) r1
            boolean r0 = X.AnonymousClass3VP.A00(r4)
            if (r0 != 0) goto L_0x009e
            boolean r0 = X.AnonymousClass3VP.A03(r4)
            if (r0 != 0) goto L_0x009e
            r1.ABd(r3)
            goto L_0x0082
        L_0x009e:
            r1.ABg(r3)
            goto L_0x0082
        L_0x00a2:
            X.2rv[] r0 = X.C231592rv.values()
            r6 = r0[r1]
            goto L_0x003d
        L_0x00a9:
            if (r6 == 0) goto L_0x00b2
            int r0 = r6.ordinal()
            switch(r0) {
                case 6: goto L_0x005c;
                case 11: goto L_0x00b5;
                case 18: goto L_0x005c;
                case 22: goto L_0x005c;
                case 36: goto L_0x005c;
                case 37: goto L_0x005c;
                case 87: goto L_0x005c;
                case 88: goto L_0x005c;
                case 89: goto L_0x005c;
                case 90: goto L_0x005c;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            if (r4 == 0) goto L_0x00ed
            goto L_0x00d1
        L_0x00b5:
            com.instagram.common.session.UserSession r3 = r8.A0C
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342158014263659448(0x2081044e00050bb8, double:4.061350586317843E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00b2
            goto L_0x005c
        L_0x00c5:
            r4 = 0
            goto L_0x001b
        L_0x00c8:
            X.2el r1 = r5.A00
            X.30Y r0 = r3.A01()
            r1.A05(r6, r0)
        L_0x00d1:
            X.1Xn r0 = r4.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x00ed
            X.0wX r0 = X.C61170le.A00
            X.18g r2 = X.C638918c.A01(r0)
            boolean r0 = r2.A09
            if (r0 != 0) goto L_0x00ed
            r0 = 1
            r2.A09 = r0
            java.lang.String r1 = "FEED_FIRST_MEDIA_ITEM_BINDED"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r2.A02
            r2.A0O(r0, r1)
        L_0x00ed:
            X.0eM r1 = r8.A0l
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x00fc
            android.view.View r0 = r9.itemView
            X.0qQ.A06(r0)
            java.util.Set r0 = X.AnonymousClass2u0.A05
        L_0x00fc:
            X.AnonymousClass2rI.super.onBindViewHolder(r9, r10)
            java.lang.Object r1 = r1.getValue()
            X.2u0 r1 = (X.AnonymousClass2u0) r1
            if (r1 == 0) goto L_0x010f
            android.view.View r0 = r9.itemView
            X.0qQ.A06(r0)
            r1.A01(r0)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2rI.onBindViewHolder(X.3MY, int):void");
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        AnonymousClass2u0 r1 = (AnonymousClass2u0) this.A0l.getValue();
        if (r1 != null) {
            r1.A00 = null;
        }
    }

    public final void onViewRecycled(AnonymousClass3MY r2) {
        0qQ.A0B(r2, 0);
        AnonymousClass2rI.super.onViewRecycled(r2);
        if (this.A0l.getValue() != null) {
            View view = r2.itemView;
            0qQ.A06(view);
            AnonymousClass2u0.A00(view);
        }
    }

    public static final void A00(Throwable th) {
        0f9 AEf = 0wj.A01.AEf("IGFeedDelayedSkip", 817903741);
        AEf.ABQ(DialogModule.KEY_MESSAGE, "getDelayedSkipMediaPositionInfo called after fragment is destroyed");
        AEf.ERJ(th);
        AEf.report();
    }

    public final 1Xg A03(int i) {
        Object obj = ((AnonymousClass2rW) this.A00).A01.get(i);
        0qQ.A07(obj);
        return (1Xg) obj;
    }

    public final 1Xg A04(int i) {
        if (i < 0 || i >= ((AnonymousClass2rW) this.A00).A01.size()) {
            return null;
        }
        return A03(i);
    }

    public final AnonymousClass523 A05(1sU r8) {
        C228392lb r6 = this.A0S;
        Map map = r6.A05;
        String str = r8.A04.A0B;
        AnonymousClass523 r3 = (AnonymousClass523) map.get(str);
        if (r3 == null) {
            r3 = new AnonymousClass523(r6.A01, r6.A00);
            if (str == null) {
                str = "";
            }
            map.put(str, r3);
        }
        return r3;
    }

    public final ArrayList A06() {
        List list = ((AnonymousClass2rW) this.A00).A01;
        0qQ.A07(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (Object next : list) {
            0qQ.A07(next);
            String str = ((1Xg) next).A09;
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public final List A07() {
        List unmodifiableList = Collections.unmodifiableList(((AnonymousClass2rW) this.A00).A01);
        0qQ.A07(unmodifiableList);
        return unmodifiableList;
    }

    public final List A08() {
        ImmutableList copyOf = ImmutableList.copyOf((Collection) ((AnonymousClass2rW) this.A00).A02);
        0qQ.A07(copyOf);
        List unmodifiableList = Collections.unmodifiableList(copyOf);
        0qQ.A07(unmodifiableList);
        return unmodifiableList;
    }

    public final void A09() {
        AnonymousClass2rW r6 = (AnonymousClass2rW) this.A00;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = r6.A02.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            1Xg r1 = (1Xg) next;
            0qQ.A0B(r1, 0);
            if (r1.A06 != 1UQ.A06) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            r6.A0C(it2.next());
        }
        r6.A01 = Collections.unmodifiableList(arrayList2);
        AnonymousClass2rW.A00(r6);
        A0A(-1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: X.HLd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: X.4aa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: X.IUf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: X.IUj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: X.VTs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: X.DHH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v60, resolved type: X.5j1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v62, resolved type: com.instagram.feed.feeditem.SuggestedChannels} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v46, resolved type: X.IUg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v51, resolved type: X.5O4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v55, resolved type: X.IUi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: X.3Y6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v57, resolved type: X.5jX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: X.WWP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v78, resolved type: X.4gm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: X.3W1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: X.2ry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: X.5GJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v184, resolved type: X.4dG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v299, resolved type: X.1Xg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.1Xg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: X.HLd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: X.HLd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v130, resolved type: X.IUf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v133, resolved type: com.instagram.feed.ui.state.IntentAwareAdPivotState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v136, resolved type: X.51s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v139, resolved type: X.523} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v141, resolved type: X.IUf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v142, resolved type: X.VTs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v223, resolved type: X.DHH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v224, resolved type: X.DHH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v143, resolved type: X.IUk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v225, resolved type: X.DHH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v144, resolved type: X.IUk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v145, resolved type: X.IUf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v146, resolved type: X.IUf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v226, resolved type: X.DHH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v147, resolved type: X.IUk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v227, resolved type: X.DHH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v149, resolved type: X.IUm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v152, resolved type: X.IUl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v228, resolved type: X.DHH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v155, resolved type: X.GY3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v44, resolved type: X.3W1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v45, resolved type: X.3W1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v81, resolved type: X.2ry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v82, resolved type: X.2ry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v46, resolved type: X.3W1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v83, resolved type: X.2sD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v231, resolved type: X.DHH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v158, resolved type: X.VTs} */
    /* JADX WARNING: type inference failed for: r1v17, types: [java.lang.Object, X.3Bf] */
    /* JADX WARNING: type inference failed for: r2v19, types: [X.F0f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v37, types: [X.XTm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r41v0 */
    /* JADX WARNING: type inference failed for: r0v277, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v382, types: [X.5GF] */
    /* JADX WARNING: type inference failed for: r0v383, types: [X.Wap] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x021c, code lost:
        if (r0.booleanValue() == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0238, code lost:
        if (r1.contains("ig_select_free_data_banner") != false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x025a, code lost:
        if (r1.contains("ig_select_free_data_banner") != false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03af, code lost:
        if (X.AnonymousClass3VP.A00(r2) == false) goto L_0x0d70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03b1, code lost:
        r1 = X.C267004ai.AD;
        r48.put(r3, r1);
        r47.put(r3, r1);
        r0 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03c1, code lost:
        if (r0 != X.1UQ.A0l) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03c3, code lost:
        r0 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03c5, code lost:
        r1 = X.AnonymousClass59V.A00;
        r0 = java.lang.Integer.valueOf(X.AnonymousClass59V.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03d3, code lost:
        if (r1.A01(r0) == false) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03d5, code lost:
        r1 = X.C267004ai.PAE_MULTI_AD;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03d7, code lost:
        r47.put(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03e2, code lost:
        if (r1.A02(r0) == false) goto L_0x0d6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03e4, code lost:
        r1 = X.C267004ai.STANDALONE_MULTI_AD;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03e9, code lost:
        if (r0 != X.1UQ.A0T) goto L_0x0d6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03eb, code lost:
        r0 = X.AnonymousClass05K.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (r18 != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0584, code lost:
        if (X.0qQ.A0K(r1, "SIMPLE_CTA_CLOSE_FRIENDS_FACEPILE") != false) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x08d6, code lost:
        if (r11 == true) goto L_0x08d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x08d8, code lost:
        r6.A9P(r12, r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0b32, code lost:
        if (r11 != X.1UQ.A0g) goto L_0x0b1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        if (r2.A0D(r3, X.AnonymousClass05K.A0N, r1) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0cb1, code lost:
        r6.A9P(r0, r12, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0cc1, code lost:
        r6.A9P(r11, r1, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00eb, code lost:
        if (r0 == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0d6d, code lost:
        r21 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0d74, code lost:
        if (X.AnonymousClass3VP.A03(r2) == false) goto L_0x0d7f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0d76, code lost:
        r48.put(r3, X.C267004ai.NETEGO);
        r22 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0dbe, code lost:
        if (r9 != null) goto L_0x0dc2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0dc0, code lost:
        r9 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0dc6, code lost:
        if (r10.A02() == 0) goto L_0x0dd0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0dc8, code lost:
        r6.A9P(r5.A0i, r49, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0dd2, code lost:
        if (r10.A02 == false) goto L_0x0e48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0dd8, code lost:
        if (r10.A02() != 0) goto L_0x0e48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0dde, code lost:
        if (r50.isEmpty() == false) goto L_0x0e48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0de0, code lost:
        if (r20 == null) goto L_0x0de8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0de6, code lost:
        if (r20.A00 != null) goto L_0x0e48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0dea, code lost:
        if (r32 == null) goto L_0x0e6e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0dec, code lost:
        X.FFL.A01(X.C48152EZu.A0H, r46, "upsell_impressions", X.0se.A0M(new X.0eP("case", "suggestions")));
        r10 = r5.A00;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0e09, code lost:
        if (X.C266964ad.A00(r32) == com.instagram.api.schemas.SuggestedUsersStyle.A05) goto L_0x0e0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0e0b, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0e0c, code lost:
        r2 = new java.lang.Object();
        r1 = r10.getResources();
        r2.A01 = -1;
        r2.A06 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:?, code lost:
        r2.A04 = r1.getString(2131968722);
        r2.A03 = r1.getString(2131968721);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:?, code lost:
        r2.A05 = r3;
        r6.A9P(r5.A0h, r2, (java.lang.Object) null);
        r0 = r32;
        r2 = r4.A00(r0);
        r2.A00(0);
        r2.A06 = false;
        r1 = r5.A01;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0e4c, code lost:
        if (r10.A02() != 0) goto L_0x0e8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0e56, code lost:
        if (X.C238243Bc.A00(r46).A03() == false) goto L_0x0e8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0e58, code lost:
        r2 = new X.C238263Be(X.AnonymousClass05K.A15);
        r1 = new java.lang.Object();
        r1.A00 = true;
        r6.A9P(r5.A0M, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0e6e, code lost:
        X.FFL.A01(X.C48152EZu.A0H, r46, "upsell_impressions", X.0se.A0M(new X.0eP("case", "welcome_card")));
        r2 = X.C54620HLd.A04;
        r1 = r5.A0L;
        r0 = null;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0e87, code lost:
        r6.A9P(r1, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0e8a, code lost:
        r6.A9P(r5.A03, (java.lang.Object) null, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0e94, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) != false) goto L_0x0e96;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0e96, code lost:
        X.0fS.A01("syncUpdateState", -1235652076);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:?, code lost:
        X.11Z.A06("This operation must be run on UI thread.");
        r8.A05 = r9;
        r11 = r30.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0ead, code lost:
        if (r11.hasNext() != false) goto L_0x0eaf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0eaf, code lost:
        r9 = (X.1Xj) r11.next();
        r6 = r9.A0w();
        r5 = r4.BQr(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0ebf, code lost:
        if (r5.A09 != r6) goto L_0x0ec1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0ec1, code lost:
        r5.A09 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0ec3, code lost:
        if (r6 != 0) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0ec5, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0eca, code lost:
        if (r9.CcK() != false) goto L_0x0ecc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0ecc, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0ecd, code lost:
        r5.A2V = r10;
        r5.A34 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0ee8, code lost:
        r3 = r6 - r5.A03;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0eed, code lost:
        if (0 > r3) goto L_0x0eef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0eef, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0ef0, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0ef1, code lost:
        if (0 < r3) goto L_0x0ef3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0ef3, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0ef4, code lost:
        r0 = 22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0ef7, code lost:
        if (r2 < r1) goto L_0x0ef9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0ef9, code lost:
        if (r3 <= 0) goto L_0x0efb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0efb, code lost:
        if (r3 < 0) goto L_0x0efd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0efd, code lost:
        r0 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0eff, code lost:
        X.AnonymousClass3W1.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0f02, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0f05, code lost:
        r5.A0B(r6);
        r5.A0A(r6);
        r9.A0o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0f13, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) != false) goto L_0x0f15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0f15, code lost:
        X.0fS.A00(751349938);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0f1b, code lost:
        notifyDataSetChangedSmart();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0f1e, code lost:
        if (r16 != false) goto L_0x0f20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0f20, code lost:
        r0 = 1701817107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0f2d, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0f32, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) != false) goto L_0x0f34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0f34, code lost:
        X.0fS.A00(1002818930);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:538:0x0e32 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b4 A[Catch:{ all -> 0x0d8a, all -> 0x0f41 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102 A[Catch:{ all -> 0x0d8a, all -> 0x0f41 }] */
    /* JADX WARNING: Removed duplicated region for block: B:575:0x0ef9 A[Catch:{ all -> 0x0f2d }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0164 A[Catch:{ all -> 0x0d8a, all -> 0x0f41 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0170 A[Catch:{ all -> 0x0d8a, all -> 0x0f41 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x017a A[Catch:{ all -> 0x0d8a, all -> 0x0f41 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(int r53) {
        /*
            r52 = this;
            r33 = 1
            boolean r16 = com.facebook.systrace.Systrace.A0E(r33)
            if (r16 == 0) goto L_0x0010
            r1 = 434584181(0x19e73a75, float:2.3908451E-23)
            java.lang.String r0 = "MainfeedAdapter.updateItems"
            X.0fS.A01(r0, r1)
        L_0x0010:
            r8 = r52
            com.instagram.common.session.UserSession r0 = r8.A0C     // Catch:{ all -> 0x0f41 }
            r51 = r0
            boolean r0 = r51.hasEnded()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = "MainFeedAdapter"
            java.lang.String r0 = "refreshing view after userSession has ended"
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x0f41 }
            goto L_0x0f24
        L_0x0025:
            X.2rX r10 = r8.A00     // Catch:{ all -> 0x0f41 }
            X.2rU r10 = (X.C231352rU) r10     // Catch:{ all -> 0x0f41 }
            X.2sP r0 = r8.A0p     // Catch:{ all -> 0x0f41 }
            r10.A08(r0)     // Catch:{ all -> 0x0f41 }
            X.2vg r13 = r8.A06     // Catch:{ all -> 0x0f41 }
            if (r13 == 0) goto L_0x01a1
            r17 = 0
            r12 = 0
            r25 = -100
            r24 = -100
            r23 = -100
            r22 = -100
            r21 = -100
            java.util.LinkedHashSet r0 = r13.A03     // Catch:{ all -> 0x0f41 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0f41 }
        L_0x0045:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0f41 }
            X.2vz r0 = (X.C233602vz) r0     // Catch:{ all -> 0x0f41 }
            r0.DfI()     // Catch:{ all -> 0x0f41 }
            goto L_0x0045
        L_0x0055:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0f41 }
            r11.<init>()     // Catch:{ all -> 0x0f41 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0f41 }
            r9.<init>()     // Catch:{ all -> 0x0f41 }
            java.util.LinkedList r0 = r10.A02     // Catch:{ all -> 0x0f41 }
            java.util.Iterator r20 = r0.iterator()     // Catch:{ all -> 0x0f41 }
            X.0qQ.A07(r20)     // Catch:{ all -> 0x0f41 }
        L_0x0068:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0186
            java.lang.Object r7 = r20.next()     // Catch:{ all -> 0x0f41 }
            r6 = r7
            X.1Xg r6 = (X.1Xg) r6     // Catch:{ all -> 0x0f41 }
            r2 = 0
            X.0qQ.A0B(r6, r2)     // Catch:{ all -> 0x0f41 }
            X.2mN r5 = r13.A05     // Catch:{ all -> 0x0f41 }
            boolean r19 = r5.CVy(r6)     // Catch:{ all -> 0x0f41 }
            boolean r18 = r5.CVx(r6)     // Catch:{ all -> 0x0f41 }
            r14 = 1
            if (r19 != 0) goto L_0x0089
            r4 = 1
            if (r18 == 0) goto L_0x008a
        L_0x0089:
            r4 = 0
        L_0x008a:
            X.1Xn r0 = r6.A05     // Catch:{ all -> 0x0f41 }
            X.1Xj r0 = X.1Xi.A02(r0)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x00ad
            java.util.List r1 = r0.A0e     // Catch:{ all -> 0x0f41 }
            X.3PG r0 = X.AnonymousClass3PG.CACHED     // Catch:{ all -> 0x0f41 }
            boolean r3 = r1.contains(r0)     // Catch:{ all -> 0x0f41 }
        L_0x009a:
            boolean r0 = r13.A09     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x00af
            java.lang.Integer r0 = r6.A07     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x00b1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0f41 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x00af
            goto L_0x00b1
        L_0x00ad:
            r3 = 0
            goto L_0x009a
        L_0x00af:
            r1 = 0
            goto L_0x00b2
        L_0x00b1:
            r1 = 1
        L_0x00b2:
            if (r4 == 0) goto L_0x0102
            int r17 = r17 + 1
            if (r3 == 0) goto L_0x0181
            X.2vl r1 = r13.A00     // Catch:{ all -> 0x0f41 }
            X.2vl r0 = X.C233462vl.A0D     // Catch:{ all -> 0x0f41 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x0181
            X.2vl r2 = r13.A00     // Catch:{ all -> 0x0f41 }
            java.lang.Integer r3 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0f41 }
            int r1 = r17 - r23
            int r1 = r1 - r14
            boolean r0 = r2.A0D(r3, r3, r1)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x00d8
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0f41 }
            boolean r0 = r2.A0D(r3, r0, r1)     // Catch:{ all -> 0x0f41 }
            r5 = 1
            if (r0 != 0) goto L_0x00d9
        L_0x00d8:
            r5 = 0
        L_0x00d9:
            X.2vl r4 = r13.A00     // Catch:{ all -> 0x0f41 }
            java.lang.Integer r2 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0f41 }
            int r1 = r17 - r22
            int r1 = r1 - r14
            boolean r0 = r4.A0D(r2, r3, r1)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r4.A0D(r2, r2, r1)     // Catch:{ all -> 0x0f41 }
            r1 = 1
            if (r0 != 0) goto L_0x00ee
        L_0x00ed:
            r1 = 0
        L_0x00ee:
            if (r5 == 0) goto L_0x00f7
            java.util.LinkedHashSet r0 = r13.A03     // Catch:{ all -> 0x0f41 }
            X.C266924aZ.A01(r3, r0)     // Catch:{ all -> 0x0f41 }
            r23 = r17
        L_0x00f7:
            if (r1 == 0) goto L_0x0181
            java.util.LinkedHashSet r0 = r13.A03     // Catch:{ all -> 0x0f41 }
            X.C266924aZ.A01(r2, r0)     // Catch:{ all -> 0x0f41 }
            r22 = r17
            goto L_0x0181
        L_0x0102:
            boolean r0 = r13.A0B     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x010b
            if (r17 != 0) goto L_0x010b
            if (r1 != 0) goto L_0x010b
            goto L_0x0157
        L_0x010b:
            java.util.Map r1 = r13.A07     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r6.A09     // Catch:{ all -> 0x0f41 }
            java.lang.Object r4 = r1.get(r0)     // Catch:{ all -> 0x0f41 }
            X.2vl r4 = (X.C233462vl) r4     // Catch:{ all -> 0x0f41 }
            if (r4 != 0) goto L_0x0119
            X.2vl r4 = X.C233462vl.A0D     // Catch:{ all -> 0x0f41 }
        L_0x0119:
            r13.A00 = r4     // Catch:{ all -> 0x0f41 }
            if (r19 == 0) goto L_0x0120
            java.lang.Integer r3 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0f41 }
            goto L_0x0122
        L_0x0120:
            java.lang.Integer r3 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0f41 }
        L_0x0122:
            int r0 = r17 - r24
            int r0 = r0 - r14
            java.lang.Integer r2 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0f41 }
            boolean r15 = r4.A0D(r2, r3, r0)     // Catch:{ all -> 0x0f41 }
            if (r12 == 0) goto L_0x0134
            X.1UQ r1 = r12.A06     // Catch:{ all -> 0x0f41 }
        L_0x012f:
            X.1UQ r0 = X.1UQ.A0T     // Catch:{ all -> 0x0f41 }
            if (r1 == r0) goto L_0x0142
            goto L_0x0136
        L_0x0134:
            r1 = 0
            goto L_0x012f
        L_0x0136:
            if (r12 == 0) goto L_0x013f
            boolean r0 = r12.A03()     // Catch:{ all -> 0x0f41 }
            if (r0 != r14) goto L_0x013f
            goto L_0x0142
        L_0x013f:
            r0 = r25
            goto L_0x0144
        L_0x0142:
            r0 = r21
        L_0x0144:
            int r1 = r17 - r0
            int r1 = r1 - r14
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0f41 }
            boolean r3 = r4.A0D(r0, r3, r1)     // Catch:{ all -> 0x0f41 }
            boolean r1 = r13.A0H(r6)     // Catch:{ all -> 0x0f41 }
            if (r1 != 0) goto L_0x015c
            if (r15 == 0) goto L_0x0157
            if (r3 != 0) goto L_0x015c
        L_0x0157:
            r11.add(r7)     // Catch:{ all -> 0x0f41 }
            goto L_0x0068
        L_0x015c:
            java.util.LinkedHashSet r1 = r13.A03     // Catch:{ all -> 0x0f41 }
            boolean r3 = r5.CVy(r6)     // Catch:{ all -> 0x0f41 }
            if (r3 != 0) goto L_0x016b
            boolean r0 = r5.CVx(r6)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x016e
            r0 = r2
        L_0x016b:
            X.C266924aZ.A01(r0, r1)     // Catch:{ all -> 0x0f41 }
        L_0x016e:
            if (r19 == 0) goto L_0x017a
            r12 = r6
            r21 = r25
            r25 = r17
            r23 = r17
        L_0x0177:
            int r17 = r17 + 1
            goto L_0x0181
        L_0x017a:
            if (r18 == 0) goto L_0x0177
            r24 = r17
            r22 = r17
            goto L_0x0177
        L_0x0181:
            r9.add(r7)     // Catch:{ all -> 0x0f41 }
            goto L_0x0068
        L_0x0186:
            java.util.Iterator r1 = r11.iterator()     // Catch:{ all -> 0x0f41 }
        L_0x018a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0198
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0f41 }
            r10.A0C(r0)     // Catch:{ all -> 0x0f41 }
            goto L_0x018a
        L_0x0198:
            java.util.List r0 = java.util.Collections.unmodifiableList(r9)     // Catch:{ all -> 0x0f41 }
            r10.A01 = r0     // Catch:{ all -> 0x0f41 }
            X.AnonymousClass2rW.A00(r10)     // Catch:{ all -> 0x0f41 }
        L_0x01a1:
            r0 = r53
            if (r53 < 0) goto L_0x01a8
            r10.A07(r0)     // Catch:{ all -> 0x0f41 }
        L_0x01a8:
            r8.clear()     // Catch:{ all -> 0x0f41 }
            X.0eM r0 = r8.A0k     // Catch:{ all -> 0x0f41 }
            java.lang.Object r6 = r0.getValue()     // Catch:{ all -> 0x0f41 }
            X.2uA r6 = (X.C232652uA) r6     // Catch:{ all -> 0x0f41 }
            java.util.List r0 = r8.A0d     // Catch:{ all -> 0x0f41 }
            r0.clear()     // Catch:{ all -> 0x0f41 }
            java.util.Set r0 = r8.A0g     // Catch:{ all -> 0x0f41 }
            r0.clear()     // Catch:{ all -> 0x0f41 }
            java.util.Set r0 = r8.A0j     // Catch:{ all -> 0x0f41 }
            r0.clear()     // Catch:{ all -> 0x0f41 }
            java.util.Map r0 = r8.A0f     // Catch:{ all -> 0x0f41 }
            r0.clear()     // Catch:{ all -> 0x0f41 }
            java.util.Set r0 = r8.A0h     // Catch:{ all -> 0x0f41 }
            r0.clear()     // Catch:{ all -> 0x0f41 }
            java.util.Set r0 = r8.A0i     // Catch:{ all -> 0x0f41 }
            r0.clear()     // Catch:{ all -> 0x0f41 }
            X.2sU r5 = r8.A0Q     // Catch:{ all -> 0x0f41 }
            java.util.List r0 = r8.A0e     // Catch:{ all -> 0x0f41 }
            r50 = r0
            X.4gd r0 = r8.A08     // Catch:{ all -> 0x0f41 }
            r20 = r0
            X.3UH r0 = r8.A05     // Catch:{ all -> 0x0f41 }
            r32 = r0
            X.4UE r2 = r8.A09     // Catch:{ all -> 0x0f41 }
            X.2ms r0 = r8.A0a     // Catch:{ all -> 0x0f41 }
            r49 = r0
            X.2lb r4 = r8.A0S     // Catch:{ all -> 0x0f41 }
            android.view.View r0 = r8.A02     // Catch:{ all -> 0x0f41 }
            r11 = 1
            r9 = 0
            if (r0 == 0) goto L_0x01ee
            r9 = 1
        L_0x01ee:
            boolean r0 = r8.A0F()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0204
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x0f41 }
            r0 = 36329380305518671(0x8111610005404f, double:3.038184619658157E-306)
            r3 = r51
            boolean r0 = X.182.A06(r7, r3, r0)     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x0204
            goto L_0x0205
        L_0x0204:
            r11 = 0
        L_0x0205:
            if (r9 == 0) goto L_0x021e
            if (r11 != 0) goto L_0x021e
            java.lang.Boolean r0 = X.C231792sO.A01     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x0214
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0f41 }
            X.C231792sO.A01 = r0     // Catch:{ all -> 0x0f41 }
        L_0x0214:
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x0f41 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0f41 }
            r13 = 1
            if (r0 != 0) goto L_0x021f
        L_0x021e:
            r13 = 0
        L_0x021f:
            X.3kW r0 = X.AnonymousClass1Qz.A00(r51)     // Catch:{ all -> 0x0f41 }
            X.1R7 r0 = r0.C82()     // Catch:{ all -> 0x0f41 }
            java.lang.String r3 = "ig_new_res_free_data_banner"
            java.util.Set r1 = r0.A0C     // Catch:{ all -> 0x0f41 }
            boolean r0 = r1.contains(r3)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x023a
            java.lang.String r0 = "ig_select_free_data_banner"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0f41 }
            r12 = 1
            if (r0 == 0) goto L_0x023b
        L_0x023a:
            r12 = 0
        L_0x023b:
            X.3kW r0 = X.AnonymousClass1Qz.A00(r51)     // Catch:{ all -> 0x0f41 }
            X.1R7 r1 = r0.C82()     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "ig_zero_rating_data_banner"
            java.util.Set r1 = r1.A0C     // Catch:{ all -> 0x0f41 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x025c
            boolean r0 = r1.contains(r3)     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x025c
            java.lang.String r0 = "ig_select_free_data_banner"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0f41 }
            r3 = 1
            if (r0 == 0) goto L_0x025d
        L_0x025c:
            r3 = 0
        L_0x025d:
            X.2uD r11 = r8.A03     // Catch:{ all -> 0x0f41 }
            r7 = 0
            X.0qQ.A0B(r6, r7)     // Catch:{ all -> 0x0f41 }
            r19 = 1
            r31 = 19
            r27 = 2
            r1 = r50
            r0 = r27
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x0f41 }
            r28 = 3
            r1 = 7
            r0 = r49
            X.0qQ.A0B(r0, r1)     // Catch:{ all -> 0x0f41 }
            r0 = 8
            X.0qQ.A0B(r4, r0)     // Catch:{ all -> 0x0f41 }
            r9 = 0
            java.util.ArrayList r30 = new java.util.ArrayList     // Catch:{ all -> 0x0f41 }
            r30.<init>()     // Catch:{ all -> 0x0f41 }
            X.2s2 r0 = r5.A02     // Catch:{ all -> 0x0f41 }
            r6.A9P(r0, r9, r9)     // Catch:{ all -> 0x0f41 }
            java.util.HashSet r29 = new java.util.HashSet     // Catch:{ all -> 0x0f41 }
            r29.<init>()     // Catch:{ all -> 0x0f41 }
            if (r13 == 0) goto L_0x0299
            X.3Ba r1 = new X.3Ba     // Catch:{ all -> 0x0f41 }
            r1.<init>(r8)     // Catch:{ all -> 0x0f41 }
            X.2sV r0 = r5.A0d     // Catch:{ all -> 0x0f41 }
            r6.A9P(r0, r1, r9)     // Catch:{ all -> 0x0f41 }
        L_0x0299:
            if (r12 == 0) goto L_0x02a0
            X.2sW r0 = r5.A0j     // Catch:{ all -> 0x0f41 }
            r6.A9P(r0, r9, r9)     // Catch:{ all -> 0x0f41 }
        L_0x02a0:
            if (r3 == 0) goto L_0x02a7
            X.2sX r0 = r5.A0k     // Catch:{ all -> 0x0f41 }
            r6.A9P(r0, r9, r9)     // Catch:{ all -> 0x0f41 }
        L_0x02a7:
            boolean r0 = r50.isEmpty()     // Catch:{ all -> 0x0f41 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0313
            com.instagram.common.session.UserSession r3 = r5.A06     // Catch:{ all -> 0x0f41 }
            X.1Av r12 = X.1Au.A00(r3)     // Catch:{ all -> 0x0f41 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0f41 }
            r12.A0e(r0)     // Catch:{ all -> 0x0f41 }
            X.0Tu r12 = X.0Tu.A05     // Catch:{ all -> 0x0f41 }
            r0 = 36314859021601612(0x81042c000d0b4c, double:3.029001301236492E-306)
            boolean r0 = X.182.A06(r12, r3, r0)     // Catch:{ all -> 0x0f41 }
            int r12 = r50.size()     // Catch:{ all -> 0x0f41 }
            r3 = 0
            if (r0 == 0) goto L_0x02f7
        L_0x02ce:
            if (r3 >= r12) goto L_0x0313
            r0 = r50
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0f41 }
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0     // Catch:{ all -> 0x0f41 }
            X.JxB r0 = r0.A0v     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x02f4
            X.2sS r1 = r5.A0N     // Catch:{ all -> 0x0f41 }
            r0 = r50
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0f41 }
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0     // Catch:{ all -> 0x0f41 }
            r1.A01(r0)     // Catch:{ all -> 0x0f41 }
            r0 = r50
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0f41 }
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0     // Catch:{ all -> 0x0f41 }
            r0.A0Y(r1)     // Catch:{ all -> 0x0f41 }
        L_0x02f4:
            int r3 = r3 + 1
            goto L_0x02ce
        L_0x02f7:
            if (r3 >= r12) goto L_0x0313
            r0 = r50
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0f41 }
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0     // Catch:{ all -> 0x0f41 }
            X.JxB r0 = r0.A0v     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x0310
            r0 = r50
            java.lang.Object r1 = r0.get(r3)     // Catch:{ all -> 0x0f41 }
            X.2sY r0 = r5.A0F     // Catch:{ all -> 0x0f41 }
            r6.A9P(r0, r1, r9)     // Catch:{ all -> 0x0f41 }
        L_0x0310:
            int r3 = r3 + 1
            goto L_0x02f7
        L_0x0313:
            X.2uD r0 = X.AnonymousClass2uD.CREATE_GROUP     // Catch:{ all -> 0x0f41 }
            if (r11 == r0) goto L_0x031b
            X.2uD r0 = X.AnonymousClass2uD.ADD_STORY     // Catch:{ all -> 0x0f41 }
            if (r11 != r0) goto L_0x0320
        L_0x031b:
            X.2sa r0 = r5.A0A     // Catch:{ all -> 0x0f41 }
            r6.A9P(r0, r11, r9)     // Catch:{ all -> 0x0f41 }
        L_0x0320:
            if (r20 == 0) goto L_0x0330
            r0 = r20
            X.Eb1 r0 = r0.A00     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0330
            X.2sb r0 = r5.A0b     // Catch:{ all -> 0x0f41 }
            r1 = r20
            r6.A9P(r0, r1, r9)     // Catch:{ all -> 0x0f41 }
            goto L_0x0337
        L_0x0330:
            if (r2 == 0) goto L_0x0337
            X.2sj r0 = r5.A0c     // Catch:{ all -> 0x0f41 }
            r6.A9P(r0, r2, r9)     // Catch:{ all -> 0x0f41 }
        L_0x0337:
            java.util.List r11 = r10.A01     // Catch:{ all -> 0x0f41 }
            X.0qQ.A07(r11)     // Catch:{ all -> 0x0f41 }
            int r3 = r11.size()     // Catch:{ all -> 0x0f41 }
            r2 = 0
        L_0x0341:
            if (r2 >= r3) goto L_0x0356
            java.lang.Object r17 = r11.get(r2)     // Catch:{ all -> 0x0f41 }
            r0 = r17
            X.1Xg r0 = (X.1Xg) r0     // Catch:{ all -> 0x0f41 }
            r17 = r0
            X.1UQ r1 = r0.A06     // Catch:{ all -> 0x0f41 }
            X.1UQ r0 = X.1UQ.A0F     // Catch:{ all -> 0x0f41 }
            if (r1 == r0) goto L_0x0358
            int r2 = r2 + 1
            goto L_0x0341
        L_0x0356:
            r17 = 0
        L_0x0358:
            X.3Bb r1 = X.C238233Bb.A02     // Catch:{ all -> 0x0f41 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0f41 }
            android.util.SparseArray r0 = r1.A00     // Catch:{ all -> 0x0f41 }
            r48 = r0
            r48.clear()     // Catch:{ all -> 0x0f41 }
            android.util.SparseArray r0 = r1.A01     // Catch:{ all -> 0x0f41 }
            r47 = r0
            r47.clear()     // Catch:{ all -> 0x0f41 }
            com.instagram.common.session.UserSession r0 = r5.A06     // Catch:{ all -> 0x0f41 }
            r46 = r0
            X.0Tu r26 = X.0Tu.A05     // Catch:{ all -> 0x0f41 }
            r0 = 36320670111769358(0x8109750004230e, double:3.0326762580579565E-306)
            r3 = r26
            r2 = r46
            boolean r18 = X.182.A06(r3, r2, r0)     // Catch:{ all -> 0x0f41 }
            java.util.HashMap r24 = new java.util.HashMap     // Catch:{ all -> 0x0f41 }
            r24.<init>()     // Catch:{ all -> 0x0f41 }
            java.util.List r0 = r10.A01     // Catch:{ all -> 0x0f41 }
            int r25 = r0.size()     // Catch:{ all -> 0x0f41 }
            r22 = -1
            r23 = -1
            r21 = -1
            r3 = 0
        L_0x0390:
            r0 = r25
            if (r3 >= r0) goto L_0x0dbe
            java.util.List r0 = r10.A01     // Catch:{ all -> 0x0f41 }
            java.lang.Object r2 = r0.get(r3)     // Catch:{ all -> 0x0f41 }
            java.lang.String r14 = "Required value was null."
            if (r2 == 0) goto L_0x0db7
            X.1Xg r2 = (X.1Xg) r2     // Catch:{ all -> 0x0f41 }
            X.1UQ r0 = r2.A06     // Catch:{ all -> 0x0f41 }
            r45 = r0
            int r38 = r45.ordinal()     // Catch:{ all -> 0x0f41 }
            switch(r38) {
                case 0: goto L_0x0802;
                case 1: goto L_0x0802;
                case 2: goto L_0x093a;
                case 3: goto L_0x093a;
                case 4: goto L_0x093a;
                case 5: goto L_0x093a;
                case 6: goto L_0x093a;
                case 7: goto L_0x093a;
                case 8: goto L_0x093a;
                case 9: goto L_0x093a;
                case 10: goto L_0x093a;
                case 11: goto L_0x03ab;
                case 12: goto L_0x09c5;
                case 13: goto L_0x0802;
                case 14: goto L_0x03ab;
                case 15: goto L_0x03ab;
                case 16: goto L_0x09f2;
                case 17: goto L_0x0914;
                case 18: goto L_0x0464;
                case 19: goto L_0x0464;
                case 20: goto L_0x03ab;
                case 21: goto L_0x0add;
                case 22: goto L_0x0b17;
                case 23: goto L_0x0b17;
                case 24: goto L_0x0b4b;
                case 25: goto L_0x0b4b;
                case 26: goto L_0x0b4b;
                case 27: goto L_0x03ab;
                case 28: goto L_0x0d62;
                case 29: goto L_0x0b7a;
                case 30: goto L_0x0b7a;
                case 31: goto L_0x0b7a;
                case 32: goto L_0x0bab;
                case 33: goto L_0x03ee;
                case 34: goto L_0x08eb;
                case 35: goto L_0x03ab;
                case 36: goto L_0x03ab;
                case 37: goto L_0x0982;
                case 38: goto L_0x0a1f;
                case 39: goto L_0x03ab;
                case 40: goto L_0x0bfb;
                case 41: goto L_0x0c0a;
                case 42: goto L_0x0c5a;
                case 43: goto L_0x0cc7;
                case 44: goto L_0x03ab;
                case 45: goto L_0x03ab;
                case 46: goto L_0x03ab;
                case 47: goto L_0x03ab;
                case 48: goto L_0x0c71;
                case 49: goto L_0x0c86;
                case 50: goto L_0x0cb6;
                case 51: goto L_0x03ab;
                case 52: goto L_0x03ab;
                case 53: goto L_0x03ab;
                case 54: goto L_0x0aa7;
                case 55: goto L_0x0a40;
                case 56: goto L_0x0a6d;
                case 57: goto L_0x03ab;
                case 58: goto L_0x03ab;
                case 59: goto L_0x0a9a;
                default: goto L_0x03ab;
            }     // Catch:{ all -> 0x0f41 }
        L_0x03ab:
            boolean r0 = X.AnonymousClass3VP.A00(r2)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0d70
            X.4ai r1 = X.C267004ai.AD     // Catch:{ all -> 0x0f41 }
            r0 = r48
            r0.put(r3, r1)     // Catch:{ all -> 0x0f41 }
            r0 = r47
            r0.put(r3, r1)     // Catch:{ all -> 0x0f41 }
            X.1UQ r1 = X.1UQ.A0l     // Catch:{ all -> 0x0f41 }
            r0 = r45
            if (r0 != r1) goto L_0x03e7
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0f41 }
        L_0x03c5:
            X.4I5 r1 = X.AnonymousClass59V.A00     // Catch:{ all -> 0x0f41 }
            int r0 = X.AnonymousClass59V.A00(r0)     // Catch:{ all -> 0x0f41 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0f41 }
            boolean r2 = r1.A01(r0)     // Catch:{ all -> 0x0f41 }
            if (r2 == 0) goto L_0x03de
            X.4ai r1 = X.C267004ai.PAE_MULTI_AD     // Catch:{ all -> 0x0f41 }
        L_0x03d7:
            r0 = r47
            r0.put(r3, r1)     // Catch:{ all -> 0x0f41 }
            goto L_0x0d6d
        L_0x03de:
            boolean r0 = r1.A02(r0)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0d6d
            X.4ai r1 = X.C267004ai.STANDALONE_MULTI_AD     // Catch:{ all -> 0x0f41 }
            goto L_0x03d7
        L_0x03e7:
            X.1UQ r1 = X.1UQ.A0T     // Catch:{ all -> 0x0f41 }
            if (r0 != r1) goto L_0x0d6d
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0f41 }
            goto L_0x03c5
        L_0x03ee:
            X.1Xn r1 = r2.A05     // Catch:{ all -> 0x0f41 }
            r0 = 37
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x0f41 }
            X.4dG r1 = (X.C268364dG) r1     // Catch:{ all -> 0x0f41 }
            X.UxV r0 = r1.A02     // Catch:{ all -> 0x0f41 }
            int r11 = r0.ordinal()     // Catch:{ all -> 0x0f41 }
            r0 = r27
            if (r11 == r0) goto L_0x0443
            r0 = r19
            if (r11 == r0) goto L_0x0410
            if (r11 == r7) goto L_0x0410
            r0 = r28
            if (r11 == r0) goto L_0x0410
            goto L_0x03ab
        L_0x0410:
            java.util.Map r11 = r4.A0D     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r1.A05     // Catch:{ all -> 0x0f41 }
            java.lang.Object r12 = r11.get(r0)     // Catch:{ all -> 0x0f41 }
            X.VZd r12 = (X.C17524VZd) r12     // Catch:{ all -> 0x0f41 }
            if (r12 != 0) goto L_0x0424
            X.VZd r12 = new X.VZd     // Catch:{ all -> 0x0f41 }
            r12.<init>(r1, r3)     // Catch:{ all -> 0x0f41 }
            r11.put(r0, r12)     // Catch:{ all -> 0x0f41 }
        L_0x0424:
            java.lang.String r13 = r1.A06     // Catch:{ all -> 0x0f41 }
            if (r13 == 0) goto L_0x03ab
            X.1Xv r0 = X.1Xj.A0h     // Catch:{ all -> 0x0f41 }
            java.lang.String r11 = r1.A07     // Catch:{ all -> 0x0f41 }
            if (r11 == 0) goto L_0x0d83
            r0 = 95
            java.lang.String r11 = X.002.A0T(r11, r13, r0)     // Catch:{ all -> 0x0f41 }
            r0 = r29
            boolean r0 = r0.contains(r11)     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x03ab
            X.2tu r0 = r5.A0g     // Catch:{ all -> 0x0f41 }
            r6.A9P(r0, r1, r12)     // Catch:{ all -> 0x0f41 }
            goto L_0x03ab
        L_0x0443:
            java.util.Map r14 = r4.A0B     // Catch:{ all -> 0x0f41 }
            java.lang.String r13 = r1.A05     // Catch:{ all -> 0x0f41 }
            java.lang.Object r11 = r14.get(r13)     // Catch:{ all -> 0x0f41 }
            X.VTs r11 = (X.C17391VTs) r11     // Catch:{ all -> 0x0f41 }
            if (r11 != 0) goto L_0x0460
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0f41 }
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = new androidx.recyclerview.widget.LinearLayoutManager$SavedState     // Catch:{ all -> 0x0f41 }
            r0.<init>()     // Catch:{ all -> 0x0f41 }
            X.VTs r11 = new X.VTs     // Catch:{ all -> 0x0f41 }
            r11.<init>(r0, r12)     // Catch:{ all -> 0x0f41 }
            r14.put(r13, r11)     // Catch:{ all -> 0x0f41 }
        L_0x0460:
            X.2tv r0 = r5.A0f     // Catch:{ all -> 0x0f41 }
            goto L_0x0b46
        L_0x0464:
            X.1Xn r0 = r2.A05     // Catch:{ all -> 0x0f41 }
            r42 = r0
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.feeditem.StoriesNetegoItem"
            X.0qQ.A0C(r0, r1)     // Catch:{ all -> 0x0f41 }
            r0 = r42
            X.4qK r0 = (X.C275464qK) r0     // Catch:{ all -> 0x0f41 }
            r42 = r0
            com.instagram.reels.store.ReelStore r12 = X.1OP.A05(r46)     // Catch:{ all -> 0x0f41 }
            java.lang.String r11 = r42.getId()     // Catch:{ all -> 0x0f41 }
            X.4qJ r0 = r0.A00     // Catch:{ all -> 0x0f41 }
            r39 = r0
            java.util.List r0 = r0.A0C     // Catch:{ all -> 0x0f41 }
            r15 = r0
            X.5GF r1 = new X.5GF     // Catch:{ all -> 0x0f41 }
            r0 = r46
            r1.<init>(r0)     // Catch:{ all -> 0x0f41 }
            com.instagram.common.session.UserSession r14 = r1.A00     // Catch:{ all -> 0x0f41 }
            r0 = 36324286475087822(0x810cbf00112fce, double:3.0349632607824794E-306)
            r13 = r26
            boolean r0 = X.182.A06(r13, r14, r0)     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x0519
            if (r15 == 0) goto L_0x0519
            monitor-enter(r12)     // Catch:{ all -> 0x0f41 }
            java.util.Map r13 = r12.A0B     // Catch:{ all -> 0x0d8a }
            boolean r0 = r13.containsKey(r11)     // Catch:{ all -> 0x0d8a }
            if (r0 == 0) goto L_0x04d5
            java.lang.Object r0 = r13.get(r11)     // Catch:{ all -> 0x0d8a }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0d8a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0d8a }
            if (r0 != 0) goto L_0x04d5
            java.lang.Object r1 = r13.get(r11)     // Catch:{ all -> 0x0d8a }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0d8a }
        L_0x04b5:
            com.instagram.common.session.UserSession r0 = r12.A09     // Catch:{ all -> 0x0d8a }
            java.util.ArrayList r14 = com.instagram.reels.store.ReelStore.A04(r0, r1)     // Catch:{ all -> 0x0d8a }
            boolean r0 = r13.containsKey(r11)     // Catch:{ all -> 0x0d8a }
            if (r0 == 0) goto L_0x04cd
            java.lang.Object r0 = r13.get(r11)     // Catch:{ all -> 0x0d8a }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0d8a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0d8a }
            if (r0 == 0) goto L_0x0517
        L_0x04cd:
            java.util.ArrayList r14 = com.instagram.reels.store.ReelStore.A06(r12, r14)     // Catch:{ all -> 0x0d8a }
            r13.put(r11, r14)     // Catch:{ all -> 0x0d8a }
            goto L_0x0517
        L_0x04d5:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0d8a }
            r1.<init>()     // Catch:{ all -> 0x0d8a }
            java.util.Iterator r37 = r15.iterator()     // Catch:{ all -> 0x0d8a }
        L_0x04de:
            boolean r0 = r37.hasNext()     // Catch:{ all -> 0x0d8a }
            if (r0 == 0) goto L_0x04b5
            java.lang.Object r36 = r37.next()     // Catch:{ all -> 0x0d8a }
            r0 = r36
            X.3HX r0 = (X.AnonymousClass3HX) r0     // Catch:{ all -> 0x0d8a }
            r36 = r0
            com.instagram.common.session.UserSession r14 = r12.A09     // Catch:{ all -> 0x0d8a }
            X.1Ns r35 = X.AnonymousClass3P9.A01(r14, r0)     // Catch:{ all -> 0x0d8a }
            com.instagram.reels.store.ReelStore r15 = X.1OP.A05(r14)     // Catch:{ all -> 0x0d8a }
            if (r35 == 0) goto L_0x050b
            X.0eE r0 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x0d8a }
            com.instagram.user.model.User r0 = r0.A01(r14)     // Catch:{ all -> 0x0d8a }
            com.instagram.user.model.User r14 = r35.CCd()     // Catch:{ all -> 0x0d8a }
            boolean r14 = r0.equals(r14)     // Catch:{ all -> 0x0d8a }
            r0 = 1
            if (r14 != 0) goto L_0x050c
        L_0x050b:
            r0 = 0
        L_0x050c:
            r14 = r0
            r0 = r36
            com.instagram.model.reels.Reel r0 = r15.A0I(r0, r14)     // Catch:{ all -> 0x0d8a }
            r1.add(r0)     // Catch:{ all -> 0x0d8a }
            goto L_0x04de
        L_0x0517:
            monitor-exit(r12)     // Catch:{ all -> 0x0f41 }
            goto L_0x0545
        L_0x0519:
            r0 = r39
            java.util.List r14 = r0.A0B     // Catch:{ all -> 0x0f41 }
            X.5GF r1 = new X.5GF     // Catch:{ all -> 0x0f41 }
            r0 = r46
            r1.<init>(r0)     // Catch:{ all -> 0x0f41 }
            com.instagram.common.session.UserSession r0 = r1.A00     // Catch:{ all -> 0x0f41 }
            r35 = 36324286475153359(0x810cbf00122fcf, double:3.034963260823925E-306)
            r15 = r13
            r13 = r0
            r0 = r35
            boolean r0 = X.182.A06(r15, r13, r0)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x053a
            java.util.ArrayList r14 = r12.A0T(r14)     // Catch:{ all -> 0x0f41 }
            goto L_0x0545
        L_0x053a:
            if (r14 == 0) goto L_0x0541
            java.util.ArrayList r14 = r12.A0R(r11, r14)     // Catch:{ all -> 0x0f41 }
            goto L_0x0545
        L_0x0541:
            java.util.ArrayList r14 = r12.A0Q(r11)     // Catch:{ all -> 0x0f41 }
        L_0x0545:
            r1 = r38
            r0 = r31
            if (r1 != r0) goto L_0x054c
            goto L_0x0556
        L_0x054c:
            X.5GF r41 = new X.5GF     // Catch:{ all -> 0x0f41 }
            r1 = r46
            r0 = r41
            r0.<init>(r1)     // Catch:{ all -> 0x0f41 }
            goto L_0x055f
        L_0x0556:
            X.Wap r41 = new X.Wap     // Catch:{ all -> 0x0f41 }
            r1 = r46
            r0 = r41
            r0.<init>(r1)     // Catch:{ all -> 0x0f41 }
        L_0x055f:
            r0 = r41
            X.5GG r0 = (X.AnonymousClass5GG) r0     // Catch:{ all -> 0x0f41 }
            r41 = r0
            int r1 = r14.size()     // Catch:{ all -> 0x0f41 }
            r0 = 4
            if (r1 >= r0) goto L_0x0586
            int r1 = r14.size()     // Catch:{ all -> 0x0f41 }
            r0 = r28
            if (r1 < r0) goto L_0x03ab
            r0 = r39
            X.508 r0 = r0.A01     // Catch:{ all -> 0x0f41 }
            X.5GI r0 = (X.AnonymousClass5GI) r0     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x05c3
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x0f41 }
        L_0x057e:
            java.lang.String r0 = "SIMPLE_CTA_CLOSE_FRIENDS_FACEPILE"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x03ab
        L_0x0586:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0f41 }
            X.5GH r0 = new X.5GH     // Catch:{ all -> 0x0f41 }
            r11 = r46
            r1 = r42
            r0.<init>(r11, r1, r12, r14)     // Catch:{ all -> 0x0f41 }
            r1 = r39
            java.lang.String r1 = r1.A09     // Catch:{ all -> 0x0f41 }
            r0.A03 = r1     // Catch:{ all -> 0x0f41 }
            r1 = r39
            java.lang.String r1 = r1.A07     // Catch:{ all -> 0x0f41 }
            r0.A02 = r1     // Catch:{ all -> 0x0f41 }
            android.content.Context r1 = r5.A00     // Catch:{ all -> 0x0f41 }
            r44 = r1
            X.0iw r1 = r5.A05     // Catch:{ all -> 0x0f41 }
            r43 = r1
            r1 = r39
            X.508 r11 = r1.A01     // Catch:{ all -> 0x0f41 }
            X.5GI r11 = (X.AnonymousClass5GI) r11     // Catch:{ all -> 0x0f41 }
            r13 = 0
            if (r11 == 0) goto L_0x06fb
            java.lang.String r12 = r11.A03     // Catch:{ all -> 0x0f41 }
            java.util.Map r1 = X.C391009sC.A01     // Catch:{ all -> 0x0f41 }
            java.lang.Object r1 = r1.get(r12)     // Catch:{ all -> 0x0f41 }
            X.9sC r1 = (X.C391009sC) r1     // Catch:{ all -> 0x0f41 }
            if (r1 == 0) goto L_0x0d8e
            int r12 = r1.ordinal()     // Catch:{ all -> 0x0f41 }
            if (r12 == r7) goto L_0x06ae
            goto L_0x05c5
        L_0x05c3:
            r1 = 0
            goto L_0x057e
        L_0x05c5:
            r1 = r19
            if (r12 != r1) goto L_0x06fb
            X.0eE r12 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x0f41 }
            r1 = r46
            com.instagram.user.model.User r1 = r12.A01(r1)     // Catch:{ all -> 0x0f41 }
            boolean r1 = r1.A1m()     // Catch:{ all -> 0x0f41 }
            java.lang.String r40 = r43.getModuleName()     // Catch:{ all -> 0x0f41 }
            if (r1 == 0) goto L_0x0633
            r37 = 2131165286(0x7f070066, float:1.7944785E38)
            r12 = r27
            r1 = r40
            X.0qQ.A0B(r1, r12)     // Catch:{ all -> 0x0f41 }
            java.util.HashSet r36 = new java.util.HashSet     // Catch:{ all -> 0x0f41 }
            r36.<init>()     // Catch:{ all -> 0x0f41 }
            X.8jT r14 = X.C363288jT.A00(r46)     // Catch:{ all -> 0x0f41 }
            X.0qQ.A07(r14)     // Catch:{ all -> 0x0f41 }
            X.FTD r12 = X.FTD.A00     // Catch:{ all -> 0x0f41 }
            r1 = 1183(0x49f, float:1.658E-42)
            java.lang.String r35 = X.AnonymousClass000.A00(r1)     // Catch:{ all -> 0x0f41 }
            java.lang.String r1 = ""
            r15 = r12
            r13 = r1
            r12 = r36
            r1 = r35
            r14.A08(r15, r1, r13, r12)     // Catch:{ all -> 0x0f41 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0f41 }
            r13.<init>(r12)     // Catch:{ all -> 0x0f41 }
            r1 = r35
            r14.A09(r1, r13)     // Catch:{ all -> 0x0f41 }
            java.util.ArrayList r35 = new java.util.ArrayList     // Catch:{ all -> 0x0f41 }
            r35.<init>()     // Catch:{ all -> 0x0f41 }
        L_0x0613:
            int r1 = r35.size()     // Catch:{ all -> 0x0f41 }
            r12 = r27
            if (r1 >= r12) goto L_0x06c5
            boolean r1 = r13.isEmpty()     // Catch:{ all -> 0x0f41 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x06c5
            java.lang.Object r1 = r13.remove(r7)     // Catch:{ all -> 0x0f41 }
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1     // Catch:{ all -> 0x0f41 }
            com.instagram.common.typedurl.ImageUrl r12 = r1.Bh3()     // Catch:{ all -> 0x0f41 }
            r1 = r35
            r1.add(r12)     // Catch:{ all -> 0x0f41 }
            goto L_0x0613
        L_0x0633:
            r12 = r28
            r1 = r40
            X.0qQ.A0B(r1, r12)     // Catch:{ all -> 0x0f41 }
            android.content.res.Resources r12 = r44.getResources()     // Catch:{ all -> 0x0f41 }
            r1 = 2131165286(0x7f070066, float:1.7944785E38)
            int r39 = r12.getDimensionPixelSize(r1)     // Catch:{ all -> 0x0f41 }
            r1 = 2131165293(0x7f07006d, float:1.79448E38)
            int r38 = r12.getDimensionPixelSize(r1)     // Catch:{ all -> 0x0f41 }
            java.util.HashSet r37 = new java.util.HashSet     // Catch:{ all -> 0x0f41 }
            r37.<init>()     // Catch:{ all -> 0x0f41 }
            X.8jT r36 = X.C363288jT.A00(r46)     // Catch:{ all -> 0x0f41 }
            X.0qQ.A07(r36)     // Catch:{ all -> 0x0f41 }
            X.FTE r12 = X.FTE.A00     // Catch:{ all -> 0x0f41 }
            r1 = 1183(0x49f, float:1.658E-42)
            java.lang.String r35 = X.AnonymousClass000.A00(r1)     // Catch:{ all -> 0x0f41 }
            java.lang.String r1 = ""
            r15 = r12
            r14 = r36
            r13 = r1
            r12 = r37
            r1 = r35
            r14.A08(r15, r1, r13, r12)     // Catch:{ all -> 0x0f41 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0f41 }
            r1 = r37
            r14.<init>(r1)     // Catch:{ all -> 0x0f41 }
            r13 = r36
            r1 = r35
            r13.A09(r1, r14)     // Catch:{ all -> 0x0f41 }
            java.util.ArrayList r35 = new java.util.ArrayList     // Catch:{ all -> 0x0f41 }
            r35.<init>()     // Catch:{ all -> 0x0f41 }
            r13 = 0
        L_0x0681:
            int r1 = r14.size()     // Catch:{ all -> 0x0f41 }
            if (r13 >= r1) goto L_0x069f
            r1 = r27
            if (r13 >= r1) goto L_0x069f
            java.lang.Object r1 = X.00k.A0O(r14, r13)     // Catch:{ all -> 0x0f41 }
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1     // Catch:{ all -> 0x0f41 }
            if (r1 == 0) goto L_0x069c
            com.instagram.common.typedurl.ImageUrl r12 = r1.Bh3()     // Catch:{ all -> 0x0f41 }
            r1 = r35
            r1.add(r12)     // Catch:{ all -> 0x0f41 }
        L_0x069c:
            int r13 = r13 + 1
            goto L_0x0681
        L_0x069f:
            r15 = r39
            r14 = r38
            r13 = r35
            r12 = r40
            r1 = r44
            android.graphics.drawable.Drawable r12 = X.C63111Kre.A00(r1, r12, r13, r15, r14)     // Catch:{ all -> 0x0f41 }
            goto L_0x06e5
        L_0x06ae:
            java.util.List r1 = r11.A04     // Catch:{ all -> 0x0f41 }
            r39 = 2131165286(0x7f070066, float:1.7944785E38)
            r40 = 2131165293(0x7f07006d, float:1.79448E38)
            java.lang.Boolean r37 = java.lang.Boolean.valueOf(r19)     // Catch:{ all -> 0x0f41 }
            r35 = r44
            r36 = r43
            r38 = r1
            android.graphics.drawable.Drawable r12 = X.C70310O1o.A00(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0f41 }
            goto L_0x06e5
        L_0x06c5:
            android.content.res.Resources r12 = r44.getResources()     // Catch:{ all -> 0x0f41 }
            r1 = r37
            int r14 = r12.getDimensionPixelSize(r1)     // Catch:{ all -> 0x0f41 }
            r12 = 1069547520(0x3fc00000, float:1.5)
            r1 = r44
            float r1 = X.0nA.A00(r1, r12)     // Catch:{ all -> 0x0f41 }
            int r15 = X.AnonymousClass1GB.A01(r1)     // Catch:{ all -> 0x0f41 }
            r13 = r35
            r12 = r40
            r1 = r44
            android.graphics.drawable.Drawable r12 = X.C63111Kre.A00(r1, r12, r13, r14, r15)     // Catch:{ all -> 0x0f41 }
        L_0x06e5:
            java.lang.String r1 = r11.A02     // Catch:{ all -> 0x0f41 }
            r15 = r1
            java.lang.String r14 = r11.A01     // Catch:{ all -> 0x0f41 }
            java.lang.String r13 = r11.A00     // Catch:{ all -> 0x0f41 }
            java.util.Map r1 = X.C62539KhV.A01     // Catch:{ all -> 0x0f41 }
            java.lang.Object r11 = r1.get(r13)     // Catch:{ all -> 0x0f41 }
            X.KhV r11 = (X.C62539KhV) r11     // Catch:{ all -> 0x0f41 }
            if (r11 == 0) goto L_0x0d9f
            X.War r13 = new X.War     // Catch:{ all -> 0x0f41 }
            r13.<init>(r12, r11, r15, r14)     // Catch:{ all -> 0x0f41 }
        L_0x06fb:
            r0.A01 = r13     // Catch:{ all -> 0x0f41 }
            boolean r1 = r41.BvI()     // Catch:{ all -> 0x0f41 }
            if (r1 == 0) goto L_0x07e1
            java.util.List r1 = r0.A06     // Catch:{ all -> 0x0f41 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0f41 }
            r11.<init>(r1)     // Catch:{ all -> 0x0f41 }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x0f41 }
            r11 = r11 ^ 1
            if (r11 == 0) goto L_0x07e1
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0f41 }
            r13.<init>(r1)     // Catch:{ all -> 0x0f41 }
            int r12 = r13.size()     // Catch:{ all -> 0x0f41 }
            r11 = 3
            if (r11 <= r12) goto L_0x071f
            r11 = r12
        L_0x071f:
            java.util.List r1 = r13.subList(r7, r11)     // Catch:{ all -> 0x0f41 }
            java.util.ArrayList r35 = new java.util.ArrayList     // Catch:{ all -> 0x0f41 }
            r35.<init>()     // Catch:{ all -> 0x0f41 }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x0f41 }
        L_0x072c:
            boolean r11 = r13.hasNext()     // Catch:{ all -> 0x0f41 }
            if (r11 == 0) goto L_0x074b
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x0f41 }
            com.instagram.model.reels.Reel r11 = (com.instagram.model.reels.Reel) r11     // Catch:{ all -> 0x0f41 }
            com.instagram.common.typedurl.ImageUrl r11 = r11.A07()     // Catch:{ all -> 0x0f41 }
            if (r11 == 0) goto L_0x072c
            java.lang.String r12 = r11.getUrl()     // Catch:{ all -> 0x0f41 }
            X.0qQ.A07(r12)     // Catch:{ all -> 0x0f41 }
            r11 = r35
            r11.add(r12)     // Catch:{ all -> 0x0f41 }
            goto L_0x072c
        L_0x074b:
            X.4qK r11 = r0.A00     // Catch:{ all -> 0x0f41 }
            X.1UQ r12 = r11.A01     // Catch:{ all -> 0x0f41 }
            X.1UQ r11 = X.1UQ.A0Q     // Catch:{ all -> 0x0f41 }
            if (r12 != r11) goto L_0x0779
            r15 = 2131963438(0x7f132e2e, float:1.956363E38)
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0f41 }
            r12.<init>()     // Catch:{ all -> 0x0f41 }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x0f41 }
        L_0x075f:
            boolean r11 = r13.hasNext()     // Catch:{ all -> 0x0f41 }
            if (r11 == 0) goto L_0x07a3
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x0f41 }
            com.instagram.model.reels.Reel r11 = (com.instagram.model.reels.Reel) r11     // Catch:{ all -> 0x0f41 }
            com.instagram.user.model.User r11 = r11.A0D()     // Catch:{ all -> 0x0f41 }
            if (r11 == 0) goto L_0x075f
            java.lang.String r11 = r11.getUsername()     // Catch:{ all -> 0x0f41 }
            r12.add(r11)     // Catch:{ all -> 0x0f41 }
            goto L_0x075f
        L_0x0779:
            r40 = 2131165205(0x7f070015, float:1.794462E38)
            r41 = 2131165200(0x7f070010, float:1.794461E38)
            java.lang.Boolean r38 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0f41 }
            r36 = r44
            r37 = r43
            r39 = r35
            android.graphics.drawable.Drawable r12 = X.C70310O1o.A00(r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0f41 }
            r13 = 2131974342(0x7f1358c6, float:1.9585745E38)
            r11 = r44
            java.lang.String r14 = r11.getString(r13)     // Catch:{ all -> 0x0f41 }
            r13 = 2131975026(0x7f135b72, float:1.9587133E38)
            java.lang.String r11 = r11.getString(r13)     // Catch:{ all -> 0x0f41 }
            X.Was r13 = new X.Was     // Catch:{ all -> 0x0f41 }
            r13.<init>(r12, r14, r11, r1)     // Catch:{ all -> 0x0f41 }
            goto L_0x07df
        L_0x07a3:
            r11 = r27
            java.util.List r14 = X.00k.A0d(r12, r11)     // Catch:{ all -> 0x0f41 }
            java.lang.String r13 = ", "
            r12 = 0
            java.lang.String r11 = ""
            java.lang.String r11 = X.00k.A0P(r13, r11, r11, r14, r12)     // Catch:{ all -> 0x0f41 }
            java.lang.Object[] r13 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x0f41 }
            r11 = r44
            java.lang.String r12 = r11.getString(r15, r13)     // Catch:{ all -> 0x0f41 }
            X.0qQ.A07(r12)     // Catch:{ all -> 0x0f41 }
            r40 = 2131165205(0x7f070015, float:1.794462E38)
            r41 = 2131165200(0x7f070010, float:1.794461E38)
            java.lang.Boolean r38 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0f41 }
            r36 = r11
            r37 = r43
            r39 = r35
            android.graphics.drawable.Drawable r14 = X.C70310O1o.A00(r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0f41 }
            r13 = 2131975026(0x7f135b72, float:1.9587133E38)
            java.lang.String r11 = r11.getString(r13)     // Catch:{ all -> 0x0f41 }
            X.Waq r13 = new X.Waq     // Catch:{ all -> 0x0f41 }
            r13.<init>(r14, r12, r11, r1)     // Catch:{ all -> 0x0f41 }
        L_0x07df:
            r0.A01 = r13     // Catch:{ all -> 0x0f41 }
        L_0x07e1:
            r1 = r42
            X.5GJ r13 = r4.A02(r1)     // Catch:{ all -> 0x0f41 }
            if (r18 == 0) goto L_0x07fe
            X.3W1 r11 = r13.A09     // Catch:{ all -> 0x0f41 }
            r11.A0D(r3)     // Catch:{ all -> 0x0f41 }
            java.lang.String r12 = "This operation must be run on UI thread."
            X.11Z.A06(r12)     // Catch:{ all -> 0x0f41 }
            r1 = r21
            r11.A06 = r1     // Catch:{ all -> 0x0f41 }
            X.11Z.A06(r12)     // Catch:{ all -> 0x0f41 }
            r1 = r22
            r11.A07 = r1     // Catch:{ all -> 0x0f41 }
        L_0x07fe:
            X.2sD r12 = r5.A0e     // Catch:{ all -> 0x0f41 }
            goto L_0x08d8
        L_0x0802:
            X.1Xn r0 = r2.A05     // Catch:{ all -> 0x0f41 }
            X.1Xj r0 = X.1Xi.A02(r0)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0db0
            X.3W1 r13 = r4.BQr(r0)     // Catch:{ all -> 0x0f41 }
            boolean r1 = r13.A38     // Catch:{ all -> 0x0f41 }
            if (r1 == 0) goto L_0x0818
            r11 = 0
            X.2s2 r1 = r5.A04     // Catch:{ all -> 0x0f41 }
            r6.A9P(r1, r11, r11)     // Catch:{ all -> 0x0f41 }
        L_0x0818:
            X.3WA r11 = r13.A0m     // Catch:{ all -> 0x0f41 }
            X.3WA r1 = X.AnonymousClass3WA.A0F     // Catch:{ all -> 0x0f41 }
            if (r11 == r1) goto L_0x0827
            java.lang.String r11 = r0.getId()     // Catch:{ all -> 0x0f41 }
            r1 = r29
            r1.add(r11)     // Catch:{ all -> 0x0f41 }
        L_0x0827:
            r11 = 36322813300189641(0x810b68000029c9, double:3.0340316190448705E-306)
            r15 = r26
            r1 = r46
            boolean r1 = X.182.A06(r15, r1, r11)     // Catch:{ all -> 0x0f41 }
            if (r1 == 0) goto L_0x0855
            X.0uX r11 = X.0uX.A00(r46)     // Catch:{ all -> 0x0f41 }
            java.lang.String r1 = r0.getId()     // Catch:{ all -> 0x0f41 }
            X.0tj r11 = r11.A01(r1)     // Catch:{ all -> 0x0f41 }
            if (r11 == 0) goto L_0x0855
            int r1 = r13.getPosition()     // Catch:{ all -> 0x0f41 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0f41 }
            r11.A03 = r1     // Catch:{ all -> 0x0f41 }
            X.0uX r1 = X.0uX.A00(r46)     // Catch:{ all -> 0x0f41 }
            r1.A05(r11)     // Catch:{ all -> 0x0f41 }
        L_0x0855:
            X.1UQ r11 = X.1UQ.A0H     // Catch:{ all -> 0x0f41 }
            r1 = r45
            if (r1 != r11) goto L_0x08af
            X.1Xy r1 = r0.A0C     // Catch:{ all -> 0x0f41 }
            java.lang.String r11 = r1.BIl()     // Catch:{ all -> 0x0f41 }
            if (r11 == 0) goto L_0x08ad
            r1 = r24
            boolean r1 = r1.containsKey(r11)     // Catch:{ all -> 0x0f41 }
            if (r1 != 0) goto L_0x0874
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0f41 }
            r1 = r24
            r1.put(r11, r12)     // Catch:{ all -> 0x0f41 }
        L_0x0874:
            r1 = r24
            java.lang.Object r1 = r1.get(r11)     // Catch:{ all -> 0x0f41 }
            if (r1 == 0) goto L_0x0f3b
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x0f41 }
            int r14 = r1.intValue()     // Catch:{ all -> 0x0f41 }
            int r1 = r14 + 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0f41 }
            r1 = r24
            r1.put(r11, r12)     // Catch:{ all -> 0x0f41 }
        L_0x088d:
            r1 = r19
            r13.A2a = r1     // Catch:{ all -> 0x0f41 }
        L_0x0891:
            java.util.List r1 = r10.A01     // Catch:{ all -> 0x0f41 }
            int r1 = r1.size()     // Catch:{ all -> 0x0f41 }
            r13.A0D(r3)     // Catch:{ all -> 0x0f41 }
            r13.A0D = r1     // Catch:{ all -> 0x0f41 }
            r13.A0W = r14     // Catch:{ all -> 0x0f41 }
            boolean r1 = r0.A5D()     // Catch:{ all -> 0x0f41 }
            if (r1 == 0) goto L_0x08b1
            X.AnonymousClass4FX.A01(r0, r13)     // Catch:{ all -> 0x0f41 }
            r1 = r30
            r1.add(r0)     // Catch:{ all -> 0x0f41 }
            goto L_0x08b1
        L_0x08ad:
            r14 = -1
            goto L_0x088d
        L_0x08af:
            r14 = -1
            goto L_0x0891
        L_0x08b1:
            r11 = -1
            r1 = r23
            if (r1 == r11) goto L_0x08ca
            if (r3 <= r1) goto L_0x08ca
            r11 = 36323594984238379(0x810c1e00002d2b, double:3.0345259591848814E-306)
            r1 = r46
            boolean r1 = X.182.A06(r15, r1, r11)     // Catch:{ all -> 0x0f41 }
            if (r1 == 0) goto L_0x08ca
            r1 = r19
            r13.A2e = r1     // Catch:{ all -> 0x0f41 }
            goto L_0x08cc
        L_0x08ca:
            r13.A2e = r7     // Catch:{ all -> 0x0f41 }
        L_0x08cc:
            X.2ry r12 = r5.A0E     // Catch:{ all -> 0x0f41 }
            if (r12 == 0) goto L_0x08dd
            boolean r11 = r12.A03(r0)     // Catch:{ all -> 0x0f41 }
            r1 = r19
            if (r11 != r1) goto L_0x08dd
        L_0x08d8:
            r6.A9P(r12, r0, r13)     // Catch:{ all -> 0x0f41 }
            goto L_0x03ab
        L_0x08dd:
            boolean r1 = r13.A2e     // Catch:{ all -> 0x0f41 }
            if (r1 == 0) goto L_0x08e4
            if (r12 == 0) goto L_0x08e4
            goto L_0x08d8
        L_0x08e4:
            X.2s3 r0 = r5.A0D     // Catch:{ all -> 0x0f41 }
            r6.A9P(r0, r2, r13)     // Catch:{ all -> 0x0f41 }
            goto L_0x03ab
        L_0x08eb:
            X.4gm r1 = r2.A00     // Catch:{ all -> 0x0f41 }
            if (r1 == 0) goto L_0x03ab
            java.util.Map r12 = r4.A03     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x0f41 }
            java.lang.Object r11 = r12.get(r0)     // Catch:{ all -> 0x0f41 }
            X.GY3 r11 = (X.GY3) r11     // Catch:{ all -> 0x0f41 }
            if (r11 != 0) goto L_0x0903
            X.GY3 r11 = new X.GY3     // Catch:{ all -> 0x0f41 }
            r11.<init>()     // Catch:{ all -> 0x0f41 }
            r12.put(r0, r11)     // Catch:{ all -> 0x0f41 }
        L_0x0903:
            r11.A02(r3)     // Catch:{ all -> 0x0f41 }
            r0 = r21
            r11.A00(r0)     // Catch:{ all -> 0x0f41 }
            r0 = r22
            r11.A01(r0)     // Catch:{ all -> 0x0f41 }
            X.2tn r0 = r5.A0B     // Catch:{ all -> 0x0f41 }
            goto L_0x0b46
        L_0x0914:
            X.1Xn r1 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.TaggedEdgePostItem"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x0f41 }
            X.36B r1 = (X.AnonymousClass36B) r1     // Catch:{ all -> 0x0f41 }
            X.1Xj r0 = r1.BPf()     // Catch:{ all -> 0x0f41 }
            X.3W1 r11 = r4.BQr(r0)     // Catch:{ all -> 0x0f41 }
            r1 = -1
            java.util.List r0 = r10.A01     // Catch:{ all -> 0x0f41 }
            int r0 = r0.size()     // Catch:{ all -> 0x0f41 }
            r11.A0D(r3)     // Catch:{ all -> 0x0f41 }
            r11.A0D = r0     // Catch:{ all -> 0x0f41 }
            r11.A0W = r1     // Catch:{ all -> 0x0f41 }
            X.2s3 r0 = r5.A0D     // Catch:{ all -> 0x0f41 }
            r6.A9P(r0, r2, r11)     // Catch:{ all -> 0x0f41 }
            goto L_0x03ab
        L_0x093a:
            X.1Xn r9 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.su.model.SuggestedUsers"
            X.0qQ.A0C(r9, r0)     // Catch:{ all -> 0x0f41 }
            X.3UH r9 = (X.AnonymousClass3UH) r9     // Catch:{ all -> 0x0f41 }
            if (r9 == 0) goto L_0x03ab
            X.4aa r1 = r4.A00(r9)     // Catch:{ all -> 0x0f41 }
            r1.A00(r3)     // Catch:{ all -> 0x0f41 }
            r0 = r19
            r1.A06 = r0     // Catch:{ all -> 0x0f41 }
            java.lang.String r11 = "This operation must be run on UI thread."
            X.11Z.A06(r11)     // Catch:{ all -> 0x0f41 }
            r0 = r21
            r1.A00 = r0     // Catch:{ all -> 0x0f41 }
            X.11Z.A06(r11)     // Catch:{ all -> 0x0f41 }
            r0 = r22
            r1.A01 = r0     // Catch:{ all -> 0x0f41 }
            boolean r0 = r9.A08()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x097f
            boolean r0 = r9.A07()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x097f
            java.util.List r0 = r9.A04()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x03ab
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x03ab
            X.2sF r0 = r5.A0O     // Catch:{ all -> 0x0f41 }
        L_0x097a:
            r6.A9P(r0, r9, r1)     // Catch:{ all -> 0x0f41 }
            goto L_0x03ab
        L_0x097f:
            X.2s0 r0 = r5.A01     // Catch:{ all -> 0x0f41 }
            goto L_0x097a
        L_0x0982:
            X.1Xn r12 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.followrequests.models.FollowRequests"
            X.0qQ.A0C(r12, r0)     // Catch:{ all -> 0x0f41 }
            X.WWQ r12 = (X.WWQ) r12     // Catch:{ all -> 0x0f41 }
            X.QP6 r0 = r12.A01     // Catch:{ all -> 0x0f41 }
            java.lang.String r1 = r0.A05     // Catch:{ all -> 0x0f41 }
            if (r1 == 0) goto L_0x03ab
            java.util.List r13 = r12.A00     // Catch:{ all -> 0x0f41 }
            if (r13 == 0) goto L_0x03ab
            java.util.Map r0 = r4.A07     // Catch:{ all -> 0x0f41 }
            java.lang.Object r11 = r0.get(r1)     // Catch:{ all -> 0x0f41 }
            if (r11 != 0) goto L_0x09a5
            X.IUh r11 = new X.IUh     // Catch:{ all -> 0x0f41 }
            r11.<init>()     // Catch:{ all -> 0x0f41 }
            r0.put(r1, r11)     // Catch:{ all -> 0x0f41 }
        L_0x09a5:
            X.IUh r11 = (X.C57246IUh) r11     // Catch:{ all -> 0x0f41 }
            X.2sC r1 = r5.A0G     // Catch:{ all -> 0x0f41 }
            boolean r0 = r12.A02     // Catch:{ all -> 0x0f41 }
            r1.A03 = r0     // Catch:{ all -> 0x0f41 }
            int r0 = r13.size()     // Catch:{ all -> 0x0f41 }
            r1.A00 = r0     // Catch:{ all -> 0x0f41 }
            r11.A02(r3)     // Catch:{ all -> 0x0f41 }
            r0 = r21
            r11.A00(r0)     // Catch:{ all -> 0x0f41 }
            r0 = r22
            r11.A01(r0)     // Catch:{ all -> 0x0f41 }
            r6.A9P(r1, r12, r11)     // Catch:{ all -> 0x0f41 }
            goto L_0x03ab
        L_0x09c5:
            X.1Xn r12 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.netego.model.SimpleAction"
            X.0qQ.A0C(r12, r0)     // Catch:{ all -> 0x0f41 }
            X.4g7 r12 = (X.C270054g7) r12     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0B(r12, r7)     // Catch:{ all -> 0x0f41 }
            java.util.Map r1 = r4.A0E     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r12.getId()     // Catch:{ all -> 0x0f41 }
            java.lang.Object r11 = r1.get(r0)     // Catch:{ all -> 0x0f41 }
            X.IUl r11 = (X.C57250IUl) r11     // Catch:{ all -> 0x0f41 }
            if (r11 != 0) goto L_0x09eb
            X.IUl r11 = new X.IUl     // Catch:{ all -> 0x0f41 }
            r11.<init>()     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r12.getId()     // Catch:{ all -> 0x0f41 }
            r1.put(r0, r11)     // Catch:{ all -> 0x0f41 }
        L_0x09eb:
            r11.A00(r3)     // Catch:{ all -> 0x0f41 }
            X.2sH r0 = r5.A0I     // Catch:{ all -> 0x0f41 }
            goto L_0x0cb1
        L_0x09f2:
            X.1Xn r14 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r13 = "null cannot be cast to non-null type com.instagram.feed.feeditem.FeedSurveyItem"
            X.0qQ.A0C(r14, r13)     // Catch:{ all -> 0x0f41 }
            r1 = r14
            X.WWP r1 = (X.WWP) r1     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0B(r1, r7)     // Catch:{ all -> 0x0f41 }
            java.util.Map r12 = r4.A0H     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r1.getId()     // Catch:{ all -> 0x0f41 }
            java.lang.Object r11 = r12.get(r0)     // Catch:{ all -> 0x0f41 }
            X.IUm r11 = (X.C57251IUm) r11     // Catch:{ all -> 0x0f41 }
            if (r11 != 0) goto L_0x0a15
            X.IUm r11 = new X.IUm     // Catch:{ all -> 0x0f41 }
            r11.<init>()     // Catch:{ all -> 0x0f41 }
            r12.put(r0, r11)     // Catch:{ all -> 0x0f41 }
        L_0x0a15:
            r11.A00(r3)     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0C(r14, r13)     // Catch:{ all -> 0x0f41 }
            X.2sI r0 = r5.A0J     // Catch:{ all -> 0x0f41 }
            goto L_0x0b46
        L_0x0a1f:
            X.1Xn r13 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r12 = "null cannot be cast to non-null type com.instagram.feed.feeditem.ClipsNetego"
            X.0qQ.A0C(r13, r12)     // Catch:{ all -> 0x0f41 }
            r1 = r13
            X.3Y6 r1 = (X.AnonymousClass3Y6) r1     // Catch:{ all -> 0x0f41 }
            X.5jX r11 = r4.A01(r1)     // Catch:{ all -> 0x0f41 }
            r11.A00 = r3     // Catch:{ all -> 0x0f41 }
            r0 = r21
            r11.A00(r0)     // Catch:{ all -> 0x0f41 }
            r0 = r22
            r11.A01(r0)     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0C(r13, r12)     // Catch:{ all -> 0x0f41 }
            X.2s7 r0 = r5.A0U     // Catch:{ all -> 0x0f41 }
            goto L_0x0b46
        L_0x0a40:
            X.1Xn r12 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.notes.model.NotesNetegoItem"
            X.0qQ.A0C(r12, r0)     // Catch:{ all -> 0x0f41 }
            X.DHK r12 = (X.DHK) r12     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0B(r12, r7)     // Catch:{ all -> 0x0f41 }
            java.util.Map r1 = r4.A0C     // Catch:{ all -> 0x0f41 }
            X.BBM r0 = r12.A00     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x0a56
            java.lang.String r0 = ""
        L_0x0a56:
            java.lang.Object r11 = r1.get(r0)     // Catch:{ all -> 0x0f41 }
            if (r11 != 0) goto L_0x0a64
            X.IUi r11 = new X.IUi     // Catch:{ all -> 0x0f41 }
            r11.<init>()     // Catch:{ all -> 0x0f41 }
            r1.put(r0, r11)     // Catch:{ all -> 0x0f41 }
        L_0x0a64:
            X.IUi r11 = (X.C57247IUi) r11     // Catch:{ all -> 0x0f41 }
            r11.A00(r3)     // Catch:{ all -> 0x0f41 }
            X.2sM r0 = r5.A0H     // Catch:{ all -> 0x0f41 }
            goto L_0x0cb1
        L_0x0a6d:
            X.1Xn r12 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.tifu.model.TifuNetegoItem"
            X.0qQ.A0C(r12, r0)     // Catch:{ all -> 0x0f41 }
            X.4oe r12 = (X.C274594oe) r12     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0B(r12, r7)     // Catch:{ all -> 0x0f41 }
            java.util.Map r1 = r4.A0I     // Catch:{ all -> 0x0f41 }
            X.4oc r0 = r12.A03     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r0.A09     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x0a83
            java.lang.String r0 = ""
        L_0x0a83:
            java.lang.Object r11 = r1.get(r0)     // Catch:{ all -> 0x0f41 }
            if (r11 != 0) goto L_0x0a91
            X.5O4 r11 = new X.5O4     // Catch:{ all -> 0x0f41 }
            r11.<init>()     // Catch:{ all -> 0x0f41 }
            r1.put(r0, r11)     // Catch:{ all -> 0x0f41 }
        L_0x0a91:
            X.5O4 r11 = (X.AnonymousClass5O4) r11     // Catch:{ all -> 0x0f41 }
            r11.A00(r3)     // Catch:{ all -> 0x0f41 }
            X.2sN r0 = r5.A0K     // Catch:{ all -> 0x0f41 }
            goto L_0x0cb1
        L_0x0a9a:
            X.1Xn r1 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.aiconsumption.model.MemuInFeedNetegoItem"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x0f41 }
            X.DHJ r1 = (X.DHJ) r1     // Catch:{ all -> 0x0f41 }
            X.2tw r11 = r5.A08     // Catch:{ all -> 0x0f41 }
            goto L_0x0cc1
        L_0x0aa7:
            X.1Xn r13 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r12 = "null cannot be cast to non-null type com.instagram.feed.feeditem.SuggestedChannels"
            X.0qQ.A0C(r13, r12)     // Catch:{ all -> 0x0f41 }
            r1 = r13
            com.instagram.feed.feeditem.SuggestedChannels r1 = (com.instagram.feed.feeditem.SuggestedChannels) r1     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0B(r1, r7)     // Catch:{ all -> 0x0f41 }
            java.util.Map r14 = r4.A0F     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r1.getId()     // Catch:{ all -> 0x0f41 }
            java.lang.Object r11 = r14.get(r0)     // Catch:{ all -> 0x0f41 }
            if (r11 != 0) goto L_0x0ac8
            X.IUg r11 = new X.IUg     // Catch:{ all -> 0x0f41 }
            r11.<init>()     // Catch:{ all -> 0x0f41 }
            r14.put(r0, r11)     // Catch:{ all -> 0x0f41 }
        L_0x0ac8:
            X.IUg r11 = (X.C57245IUg) r11     // Catch:{ all -> 0x0f41 }
            r11.A02(r3)     // Catch:{ all -> 0x0f41 }
            r0 = r21
            r11.A00(r0)     // Catch:{ all -> 0x0f41 }
            r0 = r22
            r11.A01(r0)     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0C(r13, r12)     // Catch:{ all -> 0x0f41 }
            X.2sL r0 = r5.A0T     // Catch:{ all -> 0x0f41 }
            goto L_0x0b46
        L_0x0add:
            X.1Xn r13 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r12 = "null cannot be cast to non-null type com.instagram.feed.feeditem.BusinessConversionNetegoItem"
            X.0qQ.A0C(r13, r12)     // Catch:{ all -> 0x0f41 }
            r1 = r13
            X.5j1 r1 = (X.AnonymousClass5j1) r1     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0B(r1, r7)     // Catch:{ all -> 0x0f41 }
            java.util.Map r15 = r4.A04     // Catch:{ all -> 0x0f41 }
            java.lang.String r14 = r1.getId()     // Catch:{ all -> 0x0f41 }
            java.lang.Object r11 = r15.get(r14)     // Catch:{ all -> 0x0f41 }
            if (r11 != 0) goto L_0x0b02
            com.instagram.common.session.UserSession r0 = r4.A01     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x0f41 }
            X.IUk r11 = new X.IUk     // Catch:{ all -> 0x0f41 }
            r11.<init>(r0)     // Catch:{ all -> 0x0f41 }
            r15.put(r14, r11)     // Catch:{ all -> 0x0f41 }
        L_0x0b02:
            X.IUk r11 = (X.C57249IUk) r11     // Catch:{ all -> 0x0f41 }
            r11.A02(r3)     // Catch:{ all -> 0x0f41 }
            r0 = r21
            r11.A00(r0)     // Catch:{ all -> 0x0f41 }
            r0 = r22
            r11.A01(r0)     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0C(r13, r12)     // Catch:{ all -> 0x0f41 }
            X.2sJ r0 = r5.A0C     // Catch:{ all -> 0x0f41 }
            goto L_0x0b46
        L_0x0b17:
            r1 = 1
            if (r3 <= 0) goto L_0x0b1b
            goto L_0x0b1d
        L_0x0b1b:
            r1 = 0
            goto L_0x0b34
        L_0x0b1d:
            int r11 = r3 - r19
            java.util.List r0 = r10.A01     // Catch:{ all -> 0x0f41 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x0f41 }
            X.1Xg r0 = (X.1Xg) r0     // Catch:{ all -> 0x0f41 }
            X.1UQ r11 = r0.A06     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0B(r11, r7)     // Catch:{ all -> 0x0f41 }
            X.1UQ r0 = X.1UQ.A0f     // Catch:{ all -> 0x0f41 }
            if (r11 == r0) goto L_0x0b34
            X.1UQ r0 = X.1UQ.A0g     // Catch:{ all -> 0x0f41 }
            if (r11 != r0) goto L_0x0b1b
        L_0x0b34:
            X.XTm r11 = new X.XTm     // Catch:{ all -> 0x0f41 }
            r11.<init>()     // Catch:{ all -> 0x0f41 }
            r11.A00 = r1     // Catch:{ all -> 0x0f41 }
            X.1Xn r1 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.SeparatorItem"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x0f41 }
            X.DHH r1 = (X.DHH) r1     // Catch:{ all -> 0x0f41 }
            X.2t7 r0 = r5.A0a     // Catch:{ all -> 0x0f41 }
        L_0x0b46:
            r6.A9P(r0, r1, r11)     // Catch:{ all -> 0x0f41 }
            goto L_0x03ab
        L_0x0b4b:
            X.1Xn r12 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.FamilyBridgesBasicNetegoFeedItem"
            X.0qQ.A0C(r12, r0)     // Catch:{ all -> 0x0f41 }
            X.3O8 r12 = (X.AnonymousClass3O8) r12     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0B(r12, r7)     // Catch:{ all -> 0x0f41 }
            java.util.Map r1 = r4.A06     // Catch:{ all -> 0x0f41 }
            X.JRZ r0 = r12.A00     // Catch:{ all -> 0x0f41 }
            X.GoZ r0 = (X.C53441GoZ) r0     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r0.A09     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x0b63
            java.lang.String r0 = ""
        L_0x0b63:
            java.lang.Object r11 = r1.get(r0)     // Catch:{ all -> 0x0f41 }
            if (r11 != 0) goto L_0x0b71
            X.IUj r11 = new X.IUj     // Catch:{ all -> 0x0f41 }
            r11.<init>()     // Catch:{ all -> 0x0f41 }
            r1.put(r0, r11)     // Catch:{ all -> 0x0f41 }
        L_0x0b71:
            X.IUj r11 = (X.C57248IUj) r11     // Catch:{ all -> 0x0f41 }
            r11.A00(r3)     // Catch:{ all -> 0x0f41 }
            X.2s6 r0 = r5.A0W     // Catch:{ all -> 0x0f41 }
            goto L_0x0cb1
        L_0x0b7a:
            X.1Xn r12 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.EndOfFeedDemarcatorUnit"
            X.0qQ.A0C(r12, r0)     // Catch:{ all -> 0x0f41 }
            X.1sU r12 = (X.1sU) r12     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0B(r12, r7)     // Catch:{ all -> 0x0f41 }
            java.util.Map r15 = r4.A05     // Catch:{ all -> 0x0f41 }
            X.4ZE r0 = r12.A04     // Catch:{ all -> 0x0f41 }
            java.lang.String r14 = r0.A0B     // Catch:{ all -> 0x0f41 }
            java.lang.Object r11 = r15.get(r14)     // Catch:{ all -> 0x0f41 }
            X.523 r11 = (X.AnonymousClass523) r11     // Catch:{ all -> 0x0f41 }
            if (r11 != 0) goto L_0x0ba4
            long r0 = r4.A00     // Catch:{ all -> 0x0f41 }
            com.instagram.common.session.UserSession r13 = r4.A01     // Catch:{ all -> 0x0f41 }
            X.523 r11 = new X.523     // Catch:{ all -> 0x0f41 }
            r11.<init>(r13, r0)     // Catch:{ all -> 0x0f41 }
            if (r14 != 0) goto L_0x0ba1
            java.lang.String r14 = ""
        L_0x0ba1:
            r15.put(r14, r11)     // Catch:{ all -> 0x0f41 }
        L_0x0ba4:
            r11.A01(r3)     // Catch:{ all -> 0x0f41 }
            X.2td r0 = r5.A0Y     // Catch:{ all -> 0x0f41 }
            goto L_0x0cb1
        L_0x0bab:
            if (r17 == 0) goto L_0x0bc8
            X.1UQ r1 = X.1UQ.A0F     // Catch:{ all -> 0x0f41 }
            r0 = r17
            X.1UQ r0 = r0.A06     // Catch:{ all -> 0x0f41 }
            if (r1 != r0) goto L_0x0bc8
            r0 = r17
            X.1Xn r1 = r0.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.EndOfFeedDemarcatorUnit"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x0f41 }
            X.1sU r1 = (X.1sU) r1     // Catch:{ all -> 0x0f41 }
            com.instagram.api.schemas.DemarcatorStyleEnum r1 = r1.A03     // Catch:{ all -> 0x0f41 }
            com.instagram.api.schemas.DemarcatorStyleEnum r0 = com.instagram.api.schemas.DemarcatorStyleEnum.ON_TOP_V1     // Catch:{ all -> 0x0f41 }
            if (r1 != r0) goto L_0x0bc8
            goto L_0x0d7f
        L_0x0bc8:
            X.1Xn r12 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.FeedItemGroupSet"
            X.0qQ.A0C(r12, r0)     // Catch:{ all -> 0x0f41 }
            X.4ZI r12 = (X.AnonymousClass4ZI) r12     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0B(r12, r7)     // Catch:{ all -> 0x0f41 }
            java.util.Map r1 = r4.A08     // Catch:{ all -> 0x0f41 }
            X.4ZG r0 = r12.A00     // Catch:{ all -> 0x0f41 }
            X.4lF r0 = (X.C272714lF) r0     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x0f41 }
            java.lang.Object r11 = r1.get(r0)     // Catch:{ all -> 0x0f41 }
            X.51s r11 = (X.C2804151s) r11     // Catch:{ all -> 0x0f41 }
            if (r11 != 0) goto L_0x0bf0
            X.51s r11 = new X.51s     // Catch:{ all -> 0x0f41 }
            r11.<init>()     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x0bed
            java.lang.String r0 = ""
        L_0x0bed:
            r1.put(r0, r11)     // Catch:{ all -> 0x0f41 }
        L_0x0bf0:
            X.2rI r0 = r5.A0P     // Catch:{ all -> 0x0f41 }
            r0.A04 = r12     // Catch:{ all -> 0x0f41 }
            r11.A00(r3)     // Catch:{ all -> 0x0f41 }
            com.instagram.mainfeed.unconnectedcontent.GroupSetBinderGroup r0 = r5.A0Z     // Catch:{ all -> 0x0f41 }
            goto L_0x0cb1
        L_0x0bfb:
            X.1Xn r11 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.JestE2EEndOfFeedIndicator"
            X.0qQ.A0C(r11, r0)     // Catch:{ all -> 0x0f41 }
            X.2te r1 = r5.A09     // Catch:{ all -> 0x0f41 }
            r0 = 0
            r6.A9P(r1, r11, r0)     // Catch:{ all -> 0x0f41 }
            goto L_0x03ab
        L_0x0c0a:
            X.Gz1 r12 = r2.A01()     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0B(r12, r7)     // Catch:{ all -> 0x0f41 }
            java.util.Map r1 = r4.A09     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r12.getId()     // Catch:{ all -> 0x0f41 }
            java.lang.Object r11 = r1.get(r0)     // Catch:{ all -> 0x0f41 }
            com.instagram.feed.ui.state.IntentAwareAdPivotState r11 = (com.instagram.feed.ui.state.IntentAwareAdPivotState) r11     // Catch:{ all -> 0x0f41 }
            if (r11 != 0) goto L_0x0c55
            com.instagram.feed.ui.state.IntentAwareAdPivotState r11 = new com.instagram.feed.ui.state.IntentAwareAdPivotState     // Catch:{ all -> 0x0f41 }
            r11.<init>()     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r12.getId()     // Catch:{ all -> 0x0f41 }
            r1.put(r0, r11)     // Catch:{ all -> 0x0f41 }
            java.util.List r0 = r12.A0B     // Catch:{ all -> 0x0f41 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x0f41 }
        L_0x0c31:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0c55
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x0f41 }
            X.Hpk r14 = (X.C55923Hpk) r14     // Catch:{ all -> 0x0f41 }
            X.3W1 r13 = new X.3W1     // Catch:{ all -> 0x0f41 }
            r13.<init>(r7)     // Catch:{ all -> 0x0f41 }
            X.1sy r0 = X.1sy.A0H     // Catch:{ all -> 0x0f41 }
            r13.A0O(r0)     // Catch:{ all -> 0x0f41 }
            java.util.Map r1 = r4.A0A     // Catch:{ all -> 0x0f41 }
            X.1Xj r0 = r14.A00()     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x0f41 }
            r1.put(r0, r13)     // Catch:{ all -> 0x0f41 }
            goto L_0x0c31
        L_0x0c55:
            r11.A02 = r3     // Catch:{ all -> 0x0f41 }
            X.2tf r0 = r5.A0X     // Catch:{ all -> 0x0f41 }
            goto L_0x0cb1
        L_0x0c5a:
            X.1Xn r11 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.LocalFeedShimmerItem"
            X.0qQ.A0C(r11, r0)     // Catch:{ all -> 0x0f41 }
            X.Fbk r11 = (X.C50437Fbk) r11     // Catch:{ all -> 0x0f41 }
            X.EVn r1 = r11.A00     // Catch:{ all -> 0x0f41 }
            X.EVn r0 = X.C48095EVn.A04     // Catch:{ all -> 0x0f41 }
            if (r1 != r0) goto L_0x03ab
            X.2t8 r1 = r5.A0V     // Catch:{ all -> 0x0f41 }
            r0 = 0
            r6.A9P(r1, r11, r0)     // Catch:{ all -> 0x0f41 }
            goto L_0x03ab
        L_0x0c71:
            X.1Xn r11 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.mainfeed.afi.model.AfiFeedItem"
            X.0qQ.A0C(r11, r0)     // Catch:{ all -> 0x0f41 }
            X.IVr r11 = (X.C57282IVr) r11     // Catch:{ all -> 0x0f41 }
            X.3W1 r1 = new X.3W1     // Catch:{ all -> 0x0f41 }
            r1.<init>(r7)     // Catch:{ all -> 0x0f41 }
            X.2tg r0 = r5.A0S     // Catch:{ all -> 0x0f41 }
            r6.A9P(r0, r11, r1)     // Catch:{ all -> 0x0f41 }
            goto L_0x03ab
        L_0x0c86:
            X.1Xn r12 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.mainfeed.afi.model.AfiInterestsPickerFeedItem"
            X.0qQ.A0C(r12, r0)     // Catch:{ all -> 0x0f41 }
            X.IVp r12 = (X.C57280IVp) r12     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0B(r12, r7)     // Catch:{ all -> 0x0f41 }
            java.util.Map r1 = r4.A02     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r12.getId()     // Catch:{ all -> 0x0f41 }
            java.lang.Object r11 = r1.get(r0)     // Catch:{ all -> 0x0f41 }
            X.IUf r11 = (X.C57244IUf) r11     // Catch:{ all -> 0x0f41 }
            if (r11 != 0) goto L_0x0cac
            X.IUf r11 = new X.IUf     // Catch:{ all -> 0x0f41 }
            r11.<init>()     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r12.getId()     // Catch:{ all -> 0x0f41 }
            r1.put(r0, r11)     // Catch:{ all -> 0x0f41 }
        L_0x0cac:
            r11.A00(r3)     // Catch:{ all -> 0x0f41 }
            X.2th r0 = r5.A0Q     // Catch:{ all -> 0x0f41 }
        L_0x0cb1:
            r6.A9P(r0, r12, r11)     // Catch:{ all -> 0x0f41 }
            goto L_0x03ab
        L_0x0cb6:
            X.1Xn r1 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.mainfeed.afi.model.AfiRepetitionFeedItem"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x0f41 }
            X.IVq r1 = (X.C57281IVq) r1     // Catch:{ all -> 0x0f41 }
            X.2ti r11 = r5.A0R     // Catch:{ all -> 0x0f41 }
        L_0x0cc1:
            r0 = 0
            r6.A9P(r11, r1, r0)     // Catch:{ all -> 0x0f41 }
            goto L_0x03ab
        L_0x0cc7:
            X.1Xn r11 = r2.A05     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.media.Media"
            X.0qQ.A0C(r11, r0)     // Catch:{ all -> 0x0f41 }
            X.1Xj r11 = (X.1Xj) r11     // Catch:{ all -> 0x0f41 }
            X.2tf r14 = r5.A0X     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0B(r11, r7)     // Catch:{ all -> 0x0f41 }
            com.google.common.collect.ImmutableList r1 = r11.A1D()     // Catch:{ all -> 0x0f41 }
            boolean r0 = r1 instanceof java.util.Collection     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0ce5
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0ce5
            goto L_0x0dbe
        L_0x0ce5:
            java.util.Iterator r12 = r1.iterator()     // Catch:{ all -> 0x0f41 }
        L_0x0ce9:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0dbe
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x0f41 }
            X.1Xj r1 = (X.1Xj) r1     // Catch:{ all -> 0x0f41 }
            com.instagram.common.session.UserSession r0 = r14.A00     // Catch:{ all -> 0x0f41 }
            X.1se r0 = X.1sd.A00(r0)     // Catch:{ all -> 0x0f41 }
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x0f41 }
            boolean r0 = r0.A05(r1)     // Catch:{ all -> 0x0f41 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0ce9
            X.CwO r0 = X.C44851Cm1.A00(r46)     // Catch:{ all -> 0x0f41 }
            X.Gz1 r13 = r0.A00(r11, r3)     // Catch:{ all -> 0x0f41 }
            java.util.Map r1 = r4.A09     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r11.getId()     // Catch:{ all -> 0x0f41 }
            java.lang.Object r12 = r1.get(r0)     // Catch:{ all -> 0x0f41 }
            com.instagram.feed.ui.state.IntentAwareAdPivotState r12 = (com.instagram.feed.ui.state.IntentAwareAdPivotState) r12     // Catch:{ all -> 0x0f41 }
            if (r12 != 0) goto L_0x0d5b
            com.instagram.feed.ui.state.IntentAwareAdPivotState r12 = new com.instagram.feed.ui.state.IntentAwareAdPivotState     // Catch:{ all -> 0x0f41 }
            r12.<init>()     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r11.getId()     // Catch:{ all -> 0x0f41 }
            r1.put(r0, r12)     // Catch:{ all -> 0x0f41 }
            com.google.common.collect.ImmutableList r0 = r11.A1D()     // Catch:{ all -> 0x0f41 }
            X.3kO r35 = r0.iterator()     // Catch:{ all -> 0x0f41 }
            X.0qQ.A07(r35)     // Catch:{ all -> 0x0f41 }
        L_0x0d33:
            boolean r0 = r35.hasNext()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0d5b
            java.lang.Object r15 = r35.next()     // Catch:{ all -> 0x0f41 }
            X.1Xj r15 = (X.1Xj) r15     // Catch:{ all -> 0x0f41 }
            int r1 = r15.A0o()     // Catch:{ all -> 0x0f41 }
            boolean r0 = r15.A4o()     // Catch:{ all -> 0x0f41 }
            X.3W1 r11 = new X.3W1     // Catch:{ all -> 0x0f41 }
            r11.<init>(r1, r0)     // Catch:{ all -> 0x0f41 }
            X.1sy r0 = X.1sy.A0H     // Catch:{ all -> 0x0f41 }
            r11.A0O(r0)     // Catch:{ all -> 0x0f41 }
            java.util.Map r1 = r4.A0A     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = r15.getId()     // Catch:{ all -> 0x0f41 }
            r1.put(r0, r11)     // Catch:{ all -> 0x0f41 }
            goto L_0x0d33
        L_0x0d5b:
            r12.A02 = r3     // Catch:{ all -> 0x0f41 }
            r6.A9P(r14, r13, r12)     // Catch:{ all -> 0x0f41 }
            goto L_0x03ab
        L_0x0d62:
            X.0gF r1 = X.C60340gF.A00     // Catch:{ all -> 0x0f41 }
            X.2ty r0 = r5.A07     // Catch:{ all -> 0x0f41 }
            r6.A9P(r0, r1, r1)     // Catch:{ all -> 0x0f41 }
            r23 = r3
            goto L_0x03ab
        L_0x0d6d:
            r21 = r3
            goto L_0x0d7f
        L_0x0d70:
            boolean r0 = X.AnonymousClass3VP.A03(r2)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0d7f
            X.4ai r1 = X.C267004ai.NETEGO     // Catch:{ all -> 0x0f41 }
            r0 = r48
            r0.put(r3, r1)     // Catch:{ all -> 0x0f41 }
            r22 = r3
        L_0x0d7f:
            int r3 = r3 + 1
            goto L_0x0390
        L_0x0d83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0f41 }
            r1.<init>(r14)     // Catch:{ all -> 0x0f41 }
            goto L_0x0f40
        L_0x0d8a:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0f41 }
            goto L_0x0f40
        L_0x0d8e:
            r0 = 128(0x80, float:1.794E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = X.002.A0R(r0, r12)     // Catch:{ all -> 0x0f41 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0f41 }
            r1.<init>(r0)     // Catch:{ all -> 0x0f41 }
            goto L_0x0f40
        L_0x0d9f:
            r0 = 128(0x80, float:1.794E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0f41 }
            java.lang.String r0 = X.002.A0R(r0, r13)     // Catch:{ all -> 0x0f41 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0f41 }
            r1.<init>(r0)     // Catch:{ all -> 0x0f41 }
            goto L_0x0f40
        L_0x0db0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0f41 }
            r1.<init>(r14)     // Catch:{ all -> 0x0f41 }
            goto L_0x0f40
        L_0x0db7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0f41 }
            r1.<init>(r14)     // Catch:{ all -> 0x0f41 }
            goto L_0x0f40
        L_0x0dbe:
            if (r9 != 0) goto L_0x0dc2
            r9 = r32
        L_0x0dc2:
            int r0 = r10.A02()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0dd0
            X.2sK r2 = r5.A0i     // Catch:{ all -> 0x0f41 }
            r1 = 0
            r0 = r49
            r6.A9P(r2, r0, r1)     // Catch:{ all -> 0x0f41 }
        L_0x0dd0:
            boolean r0 = r10.A02     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0e48
            int r0 = r10.A02()     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x0e48
            boolean r0 = r50.isEmpty()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0e48
            if (r20 == 0) goto L_0x0de8
            r0 = r20
            X.Eb1 r0 = r0.A00     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x0e48
        L_0x0de8:
            java.lang.String r2 = "case"
            if (r32 == 0) goto L_0x0e6e
            java.lang.String r1 = "suggestions"
            X.0eP r0 = new X.0eP     // Catch:{ all -> 0x0f41 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0f41 }
            java.util.Map r3 = X.0se.A0M(r0)     // Catch:{ all -> 0x0f41 }
            X.EZu r2 = X.C48152EZu.A0H     // Catch:{ all -> 0x0f41 }
            java.lang.String r1 = "upsell_impressions"
            r0 = r46
            X.FFL.A01(r2, r0, r1, r3)     // Catch:{ all -> 0x0f41 }
            android.content.Context r10 = r5.A00     // Catch:{ all -> 0x0f41 }
            com.instagram.api.schemas.SuggestedUsersStyle r1 = X.C266964ad.A00(r32)     // Catch:{ all -> 0x0f41 }
            com.instagram.api.schemas.SuggestedUsersStyle r0 = com.instagram.api.schemas.SuggestedUsersStyle.NO_CONTENT_THUMBNAIL     // Catch:{ all -> 0x0f41 }
            r3 = 0
            if (r1 == r0) goto L_0x0e0c
            r3 = 1
        L_0x0e0c:
            X.F0f r2 = new X.F0f     // Catch:{ all -> 0x0f41 }
            r2.<init>()     // Catch:{ all -> 0x0f41 }
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x0f41 }
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0f41 }
            r2.A01 = r0     // Catch:{ all -> 0x0f41 }
            r0 = r19
            r2.A06 = r0     // Catch:{ all -> 0x0f41 }
            r0 = 2131968722(0x7f1342d2, float:1.9574347E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ NotFoundException -> 0x0e32 }
            r2.A04 = r0     // Catch:{ NotFoundException -> 0x0e32 }
            r0 = 2131968721(0x7f1342d1, float:1.9574345E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ NotFoundException -> 0x0e32 }
            r2.A03 = r0     // Catch:{ NotFoundException -> 0x0e32 }
        L_0x0e32:
            r2.A05 = r3     // Catch:{ all -> 0x0f41 }
            X.2tm r1 = r5.A0h     // Catch:{ all -> 0x0f41 }
            r0 = 0
            r6.A9P(r1, r2, r0)     // Catch:{ all -> 0x0f41 }
            r0 = r32
            X.4aa r2 = r4.A00(r0)     // Catch:{ all -> 0x0f41 }
            r2.A00(r7)     // Catch:{ all -> 0x0f41 }
            r2.A06 = r7     // Catch:{ all -> 0x0f41 }
            X.2s0 r1 = r5.A01     // Catch:{ all -> 0x0f41 }
            goto L_0x0e87
        L_0x0e48:
            int r0 = r10.A02()     // Catch:{ all -> 0x0f41 }
            if (r0 != 0) goto L_0x0e8a
            X.3Bd r0 = X.C238243Bc.A00(r46)     // Catch:{ all -> 0x0f41 }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0e8a
            java.lang.Integer r0 = X.AnonymousClass05K.A15     // Catch:{ all -> 0x0f41 }
            X.3Be r2 = new X.3Be     // Catch:{ all -> 0x0f41 }
            r2.<init>(r0)     // Catch:{ all -> 0x0f41 }
            X.3Bf r1 = new X.3Bf     // Catch:{ all -> 0x0f41 }
            r1.<init>()     // Catch:{ all -> 0x0f41 }
            r0 = r19
            r1.A00 = r0     // Catch:{ all -> 0x0f41 }
            X.2tt r0 = r5.A0M     // Catch:{ all -> 0x0f41 }
            r6.A9P(r0, r2, r1)     // Catch:{ all -> 0x0f41 }
            goto L_0x0e8a
        L_0x0e6e:
            java.lang.String r1 = "welcome_card"
            X.0eP r0 = new X.0eP     // Catch:{ all -> 0x0f41 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0f41 }
            java.util.Map r3 = X.0se.A0M(r0)     // Catch:{ all -> 0x0f41 }
            X.EZu r2 = X.C48152EZu.A0H     // Catch:{ all -> 0x0f41 }
            java.lang.String r1 = "upsell_impressions"
            r0 = r46
            X.FFL.A01(r2, r0, r1, r3)     // Catch:{ all -> 0x0f41 }
            X.HLd r2 = X.C54620HLd.GENERIC_FEED     // Catch:{ all -> 0x0f41 }
            X.2tl r1 = r5.A0L     // Catch:{ all -> 0x0f41 }
            r0 = 0
        L_0x0e87:
            r6.A9P(r1, r0, r2)     // Catch:{ all -> 0x0f41 }
        L_0x0e8a:
            X.2s2 r1 = r5.A03     // Catch:{ all -> 0x0f41 }
            r0 = 0
            r6.A9P(r1, r0, r0)     // Catch:{ all -> 0x0f41 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0e9e
            r1 = -1235652076(0xffffffffb6597214, float:-3.2401922E-6)
            java.lang.String r0 = "syncUpdateState"
            X.0fS.A01(r0, r1)     // Catch:{ all -> 0x0f41 }
        L_0x0e9e:
            java.lang.String r0 = "This operation must be run on UI thread."
            X.11Z.A06(r0)     // Catch:{ all -> 0x0f2d }
            r8.A05 = r9     // Catch:{ all -> 0x0f2d }
            java.util.Iterator r11 = r30.iterator()     // Catch:{ all -> 0x0f2d }
        L_0x0ea9:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0f2d }
            if (r0 == 0) goto L_0x0f0f
            java.lang.Object r9 = r11.next()     // Catch:{ all -> 0x0f2d }
            X.1Xj r9 = (X.1Xj) r9     // Catch:{ all -> 0x0f2d }
            int r6 = r9.A0w()     // Catch:{ all -> 0x0f2d }
            X.3W1 r5 = r4.BQr(r9)     // Catch:{ all -> 0x0f2d }
            int r0 = r5.A09     // Catch:{ all -> 0x0f2d }
            if (r0 == r6) goto L_0x0ea9
            r5.A09 = r6     // Catch:{ all -> 0x0f2d }
            if (r6 == 0) goto L_0x0ecc
            boolean r0 = r9.CcK()     // Catch:{ all -> 0x0f2d }
            r10 = 1
            if (r0 == 0) goto L_0x0ecd
        L_0x0ecc:
            r10 = 0
        L_0x0ecd:
            r5.A2V = r10     // Catch:{ all -> 0x0f2d }
            r5.A34 = r10     // Catch:{ all -> 0x0f2d }
            r0 = 36322787530385823(0x810b620000299f, double:3.0340153221171693E-306)
            r3 = r26
            r2 = r51
            boolean r0 = X.182.A06(r3, r2, r0)     // Catch:{ all -> 0x0f2d }
            if (r0 == 0) goto L_0x0f05
            int r0 = r5.getPosition()     // Catch:{ all -> 0x0f2d }
            if (r0 != 0) goto L_0x0f05
            if (r10 == 0) goto L_0x0f05
            int r0 = r5.A03     // Catch:{ all -> 0x0f2d }
            int r3 = r6 - r0
            r2 = 0
            if (r7 <= r3) goto L_0x0ef0
            r2 = r3
        L_0x0ef0:
            r1 = 0
            if (r7 >= r3) goto L_0x0ef7
            r1 = r3
        L_0x0ef4:
            r0 = 22
            goto L_0x0eff
        L_0x0ef7:
            if (r2 >= r1) goto L_0x0f05
            if (r3 > 0) goto L_0x0ef4
            if (r3 >= 0) goto L_0x0f02
            r0 = 23
        L_0x0eff:
            X.AnonymousClass3W1.A00(r5, r0)     // Catch:{ all -> 0x0f2d }
        L_0x0f02:
            int r2 = r2 + 1
            goto L_0x0ef7
        L_0x0f05:
            r5.A0B(r6)     // Catch:{ all -> 0x0f2d }
            r5.A0A(r6)     // Catch:{ all -> 0x0f2d }
            r9.A0o()     // Catch:{ all -> 0x0f2d }
            goto L_0x0ea9
        L_0x0f0f:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0f1b
            r0 = 751349938(0x2cc8b0b2, float:5.703959E-12)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0f41 }
        L_0x0f1b:
            r8.notifyDataSetChangedSmart()     // Catch:{ all -> 0x0f41 }
            if (r16 == 0) goto L_0x0f2c
            r0 = 1701817107(0x656fab13, float:7.0737584E22)
            goto L_0x0f29
        L_0x0f24:
            if (r16 == 0) goto L_0x0f2c
            r0 = -1878688917(0xffffffff90057b6b, float:-2.6324703E-29)
        L_0x0f29:
            X.0fS.A00(r0)
        L_0x0f2c:
            return
        L_0x0f2d:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x0f41 }
            if (r0 == 0) goto L_0x0f40
            r0 = 1002818930(0x3bc5cd72, float:0.006036454)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0f41 }
            goto L_0x0f40
        L_0x0f3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0f41 }
            r1.<init>(r14)     // Catch:{ all -> 0x0f41 }
        L_0x0f40:
            throw r1     // Catch:{ all -> 0x0f41 }
        L_0x0f41:
            r1 = move-exception
            if (r16 == 0) goto L_0x0f4a
            r0 = 1747966112(0x682fd8a0, float:3.3216406E24)
            X.0fS.A00(r0)
        L_0x0f4a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2rI.A0A(int):void");
    }

    public final void A0D(C270374gd r2) {
        if (r2 != this.A08) {
            this.A08 = r2;
            A0A(-1);
        }
    }

    public final boolean A0F() {
        C231352rU r3 = (C231352rU) this.A00;
        List list = this.A0e;
        C270374gd r1 = this.A08;
        0qQ.A0B(r3, 0);
        0qQ.A0B(list, 1);
        if (!r3.A02 || r3.A02() != 0 || !list.isEmpty()) {
            return false;
        }
        if (r1 == null || r1.A00 == null) {
            return true;
        }
        return false;
    }

    public final int B5I() {
        return ((AnonymousClass2rW) this.A00).A01.size();
    }

    public final Pair BL8() {
        AnonymousClass1Xn A022;
        AnonymousClass2rW r4 = (AnonymousClass2rW) this.A00;
        0qQ.A0B(r4, 0);
        int size = r4.A01.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return null;
            }
            1Xg r2 = (1Xg) r4.A01.get(size);
            1UQ r1 = r2.A06;
            if (r1 == 1UQ.A0Y || r1 == 1UQ.A04) {
                A022 = 1Xi.A02(r2.A05);
                if (A022 != null && A022.CcK()) {
                    break;
                }
            } else if (r1 == 1UQ.A0C) {
                A022 = r2.A05;
                0qQ.A0C(A022, "null cannot be cast to non-null type com.instagram.feed.feeditem.ClipsNetego");
                break;
            }
        }
        return new Pair(A022, Integer.valueOf(size));
    }

    public final Pair BLD() {
        1Xj A022;
        AnonymousClass2rW r4 = (AnonymousClass2rW) this.A00;
        0qQ.A0B(r4, 0);
        int size = r4.A01.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return null;
            }
            1Xg r2 = (1Xg) r4.A01.get(size);
            if (r2.A06 == 1UQ.A0Y && (A022 = 1Xi.A02(r2.A05)) != null && !A022.CcK()) {
                return new Pair(A022, Integer.valueOf(size));
            }
        }
    }

    public final List BQW() {
        AnonymousClass2rW r1 = (AnonymousClass2rW) this.A00;
        0qQ.A0B(r1, 0);
        ArrayList arrayList = new ArrayList();
        for (Object next : r1.A01) {
            0qQ.A07(next);
            1Xj A022 = 1Xi.A02(((1Xg) next).A05);
            if (A022 != null) {
                arrayList.add(A022);
            }
        }
        return arrayList;
    }

    public final View C02() {
        return this.A02;
    }

    public final List CBH() {
        1UQ r1;
        AnonymousClass2rW r12 = (AnonymousClass2rW) this.A00;
        0qQ.A0B(r12, 0);
        ArrayList arrayList = new ArrayList();
        for (Object next : r12.A01) {
            0qQ.A07(next);
            1Xg r13 = (1Xg) next;
            1Xj A022 = 1Xi.A02(r13.A05);
            if (A022 != null && ((r1 = r13.A06) == 1UQ.A0H || r1 == 1UQ.A0a || r1 == 1UQ.A0M)) {
                arrayList.add(A022);
            }
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ void EU8(AnonymousClass310 r6) {
        C2357130x r62 = (C2357130x) r6;
        0qQ.A0B(r62, 0);
        this.A0E.A08(r62);
        C231752sI r4 = this.A0M;
        C2363233h C87 = r62.C87();
        C2361132m C86 = r62.C86();
        r4.A00 = new C2363633l(C87);
        r4.A01.A00 = C86;
        AnonymousClass2sH r42 = this.A0J;
        C2363233h C872 = r62.C87();
        C2361132m C862 = r62.C86();
        r42.A00 = new C2363633l(C872);
        r42.A02.A00 = C862;
        r42.A01 = r62;
        AnonymousClass2sJ r43 = this.A0D;
        r43.A02 = r62;
        r43.A01 = new C2363633l(r62.C87());
        r43.A00 = new C2363833n(r43.A04, r43.A02);
        C231742sF r2 = this.A0P;
        r2.A01 = r62;
        r2.A00 = new C2363633l(r62.C87(), true);
        C231712s9 r22 = this.A0L;
        C2363233h C873 = r62.C87();
        r22.A02 = r62;
        r22.A01 = new C2363633l(C873, true);
        this.A0G.A02 = r62;
        this.A0V.A00 = r62;
        C231622ry r0 = this.A0F;
        if (r0 != null) {
            r0.A02(r62);
        }
        this.A0U.A01 = r62;
        this.A0Z.A01 = r62;
        ((C232392td) this.A0R.A0A.getValue()).A00 = this.A0W;
        AnonymousClass2sM r23 = this.A0H;
        C2363233h C874 = r62.C87();
        r23.A01 = r62;
        r23.A00 = new C2363633l(C874, true);
        this.A0N.A00(r62, r62.C87());
    }

    public final void EZ4(int i) {
        AnonymousClass2s2 r1 = this.A0o;
        if (r1 != null && i != r1.A03) {
            r1.A03 = i;
            A0A(-1);
        }
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final C232642u8 getLithoPrepareHelperCallback() {
        AnonymousClass2u0 r0 = (AnonymousClass2u0) this.A0l.getValue();
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public final int A01(int i) {
        Object item = getItem(i);
        if (item != null) {
            int i2 = 0;
            for (1Xg r0 : A07()) {
                int i3 = i2 + 1;
                1Xj r1 = r0.A05;
                1Xj A022 = 1Xi.A02(r1);
                if (A022 == null) {
                    A022 = r1;
                }
                if (item.equals(A022)) {
                    return i2;
                }
                i2 = i3;
            }
        }
        return -1;
    }

    public final Object EDl(int i) {
        1Xg A042 = A04(i);
        if (A042 == null) {
            return null;
        }
        ((AnonymousClass2rW) this.A00).A0C(A042);
        A0A(-1);
        return A042;
    }

    public final int getCount() {
        return getViewCount();
    }

    public final long getItemId(int i) {
        int A032 = AnonymousClass0fD.A03(1186329503);
        long itemId = AnonymousClass2rI.super.getItemId(i);
        AnonymousClass0fD.A0A(-490435163, A032);
        return itemId;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0221, code lost:
        if (((java.lang.Boolean) r6.A0z.CDM(r6, X.0tS.A4G[191(0xbf, float:2.68E-43)])).booleanValue() != false) goto L_0x0176;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2rI(android.content.Context r22, androidx.fragment.app.Fragment r23, X.C229382nI r24, com.instagram.common.session.UserSession r25, X.C228162kt r26, X.AnonymousClass4DU r27, X.AnonymousClass2lC r28, X.C229732nw r29, X.AnonymousClass2rB r30, X.C228392lb r31, X.C229782oC r32, X.AnonymousClass4DV r33, X.C229122ms r34, X.C229722nv r35) {
        /*
            r21 = this;
            r5 = 1
            r0 = 7
            r3 = r26
            X.0qQ.A0B(r3, r0)
            X.2rU r4 = new X.2rU
            r10 = r25
            r4.<init>(r10)
            X.2lX r1 = new X.2lX
            r1.<init>()
            X.2lZ r0 = new X.2lZ
            r8 = r22
            r9 = r27
            r0.<init>(r8, r9, r10, r1)
            r2 = 1
            r12 = r21
            r12.<init>(r0, r4, r5, r5)
            r12.A0n = r8
            r0 = r34
            r12.A0a = r0
            r12.A0K = r9
            r12.A0C = r10
            r12.A0q = r3
            r0 = r33
            r12.A0Y = r0
            r0 = r31
            r12.A0S = r0
            r0 = r35
            r12.A0c = r0
            r0 = r28
            r12.A0r = r0
            r4 = r29
            r12.A0s = r4
            r0 = r32
            r12.A0W = r0
            r14 = r30
            r12.A0R = r14
            X.2rm r0 = X.C231492rl.A00(r10)
            r12.A0O = r0
            X.2rw r0 = new X.2rw
            r0.<init>(r10)
            r12.A0I = r0
            X.0eO r5 = X.0eO.A02
            r1 = 19
            X.9L7 r0 = new X.9L7
            r0.<init>(r12, r1)
            X.0eM r0 = X.AnonymousClass0eN.A00(r5, r0)
            r12.A0l = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.A0d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r12.A0g = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r12.A0j = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12.A0f = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r12.A0h = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r12.A0i = r0
            X.0eM r0 = r14.A0D
            java.lang.Object r0 = r0.getValue()
            X.2ry r0 = (X.C231622ry) r0
            r12.A0F = r0
            X.0eM r0 = r14.A0J
            java.lang.Object r0 = r0.getValue()
            X.2s2 r0 = (X.AnonymousClass2s2) r0
            r1 = 2131100175(0x7f06020f, float:1.7812724E38)
            r0.A00 = r1
            r12.A0o = r0
            X.0eM r0 = r14.A0Q
            java.lang.Object r0 = r0.getValue()
            X.2s2 r0 = (X.AnonymousClass2s2) r0
            r0.A00 = r1
            r12.A0B = r0
            X.0eM r0 = r14.A0K
            java.lang.Object r0 = r0.getValue()
            X.2s2 r0 = (X.AnonymousClass2s2) r0
            r0.A00 = r1
            r12.A0A = r0
            X.0eM r0 = r14.A0E
            java.lang.Object r0 = r0.getValue()
            X.2s3 r0 = (X.AnonymousClass2s3) r0
            r12.A0E = r0
            X.0eM r0 = r14.A0B
            java.lang.Object r0 = r0.getValue()
            X.2s6 r0 = (X.C231682s6) r0
            r12.A0V = r0
            X.0eM r0 = r14.A08
            java.lang.Object r0 = r0.getValue()
            X.2s7 r0 = (X.C231692s7) r0
            r12.A0U = r0
            X.0eM r0 = r14.A0d
            java.lang.Object r0 = r0.getValue()
            X.2s9 r0 = (X.C231712s9) r0
            r12.A0L = r0
            X.0eM r0 = r14.A0I
            java.lang.Object r0 = r0.getValue()
            X.2sC r0 = (X.AnonymousClass2sC) r0
            r12.A0G = r0
            X.0eM r0 = r14.A0Z
            java.lang.Object r0 = r0.getValue()
            X.2sD r0 = (X.AnonymousClass2sD) r0
            r12.A0Z = r0
            X.0eM r0 = r14.A0P
            java.lang.Object r0 = r0.getValue()
            X.2sF r0 = (X.C231742sF) r0
            r12.A0P = r0
            X.0eM r0 = r14.A0b
            java.lang.Object r0 = r0.getValue()
            X.2sH r0 = (X.AnonymousClass2sH) r0
            r12.A0J = r0
            X.0eM r0 = r14.A0H
            java.lang.Object r0 = r0.getValue()
            X.2sI r0 = (X.C231752sI) r0
            r12.A0M = r0
            X.0eM r0 = r14.A07
            java.lang.Object r0 = r0.getValue()
            X.2sJ r0 = (X.AnonymousClass2sJ) r0
            r12.A0D = r0
            X.0eM r0 = r14.A0S
            java.lang.Object r0 = r0.getValue()
            X.2sK r0 = (X.C231762sK) r0
            r12.A0b = r0
            X.0eM r0 = r14.A0c
            java.lang.Object r0 = r0.getValue()
            X.2sL r0 = (X.C231772sL) r0
            r12.A0T = r0
            X.0eM r0 = r14.A0U
            java.lang.Object r0 = r0.getValue()
            X.2sM r0 = (X.AnonymousClass2sM) r0
            r12.A0H = r0
            X.0eM r0 = r14.A0e
            java.lang.Object r0 = r0.getValue()
            X.2sN r0 = (X.C231782sN) r0
            r12.A0N = r0
            java.lang.Boolean r0 = X.C231792sO.A00
            if (r0 != 0) goto L_0x017d
            r7 = 0
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = "ENABLE_FEED_POST_ONLY"
            java.lang.String r1 = com.facebook.endtoend.EndToEnd.A00(r0, r7, r7)
            java.lang.String r0 = X.0Ap.A03(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0176
            if (r1 == 0) goto L_0x0209
            java.lang.String r0 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0209
        L_0x0176:
            r7 = 1
        L_0x0177:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            X.C231792sO.A00 = r0
        L_0x017d:
            X.0qQ.A0A(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0203
            X.2sO r0 = new X.2sO
            r0.<init>()
        L_0x018b:
            X.2sP r0 = (X.AnonymousClass2sP) r0
            r12.A0p = r0
            java.lang.Integer r20 = X.AnonymousClass05K.A00
            X.2sS r11 = new X.2sS
            r17 = r23
            r15 = r11
            r16 = r8
            r18 = r10
            r19 = r9
            r15.<init>(r16, r17, r18, r19, r20)
            X.2sU r7 = new X.2sU
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r12.A0Q = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.A0e = r0
            X.0Tu r5 = X.0Tu.A05
            r0 = 36311852544033571(0x81017000060323, double:3.0270999927163494E-306)
            boolean r0 = X.182.A06(r5, r10, r0)
            r12.A0m = r0
            r0 = 36315005049637811(0x81044e00000bb3, double:3.029093649954592E-306)
            boolean r0 = X.182.A06(r5, r10, r0)
            if (r0 != 0) goto L_0x01d2
            r0 = 36315005049834422(0x81044e00030bb6, double:3.0290936500789295E-306)
            boolean r0 = X.182.A06(r5, r10, r0)
            if (r0 != 0) goto L_0x01d2
            r2 = 0
        L_0x01d2:
            r12.A0t = r2
            X.2uD r0 = X.AnonymousClass2uD.IDLE
            r12.A03 = r0
            r1 = 18
            X.9L7 r0 = new X.9L7
            r0.<init>(r12, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r12.A0k = r0
            X.0eM r0 = r12.A0l
            java.lang.Object r0 = r0.getValue()
            X.3je r0 = (X.C249383je) r0
            r12.A0X = r0
            X.2rX r0 = r12.A00
            X.2rW r0 = (X.AnonymousClass2rW) r0
            r0.A00 = r4
            r1 = 2131435801(0x7f0b2119, float:1.8493454E38)
            r0 = r24
            android.util.SparseArray r0 = r0.A01
            r0.put(r1, r3)
            r12.enableItemIdFromBinderGroup()
            return
        L_0x0203:
            X.2sR r0 = new X.2sR
            r0.<init>(r10, r9)
            goto L_0x018b
        L_0x0209:
            X.0xi r0 = X.0tS.A4E
            X.0tS r6 = r0.A00()
            X.0s0 r5 = r6.A0z
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 191(0xbf, float:2.68E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r5.CDM(r6, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0177
            goto L_0x0176
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2rI.<init>(android.content.Context, androidx.fragment.app.Fragment, X.2nI, com.instagram.common.session.UserSession, X.2kt, X.4DU, X.2lC, X.2nw, X.2rB, X.2lb, X.2oC, X.4DV, X.2ms, X.2nv):void");
    }
}
