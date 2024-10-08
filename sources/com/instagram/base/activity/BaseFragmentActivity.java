package com.instagram.base.activity;

import X.002;
import X.02m;
import X.0LA;
import X.0SM;
import X.0Tu;
import X.0b6;
import X.0eO;
import X.0f9;
import X.0fS;
import X.0fh;
import X.0hq;
import X.0kR;
import X.0lg;
import X.0nY;
import X.0qQ;
import X.0sP;
import X.0tS;
import X.0wj;
import X.182;
import X.1wn;
import X.2SP;
import X.2Y9;
import X.2Yu;
import X.2Zp;
import X.2Zq;
import X.2Zr;
import X.2Zs;
import X.2Zt;
import X.2Zu;
import X.2Zv;
import X.2Zw;
import X.2Zx;
import X.2Zy;
import X.2Zz;
import X.2dZ;
import X.2eZ;
import X.2ec;
import X.2el;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass06Q;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1GD;
import X.AnonymousClass2Y8;
import X.AnonymousClass2YH;
import X.AnonymousClass2eo;
import X.AnonymousClass37C;
import X.AnonymousClass3GX;
import X.AnonymousClass3M8;
import X.AnonymousClass6WB;
import X.C226112fe;
import X.C227682jk;
import X.C229102mq;
import X.C239393Gh;
import X.C240643Lr;
import X.C249453jo;
import X.C249463jp;
import X.C249473jq;
import X.C249483jr;
import X.C249493js;
import X.C249503jt;
import X.C2594141p;
import X.C2813557c;
import X.C309516Yo;
import X.C377119Kp;
import X.C392909va;
import X.C51763G0f;
import X.C59843JaJ;
import X.C61170le;
import X.C638918c;
import X.C66579MXk;
import X.C71632eX;
import X.C71652ea;
import X.C71682ef;
import X.C71762ez;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.debug.network.DebugNetworkShapingConfigurationFactory$createNetworkShapingServiceLayerConfiguration$1;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;

public abstract class BaseFragmentActivity extends IgFragmentActivity implements C249453jo, C249463jp, C249473jq, C249483jr, C249493js, C249503jt {
    public int A00;
    public TextView A01;
    public 2dZ A02;
    public AnimatedHintsTextLayout A03;
    public AnonymousClass0eM A04;
    public boolean A05;
    public boolean A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public 2el A0A;
    public 2el A0B;
    public 2ec A0C;
    public C71652ea A0D;
    public C71632eX A0E;
    public C71632eX A0F;
    public C71762ez A0G;
    public boolean A0H = true;
    public final View.OnClickListener A0I = new 2Zz(this);
    public final AnonymousClass06Q A0J = new 2Zp(this);
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;
    public final AnonymousClass0eM A0M;
    public final 1wn A0N = new 2Zw(this);
    public final 1wn A0O = new 2Zu(this);
    public final 1wn A0P = new 2Zy(this);
    public final 1wn A0Q = new 2Zx(this);
    public final 1wn A0R = new 2Zs(this);
    public final 1wn A0S = new 2Zv(this);
    public final 1wn A0T = new 2Zq(this);
    public final 1wn A0U = new 2Zr(this);
    public final 1wn A0V = new 2Zt(this);

    public void A0b() {
    }

    public void A0c() {
    }

    public void A0e() {
    }

    public void A0f() {
    }

    public void A0g() {
    }

    public void A0j(Bundle bundle) {
        int i;
        FragmentActivity fragmentActivity = (ModalActivity) this;
        0fh.A01("ModalActivity.initializeStartingFragment", 569513663);
        try {
            if (fragmentActivity.getSupportFragmentManager().A0P(R.id.layout_container_main) == null) {
                if (fragmentActivity.getIntent().getStringExtra("fragment_name") == null) {
                    fragmentActivity.finish();
                    i = 1021902938;
                } else {
                    String stringExtra = fragmentActivity.getIntent().getStringExtra("fragment_name");
                    String stringExtra2 = fragmentActivity.getIntent().getStringExtra("initial_fragment_backstack_name");
                    if ("bottom_sheet".equals(stringExtra)) {
                        fragmentActivity.A02 = stringExtra;
                        i = 2043545048;
                    } else {
                        Bundle bundleExtra = fragmentActivity.getIntent().getBundleExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS);
                        bundleExtra.getClass();
                        bundleExtra.putAll(new Bundle());
                        0SM A002 = AnonymousClass6WB.A00(bundleExtra, fragmentActivity, fragmentActivity.A01, stringExtra);
                        if (A002 != null) {
                            if (!(A002 instanceof 0SM) || "cds_bloks".equals(stringExtra)) {
                                C309516Yo r2 = new C309516Yo(fragmentActivity, fragmentActivity.A01);
                                r2.A0B(bundleExtra, A002);
                                if (stringExtra2 != null) {
                                    r2.A0A = stringExtra2;
                                    0hq A003 = C229102mq.A00(fragmentActivity);
                                    A003.A0s(new C59843JaJ(A003, fragmentActivity));
                                } else {
                                    r2.A0D = false;
                                }
                                r2.A04();
                            } else {
                                A002.A0B(fragmentActivity.getSupportFragmentManager(), "dialog_fragment");
                            }
                        }
                    }
                }
                0fh.A00(i);
            }
            i = 1173634858;
            0fh.A00(i);
        } catch (Throwable th) {
            0fh.A00(-904135582);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity] */
    public final void A0k(0lg r4) {
        int i = 0;
        TextView textView = this.A08;
        if (textView == null) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.network_shaping_stub);
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
                textView = (TextView) inflate;
                this.A08 = textView;
            } else {
                return;
            }
        }
        if (new DebugNetworkShapingConfigurationFactory$createNetworkShapingServiceLayerConfiguration$1(r4).isNetworkShapingOn()) {
            textView.setText("Slow network enabled (fburl.com/IGBuildEmpathy)");
            textView.setBackgroundColor(getColor(2Yu.A03(this)));
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final 2el CFM() {
        View findViewById;
        synchronized (this) {
            if (this.A0A == null) {
                this.A0A = C71682ef.A01(getSession(), C71682ef.A00());
                this.A0B = C71682ef.A01((0lg) null, C71682ef.A00());
                Window window = getWindow();
                if (!(window == null || window.getDecorView() == null || (findViewById = getWindow().getDecorView().findViewById(16908290)) == null)) {
                    if (this.A0E == null) {
                        this.A0E = new C71632eX(findViewById);
                    }
                    if (this.A0F == null) {
                        this.A0F = new C71632eX(findViewById);
                    }
                    2el r2 = this.A0A;
                    0qQ.A0A(r2);
                    C71632eX r1 = this.A0E;
                    0qQ.A0A(r1);
                    r2.A08(findViewById, r1, new AnonymousClass2eo[0]);
                    C71632eX r22 = this.A0F;
                    if (r22 != null) {
                        2el r12 = this.A0B;
                        if (r12 == null) {
                            0qQ.A0F("viperViewpointManager");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        r12.A08(findViewById, r22, new AnonymousClass2eo[0]);
                    }
                }
            }
        }
        return this.A0A;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.content.ContextWrapper, android.app.Activity] */
    public final void D8a(0tS r5) {
        0qQ.A0B(r5, 0);
        TextView textView = this.A07;
        if (textView == null) {
            View inflate = ((ViewStub) requireViewById(R.id.devserver_indicator_stub)).inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate;
            this.A07 = textView;
        }
        if (r5.A0f()) {
            textView.setText(0tS.A4E.A00().A05());
            textView.setVisibility(0);
            Object CDM = r5.A0r.CDM(r5, 0tS.A4G[52]);
            int i = R.color.red_5;
            if (0qQ.A0K(CDM, "HEALTHY")) {
                i = R.color.green_5;
            } else if (0qQ.A0K(CDM, C66579MXk.A00(489))) {
                i = R.color.clips_gradient_redesign_color_1;
            }
            textView.setBackgroundColor(getBaseContext().getColor(i));
        } else {
            textView.setVisibility(8);
        }
        textView.setTranslationY((float) this.A00);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void E0N(0tS r4) {
        int i = 0;
        0qQ.A0B(r4, 0);
        TextView textView = this.A09;
        if (textView == null) {
            View inflate = ((ViewStub) requireViewById(R.id.whitehat_indicator_stub)).inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate;
            this.A09 = textView;
        }
        if (r4.A0K()) {
            textView.setText(2131976878);
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (!this.A05 && this.A0H) {
            AnonymousClass2Y8.A00(this);
        }
        A0V(configuration);
    }

    public void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        try {
            BaseFragmentActivity.super.onSaveInstanceState(bundle);
            bundle.putBoolean("BaseFragmentActivity.should_allow_rotation", this.A0H);
        } catch (ArrayStoreException e) {
            0f9 AEh = 0wj.A00.AEh(false, "BaseFragmentActivity:onSaveInstanceState", 694553566, 0);
            AEh.ERJ(e);
            AEh.report();
        }
    }

    private final void A0V(Configuration configuration) {
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (2Y9.A02(AnonymousClass2YH.A00(i)) && C392909va.A00(i2).intValue() != 0) {
            2Y9.A00 = true;
            C226112fe.A09 = true;
        }
        0nY.A00().ATE(new 2eZ(this));
    }

    public AnonymousClass3GX A0Y() {
        AnonymousClass0wW r0;
        if (!(this instanceof ModalActivity) || (r0 = ((ModalActivity) this).A01) == null) {
            return null;
        }
        return AnonymousClass3GX.A00(r0);
    }

    public void A0Z() {
        Fragment A0P2;
        0hq childFragmentManager;
        2dZ r6 = this.A02;
        if (r6 != null) {
            0hq supportFragmentManager = getSupportFragmentManager();
            Fragment fragment = null;
            if (supportFragmentManager == null) {
                A0P2 = null;
            } else {
                A0P2 = supportFragmentManager.A0P(R.id.layout_container_main);
                if (A0P2 instanceof C227682jk) {
                    A0P2 = ((C227682jk) A0P2).A02((0sP) null);
                }
                if (!(A0P2 == null || (childFragmentManager = A0P2.getChildFragmentManager()) == null)) {
                    Fragment A0P3 = childFragmentManager.A0P(R.id.layout_container_main);
                    if (A0P3 instanceof C227682jk) {
                        A0P3 = ((C227682jk) A0P3).A02((0sP) null);
                    }
                    fragment = A0P3;
                }
            }
            if (!182.A06(0Tu.A05, getSession(), 36326691655792560L) || fragment == null) {
                AnonymousClass37C.A00(A0P2, r6);
            } else {
                AnonymousClass37C.A00(fragment, r6);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity] */
    public void A0h() {
        if (this instanceof TransparentModalActivity) {
            setTheme(R.style.IgTranslucentWindowPanavisionSoftUpdateButtons);
        } else if (A0m()) {
            AnonymousClass1GD.A01(this);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0i() {
        /*
            r6 = this;
            X.2ea r3 = r6.A0D
            if (r3 != 0) goto L_0x000e
            java.lang.String r0 = "pixelGuideManager"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            X.0tS r2 = r3.A01
            X.0s0 r1 = r2.A1g
            X.0YZ[] r5 = X.0tS.A4G
            r0 = 24
            r0 = r5[r0]
            java.lang.Object r0 = r1.CDM(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            X.2eb r1 = r3.A00
            if (r0 == 0) goto L_0x009f
            r0 = 0
            r1.A03(r0)
            android.view.View r3 = r1.A01()
            com.instagram.ui.pixelguide.PixelGuideView r3 = (com.instagram.ui.pixelguide.PixelGuideView) r3
            X.0s0 r1 = r2.A2L
            r0 = 125(0x7d, float:1.75E-43)
            r0 = r5[r0]
            java.lang.Object r4 = r1.CDM(r2, r0)
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0044
            java.lang.String r4 = "Pixel Grid"
        L_0x0044:
            X.0s0 r1 = r2.A2K
            r0 = 126(0x7e, float:1.77E-43)
            r0 = r5[r0]
            java.lang.Object r0 = r1.CDM(r2, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            android.content.Context r0 = r3.getContext()
            float r0 = X.0nA.A04(r0, r1)
            int r2 = (int) r0
            int r0 = r4.hashCode()
            switch(r0) {
                case -1427524836: goto L_0x006f;
                case -398112099: goto L_0x007f;
                case 1895940554: goto L_0x008f;
                default: goto L_0x0064;
            }
        L_0x0064:
            X.LzH r1 = new X.LzH
            r1.<init>(r2)
        L_0x0069:
            r3.A06 = r1
            r3.invalidate()
            return
        L_0x006f:
            java.lang.String r0 = "Vertical Stripes"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0064
            android.graphics.Paint r0 = r3.A04
            X.Y0s r1 = new X.Y0s
            r1.<init>(r2, r0)
            goto L_0x0069
        L_0x007f:
            java.lang.String r0 = "Vertical And Horizontal Stripes"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0064
            android.graphics.Paint r0 = r3.A04
            X.Y0q r1 = new X.Y0q
            r1.<init>(r2, r0)
            goto L_0x0069
        L_0x008f:
            java.lang.String r0 = "Horizontal Stripes"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0064
            android.graphics.Paint r0 = r3.A04
            X.Y0r r1 = new X.Y0r
            r1.<init>(r2, r0)
            goto L_0x0069
        L_0x009f:
            r0 = 8
            r1.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.BaseFragmentActivity.A0i():void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void A0l(boolean z) {
        int i;
        if (!this.A05 && this.A0H != z) {
            this.A0H = z;
            if (z) {
                AnonymousClass2Y8.A00(this);
                return;
            }
            boolean A062 = 182.A06(0Tu.A05, getSession(), 36329801211986254L);
            boolean A012 = AnonymousClass2Y8.A01(this);
            if (A062) {
                if (A012) {
                    i = 14;
                } else {
                    return;
                }
            } else if (A012) {
                i = 1;
            } else {
                return;
            }
            C2594141p.A00(this, i);
        }
    }

    public boolean A0m() {
        if (this instanceof TransparentModalActivity) {
            return false;
        }
        return true;
    }

    public 2dZ AYJ() {
        if (!this.A06) {
            return this.A02;
        }
        AnonymousClass0eM r0 = this.A04;
        if (r0 != null) {
            return (2dZ) r0.getValue();
        }
        0qQ.A0F("actionBarServiceProvider");
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass3M8 Bx5() {
        return (AnonymousClass3M8) this.A0K.getValue();
    }

    public BaseFragmentActivity() {
        0eO r3 = 0eO.A02;
        this.A0K = AnonymousClass0eN.A00(r3, new C377119Kp(this, 1));
        this.A0M = AnonymousClass0eN.A00(r3, new C377119Kp(this, 4));
        this.A0L = AnonymousClass0eN.A00(r3, new C377119Kp(this, 3));
    }

    private final void A0U() {
        AnonymousClass0wW session;
        if (182.A06(0Tu.A05, getSession(), 36325257136845601L) && (session = getSession()) != null) {
            C239393Gh r0 = (C239393Gh) session.A01(C239393Gh.class, new C51763G0f(session, 9));
            0b6 r1 = 0kR.A00;
            synchronized (r1) {
                r1.A00 = r0;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.content.ContextWrapper, android.app.Activity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0W(com.instagram.base.activity.BaseFragmentActivity r3, X.0tS r4, boolean r5) {
        /*
            boolean r0 = r4.A0S()
            if (r0 == 0) goto L_0x0045
            r1 = 0
            android.widget.TextView r2 = r3.A01
            if (r2 != 0) goto L_0x0021
            r0 = 2131436292(0x7f0b2304, float:1.849445E38)
            android.view.View r0 = r3.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r2 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3.A01 = r2
        L_0x0021:
            boolean r0 = r4.A0S()
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "Meta AI Status"
            r2.setText(r0)
            r2.setVisibility(r1)
            if (r5 == 0) goto L_0x003f
            android.content.Context r1 = r3.getBaseContext()
            r0 = 2131100230(0x7f060246, float:1.7812836E38)
            int r0 = r1.getColor(r0)
            r2.setBackgroundColor(r0)
        L_0x003f:
            int r0 = r3.A00
            float r0 = (float) r0
            r2.setTranslationY(r0)
        L_0x0045:
            return
        L_0x0046:
            r0 = 8
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.BaseFragmentActivity.A0W(com.instagram.base.activity.BaseFragmentActivity, X.0tS, boolean):void");
    }

    public void A0a() {
        A0Z();
        A0d();
        A0e();
        A0c();
        A0b();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0d() {
        /*
            r8 = this;
            X.0hq r0 = r8.getSupportFragmentManager()
            r2 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            r1 = 0
            if (r0 == 0) goto L_0x007d
            androidx.fragment.app.Fragment r5 = r0.A0P(r2)
            boolean r0 = r5 instanceof X.C227682jk
            if (r0 == 0) goto L_0x0018
            X.2jk r5 = (X.C227682jk) r5
            androidx.fragment.app.Fragment r5 = r5.A02(r1)
        L_0x0018:
            if (r5 == 0) goto L_0x007d
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L_0x007d
            X.2dZ r1 = r8.A02
            r4 = 0
            if (r1 == 0) goto L_0x007e
            boolean r0 = r5 instanceof X.C227272iw
            if (r0 == 0) goto L_0x0030
            r0 = r5
            X.2iw r0 = (X.C227272iw) r0
            boolean r0 = r0.COC()
            if (r0 != 0) goto L_0x007e
        L_0x0030:
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x007e
            boolean r0 = r5 instanceof X.AnonymousClass4DS
            if (r0 == 0) goto L_0x007e
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            boolean r0 = X.C227752jr.A01(r5)
            if (r0 != 0) goto L_0x007e
            int r7 = X.AnonymousClass3D4.A00(r8)
        L_0x0044:
            android.view.View r6 = r8.requireViewById(r2)
            X.0qQ.A07(r6)
            X.0wW r0 = r8.getSession()
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x007a
            X.0wW r3 = r8.getSession()
            X.0Tu r2 = X.0Tu.A06
            r0 = 36319218412559383(0x81082300001c17, double:3.031758197632045E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x007a
            X.0eM r0 = r8.A0M
            java.lang.Object r2 = r0.getValue()
            X.3oV r2 = (X.C252063oV) r2
            if (r2 == 0) goto L_0x007a
            java.util.List r1 = java.util.Collections.singletonList(r6)
            X.0qQ.A07(r1)
            X.2dZ r0 = r8.A02
            X.C2813557c.A01(r5, r0, r2, r1)
        L_0x007a:
            r6.setPadding(r4, r7, r4, r4)
        L_0x007d:
            return
        L_0x007e:
            r7 = 0
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.BaseFragmentActivity.A0d():void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public void onAttachedToWindow() {
        Window window;
        BaseFragmentActivity.super.onAttachedToWindow();
        2ec r2 = this.A0C;
        if (r2 != null && (window = getWindow()) != null) {
            r2.A00 = new C240643Lr(window);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x015c: MOVE  (r14v3 com.instagram.common.session.UserSession) = (r14v2 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = 955057209(0x38ed0439, float:1.1301827E-4)
            int r1 = X.AnonymousClass0fD.A00(r0)
            java.lang.String r10 = "onCreate"
            java.lang.Class<com.instagram.base.activity.BaseFragmentActivity> r11 = com.instagram.base.activity.BaseFragmentActivity.class
            r12 = r17
            java.lang.Class r0 = r12.getClass()
            java.lang.String r7 = r0.getName()
            X.02m r6 = X.02m.A0p
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r6 == 0) goto L_0x01e3
            X.2SP r0 = X.2SP.A01
            int r5 = r0.A03()
            r4 = 694558626(0x29661fa2, float:5.1097696E-14)
            r6.markerStart(r4, r5)
            java.lang.String r3 = "endpoint"
            java.lang.String r0 = X.0LA.A00()
            r6.markerAnnotate(r4, r5, r3, r0)
            java.lang.String r3 = "asl_session_id"
            java.lang.String r0 = X.0LA.A01()
            r6.markerAnnotate(r4, r5, r3, r0)
            java.lang.String r3 = "activityClass"
            java.lang.String r9 = "<cls>"
            java.lang.String r8 = "</cls>"
            java.lang.String r0 = X.002.A0g(r9, r7, r8)
            r6.markerAnnotate(r4, r5, r3, r0)
            java.lang.String r7 = "method_class"
            java.lang.String r3 = r11.getName()
            java.lang.String r0 = X.002.A0g(r9, r3, r8)
            r6.markerAnnotate(r4, r5, r7, r0)
            java.lang.String r0 = "operation_name"
            r6.markerAnnotate(r4, r5, r0, r10)
            r0 = 46
            java.lang.String r3 = X.002.A0T(r3, r10, r0)     // Catch:{ all -> 0x01db }
            r9 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x006d
            r0 = -1909702355(0xffffffff8e2c412d, float:-2.1232018E-30)
            X.0fS.A01(r3, r0)     // Catch:{ all -> 0x01db }
        L_0x006d:
            android.os.Bundle r7 = X.C66588MXu.A00(r18)     // Catch:{ all -> 0x01c7 }
            java.lang.String r3 = "BaseFragmentActivity.onCreate"
            r0 = -447893372(0xffffffffe54db084, float:-6.070883E22)
            X.0fh.A01(r3, r0)     // Catch:{ all -> 0x01c7 }
            r12.setupColorTheme()     // Catch:{ all -> 0x01b9 }
            r12.A0h()     // Catch:{ all -> 0x01b9 }
            int r0 = r12.A0X()     // Catch:{ all -> 0x01b9 }
            r12.setContentView((int) r0)     // Catch:{ all -> 0x01b9 }
            r0 = 2
            X.9Kp r3 = new X.9Kp     // Catch:{ all -> 0x01b9 }
            r3.<init>(r12, r0)     // Catch:{ all -> 0x01b9 }
            X.0t0 r3 = X.AnonymousClass0eN.A01(r3)     // Catch:{ all -> 0x01b9 }
            r12.A04 = r3     // Catch:{ all -> 0x01b9 }
            java.lang.String r8 = "BaseFragmentActivity.onInflateActionBar"
            r3 = -1343588759(0xffffffffafea7669, float:-4.2648488E-10)
            X.0fh.A01(r8, r3)     // Catch:{ all -> 0x01b9 }
            boolean r3 = r12.A06     // Catch:{ all -> 0x01ab }
            if (r3 != 0) goto L_0x00b4
            X.0eM r3 = r12.A04     // Catch:{ all -> 0x01ab }
            if (r3 != 0) goto L_0x00ac
            java.lang.String r0 = "actionBarServiceProvider"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01ab }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x01ab }
            throw r0     // Catch:{ all -> 0x01ab }
        L_0x00ac:
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x01ab }
            X.2dZ r3 = (X.2dZ) r3     // Catch:{ all -> 0x01ab }
            r12.A02 = r3     // Catch:{ all -> 0x01ab }
        L_0x00b4:
            r3 = 896739845(0x35732a05, float:9.05857E-7)
            X.0fh.A00(r3)     // Catch:{ all -> 0x01b9 }
            super.onCreate(r7)     // Catch:{ all -> 0x01b9 }
            X.0wW r14 = r12.getSession()     // Catch:{ all -> 0x01b9 }
            if (r14 == 0) goto L_0x010c
            android.view.Window r3 = r12.getWindow()     // Catch:{ all -> 0x01b9 }
            if (r3 == 0) goto L_0x010c
            android.view.View r3 = r3.getDecorView()     // Catch:{ all -> 0x01b9 }
            if (r3 == 0) goto L_0x010c
            android.view.Window r3 = r12.getWindow()     // Catch:{ all -> 0x01b9 }
            android.view.View r3 = r3.getDecorView()     // Catch:{ all -> 0x01b9 }
            android.view.View r3 = r3.findViewById(r2)     // Catch:{ all -> 0x01b9 }
            if (r3 == 0) goto L_0x010c
            monitor-enter(r12)     // Catch:{ all -> 0x01b9 }
            X.2eX r2 = new X.2eX     // Catch:{ all -> 0x0104 }
            r2.<init>(r3)     // Catch:{ all -> 0x0104 }
            r12.A0E = r2     // Catch:{ all -> 0x0104 }
            X.0Tu r8 = X.0Tu.A05     // Catch:{ all -> 0x0104 }
            r2 = 36315687949438443(0x8104ed00000deb, double:3.0295255185383284E-306)
            boolean r2 = X.182.A06(r8, r14, r2)     // Catch:{ all -> 0x0104 }
            if (r2 == 0) goto L_0x010b
            X.0wc r13 = X.AnonymousClass0kN.A02(r14)     // Catch:{ all -> 0x0104 }
            boolean r16 = X.C48316EcZ.A00(r14)     // Catch:{ all -> 0x0104 }
            X.3L1 r15 = X.AnonymousClass3L0.A00(r14)     // Catch:{ all -> 0x0104 }
            X.W2G r11 = X.W2G.A0E     // Catch:{ all -> 0x0104 }
            r11.A04(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0104 }
            goto L_0x010b
        L_0x0104:
            r2 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x01b9 }
            r0 = 1299380892(0x4d72fa9c, float:2.54781888E8)
            goto L_0x01b5
        L_0x010b:
            monitor-exit(r12)     // Catch:{ all -> 0x01b9 }
        L_0x010c:
            android.content.res.Resources r2 = r12.getResources()     // Catch:{ all -> 0x01b9 }
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch:{ all -> 0x01b9 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x01b9 }
            r12.A0V(r2)     // Catch:{ all -> 0x01b9 }
            X.0hq r3 = r12.getSupportFragmentManager()     // Catch:{ all -> 0x01b9 }
            X.06Q r2 = r12.A0J     // Catch:{ all -> 0x01b9 }
            r3.A0s(r2)     // Catch:{ all -> 0x01b9 }
            r12.A0j(r7)     // Catch:{ all -> 0x01b9 }
            r2 = 2131437732(0x7f0b28a4, float:1.849737E38)
            android.view.View r8 = r12.requireViewById(r2)     // Catch:{ all -> 0x01b9 }
            android.view.ViewStub r8 = (android.view.ViewStub) r8     // Catch:{ all -> 0x01b9 }
            X.0tS r3 = X.0tS.A00()     // Catch:{ all -> 0x01b9 }
            X.2ea r2 = new X.2ea     // Catch:{ all -> 0x01b9 }
            r2.<init>(r8, r3)     // Catch:{ all -> 0x01b9 }
            r12.A0D = r2     // Catch:{ all -> 0x01b9 }
            if (r14 == 0) goto L_0x0155
            X.0Tu r8 = X.0Tu.A05     // Catch:{ all -> 0x01b9 }
            r2 = 36312084471939980(0x8101a60001038c, double:3.027246664858261E-306)
            boolean r2 = X.182.A06(r8, r14, r2)     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0155
            X.02m r3 = X.02m.A0p     // Catch:{ all -> 0x01b9 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x01b9 }
            X.2ec r2 = new X.2ec     // Catch:{ all -> 0x01b9 }
            r2.<init>(r3)     // Catch:{ all -> 0x01b9 }
            r12.A0C = r2     // Catch:{ all -> 0x01b9 }
        L_0x0155:
            r12.CFM()     // Catch:{ all -> 0x01b9 }
            boolean r2 = r14 instanceof com.instagram.common.session.UserSession     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0179
            com.instagram.common.session.UserSession r14 = (com.instagram.common.session.UserSession) r14     // Catch:{ all -> 0x01b9 }
            if (r14 == 0) goto L_0x0179
            X.2ew r8 = X.2ev.A00(r14)     // Catch:{ all -> 0x01b9 }
            X.2el r3 = r12.A0B     // Catch:{ all -> 0x01b9 }
            if (r3 != 0) goto L_0x0172
            java.lang.String r0 = "viperViewpointManager"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01b9 }
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            goto L_0x01b8
        L_0x0172:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x01b9 }
            r2.<init>(r3)     // Catch:{ all -> 0x01b9 }
            r8.A00 = r2     // Catch:{ all -> 0x01b9 }
        L_0x0179:
            X.2ez r2 = new X.2ez     // Catch:{ all -> 0x01b9 }
            r2.<init>()     // Catch:{ all -> 0x01b9 }
            r12.A0G = r2     // Catch:{ all -> 0x01b9 }
            r2.A00(r12, r12)     // Catch:{ all -> 0x01b9 }
            if (r7 == 0) goto L_0x018d
            java.lang.String r2 = "BaseFragmentActivity.should_allow_rotation"
            boolean r2 = r7.getBoolean(r2)     // Catch:{ all -> 0x01b9 }
            r12.A0H = r2     // Catch:{ all -> 0x01b9 }
        L_0x018d:
            boolean r2 = r12.A0H     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0194
            X.AnonymousClass2Y8.A00(r12)     // Catch:{ all -> 0x01b9 }
        L_0x0194:
            r2 = 1906932528(0x71a97b30, float:1.6784605E30)
            X.0fh.A00(r2)     // Catch:{ all -> 0x01c7 }
            boolean r2 = com.facebook.systrace.Systrace.A0E(r9)     // Catch:{ all -> 0x01db }
            if (r2 == 0) goto L_0x01a6
            r2 = 116447021(0x6f0d72d, float:9.059414E-35)
            X.0fS.A00(r2)     // Catch:{ all -> 0x01db }
        L_0x01a6:
            r6.markerEnd(r4, r5, r0)
            goto L_0x0310
        L_0x01ab:
            r2 = move-exception
            r0 = -1798023703(0xffffffff94d455e9, float:-2.1440415E-26)
            X.0fh.A00(r0)     // Catch:{ all -> 0x01b9 }
            r0 = -927139192(0xffffffffc8bcfa88, float:-387028.25)
        L_0x01b5:
            X.AnonymousClass0fD.A07(r0, r1)     // Catch:{ all -> 0x01b9 }
        L_0x01b8:
            throw r2     // Catch:{ all -> 0x01b9 }
        L_0x01b9:
            r2 = move-exception
            r0 = -247713302(0xfffffffff13c31ea, float:-9.318964E29)
            X.0fh.A00(r0)     // Catch:{ all -> 0x01c7 }
            r0 = -1731007547(0xffffffff98d2ebc5, float:-5.4521794E-24)
            X.AnonymousClass0fD.A07(r0, r1)     // Catch:{ all -> 0x01c7 }
            throw r2     // Catch:{ all -> 0x01c7 }
        L_0x01c7:
            r2 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x01d4
            r0 = 905115548(0x35f2f79c, float:1.8102469E-6)
            X.0fS.A00(r0)     // Catch:{ all -> 0x01db }
        L_0x01d4:
            r0 = -2135562991(0xffffffff80b5e511, float:-1.6704398E-38)
            X.AnonymousClass0fD.A07(r0, r1)     // Catch:{ all -> 0x01db }
            throw r2     // Catch:{ all -> 0x01db }
        L_0x01db:
            r2 = move-exception
            r0 = 77320781(0x49bd24d, float:3.6633456E-36)
            X.AnonymousClass0fD.A07(r0, r1)     // Catch:{ all -> 0x0330 }
            throw r2     // Catch:{ all -> 0x0330 }
        L_0x01e3:
            android.os.Bundle r4 = X.C66588MXu.A00(r18)
            java.lang.String r3 = "BaseFragmentActivity.onCreate"
            r0 = -836071782(0xffffffffce2a8e9a, float:-7.1536806E8)
            X.0fh.A01(r3, r0)
            r12.setupColorTheme()     // Catch:{ all -> 0x0325 }
            r12.A0h()     // Catch:{ all -> 0x0325 }
            int r0 = r12.A0X()     // Catch:{ all -> 0x0325 }
            r12.setContentView((int) r0)     // Catch:{ all -> 0x0325 }
            r3 = 2
            X.9Kp r0 = new X.9Kp     // Catch:{ all -> 0x0325 }
            r0.<init>(r12, r3)     // Catch:{ all -> 0x0325 }
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)     // Catch:{ all -> 0x0325 }
            r12.A04 = r0     // Catch:{ all -> 0x0325 }
            java.lang.String r3 = "BaseFragmentActivity.onInflateActionBar"
            r0 = 1753183068(0x687f735c, float:4.8253258E24)
            X.0fh.A01(r3, r0)     // Catch:{ all -> 0x0325 }
            boolean r0 = r12.A06     // Catch:{ all -> 0x0317 }
            if (r0 != 0) goto L_0x022a
            X.0eM r0 = r12.A04     // Catch:{ all -> 0x0317 }
            if (r0 != 0) goto L_0x0222
            java.lang.String r0 = "actionBarServiceProvider"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0317 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0317 }
            throw r0     // Catch:{ all -> 0x0317 }
        L_0x0222:
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0317 }
            X.2dZ r0 = (X.2dZ) r0     // Catch:{ all -> 0x0317 }
            r12.A02 = r0     // Catch:{ all -> 0x0317 }
        L_0x022a:
            r0 = -428310113(0xffffffffe678819f, float:-2.933845E23)
            X.0fh.A00(r0)     // Catch:{ all -> 0x0325 }
            super.onCreate(r4)     // Catch:{ all -> 0x0325 }
            X.0wW r14 = r12.getSession()     // Catch:{ all -> 0x0325 }
            if (r14 == 0) goto L_0x0282
            android.view.Window r0 = r12.getWindow()     // Catch:{ all -> 0x0325 }
            if (r0 == 0) goto L_0x0282
            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x0325 }
            if (r0 == 0) goto L_0x0282
            android.view.Window r0 = r12.getWindow()     // Catch:{ all -> 0x0325 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x0325 }
            android.view.View r2 = r0.findViewById(r2)     // Catch:{ all -> 0x0325 }
            if (r2 == 0) goto L_0x0282
            monitor-enter(r12)     // Catch:{ all -> 0x0325 }
            X.2eX r0 = new X.2eX     // Catch:{ all -> 0x027a }
            r0.<init>(r2)     // Catch:{ all -> 0x027a }
            r12.A0E = r0     // Catch:{ all -> 0x027a }
            X.0Tu r0 = X.0Tu.A05     // Catch:{ all -> 0x027a }
            r2 = 36315687949438443(0x8104ed00000deb, double:3.0295255185383284E-306)
            boolean r0 = X.182.A06(r0, r14, r2)     // Catch:{ all -> 0x027a }
            if (r0 == 0) goto L_0x0281
            X.0wc r13 = X.AnonymousClass0kN.A02(r14)     // Catch:{ all -> 0x027a }
            boolean r16 = X.C48316EcZ.A00(r14)     // Catch:{ all -> 0x027a }
            X.3L1 r15 = X.AnonymousClass3L0.A00(r14)     // Catch:{ all -> 0x027a }
            X.W2G r11 = X.W2G.A0E     // Catch:{ all -> 0x027a }
            r11.A04(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x027a }
            goto L_0x0281
        L_0x027a:
            r2 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0325 }
            r0 = -907016705(0xffffffffc9f005ff, float:-1966271.9)
            goto L_0x0321
        L_0x0281:
            monitor-exit(r12)     // Catch:{ all -> 0x0325 }
        L_0x0282:
            android.content.res.Resources r0 = r12.getResources()     // Catch:{ all -> 0x0325 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x0325 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0325 }
            r12.A0V(r0)     // Catch:{ all -> 0x0325 }
            X.0hq r2 = r12.getSupportFragmentManager()     // Catch:{ all -> 0x0325 }
            X.06Q r0 = r12.A0J     // Catch:{ all -> 0x0325 }
            r2.A0s(r0)     // Catch:{ all -> 0x0325 }
            r12.A0j(r4)     // Catch:{ all -> 0x0325 }
            r0 = 2131437732(0x7f0b28a4, float:1.849737E38)
            android.view.View r3 = r12.requireViewById(r0)     // Catch:{ all -> 0x0325 }
            android.view.ViewStub r3 = (android.view.ViewStub) r3     // Catch:{ all -> 0x0325 }
            X.0tS r2 = X.0tS.A00()     // Catch:{ all -> 0x0325 }
            X.2ea r0 = new X.2ea     // Catch:{ all -> 0x0325 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0325 }
            r12.A0D = r0     // Catch:{ all -> 0x0325 }
            if (r14 == 0) goto L_0x02cb
            X.0Tu r0 = X.0Tu.A05     // Catch:{ all -> 0x0325 }
            r2 = 36312084471939980(0x8101a60001038c, double:3.027246664858261E-306)
            boolean r0 = X.182.A06(r0, r14, r2)     // Catch:{ all -> 0x0325 }
            if (r0 == 0) goto L_0x02cb
            X.02m r2 = X.02m.A0p     // Catch:{ all -> 0x0325 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x0325 }
            X.2ec r0 = new X.2ec     // Catch:{ all -> 0x0325 }
            r0.<init>(r2)     // Catch:{ all -> 0x0325 }
            r12.A0C = r0     // Catch:{ all -> 0x0325 }
        L_0x02cb:
            r12.CFM()     // Catch:{ all -> 0x0325 }
            boolean r0 = r14 instanceof com.instagram.common.session.UserSession     // Catch:{ all -> 0x0325 }
            if (r0 == 0) goto L_0x02ef
            com.instagram.common.session.UserSession r14 = (com.instagram.common.session.UserSession) r14     // Catch:{ all -> 0x0325 }
            if (r14 == 0) goto L_0x02ef
            X.2ew r3 = X.2ev.A00(r14)     // Catch:{ all -> 0x0325 }
            X.2el r2 = r12.A0B     // Catch:{ all -> 0x0325 }
            if (r2 != 0) goto L_0x02e8
            java.lang.String r0 = "viperViewpointManager"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0325 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0325 }
            throw r0     // Catch:{ all -> 0x0325 }
        L_0x02e8:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0325 }
            r0.<init>(r2)     // Catch:{ all -> 0x0325 }
            r3.A00 = r0     // Catch:{ all -> 0x0325 }
        L_0x02ef:
            X.2ez r0 = new X.2ez     // Catch:{ all -> 0x0325 }
            r0.<init>()     // Catch:{ all -> 0x0325 }
            r12.A0G = r0     // Catch:{ all -> 0x0325 }
            r0.A00(r12, r12)     // Catch:{ all -> 0x0325 }
            if (r4 == 0) goto L_0x0303
            java.lang.String r0 = "BaseFragmentActivity.should_allow_rotation"
            boolean r0 = r4.getBoolean(r0)     // Catch:{ all -> 0x0325 }
            r12.A0H = r0     // Catch:{ all -> 0x0325 }
        L_0x0303:
            boolean r0 = r12.A0H     // Catch:{ all -> 0x0325 }
            if (r0 == 0) goto L_0x030a
            X.AnonymousClass2Y8.A00(r12)     // Catch:{ all -> 0x0325 }
        L_0x030a:
            r0 = 779879169(0x2e7c0301, float:5.7300834E-11)
            X.0fh.A00(r0)
        L_0x0310:
            r0 = 1609710156(0x5ff23a4c, float:3.4908694E19)
            X.AnonymousClass0fD.A07(r0, r1)
            return
        L_0x0317:
            r2 = move-exception
            r0 = 1189591248(0x46e7b8d0, float:29660.406)
            X.0fh.A00(r0)     // Catch:{ all -> 0x0325 }
            r0 = -1518758445(0xffffffffa57995d3, float:-2.164807E-16)
        L_0x0321:
            X.AnonymousClass0fD.A07(r0, r1)     // Catch:{ all -> 0x0325 }
            throw r2     // Catch:{ all -> 0x0325 }
        L_0x0325:
            r2 = move-exception
            r0 = -2092196963(0xffffffff834b9b9d, float:-5.9834974E-37)
            X.0fh.A00(r0)
            r0 = 1444925805(0x561fd16d, float:4.3930456E13)
            goto L_0x0339
        L_0x0330:
            r2 = move-exception
            r0 = 87
            r6.markerEnd(r4, r5, r0)
            r0 = -735848410(0xffffffffd423d826, float:-2.81482415E12)
        L_0x0339:
            X.AnonymousClass0fD.A07(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.BaseFragmentActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: finally extract failed */
    public void onDestroy() {
        int i;
        int A002 = AnonymousClass0fD.A00(-1127661587);
        Class<BaseFragmentActivity> cls = BaseFragmentActivity.class;
        String name = getClass().getName();
        02m r5 = 02m.A0p;
        if (r5 != null) {
            int A032 = 2SP.A01.A03();
            r5.markerStart(694558626, A032);
            r5.markerAnnotate(694558626, A032, "endpoint", 0LA.A00());
            r5.markerAnnotate(694558626, A032, "asl_session_id", 0LA.A01());
            r5.markerAnnotate(694558626, A032, "activityClass", 002.A0g("<cls>", name, "</cls>"));
            String name2 = cls.getName();
            r5.markerAnnotate(694558626, A032, "method_class", 002.A0g("<cls>", name2, "</cls>"));
            r5.markerAnnotate(694558626, A032, "operation_name", "onDestroy");
            try {
                String A0T2 = 002.A0T(name2, "onDestroy", '.');
                if (Systrace.A0E(1)) {
                    0fS.A01(A0T2, -966313911);
                }
                try {
                    super.onDestroy();
                    synchronized (this) {
                        this.A0A = null;
                    }
                    if (182.A06(0Tu.A05, getSession(), 36330836299170591L)) {
                        this.A02 = null;
                    }
                    if (Systrace.A0E(1)) {
                        0fS.A00(391500929);
                    }
                    r5.markerEnd(694558626, A032, 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1)) {
                        0fS.A00(1484951552);
                    }
                    AnonymousClass0fD.A07(1120018031, A002);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    AnonymousClass0fD.A07(-1281020207, A002);
                    throw th2;
                } catch (Throwable th3) {
                    th = th3;
                    r5.markerEnd(694558626, A032, 87);
                    i = 1924454978;
                    AnonymousClass0fD.A07(i, A002);
                    throw th;
                }
            }
        } else {
            super.onDestroy();
            synchronized (this) {
                try {
                    this.A0A = null;
                } catch (Throwable th4) {
                    th = th4;
                    i = -1312980215;
                    AnonymousClass0fD.A07(i, A002);
                    throw th;
                }
            }
            if (182.A06(0Tu.A05, getSession(), 36330836299170591L)) {
                this.A02 = null;
            }
        }
        AnonymousClass0fD.A07(574213189, A002);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onDetachedFromWindow() {
        BaseFragmentActivity.super.onDetachedFromWindow();
        2ec r1 = this.A0C;
        if (r1 != null) {
            C240643Lr r0 = r1.A00;
            if (r0 != null) {
                r0.A00();
            }
            r1.A00 = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0105: MOVE  (r8v2 com.instagram.common.session.UserSession) = (r8v1 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public void onPause() {
        /*
            r11 = this;
            r0 = 99066112(0x5e7a100, float:2.1782278E-35)
            int r4 = X.AnonymousClass0fD.A00(r0)
            java.lang.String r9 = "onPause"
            java.lang.Class<com.instagram.base.activity.BaseFragmentActivity> r10 = com.instagram.base.activity.BaseFragmentActivity.class
            java.lang.Class r0 = r11.getClass()
            java.lang.String r6 = r0.getName()
            X.02m r5 = X.02m.A0p
            if (r5 == 0) goto L_0x0147
            X.2SP r0 = X.2SP.A01
            int r3 = r0.A03()
            r2 = 694558626(0x29661fa2, float:5.1097696E-14)
            r5.markerStart(r2, r3)
            java.lang.String r1 = "endpoint"
            java.lang.String r0 = X.0LA.A00()
            r5.markerAnnotate(r2, r3, r1, r0)
            java.lang.String r1 = "asl_session_id"
            java.lang.String r0 = X.0LA.A01()
            r5.markerAnnotate(r2, r3, r1, r0)
            java.lang.String r1 = "activityClass"
            java.lang.String r8 = "<cls>"
            java.lang.String r7 = "</cls>"
            java.lang.String r0 = X.002.A0g(r8, r6, r7)
            r5.markerAnnotate(r2, r3, r1, r0)
            java.lang.String r6 = "method_class"
            java.lang.String r1 = r10.getName()
            java.lang.String r0 = X.002.A0g(r8, r1, r7)
            r5.markerAnnotate(r2, r3, r6, r0)
            java.lang.String r0 = "operation_name"
            r5.markerAnnotate(r2, r3, r0, r9)
            r0 = 46
            java.lang.String r1 = X.002.A0T(r1, r9, r0)     // Catch:{ all -> 0x013f }
            r9 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0068
            r0 = -1770846098(0xffffffff9673086e, float:-1.9632044E-25)
            X.0fS.A01(r1, r0)     // Catch:{ all -> 0x013f }
        L_0x0068:
            super.onPause()     // Catch:{ all -> 0x012b }
            X.1xC r6 = X.1xC.A01     // Catch:{ all -> 0x012b }
            java.lang.Class<X.3GP> r1 = X.AnonymousClass3GP.class
            X.1wn r0 = r11.A0T     // Catch:{ all -> 0x012b }
            r6.A03(r0, r1)     // Catch:{ all -> 0x012b }
            java.lang.Class<X.3GQ> r1 = X.AnonymousClass3GQ.class
            X.1wn r0 = r11.A0U     // Catch:{ all -> 0x012b }
            r6.A03(r0, r1)     // Catch:{ all -> 0x012b }
            java.lang.Class<X.3GR> r1 = X.AnonymousClass3GR.class
            X.1wn r0 = r11.A0N     // Catch:{ all -> 0x012b }
            r6.A03(r0, r1)     // Catch:{ all -> 0x012b }
            java.lang.Class<X.3GS> r1 = X.AnonymousClass3GS.class
            X.1wn r0 = r11.A0R     // Catch:{ all -> 0x012b }
            r6.A03(r0, r1)     // Catch:{ all -> 0x012b }
            java.lang.Class<X.3GT> r1 = X.AnonymousClass3GT.class
            X.1wn r0 = r11.A0V     // Catch:{ all -> 0x012b }
            r6.A03(r0, r1)     // Catch:{ all -> 0x012b }
            java.lang.Class<X.3GU> r1 = X.AnonymousClass3GU.class
            X.1wn r0 = r11.A0O     // Catch:{ all -> 0x012b }
            r6.A03(r0, r1)     // Catch:{ all -> 0x012b }
            java.lang.Class<X.3GV> r1 = X.AnonymousClass3GV.class
            X.1wn r0 = r11.A0S     // Catch:{ all -> 0x012b }
            r6.A03(r0, r1)     // Catch:{ all -> 0x012b }
            java.lang.Class<X.3GW> r1 = X.AnonymousClass3GW.class
            X.1wn r0 = r11.A0Q     // Catch:{ all -> 0x012b }
            r6.A03(r0, r1)     // Catch:{ all -> 0x012b }
            X.0wW r8 = r11.getSession()     // Catch:{ all -> 0x012b }
            if (r8 == 0) goto L_0x00c6
            monitor-enter(r11)     // Catch:{ all -> 0x012b }
            X.2eX r0 = r11.A0E     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00ba
            r0.A02()     // Catch:{ all -> 0x00b4 }
            goto L_0x00ba
        L_0x00b4:
            r1 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x012b }
            r0 = -1442534514(0xffffffffaa04ab8e, float:-1.1783475E-13)
            goto L_0x0127
        L_0x00ba:
            monitor-exit(r11)     // Catch:{ all -> 0x012b }
            X.1Ng r6 = X.AnonymousClass1Nd.A00(r8)     // Catch:{ all -> 0x012b }
            java.lang.Class<X.6WK> r1 = X.AnonymousClass6WK.class
            X.1wn r0 = r11.A0P     // Catch:{ all -> 0x012b }
            r6.A02(r0, r1)     // Catch:{ all -> 0x012b }
        L_0x00c6:
            monitor-enter(r11)     // Catch:{ all -> 0x012b }
            X.2eX r0 = r11.A0F     // Catch:{ all -> 0x0122 }
            if (r0 == 0) goto L_0x00ce
            r0.A02()     // Catch:{ all -> 0x0122 }
        L_0x00ce:
            monitor-exit(r11)     // Catch:{ all -> 0x012b }
            X.3GX r1 = r11.A0Y()     // Catch:{ all -> 0x012b }
            if (r1 == 0) goto L_0x00da
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x012b }
            r1.A05(r0)     // Catch:{ all -> 0x012b }
        L_0x00da:
            X.2ec r1 = r11.A0C     // Catch:{ all -> 0x012b }
            if (r1 == 0) goto L_0x00f0
            X.3Lr r0 = r1.A00     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x00e5
            r0.A00()     // Catch:{ all -> 0x012b }
        L_0x00e5:
            X.2ee r1 = r1.A02     // Catch:{ all -> 0x012b }
            r0 = 0
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x012b }
            java.util.List r0 = X.AnonymousClass3GZ.A02     // Catch:{ all -> 0x012b }
            r0.remove(r1)     // Catch:{ all -> 0x012b }
        L_0x00f0:
            X.0wW r7 = r11.getSession()     // Catch:{ all -> 0x012b }
            X.0Tu r6 = X.0Tu.A05     // Catch:{ all -> 0x012b }
            r0 = 36315202619706455(0x81047c00180c57, double:3.029218594061553E-306)
            boolean r0 = X.182.A06(r6, r7, r0)     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0110
            boolean r0 = r8 instanceof com.instagram.common.session.UserSession     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0110
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8     // Catch:{ all -> 0x012b }
            if (r8 == 0) goto L_0x0110
            X.2ew r0 = X.2ev.A00(r8)     // Catch:{ all -> 0x012b }
            r0.A05()     // Catch:{ all -> 0x012b }
        L_0x0110:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x011c
            r0 = 1601902837(0x5f7b18f5, float:1.8093481E19)
            X.0fS.A00(r0)     // Catch:{ all -> 0x013f }
        L_0x011c:
            r0 = 2
            r5.markerEnd(r2, r3, r0)
            goto L_0x01ef
        L_0x0122:
            r1 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x012b }
            r0 = 1797888698(0x6b299aba, float:2.0503914E26)
        L_0x0127:
            X.AnonymousClass0fD.A07(r0, r4)     // Catch:{ all -> 0x012b }
            throw r1     // Catch:{ all -> 0x012b }
        L_0x012b:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0138
            r0 = -254572362(0xfffffffff0d388b6, float:-5.237329E29)
            X.0fS.A00(r0)     // Catch:{ all -> 0x013f }
        L_0x0138:
            r0 = 1706362663(0x65b50727, float:1.0686003E23)
            X.AnonymousClass0fD.A07(r0, r4)     // Catch:{ all -> 0x013f }
            throw r1     // Catch:{ all -> 0x013f }
        L_0x013f:
            r1 = move-exception
            r0 = 418180014(0x18ecebae, float:6.1242546E-24)
            X.AnonymousClass0fD.A07(r0, r4)     // Catch:{ all -> 0x01fc }
            throw r1     // Catch:{ all -> 0x01fc }
        L_0x0147:
            super.onPause()
            X.1xC r2 = X.1xC.A01
            java.lang.Class<X.3GP> r1 = X.AnonymousClass3GP.class
            X.1wn r0 = r11.A0T
            r2.A03(r0, r1)
            java.lang.Class<X.3GQ> r1 = X.AnonymousClass3GQ.class
            X.1wn r0 = r11.A0U
            r2.A03(r0, r1)
            java.lang.Class<X.3GR> r1 = X.AnonymousClass3GR.class
            X.1wn r0 = r11.A0N
            r2.A03(r0, r1)
            java.lang.Class<X.3GS> r1 = X.AnonymousClass3GS.class
            X.1wn r0 = r11.A0R
            r2.A03(r0, r1)
            java.lang.Class<X.3GT> r1 = X.AnonymousClass3GT.class
            X.1wn r0 = r11.A0V
            r2.A03(r0, r1)
            java.lang.Class<X.3GU> r1 = X.AnonymousClass3GU.class
            X.1wn r0 = r11.A0O
            r2.A03(r0, r1)
            java.lang.Class<X.3GV> r1 = X.AnonymousClass3GV.class
            X.1wn r0 = r11.A0S
            r2.A03(r0, r1)
            java.lang.Class<X.3GW> r1 = X.AnonymousClass3GW.class
            X.1wn r0 = r11.A0Q
            r2.A03(r0, r1)
            X.0wW r5 = r11.getSession()
            if (r5 == 0) goto L_0x01a5
            monitor-enter(r11)
            X.2eX r0 = r11.A0E     // Catch:{ all -> 0x0193 }
            if (r0 == 0) goto L_0x0199
            r0.A02()     // Catch:{ all -> 0x0193 }
            goto L_0x0199
        L_0x0193:
            r1 = move-exception
            monitor-exit(r11)
            r0 = -32842549(0xfffffffffe0adccb, float:-4.614497E37)
            goto L_0x0205
        L_0x0199:
            monitor-exit(r11)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r5)
            java.lang.Class<X.6WK> r1 = X.AnonymousClass6WK.class
            X.1wn r0 = r11.A0P
            r2.A02(r0, r1)
        L_0x01a5:
            monitor-enter(r11)
            X.2eX r0 = r11.A0F     // Catch:{ all -> 0x01f6 }
            if (r0 == 0) goto L_0x01ad
            r0.A02()     // Catch:{ all -> 0x01f6 }
        L_0x01ad:
            monitor-exit(r11)
            X.3GX r1 = r11.A0Y()
            if (r1 == 0) goto L_0x01b9
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A05(r0)
        L_0x01b9:
            X.2ec r1 = r11.A0C
            if (r1 == 0) goto L_0x01cf
            X.3Lr r0 = r1.A00
            if (r0 == 0) goto L_0x01c4
            r0.A00()
        L_0x01c4:
            X.2ee r1 = r1.A02
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r0 = X.AnonymousClass3GZ.A02
            r0.remove(r1)
        L_0x01cf:
            X.0wW r3 = r11.getSession()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315202619706455(0x81047c00180c57, double:3.029218594061553E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01ef
            boolean r0 = r5 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x01ef
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            if (r5 == 0) goto L_0x01ef
            X.2ew r0 = X.2ev.A00(r5)
            r0.A05()
        L_0x01ef:
            r0 = -1984118016(0xffffffff89bcc300, float:-4.544273E-33)
            X.AnonymousClass0fD.A07(r0, r4)
            return
        L_0x01f6:
            r1 = move-exception
            monitor-exit(r11)
            r0 = 1757113805(0x68bb6dcd, float:7.080864E24)
            goto L_0x0205
        L_0x01fc:
            r1 = move-exception
            r0 = 87
            r5.markerEnd(r2, r3, r0)
            r0 = 1611648841(0x600fcf49, float:4.1450326E19)
        L_0x0205:
            X.AnonymousClass0fD.A07(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.BaseFragmentActivity.onPause():void");
    }

    public final void onPostResume() {
        A0f();
        super.onPostResume();
        A0g();
        C638918c.A01(C61170le.A00).A0F();
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00e2: MOVE  (r0v95 com.instagram.common.session.UserSession) = (r7v3 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public void onResume() {
        /*
            r12 = this;
            r0 = -278735019(0xffffffffef62d755, float:-7.0203933E28)
            int r3 = X.AnonymousClass0fD.A00(r0)
            java.lang.String r10 = "onResume"
            java.lang.Class<com.instagram.base.activity.BaseFragmentActivity> r11 = com.instagram.base.activity.BaseFragmentActivity.class
            java.lang.Class r0 = r12.getClass()
            java.lang.String r7 = r0.getName()
            X.02m r5 = X.02m.A0p
            r6 = 0
            if (r5 == 0) goto L_0x01d3
            X.2SP r0 = X.2SP.A01
            int r4 = r0.A03()
            r2 = 694558626(0x29661fa2, float:5.1097696E-14)
            r5.markerStart(r2, r4)
            java.lang.String r1 = "endpoint"
            java.lang.String r0 = X.0LA.A00()
            r5.markerAnnotate(r2, r4, r1, r0)
            java.lang.String r1 = "asl_session_id"
            java.lang.String r0 = X.0LA.A01()
            r5.markerAnnotate(r2, r4, r1, r0)
            java.lang.String r1 = "activityClass"
            java.lang.String r9 = "<cls>"
            java.lang.String r8 = "</cls>"
            java.lang.String r0 = X.002.A0g(r9, r7, r8)
            r5.markerAnnotate(r2, r4, r1, r0)
            java.lang.String r7 = "method_class"
            java.lang.String r1 = r11.getName()
            java.lang.String r0 = X.002.A0g(r9, r1, r8)
            r5.markerAnnotate(r2, r4, r7, r0)
            java.lang.String r0 = "operation_name"
            r5.markerAnnotate(r2, r4, r0, r10)
            r0 = 46
            java.lang.String r1 = X.002.A0T(r1, r10, r0)     // Catch:{ all -> 0x01cb }
            r10 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)     // Catch:{ all -> 0x01cb }
            if (r0 == 0) goto L_0x0069
            r0 = 1886615718(0x707378a6, float:3.0140285E29)
            X.0fS.A01(r1, r0)     // Catch:{ all -> 0x01cb }
        L_0x0069:
            super.onResume()     // Catch:{ all -> 0x01b7 }
            r12.A0a()     // Catch:{ all -> 0x01b7 }
            X.1xC r7 = X.1xC.A01     // Catch:{ all -> 0x01b7 }
            java.lang.Class<X.3GP> r1 = X.AnonymousClass3GP.class
            X.1wn r0 = r12.A0T     // Catch:{ all -> 0x01b7 }
            r7.A02(r0, r1)     // Catch:{ all -> 0x01b7 }
            java.lang.Class<X.3GQ> r1 = X.AnonymousClass3GQ.class
            X.1wn r0 = r12.A0U     // Catch:{ all -> 0x01b7 }
            r7.A02(r0, r1)     // Catch:{ all -> 0x01b7 }
            java.lang.Class<X.3GR> r1 = X.AnonymousClass3GR.class
            X.1wn r0 = r12.A0N     // Catch:{ all -> 0x01b7 }
            r7.A02(r0, r1)     // Catch:{ all -> 0x01b7 }
            java.lang.Class<X.3GS> r1 = X.AnonymousClass3GS.class
            X.1wn r0 = r12.A0R     // Catch:{ all -> 0x01b7 }
            r7.A02(r0, r1)     // Catch:{ all -> 0x01b7 }
            java.lang.Class<X.3GT> r1 = X.AnonymousClass3GT.class
            X.1wn r0 = r12.A0V     // Catch:{ all -> 0x01b7 }
            r7.A02(r0, r1)     // Catch:{ all -> 0x01b7 }
            java.lang.Class<X.3GU> r1 = X.AnonymousClass3GU.class
            X.1wn r0 = r12.A0O     // Catch:{ all -> 0x01b7 }
            r7.A02(r0, r1)     // Catch:{ all -> 0x01b7 }
            java.lang.Class<X.3GV> r1 = X.AnonymousClass3GV.class
            X.1wn r0 = r12.A0S     // Catch:{ all -> 0x01b7 }
            r7.A02(r0, r1)     // Catch:{ all -> 0x01b7 }
            java.lang.Class<X.3GW> r1 = X.AnonymousClass3GW.class
            X.1wn r0 = r12.A0Q     // Catch:{ all -> 0x01b7 }
            r7.A02(r0, r1)     // Catch:{ all -> 0x01b7 }
            X.0wW r7 = r12.getSession()     // Catch:{ all -> 0x01b7 }
            if (r7 == 0) goto L_0x00c0
            monitor-enter(r12)     // Catch:{ all -> 0x01b7 }
            X.2eX r0 = r12.A0E     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00bf
            r0.A01()     // Catch:{ all -> 0x00b8 }
            goto L_0x00bf
        L_0x00b8:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x01b7 }
            r0 = 1301562503(0x4d944487, float:3.10939872E8)
            goto L_0x01b3
        L_0x00bf:
            monitor-exit(r12)     // Catch:{ all -> 0x01b7 }
        L_0x00c0:
            monitor-enter(r12)     // Catch:{ all -> 0x01b7 }
            X.2eX r0 = r12.A0F     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x00c8
            r0.A01()     // Catch:{ all -> 0x01ae }
        L_0x00c8:
            monitor-exit(r12)     // Catch:{ all -> 0x01b7 }
            X.0wW r8 = r12.getSession()     // Catch:{ all -> 0x01b7 }
            X.0Tu r9 = X.0Tu.A05     // Catch:{ all -> 0x01b7 }
            r0 = 36315202619378773(0x81047c00130c55, double:3.029218593854326E-306)
            boolean r0 = X.182.A06(r9, r8, r0)     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x0100
            r12.CFM()     // Catch:{ all -> 0x01b7 }
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x0100
            r0 = r7
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x0100
            X.2ew r8 = X.2ev.A00(r0)     // Catch:{ all -> 0x01b7 }
            X.2el r1 = r12.A0B     // Catch:{ all -> 0x01b7 }
            if (r1 != 0) goto L_0x00f9
            java.lang.String r0 = "viperViewpointManager"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01b7 }
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x01b6
        L_0x00f9:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x01b7 }
            r0.<init>(r1)     // Catch:{ all -> 0x01b7 }
            r8.A00 = r0     // Catch:{ all -> 0x01b7 }
        L_0x0100:
            r12.A0i()     // Catch:{ all -> 0x01b7 }
            X.0xi r8 = X.0tS.A4E     // Catch:{ all -> 0x01b7 }
            X.0tS r1 = r8.A00()     // Catch:{ all -> 0x01b7 }
            boolean r0 = r1.A0f()     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x0112
            r12.D8a(r1)     // Catch:{ all -> 0x01b7 }
        L_0x0112:
            boolean r0 = r1.A0K()     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x011b
            r12.E0N(r1)     // Catch:{ all -> 0x01b7 }
        L_0x011b:
            A0W(r12, r1, r6)     // Catch:{ all -> 0x01b7 }
            X.0tS r0 = r8.A00()     // Catch:{ all -> 0x01b7 }
            boolean r0 = r0.A0O()     // Catch:{ all -> 0x01b7 }
            if (r0 != 0) goto L_0x0139
            X.0tS r0 = r8.A00()     // Catch:{ all -> 0x01b7 }
            boolean r0 = r0.A0P()     // Catch:{ all -> 0x01b7 }
            if (r0 != 0) goto L_0x0139
            X.0tS r0 = r8.A00()     // Catch:{ all -> 0x01b7 }
            r0.A0Q()     // Catch:{ all -> 0x01b7 }
        L_0x0139:
            if (r7 == 0) goto L_0x015c
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x014b
            r0 = r7
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x01b7 }
            boolean r0 = X.1CI.A00(r0)     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x014b
            r12.A0k(r7)     // Catch:{ all -> 0x01b7 }
        L_0x014b:
            boolean r0 = r1.A0S()     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x015c
            X.1Ng r8 = X.AnonymousClass1Nd.A00(r7)     // Catch:{ all -> 0x01b7 }
            java.lang.Class<X.6WK> r1 = X.AnonymousClass6WK.class
            X.1wn r0 = r12.A0P     // Catch:{ all -> 0x01b7 }
            r8.A01(r0, r1)     // Catch:{ all -> 0x01b7 }
        L_0x015c:
            X.3GX r1 = r12.A0Y()     // Catch:{ all -> 0x01b7 }
            if (r1 == 0) goto L_0x0167
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x01b7 }
            r1.A05(r0)     // Catch:{ all -> 0x01b7 }
        L_0x0167:
            X.2ec r0 = r12.A0C     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x017b
            X.2ee r8 = r0.A02     // Catch:{ all -> 0x01b7 }
            X.0qQ.A0B(r8, r6)     // Catch:{ all -> 0x01b7 }
            java.util.List r1 = X.AnonymousClass3GZ.A02     // Catch:{ all -> 0x01b7 }
            boolean r0 = r1.contains(r8)     // Catch:{ all -> 0x01b7 }
            if (r0 != 0) goto L_0x017b
            r1.add(r8)     // Catch:{ all -> 0x01b7 }
        L_0x017b:
            X.0wW r6 = r12.getSession()     // Catch:{ all -> 0x01b7 }
            r0 = 36315202619706455(0x81047c00180c57, double:3.029218594061553E-306)
            boolean r0 = X.182.A06(r9, r6, r0)     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x0199
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x0199
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7     // Catch:{ all -> 0x01b7 }
            if (r7 == 0) goto L_0x0199
            X.2ew r0 = X.2ev.A00(r7)     // Catch:{ all -> 0x01b7 }
            r0.A04()     // Catch:{ all -> 0x01b7 }
        L_0x0199:
            r12.A0U()     // Catch:{ all -> 0x01b7 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)     // Catch:{ all -> 0x01cb }
            if (r0 == 0) goto L_0x01a8
            r0 = -1530973069(0xffffffffa4bf3473, float:-8.29219E-17)
            X.0fS.A00(r0)     // Catch:{ all -> 0x01cb }
        L_0x01a8:
            r0 = 2
            r5.markerEnd(r2, r4, r0)
            goto L_0x0305
        L_0x01ae:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x01b7 }
            r0 = -1000855531(0xffffffffc4582815, float:-864.6263)
        L_0x01b3:
            X.AnonymousClass0fD.A07(r0, r3)     // Catch:{ all -> 0x01b7 }
        L_0x01b6:
            throw r1     // Catch:{ all -> 0x01b7 }
        L_0x01b7:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)     // Catch:{ all -> 0x01cb }
            if (r0 == 0) goto L_0x01c4
            r0 = -1300633109(0xffffffffb279e9eb, float:-1.4546894E-8)
            X.0fS.A00(r0)     // Catch:{ all -> 0x01cb }
        L_0x01c4:
            r0 = 1543365632(0x5bfde400, float:1.42927716E17)
            X.AnonymousClass0fD.A07(r0, r3)     // Catch:{ all -> 0x01cb }
            throw r1     // Catch:{ all -> 0x01cb }
        L_0x01cb:
            r1 = move-exception
            r0 = -1547005445(0xffffffffa3ca91fb, float:-2.1962709E-17)
            X.AnonymousClass0fD.A07(r0, r3)     // Catch:{ all -> 0x0312 }
            throw r1     // Catch:{ all -> 0x0312 }
        L_0x01d3:
            super.onResume()
            r12.A0a()
            X.1xC r2 = X.1xC.A01
            java.lang.Class<X.3GP> r1 = X.AnonymousClass3GP.class
            X.1wn r0 = r12.A0T
            r2.A02(r0, r1)
            java.lang.Class<X.3GQ> r1 = X.AnonymousClass3GQ.class
            X.1wn r0 = r12.A0U
            r2.A02(r0, r1)
            java.lang.Class<X.3GR> r1 = X.AnonymousClass3GR.class
            X.1wn r0 = r12.A0N
            r2.A02(r0, r1)
            java.lang.Class<X.3GS> r1 = X.AnonymousClass3GS.class
            X.1wn r0 = r12.A0R
            r2.A02(r0, r1)
            java.lang.Class<X.3GT> r1 = X.AnonymousClass3GT.class
            X.1wn r0 = r12.A0V
            r2.A02(r0, r1)
            java.lang.Class<X.3GU> r1 = X.AnonymousClass3GU.class
            X.1wn r0 = r12.A0O
            r2.A02(r0, r1)
            java.lang.Class<X.3GV> r1 = X.AnonymousClass3GV.class
            X.1wn r0 = r12.A0S
            r2.A02(r0, r1)
            java.lang.Class<X.3GW> r1 = X.AnonymousClass3GW.class
            X.1wn r0 = r12.A0Q
            r2.A02(r0, r1)
            X.0wW r4 = r12.getSession()
            if (r4 == 0) goto L_0x022a
            monitor-enter(r12)
            X.2eX r0 = r12.A0E     // Catch:{ all -> 0x0222 }
            if (r0 == 0) goto L_0x0229
            r0.A01()     // Catch:{ all -> 0x0222 }
            goto L_0x0229
        L_0x0222:
            r1 = move-exception
            monitor-exit(r12)
            r0 = -434062451(0xffffffffe620bb8d, float:-1.8975958E23)
            goto L_0x031b
        L_0x0229:
            monitor-exit(r12)
        L_0x022a:
            monitor-enter(r12)
            X.2eX r0 = r12.A0F     // Catch:{ all -> 0x030c }
            if (r0 == 0) goto L_0x0232
            r0.A01()     // Catch:{ all -> 0x030c }
        L_0x0232:
            monitor-exit(r12)
            X.0wW r2 = r12.getSession()
            X.0Tu r5 = X.0Tu.A05
            r0 = 36315202619378773(0x81047c00130c55, double:3.029218593854326E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x0269
            r12.CFM()
            boolean r0 = r4 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0269
            r0 = r4
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            if (r0 == 0) goto L_0x0269
            X.2ew r2 = X.2ev.A00(r0)
            X.2el r1 = r12.A0B
            if (r1 != 0) goto L_0x0262
            java.lang.String r0 = "viperViewpointManager"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0262:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r2.A00 = r0
        L_0x0269:
            r12.A0i()
            X.0xi r2 = X.0tS.A4E
            X.0tS r1 = r2.A00()
            boolean r0 = r1.A0f()
            if (r0 == 0) goto L_0x027b
            r12.D8a(r1)
        L_0x027b:
            boolean r0 = r1.A0K()
            if (r0 == 0) goto L_0x0284
            r12.E0N(r1)
        L_0x0284:
            A0W(r12, r1, r6)
            X.0tS r0 = r2.A00()
            boolean r0 = r0.A0O()
            if (r0 != 0) goto L_0x02a2
            X.0tS r0 = r2.A00()
            boolean r0 = r0.A0P()
            if (r0 != 0) goto L_0x02a2
            X.0tS r0 = r2.A00()
            r0.A0Q()
        L_0x02a2:
            if (r4 == 0) goto L_0x02c5
            boolean r0 = r4 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x02b4
            r0 = r4
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r0 = X.1CI.A00(r0)
            if (r0 == 0) goto L_0x02b4
            r12.A0k(r4)
        L_0x02b4:
            boolean r0 = r1.A0S()
            if (r0 == 0) goto L_0x02c5
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r4)
            java.lang.Class<X.6WK> r1 = X.AnonymousClass6WK.class
            X.1wn r0 = r12.A0P
            r2.A01(r0, r1)
        L_0x02c5:
            X.3GX r1 = r12.A0Y()
            if (r1 == 0) goto L_0x02d0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A05(r0)
        L_0x02d0:
            X.2ec r0 = r12.A0C
            if (r0 == 0) goto L_0x02e4
            X.2ee r2 = r0.A02
            X.0qQ.A0B(r2, r6)
            java.util.List r1 = X.AnonymousClass3GZ.A02
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L_0x02e4
            r1.add(r2)
        L_0x02e4:
            X.0wW r2 = r12.getSession()
            r0 = 36315202619706455(0x81047c00180c57, double:3.029218594061553E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x0302
            boolean r0 = r4 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0302
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            if (r4 == 0) goto L_0x0302
            X.2ew r0 = X.2ev.A00(r4)
            r0.A04()
        L_0x0302:
            r12.A0U()
        L_0x0305:
            r0 = -667573133(0xffffffffd835a473, float:-7.9887163E14)
            X.AnonymousClass0fD.A07(r0, r3)
            return
        L_0x030c:
            r1 = move-exception
            monitor-exit(r12)
            r0 = 1831300246(0x6d276c96, float:3.2384543E27)
            goto L_0x031b
        L_0x0312:
            r1 = move-exception
            r0 = 87
            r5.markerEnd(r2, r4, r0)
            r0 = 1706688560(0x65ba0030, float:1.0979545E23)
        L_0x031b:
            X.AnonymousClass0fD.A07(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.BaseFragmentActivity.onResume():void");
    }

    public void onStop() {
        int A002 = AnonymousClass0fD.A00(-1611647604);
        Class<BaseFragmentActivity> cls = BaseFragmentActivity.class;
        String name = getClass().getName();
        02m r5 = 02m.A0p;
        if (r5 != null) {
            int A032 = 2SP.A01.A03();
            r5.markerStart(694558626, A032);
            r5.markerAnnotate(694558626, A032, "endpoint", 0LA.A00());
            r5.markerAnnotate(694558626, A032, "asl_session_id", 0LA.A01());
            r5.markerAnnotate(694558626, A032, "activityClass", 002.A0g("<cls>", name, "</cls>"));
            String name2 = cls.getName();
            r5.markerAnnotate(694558626, A032, "method_class", 002.A0g("<cls>", name2, "</cls>"));
            r5.markerAnnotate(694558626, A032, "operation_name", "onStop");
            try {
                String A0T2 = 002.A0T(name2, "onStop", '.');
                if (Systrace.A0E(1)) {
                    0fS.A01(A0T2, 1665974958);
                }
                super.onStop();
                Fragment A0P2 = getSupportFragmentManager().A0P(R.id.layout_container_main);
                if (A0P2 != null) {
                    C2813557c.A00(A0P2);
                }
                AnonymousClass3GX A0Y = A0Y();
                if (A0Y != null) {
                    A0Y.A05(AnonymousClass05K.A0C);
                }
                if (Systrace.A0E(1)) {
                    0fS.A00(2117513814);
                }
                r5.markerEnd(694558626, A032, 2);
            } catch (Throwable th) {
                try {
                    AnonymousClass0fD.A07(946389905, A002);
                    throw th;
                } catch (Throwable th2) {
                    r5.markerEnd(694558626, A032, 87);
                    AnonymousClass0fD.A07(679761314, A002);
                    throw th2;
                }
            }
        } else {
            super.onStop();
            Fragment A0P3 = getSupportFragmentManager().A0P(R.id.layout_container_main);
            if (A0P3 != null) {
                C2813557c.A00(A0P3);
            }
            AnonymousClass3GX A0Y2 = A0Y();
            if (A0Y2 != null) {
                A0Y2.A05(AnonymousClass05K.A0C);
            }
        }
        AnonymousClass0fD.A07(-2142323604, A002);
    }

    public int A0X() {
        return R.layout.activity_fragment_host_coordinator_layout;
    }

    public void onAttachFragment(Fragment fragment) {
        A0d();
    }
}
