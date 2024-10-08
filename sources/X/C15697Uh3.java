package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag$CANVAS;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Uh3  reason: case insensitive filesystem */
public final class C15697Uh3 extends C252233om implements AnonymousClass4DU, X7j, View.OnKeyListener {
    public static final C71392co A0a = C71392co.A04(40.0d, 10.0d);
    public static final String __redex_internal_original_name = "CanvasController";
    public View A00;
    public RecyclerView A01;
    public UB3 A02;
    public C15689Ugu A03;
    public WWU A04;
    public C14815UAp A05;
    public C15692Ugx A06;
    public TouchInterceptorFrameLayout A07;
    public 1Nv A08;
    public Integer A09;
    public boolean A0A;
    public boolean A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Context A0F;
    public final C227622jd A0G = new C227622jd();
    public final C19015WGq A0H;
    public final C15295Ua1 A0I;
    public final C15295Ua1 A0J;
    public final C310126aT A0K;
    public final VXo A0L;
    public final UAS A0M;
    public final C17202VMg A0N;
    public final UserSession A0O;
    public final C270594gz A0P;
    public final 1Xj A0Q;
    public final C295005nO A0R;
    public final List A0S;
    public final AnonymousClass0eM A0T;
    public final boolean A0U;
    public final C15696Uh2 A0V;
    public final C315616kD A0W;
    public final C315626kE A0X;
    public final String A0Y;
    public final boolean A0Z;

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        this.A07 = view.requireViewById(R.id.layout_container_main);
        this.A00 = view.requireViewById(R.id.canvas_container);
        C19015WGq wGq = this.A0H;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A07;
        if (touchInterceptorFrameLayout == null) {
            0qQ.A0F("rootView");
            throw AnonymousClass00P.createAndThrow();
        }
        touchInterceptorFrameLayout.A00(new WC3(wGq, 4), new WC3(wGq, 5));
        if (this.A0A) {
            this.A0G.A0C(AnonymousClass7TE.A0c(this.A0T));
        }
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public static final void A00(C15697Uh3 uh3) {
        String str;
        if (uh3.A0A && uh3.A0B && uh3.A09 == AnonymousClass05K.A00) {
            C15692Ugx ugx = uh3.A06;
            if (ugx == null) {
                str = "videoModule";
            } else {
                ugx.A03.sendEmptyMessage(0);
                RecyclerView recyclerView = uh3.A01;
                if (recyclerView != null) {
                    C14815UAp uAp = uh3.A05;
                    if (uAp == null) {
                        str = "viewableHelper";
                    } else {
                        uAp.onScrolled(recyclerView, 0, 0);
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A01(C15697Uh3 uh3, float f, float f2) {
        uh3.A09 = AnonymousClass05K.A0C;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = uh3.A07;
        if (touchInterceptorFrameLayout == null) {
            0qQ.A0F("rootView");
            throw AnonymousClass00P.createAndThrow();
        }
        C294975nL A0E2 = C294975nL.A00(touchInterceptorFrameLayout).A0A().A0E(A0a);
        A0E2.A05 = uh3.A0R;
        A0E2.A06 = uh3.A0W;
        A0E2.A07 = uh3.A0X;
        float f3 = (float) uh3.A0E;
        A0E2.A0T(0.0f, f3);
        A0E2.A00 = f / f3;
        A0E2.A0B(f2 / f3).A0H();
    }

    public static final void A02(C15697Uh3 uh3, float f, float f2) {
        uh3.A09 = AnonymousClass05K.A01;
        View view = uh3.A00;
        if (view == null) {
            0qQ.A0F("canvasContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        C294975nL A0E2 = C294975nL.A00(view).A0A().A0E(A0a);
        A0E2.A05 = uh3.A0R;
        A0E2.A06 = uh3.A0W;
        A0E2.A07 = uh3.A0X;
        float f3 = (float) uh3.A0E;
        A0E2.A0T(f3, 0.0f);
        A0E2.A00 = (f3 - f) / f3;
        A0E2.A0B(f2 / f3).A0H();
    }

    public final void A03() {
        WWU wwu;
        double d;
        String str;
        if (this.A0A) {
            View view = this.A00;
            if (view == null) {
                str = "canvasContainer";
            } else {
                view.setVisibility(8);
                AnonymousClass0eM r2 = this.A0T;
                if (AnonymousClass7TE.A0c(r2).getParent() != null) {
                    C3019160o.A01(AnonymousClass7TE.A0c(r2)).removeView(AnonymousClass7TE.A0c(r2));
                }
                C15692Ugx ugx = this.A06;
                if (ugx != null) {
                    ugx.onPause();
                    this.A0A = false;
                    Iterator A0v = AnonymousClass7TF.A0v(this.A0K.A03);
                    while (A0v.hasNext()) {
                        C226952iF r3 = (C226952iF) A0v.next();
                        DLog.d(DLogTag$CANVAS.INSTANCE, 002.A0R("Cancel ", C63100KrT.A00(r3.BZG())), new Object[0]);
                        r3.AGE();
                    }
                    long j = 0;
                    if (this.A0U) {
                        C15696Uh2 uh2 = this.A0V;
                        if (uh2 != null) {
                            uh2.onPause();
                            j = uh2.A01;
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                    if (this.A08 != null && (wwu = this.A04) != null) {
                        C15689Ugu ugu = this.A03;
                        if (ugu == null) {
                            str = "analyticsHelper";
                        } else {
                            1Xj r32 = this.A0Q;
                            C15692Ugx ugx2 = this.A06;
                            if (ugx2 != null) {
                                boolean z = ugx2.A06.A04;
                                C15689Ugu.A00(ugu);
                                String str2 = wwu.A00;
                                Map map = ugu.A07;
                                AnonymousClass4DU r10 = ugu.A04;
                                long j2 = ugu.A01;
                                int i = ugu.A00;
                                Map map2 = ugu.A06;
                                boolean z2 = ugu.A08;
                                UserSession userSession = ugu.A03;
                                C51972G9s.A1D(map, r10);
                                C51969G9p.A1N(map2, 7, userSession);
                                if (r32 != null) {
                                    AnonymousClass0kM r0 = new AnonymousClass0kM(userSession);
                                    r0.A00 = r10;
                                    0Aj A0e = AnonymousClass7TE.A0e(r0.A00(), "instagram_ad_canvas_exit");
                                    if (A0e.isSampled()) {
                                        A0e.A9F("a_pk", Long.valueOf(C294185m0.A00(userSession, r32)));
                                        A0e.A7p("audio_enabled", Boolean.valueOf(z));
                                        A0e.AAJ("document_id", str2);
                                        A0e.AAJ("follow_status", C294185m0.A06(userSession, r32));
                                        C51974G9v.A0p(A0e, r32, "m_pk", C294185m0.A09(r32));
                                        A0e.AAJ("source_of_action", r10.getModuleName());
                                        A0e.A8D("timespent", Double.valueOf((double) j2));
                                        if (z2) {
                                            d = 1.0d;
                                        } else {
                                            d = 0.0d;
                                        }
                                        Collection<Object> values = map.values();
                                        0qQ.A0B(values, 0);
                                        float f = 0.0f;
                                        for (Object A042 : values) {
                                            f += AnonymousClass7TE.A04(A042);
                                        }
                                        A0e.A8D(AnonymousClass000.A00(1211), Double.valueOf((d + ((double) f)) / ((double) i)));
                                        C51965G9l.A1L(A0e, C294185m0.A07(userSession, r32, r10));
                                        ArrayList A0f = JTQ.A0f(map2);
                                        Iterator A0u = AnonymousClass7TF.A0u(map2);
                                        while (A0u.hasNext()) {
                                            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                                            AnonymousClass7TF.A1I(A1J.getKey(), Double.valueOf((double) C66582MXn.A08(A1J)), A0f);
                                        }
                                        A0e.A9H(AnonymousClass000.A00(1296), 0Yt.A08(A0f));
                                        C51965G9l.A1D(A0e, C294185m0.A01(userSession, r32));
                                        A0e.A8D(AnonymousClass000.A00(1233), Double.valueOf((double) j));
                                        A0e.A9F("m_ts", Long.valueOf(r32.A1A()));
                                        A0e.A9F(C273654mx.A00(3433), C294185m0.A02(userSession, r32));
                                        DbS.A1J(A0e, C294185m0.A08(r32));
                                        A0e.AAJ(AnonymousClass000.A00(665), r32.A0C.BIl());
                                        A0e.A7p("is_eof", r32.A0C.CSj());
                                        A0e.A8D(C273654mx.A00(678), Double.valueOf(-1.0d));
                                        A0e.A7p(C273654mx.A00(2898), false);
                                        A0e.AAJ(AnonymousClass000.A00(150), r32.A0R);
                                        C51973G9u.A14(A0e, "delivery_flags", C243413Yr.A00(r32.A0e));
                                        A0e.Cgf();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                0qQ.A0F("videoModule");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DAR(C19015WGq wGq, float f) {
        View view = this.A00;
        if (view != null) {
            view.setTranslationY(f);
            C315616kD r2 = this.A0W;
            View view2 = this.A00;
            if (view2 != null) {
                r2.DaF(C294975nL.A00(view2), f / ((float) this.A0E));
                return;
            }
        }
        0qQ.A0F("canvasContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DAY(C19015WGq wGq, float f, float f2) {
        C15295Ua1 ua1;
        float A012 = C13988Tno.A01(this.A0E);
        if ((f2 <= 0.0f && A012 >= f) || (ua1 = this.A0J) == null) {
            A02(this, f, f2);
        } else if (this.A0I.A08) {
            ua1.A02();
        } else {
            A01(this, f, f2);
        }
    }

    public final boolean DAf(C19015WGq wGq, float f, int i) {
        View view;
        if (this.A0A) {
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0D;
                if (i == 2 && linearLayoutManager != null && linearLayoutManager.A1a() == 0) {
                    RecyclerView recyclerView2 = this.A01;
                    if (recyclerView2 != null) {
                        int top = recyclerView2.getChildAt(0).getTop();
                        RecyclerView recyclerView3 = this.A01;
                        if (recyclerView3 != null) {
                            if (top - recyclerView3.getPaddingTop() == 0 && (view = this.A00) != null) {
                                C71392co r0 = C315596kB.A02;
                                if (!C294975nL.A01(view, 0).A0W()) {
                                    this.A09 = AnonymousClass05K.A0C;
                                    View view2 = this.A00;
                                    if (view2 == null) {
                                        0qQ.A0F("canvasContainer");
                                        throw AnonymousClass00P.createAndThrow();
                                    }
                                    C294975nL.A01(view2, 0).A0T(0.0f, (float) this.A0E);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F("recyclerView");
            throw AnonymousClass00P.createAndThrow();
        }
        return false;
    }

    public final String getModuleName() {
        return this.A0Y;
    }

    public final boolean isSponsoredEligible() {
        return this.A0Z;
    }

    public final void onCreate() {
        if (this.A0A) {
            this.A0G.A01();
        }
    }

    public final void onDestroy() {
        if (this.A0A) {
            this.A0G.A02();
        }
    }

    public final void onDestroyView() {
        if (this.A0A) {
            this.A0H.A03 = true;
            this.A0G.A03();
        }
    }

    public final void onPause() {
        if (this.A0A) {
            if (this.A09 != AnonymousClass05K.A00) {
                View view = this.A00;
                if (view == null) {
                    0qQ.A0F("canvasContainer");
                    throw AnonymousClass00P.createAndThrow();
                }
                C294975nL.A00(view).A0G();
            }
            this.A0G.A04();
        }
    }

    public final void onResume() {
        if (this.A0A) {
            this.A0G.A05();
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.VMg, java.lang.Object] */
    public C15697Uh3(C15295Ua1 ua1, C15295Ua1 ua12, C310126aT r7, C15696Uh2 uh2, C270594gz r9, 1Xj r10, String str, List list, int i, int i2, boolean z, boolean z2) {
        String str2;
        this.A0I = ua1;
        this.A0Z = z;
        this.A0J = ua12;
        this.A0P = r9;
        this.A0S = list;
        this.A0U = z2;
        this.A0V = uh2;
        this.A0C = i;
        this.A0Q = r10;
        this.A0D = i2;
        Context requireContext = ua1.requireContext();
        this.A0F = requireContext;
        UAS uas = new UAS(requireContext, this, new C17332VRl(), this);
        this.A0M = uas;
        this.A0K = r7;
        this.A0R = new C19671WdZ(this, 4);
        this.A0W = new C19673Wdb(this, 1);
        this.A0X = new C19674Wdc(this, 0);
        if (str == null || str.length() == 0) {
            str2 = "canvas";
        } else {
            str2 = 002.A0R("canvas_", str);
        }
        this.A0Y = str2;
        this.A0E = 0nA.A08(requireContext);
        ? obj = new Object();
        this.A0N = obj;
        this.A0L = new VXo(requireContext, this, uas, obj);
        this.A09 = AnonymousClass05K.A00;
        this.A0H = new C19015WGq(requireContext);
        this.A0O = 09i.A0A.A06(ua1.requireArguments());
        this.A0T = C51970G9q.A0o(this, 6);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        DbY.A1S(view, keyEvent);
        if (this.A0A) {
            C15692Ugx ugx = this.A06;
            if (ugx == null) {
                0qQ.A0F("videoModule");
                throw AnonymousClass00P.createAndThrow();
            } else if (!ugx.onKey(view, i, keyEvent)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
