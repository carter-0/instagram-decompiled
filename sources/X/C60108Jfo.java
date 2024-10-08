package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jfo  reason: case insensitive filesystem */
public final class C60108Jfo extends C361478gI {
    public int A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A01;
    public int A02 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A03;
    public int A04 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final AnonymousClass2Fj A0B = new 2Fk(C361268fw.A00);
    public final UserSession A0C;
    public final C3501583m A0D;
    public final ClipsCreationViewModel A0E;
    public final AnonymousClass8RF A0F;
    public final AnonymousClass8M1 A0G;
    public final C61805KMt A0H;
    public final C61805KMt A0I;
    public final C61806KMu A0J;
    public final AnonymousClass861 A0K;
    public final C3516889w A0L;
    public final List A0M;
    public final AnonymousClass0r6 A0N;
    public final AnonymousClass0r6 A0O;
    public final AnonymousClass0r6 A0P;
    public final AnonymousClass0r6 A0Q;
    public final AnonymousClass0r6 A0R;
    public final AnonymousClass0r6 A0S;
    public final 0V2 A0T;
    public final 0V2 A0U;
    public final 0V2 A0V;
    public final 0V2 A0W;
    public final 0V2 A0X;
    public final 05G A0Y;
    public final 05G A0Z;
    public final 05G A0a;
    public final 05G A0b;
    public final 05G A0c;
    public final 05G A0d;
    public final 05G A0e;
    public final C61770pa A0f;
    public final C61770pa A0g;
    public final C61770pa A0h;
    public final AnonymousClass0Ud A0i;
    public final AnonymousClass0Ud A0j;
    public final AnonymousClass0Ud A0k;
    public final boolean A0l;
    public final TargetViewSizeProvider A0m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60108Jfo(Application application, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RF r22, AnonymousClass8M1 r23, C61805KMt kMt, C61805KMt kMt2, C61806KMu kMu, AnonymousClass861 r27, C3516889w r28, boolean z) {
        super(application);
        UserSession userSession2 = userSession;
        ClipsCreationViewModel clipsCreationViewModel2 = clipsCreationViewModel;
        AnonymousClass8RF r9 = r22;
        AnonymousClass861 r3 = r27;
        C3516889w r1 = r28;
        C51974G9v.A1S(userSession2, r9, clipsCreationViewModel2, r3, r1);
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        C61805KMt kMt3 = kMt;
        C61805KMt kMt4 = kMt2;
        C61806KMu kMu2 = kMu;
        C51974G9v.A1Q(kMt3, kMt4, kMu2, targetViewSizeProvider2);
        AnonymousClass8M1 r8 = r23;
        0qQ.A0B(r8, 11);
        this.A0C = userSession2;
        this.A0F = r9;
        this.A0E = clipsCreationViewModel2;
        this.A0K = r3;
        this.A0L = r1;
        this.A0H = kMt3;
        this.A0I = kMt4;
        this.A0J = kMu2;
        this.A0m = targetViewSizeProvider2;
        this.A0G = r8;
        this.A0l = z;
        02z A012 = 106.A01((Object) null);
        this.A0c = A012;
        02z A013 = 106.A01((Object) null);
        this.A0Z = A013;
        02z A014 = 106.A01((Object) null);
        this.A0e = A014;
        Integer num = AnonymousClass05K.A00;
        05D A015 = 10D.A01(num, 0, 0);
        this.A0T = A015;
        05D A016 = 10D.A01(num, 0, 0);
        this.A0V = A016;
        05D A017 = 10D.A01(num, 0, 0);
        this.A0U = A017;
        02z A0r = JTQ.A0r(0);
        this.A0Y = A0r;
        02z A10 = C51970G9q.A10(false);
        this.A0b = A10;
        05D A018 = 10D.A01(num, 0, 0);
        this.A0X = A018;
        02z A1J = JTO.A1J();
        this.A0d = A1J;
        this.A0P = new AnonymousClass0qC(A012);
        this.A0O = new AnonymousClass0qC(A013);
        this.A0Q = new AnonymousClass0qC(A014);
        this.A0f = A015;
        this.A0h = A016;
        this.A0g = A017;
        this.A0S = MC9.A00(A018, 33);
        this.A0N = A0r;
        this.A0j = A10;
        02z A102 = DbS.A10(new C61060Jvy(AnonymousClass05K.A0N, true, true, false));
        this.A0a = A102;
        this.A0i = 10b.A03(A102);
        05D A019 = 10D.A01(num, 0, 0);
        this.A0W = A019;
        this.A0M = AnonymousClass7TE.A1C();
        this.A0R = A019;
        this.A0k = A1J;
        this.A0D = clipsCreationViewModel2.A0Q;
        A0K();
    }

    public static final boolean A04(List list, float f) {
        if (f != 0.0f) {
            if (!AnonymousClass7TE.A1b(list)) {
                return false;
            }
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (JTO.A0g(it).A01 != 0.0f) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void A0P(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        this.A0A = true;
        ClipsCreationViewModel clipsCreationViewModel = this.A0E;
        AnonymousClass831 A0K2 = JTQ.A0K(clipsCreationViewModel);
        boolean z2 = z;
        if (A0K2 != null) {
            int A012 = A0K2.A01(i);
            int i6 = 0;
            if (!z) {
                i6 = (i3 - i2) - 1;
            }
            this.A01 = A012 + i6;
            i5 = A0K2.A00;
            AnonymousClass51M A0f2 = JTO.A0f(A0K2, i);
            if (A0f2 == null) {
                return;
            }
            if (z) {
                i4 = A0f2.A09 - i2;
            } else {
                i4 = i3 - A0f2.A08;
            }
        } else {
            i4 = 0;
            i5 = 0;
        }
        A0K();
        this.A0K.A07(this.A01);
        clipsCreationViewModel.A0Q.A01(C359548d5.VIDEO_CLIP_TRIM);
        this.A0H.A0T(false, true);
        this.A0I.A0S(false, (String) null);
        if (!ClipsCreationViewModel.A05(clipsCreationViewModel, i, i2, i3)) {
            A0I();
        }
        this.A0J.A0V(i4, i5, z2, false, false);
    }

    public final void A0S(C62517Kh8 kh8, int i, int i2) {
        0qQ.A0B(kh8, 0);
        this.A0K.A01();
        AnonymousClass7TE.A1Z(new MGI(kh8, this, (AnonymousClass4D7) null, i, i2, 2), C318116oQ.A00(this));
    }

    private final KMI A00(Context context, AnonymousClass8RH r19, List list, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int intValue;
        int i5;
        AnonymousClass8RX r0;
        List list2 = list;
        int i6 = i;
        AnonymousClass51M r02 = (AnonymousClass51M) 00k.A0O(list2, i6);
        int i7 = Integer.MAX_VALUE;
        if (r02 != null) {
            i2 = JTP.A08(r02);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        int i8 = i + 1;
        AnonymousClass51M r03 = (AnonymousClass51M) 00k.A0O(list2, i8);
        if (r03 != null) {
            i7 = JTP.A08(r03);
        }
        boolean z2 = false;
        if (i2 < 1000) {
            i2 = 0;
        }
        if (i7 < 1000) {
            i7 = 0;
        }
        float f = 24.0f / 2.0f;
        Context context2 = context;
        int min = Math.min((int) 0nA.A00(context2, f), Math.max(0, (int) ((((float) C63117Krl.A00(context2, i2)) - 0nA.A00(context2, 64.0f)) / 2.0f)));
        int min2 = Math.min((int) 0nA.A00(context2, f), Math.max(0, (int) ((((float) C63117Krl.A00(context2, i7)) - 0nA.A00(context2, 64.0f)) / 2.0f)));
        AnonymousClass836 r1 = this.A0E.A0O;
        String A002 = r1.A00(i6);
        if (A002 != null) {
            List list3 = A2K.A00;
            int size = list3.size();
            i3 = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                } else if (0qQ.A0K(((C391219sX) list3.get(i9)).A02, A002)) {
                    i3 = i9 + 1;
                    break;
                } else {
                    i9++;
                }
            }
        } else {
            i3 = 0;
        }
        AnonymousClass8RH r5 = r19;
        boolean z3 = r5 instanceof AnonymousClass8RX;
        Integer num = null;
        if (z3 && (r0 = (AnonymousClass8RX) r5) != null && ((r0.A00 - 1) / 2) - 1 == i6) {
            z2 = true;
        }
        AnonymousClass0Ud r12 = r1.A03;
        boolean A022 = AEH.A02((AnonymousClass831) r12.getValue(), i6);
        if (r5 instanceof C355878Rs) {
            i4 = ((C355878Rs) r5).A00;
        } else if (r5 instanceof C355868Rr) {
            i4 = ((C355868Rr) r5).A00;
        } else if (r5 instanceof AnonymousClass8RW) {
            i4 = ((AnonymousClass8RW) r5).A00;
        } else {
            if (r5 instanceof AnonymousClass8RR) {
                i4 = ((AnonymousClass8RR) r5).A00;
            }
            boolean z4 = true;
            if (!z3 && !(r5 instanceof AnonymousClass8RU) && !(r5 instanceof AnonymousClass8RV) && !(r5 instanceof AnonymousClass8RW) && !(r5 instanceof KM3) && (num == null || (intValue = num.intValue()) == -1 || -1 > (i5 = i - intValue) || i5 >= 1)) {
                int A042 = (int) (0nA.A04(context2, 44) / JTS.A01(context2, LQO.A00));
                if (!0qQ.A0K(A0F(i6, A042), true) && !0qQ.A0K(A0F(i8, A042), true) && AEH.A02((AnonymousClass831) r12.getValue(), i6)) {
                    z4 = false;
                }
            }
            return new KMI(i3, min, min2, z2, A022, !z4, z);
        }
        num = Integer.valueOf(i4);
        boolean z42 = true;
        int A0422 = (int) (0nA.A04(context2, 44) / JTS.A01(context2, LQO.A00));
        z42 = false;
        return new KMI(i3, min, min2, z2, A022, !z42, z);
    }

    public static final void A01(AnonymousClass8RH r6, C60108Jfo jfo) {
        05G r0;
        C61060Jvy jvy;
        Integer num;
        boolean z;
        Integer num2;
        boolean z2;
        int i;
        if ((r6 instanceof C355768Rh) || (r6 instanceof C355778Ri) || (r6 instanceof C355858Rq) || (r6 instanceof C355838Ro) || (r6 instanceof C355748Rf) || (r6 instanceof C355758Rg) || (r6 instanceof C355708Ra) || (r6 instanceof C355718Rb) || (r6 instanceof C355728Rd) || (r6 instanceof C355868Rr) || (r6 instanceof AnonymousClass8RV) || (r6 instanceof AnonymousClass8RR) || (r6 instanceof AnonymousClass8RW)) {
            r0 = jfo.A0a;
            jvy = new C61060Jvy(AnonymousClass05K.A00, 8, true, false, false);
        } else if ((r6 instanceof C355878Rs) || (r6 instanceof KM9)) {
            r0 = jfo.A0a;
            boolean z3 = jfo.A05;
            if (z3 || jfo.A09) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A0N;
            }
            jvy = new C61060Jvy(num, 8, true, !z3, false);
        } else {
            if (r6 instanceof AnonymousClass8RY) {
                r0 = jfo.A0a;
                z = true;
                num2 = AnonymousClass05K.A0C;
                z2 = false;
                i = 8;
            } else if (r6 instanceof AnonymousClass8RX) {
                r0 = jfo.A0a;
                z = false;
                num2 = AnonymousClass05K.A00;
                z2 = true;
                i = 4;
            } else if (r6 instanceof AnonymousClass8RU) {
                r0 = jfo.A0a;
                boolean z4 = ((AnonymousClass8RU) r6).A00;
                jvy = new C61060Jvy(JTP.A0j(z4 ? 1 : 0), 8, false, !z4, false);
            } else if (!(r6 instanceof KM6) && !(r6 instanceof C355788Rj) && !(r6 instanceof C355808Rl) && !(r6 instanceof AnonymousClass8RZ) && !(r6 instanceof C355738Re) && !(r6 instanceof AnonymousClass8RS) && !(r6 instanceof AnonymousClass8Rc) && !(r6 instanceof AnonymousClass8RG)) {
                throw AnonymousClass7TE.A1K();
            } else {
                return;
            }
            jvy = new C61060Jvy(num2, i, z, z, z2);
        }
        r0.Epw(jvy);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(X.AnonymousClass8RH r4, float r5, float r6, int r7) {
        /*
            boolean r0 = r4 instanceof X.C355828Rn
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0026
            X.8Rn r4 = (X.C355828Rn) r4
            X.Gms r0 = r4.A01
            if (r0 != 0) goto L_0x001b
            int r1 = r4.A00
            r0 = -1
            if (r1 != r0) goto L_0x001b
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x001a
        L_0x0015:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
        L_0x0017:
            if (r0 == 0) goto L_0x001a
            r2 = 0
        L_0x001a:
            return r2
        L_0x001b:
            int r0 = r4.A00
            if (r0 != r7) goto L_0x0026
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x001a
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            goto L_0x0017
        L_0x0026:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60108Jfo.A02(X.8RH, float, float, int):boolean");
    }

    public static final boolean A03(AnonymousClass8RH r3, List list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!JTO.A0g(it).A0F.A0K) {
                if ((r3 instanceof AnonymousClass8RU) || (r3 instanceof AnonymousClass8RV) || (r3 instanceof AnonymousClass8RX)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int A0E() {
        List list = this.A0M;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if ((next instanceof KMJ) || (next instanceof KMH)) {
                A1C.add(next);
            }
        }
        return A1C.size();
    }

    public final Boolean A0F(int i, int i2) {
        Integer A0I2 = this.A0E.A0I(i);
        if (A0I2 != null) {
            return Boolean.valueOf(C51970G9q.A1T((((float) A0I2.intValue()) > ((float) i2) ? 1 : (((float) A0I2.intValue()) == ((float) i2) ? 0 : -1))));
        }
        return null;
    }

    public final Integer A0G() {
        C355868Rr r2;
        AnonymousClass8RH A0E2 = this.A0F.A0E();
        if (!(A0E2 instanceof C355868Rr) || (r2 = (C355868Rr) A0E2) == null) {
            return null;
        }
        return Integer.valueOf(r2.A00);
    }

    public final void A0J() {
        AnonymousClass8RF r2 = this.A0F;
        AnonymousClass8RH A0E2 = r2.A0E();
        if (((A0E2 instanceof C355878Rs) || (A0E2 instanceof C355868Rr) || (A0E2 instanceof C355748Rf) || (A0E2 instanceof C355758Rg) || (A0E2 instanceof C355858Rq) || (A0E2 instanceof C355768Rh) || (A0E2 instanceof C355778Ri) || (A0E2 instanceof C355808Rl)) && !A0X()) {
            JTR.A1M(r2);
        }
    }

    public final void A0L() {
        int segmentIndex;
        AnonymousClass831 A0K2;
        AnonymousClass51O A042;
        AnonymousClass8RH A0E2 = this.A0F.A0E();
        if (A0E2 instanceof C355868Rr) {
            segmentIndex = ((C355868Rr) A0E2).A00;
        } else if (A0E2 instanceof AnonymousClass8RS) {
            segmentIndex = ((AnonymousClass8RS) A0E2).getSegmentIndex();
        } else {
            return;
        }
        if (segmentIndex != -1 && (A0K2 = JTQ.A0K(this.A0E)) != null && (A042 = A0K2.A04(segmentIndex)) != null) {
            MHN.A03(A042, this, C318116oQ.A00(this), 12);
        }
    }

    public final void A0M(float f) {
        int A072;
        AnonymousClass831 A0K2;
        AnonymousClass51M A0f2;
        AnonymousClass8RH A0E2 = this.A0F.A0E();
        boolean z = A0E2 instanceof AnonymousClass8RW;
        ClipsCreationViewModel clipsCreationViewModel = this.A0E;
        if (!z || (A0K2 = JTQ.A0K(clipsCreationViewModel)) == null || (A0f2 = JTO.A0f(A0K2, ((AnonymousClass8RW) A0E2).A00)) == null) {
            A072 = JTO.A07(clipsCreationViewModel);
        } else {
            A072 = (JTO.A07(clipsCreationViewModel) - JTP.A08(A0f2)) + C63168Ksb.A00(A0f2, f);
        }
        this.A0Z.Epw(new C61065Jw3(AnonymousClass05K.A0C, A072, JTO.A07(clipsCreationViewModel), 7));
    }

    public final void A0N(int i) {
        Object obj;
        AnonymousClass861 r4 = this.A0K;
        if (r4.A0A.A02() != AnonymousClass8YU.PLAYING && !A0Z() && !(this.A0F.A0E() instanceof AnonymousClass8RX)) {
            05G r3 = this.A0c;
            C61052Jvq jvq = (C61052Jvq) r3.getValue();
            if (jvq != null) {
                obj = jvq.A01;
            } else {
                obj = null;
            }
            if (obj == AnonymousClass05K.A0C) {
                r3.Epw((Object) null);
            } else {
                r4.A06(i);
            }
        }
    }

    public final void A0O(int i) {
        this.A03 = i;
        C51971G9r.A1Q(this, C318116oQ.A00(this), 7);
    }

    public final void A0Q(int i, int i2, int i3, boolean z) {
        AnonymousClass51M A0f2;
        int i4;
        int A072;
        int i5;
        int i6 = i3;
        int i7 = i6;
        int i8 = i2;
        boolean z2 = z;
        if (z) {
            i7 = i8;
        }
        this.A01 = i7;
        if (!0qQ.A0K(this.A0B.A02(), C361268fw.A00)) {
            if (!z) {
                this.A01--;
            }
            AnonymousClass831 A0K2 = JTQ.A0K(this.A0E);
            if (A0K2 != null) {
                i5 = A0K2.A01(i);
            } else {
                i5 = 0;
            }
            A0N(this.A01 + i5);
        }
        AnonymousClass7TE.A1Z(new MFY(this, (AnonymousClass4D7) null, i6, i8, 4), C318116oQ.A00(this));
        ClipsCreationViewModel clipsCreationViewModel = this.A0E;
        AnonymousClass831 A0K3 = JTQ.A0K(clipsCreationViewModel);
        if (A0K3 != null && (A0f2 = JTO.A0f(A0K3, i)) != null) {
            if (z) {
                i4 = A0f2.A09 - i2;
            } else {
                i4 = i3 - A0f2.A08;
            }
            05G r4 = this.A0c;
            Integer num = AnonymousClass05K.A01;
            if (z) {
                A072 = i4;
            } else {
                A072 = JTO.A07(clipsCreationViewModel) + i4;
            }
            r4.Epw(new C61052Jvq(num, A072, z2));
            this.A0H.A0P(i4, JTO.A07(clipsCreationViewModel), z2);
            this.A0I.A0P(i4, JTO.A07(clipsCreationViewModel), z2);
            this.A0J.A0V(i4, JTO.A07(clipsCreationViewModel), z2, true, false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: X.KMG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: X.KMJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: X.KMJ} */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009c, code lost:
        if (r0 != 0) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
        if (java.lang.Float.valueOf(r8) == null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0214, code lost:
        if (java.lang.Float.valueOf(r7) == null) goto L_0x0216;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R(android.content.Context r44, X.AnonymousClass8RH r45, java.util.List r46, int r47, boolean r48, boolean r49) {
        /*
            r43 = this;
            r6 = r47
            r1 = r45
            r2 = r46
            r11 = 0
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r5 = r43
            if (r46 != 0) goto L_0x001b
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r5.A0E
            X.831 r0 = X.JTQ.A0K(r0)
            if (r0 == 0) goto L_0x029a
            java.util.ArrayList r2 = r0.A05()
        L_0x001b:
            r12 = 0
            r17 = 1
            if (r45 != 0) goto L_0x002c
            X.8RF r0 = r5.A0F
            X.8RH r1 = r0.A0E()
            if (r1 != 0) goto L_0x002c
            X.8Rs r1 = X.JTQ.A0J()
        L_0x002c:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r15 = r5.A0E
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r15.A0K
            X.0Ud r0 = r0.A0k
            float r10 = X.JTR.A03(r0)
            boolean r14 = r1 instanceof X.AnonymousClass8RU
            r42 = r44
            if (r14 == 0) goto L_0x0055
            int r7 = r47 * 2
            int r6 = r5.A0E()
            int r4 = X.Dbb.A01(r42)
            int r0 = X.JTR.A05(r42)
            int r4 = r4 + r0
            int r0 = X.DbY.A01(r42)
            int r4 = r4 + r0
            int r6 = r6 * r4
            int r7 = r7 - r6
            if (r7 >= 0) goto L_0x0296
            r6 = 0
        L_0x0055:
            if (r48 == 0) goto L_0x0273
            boolean r7 = A03(r1, r2)
            boolean r0 = A04(r2, r10)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            X.KMG r0 = new X.KMG
            r0.<init>(r4, r6, r7)
            r3.add(r0)
        L_0x006b:
            int r16 = r2.size()
            r0 = 0
        L_0x0070:
            r4 = r16
            if (r0 >= r4) goto L_0x029e
            int r34 = r0 + -1
            r35 = r49
            r30 = r5
            r31 = r42
            r32 = r1
            r33 = r2
            X.KMI r4 = r30.A00(r31, r32, r33, r34, r35)
            r3.add(r4)
            if (r14 == 0) goto L_0x00c7
            java.lang.Object r8 = r2.get(r0)
            X.51P r8 = (X.AnonymousClass51P) r8
            X.8JI r7 = X.AnonymousClass8JI.SEQUENTIAL_REMIX
            X.83H r4 = r15.A0L
            X.8J0 r4 = r4.A00
            if (r4 == 0) goto L_0x009e
            X.8JI r4 = r4.A03
            if (r7 != r4) goto L_0x009e
            r4 = 1
            if (r0 == 0) goto L_0x009f
        L_0x009e:
            r4 = 0
        L_0x009f:
            r7 = r4 ^ 1
            X.KMH r4 = new X.KMH
            r4.<init>(r8, r11, r7)
            r3.add(r4)
        L_0x00a9:
            r4 = r17
            int r4 = X.DbT.A02(r2, r4)
            if (r0 != r4) goto L_0x00c4
            r18 = r5
            r19 = r42
            r20 = r1
            r21 = r2
            r22 = r0
            r23 = r35
            X.KMI r4 = r18.A00(r19, r20, r21, r22, r23)
            r3.add(r4)
        L_0x00c4:
            int r0 = r0 + 1
            goto L_0x0070
        L_0x00c7:
            boolean r4 = r1 instanceof X.AnonymousClass8RV
            if (r4 == 0) goto L_0x016e
            r4 = r1
            X.8RV r4 = (X.AnonymousClass8RV) r4
            if (r4 == 0) goto L_0x0158
            int r4 = r4.A00
            if (r4 != r0) goto L_0x0158
            java.lang.Object r7 = r2.get(r0)
            X.51M r7 = (X.AnonymousClass51M) r7
            java.lang.Object r4 = r2.get(r0)
            X.51M r4 = (X.AnonymousClass51M) r4
            float r4 = r4.A01
            boolean r34 = A02(r1, r10, r4, r0)
            java.lang.String r22 = r7.CE4()
            int r4 = r7.A09
            r19 = r4
            int r4 = r7.A08
            r18 = r4
            boolean r4 = r7.A0O
            if (r4 == 0) goto L_0x0153
            X.51R r4 = r7.A0F
            int r9 = r4.A02
        L_0x00fa:
            int r29 = X.JTP.A08(r7)
            float r24 = X.LQO.A00
            float r13 = r7.A00
            int r4 = r7.A05
            if (r4 < 0) goto L_0x0150
            java.lang.Integer r21 = java.lang.Integer.valueOf(r4)
        L_0x010a:
            boolean r33 = X.AnonymousClass51Q.A05(r7)
            X.89w r4 = r5.A0L
            X.89v r4 = r4.A03
            if (r4 == 0) goto L_0x0125
            int r8 = r4.A02
            if (r8 == 0) goto L_0x0125
            int r4 = r4.A01
            if (r4 == 0) goto L_0x0125
            float r8 = (float) r8
            float r4 = (float) r4
            float r8 = r8 / r4
            java.lang.Float r4 = java.lang.Float.valueOf(r8)
            if (r4 != 0) goto L_0x0127
        L_0x0125:
            r8 = 1058013184(0x3f100000, float:0.5625)
        L_0x0127:
            java.lang.Float r20 = java.lang.Float.valueOf(r8)
            r8 = 29
            X.JJU r4 = new X.JJU
            r4.<init>(r8, r7, r5)
            X.KMJ r7 = new X.KMJ
            r25 = r13
            r26 = r19
            r27 = r18
            r28 = r9
            r30 = r17
            r31 = r11
            r32 = r17
            r18 = r7
            r19 = r12
            r23 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x014b:
            r3.add(r7)
            goto L_0x00a9
        L_0x0150:
            r21 = 0
            goto L_0x010a
        L_0x0153:
            int r9 = r7.A0B()
            goto L_0x00fa
        L_0x0158:
            java.lang.Object r4 = r2.get(r0)
            X.51M r4 = (X.AnonymousClass51M) r4
            int r7 = X.JTP.A08(r4)
            r4 = r42
            int r4 = X.C63117Krl.A00(r4, r7)
            X.KMG r7 = new X.KMG
            r7.<init>(r12, r4, r11)
            goto L_0x014b
        L_0x016e:
            boolean r4 = r1 instanceof X.C355868Rr
            if (r4 == 0) goto L_0x0261
            r4 = r1
            X.8Rr r4 = (X.C355868Rr) r4
            if (r4 == 0) goto L_0x0261
            int r4 = r4.A00
            if (r4 != r0) goto L_0x0261
        L_0x017b:
            r4 = 1
        L_0x017c:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            boolean r4 = r1 instanceof X.AnonymousClass8RW
            if (r4 == 0) goto L_0x0240
            r4 = r1
            X.8RW r4 = (X.AnonymousClass8RW) r4
            if (r4 == 0) goto L_0x0240
            int r4 = r4.A00
            if (r4 != r0) goto L_0x0240
        L_0x018d:
            r4 = 1
        L_0x018e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r30 = r7.booleanValue()
            boolean r31 = r4.booleanValue()
            java.lang.Object r4 = r2.get(r0)
            X.51M r4 = (X.AnonymousClass51M) r4
            java.lang.Object r7 = r2.get(r0)
            X.51M r7 = (X.AnonymousClass51M) r7
            float r7 = r7.A01
            boolean r34 = A02(r1, r10, r7, r0)
            java.lang.String r22 = r4.CE4()
            int r7 = r4.A09
            r26 = r7
            int r7 = r4.A08
            r27 = r7
            boolean r7 = r4.A0O
            if (r7 == 0) goto L_0x023b
            X.51R r7 = r4.A0F
            int r13 = r7.A02
        L_0x01c0:
            int r29 = X.JTP.A08(r4)
            float r24 = X.LQO.A00
            float r7 = r4.A00
            r25 = r7
            X.9Hy r8 = r4.A0A
            if (r8 == 0) goto L_0x0238
            float r7 = r8.A02
            r21 = r7
            float r7 = r8.A00
            r20 = r7
            float r7 = r8.A03
            r18 = r7
            float r9 = r8.A01
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            r7 = 6
            X.0qQ.A0B(r8, r7)
            X.9cA r19 = new X.9cA
            r36 = r19
            r37 = r17
            r38 = r21
            r39 = r20
            r40 = r18
            r41 = r9
            r36.<init>(r37, r38, r39, r40, r41)
        L_0x01f3:
            int r7 = r4.A05
            if (r7 < 0) goto L_0x0235
            java.lang.Integer r21 = java.lang.Integer.valueOf(r7)
        L_0x01fb:
            boolean r33 = X.AnonymousClass51Q.A05(r4)
            X.89w r7 = r5.A0L
            X.89v r7 = r7.A03
            if (r7 == 0) goto L_0x0216
            int r9 = r7.A02
            if (r9 == 0) goto L_0x0216
            int r8 = r7.A01
            if (r8 == 0) goto L_0x0216
            float r7 = (float) r9
            float r8 = (float) r8
            float r7 = r7 / r8
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            if (r8 != 0) goto L_0x0218
        L_0x0216:
            r7 = 1058013184(0x3f100000, float:0.5625)
        L_0x0218:
            java.lang.Float r20 = java.lang.Float.valueOf(r7)
            r7 = 28
            X.JJU r8 = new X.JJU
            r8.<init>(r7, r4, r5)
            X.KMJ r4 = new X.KMJ
            r23 = r8
            r28 = r13
            r32 = r11
            r18 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3.add(r4)
            goto L_0x00a9
        L_0x0235:
            r21 = 0
            goto L_0x01fb
        L_0x0238:
            r19 = 0
            goto L_0x01f3
        L_0x023b:
            int r13 = r4.A0B()
            goto L_0x01c0
        L_0x0240:
            boolean r4 = r1 instanceof X.AnonymousClass8RR
            if (r4 == 0) goto L_0x024f
            r4 = r1
            X.8RR r4 = (X.AnonymousClass8RR) r4
            if (r4 == 0) goto L_0x024f
            int r4 = r4.A00
            if (r4 != r0) goto L_0x024f
            goto L_0x018d
        L_0x024f:
            boolean r4 = r1 instanceof X.C355828Rn
            if (r4 == 0) goto L_0x025e
            r4 = r1
            X.8Rn r4 = (X.C355828Rn) r4
            if (r4 == 0) goto L_0x025e
            int r4 = r4.A00
            if (r4 != r0) goto L_0x025e
            goto L_0x018d
        L_0x025e:
            r4 = 0
            goto L_0x018e
        L_0x0261:
            boolean r4 = r1 instanceof X.KM3
            if (r4 == 0) goto L_0x0270
            r4 = r1
            X.KM3 r4 = (X.KM3) r4
            if (r4 == 0) goto L_0x0270
            int r4 = r4.A00
            if (r4 != r0) goto L_0x0270
            goto L_0x017b
        L_0x0270:
            r4 = 0
            goto L_0x017c
        L_0x0273:
            java.util.List r0 = r5.A0M
            java.lang.Object r0 = X.00k.A0J(r0)
            if (r0 == 0) goto L_0x0280
            r3.add(r0)
            goto L_0x006b
        L_0x0280:
            boolean r7 = A03(r1, r2)
            boolean r0 = A04(r2, r10)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            X.KMG r0 = new X.KMG
            r0.<init>(r4, r6, r7)
            r3.add(r0)
            goto L_0x006b
        L_0x0296:
            int r6 = r7 / 2
            goto L_0x0055
        L_0x029a:
            X.0sn r2 = X.0sn.A00
            goto L_0x001b
        L_0x029e:
            if (r48 == 0) goto L_0x02b9
            X.KMG r0 = new X.KMG
            r0.<init>(r12, r6, r11)
            r3.add(r0)
        L_0x02a8:
            java.util.List r0 = r5.A0M
            r0.clear()
            r0.addAll(r3)
            X.6oS r1 = X.C318116oQ.A00(r5)
            r0 = 5
            X.C51971G9r.A1Q(r5, r1, r0)
            return
        L_0x02b9:
            java.util.List r0 = r5.A0M
            java.lang.Object r0 = X.00k.A0L(r0)
            if (r0 == 0) goto L_0x02c5
            r3.add(r0)
            goto L_0x02a8
        L_0x02c5:
            X.KMG r0 = new X.KMG
            r0.<init>(r12, r6, r11)
            r3.add(r0)
            goto L_0x02a8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60108Jfo.A0R(android.content.Context, X.8RH, java.util.List, int, boolean, boolean):void");
    }

    public final void A0T(Integer num) {
        05G r4 = this.A0Z;
        Integer num2 = AnonymousClass05K.A0N;
        ClipsCreationViewModel clipsCreationViewModel = this.A0E;
        r4.Epw(new C61065Jw3(JTO.A07(clipsCreationViewModel), num2));
        if (num != null) {
            C61806KMu kMu = this.A0J;
            int A072 = JTO.A07(clipsCreationViewModel);
            int intValue = num.intValue();
            kMu.A0V(A072 - intValue, intValue, false, false, true);
        }
    }

    public final void A0U(Integer num) {
        int i;
        AnonymousClass2Fj r4 = this.A0B;
        Object A022 = r4.A02();
        C361268fw r3 = C361268fw.A00;
        if (!0qQ.A0K(A022, r3)) {
            AnonymousClass861 r2 = this.A0K;
            r2.A05();
            if (num != null) {
                i = num.intValue();
            } else {
                i = this.A01;
            }
            r2.A07(i);
            2Fk r1 = this.A0E.A0C;
            0qQ.A0B(r1, 0);
            if (r2.A00 != r1) {
                r2.A09(r1);
            }
            r2.A0A(new C65120Lni(this, num));
            r4.A0B(r3);
            return;
        }
        A0N(this.A01);
    }

    public final void A0V(Integer num, Integer num2) {
        if (num != null) {
            this.A0M.set(0, new KMG((Boolean) null, num.intValue(), false));
        }
        if (num2 != null) {
            List list = this.A0M;
            list.set(C51966G9m.A06(list), new KMG((Boolean) null, num2.intValue(), false));
        }
        C51971G9r.A1Q(this, C318116oQ.A00(this), 6);
    }

    public final boolean A0X() {
        Object obj;
        05G r3 = this.A0c;
        C61052Jvq jvq = (C61052Jvq) r3.getValue();
        Object obj2 = null;
        if (jvq != null) {
            obj = jvq.A01;
        } else {
            obj = null;
        }
        if (obj != AnonymousClass05K.A01) {
            C61052Jvq jvq2 = (C61052Jvq) r3.getValue();
            if (jvq2 != null) {
                obj2 = jvq2.A01;
            }
            if (obj2 == AnonymousClass05K.A00 || this.A0J.A0E.getValue() == C62478KgT.Trimming || this.A0I.A02 || this.A0H.A02) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A0Y() {
        Integer num;
        Integer num2;
        05G r3 = this.A0e;
        L7v l7v = (L7v) r3.getValue();
        Integer num3 = null;
        if (l7v != null) {
            num = l7v.A03;
        } else {
            num = null;
        }
        if (num != AnonymousClass05K.A00) {
            L7v l7v2 = (L7v) r3.getValue();
            if (l7v2 != null) {
                num2 = l7v2.A03;
            } else {
                num2 = null;
            }
            if (num2 != AnonymousClass05K.A01) {
                L7v l7v3 = (L7v) r3.getValue();
                if (l7v3 != null) {
                    num3 = l7v3.A03;
                }
                if (num3 == AnonymousClass05K.A0C) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public final boolean A0Z() {
        Object obj;
        Object obj2;
        05G r3 = this.A0Z;
        C61065Jw3 jw3 = (C61065Jw3) r3.getValue();
        Object obj3 = null;
        if (jw3 != null) {
            obj = jw3.A02;
        } else {
            obj = null;
        }
        if (obj != AnonymousClass05K.A00) {
            C61065Jw3 jw32 = (C61065Jw3) r3.getValue();
            if (jw32 != null) {
                obj2 = jw32.A02;
            } else {
                obj2 = null;
            }
            if (obj2 != AnonymousClass05K.A01) {
                C61065Jw3 jw33 = (C61065Jw3) r3.getValue();
                if (jw33 != null) {
                    obj3 = jw33.A02;
                }
                if (obj3 == AnonymousClass05K.A0C) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public final boolean A0a() {
        Object obj;
        05G r3 = this.A0c;
        C61052Jvq jvq = (C61052Jvq) r3.getValue();
        Object obj2 = null;
        if (jvq != null) {
            obj = jvq.A01;
        } else {
            obj = null;
        }
        if (obj != AnonymousClass05K.A00) {
            C61052Jvq jvq2 = (C61052Jvq) r3.getValue();
            if (jvq2 != null) {
                obj2 = jvq2.A01;
            }
            if (obj2 == AnonymousClass05K.A01) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final ArrayList A0H() {
        int i;
        int i2;
        ArrayList A1C = AnonymousClass7TE.A1C();
        AnonymousClass2gB r4 = this.A0E.A0F;
        AnonymousClass831 A0h2 = JTO.A0h(r4);
        if (A0h2 != null) {
            int A082 = JTO.A08(A0h2);
            if (!(Integer.valueOf(A082) == null || A082 == 0)) {
                for (int i3 = 0; i3 < A082; i3++) {
                    AnonymousClass831 A0h3 = JTO.A0h(r4);
                    if (A0h3 != null) {
                        i = A0h3.A01(i3);
                    } else {
                        i = 0;
                    }
                    AnonymousClass831 A0h4 = JTO.A0h(r4);
                    if (A0h4 != null) {
                        i2 = A0h4.A00(i3);
                    } else {
                        i2 = 0;
                    }
                    AnonymousClass7TF.A1M(A1C, i);
                    AnonymousClass7TF.A1M(A1C, i + i2);
                }
            }
        }
        return 00k.A0S(this.A0I.A0E(), 00k.A0S(this.A0H.A0E(), 00k.A0S(this.A0J.A0E(), 00k.A0W(A1C))));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I() {
        /*
            r6 = this;
            boolean r0 = r6.A0a()
            r2 = 0
            if (r0 == 0) goto L_0x002c
            X.05G r5 = r6.A0c
            java.lang.Object r0 = r5.getValue()
            X.Jvq r0 = (X.C61052Jvq) r0
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.A02
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L_0x0017:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            int r0 = r6.A01
            if (r3 == 0) goto L_0x0021
            boolean r2 = r3.booleanValue()
        L_0x0021:
            X.Jvq r4 = new X.Jvq
            r4.<init>((java.lang.Integer) r1, (int) r0, (boolean) r2)
        L_0x0026:
            r5.Epw(r4)
        L_0x0029:
            return
        L_0x002a:
            r3 = 0
            goto L_0x0017
        L_0x002c:
            boolean r0 = r6.A0Z()
            if (r0 == 0) goto L_0x004d
            X.05G r0 = r6.A0Z
            java.lang.Object r0 = r0.getValue()
            X.Jw3 r0 = (X.C61065Jw3) r0
            if (r0 == 0) goto L_0x0046
            int r0 = r0.A00
        L_0x003e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0T(r0)
            return
        L_0x0046:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A0E
            int r0 = X.JTO.A07(r0)
            goto L_0x003e
        L_0x004d:
            boolean r0 = r6.A0Y()
            if (r0 == 0) goto L_0x0029
            X.05G r5 = r6.A0e
            java.lang.Object r0 = r5.getValue()
            X.L7v r0 = (X.L7v) r0
            if (r0 == 0) goto L_0x0072
            int r3 = r0.A02
        L_0x005f:
            java.lang.Object r0 = r5.getValue()
            X.L7v r0 = (X.L7v) r0
            if (r0 == 0) goto L_0x0069
            int r2 = r0.A01
        L_0x0069:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r0 = 0
            X.L7v r4 = new X.L7v
            r4.<init>(r1, r3, r2, r0)
            goto L_0x0026
        L_0x0072:
            r3 = 0
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60108Jfo.A0I():void");
    }

    public final void A0K() {
        C51971G9r.A1Q(this, C318116oQ.A00(this), 4);
    }

    public final void A0W(List list) {
        MHN.A03(list, this, C318116oQ.A00(this), 11);
    }
}
