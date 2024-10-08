package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7TI  reason: invalid class name */
public final class AnonymousClass7TI implements AnonymousClass7TJ, AnonymousClass0j6, AnonymousClass7TK, AnonymousClass4DS, AnonymousClass7TL, C242843Wf, C376339Hp, C240423Kv, C240413Ku {
    public int A00;
    public int A01;
    public int A02;
    public ViewGroup A03;
    public RecyclerView A04;
    public OZG A05;
    public Capabilities A06;
    public C330437Mt A07;
    public C333517Zg A08;
    public AnonymousClass7N2 A09;
    public C274644oo A0A;
    public MessageListLayoutManager A0B;
    public C229402nK A0C;
    public AnonymousClass6ST A0D;
    public RefreshableNestedScrollingParent A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public Set A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public Integer A0P = AnonymousClass05K.A00;
    public boolean A0Q;
    public final int A0R;
    public final Handler A0S;
    public final AnonymousClass7TN A0T;
    public final AnonymousClass4DH A0U;
    public final AnonymousClass0iw A0V;
    public final 0wc A0W;
    public final 1wn A0X;
    public final 1wn A0Y;
    public final 1wn A0Z;
    public final 1wn A0a;
    public final 1a8 A0b;
    public final 1a8 A0c;
    public final UserSession A0d;
    public final AnonymousClass3E6 A0e;
    public final C333197Ya A0f;
    public final AnonymousClass7TT A0g;
    public final AnonymousClass7TR A0h;
    public final C332237Ue A0i;
    public final C332157Tw A0j;
    public final C333247Yf A0k;
    public final AnonymousClass7TD A0l;
    public final AnonymousClass7SQ A0m;
    public final AnonymousClass7SM A0n;
    public final C331747Sf A0o;
    public final C332697Wa A0p;
    public final AnonymousClass7TO A0q;
    public final AnonymousClass9HO A0r;
    public final AnonymousClass7ST A0s;
    public final C332807Wl A0t;
    public final AnonymousClass9HC A0u;
    public final C254923tH A0v;
    public final AnonymousClass9HS A0w;
    public final AnonymousClass9H3 A0x;
    public final AnonymousClass4DU A0y;
    public final C249383je A0z;
    public final C227182im A10;
    public final String A11;
    public final String A12;
    public final String A13;
    public final String A14;
    public final boolean A15;
    public final AnonymousClass7YZ A16;
    public final AnonymousClass7TS A17;
    public final C331757Sg A18;
    public final AnonymousClass9H7 A19;
    public final AnonymousClass9H7 A1A;
    public final C331787Sj A1B;
    public final AnonymousClass7SE A1C;
    public final AnonymousClass7SG A1D;
    public final AnonymousClass7TP A1E;
    public final C331617Rr A1F;

    public final boolean A0X(String str, String str2) {
        if (A03(this) != null) {
            return true;
        }
        C69964Nv4.A00(this.A0d, this.A0j.A0P, str);
        OPK.A01(this.A0U, str2);
        return false;
    }

    public final void CjC(CharSequence charSequence, boolean z) {
        0qQ.A0B(charSequence, 0);
        if (z) {
            this.A0j.A0P.A01(charSequence.toString());
            Integer valueOf = Integer.valueOf(charSequence.hashCode());
            UserSession userSession = this.A0d;
            IGFOAMessagingLocalSendSpeedLogger A002 = C328727Fx.A00(userSession, valueOf);
            if (A002 != null) {
                A002.onLogShowOptimisticMessageEnd();
                A002.onLogRenderWillDisplay();
                A002.onLogRenderEnd();
                A002.onEndFlowSucceed();
            }
            IGFOAMessagingSendToSentLogger A003 = AnonymousClass7G0.A00(userSession, charSequence.hashCode());
            if (A003 != null) {
                A003.onLogLSSEndFlowSucceed();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0345, code lost:
        if (r10 != false) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0641, code lost:
        if (r1 == null) goto L_0x0643;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x064c, code lost:
        if (java.lang.Boolean.valueOf(r0).booleanValue() == false) goto L_0x064e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0869, code lost:
        if (r10 == false) goto L_0x0865;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r0 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01af, code lost:
        if (r1.A01 == null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c2, code lost:
        if (r1.A01 != com.instagram.api.schemas.IGAIAgentType.A04) goto L_0x07d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x068e  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x06d9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x029a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r31) {
        /*
            r30 = this;
            r6 = 0
            r8 = r31
            X.0qQ.A0B(r8, r6)
            r0 = r30
            X.7Tw r0 = r0.A0j
            X.7UW r0 = r0.A0C
            r29 = r0
            X.7Mu r0 = r0.A00
            if (r0 == 0) goto L_0x0617
            r0 = r29
            X.7LZ r5 = r0.A01
            if (r5 == 0) goto L_0x0617
            X.0sa r0 = r0.A0D
            java.lang.Object r9 = r0.invoke()
            X.7VX r9 = (X.AnonymousClass7VX) r9
            r0 = r29
            X.7Mu r4 = r0.A00
            if (r4 == 0) goto L_0x05bc
            X.4DH r0 = r0.A03
            androidx.fragment.app.FragmentActivity r10 = r0.requireActivity()
            X.0eM r0 = r9.A08
            java.lang.Object r12 = r0.getValue()
            X.7Ri r12 = (X.C331527Ri) r12
            X.7Le r7 = r29.A01()
            r4.A0J = r7
            int r2 = r5.A07
            int r0 = r4.A00
            if (r2 == r0) goto L_0x004b
            android.content.Context r1 = r4.A0M
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r1, r2)
            r4.A01 = r0
            r4.A00 = r2
        L_0x004b:
            android.content.Context r3 = r4.A01
            int r0 = r5.A00
            r28 = r0
            int r0 = r5.A02
            r27 = r0
            boolean r2 = r5.A0x
            r1 = r28
            X.C71138Odg.A03(r3, r8, r1, r0, r2)
            com.instagram.common.session.UserSession r3 = r4.A0Q
            boolean r1 = X.C66732Mbd.A03(r10, r3)
            boolean r10 = r5.A0L
            if (r10 == 0) goto L_0x08bb
            r0 = r1 ^ 1
            r8.Eu4(r0)
            X.3JR r1 = new X.3JR
            r1.<init>()
            r0 = 2131239025(0x7f082071, float:1.8094345E38)
            r1.A01 = r0
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            r1.A05 = r0
            X.AMh r0 = new X.AMh
            r0.<init>(r7)
            r1.A0G = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            r8.ErG(r0)
        L_0x0089:
            r0 = 2131625133(0x7f0e04ad, float:1.8877465E38)
            android.view.View r2 = r8.ETj(r3, r0, r6, r6)
            r0 = 2131428394(0x7f0b042a, float:1.8478431E38)
            android.view.View r0 = r2.requireViewById(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r0
            r4.A0K = r0
            r0 = 2131433695(0x7f0b18df, float:1.8489183E38)
            android.view.View r0 = r2.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r6, r6)
            r4.A0G = r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r11 = r4.A0K
            android.content.Context r0 = r4.A01
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.0nA.A0d(r11, r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r4.A0K
            X.3oV r0 = r4.A0G
            X.7Lj r11 = new X.7Lj
            r11.<init>(r0, r1)
            r4.A0I = r11
            X.7Lf r0 = r4.A0J
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r5.A0O
            if (r0 == 0) goto L_0x0885
            r11.CLE()
        L_0x00d0:
            r0 = 2131442739(0x7f0b3c33, float:1.8507526E38)
            android.view.View r11 = r2.requireViewById(r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r4.A0F = r11
            android.content.Context r1 = r4.A01
            r0 = 2130971409(0x7f040b11, float:1.7551556E38)
            int r0 = X.2Yu.A0F(r1, r0)
            r11.setTextColor(r0)
            r0 = 2131442742(0x7f0b3c36, float:1.8507532E38)
            android.view.View r1 = r2.requireViewById(r0)
            boolean r15 = r5.A0b
            if (r15 != 0) goto L_0x00fa
            X.AMo r0 = new X.AMo
            r0.<init>(r7)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x00fa:
            android.widget.TextView r14 = r4.A0F
            java.lang.String r13 = r5.A0J
            boolean r11 = r5.A0r
            boolean r0 = r5.A0Z
            if (r0 == 0) goto L_0x0882
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.Jw4 r0 = new X.Jw4
            r0.<init>((java.lang.Integer) r1)
        L_0x010b:
            X.C46334Dcc.A00(r14, r0, r13, r11)
            if (r15 != 0) goto L_0x016d
            com.instagram.user.model.User r1 = r5.A0E
            if (r1 == 0) goto L_0x087f
            boolean r0 = r1.A1x()
            if (r0 != 0) goto L_0x0120
            boolean r0 = r1.A20()
            if (r0 == 0) goto L_0x087f
        L_0x0120:
            r11 = 1
        L_0x0121:
            int r1 = r5.A08
            r0 = 29
            if (r1 == r0) goto L_0x016d
            r0 = 32
            if (r1 == r0) goto L_0x016d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = X.AnonymousClass48O.A06(r0)
            if (r0 != 0) goto L_0x016d
            if (r11 != 0) goto L_0x016d
            boolean r0 = X.I5N.A03(r3)
            if (r0 != 0) goto L_0x016d
            X.0Tu r11 = X.0Tu.A05
            r0 = 36323259976789027(0x810bd000002c23, double:3.0343140991249445E-306)
            boolean r0 = X.182.A06(r11, r3, r0)
            if (r0 == 0) goto L_0x016d
            android.content.Context r1 = r4.A01
            r0 = 2131238092(0x7f081ccc, float:1.8092453E38)
            android.graphics.drawable.Drawable r11 = r1.getDrawable(r0)
            if (r11 == 0) goto L_0x016d
            android.content.Context r1 = r4.A01
            r0 = 2130970006(0x7f040596, float:1.754871E38)
            int r0 = X.2Yu.A0F(r1, r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r11.setColorFilter(r0)
            android.widget.TextView r1 = r4.A0F
            if (r1 == 0) goto L_0x016d
            r0 = 0
            r1.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r11, r0)
        L_0x016d:
            int r11 = r5.A08
            r0 = 29
            if (r11 == r0) goto L_0x0818
            r0 = 32
            if (r11 == r0) goto L_0x07f8
            r0 = 62
            if (r11 == r0) goto L_0x07f8
            android.content.Context r13 = r2.getContext()
            if (r10 != 0) goto L_0x034d
            boolean r0 = r5.A0s
            r10 = 1
            if (r0 == 0) goto L_0x07f5
            boolean r0 = r5.A0h
            if (r0 == 0) goto L_0x07f5
            X.0Tu r14 = X.0Tu.A05
            r0 = 36329058182643467(0x81111600003f0b, double:3.0379809078547933E-306)
            boolean r0 = X.182.A06(r14, r3, r0)
            if (r0 == 0) goto L_0x07f5
        L_0x0197:
            if (r10 == 0) goto L_0x019c
            X.C330447Mu.A01(r8, r7, r4, r5, r12)
        L_0x019c:
            X.7Zg r0 = r4.A0R
            X.7S7 r16 = r0.C6l()
            boolean r0 = r16.CZ0()
            if (r0 != 0) goto L_0x07d8
            com.instagram.direct.model.messaginguser.MessagingUser r1 = r5.A0B
            if (r1 == 0) goto L_0x01b1
            com.instagram.api.schemas.IGAIAgentType r14 = r1.A01
            r0 = 1
            if (r14 != 0) goto L_0x01b2
        L_0x01b1:
            r0 = 0
        L_0x01b2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01c4
            if (r1 == 0) goto L_0x07d8
            com.instagram.api.schemas.IGAIAgentType r1 = r1.A01
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A04
            if (r1 != r0) goto L_0x07d8
        L_0x01c4:
            if (r10 != 0) goto L_0x01cc
            android.view.View r0 = X.C330447Mu.A00(r8, r7, r4, r5)
            r4.A09 = r0
        L_0x01cc:
            boolean r0 = r5.A0l
            if (r0 == 0) goto L_0x022b
            android.content.Context r0 = r4.A01
            X.AMm r14 = new X.AMm
            r14.<init>(r7)
            X.MsY r15 = new X.MsY
            r15.<init>(r0)
            r0 = 2131238541(0x7f081e8d, float:1.8093364E38)
            r15.setButtonResource(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r27)
            r15.setColorFilter(r0)
            X.3JR r1 = new X.3JR
            r1.<init>()
            r15.setClipToPadding(r6)
            r1.A0I = r15
            r0 = 2131969368(0x7f134558, float:1.9575657E38)
            r1.A05 = r0
            r1.A0G = r14
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            r8.AA4(r0)
            java.lang.String r15 = r16.C6k()
            java.util.List r1 = r16.BRZ()
            if (r15 == 0) goto L_0x022b
            int r14 = r1.size()
            r0 = 1
            if (r14 != r0) goto L_0x022b
            X.OJd r14 = new X.OJd
            r14.<init>(r3)
            java.lang.Object r0 = r1.get(r6)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = r0.getId()
            r0 = 3123(0xc33, float:4.376E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r14.A00(r15, r1, r0)
        L_0x022b:
            if (r10 != 0) goto L_0x0230
            X.C330447Mu.A01(r8, r7, r4, r5, r12)
        L_0x0230:
            boolean r0 = r5.A0P
            if (r0 == 0) goto L_0x026b
            X.0qQ.A0B(r13, r6)
            X.AMk r12 = new X.AMk
            r12.<init>(r7)
            X.MsY r14 = new X.MsY
            r14.<init>(r13)
            r0 = 2131238947(0x7f082023, float:1.8094187E38)
            r14.setButtonResource(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r27)
            r14.setColorFilter(r0)
            X.3JR r1 = new X.3JR
            r1.<init>()
            r14.setClipToPadding(r6)
            r1.A0I = r14
            r0 = 2131952330(0x7f1302ca, float:1.95411E38)
            r1.A05 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            r1.A0L = r0
            r1.A0G = r12
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            r8.AA4(r0)
        L_0x026b:
            boolean r0 = r5.A0w
            if (r0 == 0) goto L_0x0296
            androidx.fragment.app.Fragment r14 = r4.A0O
            boolean r13 = r5.A0u
            boolean r12 = r5.A0v
            boolean r1 = r5.A0R
            X.0qQ.A0B(r14, r6)
            X.AMl r0 = new X.AMl
            r0.<init>(r7)
            if (r1 != 0) goto L_0x0783
            android.content.Context r17 = r14.requireContext()
            r22 = 1
            r20 = 1050253722(0x3e99999a, float:0.3)
            r18 = r0
            r19 = r8
            r21 = r27
        L_0x0290:
            android.view.View r0 = X.C71138Odg.A00(r17, r18, r19, r20, r21, r22)
        L_0x0294:
            r4.A07 = r0
        L_0x0296:
            boolean r0 = r5.A0i
            if (r0 != 0) goto L_0x02bc
            boolean r0 = r5.A0e
            if (r0 == 0) goto L_0x02dd
            android.view.View r0 = r4.A03
            if (r0 != 0) goto L_0x02bc
            X.LTH r1 = new X.LTH
            r1.<init>(r3)
            X.7SD r0 = r16.C6Q()
            java.util.List r0 = r0.A0b
            java.lang.Object r0 = r0.get(r6)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.4Cl r0 = r0.A03
            java.lang.String r0 = r0.AaU()
            r1.A0A(r0)
        L_0x02bc:
            X.3JR r1 = new X.3JR
            r1.<init>()
            r0 = 2131238771(0x7f081f73, float:1.809383E38)
            r1.A06 = r0
            r0 = 2131973150(0x7f13541e, float:1.9583328E38)
            r1.A05 = r0
            X.AMe r0 = new X.AMe
            r0.<init>(r7)
            r1.A0G = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            android.view.View r0 = r8.AA3(r0)
            r4.A03 = r0
        L_0x02dd:
            boolean r0 = r5.A0g
            if (r0 == 0) goto L_0x0320
            android.view.View r0 = r4.A05
            if (r0 != 0) goto L_0x02ff
            X.LTH r1 = new X.LTH
            r1.<init>(r3)
            X.7SD r0 = r16.C6Q()
            java.util.List r0 = r0.A0b
            java.lang.Object r0 = r0.get(r6)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.4Cl r0 = r0.A03
            java.lang.String r0 = r0.AaU()
            r1.A0B(r0)
        L_0x02ff:
            X.3JR r1 = new X.3JR
            r1.<init>()
            r0 = 2131237857(0x7f081be1, float:1.8091976E38)
            r1.A06 = r0
            r0 = 2131952628(0x7f1303f4, float:1.9541704E38)
            r1.A05 = r0
            X.AMg r0 = new X.AMg
            r0.<init>(r7)
            r1.A0G = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            android.view.View r0 = r8.AA3(r0)
            r4.A05 = r0
        L_0x0320:
            boolean r0 = r5.A0f
            if (r0 == 0) goto L_0x0345
            X.3JR r1 = new X.3JR
            r1.<init>()
            r0 = 2131238210(0x7f081d42, float:1.8092692E38)
            r1.A06 = r0
            r0 = 2131952542(0x7f13039e, float:1.954153E38)
            r1.A05 = r0
            X.AMf r0 = new X.AMf
            r0.<init>(r7)
            r1.A0G = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            android.view.View r0 = r8.AA3(r0)
            r4.A04 = r0
        L_0x0345:
            if (r10 == 0) goto L_0x034d
        L_0x0347:
            android.view.View r0 = X.C330447Mu.A00(r8, r7, r4, r5)
            r4.A09 = r0
        L_0x034d:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r4.A0K
            r17 = r0
            r17.getClass()
            android.widget.TextView r15 = r4.A0F
            android.view.View r14 = r4.A0A
            android.view.View r13 = r4.A06
            android.view.View r12 = r4.A09
            android.view.View r10 = r4.A03
            android.view.View r8 = r4.A05
            android.view.View r1 = r4.A04
            android.view.View r0 = r4.A07
            r16 = r7
            r18 = r15
            r19 = r2
            r20 = r14
            r21 = r13
            r22 = r12
            r23 = r10
            r24 = r8
            r25 = r1
            r26 = r0
            r16.CnZ(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r0 = X.C330447Mu.A02(r4, r5)
            if (r0 == 0) goto L_0x03b0
            X.9Iv r1 = r5.A0A
            if (r1 == 0) goto L_0x03b0
            r0 = 2131442737(0x7f0b3c31, float:1.8507522E38)
            android.view.View r8 = r2.requireViewById(r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.String r0 = r1.A02
            r8.setText(r0)
            r8.setVisibility(r6)
            java.lang.Object r1 = r1.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 == r0) goto L_0x06d9
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            if (r1 == r0) goto L_0x06d9
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x06df
            android.content.Context r1 = r4.A01
            r0 = 2131099673(0x7f060019, float:1.7811706E38)
        L_0x03a9:
            int r0 = r1.getColor(r0)
            r8.setTextColor(r0)
        L_0x03b0:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r4.A0K
            r0.getClass()
            X.3oV r0 = r4.A0G
            r0.getClass()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r12 = r4.A0K
            X.3oV r10 = r4.A0G
            r0 = 2131442731(0x7f0b3c2b, float:1.850751E38)
            android.view.View r13 = r2.requireViewById(r0)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r4.A0E = r13
            int r0 = r5.A03
            if (r0 != 0) goto L_0x03db
            android.content.Context r1 = r4.A01
            r0 = 2130969273(0x7f0402b9, float:1.7547223E38)
            int r0 = X.2Yu.A0F(r1, r0)
        L_0x03db:
            r13.setTextColor(r0)
            android.widget.TextView r1 = r4.A0E
            X.AMn r0 = new X.AMn
            r0.<init>(r7)
            X.AnonymousClass0fU.A00(r0, r1)
            boolean r0 = r5.A0W
            r14 = 1
            android.widget.TextView r13 = r4.A0E
            if (r0 == 0) goto L_0x061f
            android.content.Context r0 = r4.A01
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131959634(0x7f131f52, float:1.9555914E38)
            java.lang.String r0 = r1.getString(r0)
            r13.setText(r0)
        L_0x03ff:
            android.widget.TextView r0 = r4.A0E
            r8.add(r0)
        L_0x0404:
            boolean r0 = r5.A0q
            if (r0 == 0) goto L_0x0426
            r0 = 2131442499(0x7f0b3b43, float:1.850704E38)
            android.view.View r0 = r2.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r6, r6)
            android.view.View r1 = r0.getView()
            r4.A08 = r1
            X.AO6 r0 = new X.AO6
            r0.<init>(r7, r4, r5)
            X.AnonymousClass0fU.A00(r0, r1)
            android.view.View r0 = r4.A08
            r8.add(r0)
        L_0x0426:
            r0 = 2131442730(0x7f0b3c2a, float:1.8507508E38)
            android.view.View r12 = r2.requireViewById(r0)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r4.A0D = r12
            int r13 = r5.A05
            if (r13 <= 0) goto L_0x045c
            android.content.Context r0 = r4.A01
            android.content.res.Resources r10 = r0.getResources()
            r1 = 2131820669(0x7f11007d, float:1.927406E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r10.getQuantityString(r1, r13, r0)
            r12.setText(r0)
            android.widget.TextView r1 = r4.A0D
            X.AMp r0 = new X.AMp
            r0.<init>(r7)
            X.AnonymousClass0fU.A00(r0, r1)
            android.widget.TextView r0 = r4.A0D
            r8.add(r0)
        L_0x045c:
            r0 = 2131442716(0x7f0b3c1c, float:1.850748E38)
            android.view.View r0 = r2.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.A0C = r0
            int r1 = r5.A04
            if (r1 <= 0) goto L_0x04bb
            boolean r0 = r5.A0S
            if (r0 != 0) goto L_0x04bb
            java.util.Calendar r12 = java.util.Calendar.getInstance()
            java.util.Calendar r10 = java.util.Calendar.getInstance()
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = (long) r1
            long r0 = r7.toMillis(r0)
            r10.setTimeInMillis(r0)
            long r0 = r10.getTimeInMillis()
            long r12 = r12.getTimeInMillis()
            long r0 = r0 - r12
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r14 = r7.toHours(r0)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.DAYS
            r0 = 1
            long r12 = r7.toHours(r0)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x04bb
            android.widget.TextView r10 = r4.A0C
            android.content.Context r0 = r4.A01
            android.content.res.Resources r7 = r0.getResources()
            r1 = 2131960521(0x7f1322c9, float:1.9557713E38)
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r7.getString(r1, r0)
            r10.setText(r0)
            android.widget.TextView r0 = r4.A0C
            r8.add(r0)
        L_0x04bb:
            java.lang.CharSequence r10 = r5.A0F
            if (r10 == 0) goto L_0x04f9
            X.0Tu r7 = X.0Tu.A05
            r0 = 36329968715776396(0x8111ea0001418c, double:3.03855673267448E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 == 0) goto L_0x04f9
            r0 = 2131429250(0x7f0b0782, float:1.8480167E38)
            android.view.View r0 = r2.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.A0B = r0
            r0.setText(r10)
            android.widget.TextView r0 = r4.A0B
            r8.add(r6, r0)
            java.lang.Boolean r0 = r4.A0L
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04f9
            X.0iw r7 = r4.A0P
            X.7Zg r1 = r4.A0R
            X.7Lh r0 = new X.7Lh
            r0.<init>(r7, r3, r1)
            r0.A00()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r4.A0L = r0
        L_0x04f9:
            int r0 = r8.size()
            r12 = 1
            if (r0 > r12) goto L_0x059c
            r0 = 29
            if (r11 != r0) goto L_0x059c
            X.0Tu r7 = X.0Tu.A05
            r0 = 36319407397739890(0x81084f00651d72, double:3.0318777126211796E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 == 0) goto L_0x059c
            r0 = 2131429829(0x7f0b09c5, float:1.8481342E38)
            android.view.View r0 = r2.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            android.content.Context r0 = r4.A01
            X.OTh r10 = new X.OTh
            r10.<init>(r0, r1, r3)
            r4.A0H = r10
            X.3t3 r1 = r5.A0C
            int r11 = r5.A06
            com.instagram.common.ui.base.IgTextView r0 = r10.A00
            r0.setVisibility(r6)
            com.instagram.direct.ui.countertextview.CounterTextView r7 = r10.A01
            r7.setVisibility(r6)
            if (r11 == 0) goto L_0x0595
            if (r1 == 0) goto L_0x0595
            X.3t0 r0 = X.C300965yF.A01(r1)
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x0595
            X.2E6 r0 = r10.A03
            java.util.Map r3 = r0.A00
            java.lang.Object r0 = r3.get(r1)
            if (r0 != 0) goto L_0x0552
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r3.put(r1, r0)
        L_0x0552:
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            if (r12 > r3) goto L_0x0618
            if (r3 >= r11) goto L_0x0618
            android.content.Context r0 = r10.A02
            r16 = r0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            android.content.res.Resources r0 = r16.getResources()
            X.0qQ.A07(r0)
            r15 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r14 = X.C253673rC.A04(r0, r13, r15, r12, r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            android.content.res.Resources r0 = r16.getResources()
            X.0qQ.A07(r0)
            java.lang.String r0 = X.C253673rC.A04(r0, r13, r15, r12, r12)
            boolean r0 = X.0qQ.A0K(r14, r0)
            if (r0 != 0) goto L_0x0618
            r0 = r16
            X.C70960OTh.A00(r0, r10, r1, r3, r6)
            X.ApP r3 = new X.ApP
            r3.<init>(r10, r1, r11)
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.postDelayed(r3, r0)
        L_0x0595:
            android.widget.TextView r0 = r4.A0E
            if (r0 == 0) goto L_0x059c
            r8.remove(r0)
        L_0x059c:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x05ab
            java.lang.Object r0 = r8.get(r6)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r6)
        L_0x05ab:
            r0 = 2131442736(0x7f0b3c30, float:1.850752E38)
            android.view.View r1 = r2.requireViewById(r0)
            com.instagram.reels.viewer.attribution.CyclingFrameLayout r1 = (com.instagram.reels.viewer.attribution.CyclingFrameLayout) r1
            X.PbF r0 = new X.PbF
            r0.<init>(r4, r5, r1, r8)
            r2.post(r0)
        L_0x05bc:
            boolean r3 = r5.A0s
            boolean r0 = r9.A00
            if (r0 != 0) goto L_0x05f2
            com.instagram.common.session.UserSession r2 = r9.A03
            X.4DH r0 = r9.A01
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.MaI r1 = X.C66653MaM.A00(r0, r2)
            X.0eM r0 = r9.A08
            java.lang.Object r0 = r0.getValue()
            X.7Ri r0 = (X.C331527Ri) r0
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x05f2
            if (r3 == 0) goto L_0x05f2
            r0 = 1
            r9.A00 = r0
            X.7Rj r1 = X.C331537Rj.DIRECT_THREAD
            X.7Zg r0 = X.AnonymousClass7VX.A00(r9)
            X.7S7 r0 = r0.C6l()
            java.lang.String r0 = r0.C6C()
            X.C71096OcW.A04(r2, r1, r0)
        L_0x05f2:
            r0 = r29
            X.7Mu r1 = r0.A00
            if (r1 == 0) goto L_0x0617
            X.4DH r0 = r0.A03
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r4 = r1.A0Q
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r3 = r1.A0K
            java.lang.String r0 = "message_level_debug_enable"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r6 = java.util.Arrays.asList(r0)
            java.lang.String r5 = "Direct"
            r0 = 3
            X.0qQ.A0B(r6, r0)
            X.7Cs r7 = X.C327917Cs.A00
            X.C327927Ct.A00(r2, r3, r4, r5, r6, r7)
        L_0x0617:
            return
        L_0x0618:
            android.content.Context r0 = r10.A02
            X.C70960OTh.A00(r0, r10, r1, r11, r6)
            goto L_0x0595
        L_0x061f:
            java.lang.String r0 = ""
            r13.setText(r0)
            android.graphics.drawable.Drawable r0 = r12.A06
            if (r0 != 0) goto L_0x0404
            java.lang.CharSequence r1 = r5.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x06d6
            android.widget.TextView r0 = r4.A0E
            r0.setText(r1)
            r15 = 1
        L_0x0636:
            boolean r0 = r5.A0m
            if (r0 == 0) goto L_0x06d3
            com.instagram.direct.model.messaginguser.MessagingUser r0 = r5.A0B
            if (r0 == 0) goto L_0x0643
            com.instagram.api.schemas.IGAIAgentType r1 = r0.A01
            r0 = 1
            if (r1 != 0) goto L_0x0644
        L_0x0643:
            r0 = 0
        L_0x0644:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x06d3
        L_0x064e:
            boolean r0 = r5.A0n
            if (r0 == 0) goto L_0x06a7
            android.content.Context r1 = r4.A01
            r0 = 2130970900(0x7f040914, float:1.7550523E38)
        L_0x0657:
            int r0 = X.2Yu.A0H(r1, r0)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            r4.A02 = r0
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r6)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r28)
            r1.setColorFilter(r0)
            boolean r0 = r10.CVM()
            if (r0 == 0) goto L_0x06cd
            X.0Tu r13 = X.0Tu.A05
            r0 = 36327670908205671(0x810fd300003a67, double:3.0371035899142254E-306)
            boolean r0 = X.182.A06(r13, r3, r0)
            if (r0 == 0) goto L_0x06cd
            android.view.View r1 = r10.getView()
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r1 = (com.instagram.igds.components.faceswarm.IgdsFaceSwarm) r1
            android.graphics.drawable.LayerDrawable r0 = r4.A02
            r1.setBottomBadgeDrawable(r0)
        L_0x068c:
            if (r15 == 0) goto L_0x0404
            r0 = 2131442737(0x7f0b3c31, float:1.8507522E38)
            android.view.View r0 = r2.requireViewById(r0)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03ff
            r0 = 2131442738(0x7f0b3c32, float:1.8507524E38)
            android.view.View r0 = r2.requireViewById(r0)
            r0.setVisibility(r6)
            goto L_0x03ff
        L_0x06a7:
            if (r14 == 0) goto L_0x06af
            android.content.Context r1 = r4.A01
            r0 = 2130970844(0x7f0408dc, float:1.755041E38)
            goto L_0x0657
        L_0x06af:
            boolean r0 = r10.CVM()
            r13 = 0
            if (r0 == 0) goto L_0x06cf
            X.0Tu r14 = X.0Tu.A05
            r0 = 36327670908205671(0x810fd300003a67, double:3.0371035899142254E-306)
            boolean r0 = X.182.A06(r14, r3, r0)
            if (r0 == 0) goto L_0x06cf
            android.view.View r0 = r10.getView()
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r0 = (com.instagram.igds.components.faceswarm.IgdsFaceSwarm) r0
            r0.setBottomBadgeDrawable(r13)
            goto L_0x068c
        L_0x06cd:
            android.graphics.drawable.LayerDrawable r13 = r4.A02
        L_0x06cf:
            r12.setBottomBadgeDrawable(r13)
            goto L_0x068c
        L_0x06d3:
            r14 = 0
            goto L_0x064e
        L_0x06d6:
            r15 = 0
            goto L_0x0636
        L_0x06d9:
            android.content.Context r1 = r4.A01
            r10 = 2130970229(0x7f040675, float:1.7549162E38)
            goto L_0x06e8
        L_0x06df:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r1 != r0) goto L_0x06ee
            android.content.Context r1 = r4.A01
            r10 = 2130970331(0x7f0406db, float:1.754937E38)
        L_0x06e8:
            int r0 = X.2Yu.A0H(r1, r10)
            goto L_0x03a9
        L_0x06ee:
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r1 != r0) goto L_0x06f8
            android.content.Context r1 = r4.A01
            r10 = 2130970224(0x7f040670, float:1.7549152E38)
            goto L_0x06e8
        L_0x06f8:
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            if (r1 == r0) goto L_0x077c
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            r12 = 8
            if (r1 != r0) goto L_0x0714
            X.0Tu r10 = X.0Tu.A05
            r0 = 36316830411723430(0x8105f7000f12a6, double:3.0302480162876805E-306)
        L_0x0709:
            boolean r0 = X.182.A06(r10, r3, r0)
            if (r0 != 0) goto L_0x077c
            r8.setVisibility(r12)
            goto L_0x03b0
        L_0x0714:
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            if (r1 != r0) goto L_0x0720
            X.0Tu r10 = X.0Tu.A05
            r0 = 36316830411788967(0x8105f7001012a7, double:3.0302480163291264E-306)
            goto L_0x0709
        L_0x0720:
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            if (r1 != r0) goto L_0x0767
            X.0Tu r10 = X.0Tu.A05
            r0 = 36316830412051114(0x8105f7001412aa, double:3.030248016494909E-306)
            boolean r0 = X.182.A06(r10, r3, r0)
            if (r0 == 0) goto L_0x03b0
            r10 = 2130970230(0x7f040676, float:1.7549164E38)
        L_0x0734:
            android.content.Context r1 = r4.A01
            r0 = 2131237928(0x7f081c28, float:1.809212E38)
            android.graphics.drawable.Drawable r12 = r1.getDrawable(r0)
            if (r12 == 0) goto L_0x0764
            android.content.Context r1 = r4.A01
            int r0 = X.2Yu.A0H(r1, r10)
            int r0 = r1.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r12.setColorFilter(r0)
            r0 = 0
            r8.setCompoundDrawablesWithIntrinsicBounds(r12, r0, r0, r0)
            android.content.Context r0 = r4.A01
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165293(0x7f07006d, float:1.79448E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r8.setCompoundDrawablePadding(r0)
        L_0x0764:
            android.content.Context r1 = r4.A01
            goto L_0x06e8
        L_0x0767:
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            if (r1 != r0) goto L_0x03b0
            X.0Tu r10 = X.0Tu.A05
            r0 = 36316830411985577(0x8105f7001312a9, double:3.0302480164534633E-306)
            boolean r0 = X.182.A06(r10, r3, r0)
            if (r0 == 0) goto L_0x03b0
            r10 = 2130970228(0x7f040674, float:1.754916E38)
            goto L_0x0734
        L_0x077c:
            android.content.Context r1 = r4.A01
            r10 = 2130970230(0x7f040676, float:1.7549164E38)
            goto L_0x06e8
        L_0x0783:
            if (r12 == 0) goto L_0x07c8
            android.content.Context r1 = r14.requireContext()
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r1)
            r12 = 2131627245(0x7f0e0ced, float:1.888175E38)
            r1 = 0
            android.view.View r13 = r13.inflate(r12, r1)
            X.0qQ.A07(r13)
            r1 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            android.view.View r12 = r13.requireViewById(r1)
            X.0qQ.A07(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            android.graphics.ColorFilter r1 = X.AnonymousClass37O.A00(r27)
            r12.setColorFilter(r1)
            X.3JR r12 = new X.3JR
            r12.<init>()
            r12.A0I = r13
            r1 = 2131953831(0x7f1308a7, float:1.9544144E38)
            r12.A05 = r1
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            r12.A0L = r1
            r12.A0G = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r12)
            android.view.View r0 = r8.AA4(r0)
            goto L_0x0294
        L_0x07c8:
            android.content.Context r17 = r14.requireContext()
            r20 = 1065353216(0x3f800000, float:1.0)
            r18 = r0
            r19 = r8
            r21 = r27
            r22 = r13
            goto L_0x0290
        L_0x07d8:
            android.content.Context r0 = r4.A01
            android.widget.ImageView r1 = X.C71138Odg.A01(r0, r8, r7)
            int r14 = r5.A05
            X.0qQ.A0B(r1, r6)
            r0 = 0
            if (r14 <= 0) goto L_0x07e7
            r0 = 1
        L_0x07e7:
            r1.setActivated(r0)
            r0 = 10000(0x2710, float:1.4013E-41)
            int r0 = java.lang.Math.min(r14, r0)
            r1.setImageLevel(r0)
            goto L_0x01c4
        L_0x07f5:
            r10 = 0
            goto L_0x0197
        L_0x07f8:
            boolean r0 = r5.A0Q
            if (r0 == 0) goto L_0x034d
            boolean r0 = r5.A0S
            if (r0 != 0) goto L_0x034d
            boolean r0 = r5.A0a
            if (r0 != 0) goto L_0x034d
            X.0Tu r10 = X.0Tu.A05
            r0 = 36330226413814289(0x81122600014211, double:3.0387197019513105E-306)
            boolean r0 = X.182.A06(r10, r3, r0)
            if (r0 == 0) goto L_0x034d
            boolean r0 = r5.A0d
            X.C71138Odg.A05(r8, r7, r0)
            goto L_0x034d
        L_0x0818:
            boolean r10 = r5.A0a
            if (r10 == 0) goto L_0x0856
            boolean r0 = r5.A0S
            if (r0 != 0) goto L_0x0856
            X.0Tu r12 = X.0Tu.A05
            r0 = 36319407395052878(0x81084f003c1d4e, double:3.0318777109219024E-306)
            boolean r0 = X.182.A06(r12, r3, r0)
            if (r0 == 0) goto L_0x0856
            r0 = 36319407394987341(0x81084f003b1d4d, double:3.0318777108804565E-306)
            boolean r0 = X.182.A06(r12, r3, r0)
            X.3JR r1 = new X.3JR
            if (r0 == 0) goto L_0x086c
            r1.<init>()
            r0 = 2131238596(0x7f081ec4, float:1.8093475E38)
            r1.A06 = r0
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            r1.A05 = r0
            X.AMj r0 = new X.AMj
            r0.<init>(r7)
        L_0x084c:
            r1.A0G = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            r8.AA3(r0)
        L_0x0856:
            boolean r0 = r5.A0Q
            if (r0 == 0) goto L_0x0869
            boolean r0 = r5.A0S
            if (r0 != 0) goto L_0x0869
            if (r10 != 0) goto L_0x0347
            boolean r0 = r5.A0d
            X.C71138Odg.A05(r8, r7, r0)
        L_0x0865:
            boolean r10 = r5.A0T
            goto L_0x0345
        L_0x0869:
            if (r10 != 0) goto L_0x0347
            goto L_0x0865
        L_0x086c:
            r1.<init>()
            r0 = 2131238772(0x7f081f74, float:1.8093832E38)
            r1.A06 = r0
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            r1.A05 = r0
            X.AMi r0 = new X.AMi
            r0.<init>(r7)
            goto L_0x084c
        L_0x087f:
            r11 = 0
            goto L_0x0121
        L_0x0882:
            r0 = 0
            goto L_0x010b
        L_0x0885:
            X.0iw r1 = r4.A0P
            r11.Eu3(r1)
            X.7Lj r0 = r4.A0I
            r17 = r0
            X.34S r0 = r5.A09
            r16 = r0
            java.util.List r0 = r5.A0K
            r22 = r0
            com.instagram.model.reels.Reel r0 = r5.A0D
            r21 = r0
            X.7Lf r14 = r4.A0J
            boolean r13 = r5.A0j
            int r11 = r5.A08
            com.instagram.direct.model.messaginguser.MessagingUser r0 = r5.A0B
            boolean r15 = r5.A0b
            r26 = r15 ^ 1
            r15 = r17
            r17 = r1
            r18 = r3
            r19 = r14
            r20 = r0
            r23 = r11
            r24 = r28
            r25 = r13
            r15.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x00d0
        L_0x08bb:
            boolean r0 = r5.A0t
            if (r0 == 0) goto L_0x0089
            r0 = r27
            X.C71138Odg.A04(r8, r7, r0, r1)
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7TI.configureActionBar(X.2da):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: X.3t2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.P27} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.7Zf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: X.P27} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: X.7Yw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: X.7Yw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: X.7Zf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v6, resolved type: X.7Zf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v2, resolved type: X.P27} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v3, resolved type: X.P27} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: X.7Yw} */
    /* JADX WARNING: type inference failed for: r25v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C333197Ya A00(android.os.Bundle r76, android.os.Bundle r77, X.AnonymousClass7TI r78) {
        /*
            java.lang.String r5 = "DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID"
            r16 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0012
            r1 = 2053964469(0x7a6d02b5, float:3.0765732E35)
            java.lang.String r0 = "CreateClientInfra"
            X.0fS.A01(r0, r1)
        L_0x0012:
            X.3t2 r0 = X.AnonymousClass9H9.A00(r76)     // Catch:{ all -> 0x0553 }
            r4 = r78
            X.4DH r6 = r4.A0U     // Catch:{ all -> 0x0553 }
            com.instagram.common.session.UserSession r9 = r4.A0d     // Catch:{ all -> 0x0553 }
            java.lang.String r11 = r4.A12     // Catch:{ all -> 0x0553 }
            android.os.Handler r8 = r4.A0S     // Catch:{ all -> 0x0553 }
            X.7Tw r1 = r4.A0j     // Catch:{ all -> 0x0553 }
            X.7UC r7 = r1.A0J     // Catch:{ all -> 0x0553 }
            r1 = 4
            X.9Lc r3 = new X.9Lc     // Catch:{ all -> 0x0553 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x0553 }
            r10 = 5
            X.9Lc r2 = new X.9Lc     // Catch:{ all -> 0x0553 }
            r2.<init>(r4, r10)     // Catch:{ all -> 0x0553 }
            r1 = 0
            X.0qQ.A0B(r6, r1)     // Catch:{ all -> 0x0553 }
            r1 = 1
            X.0qQ.A0B(r9, r1)     // Catch:{ all -> 0x0553 }
            r14 = 2
            X.0qQ.A0B(r11, r14)     // Catch:{ all -> 0x0553 }
            r26 = 3
            r1 = r26
            X.0qQ.A0B(r8, r1)     // Catch:{ all -> 0x0553 }
            X.0qQ.A0B(r7, r10)     // Catch:{ all -> 0x0553 }
            r1 = 0
            java.util.List r10 = X.C333407Yv.A00     // Catch:{ all -> 0x0553 }
            boolean r24 = r10.contains(r11)     // Catch:{ all -> 0x0553 }
            android.os.Bundle r10 = r6.mArguments     // Catch:{ all -> 0x0553 }
            if (r10 == 0) goto L_0x00c7
            java.lang.String r11 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_SORT_ORDER"
            long r18 = r10.getLong(r11)     // Catch:{ all -> 0x0553 }
            if (r24 == 0) goto L_0x0084
            java.lang.String r11 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_HIGHLIGHT_RANGES"
            java.util.ArrayList r23 = r10.getParcelableArrayList(r11)     // Catch:{ all -> 0x0553 }
        L_0x005f:
            boolean r12 = r0 instanceof X.C254773t1     // Catch:{ all -> 0x0553 }
            if (r12 == 0) goto L_0x0087
            X.3t1 r0 = X.AnonymousClass6W3.A01(r0)     // Catch:{ all -> 0x0553 }
            X.3t0 r0 = X.AnonymousClass6W4.A00(r0)     // Catch:{ all -> 0x0553 }
            if (r0 == 0) goto L_0x00c7
            java.lang.String r13 = r0.A00     // Catch:{ all -> 0x0553 }
            X.2Dm r11 = X.1bJ.A00(r9)     // Catch:{ all -> 0x0553 }
            X.2Dr r11 = (X.2Dr) r11     // Catch:{ all -> 0x0553 }
            r0 = 0
            X.0qQ.A0B(r13, r0)     // Catch:{ all -> 0x0553 }
            X.3U9 r0 = r11.A0N(r13)     // Catch:{ all -> 0x0553 }
            if (r0 == 0) goto L_0x008c
            com.instagram.model.direct.DirectThreadKey r20 = r0.BJz()     // Catch:{ all -> 0x0553 }
            goto L_0x008e
        L_0x0084:
            r23 = r1
            goto L_0x005f
        L_0x0087:
            X.3sy r20 = X.AnonymousClass6W3.A06(r0)     // Catch:{ all -> 0x0553 }
            goto L_0x008e
        L_0x008c:
            r20 = r1
        L_0x008e:
            if (r24 == 0) goto L_0x00a0
            if (r12 == 0) goto L_0x0093
            goto L_0x00a3
        L_0x0093:
            r0 = -1
            java.lang.String r11 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CLIENT_THREAD_PK"
            long r0 = r10.getLong(r11, r0)     // Catch:{ all -> 0x0553 }
            java.lang.String r22 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0553 }
            goto L_0x00a9
        L_0x00a0:
            r22 = r1
            goto L_0x00a9
        L_0x00a3:
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_ID"
            java.lang.String r22 = r10.getString(r0, r1)     // Catch:{ all -> 0x0553 }
        L_0x00a9:
            java.lang.Long r21 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0553 }
            X.7Mt r1 = new X.7Mt     // Catch:{ all -> 0x0553 }
            r18 = r1
            r19 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0553 }
            X.7BI r0 = new X.7BI     // Catch:{ all -> 0x0553 }
            r0.<init>(r8, r6)     // Catch:{ all -> 0x0553 }
            r1.A03 = r0     // Catch:{ all -> 0x0553 }
            X.7BJ r8 = new X.7BJ     // Catch:{ all -> 0x0553 }
            r8.<init>(r7, r3, r2)     // Catch:{ all -> 0x0553 }
            java.util.List r0 = r1.A0D     // Catch:{ all -> 0x0553 }
            r0.add(r8)     // Catch:{ all -> 0x0553 }
        L_0x00c7:
            r4.A07 = r1     // Catch:{ all -> 0x0553 }
            java.lang.String r3 = "DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES"
            r0 = r76
            android.os.Parcelable r2 = r0.getParcelable(r3)     // Catch:{ all -> 0x0553 }
            com.instagram.direct.capabilities.Capabilities r2 = (com.instagram.direct.capabilities.Capabilities) r2     // Catch:{ all -> 0x0553 }
            java.lang.String r12 = "Required value was null."
            r1 = r77
            if (r77 != 0) goto L_0x00dd
            if (r2 != 0) goto L_0x00ef
            goto L_0x054d
        L_0x00dd:
            android.os.Parcelable r0 = r1.getParcelable(r3)     // Catch:{ all -> 0x0553 }
            com.instagram.direct.capabilities.Capabilities r0 = (com.instagram.direct.capabilities.Capabilities) r0     // Catch:{ all -> 0x0553 }
            if (r0 != 0) goto L_0x00ee
            if (r2 != 0) goto L_0x00ef
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0553 }
            r1.<init>(r12)     // Catch:{ all -> 0x0553 }
            goto L_0x0552
        L_0x00ee:
            r2 = r0
        L_0x00ef:
            r4.A06 = r2     // Catch:{ all -> 0x0553 }
            java.lang.String r2 = "DirectThreadFragment.ARGUMENT_SHOW_PERMISSIONS"
            if (r77 == 0) goto L_0x00fa
            boolean r49 = r1.getBoolean(r2)     // Catch:{ all -> 0x0553 }
            goto L_0x0100
        L_0x00fa:
            r0 = r76
            boolean r49 = r0.getBoolean(r2)     // Catch:{ all -> 0x0553 }
        L_0x0100:
            java.lang.String r2 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_NAME"
            r3 = 0
            r0 = r76
            java.lang.String r45 = r0.getString(r2, r3)     // Catch:{ all -> 0x0553 }
            android.os.Bundle r6 = r6.requireArguments()     // Catch:{ all -> 0x0553 }
            java.lang.String r2 = "DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET"
            r0 = 0
            boolean r0 = r6.getBoolean(r2, r0)     // Catch:{ all -> 0x0553 }
            r4.A0L = r0     // Catch:{ all -> 0x0553 }
            r0 = r76
            java.lang.String r2 = r0.getString(r5)     // Catch:{ all -> 0x0553 }
            if (r2 != 0) goto L_0x0129
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0553 }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x0553 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x0553 }
        L_0x0129:
            r4.A0G = r2     // Catch:{ all -> 0x0553 }
            java.lang.String r0 = "expiringMessageReplaySessionId"
            if (r77 == 0) goto L_0x0132
            goto L_0x013d
        L_0x0130:
            r4.A0G = r2     // Catch:{ all -> 0x0553 }
        L_0x0132:
            X.7YZ r1 = r4.A16     // Catch:{ all -> 0x0553 }
            com.instagram.direct.capabilities.Capabilities r0 = r4.A06     // Catch:{ all -> 0x0553 }
            r22 = r0
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "_capabilities"
            goto L_0x0147
        L_0x013d:
            java.lang.String r2 = r1.getString(r5)     // Catch:{ all -> 0x0553 }
            if (r2 != 0) goto L_0x0130
            java.lang.String r2 = r4.A0G     // Catch:{ all -> 0x0553 }
            if (r2 != 0) goto L_0x0130
        L_0x0147:
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0553 }
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0552
        L_0x0150:
            X.7Mt r0 = r4.A07     // Catch:{ all -> 0x0553 }
            r75 = r0
            X.3t2 r25 = X.AnonymousClass9H9.A00(r76)     // Catch:{ all -> 0x0553 }
            java.lang.String r0 = r1.A0Q     // Catch:{ all -> 0x0553 }
            r21 = r0
            com.instagram.common.session.UserSession r0 = r1.A04     // Catch:{ all -> 0x0553 }
            boolean r4 = r1.A0T     // Catch:{ all -> 0x0553 }
            r70 = r4
            boolean r4 = r1.A0V     // Catch:{ all -> 0x0553 }
            r71 = r4
            java.lang.String r4 = r1.A0P     // Catch:{ all -> 0x0553 }
            r67 = r4
            X.7Rr r4 = r1.A0K     // Catch:{ all -> 0x0553 }
            r66 = r4
            X.9HC r4 = r1.A0H     // Catch:{ all -> 0x0553 }
            r38 = r4
            X.7Sj r4 = r1.A0B     // Catch:{ all -> 0x0553 }
            r65 = r4
            boolean r4 = r1.A0S     // Catch:{ all -> 0x0553 }
            r68 = r4
            X.7Sc r4 = r1.A0L     // Catch:{ all -> 0x0553 }
            r42 = r4
            r4 = r65
            X.7Sc r4 = r4.A09     // Catch:{ all -> 0x0553 }
            r43 = r4
            X.4DU r4 = r1.A0M     // Catch:{ all -> 0x0553 }
            r74 = r4
            X.7TO r4 = r1.A0D     // Catch:{ all -> 0x0553 }
            r23 = r4
            X.7UL r4 = r1.A0A     // Catch:{ all -> 0x0553 }
            r73 = r4
            X.7US r4 = r1.A05     // Catch:{ all -> 0x0553 }
            r64 = r4
            X.7YU r4 = r1.A0C     // Catch:{ all -> 0x0553 }
            r72 = r4
            X.9HO r4 = r1.A0F     // Catch:{ all -> 0x0553 }
            r36 = r4
            r5 = 9
            r4 = r42
            X.0qQ.A0B(r4, r5)     // Catch:{ all -> 0x0553 }
            r20 = 12
            r5 = r23
            r4 = r20
            X.0qQ.A0B(r5, r4)     // Catch:{ all -> 0x0553 }
            X.3t1 r6 = X.AnonymousClass6W3.A02(r25)     // Catch:{ all -> 0x0553 }
            X.9HR r4 = X.AnonymousClass6W3.A04(r25)     // Catch:{ all -> 0x0553 }
            if (r4 == 0) goto L_0x01bf
            if (r6 == 0) goto L_0x01bf
            X.7Yw r25 = new X.7Yw     // Catch:{ all -> 0x0553 }
            r5 = r25
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0553 }
        L_0x01bf:
            r24 = 0
            if (r4 == 0) goto L_0x0324
            boolean r5 = r4 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId     // Catch:{ all -> 0x0553 }
            if (r5 == 0) goto L_0x01f3
            r7 = r4
            com.instagram.model.direct.threadkey.impl.MsysThreadId r7 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r7     // Catch:{ all -> 0x0553 }
        L_0x01ca:
            X.4DH r5 = r1.A01     // Catch:{ all -> 0x0553 }
            r62 = r5
            android.content.Context r28 = r62.requireContext()     // Catch:{ all -> 0x0553 }
            X.7Wl r15 = r1.A0G     // Catch:{ all -> 0x0553 }
            X.Aho r19 = new X.Aho     // Catch:{ all -> 0x0553 }
            r5 = r19
            r5.<init>(r1)     // Catch:{ all -> 0x0553 }
            X.7YX r13 = r1.A06     // Catch:{ all -> 0x0553 }
            X.1a8 r8 = r1.A03     // Catch:{ all -> 0x0553 }
            X.9HS r5 = r1.A0J     // Catch:{ all -> 0x0553 }
            X.AdA r11 = new X.AdA     // Catch:{ all -> 0x0553 }
            r11.<init>(r5)     // Catch:{ all -> 0x0553 }
            X.0qQ.A0B(r15, r14)     // Catch:{ all -> 0x0553 }
            r5 = 7
            X.0qQ.A0B(r13, r5)     // Catch:{ all -> 0x0553 }
            r5 = 8
            X.0qQ.A0B(r8, r5)     // Catch:{ all -> 0x0553 }
            goto L_0x01f5
        L_0x01f3:
            r7 = 0
            goto L_0x01ca
        L_0x01f5:
            if (r21 != 0) goto L_0x01f9
            r5 = 0
            goto L_0x0200
        L_0x01f9:
            X.3t0 r5 = new X.3t0     // Catch:{ all -> 0x0553 }
            r9 = r21
            r5.<init>(r9)     // Catch:{ all -> 0x0553 }
        L_0x0200:
            X.7Rg r53 = new X.7Rg     // Catch:{ all -> 0x0553 }
            r54 = r0
            r55 = r22
            r56 = r5
            r57 = r4
            r58 = r49
            r53.<init>(r54, r55, r56, r57, r58)     // Catch:{ all -> 0x0553 }
            r4 = r64
            X.7UC r4 = r4.A03     // Catch:{ all -> 0x0553 }
            X.PAS r18 = new X.PAS     // Catch:{ all -> 0x0553 }
            r29 = r18
            r30 = r0
            r31 = r64
            r32 = r64
            r33 = r64
            r34 = r4
            r35 = r73
            r29.<init>(r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0553 }
            X.9HD r5 = X.AnonymousClass9HC.A1b     // Catch:{ all -> 0x0553 }
            com.instagram.direct.capabilities.Capabilities r4 = X.C395029z5.A00(r0)     // Catch:{ all -> 0x0553 }
            X.9HC r39 = r5.A00(r0, r4)     // Catch:{ all -> 0x0553 }
            X.P28 r5 = new X.P28     // Catch:{ all -> 0x0553 }
            r10 = r36
            r9 = r38
            r4 = r66
            r5.<init>(r0, r10, r9, r4)     // Catch:{ all -> 0x0553 }
            X.7Me r34 = new X.7Me     // Catch:{ all -> 0x0553 }
            r54 = r34
            r55 = r0
            r56 = r5
            r57 = r5
            r58 = r3
            r59 = r43
            r54.<init>(r55, r56, r57, r58, r59)     // Catch:{ all -> 0x0553 }
            r4 = r65
            r4.A00 = r5     // Catch:{ all -> 0x0553 }
            r4 = 43
            X.Pm0 r10 = new X.Pm0     // Catch:{ all -> 0x0553 }
            r10.<init>(r0, r4)     // Catch:{ all -> 0x0553 }
            r4 = 44
            X.Pm0 r9 = new X.Pm0     // Catch:{ all -> 0x0553 }
            r9.<init>(r0, r4)     // Catch:{ all -> 0x0553 }
            X.Ixk r48 = new X.Ixk     // Catch:{ all -> 0x0553 }
            r54 = r48
            r55 = r20
            r56 = r28
            r57 = r0
            r58 = r38
            r59 = r73
            r60 = r34
            r61 = r65
            r54.<init>(r55, r56, r57, r58, r59, r60, r61)     // Catch:{ all -> 0x0553 }
            X.PCQ r14 = new X.PCQ     // Catch:{ all -> 0x0553 }
            r27 = r14
            r29 = r0
            r30 = r22
            r31 = r75
            r32 = r13
            r33 = r65
            r35 = r23
            r37 = r15
            r40 = r18
            r41 = r5
            r44 = r11
            r46 = r10
            r47 = r9
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ all -> 0x0553 }
            X.0Tu r9 = X.0Tu.A05     // Catch:{ all -> 0x0553 }
            r4 = 2342156064350996112(0x20810288002b0690, double:4.059697225785784E-152)
            boolean r4 = X.182.A06(r9, r0, r4)     // Catch:{ all -> 0x0553 }
            if (r4 == 0) goto L_0x030a
            X.2Dm r11 = X.1bJ.A00(r0)     // Catch:{ all -> 0x0553 }
            X.7Z9 r10 = new X.7Z9     // Catch:{ all -> 0x0553 }
            r10.<init>(r0, r3, r11)     // Catch:{ all -> 0x0553 }
            X.PCP r4 = new X.PCP     // Catch:{ all -> 0x0553 }
            r4.<init>(r0)     // Catch:{ all -> 0x0553 }
            X.PCO r5 = new X.PCO     // Catch:{ all -> 0x0553 }
            r5.<init>(r0, r10, r4, r11)     // Catch:{ all -> 0x0553 }
        L_0x02b2:
            X.7ZA r5 = (X.AnonymousClass7ZA) r5     // Catch:{ all -> 0x0553 }
            java.lang.Class<X.PEM> r11 = X.PEM.class
            r10 = 33
            X.Plo r4 = new X.Plo     // Catch:{ all -> 0x0553 }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x0553 }
            java.lang.Object r4 = r0.A01(r11, r4)     // Catch:{ all -> 0x0553 }
            X.PEM r4 = (X.PEM) r4     // Catch:{ all -> 0x0553 }
            r10 = 36317994346944222(0x810706000116de, double:3.0309840936081003E-306)
            boolean r9 = X.182.A06(r9, r0, r10)     // Catch:{ all -> 0x0553 }
            if (r9 != 0) goto L_0x02dc
            X.1aU r10 = r53.BJJ()     // Catch:{ all -> 0x0553 }
            r9 = r19
            r8.A02(r10, r9)     // Catch:{ all -> 0x0553 }
            r9 = r18
            r9.A02(r8, r14)     // Catch:{ all -> 0x0553 }
        L_0x02dc:
            X.Acv r52 = new X.Acv     // Catch:{ all -> 0x0553 }
            r52.<init>()     // Catch:{ all -> 0x0553 }
            com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession r10 = X.1y0.A00(r0)     // Catch:{ all -> 0x0553 }
            r8 = 42
            X.Plo r9 = new X.Plo     // Catch:{ all -> 0x0553 }
            r9.<init>(r0, r8)     // Catch:{ all -> 0x0553 }
            java.lang.Class<X.PEN> r8 = X.PEN.class
            java.lang.Object r9 = r10.A01(r8, r9)     // Catch:{ all -> 0x0553 }
            X.PEN r9 = (X.PEN) r9     // Catch:{ all -> 0x0553 }
            X.P27 r8 = new X.P27     // Catch:{ all -> 0x0553 }
            r50 = r8
            r51 = r0
            r54 = r18
            r55 = r14
            r56 = r5
            r57 = r4
            r58 = r9
            r59 = r19
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59)     // Catch:{ all -> 0x0553 }
            goto L_0x0310
        L_0x030a:
            X.PCP r5 = new X.PCP     // Catch:{ all -> 0x0553 }
            r5.<init>(r0)     // Catch:{ all -> 0x0553 }
            goto L_0x02b2
        L_0x0310:
            if (r7 == 0) goto L_0x0321
            long r4 = r7.A00     // Catch:{ all -> 0x0553 }
            X.OtJ r23 = new X.OtJ     // Catch:{ all -> 0x0553 }
            r7 = r23
            r7.<init>(r0, r4)     // Catch:{ all -> 0x0553 }
            r5 = r62
            r5.registerLifecycleListener(r7)     // Catch:{ all -> 0x0553 }
            goto L_0x0328
        L_0x0321:
            r23 = r24
            goto L_0x0328
        L_0x0324:
            r8 = r24
            r23 = r8
        L_0x0328:
            if (r6 == 0) goto L_0x032b
            goto L_0x0338
        L_0x032b:
            r24 = r21
            if (r8 != 0) goto L_0x04be
            java.lang.String r0 = "No ClientInfra available."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0553 }
            r1.<init>(r0)     // Catch:{ all -> 0x0553 }
            goto L_0x0552
        L_0x0338:
            X.7SG r6 = r1.A0E     // Catch:{ all -> 0x0553 }
            if (r6 == 0) goto L_0x0547
            X.7Sg r4 = r1.A09     // Catch:{ all -> 0x0553 }
            r32 = r4
            android.os.Handler r9 = r1.A00     // Catch:{ all -> 0x0553 }
            X.4DH r5 = r1.A01     // Catch:{ all -> 0x0553 }
            X.7TS r8 = r1.A07     // Catch:{ all -> 0x0553 }
            X.7TR r7 = r1.A08     // Catch:{ all -> 0x0553 }
            r4 = 5
            X.0qQ.A0B(r9, r4)     // Catch:{ all -> 0x0553 }
            r4 = 6
            X.0qQ.A0B(r5, r4)     // Catch:{ all -> 0x0553 }
            r4 = 7
            X.0qQ.A0B(r8, r4)     // Catch:{ all -> 0x0553 }
            r4 = 8
            X.0qQ.A0B(r7, r4)     // Catch:{ all -> 0x0553 }
            X.2Dm r5 = X.1bJ.A00(r0)     // Catch:{ all -> 0x0553 }
            X.7Yx r58 = new X.7Yx     // Catch:{ all -> 0x0553 }
            r59 = r0
            r60 = r22
            r61 = r67
            r62 = r70
            r63 = r71
            r58.<init>(r59, r60, r61, r62, r63)     // Catch:{ all -> 0x0553 }
            X.7S6 r15 = new X.7S6     // Catch:{ all -> 0x0553 }
            r50 = r15
            r51 = r0
            r52 = r22
            r53 = r75
            r54 = r64
            r55 = r8
            r56 = r7
            r57 = r65
            r59 = r36
            r60 = r38
            r61 = r6
            r62 = r66
            r63 = r42
            r64 = r43
            r65 = r5
            r66 = r67
            r67 = r45
            r69 = r49
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)     // Catch:{ all -> 0x0553 }
            X.7Zi r62 = X.C333527Zh.A00(r0)     // Catch:{ all -> 0x0553 }
            X.7Z6 r63 = X.AnonymousClass7Z6.A00(r0)     // Catch:{ all -> 0x0553 }
            X.0qQ.A07(r63)     // Catch:{ all -> 0x0553 }
            X.7Z9 r22 = new X.7Z9     // Catch:{ all -> 0x0553 }
            r4 = r22
            r4.<init>(r0, r15, r5)     // Catch:{ all -> 0x0553 }
            X.7SD r21 = r15.C6Q()     // Catch:{ all -> 0x0553 }
            X.0qQ.A07(r21)     // Catch:{ all -> 0x0553 }
            r4 = r21
            boolean r4 = r4.A0r     // Catch:{ all -> 0x0553 }
            r55 = r4
            X.7Z5 r4 = r15.A06     // Catch:{ all -> 0x0553 }
            r40 = r4
            X.0qQ.A07(r40)     // Catch:{ all -> 0x0553 }
            X.0eE r4 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x0553 }
            com.instagram.user.model.User r51 = r4.A01(r0)     // Catch:{ all -> 0x0553 }
            X.7ZB r5 = X.AnonymousClass7ZB.A00     // Catch:{ all -> 0x0553 }
            java.lang.Class<X.7ZC> r4 = X.AnonymousClass7ZC.class
            java.lang.Object r14 = r0.A01(r4, r5)     // Catch:{ all -> 0x0553 }
            X.7ZC r14 = (X.AnonymousClass7ZC) r14     // Catch:{ all -> 0x0553 }
            java.util.Map r4 = r14.A01     // Catch:{ all -> 0x0553 }
            r4.clear()     // Catch:{ all -> 0x0553 }
            X.7ZE r5 = X.AnonymousClass7ZE.A00     // Catch:{ all -> 0x0553 }
            java.lang.Class<X.7ZF> r4 = X.AnonymousClass7ZF.class
            java.lang.Object r13 = r0.A01(r4, r5)     // Catch:{ all -> 0x0553 }
            X.7ZF r13 = (X.AnonymousClass7ZF) r13     // Catch:{ all -> 0x0553 }
            java.util.Map r4 = r13.A01     // Catch:{ all -> 0x0553 }
            r4.clear()     // Catch:{ all -> 0x0553 }
            X.7ZG r5 = X.AnonymousClass7ZG.A00     // Catch:{ all -> 0x0553 }
            java.lang.Class<X.7ZH> r4 = X.AnonymousClass7ZH.class
            java.lang.Object r12 = r0.A01(r4, r5)     // Catch:{ all -> 0x0553 }
            X.7ZH r12 = (X.AnonymousClass7ZH) r12     // Catch:{ all -> 0x0553 }
            java.util.Map r4 = r12.A01     // Catch:{ all -> 0x0553 }
            r4.clear()     // Catch:{ all -> 0x0553 }
            X.7ZI r5 = X.AnonymousClass7ZI.A00     // Catch:{ all -> 0x0553 }
            java.lang.Class<X.7ZJ> r4 = X.AnonymousClass7ZJ.class
            java.lang.Object r11 = r0.A01(r4, r5)     // Catch:{ all -> 0x0553 }
            X.7ZJ r11 = (X.AnonymousClass7ZJ) r11     // Catch:{ all -> 0x0553 }
            java.util.Map r4 = r11.A01     // Catch:{ all -> 0x0553 }
            r4.clear()     // Catch:{ all -> 0x0553 }
            X.7ZK r5 = X.AnonymousClass7ZK.A00     // Catch:{ all -> 0x0553 }
            java.lang.Class<X.7ZL> r4 = X.AnonymousClass7ZL.class
            java.lang.Object r9 = r0.A01(r4, r5)     // Catch:{ all -> 0x0553 }
            X.7ZL r9 = (X.AnonymousClass7ZL) r9     // Catch:{ all -> 0x0553 }
            java.util.Map r4 = r9.A01     // Catch:{ all -> 0x0553 }
            r4.clear()     // Catch:{ all -> 0x0553 }
            X.7ZM r5 = X.AnonymousClass7ZM.A00     // Catch:{ all -> 0x0553 }
            java.lang.Class<X.7ZN> r4 = X.AnonymousClass7ZN.class
            java.lang.Object r8 = r0.A01(r4, r5)     // Catch:{ all -> 0x0553 }
            X.7ZN r8 = (X.AnonymousClass7ZN) r8     // Catch:{ all -> 0x0553 }
            java.util.Map r4 = r8.A01     // Catch:{ all -> 0x0553 }
            r4.clear()     // Catch:{ all -> 0x0553 }
            X.7ZO r5 = X.AnonymousClass7ZO.A00     // Catch:{ all -> 0x0553 }
            java.lang.Class<X.7ZP> r4 = X.AnonymousClass7ZP.class
            java.lang.Object r7 = r0.A01(r4, r5)     // Catch:{ all -> 0x0553 }
            X.7ZP r7 = (X.AnonymousClass7ZP) r7     // Catch:{ all -> 0x0553 }
            java.util.Set r4 = r7.A01     // Catch:{ all -> 0x0553 }
            r4.clear()     // Catch:{ all -> 0x0553 }
            java.util.Map r4 = r7.A00     // Catch:{ all -> 0x0553 }
            r4.clear()     // Catch:{ all -> 0x0553 }
            X.7ZQ r5 = X.AnonymousClass7ZQ.A00     // Catch:{ all -> 0x0553 }
            java.lang.Class<X.7ZR> r4 = X.AnonymousClass7ZR.class
            java.lang.Object r6 = r0.A01(r4, r5)     // Catch:{ all -> 0x0553 }
            X.7ZR r6 = (X.AnonymousClass7ZR) r6     // Catch:{ all -> 0x0553 }
            java.util.HashMap r4 = r6.A00     // Catch:{ all -> 0x0553 }
            r4.clear()     // Catch:{ all -> 0x0553 }
            java.util.Set r4 = r6.A01     // Catch:{ all -> 0x0553 }
            r4.clear()     // Catch:{ all -> 0x0553 }
            X.7ZS r5 = X.AnonymousClass7ZS.A00     // Catch:{ all -> 0x0553 }
            java.lang.Class<X.7ZT> r4 = X.AnonymousClass7ZT.class
            java.lang.Object r5 = r0.A01(r4, r5)     // Catch:{ all -> 0x0553 }
            X.7ZT r5 = (X.AnonymousClass7ZT) r5     // Catch:{ all -> 0x0553 }
            java.util.Map r4 = r5.A00     // Catch:{ all -> 0x0553 }
            r4.clear()     // Catch:{ all -> 0x0553 }
            java.util.Set r4 = r5.A01     // Catch:{ all -> 0x0553 }
            r4.clear()     // Catch:{ all -> 0x0553 }
            java.util.HashMap r53 = new java.util.HashMap     // Catch:{ all -> 0x0553 }
            r53.<init>()     // Catch:{ all -> 0x0553 }
            X.7ZU r20 = new X.7ZU     // Catch:{ all -> 0x0553 }
            r10 = r20
            r4 = r26
            r10.<init>(r3, r3, r3, r4)     // Catch:{ all -> 0x0553 }
            com.instagram.direct.model.messaginguser.MessagingUser r49 = com.instagram.direct.model.messaginguser.MessagingUser.A00(r51)     // Catch:{ all -> 0x0553 }
            X.7ZV r19 = new X.7ZV     // Catch:{ all -> 0x0553 }
            r4 = r19
            r4.<init>(r0)     // Catch:{ all -> 0x0553 }
            X.7ZW r18 = new X.7ZW     // Catch:{ all -> 0x0553 }
            r4 = r18
            r4.<init>(r0)     // Catch:{ all -> 0x0553 }
            X.7Sp r4 = new X.7Sp     // Catch:{ all -> 0x0553 }
            r4.<init>(r0)     // Catch:{ all -> 0x0553 }
            X.7ZX r10 = new X.7ZX     // Catch:{ all -> 0x0553 }
            r26 = r10
            r27 = r74
            r28 = r0
            r29 = r18
            r30 = r4
            r31 = r75
            r33 = r73
            r34 = r14
            r35 = r72
            r37 = r38
            r38 = r9
            r39 = r11
            r41 = r7
            r42 = r13
            r43 = r6
            r44 = r5
            r45 = r12
            r46 = r20
            r47 = r21
            r48 = r8
            r52 = r2
            r54 = r19
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)     // Catch:{ all -> 0x0553 }
            X.7Zf r8 = new X.7Zf     // Catch:{ all -> 0x0553 }
            r57 = r8
            r59 = r15
            r60 = r15
            r61 = r10
            r64 = r22
            r57.<init>(r58, r59, r60, r61, r62, r63, r64)     // Catch:{ all -> 0x0553 }
            r15.A04 = r10     // Catch:{ all -> 0x0553 }
        L_0x04be:
            X.7Zg r8 = (X.C333517Zg) r8     // Catch:{ all -> 0x0553 }
            X.3tH r0 = r1.A0I     // Catch:{ all -> 0x0553 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x0553 }
            if (r0 == 0) goto L_0x0529
            if (r24 == 0) goto L_0x0529
            X.7S9 r2 = r8.AvL()     // Catch:{ all -> 0x0553 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.msys.impl.thread.loader.MsysThreadViewDataLoaderIntf"
            X.0qQ.A0C(r2, r0)     // Catch:{ all -> 0x0553 }
            X.PCQ r2 = (X.PCQ) r2     // Catch:{ all -> 0x0553 }
            X.1aU r4 = r2.A03()     // Catch:{ all -> 0x0553 }
            X.AzK r2 = X.C41729AzK.A00     // Catch:{ all -> 0x0553 }
            X.AYd r0 = new X.AYd     // Catch:{ all -> 0x0553 }
            r0.<init>(r2)     // Catch:{ all -> 0x0553 }
            X.1aU r2 = r4.A0N(r0)     // Catch:{ all -> 0x0553 }
            X.Ovs r0 = X.C72079Ovs.A00     // Catch:{ all -> 0x0553 }
            X.1aU r0 = r2.A0L(r0)     // Catch:{ all -> 0x0553 }
            X.1aU r7 = r0.A0H()     // Catch:{ all -> 0x0553 }
            X.1a8 r6 = r1.A02     // Catch:{ all -> 0x0553 }
            r0 = 7
            X.PmE r2 = new X.PmE     // Catch:{ all -> 0x0553 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0553 }
            X.AYd r0 = new X.AYd     // Catch:{ all -> 0x0553 }
            r0.<init>(r2)     // Catch:{ all -> 0x0553 }
            X.1aU r2 = r7.A0N(r0)     // Catch:{ all -> 0x0553 }
            X.1aV r0 = r1.A0N     // Catch:{ all -> 0x0553 }
            r6.A02(r2, r0)     // Catch:{ all -> 0x0553 }
            java.lang.String r2 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_RELAUNCH_SHH_MODE_ENTRY_POINT_REFERENCE"
            r0 = r76
            java.lang.String r9 = r0.getString(r2, r3)     // Catch:{ all -> 0x0553 }
            X.7Vi[] r5 = X.C332517Vi.values()     // Catch:{ all -> 0x0553 }
            int r4 = r5.length     // Catch:{ all -> 0x0553 }
            r2 = 0
            goto L_0x0537
        L_0x0513:
            r3 = r5[r2]     // Catch:{ all -> 0x0553 }
            java.lang.String r0 = r3.name()     // Catch:{ all -> 0x0553 }
            boolean r0 = X.0qQ.A0K(r0, r9)     // Catch:{ all -> 0x0553 }
            if (r0 == 0) goto L_0x0535
            X.Ahs r2 = new X.Ahs     // Catch:{ all -> 0x0553 }
            r0 = r24
            r2.<init>(r1, r3, r0)     // Catch:{ all -> 0x0553 }
            r6.A02(r7, r2)     // Catch:{ all -> 0x0553 }
        L_0x0529:
            X.7Ya r3 = new X.7Ya     // Catch:{ all -> 0x0553 }
            r2 = r25
            r1 = r24
            r0 = r23
            r3.<init>(r8, r0, r2, r1)     // Catch:{ all -> 0x0553 }
            goto L_0x053a
        L_0x0535:
            int r2 = r2 + 1
        L_0x0537:
            if (r2 >= r4) goto L_0x0529
            goto L_0x0513
        L_0x053a:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0546
            r0 = -311973806(0xffffffffed67a852, float:-4.4809078E27)
            X.0fS.A00(r0)
        L_0x0546:
            return r3
        L_0x0547:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0553 }
            r1.<init>(r12)     // Catch:{ all -> 0x0553 }
            goto L_0x0552
        L_0x054d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0553 }
            r1.<init>(r12)     // Catch:{ all -> 0x0553 }
        L_0x0552:
            throw r1     // Catch:{ all -> 0x0553 }
        L_0x0553:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0560
            r0 = -628817295(0xffffffffda850271, float:-1.87194281E16)
            X.0fS.A00(r0)
        L_0x0560:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7TI.A00(android.os.Bundle, android.os.Bundle, X.7TI):X.7Ya");
    }

    public static final AnonymousClass2Ep A01(AnonymousClass7TI r4) {
        if (r4.A0F != null) {
            2Dr A002 = 2L2.A00(r4.A0d);
            String str = r4.A0F;
            if (str != null) {
                return A002.A0N(str);
            }
            throw new IllegalStateException("Required value was null.");
        }
        C333517Zg r0 = r4.A08;
        if (r0 != null) {
            C376179Gx r1 = C376179Gx.PSEUDO_GET_EXTENDED_DIRECT_THREAD_FROM_DATASOURCE;
            if (!r0.AH1(r1)) {
                C69865NtT.A00(r1);
                return null;
            }
            C333517Zg r02 = r4.A08;
            if (r02 != null) {
                if (!r02.C6l().CdE()) {
                    return null;
                }
                C333517Zg r03 = r4.A08;
                if (r03 != null) {
                    AnonymousClass2Ep Cms = r03.C6l().Cms();
                    if (Cms != null) {
                        return Cms;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        0qQ.A0F("clientInfra");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C254783t2 A02(AnonymousClass7TI r0) {
        C333517Zg r02 = r0.A08;
        if (r02 == null) {
            0qQ.A0F("clientInfra");
            throw AnonymousClass00P.createAndThrow();
        }
        C254783t2 C6c = r02.C6l().C6c();
        0qQ.A07(C6c);
        return C6c;
    }

    public static final C254743sy A03(AnonymousClass7TI r0) {
        C333517Zg r02 = r0.A08;
        if (r02 != null) {
            return r02.C6l().AfV();
        }
        0qQ.A0F("clientInfra");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final List A04(AnonymousClass7TI r3) {
        C333517Zg r0 = r3.A08;
        if (r0 != null) {
            if (!r0.C6l().CdE()) {
                return null;
            }
            C333517Zg r02 = r3.A08;
            if (r02 != null) {
                return r02.C6l().BRZ();
            }
        }
        0qQ.A0F("clientInfra");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A05(AnonymousClass7TI r3) {
        C333517Zg r0 = r3.A08;
        if (r0 == null) {
            0qQ.A0F("clientInfra");
            throw AnonymousClass00P.createAndThrow();
        }
        boolean CUO = r0.C6l().CUO();
        r3.A0w.A00 = Boolean.valueOf(CUO);
        r3.A0x.A02("is_group", CUO);
        0fh.A01("DirectThreadController.onNavigationTrackerReportModuleResumed", 1188236140);
        try {
            C71342cb.A00(r3.A0d).A0E("deferred_logging", r3.A0V);
        } finally {
            0fh.A00(-866573971);
        }
    }

    public static final void A06(AnonymousClass7TI r5) {
        C333517Zg r0 = r5.A08;
        if (r0 != null) {
            int i = r0.C6l().C6Q().A08;
            String A002 = AnonymousClass48O.A00(i);
            C333517Zg r02 = r5.A08;
            if (r02 != null) {
                String C6C = r02.C6l().C6C();
                C229402nK r1 = r5.A0C;
                if (r1 != null) {
                    r1.A04 = Integer.valueOf(i);
                    r1.A06 = A002;
                    r1.A05 = C6C;
                    return;
                }
                return;
            }
        }
        0qQ.A0F("clientInfra");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A07(AnonymousClass7TI r9) {
        Context context = r9.A0U.getContext();
        if (context != null) {
            C333517Zg r0 = r9.A08;
            if (r0 != null) {
                DirectThreadThemeInfo C6d = r0.C6l().C6d();
                AnonymousClass7U1 r1 = r9.A0j.A0M;
                AnonymousClass9HC r6 = r9.A0u;
                C333517Zg r02 = r9.A08;
                if (r02 != null) {
                    Integer A032 = r1.A03(r02.C6l());
                    r1.A05(C329927Kt.A00.A00(context, r1.A02(C6d), r1.A01(C6d), r6, C6d, A032));
                    A0D(r9, false);
                    return;
                }
            }
            0qQ.A0F("clientInfra");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A08(AnonymousClass7TI r12, AnonymousClass7L2 r13) {
        RecyclerView recyclerView = r12.A04;
        String str = "messageRecyclerView";
        Parcelable parcelable = null;
        if (recyclerView != null) {
            AnonymousClass7N2 r0 = r12.A09;
            if (r0 == null) {
                str = "messageItemDecorator";
            } else {
                recyclerView.A12(r0);
                RecyclerView recyclerView2 = r12.A04;
                if (recyclerView2 != null) {
                    Context context = recyclerView2.getContext();
                    0qQ.A07(context);
                    C333517Zg r02 = r12.A08;
                    if (r02 != null) {
                        AnonymousClass7ZY BSN = r02.BSN();
                        UserSession userSession = r12.A0d;
                        C254783t2 C6c = r02.C6l().C6c();
                        0qQ.A07(C6c);
                        boolean z = C6c instanceof C254773t1;
                        C333517Zg r03 = r12.A08;
                        if (r03 != null) {
                            AnonymousClass7SD C6Q = r03.C6l().C6Q();
                            0qQ.A07(C6Q);
                            AnonymousClass7ZY r9 = BSN;
                            AnonymousClass7N2 r6 = new AnonymousClass7N2(context, BSN, r9, r13.A04, C66642MaB.A01(userSession, C6Q, z));
                            r12.A09 = r6;
                            RecyclerView recyclerView3 = r12.A04;
                            if (recyclerView3 != null) {
                                recyclerView3.A11(r6);
                                RecyclerView recyclerView4 = r12.A04;
                                if (recyclerView4 != null) {
                                    C252553pI r04 = recyclerView4.A0D;
                                    if (r04 != null) {
                                        parcelable = r04.A1M();
                                    }
                                    RecyclerView recyclerView5 = r12.A04;
                                    if (recyclerView5 != null) {
                                        C274644oo r05 = r12.A0A;
                                        if (r05 == null) {
                                            str = "messageListAdapterHolder";
                                        } else {
                                            recyclerView5.setAdapter(r05.AZJ());
                                            RecyclerView recyclerView6 = r12.A04;
                                            if (recyclerView6 != null) {
                                                C252553pI r06 = recyclerView6.A0D;
                                                if (r06 == null) {
                                                    return;
                                                }
                                                if (parcelable != null) {
                                                    r06.A1P(parcelable);
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    0qQ.A0F("clientInfra");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.3t0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r25v5, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0300, code lost:
        if (r4 != null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (X.AnonymousClass6W3.A07(r0) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
        if (r1 == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0118, code lost:
        if (X.2El.A0C(r5) == false) goto L_0x011a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0A(X.AnonymousClass7TI r31, X.C254793t3 r32) {
        /*
            r3 = r31
            r9 = r32
            X.7Ue r0 = r3.A0i
            X.0eM r0 = r0.A0m
            java.lang.Object r7 = r0.getValue()
            X.7Vm r7 = (X.C332557Vm) r7
            java.lang.String r4 = r3.A0F
            X.7Tw r0 = r3.A0j
            X.7Ty r0 = r0.A0O
            boolean r30 = r0.CXh()
            java.lang.String r2 = r3.A0F
            X.7Nx r1 = new X.7Nx
            r1.<init>(r3)
            X.7Zg r0 = r3.A08
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "clientInfra"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x002d:
            java.lang.String r28 = X.C330727Ny.A00(r0, r2, r1)
            X.0sa r1 = r7.A0C
            java.lang.Object r2 = r1.invoke()
            if (r2 == 0) goto L_0x030a
            X.7Zg r2 = (X.C333517Zg) r2
            X.7S7 r12 = r2.C6l()
            X.3t3 r0 = r12.CBU()
            r10 = 0
            if (r4 == 0) goto L_0x0307
            X.3t0 r3 = new X.3t0
            r3.<init>(r4)
        L_0x004b:
            if (r0 != 0) goto L_0x0304
            if (r3 == 0) goto L_0x0050
            r9 = r3
        L_0x0050:
            java.lang.Object r0 = r1.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            if (r0 == 0) goto L_0x006b
            X.7S7 r0 = r0.C6l()
            X.3t2 r0 = r0.C6c()
            X.0qQ.A07(r0)
            boolean r0 = X.AnonymousClass6W3.A07(r0)
            r29 = 1
            if (r0 != 0) goto L_0x006d
        L_0x006b:
            r29 = 0
        L_0x006d:
            X.7SD r6 = r12.C6Q()
            com.instagram.common.session.UserSession r5 = r7.A04
            r11 = 1
            r8 = 2
            X.7Kc r0 = X.C329737Ka.A00(r5, r6, r11)
            X.3tH r27 = r0.Axi()
            X.0qQ.A0A(r6)
            java.lang.Long r26 = X.C330007Lb.A00(r6)
            X.7Lc r0 = X.C330017Lc.A00
            java.lang.Long r25 = r0.A00(r5, r6)
            java.lang.Object r0 = r1.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            if (r0 == 0) goto L_0x00a2
            X.7S7 r0 = r0.C6l()
            X.3t2 r0 = r0.C6c()
            X.0qQ.A07(r0)
            boolean r1 = r0 instanceof X.C254773t1
            r0 = 1
            if (r1 != 0) goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            boolean r31 = X.C308556Us.A0B(r5, r6, r0)
            boolean r32 = X.C308556Us.A09(r5, r6)
            java.util.List r0 = r6.A0b
            java.lang.Object r4 = X.00k.A0J(r0)
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            if (r4 == 0) goto L_0x02fe
            X.4Cl r0 = r4.A03
            java.lang.String r1 = r0.AaU()
            if (r1 == 0) goto L_0x02fe
            r0 = 10
            java.lang.Long r24 = X.00y.A0n(r0, r1)
        L_0x00c3:
            X.4Cl r0 = r4.A03
            com.instagram.api.schemas.IGAIAgentType r0 = r0.AaX()
            if (r0 == 0) goto L_0x00db
            int r1 = r0.ordinal()
            if (r1 == r8) goto L_0x02fa
            r0 = 4
            if (r1 == r0) goto L_0x02f6
            if (r1 == r11) goto L_0x02f2
            r0 = 3
            if (r1 != r0) goto L_0x00db
            X.6r9 r10 = X.C319746r9.official_meta_assistant
        L_0x00db:
            java.lang.String r8 = r7.A08
            java.lang.String r0 = "inbox_new_message"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x02b4
            r0 = 260(0x104, float:3.64E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x02b4
            r0 = 670(0x29e, float:9.39E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x02b4
            r14 = 1
            r13 = 0
            X.0iw r11 = r7.A02
            java.lang.String r4 = r7.A09
            java.lang.String r3 = r12.C6G()
            X.4DH r0 = r7.A01
            android.content.Context r0 = r0.requireContext()
            boolean r0 = X.0oI.A0C(r0)
            if (r0 == 0) goto L_0x011a
            boolean r1 = X.2El.A0C(r5)
            r0 = 1
            if (r1 != 0) goto L_0x011b
        L_0x011a:
            r0 = 0
        L_0x011b:
            int r23 = r12.C68(r0)
            java.lang.String r2 = r7.A0A
            boolean r22 = r12.CZ0()
            boolean r21 = r12.EtG()
            boolean r20 = r12.Cdt()
            int r0 = r7.A00
            long r0 = (long) r0
            r18 = r0
            java.util.List r17 = r12.AxI()
            java.lang.String r1 = r7.A0B
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r31)
            boolean r0 = r6.A0q
            r31 = r0
            java.util.Map r0 = r6.A0g
            if (r0 == 0) goto L_0x014a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x014b
        L_0x014a:
            r13 = 1
        L_0x014b:
            r16 = r13 ^ 1
            java.lang.String r12 = r7.A06
            r13 = 0
            X.0qQ.A0B(r11, r14)
            X.0wc r11 = X.AnonymousClass0kN.A01(r11, r5)
            r0 = 776(0x308, float:1.087E-42)
            java.lang.String r7 = X.C66579MXk.A00(r0)
            X.0kJ r0 = r11.A00
            X.0Aj r7 = r11.A00(r0, r7)
            java.lang.String r0 = "entry_point"
            r7.AAJ(r0, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r22)
            java.lang.String r0 = "is_request_pending"
            r7.A7p(r0, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r21)
            java.lang.String r0 = "should_show_permission"
            r7.A7p(r0, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r20)
            java.lang.String r0 = "is_unread"
            r7.A7p(r0, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r29)
            java.lang.String r0 = "is_e2ee"
            r7.A7p(r0, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r30)
            java.lang.String r0 = "is_shh_mode"
            r7.A7p(r0, r8)
            java.lang.String r8 = "ephemeral_lifetime_ms"
            r0 = r26
            r7.A9F(r8, r0)
            java.lang.String r8 = "after_view_lifetime_ms"
            r0 = r25
            r7.A9F(r8, r0)
            r0 = 926(0x39e, float:1.298E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r7.A7p(r0, r15)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r32)
            r0 = 925(0x39d, float:1.296E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r7.A7p(r0, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r31)
            java.lang.String r0 = "is_dm_missed_message_impression_shown"
            r7.A7p(r0, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r16)
            java.lang.String r0 = "is_user_nickname_added"
            r7.A7p(r0, r8)
            if (r3 == 0) goto L_0x01dc
            r0 = 10
            java.lang.Long r3 = X.00y.A0n(r0, r3)
            r0 = 666(0x29a, float:9.33E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A9F(r0, r3)
        L_0x01dc:
            if (r9 == 0) goto L_0x01f9
            java.lang.String r3 = X.C300965yF.A06(r9)
            java.lang.String r0 = "thread_id"
            r7.AAJ(r0, r3)
            java.lang.Long r3 = X.AnonymousClass4KK.A01(r9)
            java.lang.String r0 = "occamadillo_thread_id"
            r7.A9F(r0, r3)
            java.lang.String r3 = X.AnonymousClass4KK.A02(r9)
            java.lang.String r0 = "open_thread_id"
            r7.AAJ(r0, r3)
        L_0x01f9:
            if (r4 == 0) goto L_0x0200
            java.lang.String r0 = "message_id"
            r7.AAJ(r0, r4)
        L_0x0200:
            r3 = -1
            r0 = r23
            if (r0 == r3) goto L_0x020e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            java.lang.String r0 = "folder"
            r7.A9O(r0, r3)
        L_0x020e:
            if (r2 == 0) goto L_0x0219
            r0 = 1793(0x701, float:2.513E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.AAJ(r0, r2)
        L_0x0219:
            r2 = 0
            int r0 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0228
            java.lang.Long r2 = java.lang.Long.valueOf(r18)
            java.lang.String r0 = "position"
            r7.A9F(r0, r2)
        L_0x0228:
            if (r17 == 0) goto L_0x0239
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x0239
            java.lang.String r2 = r17.toString()
            java.lang.String r0 = "labels"
            r7.AAJ(r0, r2)
        L_0x0239:
            if (r1 == 0) goto L_0x0244
            r0 = 811(0x32b, float:1.136E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r7.AAJ(r0, r1)
        L_0x0244:
            if (r28 == 0) goto L_0x0257
            r1 = 10
            r0 = r28
            java.lang.Long r1 = X.00y.A0n(r1, r0)
            r0 = 361(0x169, float:5.06E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A9F(r0, r1)
        L_0x0257:
            if (r24 == 0) goto L_0x026a
            long r0 = r24.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 3735(0xe97, float:5.234E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A9F(r0, r1)
        L_0x026a:
            if (r10 == 0) goto L_0x0275
            r0 = 500(0x1f4, float:7.0E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A8M(r10, r0)
        L_0x0275:
            if (r27 == 0) goto L_0x0289
            X.Nt0 r0 = X.Nt0.$redex_init_class
            int r1 = r27.ordinal()
            if (r1 == r13) goto L_0x02b1
            r0 = 2
            if (r1 != r0) goto L_0x0289
            X.Nlw r1 = X.C69452Nlw.IG_ADVANCED_CRYPTO_TRANSPORT
        L_0x0284:
            java.lang.String r0 = "transport_type"
            r7.A8M(r1, r0)
        L_0x0289:
            if (r12 == 0) goto L_0x0296
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r12)
            java.lang.String r0 = "a_pk"
            r7.A9F(r0, r1)
        L_0x0296:
            r7.Cgf()
        L_0x0299:
            boolean r0 = r6.A0o
            if (r0 == 0) goto L_0x02b0
            boolean r0 = r6.A13
            if (r0 != 0) goto L_0x02b0
            X.7I6 r0 = X.AnonymousClass7I4.A00(r5)
            int r2 = X.AnonymousClass7I6.A00(r0)
            java.lang.String r1 = "navigation_to_thread_end"
            X.02m r0 = r0.A06
            r0.markerPoint(r2, r1)
        L_0x02b0:
            return
        L_0x02b1:
            X.Nlw r1 = X.C69452Nlw.IG_DJANGO
            goto L_0x0284
        L_0x02b4:
            r25 = 0
            if (r9 == 0) goto L_0x02ef
            boolean r0 = r9 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L_0x02ea
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = X.C300965yF.A04(r9)
            if (r0 == 0) goto L_0x02e7
            long r0 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x02c8:
            if (r3 == 0) goto L_0x02ce
            java.lang.String r25 = X.C300965yF.A07(r3)
        L_0x02ce:
            r27 = r25
            r25 = r0
        L_0x02d2:
            X.1a8 r3 = r7.A03
            X.1aU r1 = r12.BJJ()
            X.PSj r0 = new X.PSj
            r22 = r0
            r23 = r7
            r24 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r3.A02(r1, r0)
            goto L_0x0299
        L_0x02e7:
            r0 = r25
            goto L_0x02c8
        L_0x02ea:
            java.lang.String r27 = X.C300965yF.A07(r9)
            goto L_0x02d2
        L_0x02ef:
            r27 = r25
            goto L_0x02d2
        L_0x02f2:
            X.6r9 r10 = X.C319746r9.ig_creator
            goto L_0x00db
        L_0x02f6:
            X.6r9 r10 = X.C319746r9.user_generated_consumer_agent
            goto L_0x00db
        L_0x02fa:
            X.6r9 r10 = X.C319746r9.meta_generated_consumer_agent
            goto L_0x00db
        L_0x02fe:
            r24 = r10
            if (r4 == 0) goto L_0x00db
            goto L_0x00c3
        L_0x0304:
            r9 = r0
            goto L_0x0050
        L_0x0307:
            r3 = r10
            goto L_0x004b
        L_0x030a:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7TI.A0A(X.7TI, X.3t3):void");
    }

    public static final void A0B(AnonymousClass7TI r1, C254743sy r2) {
        if (r1.A0U.isResumed()) {
            r1.A1A.A0J(r2);
            A06(r1);
            A0E(r1, true);
        }
    }

    public static final void A0C(AnonymousClass7TI r3, boolean z) {
        Resources resources;
        int i;
        ViewGroup viewGroup = r3.A03;
        if (viewGroup != null && viewGroup.getContext() != null) {
            C333517Zg r0 = r3.A08;
            if (r0 == null) {
                0qQ.A0F("clientInfra");
                throw AnonymousClass00P.createAndThrow();
            } else if (!r0.C6l().EtG()) {
                if (z || !r3.A0V()) {
                    resources = viewGroup.getContext().getResources();
                    i = R.dimen.action_bar_item_spacing_left;
                } else {
                    resources = viewGroup.getContext().getResources();
                    i = R.dimen.direct_composer_redesign_background_height;
                }
                0nA.A0X(viewGroup, resources.getDimensionPixelOffset(i));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0267, code lost:
        if (r0.A0t == false) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0388, code lost:
        r4 = r5.A07.requireActivity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x038e, code lost:
        if (r3 == false) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0390, code lost:
        r3 = r2.A0i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0393, code lost:
        r3 = r2.A0l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0D(X.AnonymousClass7TI r14, boolean r15) {
        /*
            X.4DH r6 = r14.A0U
            android.view.View r0 = r6.mView
            if (r0 == 0) goto L_0x030a
            X.7Tw r4 = r14.A0j
            X.7U1 r5 = r4.A0M
            X.7L2 r3 = r5.A04
            X.0qQ.A07(r3)
            if (r15 != 0) goto L_0x0039
            androidx.recyclerview.widget.RecyclerView r0 = r14.A04
            java.lang.String r8 = "messageRecyclerView"
            if (r0 == 0) goto L_0x003f
            X.3BD r0 = r0.getRecycledViewPool()
            r0.A01()
            com.instagram.common.session.UserSession r7 = r14.A0d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329457614602373(0x81117300004085, double:3.038233510233989E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0251
            androidx.recyclerview.widget.RecyclerView r1 = r14.A04
            if (r1 == 0) goto L_0x003f
            X.Anu r0 = new X.Anu
            r0.<init>(r14, r3)
            r1.post(r0)
        L_0x0039:
            X.4oo r0 = r14.A0A
            if (r0 != 0) goto L_0x0047
            java.lang.String r8 = "messageListAdapterHolder"
        L_0x003f:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0047:
            r0.FLu(r3)
            X.7SM r0 = r14.A0n
            X.7Ty r9 = r4.A0O
            boolean r1 = r9.CXh()
            r11 = 0
            X.7L0 r8 = r3.A07
            X.7Kx r7 = r3.A04
            X.9H7 r12 = r0.A00
            X.7Hl r0 = X.AnonymousClass9H7.A06(r12)
            r0.A1M(r8, r1)
            X.7H1 r1 = r12.A0V
            if (r1 == 0) goto L_0x006a
            int r0 = r7.A04
            X.7H0 r1 = (X.AnonymousClass7H0) r1
            r1.A00 = r0
        L_0x006a:
            X.A9F r0 = r12.A08
            if (r0 == 0) goto L_0x0073
            X.9oQ r0 = r0.A07
            r0.A07(r8)
        L_0x0073:
            X.LF1 r0 = r12.A09
            if (r0 == 0) goto L_0x008b
            X.LN8 r2 = r0.A01
            com.instagram.common.ui.base.IgTextView r1 = r2.A03
            if (r1 == 0) goto L_0x0082
            int r0 = r8.A0C
            r1.setTextColor(r0)
        L_0x0082:
            com.instagram.common.ui.base.IgTextView r1 = r2.A02
            if (r1 == 0) goto L_0x008b
            int r0 = r8.A0D
            r1.setTextColor(r0)
        L_0x008b:
            X.LRE r0 = r12.A0A
            if (r0 == 0) goto L_0x0092
            r0.A02(r8)
        L_0x0092:
            X.Eyv r0 = r12.A0S
            if (r0 == 0) goto L_0x00b8
            android.view.View r2 = r0.A01
            r0 = 2131430560(0x7f0b0ca0, float:1.8482824E38)
            android.view.View r1 = r2.requireViewById(r0)
            X.0qQ.A07(r1)
            int r0 = r8.A08
            r1.setBackgroundColor(r0)
            r0 = 2131444065(0x7f0b4161, float:1.8510216E38)
            android.view.View r1 = r2.requireViewById(r0)
            X.0qQ.A07(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r8.A0D
            r1.setTextColor(r0)
        L_0x00b8:
            X.7Gq r0 = r12.A0U
            if (r0 == 0) goto L_0x00cb
            r0.A00 = r8
            X.OMu r0 = r0.A01
            if (r0 == 0) goto L_0x00cb
            r0.A00 = r8
            androidx.recyclerview.widget.RecyclerView r1 = r0.A04
            int r0 = r8.A01
            r1.setBackgroundColor(r0)
        L_0x00cb:
            X.A72 r0 = r12.A05
            if (r0 == 0) goto L_0x00d4
            X.AE5 r0 = r0.A03
            r0.A07(r8)
        L_0x00d4:
            X.ADD r10 = r12.A0C
            if (r10 == 0) goto L_0x00fc
            android.view.View r2 = r10.A01
            r0 = 2131431978(0x7f0b122a, float:1.84857E38)
            android.view.View r1 = r2.requireViewById(r0)
            X.0qQ.A07(r1)
            int r0 = r8.A08
            r1.setBackgroundColor(r0)
            com.instagram.common.ui.base.IgTextView r1 = r10.A04
            int r0 = r8.A0C
            r1.setTextColor(r0)
            com.instagram.common.ui.base.IgTextView r1 = r10.A03
            int r0 = r8.A0D
            r1.setTextColor(r0)
            int r0 = r8.A06
            r2.setBackgroundColor(r0)
        L_0x00fc:
            X.7S2 r8 = r12.A1I
            java.lang.Class<X.7Ry> r2 = X.C331687Ry.class
            r1 = 25
            X.9Km r0 = new X.9Km
            r0.<init>(r3, r1)
            r8.A00(r2, r0)
            X.37E r2 = X.AnonymousClass37D.A00
            X.4DH r1 = r12.A0u
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.37D r8 = r2.A01(r0)
            android.os.Bundle r2 = r1.requireArguments()
            java.lang.String r0 = "DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET"
            boolean r0 = r2.getBoolean(r0, r11)
            com.instagram.direct.model.DirectThreadThemeInfo r13 = r3.A08
            if (r0 == 0) goto L_0x0187
            if (r8 == 0) goto L_0x0187
            r0 = r8
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 == 0) goto L_0x0187
            if (r13 == 0) goto L_0x0187
            X.7Pu r10 = X.C48943Emh.A00(r8)
            if (r10 == 0) goto L_0x0187
            int r8 = r7.A00
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            boolean r2 = X.AnonymousClass3HA.A00(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 35
            if (r2 == 0) goto L_0x01a7
            r1.append(r0)
            java.lang.String r0 = r13.A0O
        L_0x014d:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            int r0 = X.0nH.A0C(r0, r11)
            r11 = 45
            int r2 = android.graphics.Color.red(r0)
            int r1 = android.graphics.Color.green(r0)
            int r0 = android.graphics.Color.blue(r0)
            int r0 = android.graphics.Color.argb(r11, r2, r1, r0)
            r10.A0B(r8, r0)
            android.app.Activity r0 = X.AnonymousClass9H7.A00(r12)
            android.view.Window r2 = r0.getWindow()
            if (r2 == 0) goto L_0x0187
            android.view.View r0 = r2.getDecorView()
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.Oko r0 = new X.Oko
            r0.<init>(r2, r10, r8)
            r1.addOnGlobalLayoutListener(r0)
        L_0x0187:
            X.7Ue r2 = r14.A0i
            X.7M7 r0 = r2.A07
            if (r0 == 0) goto L_0x01ad
            r0.A00 = r3
            java.util.Set r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x0195:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ad
            java.lang.Object r0 = r1.next()
            X.O6n r0 = (X.C70436O6n) r0
            X.OVb r0 = r0.A00
            X.C70987OVb.A00(r0)
            goto L_0x0195
        L_0x01a7:
            r1.append(r0)
            java.lang.String r0 = r13.A0d
            goto L_0x014d
        L_0x01ad:
            X.7UW r10 = r4.A0C
            com.instagram.common.session.UserSession r4 = r10.A06
            X.0Tu r8 = X.0Tu.A05
            r0 = 36324677317439727(0x810d1a001630ef, double:3.03521043105962E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r0 != 0) goto L_0x01c2
            r0 = 0
            r10.A02(r0)
        L_0x01c2:
            X.0eM r4 = r2.A0k
            java.lang.Object r0 = r4.getValue()
            X.7WL r0 = (X.AnonymousClass7WL) r0
            r0.A01()
            android.view.View r10 = r6.mView
            boolean r1 = r14.A0L
            int r0 = r14.A02
            r5.A04(r10, r0, r1)
            X.0eM r0 = r2.A0Z
            java.lang.Object r1 = r0.getValue()
            X.7WY r1 = (X.AnonymousClass7WY) r1
            int r0 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
            X.7Np r0 = r1.A01
            if (r0 == 0) goto L_0x01fb
            android.widget.EditText r1 = r0.A01
            if (r1 == 0) goto L_0x01fb
            X.7WY r0 = r0.A05
            java.lang.Integer r0 = r0.A04
            if (r0 == 0) goto L_0x01fb
            int r0 = r0.intValue()
            r1.setBackgroundColor(r0)
        L_0x01fb:
            java.lang.Object r0 = r4.getValue()
            X.7WL r0 = (X.AnonymousClass7WL) r0
            X.782 r0 = r0.A00
            if (r0 == 0) goto L_0x020e
            X.780 r0 = r0.A03
            if (r0 == 0) goto L_0x020e
            r0.A00 = r3
            r0.A00()
        L_0x020e:
            X.0eM r0 = r2.A0W
            java.lang.Object r0 = r0.getValue()
            X.7WH r0 = (X.AnonymousClass7WH) r0
            X.OLf r0 = r0.A00
            if (r0 == 0) goto L_0x021d
            r0.A00()
        L_0x021d:
            X.0eM r0 = r2.A0O
            java.lang.Object r0 = r0.getValue()
            X.7Vu r0 = (X.C332637Vu) r0
            X.7FA r2 = r0.A02
            if (r2 == 0) goto L_0x0245
            boolean r1 = r9.CXh()
            boolean r0 = r2.A06
            if (r0 == r1) goto L_0x0245
            r2.A06 = r1
            android.view.ViewGroup r0 = r2.A01
            if (r0 == 0) goto L_0x0245
            X.9uY r1 = r2.A03
            if (r1 == 0) goto L_0x0245
            boolean r0 = r1.A05()
            X.AnonymousClass7FA.A00(r2)
            X.AnonymousClass7FA.A02(r2, r1, r0)
        L_0x0245:
            androidx.fragment.app.FragmentActivity r10 = r6.requireActivity()
            X.7Zg r0 = r14.A08
            if (r0 != 0) goto L_0x0256
            java.lang.String r8 = "clientInfra"
            goto L_0x003f
        L_0x0251:
            A08(r14, r3)
            goto L_0x0039
        L_0x0256:
            X.7S7 r4 = r0.C6l()
            r3 = 1
            X.7L2 r0 = r5.A04
            r2 = 0
            if (r0 == 0) goto L_0x0269
            com.instagram.direct.model.DirectThreadThemeInfo r0 = r0.A08
            if (r0 == 0) goto L_0x0269
            boolean r0 = r0.A0t
            r1 = 0
            if (r0 != 0) goto L_0x026a
        L_0x0269:
            r1 = 1
        L_0x026a:
            boolean r0 = r4.CVE()
            if (r0 != 0) goto L_0x0273
            if (r1 == 0) goto L_0x0273
            r2 = 1
        L_0x0273:
            X.AnonymousClass2uJ.A06(r10, r2)
            boolean r0 = r9.CXh()
            if (r0 != 0) goto L_0x0287
            android.content.Context r0 = r6.requireContext()
            boolean r0 = X.AnonymousClass3HA.A00(r0)
            if (r0 != 0) goto L_0x0287
            r3 = 0
        L_0x0287:
            X.3tH r0 = r14.A0v
            boolean r1 = r0.A00()
            X.0eK r9 = r5.A0A
            java.lang.Object r0 = r9.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            com.instagram.direct.model.DirectThreadThemeInfo r2 = r0.C6d()
            if (r2 == 0) goto L_0x02ec
            if (r1 == 0) goto L_0x0318
            X.7L2 r0 = r5.A04
            X.7Kx r4 = r0.A04
            X.0eK r0 = r5.A0E
            java.lang.Object r1 = r0.get()
            r0 = 3
            X.0qQ.A0B(r1, r0)
            int r0 = r2.A06
            if (r0 == 0) goto L_0x0318
            int r0 = r2.A02
            if (r0 == 0) goto L_0x0318
            if (r3 == 0) goto L_0x0315
            android.graphics.drawable.Drawable r0 = r4.A0Q
        L_0x02bb:
            if (r0 != 0) goto L_0x0318
            X.4Dk r1 = r5.A03
            if (r1 == 0) goto L_0x02c9
            X.4Dq r0 = r5.A02
            r0.getClass()
            r1.A02(r0)
        L_0x02c9:
            X.4DH r0 = r5.A07
            android.content.Context r1 = r0.requireContext()
            if (r3 == 0) goto L_0x0312
            int r0 = r2.A02
        L_0x02d3:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            X.4Dk r0 = (X.C262364Dk) r0
            r5.A03 = r0
            X.7U7 r0 = r5.A09
            r0.A00()
            X.AZM r1 = new X.AZM
            r1.<init>(r5, r3)
            r5.A02 = r1
            X.4Dk r0 = r5.A03
            r0.A01(r1)
        L_0x02ec:
            android.content.Context r0 = r6.requireContext()
            boolean r0 = X.AnonymousClass3HA.A00(r0)
            if (r0 == 0) goto L_0x030b
            android.graphics.drawable.Drawable r0 = r7.A0Q
            if (r0 != 0) goto L_0x0305
            int r0 = r7.A08
        L_0x02fc:
            if (r0 != 0) goto L_0x0305
            r0 = 0
            r5.A00 = r0
            r5.A01 = r0
            r5.A03 = r0
        L_0x0305:
            X.7U7 r0 = r5.A09
            r0.A00()
        L_0x030a:
            return
        L_0x030b:
            android.graphics.drawable.Drawable r0 = r7.A0R
            if (r0 != 0) goto L_0x0305
            int r0 = r7.A0B
            goto L_0x02fc
        L_0x0312:
            int r0 = r2.A06
            goto L_0x02d3
        L_0x0315:
            android.graphics.drawable.Drawable r0 = r4.A0R
            goto L_0x02bb
        L_0x0318:
            java.lang.Object r0 = r9.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.7SD r0 = r0.C6Q()
            boolean r0 = r0.A0o
            if (r0 == 0) goto L_0x033a
            X.0eK r0 = r5.A0E
            java.lang.Object r1 = r0.get()
            r0 = 1
            X.0qQ.A0B(r1, r0)
            if (r3 == 0) goto L_0x0384
            java.lang.String r0 = r2.A0i
            if (r0 != 0) goto L_0x0388
        L_0x033a:
            java.lang.String r0 = r2.A0g
            if (r0 == 0) goto L_0x036d
            com.instagram.common.session.UserSession r4 = r5.A08
            r0 = 36320910629741515(0x8109ad000123cb, double:3.0328283625920367E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r0 == 0) goto L_0x036d
            X.0eK r0 = r5.A0E
            r0.get()
            X.4DH r0 = r5.A07
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            java.lang.String r3 = r2.A0g
        L_0x0358:
            r3.getClass()
            X.73h r2 = new X.73h
            r2.<init>(r5)
            X.0nO r1 = X.0nY.A00()
            X.73j r0 = new X.73j
            r0.<init>(r4, r2, r3)
            r1.ATE(r0)
            goto L_0x02ec
        L_0x036d:
            X.0eK r0 = r5.A0E
            java.lang.Object r1 = r0.get()
            r0 = 1
            X.0qQ.A0B(r1, r0)
            if (r3 == 0) goto L_0x037f
            java.lang.String r0 = r2.A0i
            if (r0 != 0) goto L_0x0388
            goto L_0x02ec
        L_0x037f:
            java.lang.String r0 = r2.A0l
            if (r0 == 0) goto L_0x02ec
            goto L_0x0388
        L_0x0384:
            java.lang.String r0 = r2.A0l
            if (r0 == 0) goto L_0x033a
        L_0x0388:
            X.4DH r0 = r5.A07
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            if (r3 == 0) goto L_0x0393
            java.lang.String r3 = r2.A0i
            goto L_0x0358
        L_0x0393:
            java.lang.String r3 = r2.A0l
            goto L_0x0358
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7TI.A0D(X.7TI, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0169, code lost:
        if (r9 == null) goto L_0x013f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0E(X.AnonymousClass7TI r15, boolean r16) {
        /*
            X.7Zg r0 = r15.A08
            java.lang.String r1 = "clientInfra"
            if (r0 == 0) goto L_0x0184
            X.7S7 r0 = r0.C6l()
            X.7SD r7 = r0.C6Q()
            int r12 = r7.A08
            X.7Zg r0 = r15.A08
            if (r0 == 0) goto L_0x0184
            X.7S7 r0 = r0.C6l()
            X.3t3 r3 = r0.CBU()
            X.3t2 r11 = A02(r15)
            java.util.List r2 = r7.A0b
            r10 = 1
            X.7Kc r0 = r15.A0I(r10)
            X.3tH r9 = r0.Axi()
            X.9HS r13 = r15.A0w
            r8 = 5
            X.0qQ.A0B(r2, r8)
            java.lang.String r0 = "thread_type_value"
            r13.A0G(r0, r12)
            if (r16 == 0) goto L_0x0180
            java.lang.String r1 = X.AnonymousClass48O.A00(r12)
        L_0x003c:
            java.lang.String r0 = "thread_type_str"
            r13.A0J(r0, r1)
            java.lang.String r1 = X.AnonymousClass4KK.A02(r11)
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = "open_thread_id"
            r13.A0J(r0, r1)
        L_0x004c:
            java.lang.Long r1 = X.AnonymousClass4KK.A01(r11)
            if (r1 == 0) goto L_0x0057
            java.lang.String r0 = "occamadillo_thread_id"
            r13.A0I(r0, r1)
        L_0x0057:
            if (r3 == 0) goto L_0x006f
            boolean r5 = r7.A0x
            boolean r0 = r3 instanceof X.C254763t0
            java.lang.String r4 = "is_mixvm_eligible"
            java.lang.String r3 = "is_mixvm"
            java.lang.String r1 = "is_vm"
            if (r0 == 0) goto L_0x0179
            r13.A0K(r1, r5)
            r0 = 0
        L_0x0069:
            r13.A0K(r3, r0)
            r13.A0K(r4, r0)
        L_0x006f:
            int r1 = r2.size()
            java.lang.String r0 = "user_count"
            r13.A0G(r0, r1)
            boolean r0 = r2 instanceof java.util.Collection
            r6 = 0
            if (r0 == 0) goto L_0x0188
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0188
            r5 = 0
        L_0x0084:
            java.lang.String r0 = "eimu_user_count"
            r13.A0G(r0, r5)
            java.lang.Long r1 = X.C330007Lb.A00(r7)
            if (r1 == 0) goto L_0x0094
            java.lang.String r0 = "ephemeral_lifetime_ms"
            r13.A0I(r0, r1)
        L_0x0094:
            X.7Lc r5 = X.C330017Lc.A00
            com.instagram.common.session.UserSession r2 = r13.A07
            java.lang.Long r1 = r5.A00(r2, r7)
            if (r1 == 0) goto L_0x00a3
            java.lang.String r0 = "after_view_lifetime_ms"
            r13.A0I(r0, r1)
        L_0x00a3:
            r0 = 29
            if (r12 != r0) goto L_0x00ae
            boolean r1 = r7.A0n
            java.lang.String r0 = "channel_is_added_to_inbox"
            r13.A0K(r0, r1)
        L_0x00ae:
            X.2Ep r0 = r7.A0K
            if (r0 == 0) goto L_0x00b6
            boolean r6 = r0.CVa(r2)
        L_0x00b6:
            java.lang.String r1 = "is_instamadillo"
            r13.A0K(r1, r6)
            if (r6 == 0) goto L_0x0170
            X.3tH r0 = X.C254923tH.ACT
        L_0x00bf:
            java.lang.String r2 = r0.A00
            java.lang.String r0 = "transport_type"
            r13.A0J(r0, r2)
            X.9H3 r4 = r15.A0x
            com.instagram.common.session.UserSession r6 = r15.A0d
            X.0qQ.A0B(r6, r8)
            X.18g r8 = r4.A08
            X.1Jv r2 = r8.A05
            if (r2 == 0) goto L_0x00d9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r2.A06 = r0
        L_0x00d9:
            if (r16 == 0) goto L_0x016c
            java.lang.String r0 = X.AnonymousClass48O.A00(r12)
        L_0x00df:
            if (r2 == 0) goto L_0x00e3
            r2.A0B = r0
        L_0x00e3:
            java.lang.String r2 = X.AnonymousClass4KK.A02(r11)
            X.1Jv r0 = r8.A05
            if (r0 == 0) goto L_0x00ed
            r0.A0A = r2
        L_0x00ed:
            java.lang.Long r0 = X.AnonymousClass4KK.A01(r11)
            r2 = 0
            if (r0 == 0) goto L_0x00f8
            java.lang.String r2 = r0.toString()
        L_0x00f8:
            X.1Jv r0 = r8.A05
            if (r0 == 0) goto L_0x00fe
            r0.A09 = r2
        L_0x00fe:
            boolean r0 = r11 instanceof X.C254773t1
            if (r0 == 0) goto L_0x01db
            com.facebook.quicklog.LightweightQuickPerformanceLogger r2 = X.AnonymousClass9H3.A00(r4)
            java.lang.String r0 = "is_mixvm"
            r3 = 0
            X.18g.A06(r2, r0, r3)
            com.facebook.quicklog.LightweightQuickPerformanceLogger r2 = X.AnonymousClass9H3.A00(r4)
            java.lang.String r0 = "is_mixvm_eligible"
            X.18g.A06(r2, r0, r3)
            boolean r3 = r7.A0x
            com.facebook.quicklog.LightweightQuickPerformanceLogger r2 = X.AnonymousClass9H3.A00(r4)
            java.lang.String r0 = "is_vm"
            X.18g.A06(r2, r0, r3)
            X.7Pi r2 = X.C331077Pk.A02
            X.3Tu r0 = r7.A0H
            boolean r0 = r2.A03(r6, r0)
            if (r0 == 0) goto L_0x0169
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = X.AnonymousClass9H3.A00(r4)
            X.18g.A06(r0, r1, r10)
            X.3tH r9 = X.C254923tH.ACT
        L_0x0133:
            java.lang.String r1 = r9.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.1Jv r0 = r8.A05
            if (r0 == 0) goto L_0x013f
            r0.A0C = r1
        L_0x013f:
            java.util.LinkedHashMap r0 = X.C250563lf.A0J(r6)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x014b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r8.A02
            X.18g.A05(r0, r2, r1)
            goto L_0x014b
        L_0x0169:
            if (r9 != 0) goto L_0x0133
            goto L_0x013f
        L_0x016c:
            java.lang.String r0 = "THREAD_LOADING_FAILED"
            goto L_0x00df
        L_0x0170:
            if (r9 == 0) goto L_0x0175
            r0 = r9
            goto L_0x00bf
        L_0x0175:
            X.3tH r0 = r13.A09
            goto L_0x00bf
        L_0x0179:
            boolean r0 = r13.A0B
            r13.A0K(r1, r0)
            goto L_0x0069
        L_0x0180:
            java.lang.String r1 = "THREAD_LOADING_FAILED"
            goto L_0x003c
        L_0x0184:
            X.0qQ.A0F(r1)
            goto L_0x01b0
        L_0x0188:
            java.util.Iterator r14 = r2.iterator()
            r5 = 0
        L_0x018d:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r14.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.Long r0 = r0.BST()
            r3 = 0
            if (r0 == 0) goto L_0x018d
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x018d
            int r5 = r5 + 1
            if (r5 >= 0) goto L_0x018d
            X.0sr.A1S()
        L_0x01b0:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01b5:
            java.lang.Long r0 = X.C330007Lb.A00(r7)
            if (r0 == 0) goto L_0x01c8
            long r2 = r0.longValue()
            com.facebook.quicklog.LightweightQuickPerformanceLogger r1 = X.AnonymousClass9H3.A00(r4)
            java.lang.String r0 = "ephemeral_lifetime_ms"
            X.18g.A04(r1, r0, r2)
        L_0x01c8:
            java.lang.Long r0 = r5.A00(r6, r7)
            if (r0 == 0) goto L_0x01db
            long r2 = r0.longValue()
            com.facebook.quicklog.LightweightQuickPerformanceLogger r1 = X.AnonymousClass9H3.A00(r4)
            java.lang.String r0 = "after_view_lifetime_ms"
            X.18g.A04(r1, r0, r2)
        L_0x01db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7TI.A0E(X.7TI, boolean):void");
    }

    private final void A0F(boolean z, float f) {
        ViewGroup viewGroup = this.A03;
        if (viewGroup != null) {
            RecyclerView recyclerView = this.A04;
            if (recyclerView == null) {
                0qQ.A0F("messageRecyclerView");
                throw AnonymousClass00P.createAndThrow();
            }
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            if (f == 0.0f) {
                0nA.A0c(viewGroup, 0);
            }
            float f2 = -viewGroup.getY();
            if (f == 0.0f && ((float) computeVerticalScrollOffset) < f2) {
                C71392co r0 = C315596kB.A02;
                C294975nL.A01(viewGroup, 0).A0G();
                viewGroup.setY(0.0f);
            } else if (z) {
                C71392co r02 = C315596kB.A02;
                C294975nL A012 = C294975nL.A01(viewGroup, 0);
                A012.A0G();
                A012.A0K(f);
                C294975nL A0F2 = A012.A0F(true);
                A0F2.A06 = new C40638AgD(viewGroup, f);
                A0F2.A05 = new Ag8(viewGroup, f);
                A0F2.A0H();
            } else {
                viewGroup.setY(f);
                0nA.A0c(viewGroup, -((int) f));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (X.182.A06(X.0Tu.A05, r14.A0d, 36316920605053644L) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (X.182.A06(X.0Tu.A05, r14.A0d, 36317298562503645L) == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0G(X.AnonymousClass7TI r14) {
        /*
            X.7Zg r0 = r14.A08
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "clientInfra"
        L_0x0006:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            X.7S7 r6 = r0.C6l()
            boolean r0 = r6.CdE()
            r8 = 0
            if (r0 == 0) goto L_0x0069
            X.7SD r5 = r6.C6Q()
            X.3tH r0 = r14.A0v
            boolean r7 = r0.A00()
            if (r7 != 0) goto L_0x0035
            com.instagram.common.session.UserSession r3 = r14.A0d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316920605053644(0x81060c000012cc, double:3.030305054912887E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L_0x0048
        L_0x0035:
            r4 = 0
            if (r7 == 0) goto L_0x0048
            com.instagram.common.session.UserSession r3 = r14.A0d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317298562503645(0x810664000513dd, double:3.0305440767261804E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            com.instagram.common.session.UserSession r9 = r14.A0d
            com.instagram.direct.capabilities.Capabilities r10 = r14.A06
            if (r10 != 0) goto L_0x0052
            java.lang.String r0 = "_capabilities"
            goto L_0x0006
        L_0x0052:
            X.3t3 r11 = r5.A0P
            int r12 = r5.A08
            java.lang.String r0 = r9.A06
            boolean r13 = r6.COR(r0)
            boolean r14 = r5.A1A
            boolean r0 = X.C327827Ci.A02(r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L_0x0069
            if (r4 != 0) goto L_0x0068
            if (r1 == 0) goto L_0x0069
        L_0x0068:
            r8 = 1
        L_0x0069:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7TI.A0G(X.7TI):boolean");
    }

    public static final boolean A0H(AnonymousClass7TI r0) {
        C333517Zg r02 = r0.A08;
        if (r02 != null) {
            return C331057Pi.A02(r02.C6l().C6Q().A0H);
        }
        0qQ.A0F("clientInfra");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        X.0qQ.A0B(r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r6 == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return X.C329737Ka.A00(r2, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return X.C329737Ka.A01(r2, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if ((r0 instanceof X.C254773t1) != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r3 != null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r4 = r3.C6Q();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C329757Kc A0I(boolean r6) {
        /*
            r5 = this;
            X.7Zg r0 = r5.A08
            r4 = 0
            if (r0 == 0) goto L_0x002b
            X.7S7 r3 = r0.C6l()
        L_0x0009:
            com.instagram.common.session.UserSession r2 = r5.A0d
            if (r3 == 0) goto L_0x0019
            X.3t2 r0 = r3.C6c()
            X.0qQ.A07(r0)
            boolean r0 = r0 instanceof X.C254773t1
            r1 = 0
            if (r0 == 0) goto L_0x001c
        L_0x0019:
            r1 = 1
            if (r3 == 0) goto L_0x0020
        L_0x001c:
            X.7SD r4 = r3.C6Q()
        L_0x0020:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            if (r6 == 0) goto L_0x002d
            X.7Kc r0 = X.C329737Ka.A00(r2, r4, r1)
            return r0
        L_0x002b:
            r3 = r4
            goto L_0x0009
        L_0x002d:
            X.7Kc r0 = X.C329737Ka.A01(r2, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7TI.A0I(boolean):X.7Kc");
    }

    public final AnonymousClass7GK A0J() {
        C333517Zg r0 = this.A08;
        if (r0 != null) {
            if (r0.C6l().CdE()) {
                C333517Zg r02 = this.A08;
                if (r02 != null) {
                    if (r02.C6l().EtG()) {
                        C333517Zg r03 = this.A08;
                        if (r03 != null) {
                            if (!r03.C6l().CYS()) {
                                C333517Zg r04 = this.A08;
                                if (r04 != null) {
                                    return AnonymousClass7GL.A00(this.A0d, r04.Api());
                                }
                            }
                        }
                    }
                }
            }
            C333517Zg r2 = this.A08;
            if (r2 != null) {
                AnonymousClass7ZY BSN = r2.BSN();
                boolean AiX = BSN.AiX();
                AnonymousClass7GL r4 = AnonymousClass7GK.A08;
                if (AiX) {
                    return new AnonymousClass7GK(AnonymousClass7GM.DELETE_MESSAGE, (2Er) null, (String) null, (String) null, (String) null, (String) null, BSN.AiV(), 0);
                }
                2Er Api = r2.Api();
                UserSession userSession = this.A0d;
                Context requireContext = this.A0U.requireContext();
                C333517Zg r05 = this.A08;
                if (r05 != null) {
                    return r4.A03(requireContext, userSession, r05.C6l().C6Q().A0H, Api);
                }
            }
        }
        0qQ.A0F("clientInfra");
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass7L9 A0K() {
        AnonymousClass7L9 r0 = this.A0j.A03;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("directSendHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass7SX A0L() {
        return ((AnonymousClass7V4) this.A0i.A0f.getValue()).A04;
    }

    public final DirectShareTarget A0M() {
        Context context = this.A0U.getContext();
        if (context == null) {
            return null;
        }
        C333517Zg r0 = this.A08;
        if (r0 != null) {
            return r0.C6l().C6Z(context);
        }
        0qQ.A0F("clientInfra");
        throw AnonymousClass00P.createAndThrow();
    }

    public final DirectThreadKey A0N() {
        C333517Zg r0 = this.A08;
        if (r0 != null) {
            return C66647MaG.A04(r0.C6l().AfV());
        }
        0qQ.A0F("clientInfra");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Long A0O() {
        C333517Zg r0 = this.A08;
        if (r0 == null) {
            0qQ.A0F("clientInfra");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass7SD C6Q = r0.C6l().C6Q();
        0qQ.A07(C6Q);
        return C330007Lb.A00(C6Q);
    }

    public final void A0P() {
        String str;
        String str2;
        Capabilities capabilities = this.A06;
        if (capabilities == null) {
            str = "_capabilities";
        } else if (capabilities.A00(C376179Gx.CUSTOMIZE_THEME_FROM_THREAD)) {
            AnonymousClass7U1 r2 = this.A0j.A0M;
            C333517Zg r0 = this.A08;
            str = "clientInfra";
            if (r0 != null) {
                Integer A032 = r2.A03(r0.C6l());
                0qQ.A07(A032);
                if (this.A0P != A032) {
                    this.A0P = A032;
                } else {
                    AnonymousClass7L2 r02 = r2.A04;
                    0qQ.A07(r02);
                    String str3 = r02.A09;
                    C333517Zg r03 = this.A08;
                    if (r03 != null) {
                        DirectThreadThemeInfo C6d = r03.C6l().C6d();
                        if (C6d == null || (str2 = C6d.A0o) == null) {
                            str2 = "";
                        }
                        if (!(!0qQ.A0K(str3, str2))) {
                            return;
                        }
                    }
                }
                A07(this);
                return;
            }
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0Q() {
        C330327Mi r0 = this.A0i.A08;
        if (r0 == null) {
            0wj.A01.AEf("mDirectActivityThreadIndicatorController is not initialized yet.", 20134884).report();
        } else {
            r0.A01();
        }
    }

    public final void A0R() {
        AnonymousClass7GK A0J2;
        String str;
        AnonymousClass9VE r3;
        AnonymousClass9VF r32;
        if (this.A0U.isResumed()) {
            AnonymousClass0eM r4 = this.A0i.A0i;
            boolean A052 = ((AnonymousClass7V0) r4.getValue()).A05();
            AnonymousClass7V0 r1 = (AnonymousClass7V0) r4.getValue();
            if (A052) {
                long A032 = r1.A03();
                String A042 = ((AnonymousClass7V0) r4.getValue()).A04();
                AnonymousClass7V0 r7 = (AnonymousClass7V0) r4.getValue();
                String str2 = null;
                if (!(!182.A06(0Tu.A05, r7.A00, 36317182598320969L) || (r3 = r7.A0C) == null || (r32 = r3.A03) == null)) {
                    str2 = r32.A00;
                }
                C333517Zg r33 = this.A08;
                if (r33 != null) {
                    A0J2 = new AnonymousClass7GK(AnonymousClass7GM.ENFORCEMENT_NOTICE, r33.Api(), A042, str2, (String) null, (String) null, 0, TimeUnit.SECONDS.toMillis(A032) - System.currentTimeMillis());
                }
                0qQ.A0F("clientInfra");
                throw AnonymousClass00P.createAndThrow();
            }
            boolean A062 = r1.A06();
            AnonymousClass7V0 r12 = (AnonymousClass7V0) r4.getValue();
            if (A062) {
                long j = r12.A0D.A00;
                C333517Zg r13 = this.A08;
                if (r13 != null) {
                    A0J2 = new AnonymousClass7GK(AnonymousClass7GM.FEATURE_LIMITED, r13.Api(), (String) null, (String) null, (String) null, (String) null, 0, TimeUnit.SECONDS.toMillis(j) - System.currentTimeMillis());
                }
                0qQ.A0F("clientInfra");
                throw AnonymousClass00P.createAndThrow();
            } else if (r12.A07()) {
                2Er Api = ((C333517Zg) ((AnonymousClass7V0) r4.getValue()).A07.get()).Api();
                if (Api != null) {
                    str = Api.BMX();
                } else {
                    str = null;
                }
                C333517Zg r14 = this.A08;
                if (r14 != null) {
                    A0J2 = AnonymousClass7GL.A01(r14.Api(), str);
                }
                0qQ.A0F("clientInfra");
                throw AnonymousClass00P.createAndThrow();
            } else {
                A0J2 = A0J();
            }
            this.A19.A0I(A0J2);
            A0C(this, A0J2.A03());
        }
    }

    public final void A0S(float f) {
        if (this.A03 == null) {
            this.A0U.requireArguments().putFloat(AnonymousClass000.A00(2234), f);
        } else if (!this.A0Q && Build.VERSION.SDK_INT < 30) {
            A0F(true, f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(int r8, int r9, int r10, boolean r11) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r1 = r7.A04
            if (r1 == 0) goto L_0x0088
            X.7Tw r0 = r7.A0j
            X.7UO r4 = r0.A0H
            android.view.View r0 = r4.A01
            if (r0 == 0) goto L_0x0088
            java.lang.String r6 = "messageRecyclerView"
            r5 = 1
            boolean r0 = r1.canScrollVertically(r5)
            if (r0 == 0) goto L_0x0016
            int r8 = r8 - r10
        L_0x0016:
            X.4DH r2 = r7.A0U
            android.content.Context r0 = r2.requireContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r8 = r8 - r0
            android.content.Context r0 = r2.requireContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165526(0x7f070156, float:1.7945272E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            int r8 = r8 - r0
            r3 = 0
            int r1 = java.lang.Math.max(r8, r3)
            r7.A00 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r7.A04
            if (r11 == 0) goto L_0x0082
            if (r0 == 0) goto L_0x0094
            int r2 = r0.getPaddingBottom()
            androidx.recyclerview.widget.RecyclerView r0 = r7.A04
            if (r0 == 0) goto L_0x0094
            X.5nL r0 = X.C294975nL.A01(r0, r3)
            r0.A0G()
            X.5nL r1 = r0.A0F(r5)
            X.AgF r0 = new X.AgF
            r0.<init>(r7, r2)
            r1.A06 = r0
            r1.A0H()
        L_0x0062:
            int r0 = r7.A00
            r4.A00 = r0
            X.AnonymousClass7UO.A01(r4)
        L_0x0069:
            android.view.ViewGroup r0 = r7.A03
            if (r0 == 0) goto L_0x0081
            com.instagram.common.session.UserSession r3 = r7.A0d
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321279997060323(0x810a03000324e3, double:3.0330619519717737E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0081
            int r0 = -r9
            float r0 = (float) r0
            r7.A0F(r11, r0)
        L_0x0081:
            return
        L_0x0082:
            if (r0 == 0) goto L_0x0094
            X.0nA.A0X(r0, r1)
            goto L_0x0062
        L_0x0088:
            X.4DH r0 = r7.A0U
            android.os.Bundle r1 = r0.requireArguments()
            java.lang.String r0 = "DirectThreadFragment.ARGUMENT_COMPOSER_HEIGHT"
            r1.putInt(r0, r8)
            goto L_0x0069
        L_0x0094:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7TI.A0T(int, int, int, boolean):void");
    }

    public final void A0U(int i, int i2, Intent intent) {
        AnonymousClass37D A022;
        if (i != 107) {
            int i3 = -1;
            if (i != 101) {
                if (i == 102) {
                    if (i2 == -1 && (A022 = AnonymousClass37D.A00.A02(this.A0U.requireContext())) != null) {
                        A022.A0B();
                        return;
                    }
                    return;
                }
            } else if (i2 == -1) {
                AnonymousClass7UF r4 = this.A0j.A0I;
                r4.A00();
                if (182.A06(0Tu.A05, this.A0d, 36325579259327550L)) {
                    i3 = 0;
                }
                r4.A01((C254933tI) null, (Integer) null, i3);
                return;
            } else {
                return;
            }
        } else if (i2 == 108) {
            FragmentActivity requireActivity = this.A0U.requireActivity();
            if (requireActivity instanceof AnonymousClass2ZQ) {
                requireActivity.onBackPressed();
            } else {
                requireActivity.finish();
            }
        }
        AnonymousClass36V r0 = this.A0j.A0E.A00;
        if (r0 != null) {
            r0.onActivityResult(i, i2, intent);
        } else {
            0qQ.A0F("captureFlowHelper");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final boolean A0V() {
        C333517Zg r0 = this.A08;
        if (r0 != null) {
            if (r0.C6l().CdE()) {
                AnonymousClass7GL r4 = AnonymousClass7GK.A08;
                long j = ((AnonymousClass7V0) this.A0i.A0i.getValue()).A0D.A00;
                C333517Zg r02 = this.A08;
                if (r02 != null) {
                    2Er Api = r02.Api();
                    if (Api != null) {
                        boolean A042 = r4.A04(this.A0d, Api, j);
                        C333517Zg r03 = this.A08;
                        if (r03 != null) {
                            if (r03.C6l().EtG() || !A042) {
                                return false;
                            }
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            return true;
        }
        0qQ.A0F("clientInfra");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A0W() {
        UserSession userSession = this.A0d;
        C333517Zg r0 = this.A08;
        if (r0 != null) {
            return C308556Us.A0F(userSession, r0.C6l().C6Q().A0H);
        }
        0qQ.A0F("clientInfra");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ARf(boolean z) {
        MessageListLayoutManager messageListLayoutManager = this.A0B;
        if (messageListLayoutManager != null) {
            messageListLayoutManager.A00 = z;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
        if (r0.CQp(r5) == true) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
        r1 = "yes";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        r6.put("ig_creator_ai_enabled", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0102, code lost:
        if (X.0eE.A00(r8).A00().CQp(r5) != false) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map B3T() {
        /*
            r12 = this;
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            X.3tH r2 = r12.A0v
            X.3tH r0 = X.C254923tH.ACT
            java.lang.String r3 = "no"
            java.lang.String r4 = "yes"
            r1 = r3
            if (r2 != r0) goto L_0x0011
            r1 = r4
        L_0x0011:
            java.lang.String r0 = "reported-from-armadillo"
            r6.put(r0, r1)
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "transport_type_thread"
            r6.put(r0, r1)
            X.7Zg r0 = r12.A08
            java.lang.String r11 = "clientInfra"
            if (r0 == 0) goto L_0x01ba
            X.7S7 r10 = r0.C6l()
            X.2Ep r9 = r10.Cms()
            boolean r0 = r10.CdE()
            if (r0 == 0) goto L_0x008a
            boolean r0 = r10.CVr()
            r1 = r3
            if (r0 == 0) goto L_0x0039
            r1 = r4
        L_0x0039:
            java.lang.String r0 = "reported-from-interop"
            r6.put(r0, r1)
            X.7SD r0 = r10.C6Q()
            int r0 = r0.A08
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "reported-from-thread-subtype"
            r6.put(r0, r1)
            int r0 = r10.AdN()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "reported-from-thread-audience-type"
            r6.put(r0, r1)
            X.AnonymousClass1q4.A00()
            com.instagram.common.session.UserSession r8 = r12.A0d
            r7 = 1
            X.0qQ.A0B(r8, r7)
            X.6oA r5 = new X.6oA
            r5.<init>(r8)
            if (r9 == 0) goto L_0x00f5
            java.util.List r1 = r9.BMK()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00da
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00da
        L_0x0078:
            com.instagram.user.model.User r0 = r9.BZK()
            if (r0 == 0) goto L_0x00f5
            boolean r0 = r0.CQp(r5)
            if (r0 != r7) goto L_0x00f5
        L_0x0084:
            r1 = r4
        L_0x0085:
            java.lang.String r0 = "ig_creator_ai_enabled"
            r6.put(r0, r1)
        L_0x008a:
            boolean r0 = r10.CVE()
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = "reported-from-vanish-mode"
            r6.put(r0, r4)
        L_0x0095:
            X.7SD r0 = r10.C6Q()
            X.4li r0 = r0.A0N
            boolean r0 = r0.A08
            r1 = r3
            if (r0 == 0) goto L_0x00a1
            r1 = r4
        L_0x00a1:
            java.lang.String r0 = "is_dm"
            r6.put(r0, r1)
            java.util.List r0 = A04(r12)
            if (r0 == 0) goto L_0x010d
            java.util.List r0 = A04(r12)
            X.0qQ.A0A(r0)
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L_0x010d
            r2 = 0
            java.util.List r0 = A04(r12)
            X.0qQ.A0A(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00c6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r1.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            boolean r0 = r0.A2C()
            if (r0 != 0) goto L_0x00c6
            r2 = 1
            goto L_0x00c6
        L_0x00da:
            java.util.Iterator r2 = r1.iterator()
        L_0x00de:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r2.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.IGAIAgentType r1 = r0.AaX()
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A04
            if (r1 != r0) goto L_0x00de
            goto L_0x0084
        L_0x00f5:
            X.0t1 r0 = X.0eE.A00(r8)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = r0.CQp(r5)
            r1 = r3
            if (r0 == 0) goto L_0x0085
            goto L_0x0084
        L_0x0105:
            if (r2 == 0) goto L_0x0108
            r3 = r4
        L_0x0108:
            java.lang.String r0 = "at_least_one_group_recipient_unreachable"
            r6.put(r0, r3)
        L_0x010d:
            com.instagram.common.session.UserSession r8 = r12.A0d
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.3t2 r0 = r10.C6c()
            X.0qQ.A07(r0)
            X.3t1 r7 = X.AnonymousClass6W3.A02(r0)
            if (r7 == 0) goto L_0x014a
            X.2Ep r0 = r10.Cms()
            if (r0 == 0) goto L_0x014a
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.3Tg r0 = r0.A0u
            if (r0 == 0) goto L_0x013d
            long r1 = r0.A00
            r0 = 2
            java.lang.String r1 = java.lang.Long.toString(r1, r0)
            X.0qQ.A07(r1)
            java.lang.String r0 = "thread_capability_server"
            r6.put(r0, r1)
        L_0x013d:
            boolean r0 = r10.CZ0()
            java.lang.String r5 = "thread_capability_overrides"
            if (r0 == 0) goto L_0x0152
            java.lang.String r0 = "not available for DirectPendingRecipients DirectThreadTarget"
        L_0x0147:
            r6.put(r5, r0)
        L_0x014a:
            X.7Zg r0 = r12.A08
            if (r0 == 0) goto L_0x01ba
            r0.A8Y(r6)
            return r6
        L_0x0152:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            X.OV0 r3 = new X.OV0
            r3.<init>(r8)
            java.util.Map r0 = X.AnonymousClass9HX.A00()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x0168:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01af
            java.lang.Object r8 = r9.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r0 = r8.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Boolean r2 = r3.A01(r7, r0)
            if (r2 == 0) goto L_0x0168
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r0 = r8.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            boolean r0 = r2.booleanValue()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.append(r0)
            goto L_0x0168
        L_0x01af:
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x014a
            java.lang.String r0 = r4.toString()
            goto L_0x0147
        L_0x01ba:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7TI.B3T():java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r3 != 62) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.0jB E4x() {
        /*
            r8 = this;
            X.0jB r2 = new X.0jB
            r2.<init>()
            X.7Zg r0 = r8.A08
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "clientInfra"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0013:
            X.7S7 r7 = r0.C6l()
            boolean r0 = r7.CUO()
            r4 = 1
            r0 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "canonical"
            java.util.Map r3 = r2.A00
            r3.put(r0, r1)
            X.3tH r0 = r8.A0v
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "transport_type"
            r2.A0A(r0, r1)
            X.3sy r1 = A03(r8)
            boolean r0 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L_0x0047
            com.instagram.model.direct.threadkey.impl.MsysThreadId r1 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r1
            long r5 = r1.A00
            java.lang.String r1 = "chat_device_seq_no"
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r3.put(r1, r0)
        L_0x0047:
            com.instagram.model.direct.DirectThreadKey r5 = r8.A0N()
            boolean r0 = r7.CUO()
            if (r0 == 0) goto L_0x006f
            if (r5 == 0) goto L_0x006f
            X.7SD r0 = r7.C6Q()
            int r3 = r0.A08
            r0 = 28
            java.lang.String r1 = "thread_id"
            if (r3 == r0) goto L_0x008f
            r0 = 29
            if (r3 == r0) goto L_0x0070
            r0 = 32
            if (r3 == r0) goto L_0x0097
            r0 = 61
            if (r3 == r0) goto L_0x008f
            r0 = 62
            if (r3 == r0) goto L_0x0097
        L_0x006f:
            return r2
        L_0x0070:
            java.lang.String r0 = r5.A00
            r2.A0A(r1, r0)
            java.lang.String r0 = "is_broadcast_chat"
            r2.A09(r0, r4)
            X.7SD r0 = r7.C6Q()
            boolean r1 = r0.A0n
            java.lang.String r0 = "add_to_inbox"
            r2.A09(r0, r1)
            int r1 = r7.AdN()
            java.lang.String r0 = "audience_type"
            r2.A09(r0, r1)
            return r2
        L_0x008f:
            java.lang.String r0 = r5.A00
            r2.A0A(r1, r0)
            java.lang.String r0 = "is_csc_chat"
            goto L_0x009e
        L_0x0097:
            java.lang.String r0 = r5.A00
            r2.A0A(r1, r0)
            java.lang.String r0 = "is_discoverable_chat"
        L_0x009e:
            r2.A09(r0, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7TI.E4x():X.0jB");
    }

    public final boolean Es6(String str) {
        C333517Zg r0 = this.A08;
        if (r0 == null) {
            0qQ.A0F("clientInfra");
            throw AnonymousClass00P.createAndThrow();
        } else if (str.equals(r0.C6l().C6C()) || str.equals(this.A0F)) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A0d, 36320266385039501L) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(X.AnonymousClass7TI r6, X.AnonymousClass7S7 r7) {
        /*
            X.7SD r0 = r7.C6Q()
            int r1 = r0.A08
            r4 = 1
            java.lang.String r5 = "clientInfra"
            r0 = 29
            if (r1 == r0) goto L_0x001c
            com.instagram.common.session.UserSession r3 = r6.A0d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320266385039501(0x8109170007208d, double:3.032420939648318E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002a
        L_0x001c:
            X.7Zg r0 = r6.A08
            if (r0 == 0) goto L_0x0061
            X.7ZY r0 = r0.BSN()
            r0.Ehm(r4)
            r0.DbV()
        L_0x002a:
            com.instagram.common.session.UserSession r3 = r6.A0d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324677316128989(0x810d1a000230dd, double:3.035210430230704E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0047
            X.7Zg r0 = r6.A08
            if (r0 == 0) goto L_0x0061
            X.7ZY r0 = r0.BSN()
            r0.EdY(r4)
            r0.DRh()
        L_0x0047:
            r0 = 36318058773419842(0x810715001f1742, double:3.031024837170707E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0060
            X.7Zg r0 = r6.A08
            if (r0 == 0) goto L_0x0061
            X.7ZY r0 = r0.BSN()
            r0.EcA(r4)
            r0.DNe()
        L_0x0060:
            return
        L_0x0061:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7TI.A09(X.7TI, X.7S7):void");
    }

    public final void E28(boolean z) {
        this.A0Q = z;
    }

    /* JADX WARNING: type inference failed for: r0v52, types: [X.0sa, X.7TZ] */
    /* JADX WARNING: type inference failed for: r91v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r92v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r93v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r94v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r95v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r96v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r98v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r99v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r100v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r51v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r52v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r105v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r106v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r108v0, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r1v16, types: [X.7Wd, X.0sa] */
    /* JADX WARNING: type inference failed for: r70v1, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r13v4, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r15v2, types: [X.0sa] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0487, code lost:
        if (X.2El.A0B(r1.A06) == false) goto L_0x0489;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7TI(X.C249453jo r123, X.AnonymousClass4DH r124, X.AnonymousClass3E6 r125, X.AnonymousClass7TD r126, X.AnonymousClass54L r127, X.C331757Sg r128, X.AnonymousClass7SU r129, X.AnonymousClass7SQ r130, X.AnonymousClass7SM r131, X.C331747Sf r132, X.AnonymousClass9H7 r133, X.AnonymousClass9H7 r134, X.AnonymousClass9H7 r135, X.AnonymousClass9H6 r136, X.C331787Sj r137, X.AnonymousClass7SE r138, X.AnonymousClass7SG r139, X.AnonymousClass9HO r140, X.AnonymousClass7ST r141, X.AnonymousClass9HC r142, X.AnonymousClass9HS r143, X.C331617Rr r144, X.AnonymousClass9H3 r145, X.AnonymousClass4DU r146, X.C273434mZ r147, java.lang.String r148, boolean r149) {
        /*
            r122 = this;
            r43 = 2
            r20 = r126
            r1 = r20
            r0 = r43
            X.0qQ.A0B(r1, r0)
            r11 = 3
            r89 = r146
            r0 = r89
            X.0qQ.A0B(r0, r11)
            r1 = 4
            r114 = r144
            r0 = r114
            X.0qQ.A0B(r0, r1)
            r1 = 5
            r116 = r142
            r0 = r116
            X.0qQ.A0B(r0, r1)
            r1 = 7
            r87 = r131
            r0 = r87
            X.0qQ.A0B(r0, r1)
            r0 = 8
            r2 = r130
            X.0qQ.A0B(r2, r0)
            r1 = 9
            r120 = r132
            r0 = r120
            X.0qQ.A0B(r0, r1)
            r0 = 11
            r1 = r141
            X.0qQ.A0B(r1, r0)
            r3 = 13
            r19 = r129
            r0 = r19
            X.0qQ.A0B(r0, r3)
            r0 = 18
            r7 = r138
            X.0qQ.A0B(r7, r0)
            r3 = 20
            r115 = r143
            r0 = r115
            X.0qQ.A0B(r0, r3)
            r3 = 21
            r113 = r145
            r0 = r113
            X.0qQ.A0B(r0, r3)
            r3 = 23
            r121 = r128
            r0 = r121
            X.0qQ.A0B(r0, r3)
            r3 = 27
            r117 = r140
            r0 = r117
            X.0qQ.A0B(r0, r3)
            r5 = r122
            r5.<init>()
            r82 = r124
            r0 = r82
            r5.A0U = r0
            r0 = r20
            r5.A0l = r0
            r0 = r89
            r5.A0y = r0
            r0 = r114
            r5.A1F = r0
            r0 = r116
            r5.A0u = r0
            r119 = r137
            r0 = r119
            r5.A1B = r0
            r0 = r87
            r5.A0n = r0
            r5.A0m = r2
            r0 = r120
            r5.A0o = r0
            r5.A0s = r1
            r18 = r134
            r0 = r18
            r5.A19 = r0
            r0 = r135
            r5.A1A = r0
            r5.A1C = r7
            r118 = r139
            r0 = r118
            r5.A1D = r0
            r0 = r115
            r5.A0w = r0
            r0 = r113
            r5.A0x = r0
            r0 = r121
            r5.A18 = r0
            r0 = r125
            r5.A0e = r0
            r0 = r148
            r5.A11 = r0
            r0 = r117
            r5.A0r = r0
            java.lang.String r1 = "DirectThreadController.init"
            r0 = 1468356595(0x578557f3, float:2.93225571E14)
            X.0fS.A01(r1, r0)
            r0 = r82
            r5.A0V = r0
            X.08y r17 = X.09i.A0A
            android.os.Bundle r1 = r82.requireArguments()
            r0 = r17
            com.instagram.common.session.UserSession r4 = r0.A06(r1)
            r5.A0d = r4
            r0 = r82
            X.0wc r42 = X.AnonymousClass0kN.A01(r0, r4)
            r0 = r42
            r5.A0W = r0
            X.7TN r0 = X.AnonymousClass7TM.A00(r4)
            r5.A0T = r0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r41 = new android.os.Handler
            r0 = r41
            r0.<init>(r1)
            r5.A0S = r0
            X.7TO r40 = new X.7TO
            r40.<init>()
            r0 = r40
            r5.A0q = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r5.A0P = r0
            r39 = 0
            X.1a8 r38 = new X.1a8
            r1 = r38
            r0 = r39
            r1.<init>(r0)
            r5.A0b = r1
            X.4fh r1 = X.C318146oT.A01
            X.1a8 r37 = new X.1a8
            r0 = r37
            r0.<init>(r1)
            r5.A0c = r0
            r1 = -1
            r5.A02 = r1
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.A0I = r0
            X.7TP r36 = new X.7TP
            r36.<init>()
            r0 = r36
            r5.A1E = r0
            X.7TR r35 = new X.7TR
            r0 = r35
            r0.<init>(r5)
            r5.A0h = r0
            X.7TS r34 = new X.7TS
            r0 = r34
            r0.<init>(r5)
            r5.A17 = r0
            X.7TT r0 = new X.7TT
            r0.<init>(r5)
            r5.A0g = r0
            X.7TU r0 = new X.7TU
            r0.<init>(r5)
            r5.A0Y = r0
            X.7TV r0 = new X.7TV
            r0.<init>(r5)
            r5.A0Z = r0
            X.7TW r0 = new X.7TW
            r0.<init>(r5)
            r5.A10 = r0
            X.7TX r0 = new X.7TX
            r0.<init>(r5)
            r5.A0X = r0
            X.7TY r0 = new X.7TY
            r0.<init>(r5)
            r5.A0a = r0
            X.7TZ r0 = new X.7TZ
            r0.<init>(r5)
            X.7Ta r2 = new X.7Ta
            r2.<init>(r0)
            r0 = r82
            r7.A00 = r0
            r0 = r89
            r7.A01 = r0
            r7.A05 = r2
            android.os.Bundle r3 = r82.requireArguments()
            java.lang.String r2 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID"
            r33 = 0
            r0 = r33
            int r32 = r3.getInt(r2, r0)
            r0 = r32
            r5.A0R = r0
            java.lang.String r2 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_LINKED_OPEN_THREAD_ID"
            r0 = r39
            java.lang.String r0 = r3.getString(r2, r0)
            r5.A0F = r0
            java.lang.String r2 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SKIP_ENTER_THREAD_LOGGING"
            r0 = r33
            boolean r31 = r3.getBoolean(r2, r0)
            r0 = r31
            r5.A15 = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_THREAD_POSITION"
            int r111 = r3.getInt(r0, r1)
            X.3t2 r0 = X.AnonymousClass9H9.A00(r3)
            X.3tH r30 = X.AnonymousClass6W3.A00(r0)
            r0 = r30
            r5.A0v = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ORIGIN_FILTER"
            java.lang.String r103 = r3.getString(r0)
            java.lang.String r0 = "DirectFragment.ENTRY_POINT"
            java.lang.String r29 = r3.getString(r0)
            if (r29 == 0) goto L_0x0567
            r0 = r29
            r5.A12 = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_ID"
            java.lang.String r104 = r3.getString(r0)
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CHALLENGE_ID"
            java.lang.String r0 = r3.getString(r0)
            r5.A14 = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SCROLL_TO_MESSAGE_ID"
            java.lang.String r0 = r3.getString(r0)
            r5.A13 = r0
            X.7Tb r16 = new X.7Tb
            r0 = r16
            r0.<init>(r5)
            X.7Tc r15 = new X.7Tc
            r15.<init>(r5)
            X.7Td r14 = new X.7Td
            r14.<init>(r5)
            X.7Te r13 = new X.7Te
            r13.<init>(r5)
            X.7Tf r12 = new X.7Tf
            r12.<init>(r5)
            X.7Tg r10 = new X.7Tg
            r10.<init>(r5)
            X.7Th r9 = new X.7Th
            r9.<init>(r5)
            X.7Ti r8 = new X.7Ti
            r8.<init>(r5)
            X.7Tj r6 = new X.7Tj
            r6.<init>(r5)
            X.7Tk r2 = new X.7Tk
            r2.<init>(r5)
            X.7Tl r1 = new X.7Tl
            r1.<init>(r5)
            X.7Tm r0 = new X.7Tm
            r0.<init>(r5)
            X.7Tn r80 = new X.7Tn
            r81 = r3
            r83 = r82
            r84 = r42
            r85 = r4
            r86 = r19
            r88 = r30
            r90 = r29
            r91 = r16
            r92 = r15
            r93 = r14
            r94 = r13
            r95 = r12
            r96 = r10
            r97 = r9
            r98 = r8
            r99 = r6
            r100 = r2
            r101 = r1
            r102 = r0
            r80.<init>(r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102)
            X.9Lc r14 = new X.9Lc
            r0 = r33
            r14.<init>(r5, r0)
            X.9Lc r13 = new X.9Lc
            r13.<init>(r5, r11)
            X.7To r12 = new X.7To
            r12.<init>(r5)
            X.7Tp r11 = new X.7Tp
            r11.<init>(r5)
            X.7Tq r10 = new X.7Tq
            r10.<init>(r5)
            X.7Tr r9 = new X.7Tr
            r9.<init>(r5)
            X.7Ts r8 = new X.7Ts
            r8.<init>(r5)
            X.7Tt r6 = new X.7Tt
            r6.<init>(r5)
            X.7Tu r1 = new X.7Tu
            r1.<init>(r5)
            X.7Tv r0 = new X.7Tv
            r0.<init>(r5)
            X.7Tw r2 = new X.7Tw
            r45 = r123
            r44 = r2
            r46 = r80
            r47 = r115
            r48 = r113
            r49 = r14
            r50 = r13
            r51 = r12
            r52 = r11
            r53 = r10
            r54 = r9
            r55 = r8
            r56 = r6
            r57 = r1
            r58 = r0
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r5.A0j = r2
            X.7Ua r10 = new X.7Ua
            r10.<init>(r5)
            X.7Ub r9 = new X.7Ub
            r9.<init>(r5)
            r0 = 42
            X.9L0 r8 = new X.9L0
            r8.<init>(r5, r0)
            X.7Uc r1 = new X.7Uc
            r1.<init>(r5)
            X.7Ud r0 = new X.7Ud
            r0.<init>(r5)
            X.7Ue r6 = new X.7Ue
            r99 = r133
            r112 = r149
            r90 = r6
            r91 = r41
            r92 = r38
            r93 = r37
            r94 = r80
            r95 = r2
            r96 = r20
            r97 = r120
            r98 = r18
            r100 = r7
            r101 = r118
            r102 = r114
            r105 = r10
            r106 = r9
            r107 = r8
            r108 = r1
            r109 = r0
            r110 = r32
            r90.<init>(r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112)
            r5.A0i = r6
            r9 = 1
            X.7WZ r10 = new X.7WZ
            r0 = r82
            r10.<init>(r0, r4, r6)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36328242139249788(0x81105800063c7c, double:3.037464838726688E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r0 == 0) goto L_0x03be
            X.AcO r0 = new X.AcO
            r0.<init>(r10)
        L_0x0314:
            X.7Wa r0 = (X.C332697Wa) r0
            r5.A0p = r0
            X.7Wb r28 = new X.7Wb
            r0 = r28
            r0.<init>(r5)
            X.7Wc r27 = new X.7Wc
            r0 = r27
            r0.<init>(r5)
            X.7Wd r1 = new X.7Wd
            r1.<init>(r5)
            X.7Ta r26 = new X.7Ta
            r0 = r26
            r0.<init>(r1)
            X.7We r25 = new X.7We
            r0 = r25
            r0.<init>(r5)
            X.7Wf r24 = new X.7Wf
            r0 = r24
            r0.<init>(r5)
            r1 = 43
            X.9L0 r23 = new X.9L0
            r0 = r23
            r0.<init>(r5, r1)
            r1 = 44
            X.9L0 r22 = new X.9L0
            r0 = r22
            r0.<init>(r5, r1)
            r1 = 45
            X.9L0 r21 = new X.9L0
            r0 = r21
            r0.<init>(r5, r1)
            r1 = 46
            X.9L0 r20 = new X.9L0
            r0 = r20
            r0.<init>(r5, r1)
            r1 = 47
            X.9L0 r19 = new X.9L0
            r0 = r19
            r0.<init>(r5, r1)
            r1 = 48
            X.9L0 r18 = new X.9L0
            r0 = r18
            r0.<init>(r5, r1)
            r0 = 49
            X.9L0 r15 = new X.9L0
            r15.<init>(r5, r0)
            r0 = r17
            com.instagram.common.session.UserSession r0 = r0.A06(r3)
            X.2Dm r14 = X.2L2.A00(r0)
            X.7Wg r12 = new X.7Wg
            r12.<init>(r5)
            X.7Wi r11 = new X.7Wi
            r11.<init>(r5)
            X.9Lc r10 = new X.9Lc
            r10.<init>(r5, r9)
            X.7Wj r9 = new X.7Wj
            r9.<init>(r5)
            X.9Lc r1 = new X.9Lc
            r0 = r43
            r1.<init>(r5, r0)
            r13 = 7
            r0 = r30
            X.0qQ.A0B(r0, r13)
            r0 = 28
            X.0qQ.A0B(r14, r0)
            r16 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x03c1
            r13 = -2023758821(0xffffffff875fe41b, float:-1.684369E-34)
            java.lang.String r0 = "IgDirectItemEnvironmentFactory.create"
            X.0fS.A01(r0, r13)
            goto L_0x03c1
        L_0x03be:
            r0 = r10
            goto L_0x0314
        L_0x03c1:
            X.7Wk r43 = new X.7Wk     // Catch:{ all -> 0x054e }
            r52 = r127
            r0 = r136
            r62 = r147
            r49 = r5
            r50 = r6
            r51 = r2
            r53 = r87
            r54 = r0
            r55 = r40
            r56 = r7
            r57 = r12
            r58 = r36
            r59 = r30
            r60 = r14
            r61 = r89
            r63 = r26
            r64 = r28
            r65 = r25
            r66 = r24
            r67 = r27
            r68 = r1
            r69 = r10
            r70 = r9
            r71 = r19
            r72 = r18
            r73 = r23
            r74 = r15
            r75 = r22
            r76 = r21
            r77 = r20
            r78 = r11
            r79 = r32
            r44 = r41
            r46 = r82
            r47 = r89
            r48 = r42
            r43.<init>(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79)     // Catch:{ all -> 0x054e }
            boolean r1 = r0.A04     // Catch:{ all -> 0x054e }
            if (r1 == 0) goto L_0x041c
            X.0t0 r0 = X.AnonymousClass0eN.A01(r43)     // Catch:{ all -> 0x054e }
        L_0x0416:
            X.7Wl r9 = new X.7Wl     // Catch:{ all -> 0x054e }
            r9.<init>(r0)     // Catch:{ all -> 0x054e }
            goto L_0x0438
        L_0x041c:
            com.instagram.common.session.UserSession r7 = r0.A01     // Catch:{ all -> 0x054e }
            r0 = 36328242139380862(0x81105800083c7e, double:3.0374648388095795E-306)
            boolean r0 = X.182.A06(r8, r7, r0)     // Catch:{ all -> 0x054e }
            if (r0 == 0) goto L_0x042e
            X.0eM r0 = X.AnonymousClass1YB.A00(r43)     // Catch:{ all -> 0x054e }
            goto L_0x0416
        L_0x042e:
            java.lang.Object r1 = r43.invoke()     // Catch:{ all -> 0x054e }
            X.1Ue r0 = new X.1Ue     // Catch:{ all -> 0x054e }
            r0.<init>(r1)     // Catch:{ all -> 0x054e }
            goto L_0x0416
        L_0x0438:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0444
            r0 = -1372846604(0xffffffffae2c05f4, float:-3.911356E-11)
            X.0fS.A00(r0)
        L_0x0444:
            r5.A0t = r9
            java.lang.Class<X.7Wl> r0 = X.C332807Wl.class
            r4.A04(r0, r9)
            android.os.Bundle r7 = r82.requireArguments()
            java.lang.String r1 = "DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET"
            r0 = r33
            boolean r0 = r7.getBoolean(r1, r0)
            r5.A0L = r0
            X.7YR r7 = new X.7YR
            r7.<init>(r5)
            X.7YS r8 = new X.7YS
            r1 = r115
            r0 = r113
            r8.<init>(r1, r0, r7)
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0475
            r1 = 2078854239(0x7be8cc5f, float:2.417516E36)
            java.lang.String r0 = "ClientInfraInitializer"
            X.0fS.A01(r0, r1)
        L_0x0475:
            X.7UW r1 = r2.A0C     // Catch:{ all -> 0x0559 }
            android.content.Context r0 = X.C60960kU.A00     // Catch:{ all -> 0x0559 }
            boolean r0 = X.0oI.A0C(r0)     // Catch:{ all -> 0x0559 }
            if (r0 == 0) goto L_0x0489
            com.instagram.common.session.UserSession r0 = r1.A06     // Catch:{ all -> 0x0559 }
            boolean r0 = X.2El.A0B(r0)     // Catch:{ all -> 0x0559 }
            r71 = 1
            if (r0 != 0) goto L_0x048b
        L_0x0489:
            r71 = 0
        L_0x048b:
            X.7UL r13 = r2.A0N     // Catch:{ all -> 0x0559 }
            X.7US r12 = r2.A0B     // Catch:{ all -> 0x0559 }
            X.7YU r55 = X.AnonymousClass7YT.A00(r4)     // Catch:{ all -> 0x0559 }
            X.7YV r7 = new X.7YV     // Catch:{ all -> 0x0559 }
            r7.<init>(r6)     // Catch:{ all -> 0x0559 }
            java.lang.String r11 = r5.A0F     // Catch:{ all -> 0x0559 }
            boolean r0 = r5.A0L     // Catch:{ all -> 0x0559 }
            r72 = 0
            if (r0 != 0) goto L_0x04a2
            r72 = 1
        L_0x04a2:
            X.7YW r10 = new X.7YW     // Catch:{ all -> 0x0559 }
            r10.<init>(r5)     // Catch:{ all -> 0x0559 }
            X.7YX r6 = new X.7YX     // Catch:{ all -> 0x0559 }
            r6.<init>(r5)     // Catch:{ all -> 0x0559 }
            X.7YY r1 = new X.7YY     // Catch:{ all -> 0x0559 }
            r1.<init>(r5)     // Catch:{ all -> 0x0559 }
            X.7YZ r0 = new X.7YZ     // Catch:{ all -> 0x0559 }
            r42 = r0
            r43 = r41
            r44 = r82
            r45 = r38
            r46 = r37
            r47 = r4
            r48 = r12
            r49 = r6
            r50 = r34
            r51 = r35
            r52 = r121
            r53 = r13
            r54 = r119
            r56 = r40
            r57 = r118
            r58 = r117
            r59 = r9
            r60 = r116
            r61 = r30
            r62 = r115
            r63 = r114
            r64 = r8
            r65 = r89
            r66 = r10
            r67 = r1
            r68 = r29
            r69 = r11
            r70 = r7
            r73 = r72
            r74 = r31
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74)     // Catch:{ all -> 0x0559 }
            boolean r1 = com.facebook.systrace.Systrace.A0E(r16)
            if (r1 == 0) goto L_0x04fe
            r1 = 894632062(0x3553007e, float:7.860434E-7)
            X.0fS.A00(r1)
        L_0x04fe:
            r5.A16 = r0
            if (r149 == 0) goto L_0x054c
            X.3t2 r0 = X.AnonymousClass9H9.A00(r3)
            X.9HR r0 = X.AnonymousClass6W3.A04(r0)
            if (r0 != 0) goto L_0x054c
            r0 = r39
            X.7Ya r0 = A00(r3, r0, r5)
        L_0x0512:
            r5.A0f = r0
            X.7Yb r6 = new X.7Yb
            r6.<init>(r5)
            X.7Yc r4 = new X.7Yc
            r4.<init>(r5)
            X.7Yd r3 = new X.7Yd
            r3.<init>(r5)
            X.7Ye r1 = new X.7Ye
            r1.<init>(r5)
            X.7Yf r0 = new X.7Yf
            r7 = r0
            r8 = r80
            r9 = r2
            r10 = r87
            r11 = r120
            r12 = r36
            r13 = r6
            r14 = r4
            r15 = r3
            r16 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5.A0k = r0
            r0 = 735278422(0x2bd37556, float:1.5025019E-12)
            X.0fS.A00(r0)
            X.7Yu r0 = new X.7Yu
            r0.<init>(r5)
            r5.A0z = r0
            return
        L_0x054c:
            r0 = 0
            goto L_0x0512
        L_0x054e:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0566
            r0 = 564710630(0x21a8cce6, float:1.1438359E-18)
            goto L_0x0563
        L_0x0559:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0566
            r0 = 2125796025(0x7eb512b9, float:1.2034374E38)
        L_0x0563:
            X.0fS.A00(r0)
        L_0x0566:
            throw r1
        L_0x0567:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7TI.<init>(X.3jo, X.4DH, X.3E6, X.7TD, X.54L, X.7Sg, X.7SU, X.7SQ, X.7SM, X.7Sf, X.9H7, X.9H7, X.9H7, X.9H6, X.7Sj, X.7SE, X.7SG, X.9HO, X.7ST, X.9HC, X.9HS, X.7Rr, X.9H3, X.4DU, X.4mZ, java.lang.String, boolean):void");
    }
}
