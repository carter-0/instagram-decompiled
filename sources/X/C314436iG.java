package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.6iG  reason: invalid class name and case insensitive filesystem */
public final class C314436iG implements C314446iH, AnonymousClass6Z1 {
    public int A00;
    public long A01;
    public IgEditText A02;
    public C71662eb A03;
    public C308476Uk A04;
    public N3L A05;
    public AnonymousClass5Gv A06;
    public C255773uh A07;
    public C250973mM A08;
    public C314496iM A09;
    public C309426Yf A0A;
    public User A0B;
    public Integer A0C;
    public Long A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public C314516iO A0R;
    public User A0S;
    public String A0T;
    public String A0U;
    public final Activity A0V;
    public final Context A0W;
    public final View A0X;
    public final View A0Y;
    public final View A0Z;
    public final View A0a;
    public final TextView A0b;
    public final AnonymousClass4DH A0c;
    public final AnonymousClass0iw A0d;
    public final UserSession A0e;
    public final C71662eb A0f;
    public final C71662eb A0g;
    public final C71662eb A0h;
    public final C71662eb A0i;
    public final C252063oV A0j;
    public final C317986oA A0k;
    public final C314466iJ A0l;
    public final C317996oB A0m;
    public final AnonymousClass3BQ A0n;
    public final C314426iF A0o;
    public final AnonymousClass0eM A0p;
    public final AnonymousClass07i A0q;
    public final C58840Ae A0r;
    public final 2Dm A0s;
    public final boolean A0t;

    /* JADX WARNING: type inference failed for: r1v16, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C314436iG(android.app.Activity r12, android.view.View r13, X.AnonymousClass07i r14, X.C58840Ae r15, X.AnonymousClass4DH r16, X.AnonymousClass0iw r17, com.instagram.common.session.UserSession r18, X.C317996oB r19, X.2Dm r20, X.AnonymousClass3BQ r21, X.C314426iF r22, java.lang.String r23, java.lang.String r24) {
        /*
            r11 = this;
            r0 = 2
            r2 = r18
            X.0qQ.A0B(r2, r0)
            r0 = 3
            r3 = r21
            X.0qQ.A0B(r3, r0)
            r8 = 4
            X.0qQ.A0B(r15, r8)
            r0 = 5
            r1 = r23
            X.0qQ.A0B(r1, r0)
            r0 = 6
            r1 = r24
            X.0qQ.A0B(r1, r0)
            r11.<init>()
            r11.A0Z = r13
            r11.A0e = r2
            r11.A0n = r3
            r11.A0r = r15
            r7 = r17
            r11.A0d = r7
            r0 = r22
            r11.A0o = r0
            r11.A0V = r12
            r0 = r16
            r11.A0c = r0
            r11.A0q = r14
            r0 = r20
            r11.A0s = r0
            r0 = r19
            r11.A0m = r0
            X.6oA r0 = new X.6oA
            r0.<init>(r2)
            r11.A0k = r0
            android.content.Context r4 = r13.getContext()
            r11.A0W = r4
            r0 = 2131439668(0x7f0b3034, float:1.8501298E38)
            android.view.View r10 = r13.requireViewById(r0)
            X.0qQ.A07(r10)
            r11.A0X = r10
            r0 = 2131439672(0x7f0b3038, float:1.8501306E38)
            android.view.View r6 = r13.requireViewById(r0)
            X.0qQ.A07(r6)
            r11.A0Y = r6
            r0 = 2131439580(0x7f0b2fdc, float:1.850112E38)
            android.view.View r0 = r13.requireViewById(r0)
            X.0qQ.A07(r0)
            r11.A0a = r0
            r0 = 2131439647(0x7f0b301f, float:1.8501255E38)
            android.view.View r1 = r13.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            r9 = 0
            if (r0 == 0) goto L_0x0224
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x007e:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r11.A0g = r0
            r0 = 2131439406(0x7f0b2f2e, float:1.8500766E38)
            android.view.View r1 = r13.requireViewById(r0)
            X.1NN r0 = X.1NM.A00(r2)
            boolean r0 = r0.A01()
            r5 = 1
            r0 = r0 ^ 1
            r3 = 0
            X.3oV r0 = X.2b1.A01(r1, r0, r3)
            r11.A0j = r0
            r0 = 2131439675(0x7f0b303b, float:1.8501312E38)
            android.view.View r1 = r6.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0221
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x00ab:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r11.A0h = r0
            r0 = 2131439671(0x7f0b3037, float:1.8501304E38)
            android.view.View r1 = r6.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x021e
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x00bf:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r11.A0f = r0
            X.0Tu r6 = X.0Tu.A05
            r0 = 36320725946082081(0x81098200002321, double:3.032711567902149E-306)
            boolean r1 = X.182.A06(r6, r2, r0)
            r11.A0t = r1
            X.6iI r0 = new X.6iI
            r0.<init>(r11)
            r11.A0l = r0
            X.9LS r0 = new X.9LS
            r0.<init>(r11, r8)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r11.A0p = r0
            if (r1 == 0) goto L_0x0102
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r8 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            X.0qQ.A0C(r1, r0)
            X.2dQ r1 = (X.C71492dQ) r1
            r1.A0e = r8
            r10.setMinimumHeight(r8)
        L_0x0102:
            r0 = 2131439680(0x7f0b3040, float:1.8501322E38)
            android.view.View r8 = r13.requireViewById(r0)
            com.instagram.common.ui.base.IgEditText r8 = (com.instagram.common.ui.base.IgEditText) r8
            r8.setShowSoftInputOnFocus(r3)
            r0 = -1
            r8.setHintTextColor(r0)
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131492892(0x7f0c001c, float:1.8609249E38)
            int r1 = r1.getInteger(r0)
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            android.text.InputFilter[] r0 = new android.text.InputFilter[]{r0}
            r8.setFilters(r0)
            X.6iK r0 = new X.6iK
            r0.<init>(r11)
            r8.setOnKeyListener(r0)
            X.6iL r0 = new X.6iL
            r0.<init>(r11)
            r8.addTextChangedListener(r0)
            r11.A02 = r8
            r0 = 2131439681(0x7f0b3041, float:1.8501324E38)
            android.view.View r8 = r13.requireViewById(r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.content.Context r0 = r8.getContext()
            X.0qQ.A07(r0)
            X.0qq r1 = X.AnonymousClass0qo.A00(r0)
            X.0qm r0 = X.0qm.A13
            android.graphics.Typeface r0 = r1.A02(r0)
            r8.setTypeface(r0)
            r11.A0b = r8
            r0 = 2131441961(0x7f0b3929, float:1.8505948E38)
            android.view.View r1 = r13.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x016c
            r9 = r1
            android.view.ViewStub r9 = (android.view.ViewStub) r9
        L_0x016c:
            X.2eb r8 = new X.2eb
            r8.<init>(r9)
            r11.A0i = r8
            boolean r0 = r11.A06()
            r11.A0J = r0
            r0 = 36313570530560093(0x8103000000085d, double:3.0281864543134984E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            r11.A0N = r0
            r0 = 36315009344670654(0x81044f00010bbe, double:3.0290963661506565E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            r11.A0L = r0
            boolean r0 = r11.A05()
            r11.A0H = r0
            boolean r0 = r11.A0J
            if (r0 == 0) goto L_0x01b6
            r1 = 2131439676(0x7f0b303c, float:1.8501314E38)
            android.view.View r0 = r11.A0Y
            android.view.View r9 = r0.findViewById(r1)
            boolean r0 = r9 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x021c
            android.view.ViewStub r9 = (android.view.ViewStub) r9
        L_0x01a8:
            X.2eb r1 = new X.2eb
            r1.<init>(r9)
            r11.A03 = r1
            X.OzA r0 = new X.OzA
            r0.<init>(r11)
            r1.A02 = r0
        L_0x01b6:
            r11.A09()
            boolean r0 = r11.A0L
            if (r0 == 0) goto L_0x01c2
            X.2eb r0 = r11.A0h
            r0.A03(r3)
        L_0x01c2:
            r11.A01()
            X.0qQ.A07(r4)
            X.6iM r0 = new X.6iM
            r0.<init>(r4, r7, r2)
            r11.A09 = r0
            X.6iO r0 = new X.6iO
            r0.<init>(r4, r2)
            r11.A0R = r0
            boolean r0 = r11.A0J
            if (r0 != 0) goto L_0x021a
            boolean r0 = r11.A0L
            if (r0 != 0) goto L_0x021a
            boolean r0 = r11.A0H
            if (r0 != 0) goto L_0x021a
            boolean r0 = r11.A0M
            if (r0 != 0) goto L_0x021a
            boolean r0 = r11.A0O
            if (r0 != 0) goto L_0x021a
            r0 = 36320511197848071(0x81095000022207, double:3.0325757602542396E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            if (r0 == 0) goto L_0x021a
        L_0x01f5:
            r11.A0P = r5
            if (r5 == 0) goto L_0x0219
            android.view.View r2 = r8.A01()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r2, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            X.6Uk r1 = new X.6Uk
            r1.<init>(r2)
            r11.A04 = r1
            r0 = 2130970241(0x7f040681, float:1.7549187E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r0 = r4.getColor(r0)
            r1.A00(r0, r3)
        L_0x0219:
            return
        L_0x021a:
            r5 = 0
            goto L_0x01f5
        L_0x021c:
            r9 = 0
            goto L_0x01a8
        L_0x021e:
            r1 = r9
            goto L_0x00bf
        L_0x0221:
            r1 = r9
            goto L_0x00ab
        L_0x0224:
            r1 = r9
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314436iG.<init>(android.app.Activity, android.view.View, X.07i, X.0Ae, X.4DH, X.0iw, com.instagram.common.session.UserSession, X.6oB, X.2Dm, X.3BQ, X.6iF, java.lang.String, java.lang.String):void");
    }

    public final boolean COT() {
        return false;
    }

    public final void D48(AnonymousClass89Y r1) {
    }

    public final void D7Q(C255773uh r6, C250973mM r7, C316026kz r8, C309426Yf r9) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r9, 2);
        0qQ.A0B(r7, 3);
        TextView textView = this.A0b;
        textView.setOnClickListener((View.OnClickListener) null);
        textView.setEnabled(false);
        if (this.A0P) {
            this.A0i.A01().setOnClickListener((View.OnClickListener) null);
            Editable text = this.A02.getText();
            0qQ.A07(text);
            boolean A0W2 = 00l.A0W(text);
            C308476Uk r0 = this.A04;
            if (A0W2) {
                if (r0 != null) {
                    r0.A01((Boolean) null, false, false);
                }
            } else if (r0 != null) {
                r0.A01((Boolean) null, true, false);
            }
        }
        this.A07 = r6;
        this.A08 = r7;
        this.A0A = r9;
        boolean z = false;
        if (!r7.A0H.A1Q && !this.A0I) {
            z = 182.A06(0Tu.A06, this.A0e, 36315009344867264L);
            0qQ.A0A(Boolean.valueOf(z));
        }
        this.A0M = z;
        C250973mM r02 = this.A08;
        boolean z2 = false;
        if ((r02 == null || !r02.A0H.A1T) && !this.A0I) {
            z2 = 182.A06(0Tu.A06, this.A0e, 36315009345391556L);
            0qQ.A0A(Boolean.valueOf(z2));
        }
        this.A0O = z2;
        this.A0H = A05();
        A01();
        if (this.A0K) {
            this.A0Y.setVisibility(8);
            0nA.A0N(this.A02);
            return;
        }
        A03(this);
    }

    public final /* synthetic */ void DLs(Reel reel) {
    }

    public final /* synthetic */ void DMq(int i) {
    }

    public final /* synthetic */ void DNx() {
    }

    public final /* synthetic */ void DNy() {
    }

    public final void DV9(AnonymousClass89Y r1) {
    }

    public final /* synthetic */ void DVL() {
    }

    public final /* synthetic */ void DWT(String str) {
    }

    public final /* synthetic */ void Dfe() {
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final /* synthetic */ void DxL() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final /* synthetic */ void DxU() {
    }

    public final /* synthetic */ void DyN(C255773uh r1, C316036l0 r2) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public static final AnonymousClass3U9 A00(C314436iG r4) {
        User user;
        User user2;
        2Dm r3 = r4.A0s;
        if (r3 == null || (user = r4.A0S) == null) {
            return null;
        }
        C255773uh r0 = r4.A07;
        if (r0 != null) {
            user2 = r0.A0i;
        } else {
            user2 = null;
        }
        if (0qQ.A0K(user2, user)) {
            return r3.B33(AnonymousClass6UD.A00(user, false).A00());
        }
        return null;
    }

    private final void A01() {
        if (this.A0H) {
            C71662eb r2 = this.A0f;
            AnonymousClass0fU.A00(new C71304Oi0(this), r2.A01());
            r2.A02 = new C72241Oz9(this);
            r2.A03(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e8, code lost:
        if (r7 != false) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C314436iG r16) {
        /*
            r6 = r16
            X.3uh r0 = r6.A07
            r10 = 0
            if (r0 == 0) goto L_0x0119
            com.instagram.user.model.User r0 = r0.A0i
            if (r0 == 0) goto L_0x0119
            java.lang.String r1 = r0.getId()
        L_0x000f:
            java.lang.String r0 = r6.A0U
            boolean r0 = X.0qQ.A0K(r1, r0)
            r5 = 1
            r2 = r0 ^ 1
            X.3uh r0 = r6.A07
            if (r0 == 0) goto L_0x0116
            java.lang.String r1 = r0.A0j
        L_0x001e:
            java.lang.String r0 = r6.A0T
            boolean r0 = X.0qQ.A0K(r1, r0)
            r7 = r0 ^ 1
            if (r2 != 0) goto L_0x00cb
            if (r7 != 0) goto L_0x00ea
            X.6iF r8 = r6.A0o
            com.instagram.common.ui.base.IgEditText r7 = r6.A02
            java.lang.String r0 = X.0nA.A0I(r7)
            java.lang.CharSequence r0 = X.00l.A0B(r0)
            java.lang.String r11 = r0.toString()
            X.3uh r4 = r6.A07
            X.3mM r3 = r6.A08
            boolean r2 = r6.A0I
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.String r1 = "StoryViewerMessageComposerDelegate"
            if (r3 != 0) goto L_0x0071
            java.lang.String r0 = "StoryViewerMessageComposerDelegate returning null ReelViewModel"
        L_0x004a:
            X.0wb.A03(r1, r0)
        L_0x004d:
            com.instagram.common.session.UserSession r4 = r6.A0e
            android.view.View r3 = r6.A0Y
            X.0iw r2 = r6.A0d
            X.N3L r1 = r6.A05
            X.6iJ r0 = r6.A0l
            X.OPM.A00(r3, r2, r4, r0, r1)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324849114689959(0x810d42000031a7, double:3.0353190763324386E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x006d
            r7.setHapticFeedbackEnabled(r5)
            r7.performHapticFeedback(r5)
        L_0x006d:
            r7.setText(r10)
            return
        L_0x0071:
            if (r4 != 0) goto L_0x0076
            java.lang.String r0 = "StoryViewerMessageComposerDelegate returning null ReelItem"
            goto L_0x004a
        L_0x0076:
            X.6kx r0 = r8.A00()
            if (r0 == 0) goto L_0x0083
            X.6mk r0 = r0.A0E
            if (r0 == 0) goto L_0x0083
            r0.Etq()
        L_0x0083:
            X.3WT r0 = X.AnonymousClass3WT.SECRET_STICKER
            boolean r0 = r4.A1t(r0)
            if (r0 == 0) goto L_0x00a5
            X.1Xj r0 = r4.A0b
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r0.A6F()
            if (r0 != r5) goto L_0x00a5
            X.0qV r0 = X.C61970qY.A04()
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x00a5
            X.4mU r0 = r8.A07
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            r0.A2o = r5
        L_0x00a5:
            X.6cn r0 = r8.A08
            X.LOD r9 = new X.LOD
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r14 = r9
            r12 = r4
            r13 = r3
            r16 = r2
            r11 = r0
            r11.A01(r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r8.A03
            X.Vgm r0 = X.C70302O1g.A00(r0)
            X.1QP r4 = r0.A01
            long r1 = r0.A00
            java.lang.String r3 = "reply_with_text_message"
            java.lang.String r0 = ""
            r4.flowMarkPoint(r1, r3, r0)
            goto L_0x004d
        L_0x00cb:
            java.lang.String r4 = r6.A0T
            X.3uh r0 = r6.A07
            if (r0 == 0) goto L_0x0114
            com.instagram.user.model.User r0 = r0.A0i
            if (r0 == 0) goto L_0x0114
            java.lang.String r3 = r0.getId()
        L_0x00d9:
            X.0wb r2 = X.0wb.A01
            java.lang.String r1 = "Message failed to send. Expected Recipient "
            java.lang.String r0 = ", Actual Recipient: "
            java.lang.String r1 = X.002.A0u(r1, r4, r0, r3)
            java.lang.String r0 = "StoryViewerMessageComposerController"
            r2.Ew0(r0, r1)
            if (r7 == 0) goto L_0x0101
        L_0x00ea:
            java.lang.String r4 = r6.A0T
            X.3uh r0 = r6.A07
            if (r0 == 0) goto L_0x0112
            java.lang.String r3 = r0.A0k
        L_0x00f2:
            X.0wb r2 = X.0wb.A01
            java.lang.String r1 = "Message failed to send. Expected ReelId "
            java.lang.String r0 = ", Actual ReelId: "
            java.lang.String r1 = X.002.A0u(r1, r4, r0, r3)
            java.lang.String r0 = "StoryViewerMessageComposerController"
            r2.Ew0(r0, r1)
        L_0x0101:
            com.instagram.common.ui.base.IgEditText r7 = r6.A02
            X.0nA.A0N(r7)
            android.content.Context r2 = r6.A0W
            java.lang.String r1 = "inccorrect_story_reply_recipient"
            r0 = 2131961937(0x7f132851, float:1.9560585E38)
            X.C59689JTv.A0F(r2, r1, r0)
            goto L_0x004d
        L_0x0112:
            r3 = r10
            goto L_0x00f2
        L_0x0114:
            r3 = r10
            goto L_0x00d9
        L_0x0116:
            r1 = r10
            goto L_0x001e
        L_0x0119:
            r1 = r10
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314436iG.A02(X.6iG):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r5 != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r5 != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r5 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
        if (r5 == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C314436iG r10) {
        /*
            com.instagram.common.ui.base.IgEditText r0 = r10.A02
            android.text.Editable r0 = r0.getText()
            X.0qQ.A07(r0)
            boolean r0 = X.00l.A0W(r0)
            r5 = 1
            if (r0 == 0) goto L_0x0011
            r5 = 0
        L_0x0011:
            X.3mM r1 = r10.A08
            r0 = 0
            if (r1 == 0) goto L_0x0017
            r0 = 1
        L_0x0017:
            boolean r1 = r10.A06()
            r10.A0J = r1
            if (r1 == 0) goto L_0x00c3
            if (r0 == 0) goto L_0x0024
            r4 = 1
            if (r5 == 0) goto L_0x0025
        L_0x0024:
            r4 = 0
        L_0x0025:
            r2 = r4 ^ 1
        L_0x0027:
            boolean r0 = r10.A0H
            if (r0 == 0) goto L_0x002e
            r9 = 1
            if (r5 == 0) goto L_0x002f
        L_0x002e:
            r9 = 0
        L_0x002f:
            boolean r0 = r10.A0L
            if (r0 == 0) goto L_0x0036
            r8 = 1
            if (r5 == 0) goto L_0x0037
        L_0x0036:
            r8 = 0
        L_0x0037:
            boolean r6 = r10.A0P
            if (r6 == 0) goto L_0x003e
            r7 = 1
            if (r5 != 0) goto L_0x003f
        L_0x003e:
            r7 = 0
        L_0x003f:
            r3 = 0
            if (r1 == 0) goto L_0x004c
            android.widget.TextView r1 = r10.A0b
            r0 = 8
            if (r2 == 0) goto L_0x0049
            r0 = 0
        L_0x0049:
            r1.setVisibility(r0)
        L_0x004c:
            X.2eb r1 = r10.A03
            if (r1 == 0) goto L_0x0058
            r0 = 8
            if (r4 == 0) goto L_0x0055
            r0 = 0
        L_0x0055:
            r1.A03(r0)
        L_0x0058:
            X.2eb r0 = r10.A0f
            android.view.View r0 = r0.A01()
            X.0qQ.A07(r0)
            r4 = 8
            r2 = 1062836634(0x3f59999a, float:0.85)
            if (r9 == 0) goto L_0x006b
            r4 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x006b:
            X.5nL r1 = X.C294975nL.A01(r0, r3)
            r1.A0G()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.A0P(r2, r0)
            r1.A0Q(r2, r0)
            r1.A03 = r4
            X.2co r0 = X.AnonymousClass4EQ.A00
            X.5nL r0 = r1.A0E(r0)
            r2 = 1
            X.5nL r0 = r0.A0F(r2)
            r0.A0H()
            if (r6 == 0) goto L_0x00b5
            X.6Uk r1 = r10.A04
            if (r7 == 0) goto L_0x00ae
            if (r1 == 0) goto L_0x0096
            r0 = 0
            r1.A01(r0, r2, r2)
        L_0x0096:
            X.2eb r0 = r10.A0i
            android.view.View r1 = r0.A01()
            X.6Un r0 = new X.6Un
            r0.<init>(r10)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x00a4:
            X.2eb r0 = r10.A0h
            if (r8 != 0) goto L_0x00aa
            r3 = 8
        L_0x00aa:
            r0.A03(r3)
            return
        L_0x00ae:
            if (r1 == 0) goto L_0x0096
            r0 = 0
            r1.A01(r0, r3, r2)
            goto L_0x0096
        L_0x00b5:
            android.widget.TextView r1 = r10.A0b
            X.6WM r0 = new X.6WM
            r0.<init>(r10)
            X.AnonymousClass0fU.A00(r0, r1)
            r1.setEnabled(r5)
            goto L_0x00a4
        L_0x00c3:
            r4 = 0
            r2 = 0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314436iG.A03(X.6iG):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0119, code lost:
        if (X.AnonymousClass6YK.A01(r7, r3) == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0150, code lost:
        if (X.C308426Uf.A00.A00(r13, r2) == false) goto L_0x0152;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C314436iG r18, java.lang.Integer r19) {
        /*
            r0 = r18
            r1 = r19
            r0.A0C = r1
            X.6iF r8 = r0.A0o
            X.6kx r3 = r8.A00()
            boolean r1 = r0.A0t
            if (r1 == 0) goto L_0x00c1
            if (r3 == 0) goto L_0x00c1
            android.view.View r6 = r0.A0X
            java.lang.Class<X.6iG> r2 = X.C314436iG.class
            X.0Yh r1 = new X.0Yh
            r1.<init>(r2)
            java.lang.Class r1 = r1.A00
            java.lang.String r1 = X.0q1.A01(r1)
            java.lang.String r4 = java.lang.String.valueOf(r1)
            com.instagram.ui.widget.textureview.ScalingTextureView r2 = r3.C5p()
            com.instagram.feed.widget.IgProgressImageView r1 = r3.BGP()
            android.view.View[] r1 = new android.view.View[]{r2, r1}
            X.Vc0 r3 = new X.Vc0
            r3.<init>(r6, r4, r1)
            r1 = 4
            r3.A00 = r1
            android.content.Context r5 = r0.A0W
            r1 = 2131100283(0x7f06027b, float:1.7812943E38)
            int r1 = r5.getColor(r1)
            r3.A03 = r1
            android.content.res.Resources r2 = r5.getResources()
            r1 = 2131165219(0x7f070023, float:1.7944649E38)
            int r1 = r2.getDimensionPixelSize(r1)
            r3.A01 = r1
            X.U1A r1 = new X.U1A
            r1.<init>(r3)
            r6.setBackground(r1)
        L_0x0059:
            long r1 = java.lang.System.currentTimeMillis()
            r0.A01 = r1
            X.2eb r2 = r0.A0g
            android.view.View r1 = r2.A00
            if (r1 == 0) goto L_0x0068
            r2.A02()
        L_0x0068:
            X.3mM r2 = r0.A08
            if (r2 == 0) goto L_0x0092
            com.instagram.model.reels.Reel r1 = r2.A0H
            X.1Ns r1 = r1.A0W
            if (r1 == 0) goto L_0x0092
            com.instagram.user.model.User r1 = r1.CCd()
            if (r1 == 0) goto L_0x0092
            r1.getUsername()
            boolean r1 = r2.A0M
            if (r1 == 0) goto L_0x0092
            X.3mM r1 = r0.A08
            if (r1 == 0) goto L_0x0366
            com.instagram.model.reels.Reel r1 = r1.A0H
            X.1Ns r1 = r1.A0W
            if (r1 == 0) goto L_0x035e
            com.instagram.user.model.User r1 = r1.CCd()
            if (r1 == 0) goto L_0x035e
            r1.getUsername()
        L_0x0092:
            X.3uh r1 = r0.A07
            r14 = 0
            if (r1 == 0) goto L_0x009b
            com.instagram.user.model.User r2 = r1.A0i
            if (r2 != 0) goto L_0x00a7
        L_0x009b:
            X.3mM r1 = r0.A08
            if (r1 == 0) goto L_0x00ac
            com.instagram.model.reels.Reel r1 = r1.A0H
            com.instagram.user.model.User r2 = r1.A0D()
            if (r2 == 0) goto L_0x00ac
        L_0x00a7:
            r1 = 0
            com.instagram.model.direct.DirectShareTarget r14 = X.AnonymousClass6UD.A00(r2, r1)
        L_0x00ac:
            com.instagram.common.ui.base.IgEditText r7 = r0.A02
            X.6YK r11 = X.AnonymousClass6YK.A00
            com.instagram.common.session.UserSession r13 = r0.A0e
            X.3uh r15 = r0.A07
            X.3BQ r2 = r0.A0n
            android.content.res.Resources r12 = r5.getResources()
            X.0qQ.A07(r12)
            r9 = 2131971560(0x7f134de8, float:1.9580103E38)
            goto L_0x00f5
        L_0x00c1:
            android.view.View r6 = r0.A0X
            android.content.Context r5 = r0.A0W
            X.3mM r4 = r0.A08
            r3 = 1
            if (r4 == 0) goto L_0x00f1
            boolean r1 = r4.A0B
            r2 = 0
            if (r1 != r3) goto L_0x00d0
            r2 = 1
        L_0x00d0:
            boolean r1 = r4.A0A
            if (r1 == r3) goto L_0x00d5
            r3 = 0
        L_0x00d5:
            if (r2 != 0) goto L_0x00d9
            if (r3 == 0) goto L_0x00f1
        L_0x00d9:
            r1 = 2131240024(0x7f082458, float:1.8096371E38)
        L_0x00dc:
            android.graphics.drawable.Drawable r1 = r5.getDrawable(r1)
            r6.setBackground(r1)
            android.view.View r2 = r0.A0Y
            r1 = 2131099792(0x7f060090, float:1.7811947E38)
            int r1 = r5.getColor(r1)
            r2.setBackgroundColor(r1)
            goto L_0x0059
        L_0x00f1:
            r1 = 2131240022(0x7f082456, float:1.8096367E38)
            goto L_0x00dc
        L_0x00f5:
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ NotFoundException -> 0x00fe }
            java.lang.String r3 = r1.getString(r9)     // Catch:{ NotFoundException -> 0x00fe }
            goto L_0x010d
        L_0x00fe:
            X.0wj r4 = X.0wj.A01
            r3 = 18946361(0x1211939, float:2.9589126E-38)
            java.lang.String r1 = "Failed to find string resource for resource id "
            java.lang.String r1 = X.002.A0O(r1, r9)
            r4.AEf(r1, r3)
            r3 = 0
        L_0x010d:
            X.3mM r1 = r0.A08
            if (r1 == 0) goto L_0x011b
            if (r3 == 0) goto L_0x011b
            boolean r1 = X.AnonymousClass6YK.A01(r7, r3)
            r17 = 1
            if (r1 != 0) goto L_0x011d
        L_0x011b:
            r17 = 0
        L_0x011d:
            r16 = r2
            java.lang.String r1 = r11.A06(r12, r13, r14, r15, r16, r17)
            r7.setHint(r1)
            X.3mM r1 = r0.A08
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0324
            com.instagram.model.reels.Reel r1 = r1.A0H
            boolean r1 = r1.A1Q
            if (r1 != r4) goto L_0x0324
        L_0x0132:
            X.3mM r1 = r0.A08
            if (r1 == 0) goto L_0x02f2
            com.instagram.model.reels.Reel r1 = r1.A0H
            boolean r1 = r1.A1T
            if (r1 != r4) goto L_0x02f2
        L_0x013c:
            X.3mM r1 = r0.A08
            r9 = 0
            if (r1 == 0) goto L_0x0152
            com.instagram.model.reels.Reel r1 = r1.A0H
            com.instagram.user.model.User r2 = r1.A0D()
            if (r2 == 0) goto L_0x0152
            X.6Uf r1 = X.C308426Uf.A00
            boolean r2 = r1.A00(r13, r2)
            r1 = 1
            if (r2 != 0) goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            r0.A0I = r1
            r2 = 8
            if (r1 == 0) goto L_0x02d5
            X.3oV r12 = r0.A0j
            android.view.View r1 = r12.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.graphics.drawable.Drawable[] r1 = r1.getCompoundDrawablesRelative()
            r11 = r1[r3]
            if (r11 == 0) goto L_0x0356
            r1 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r10 = r5.getColor(r1)
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_ATOP
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r10, r5)
            r11.setColorFilter(r1)
            android.view.View r1 = r12.getView()
            r1.setVisibility(r3)
            boolean r1 = r0.A06()
            r0.A0J = r1
            boolean r1 = r0.A05()
            r0.A0H = r1
            r0.A09()
        L_0x0190:
            boolean r1 = r0.A0P
            if (r1 == 0) goto L_0x02bd
            android.widget.TextView r1 = r0.A0b
            r1.setVisibility(r2)
            X.2eb r1 = r0.A0i
            android.view.View r2 = r1.A01()
            X.Ohx r1 = new X.Ohx
            r1.<init>(r0)
            X.AnonymousClass0fU.A00(r1, r2)
            android.text.Editable r1 = r7.getText()
            X.0qQ.A07(r1)
            boolean r2 = X.00l.A0W(r1)
            X.6Uk r1 = r0.A04
            if (r2 == 0) goto L_0x02b6
            if (r1 == 0) goto L_0x01bb
            r1.A01(r9, r3, r4)
        L_0x01bb:
            android.view.View r2 = r0.A0Y
            X.Ohz r1 = new X.Ohz
            r1.<init>(r0)
            X.AnonymousClass0fU.A00(r1, r2)
            X.OlQ r1 = new X.OlQ
            r1.<init>(r0)
            r7.setOnEditorActionListener(r1)
            r7.requestFocus()
            X.0nA.A0Q(r7)
            boolean r1 = r0.A0M
            if (r1 != 0) goto L_0x025d
            X.1Am r5 = X.1Al.A01(r13)
            X.1An r2 = X.1An.A2z
            java.lang.Class r1 = r0.getClass()
            X.0xa r10 = r5.A04(r2, r1)
            boolean r1 = r0.A0H
            if (r1 == 0) goto L_0x025d
            java.lang.String r1 = "has_seen_camera_reply_type"
            boolean r1 = r10.getBoolean(r1, r3)
            if (r1 != 0) goto L_0x025d
            android.view.View r7 = r0.A0Z
            android.content.Context r1 = r7.getContext()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x025d
            boolean r1 = r0.A0B()
            if (r1 != 0) goto L_0x025d
            android.app.Activity r5 = r0.A0V
            android.content.Context r2 = r6.getContext()
            r1 = 2131971456(0x7f134d80, float:1.9579892E38)
            java.lang.String r2 = r2.getString(r1)
            X.0qQ.A07(r2)
            X.6jx r1 = new X.6jx
            r1.<init>((java.lang.CharSequence) r2)
            X.5Gt r6 = new X.5Gt
            r6.<init>(r5, r1)
            r6.A02()
            X.2eb r11 = r0.A0f
            android.view.View r1 = r11.A01()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r2 = r1.getDisplayMetrics()
            r1 = -1043333120(0xffffffffc1d00000, float:-26.0)
            float r1 = android.util.TypedValue.applyDimension(r4, r1, r2)
            int r5 = (int) r1
            android.view.View r2 = r11.A01()
            X.0qQ.A07(r2)
            X.9UE r1 = new X.9UE
            r1.<init>(r2, r3, r5, r4)
            r6.A05(r1)
            r6.A0B = r4
            r6.A0A = r3
            X.9pA r1 = new X.9pA
            r1.<init>(r10)
            r6.A04 = r1
            X.5Gv r1 = r6.A00()
            r0.A06 = r1
            X.PWq r5 = new X.PWq
            r5.<init>(r0)
            r1 = 500(0x1f4, double:2.47E-321)
            r7.postDelayed(r5, r1)
        L_0x025d:
            android.view.View r1 = r0.A0Z
            android.content.Context r1 = r1.getContext()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0297
            boolean r1 = r0.A0M
            if (r1 == 0) goto L_0x02af
            java.lang.String r10 = "story_remix_reply"
        L_0x026d:
            X.6iM r7 = r0.A09
            if (r7 == 0) goto L_0x0297
            android.app.Activity r6 = r0.A0V
            X.2eb r11 = r0.A0f
            android.view.View r1 = r11.A01()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r2 = r1.getDisplayMetrics()
            r1 = -1043333120(0xffffffffc1d00000, float:-26.0)
            float r1 = android.util.TypedValue.applyDimension(r4, r1, r2)
            int r5 = (int) r1
            android.view.View r2 = r11.A01()
            X.0qQ.A07(r2)
            X.9UE r1 = new X.9UE
            r1.<init>(r2, r3, r5, r4)
            r7.A02(r6, r1, r10, r4)
        L_0x0297:
            X.3uh r1 = r0.A07
            if (r1 == 0) goto L_0x02a3
            X.1Xj r1 = r1.A0b
            if (r1 == 0) goto L_0x02a3
            java.lang.String r9 = r1.A2n()
        L_0x02a3:
            boolean r1 = r0.A0I
            com.instagram.common.session.UserSession r0 = r8.A03
            X.Vgm r0 = X.C70302O1g.A00(r0)
            r0.A00(r9, r1)
            return
        L_0x02af:
            boolean r1 = r0.A0O
            if (r1 == 0) goto L_0x0297
            java.lang.String r10 = "story_selfie_reply"
            goto L_0x026d
        L_0x02b6:
            if (r1 == 0) goto L_0x01bb
            r1.A01(r9, r4, r4)
            goto L_0x01bb
        L_0x02bd:
            X.2eb r1 = r0.A0i
            android.view.View r1 = r1.A01()
            r1.setVisibility(r2)
            android.widget.TextView r2 = r0.A0b
            X.Ohy r1 = new X.Ohy
            r1.<init>(r0)
            X.AnonymousClass0fU.A00(r1, r2)
            r2.setEnabled(r4)
            goto L_0x01bb
        L_0x02d5:
            X.1NN r1 = X.1NM.A00(r13)
            boolean r1 = r1.A01()
            if (r1 == 0) goto L_0x02e7
            X.3oV r1 = r0.A0j
            boolean r1 = r1.CVM()
            if (r1 == 0) goto L_0x0190
        L_0x02e7:
            X.3oV r1 = r0.A0j
            android.view.View r1 = r1.getView()
            r1.setVisibility(r2)
            goto L_0x0190
        L_0x02f2:
            boolean r1 = r0.A0I
            if (r1 != 0) goto L_0x013c
            X.0Tu r9 = X.0Tu.A05
            r1 = 36315009345391556(0x81044f000c0bc4, double:3.029096366606558E-306)
            boolean r2 = X.182.A06(r9, r13, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            X.0qQ.A0A(r1)
            if (r2 == 0) goto L_0x013c
            X.0iw r12 = r0.A0d
            java.lang.String r15 = "selfie_reply_entrypoint"
            X.3uh r1 = r0.A07
            if (r1 == 0) goto L_0x0322
            java.lang.String r1 = r1.A0j
        L_0x0314:
            r14 = 0
            java.lang.String r16 = "impression"
            java.lang.String r17 = "story_reply"
            r18 = r1
            r19 = r14
            X.C67000MgY.A00(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x013c
        L_0x0322:
            r1 = 0
            goto L_0x0314
        L_0x0324:
            boolean r1 = r0.A0I
            if (r1 != 0) goto L_0x0132
            X.0Tu r9 = X.0Tu.A05
            r1 = 36315009344867264(0x81044f00040bc0, double:3.0290963662749935E-306)
            boolean r2 = X.182.A06(r9, r13, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            X.0qQ.A0A(r1)
            if (r2 == 0) goto L_0x0132
            X.0iw r12 = r0.A0d
            java.lang.String r15 = "entrypoint"
            X.3uh r1 = r0.A07
            if (r1 == 0) goto L_0x0354
            java.lang.String r1 = r1.A0j
        L_0x0346:
            r14 = 0
            java.lang.String r16 = "impression"
            java.lang.String r17 = "story_reply"
            r18 = r1
            r19 = r14
            X.C67000MgY.A00(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0132
        L_0x0354:
            r1 = 0
            goto L_0x0346
        L_0x0356:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x035e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0366:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314436iG.A04(X.6iG, java.lang.Integer):void");
    }

    private final boolean A05() {
        if (!this.A0M && !this.A0O) {
            if (this.A0I) {
                return false;
            }
            if (182.A06(0Tu.A05, this.A0e, 36315009344801727L)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A0e, 36313763805006053L) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A06() {
        /*
            r4 = this;
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x0015
            com.instagram.common.session.UserSession r3 = r4.A0e
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313763805006053(0x81032d000e08e5, double:3.028308681851377E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            r1 = 0
        L_0x0014:
            return r1
        L_0x0015:
            com.instagram.common.session.UserSession r3 = r4.A0e
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318818980600291(0x8107c6000019e3, double:3.0315055952527316E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 == 0) goto L_0x0014
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314436iG.A06():boolean");
    }

    public final void A07() {
        ViewGroup.LayoutParams layoutParams = this.A0a.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        this.A0f.A03(0);
        this.A02.setVisibility(0);
        this.A0X.setVisibility(0);
    }

    public final void A09() {
        if (this.A0J) {
            C71662eb r0 = this.A03;
            if (r0 != null) {
                r0.A03(0);
            }
            this.A0b.setVisibility(8);
            return;
        }
        if (!this.A0P) {
            this.A0b.setVisibility(0);
        }
        C71662eb r02 = this.A03;
        if (r02 != null) {
            r02.A03(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0062, code lost:
        if (X.C314496iM.A01(r3, r1) == true) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        r6.A02.requestFocus();
        r3.A03(new X.PJI(r6, r7), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a8, code lost:
        if (r1 != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bc, code lost:
        if (X.C314496iM.A01(r3, r1) == true) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.lang.Integer r7) {
        /*
            r6 = this;
            X.3uh r2 = r6.A07
            r0 = 0
            if (r2 == 0) goto L_0x004a
            java.lang.String r1 = r2.A0j
        L_0x0007:
            r6.A0T = r1
            if (r2 == 0) goto L_0x0048
            com.instagram.user.model.User r1 = r2.A0i
            if (r1 == 0) goto L_0x0048
            java.lang.String r1 = r1.getId()
        L_0x0013:
            r6.A0U = r1
            X.3uh r1 = r6.A07
            if (r1 == 0) goto L_0x001b
            com.instagram.user.model.User r0 = r1.A0i
        L_0x001b:
            r6.A0S = r0
            com.instagram.common.session.UserSession r5 = r6.A0e
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320824730919814(0x81099900092386, double:3.032774039831306E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0037
            X.6oB r1 = r6.A0m
            if (r1 == 0) goto L_0x0037
            X.3U9 r0 = A00(r6)
            r1.A02(r0)
        L_0x0037:
            X.6iO r0 = r6.A0R
            java.lang.String r2 = "Required value was null."
            r4 = 1
            if (r0 == 0) goto L_0x004c
            X.3uh r0 = r6.A07
            if (r0 != 0) goto L_0x004c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0048:
            r1 = r0
            goto L_0x0013
        L_0x004a:
            r1 = r0
            goto L_0x0007
        L_0x004c:
            boolean r0 = r6.A0M
            if (r0 == 0) goto L_0x0072
            X.6iM r3 = r6.A09
            java.lang.String r1 = "story_remix_reply"
            if (r3 == 0) goto L_0x0072
            X.3mM r0 = r6.A08
            if (r0 == 0) goto L_0x00c5
            X.3uh r0 = r6.A07
            if (r0 == 0) goto L_0x00bf
            boolean r0 = X.C314496iM.A01(r3, r1)
            if (r0 != r4) goto L_0x0072
        L_0x0064:
            com.instagram.common.ui.base.IgEditText r0 = r6.A02
            r0.requestFocus()
            X.PJI r0 = new X.PJI
            r0.<init>(r6, r7)
            r3.A03(r0, r1)
            return
        L_0x0072:
            X.3mM r0 = r6.A08
            if (r0 == 0) goto L_0x0080
            com.instagram.model.reels.Reel r0 = r0.A0H
            boolean r0 = r0.A1T
            if (r0 != r4) goto L_0x0080
        L_0x007c:
            A04(r6, r7)
            return
        L_0x0080:
            boolean r0 = r6.A0I
            if (r0 != 0) goto L_0x007c
            X.0Tu r3 = X.0Tu.A06
            r0 = 36315009345457093(0x81044f000d0bc5, double:3.029096366648004E-306)
            boolean r1 = X.182.A06(r3, r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            if (r1 != 0) goto L_0x00aa
            r0 = 36315009345391556(0x81044f000c0bc4, double:3.029096366606558E-306)
            boolean r1 = X.182.A06(r3, r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            if (r1 == 0) goto L_0x007c
        L_0x00aa:
            X.6iM r3 = r6.A09
            java.lang.String r1 = "story_selfie_reply"
            if (r3 == 0) goto L_0x007c
            X.3mM r0 = r6.A08
            if (r0 == 0) goto L_0x00d1
            X.3uh r0 = r6.A07
            if (r0 == 0) goto L_0x00cb
            boolean r0 = X.C314496iM.A01(r3, r1)
            if (r0 != r4) goto L_0x007c
            goto L_0x0064
        L_0x00bf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00c5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00cb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314436iG.A0A(java.lang.Integer):void");
    }

    public final boolean A0B() {
        Boolean bool;
        AnonymousClass5Gv r0 = this.A06;
        if (r0 != null && r0.A09()) {
            return true;
        }
        C314496iM r02 = this.A09;
        if (r02 == null) {
            return false;
        }
        AnonymousClass5Gv r03 = r02.A00;
        if (r03 != null) {
            bool = Boolean.valueOf(r03.A09());
        } else {
            bool = null;
        }
        if (0qQ.A0K(bool, true)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ AnonymousClass89Y AYe() {
        return null;
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final /* synthetic */ boolean CJX() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final /* synthetic */ boolean Dqd() {
        return false;
    }

    public final void onDestroyView() {
        C294975nL.A01(this.A0Y, 0).A0G();
        this.A02.setOnKeyListener((View.OnKeyListener) null);
    }

    public final void A08() {
        A07();
        IgEditText igEditText = this.A02;
        igEditText.requestFocus();
        0nA.A0Q(igEditText);
    }
}
