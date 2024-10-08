package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;
import com.instagram.model.effect.AREffect;
import com.instagram.model.shopping.ProductAREffectContainer;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class UAO extends 2Rw {
    public static final String[] A0U = {"VIEW_PRODUCT", "SAVE_TO_WISHLIST", "SEND_PRODUCT_TO"};
    public static final String[] A0V = {"TRY_IT", "VIEW_PRODUCT", "SEND_PRODUCT_TO"};
    public ONT A00;
    public C19199WPf A01;
    public C19199WPf A02;
    public Set A03 = Collections.emptySet();
    public boolean A04;
    public Set A05;
    public final int A06;
    public final Context A07;
    public final EffectAttribution A08;
    public final UserSession A09;
    public final ImageUrl A0A;
    public final EffectInfoBottomSheetMode A0B;
    public final C306106Ku A0C;
    public final C62622Kit A0D;
    public final AREffect A0E;
    public final ProductAREffectContainer A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final List A0O;
    public final List A0P;
    public final List A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;

    private C17685VcG A00(AnonymousClass3NK r13, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, boolean z) {
        Context context = this.A07;
        Drawable drawable = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        if (bool2 != null) {
            z4 = bool2.booleanValue();
        }
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        }
        if (!z) {
            Integer num2 = num;
            if (num != null) {
                drawable = JTP.A0E(context, num2);
            }
        }
        if (bool != null) {
            z2 = bool.booleanValue();
        }
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        }
        return new C17685VcG((Drawable) null, drawable, (ImageUrl) null, r13, str, "ig_camera_end_effect_info_sheet", 1.0f, z2, z4, z3);
    }

    private C17685VcG A01(AnonymousClass3NK r9, Integer num, String str, boolean z) {
        return A00(r9, Boolean.FALSE, (Boolean) null, (Boolean) null, num, str, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: X.3ay} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: X.3ay} */
    /* JADX WARNING: type inference failed for: r9v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0402, code lost:
        r1.A01().setText(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x040b, code lost:
        if (r3.A08 != false) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x040d, code lost:
        r1.A00().setEnabled(false);
        X.DbX.A12(r7, r1.A00(), X.2Yu.A08(r7));
        X.DbY.A11(r1.A01(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0428, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0429, code lost:
        r2 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x042b, code lost:
        if (r2 == null) goto L_0x0460;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x042d, code lost:
        r18 = new X.C244303ay(r2, "ig_camera_end_effect_info_sheet", X.JTR.A06(r7), X.C13989Tnp.A0A(r7), X.DbV.A01(r7), r7.getColor(com.instagram.android.R.color.fds_transparent));
        r6 = r3.A01;
        r18 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x044d, code lost:
        if (r6 == null) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x044f, code lost:
        r1.A00().setImageDrawable(new X.C14672U0s(r6, r18, X.AnonymousClass7TE.A0B(r10)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0460, code lost:
        r1.A00().setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x046c, code lost:
        if (r3.A09 == false) goto L_0x0475;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x046e, code lost:
        r1.A01.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0475, code lost:
        r2 = new X.AnonymousClass3NG(r4);
        r2.A04 = new X.C15848UjY(r3, 30);
        r2.A07 = true;
        r2.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x048a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00c5, code lost:
        if (r2 == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x016a, code lost:
        r3 = A00(r4, false, r24, (java.lang.Boolean) null, r26, r27, r3.contains(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0254, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0256, code lost:
        r2 = r0.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0258, code lost:
        if (r2 == null) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x025c, code lost:
        if (r2.A01 != false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x025e, code lost:
        r3 = 2131953112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0265, code lost:
        if (r0.A0B != com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.A03) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0267, code lost:
        r3 = 2131953111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x026a, code lost:
        r7 = java.lang.Integer.valueOf(com.instagram.android.R.drawable.instagram_shopping_bag_pano_outline_24);
        r8 = r0.A07.getString(r3);
        r3 = A00(new X.C15848UjY(r0, 7), (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, r7, r8, r0.A03.contains("MORE_PRODUCTS"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0388, code lost:
        r5 = new X.C17685VcG((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (com.instagram.common.typedurl.ImageUrl) null, r4, r10, "ig_camera_end_effect_info_sheet", 1.0f, false, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x03be, code lost:
        r3 = A01(r8, r6, r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x03c2, code lost:
        r1 = (X.Us6) r1;
        X.0qQ.A0B(r1, 0);
        r4 = r1.A00;
        r7 = r4.getContext();
        r10 = r7.getResources();
        r2 = r3.A07;
        r0 = com.instagram.android.R.attr.igds_color_primary_icon;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x03d8, code lost:
        if (r2 == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x03da, code lost:
        r0 = com.instagram.android.R.attr.igds_color_error_or_destructive;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03dd, code lost:
        r8 = X.AnonymousClass7TF.A03(r7, r0);
        r9 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03e3, code lost:
        if (r9 == null) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03e5, code lost:
        r1.A00().setColorFilter(X.AnonymousClass37O.A00(r8));
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03f0, code lost:
        r1.A00().setImageDrawable(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03f7, code lost:
        r1.A01().setTextColor(r8);
        r2 = r3.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0400, code lost:
        if (r2 == null) goto L_0x0409;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r31, int r32) {
        /*
            r30 = this;
            r1 = r31
            X.UEW r1 = (X.UEW) r1
            r0 = r30
            java.util.List r2 = r0.A0Q
            r3 = r32
            java.lang.String r13 = X.AnonymousClass7TE.A19(r2, r3)
            int r22 = r13.hashCode()
            java.lang.String r14 = "MORE_BY_ACCOUNT"
            java.lang.String r21 = "QR_CODE"
            java.lang.String r12 = "SAVE_TO_WISHLIST"
            java.lang.String r20 = "EXPLORE_EFFECTS"
            java.lang.String r11 = "VIEW_EFFECT_PAGE"
            java.lang.String r19 = "LICENSING"
            java.lang.String r10 = "SAVE_TO_CAMERA"
            java.lang.String r9 = "EFFECT_DEBUG_INFO"
            java.lang.String r8 = "SHARE_LINK"
            java.lang.String r15 = "MORE_PRODUCTS"
            java.lang.String r18 = "TRY_IT"
            java.lang.String r7 = "SENDTO"
            java.lang.String r6 = "REPORT"
            java.lang.String r5 = "REMOVE"
            java.lang.String r4 = "SYNTHETIC_MORE_OPTIONS_EXIST"
            java.lang.String r3 = "VIEW_AR_EFFECT_ID"
            java.lang.String r2 = "SEND_PRODUCT_TO"
            r17 = 1
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r17)
            r16 = 0
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r16)
            switch(r22) {
                case -2142488318: goto L_0x039c;
                case -2080952491: goto L_0x036b;
                case -2034333242: goto L_0x0348;
                case -1881281404: goto L_0x0324;
                case -1881192140: goto L_0x02f8;
                case -1852633085: goto L_0x02d3;
                case -1811644849: goto L_0x028d;
                case -1635864818: goto L_0x0250;
                case -1273558918: goto L_0x0233;
                case -1025666392: goto L_0x01b0;
                case -354763467: goto L_0x01a8;
                case -181553881: goto L_0x017a;
                case -168254306: goto L_0x0145;
                case 367393251: goto L_0x0120;
                case 547819286: goto L_0x00e6;
                case 801319751: goto L_0x00a3;
                case 1310753099: goto L_0x0072;
                case 1813031247: goto L_0x0044;
                default: goto L_0x0043;
            }
        L_0x0043:
            return
        L_0x0044:
            boolean r2 = r13.equals(r14)
            if (r2 == 0) goto L_0x0043
            r24 = 0
            android.content.Context r4 = r0.A07
            r3 = 2131953109(0x7f1305d5, float:1.954268E38)
            java.lang.String r2 = r0.A0M
            java.lang.String r27 = X.DbW.A0h(r4, r2, r3)
            r2 = 15
            X.UjY r3 = new X.UjY
            r3.<init>(r0, r2)
            java.util.Set r2 = r0.A03
            boolean r28 = r2.contains(r14)
            r21 = r0
            r22 = r3
            r25 = r23
            r26 = r24
            X.VcG r3 = r21.A00(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x03c2
        L_0x0072:
            r2 = r21
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L_0x0043
            r2 = 2131238741(0x7f081f55, float:1.809377E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            android.content.Context r3 = r0.A07
            r2 = 2131953113(0x7f1305d9, float:1.9542688E38)
            java.lang.String r9 = r3.getString(r2)
            r5 = 0
            r2 = 13
            X.UjY r4 = new X.UjY
            r4.<init>(r0, r2)
            java.util.Set r3 = r0.A03
            r2 = r21
            boolean r10 = r3.contains(r2)
            r3 = r0
            r6 = r5
            r7 = r5
            X.VcG r3 = r3.A00(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x03c2
        L_0x00a3:
            boolean r2 = r13.equals(r12)
            if (r2 == 0) goto L_0x0043
            com.instagram.model.shopping.ProductAREffectContainer r2 = r0.A0F
            if (r2 == 0) goto L_0x00c7
            com.instagram.model.shopping.ProductItemWithAR r2 = r2.A00
            com.instagram.user.model.ProductDetailsProductItemDict r2 = r2.A01
            com.instagram.user.model.Product r3 = X.C14502TxO.A00(r2)
            com.instagram.common.session.UserSession r2 = r0.A09
            X.6xb r2 = X.C323496xa.A00(r2)
            boolean r2 = r2.A03(r3)
            r4 = 2131238735(0x7f081f4f, float:1.8093757E38)
            r3 = 2131953119(0x7f1305df, float:1.95427E38)
            if (r2 != 0) goto L_0x00cd
        L_0x00c7:
            r4 = 2131238737(0x7f081f51, float:1.8093761E38)
            r3 = 2131953117(0x7f1305dd, float:1.9542696E38)
        L_0x00cd:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            android.content.Context r2 = r0.A07
            java.lang.String r9 = r2.getString(r3)
            X.UjV r8 = new X.UjV
            r2 = r16
            r8.<init>(r2, r0, r1)
            java.util.Set r2 = r0.A03
            boolean r2 = r2.contains(r12)
            goto L_0x03be
        L_0x00e6:
            r2 = r20
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L_0x0043
            com.instagram.common.session.UserSession r3 = r0.A09
            r2 = r16
            X.0qQ.A0B(r3, r2)
            java.lang.Boolean r2 = X.C306096Kt.A00(r3)
            boolean r3 = r2.booleanValue()
            r2 = 2131238821(0x7f081fa5, float:1.8093932E38)
            if (r3 == 0) goto L_0x0105
            r2 = 2131238252(0x7f081d6c, float:1.8092777E38)
        L_0x0105:
            java.lang.Integer r26 = java.lang.Integer.valueOf(r2)
            android.content.Context r3 = r0.A07
            r2 = 2131954275(0x7f130a63, float:1.9545045E38)
            java.lang.String r27 = r3.getString(r2)
            r24 = 0
            r2 = 14
            X.UjY r4 = new X.UjY
            r4.<init>(r0, r2)
            java.util.Set r3 = r0.A03
            r2 = r20
            goto L_0x016a
        L_0x0120:
            boolean r2 = r13.equals(r11)
            if (r2 == 0) goto L_0x0043
            r2 = 2131238246(0x7f081d66, float:1.8092765E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            android.content.Context r3 = r0.A07
            r2 = 2131953124(0x7f1305e4, float:1.954271E38)
            java.lang.String r9 = r3.getString(r2)
            r2 = 16
            X.UjY r8 = new X.UjY
            r8.<init>(r0, r2)
            java.util.Set r2 = r0.A03
            boolean r2 = r2.contains(r11)
            goto L_0x03be
        L_0x0145:
            r2 = r19
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L_0x0043
            r2 = 2131238491(0x7f081e5b, float:1.8093262E38)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r2)
            android.content.Context r3 = r0.A07
            r2 = 2131953108(0x7f1305d4, float:1.9542678E38)
            java.lang.String r27 = r3.getString(r2)
            r24 = 0
            r2 = 11
            X.UjY r4 = new X.UjY
            r4.<init>(r0, r2)
            java.util.Set r3 = r0.A03
            r2 = r19
        L_0x016a:
            boolean r28 = r3.contains(r2)
            r21 = r0
            r22 = r4
            r25 = r23
            X.VcG r3 = r21.A00(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x03c2
        L_0x017a:
            boolean r2 = r13.equals(r10)
            if (r2 == 0) goto L_0x0043
            boolean r4 = r0.A04
            r2 = 2131238737(0x7f081f51, float:1.8093761E38)
            r3 = 2131953116(0x7f1305dc, float:1.9542694E38)
            if (r4 == 0) goto L_0x0190
            r2 = 2131238735(0x7f081f4f, float:1.8093757E38)
            r3 = 2131953118(0x7f1305de, float:1.9542698E38)
        L_0x0190:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            android.content.Context r2 = r0.A07
            java.lang.String r9 = r2.getString(r3)
            r2 = 2
            X.UjV r8 = new X.UjV
            r8.<init>(r2, r0, r1)
            java.util.Set r2 = r0.A03
            boolean r2 = r2.contains(r10)
            goto L_0x03be
        L_0x01a8:
            java.lang.String r2 = "VIEW_PRODUCT"
            boolean r2 = r13.equals(r2)
            goto L_0x0254
        L_0x01b0:
            boolean r2 = r13.equals(r9)
            if (r2 == 0) goto L_0x0043
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = "Required SDK Version: \n"
            java.lang.String r2 = r0.A0N
            java.lang.String r4 = "\n\n"
            java.lang.String r2 = X.002.A0g(r3, r2, r4)
            r5.append(r2)
            java.lang.String r3 = "Best Instance ID: \n"
            java.lang.String r2 = r0.A0G
            java.lang.String r2 = X.002.A0g(r3, r2, r4)
            r5.append(r2)
            java.lang.String r2 = "Capability with Min Version:\n"
            r5.append(r2)
            java.util.List r2 = r0.A0P
            java.lang.String r7 = "\n"
            if (r2 == 0) goto L_0x0209
            java.util.Iterator r6 = r2.iterator()
        L_0x01e2:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0209
            java.lang.Object r4 = r6.next()
            com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling r4 = (com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling) r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.facebook.cameracore.ardelivery.model.VersionedCapability r2 = r4.mCapability
            r3.append(r2)
            java.lang.String r2 = ": "
            r3.append(r2)
            int r2 = r4.mMinVersion
            r3.append(r2)
            r3.append(r7)
            X.Pxf.A1O(r5, r3)
            goto L_0x01e2
        L_0x0209:
            java.lang.String r2 = "\n\nCapabilities:\n"
            r5.append(r2)
            java.util.List r2 = r0.A0O
            if (r2 == 0) goto L_0x0230
            java.lang.String r2 = X.C2612548w.A00(r7, r2)
        L_0x0216:
            r5.append(r2)
            android.content.Context r3 = r0.A07
            r2 = 2131953127(0x7f1305e7, float:1.9542716E38)
            java.lang.String r10 = r3.getString(r2)
            X.UjV r4 = new X.UjV
            r2 = r17
            r4.<init>(r2, r0, r5)
            java.util.Set r0 = r0.A03
            r0.contains(r9)
            goto L_0x0388
        L_0x0230:
            java.lang.String r2 = ""
            goto L_0x0216
        L_0x0233:
            boolean r2 = r13.equals(r8)
            if (r2 == 0) goto L_0x0043
            android.content.Context r3 = r0.A07
            r2 = 2131953131(0x7f1305eb, float:1.9542724E38)
            java.lang.String r10 = r3.getString(r2)
            r2 = 8
            X.UjY r4 = new X.UjY
            r4.<init>(r0, r2)
            java.util.Set r0 = r0.A03
            r0.contains(r8)
            goto L_0x0388
        L_0x0250:
            boolean r2 = r13.equals(r15)
        L_0x0254:
            if (r2 == 0) goto L_0x0043
            com.instagram.model.shopping.ProductAREffectContainer r2 = r0.A0F
            if (r2 == 0) goto L_0x025e
            boolean r2 = r2.A01
            if (r2 != 0) goto L_0x0267
        L_0x025e:
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r4 = r0.A0B
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r2 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.SHOPPING_TEST
            r3 = 2131953112(0x7f1305d8, float:1.9542686E38)
            if (r4 != r2) goto L_0x026a
        L_0x0267:
            r3 = 2131953111(0x7f1305d7, float:1.9542684E38)
        L_0x026a:
            r2 = 2131238789(0x7f081f85, float:1.8093867E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            android.content.Context r2 = r0.A07
            java.lang.String r8 = r2.getString(r3)
            r4 = 0
            r2 = 7
            X.UjY r3 = new X.UjY
            r3.<init>(r0, r2)
            java.util.Set r2 = r0.A03
            boolean r9 = r2.contains(r15)
            r2 = r0
            r5 = r4
            r6 = r4
            X.VcG r3 = r2.A00(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x03c2
        L_0x028d:
            r2 = r18
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L_0x0043
            r2 = 2131238040(0x7f081c98, float:1.8092347E38)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r2)
            android.content.Context r3 = r0.A07
            r2 = 2131953123(0x7f1305e3, float:1.9542708E38)
            java.lang.String r27 = r3.getString(r2)
            X.6Ku r3 = r0.A0C
            X.6Ku r2 = X.C306106Ku.SUPERZOOM
            if (r3 == r2) goto L_0x02d1
            X.6Ku r2 = X.C306106Ku.SUPERZOOM_V3
            if (r3 == r2) goto L_0x02d1
            boolean r2 = r0.A0R
        L_0x02b1:
            r2 = r2 ^ 1
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r2)
            r25 = 0
            r2 = 4
            X.UjY r4 = new X.UjY
            r4.<init>(r0, r2)
            java.util.Set r3 = r0.A03
            r2 = r18
            boolean r28 = r3.contains(r2)
            r21 = r0
            r22 = r4
            X.VcG r3 = r21.A00(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x03c2
        L_0x02d1:
            r2 = 1
            goto L_0x02b1
        L_0x02d3:
            boolean r2 = r13.equals(r7)
            if (r2 == 0) goto L_0x0043
            r2 = 2131238210(0x7f081d42, float:1.8092692E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            android.content.Context r3 = r0.A07
            r2 = 2131953121(0x7f1305e1, float:1.9542704E38)
            java.lang.String r9 = r3.getString(r2)
            r2 = 12
            X.UjY r8 = new X.UjY
            r8.<init>(r0, r2)
            java.util.Set r2 = r0.A03
            boolean r2 = r2.contains(r7)
            goto L_0x03be
        L_0x02f8:
            boolean r2 = r13.equals(r6)
            if (r2 == 0) goto L_0x0043
            r25 = 0
            android.content.Context r3 = r0.A07
            r2 = 2131953115(0x7f1305db, float:1.9542692E38)
            java.lang.String r28 = r3.getString(r2)
            r2 = 10
            X.UjY r3 = new X.UjY
            r3.<init>(r0, r2)
            java.util.Set r2 = r0.A03
            boolean r29 = r2.contains(r6)
            r22 = r0
            r23 = r3
            r26 = r24
            r27 = r25
            X.VcG r3 = r22.A00(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x03c2
        L_0x0324:
            boolean r2 = r13.equals(r5)
            if (r2 == 0) goto L_0x0043
            r2 = 2131238196(0x7f081d34, float:1.8092664E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            android.content.Context r3 = r0.A07
            r2 = 2131953114(0x7f1305da, float:1.954269E38)
            java.lang.String r9 = r3.getString(r2)
            r2 = 17
            X.KHt r8 = new X.KHt
            r8.<init>(r0, r2)
            java.util.Set r2 = r0.A03
            boolean r2 = r2.contains(r5)
            goto L_0x03be
        L_0x0348:
            boolean r2 = r13.equals(r4)
            if (r2 == 0) goto L_0x0043
            r2 = 2131238564(0x7f081ea4, float:1.809341E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            android.content.Context r3 = r0.A07
            r2 = 2131953110(0x7f1305d6, float:1.9542682E38)
            java.lang.String r9 = r3.getString(r2)
            r2 = 5
            X.UjY r8 = new X.UjY
            r8.<init>(r0, r2)
            java.util.Set r2 = r0.A03
            boolean r2 = r2.contains(r4)
            goto L_0x03be
        L_0x036b:
            boolean r2 = r13.equals(r3)
            if (r2 == 0) goto L_0x0043
            android.content.Context r5 = r0.A07
            r4 = 2131953128(0x7f1305e8, float:1.9542718E38)
            java.lang.String r2 = r0.A0H
            java.lang.String r10 = X.DbW.A0h(r5, r2, r4)
            r2 = 9
            X.UjY r4 = new X.UjY
            r4.<init>(r0, r2)
            java.util.Set r0 = r0.A03
            r0.contains(r3)
        L_0x0388:
            java.lang.String r11 = "ig_camera_end_effect_info_sheet"
            r6 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            X.VcG r3 = new X.VcG
            r7 = r6
            r8 = r6
            r13 = r16
            r14 = r17
            r15 = r13
            r9 = r4
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x03c2
        L_0x039c:
            boolean r3 = r13.equals(r2)
            if (r3 == 0) goto L_0x0043
            r3 = 2131238210(0x7f081d42, float:1.8092692E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            android.content.Context r4 = r0.A07
            r3 = 2131953120(0x7f1305e0, float:1.9542702E38)
            java.lang.String r9 = r4.getString(r3)
            r3 = 6
            X.UjY r8 = new X.UjY
            r8.<init>(r0, r3)
            java.util.Set r3 = r0.A03
            boolean r2 = r3.contains(r2)
        L_0x03be:
            X.VcG r3 = r0.A01(r8, r6, r9, r2)
        L_0x03c2:
            X.Us6 r1 = (X.Us6) r1
            r0 = r16
            X.0qQ.A0B(r1, r0)
            android.view.View r4 = r1.A00
            android.content.Context r7 = r4.getContext()
            android.content.res.Resources r10 = r7.getResources()
            boolean r2 = r3.A07
            r0 = 2130970273(0x7f0406a1, float:1.7549251E38)
            if (r2 == 0) goto L_0x03dd
            r0 = 2130970215(0x7f040667, float:1.7549134E38)
        L_0x03dd:
            int r8 = X.AnonymousClass7TF.A03(r7, r0)
            android.graphics.drawable.Drawable r9 = r3.A02
            if (r9 == 0) goto L_0x0429
            android.widget.ImageView r2 = r1.A00()
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r8)
            r2.setColorFilter(r0)
        L_0x03f0:
            android.widget.ImageView r0 = r1.A00()
            r0.setImageDrawable(r9)
        L_0x03f7:
            android.widget.TextView r0 = r1.A01()
            r0.setTextColor(r8)
            java.lang.String r2 = r3.A05
            if (r2 == 0) goto L_0x0409
            android.widget.TextView r0 = r1.A01()
            r0.setText(r2)
        L_0x0409:
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x046a
            android.widget.ImageView r2 = r1.A00()
            r0 = r16
            r2.setEnabled(r0)
            android.widget.ImageView r2 = r1.A00()
            int r0 = X.2Yu.A08(r7)
            X.DbX.A12(r7, r2, r0)
            android.widget.TextView r0 = r1.A01()
            X.DbY.A11(r0, r7)
            return
        L_0x0429:
            com.instagram.common.typedurl.ImageUrl r2 = r3.A03
            if (r2 == 0) goto L_0x0460
            int r21 = X.JTR.A06(r7)
            int r22 = X.C13989Tnp.A0A(r7)
            int r23 = X.DbV.A01(r7)
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r24 = r7.getColor(r0)
            java.lang.String r20 = "ig_camera_end_effect_info_sheet"
            X.3ay r9 = new X.3ay
            r18 = r9
            r19 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24)
            android.graphics.drawable.Drawable r6 = r3.A01
            if (r6 == 0) goto L_0x03f0
            android.widget.ImageView r5 = r1.A00()
            int r2 = X.AnonymousClass7TE.A0B(r10)
            X.U0s r0 = new X.U0s
            r0.<init>(r6, r9, r2)
            r5.setImageDrawable(r0)
            goto L_0x03f7
        L_0x0460:
            android.widget.ImageView r2 = r1.A00()
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x03f7
        L_0x046a:
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0475
            android.view.View r1 = r1.A01
            r0 = r16
            r1.setVisibility(r0)
        L_0x0475:
            X.3NG r2 = new X.3NG
            r2.<init>(r4)
            r1 = 30
            X.UjY r0 = new X.UjY
            r0.<init>(r3, r1)
            r2.A04 = r0
            r0 = r17
            r2.A07 = r0
            r2.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAO.onBindViewHolder(X.3kE, int):void");
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r4) {
        UEW uew = (UEW) r4;
        if (uew instanceof Us6) {
            Us6 us6 = (Us6) uew;
            DbY.A12(us6.A01(), us6.A00.getContext());
            us6.A00().setImageResource(R.color.fds_transparent);
            return;
        }
        Us7 us7 = (Us7) uew;
        us7.A02.setTextColor(-16777216);
        ImageView imageView = us7.A01;
        imageView.setImageResource(R.color.fds_transparent);
        DbU.A11(imageView.getContext(), imageView, R.drawable.action_button_ring);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00aa, code lost:
        if (r4 == com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.A03) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UAO(android.content.Context r16, com.instagram.common.session.UserSession r17, com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration r18, java.util.List r19, java.util.List r20, int r21, boolean r22) {
        /*
            r15 = this;
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r15.A0Q = r8
            java.util.Set r0 = java.util.Collections.emptySet()
            r15.A03 = r0
            r1 = r16
            r15.A07 = r1
            r9 = r22
            r15.A0T = r9
            r3 = r18
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r4 = r3.A01
            if (r4 != 0) goto L_0x0020
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r4 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.NORMAL
        L_0x0020:
            r15.A0B = r4
            com.instagram.model.effect.AREffect r2 = r3.A04
            r15.A0E = r2
            java.lang.String r7 = r2.getId()
            r15.A0H = r7
            java.lang.String r0 = r3.A08
            r15.A0J = r0
            java.util.List r0 = r2.A08()
            r15.A0O = r0
            com.instagram.model.effect.AREffect r2 = r3.A04
            java.lang.String r0 = r2.A07()
            r15.A0N = r0
            java.util.List r0 = r2.A09()
            r15.A0P = r0
            java.lang.String r0 = r2.A06()
            r15.A0I = r0
            java.lang.String r0 = r2.A05()
            r15.A0K = r0
            com.instagram.common.typedurl.ImageUrl r0 = r2.A01()
            r15.A0A = r0
            java.lang.String r10 = r2.A02()
            r15.A0L = r10
            java.lang.String r0 = r3.A06
            r15.A0M = r0
            java.lang.String r0 = r3.A09
            boolean r11 = X.AnonymousClass7TF.A1V(r0)
            r15.A0R = r11
            X.6Ku r0 = r3.A02
            r15.A0C = r0
            boolean r0 = r2.CbC()
            r15.A04 = r0
            com.instagram.model.shopping.ProductAREffectContainer r5 = r3.A05
            r15.A0F = r5
            r2 = r21
            r15.A06 = r2
            X.Kit r0 = r3.A03
            r15.A0D = r0
            com.instagram.model.effect.AREffect r0 = r3.A04
            java.lang.String r0 = r0.A04()
            r15.A0G = r0
            boolean r0 = r3.A0A
            r15.A0S = r0
            r12 = r19
            boolean r0 = r12.isEmpty()
            r6 = r20
            if (r0 == 0) goto L_0x00a3
            if (r20 == 0) goto L_0x009c
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00a3
        L_0x009c:
            java.lang.String r13 = "EffectInfoOptionsAdapter"
            java.lang.String r0 = "server returned no primary actions"
            X.0kD.A01(r13, r0)
        L_0x00a3:
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r0 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.SHOPPING
            if (r4 == r0) goto L_0x00ac
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r0 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.SHOPPING_TEST
            r14 = 0
            if (r4 != r0) goto L_0x00ad
        L_0x00ac:
            r14 = 1
        L_0x00ad:
            if (r14 == 0) goto L_0x029d
            switch(r21) {
                case 0: goto L_0x0290;
                case 1: goto L_0x0290;
                case 2: goto L_0x0290;
                case 3: goto L_0x0290;
                case 4: goto L_0x028d;
                case 5: goto L_0x028d;
                case 6: goto L_0x00b2;
                case 7: goto L_0x0290;
                case 8: goto L_0x028d;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            java.lang.String r0 = "Unknown entry point for shopping: "
            java.lang.String r2 = X.002.A0O(r0, r2)
            java.lang.String r0 = "EffectInfoOptionsAdapter"
            X.0kD.A01(r0, r2)
            java.util.Set r2 = java.util.Collections.emptySet()
        L_0x00c1:
            r15.A05 = r2
            if (r20 == 0) goto L_0x00cc
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r6)
            r15.A03 = r0
        L_0x00cc:
            r6 = r17
            r15.A09 = r6
            X.ONT r0 = new X.ONT
            r0.<init>(r6)
            r15.A00 = r0
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution r2 = r3.A00
            r15.A08 = r2
            java.util.Set r0 = r15.A05
            java.lang.String r12 = "VIEW_PRODUCT"
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto L_0x00e8
            r8.add(r12)
        L_0x00e8:
            java.lang.String r12 = "25025320"
            if (r11 != 0) goto L_0x0112
            java.util.Set r0 = r15.A05
            java.lang.String r13 = "SAVE_TO_CAMERA"
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto L_0x0112
            boolean r0 = X.C305756Jk.A00(r1)
            if (r0 == 0) goto L_0x0112
            boolean r0 = r12.equals(r10)
            if (r0 != 0) goto L_0x010f
            X.0Tu r11 = X.0Tu.A05
            r0 = 36324784690246002(0x810d3300013172, double:3.035278334054664E-306)
            boolean r0 = X.182.A06(r11, r6, r0)
            if (r0 != 0) goto L_0x0112
        L_0x010f:
            r8.add(r13)
        L_0x0112:
            java.util.Set r0 = r15.A05
            java.lang.String r11 = "TRY_IT"
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x0132
            boolean r0 = r12.equals(r10)
            if (r0 != 0) goto L_0x012f
            X.0Tu r10 = X.0Tu.A05
            r0 = 36324784690246002(0x810d3300013172, double:3.035278334054664E-306)
            boolean r0 = X.182.A06(r10, r6, r0)
            if (r0 != 0) goto L_0x0132
        L_0x012f:
            r8.add(r11)
        L_0x0132:
            java.util.Set r0 = r15.A05
            java.lang.String r1 = "VIEW_EFFECT_PAGE"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x013f
            r8.add(r1)
        L_0x013f:
            java.util.Set r0 = r15.A05
            java.lang.String r1 = "SAVE_TO_WISHLIST"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0156
            if (r5 == 0) goto L_0x0156
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0156
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r0 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.SHOPPING_TEST
            if (r4 == r0) goto L_0x0156
            r8.add(r1)
        L_0x0156:
            java.util.Set r0 = r15.A05
            java.lang.String r1 = "SENDTO"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0163
            r8.add(r1)
        L_0x0163:
            java.util.Set r0 = r15.A05
            java.lang.String r1 = "SEND_PRODUCT_TO"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x017a
            if (r5 == 0) goto L_0x017a
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x017a
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r0 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.SHOPPING_TEST
            if (r4 == r0) goto L_0x017a
            r8.add(r1)
        L_0x017a:
            boolean r0 = X.C14290TtO.A00(r6)
            if (r0 == 0) goto L_0x0185
            java.lang.String r0 = "QR_CODE"
            r8.add(r0)
        L_0x0185:
            java.util.Set r0 = r15.A03
            java.lang.String r6 = "MORE_BY_ACCOUNT"
            r0.add(r6)
            java.util.Set r0 = r15.A05
            java.lang.String r5 = "LICENSING"
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x01a0
            if (r2 == 0) goto L_0x01a0
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution$License[] r0 = r2.mLicenses
            int r0 = r0.length
            if (r0 <= 0) goto L_0x01a0
            r8.add(r5)
        L_0x01a0:
            java.lang.String r2 = "REPORT"
            r8.add(r2)
            java.util.Set r0 = r15.A03
            r0.remove(r2)
            java.util.Set r0 = r15.A05
            java.lang.String r4 = "REMOVE"
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x01bf
            if (r7 == 0) goto L_0x01bf
            if (r22 != 0) goto L_0x01bf
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x01bf
            r8.add(r4)
        L_0x01bf:
            java.util.Set r1 = r15.A03
            java.lang.String r0 = "FOLLOW"
            r1.remove(r0)
            if (r14 == 0) goto L_0x01e0
            java.util.Set r0 = r15.A03
            r0.remove(r4)
            java.util.Set r1 = r15.A03
            java.lang.String r0 = "EXPLORE_EFFECTS"
            r1.remove(r0)
            java.util.Set r0 = r15.A03
            r0.remove(r6)
            java.util.Set r1 = r15.A03
            java.lang.String r0 = "SHARE_LINK"
            r1.remove(r0)
        L_0x01e0:
            int r1 = r15.A06
            r0 = 10
            if (r1 == r0) goto L_0x01ea
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x01ef
        L_0x01ea:
            java.util.Set r0 = r15.A03
            r0.remove(r4)
        L_0x01ef:
            com.instagram.common.session.UserSession r3 = r15.A09
            boolean r0 = X.1CI.A00(r3)
            java.lang.String r1 = "VIEW_AR_EFFECT_ID"
            if (r0 != 0) goto L_0x0201
            java.util.Set r0 = r15.A03
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x020a
        L_0x0201:
            java.lang.String r0 = r15.A0H
            if (r0 == 0) goto L_0x020a
            java.util.List r0 = r15.A0Q
            r0.add(r1)
        L_0x020a:
            boolean r0 = X.1CI.A00(r3)
            java.lang.String r8 = "EFFECT_DEBUG_INFO"
            if (r0 != 0) goto L_0x021a
            java.util.Set r0 = r15.A03
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0230
        L_0x021a:
            X.ONT r0 = r15.A00
            com.instagram.common.session.UserSession r7 = r0.A00
            X.0Tu r3 = X.0Tu.A06
            r0 = 36310903357899126(0x810093001f0176, double:3.0264997235828606E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            if (r0 == 0) goto L_0x0230
            java.util.List r0 = r15.A0Q
            r0.add(r8)
        L_0x0230:
            java.util.Set r3 = r15.A03
            java.lang.String r1 = "SHARE_LINK"
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L_0x0243
            java.lang.String r0 = r15.A0H
            if (r0 == 0) goto L_0x0243
            java.util.List r0 = r15.A0Q
            r0.add(r1)
        L_0x0243:
            boolean r0 = r3.contains(r6)
            if (r0 == 0) goto L_0x0252
            java.lang.String r0 = r15.A0L
            if (r0 == 0) goto L_0x0252
            java.util.List r0 = r15.A0Q
            r0.add(r6)
        L_0x0252:
            java.lang.String r1 = "EXPLORE_EFFECTS"
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L_0x025f
            java.util.List r0 = r15.A0Q
            r0.add(r1)
        L_0x025f:
            boolean r0 = r3.contains(r5)
            if (r0 == 0) goto L_0x026e
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution r0 = r15.A08
            if (r0 == 0) goto L_0x026e
            java.util.List r0 = r15.A0Q
            r0.add(r5)
        L_0x026e:
            boolean r0 = r3.contains(r4)
            if (r0 == 0) goto L_0x027d
            java.lang.String r0 = r15.A0H
            if (r0 == 0) goto L_0x027d
            java.util.List r0 = r15.A0Q
            r0.add(r4)
        L_0x027d:
            boolean r0 = r3.contains(r2)
            if (r0 == 0) goto L_0x028c
            java.lang.String r0 = r15.A0H
            if (r0 == 0) goto L_0x028c
            java.util.List r0 = r15.A0Q
            r0.add(r2)
        L_0x028c:
            return
        L_0x028d:
            java.lang.String[] r0 = A0V
            goto L_0x0292
        L_0x0290:
            java.lang.String[] r0 = A0U
        L_0x0292:
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            goto L_0x00c1
        L_0x029d:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r12)
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAO.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration, java.util.List, java.util.List, int, boolean):void");
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-545258054);
        int size = this.A0Q.size();
        AnonymousClass0fD.A0A(1714305876, A032);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new Us6(DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.effect_bottomsheet_action_button_row));
    }
}
