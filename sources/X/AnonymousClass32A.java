package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.32A  reason: invalid class name */
public final class AnonymousClass32A {
    public int A00 = -1;
    public C267664bz A01;
    public AnonymousClass0iw A02;
    public ReelViewerConfig A03 = new ReelViewerConfig(new AnonymousClass32D());
    public C317766nn A04;
    public AnonymousClass6UX A05;
    public C20960X6n A06;
    public AnonymousClass6VJ A07;
    public SearchContext A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E = true;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final AnonymousClass0iw A0J;
    public final UserSession A0K;
    public final AnonymousClass329 A0L;
    public final AbsListView.OnScrollListener A0M;
    public final C249403jg A0N;

    public static Integer A00(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C255773uh r1 = (C255773uh) list.get(i);
            if (r1.CWu() && r1.A0b != null) {
                String id = r1.A0b.getId();
                id.getClass();
                if (id.startsWith(str)) {
                    return Integer.valueOf(i);
                }
            }
        }
        return null;
    }

    public final void A03(Reel reel, AnonymousClass3BQ r9, AnonymousClass3N3 r10) {
        A05(reel, r9, r10, Collections.singletonList(reel), Collections.singletonList(reel), Collections.singletonList(reel));
    }

    public final void A05(Reel reel, AnonymousClass3BQ r10, AnonymousClass3N3 r11, List list, List list2, List list3) {
        A04(reel, r10, r11, (String) null, list, list2, list3);
    }

    public final void A08(Reel reel, AnonymousClass3BQ r9, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        A09(reel, r9, gradientSpinnerAvatarView, (List) null, Collections.singletonList(reel), Collections.singletonList(reel));
    }

    public final void A09(Reel reel, AnonymousClass3BQ r17, GradientSpinnerAvatarView gradientSpinnerAvatarView, List list, List list2, List list3) {
        AnonymousClass6VJ r0 = this.A07;
        if (r0 == null || !r0.A07) {
            Context context = this.A0L.getContext();
            context.getClass();
            UserSession userSession = this.A0K;
            Reel reel2 = reel;
            GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gradientSpinnerAvatarView;
            Reel reel3 = reel2;
            AnonymousClass6VJ A042 = 1OP.A04(context, userSession, reel3, new PJL(new FkN(reel2, r17, this, gradientSpinnerAvatarView2, list, list2, list3), gradientSpinnerAvatarView2), AnonymousClass3PO.A00(userSession), this.A0J.getModuleName(), -1);
            A042.A04();
            this.A07 = A042;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.6Ye, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v51, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v53, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static void A01(Reel reel, AnonymousClass3BQ r18, AnonymousClass32A r19, C46470DfY dfY, String str, List list, List list2, List list3, long j, boolean z) {
        RectF rectF;
        AnonymousClass32A r7 = r19;
        AnonymousClass329 r3 = r7.A0L;
        if (r3.getContext() != null && (r3.getContext() instanceof Activity) && r3.isResumed()) {
            0nA.A0N(r3.getRootView());
            C20960X6n x6n = r7.A06;
            if (x6n != null) {
                x6n.DcQ();
            }
            C227812jx B7p = r3.B7p();
            if (B7p instanceof C227812jx) {
                B7p.mShouldRestoreDefaultTheme = true;
            }
            ArrayList arrayList = new ArrayList();
            List<Reel> list4 = list2;
            for (Reel id : list4) {
                arrayList.add(id.getId());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Reel) it.next()).getId());
            }
            boolean z2 = r7.A0G;
            r7.A0G = false;
            boolean z3 = r7.A0I;
            r7.A0I = false;
            boolean z4 = r7.A0H;
            r7.A0H = false;
            Integer num = null;
            Reel reel2 = reel;
            if (r7.A0A != null) {
                Integer A002 = A00(r7.A0A, reel2.A0O(r7.A0K));
                r7.A0A = null;
                num = A002;
            }
            r7.A00 = -1;
            if (r7.A04 == null) {
                UserSession userSession = r7.A0K;
                1OP r0 = 1OP.$redex_init_class;
                0qQ.A0B(userSession, 0);
                r7.A04 = new C315656kI(userSession);
            }
            1OP r02 = 1OP.$redex_init_class;
            ? obj = new Object();
            String id2 = reel2.getId();
            UserSession userSession2 = r7.A0K;
            obj.A02(userSession2, id2, list4);
            obj.A09(arrayList2);
            obj.A0A(arrayList);
            AnonymousClass3BQ r14 = r18;
            obj.A03(r14);
            obj.A00 = list4.indexOf(reel2);
            obj.A01 = j;
            obj.A0d = z;
            obj.A0Z = z2;
            obj.A0b = z3;
            obj.A0a = z4;
            obj.A0X = r7.A0F;
            obj.A06(r7.A04.A02);
            obj.A03 = r7.A03;
            obj.A0K = r7.A0B;
            obj.A06 = r7.A08;
            String str2 = str;
            if (str != null) {
                obj.A0G = str2;
            }
            if (num != null) {
                obj.A04(num);
            }
            String str3 = r7.A0C;
            if (str3 != null) {
                obj.A0N = str3;
            }
            C46470DfY dfY2 = dfY;
            GradientSpinnerAvatarView gradientSpinnerAvatarView = dfY2.A02;
            if (gradientSpinnerAvatarView != null) {
                rectF = gradientSpinnerAvatarView.getAvatarBounds();
            } else {
                AnonymousClass3N3 r03 = dfY2.A01;
                if (r03 == null || (rectF = r03.AeG()) == null) {
                    Context context = dfY2.A00;
                    if (context != null) {
                        rectF = new RectF((float) (0nA.A09(context) / 2), (float) (0nA.A08(context) / 2), (float) (0nA.A09(context) / 2), (float) (0nA.A08(context) / 2));
                    } else {
                        rectF = new RectF();
                    }
                }
            }
            RectF rectF2 = new RectF(rectF.centerX(), rectF.centerY(), rectF.centerX(), rectF.centerY());
            GradientSpinnerAvatarView gradientSpinnerAvatarView2 = dfY2.A02;
            if (gradientSpinnerAvatarView2 != null) {
                gradientSpinnerAvatarView2.A0K.setVisibility(4);
                if (gradientSpinnerAvatarView2.A04 == 2) {
                    ? r04 = gradientSpinnerAvatarView2.A0L;
                    if (r04 != 0) {
                        r04.setVisibility(4);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                AnonymousClass3N3 r05 = dfY2.A01;
                if (r05 != null) {
                    r05.CLE();
                }
            }
            Activity activity = r3.getActivity();
            activity.getClass();
            0qQ.A0B(userSession2, 2);
            Map map = AnonymousClass3K2.A13;
            while (activity.getParent() != null) {
                activity = activity.getParent();
            }
            View findViewById = activity.findViewById(16908290);
            findViewById.getClass();
            AnonymousClass3K2 A052 = AnonymousClass3K2.A05(activity, (ViewGroup) findViewById, userSession2);
            A052.A0V = r7.A0F;
            ReelViewerConfig reelViewerConfig = r7.A03;
            if (reelViewerConfig != null) {
                A052.A0G = reelViewerConfig;
            }
            if (C315676kK.A00(userSession2, r14) || reel2.A0g()) {
                A02(r14, r7, A052, dfY2, obj);
                return;
            }
            int i = r7.A00;
            String str4 = r7.A0A;
            AnonymousClass3N3 r06 = dfY2.A01;
            if ((r06 == null || !r06.EtJ()) && dfY2.A02 == null) {
                rectF = null;
            }
            C14212Trr trr = new C14212Trr(reel2, r14, r7, A052, dfY, obj);
            Collections.emptySet();
            A052.A0U(rectF, rectF2, r7.A0J, reel2, r14, trr, str4, list, i, false);
        }
    }

    public static void A02(AnonymousClass3BQ r4, AnonymousClass32A r5, AnonymousClass3K2 r6, C46470DfY dfY, C309416Ye r8) {
        Fragment B7p;
        AnonymousClass6UX r0 = r5.A05;
        if (r0 != null) {
            r8.A07(r0.A03);
        } else {
            0wb.A03("ReelViewerLauncher", "Cannot launch with modal animation without a hide animation coordinator");
        }
        dfY.A00(r5.A0J);
        r8.A05(r6.A0x);
        r8.A03(r4);
        Bundle A002 = r8.A00();
        AnonymousClass329 r42 = r5.A0L;
        FragmentActivity activity = r42.getActivity();
        AnonymousClass6W8 A012 = AnonymousClass6W8.A01(activity, A002, r5.A0K);
        int Bn8 = r42.Bn8();
        if (Bn8 == -1 || (B7p = r42.B7p()) == null) {
            A012.A0C(activity);
        } else {
            A012.A0D(B7p, Bn8);
        }
    }

    public final void A04(Reel reel, AnonymousClass3BQ r20, AnonymousClass3N3 r21, String str, List list, List list2, List list3) {
        GradientSpinner gradientSpinner;
        AnonymousClass6VJ r0 = this.A07;
        if (r0 == null || !r0.A07) {
            C249813kP.A00.A06("stories_viewer", "reelViewerLauncher", true);
            AnonymousClass3N3 r6 = r21;
            if (r21 != null) {
                gradientSpinner = r6.Bkt();
            } else {
                Context context = this.A0L.getContext();
                context.getClass();
                gradientSpinner = new GradientSpinner(context);
            }
            Context context2 = this.A0L.getContext();
            context2.getClass();
            UserSession userSession = this.A0K;
            Reel reel2 = reel;
            Reel reel3 = reel2;
            AnonymousClass6VJ A042 = 1OP.A04(context2, userSession, reel3, new AnonymousClass6VH(new C46438Df0(reel2, r20, this, r6, str, list, list2, list3), gradientSpinner, reel2.A1P), AnonymousClass3PO.A00(userSession), this.A0J.getModuleName(), -1);
            A042.A04();
            this.A07 = A042;
        }
    }

    public final void A06(Reel reel, AnonymousClass3BQ r22, XC0 xc0, List list, List list2, int i) {
        Fragment B7p;
        AnonymousClass6VJ r0 = this.A07;
        if (r0 == null || !r0.A07) {
            XC0 xc02 = xc0;
            if (xc0 == null) {
                0wb.A03("ReelViewerLauncher", "Tried to launch reel with a null holder");
                return;
            }
            AnonymousClass329 r1 = this.A0L;
            FragmentActivity activity = r1.getActivity();
            if (activity != null && (B7p = r1.B7p()) != null && B7p.isAdded()) {
                0nA.A0N(r1.getRootView());
                C20960X6n x6n = this.A06;
                if (x6n != null) {
                    x6n.DcQ();
                }
                ArrayList arrayList = new ArrayList();
                List<Reel> list3 = list;
                for (Reel id : list3) {
                    arrayList.add(id.getId());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Reel) it.next()).getId());
                }
                xc02.CLk();
                AnonymousClass3K2 A072 = 1OP.A07(activity, this.A0K);
                A072.A0V = this.A0F;
                ReelViewerConfig reelViewerConfig = this.A03;
                if (reelViewerConfig != null) {
                    A072.A0G = reelViewerConfig;
                }
                Reel reel2 = reel;
                AnonymousClass3BQ r4 = r22;
                int i2 = i;
                AnonymousClass3K2 r12 = A072;
                r12.A0T((RectF) null, xc02.Beu(), this.A0J, reel2, r4, new C19488Waa(activity, reel2, r4, this, A072, xc02, arrayList2, arrayList, list3, i2), i2);
            }
        }
    }

    public final void A07(Reel reel, AnonymousClass3BQ r18, XC0 xc0, List list, List list2, int i) {
        Context context = this.A0L.getContext();
        context.getClass();
        UserSession userSession = this.A0K;
        AnonymousClass3PP A002 = AnonymousClass3PO.A00(userSession);
        Reel reel2 = reel;
        AnonymousClass6VJ A042 = 1OP.A04(context, userSession, reel2, new PJN(reel2, r18, this, xc0, list, list2, i), A002, this.A0J.getModuleName(), -1);
        A042.A04();
        this.A07 = A042;
    }

    public AnonymousClass32A(AnonymousClass0iw r5, UserSession userSession, AnonymousClass329 r7) {
        AnonymousClass32B r3 = new AnonymousClass32B(this);
        this.A0M = r3;
        AnonymousClass32C r2 = new AnonymousClass32C(this);
        this.A0N = r2;
        this.A0K = userSession;
        this.A0L = r7;
        this.A0J = r5;
        AnonymousClass32F BqA = r7.BqA();
        if (BqA != null) {
            BqA.A0c.A01(r3);
        }
        AnonymousClass32L BkP = r7.BkP();
        if (BkP != null) {
            C14074TpO tpO = BkP.A06;
            if (tpO == null) {
                0qQ.A0F("grid");
                throw AnonymousClass00P.createAndThrow();
            } else {
                tpO.A09(r2);
            }
        }
    }
}
