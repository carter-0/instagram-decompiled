package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.reels.interactive.view.AvatarView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.WUb  reason: case insensitive filesystem */
public final class C19319WUb implements B21, C74461PvG {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public EditText A05;
    public ImageUrl A06;
    public IgTextView A07;
    public IgTextView A08;
    public ChatStickerChannelType A09;
    public C19469WaH A0A;
    public AvatarView A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public C331157Pu A0G;
    public final Context A0H;
    public final View.OnFocusChangeListener A0I;
    public final FragmentActivity A0J;
    public final UserSession A0K;
    public final X9K A0L;
    public final AnonymousClass80U A0M;
    public final AnonymousClass8MF A0N;
    public final C16291Us3 A0O = new C16291Us3(this, 0);
    public final AnonymousClass8Z3 A0P = new C19731WeY(this, 1);
    public final AnonymousClass0eM A0Q;
    public final AnonymousClass0eM A0R;
    public final AnonymousClass0eM A0S;
    public final boolean A0T;
    public final C354538Mk A0U;
    public final C16291Us3 A0V = new C16291Us3(this, 1);
    public final String A0W;

    public C19319WUb(View view, FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass3E6 r6, C354538Mk r7, X9K x9k, AnonymousClass80U r9, AnonymousClass8MF r10, String str) {
        boolean z;
        Boolean BBw;
        0qQ.A0B(r7, 7);
        this.A0W = str;
        this.A0J = fragmentActivity;
        this.A0K = userSession;
        this.A0M = r9;
        this.A0N = r10;
        this.A0L = x9k;
        this.A0U = r7;
        this.A0H = view.getContext();
        this.A0R = AnonymousClass0eN.A01(new C66300MMj(view, 25));
        this.A0S = AnonymousClass0eN.A01(new MJ9(14, r6, this));
        this.A0I = new WBI(this, 3);
        this.A0Q = AnonymousClass0eN.A01(C20646Wwe.A00);
        this.A0E = "";
        this.A0D = "";
        C242043Sk BcS = DbT.A0j(userSession).A03.BcS();
        if (BcS == null || (BBw = BcS.BBw()) == null) {
            z = false;
        } else {
            z = BBw.booleanValue();
        }
        this.A0T = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ee, code lost:
        if (r0 == null) goto L_0x01f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DCS(java.lang.Object r14) {
        /*
            r13 = this;
            r5 = 0
            X.0qQ.A0B(r14, r5)
            boolean r3 = r14 instanceof X.AnonymousClass8UD
            r2 = 0
            if (r3 == 0) goto L_0x0165
            r0 = r14
            X.8UD r0 = (X.AnonymousClass8UD) r0
            X.WaH r2 = r0.A00
        L_0x000e:
            r13.A0A = r2
            if (r3 == 0) goto L_0x0018
            X.8UD r14 = (X.AnonymousClass8UD) r14
            boolean r0 = r14.A01
            r13.A0F = r0
        L_0x0018:
            X.X9K r6 = r13.A0L
            X.3oV r0 = r6.Bzc()
            boolean r0 = r0.CVM()
            if (r0 != 0) goto L_0x01e1
            X.3oV r0 = r6.Bzc()
            android.view.View r1 = r0.getView()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r13.A04 = r1
            java.lang.String r2 = "stickerEditorContainer"
            if (r1 == 0) goto L_0x021a
            r0 = 2131429859(0x7f0b09e3, float:1.8481403E38)
            android.view.View r1 = r1.requireViewById(r0)
            X.WBy r0 = X.C18905WBy.A00
            r1.setOnTouchListener(r0)
            r13.A03 = r1
            android.view.ViewGroup r1 = r13.A04
            if (r1 == 0) goto L_0x021a
            r0 = 2131429853(0x7f0b09dd, float:1.848139E38)
            android.view.View r0 = r1.requireViewById(r0)
            r13.A02 = r0
            X.0eM r0 = r13.A0S
            java.lang.Object r1 = r0.getValue()
            X.87F r1 = (X.AnonymousClass87F) r1
            android.view.ViewGroup r0 = r13.A04
            if (r0 == 0) goto L_0x021a
            r1.A03(r0)
            r10 = 1
            X.8Z5 r0 = r1.A03
            r0.A04 = r10
            r0.A03 = r10
            android.view.ViewGroup r1 = r13.A04
            if (r1 == 0) goto L_0x021a
            r0 = 2131429848(0x7f0b09d8, float:1.848138E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.reels.interactive.view.AvatarView r0 = (com.instagram.reels.interactive.view.AvatarView) r0
            r13.A0B = r0
            X.WaH r0 = r13.A0A
            if (r0 == 0) goto L_0x0157
            X.UOB r0 = r0.A00
            java.lang.String r0 = r0.A0G
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
        L_0x0081:
            r13.A06 = r1
            com.instagram.reels.interactive.view.AvatarView r0 = r13.A0B
            java.lang.String r2 = "avatarView"
            if (r0 == 0) goto L_0x021a
            r0.setAvatarUrl(r1)
            com.instagram.reels.interactive.view.AvatarView r1 = r13.A0B
            if (r1 == 0) goto L_0x021a
            android.content.Context r4 = r13.A0H
            int r0 = X.AnonymousClass7TG.A04(r4)
            r1.setStrokeWidth(r0)
            android.view.View r0 = r13.A03
            if (r0 == 0) goto L_0x0231
            r6.AeF(r4, r0)
            android.view.View r1 = r13.A03
            if (r1 == 0) goto L_0x0231
            r0 = 2131429854(0x7f0b09de, float:1.8481392E38)
            android.view.View r7 = r1.requireViewById(r0)
            r3 = r7
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.view.View$OnFocusChangeListener r0 = r13.A0I
            r3.setOnFocusChangeListener(r0)
            android.text.InputFilter[] r8 = r3.getFilters()
            X.0qQ.A07(r8)
            r0 = 100
            android.text.InputFilter$LengthFilter r2 = new android.text.InputFilter$LengthFilter
            r2.<init>(r0)
            int r1 = r8.length
            int r0 = r1 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r8, r0)
            r0[r1] = r2
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            r3.setFilters(r0)
            r1 = 8
            X.W7b r0 = new X.W7b
            r0.<init>(r13, r1)
            r3.addTextChangedListener(r0)
            r1 = 3
            X.WBP r0 = new X.WBP
            r0.<init>(r3, r1)
            r3.setOnKeyListener(r0)
            android.widget.EditText r7 = (android.widget.EditText) r7
            r13.A05 = r7
            com.instagram.common.session.UserSession r3 = r13.A0K
            android.view.View r0 = r13.A03
            if (r0 == 0) goto L_0x0231
            com.instagram.common.ui.base.IgTextView r0 = r6.C2g(r4, r0, r3)
            r13.A08 = r0
            android.view.View r1 = r13.A03
            if (r1 == 0) goto L_0x0231
            r0 = 2131429856(0x7f0b09e0, float:1.8481397E38)
            android.widget.TextView r7 = X.DbU.A0G(r1, r0)
            boolean r0 = r6.Bul()
            if (r0 == 0) goto L_0x01bd
            boolean r0 = r13.A0T
            if (r0 == 0) goto L_0x01bd
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314936330226593(0x81043e00010ba1, double:3.029050191522227E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01bd
            X.0qQ.A0A(r7)
            X.3NG r1 = new X.3NG
            r1.<init>(r7)
            android.view.View[] r0 = new android.view.View[]{r7}
            r1.A02(r0)
            r11 = 2
            X.C15848UjY.A00(r1, r13, r11)
            X.2eS.A01(r7)
            android.content.Context r12 = X.AnonymousClass7TE.A0S(r7)
            r0 = 2131955079(0x7f130d87, float:1.9546675E38)
            java.lang.String r1 = r12.getString(r0)
            r0 = 32
            java.lang.String r0 = X.002.A0C(r1, r0)
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r0)
            boolean r0 = X.0mk.A02(r12)
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0179
            r0 = 2131238078(0x7f081cbe, float:1.8092425E38)
            android.graphics.drawable.Drawable r0 = r12.getDrawable(r0)
            if (r0 != 0) goto L_0x0188
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0157:
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r13.A0K
            com.instagram.user.model.User r0 = r1.A01(r0)
            com.instagram.common.typedurl.ImageUrl r1 = r0.Bh3()
            goto L_0x0081
        L_0x0165:
            boolean r0 = r14 instanceof X.AnonymousClass8UE
            if (r0 == 0) goto L_0x0170
            r0 = r14
            X.8UE r0 = (X.AnonymousClass8UE) r0
            X.WaH r2 = r0.A00
            goto L_0x000e
        L_0x0170:
            java.lang.String r1 = "ChatStickerEditorController"
            java.lang.String r0 = "Unsupported QuickCaptureEvent for ChatStickerEditorController"
            X.0kD.A0E(r1, r0, r2)
            goto L_0x000e
        L_0x0179:
            r0 = 2131238089(0x7f081cc9, float:1.8092447E38)
            android.graphics.drawable.Drawable r0 = r12.getDrawable(r0)
            if (r0 != 0) goto L_0x0188
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0188:
            android.graphics.drawable.Drawable r8 = r0.mutate()
            int r1 = X.AnonymousClass7TE.A09(r12)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r8.setColorFilter(r1, r0)
            X.AnonymousClass7TG.A13(r8)
            int r2 = X.AnonymousClass7TG.A03(r12)
            boolean r0 = X.0mk.A02(r12)
            if (r0 == 0) goto L_0x0234
            char r0 = r9.charAt(r5)
            byte r1 = java.lang.Character.getDirectionality(r0)
            if (r1 == r10) goto L_0x0234
            if (r1 == r11) goto L_0x0234
            r0 = 16
            if (r1 == r0) goto L_0x0234
            r0 = 17
            if (r1 == r0) goto L_0x0234
            r0 = 0
        L_0x01b7:
            X.C263324Kh.A02(r8, r9, r0, r2, r5)
            r7.setText(r9)
        L_0x01bd:
            android.view.View r1 = r13.A03
            if (r1 == 0) goto L_0x0231
            r0 = 2131429850(0x7f0b09da, float:1.8481384E38)
            android.view.View r2 = r1.requireViewById(r0)
            r1 = r2
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = X.C17030VFe.A00(r3)
            r1.setText(r0)
            X.0qQ.A07(r2)
            X.0eM r0 = r13.A0R
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            com.instagram.common.ui.base.IgTextView r0 = r6.B0i(r4, r0, r3)
            r13.A07 = r0
        L_0x01e1:
            X.WaH r2 = r13.A0A
            java.lang.String r1 = ""
            if (r2 == 0) goto L_0x01f0
            X.UOB r0 = r2.A00
            java.lang.String r0 = r0.A0M
            if (r0 != 0) goto L_0x01ee
            r0 = r1
        L_0x01ee:
            if (r0 != 0) goto L_0x01f1
        L_0x01f0:
            r0 = r1
        L_0x01f1:
            r13.A0E = r0
            if (r2 == 0) goto L_0x01fc
            java.lang.String r0 = r2.A02()
            if (r0 == 0) goto L_0x01fc
            r1 = r0
        L_0x01fc:
            r13.A0D = r1
            if (r2 == 0) goto L_0x022f
            int r0 = r2.A01()
        L_0x0204:
            r13.A01 = r0
            if (r2 == 0) goto L_0x0222
            X.UOB r0 = r2.A00
            java.lang.String r1 = r0.A0G
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r1)
        L_0x0211:
            r13.A06 = r0
            android.widget.EditText r1 = r13.A05
            r4 = 0
            if (r1 != 0) goto L_0x023a
            java.lang.String r2 = "chatNameView"
        L_0x021a:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0222:
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r13.A0K
            com.instagram.user.model.User r0 = r1.A01(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            goto L_0x0211
        L_0x022f:
            r0 = 0
            goto L_0x0204
        L_0x0231:
            java.lang.String r2 = "stickerView"
            goto L_0x021a
        L_0x0234:
            int r0 = r9.length()
            goto L_0x01b7
        L_0x023a:
            java.lang.String r0 = r13.A0E
            r1.setText(r0)
            com.instagram.common.session.UserSession r3 = r13.A0K
            boolean r0 = r13.A0F
            boolean r0 = r6.BJ4(r3, r0)
            r2 = 1
            if (r0 == 0) goto L_0x025f
            X.0eM r0 = r13.A0R
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            X.3oV r0 = r6.Bzc()
            android.view.View r0 = r0.getView()
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            X.C294975nL.A07(r0, r5)
        L_0x025f:
            java.lang.String r0 = r13.A0D
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 == 0) goto L_0x0274
            java.lang.String r0 = r13.A0D
            A01(r13, r0)
        L_0x026c:
            X.8Mk r1 = r13.A0U
            java.lang.String r0 = r13.A0W
            r1.DnE(r0)
            return
        L_0x0274:
            boolean r0 = X.C375489Dt.A00(r3)
            if (r0 != 0) goto L_0x02b1
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            X.EJd r4 = new X.EJd
            r4.<init>()
            X.DbU.A1D(r0, r3)
            r4.setArguments(r0)
            X.7Pr r1 = new X.7Pr
            r1.<init>(r3)
            X.DbS.A1S(r1, r5)
            r1.A1G = r2
            r0 = 1061158912(0x3f400000, float:0.75)
            r1.A03 = r0
            r1.A1O = r2
            X.7Pu r3 = r1.A00()
            X.37E r0 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r2 = r13.A0J
            X.37D r1 = r0.A01(r2)
            if (r1 == 0) goto L_0x02ad
            X.Us3 r0 = r13.A0O
            r1.A0Q(r0)
        L_0x02ad:
            r3.A02(r2, r4)
            goto L_0x026c
        L_0x02b1:
            boolean r0 = r6.Bul()
            if (r0 == 0) goto L_0x02d0
            boolean r0 = r13.A0F
            if (r0 != 0) goto L_0x02cc
            boolean r0 = r13.A0T
            if (r0 == 0) goto L_0x02d0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314936330423203(0x81043e00040ba3, double:3.029050191646564E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x02d0
        L_0x02cc:
            A01(r13, r4)
            goto L_0x026c
        L_0x02d0:
            X.0eM r0 = r13.A0S
            java.lang.Object r1 = r0.getValue()
            X.87F r1 = (X.AnonymousClass87F) r1
            android.view.View r0 = r1.A01
            r1.A02(r0)
            goto L_0x026c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19319WUb.DCS(java.lang.Object):void");
    }

    public static final void A00(C19319WUb wUb) {
        EditText editText = wUb.A05;
        if (editText != null) {
            if (editText.hasFocus()) {
                EditText editText2 = wUb.A05;
                if (editText2 != null) {
                    editText2.clearFocus();
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("chatNameView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D6l() {
        this.A0E = "";
        this.A0D = "";
        this.A01 = 0;
        this.A09 = null;
        this.A00 = 0;
        this.A0C = null;
        this.A06 = AnonymousClass0t1.A01.A01(this.A0K).Bh3();
        EditText editText = this.A05;
        if (editText == null) {
            0qQ.A0F("chatNameView");
            throw AnonymousClass00P.createAndThrow();
        }
        editText.setText(this.A0E);
        AnonymousClass37E r3 = AnonymousClass37D.A00;
        FragmentActivity fragmentActivity = this.A0J;
        AnonymousClass37D A012 = r3.A01(fragmentActivity);
        if (A012 != null) {
            A012.A0R(this.A0V);
        }
        AnonymousClass37D A013 = r3.A01(fragmentActivity);
        if (A013 != null) {
            A013.A0Q(this.A0O);
        }
        C331157Pu r0 = this.A0G;
        if (r0 != null) {
            r0.A0L((C332277Ui) null);
        }
    }

    public final void DDW() {
        long j;
        X9K x9k = this.A0L;
        if (x9k.Bzc().CVM()) {
            C294975nL.A05(new View[]{AnonymousClass7TE.A0c(this.A0R), x9k.Bzc().getView()}, true);
            A00(this);
        }
        AnonymousClass8MF r3 = this.A0N;
        new 1E9(new 1hu((UserSession) null), 6, false);
        Integer valueOf = Integer.valueOf(this.A00);
        ChatStickerChannelType chatStickerChannelType = this.A09;
        ChatStickerChannelType chatStickerChannelType2 = chatStickerChannelType;
        if (chatStickerChannelType == null) {
            chatStickerChannelType = x9k.An1();
        }
        if (chatStickerChannelType2 == null) {
            chatStickerChannelType2 = x9k.An1();
        }
        if (chatStickerChannelType2 == ChatStickerChannelType.SUBSCRIBER) {
            j = SandboxRepository.CACHE_TTL;
        } else {
            j = -1;
        }
        Long valueOf2 = Long.valueOf(j);
        String A002 = C66579MXk.A00(395);
        ImageUrl imageUrl = this.A06;
        if (imageUrl == null) {
            0qQ.A0F("avatarUrl");
            throw AnonymousClass00P.createAndThrow();
        }
        String url = imageUrl.getUrl();
        Integer valueOf3 = Integer.valueOf(this.A01);
        String str = this.A0C;
        r3.Dn8(C18234Vo1.A01(C17032VFg.A00((AiAgentMetadataDict) null, (C21040XAt) null, (StoryJoinChatStatus) null, chatStickerChannelType, ChatStickerStickerType.JOIN_CHAT_STICKER, (User) null, true, (Boolean) null, 0, valueOf, (Integer) null, valueOf3, valueOf2, (String) null, (String) null, A002, url, (String) null, str, (String) null, this.A0D, (String) null, this.A0E, (List) null)), x9k.C1J());
        this.A0A = null;
        this.A0U.Dn9(this.A0W);
    }

    public final void DH9(int i) {
        C358248ab r3 = new C358248ab((Activity) this.A0J);
        r3.A09(2131955067);
        DbY.A0w(this.A0H, r3, Integer.valueOf(C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION), 2131955066);
        r3.A0Q((DialogInterface.OnClickListener) null, C358278ae.DEFAULT, 2131968772);
        DbT.A1V(r3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C19319WUb r7, java.lang.String r8) {
        /*
            A00(r7)
            com.instagram.common.ui.base.IgTextView r0 = r7.A07
            X.AnonymousClass7TH.A0R(r0)
            X.37E r0 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r5 = r7.A0J
            X.37D r1 = r0.A01(r5)
            if (r8 == 0) goto L_0x0063
            if (r1 == 0) goto L_0x0019
            X.Us3 r0 = r7.A0V
        L_0x0016:
            r1.A0Q(r0)
        L_0x0019:
            com.instagram.common.session.UserSession r6 = r7.A0K
            X.0eM r0 = r7.A0Q
            java.lang.Object r4 = r0.getValue()
            X.KWg r4 = (X.C62030KWg) r4
            boolean r2 = r7.A0F
            r0 = 2
            X.0qQ.A0B(r4, r0)
            X.Ukx r3 = new X.Ukx
            r3.<init>()
            android.os.Bundle r1 = X.DbY.A09(r6)
            if (r8 == 0) goto L_0x003d
            r0 = 477(0x1dd, float:6.68E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putString(r0, r8)
        L_0x003d:
            java.lang.String r0 = "IS_CAMERA_DESTINATION_CLIPS_KEY"
            r1.putBoolean(r0, r2)
            r3.setArguments(r1)
            r3.A01 = r7
            r3.A00 = r4
            X.7Pr r2 = new X.7Pr
            r2.<init>(r6)
            r2.A0T = r3
            android.content.Context r1 = r7.A0H
            r0 = 2131955079(0x7f130d87, float:1.9546675E38)
            X.DbZ.A0z(r1, r2, r0)
            X.7Pu r0 = r2.A00()
            X.7Pu r0 = r0.A02(r5, r3)
            r7.A0G = r0
            return
        L_0x0063:
            if (r1 == 0) goto L_0x0019
            X.Us3 r0 = r7.A0O
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19319WUb.A01(X.WUb, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DrG(com.instagram.common.typedurl.ImageUrl r4, java.lang.String r5, java.lang.String r6, int r7, int r8, int r9) {
        /*
            r3 = this;
            X.AnonymousClass7TG.A1N(r5, r6)
            r3.A0E = r6
            r3.A0D = r5
            r3.A06 = r4
            r3.A01 = r7
            r0 = 28
            r2 = 0
            if (r8 == r0) goto L_0x0054
            r0 = 29
            if (r8 == r0) goto L_0x0051
            r0 = 32
            if (r8 == r0) goto L_0x004e
            r0 = 61
            if (r8 == r0) goto L_0x0054
            r0 = 62
            if (r8 == r0) goto L_0x004e
            java.lang.String r1 = "ChatStickerEditorController"
            java.lang.String r0 = "Unknown thread subtype passed for join chat sticker"
            X.0kD.A0E(r1, r0, r2)
        L_0x0027:
            r3.A09 = r2
            r3.A00 = r9
            java.lang.String r0 = "share_existing_channel_sheet"
            r3.A0C = r0
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r3.A0J
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x003e
            X.Us3 r0 = r3.A0O
            r1.A0R(r0)
        L_0x003e:
            X.7Pu r0 = r3.A0G
            X.DbW.A1K(r0)
            X.80U r1 = r3.A0M
            X.8UM r0 = new X.8UM
            r0.<init>()
            r1.E3H(r0)
            return
        L_0x004e:
            com.instagram.reels.chat.model.ChatStickerChannelType r2 = com.instagram.reels.chat.model.ChatStickerChannelType.DISCOVERABLE
            goto L_0x0027
        L_0x0051:
            com.instagram.reels.chat.model.ChatStickerChannelType r2 = com.instagram.reels.chat.model.ChatStickerChannelType.BROADCAST
            goto L_0x0027
        L_0x0054:
            com.instagram.reels.chat.model.ChatStickerChannelType r2 = com.instagram.reels.chat.model.ChatStickerChannelType.SUBSCRIBER
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19319WUb.DrG(com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, int, int, int):void");
    }
}
