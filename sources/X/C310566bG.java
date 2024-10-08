package X;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.endtoend.EndToEnd;
import com.facebook.litho.LithoView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6bG  reason: invalid class name and case insensitive filesystem */
public final class C310566bG extends C310576bH implements C270414gh, C310596bJ {
    public int A00;
    public int A01;
    public C311246cN A02;
    public C310706bU A03;
    public final Context A04;
    public final C247833gz A05;
    public final UserSession A06;
    public final C226642hc A07;
    public final AnonymousClass4DU A08;
    public final C309646Zb A09;
    public final AnonymousClass6ZZ A0A;
    public final C310636bN A0B;
    public final C317116mk A0C;
    public final C309916a4 A0D;
    public final C310606bK A0E;
    public final C317286n1 A0F;
    public final C309666Zd A0G;
    public final AnonymousClass0eM A0H = AnonymousClass0eN.A00(0eO.A02, new C377079Kl(this, 45));
    public final Activity A0I;
    public final C229392nJ A0J;
    public final AnonymousClass34Y A0K;
    public final ReelViewerConfig A0L;
    public final AnonymousClass3BQ A0M;
    public final C231002qi A0N;
    public final C230882qT A0O;
    public final C310016aI A0P;
    public final C273384mU A0Q;
    public final C317566nT A0R;
    public final C310246af A0S;
    public final AnonymousClass6a7 A0T;
    public final C309936a9 A0U;
    public final String A0V;
    public final boolean A0W;

    public final ViewGroup A01(ViewGroup viewGroup, AnonymousClass6k9 r12) {
        int ordinal = r12.ordinal();
        ViewGroup viewGroup2 = viewGroup;
        if (ordinal == 1) {
            Activity activity = this.A0I;
            C226642hc r7 = this.A07;
            return C315686kL.A00(activity, viewGroup2, this.A05, this.A06, r7, this.A0M, AnonymousClass05K.A01);
        } else if (ordinal == 3) {
            return C307066Or.A00(viewGroup, this.A05, this.A06, this.A07, this.A0M);
        } else if (ordinal == 6) {
            return ((C232502tp) this.A0E.A01.getValue()).A03();
        } else {
            if (ordinal == 4) {
                return C306586Ms.A00(viewGroup, this.A05, this.A06, this.A07);
            } else if (ordinal == 2) {
                C309646Zb r3 = this.A09;
                return C71102Occ.A00(viewGroup, this.A05, this.A06, this.A07, r3);
            } else if (ordinal == 5) {
                return C70900OQs.A00(viewGroup, this.A06);
            } else {
                throw new IllegalStateException(002.A0R("Invalid item type: ", r12.name()));
            }
        }
    }

    public final C255773uh B69(C250973mM r3) {
        0qQ.A0B(r3, 0);
        int CMI = CMI(r3) + 1;
        if (CMI >= getCount() || Bky(CMI) == null) {
            return null;
        }
        C250973mM Bky = Bky(CMI);
        0qQ.A0A(Bky);
        return Bky.A08(this.A06);
    }

    public final C250973mM Bkz(String str) {
        return null;
    }

    public final C309426Yf Bz3(C255773uh r2) {
        0qQ.A0B(r2, 0);
        return this.A0B.Bz3(r2);
    }

    public final int CMI(C250973mM r2) {
        0qQ.A0B(r2, 0);
        return this.A0B.A02.indexOf(r2);
    }

    public final void Ei7(List list) {
        0qQ.A0B(list, 0);
        C310636bN r4 = this.A0B;
        List list2 = r4.A02;
        list2.clear();
        r4.A01.clear();
        r4.A04.clear();
        r4.A03.clear();
        r4.A05.set(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C250973mM r1 = (C250973mM) it.next();
            0qQ.A0B(r1, 0);
            r4.A01(r1, list2.size());
        }
        0fE.A00(this, 1042206859);
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        0qQ.A0B(dataSetObserver, 0);
        super.registerDataSetObserver(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        0qQ.A0B(dataSetObserver, 0);
        super.unregisterDataSetObserver(dataSetObserver);
    }

    public static final void A00(View view, C255773uh r33, C250973mM r34, C310566bG r35, int i) {
        2el r4;
        View findViewById;
        AnonymousClass30Y r0;
        Integer num;
        C310706bU r2;
        UserSession userSession;
        C310566bG r02 = r35;
        View view2 = view;
        C310636bN r10 = r02.A0B;
        int i2 = i;
        if (i2 == r10.A00() - 1) {
            AnonymousClass9L1 r22 = new AnonymousClass9L1(view2, 2);
            if (EndToEnd.isRunningEndToEndTest()) {
                r22.invoke();
            }
        }
        C255773uh r3 = r33;
        C309426Yf Bz3 = r02.Bz3(r3);
        Object tag = view2.getTag();
        Bz3.A0I = i2;
        AnonymousClass6k9 A002 = C315586kA.A00(r02.getItemViewType(i2));
        C250973mM r1 = r34;
        switch (A002.ordinal()) {
            case 0:
                userSession = r02.A06;
                if (tag != null) {
                    C305836Jt r23 = (C305836Jt) tag;
                    C317116mk r12 = r02.A0C;
                    AnonymousClass4DU r11 = r02.A08;
                    AnonymousClass3BQ r102 = r02.A0M;
                    0qQ.A0B(userSession, 0);
                    0qQ.A0B(r23, 1);
                    0qQ.A0B(r3, 3);
                    0qQ.A0B(r12, 5);
                    0qQ.A0B(r11, 6);
                    0qQ.A0B(r102, 7);
                    JZP.A01(r11, userSession, r1.A0H.A0H, r3, r1, r102, Bz3, r23, r12);
                    r23.A0d.DO0(r3, r1, r23, false);
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 1:
                UserSession userSession2 = r02.A06;
                if (tag != null) {
                    ReelViewerConfig reelViewerConfig = r02.A0L;
                    int A022 = r1.A02(userSession2);
                    int A032 = r1.A03(userSession2, r3);
                    Reel reel = r1.A0H;
                    boolean z = reel.A1a;
                    C317116mk r18 = r02.A0C;
                    C317286n1 r17 = r02.A0F;
                    C317566nT r24 = r02.A0R;
                    AnonymousClass3BQ r19 = r02.A0M;
                    boolean z2 = r02.A0W;
                    AnonymousClass4DU r36 = r02.A08;
                    C231002qi r20 = r02.A0N;
                    C230882qT r21 = r02.A0O;
                    String str = r02.A0V;
                    int A042 = (int) reel.A04();
                    AnonymousClass34Y r13 = r02.A0K;
                    AnonymousClass6a7 r122 = r02.A0T;
                    C310016aI r103 = r02.A0P;
                    String str2 = str;
                    int i3 = A042;
                    boolean z3 = z;
                    boolean z4 = z2;
                    UserSession userSession3 = userSession2;
                    AnonymousClass34Y r15 = r13;
                    C255773uh r16 = r3;
                    C250973mM r172 = r1;
                    ReelViewerConfig reelViewerConfig2 = reelViewerConfig;
                    C310016aI r222 = r103;
                    C309426Yf r232 = Bz3;
                    AnonymousClass4DU r123 = r36;
                    C229392nJ r132 = r02.A0J;
                    C315686kL.A01(r123, r132, userSession3, r15, r16, r172, reelViewerConfig2, r19, r20, r21, r222, r232, r24, r18, (C316006kx) tag, r17, r122, r02.A0U, str2, A022, A032, i3, z3, z4);
                    if (C317506nN.A00(userSession2, r3)) {
                        C255773uh A082 = r1.A08(userSession2);
                        C309426Yf Bz32 = r02.Bz3(A082);
                        Bz32.A0I = i2;
                        C310706bU r6 = r02.A03;
                        if (r6 != null && (!A082.A1N())) {
                            r6.A00(view2, (C250603lj) null, A082, r1, Bz32, AnonymousClass05K.A00, i2);
                        }
                    }
                    AnonymousClass9MU r104 = new AnonymousClass9MU(r02, r1, r3, tag, i2, 1);
                    if (EndToEnd.isRunningEndToEndTest()) {
                        r104.invoke();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            case 2:
                userSession = r02.A06;
                if (tag != null) {
                    C305736Ji r25 = (C305736Ji) tag;
                    int A023 = r1.A02(userSession);
                    int A033 = r1.A03(userSession, r3);
                    AnonymousClass4DU r112 = r02.A08;
                    AnonymousClass3BQ r105 = r02.A0M;
                    0qQ.A0B(userSession, 0);
                    0qQ.A0B(r25, 1);
                    0qQ.A0B(r3, 3);
                    0qQ.A0B(r112, 7);
                    0qQ.A0B(r105, 8);
                    C71102Occ.A01(r112, userSession, r3, r1, r105, Bz3, r25, A023, A033);
                    r25.A05.DNo(r3, r1, r25, false);
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 3:
                if (tag != null) {
                    Context context = r02.A04;
                    UserSession userSession4 = r02.A06;
                    int A024 = r1.A02(userSession4);
                    int A034 = r1.A03(userSession4, r3);
                    C309666Zd r124 = r02.A0G;
                    C310246af r113 = r02.A0S;
                    ReelViewerConfig reelViewerConfig3 = r02.A0L;
                    AnonymousClass3BQ r62 = r02.A0M;
                    C307066Or.A01(context, r02.A0J, userSession4, r02.A08, r3, r1, reelViewerConfig3, r62, Bz3, r113, (C309406Yd) tag, r124, A024, A034);
                    if (C317506nN.A00(userSession4, r3)) {
                        C310706bU r42 = r02.A03;
                        if (r42 != null && (!r3.A1N())) {
                            r42.A00(view2, (C250603lj) null, r3, r1, Bz3, AnonymousClass05K.A01, i2);
                        }
                        C311246cN r63 = r02.A02;
                        if (r63 == null) {
                            return;
                        }
                        if (C309456Yi.A02(r1)) {
                            r63.A00(view2, r3, r1, Bz3);
                            return;
                        }
                        Reel reel2 = r1.A0H;
                        List list = reel2.A0w;
                        if (list == null || list.isEmpty()) {
                            r4 = r63.A01;
                            findViewById = view2.findViewById(R.id.reel_main_container);
                            if (findViewById != null) {
                                r0 = AnonymousClass30Y.A07;
                            } else {
                                throw new IllegalStateException("Segment Viewpoint view is not in view hierarchy");
                            }
                        } else {
                            0qQ.A0B(r3, 2);
                            r4 = r63.A01;
                            findViewById = view2.findViewById(R.id.reel_main_container);
                            if (findViewById != null) {
                                C306176Ld r7 = new C306176Ld(r3, Bz3, r1.A01, false);
                                String id = reel2.getId();
                                0qQ.A07(id);
                                String A0b = 002.A0b(id, "_segment_", r1.A01);
                                AnonymousClass30Y r03 = AnonymousClass30Y.A07;
                                C2354830a r26 = new C2354830a(r1, r7, A0b);
                                r26.A00((C230372pW) r63.A05.getValue());
                                r26.A00((C306206Lg) r63.A07.getValue());
                                r26.A00((C306226Li) r63.A04.getValue());
                                r0 = r26.A01();
                            } else {
                                throw new IllegalStateException("Segment Viewpoint view is not in view hierarchy");
                            }
                        }
                        r4.A05(findViewById, r0);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            case 4:
                UserSession userSession5 = r02.A06;
                if (tag != null) {
                    C67602Mqa mqa = (C67602Mqa) tag;
                    C317286n1 r106 = r02.A0F;
                    int A025 = r1.A02(userSession5);
                    int A035 = r1.A03(userSession5, r3);
                    C229392nJ r64 = r02.A0J;
                    AnonymousClass4DU r125 = r02.A08;
                    0qQ.A0B(userSession5, 0);
                    0qQ.A0B(mqa, 1);
                    0qQ.A0B(r3, 2);
                    0qQ.A0B(r106, 4);
                    0qQ.A0B(r125, 10);
                    C306586Ms.A01(r125, r64, userSession5, r3, r1, Bz3, mqa, r106, A025, A035);
                    r106.DTo(r3, r1, mqa, false);
                    if (C317506nN.A00(userSession5, r3) && (r2 = r02.A03) != null && (!r3.A1N())) {
                        num = AnonymousClass05K.A0C;
                        break;
                    } else {
                        return;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
                break;
            case 5:
                if (tag != null) {
                    UserSession userSession6 = r02.A06;
                    C309916a4 r72 = r02.A0D;
                    C317116mk r65 = r02.A0C;
                    C310706bU r5 = r02.A03;
                    C70900OQs.A01(r02.A08, userSession6, r3, r1, r02.A0M, r5, r10, r65, (C69061Ndy) tag, r72);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            case 6:
                String id2 = r1.A0H.getId();
                0qQ.A07(id2);
                C73927Pm7 pm7 = new C73927Pm7(r1, 20);
                ((C232502tp) r02.A0E.A01.getValue()).A05((LithoView) view2, id2, pm7, new C73927Pm7(r1, 21), C46020DJd.A00);
                return;
            default:
                throw new IllegalStateException(002.A0R("Invalid item type: ", A002.name()));
        }
        if (C317506nN.A00(userSession, r3) && (r2 = r02.A03) != null && (!r3.A1N())) {
            num = AnonymousClass05K.A00;
            r2.A00(view2, (C250603lj) null, r3, r1, Bz3, num, i2);
        }
    }

    public final List AZQ() {
        return 00k.A0X(00k.A0a(this.A0B.A02));
    }

    public final List Aa7() {
        ArrayList arrayList = new ArrayList();
        C310636bN r5 = this.A0B;
        int A002 = r5.A00();
        for (int i = 0; i < A002; i++) {
            C250973mM r2 = (C250973mM) 00k.A0O(r5.A02, i);
            if (r2 != null && r2.A0N) {
                arrayList.add(new 0eP(Integer.valueOf(i), r2));
            }
        }
        return arrayList;
    }

    public final C250973mM Bky(int i) {
        return (C250973mM) 00k.A0O(this.A0B.A02, i);
    }

    public final C250973mM Bl0(String str) {
        if (str != null) {
            return (C250973mM) this.A0B.A04.get(str);
        }
        return null;
    }

    public final int CMG(Reel reel) {
        int i = 0;
        for (C250973mM r0 : this.A0B.A02) {
            if (0qQ.A0K(r0.A0H.getId(), reel.getId())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void Cs4() {
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A0Q;
        C250973mM r2 = reelViewerFragment.A0a;
        if (r2 != null) {
            reelViewerFragment.A1C.A00(r2, (String) null);
            ReelViewerFragment.A0E(reelViewerFragment);
        }
        super.Cs4();
    }

    public final C250973mM EET(int i) {
        C310636bN r4 = this.A0B;
        if (i < 0) {
            return null;
        }
        List list = r4.A02;
        if (i >= list.size()) {
            return null;
        }
        C250973mM r3 = (C250973mM) list.remove(i);
        ConcurrentHashMap concurrentHashMap = r4.A04;
        Reel reel = r3.A0H;
        String id = reel.getId();
        0qQ.A07(id);
        concurrentHashMap.remove(id);
        List list2 = r4.A01;
        String id2 = reel.getId();
        0qQ.A07(id2);
        list2.remove(id2);
        r4.A05.decrementAndGet();
        return r3;
    }

    public final void EzG(Reel reel, C250973mM r15) {
        C310636bN r1 = this.A0B;
        Reel reel2 = reel;
        C250973mM r2 = new C250973mM(r1.A00, reel2, false, (String) null, (String) null, 0sl.A00, r15.A0E, System.currentTimeMillis(), false);
        int indexOf = r1.A02.indexOf(r15);
        r1.A02(r15);
        r1.A01(r2, indexOf);
    }

    public final int getCount() {
        return this.A0B.A00();
    }

    public final Object getItem(int i) {
        return this.A0B.A02.get(i);
    }

    public final long getItemId(int i) {
        String id = ((C250973mM) this.A0B.A02.get(i)).A0H.getId();
        0qQ.A07(id);
        return (long) id.hashCode();
    }

    public final int getItemViewType(int i) {
        AnonymousClass6k9 r0;
        C310636bN r2 = this.A0B;
        Reel reel = ((C250973mM) r2.A02.get(i)).A0H;
        if (reel.A0d()) {
            r0 = AnonymousClass6k9.BROADCAST;
        } else if (reel.A0c()) {
            r0 = AnonymousClass6k9.BROADCAST_ARCHIVE;
        } else if (reel.CcK()) {
            r0 = AnonymousClass6k9.STORY_AD;
        } else if (reel.A0m()) {
            r0 = AnonymousClass6k9.NETEGO;
        } else if (reel.A1W || AnonymousClass6WN.A00(r2.A00, reel)) {
            r0 = AnonymousClass6k9.STORY_INTERSTITIAL;
        } else {
            r0 = AnonymousClass6k9.STORY;
        }
        return r0.A00;
    }

    public final C250973mM BfF(C250973mM r2) {
        return Bky(CMI(r2) - 1);
    }

    public final boolean CW8(C250973mM r3) {
        int count = getCount();
        if (count <= 0 || !r3.equals(Bky(count - 1))) {
            return false;
        }
        return true;
    }

    public final int getViewTypeCount() {
        return AnonymousClass6k9.values().length;
    }

    /* JADX WARNING: type inference failed for: r0v29, types: [java.lang.Object, X.2hc] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C310566bG(android.app.Activity r21, android.content.Context r22, X.C229392nJ r23, com.instagram.common.session.UserSession r24, X.AnonymousClass34Y r25, X.AnonymousClass4DU r26, com.instagram.model.reels.ReelViewerConfig r27, X.AnonymousClass3BQ r28, X.C310546bE r29, X.C231002qi r30, X.C230882qT r31, X.C310016aI r32, X.C273384mU r33, X.C309646Zb r34, X.AnonymousClass6ZZ r35, X.C317566nT r36, X.C317116mk r37, X.C309916a4 r38, X.C317286n1 r39, X.C310246af r40, X.C309666Zd r41, X.AnonymousClass6a7 r42, X.C309936a9 r43, java.lang.String r44, boolean r45) {
        /*
            r20 = this;
            r11 = r21
            r1 = 0
            r0 = 3
            r10 = r24
            X.0qQ.A0B(r10, r0)
            r0 = 5
            r8 = r37
            X.0qQ.A0B(r8, r0)
            r0 = 6
            r9 = r36
            X.0qQ.A0B(r9, r0)
            r0 = 7
            r5 = r40
            X.0qQ.A0B(r5, r0)
            r0 = 8
            r13 = r35
            X.0qQ.A0B(r13, r0)
            r0 = 9
            r14 = r34
            X.0qQ.A0B(r14, r0)
            r0 = 10
            r4 = r41
            X.0qQ.A0B(r4, r0)
            r0 = 11
            r6 = r39
            X.0qQ.A0B(r6, r0)
            r0 = 12
            r7 = r38
            X.0qQ.A0B(r7, r0)
            r2 = 13
            r16 = r27
            r0 = r16
            X.0qQ.A0B(r0, r2)
            r0 = 14
            r15 = r28
            X.0qQ.A0B(r15, r0)
            r2 = 16
            r18 = r23
            r0 = r18
            X.0qQ.A0B(r0, r2)
            r2 = 20
            r17 = r25
            r0 = r17
            X.0qQ.A0B(r0, r2)
            r2 = 21
            r0 = r29
            X.0qQ.A0B(r0, r2)
            r3 = 22
            r2 = r44
            X.0qQ.A0B(r2, r3)
            r12 = 26
            r3 = r43
            X.0qQ.A0B(r3, r12)
            r12 = r20
            r12.<init>(r0)
            r19 = r22
            r0 = r19
            r12.A04 = r0
            r12.A0I = r11
            r12.A06 = r10
            r0 = r33
            r12.A0Q = r0
            r12.A0C = r8
            r12.A0R = r9
            r12.A0S = r5
            r12.A0A = r13
            r12.A09 = r14
            r12.A0G = r4
            r12.A0F = r6
            r12.A0D = r7
            r0 = r16
            r12.A0L = r0
            r12.A0M = r15
            r0 = r26
            r12.A08 = r0
            r0 = r18
            r12.A0J = r0
            r0 = r45
            r12.A0W = r0
            r0 = r30
            r12.A0N = r0
            r0 = r31
            r12.A0O = r0
            r0 = r17
            r12.A0K = r0
            r12.A0V = r2
            r0 = r32
            r12.A0P = r0
            r12.A0U = r3
            X.0eO r3 = X.0eO.A02
            r2 = 45
            X.9Kl r0 = new X.9Kl
            r0.<init>(r12, r2)
            X.0eM r0 = X.AnonymousClass0eN.A00(r3, r0)
            r12.A0H = r0
            X.07Z r11 = (X.AnonymousClass07Z) r11
            X.6bK r2 = new X.6bK
            r0 = r19
            r2.<init>(r0, r11, r10)
            r12.A0E = r2
            X.0eM r0 = r12.A0H
            r0.getValue()
            X.6bN r0 = new X.6bN
            r0.<init>(r10, r12, r1)
            r12.A0B = r0
            X.2s4 r0 = new X.2s4
            r0.<init>()
            r12.A07 = r0
            X.3gz r0 = new X.3gz
            r0.<init>()
            r12.A05 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r12.A00 = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r12.A01 = r0
            r0 = r42
            r12.A0T = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310566bG.<init>(android.app.Activity, android.content.Context, X.2nJ, com.instagram.common.session.UserSession, X.34Y, X.4DU, com.instagram.model.reels.ReelViewerConfig, X.3BQ, X.6bE, X.2qi, X.2qT, X.6aI, X.4mU, X.6Zb, X.6ZZ, X.6nT, X.6mk, X.6a4, X.6n1, X.6af, X.6Zd, X.6a7, X.6a9, java.lang.String, boolean):void");
    }
}
