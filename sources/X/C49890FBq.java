package X;

import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import com.instagram.model.direct.DirectIfyXma;
import com.instagram.user.model.User;

/* renamed from: X.FBq  reason: case insensitive filesystem */
public abstract class C49890FBq {
    public int A00;
    public Long A01 = null;
    public Long A02;
    public String A03 = null;
    public final int A04;
    public final 2FW A05;
    public final Object A06;
    public final String A07;
    public final String A08;

    public C49890FBq(2FW r3, Object obj, String str, int i, int i2) {
        this.A05 = r3;
        this.A06 = obj;
        this.A07 = A01(r3, obj);
        this.A08 = str;
        this.A04 = i;
        this.A00 = i2;
    }

    public static String A01(2FW r2, Object obj) {
        Long l;
        C48852ElE elE = C48852ElE.$redex_init_class;
        switch (r2.ordinal()) {
            case 15:
            case 16:
            case 17:
                return DbS.A0q(obj);
            case 19:
                return ((User) obj).A03.AaU();
            case 20:
            case 37:
            case 46:
            case 49:
                return ((1Xj) obj).getId();
            case 28:
            case 32:
                return ((C255773uh) obj).A0j;
            case 47:
                return ((EJU) obj).A02;
            case 58:
            case 59:
            case 89:
                return (String) obj;
            case 91:
                return ((C47827EIz) obj).A00;
            case 97:
            case 101:
                return ((InviteLinkShareInfo) obj).A07;
            case 98:
                return ((ChannelChallengeShareInfo) obj).Amd();
            case 102:
                return ((EJR) obj).A00;
            case 107:
                DirectIfyXma directIfyXma = ((EJB) obj).A00;
                if (directIfyXma == null || (l = directIfyXma.A02) == null) {
                    return null;
                }
                return l.toString();
            default:
                throw AnonymousClass7TE.A0w(AnonymousClass7TG.A0m(r2, "Unsupported content type: ", AnonymousClass7TE.A1A()));
        }
    }

    public final String A02() {
        if (this instanceof EK3) {
            return "user_sms";
        }
        if (this instanceof EK2) {
            return "system_share_sheet";
        }
        if (this instanceof C47843EJp) {
            return "twitter";
        }
        if (this instanceof C47842EJo) {
            return "whatsapp";
        }
        if (this instanceof C47841EJn) {
            return "barcelona";
        }
        if (this instanceof C47840EJm) {
            return "snapchat";
        }
        if (this instanceof C47839EJl) {
            return "messenger";
        }
        if (this instanceof C47844EJq) {
            return "facebook";
        }
        if (this instanceof EK4) {
            return "copy_link";
        }
        return null;
    }

    public final String A03() {
        Object obj = this.A06;
        if (obj instanceof 1Xj) {
            return DbT.A0x((1Xj) obj);
        }
        return null;
    }

    public final String A04() {
        int i;
        C48852ElE elE = C48852ElE.$redex_init_class;
        int ordinal = this.A05.ordinal();
        if (ordinal == 15) {
            i = 3795;
        } else if (ordinal == 37) {
            i = 3130;
        } else if (ordinal == 46) {
            i = 2800;
        } else if (ordinal != 28) {
            if (ordinal != 32) {
                return "direct_share_sheet";
            }
            return "live_action_sheet";
        } else if (((C255773uh) this.A06).A1J()) {
            i = 4056;
        } else {
            i = 4054;
        }
        return AnonymousClass000.A00(i);
    }

    public final String A05() {
        String AaU;
        if (this.A05 != 2FW.A0H || (AaU = ((User) this.A06).A03.AaU()) == null) {
            return null;
        }
        return 002.A0R("https://aistudio.instagram.com/ai/", AaU);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.4D6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: type inference failed for: r1v107, types: [X.FmM] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0459, code lost:
        r1.A00 = r10;
        X.1ES.A00(r8, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x05a7, code lost:
        r2 = r6.requireContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x05ab, code lost:
        X.C49118Eph.A00(r2, r4, (java.lang.String) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0668, code lost:
        if (r5 == 28) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x066c, code lost:
        if (r5 == 89) goto L_0x0693;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x066e, code lost:
        X.C22031Xty.A07(r0.A06, r0.A05, (java.lang.Long) null, r0.A08, r0.A01, r0.A07, r0.A04(), "copy_link", r0.A03(), r0.A0A, r0.A0B, r0.A0C, r0.A05(), r0.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0692, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0693, code lost:
        r3 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0695, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0697, code lost:
        r2 = r0.A05;
        X.C49947FGb.A03(r3, X.C48142EZk.COPY_LINK, r2, X.C267044ar.A01(r0.A01, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x06a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x07ca, code lost:
        X.C49899FCc.A01(r14, r8, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x08a0, code lost:
        r1.A00 = r9;
        X.1ES.A00(r14, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x08a7, code lost:
        if (r2 == 28) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x08ab, code lost:
        if (r2 == 89) goto L_0x08da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x08ad, code lost:
        r12 = r0.A05;
        r6 = r0.A07;
        r18 = r0.A04();
        r20 = r0.A03();
        r5 = r0.A09;
        r4 = r0.A0A;
        r2 = r0.A0B;
        X.C22031Xty.A07(r12, r13, (java.lang.Long) null, r0.A07, r0.A01, r6, r18, "user_sms", r20, r5, r4, r2, (java.lang.String) null, r0.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x08d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x08da, code lost:
        r2 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x08dc, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x08de, code lost:
        X.C49947FGb.A03(r2, X.C48142EZk.SMS, r13, X.C267044ar.A01(r14, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x08e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b0, code lost:
        if (((X.1Xj) r0).A0C.BAG() != null) goto L_0x01b2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r32) {
        /*
            r31 = this;
            r1 = r31
            boolean r0 = r1 instanceof X.C47849EJv
            if (r0 == 0) goto L_0x0017
            r3 = r1
            X.EJv r3 = (X.C47849EJv) r3
            X.G9Z r2 = r3.A01
            r0 = 0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r0, r0, r0, r0)
            int r0 = r3.A00
            r2.Df4(r1, r0)
        L_0x0016:
            return
        L_0x0017:
            boolean r0 = r1 instanceof X.C47853EJz
            if (r0 == 0) goto L_0x009f
            r2 = r1
            X.EJz r2 = (X.C47853EJz) r2
            X.Eto r0 = r2.A02
            X.FFv r0 = r0.A00
            androidx.fragment.app.FragmentActivity r0 = r0.A0A
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L_0x002f
            r0 = 512(0x200, float:7.175E-43)
            r1.clearFlags(r0)
        L_0x002f:
            X.2FW r5 = r2.A04
            com.instagram.common.session.UserSession r4 = r2.A01
            android.app.Activity r6 = r2.A00
            X.4DU r3 = r2.A03
            X.0wc r1 = X.AnonymousClass0kN.A01(r3, r4)
            r0 = 43
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x004e
            X.DbX.A1L(r1)
        L_0x004e:
            X.1as r0 = X.1as.A04
            X.1ap r1 = r0.A02
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0058
            X.2FW r5 = X.2FW.A1R
        L_0x0058:
            X.F3w r5 = r1.A07(r3, r4, r5)
            X.2FW r1 = r2.A05
            java.lang.Object r0 = r2.A06
            java.lang.String r0 = A01(r1, r0)
            if (r0 == 0) goto L_0x0b7d
            r5.A06(r0)
            java.lang.String r0 = r2.A05
            if (r0 == 0) goto L_0x0070
            r5.A07(r0)
        L_0x0070:
            r3 = 1
            r5.A01()
            X.7Pr r1 = X.DbX.A0e(r4, r3)
            r0 = 1061158912(0x3f400000, float:0.75)
            r1.A03 = r0
            r1.A17 = r3
            r1.A1O = r3
            r1.A13 = r3
            r0 = 4
            X.7Pu r2 = X.FmG.A00(r1, r2, r0)
            X.37D r10 = X.DbT.A0i(r6)
            if (r10 == 0) goto L_0x0b75
            r4 = r10
            X.37F r4 = (X.AnonymousClass37F) r4
            boolean r0 = r4.A0g
            if (r0 == 0) goto L_0x0b75
            X.FmM r1 = new X.FmM
            r1.<init>(r3, r6, r5, r2)
        L_0x0099:
            r4.A0H = r1
            r10.A0B()
            return
        L_0x009f:
            boolean r0 = r1 instanceof X.C47851EJx
            if (r0 == 0) goto L_0x00be
            X.EJx r1 = (X.C47851EJx) r1
            android.app.Activity r2 = r1.A00
            com.instagram.user.model.User r6 = r1.A04
            com.instagram.common.session.UserSession r5 = r1.A02
            androidx.fragment.app.Fragment r3 = r1.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment"
            X.0qQ.A0C(r3, r0)
            X.4DH r3 = (X.AnonymousClass4DH) r3
            X.4DU r4 = r1.A03
            java.lang.String r7 = "profile_card_message_button"
            r8 = 0
            r9 = 0
            X.F7B.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x00be:
            boolean r0 = r1 instanceof X.EK4
            r4 = r32
            if (r0 == 0) goto L_0x00e9
            r0 = r1
            X.EK4 r0 = (X.EK4) r0
            X.2FW r7 = r0.A05
            X.ElD r1 = X.C48851ElD.$redex_init_class
            int r5 = r7.ordinal()
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.model.reels.ReelItem"
            r1 = 18
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r3 = 1
            r14 = 0
            switch(r5) {
                case 15: goto L_0x05e4;
                case 16: goto L_0x05b0;
                case 17: goto L_0x05b0;
                case 19: goto L_0x058a;
                case 20: goto L_0x061a;
                case 28: goto L_0x04fb;
                case 32: goto L_0x04c0;
                case 37: goto L_0x061a;
                case 46: goto L_0x061a;
                case 47: goto L_0x0571;
                case 49: goto L_0x061a;
                case 58: goto L_0x041f;
                case 59: goto L_0x03e6;
                case 89: goto L_0x03cc;
                case 91: goto L_0x03b4;
                case 97: goto L_0x049c;
                case 98: goto L_0x0476;
                case 101: goto L_0x049c;
                case 102: goto L_0x0460;
                default: goto L_0x00de;
            }
        L_0x00de:
            java.lang.String r1 = "unsupported content type: "
            java.lang.String r0 = r7.name()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x00e9:
            boolean r0 = r1 instanceof X.C47848EJu
            if (r0 == 0) goto L_0x00f6
            r0 = r1
            X.EJu r0 = (X.C47848EJu) r0
            android.app.Activity r0 = r0.A00
            r0.onBackPressed()
            return
        L_0x00f6:
            boolean r0 = r1 instanceof X.EK3
            if (r0 == 0) goto L_0x013b
            r0 = r1
            X.EK3 r0 = (X.EK3) r0
            java.util.ArrayList r1 = X.FF0.A07
            com.instagram.common.session.UserSession r13 = r0.A04
            androidx.fragment.app.FragmentActivity r14 = r0.A00
            android.content.Context r1 = X.DbT.A05(r14)
            r5 = 1
            X.Phg r2 = new X.Phg
            r2.<init>(r5, r1, r13)
            java.lang.Class<X.FF0> r1 = X.FF0.class
            java.lang.Object r1 = r13.A01(r1, r2)
            X.FF0 r1 = (X.FF0) r1
            java.lang.String r3 = "user_sms"
            r1.A02(r3)
            X.2FW r10 = r0.A05
            X.ElG r1 = X.C48854ElG.$redex_init_class
            int r2 = r10.ordinal()
            java.lang.String r12 = "null cannot be cast to non-null type kotlin.String"
            java.lang.String r9 = "null cannot be cast to non-null type com.instagram.direct.groupinvites.models.InviteLinkShareInfo"
            java.lang.String r7 = "null cannot be cast to non-null type com.instagram.model.reels.ReelItem"
            java.lang.String r6 = "Required value was null."
            java.lang.String r1 = ""
            r8 = 0
            switch(r2) {
                case 15: goto L_0x0838;
                case 16: goto L_0x0838;
                case 17: goto L_0x0838;
                case 19: goto L_0x0796;
                case 20: goto L_0x0862;
                case 28: goto L_0x080a;
                case 32: goto L_0x07cf;
                case 46: goto L_0x0862;
                case 47: goto L_0x07b1;
                case 49: goto L_0x0862;
                case 58: goto L_0x06fe;
                case 59: goto L_0x06c9;
                case 89: goto L_0x06a5;
                case 91: goto L_0x0731;
                case 97: goto L_0x076f;
                case 98: goto L_0x074d;
                case 101: goto L_0x0782;
                case 102: goto L_0x07be;
                default: goto L_0x0130;
            }
        L_0x0130:
            java.lang.String r1 = "unsupported content type: "
            java.lang.String r0 = r10.name()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x013b:
            boolean r0 = r1 instanceof X.EK2
            if (r0 == 0) goto L_0x0181
            r0 = r1
            X.EK2 r0 = (X.EK2) r0
            java.util.ArrayList r1 = X.FF0.A07
            com.instagram.common.session.UserSession r14 = r0.A05
            androidx.fragment.app.Fragment r5 = r0.A00
            android.content.Context r1 = r5.requireContext()
            android.content.Context r1 = X.DbT.A05(r1)
            r11 = 1
            X.Phg r2 = new X.Phg
            r2.<init>(r11, r1, r14)
            java.lang.Class<X.FF0> r1 = X.FF0.class
            java.lang.Object r1 = r14.A01(r1, r2)
            X.FF0 r1 = (X.FF0) r1
            java.lang.String r2 = "system_share_sheet"
            r1.A02(r2)
            X.2FW r10 = r0.A05
            X.ElF r3 = X.C48853ElF.$redex_init_class
            int r3 = r10.ordinal()
            java.lang.String r13 = "Required value was null."
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.String"
            java.lang.String r6 = "null cannot be cast to non-null type com.instagram.model.reels.ReelItem"
            r16 = 0
            switch(r3) {
                case 15: goto L_0x0a9f;
                case 16: goto L_0x0a9f;
                case 17: goto L_0x0a9f;
                case 19: goto L_0x0a83;
                case 20: goto L_0x0aeb;
                case 28: goto L_0x0a28;
                case 32: goto L_0x09ea;
                case 37: goto L_0x0aeb;
                case 46: goto L_0x0aeb;
                case 47: goto L_0x0ac2;
                case 49: goto L_0x0aeb;
                case 58: goto L_0x0955;
                case 59: goto L_0x0922;
                case 89: goto L_0x0909;
                case 91: goto L_0x08e8;
                case 97: goto L_0x09b5;
                case 98: goto L_0x098e;
                case 101: goto L_0x09b5;
                case 102: goto L_0x09d0;
                default: goto L_0x0176;
            }
        L_0x0176:
            java.lang.String r1 = "unsupported content type: "
            java.lang.String r0 = r10.name()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x0181:
            boolean r0 = r1 instanceof X.C47847EJt
            if (r0 == 0) goto L_0x018e
            r0 = r1
            X.EJt r0 = (X.C47847EJt) r0
            X.G9Z r0 = r0.A00
            r0.Dk8()
            return
        L_0x018e:
            boolean r0 = r1 instanceof X.C47852EJy
            if (r0 == 0) goto L_0x0214
            r5 = r1
            X.EJy r5 = (X.C47852EJy) r5
            X.30z r6 = r5.A01
            if (r6 == 0) goto L_0x0016
            X.3W1 r2 = r5.A02
            r0 = 38
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            if (r2 != 0) goto L_0x01b2
            java.lang.Object r0 = r5.A04
            X.0qQ.A0C(r0, r3)
            X.1Xj r0 = (X.1Xj) r0
            X.1Xy r0 = r0.A0C
            X.DUp r0 = r0.BAG()
            if (r0 == 0) goto L_0x01cd
        L_0x01b2:
            X.2FW r1 = r5.A03
            X.2FW r0 = X.2FW.A1D
            if (r1 == r0) goto L_0x01c4
            X.2FW r0 = X.2FW.A1v
            if (r1 == r0) goto L_0x01c4
            X.2FW r0 = X.2FW.A0W
            if (r1 == r0) goto L_0x01c4
            X.2FW r0 = X.2FW.A1p
            if (r1 != r0) goto L_0x0201
        L_0x01c4:
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0201
            X.G9Z r0 = r5.A00
            r0.D4K()
        L_0x01cd:
            if (r32 == 0) goto L_0x0016
            r0 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r4, r0)
            r0 = 2131429285(0x7f0b07a5, float:1.8480238E38)
            android.widget.ImageView r1 = X.DbX.A0J(r4, r0)
            java.lang.Object r0 = r5.A04
            X.0qQ.A0C(r0, r3)
            X.1Xj r0 = (X.1Xj) r0
            boolean r0 = r0.CbC()
            if (r0 == 0) goto L_0x01f7
            r0 = 2131960050(0x7f1320f2, float:1.9556758E38)
            r2.setText(r0)
            r0 = 2131238735(0x7f081f4f, float:1.8093757E38)
        L_0x01f3:
            r1.setImageResource(r0)
            return
        L_0x01f7:
            r0 = 2131960049(0x7f1320f1, float:1.9556756E38)
            r2.setText(r0)
            r0 = 2131238737(0x7f081f51, float:1.8093761E38)
            goto L_0x01f3
        L_0x0201:
            java.lang.Object r1 = r5.A04
            X.0qQ.A0C(r1, r3)
            X.1Xj r1 = (X.1Xj) r1
            if (r2 == 0) goto L_0x0212
            int r0 = r2.getPosition()
        L_0x020e:
            r6.Dgf(r1, r2, r0)
            goto L_0x01cd
        L_0x0212:
            r0 = -1
            goto L_0x020e
        L_0x0214:
            boolean r0 = r1 instanceof X.C47846EJs
            if (r0 == 0) goto L_0x0221
            r0 = r1
            X.EJs r0 = (X.C47846EJs) r0
            X.G9Z r0 = r0.A00
            r0.DLb()
            return
        L_0x0221:
            boolean r0 = r1 instanceof X.EK6
            if (r0 != 0) goto L_0x0016
            boolean r0 = r1 instanceof X.EK0
            if (r0 == 0) goto L_0x0267
            X.EK0 r1 = (X.EK0) r1
            X.G9Z r0 = r1.A01
            r0.DAE()
            com.instagram.common.session.UserSession r4 = r1.A00
            X.4DU r3 = r1.A02
            java.lang.String r7 = r1.A04()
            java.lang.String r8 = r1.A04
            java.lang.String r9 = r1.A07
            java.lang.Object r2 = r1.A06
            boolean r0 = r2 instanceof X.1Xj
            if (r0 == 0) goto L_0x0265
            X.1Xj r2 = (X.1Xj) r2
            X.1Xy r0 = r2.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0265
            java.lang.String r10 = r0.getId()
        L_0x0250:
            java.lang.String r11 = r1.A03()
            java.lang.String r12 = r1.A05
            java.lang.String r13 = r1.A06
            java.lang.String r14 = r1.A07
            java.lang.Long r5 = r1.A03
            java.lang.Long r6 = r1.A01
            java.lang.String r15 = r1.A03
            r2 = 0
            X.C22031Xty.A05(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0265:
            r10 = 0
            goto L_0x0250
        L_0x0267:
            boolean r0 = r1 instanceof X.C47845EJr
            if (r0 == 0) goto L_0x0274
            r0 = r1
            X.EJr r0 = (X.C47845EJr) r0
            X.G9Z r0 = r0.A00
            r0.CuQ()
            return
        L_0x0274:
            boolean r0 = r1 instanceof X.EK1
            if (r0 == 0) goto L_0x0bb0
            r7 = r1
            X.EK1 r7 = (X.EK1) r7
            X.G9Z r0 = r7.A03
            r0.Ch4()
            androidx.fragment.app.Fragment r8 = r7.A01
            android.content.Context r12 = r8.requireContext()
            java.lang.Object r11 = r7.A07
            X.3W1 r9 = r7.A05
            X.2FW r1 = r7.A06
            com.instagram.common.session.UserSession r6 = r7.A02
            X.4DU r10 = r7.A04
            java.lang.String r5 = "add_to_channel_button"
            r4 = 0
            r3 = 1
            X.1as r0 = X.1as.A04
            X.1ap r0 = r0.A02
            X.F3w r2 = r0.A07(r10, r6, r1)
            r2.A04(r10)
            boolean r0 = r11 instanceof X.1Xj
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0365
            X.1Xj r11 = (X.1Xj) r11
            java.lang.String r0 = r11.getId()
            if (r0 == 0) goto L_0x0ba1
            r2.A06(r0)
            if (r9 == 0) goto L_0x0362
            int r9 = r9.A03
        L_0x02b4:
            android.os.Bundle r1 = r2.A07
            r0 = 20
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.putInt(r0, r9)
        L_0x02bf:
            r14 = 0
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            com.instagram.direct.intf.DirectShareSheetAppearance r13 = new com.instagram.direct.intf.DirectShareSheetAppearance
            r15 = r14
            r19 = r4
            r20 = r3
            r21 = r4
            r22 = r3
            r23 = r4
            r24 = r4
            r25 = r3
            r26 = r4
            r27 = r3
            r28 = r3
            r29 = r4
            r30 = r4
            r18 = r4
            r17 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            android.os.Bundle r9 = r2.A07
            r0 = 42
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.putParcelable(r0, r13)
            r0 = 107(0x6b, float:1.5E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.putString(r0, r5)
            float r1 = X.C66901Mej.A00(r12)
            r0 = 52
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r9.putFloat(r0, r1)
            r2.A08(r4)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r2 = r2.A00()
            X.7Pr r1 = X.DbX.A0e(r6, r3)
            r0 = 7
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            r1.A0T = r2
            r0 = 1053609165(0x3ecccccd, float:0.4)
            r1.A03 = r0
            X.7Pu r3 = r1.A00()
            X.37D r10 = X.DbX.A0i(r8)
            X.C48943Emh.A00(r10)
            if (r10 == 0) goto L_0x0b9b
            r4 = r10
            X.37F r4 = (X.AnonymousClass37F) r4
            boolean r0 = r4.A0g
            if (r0 == 0) goto L_0x0b9b
            androidx.fragment.app.Fragment r0 = r10.A09()
            if (r0 == 0) goto L_0x0b9b
            androidx.fragment.app.Fragment r0 = r10.A09()
            if (r0 == 0) goto L_0x0b9b
            X.07Z r0 = r0.getViewLifecycleOwner()
            X.07V r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x0b9b
            X.07U r1 = r0.A07()
            X.07U r0 = X.07U.A01
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x0b9b
            X.7Ui r0 = r4.A0H
            X.FmN r1 = new X.FmN
            r5 = r1
            r6 = r2
            r8 = r3
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0099
        L_0x0362:
            r9 = 0
            goto L_0x02b4
        L_0x0365:
            boolean r0 = r11 instanceof X.C255773uh
            if (r0 == 0) goto L_0x02bf
            X.3uh r11 = (X.C255773uh) r11
            X.1Xj r0 = r11.A0b
            if (r0 == 0) goto L_0x0bab
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0ba6
            r2.A06(r0)
            r2.A04(r10)
            android.os.Bundle r9 = r2.A07
            r0 = 20
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.putInt(r0, r4)
            java.lang.String r1 = r11.A0k
            X.0qQ.A07(r1)
            r0 = 108(0x6c, float:1.51E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.putString(r0, r1)
            java.lang.String r1 = r11.A0j
            X.0qQ.A07(r1)
            r0 = 213(0xd5, float:2.98E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.putString(r0, r1)
            java.lang.String r1 = r10.getModuleName()
            X.0qQ.A0B(r1, r4)
            r0 = 214(0xd6, float:3.0E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.putString(r0, r1)
            goto L_0x02bf
        L_0x03b4:
            X.EWV r13 = X.EWV.A0C
            androidx.fragment.app.FragmentActivity r7 = r0.A01
            X.0hq r6 = r0.A02
            X.07i r3 = r0.A03
            com.instagram.common.session.UserSession r2 = r0.A05
            X.4DU r1 = r0.A06
            java.lang.String r15 = ""
            r8 = r4
            r9 = r6
            r10 = r3
            r11 = r1
            r12 = r2
            X.C46395DeI.A06(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0666
        L_0x03cc:
            X.EZn r4 = r0.A04
            if (r4 == 0) goto L_0x0666
            X.EWV r3 = X.EWV.A0C
            androidx.fragment.app.FragmentActivity r8 = r0.A01
            X.0hq r1 = r0.A02
            X.07i r7 = r0.A03
            com.instagram.common.session.UserSession r2 = r0.A05
            X.EQU r10 = new X.EQU
            r10.<init>(r8, r1, r4, r2)
            java.lang.Integer r1 = r3.A01
            X.1OC r1 = X.C49120Epj.A00(r14, r2, r1)
            goto L_0x0459
        L_0x03e6:
            androidx.fragment.app.FragmentActivity r11 = r0.A01
            X.0hq r10 = r0.A02
            java.lang.Object r9 = r0.A06
            X.0qQ.A0C(r9, r6)
            java.lang.String r9 = (java.lang.String) r9
            X.4DU r8 = r0.A06
            java.lang.String r25 = r0.A04()
            java.lang.Long r7 = r0.A08
            X.07i r6 = r0.A03
            com.instagram.common.session.UserSession r2 = r0.A05
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r3)
            r3 = 2
            X.AWG r1 = new X.AWG
            r1.<init>(r3, r11, r4)
            java.lang.String r26 = "copy_link"
            r15 = r11
            r16 = r10
            r17 = r6
            r18 = r1
            r19 = r8
            r20 = r2
            r22 = r7
            r23 = r14
            r24 = r9
            X.C46395DeI.A0B(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0666
        L_0x041f:
            java.lang.Object r9 = r0.A06
            X.0qQ.A0C(r9, r6)
            java.lang.String r9 = (java.lang.String) r9
            androidx.fragment.app.FragmentActivity r8 = r0.A01
            X.0hq r2 = r0.A02
            X.4DU r6 = r0.A06
            java.lang.String r17 = r0.A04()
            java.lang.Long r1 = r0.A08
            X.07i r7 = r0.A03
            com.instagram.common.session.UserSession r3 = r0.A05
            java.lang.String r15 = "copy_link"
            r14 = r17
            r10 = r6
            r11 = r3
            r12 = r1
            r13 = r9
            X.C22031Xty.A09(r10, r11, r12, r13, r14, r15)
            r18 = 0
            X.EQm r10 = new X.EQm
            r11 = r2
            r12 = r8
            r13 = r4
            r14 = r6
            r15 = r3
            r16 = r9
            r10.<init>((X.0hq) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (java.lang.Object) r15, (java.lang.String) r16, (java.lang.String) r17, (int) r18)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.String r1 = r6.getModuleName()
            X.1OC r1 = X.C49116Epf.A00(r3, r2, r9, r1)
        L_0x0459:
            r1.A00 = r10
            X.1ES.A00(r8, r7, r1)
            goto L_0x0666
        L_0x0460:
            java.lang.Object r7 = r0.A06
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectThreadShareLinksShareContentModel"
            X.0qQ.A0C(r7, r1)
            X.EJR r7 = (X.EJR) r7
            androidx.fragment.app.Fragment r6 = r0.A00
            android.content.Context r2 = r6.requireContext()
            java.lang.String r1 = r7.A01
            X.C48300EcJ.A00(r2, r1)
            goto L_0x05a7
        L_0x0476:
            java.lang.Object r6 = r0.A06
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo"
            X.0qQ.A0C(r6, r1)
            com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo r6 = (com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo) r6
            androidx.fragment.app.FragmentActivity r3 = r0.A01
            com.instagram.common.session.UserSession r2 = r0.A05
            X.EWV r12 = X.EWV.A0C
            java.lang.String r13 = r0.A04()
            X.4DU r1 = r0.A06
            java.lang.String r14 = ""
            r7 = r3
            r8 = r4
            r9 = r1
            r10 = r2
            r11 = r6
            X.C46395DeI.A08(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r1 = "copy_link"
            X.C49754F5f.A00(r2, r6, r1)
            goto L_0x0666
        L_0x049c:
            java.lang.Object r7 = r0.A06
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.direct.groupinvites.models.InviteLinkShareInfo"
            X.0qQ.A0C(r7, r1)
            com.instagram.direct.groupinvites.models.InviteLinkShareInfo r7 = (com.instagram.direct.groupinvites.models.InviteLinkShareInfo) r7
            androidx.fragment.app.Fragment r6 = r0.A00
            android.content.Context r2 = r6.requireContext()
            java.lang.String r1 = r7.A06
            X.C48300EcJ.A00(r2, r1)
            android.content.Context r1 = r6.requireContext()
            X.C49118Eph.A00(r1, r4, r14, r3)
            com.instagram.common.session.UserSession r2 = r0.A05
            java.lang.String r1 = "copy_link"
            X.C49754F5f.A01(r2, r7, r1)
            goto L_0x0666
        L_0x04c0:
            java.lang.Object r1 = r0.A06
            X.0qQ.A0C(r1, r2)
            X.3uh r1 = (X.C255773uh) r1
            X.4gL r1 = r1.A0c
            if (r1 == 0) goto L_0x0666
            androidx.fragment.app.FragmentActivity r10 = r0.A01
            X.0hq r9 = r0.A02
            X.07i r8 = r0.A03
            com.instagram.common.session.UserSession r7 = r0.A05
            com.instagram.user.model.User r16 = r1.A03()
            java.lang.String r6 = r1.A0X
            r6.getClass()
            java.lang.String r3 = r1.A0e
            r3.getClass()
            X.4DU r2 = r0.A06
            java.lang.Runnable r1 = r0.A09
            java.lang.String r20 = "live_action_sheet"
            java.lang.String r21 = "copy_link"
            java.lang.String r22 = ""
            r11 = r4
            r12 = r9
            r13 = r8
            r14 = r2
            r15 = r7
            r17 = r1
            r18 = r6
            r19 = r3
            X.C46395DeI.A05(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0666
        L_0x04fb:
            java.lang.Object r8 = r0.A06
            X.0qQ.A0C(r8, r2)
            X.3uh r8 = (X.C255773uh) r8
            boolean r1 = r8.A1J()
            if (r1 == 0) goto L_0x053e
            com.instagram.user.model.User r1 = r8.A0i
            if (r1 == 0) goto L_0x053b
            java.lang.String r17 = r1.getId()
        L_0x0510:
            androidx.fragment.app.FragmentActivity r6 = r0.A01
            X.0hq r7 = r0.A02
            java.lang.String r15 = r8.A0k
            java.lang.String r2 = r8.A0j
            X.4DU r11 = r0.A06
            java.lang.String r18 = r0.A04()
            X.07i r8 = r0.A03
            com.instagram.common.session.UserSession r10 = r0.A05
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            r1 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            X.FT3 r9 = new X.FT3
            r9.<init>(r6, r4, r1, r3)
            java.lang.String r19 = "copy_link"
            r20 = r14
            r21 = r1
            r16 = r2
            X.C46395DeI.A0D(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0666
        L_0x053b:
            r17 = r14
            goto L_0x0510
        L_0x053e:
            androidx.fragment.app.FragmentActivity r12 = r0.A01
            X.0hq r11 = r0.A02
            X.4DU r10 = r0.A06
            java.lang.String r23 = r0.A04()
            X.07i r9 = r0.A03
            com.instagram.common.session.UserSession r7 = r0.A05
            X.0Tu r6 = X.0Tu.A05
            r1 = 36322607141759271(0x810b3800002927, double:3.033901243623371E-306)
            boolean r1 = X.182.A06(r6, r7, r1)
            if (r1 == 0) goto L_0x055b
            java.lang.Runnable r14 = r0.A09
        L_0x055b:
            r15 = r12
            r16 = r4
            r17 = r11
            r18 = r9
            r19 = r7
            r20 = r10
            r21 = r8
            r22 = r14
            r24 = r3
            X.C46395DeI.A07(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0666
        L_0x0571:
            java.lang.Object r2 = r0.A06
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectCommentShareContentModel"
            X.0qQ.A0C(r2, r1)
            X.EJU r2 = (X.EJU) r2
            java.lang.String r6 = r2.A03
            if (r6 == 0) goto L_0x0666
            androidx.fragment.app.FragmentActivity r2 = r0.A01
            java.lang.Object r1 = X.DbZ.A0e(r2)
            android.text.ClipboardManager r1 = (android.text.ClipboardManager) r1
            r1.setText(r6)
            goto L_0x05ab
        L_0x058a:
            java.lang.Object r6 = r0.A06
            boolean r1 = r6 instanceof com.instagram.user.model.User
            if (r1 == 0) goto L_0x0666
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            if (r6 == 0) goto L_0x0666
            X.FAs r2 = X.C49871FAs.A00
            com.instagram.common.session.UserSession r1 = r0.A05
            java.lang.String r2 = r2.A00(r1, r6)
            if (r2 == 0) goto L_0x0666
            androidx.fragment.app.Fragment r6 = r0.A00
            android.content.Context r1 = r6.requireContext()
            X.C48300EcJ.A00(r1, r2)
        L_0x05a7:
            android.content.Context r2 = r6.requireContext()
        L_0x05ab:
            X.C49118Eph.A00(r2, r4, r14, r3)
            goto L_0x0666
        L_0x05b0:
            androidx.fragment.app.FragmentActivity r11 = r0.A01
            X.0hq r10 = r0.A02
            java.lang.Object r9 = r0.A06
            X.0qQ.A0C(r9, r1)
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            X.4DU r8 = r0.A06
            java.lang.String r21 = r0.A04()
            X.07i r7 = r0.A03
            com.instagram.common.session.UserSession r6 = r0.A05
            java.lang.String r4 = r0.A0B
            java.lang.String r2 = r0.A0C
            java.lang.Long r1 = r0.A08
            r13 = r11
            r15 = r10
            r16 = r7
            r17 = r8
            r18 = r6
            r19 = r9
            r20 = r1
            r22 = r4
            r23 = r2
            r24 = r14
            r25 = r3
            X.C46395DeI.A04(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0666
        L_0x05e4:
            androidx.fragment.app.FragmentActivity r12 = r0.A01
            X.0hq r11 = r0.A02
            java.lang.Object r10 = r0.A06
            X.0qQ.A0C(r10, r1)
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            X.4DU r9 = r0.A06
            java.lang.String r23 = r0.A04()
            X.07i r8 = r0.A03
            com.instagram.common.session.UserSession r7 = r0.A05
            java.lang.String r6 = r0.A0B
            java.lang.String r2 = r0.A0C
            java.lang.Long r1 = r0.A08
            r15 = r12
            r16 = r4
            r17 = r11
            r18 = r8
            r19 = r9
            r20 = r7
            r21 = r10
            r22 = r1
            r24 = r6
            r25 = r2
            r26 = r14
            r27 = r3
            X.C46395DeI.A04(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0666
        L_0x061a:
            androidx.fragment.app.FragmentActivity r13 = r0.A01
            X.0hq r11 = r0.A02
            java.lang.Object r9 = r0.A06
            r1 = 38
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r9, r1)
            X.1Xj r9 = (X.1Xj) r9
            X.3W1 r10 = r0.A07
            X.4DU r8 = r0.A06
            java.lang.String r24 = r0.A04()
            X.07i r7 = r0.A03
            com.instagram.common.session.UserSession r6 = r0.A05
            X.0Tu r12 = X.0Tu.A05
            r1 = 36322607141759271(0x810b3800002927, double:3.033901243623371E-306)
            boolean r1 = X.182.A06(r12, r6, r1)
            if (r1 == 0) goto L_0x0646
            java.lang.Runnable r14 = r0.A09
        L_0x0646:
            java.lang.Integer r22 = X.AnonymousClass05K.A00
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r3)
            X.FT3 r1 = new X.FT3
            r1.<init>(r13, r4, r3, r3)
            java.lang.String r25 = "copy_link"
            r15 = r7
            r16 = r1
            r17 = r6
            r18 = r9
            r19 = r8
            r20 = r10
            r23 = r14
            r26 = r3
            r14 = r11
            X.C46395DeI.A0C(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x0666:
            r1 = 28
            if (r5 == r1) goto L_0x0016
            r1 = 89
            if (r5 == r1) goto L_0x0693
            com.instagram.common.session.UserSession r2 = r0.A05
            X.4DU r1 = r0.A06
            java.lang.String r6 = r0.A07
            java.lang.String r7 = r0.A04()
            java.lang.String r9 = r0.A03()
            java.lang.String r10 = r0.A0A
            java.lang.String r11 = r0.A0B
            java.lang.String r12 = r0.A0C
            java.lang.String r13 = r0.A05()
            r3 = 0
            java.lang.Long r4 = r0.A08
            java.lang.Long r5 = r0.A01
            java.lang.String r14 = r0.A03
            java.lang.String r8 = "copy_link"
            X.C22031Xty.A07(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0693:
            X.EZn r3 = r0.A04
            if (r3 == 0) goto L_0x0016
            com.instagram.common.session.UserSession r2 = r0.A05
            X.EZk r1 = X.C48142EZk.COPY_LINK
            androidx.fragment.app.FragmentActivity r0 = r0.A01
            boolean r0 = X.C267044ar.A01(r0, r2)
            X.C49947FGb.A03(r3, r1, r2, r0)
            return
        L_0x06a5:
            X.EZn r6 = r0.A03
            if (r6 == 0) goto L_0x08a5
            X.EWV r5 = X.EWV.A0K
            X.0hq r4 = r0.A01
            X.07i r7 = r0.A02
            java.lang.Runnable r1 = r0.A08
            X.EQY r9 = new X.EQY
            r15 = r9
            r16 = r14
            r17 = r4
            r18 = r6
            r19 = r13
            r20 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            java.lang.Integer r1 = r5.A01
            X.1OC r1 = X.C49120Epj.A00(r8, r13, r1)
            goto L_0x08a0
        L_0x06c9:
            X.0hq r11 = r0.A01
            X.07i r10 = r0.A02
            java.lang.Object r9 = r0.A06
            X.0qQ.A0C(r9, r12)
            java.lang.String r9 = (java.lang.String) r9
            X.4DU r8 = r0.A05
            java.lang.String r24 = r0.A04()
            java.lang.Long r7 = r0.A07
            java.lang.Runnable r6 = r0.A08
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r5)
            r5 = 0
            X.FT2 r4 = new X.FT2
            r4.<init>(r14, r1, r5)
            r15 = r11
            r16 = r10
            r17 = r4
            r18 = r8
            r19 = r13
            r21 = r7
            r22 = r6
            r23 = r9
            r25 = r3
            X.C46395DeI.A0B(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x08a5
        L_0x06fe:
            X.0hq r8 = r0.A01
            X.07i r7 = r0.A02
            java.lang.Object r6 = r0.A06
            X.0qQ.A0C(r6, r12)
            java.lang.String r6 = (java.lang.String) r6
            X.4DU r5 = r0.A05
            java.lang.String r23 = r0.A04()
            java.lang.Runnable r4 = r0.A08
            X.EQc r9 = new X.EQc
            r15 = r9
            r16 = r14
            r17 = r8
            r18 = r13
            r19 = r5
            r20 = r4
            r21 = r1
            r22 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Integer r4 = X.AnonymousClass05K.A1I
            java.lang.String r1 = r5.getModuleName()
            X.1OC r1 = X.C49116Epf.A00(r13, r4, r6, r1)
            goto L_0x08a0
        L_0x0731:
            X.EWV r20 = X.EWV.A0K
            X.0hq r8 = r0.A01
            X.07i r7 = r0.A02
            X.4DU r6 = r0.A05
            java.lang.Runnable r5 = r0.A08
            r15 = r4
            r16 = r8
            r17 = r7
            r18 = r6
            r19 = r13
            r21 = r5
            r22 = r1
            X.C46395DeI.A06(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x08a5
        L_0x074d:
            java.lang.Object r6 = r0.A06
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo"
            X.0qQ.A0C(r6, r5)
            com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo r6 = (com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo) r6
            X.EWV r19 = X.EWV.A0K
            java.lang.String r20 = r0.A04()
            X.4DU r5 = r0.A05
            r15 = r4
            r16 = r5
            r17 = r13
            r18 = r6
            r21 = r1
            X.C46395DeI.A08(r14, r15, r16, r17, r18, r19, r20, r21)
            X.C49754F5f.A00(r13, r6, r3)
            goto L_0x08a5
        L_0x076f:
            java.lang.Object r5 = r0.A06
            X.0qQ.A0C(r5, r9)
            com.instagram.direct.groupinvites.models.InviteLinkShareInfo r5 = (com.instagram.direct.groupinvites.models.InviteLinkShareInfo) r5
            java.lang.String r4 = r5.A06
            if (r4 == 0) goto L_0x0b82
            X.C49899FCc.A01(r14, r4, r1)
            X.C49754F5f.A01(r13, r5, r3)
            goto L_0x08a5
        L_0x0782:
            java.lang.Object r4 = r0.A06
            X.0qQ.A0C(r4, r9)
            com.instagram.direct.groupinvites.models.InviteLinkShareInfo r4 = (com.instagram.direct.groupinvites.models.InviteLinkShareInfo) r4
            java.lang.String r5 = r4.A06
            if (r5 == 0) goto L_0x0b8c
            android.net.Uri r4 = r4.A03
            if (r4 == 0) goto L_0x0b87
            X.C48808EkW.A00(r14, r4, r5, r1)
            goto L_0x08a5
        L_0x0796:
            java.lang.Object r4 = r0.A06
            boolean r1 = r4 instanceof com.instagram.user.model.User
            if (r1 == 0) goto L_0x08a5
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            if (r4 == 0) goto L_0x08a5
            X.FAs r1 = X.C49871FAs.A00
            java.lang.String r5 = r1.A00(r13, r4)
            if (r5 == 0) goto L_0x08a5
            X.EWV r4 = X.EWV.A0J
            X.4DU r1 = r0.A05
            X.C46395DeI.A0M(r14, r1, r13, r4, r5)
            goto L_0x08a5
        L_0x07b1:
            java.lang.Object r5 = r0.A06
            boolean r4 = r5 instanceof X.EJU
            if (r4 == 0) goto L_0x07ca
            X.EJU r5 = (X.EJU) r5
            if (r5 == 0) goto L_0x07ca
            java.lang.String r8 = r5.A03
            goto L_0x07ca
        L_0x07be:
            java.lang.Object r5 = r0.A06
            boolean r4 = r5 instanceof X.EJR
            if (r4 == 0) goto L_0x07ca
            X.EJR r5 = (X.EJR) r5
            if (r5 == 0) goto L_0x07ca
            java.lang.String r8 = r5.A01
        L_0x07ca:
            X.C49899FCc.A01(r14, r8, r1)
            goto L_0x08a5
        L_0x07cf:
            java.lang.Object r4 = r0.A06
            X.0qQ.A0C(r4, r7)
            X.3uh r4 = (X.C255773uh) r4
            X.4gL r4 = r4.A0c
            if (r4 == 0) goto L_0x08a5
            X.0hq r10 = r0.A01
            X.07i r9 = r0.A02
            com.instagram.user.model.User r20 = r4.A03()
            java.lang.String r7 = r4.A0X
            r7.getClass()
            java.lang.String r6 = r4.A0e
            r6.getClass()
            X.4DU r5 = r0.A05
            java.lang.Runnable r4 = r0.A08
            java.lang.String r24 = "live_action_sheet"
            r15 = r8
            r16 = r10
            r17 = r9
            r18 = r5
            r19 = r13
            r21 = r4
            r22 = r7
            r23 = r6
            r25 = r3
            r26 = r1
            X.C46395DeI.A05(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x08a5
        L_0x080a:
            java.lang.Object r9 = r0.A06
            X.0qQ.A0C(r9, r7)
            X.3uh r9 = (X.C255773uh) r9
            boolean r8 = r9.A1J()
            X.0hq r7 = r0.A01
            X.07i r6 = r0.A02
            X.4DU r5 = r0.A05
            java.lang.String r21 = r0.A04()
            java.lang.Runnable r4 = r0.A08
            r15 = r7
            r16 = r6
            r17 = r13
            r18 = r5
            r19 = r9
            r20 = r4
            r22 = r1
            if (r8 == 0) goto L_0x0834
            X.C46395DeI.A0H(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x08a5
        L_0x0834:
            X.C46395DeI.A0I(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x08a5
        L_0x0838:
            X.0hq r8 = r0.A01
            X.07i r7 = r0.A02
            java.lang.Object r6 = r0.A06
            r4 = 18
            java.lang.String r4 = X.C66579MXk.A00(r4)
            X.0qQ.A0C(r6, r4)
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            X.4DU r5 = r0.A05
            java.lang.String r21 = r0.A04()
            java.lang.Runnable r4 = r0.A08
            r15 = r8
            r16 = r7
            r17 = r5
            r18 = r13
            r19 = r6
            r20 = r4
            r22 = r1
            X.C46395DeI.A0E(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x08a5
        L_0x0862:
            X.0hq r10 = r0.A01
            X.07i r7 = r0.A02
            java.lang.Object r8 = r0.A06
            r4 = 38
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            X.0qQ.A0C(r8, r4)
            X.1Xj r8 = (X.1Xj) r8
            X.3W1 r6 = r0.A06
            X.4DU r5 = r0.A05
            java.lang.String r24 = r0.A04()
            java.lang.Runnable r4 = r0.A08
            X.EQL r9 = new X.EQL
            r15 = r9
            r16 = r14
            r17 = r14
            r18 = r10
            r19 = r13
            r20 = r8
            r21 = r5
            r22 = r4
            r23 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.SQH.A02(r10)
            java.lang.Integer r4 = X.AnonymousClass05K.A1I
            java.lang.String r1 = r5.getModuleName()
            X.1OC r1 = X.FGA.A00(r13, r8, r6, r4, r1)
        L_0x08a0:
            r1.A00 = r9
            X.1ES.A00(r14, r7, r1)
        L_0x08a5:
            r1 = 28
            if (r2 == r1) goto L_0x0016
            r1 = 89
            if (r2 == r1) goto L_0x08da
            X.4DU r12 = r0.A05
            java.lang.String r6 = r0.A07
            java.lang.String r18 = r0.A04()
            java.lang.String r20 = r0.A03()
            java.lang.String r5 = r0.A09
            java.lang.String r4 = r0.A0A
            java.lang.String r2 = r0.A0B
            r14 = 0
            java.lang.Long r15 = r0.A07
            java.lang.Long r1 = r0.A01
            java.lang.String r0 = r0.A03
            r21 = r5
            r22 = r4
            r23 = r2
            r24 = r14
            r25 = r0
            r17 = r6
            r19 = r3
            r16 = r1
            X.C22031Xty.A07(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        L_0x08da:
            X.EZn r2 = r0.A03
            if (r2 == 0) goto L_0x0016
            X.EZk r1 = X.C48142EZk.SMS
            boolean r0 = X.C267044ar.A01(r14, r13)
            X.C49947FGb.A03(r2, r1, r13, r0)
            return
        L_0x08e8:
            X.EWV r23 = X.EWV.A0J
            androidx.fragment.app.FragmentActivity r9 = r0.A01
            X.0hq r8 = r0.A02
            X.07i r7 = r0.A03
            X.4DU r6 = r0.A06
            java.lang.Runnable r5 = r0.A08
            java.lang.String r25 = ""
            r17 = r9
            r18 = r4
            r19 = r8
            r20 = r7
            r21 = r6
            r22 = r14
            r24 = r5
            X.C46395DeI.A06(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0b14
        L_0x0909:
            X.EZn r7 = r0.A04
            if (r7 == 0) goto L_0x0b14
            X.EWV r21 = X.EWV.A0J
            X.4DU r6 = r0.A06
            java.lang.Runnable r4 = r0.A08
            r18 = r7
            r19 = r6
            r20 = r14
            r22 = r4
            r17 = r5
            X.C46395DeI.A0S(r17, r18, r19, r20, r21, r22)
            goto L_0x0b14
        L_0x0922:
            java.lang.Object r8 = r0.A06
            X.0qQ.A0C(r8, r7)
            java.lang.String r8 = (java.lang.String) r8
            X.4DU r9 = r0.A06
            java.lang.String r24 = r0.A04()
            java.lang.Runnable r6 = r0.A08
            X.0hq r4 = r5.mFragmentManager
            r25 = 2
            X.EQm r7 = new X.EQm
            r19 = r4
            r20 = r9
            r21 = r14
            r22 = r6
            r23 = r8
            r18 = r5
            r17 = r7
            r17.<init>((androidx.fragment.app.Fragment) r18, (X.0hq) r19, (X.AnonymousClass0iw) r20, (com.instagram.common.session.UserSession) r21, (java.lang.Runnable) r22, (java.lang.String) r23, (java.lang.String) r24, (int) r25)
            X.4D6 r5 = (X.AnonymousClass4D6) r5
            java.lang.Integer r6 = X.AnonymousClass05K.A0Y
            java.lang.String r4 = r9.getModuleName()
            X.1OC r4 = X.C49121Epk.A00(r14, r6, r8, r4)
            goto L_0x0987
        L_0x0955:
            java.lang.Object r9 = r0.A06
            X.0qQ.A0C(r9, r7)
            java.lang.String r9 = (java.lang.String) r9
            X.4DU r8 = r0.A06
            java.lang.String r24 = r0.A04()
            java.lang.Runnable r6 = r0.A08
            X.0hq r4 = r5.mFragmentManager
            X.EQm r7 = new X.EQm
            r19 = r4
            r20 = r8
            r21 = r14
            r22 = r6
            r23 = r9
            r25 = r11
            r18 = r5
            r17 = r7
            r17.<init>((androidx.fragment.app.Fragment) r18, (X.0hq) r19, (X.AnonymousClass0iw) r20, (com.instagram.common.session.UserSession) r21, (java.lang.Runnable) r22, (java.lang.String) r23, (java.lang.String) r24, (int) r25)
            X.4D6 r5 = (X.AnonymousClass4D6) r5
            java.lang.Integer r6 = X.AnonymousClass05K.A0Y
            java.lang.String r4 = r8.getModuleName()
            X.1OC r4 = X.C49116Epf.A00(r14, r6, r9, r4)
        L_0x0987:
            r4.A00 = r7
            r5.schedule(r4)
            goto L_0x0b14
        L_0x098e:
            java.lang.Object r7 = r0.A06
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo"
            X.0qQ.A0C(r7, r5)
            com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo r7 = (com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo) r7
            androidx.fragment.app.FragmentActivity r6 = r0.A01
            X.EWV r22 = X.EWV.A0J
            java.lang.String r23 = r0.A04()
            X.4DU r5 = r0.A06
            java.lang.String r24 = ""
            r17 = r6
            r18 = r4
            r19 = r5
            r20 = r14
            r21 = r7
            X.C46395DeI.A08(r17, r18, r19, r20, r21, r22, r23, r24)
            X.C49754F5f.A00(r14, r7, r2)
            goto L_0x0b14
        L_0x09b5:
            java.lang.Object r8 = r0.A06
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.direct.groupinvites.models.InviteLinkShareInfo"
            X.0qQ.A0C(r8, r4)
            com.instagram.direct.groupinvites.models.InviteLinkShareInfo r8 = (com.instagram.direct.groupinvites.models.InviteLinkShareInfo) r8
            X.EWV r7 = X.EWV.A0J
            androidx.fragment.app.FragmentActivity r6 = r0.A01
            java.lang.String r5 = r8.A06
            if (r5 == 0) goto L_0x0b91
            X.4DU r4 = r0.A06
            X.C46395DeI.A0M(r6, r4, r14, r7, r5)
            X.C49754F5f.A01(r14, r8, r2)
            goto L_0x0b14
        L_0x09d0:
            java.lang.Object r5 = r0.A06
            boolean r4 = r5 instanceof X.EJR
            if (r4 == 0) goto L_0x09e7
            X.EJR r5 = (X.EJR) r5
            if (r5 == 0) goto L_0x09e7
            java.lang.String r7 = r5.A01
        L_0x09dc:
            X.EWV r6 = X.EWV.A0J
            androidx.fragment.app.FragmentActivity r5 = r0.A01
            X.4DU r4 = r0.A06
            X.C46395DeI.A0M(r5, r4, r14, r6, r7)
            goto L_0x0b14
        L_0x09e7:
            r7 = r16
            goto L_0x09dc
        L_0x09ea:
            java.lang.Object r4 = r0.A06
            X.0qQ.A0C(r4, r6)
            X.3uh r4 = (X.C255773uh) r4
            X.4gL r4 = r4.A0c
            if (r4 == 0) goto L_0x0b14
            androidx.fragment.app.FragmentActivity r15 = r0.A01
            X.0hq r9 = r0.A02
            X.07i r8 = r0.A03
            com.instagram.user.model.User r21 = r4.A03()
            java.lang.String r7 = r4.A0X
            r7.getClass()
            java.lang.String r6 = r4.A0e
            r6.getClass()
            X.4DU r5 = r0.A06
            java.lang.String r25 = r0.A04()
            java.lang.Runnable r4 = r0.A08
            java.lang.String r27 = ""
            r20 = r14
            r22 = r4
            r23 = r7
            r24 = r6
            r26 = r2
            r18 = r8
            r19 = r5
            r17 = r9
            X.C46395DeI.A05(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0b14
        L_0x0a28:
            java.lang.Object r9 = r0.A06
            X.0qQ.A0C(r9, r6)
            X.3uh r9 = (X.C255773uh) r9
            boolean r4 = r9.A1J()
            if (r4 == 0) goto L_0x0a62
            androidx.fragment.app.FragmentActivity r12 = r0.A01
            X.0hq r11 = r0.A02
            java.lang.String r8 = r9.A0k
            java.lang.String r7 = r9.A0j
            com.instagram.user.model.User r9 = r9.A0i
            if (r9 == 0) goto L_0x0b96
            X.4DU r6 = r0.A06
            java.lang.String r26 = r0.A04()
            X.07i r5 = r0.A03
            java.lang.Runnable r4 = r0.A08
            r20 = r14
            r21 = r6
            r22 = r9
            r23 = r4
            r24 = r8
            r25 = r7
            r18 = r11
            r19 = r5
            r17 = r12
            X.C46395DeI.A0J(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0b14
        L_0x0a62:
            androidx.fragment.app.FragmentActivity r8 = r0.A01
            X.0hq r7 = r0.A02
            X.4DU r6 = r0.A06
            java.lang.String r24 = r0.A04()
            X.07i r5 = r0.A03
            java.lang.Runnable r4 = r0.A08
            r20 = r14
            r21 = r6
            r22 = r9
            r23 = r4
            r18 = r7
            r19 = r5
            r17 = r8
            X.C46395DeI.A0G(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0b14
        L_0x0a83:
            java.lang.Object r5 = r0.A06
            boolean r4 = r5 instanceof com.instagram.user.model.User
            if (r4 == 0) goto L_0x0b14
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            if (r5 == 0) goto L_0x0b14
            X.FAs r4 = X.C49871FAs.A00
            java.lang.String r7 = r4.A00(r14, r5)
            if (r7 == 0) goto L_0x0b14
            X.EWV r6 = X.EWV.A0J
            androidx.fragment.app.FragmentActivity r5 = r0.A01
            X.4DU r4 = r0.A06
            X.C46395DeI.A0M(r5, r4, r14, r6, r7)
            goto L_0x0b14
        L_0x0a9f:
            java.lang.Object r7 = r0.A06
            r4 = 18
            java.lang.String r4 = X.C66579MXk.A00(r4)
            X.0qQ.A0C(r7, r4)
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            X.4DU r6 = r0.A06
            java.lang.String r22 = r0.A04()
            java.lang.Runnable r4 = r0.A08
            r17 = r5
            r18 = r6
            r19 = r14
            r20 = r7
            r21 = r4
            X.C46395DeI.A0T(r17, r18, r19, r20, r21, r22)
            goto L_0x0b14
        L_0x0ac2:
            java.lang.Object r5 = r0.A06
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectCommentShareContentModel"
            X.0qQ.A0C(r5, r4)
            X.EJU r5 = (X.EJU) r5
            java.lang.String r8 = r5.A03
            if (r8 == 0) goto L_0x0b14
            androidx.fragment.app.FragmentActivity r7 = r0.A01
            X.4DU r6 = r0.A06
            android.os.Bundle r18 = X.DbX.A0D(r8)
            r5 = 2
            X.FxU r4 = new X.FxU
            r4.<init>(r8, r5)
            java.lang.String r21 = "share_to_system_sheet"
            r20 = r14
            r22 = r4
            r19 = r6
            r17 = r7
            X.C46395DeI.A0Q(r17, r18, r19, r20, r21, r22)
            goto L_0x0b14
        L_0x0aeb:
            androidx.fragment.app.FragmentActivity r9 = r0.A01
            java.lang.Object r8 = r0.A06
            r4 = 38
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            X.0qQ.A0C(r8, r4)
            X.1Xj r8 = (X.1Xj) r8
            X.3W1 r7 = r0.A07
            X.4DU r6 = r0.A06
            java.lang.String r23 = r0.A04()
            java.lang.Runnable r4 = r0.A08
            r15 = r9
            r17 = r5
            r18 = r14
            r19 = r8
            r20 = r6
            r21 = r7
            r22 = r4
            X.C46395DeI.A0P(r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0b14:
            r4 = 28
            if (r3 == r4) goto L_0x0016
            r4 = 89
            if (r3 == r4) goto L_0x0b65
            java.lang.Long r3 = r0.A02
            if (r3 != 0) goto L_0x0b62
            r3 = 0
            java.util.ArrayList r1 = r1.A01(r10, r3)
            int r3 = r1.indexOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            if (r3 < 0) goto L_0x0b35
            if (r1 == 0) goto L_0x0b35
            java.lang.Long r16 = X.DbS.A0j(r3)
        L_0x0b35:
            X.4DU r13 = r0.A06
            java.lang.String r6 = r0.A07
            java.lang.String r19 = r0.A04()
            java.lang.String r21 = r0.A03()
            java.lang.String r5 = r0.A09
            java.lang.String r4 = r0.A0A
            java.lang.String r3 = r0.A0B
            java.lang.String r25 = r0.A05()
            r15 = 0
            java.lang.Long r1 = r0.A01
            java.lang.String r0 = r0.A03
            r20 = r2
            r22 = r5
            r23 = r4
            r24 = r3
            r26 = r0
            r18 = r6
            r17 = r1
            X.C22031Xty.A07(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        L_0x0b62:
            r16 = r3
            goto L_0x0b35
        L_0x0b65:
            X.EZn r2 = r0.A04
            if (r2 == 0) goto L_0x0016
            X.EZk r1 = X.C48142EZk.SYSTEM_SHARE_SHEET
            androidx.fragment.app.FragmentActivity r0 = r0.A01
            boolean r0 = X.C267044ar.A01(r0, r14)
            X.C49947FGb.A03(r2, r1, r14, r0)
            return
        L_0x0b75:
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = r5.A00()
            r2.A02(r6, r0)
            return
        L_0x0b7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0b82:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x0b87:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x0b8c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x0b91:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0b96:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0b9b:
            android.content.Context r0 = r7.A00
            r3.A03(r0, r2)
            return
        L_0x0ba1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0ba6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0bab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0bb0:
            r0 = r1
            X.EJw r0 = (X.C47850EJw) r0
            X.G9Z r1 = r0.A01
            r0 = 0
            r1.Cu5(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49890FBq.A06(android.view.View):void");
    }

    public final void A07(C284945Oz r11, C284945Oz r12, Y43 y43) {
        if (this instanceof EK6) {
            EK6 ek6 = (EK6) this;
            AnonymousClass7TG.A1T(r11, r12, y43);
            FH6.A09(ek6.A00, new EDW(3, r11, r12, y43, ek6), ek6.A01, ek6.A02, (String) null);
            EK6.A00(r11, r12, y43, ek6);
        }
    }

    public final boolean A08() {
        if (this instanceof EK6) {
            return true;
        }
        return false;
    }
}
