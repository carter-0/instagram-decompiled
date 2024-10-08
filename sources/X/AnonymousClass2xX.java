package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.ui.listview.StickyHeaderListView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2xX  reason: invalid class name */
public final class AnonymousClass2xX implements AnonymousClass2en {
    public float A00 = -1.0f;
    public int A01 = -1;
    public C52761GcE A02;
    public C2364833x A03;
    public C238133Ar A04;
    public StickyHeaderListView A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final float A0B;
    public final Context A0C;
    public final Handler A0D;
    public final Fragment A0E;
    public final UserSession A0F;
    public final AnonymousClass4DU A0G;
    public final C231332rR A0H;
    public final 0rQ A0I;
    public final C234272xa A0J;
    public final C234282xb A0K;
    public final AnonymousClass2xQ A0L;
    public final C232722uK A0M;
    public final C234262xW A0N;
    public final Map A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final float A0R;
    public final AnonymousClass2xS A0S;
    public final AnonymousClass2xY A0T;
    public final List A0U;
    public final boolean A0V;
    public final boolean A0W;

    public AnonymousClass2xX(Context context, Fragment fragment, UserSession userSession, AnonymousClass4DU r17, C231332rR r18, AnonymousClass2xQ r19, AnonymousClass2xS r20, C232722uK r21, C234262xW r22, boolean z) {
        this.A0C = context;
        UserSession userSession2 = userSession;
        this.A0F = userSession2;
        AnonymousClass4DU r6 = r17;
        this.A0G = r6;
        C232722uK r9 = r21;
        this.A0M = r9;
        C231332rR r7 = r18;
        this.A0H = r7;
        this.A0S = r20;
        this.A0L = r19;
        this.A0N = r22;
        this.A0P = z;
        this.A0E = fragment;
        HashMap hashMap = new HashMap();
        this.A0O = hashMap;
        ArrayList arrayList = new ArrayList();
        this.A0U = arrayList;
        0Tu r2 = 0Tu.A05;
        this.A0V = 182.A06(r2, userSession2, 36315138193820695L);
        this.A0Q = 182.A06(r2, userSession2, 36315138193951768L);
        AnonymousClass2xY r3 = new AnonymousClass2xY(this);
        this.A0T = r3;
        this.A0W = 182.A06(r2, userSession2, 36320141830987836L);
        this.A0D = new AnonymousClass2xZ(Looper.getMainLooper(), this);
        this.A0J = new C234272xa(r3);
        this.A0I = new 0rQ(userSession2);
        this.A0B = ((float) ((int) 182.A01(r2, userSession2, 36598850848296235L))) / 100.0f;
        this.A0R = ((float) ((int) 182.A01(r2, userSession2, 36598850848361772L))) / 100.0f;
        this.A0K = new C234282xb(context, userSession2, r6, r7, this, r9, r6.getModuleName(), arrayList, hashMap);
    }

    private final C263394Lv A01(1Xj r6, AnonymousClass4HX r7, float f, int i, int i2) {
        AnonymousClass3V3 A092;
        int[] modelIndex = this.A0H.getModelIndex(r7.A03);
        if (modelIndex == null || modelIndex.length == 0) {
            return null;
        }
        int i3 = modelIndex[0];
        if (i3 < i) {
            i3 = i;
        }
        int i4 = modelIndex[1] + i3;
        int i5 = i2 + 1;
        if (i4 > i5) {
            i4 = i5;
        }
        while (i3 < i4) {
            C238133Ar r0 = this.A04;
            if (r0 != null && (A092 = C253923rd.A09(r6, r0, i3)) != null) {
                return new C263394Lv(r6, A092, f, i3);
            }
            i3++;
        }
        return null;
    }

    public static final C263394Lv A03(AnonymousClass2xX r7, Comparator comparator, int i, int i2) {
        float f;
        AnonymousClass3V3 A002;
        1Xj A1c;
        AnonymousClass2xX r5 = r7;
        List<Map.Entry> list = r7.A0U;
        list.clear();
        list.addAll(r7.A0O.entrySet());
        01V.A1D(list, comparator);
        for (Map.Entry entry : list) {
            1Xj r6 = (1Xj) entry.getKey();
            C231332rR r1 = r5.A0H;
            AnonymousClass3W1 BQr = r1.BQr(r6);
            float f2 = ((AnonymousClass4HX) entry.getValue()).A00;
            0qQ.A0B(BQr, 0);
            0qQ.A0B(r6, 1);
            if (r5.A06(r6)) {
                f = 0.65f;
            } else if (BQr.A2p) {
                f = 0.666f;
            } else {
                f = r5.A0L.A00;
            }
            if (f2 >= f && (!r6.A5D() || ((A1c = r6.A1c(r1.BQr(r6).A03)) != null && (A1c.CeS() || A1c.A4r())))) {
                C263394Lv A012 = r5.A01(r6, (AnonymousClass4HX) entry.getValue(), f2, i, i2);
                if (A012 != null) {
                    return A012;
                }
                C234282xb r2 = r5.A0K;
                boolean A032 = r2.A03(r6);
                C238133Ar r12 = r5.A04;
                if ((!A032 || r2.A03(r6)) && (A002 = r2.A00(r6, r12)) != null) {
                    return new C263394Lv(r6, A002, f2, BQr.getPosition());
                }
            }
        }
        return null;
    }

    public final C263394Lv A08(1Xj r9, AnonymousClass4HX r10) {
        int i;
        1Xj r3 = r9;
        0qQ.A0B(r9, 0);
        AnonymousClass4HX r4 = r10;
        0qQ.A0B(r10, 1);
        C238133Ar r0 = this.A04;
        int i2 = -1;
        if (r0 != null) {
            i2 = r0.B6L();
            i = r0.BLQ();
        } else {
            i = -1;
        }
        C52761GcE gcE = this.A02;
        if (gcE != null) {
            int A042 = gcE.A04();
            if (i2 < A042) {
                i2 = A042;
            }
            int A032 = gcE.A03();
            if (i > A032) {
                i = A032;
            }
        }
        return A01(r3, r4, 0.0f, i2, i);
    }

    public final void A0A(1Xj r14, AnonymousClass3V3 r15, AnonymousClass3W1 r16, C263414Lx r17) {
        int ordinal;
        1Xj r8 = r14;
        0qQ.A0B(r14, 0);
        AnonymousClass3W1 r10 = r16;
        0qQ.A0B(r10, 1);
        AnonymousClass3V3 r9 = r15;
        0qQ.A0B(r15, 2);
        if (!r10.CdP()) {
            C2364833x r1 = this.A03;
            if (r1 == null || !r1.A02 || r14.equals(r1.A00)) {
                View BQB = r15.BQB();
                if (BQB == null || BQB.getVisibility() == 0) {
                    C243183Xs r2 = C243173Xr.A04;
                    UserSession userSession = this.A0F;
                    AnonymousClass4DU r5 = this.A0G;
                    if (r2.A01(userSession, r14, r10, r5.getModuleName()) && !r10.A2p && (ordinal = r10.A0l.ordinal()) != 0 && ordinal != 4) {
                        if (ordinal == 3) {
                            r10.A0K(AnonymousClass3WB.HIDDEN);
                            r10.A0Q = 0;
                            if (r14.A1v() == ProductType.IGTV || r14.CcK()) {
                                r10.A0E(0, r10.A03);
                                r10.A0Y = (int) r14.A1B();
                                AnonymousClass4M3 r0 = this.A0M.A05;
                                if (r0 != null) {
                                    r0.EKy(0, true);
                                }
                                r10.A0C(0);
                            }
                            this.A0H.Cs9(r14);
                        } else if ((ordinal == 2 && C231122qu.A0T(userSession, r14) && this.A0M.A0J() == AnonymousClass3OB.IDLE) || r2.A02(userSession, r14, r5.getModuleName())) {
                            return;
                        }
                    }
                    C232722uK r3 = this.A0M;
                    if (r3.A0J() != AnonymousClass3OB.PAUSED || !r14.equals(r3.A0G()) || (182.A06(0Tu.A05, userSession, 36323345876200548L) && r10.A0l != AnonymousClass3WB.OFFSCREEN)) {
                        this.A0S.A09(r8, r9, r10, r17, false);
                    } else {
                        r3.A0M();
                    }
                    this.A07 = false;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f1, code lost:
        if (r4 < r3) goto L_0x00f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0B(android.view.View r11, X.1Xj r12, int r13, boolean r14) {
        /*
            r10 = this;
            r2 = 1
            X.0qQ.A0B(r12, r2)
            X.3Ar r8 = r10.A04
            r4 = 0
            if (r8 != 0) goto L_0x000a
            return r4
        L_0x000a:
            X.GcE r0 = r10.A02
            if (r0 == 0) goto L_0x001b
            r9 = 0
            X.4Lv r0 = A02(r10)
            if (r0 == 0) goto L_0x0019
            int r0 = r0.A03
            if (r0 == r13) goto L_0x001a
        L_0x0019:
            r9 = 1
        L_0x001a:
            return r9
        L_0x001b:
            X.2xQ r3 = r10.A0L
            boolean r0 = r3.A06
            r9 = 1
            if (r0 == 0) goto L_0x00d2
            com.instagram.common.session.UserSession r6 = r10.A0F
            X.0Tu r5 = X.0Tu.A05
            r0 = 36325330151158649(0x810db200023379, double:3.0356232857322166E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x006f
            java.util.Comparator r7 = X.C241423Pd.A02
        L_0x0033:
            int r1 = r8.B6L()
            int r0 = r8.BLQ()
            X.4Lv r8 = A03(r10, r7, r1, r0)
            java.util.Map r1 = r10.A0O
            X.1Xj r0 = r12.A1e(r6)
            java.lang.Object r7 = r1.get(r0)
            X.4HX r7 = (X.AnonymousClass4HX) r7
            if (r8 == 0) goto L_0x006d
            X.1Xj r0 = r8.A00
        L_0x004f:
            java.lang.Object r1 = r1.get(r0)
            X.4HX r1 = (X.AnonymousClass4HX) r1
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0072
            if (r1 == 0) goto L_0x0072
            boolean r0 = r1.A07
            if (r0 != r2) goto L_0x0072
            r0 = 36325330151748481(0x810db2000b3381, double:3.035623286105229E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0072
            return r9
        L_0x006d:
            r0 = 0
            goto L_0x004f
        L_0x006f:
            java.util.Comparator r7 = X.C241423Pd.A00
            goto L_0x0033
        L_0x0072:
            if (r7 == 0) goto L_0x001a
            float r2 = r7.A00
            X.2rR r0 = r10.A0H
            X.3W1 r7 = r0.BQr(r12)
            if (r14 == 0) goto L_0x00a2
            X.2rm r0 = X.C231492rl.A00(r6)
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x00a2
        L_0x0086:
            X.0qQ.A0B(r7, r4)
            boolean r0 = r10.A06(r12)
            if (r0 == 0) goto L_0x0097
            r0 = 1058642330(0x3f19999a, float:0.6)
        L_0x0092:
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d0
            return r9
        L_0x0097:
            boolean r0 = r7.A2p
            if (r0 == 0) goto L_0x009f
            r0 = 1059749626(0x3f2a7efa, float:0.666)
            goto L_0x0092
        L_0x009f:
            float r0 = r3.A01
            goto L_0x0092
        L_0x00a2:
            r0 = 36323345876266085(0x810be400022c65, double:3.0343684223001254E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 != 0) goto L_0x0086
            X.0qQ.A0B(r7, r4)
            boolean r0 = r10.A06(r12)
            if (r0 == 0) goto L_0x00c5
            r0 = 1058642330(0x3f19999a, float:0.6)
        L_0x00b9:
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d0
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x001a
            float r0 = r10.A00
            goto L_0x0092
        L_0x00c5:
            boolean r0 = r7.A2p
            if (r0 == 0) goto L_0x00cd
            r0 = 1059749626(0x3f2a7efa, float:0.666)
            goto L_0x00b9
        L_0x00cd:
            float r0 = r3.A01
            goto L_0x00b9
        L_0x00d0:
            r9 = 0
            return r9
        L_0x00d2:
            if (r11 != 0) goto L_0x00d5
            return r2
        L_0x00d5:
            com.instagram.ui.listview.StickyHeaderListView r1 = r10.A05
            android.view.ViewGroup r0 = r8.CEd()
            X.0qQ.A07(r0)
            int r4 = X.C253923rd.A01(r0, r11, r1)
            int r3 = r10.A01
            float r1 = r10.A0R
            int r0 = r11.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r2 = (int) r0
            r1 = 1
            if (r4 == 0) goto L_0x00f3
            r0 = 1
            if (r4 >= r3) goto L_0x00f4
        L_0x00f3:
            r0 = 0
        L_0x00f4:
            if (r4 >= r2) goto L_0x00f9
            if (r0 != 0) goto L_0x00f9
            r1 = 0
        L_0x00f9:
            r9 = r1 ^ 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xX.A0B(android.view.View, X.1Xj, int, boolean):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.5GH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: X.3Y7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: X.1Xl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: X.1Xj} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r0 == null) goto L_0x003c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.AnonymousClass2xX r18, X.C238133Ar r19) {
        /*
            r7 = r18
            X.2uK r0 = r7.A0M
            X.1Xj r5 = r0.A0G()
            r6 = r19
            int r12 = r6.BCl()
            int r4 = r6.B6L()
            int r3 = r6.BLQ()
            if (r5 == 0) goto L_0x001b
            r2 = r4
            if (r4 <= r3) goto L_0x001d
        L_0x001b:
            r2 = -1
            return r2
        L_0x001d:
            int r9 = r2 - r12
            android.view.View r0 = X.C253923rd.A04(r5, r6, r2)
            if (r0 == 0) goto L_0x006f
            X.2rR r10 = r7.A0H
            int r0 = r10.getCount()
            if (r9 >= r0) goto L_0x006f
            java.lang.Object r1 = r10.getItem(r9)
            boolean r0 = r1 instanceof X.1Xj
            r19 = 0
            if (r0 == 0) goto L_0x0075
            r0 = r1
            X.1Xj r0 = (X.1Xj) r0
        L_0x003a:
            if (r0 != 0) goto L_0x008f
        L_0x003c:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            int r0 = r3 - r4
            int r0 = r0 + 1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r12)
            X.3s4 r18 = X.C253923rd.A0B(r6, r2)
            if (r1 == 0) goto L_0x0064
            java.lang.Class r0 = r1.getClass()
            if (r0 == 0) goto L_0x0064
            java.lang.String r19 = r0.getName()
        L_0x0064:
            java.lang.Object[] r8 = new java.lang.Object[]{r13, r14, r15, r16, r17, r18, r19}
            java.lang.String r1 = "FeedVideoModule"
            java.lang.String r0 = "unexpected view type, index:%d, firstVisibleItem:%d, visibleItemCount:%d, mediaIndex:%d, headerCount:%d, mediaType:%s, class:%s"
            X.0KC.A0Q(r1, r0, r8)
        L_0x006f:
            r0 = r2
            int r2 = r2 + 1
            if (r0 != r3) goto L_0x001d
            goto L_0x001b
        L_0x0075:
            boolean r0 = r1 instanceof X.1Xl
            if (r0 == 0) goto L_0x0081
            r0 = r1
            X.1Xl r0 = (X.1Xl) r0
            X.1Xj r0 = r0.BPf()
            goto L_0x003a
        L_0x0081:
            boolean r0 = r1 instanceof X.AnonymousClass3Y7
            if (r0 == 0) goto L_0x00c6
            r0 = r1
            X.3Y7 r0 = (X.AnonymousClass3Y7) r0
            boolean r0 = r0.AJb(r5)
            if (r0 == 0) goto L_0x00c6
            r0 = r5
        L_0x008f:
            boolean r1 = r0.A5D()
            if (r1 == 0) goto L_0x00b7
            X.3W1 r8 = r10.BQr(r0)
            boolean r1 = r0.A5h()
            if (r1 == 0) goto L_0x00b0
            com.instagram.common.session.UserSession r8 = r7.A0F
            X.1Xj r1 = r5.A1e(r8)
            X.1Xj r0 = r0.A1e(r8)
            boolean r0 = X.0qQ.A0K(r1, r0)
        L_0x00ad:
            if (r0 == 0) goto L_0x006f
            return r2
        L_0x00b0:
            int r1 = r8.A03
            X.1Xj r0 = r0.A1c(r1)
            goto L_0x00c1
        L_0x00b7:
            boolean r1 = r0.A5H()
            if (r1 == 0) goto L_0x00c1
            X.1Xj r0 = r0.A1b()
        L_0x00c1:
            boolean r0 = r5.equals(r0)
            goto L_0x00ad
        L_0x00c6:
            boolean r0 = r1 instanceof X.AnonymousClass5GH
            if (r0 == 0) goto L_0x003c
            boolean r0 = r10 instanceof X.AnonymousClass2rI
            if (r0 == 0) goto L_0x003c
            r8 = r1
            X.5GH r8 = (X.AnonymousClass5GH) r8
            r11 = r10
            X.2rI r11 = (X.AnonymousClass2rI) r11
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            X.4qK r8 = r8.A00
            X.2lb r0 = r11.A0S
            X.5GJ r0 = r0.A02(r8)
            X.1Xj r0 = r0.A06
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xX.A00(X.2xX, X.3Ar):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r10.BQr(r11).A35 == false) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0110 A[LOOP:0: B:19:0x0045->B:62:0x0110, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x002d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0089 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C263394Lv A02(X.AnonymousClass2xX r17) {
        /*
            r9 = r17
            X.GcE r2 = r9.A02
            r0 = 0
            if (r2 == 0) goto L_0x016b
            X.3Ar r1 = r9.A04
            if (r1 == 0) goto L_0x016b
            int r8 = r1.B6L()
            int r0 = r2.A04()
            if (r8 >= r0) goto L_0x0016
            r8 = r0
        L_0x0016:
            int r7 = r1.BLQ()
            int r0 = r2.A03()
            if (r7 <= r0) goto L_0x0021
            r7 = r0
        L_0x0021:
            X.2xQ r0 = r9.A0L
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x002e
            java.util.Comparator r0 = X.C241423Pd.A01
            X.4Lv r5 = A03(r9, r0, r8, r7)
        L_0x002d:
            return r5
        L_0x002e:
            X.3Ar r6 = r9.A04
            r5 = 0
            if (r6 == 0) goto L_0x002d
            android.content.Context r0 = r9.A0C
            boolean r17 = X.0mk.A02(r0)
            r4 = 2
            int[] r3 = new int[r4]
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r17 == 0) goto L_0x0043
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0043:
            if (r8 > r7) goto L_0x002d
        L_0x0045:
            X.2rR r10 = r9.A0H
            com.instagram.common.session.UserSession r12 = r9.A0F
            X.1Xj r11 = X.AnonymousClass3OG.A00(r10, r6, r8)
            if (r11 == 0) goto L_0x0114
            boolean r0 = r11.A5p()
            if (r0 == 0) goto L_0x0064
            boolean r0 = r11.CcK()
            if (r0 == 0) goto L_0x0064
            X.3W1 r0 = r10.BQr(r11)
            boolean r0 = r0.A35
            r1 = 1
            if (r0 != 0) goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            boolean r0 = X.AnonymousClass3OG.A04(r12, r10, r11)
            if (r0 != 0) goto L_0x006d
            if (r1 == 0) goto L_0x0114
        L_0x006d:
            X.3V3 r1 = X.C253923rd.A09(r11, r6, r8)
            if (r1 == 0) goto L_0x0114
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            X.1Xj r0 = X.AnonymousClass3OG.A00(r10, r6, r8)
            if (r0 == 0) goto L_0x0081
            r11.put(r0, r1)
        L_0x0081:
            java.util.Set r0 = r11.entrySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x0089:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x010e
            java.lang.Object r0 = r16.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r13 = r0.getKey()
            X.1Xj r13 = (X.1Xj) r13
            java.lang.Object r12 = r0.getValue()
            X.3V3 r12 = (X.AnonymousClass3V3) r12
            android.view.View r10 = r12.BQB()
            if (r10 == 0) goto L_0x0089
            int r0 = r10.getHeight()
            float r1 = (float) r0
            float r0 = r9.A0B
            float r1 = r1 * r0
            int r11 = (int) r1
            r15 = 1
            int[] r1 = new int[r4]
            r10.getLocationInWindow(r1)
            r14 = r1[r15]
            if (r14 >= 0) goto L_0x00ef
            int r14 = r10.getBottom()
            r0 = r1[r15]
            int r0 = java.lang.Math.abs(r0)
        L_0x00c4:
            int r14 = r14 - r0
        L_0x00c5:
            if (r14 < r11) goto L_0x0089
            r10.getLocationInWindow(r3)
            float r11 = (float) r14
            int r0 = r10.getHeight()
            float r0 = (float) r0
            float r11 = r11 / r0
            r10 = 0
            if (r5 == 0) goto L_0x00e4
            float r1 = r5.A02
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00e4
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0089
            r0 = r3[r10]
            if (r17 == 0) goto L_0x00ec
            if (r0 <= r2) goto L_0x0089
        L_0x00e4:
            X.4Lv r5 = new X.4Lv
            r5.<init>(r13, r12, r11, r8)
            r2 = r3[r10]
            goto L_0x0089
        L_0x00ec:
            if (r0 >= r2) goto L_0x0089
            goto L_0x00e4
        L_0x00ef:
            int r0 = r10.getBottom()
            int r14 = r14 + r0
            android.view.ViewGroup r0 = r6.CEd()
            int r0 = r0.getBottom()
            if (r14 <= r0) goto L_0x0109
            android.view.ViewGroup r0 = r6.CEd()
            int r14 = r0.getHeight()
            r0 = r1[r15]
            goto L_0x00c4
        L_0x0109:
            int r14 = r10.getBottom()
            goto L_0x00c5
        L_0x010e:
            if (r8 == r7) goto L_0x002d
            int r8 = r8 + 1
            goto L_0x0045
        L_0x0114:
            X.3s4 r1 = X.C253923rd.A0B(r6, r8)
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            X.3s4 r0 = X.C254183s4.MULTI_VIDEO_HSCROLL
            if (r1 != r0) goto L_0x0081
            android.view.View r1 = r6.AnE(r8)
            if (r1 == 0) goto L_0x0081
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r0 instanceof X.C254143s0
            if (r0 == 0) goto L_0x0081
            java.lang.Object r1 = r1.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.ui.adapter.intf.HolderWithManyMedia"
            X.0qQ.A0C(r1, r0)
            X.3s0 r1 = (X.C254143s0) r1
            java.util.Map r0 = r1.BR4()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r12 = r0.iterator()
        L_0x0146:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r1 = r12.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r0 instanceof X.AnonymousClass3V3
            if (r0 == 0) goto L_0x0146
            java.lang.Object r10 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.ui.rows.video.holder.FeedVideoViewHolder"
            X.0qQ.A0C(r1, r0)
            r11.put(r10, r1)
            goto L_0x0146
        L_0x016b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xX.A02(X.2xX):X.4Lv");
    }

    public static final void A05(1Xj r4, AnonymousClass3W1 r5, AnonymousClass2xX r6) {
        UserSession userSession = r6.A0F;
        AnonymousClass4DU r3 = r6.A0G;
        0wc A012 = AnonymousClass0kN.A01(r3, userSession);
        0Aj A002 = A012.A00(A012.A00, "instagram_clips_end_of_preview");
        A002.A8M(C52236GKd.A0z, "action");
        A002.A8M(AnonymousClass5OC.FEED_PREVIEW, "action_source");
        A002.AAJ("containermodule", r3.getModuleName());
        String id = r4.getId();
        if (id != null) {
            A002.AAJ(AnonymousClass000.A00(3560), id);
            A002.A9F("media_index", Long.valueOf((long) r5.getPosition()));
            A002.AAJ("viewer_session_id", r6.A0M.A0N);
            A002.AAJ("nav_chain", String.valueOf(AnonymousClass1QI.A00.A02.A00));
            A002.AAJ(AnonymousClass000.A00(392), r4.getId());
            A002.AAJ("mezql_token", r4.A0C.getMezqlToken());
            A002.AAJ("ranking_info_token", r4.A0C.getLoggingInfoToken());
            A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A002.Cgf();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r9.A0V != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A07(X.AnonymousClass2xX r9) {
        /*
            boolean r0 = r9.A07
            r2 = 0
            if (r0 != 0) goto L_0x000a
            boolean r0 = r9.A0V
            r1 = 0
            if (r0 == 0) goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            X.2xQ r0 = r9.A0L
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x0013
            if (r1 == 0) goto L_0x0031
        L_0x0013:
            X.2uK r0 = r9.A0M
            X.3OB r4 = r0.A0J()
            X.GcE r3 = r9.A02
            X.2xW r0 = r9.A0N
            long r5 = r0.A04
            boolean r7 = r9.A09
            boolean r8 = r9.A0P
            boolean r0 = X.AnonymousClass3OG.A05(r3, r4, r5, r7, r8)
            if (r0 == 0) goto L_0x0031
            java.util.Map r0 = r9.A0O
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0032
        L_0x0031:
            r2 = 1
        L_0x0032:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xX.A07(X.2xX):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r13.A0M;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r13 = this;
            X.3Ar r5 = r13.A04
            if (r5 == 0) goto L_0x0047
            X.2uK r2 = r13.A0M
            X.1Xj r3 = r2.A0G()
            if (r3 == 0) goto L_0x0047
            r2.A0K()
            int r10 = A00(r13, r5)
            r0 = -1
            if (r10 == r0) goto L_0x0020
            X.3Ar r0 = r13.A04
            if (r0 == 0) goto L_0x0020
            X.3V3 r1 = X.C253923rd.A09(r3, r0, r10)
            if (r1 != 0) goto L_0x0048
        L_0x0020:
            X.2xb r1 = r13.A0K
            boolean r0 = r1.A03(r3)
            if (r0 == 0) goto L_0x002e
            boolean r0 = r1.A03(r3)
            if (r0 == 0) goto L_0x0034
        L_0x002e:
            X.3V3 r1 = r1.A00(r3, r5)
            if (r1 != 0) goto L_0x0048
        L_0x0034:
            boolean r0 = r13.A0W
            if (r0 == 0) goto L_0x0040
            X.3OB r1 = r2.A0J()
            X.3OB r0 = X.AnonymousClass3OB.PLAYING
            if (r1 != r0) goto L_0x0047
        L_0x0040:
            java.lang.String r3 = "context_switch"
            r1 = 1
            r0 = 0
            r2.A0U(r3, r1, r0)
        L_0x0047:
            return
        L_0x0048:
            X.3W1 r0 = r1.BQq()
            r6 = 0
            if (r0 == 0) goto L_0x0051
            r0.A30 = r6
        L_0x0051:
            android.view.View r4 = r1.BQB()
            X.2xb r7 = r13.A0K
            java.util.Map r8 = r7.A07
            java.lang.Object r0 = r8.get(r3)
            X.4HX r0 = (X.AnonymousClass4HX) r0
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r1 = r0.A03
            boolean r0 = r1 instanceof X.AnonymousClass3Y6
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.ClipsNetego"
            X.0qQ.A0C(r1, r0)
            X.3Y6 r1 = (X.AnonymousClass3Y6) r1
            boolean r0 = r1.A0O
            if (r0 != 0) goto L_0x00c1
            com.instagram.common.session.UserSession r12 = r13.A0F
            r11 = 0
            X.0Tu r9 = X.0Tu.A05
            r0 = 36318196210931695(0x810735000917ef, double:3.031111753206619E-306)
            boolean r0 = X.182.A06(r9, r12, r0)
            if (r0 == 0) goto L_0x00c1
            X.2xc r0 = r7.A02
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00c1
            monitor-enter(r7)
            java.util.List r0 = r7.A06     // Catch:{ all -> 0x0111 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x0111 }
        L_0x0091:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0111 }
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x0111 }
            X.2uK r9 = (X.C232722uK) r9     // Catch:{ all -> 0x0111 }
            X.1Xj r0 = r9.A0G()     // Catch:{ all -> 0x0111 }
            java.lang.Object r0 = r8.get(r0)     // Catch:{ all -> 0x0111 }
            X.4HX r0 = (X.AnonymousClass4HX) r0     // Catch:{ all -> 0x0111 }
            if (r0 == 0) goto L_0x00b2
            float r1 = r0.A00     // Catch:{ all -> 0x0111 }
            r0 = 1059749626(0x3f2a7efa, float:0.666)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0091
        L_0x00b2:
            java.lang.String r1 = "scroll"
            r0 = 1
            r9.A0U(r1, r0, r6)     // Catch:{ all -> 0x0111 }
            r11 = 1
            goto L_0x0091
        L_0x00ba:
            if (r11 == 0) goto L_0x00bf
            r7.A01()     // Catch:{ all -> 0x0111 }
        L_0x00bf:
            monitor-exit(r7)
            goto L_0x00cd
        L_0x00c1:
            boolean r0 = r13.A0B(r4, r3, r10, r6)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r1 = "scroll"
            r0 = 1
            r2.A0U(r1, r0, r6)
        L_0x00cd:
            X.2xQ r0 = r13.A0L
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x00ff
            java.util.Map r1 = r13.A0O
            com.instagram.common.session.UserSession r0 = r13.A0F
            X.1Xj r0 = r3.A1e(r0)
            java.lang.Object r0 = r1.get(r0)
            X.4HX r0 = (X.AnonymousClass4HX) r0
            if (r0 == 0) goto L_0x00fd
            float r0 = r0.A00
        L_0x00e5:
            r13.A00 = r0
        L_0x00e7:
            boolean r0 = r3.A4Y()
            if (r0 != 0) goto L_0x0047
            com.instagram.common.session.UserSession r0 = r13.A0F
            X.3OF r0 = X.AnonymousClass3OE.A00(r0)
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0047
            r2.A0K()
            return
        L_0x00fd:
            r0 = 0
            goto L_0x00e5
        L_0x00ff:
            if (r4 == 0) goto L_0x00e7
            com.instagram.ui.listview.StickyHeaderListView r1 = r13.A05
            android.view.ViewGroup r0 = r5.CEd()
            X.0qQ.A07(r0)
            int r0 = X.C253923rd.A01(r0, r4, r1)
            r13.A01 = r0
            goto L_0x00e7
        L_0x0111:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xX.A09():void");
    }

    public final void Dgu() {
        C263394Lv A082;
        C263394Lv A083;
        1Xj A1c;
        if (this.A08) {
            AnonymousClass2xQ r4 = this.A0L;
            if (r4.A06) {
                C232722uK r2 = this.A0M;
                AnonymousClass3OB A0J2 = r2.A0J();
                0qQ.A0B(A0J2, 0);
                if ((A0J2 == AnonymousClass3OB.PLAYING || A0J2 == AnonymousClass3OB.PREPARING) && r2.A0G() != null) {
                    A09();
                }
            }
            if (this.A0A && (!this.A09 || !this.A06)) {
                if (r4.A07 && this.A04 != null) {
                    C232722uK r3 = this.A0M;
                    AnonymousClass3OB A0J3 = r3.A0J();
                    0qQ.A0B(A0J3, 0);
                    if ((A0J3 == AnonymousClass3OB.IDLE || A0J3 == AnonymousClass3OB.PAUSED) && r3.A0Y()) {
                        for (Map.Entry entry : this.A0O.entrySet()) {
                            1Xj r1 = (1Xj) entry.getKey();
                            if ((!r1.A5D() || ((A1c = r1.A1c(this.A0H.BQr(r1).A03)) != null && A1c.CeS())) && (A083 = A08(r1, (AnonymousClass4HX) entry.getValue())) != null) {
                                AnonymousClass3V3 r12 = A083.A01;
                                AnonymousClass3OG.A02(this.A0F, r12, r3);
                                AnonymousClass3OG.A03(r12, C245853da.SHOW);
                            }
                        }
                    }
                }
                if (r4.A05 && this.A04 != null) {
                    for (Map.Entry entry2 : this.A0O.entrySet()) {
                        1Xj r42 = (1Xj) entry2.getKey();
                        C231332rR r0 = this.A0H;
                        AnonymousClass3W1 BQr = r0.BQr(r42);
                        UserSession userSession = this.A0F;
                        if (AnonymousClass3OG.A04(userSession, r0, r42) && C243173Xr.A04.A01(userSession, r42, BQr, this.A0G.getModuleName()) && !BQr.A2p) {
                            AnonymousClass3WB r13 = BQr.A0l;
                            if ((r13 == AnonymousClass3WB.ONSCREEN || r13 == AnonymousClass3WB.DISMISSED) && (A082 = A08(r42, (AnonymousClass4HX) entry2.getValue())) != null && A0B(A082.A01.BQB(), r42, A082.A03, true)) {
                                BQr.A0K(AnonymousClass3WB.OFFSCREEN);
                            }
                        }
                    }
                }
                if (!A07(this)) {
                    this.A0D.sendEmptyMessage(0);
                }
            }
            this.A08 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A0F, 36327984440818520L) == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C263414Lx A04(X.AnonymousClass2xX r4, boolean r5, boolean r6) {
        /*
            X.1Jf r0 = X.AnonymousClass1K7.A00()
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x0014
            X.1Jf r0 = X.AnonymousClass1K7.A00()
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0024
        L_0x0014:
            com.instagram.common.session.UserSession r3 = r4.A0F
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327984440818520(0x81101c00003b58, double:3.0373018692010856E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r2 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            com.instagram.common.session.UserSession r0 = r4.A0F
            boolean r1 = X.C263404Lw.A00(r0)
            X.4Lx r0 = new X.4Lx
            r0.<init>(r2, r5, r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xX.A04(X.2xX, boolean, boolean):X.4Lx");
    }

    private final boolean A06(1Xj r9) {
        if (r9.A6A()) {
            Map map = this.A0O;
            AnonymousClass4HX r0 = (AnonymousClass4HX) map.get(r9);
            if (r0 != null) {
                int i = r0.A02;
                int i2 = Integer.MAX_VALUE;
                Object obj = null;
                AnonymousClass4HX r4 = null;
                boolean z = false;
                for (Map.Entry value : map.entrySet()) {
                    AnonymousClass4HX r2 = (AnonymousClass4HX) value.getValue();
                    int i3 = r2.A02 - i;
                    if (i3 > 0 && i3 < i2) {
                        r4 = r2;
                        i2 = i3;
                    }
                    if ((r2.A03 instanceof AnonymousClass3Y6) && r2.A00 >= 0.95f) {
                        z = true;
                    }
                }
                if (r4 != null) {
                    obj = r4.A03;
                }
                if (!(obj instanceof AnonymousClass3Y6) || !z) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
