package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class JY9 implements View.OnTouchListener, MXG, C252203oj, C66441MRv, MVD, MVN, C66503MUh, C66439MRt, C317516nO {
    public static final String __redex_internal_original_name = "AssetPickerController";
    public float A00;
    public View A01;
    public ViewGroup A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public C63908LBr A06;
    public 1P0 A07;
    public ReboundViewPager A08;
    public TouchInterceptorFrameLayout A09;
    public C64435Lbq A0A;
    public JZ7 A0B;
    public C64964Ll3 A0C;
    public C64969Ll8 A0D;
    public C64962Ll1 A0E;
    public C64960Lkz A0F;
    public C64967Ll6 A0G;
    public C64963Ll2 A0H;
    public C64959Lky A0I;
    public C59811JZf A0J;
    public C64961Ll0 A0K;
    public JZL A0L;
    public KUX A0M;
    public C64970Ll9 A0N;
    public JYC A0O;
    public C238133Ar A0P;
    public C46487Dfq A0Q;
    public C40290AZf A0R;
    public CirclePageIndicator A0S;
    public WUH A0T;
    public Integer A0U = AnonymousClass05K.A0Y;
    public String A0V;
    public Map A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public float A0r;
    public float A0s;
    public float A0t;
    public View A0u;
    public C64965Ll4 A0v;
    public C64968Ll7 A0w;
    public C64966Ll5 A0x;
    public boolean A0y;
    public final int A0z;
    public final int A10;
    public final Activity A11;
    public final GestureDetector A12;
    public final View A13;
    public final 28D A14;
    public final QuickPerformanceLogger A15;
    public final 2cs A16;
    public final AnonymousClass0iw A17;
    public final UserSession A18;
    public final C357638Yz A19;
    public final AnonymousClass8MH A1A;
    public final A53 A1B;
    public final C3499582p A1C;
    public final AnonymousClass8C9 A1D;
    public final AnonymousClass80U A1E;
    public final AnonymousClass0eM A1F = AnonymousClass0eN.A01(new MMT(this, 32));
    public final double A1G;
    public final int A1H;
    public final int A1I;
    public final View.OnTouchListener A1J;
    public final ViewStub A1K;
    public final Fragment A1L;
    public final 0hq A1M;
    public final AnonymousClass07i A1N;
    public final AnonymousClass3E6 A1O;
    public final C354518Mi A1P;
    public final L08 A1Q = new L08();
    public final C3499982t A1R;
    public final C234462xu A1S;
    public final Set A1T;
    public final Set A1U;
    public final AnonymousClass0eK A1V;
    public final C62320sa A1W;
    public final C62320sa A1X;

    public static final void A08(JY9 jy9) {
        jy9.A0k = false;
        if (jy9.A0P()) {
            JZL jzl = jy9.A0L;
            if (jzl != null) {
                jzl.A06(false, false);
            }
            jy9.A16.A06((double) A00(jy9));
            AnonymousClass8BA.A0G(((AnonymousClass8ME) jy9.A1A).A0y, false, false);
            return;
        }
        jy9.A1E.E3H(new Object());
    }

    public static final synchronized void A0A(JY9 jy9, String str, short s) {
        synchronized (jy9) {
            if (jy9.A0l) {
                if (str != null) {
                    QuickPerformanceLogger quickPerformanceLogger = jy9.A15;
                    quickPerformanceLogger.markerAnnotate(31798883, "source", str);
                    quickPerformanceLogger.markerAnnotate(31798883, "APP_STARTUP_TIME_BUCKET", C64031Cc.A00());
                }
                jy9.A15.markerEnd(31798883, s);
                jy9.A0l = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r4.A0g != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(X.C3515589i r5, X.C59725JVj r6, boolean r7) {
        /*
            r4 = this;
            r0 = 2
            X.0qQ.A0B(r6, r0)
            X.JYC r3 = r4.A0O
            if (r3 == 0) goto L_0x001f
            r3.A06 = r7
            r3.A01 = r5
            r3.A02 = r6
            X.Lbq r2 = r4.A0A
            if (r2 == 0) goto L_0x001f
            boolean r0 = r4.A0h
            if (r0 != 0) goto L_0x001b
            boolean r1 = r4.A0g
            r0 = 1
            if (r1 == 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r2.A02(r3, r0)
        L_0x001f:
            X.2cs r0 = r4.A16
            r0.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JY9.A0J(X.89i, X.JVj, boolean):void");
    }

    public final void A0M(String str) {
        String str2 = str;
        0qQ.A0B(str, 0);
        C64969Ll8 ll8 = this.A0D;
        if (ll8 != null) {
            C64509LdB ldB = new C64509LdB(ll8, 4);
            UserSession userSession = ll8.A04;
            0qQ.A0B(userSession, 0);
            if (((C72206OyW) userSession.A01(C72206OyW.class, new C73662Phb(userSession, 20))).A00()) {
                C63556Kz5.A01.A03(ll8.A02.requireActivity(), ldB, userSession, "ig_stories_creation", "ig_stories_creation_avatar_cta_dialog", (String) null, str2, (String) null, (List) null, false, false);
            } else {
                C48368EdP.A00(ll8.A02.requireActivity(), (DialogInterface.OnClickListener) null, (DialogInterface.OnDismissListener) null, ldB, userSession, "ig_stories_creation", "ig_stories_creation_avatar_cta_dialog", 2131956848);
            }
        }
    }

    public final /* synthetic */ void Cw3() {
    }

    public final void Cw6(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass0eM r1 = this.A1F;
        if (r1.getValue() == null) {
            KUX kux = this.A0M;
            if (kux != null) {
                kux.A01(str, false);
                return;
            }
            return;
        }
        0mM r0 = (0mM) r1.getValue();
        if (r0 != null) {
            r0.A01(str);
        }
    }

    public final void Cw7(String str) {
    }

    public final void DTF(C66569MWx mWx, MusicBrowseCategory musicBrowseCategory, String str, String str2) {
        this.A1E.E3H(new AnonymousClass8UN(mWx, true, false));
    }

    public final /* synthetic */ void Dfq() {
    }

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r5) {
        0qQ.A0B(r5, 0);
        float f = (float) r5.A09.A00;
        View view = this.A01;
        if (view != null) {
            view.setTranslationY(f);
        }
    }

    public final /* synthetic */ void close() {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        float f = 0.0f;
        this.A0t = 0.0f;
        this.A0a = true;
        boolean z = false;
        this.A0X = false;
        this.A0Y = false;
        this.A0r = motionEvent.getRawX();
        this.A0s = motionEvent.getRawY();
        if (A0Q()) {
            float y = motionEvent.getY();
            View view = this.A01;
            if (view != null) {
                f = view.getY();
            }
            if (y < f) {
                z = true;
            }
        }
        return !z;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float f;
        int i;
        int i2;
        double d;
        JZ7 jz7;
        float f2;
        0qQ.A0B(motionEvent, 0);
        if (!A0Q()) {
            float y = motionEvent.getY();
            View view = this.A01;
            if (view != null) {
                f2 = view.getY();
            } else {
                f2 = 0.0f;
            }
            if (y < f2) {
                A03();
                return true;
            }
        }
        float y2 = motionEvent.getY();
        View view2 = this.A01;
        float f3 = 0.0f;
        if (view2 != null) {
            f = view2.getY();
        } else {
            f = 0.0f;
        }
        ImageView imageView = this.A03;
        if (imageView != null) {
            i = imageView.getTop();
        } else {
            i = 0;
        }
        if (y2 < f + ((float) i)) {
            return false;
        }
        View view3 = this.A01;
        if (view3 != null) {
            f3 = view3.getY();
        }
        ImageView imageView2 = this.A03;
        if (imageView2 != null) {
            i2 = imageView2.getBottom();
        } else {
            i2 = 0;
        }
        if (y2 > f3 + ((float) i2)) {
            return false;
        }
        LMR A012 = A01();
        if (A012 == null || ((jz7 = this.A0B) != null && jz7.A03(A012))) {
            2cs r5 = this.A16;
            if (!r5.A0C()) {
                return true;
            }
            if (r5.A09.A00 == 0.0d) {
                d = (double) this.A0z;
            } else {
                d = 0.0d;
            }
            r5.A06(d);
            return true;
        }
        JZ7 jz72 = this.A0B;
        if (jz72 == null) {
            return true;
        }
        jz72.A02(A012, true);
        return true;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        boolean onTouchEvent = this.A12.onTouchEvent(motionEvent);
        A05(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return onTouchEvent;
        }
        A0R(this.A0t, false);
        return onTouchEvent;
    }

    public static final float A00(JY9 jy9) {
        float f;
        Integer valueOf;
        ReboundViewPager reboundViewPager;
        Integer valueOf2;
        ImageView imageView;
        ReboundViewPager reboundViewPager2 = jy9.A08;
        if (reboundViewPager2 != null) {
            int i = reboundViewPager2.A08;
            JZ7 jz7 = jy9.A0B;
            if (!(jz7 == null || (valueOf = Integer.valueOf(jz7.A01(0, i))) == null || valueOf.intValue() == 0 || (reboundViewPager = jy9.A08) == null)) {
                int i2 = reboundViewPager.A08;
                JZ7 jz72 = jy9.A0B;
                if (!(jz72 == null || (valueOf2 = Integer.valueOf(jz72.A01(1, i2))) == null || valueOf2.intValue() == 0 || (imageView = jy9.A03) == null || imageView.getHeight() == 0)) {
                    f = ((float) jy9.A0F()) / ((float) jy9.A0z);
                    return ((float) jy9.A0z) * (1.0f - f);
                }
            }
        }
        f = 0.3f;
        return ((float) jy9.A0z) * (1.0f - f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.LMR A01() {
        /*
            r3 = this;
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r3.A08
            r1 = 0
            if (r0 == 0) goto L_0x000c
            int r0 = r0.getChildCount()
            if (r0 != 0) goto L_0x000c
            r1 = 1
        L_0x000c:
            r2 = 0
            if (r1 != 0) goto L_0x002a
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r3.A08
            if (r0 == 0) goto L_0x002b
            int r1 = r0.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x002b
            X.JZ7 r0 = r3.A0B
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r0.getItem(r1)
        L_0x0023:
            boolean r0 = r1 instanceof X.LMR
            if (r0 == 0) goto L_0x002a
            r2 = r1
            X.LMR r2 = (X.LMR) r2
        L_0x002a:
            return r2
        L_0x002b:
            r1 = r2
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JY9.A01():X.LMR");
    }

    private final C238133Ar A02() {
        View view;
        ViewGroup viewGroup;
        C238133Ar r0;
        ReboundViewPager reboundViewPager = this.A08;
        if (reboundViewPager == null || reboundViewPager.getVisibility() != 0) {
            view = null;
        } else {
            view = reboundViewPager.A0F;
        }
        if ((!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) && ((r0 = this.A0P) == null || (viewGroup = r0.CEd()) == null)) {
            return null;
        }
        return C238103Ao.A00(viewGroup);
    }

    private final void A03() {
        AnonymousClass80U r1;
        Object obj;
        if (this.A0n) {
            r1 = this.A1E;
            obj = new Object();
        } else if (this.A0c) {
            r1 = this.A1E;
            obj = new Object();
        } else if (this.A0o) {
            r1 = this.A1E;
            obj = new Object();
        } else {
            boolean z = this.A0g;
            r1 = this.A1E;
            if (z) {
                obj = C356688Uv.A00;
            } else {
                obj = new Object();
            }
        }
        r1.E3H(obj);
    }

    private final void A04() {
        C64435Lbq lbq;
        JZL jzl = this.A0L;
        if (jzl != null) {
            boolean z = false;
            if (!this.A0b && (lbq = this.A0A) != null && lbq.A00 == lbq.A02) {
                z = true;
            }
            jzl.A06(z, true);
        }
        AnonymousClass8BA.A0G(((AnonymousClass8ME) this.A1A).A0y, false, false);
    }

    public static final void A05(MotionEvent motionEvent, JY9 jy9) {
        if (!jy9.A0X && !jy9.A0Y) {
            float rawX = jy9.A0r - motionEvent.getRawX();
            float rawY = jy9.A0s - motionEvent.getRawY();
            if (JTR.A00(rawX, rawY) <= jy9.A1G) {
                return;
            }
            if (JTS.A00(rawY, rawX) < 20.0d) {
                jy9.A0X = true;
            } else {
                jy9.A0Y = true;
            }
        }
    }

    public static final void A06(JY9 jy9) {
        C64435Lbq lbq;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = jy9.A09;
        if (touchInterceptorFrameLayout != null && C2604245p.A03(AnonymousClass7TE.A0S(touchInterceptorFrameLayout))) {
            ViewGroup viewGroup = jy9.A02;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            C64967Ll6 ll6 = jy9.A0G;
            if (!(ll6 == null || (lbq = jy9.A0A) == null)) {
                lbq.A02(ll6, false);
            }
            jy9.A16.A06((double) (((float) jy9.A0z) * 0.100000024f));
        }
    }

    /* JADX WARNING: type inference failed for: r26v2, types: [X.0sa] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0010: MOVE  (r5v1 android.view.ViewGroup) = 
          (r5v0 com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x040a  */
    public static final void A07(X.JY9 r39) {
        /*
            r6 = r39
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r6.A09
            if (r0 != 0) goto L_0x03fc
            android.view.ViewStub r0 = r6.A1K
            android.view.View r5 = r0.inflate()
            boolean r0 = r5 instanceof com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout
            if (r0 == 0) goto L_0x03d1
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r5 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r5
            if (r5 == 0) goto L_0x03d1
            r6.A09 = r5
            int r11 = r6.A1H
            X.0nA.A0f(r5, r11)
            int r8 = r6.A0z
            X.0nA.A0V(r5, r8)
            r4 = 0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r4, r11, r8)
            r5.setClipBounds(r0)
            r0 = 2131428170(0x7f0b034a, float:1.8477977E38)
            android.view.View r0 = r5.requireViewById(r0)
            r6.A01 = r0
            r0 = 2131427816(0x7f0b01e8, float:1.8477259E38)
            android.widget.TextView r0 = X.DbU.A0G(r5, r0)
            r6.A05 = r0
            com.instagram.common.session.UserSession r3 = r6.A18
            X.0Tu r2 = X.0Tu.A05
            r0 = 36603094276379504(0x820a5200061370, double:3.211282436988243E-306)
            int r10 = X.DbS.A04(r2, r3, r0)
            r9 = 2
            r2 = 1
            if (r10 == 0) goto L_0x0053
            if (r10 == r2) goto L_0x040f
            r7 = 2131952514(0x7f130382, float:1.9541473E38)
            if (r10 == r9) goto L_0x0056
        L_0x0053:
            r7 = 2131952512(0x7f130380, float:1.9541469E38)
        L_0x0056:
            android.widget.TextView r1 = r6.A05
            if (r1 == 0) goto L_0x0069
            android.content.res.Resources r0 = r5.getResources()
            java.lang.String r0 = r0.getString(r7)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r1.setText(r0)
        L_0x0069:
            r0 = 2131427815(0x7f0b01e7, float:1.8477257E38)
            android.widget.TextView r7 = X.DbU.A0G(r5, r0)
            r6.A04 = r7
            if (r10 == 0) goto L_0x040a
            if (r10 == r2) goto L_0x0405
            r1 = 2131952511(0x7f13037f, float:1.9541467E38)
            if (r10 == r9) goto L_0x007e
            r1 = 2131952512(0x7f130380, float:1.9541469E38)
        L_0x007e:
            if (r7 == 0) goto L_0x008f
            android.content.res.Resources r0 = r5.getResources()
            java.lang.String r0 = r0.getString(r1)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r7.setText(r0)
        L_0x008f:
            r0 = 2131428171(0x7f0b034b, float:1.8477979E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r5, r0)
            r6.A02 = r0
            r0 = 2131428169(0x7f0b0349, float:1.8477975E38)
            android.view.View r0 = r5.findViewById(r0)
            r6.A0u = r0
            r0 = 2131428176(0x7f0b0350, float:1.847799E38)
            android.view.ViewStub r1 = X.JTR.A0X(r5, r0)
            r0 = 2131624144(0x7f0e00d0, float:1.887546E38)
            android.view.View r1 = X.JTP.A0H(r1, r0)
            X.0qQ.A07(r1)
            X.JZL r0 = new X.JZL
            r0.<init>(r1, r3, r6, r6)
            r6.A0L = r0
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.8Mi r0 = r6.A1P
            r20 = r0
            X.L08 r15 = r6.A1Q
            X.3E6 r14 = r6.A1O
            X.8MH r10 = r6.A1A
            X.0eK r13 = r6.A1V
            X.8Yz r7 = r6.A19
            X.80m r9 = r7.A08
            java.lang.Object r12 = r9.A00
            X.4yO r12 = (X.C279284yO) r12
            X.MMs r1 = new X.MMs
            r1.<init>(r6, r2)
            X.KUX r0 = new X.KUX
            r21 = r6
            r22 = r15
            r23 = r13
            r24 = r1
            r16 = r14
            r17 = r12
            r18 = r7
            r19 = r10
            r15 = r3
            r14 = r6
            r13 = r5
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r6.A0M = r0
            X.3Ar r0 = r0.A01
            r6.A0P = r0
            android.app.Activity r13 = r6.A11
            X.0iw r0 = r6.A17
            r39 = r0
            r1 = 23604484(0x1682d04, float:4.2643967E-38)
            X.Dfq r1 = X.C46486Dfp.A00(r13, r0, r3, r1)
            r6.A0Q = r1
            X.3Ar r0 = r6.A0P
            if (r0 == 0) goto L_0x0109
            r0.AAD(r1)
        L_0x0109:
            android.view.View r1 = r6.A01
            if (r1 == 0) goto L_0x0402
            r0 = 2131437430(0x7f0b2776, float:1.8496758E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r0 = (com.instagram.ui.widget.pageindicator.CirclePageIndicator) r0
        L_0x0116:
            r6.A0S = r0
            if (r0 == 0) goto L_0x011c
            r0.A09 = r2
        L_0x011c:
            android.view.View r1 = r6.A01
            if (r1 == 0) goto L_0x03ff
            r0 = 2131428180(0x7f0b0354, float:1.8477997E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
        L_0x0129:
            r6.A08 = r0
            android.view.View r12 = r6.A13
            java.lang.Object r0 = r9.A00
            boolean r0 = r0 instanceof X.C363138jC
            X.JZ7 r1 = new X.JZ7
            r14 = r1
            r15 = r12
            r16 = r39
            r17 = r3
            r21 = r4
            r22 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r6.A0B = r1
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r6.A08
            if (r0 == 0) goto L_0x0149
            r0.setAdapter((android.widget.Adapter) r1)
        L_0x0149:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r6.A08
            if (r1 == 0) goto L_0x0150
            r1.setDraggingEnabled(r4)
        L_0x0150:
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r0 = r6.A0S
            if (r0 == 0) goto L_0x0159
            if (r1 == 0) goto L_0x0159
            r1.A0P(r0)
        L_0x0159:
            X.2cs r7 = r6.A16
            r7.A0A(r6)
            double r0 = (double) r8
            r7.A08(r0, r2)
            android.view.View$OnTouchListener r0 = r6.A1J
            r5.A00(r0, r6)
            android.view.View r1 = r6.A0u
            if (r1 == 0) goto L_0x0170
            java.util.Set r0 = r6.A1U
            r0.add(r1)
        L_0x0170:
            java.util.Set r1 = r6.A1U
            r0 = 2131440776(0x7f0b3488, float:1.8503545E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r5, r0)
            r1.add(r0)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            android.content.Context r18 = X.AnonymousClass7TE.A0S(r5)
            X.07i r15 = r6.A1N
            X.Ll6 r1 = new X.Ll6
            r17 = r1
            r19 = r5
            r20 = r15
            r21 = r3
            r22 = r10
            r23 = r6
            r24 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r6.A0G = r1
            r0.add(r1)
            java.util.Set r7 = r6.A1T
            X.6oG r1 = X.C318046oG.CUT_OUT_STICKER
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x0285
            r1 = 2131431250(0x7f0b0f52, float:1.8484224E38)
            android.view.View r7 = X.AnonymousClass7TF.A0G(r5, r1)
            android.view.ViewStub r7 = (android.view.ViewStub) r7
            r25 = 0
            java.lang.Integer r24 = X.AnonymousClass05K.A02
            X.Ll7 r1 = new X.Ll7
            r17 = r13
            r19 = r7
            r21 = r39
            r22 = r3
            r23 = r10
            r26 = r11
            r27 = r4
            r28 = r4
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r6.A0w = r1
            r0.add(r1)
            androidx.fragment.app.Fragment r14 = r6.A1L
            r1 = 2131431246(0x7f0b0f4e, float:1.8484216E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r5, r1)
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            r1 = 2131431259(0x7f0b0f5b, float:1.8484242E38)
            android.view.View r7 = X.AnonymousClass7TF.A0G(r5, r1)
            android.view.ViewStub r7 = (android.view.ViewStub) r7
            java.lang.Integer r36 = X.AnonymousClass05K.A01
            X.Ll4 r1 = new X.Ll4
            r26 = r1
            r27 = r13
            r28 = r5
            r29 = r8
            r30 = r7
            r31 = r14
            r32 = r14
            r33 = r39
            r34 = r3
            r35 = r10
            r37 = r24
            r38 = r25
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r6.A0v = r1
            r0.add(r1)
            r1 = 2131431269(0x7f0b0f65, float:1.8484262E38)
            android.view.View r12 = X.AnonymousClass7TF.A0G(r5, r1)
            android.view.ViewStub r12 = (android.view.ViewStub) r12
            java.lang.Object r8 = r9.A00
            X.4yO r8 = (X.C279284yO) r8
            X.Ll1 r7 = new X.Ll1
            r25 = r7
            r26 = r5
            r27 = r12
            r28 = r14
            r29 = r39
            r30 = r3
            r31 = r8
            r32 = r10
            r33 = r24
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r6.A0E = r7
            r0.add(r7)
            X.0Tu r12 = X.0Tu.A06
            r7 = 36323620754107708(0x810c2400012d3c, double:3.034542256154012E-306)
            boolean r7 = X.182.A06(r12, r3, r7)
            if (r7 != 0) goto L_0x024a
            r7 = 36323620754042171(0x810c2400002d3b, double:3.034542256112566E-306)
            boolean r7 = X.182.A06(r12, r3, r7)
            if (r7 == 0) goto L_0x0269
        L_0x024a:
            android.view.View r8 = X.AnonymousClass7TF.A0G(r5, r1)
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            java.lang.Object r7 = r9.A00
            X.4yO r7 = (X.C279284yO) r7
            X.Ll0 r1 = new X.Ll0
            r19 = r1
            r20 = r5
            r21 = r8
            r22 = r14
            r23 = r3
            r24 = r7
            r25 = r10
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r6.A0K = r1
        L_0x0269:
            java.lang.Object r7 = r9.A00
            X.4yO r7 = (X.C279284yO) r7
            X.Kgm r24 = X.C62496Kgm.A05
            X.JZf r1 = new X.JZf
            r17 = r1
            r19 = r5
            r20 = r6
            r21 = r3
            r22 = r7
            r23 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r6.A0J = r1
            r0.add(r1)
        L_0x0285:
            X.Ll5 r1 = new X.Ll5
            r17 = r1
            r20 = r15
            r22 = r10
            r23 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r6.A0x = r1
            r0.add(r1)
            X.82t r14 = r6.A1R
            X.2xu r12 = r6.A1S
            r1 = 2131436692(0x7f0b2494, float:1.8495262E38)
            android.view.View r11 = X.AnonymousClass7TE.A0b(r5, r1)
            android.view.ViewStub r11 = (android.view.ViewStub) r11
            X.0hq r9 = r6.A1M
            X.80U r8 = r6.A1E
            java.util.Map r7 = r6.A0W
            X.JYC r1 = new X.JYC
            r19 = r1
            r20 = r11
            r21 = r9
            r22 = r3
            r23 = r8
            r24 = r14
            r25 = r12
            r26 = r6
            r27 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r6.A0O = r1
            r0.add(r1)
            r1 = 2131430847(0x7f0b0dbf, float:1.8483407E38)
            android.view.View r7 = X.AnonymousClass7TE.A0b(r5, r1)
            android.view.ViewStub r7 = (android.view.ViewStub) r7
            java.lang.String r25 = r39.getModuleName()
            X.AZf r1 = new X.AZf
            r19 = r1
            r20 = r13
            r21 = r7
            r22 = r15
            r23 = r3
            r24 = r10
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r6.A0R = r1
            r0.add(r1)
            androidx.fragment.app.Fragment r7 = r6.A1L
            r1 = 2131433316(0x7f0b1764, float:1.8488414E38)
            android.view.View r8 = r5.findViewById(r1)
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            com.instagram.api.schemas.NonprofitSelectorSurfaceEnum r23 = com.instagram.api.schemas.NonprofitSelectorSurfaceEnum.STORY
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r2)
            java.lang.String r28 = "STICKER_TRAY"
            X.Ll9 r1 = new X.Ll9
            r19 = r1
            r21 = r8
            r22 = r7
            r24 = r39
            r25 = r3
            r26 = r10
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r6.A0N = r1
            r0.add(r1)
            X.1ZC r1 = X.1ZC.A00
            if (r1 == 0) goto L_0x0339
            X.C63468KxX.A00()
            r1 = 2131443442(0x7f0b3ef2, float:1.8508952E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r5, r1)
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            X.AnonymousClass7TF.A1D(r15, r2, r8)
            X.WUH r1 = new X.WUH
            r17 = r1
            r19 = r8
            r20 = r15
            r21 = r3
            r22 = r10
            r17.<init>(r18, r19, r20, r21, r22)
            r6.A0T = r1
            r0.add(r1)
        L_0x0339:
            r1 = 2131435497(0x7f0b1fe9, float:1.8492838E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r5, r1)
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            X.82p r2 = r6.A1C
            X.Ll2 r1 = new X.Ll2
            r19 = r1
            r20 = r13
            r21 = r8
            r22 = r39
            r23 = r3
            r24 = r10
            r25 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r6.A0H = r1
            r0.add(r1)
            r1 = 2131441317(0x7f0b36a5, float:1.8504642E38)
            android.view.ViewStub r2 = X.JTR.A0X(r5, r1)
            X.Lky r1 = new X.Lky
            r1.<init>(r2, r3, r10)
            r6.A0I = r1
            r0.add(r1)
            r1 = 33
            X.MMT r11 = new X.MMT
            r11.<init>(r6, r1)
            X.0sa r9 = r6.A1W
            X.0sa r8 = r6.A1X
            X.9Na r2 = new X.9Na
            r2.<init>(r6, r4)
            X.Ll8 r1 = new X.Ll8
            r17 = r1
            r19 = r5
            r20 = r7
            r21 = r3
            r22 = r10
            r23 = r11
            r24 = r9
            r25 = r8
            r26 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6.A0D = r1
            r0.add(r1)
            r1 = 2131427918(0x7f0b024e, float:1.8477466E38)
            android.view.ViewStub r2 = X.JTR.A0X(r5, r1)
            X.Ll3 r1 = new X.Ll3
            r1.<init>(r13, r2, r3, r10)
            r6.A0C = r1
            r0.add(r1)
            java.lang.Class<X.LBr> r2 = X.C63908LBr.class
            X.MMP r1 = new X.MMP
            r1.<init>(r3, r4)
            java.lang.Object r1 = r3.A01(r2, r1)
            X.LBr r1 = (X.C63908LBr) r1
            r6.A06 = r1
            X.Lbq r1 = new X.Lbq
            r1.<init>(r3, r6, r6, r0)
            r6.A0A = r1
            r1 = 2131437554(0x7f0b27f2, float:1.849701E38)
            android.view.ViewStub r2 = X.JTR.A0X(r5, r1)
            X.Lkz r1 = new X.Lkz
            r1.<init>(r2, r7, r3, r10)
            r6.A0F = r1
            r0.add(r1)
        L_0x03d1:
            android.view.View r1 = r6.A01
            if (r1 == 0) goto L_0x03fd
            r0 = 2131432060(0x7f0b127c, float:1.8485867E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
        L_0x03de:
            r6.A03 = r0
            X.8Yz r0 = r6.A19
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.C363138jC
            if (r0 == 0) goto L_0x03fc
            com.instagram.common.session.UserSession r0 = r6.A18
            boolean r0 = X.JWB.A01(r0)
            if (r0 != 0) goto L_0x03fc
            android.widget.ImageView r1 = r6.A03
            if (r1 == 0) goto L_0x03fc
            r0 = 2131237765(0x7f081b85, float:1.809179E38)
            r1.setImageResource(r0)
        L_0x03fc:
            return
        L_0x03fd:
            r0 = 0
            goto L_0x03de
        L_0x03ff:
            r0 = 0
            goto L_0x0129
        L_0x0402:
            r0 = 0
            goto L_0x0116
        L_0x0405:
            r1 = 2131952510(0x7f13037e, float:1.9541465E38)
            goto L_0x007e
        L_0x040a:
            r1 = 2131952509(0x7f13037d, float:1.9541463E38)
            goto L_0x007e
        L_0x040f:
            r7 = 2131952513(0x7f130381, float:1.954147E38)
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JY9.A07(X.JY9):void");
    }

    public static final void A09(JY9 jy9, float f) {
        2cs r7 = jy9.A16;
        C71412ct r6 = r7.A09;
        float f2 = (float) r6.A00;
        double d = (double) jy9.A0z;
        float min = (float) Math.min(Math.max((double) (f2 - f), 0.0d), d);
        if (f2 != min) {
            JTP.A1K(r7, min);
        }
        if (f > 0.0f && jy9.A0P() && r6.A00 < ((double) A00(jy9))) {
            jy9.A04();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.6nz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.6nz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: X.6nz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: X.6nz} */
    /* JADX WARNING: type inference failed for: r1v14, types: [X.LlA, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0270, code lost:
        if (r11.A05() != true) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0415, code lost:
        if (r20 != false) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x017f, code lost:
        if (X.182.A06(r11, r12, 36327258594687287L) == false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01b5, code lost:
        if (X.182.A06(X.0Tu.A05, r5.A18, 36319918495768327L) == false) goto L_0x01b7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0B(X.JY9 r19, java.util.List r20) {
        /*
            r5 = r19
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r5.A09
            r1 = 0
            if (r0 == 0) goto L_0x000e
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x000e
            r1 = 1
        L_0x000e:
            r8 = 0
            r4 = 1
            r9 = r20
            if (r1 == 0) goto L_0x0437
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.8Mi r0 = r5.A1P
            java.util.Set r0 = r0.A03()
            boolean r0 = r0.isEmpty()
            r20 = r0 ^ 1
            if (r20 == 0) goto L_0x0036
            X.LMR r1 = new X.LMR
            r1.<init>()
            java.lang.String r0 = "recent_sticker_set_id"
            r1.A01 = r0
            X.Khk r0 = X.C62554Khk.RECENT_EMOJIS_AND_STICKER_SET
            r1.A00 = r0
            r3.add(r1)
        L_0x0036:
            X.8Yz r0 = r5.A19
            X.80m r2 = r0.A08
            java.lang.Object r0 = r2.A00
            X.9QA r10 = X.AnonymousClass9QA.A00
            r19 = 1
            if (r0 == r10) goto L_0x004b
            r19 = 0
            X.L08 r0 = r5.A1Q
            java.util.Set r0 = r0.A00
            r0.clear()
        L_0x004b:
            X.LMR.A00(r3, r9)
            java.util.Iterator r18 = r9.iterator()
        L_0x0052:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0394
            java.lang.Object r7 = r18.next()
            X.6nz r7 = (X.C317876nz) r7
            X.6oG r6 = r7.A00()
            java.util.Set r0 = r5.A1T
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x006e
            r18.remove()
            goto L_0x0052
        L_0x006e:
            X.6oG r0 = X.C318046oG.GALLERY_BROWSE
            if (r6 != r0) goto L_0x0086
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r5.A09
            if (r0 == 0) goto L_0x0086
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            boolean r0 = X.C2604245p.A03(r0)
            r0 = r0 ^ 1
            if (r0 != r4) goto L_0x0086
            r18.remove()
            goto L_0x0052
        L_0x0086:
            X.6oG r0 = X.C318046oG.TIME
            if (r6 != r0) goto L_0x00a4
            X.82p r0 = r5.A1C
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.1Xj r0 = r0.A08
            if (r0 != 0) goto L_0x00a4
            X.8MH r0 = r5.A1A
            X.8ME r0 = (X.AnonymousClass8ME) r0
            long r0 = r0.A02
            r12 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x00a4
            r18.remove()
            goto L_0x0052
        L_0x00a4:
            X.6oG r0 = X.C318046oG.KARAOKE_CAPTION
            if (r6 != r0) goto L_0x00d8
            X.82p r0 = r5.A1C
            X.82o r11 = r0.A02
            X.8nd r1 = r11.A01()
            X.8nd r0 = X.C365758nd.A07
            if (r1 != r0) goto L_0x038f
            X.82Y r0 = r11.A01
            X.82d r0 = r0.A0Y
            if (r0 != 0) goto L_0x038f
            boolean r0 = r11.A0B()
            if (r0 != 0) goto L_0x038f
            boolean r0 = r11.A0F()
            if (r0 != 0) goto L_0x038f
            boolean r0 = r11.A0A()
            if (r0 != 0) goto L_0x038f
            java.lang.Object r1 = r2.A00
            if (r1 == 0) goto L_0x038f
            boolean r0 = r1 instanceof X.AnonymousClass9QA
            if (r0 != 0) goto L_0x00d8
            boolean r0 = r1 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x038f
        L_0x00d8:
            X.6oG r0 = X.C318046oG.RESHARE_STICKER
            if (r6 != r0) goto L_0x00e1
            r18.remove()
            goto L_0x0052
        L_0x00e1:
            X.6oG r0 = X.C318046oG.IMAGINE_TEMPLATE
            if (r6 != r0) goto L_0x00f9
            com.instagram.common.session.UserSession r12 = r5.A18
            X.0Tu r11 = X.0Tu.A05
            r0 = 36325480474948585(0x810dd5000133e9, double:3.0357183511022774E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 != 0) goto L_0x00f9
            r18.remove()
            goto L_0x0052
        L_0x00f9:
            X.6oG r0 = X.C318046oG.IMAGINE_ME
            if (r6 != r0) goto L_0x0184
            com.instagram.common.session.UserSession r12 = r5.A18
            java.lang.Object r14 = r2.A00
            X.28D r1 = r5.A14
            X.82p r0 = r5.A1C
            X.82o r0 = r0.A02
            X.8nd r17 = r0.A01()
            X.82Y r11 = r0.A01
            X.802 r0 = r11.A02()
            boolean r16 = X.AnonymousClass7TF.A1V(r0)
            X.8Cl r0 = r11.A03()
            if (r0 == 0) goto L_0x0182
            java.util.List r15 = r0.A0p
        L_0x011d:
            r13 = 2
            r11 = 3
            if (r15 == 0) goto L_0x0132
            boolean r0 = X.LIW.A00(r15)
            if (r0 == r4) goto L_0x012d
            boolean r0 = X.LIW.A01(r15)
            if (r0 != r4) goto L_0x0132
        L_0x012d:
            r18.remove()
            goto L_0x0052
        L_0x0132:
            if (r14 == 0) goto L_0x012d
            if (r16 != 0) goto L_0x012d
            boolean r0 = r14.equals(r10)
            if (r0 == 0) goto L_0x012d
            boolean r0 = X.C339097j3.A00(r1)
            if (r0 == 0) goto L_0x012d
            int r1 = r17.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0154
            if (r1 == r4) goto L_0x012d
            if (r1 == r13) goto L_0x012d
            if (r1 == r11) goto L_0x012d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0154:
            android.content.Context r0 = X.C60960kU.A00
            X.0qQ.A07(r0)
            boolean r0 = X.C305756Jk.A00(r0)
            if (r0 == 0) goto L_0x012d
            X.0Tu r11 = X.0Tu.A05
            r0 = 36327258591607058(0x810f7300043912, double:3.036842839236997E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x012d
            X.HrZ r0 = X.HYV.A00(r12)
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0184
            r0 = 36327258594687287(0x810f7300333937, double:3.036842841184946E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x0184
            goto L_0x012d
        L_0x0182:
            r15 = r8
            goto L_0x011d
        L_0x0184:
            X.6oG r0 = X.C318046oG.MAGIC_MOD_ADD_YOURS_BACKDROP
            if (r6 != r0) goto L_0x01bc
            X.8pt r13 = X.C366918pt.A00
            X.28D r12 = r5.A14
            java.lang.Object r11 = r2.A00
            X.4yO r11 = (X.C279284yO) r11
            X.82p r0 = r5.A1C
            X.82o r0 = r0.A02
            X.8nd r1 = r0.A01()
            X.82Y r0 = r0.A01
            X.802 r0 = r0.A02()
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            boolean r0 = r13.A00(r12, r11, r1, r0)
            if (r0 == 0) goto L_0x01b7
            com.instagram.common.session.UserSession r12 = r5.A18
            X.0Tu r11 = X.0Tu.A05
            r0 = 36319918495768327(0x8108c600361f07, double:3.03220093307239E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 != 0) goto L_0x01bc
        L_0x01b7:
            r18.remove()
            goto L_0x0052
        L_0x01bc:
            X.6oG r0 = X.C318046oG.MAGIC_MOD_BACKDROP
            if (r6 != r0) goto L_0x01f1
            X.8pt r13 = X.C366918pt.A00
            X.28D r12 = r5.A14
            java.lang.Object r11 = r2.A00
            X.4yO r11 = (X.C279284yO) r11
            X.82p r0 = r5.A1C
            X.82o r0 = r0.A02
            X.8nd r1 = r0.A01()
            X.82Y r0 = r0.A01
            X.802 r0 = r0.A02()
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            boolean r0 = r13.A00(r12, r11, r1, r0)
            if (r0 == 0) goto L_0x01ec
            com.instagram.common.session.UserSession r0 = r5.A18
            java.lang.Boolean r0 = X.C364778lz.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01f1
        L_0x01ec:
            r18.remove()
            goto L_0x0052
        L_0x01f1:
            X.6oG r0 = X.C318046oG.MAGIC_MOD_RESTYLE
            if (r6 != r0) goto L_0x0226
            X.8pt r13 = X.C366918pt.A00
            X.28D r12 = r5.A14
            java.lang.Object r11 = r2.A00
            X.4yO r11 = (X.C279284yO) r11
            X.82p r0 = r5.A1C
            X.82o r0 = r0.A02
            X.8nd r1 = r0.A01()
            X.82Y r0 = r0.A01
            X.802 r0 = r0.A02()
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            boolean r0 = r13.A00(r12, r11, r1, r0)
            if (r0 == 0) goto L_0x0221
            com.instagram.common.session.UserSession r0 = r5.A18
            java.lang.Boolean r0 = X.C364768ly.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0226
        L_0x0221:
            r18.remove()
            goto L_0x0052
        L_0x0226:
            X.6oG r0 = X.C318046oG.AVATAR_SEARCH
            if (r6 != r0) goto L_0x023e
            com.instagram.common.session.UserSession r7 = r5.A18
            X.0Tu r6 = X.0Tu.A05
            r0 = 36319858362752697(0x8108b800011eb9, double:3.032162904711169E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0052
            r18.remove()
            goto L_0x0052
        L_0x023e:
            java.lang.String r1 = r7.A0Z
            java.lang.String r0 = "wearables_sticker_id"
            r12 = 0
            boolean r0 = X.00p.A0k(r1, r0, r12)
            if (r0 == 0) goto L_0x02a0
            X.82p r0 = r5.A1C
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            java.util.List r0 = r0.A0m
            java.util.List r0 = X.C51966G9m.A1J(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x0259:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x038a
            java.lang.Object r14 = r16.next()
            X.8nh r14 = (X.C365798nh) r14
            com.instagram.common.gallery.Medium r11 = r14.A00()
            if (r11 == 0) goto L_0x0272
            boolean r1 = r11.A05()
            r0 = 1
            if (r1 == r4) goto L_0x0273
        L_0x0272:
            r0 = 0
        L_0x0273:
            r13 = 0
            if (r0 != 0) goto L_0x027e
            if (r11 == 0) goto L_0x02cf
            boolean r0 = r11.CeS()
            if (r0 != r4) goto L_0x02cf
        L_0x027e:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r11.A0G
            java.lang.String r14 = r0.A03
            java.lang.String r15 = r11.A0X
            boolean r1 = r11.A05()
        L_0x0288:
            if (r14 != 0) goto L_0x02c6
            com.instagram.common.session.UserSession r0 = r5.A18
            X.Kp0 r0 = X.C59737JVv.A00(r13, r0, r15, r1)
        L_0x0290:
            if (r0 == 0) goto L_0x02bd
            if (r11 == 0) goto L_0x029c
            com.instagram.common.gallery.metadata.MediaUploadMetadata r11 = r11.A0G
            java.lang.String r1 = r0.A01()
            r11.A03 = r1
        L_0x029c:
            boolean r0 = r0 instanceof X.C59790JYj
            if (r0 == 0) goto L_0x0259
        L_0x02a0:
            X.6oG r0 = X.C318046oG.JOIN_CHAT
            if (r6 == r0) goto L_0x02a8
            X.6oG r0 = X.C318046oG.SUBSCRIBER_CHAT
            if (r6 != r0) goto L_0x02e8
        L_0x02a8:
            X.8MH r0 = r5.A1A
            X.8ME r0 = (X.AnonymousClass8ME) r0
            java.util.ArrayList r1 = r0.A17()
            X.3WT r0 = X.AnonymousClass3WT.MESSAGE_SHARE
            X.3ui r0 = X.C289745e8.A00(r0, r1)
            if (r0 == 0) goto L_0x02e8
            r18.remove()
            goto L_0x0052
        L_0x02bd:
            if (r11 == 0) goto L_0x0259
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r11.A0G
            java.lang.String r0 = ""
            r1.A03 = r0
            goto L_0x0259
        L_0x02c6:
            com.instagram.common.session.UserSession r1 = r5.A18
            X.0sn r0 = X.0sn.A00
            X.Kp0 r0 = X.C59737JVv.A01(r1, r14, r0)
            goto L_0x0290
        L_0x02cf:
            X.8nd r1 = r14.A05
            X.8nd r0 = X.C365758nd.A04
            if (r1 != r0) goto L_0x0259
            X.8Cl r1 = r14.A02
            if (r1 == 0) goto L_0x02e5
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r1.A01()
            java.lang.String r14 = r0.A03
            java.lang.String r15 = r1.A06()
        L_0x02e3:
            r1 = 1
            goto L_0x0288
        L_0x02e5:
            r14 = r13
            r15 = r13
            goto L_0x02e3
        L_0x02e8:
            if (r19 == 0) goto L_0x0312
            java.lang.Boolean r0 = r7.A08
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            if (r0 == 0) goto L_0x0312
            X.L08 r0 = r5.A1Q
            java.util.Set r6 = r0.A00
            X.LlA r1 = new X.LlA
            r1.<init>()
            X.6nK r0 = X.C317476nK.STICKER
            r1.A01 = r0
            java.util.List r0 = r7.A0O
            java.lang.Object r0 = r0.get(r12)
            X.6o8 r0 = (X.C317966o8) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0H
            r1.A00 = r0
            r1.A02 = r7
            r6.add(r1)
            goto L_0x0052
        L_0x0312:
            X.6oG r0 = X.C318046oG.POLLING
            if (r6 == r0) goto L_0x031a
            X.6oG r0 = X.C318046oG.POLL_STICKER_V2
            if (r6 != r0) goto L_0x032d
        L_0x031a:
            java.lang.Object r0 = r2.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x032d
            com.instagram.common.session.UserSession r0 = r5.A18
            boolean r0 = X.JUO.A00(r0)
            if (r0 == 0) goto L_0x032d
            r18.remove()
            goto L_0x0052
        L_0x032d:
            X.6oG r0 = X.C318046oG.NOTIFY_ME
            if (r6 != r0) goto L_0x037b
            boolean r0 = r5.CVI()
            if (r0 == 0) goto L_0x0356
            com.instagram.common.session.UserSession r7 = r5.A18
            X.0Tu r6 = X.0Tu.A05
            r0 = 36321864112613184(0x810a8b00032740, double:3.0334313489994475E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 != 0) goto L_0x0356
            r0 = 36321864112875330(0x810a8b00072742, double:3.03343134916523E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 != 0) goto L_0x0356
            r18.remove()
            goto L_0x0052
        L_0x0356:
            boolean r0 = r5.CVC()
            if (r0 == 0) goto L_0x0052
            com.instagram.common.session.UserSession r7 = r5.A18
            X.0Tu r6 = X.0Tu.A05
            r0 = 36325304381289307(0x810dac0001335b, double:3.035606988763078E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 != 0) goto L_0x0052
            r0 = 36325304381420380(0x810dac0003335c, double:3.035606988845969E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 != 0) goto L_0x0052
            r18.remove()
            goto L_0x0052
        L_0x037b:
            X.6oG r0 = X.C318046oG.CLIPS_PROMPT
            if (r6 != r0) goto L_0x0052
            java.lang.Object r1 = r2.A00
            X.80e r0 = X.C3493880e.A00
            if (r1 != r0) goto L_0x0052
            r18.remove()
            goto L_0x0052
        L_0x038a:
            r18.remove()
            goto L_0x0052
        L_0x038f:
            r18.remove()
            goto L_0x0052
        L_0x0394:
            X.82p r0 = r5.A1C
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.1Xj r0 = r0.A08
            if (r0 == 0) goto L_0x03bd
            int r6 = r9.size()
            r2 = 0
        L_0x03a3:
            if (r2 >= r6) goto L_0x03bd
            java.lang.Object r0 = r9.get(r2)
            X.6nz r0 = (X.C317876nz) r0
            X.6oG r1 = r0.A00()
            X.6oG r0 = X.C318046oG.TIME
            if (r1 != r0) goto L_0x0468
            int r1 = r2 + 1
            X.6nz r0 = X.C317876nz.A17
            r9.add(r1, r0)
            r9.remove(r2)
        L_0x03bd:
            int r0 = r3.size()
            boolean r2 = X.C51970G9q.A1W(r0, r4)
            r5.A0y = r2
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r5.A08
            if (r0 == 0) goto L_0x03ce
            r0.setDraggingEnabled(r2)
        L_0x03ce:
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r1 = r5.A0S
            if (r1 == 0) goto L_0x03d9
            int r0 = X.DbW.A01(r2)
            r1.setVisibility(r0)
        L_0x03d9:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r5.A08
            if (r0 == 0) goto L_0x03ea
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r2 = r5.A0S
            if (r2 == 0) goto L_0x03ea
            int r1 = r0.A08
            int r0 = r3.size()
            r2.A01(r1, r0)
        L_0x03ea:
            if (r20 == 0) goto L_0x0400
            boolean r0 = r5.A0m
            if (r0 != 0) goto L_0x0400
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r0 = r5.A0S
            if (r0 == 0) goto L_0x03f7
            r0.A02(r4)
        L_0x03f7:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.A08
            if (r1 == 0) goto L_0x0400
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A0R(r4, r0)
        L_0x0400:
            boolean r0 = r5.A0y
            if (r0 == 0) goto L_0x0410
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.A08
            if (r1 == 0) goto L_0x0410
            X.M6R r0 = new X.M6R
            r0.<init>(r1, r5)
            X.0nA.A0p(r1, r0)
        L_0x0410:
            boolean r0 = r5.A0m
            if (r0 != 0) goto L_0x0417
            r0 = 0
            if (r20 == 0) goto L_0x0418
        L_0x0417:
            r0 = 1
        L_0x0418:
            r5.A0m = r0
            X.JZ7 r1 = r5.A0B
            if (r1 == 0) goto L_0x042c
            java.util.List r0 = r1.A07
            r0.clear()
            r0.addAll(r3)
            r0 = 792283702(0x2f394a36, float:1.6852017E-10)
            X.0fE.A00(r1, r0)
        L_0x042c:
            X.KUX r0 = r5.A0M
            if (r0 == 0) goto L_0x0437
            X.MsV r0 = r0.A0A
            java.util.List r0 = r0.A04
            r0.addAll(r3)
        L_0x0437:
            java.util.Iterator r3 = r9.iterator()
        L_0x043b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0451
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.6nz r0 = (X.C317876nz) r0
            X.6oG r1 = r0.A00()
            X.6oG r0 = X.C318046oG.STORIES_TEMPLATE
            if (r1 != r0) goto L_0x043b
            r8 = r2
        L_0x0451:
            X.6nz r8 = (X.C317876nz) r8
            if (r8 == 0) goto L_0x0467
            X.8MH r2 = r5.A1A
            X.8ME r2 = (X.AnonymousClass8ME) r2
            r1 = 0
            boolean r0 = r2.A0b
            if (r0 == 0) goto L_0x0467
            r2.A0b = r1
            X.8Mp r1 = r2.A1D
            java.util.List r0 = r8.A0T
            r1.A01(r0)
        L_0x0467:
            return
        L_0x0468:
            int r2 = r2 + 1
            goto L_0x03a3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JY9.A0B(X.JY9, java.util.List):void");
    }

    public static final boolean A0D(JY9 jy9) {
        if (jy9.A0h || jy9.A0j || jy9.A0c || jy9.A0d || jy9.A0i || jy9.A0f || jy9.A0g || jy9.A0e) {
            return true;
        }
        return false;
    }

    public static final boolean A0E(JY9 jy9, float f) {
        float f2;
        int i;
        View view = jy9.A01;
        float f3 = 0.0f;
        if (view != null) {
            f2 = view.getY();
        } else {
            f2 = 0.0f;
        }
        View view2 = jy9.A0u;
        if (view2 != null) {
            i = view2.getTop();
        } else {
            i = 0;
        }
        float f4 = f2 + ((float) i);
        ReboundViewPager reboundViewPager = jy9.A08;
        if (reboundViewPager != null && reboundViewPager.getVisibility() == 0) {
            ReboundViewPager reboundViewPager2 = jy9.A08;
            if (reboundViewPager2 != null) {
                f3 = (float) reboundViewPager2.getTop();
            }
            f4 += f3;
        }
        if (f < f4) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0F() {
        /*
            r4 = this;
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r4.A08
            r3 = 0
            if (r0 == 0) goto L_0x0017
            int r1 = r0.A08
            X.JZ7 r0 = r4.A0B
            if (r0 == 0) goto L_0x0017
            int r0 = r0.A01(r3, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = X.C51967G9n.A04(r0, r3)
        L_0x0017:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r4.A08
            if (r0 == 0) goto L_0x003d
            int r2 = r0.A08
            X.JZ7 r1 = r4.A0B
            if (r1 == 0) goto L_0x003d
            r0 = 1
            int r0 = r1.A01(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x003d
            int r0 = r0.intValue()
        L_0x0030:
            int r3 = r3 + r0
            android.widget.ImageView r0 = r4.A03
            if (r0 == 0) goto L_0x003b
            int r0 = r0.getHeight()
        L_0x0039:
            int r3 = r3 + r0
            return r3
        L_0x003b:
            r0 = 0
            goto L_0x0039
        L_0x003d:
            r0 = 0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JY9.A0F():int");
    }

    public final void A0G() {
        Integer num;
        C64968Ll7 ll7 = this.A0w;
        if (ll7 != null) {
            if (this.A19.A08.A00 instanceof AnonymousClass80O) {
                num = AnonymousClass05K.A0j;
            } else {
                num = AnonymousClass05K.A0u;
            }
            0qQ.A0B(num, 0);
            ll7.A09 = num;
            C64435Lbq lbq = this.A0A;
            if (lbq != null) {
                lbq.A02(ll7, true);
            }
            this.A16.A04();
        }
    }

    public final void A0H() {
        C64966Ll5 ll5 = this.A0x;
        if (ll5 != null) {
            C64435Lbq lbq = this.A0A;
            if (lbq != null) {
                lbq.A02(ll5, true);
            }
            2cs r6 = this.A16;
            double d = r6.A09.A00;
            int i = this.A0z;
            if (d == ((double) i)) {
                r6.A06((double) (((float) i) * 0.100000024f));
            }
        }
    }

    public final void A0I() {
        JZ7 jz7;
        JZ7 jz72 = this.A0B;
        if (jz72 != null) {
            0fE.A00(jz72, -910552982);
        }
        LMR A012 = A01();
        if (A012 != null && (jz7 = this.A0B) != null) {
            jz7.A02(A012, false);
        }
    }

    public final void A0K(L05 l05, Integer num) {
        C64965Ll4 ll4 = this.A0v;
        if (ll4 != null) {
            ll4.A04 = l05;
            if (num == null) {
                if (this.A19.A08.A00 instanceof AnonymousClass80O) {
                    num = AnonymousClass05K.A0j;
                } else {
                    num = AnonymousClass05K.A0u;
                }
            }
            ll4.A0D = num;
            C64435Lbq lbq = this.A0A;
            if (lbq != null) {
                lbq.A02(ll4, true);
            }
            this.A16.A04();
        }
    }

    public final void A0L(Integer num) {
        C64435Lbq lbq;
        this.A0U = num;
        JZL jzl = this.A0L;
        if (jzl != null) {
            boolean z = false;
            if (!this.A0b && (lbq = this.A0A) != null && lbq.A00 == lbq.A02) {
                z = true;
            }
            jzl.A06(z, true);
        }
        JZL jzl2 = this.A0L;
        if (jzl2 != null) {
            jzl2.A03();
        }
        if (A0Q()) {
            this.A16.A06((double) (((float) this.A0z) * 0.100000024f));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.6nz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.6nz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.6nz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.6nz} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N(java.lang.String r7) {
        /*
            r6 = this;
            X.JZ7 r0 = r6.A0B
            if (r0 == 0) goto L_0x0072
            X.6oG r4 = X.C318046oG.AVATAR_SEARCH
            java.util.List r0 = r0.A07
            java.util.Iterator r5 = r0.iterator()
        L_0x000c:
            boolean r0 = r5.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x0076
            java.lang.Object r2 = r5.next()
            r0 = r2
            X.LMR r0 = (X.LMR) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "default_sticker_set_id"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x000c
        L_0x0024:
            X.LMR r2 = (X.LMR) r2
            if (r2 == 0) goto L_0x0072
            java.util.List r0 = r2.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x002e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6nz r0 = (X.C317876nz) r0
            X.6oG r0 = r0.A00()
            if (r0 != r4) goto L_0x002e
            r3 = r1
        L_0x0042:
            X.6nz r3 = (X.C317876nz) r3
            if (r3 == 0) goto L_0x0072
            java.util.List r0 = r3.A0O
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0072
            java.util.List r0 = r3.A0O
            java.lang.Object r1 = X.00k.A0J(r0)
            X.6o8 r1 = (X.C317966o8) r1
            if (r1 == 0) goto L_0x0072
            if (r7 == 0) goto L_0x0073
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r7)
            r1.A0H = r0
            r0 = 2682(0xa7a, float:3.758E-42)
        L_0x0062:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A0S = r0
            X.JZ7 r1 = r6.A0B
            if (r1 == 0) goto L_0x0072
            r0 = -228683378(0xfffffffff25e918e, float:-4.4084248E30)
            X.0fE.A00(r1, r0)
        L_0x0072:
            return
        L_0x0073:
            r0 = 1126(0x466, float:1.578E-42)
            goto L_0x0062
        L_0x0076:
            r2 = r3
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JY9.A0N(java.lang.String):void");
    }

    public final void A0O(boolean z) {
        Integer num;
        long j;
        boolean z2;
        if (z) {
            num = AnonymousClass05K.A01;
            j = 0;
        } else {
            num = AnonymousClass05K.A0N;
            j = 10000;
        }
        if (this.A07 == null) {
            this.A07 = new C61500KAf(this, 12);
            UserSession userSession = this.A18;
            29J r0 = 27p.A01(userSession).A01;
            Location location = null;
            r0.A04.A0C("data_request_start", r0.A00);
            1Wr r1 = 1Wr.A00;
            if (r1 != null) {
                location = r1.getLastLocation(userSession, __redex_internal_original_name);
            }
            C279284yO r7 = (C279284yO) this.A19.A08.A00;
            28D r5 = this.A14;
            AnonymousClass8C9 r02 = this.A1D;
            if (r02 != null) {
                z2 = r02.A03.A0G;
            } else {
                z2 = false;
            }
            1OC A002 = C366758pc.A00(location, r5, userSession, r7, Boolean.valueOf(z2), num, j);
            A002.A00 = this.A07;
            1ES.A03(A002);
        }
    }

    public final boolean A0P() {
        JZ7 jz7 = this.A0B;
        if (jz7 == null) {
            return false;
        }
        for (Object next : jz7.A06) {
            if (0qQ.A0K(((C369238u4) next).A03, "suggested_pinnables")) {
                if (next != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r13 > 0.0f) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0R(float r13, boolean r14) {
        /*
            r12 = this;
            X.82p r0 = r12.A1C
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.8Yz r2 = r0.A0X
            X.2cs r8 = r12.A16
            boolean r0 = r8.A0C()
            r11 = 0
            if (r0 == 0) goto L_0x0022
            r7 = 1
            if (r2 == 0) goto L_0x0023
            X.8aL r1 = X.C358088aL.A0o
            X.8aL r0 = X.C358088aL.A0p
            X.8aL[] r0 = new X.C358088aL[]{r1, r0}
            boolean r0 = r2.A0V(r0)
            if (r0 != r7) goto L_0x0023
        L_0x0022:
            return r11
        L_0x0023:
            X.2ct r5 = r8.A09
            double r3 = r5.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r10 = 0
            if (r0 == 0) goto L_0x0037
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            r6 = 1
            if (r0 <= 0) goto L_0x0038
        L_0x0037:
            r6 = 0
        L_0x0038:
            int r9 = r12.A0z
            double r1 = (double) r9
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0044
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0044
            r11 = 1
        L_0x0044:
            if (r6 != 0) goto L_0x009a
            if (r11 != 0) goto L_0x009a
            boolean r0 = r12.A0Q()
            if (r0 != 0) goto L_0x009a
            r3 = 1163575296(0x455ac000, float:3500.0)
            if (r14 == 0) goto L_0x0056
            r3 = 1176256512(0x461c4000, float:10000.0)
        L_0x0056:
            float r0 = java.lang.Math.abs(r13)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x006a
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x008f
            double r3 = (double) r13
            r8.A07(r3)
        L_0x0066:
            r8.A06(r1)
        L_0x0069:
            return r7
        L_0x006a:
            if (r14 == 0) goto L_0x0073
            float r1 = (float) r9
            r0 = 1036831952(0x3dccccd0, float:0.100000024)
            float r1 = r1 * r0
            double r1 = (double) r1
            goto L_0x0066
        L_0x0073:
            double r5 = r5.A00
            float r10 = (float) r9
            r0 = 1036831952(0x3dccccd0, float:0.100000024)
            float r9 = r10 * r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r9 / r0
            double r3 = (double) r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0097
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            float r10 = r10 * r0
            double r3 = (double) r10
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
            double r1 = (double) r9
            goto L_0x0066
        L_0x008f:
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0069
            double r0 = (double) r13
            r8.A07(r0)
        L_0x0097:
            r1 = 0
            goto L_0x0066
        L_0x009a:
            r12.DmC(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JY9.A0R(float, boolean):boolean");
    }

    public final Set Acf() {
        return this.A1U;
    }

    public final Integer Aci() {
        return this.A0U;
    }

    public final /* synthetic */ boolean CII() {
        return false;
    }

    public final boolean CSP() {
        if (this.A1C.A02.A0A()) {
            return false;
        }
        if (C357638Yz.A03(C358088aL.A0D, this.A19) || this.A0e) {
            return false;
        }
        return true;
    }

    public final boolean CVC() {
        return this.A19.A08.A00 instanceof AnonymousClass80O;
    }

    public final boolean CVI() {
        return this.A19.A08.A00 instanceof AnonymousClass9QA;
    }

    public final void Cw5() {
        KUX kux;
        UserSession userSession = this.A18;
        25x.A00(userSession).A04(new C66309MMs(this, 3));
        A07(this);
        this.A16.A04();
        int i = 2;
        C315596kB.A08(new View[]{this.A08, this.A0S}, true);
        KUX kux2 = this.A0M;
        if (kux2 != null && !kux2.A03) {
            kux2.A03 = true;
            kux2.A06.A9Y(kux2);
            K9K k9k = kux2.A09;
            ArrayList A022 = kux2.A08.A02();
            ArrayList arrayList = k9k.A0D;
            arrayList.clear();
            arrayList.addAll(A022);
            K9K.A01(k9k);
            ArrayList A0U2 = 00k.A0U(kux2.A0C.A00);
            ArrayList arrayList2 = k9k.A0A;
            arrayList2.clear();
            arrayList2.addAll(A0U2);
            K9K.A01(k9k);
            AnonymousClass7TG.A1A(kux2.A04, true);
            KUX.A00(kux2, false);
        }
        JZL jzl = this.A0L;
        if (!(jzl == null || (kux = this.A0M) == null)) {
            kux.A01(AnonymousClass7TF.A0f(jzl.A04), true);
        }
        AnonymousClass7TH.A0R(this.A04);
        27r A012 = 27p.A01(userSession);
        if (this.A0U == AnonymousClass05K.A0C) {
            i = 3;
        }
        A012.A04.A03 = i;
    }

    public final void DSz() {
        AnonymousClass8ME r2 = (AnonymousClass8ME) this.A1A;
        if (!AnonymousClass8ME.A0u(r2)) {
            C3506685r r1 = r2.A18;
            Drawable A112 = r2.A11();
            if (A112 == null) {
                C3506685r.A01(r1);
                r1.A04.A00();
                r1.A02().E2p();
                return;
            }
            C3506685r.A00(A112, r1);
        }
    }

    public final void DT0() {
        25x.A00(this.A18).A04(new C66309MMs(this, 4));
    }

    public final void DT1() {
        ((AnonymousClass8ME) this.A1A).A18.A02().pause();
    }

    public final void DmC(2cs r7) {
        JZ7 jz7;
        C64435Lbq lbq;
        if (this.A0k) {
            A08(this);
            return;
        }
        C71412ct r5 = this.A16.A09;
        if (r5.A00 == ((double) this.A0z)) {
            A03();
            ViewGroup viewGroup = this.A02;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            AnonymousClass7TH.A0R(this.A09);
            JZL jzl = this.A0L;
            if (jzl != null) {
                boolean z = true;
                if (this.A0b || (lbq = this.A0A) == null || lbq.A00 != lbq.A02) {
                    z = false;
                }
                jzl.A06(z, false);
            }
            if (A0P() && (jz7 = this.A0B) != null) {
                0fE.A00(jz7, 1710066081);
            }
        } else if (!A0Q()) {
            JZL jzl2 = this.A0L;
            if (jzl2 != null) {
                jzl2.A04.sendAccessibilityEvent(8);
            }
            if (A0P() && r5.A00 < ((double) A00(this))) {
                A04();
            }
        }
    }

    public final void E0h() {
        C64435Lbq lbq;
        JZL jzl = this.A0L;
        if (jzl != null) {
            boolean z = true;
            if (this.A0b || (lbq = this.A0A) == null || lbq.A00 != lbq.A02) {
                z = false;
            }
            jzl.A06(z, false);
        }
    }

    public final /* synthetic */ boolean Erv() {
        return true;
    }

    public final String getModuleName() {
        if (this.A19.A08.A00 instanceof AnonymousClass80O) {
            return "clips_sticker_tray";
        }
        return "story_stickers_tray";
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A0t = f2;
        return true;
    }

    public static final void A0C(JY9 jy9, boolean z) {
        if (jy9.A0Q()) {
            27r A012 = 27p.A01(jy9.A18);
            A012.A1Q(A012.A04.A0C, "STICKER_TRAY_PEEK");
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = jy9.A09;
        if (touchInterceptorFrameLayout != null && touchInterceptorFrameLayout.getVisibility() == 0) {
            2cs r3 = jy9.A16;
            int i = jy9.A0z;
            if (z) {
                r3.A06((double) i);
                return;
            }
            r3.A08((double) i, true);
            jy9.DmC(r3);
        }
    }

    public final boolean A0Q() {
        if (!A0P()) {
            return false;
        }
        2cs r5 = this.A16;
        if (r5.A09.A00 != ((double) A00(this)) || !r5.A0C()) {
            return false;
        }
        return true;
    }

    public final void Cw4() {
        TextView textView;
        A07(this);
        KUX kux = this.A0M;
        if (kux != null) {
            kux.A03 = false;
            kux.A06.EEH(kux);
            C315596kB.A08(new View[]{kux.A04}, true);
            KUX.A00(kux, false);
        }
        C294975nL.A04(new C65724Lye((Object) this, 6), new View[]{this.A08}, true);
        if (this.A0y) {
            AnonymousClass7TG.A1A(this.A0S, true);
        }
        UserSession userSession = this.A18;
        1Av A002 = 1Au.A00(userSession);
        AnonymousClass8C9 r0 = this.A1D;
        if (r0 != null && !r0.A03.A0G && JTR.A1Z(userSession)) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36321619299346017L)) {
                JZL jzl = this.A0L;
                if (jzl != null) {
                    jzl.A02.setVisibility(0);
                    jzl.A04.setVisibility(0);
                }
                AnonymousClass7TH.A0R(this.A05);
                if (((long) A002.A01.getInt(AnonymousClass000.A00(2586), 0)) < 182.A01(r2, userSession, 36603094276182894L) && (textView = this.A04) != null) {
                    textView.setVisibility(0);
                }
            }
        }
        27p.A01(userSession).A04.A03 = 1;
    }

    public final boolean isScrolledToBottom() {
        C238133Ar A022 = A02();
        if (A022 != null) {
            return A022.COv();
        }
        return false;
    }

    public final boolean isScrolledToTop() {
        C238133Ar A022 = A02();
        if (A022 != null) {
            return A022.COw();
        }
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean A0Q2 = A0Q();
        boolean z = this.A0a;
        if (A0Q2) {
            if (z) {
                this.A0a = false;
                this.A00 = f2;
            }
            if (f2 > 0.0f) {
                this.A16.A06((double) (((float) this.A0z) * 0.100000024f));
                A04();
            } else {
                A0C(this, true);
                return true;
            }
        } else if (z) {
            this.A0a = false;
            this.A00 = f2;
            return true;
        } else if (this.A0Y) {
            A09(this, f2);
            return true;
        }
        return true;
    }

    public final void DSD(MXG mxg, MXG mxg2, float f) {
        AnonymousClass7TG.A1N(mxg, mxg2);
    }

    public JY9(Activity activity, View view, ViewStub viewStub, Fragment fragment, 0hq r10, AnonymousClass07i r11, 28D r12, AnonymousClass0iw r13, UserSession userSession, AnonymousClass3E6 r15, C357638Yz r16, AnonymousClass8MH r17, TargetViewSizeProvider targetViewSizeProvider, A53 a53, C3499582p r20, AnonymousClass8C9 r21, AnonymousClass80U r22, C3499982t r23, C234462xu r24, Map map, Set set, AnonymousClass0eK r27, C62320sa r28, C62320sa r29) {
        int A0H2;
        0qQ.A0B(viewStub, 8);
        this.A1C = r20;
        this.A1E = r22;
        this.A1L = fragment;
        this.A1N = r11;
        this.A1M = r10;
        this.A13 = view;
        this.A1B = a53;
        this.A1K = viewStub;
        this.A18 = userSession;
        this.A1R = r23;
        this.A1S = r24;
        this.A1A = r17;
        this.A1O = r15;
        this.A1V = r27;
        this.A19 = r16;
        this.A14 = r12;
        this.A11 = activity;
        this.A17 = r13;
        this.A1D = r21;
        this.A1W = r28;
        this.A1X = r29;
        this.A0W = map;
        this.A1P = new C354518Mi(userSession);
        Context context = view.getContext();
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A06 = true;
        this.A16 = A0J2;
        GestureDetector gestureDetector = new GestureDetector(context, this, AnonymousClass7TF.A0D());
        this.A12 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A1G = (double) ViewConfiguration.get(context).getScaledTouchSlop();
        this.A1U = DbS.A0y();
        this.A1I = context.getColor(R.color.black_30_transparent);
        if (!(this.A19.A08.A00 instanceof C363138jC) || JWB.A01(userSession)) {
            A0H2 = 2Yu.A0H(activity, R.attr.igds_color_tag_or_toast_background);
        } else {
            A0H2 = R.color.igds_banner_background;
        }
        this.A10 = context.getColor(A0H2);
        this.A1T = set;
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) targetViewSizeProvider;
        AnonymousClass81W r2 = nineSixteenLayoutConfigImpl.A0K;
        this.A1H = r2.getWidth();
        this.A0z = (r2.getHeight() - nineSixteenLayoutConfigImpl.A0D) - targetViewSizeProvider.BQc();
        this.A15 = 02m.A0p;
        this.A1J = new C64286LYm((Object) this, 8);
    }
}
