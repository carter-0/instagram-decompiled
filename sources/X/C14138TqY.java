package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.TqY  reason: case insensitive filesystem */
public abstract class C14138TqY extends C14430Tvz implements AnonymousClass0iw, AnonymousClass4DR, C74283PsB {
    public static final String __redex_internal_original_name = "BaseSearchChildFragment";
    public int A00;
    public C15050ULg A01 = new C15050ULg("");
    public 0wc A02;
    public C52572GXx A03;
    public C14480Tx2 A04;
    public C358448av A05;
    public TwE A06;
    public C14200Trf A07;
    public C14206Trl A08;
    public C59821JZv A09;
    public C14221Ts1 A0A;
    public C337287g2 A0B;
    public C14445TwT A0C;
    public C14216Trv A0D;
    public C14208Trn A0E;
    public String A0F = "";
    public Map A0G = new ConcurrentHashMap();
    public boolean A0H;
    public boolean A0I = true;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public int A0S = Integer.MAX_VALUE;
    public long A0T;
    public long A0U = 200;
    public 1wn A0V;
    public 1wn A0W;
    public 1wn A0X;
    public C67408MnP A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final Handler A0b = new C14697U1x(Looper.getMainLooper(), this, 10);
    public final C21052XBu A0c = new C19349WVq(this, 3);
    public final X42 A0d = new C14465Twn(this);
    public final X47 A0e = new C72688PFs(this, 3);
    public final X4X A0f = new C14458Twg(this);
    public final X4Y A0g = new C14461Twj(this);
    public final X4Z A0h = new C14503TxP(this, 3);
    public final C20964X6r A0i = new C14496TxI(this, 0);
    public final C20909X4a A0j = new C14457Twf(this);
    public final C20910X4b A0k = new C14156Tqs(this, 3);
    public final C20985X8b A0l = new C14456Twe(this);
    public final C20912X4d A0m = new C14453Twb(this);
    public final C14466Two A0n = new C14466Two(this);
    public final C14455Twd A0o = new C14455Twd(this);
    public final G6V A0p = new C19707We9(this, 3);
    public final AnonymousClass0eM A0q = AnonymousClass0eN.A01(new C20608Wvp(this, 42));
    public final AnonymousClass0eM A0r = AnonymousClass0eN.A01(new C20608Wvp(this, 43));
    public final AnonymousClass0eM A0s = AnonymousClass0eN.A00(0eO.A02, new C20608Wvp(this, 44));
    public final AnonymousClass0eM A0t = C227642jf.A02(this);
    public final 1wn A0u = new C19221WQb(this, 37);
    public final C252243on A0v = new C50296FXb(this, 6);
    public final XAB A0w = C14479Tx1.A00;
    public final C74366Ptg A0x = new C14454Twc(this);
    public final C14467Twp A0y = new C14467Twp(this);
    public final C14468Twq A0z = new C14468Twq(this);
    public final C20913X4e A10 = new C14464Twm(this);
    public final C20914X4f A11 = new C14460Twi(this);
    public final C20915X4g A12 = new C14463Twl(this);
    public final C20916X4h A13 = new C14459Twh(this);
    public final C20917X4i A14 = new C14462Twk(this);
    public final AnonymousClass0eM A15 = AnonymousClass0eN.A01(new C20608Wvp(this, 45));

    public static final void A0A(C14138TqY tqY, String str) {
        A0C(tqY, false);
        if (0qQ.A0K(str, tqY.A01.A01)) {
            Handler handler = tqY.A0b;
            if (handler.hasMessages(1)) {
                handler.removeMessages(1);
                A0B(tqY, str);
            }
        }
    }

    public C14446TwU A0E() {
        C14469Twr twr = ((C14137TqX) this).A0b.A0a;
        if (twr != null) {
            AnonymousClass9PD r3 = twr.A00;
            C14445TwT twT = new C14445TwT();
            this.A0t.getValue();
            return new C14446TwU(new C14206Trl(), r3, twT);
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0J(String str, String str2) {
        boolean z;
        C14219Trz trz;
        String str3;
        String str4 = str;
        0qQ.A0B(str4, 0);
        C14137TqX tqX = (C14137TqX) this;
        C14137TqX tqX2 = tqX.A0b;
        ((C59830Ja5) tqX2.A0i.getValue()).A02.EHu(false);
        String str5 = str2;
        C15050ULg uLg = new C15050ULg(str4, str5, 8);
        boolean equals = str5.equals("fbsearch/keyword_typeahead/");
        if (equals) {
            AnonymousClass0eM r0 = 0mp.A09;
            if (str4.length() < 2 || (this.A0a && str4.charAt(0) == '#')) {
                z = true;
                if (uLg.equals(this.A01) && !z) {
                    Handler handler = this.A0b;
                    handler.removeMessages(1);
                    handler.removeMessages(2);
                    C14208Trn trn = this.A0E;
                    if (trn == null) {
                        str3 = "searchResultsProvider";
                    } else {
                        trn.A00 = null;
                        A0C(this, false);
                        this.A01 = uLg;
                        C14216Trv trv = this.A0D;
                        if (trv != null) {
                            String str6 = tqX.A09;
                            if (str6 != null) {
                                String A002 = C67419Mna.A00(tqX.A0d);
                                X4Z x4z = this.A0h;
                                C14216Trv.A01(trv, str4, "SEARCH_QUERY_CHANGE", str6, A002, 0, x4z.CYJ());
                                if (!this.A0Z && tqX2.A0F.length() == 0) {
                                    A0D().CkS();
                                    this.A0Z = true;
                                }
                                C14200Trf trf = this.A07;
                                String str7 = "dataSource";
                                if (trf != null) {
                                    trf.A04();
                                    TwE twE = this.A06;
                                    if (twE != null) {
                                        twE.A02();
                                    }
                                    if (x4z.CYJ()) {
                                        A09(this);
                                        C14139TqZ.A00((UserSession) this.A0t.getValue()).A00.flowEndCancel(C14478Tx0.A03.A00, "TYPEAHEAD_CANCEL");
                                        C14216Trv trv2 = this.A0D;
                                        if (trv2 != null) {
                                            C14200Trf trf2 = this.A07;
                                            if (trf2 != null) {
                                                int size = trf2.A01.A00.size();
                                                C14216Trv.A00(trv2, str4, (String) null, 0, size, true);
                                                C14441TwP twP = (C14441TwP) trv2.A00.get(str4);
                                                if (twP != null) {
                                                    twP.A03.put("cached_results_count", Integer.valueOf(size));
                                                }
                                                C14216Trv.A02(trv2, str4, "SEARCH_CACHED_RESULTS_DISPLAYED", 2);
                                            }
                                        }
                                    } else {
                                        C14221Ts1 ts1 = this.A0A;
                                        if (ts1 == null) {
                                            str3 = "queuedTypeaheadManager";
                                        } else if (!ts1.A05(uLg)) {
                                            A0B(this, str4);
                                            C14216Trv trv3 = this.A0D;
                                            if (trv3 != null) {
                                                C14200Trf trf3 = this.A07;
                                                if (trf3 != null) {
                                                    trv3.A04(str4, (String) null, 0, trf3.A01.A00.size(), true);
                                                    A09(this);
                                                }
                                            }
                                        } else {
                                            this.A0G.put(str5, new C61042Jvg(false, false, 15));
                                            A0F().A01.A03 = true;
                                            if (this.A0T <= 0 || str4.length() < this.A0S) {
                                                A0B(this, str4);
                                            } else {
                                                A0C(this, true);
                                                Message obtainMessage = handler.obtainMessage(1, str4);
                                                0qQ.A07(obtainMessage);
                                                handler.sendMessageDelayed(obtainMessage, this.A0T);
                                            }
                                            C337287g2 r02 = this.A0B;
                                            if (r02 == null) {
                                                str7 = "cache";
                                            } else {
                                                List list = r02.BiX(str4).A06;
                                                if (list == null || !AnonymousClass7TE.A1b(list)) {
                                                    if (str5.equals("fbsearch/ig_typeahead/")) {
                                                        trz = A0F().A01;
                                                        trz.A04 = true;
                                                    } else if (this.A0O && equals) {
                                                        trz = A0F().A01;
                                                        trz.A05 = true;
                                                    }
                                                    trz.A00();
                                                }
                                            }
                                        }
                                    }
                                    RecyclerView recyclerView = A0F().A00;
                                    if (recyclerView != null) {
                                        recyclerView.A0o(0);
                                    }
                                    A0G().A00();
                                    return;
                                }
                                0qQ.A0F(str7);
                                throw AnonymousClass00P.createAndThrow();
                            }
                            throw AnonymousClass7TE.A0y();
                        }
                        0qQ.A0F("searchQueryPerfLogger");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F(str3);
                    throw AnonymousClass00P.createAndThrow();
                } else if (this.A0O && equals) {
                    C14219Trz trz2 = A0F().A01;
                    trz2.A05 = false;
                    trz2.A00();
                    return;
                }
            }
        }
        z = false;
        if (uLg.equals(this.A01)) {
        }
        if (this.A0O) {
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        1Ng A002 = AnonymousClass1Nd.A00((UserSession) this.A0t.getValue());
        Class<WQG> cls = WQG.class;
        1wn r0 = this.A0W;
        if (r0 == null) {
            str = "clearSearchesEventListener";
        } else {
            A002.A01(r0, cls);
            Class<WQ3> cls2 = WQ3.class;
            1wn r02 = this.A0X;
            if (r02 == null) {
                str = "updatedSearchesEventListener";
            } else {
                A002.A01(r02, cls2);
                A002.A01(this.A0u, C2370536d.class);
                Class<AnonymousClass6WK> cls3 = AnonymousClass6WK.class;
                1wn r03 = this.A0V;
                if (r03 == null) {
                    str = "aiInitializedEventListener";
                } else {
                    A002.A01(r03, cls3);
                    C14200Trf trf = this.A07;
                    if (trf == null) {
                        str = "dataSource";
                    } else {
                        C14488TxA.A00(trf, this);
                        TwE twE = this.A06;
                        if (twE != null) {
                            twE.A02();
                        }
                        C14450TwY twY = ((C14137TqX) this).A0b.A0c;
                        if (twY != null) {
                            C14488TxA A0F2 = A0F();
                            C67408MnP A0G2 = A0G();
                            RecyclerView recyclerView = A0F2.A00;
                            if (recyclerView != null) {
                                A0G2.A01(recyclerView, this, twY);
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                        C13989Tnp.A1S(this, DbV.A0J(this), 7);
                        IgFragmentActivity requireActivity = requireActivity();
                        if (requireActivity instanceof IgFragmentActivity) {
                            requireActivity.registerOnActivityResultListener(this.A0v);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.C15050ULg r3, X.C14138TqY r4) {
        /*
            X.Trn r0 = r4.A0E
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "searchResultsProvider"
        L_0x0006:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            java.lang.String r2 = r3.A01
            r0.A00 = r2
            X.Trf r0 = r4.A07
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "dataSource"
            goto L_0x0006
        L_0x0019:
            r0.A04()
            A09(r4)
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "fbsearch/keyword_typeahead/"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            X.TxA r0 = r4.A0F()
            X.Trz r1 = r0.A01
            r0 = 0
            r1.A05 = r0
            r1.A00()
        L_0x0035:
            X.Trl r0 = r4.A08
            if (r0 == 0) goto L_0x0046
            boolean r0 = r0.A04(r2)
            if (r0 == 0) goto L_0x0058
            X.Ts1 r1 = r4.A0A
            if (r1 != 0) goto L_0x0049
            java.lang.String r0 = "queuedTypeaheadManager"
            goto L_0x0006
        L_0x0046:
            java.lang.String r0 = "informModuleController"
            goto L_0x0006
        L_0x0049:
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0058
            X.Ts2 r0 = r1.A05
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0058
            r0 = 0
            r4.A0I(r2, r0)
            goto L_0x0064
        L_0x0058:
            X.TxA r0 = r4.A0F()
            X.Trz r1 = r0.A01
            r0 = 0
            r1.A06 = r0
            r1.A00()
        L_0x0064:
            X.TxA r0 = r4.A0F()
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            r1 = 1
            if (r0 == 0) goto L_0x007a
            X.3pI r0 = r0.A0D
            if (r0 == 0) goto L_0x007a
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.A1a()
            if (r0 == 0) goto L_0x007a
            r1 = 0
        L_0x007a:
            X.TxA r0 = r4.A0F()
            r0.A01()
            if (r1 == 0) goto L_0x008f
            X.TxA r0 = r4.A0F()
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            if (r1 == 0) goto L_0x008f
            r0 = 0
            r1.A0o(r0)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14138TqY.A08(X.ULg, X.TqY):void");
    }

    public static final void A0B(C14138TqY tqY, String str) {
        String str2;
        C14216Trv trv = tqY.A0D;
        if (trv == null) {
            str2 = "searchQueryPerfLogger";
        } else {
            C14200Trf trf = tqY.A07;
            if (trf == null) {
                str2 = "dataSource";
            } else {
                int size = trf.A01.A00.size();
                0qQ.A0B(str, 0);
                ConcurrentMap concurrentMap = trv.A00;
                C14441TwP twP = (C14441TwP) concurrentMap.get(str);
                if (twP != null) {
                    twP.A01("SEARCH_CACHED_RESULTS_DISPLAYED", (String) null);
                }
                C14441TwP twP2 = (C14441TwP) concurrentMap.get(str);
                if (twP2 != null) {
                    twP2.A03.put("cached_results_count", Integer.valueOf(size));
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0C(C14138TqY tqY, boolean z) {
        String str;
        C14208Trn trn = tqY.A0E;
        if (trn == null) {
            str = "searchResultsProvider";
        } else {
            trn.A01 = z;
            C14200Trf trf = tqY.A07;
            if (trf == null) {
                str = "dataSource";
            } else {
                trf.A04();
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C358448av A0D() {
        C358448av r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("searchLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C14488TxA A0F() {
        return (C14488TxA) this.A15.getValue();
    }

    public final C67408MnP A0G() {
        C67408MnP mnP = this.A0Y;
        if (mnP != null) {
            return mnP;
        }
        0qQ.A0F("searchHomeViewpointHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, X.TqY] */
    public void A0H(UKV ukv) {
        int i;
        String str;
        if (!ukv.A05) {
            C14200Trf trf = this.A07;
            if (trf == null) {
                str = "dataSource";
            } else {
                if (ukv.A04) {
                    i = ukv.A01;
                } else {
                    i = trf.A02;
                }
                trf.A00 = i;
                trf.A03.Dhi(ukv);
                C14208Trn trn = this.A0E;
                if (trn == null) {
                    str = "searchResultsProvider";
                } else {
                    trn.Dhi(ukv);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        ((2Fk) this.A0s.getValue()).A05(this);
    }

    public final void A0I(CharSequence charSequence, boolean z) {
        int color;
        String A0h2;
        boolean z2 = this.A0H;
        Context requireContext = requireContext();
        if (z2) {
            color = DbU.A01(requireContext);
            A0h2 = AnonymousClass7TF.A0e(DbV.A05(this), charSequence, 2131972817);
        } else {
            color = requireContext.getColor(R.color.grey_5);
            A0h2 = DbW.A0h(requireContext(), charSequence, 2131972869);
        }
        C14488TxA A0F2 = A0F();
        0qQ.A0B(A0h2, 0);
        C14219Trz trz = A0F2.A01;
        trz.A0D.A00 = z;
        TwD twD = trz.A0C;
        twD.A01 = A0h2;
        twD.A00 = color;
        trz.A06 = true;
        trz.A00();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 15739) {
            VGG.A00((UserSession) this.A0t.getValue()).A00(requireActivity());
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        boolean z2 = C70542Rd.A03;
        return null;
    }

    public static final void A09(C14138TqY tqY) {
        C14219Trz trz = tqY.A0F().A01;
        trz.A04 = false;
        trz.A00();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.TqX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: X.0iw} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x017a, code lost:
        if (X.182.A06(r1, r9, 36317457476031645L) == false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0198, code lost:
        if (X.182.A06(r1, r9, 36317457476031645L) != false) goto L_0x019a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0438  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r46) {
        /*
            r45 = this;
            r0 = -1307322491(0xffffffffb213d785, float:-8.60553E-9)
            int r17 = X.AnonymousClass0fD.A02(r0)
            r0 = r45
            X.0eM r1 = r0.A0t
            r44 = r1
            java.lang.Object r1 = r44.getValue()
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r1)
            r0.A02 = r1
            r4 = r0
            X.TqX r4 = (X.C14137TqX) r4
            X.TqX r8 = r4.A0b
            java.lang.String r1 = r8.A09
            r4.A09 = r1
            X.TwU r5 = r0.A0E()
            X.7g2 r2 = r5.A01
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.search.common.typeahead.model.TypeaheadCache<ValueType of com.instagram.search.surface.fragment.BaseSearchChildFragment>"
            X.0qQ.A0C(r2, r1)
            r0.A0B = r2
            java.lang.Object r7 = r44.getValue()
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            r6 = 0
            X.0qQ.A0B(r7, r6)
            X.0Tu r1 = X.0Tu.A05
            r2 = 36602523045401229(0x8209cd0001128d, double:3.210921188217419E-306)
            long r2 = X.182.A01(r1, r7, r2)
            r0.A0U = r2
            java.lang.Integer r25 = X.AnonymousClass05K.A01
            java.lang.Object r10 = r44.getValue()
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            r16 = 0
            X.7g2 r9 = r0.A0B
            java.lang.String r15 = "cache"
            if (r9 == 0) goto L_0x00d4
            X.Twd r7 = r0.A0o
            long r2 = r0.A0U
            r31 = 1
            r26 = 0
            r20 = r10
            r21 = r16
            r22 = r7
            r23 = r16
            r24 = r9
            r28 = r2
            r30 = r6
            X.Ts1 r2 = X.C14225Ts5.A00(r20, r21, r22, r23, r24, r25, r26, r28, r30, r31)
            r0.A0A = r2
            X.Tx2 r2 = X.C14480Tx2.A00
            r0.A04 = r2
            java.lang.String r12 = r4.A09
            if (r12 == 0) goto L_0x0448
            X.0eM r2 = r8.A0g
            java.lang.Object r11 = r2.getValue()
            X.TwS r11 = (X.C14444TwS) r11
            X.0eM r14 = r4.A0t
            java.lang.Object r10 = r14.getValue()
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            java.lang.String r9 = r4.A0F
            java.lang.String r3 = r4.A07
            r7 = 3
            X.0qQ.A0B(r10, r7)
            X.TwR r2 = new X.TwR
            r19 = r4
            r20 = r10
            r21 = r11
            r22 = r12
            r24 = r9
            r25 = r3
            r18 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r0.A05 = r2
            java.lang.Object r10 = r44.getValue()
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            X.0iw r9 = X.C14481Tx3.A01
            android.content.Context r2 = r0.requireContext()
            boolean r3 = X.0oI.A0A(r2)
            X.GXx r2 = new X.GXx
            r2.<init>(r9, r10, r3)
            r0.A03 = r2
            X.8av r24 = r0.A0D()
            X.GXx r12 = r0.A03
            if (r12 == 0) goto L_0x043e
            X.X4b r2 = r0.A0k
            r33 = r2
            X.X6r r2 = r0.A0i
            r32 = r2
            X.Tx2 r11 = r0.A04
            if (r11 != 0) goto L_0x00dc
            java.lang.String r15 = "loggingFilter"
        L_0x00d4:
            X.0qQ.A0F(r15)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00dc:
            java.lang.Object r10 = r44.getValue()
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            java.lang.String r13 = r4.A09
            r2 = 2
            X.TxH r9 = new X.TxH
            r9.<init>(r0, r2)
            X.2el r21 = X.C51969G9p.A0k()
            X.Ptg r3 = r0.A0x
            X.MnP r2 = new X.MnP
            r19 = r0
            r20 = r10
            r22 = r12
            r23 = r11
            r25 = r16
            r26 = r32
            r27 = r33
            r28 = r9
            r29 = r3
            r30 = r13
            r18 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0.A0Y = r2
            boolean r2 = X.C13989Tnp.A1X(r0)
            r0.A0K = r2
            boolean r2 = X.C13989Tnp.A1X(r0)
            r0.A0O = r2
            com.instagram.common.session.UserSession r9 = X.C13988Tno.A0L(r0)
            r2 = 36328044571540374(0x81102a00123b96, double:3.037339896111713E-306)
            boolean r2 = X.182.A06(r1, r9, r2)
            r0.A0L = r2
            com.instagram.common.session.UserSession r9 = X.C13988Tno.A0L(r0)
            r2 = 36324419617960017(0x810cde00003051, double:3.035047460870979E-306)
            boolean r2 = X.182.A06(r1, r9, r2)
            r0.A0a = r2
            com.instagram.common.session.UserSession r9 = X.C13988Tno.A0L(r0)
            r2 = 36328392462712131(0x81107b00003d43, double:3.0375599038895775E-306)
            boolean r2 = X.182.A06(r1, r9, r2)
            r0.A0Q = r2
            boolean r2 = X.C13989Tnp.A1X(r0)
            r0.A0P = r2
            com.instagram.common.session.UserSession r9 = X.C13988Tno.A0L(r0)
            r2 = 36323388825807991(0x810bee00002c77, double:3.034395583763371E-306)
            boolean r2 = X.182.A06(r1, r9, r2)
            r0.A0R = r2
            boolean r2 = X.C13989Tnp.A1X(r0)
            r0.A00 = r2
            com.instagram.common.session.UserSession r9 = X.C13988Tno.A0L(r0)
            r2 = 36317457475966108(0x8106890000149c, double:3.030644574239735E-306)
            boolean r2 = X.182.A06(r1, r9, r2)
            if (r2 == 0) goto L_0x017c
            r2 = 36317457476031645(0x8106890001149d, double:3.030644574281181E-306)
            boolean r3 = X.182.A06(r1, r9, r2)
            r2 = 1
            if (r3 != 0) goto L_0x017d
        L_0x017c:
            r2 = 0
        L_0x017d:
            r0.A0M = r2
            com.instagram.common.session.UserSession r9 = X.C13988Tno.A0L(r0)
            r2 = 36317457475966108(0x8106890000149c, double:3.030644574239735E-306)
            boolean r2 = X.182.A06(r1, r9, r2)
            if (r2 == 0) goto L_0x019a
            r2 = 36317457476031645(0x8106890001149d, double:3.030644574281181E-306)
            boolean r3 = X.182.A06(r1, r9, r2)
            r2 = 1
            if (r3 == 0) goto L_0x019b
        L_0x019a:
            r2 = 0
        L_0x019b:
            r0.A0N = r2
            X.Trl r2 = r5.A00
            X.0qQ.A0B(r2, r6)
            r0.A08 = r2
            X.TwT r2 = r5.A02
            X.0qQ.A0B(r2, r6)
            r0.A0C = r2
            java.lang.Object r9 = r14.getValue()
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            android.content.Context r19 = r4.requireContext()
            com.instagram.common.session.UserSession r3 = X.C13988Tno.A0L(r4)
            android.content.Context r2 = r4.requireContext()
            X.TwV r5 = new X.TwV
            r5.<init>(r3, r2)
            X.Trl r3 = r4.A08
            if (r3 == 0) goto L_0x0428
            X.TwT r2 = r4.A0C
            if (r2 == 0) goto L_0x0424
            X.Trn r12 = new X.Trn
            r22 = r2
            r23 = r5
            r18 = r12
            r20 = r9
            r21 = r3
            r18.<init>(r19, r20, r21, r22, r23)
            r0.A0E = r12
            X.7g2 r13 = r0.A0B
            if (r13 == 0) goto L_0x00d4
            X.X4Z r15 = r0.A0h
            X.XAB r11 = r0.A0w
            java.lang.Object r2 = r44.getValue()
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.TwM r3 = X.C14439TwN.A00(r2)
            X.0eM r2 = r3.A02
            boolean r2 = X.G9t.A1b(r2)
            if (r2 != 0) goto L_0x0420
            com.instagram.common.session.UserSession r14 = r3.A00
            X.0qQ.A0B(r14, r6)
            boolean r2 = X.2R8.A00(r14)
            if (r2 != 0) goto L_0x0208
            X.0eM r2 = r3.A01
            boolean r2 = X.G9t.A1b(r2)
            if (r2 != 0) goto L_0x0420
        L_0x0208:
            X.Tws r10 = X.C14471Twt.A05
            X.Twt r9 = r10.A00(r14)
            X.0eM r2 = r9.A04
            boolean r2 = X.G9t.A1b(r2)
            if (r2 == 0) goto L_0x0410
            r5 = 43
            X.Fy6 r3 = new X.Fy6
            r2 = r16
            r3.<init>((java.lang.Object) r9, (X.AnonymousClass4D7) r2, (int) r5)
            X.19B r2 = X.19B.A00
            java.lang.Object r2 = X.C67351tA.A00(r2, r3)
            boolean r2 = X.AnonymousClass7TE.A1a(r2)
        L_0x0229:
            if (r2 == 0) goto L_0x0420
            X.Twt r9 = r10.A00(r14)
            X.0eM r2 = r9.A04
            boolean r2 = X.G9t.A1b(r2)
            if (r2 == 0) goto L_0x03fc
            r5 = 40
            X.Fy6 r3 = new X.Fy6
            r2 = r16
            r3.<init>((java.lang.Object) r9, (X.AnonymousClass4D7) r2, (int) r5)
            X.19B r2 = X.19B.A00
            java.lang.Object r2 = X.C67351tA.A00(r2, r3)
            int r30 = X.AnonymousClass7TE.A0M(r2)
        L_0x024a:
            X.Trf r2 = new X.Trf
            r24 = r2
            r25 = r11
            r26 = r15
            r28 = r12
            r29 = r13
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r0.A07 = r2
            java.lang.Object r2 = r44.getValue()
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.TwM r3 = X.C14439TwN.A00(r2)
            X.0eM r2 = r3.A02
            boolean r2 = X.G9t.A1b(r2)
            if (r2 == 0) goto L_0x0293
            com.instagram.common.session.UserSession r2 = X.C13988Tno.A0L(r0)
            boolean r2 = X.2R8.A00(r2)
            if (r2 != 0) goto L_0x027f
            X.0eM r2 = r3.A01
            boolean r2 = X.G9t.A1b(r2)
            if (r2 != 0) goto L_0x0293
        L_0x027f:
            X.0eM r2 = r0.A0s
            java.lang.Object r5 = r2.getValue()
            X.2Fk r5 = (X.2Fk) r5
            r2 = 15
            X.WvZ r3 = new X.WvZ
            r3.<init>(r0, r2)
            r2 = 39
            X.DbV.A1F(r0, r5, r3, r2)
        L_0x0293:
            java.lang.Object r9 = r44.getValue()
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.String r13 = r4.A09
            java.lang.String r3 = "Required value was null."
            if (r13 == 0) goto L_0x0438
            java.lang.String r2 = r8.A07
            r35 = r2
            X.0eM r2 = r8.A0h
            java.lang.Object r5 = r2.getValue()
            X.TwL r5 = (X.C14437TwL) r5
            if (r5 == 0) goto L_0x0432
            X.0eM r2 = r8.A0f
            java.lang.Object r4 = r2.getValue()
            X.TwK r4 = (X.C14436TwK) r4
            if (r4 == 0) goto L_0x042c
            X.0eM r2 = r8.A0i
            java.lang.Object r7 = r2.getValue()
            X.Ja5 r7 = (X.C59830Ja5) r7
            X.X42 r2 = r0.A0d
            r43 = r2
            java.lang.Object r3 = r44.getValue()
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.328 r2 = new X.328
            r2.<init>(r0)
            X.32A r12 = new X.32A
            r12.<init>(r0, r3, r2)
            X.8av r24 = r0.A0D()
            java.lang.Object r2 = r44.getValue()
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.5js r11 = new X.5js
            r11.<init>(r0, r2)
            X.TxH r10 = new X.TxH
            r10.<init>(r0, r6)
            X.X4X r2 = r0.A0f
            r22 = r2
            X.X4a r2 = r0.A0j
            r21 = r2
            boolean r2 = r0.A0M
            r20 = r2
            boolean r2 = r0.A0N
            r19 = r2
            X.X8b r2 = r0.A0l
            r18 = r2
            java.lang.Object r14 = r44.getValue()
            com.instagram.common.session.UserSession r14 = (com.instagram.common.session.UserSession) r14
            X.0Tu r6 = X.AnonymousClass7TF.A0H(r14)
            r2 = 36328340924742921(0x81106f00193d09, double:3.037527311070322E-306)
            boolean r40 = X.182.A06(r6, r14, r2)
            com.instagram.common.session.UserSession r6 = X.C13988Tno.A0L(r0)
            r2 = 36328340924022014(0x81106f000e3cfe, double:3.037527310614418E-306)
            boolean r41 = X.182.A06(r1, r6, r2)
            com.instagram.common.session.UserSession r6 = X.C13988Tno.A0L(r0)
            r2 = 36328340924153088(0x81106f00103d00, double:3.0375273106973095E-306)
            boolean r42 = X.182.A06(r1, r6, r2)
            X.Tx6 r36 = X.C14484Tx6.A00
            X.Tx5 r37 = X.C14483Tx5.A00
            X.Tqa r2 = new X.Tqa
            r23 = r16
            r25 = r22
            r26 = r32
            r27 = r21
            r28 = r33
            r29 = r10
            r30 = r18
            r31 = r5
            r32 = r7
            r33 = r4
            r34 = r13
            r38 = r20
            r39 = r19
            r18 = r2
            r19 = r9
            r20 = r43
            r21 = r11
            r22 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.2tC r5 = X.DbV.A0S(r0)
            X.MnP r4 = r0.A0G()
            X.MnX r3 = new X.MnX
            r3.<init>(r2, r4)
            r5.A01(r3)
            androidx.fragment.app.FragmentActivity r10 = r0.getActivity()
            java.lang.Object r4 = r44.getValue()
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.MnZ r3 = new X.MnZ
            r3.<init>(r0, r2)
            X.MnP r14 = r0.A0G()
            X.MnY r9 = new X.MnY
            r11 = r0
            r12 = r4
            r13 = r3
            r9.<init>(r10, r11, r12, r13, r14)
            r5.A01(r9)
            android.content.Context r4 = r0.requireContext()
            java.lang.Object r3 = r44.getValue()
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.TwE r2 = new X.TwE
            r2.<init>(r4, r5, r3, r15)
            r0.A06 = r2
            java.lang.Object r3 = r44.getValue()
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.Trv r2 = new X.Trv
            r2.<init>(r3)
            r0.A0D = r2
            r3 = 38
            X.WQb r2 = new X.WQb
            r2.<init>(r0, r3)
            r0.A0W = r2
            r3 = 39
            X.WQb r2 = new X.WQb
            r2.<init>(r0, r3)
            r0.A0X = r2
            r3 = 40
            X.WQb r2 = new X.WQb
            r2.<init>(r0, r3)
            r0.A0V = r2
            r44.getValue()
            r2 = 100
            r0.A0T = r2
            com.instagram.common.session.UserSession r4 = X.C13988Tno.A0L(r0)
            r2 = 36592094864933142(0x82005100030116, double:3.204326364898489E-306)
            long r2 = X.182.A01(r1, r4, r2)
            int r1 = (int) r2
            r0.A0S = r1
            java.lang.String r1 = r8.A0F
            int r1 = r1.length()
            if (r1 != 0) goto L_0x03e2
            X.8av r1 = r0.A0D()
            r1.CkQ()
        L_0x03e2:
            java.lang.Object r1 = r44.getValue()
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.JZv r1 = X.C14421Tvq.A00(r1)
            r0.A09 = r1
            r1 = r46
            X.C14138TqY.super.onCreate(r1)
            r1 = -16082481(0xffffffffff0a99cf, float:-1.8423208E38)
            r0 = r17
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x03fc:
            X.0eM r2 = r9.A01
            java.lang.Object r3 = r2.getValue()
            X.0xa r3 = (X.0xa) r3
            r2 = 1250(0x4e2, float:1.752E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            int r30 = r3.getInt(r2, r7)
            goto L_0x024a
        L_0x0410:
            X.0eM r2 = r9.A01
            java.lang.Object r3 = r2.getValue()
            X.0xa r3 = (X.0xa) r3
            java.lang.String r2 = "csm_override_enabled"
            boolean r2 = r3.getBoolean(r2, r6)
            goto L_0x0229
        L_0x0420:
            r30 = 0
            goto L_0x024a
        L_0x0424:
            java.lang.String r15 = "seeMoreController"
            goto L_0x00d4
        L_0x0428:
            java.lang.String r15 = "informModuleController"
            goto L_0x00d4
        L_0x042c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0432:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0438:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x043e:
            java.lang.String r0 = "threadsLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0448:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14138TqY.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(472468107);
        0qQ.A0B(layoutInflater, 0);
        A0F();
        View inflate = layoutInflater.inflate(R.layout.layout_search_rv, viewGroup, false);
        C14488TxA A0F2 = A0F();
        0qQ.A0A(inflate);
        0qQ.A0B(inflate, 0);
        RecyclerView A0K2 = DbX.A0K(inflate);
        A0F2.A00 = A0K2;
        if (A0K2 != null) {
            DbV.A1B(inflate.getContext(), A0K2);
            A0K2.setAdapter(A0F2.A01.A0A);
            A0K2.A0S = true;
            A0K2.setItemAnimator((AnonymousClass3AS) null);
        }
        C228172ku r8 = new C228172ku();
        r8.A03(new C14431TwF(this.A0l));
        C67408MnP A0G2 = A0G();
        C14137TqX tqX = ((C14137TqX) this).A0b;
        long j = tqX.A01;
        tqX.A01 = 0;
        A0G2.A00.sendEmptyMessageDelayed(0, j);
        RecyclerView recyclerView = A0F().A00;
        if (recyclerView != null) {
            recyclerView.A15(r8);
            TwE twE = this.A06;
            if (twE != null) {
                twE.D6y(layoutInflater, viewGroup);
            }
            AnonymousClass0fD.A09(-1649830619, A022);
            return inflate;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onDestroy() {
        String str;
        int A022 = AnonymousClass0fD.A02(-313565539);
        super.onDestroy();
        C14221Ts1 ts1 = this.A0A;
        if (ts1 == null) {
            str = "queuedTypeaheadManager";
        } else {
            ts1.onDestroy();
            C14216Trv trv = this.A0D;
            if (trv == null) {
                str = "searchQueryPerfLogger";
            } else {
                ConcurrentMap concurrentMap = trv.A00;
                Iterator A16 = DbV.A16(concurrentMap);
                while (A16.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(A16);
                    0qQ.A0A(A18);
                    C14216Trv.A00(trv, A18, (String) null, 0, 0, false);
                    C14216Trv.A02(trv, A18, "SEARCH_EXIT_NAVIGATION", 4);
                }
                concurrentMap.clear();
                C319996rZ.A00((UserSession) this.A0t.getValue()).A00 = null;
                AnonymousClass0fD.A09(-1010341276, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(1129241245);
        IgFragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof IgFragmentActivity) {
            requireActivity.unregisterOnActivityResultListener(this.A0v);
        }
        1Ng A002 = AnonymousClass1Nd.A00((UserSession) this.A0t.getValue());
        Class<WQG> cls = WQG.class;
        1wn r0 = this.A0W;
        if (r0 == null) {
            str = "clearSearchesEventListener";
        } else {
            A002.A02(r0, cls);
            Class<WQ3> cls2 = WQ3.class;
            1wn r02 = this.A0X;
            if (r02 == null) {
                str = "updatedSearchesEventListener";
            } else {
                A002.A02(r02, cls2);
                A002.A02(this.A0u, C2370536d.class);
                Class<AnonymousClass6WK> cls3 = AnonymousClass6WK.class;
                1wn r03 = this.A0V;
                if (r03 == null) {
                    str = "aiInitializedEventListener";
                } else {
                    A002.A02(r03, cls3);
                    super.onDestroyView();
                    C13988Tno.A1K((C59830Ja5) ((C14137TqX) this).A0b.A0i.getValue());
                    C14488TxA A0F2 = A0F();
                    RecyclerView recyclerView = A0F2.A00;
                    if (recyclerView != null) {
                        recyclerView.setAdapter((2Rw) null);
                        A0F2.A00 = null;
                    }
                    AnonymousClass0fD.A09(1765831712, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void onPause() {
        int A022 = AnonymousClass0fD.A02(943573884);
        C14138TqY.super.onPause();
        C13988Tno.A1K((C59830Ja5) ((C14137TqX) this).A0b.A0i.getValue());
        A0G().A00();
        TwE twE = this.A06;
        if (twE != null) {
            twE.onPause();
        }
        AnonymousClass0fD.A09(-678411995, A022);
    }

    public void onResume() {
        int A022 = AnonymousClass0fD.A02(-1613127668);
        super.onResume();
        FragmentActivity requireActivity = requireActivity();
        1OP r0 = 1OP.$redex_init_class;
        AnonymousClass3K2 A042 = AnonymousClass3K2.A04(requireActivity);
        if (A042 != null && A042.A0Z()) {
            A042.A0X(this);
        }
        C320006ra A002 = C319996rZ.A00((UserSession) this.A0t.getValue());
        FragmentActivity activity = getActivity();
        if (activity != null) {
            A002.A00(activity);
            if (182.A06(0Tu.A05, C13988Tno.A0L(this), 36321121083073658L)) {
                A0F().A01();
            }
            AnonymousClass0fD.A09(73897743, A022);
            return;
        }
        IllegalStateException A0y2 = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-1170774014, A022);
        throw A0y2;
    }

    public void onStart() {
        int A022 = AnonymousClass0fD.A02(-1343951991);
        C14138TqY.super.onStart();
        C14436TwK twK = (C14436TwK) ((C14137TqX) this).A0b.A0f.getValue();
        if (twK != null) {
            C20917X4i x4i = this.A14;
            0qQ.A0B(x4i, 0);
            twK.A08.add(x4i);
            C20914X4f x4f = this.A11;
            0qQ.A0B(x4f, 0);
            twK.A04.add(x4f);
            C20916X4h x4h = this.A13;
            0qQ.A0B(x4h, 0);
            twK.A07.add(x4h);
            C20915X4g x4g = this.A12;
            0qQ.A0B(x4g, 0);
            twK.A05.add(x4g);
            C20913X4e x4e = this.A10;
            0qQ.A0B(x4e, 0);
            twK.A03.add(x4e);
        }
        AnonymousClass0eM r2 = this.A0t;
        C14205Trk.A00((UserSession) r2.getValue()).A00 = this.A0z;
        C14434TwI.A00((UserSession) r2.getValue()).A03 = this.A0y;
        AnonymousClass0fD.A09(-1194302263, A022);
    }

    public void onStop() {
        int A022 = AnonymousClass0fD.A02(936656203);
        C14138TqY.super.onStop();
        C14436TwK twK = (C14436TwK) ((C14137TqX) this).A0b.A0f.getValue();
        if (twK != null) {
            C20917X4i x4i = this.A14;
            0qQ.A0B(x4i, 0);
            twK.A08.remove(x4i);
            C20914X4f x4f = this.A11;
            0qQ.A0B(x4f, 0);
            twK.A04.remove(x4f);
            C20916X4h x4h = this.A13;
            0qQ.A0B(x4h, 0);
            twK.A07.remove(x4h);
            C20915X4g x4g = this.A12;
            0qQ.A0B(x4g, 0);
            twK.A05.remove(x4g);
            C20913X4e x4e = this.A10;
            0qQ.A0B(x4e, 0);
            twK.A03.remove(x4e);
        }
        AnonymousClass0eM r2 = this.A0t;
        C14205Trk.A00((UserSession) r2.getValue()).A00 = null;
        C14434TwI.A00((UserSession) r2.getValue()).A03 = null;
        AnonymousClass0fD.A09(-361260084, A022);
    }
}
