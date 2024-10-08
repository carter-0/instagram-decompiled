package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.OnG  reason: case insensitive filesystem */
public final class C71579OnG implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public static Integer A03(C250663lr r4) {
        if (r4.hasFieldValue("vesta_error_code")) {
            return Integer.valueOf(r4.getCoercedIntField(0, "vesta_error_code"));
        }
        return null;
    }

    public C71579OnG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static N0K A00(Integer num, String str) {
        return new N0K(new C69542Nnm(str, num));
    }

    public static N0M A01(Integer num, String str) {
        return new N0M(new C69543Nnn(str, num));
    }

    public static C69545Nnp A02(Integer num, String str) {
        return new C69545Nnp(num, new Throwable(str));
    }

    /* JADX WARNING: type inference failed for: r4v11, types: [X.OAa, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:244|245|246|247|248|249|(1:251)|252|253|(1:255)|256|257|258) */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:361|362|363|364|365|366|(1:368)|369|370|(1:372)|373|374|375) */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:481|482|483|484|485|486|(1:488)|489|490|(1:492)|493|494|495) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:359|360|361|362|363|364|365|366|(1:368)|369|370|(1:372)|373|374|375) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:479|480|481|482|483|484|485|486|(1:488)|489|490|(1:492)|493|494|495) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:612|613|614|615|616|617|618|619|(1:621)|622|623|(1:625)|626|627|628) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0109, code lost:
        if (r1 != null) goto L_0x010f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:252:0x06d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:256:0x06de */
    /* JADX WARNING: Missing exception handler attribute for start block: B:369:0x0a7a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:373:0x0a87 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:489:0x0dfe */
    /* JADX WARNING: Missing exception handler attribute for start block: B:493:0x0e0b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:622:0x11c1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:626:0x11ce */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x06d5 A[Catch:{ UnsupportedOperationException -> 0x06de }] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0a7e A[Catch:{ UnsupportedOperationException -> 0x0a87 }] */
    /* JADX WARNING: Removed duplicated region for block: B:492:0x0e02 A[Catch:{ UnsupportedOperationException -> 0x0e0b }] */
    /* JADX WARNING: Removed duplicated region for block: B:625:0x11c5 A[Catch:{ UnsupportedOperationException -> 0x11ce }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r27) {
        /*
            r26 = this;
            r0 = r26
            int r1 = r0.A00
            r2 = r27
            switch(r1) {
                case 0: goto L_0x104b;
                case 1: goto L_0x0e85;
                case 2: goto L_0x0b40;
                case 3: goto L_0x08f3;
                case 4: goto L_0x07b4;
                case 5: goto L_0x045c;
                case 6: goto L_0x0450;
                case 7: goto L_0x03fd;
                case 8: goto L_0x03b4;
                case 9: goto L_0x02a7;
                case 10: goto L_0x0073;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r0.A02
            X.OHP r1 = (X.OHP) r1
            java.lang.Object r3 = r0.A01
            X.OVz r3 = (X.C71002OVz) r3
            if (r27 == 0) goto L_0x03fc
            java.lang.Object r0 = r2.Bny()
            X.C7e r0 = (X.C43734C7e) r0
            if (r0 == 0) goto L_0x03fc
            X.C7d r0 = r0.A0E()
            if (r0 == 0) goto L_0x03fc
            com.google.common.collect.ImmutableList r0 = r0.A0E()
            if (r0 == 0) goto L_0x03fc
            java.lang.Object r2 = X.00k.A0J(r0)
            X.3lr r2 = (X.C250663lr) r2
            if (r2 == 0) goto L_0x03fc
            java.lang.String r0 = "strong_id__"
            java.lang.String r9 = r2.A07(r0)
            if (r9 != 0) goto L_0x0039
            java.lang.String r9 = ""
        L_0x0039:
            java.lang.String r10 = r3.A00
            java.lang.String r0 = "url"
            java.lang.String r0 = r2.A08(r0)
            com.instagram.common.typedurl.SimpleImageUrl r8 = X.DbS.A0V(r0)
            r11 = 1123549184(0x42f80000, float:124.0)
            r13 = 1065353216(0x3f800000, float:1.0)
            r12 = r11
            X.6o8 r5 = X.C317966o8.A00(r8, r9, r10, r11, r12, r13)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r5)
            com.instagram.common.session.UserSession r8 = r1.A02
            X.0iw r7 = r1.A01
            X.0qQ.A06(r10)
            java.util.ArrayList r13 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0061:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03c9
            java.lang.Object r0 = r2.next()
            X.6o8 r0 = (X.C317966o8) r0
            java.lang.String r0 = r0.A0S
            r13.add(r0)
            goto L_0x0061
        L_0x0073:
            java.lang.Object r14 = r0.A02
            X.NKI r14 = (X.NKI) r14
            androidx.fragment.app.FragmentActivity r1 = r14.getActivity()
            if (r1 == 0) goto L_0x03fc
            boolean r1 = r14.isAdded()
            if (r1 == 0) goto L_0x03fc
            boolean r1 = r14.mDetached
            if (r1 != 0) goto L_0x03fc
            X.3lr r4 = X.C41845B3m.A0U(r2)
            if (r4 == 0) goto L_0x03fc
            java.lang.Class<com.instagram.direct.request.graphql.IGGetThemePreviewResponseImpl$XdtThemePreview> r3 = com.instagram.direct.request.graphql.IGGetThemePreviewResponseImpl.XdtThemePreview.class
            X.3sh r1 = X.C250663lr.Companion
            r2 = 1568985831(0x5d84d2e7, float:1.19637077E18)
            r6 = 0
            java.lang.String r1 = "xdt_theme_preview(theme_id:$theme_id)"
            X.3lr r13 = r4.getOptionalTreeField(r6, r1, r3, r2)
            com.instagram.direct.request.graphql.IGGetThemePreviewResponseImpl$XdtThemePreview r13 = (com.instagram.direct.request.graphql.IGGetThemePreviewResponseImpl.XdtThemePreview) r13
            if (r13 == 0) goto L_0x03fc
            java.lang.Object r0 = r0.A01
            com.instagram.direct.model.DirectThreadThemeInfo r0 = (com.instagram.direct.model.DirectThreadThemeInfo) r0
            java.lang.Class<com.instagram.direct.request.graphql.ThreadThemeImpl> r12 = com.instagram.direct.request.graphql.ThreadThemeImpl.class
            r4 = -158150994(0xfffffffff692ceae, float:-1.4888033E33)
            r1 = 2
            X.3lr r3 = r13.reinterpretRequired(r1, r12, r4)
            com.instagram.direct.request.graphql.ThreadThemeImpl r3 = (com.instagram.direct.request.graphql.ThreadThemeImpl) r3
            java.lang.String r11 = "incoming_message_bubble_color"
            java.lang.String r1 = r3.A0B(r11)
            r0.A0c = r1
            r1 = 833(0x341, float:1.167E-42)
            java.lang.String r10 = X.C273654mx.A00(r1)
            java.lang.String r1 = r3.A0D(r10)
            r0.A0d = r1
            r1 = 13
            java.lang.String r9 = "solid_composer_background_color"
            java.lang.String r1 = r3.getOptionalStringField(r1, r9)
            r0.A0a = r1
            r1 = 11
            java.lang.String r8 = "secondary_text_color"
            java.lang.String r1 = r3.getOptionalStringField(r1, r8)
            r0.A0V = r1
            java.lang.String r7 = "outbound_message_text_color"
            java.lang.String r1 = r3.A0A(r7)
            r0.A0Y = r1
            r1 = 14
            java.lang.String r5 = "thread_background_color"
            java.lang.String r1 = r3.getOptionalStringField(r1, r5)
            r0.A0Z = r1
            r1 = 9
            java.lang.String r2 = "navigation_bar_subtitle_color"
            java.lang.String r1 = r3.getOptionalStringField(r1, r2)
            r0.A0e = r1
            com.google.common.collect.ImmutableList r1 = r13.A0E()
            java.lang.Object r1 = X.00k.A0J(r1)
            X.3lr r1 = (X.C250663lr) r1
            if (r1 == 0) goto L_0x0245
            X.3lr r4 = r1.A01(r12, r4)
            if (r4 == 0) goto L_0x010b
            java.lang.String r1 = r4.A0B(r11)
            if (r1 != 0) goto L_0x010f
        L_0x010b:
            java.lang.String r1 = r3.A0B(r11)
        L_0x010f:
            r0.A0N = r1
            if (r4 == 0) goto L_0x0119
            java.lang.String r1 = r4.A0D(r10)
            if (r1 != 0) goto L_0x011d
        L_0x0119:
            java.lang.String r1 = r3.A0D(r10)
        L_0x011d:
            r0.A0O = r1
            if (r4 == 0) goto L_0x0129
            r1 = 13
            java.lang.String r1 = r4.getOptionalStringField(r1, r9)
            if (r1 != 0) goto L_0x012f
        L_0x0129:
            r1 = 13
            java.lang.String r1 = r3.getOptionalStringField(r1, r9)
        L_0x012f:
            r0.A0L = r1
            if (r4 == 0) goto L_0x013b
            r1 = 11
            java.lang.String r1 = r4.getOptionalStringField(r1, r8)
            if (r1 != 0) goto L_0x0141
        L_0x013b:
            r1 = 11
            java.lang.String r1 = r3.getOptionalStringField(r1, r8)
        L_0x0141:
            r0.A0G = r1
            if (r4 == 0) goto L_0x014b
            java.lang.String r1 = r4.A0A(r7)
            if (r1 != 0) goto L_0x014f
        L_0x014b:
            java.lang.String r1 = r3.A0A(r7)
        L_0x014f:
            r0.A0J = r1
            if (r4 == 0) goto L_0x015b
            r1 = 14
            java.lang.String r1 = r4.getOptionalStringField(r1, r5)
            if (r1 != 0) goto L_0x0161
        L_0x015b:
            r1 = 14
            java.lang.String r1 = r3.getOptionalStringField(r1, r5)
        L_0x0161:
            r0.A0K = r1
            if (r4 == 0) goto L_0x016d
            r1 = 9
            java.lang.String r1 = r4.getOptionalStringField(r1, r2)
            if (r1 != 0) goto L_0x0173
        L_0x016d:
            r1 = 9
            java.lang.String r1 = r3.getOptionalStringField(r1, r2)
        L_0x0173:
            r0.A0P = r1
            r2 = 12
            java.lang.String r1 = "should_show_incoming_message_bubble_border"
            boolean r1 = r3.getRequiredBooleanField(r2, r1)
            r0.A01 = r1
            X.3sy r2 = r14.A08
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            X.0eM r1 = r14.A0Q
            X.0lg r3 = X.DbT.A0X(r1)
            X.AnonymousClass0Dg.A00(r5, r3)
            java.lang.String r4 = r0.A0o
            java.lang.String r3 = "ARGUMENT_UPLOAD_ID"
            r5.putString(r3, r4)
            if (r2 == 0) goto L_0x01a3
            r4 = r2
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r3 = 15
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r5.putParcelable(r3, r4)
        L_0x01a3:
            java.lang.String r3 = "ARGUEMENT_THEME"
            r5.putParcelable(r3, r0)
            int r4 = r14.A00
            r3 = 32
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r5.putInt(r3, r4)
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            java.lang.String r3 = "ARGUMENT_PREVIEW_TYPE"
            r5.putSerializable(r3, r4)
            X.NJ3 r7 = new X.NJ3
            r7.<init>()
            r7.setArguments(r5)
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.direct.fragment.thread.chatsettings.customthemepreview.CustomThemePreviewFragment"
            X.0qQ.A0C(r7, r3)
            X.P1z r3 = new X.P1z
            r3.<init>(r14, r0)
            r7.A0D = r3
            boolean r4 = r14.A0G
            if (r4 == 0) goto L_0x0242
            java.lang.String r3 = r0.A0h
        L_0x01d4:
            if (r3 == 0) goto L_0x0228
            int r5 = X.C329957Kw.A04(r0, r4)
            boolean r3 = r14.A0G
            int r3 = X.C329957Kw.A00(r0, r3)
        L_0x01e0:
            X.37D r4 = X.DbX.A0i(r14)
            X.7Pu r4 = X.C48943Emh.A00(r4)
            if (r4 == 0) goto L_0x03fc
            boolean r8 = r14.A0E
            if (r8 == 0) goto L_0x020a
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r10 = r0.A0o
            java.lang.String r9 = r14.A0A
            X.AnonymousClass7TF.A1H(r15, r10)
            java.lang.String r8 = "theme"
            java.util.Map r20 = X.AnonymousClass7TF.A0w(r8, r10)
            java.lang.String r16 = "branded_chat_theme_preview"
            java.lang.String r17 = "impression"
            r18 = r8
            r19 = r9
            X.C48823Ekl.A00(r14, r15, r16, r17, r18, r19, r20)
        L_0x020a:
            if (r2 == 0) goto L_0x028b
            X.0wc r8 = r14.A02
            if (r8 != 0) goto L_0x021a
            java.lang.String r0 = "typedLogger"
        L_0x0212:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x021a:
            java.lang.String r12 = r14.A0B
            if (r12 != 0) goto L_0x0221
            java.lang.String r0 = "entryPoint"
            goto L_0x0212
        L_0x0221:
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r9 = r14.A07
            if (r9 != 0) goto L_0x0248
            java.lang.String r0 = "currentTheme"
            goto L_0x0212
        L_0x0228:
            int r3 = X.C329957Kw.A06(r0, r4)
            if (r3 == 0) goto L_0x0236
            boolean r3 = r14.A0G
            int r3 = X.C329957Kw.A06(r0, r3)
        L_0x0234:
            r5 = r3
            goto L_0x01e0
        L_0x0236:
            android.content.Context r4 = r14.getContext()
            r3 = 2130970269(0x7f04069d, float:1.7549243E38)
            int r3 = X.AnonymousClass7TF.A03(r4, r3)
            goto L_0x0234
        L_0x0242:
            java.lang.String r3 = r0.A0m
            goto L_0x01d4
        L_0x0245:
            r4 = 0
            goto L_0x010b
        L_0x0248:
            java.lang.String r11 = r9.A09
            java.lang.String r13 = r0.A0o
            java.lang.Integer r9 = r14.A09
            java.lang.Integer r10 = X.NKI.A02(r14, r13)
            if (r10 != 0) goto L_0x0256
            java.lang.Integer r10 = X.AnonymousClass05K.A0Y
        L_0x0256:
            r0 = 3
            X.DbW.A1N(r13, r0, r9)
            java.lang.String r0 = "direct_theme_preview"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r8, r0)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L_0x028b
            java.lang.String r0 = "target_theme_id"
            r8.AAJ(r0, r13)
            java.lang.String r0 = "set_theme_id"
            r8.AAJ(r0, r11)
            X.NmM r0 = X.OX5.A00(r12)
            X.DbS.A1F(r0, r8)
            boolean r0 = X.C66647MaG.A0E(r2)
            X.C66581MXm.A1H(r8, r0)
            java.lang.String r0 = X.C66647MaG.A0A(r2)
            X.C66580MXl.A1J(r8, r0)
            X.C67003Mgb.A02(r8, r2)
            X.OX5.A01(r8, r10, r9)
        L_0x028b:
            X.7Pr r2 = X.DbX.A0f(r1)
            r1 = 1
            r2.A1G = r1
            r0 = 1061158912(0x3f400000, float:0.75)
            r2.A03 = r0
            r2.A11 = r6
            X.DbS.A1S(r2, r6)
            r2.A1C = r6
            r2.A09 = r3
            r2.A0x = r1
            r2.A06 = r5
            r4.A0F(r7, r2)
            return
        L_0x02a7:
            java.lang.Object r1 = r0.A02
            X.OZQ r1 = (X.OZQ) r1
            X.OME r4 = r1.A07
            java.lang.Object r3 = r0.A01
            X.OVz r3 = (X.C71002OVz) r3
            java.lang.String r13 = r3.A01
            X.0qQ.A06(r13)
            int r6 = r13.hashCode()
            X.02m r5 = r4.A00
            r4 = 944520647(0x384c3dc7, float:4.8694925E-5)
            java.lang.String r0 = "server_response_received"
            r5.markerPoint(r4, r6, r0)
            r11 = 0
            if (r27 == 0) goto L_0x0378
            java.lang.Object r7 = r2.Bny()
            if (r7 == 0) goto L_0x0378
            X.C7e r7 = (X.C43734C7e) r7
            if (r7 == 0) goto L_0x0378
            X.C7d r0 = r7.A0E()
            if (r0 == 0) goto L_0x0378
            X.C7d r0 = r7.A0E()
            if (r0 == 0) goto L_0x0378
            com.google.common.collect.ImmutableList r0 = r0.A0E()
            if (r0 == 0) goto L_0x0378
            X.C7d r0 = r7.A0E()
            if (r0 == 0) goto L_0x032a
            com.google.common.collect.ImmutableList r7 = r0.A0E()
            if (r7 == 0) goto L_0x032a
            java.util.ArrayList r0 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r10 = r7.iterator()
        L_0x02f7:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x032c
            X.3lr r9 = X.C41845B3m.A0V(r10)
            X.0qQ.A0A(r9)
            java.lang.String r7 = "strong_id__"
            java.lang.String r15 = r9.A07(r7)
            if (r15 != 0) goto L_0x030e
            java.lang.String r15 = ""
        L_0x030e:
            java.lang.String r8 = r3.A00
            java.lang.String r7 = "url"
            java.lang.String r7 = r9.A08(r7)
            com.instagram.common.typedurl.SimpleImageUrl r14 = X.DbS.A0V(r7)
            r17 = 1123549184(0x42f80000, float:124.0)
            r19 = 1065353216(0x3f800000, float:1.0)
            r18 = r17
            r16 = r8
            X.6o8 r7 = X.C317966o8.A00(r14, r15, r16, r17, r18, r19)
            r0.add(r7)
            goto L_0x02f7
        L_0x032a:
            X.0sn r0 = X.0sn.A00
        L_0x032c:
            com.instagram.common.session.UserSession r10 = r1.A06
            X.0iw r9 = r1.A05
            java.lang.String r12 = r3.A00
            X.0qQ.A06(r12)
            java.util.ArrayList r15 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x033d:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L_0x034f
            java.lang.Object r7 = r8.next()
            X.6o8 r7 = (X.C317966o8) r7
            java.lang.String r7 = r7.A0S
            r15.add(r7)
            goto L_0x033d
        L_0x034f:
            X.Nlr r8 = r1.A04
            java.lang.String r14 = r1.A08
            X.C71048OaQ.A02(r8, r9, r10, r11, r12, r13, r14, r15)
            r7 = 2
            r5.markerEnd(r4, r6, r7)
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0362:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x037e
            java.lang.Object r5 = r6.next()
            X.6o8 r5 = (X.C317966o8) r5
            r4 = 7
            X.JwF r0 = new X.JwF
            r0.<init>((X.C317966o8) r5, (java.lang.String) r13, (int) r4)
            r7.add(r0)
            goto L_0x0362
        L_0x0378:
            java.lang.String r0 = "no_gql_sticker_result"
            X.OZQ.A00(r1, r3, r0)
            r7 = r11
        L_0x037e:
            X.OVz r0 = r1.A00
            if (r3 != r0) goto L_0x03fc
            X.0sL r4 = r1.A0B
            if (r27 == 0) goto L_0x03b0
            java.lang.Object r0 = r2.Bny()
            X.C7e r0 = (X.C43734C7e) r0
            if (r0 == 0) goto L_0x03b0
            X.C7d r3 = r0.A0E()
            if (r3 == 0) goto L_0x03b0
            java.lang.Class<X.UQN> r2 = X.UQN.class
            java.lang.String r1 = "error"
            r0 = -1752600906(0xffffffff97896eb6, float:-8.881365E-25)
            X.3lr r1 = r3.A02(r2, r1, r0)
            if (r1 == 0) goto L_0x03b0
            java.lang.String r0 = "ui_description"
            java.lang.String r1 = r1.A07(r0)
            if (r1 == 0) goto L_0x03b0
            int r0 = r1.length()
            if (r0 == 0) goto L_0x03b0
            r11 = r1
        L_0x03b0:
            r4.invoke(r7, r11)
            return
        L_0x03b4:
            java.lang.Object r4 = r0.A02
            X.NJe r4 = (X.C68466NJe) r4
            android.view.View r3 = r4.mView
            if (r3 == 0) goto L_0x03fc
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            X.PaC r0 = new X.PaC
            r0.<init>(r2, r4, r1)
            r3.post(r0)
            return
        L_0x03c9:
            java.lang.String r11 = r3.A01
            X.Nlr r6 = X.C69447Nlr.AI_STICKER
            java.lang.String r12 = r1.A06
            r9 = 0
            X.C71048OaQ.A02(r6, r7, r8, r9, r10, r11, r12, r13)
            X.OME r0 = r1.A04
            X.0qQ.A06(r11)
            int r4 = r11.hashCode()
            X.02m r3 = r0.A00
            r2 = 944520647(0x384c3dc7, float:4.8694925E-5)
            r0 = 2
            r3.markerEnd(r2, r4, r0)
            r0 = 7
            X.JwF r2 = new X.JwF
            r2.<init>((X.C317966o8) r5, (java.lang.String) r11, (int) r0)
            X.O7b r0 = r1.A03
            int r1 = r1.A00
            X.OVa r0 = r0.A00
            X.O6p r0 = r0.A05
            if (r0 == 0) goto L_0x03fc
            X.NQF r0 = r0.A00
            X.PvZ r0 = r0.A03
            r0.Cv8(r2, r1)
        L_0x03fc:
            return
        L_0x03fd:
            if (r27 == 0) goto L_0x0444
            X.3lr r4 = X.C41845B3m.A0U(r2)
            if (r4 == 0) goto L_0x0444
            java.lang.Class<X.Bcw> r3 = X.C42477Bcw.class
            java.lang.String r2 = "xdt_music_api_save_song_to_spotify(audio_cluster_id:0,audio_cluster_id_str:$audio_cluster_id,note_id:$note_id)"
            r1 = -1883685392(0xffffffff8fb93df0, float:-1.8266266E-29)
            X.3lr r4 = r4.A05(r3, r2, r1)
            if (r4 == 0) goto L_0x0444
            X.NkN r3 = X.C69383NkN.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r2 = 0
            java.lang.String r1 = "spotify_status"
            java.lang.Enum r2 = r4.getOptionalEnumField(r2, r1, r3)
            X.NkN r2 = (X.C69383NkN) r2
            r1 = -1
            if (r2 == 0) goto L_0x0444
            int r2 = r2.ordinal()
            if (r2 == r1) goto L_0x0444
            r1 = 3
            if (r2 == r1) goto L_0x0438
            r1 = 5
            if (r2 == r1) goto L_0x0438
            java.lang.Object r1 = r0.A02
            X.Puu r1 = (X.C74439Puu) r1
            java.lang.Object r0 = r0.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r1.Dgh(r0)
            return
        L_0x0438:
            java.lang.Object r1 = r0.A02
            X.Puu r1 = (X.C74439Puu) r1
            java.lang.Object r0 = r0.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r1.DwO(r0)
            return
        L_0x0444:
            java.lang.Object r1 = r0.A02
            X.Puu r1 = (X.C74439Puu) r1
            java.lang.Object r0 = r0.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r1.Dgi(r0)
            return
        L_0x0450:
            java.lang.Object r1 = r0.A01
            X.Ptx r1 = (X.C74382Ptx) r1
            java.lang.Object r0 = r0.A02
            android.app.Activity r0 = (android.app.Activity) r0
            r1.DoB(r0)
            return
        L_0x045c:
            java.lang.String r4 = "VestaRegisterServerProvider"
            r3 = 0
            if (r27 == 0) goto L_0x07a0
            X.3lr r7 = X.C41845B3m.A0U(r2)
            if (r7 == 0) goto L_0x07a0
            java.lang.Class<X.QWF> r6 = X.QWF.class
            r2 = 0
            java.lang.String r5 = "fbid_based_auth_layer_vesta_register_init_v2(vesta_init_request:$request)"
            r1 = -1225533318(0xffffffffb6f3d87a, float:-7.2671655E-6)
            X.3lr r8 = r7.getOptionalTreeField(r2, r5, r6, r1)
            if (r8 != 0) goto L_0x04a3
            java.lang.String r1 = "Malformed init response payload"
            X.N0M r5 = A01(r3, r1)
        L_0x047b:
            boolean r1 = r5 instanceof X.N0N
            if (r1 == 0) goto L_0x0739
            java.lang.Object r1 = r0.A01
            X.OLk r1 = (X.C70790OLk) r1
            X.N0N r5 = (X.N0N) r5
            java.lang.Object r7 = r5.A00
            X.OMt r7 = (X.C70821OMt) r7
            java.lang.String r14 = "VestaRegisterModule"
            X.0qQ.A0B(r7, r2)
            X.OVw r13 = r1.A00
            com.facebook.quicklog.LightweightQuickPerformanceLogger r12 = r13.A01
            r11 = 1021652080(0x3ce52c70, float:0.027975291)
            int r10 = r13.A00
            java.lang.String r0 = "init_register_network_end"
            r12.markerPoint(r11, r10, r0)
            java.lang.String r0 = "init_register_network_call_success"
            r12.markerPoint(r11, r10, r0)
            goto L_0x0588
        L_0x04a3:
            java.lang.Class<X.BXx> r6 = X.C42280BXx.class
            java.lang.String r5 = "XFBVestaError"
            r1 = 1561940098(0x5d195082, float:6.9046705E17)
            X.3lr r6 = r8.reinterpretIfFulfillsType(r2, r5, r6, r1)
            if (r6 == 0) goto L_0x04c3
            java.lang.String r1 = "message"
            java.lang.String r5 = r6.A08(r1)
            if (r5 != 0) goto L_0x04ba
            java.lang.String r5 = "Unknown init error message"
        L_0x04ba:
            java.lang.Integer r1 = A03(r6)
            X.N0M r5 = A01(r1, r5)
            goto L_0x047b
        L_0x04c3:
            java.lang.Class<X.QWE> r6 = X.QWE.class
            r7 = 1
            java.lang.String r5 = "XFBVestaInitIqResponseV2"
            r1 = -121309745(0xfffffffff8c4f5cf, float:-3.1958618E34)
            X.3lr r6 = r8.reinterpretIfFulfillsType(r7, r5, r6, r1)
            if (r6 != 0) goto L_0x04d8
            java.lang.String r1 = "Malformed init response inner payload"
            X.N0M r5 = A01(r3, r1)
            goto L_0x047b
        L_0x04d8:
            java.lang.String r1 = "base64url_encoded_island_rsa_pub"
            java.lang.String r13 = r6.A07(r1)
            java.lang.String r5 = "Missing fields in init response inner payload"
            if (r13 != 0) goto L_0x04e7
            X.N0M r5 = A01(r3, r5)
            goto L_0x047b
        L_0x04e7:
            java.lang.String r1 = "base64url_encoded_island_rsa_pub_signature"
            java.lang.String r12 = r6.getOptionalStringField(r7, r1)
            if (r12 != 0) goto L_0x04f4
            X.N0M r5 = A01(r3, r5)
            goto L_0x047b
        L_0x04f4:
            java.lang.String r1 = "base64url_encoded_opaque_pub"
            java.lang.String r11 = r6.A09(r1)
            if (r11 != 0) goto L_0x0502
            X.N0M r5 = A01(r3, r5)
            goto L_0x047b
        L_0x0502:
            java.lang.String r1 = "base64url_encoded_opaque_pub_signature"
            java.lang.String r10 = r6.A0A(r1)
            if (r10 != 0) goto L_0x0510
            X.N0M r5 = A01(r3, r5)
            goto L_0x047b
        L_0x0510:
            java.lang.String r1 = "base64url_encoded_island_ed25519_pub"
            java.lang.String r9 = r6.A0B(r1)
            if (r9 != 0) goto L_0x051e
            X.N0M r5 = A01(r3, r5)
            goto L_0x047b
        L_0x051e:
            java.lang.String r1 = "base64url_encoded_island_ed25519_pub_signature"
            java.lang.String r8 = r6.A0C(r1)
            if (r8 != 0) goto L_0x052c
            X.N0M r5 = A01(r3, r5)
            goto L_0x047b
        L_0x052c:
            java.lang.String r7 = "is_registered"
            boolean r1 = r6.hasFieldValue(r7)
            if (r1 != 0) goto L_0x053a
            X.N0M r5 = A01(r3, r5)
            goto L_0x047b
        L_0x053a:
            r5 = 8
            byte[] r13 = android.util.Base64.decode(r13, r5)
            byte[] r14 = android.util.Base64.decode(r12, r5)
            byte[] r15 = android.util.Base64.decode(r11, r5)
            byte[] r16 = android.util.Base64.decode(r10, r5)
            byte[] r17 = android.util.Base64.decode(r9, r5)
            byte[] r18 = android.util.Base64.decode(r8, r5)
            X.0qQ.A0A(r13)
            X.0qQ.A0A(r14)
            X.0qQ.A0A(r15)
            X.0qQ.A0A(r16)
            r1 = 6
            boolean r19 = r6.getCoercedBooleanField(r1, r7)
            r7 = 7
            java.lang.String r1 = "attempts_remaining"
            java.lang.Integer r11 = X.C41846B3n.A0g(r6, r1, r7)
            r1 = 89
            java.lang.String r1 = X.Pxd.A00(r1)
            java.lang.Integer r12 = X.C41846B3n.A0g(r6, r1, r5)
            X.0qQ.A0A(r17)
            X.0qQ.A0A(r18)
            X.OMt r10 = new X.OMt
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.N0N r5 = new X.N0N
            r5.<init>(r10)
            goto L_0x047b
        L_0x0588:
            byte[] r6 = r7.A03     // Catch:{ 4zz -> 0x071a }
            int r5 = r6.length     // Catch:{ 4zz -> 0x071a }
            byte[] r4 = java.util.Arrays.copyOf(r6, r5)     // Catch:{ 4zz -> 0x071a }
            X.0qQ.A07(r4)     // Catch:{ 4zz -> 0x071a }
            byte[] r0 = r7.A04     // Catch:{ 4zz -> 0x071a }
            byte[] r0 = X.C66583MXo.A1b(r0)     // Catch:{ 4zz -> 0x071a }
            boolean r4 = com.facebook.vesta.VestaClient.validateHsmKey(r4, r0)     // Catch:{ 4zz -> 0x071a }
            java.lang.String r0 = "verified_island_rsa_key"
            r12.markerPoint(r11, r10, r0)     // Catch:{ 4zz -> 0x071a }
            if (r4 != 0) goto L_0x05a4
            goto L_0x0600
        L_0x05a4:
            byte[] r15 = r7.A07     // Catch:{ 4zz -> 0x071a }
            byte[] r0 = r7.A08     // Catch:{ 4zz -> 0x071a }
            boolean r4 = com.facebook.vesta.VestaClient.validateHsmKey(r15, r0)     // Catch:{ 4zz -> 0x071a }
            java.lang.String r0 = "verified_island_ed25519_key"
            r12.markerPoint(r11, r10, r0)     // Catch:{ 4zz -> 0x071a }
            if (r4 != 0) goto L_0x05ce
            java.lang.String r0 = "Failed to validate island ED25519 key signature"
            X.0KC.A0C(r14, r0)     // Catch:{ 4zz -> 0x071a }
            java.lang.String r0 = "invalid_island_ed25519_key"
            A04(r12, r0, r11, r10)     // Catch:{ 4zz -> 0x071a }
            X.OV9 r5 = r1.A02     // Catch:{ 4zz -> 0x071a }
            java.lang.Integer r4 = X.AnonymousClass05K.A0C     // Catch:{ 4zz -> 0x071a }
            java.lang.String r2 = "Register Island Public ED25519 Key Is Invalid"
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ 4zz -> 0x071a }
            r0.<init>(r2)     // Catch:{ 4zz -> 0x071a }
            X.Nns r2 = new X.Nns     // Catch:{ 4zz -> 0x071a }
            r2.<init>(r4, r3, r0)     // Catch:{ 4zz -> 0x071a }
            goto L_0x061a
        L_0x05ce:
            byte[] r0 = r7.A05     // Catch:{ 4zz -> 0x071a }
            byte[] r4 = X.C66583MXo.A1b(r0)     // Catch:{ 4zz -> 0x071a }
            byte[] r0 = r7.A06     // Catch:{ 4zz -> 0x071a }
            byte[] r0 = X.C66583MXo.A1b(r0)     // Catch:{ 4zz -> 0x071a }
            boolean r4 = com.facebook.vesta.VestaClient.validateHsmKey(r4, r0)     // Catch:{ 4zz -> 0x071a }
            java.lang.String r0 = "verified_island_opaque_key"
            r12.markerPoint(r11, r10, r0)     // Catch:{ 4zz -> 0x071a }
            if (r4 != 0) goto L_0x061e
            java.lang.String r0 = "Failed to validate island OPAQUE key signature"
            X.0KC.A0C(r14, r0)     // Catch:{ 4zz -> 0x071a }
            java.lang.String r0 = "invalid_island_opaque_pub_key"
            A04(r12, r0, r11, r10)     // Catch:{ 4zz -> 0x071a }
            X.OV9 r5 = r1.A02     // Catch:{ 4zz -> 0x071a }
            java.lang.Integer r4 = X.AnonymousClass05K.A0N     // Catch:{ 4zz -> 0x071a }
            java.lang.String r2 = "Register Opaque Public Key is Invalid"
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ 4zz -> 0x071a }
            r0.<init>(r2)     // Catch:{ 4zz -> 0x071a }
            X.Nns r2 = new X.Nns     // Catch:{ 4zz -> 0x071a }
            r2.<init>(r4, r3, r0)     // Catch:{ 4zz -> 0x071a }
            goto L_0x061a
        L_0x0600:
            java.lang.String r0 = "Failed to validate island RSA key signature"
            X.0KC.A0C(r14, r0)     // Catch:{ 4zz -> 0x071a }
            java.lang.String r0 = "invalid_island_rsa_key"
            A04(r12, r0, r11, r10)     // Catch:{ 4zz -> 0x071a }
            X.OV9 r5 = r1.A02     // Catch:{ 4zz -> 0x071a }
            java.lang.Integer r4 = X.AnonymousClass05K.A01     // Catch:{ 4zz -> 0x071a }
            java.lang.String r2 = "Register Island Public RSA Key Is Invalid"
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ 4zz -> 0x071a }
            r0.<init>(r2)     // Catch:{ 4zz -> 0x071a }
            X.Nns r2 = new X.Nns     // Catch:{ 4zz -> 0x071a }
            r2.<init>(r4, r3, r0)     // Catch:{ 4zz -> 0x071a }
        L_0x061a:
            r5.A01(r2)     // Catch:{ 4zz -> 0x071a }
            return
        L_0x061e:
            X.O5T r9 = r1.A01
            java.lang.Integer r0 = r1.A03
            r17 = r0
            java.lang.String r4 = r1.A04
            java.lang.String r8 = r1.A07
            java.lang.String r0 = r1.A05
            r16 = r0
            byte[] r24 = java.util.Arrays.copyOf(r6, r5)
            X.0qQ.A07(r24)
            java.lang.String r7 = r1.A06
            X.OV9 r6 = r1.A02
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ 4zz -> 0x06fd }
            X.0qQ.A08(r0)     // Catch:{ 4zz -> 0x06fd }
            byte[] r1 = r4.getBytes(r0)     // Catch:{ 4zz -> 0x06fd }
            X.0qQ.A07(r1)     // Catch:{ 4zz -> 0x06fd }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ 4zz -> 0x06fd }
            int r1 = com.facebook.vesta.VestaClient.beginRegisterNative(r1, r0)     // Catch:{ 4zz -> 0x06fd }
            if (r1 != 0) goto L_0x06f7
            byte[][] r0 = com.facebook.vesta.VestaClient.parseNativeResults(r0)     // Catch:{ 4zz -> 0x06fd }
            r5 = r0[r2]     // Catch:{ 4zz -> 0x06fd }
            r4 = 1
            r1 = r0[r4]     // Catch:{ 4zz -> 0x06fd }
            X.OB8 r0 = new X.OB8     // Catch:{ 4zz -> 0x06fd }
            r0.<init>(r5, r1)     // Catch:{ 4zz -> 0x06fd }
            java.lang.String r1 = "begin_register_vesta_client"
            r12.markerPoint(r11, r10, r1)     // Catch:{ 4zz -> 0x06fd }
            java.lang.String r1 = "begin_register_network_start"
            r12.markerPoint(r11, r10, r1)     // Catch:{ 4zz -> 0x06fd }
            X.OGc r10 = r9.A00     // Catch:{ 4zz -> 0x06fd }
            java.lang.String r11 = X.C69691NqD.A00(r17)     // Catch:{ 4zz -> 0x06fd }
            byte[] r1 = r0.A01     // Catch:{ 4zz -> 0x06fd }
            X.0qQ.A06(r1)     // Catch:{ 4zz -> 0x06fd }
            X.OLr r5 = new X.OLr     // Catch:{ 4zz -> 0x06fd }
            r20 = r17
            r21 = r8
            r22 = r16
            r23 = r7
            r25 = r15
            r17 = r9
            r18 = r6
            r19 = r0
            r15 = r5
            r16 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ 4zz -> 0x06fd }
            X.0Df r8 = X.C66584MXp.A0E(r11, r8)     // Catch:{ 4zz -> 0x06fd }
            r0 = 8
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ 4zz -> 0x06fd }
            java.lang.String r0 = "base64url_encoded_opaque_r1"
            X.0Df.A00(r8, r1, r0)     // Catch:{ 4zz -> 0x06fd }
            int r0 = r10.A03     // Catch:{ 4zz -> 0x06fd }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 4zz -> 0x06fd }
            java.lang.String r0 = "vesta_client_api_version"
            X.0Df.A00(r8, r1, r0)     // Catch:{ 4zz -> 0x06fd }
            java.lang.String r0 = "request_uuid"
            X.0Df.A00(r8, r7, r0)     // Catch:{ 4zz -> 0x06fd }
            java.lang.Class<X.OOL> r7 = X.OOL.class
            java.lang.String r1 = "create"
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x06f1 }
            java.lang.reflect.Method r1 = r7.getMethod(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x06f1 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x06f1 }
            java.lang.Object r2 = r1.invoke(r3, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x06f1 }
            X.OnP r2 = (X.C71588OnP) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x06f1 }
            X.2IS r1 = r2.A00     // Catch:{ 4zz -> 0x06fd }
            java.lang.String r0 = "input"
            X.DbW.A18(r8, r1, r0)     // Catch:{ 4zz -> 0x06fd }
            r2.A01 = r4     // Catch:{ 4zz -> 0x06fd }
            com.facebook.pando.PandoGraphQLRequest r7 = r2.build()     // Catch:{ 4zz -> 0x06fd }
            X.0qQ.A07(r7)     // Catch:{ 4zz -> 0x06fd }
            boolean r0 = r10.A01     // Catch:{ UnsupportedOperationException -> 0x06d1 }
            if (r0 == 0) goto L_0x06d1
            r0 = 2
            r7.setRequestPurpose(r0)     // Catch:{ UnsupportedOperationException -> 0x06d1 }
        L_0x06d1:
            boolean r0 = r10.A02     // Catch:{ UnsupportedOperationException -> 0x06de }
            if (r0 == 0) goto L_0x06de
            X.1Ef r1 = r7.setRetryPolicy(r4)     // Catch:{ UnsupportedOperationException -> 0x06de }
            int r0 = r10.A00     // Catch:{ UnsupportedOperationException -> 0x06de }
            r1.setNetworkTimeoutSeconds(r0)     // Catch:{ UnsupportedOperationException -> 0x06de }
        L_0x06de:
            X.1vo r4 = r10.A04     // Catch:{ 4zz -> 0x06fd }
            r0 = 3
            X.OnG r2 = new X.OnG     // Catch:{ 4zz -> 0x06fd }
            r2.<init>(r0, r10, r5)     // Catch:{ 4zz -> 0x06fd }
            X.On2 r1 = new X.On2     // Catch:{ 4zz -> 0x06fd }
            r1.<init>(r5, r0)     // Catch:{ 4zz -> 0x06fd }
            java.util.concurrent.Executor r0 = r10.A05     // Catch:{ 4zz -> 0x06fd }
            r4.ATM(r1, r2, r7, r0)     // Catch:{ 4zz -> 0x06fd }
            return
        L_0x06f1:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)     // Catch:{ 4zz -> 0x06fd }
            goto L_0x06fc
        L_0x06f7:
            X.4zz r0 = new X.4zz     // Catch:{ 4zz -> 0x06fd }
            r0.<init>(r1)     // Catch:{ 4zz -> 0x06fd }
        L_0x06fc:
            throw r0     // Catch:{ 4zz -> 0x06fd }
        L_0x06fd:
            r4 = move-exception
            java.lang.String r0 = "Unexpected Vesta client exception on beginRegister, error code: "
            java.lang.Integer r2 = r4.A00
            java.lang.String r1 = X.C69741NrQ.A00(r2)
            java.lang.String r0 = X.002.A0R(r0, r1)
            X.0KC.A0F(r14, r0, r4)
            int r0 = r2.intValue()
            r13.A01(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.OV9.A00(r6, r0, r3, r4)
            return
        L_0x071a:
            r5 = move-exception
            java.lang.String r0 = "Unexpected Vesta client exception on signature validation, error code: "
            java.lang.Integer r4 = r5.A00
            java.lang.String r2 = X.C69741NrQ.A00(r4)
            java.lang.String r0 = X.002.A0R(r0, r2)
            X.0KC.A0F(r14, r0, r5)
            int r0 = r4.intValue()
            r13.A01(r2, r0)
            X.OV9 r1 = r1.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.OV9.A00(r1, r0, r3, r5)
            return
        L_0x0739:
            boolean r1 = r5 instanceof X.N0M
            if (r1 == 0) goto L_0x079b
            X.N0M r5 = (X.N0M) r5
            X.Nnn r7 = r5.A00
            java.lang.Integer r6 = r7.A00
            if (r6 == 0) goto L_0x078e
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "[INIT] Vesta returned an error code: "
            r3.append(r1)
            r3.append(r6)
            java.lang.String r1 = ", message: "
            r3.append(r1)
            java.lang.String r1 = r7.getMessage()
            if (r1 != 0) goto L_0x075e
            java.lang.String r1 = "none"
        L_0x075e:
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r1, r3)
            X.0KC.A0C(r4, r1)
            java.lang.Object r5 = r0.A01
            X.OLk r5 = (X.C70790OLk) r5
            int r0 = r6.intValue()
            java.lang.Integer r4 = X.C69689NqB.A00(r0)
            java.lang.String r3 = r7.getMessage()
            X.0qQ.A0B(r4, r2)
            X.OVw r1 = r5.A00
            int r0 = X.C69690NqC.A00(r4)
            r1.A00(r0)
            X.OV9 r2 = r5.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r3)
            X.OV9.A00(r2, r1, r4, r0)
            return
        L_0x078e:
            java.lang.String r1 = "[INIT] Processing GraphQL response failed"
            X.0KC.A0F(r4, r1, r7)
            java.lang.Object r0 = r0.A01
            X.OLk r0 = (X.C70790OLk) r0
            r0.A00(r7)
            return
        L_0x079b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x07a0:
            java.lang.String r1 = "[INIT] Missing GraphQL response object"
            X.0KC.A0C(r4, r1)
            java.lang.Object r2 = r0.A01
            X.OLk r2 = (X.C70790OLk) r2
            java.lang.String r1 = "Empty init response received"
            X.Nnn r0 = new X.Nnn
            r0.<init>(r1, r3)
            r2.A00(r0)
            return
        L_0x07b4:
            java.lang.String r4 = "VestaRegisterServerProvider"
            r5 = 0
            if (r27 == 0) goto L_0x08df
            X.3lr r7 = X.C41845B3m.A0U(r2)
            if (r7 == 0) goto L_0x08df
            java.lang.Class<X.QWC> r3 = X.QWC.class
            r6 = 0
            java.lang.String r2 = "fbid_based_auth_layer_vesta_finish_register_v2(finish_register_request:$input)"
            r1 = -163745893(0xfffffffff63d6f9b, float:-9.605544E32)
            X.3lr r8 = r7.getOptionalTreeField(r6, r2, r3, r1)
            if (r8 != 0) goto L_0x0810
            java.lang.String r1 = "Malformed finish response payload"
            X.N0M r2 = A01(r5, r1)
        L_0x07d3:
            boolean r1 = r2 instanceof X.N0N
            if (r1 == 0) goto L_0x0873
            java.lang.Object r7 = r0.A01
            X.OKA r7 = (X.OKA) r7
            X.N0N r2 = (X.N0N) r2
            java.lang.Object r4 = r2.A00
            X.OMA r4 = (X.OMA) r4
            X.0qQ.A0B(r4, r6)
            X.OVw r0 = r7.A00
            com.facebook.quicklog.LightweightQuickPerformanceLogger r2 = r0.A01
            r3 = 1021652080(0x3ce52c70, float:0.027975291)
            int r1 = r0.A00
            java.lang.String r0 = "finish_register_network_end"
            r2.markerPoint(r3, r1, r0)
            java.lang.String r0 = "finish_register_network_call_success"
            r2.markerPoint(r3, r1, r0)
            boolean r0 = r4.A00
            X.OV9 r4 = r7.A01
            if (r0 == 0) goto L_0x0864
            X.OVw r0 = r4.A00
            com.facebook.quicklog.LightweightQuickPerformanceLogger r2 = r0.A01
            int r1 = r0.A00
            java.lang.String r0 = "vesta_registration_success"
            r2.markerPoint(r3, r1, r0)
            X.ObS r1 = r4.A01
            X.N0R r0 = X.N0R.A00
            r1.A05(r0)
            return
        L_0x0810:
            java.lang.Class<X.BXw> r3 = X.C42279BXw.class
            java.lang.String r2 = "XFBVestaError"
            r1 = -1242478766(0xffffffffb5f14752, float:-1.7976656E-6)
            X.3lr r3 = r8.reinterpretIfFulfillsType(r6, r2, r3, r1)
            if (r3 == 0) goto L_0x0830
            java.lang.String r1 = "message"
            java.lang.String r2 = r3.A08(r1)
            if (r2 != 0) goto L_0x0827
            java.lang.String r2 = "Unknown finish error message"
        L_0x0827:
            java.lang.Integer r1 = A03(r3)
            X.N0M r2 = A01(r1, r2)
            goto L_0x07d3
        L_0x0830:
            java.lang.Class<X.QWB> r7 = X.QWB.class
            r3 = 1
            java.lang.String r2 = "XFBVestaFinishRegisterResponseV2"
            r1 = 383425224(0x16da9ac8, float:3.531748E-25)
            X.3lr r3 = r8.reinterpretIfFulfillsType(r3, r2, r7, r1)
            if (r3 != 0) goto L_0x0845
            java.lang.String r1 = "Malformed finish response inner payload"
            X.N0M r2 = A01(r5, r1)
            goto L_0x07d3
        L_0x0845:
            java.lang.String r2 = "registration_success"
            boolean r1 = r3.hasFieldValue(r2)
            if (r1 != 0) goto L_0x0854
            java.lang.String r1 = "Missing fields in finish response inner payload"
            X.N0M r2 = A01(r5, r1)
            goto L_0x07d3
        L_0x0854:
            boolean r2 = r3.getCoercedBooleanField(r6, r2)
            X.OMA r1 = new X.OMA
            r1.<init>(r2)
            X.N0N r2 = new X.N0N
            r2.<init>(r1)
            goto L_0x07d3
        L_0x0864:
            java.lang.Integer r3 = X.AnonymousClass05K.A0u
            java.lang.String r1 = "Vesta Server Register Failure"
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            X.Nns r2 = new X.Nns
            r2.<init>(r3, r5, r0)
            goto L_0x08c9
        L_0x0873:
            boolean r1 = r2 instanceof X.N0M
            if (r1 == 0) goto L_0x08da
            X.N0M r2 = (X.N0M) r2
            X.Nnn r5 = r2.A00
            java.lang.Integer r3 = r5.A00
            if (r3 == 0) goto L_0x08cd
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "[INIT] Vesta returned an error code: "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = ", message: "
            r2.append(r1)
            java.lang.String r1 = r5.getMessage()
            if (r1 != 0) goto L_0x0898
            java.lang.String r1 = "none"
        L_0x0898:
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r1, r2)
            X.0KC.A0C(r4, r1)
            java.lang.Object r4 = r0.A01
            X.OKA r4 = (X.OKA) r4
            int r0 = r3.intValue()
            java.lang.Integer r3 = X.C69689NqB.A00(r0)
            java.lang.String r2 = r5.getMessage()
            X.0qQ.A0B(r3, r6)
            X.OVw r1 = r4.A00
            int r0 = X.C69690NqC.A00(r3)
            r1.A00(r0)
            X.OV9 r4 = r4.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r2)
            X.Nns r2 = new X.Nns
            r2.<init>(r1, r3, r0)
        L_0x08c9:
            r4.A01(r2)
            return
        L_0x08cd:
            java.lang.String r1 = "[FINISH] Processing GraphQL response failed"
            X.0KC.A0F(r4, r1, r5)
            java.lang.Object r0 = r0.A01
            X.OKA r0 = (X.OKA) r0
            r0.A00(r5)
            return
        L_0x08da:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x08df:
            java.lang.String r1 = "[FINISH] Missing GraphQL response object"
            X.0KC.A0C(r4, r1)
            java.lang.Object r2 = r0.A01
            X.OKA r2 = (X.OKA) r2
            java.lang.String r1 = "Empty finish response received"
            X.Nnn r0 = new X.Nnn
            r0.<init>(r1, r5)
            r2.A00(r0)
            return
        L_0x08f3:
            java.lang.String r4 = "VestaRegisterServerProvider"
            r8 = 0
            if (r27 == 0) goto L_0x0b2c
            X.3lr r5 = X.C41845B3m.A0U(r2)
            if (r5 == 0) goto L_0x0b2c
            java.lang.Class<X.QW9> r3 = X.QW9.class
            r9 = 0
            java.lang.String r2 = "fbid_based_auth_layer_vesta_begin_register_v2(begin_register_request:$input)"
            r1 = -36873224(0xfffffffffdcd5bf8, float:-3.4121159E37)
            X.3lr r6 = r5.getOptionalTreeField(r9, r2, r3, r1)
            if (r6 != 0) goto L_0x0958
            java.lang.String r1 = "Malformed begin response payload"
            X.N0M r2 = A01(r8, r1)
        L_0x0912:
            boolean r1 = r2 instanceof X.N0N
            if (r1 == 0) goto L_0x0ac5
            java.lang.Object r15 = r0.A01
            X.OLr r15 = (X.C70796OLr) r15
            X.N0N r2 = (X.N0N) r2
            java.lang.Object r0 = r2.A00
            X.OMZ r0 = (X.OMZ) r0
            X.0qQ.A0B(r0, r9)
            X.OVw r10 = r15.A00
            com.facebook.quicklog.LightweightQuickPerformanceLogger r7 = r10.A01
            r6 = 1021652080(0x3ce52c70, float:0.027975291)
            int r5 = r10.A00
            java.lang.String r1 = "begin_register_network_end"
            r7.markerPoint(r6, r5, r1)
            java.lang.String r1 = "begin_register_network_call_success"
            r7.markerPoint(r6, r5, r1)
            X.O5T r4 = r15.A01
            java.lang.Integer r1 = r15.A04
            r25 = r1
            java.lang.String r3 = r15.A07
            java.lang.String r13 = r15.A05
            X.OB8 r2 = r15.A03
            byte[] r1 = r2.A01
            r24 = r1
            X.0qQ.A06(r24)
            byte[] r14 = r2.A00
            X.0qQ.A06(r14)
            byte[] r12 = r15.A09
            byte[] r11 = r15.A08
            java.lang.String r2 = r15.A06
            X.OV9 r1 = r15.A02
            goto L_0x09dc
        L_0x0958:
            java.lang.Class<X.BXv> r3 = X.C42278BXv.class
            java.lang.String r2 = "XFBVestaError"
            r1 = -1758499840(0xffffffff972f6c00, float:-5.6681865E-25)
            X.3lr r3 = r6.reinterpretIfFulfillsType(r9, r2, r3, r1)
            if (r3 == 0) goto L_0x0978
            java.lang.String r1 = "message"
            java.lang.String r2 = r3.A08(r1)
            if (r2 != 0) goto L_0x096f
            java.lang.String r2 = "Unknown begin error message"
        L_0x096f:
            java.lang.Integer r1 = A03(r3)
            X.N0M r2 = A01(r1, r2)
            goto L_0x0912
        L_0x0978:
            java.lang.Class<X.QW8> r5 = X.QW8.class
            r3 = 1
            java.lang.String r2 = "XFBVestaBeginRegisterResponseV2"
            r1 = -890063661(0xffffffffcaf2b4d3, float:-7953001.5)
            X.3lr r2 = r6.reinterpretIfFulfillsType(r3, r2, r5, r1)
            if (r2 != 0) goto L_0x098d
            java.lang.String r1 = "Malformed begin response inner payload"
            X.N0M r2 = A01(r8, r1)
            goto L_0x0912
        L_0x098d:
            java.lang.String r1 = "base64url_encoded_opaque_r2"
            java.lang.String r6 = r2.getOptionalStringField(r9, r1)
            java.lang.String r5 = "Missing fields in begin response inner payload"
            if (r6 != 0) goto L_0x099d
            X.N0M r2 = A01(r8, r5)
            goto L_0x0912
        L_0x099d:
            java.lang.String r1 = "base64url_encoded_opaque_r2_sig"
            java.lang.String r3 = r2.getOptionalStringField(r3, r1)
            if (r3 != 0) goto L_0x09ab
            X.N0M r2 = A01(r8, r5)
            goto L_0x0912
        L_0x09ab:
            java.lang.String r1 = "base64url_encoded_opaque_challenge"
            java.lang.String r2 = r2.A09(r1)
            if (r2 != 0) goto L_0x09b9
            X.N0M r2 = A01(r8, r5)
            goto L_0x0912
        L_0x09b9:
            r1 = 8
            byte[] r5 = android.util.Base64.decode(r6, r1)
            byte[] r3 = android.util.Base64.decode(r3, r1)
            byte[] r2 = android.util.Base64.decode(r2, r1)
            X.0qQ.A0A(r5)
            X.0qQ.A0A(r3)
            X.0qQ.A0A(r2)
            X.OMZ r1 = new X.OMZ
            r1.<init>(r5, r3, r2)
            X.N0N r2 = new X.N0N
            r2.<init>(r1)
            goto L_0x0912
        L_0x09dc:
            java.nio.charset.Charset r15 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ 4zz -> 0x0aa6 }
            X.0qQ.A08(r15)     // Catch:{ 4zz -> 0x0aa6 }
            byte[] r19 = r13.getBytes(r15)     // Catch:{ 4zz -> 0x0aa6 }
            X.0qQ.A07(r19)     // Catch:{ 4zz -> 0x0aa6 }
            byte[] r13 = r0.A01     // Catch:{ 4zz -> 0x0aa6 }
            byte[] r15 = X.C66583MXo.A1b(r13)     // Catch:{ 4zz -> 0x0aa6 }
            byte[] r13 = r0.A02     // Catch:{ 4zz -> 0x0aa6 }
            byte[] r16 = X.C66583MXo.A1b(r13)     // Catch:{ 4zz -> 0x0aa6 }
            byte[] r0 = r0.A00     // Catch:{ 4zz -> 0x0aa6 }
            byte[] r20 = X.C66583MXo.A1b(r0)     // Catch:{ 4zz -> 0x0aa6 }
            r22 = 10
            com.facebook.vesta.VestaClient r0 = com.facebook.vesta.VestaClient.$redex_init_class     // Catch:{ 4zz -> 0x0aa6 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ 4zz -> 0x0aa6 }
            r17 = r11
            r18 = r14
            r21 = r12
            r23 = r0
            r14 = r24
            int r11 = com.facebook.vesta.VestaClient.finishRegisterProtoNative(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 4zz -> 0x0aa6 }
            if (r11 != 0) goto L_0x0aa0
            byte[][] r0 = com.facebook.vesta.VestaClient.parseNativeResults(r0)     // Catch:{ 4zz -> 0x0aa6 }
            r11 = r0[r9]     // Catch:{ 4zz -> 0x0aa6 }
            java.lang.String r0 = "finish_register_vesta_client"
            r7.markerPoint(r6, r5, r0)     // Catch:{ 4zz -> 0x0aa6 }
            java.lang.String r0 = "finish_register_network_start"
            r7.markerPoint(r6, r5, r0)     // Catch:{ 4zz -> 0x0aa6 }
            X.OGc r6 = r4.A00     // Catch:{ 4zz -> 0x0aa6 }
            java.lang.String r0 = X.C69691NqD.A00(r25)     // Catch:{ 4zz -> 0x0aa6 }
            X.0qQ.A06(r11)     // Catch:{ 4zz -> 0x0aa6 }
            X.OKA r5 = new X.OKA     // Catch:{ 4zz -> 0x0aa6 }
            r5.<init>(r10, r1)     // Catch:{ 4zz -> 0x0aa6 }
            r4 = 1
            X.0Df r7 = X.C66584MXp.A0E(r0, r3)     // Catch:{ 4zz -> 0x0aa6 }
            r0 = 8
            java.lang.String r3 = android.util.Base64.encodeToString(r11, r0)     // Catch:{ 4zz -> 0x0aa6 }
            java.lang.String r0 = "base64url_encoded_enc_reg_payload"
            X.0Df.A00(r7, r3, r0)     // Catch:{ 4zz -> 0x0aa6 }
            int r0 = r6.A03     // Catch:{ 4zz -> 0x0aa6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ 4zz -> 0x0aa6 }
            java.lang.String r0 = "vesta_client_api_version"
            X.0Df.A00(r7, r3, r0)     // Catch:{ 4zz -> 0x0aa6 }
            java.lang.String r0 = "request_uuid"
            X.0Df.A00(r7, r2, r0)     // Catch:{ 4zz -> 0x0aa6 }
            java.lang.Class<X.OOM> r3 = X.OOM.class
            java.lang.String r2 = "create"
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0a9a }
            java.lang.reflect.Method r2 = r3.getMethod(r2, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0a9a }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0a9a }
            java.lang.Object r3 = r2.invoke(r8, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0a9a }
            X.OnQ r3 = (X.C71589OnQ) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0a9a }
            X.2IS r2 = r3.A00     // Catch:{ 4zz -> 0x0aa6 }
            java.lang.String r0 = "input"
            X.DbW.A18(r7, r2, r0)     // Catch:{ 4zz -> 0x0aa6 }
            r3.A01 = r4     // Catch:{ 4zz -> 0x0aa6 }
            com.facebook.pando.PandoGraphQLRequest r7 = r3.build()     // Catch:{ 4zz -> 0x0aa6 }
            X.0qQ.A07(r7)     // Catch:{ 4zz -> 0x0aa6 }
            boolean r0 = r6.A01     // Catch:{ UnsupportedOperationException -> 0x0a7a }
            if (r0 == 0) goto L_0x0a7a
            r0 = 2
            r7.setRequestPurpose(r0)     // Catch:{ UnsupportedOperationException -> 0x0a7a }
        L_0x0a7a:
            boolean r0 = r6.A02     // Catch:{ UnsupportedOperationException -> 0x0a87 }
            if (r0 == 0) goto L_0x0a87
            X.1Ef r2 = r7.setRetryPolicy(r4)     // Catch:{ UnsupportedOperationException -> 0x0a87 }
            int r0 = r6.A00     // Catch:{ UnsupportedOperationException -> 0x0a87 }
            r2.setNetworkTimeoutSeconds(r0)     // Catch:{ UnsupportedOperationException -> 0x0a87 }
        L_0x0a87:
            X.1vo r4 = r6.A04     // Catch:{ 4zz -> 0x0aa6 }
            r0 = 4
            X.OnG r3 = new X.OnG     // Catch:{ 4zz -> 0x0aa6 }
            r3.<init>(r0, r6, r5)     // Catch:{ 4zz -> 0x0aa6 }
            X.On2 r2 = new X.On2     // Catch:{ 4zz -> 0x0aa6 }
            r2.<init>(r5, r0)     // Catch:{ 4zz -> 0x0aa6 }
            java.util.concurrent.Executor r0 = r6.A05     // Catch:{ 4zz -> 0x0aa6 }
            r4.ATM(r2, r3, r7, r0)     // Catch:{ 4zz -> 0x0aa6 }
            return
        L_0x0a9a:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)     // Catch:{ 4zz -> 0x0aa6 }
            goto L_0x0aa5
        L_0x0aa0:
            X.4zz r0 = new X.4zz     // Catch:{ 4zz -> 0x0aa6 }
            r0.<init>(r11)     // Catch:{ 4zz -> 0x0aa6 }
        L_0x0aa5:
            throw r0     // Catch:{ 4zz -> 0x0aa6 }
        L_0x0aa6:
            r5 = move-exception
            java.lang.String r0 = "Unexpected Vesta client exception on finishRegisterProto, error code: "
            java.lang.Integer r4 = r5.A00
            java.lang.String r3 = X.C69741NrQ.A00(r4)
            java.lang.String r2 = X.002.A0R(r0, r3)
            java.lang.String r0 = "VestaRegisterModule"
            X.0KC.A0F(r0, r2, r5)
            int r0 = r4.intValue()
            r10.A01(r3, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.OV9.A00(r1, r0, r8, r5)
            return
        L_0x0ac5:
            boolean r1 = r2 instanceof X.N0M
            if (r1 == 0) goto L_0x0b27
            X.N0M r2 = (X.N0M) r2
            X.Nnn r5 = r2.A00
            java.lang.Integer r3 = r5.A00
            if (r3 == 0) goto L_0x0b1a
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "[BEGIN] Vesta returned an error code: "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = ", message: "
            r2.append(r1)
            java.lang.String r1 = r5.getMessage()
            if (r1 != 0) goto L_0x0aea
            java.lang.String r1 = "none"
        L_0x0aea:
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r1, r2)
            X.0KC.A0C(r4, r1)
            java.lang.Object r2 = r0.A01
            X.OLr r2 = (X.C70796OLr) r2
            int r0 = r3.intValue()
            java.lang.Integer r4 = X.C69689NqB.A00(r0)
            java.lang.String r3 = r5.getMessage()
            X.0qQ.A0B(r4, r9)
            X.OVw r1 = r2.A00
            int r0 = X.C69690NqC.A00(r4)
            r1.A00(r0)
            X.OV9 r2 = r2.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r3)
            X.OV9.A00(r2, r1, r4, r0)
            return
        L_0x0b1a:
            java.lang.String r1 = "[BEGIN] Processing GraphQL response failed"
            X.0KC.A0F(r4, r1, r5)
            java.lang.Object r0 = r0.A01
            X.OLr r0 = (X.C70796OLr) r0
            r0.A00(r5)
            return
        L_0x0b27:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0b2c:
            java.lang.String r1 = "[BEGIN] Missing GraphQL response object"
            X.0KC.A0C(r4, r1)
            java.lang.Object r2 = r0.A01
            X.OLr r2 = (X.C70796OLr) r2
            java.lang.String r1 = "Empty begin response received"
            X.Nnn r0 = new X.Nnn
            r0.<init>(r1, r8)
            r2.A00(r0)
            return
        L_0x0b40:
            java.lang.String r3 = "VestaLoginServerProvider"
            r1 = 0
            if (r27 == 0) goto L_0x0e71
            X.3lr r7 = X.C41845B3m.A0U(r2)
            if (r7 == 0) goto L_0x0e71
            java.lang.Class<X.QW6> r6 = X.QW6.class
            r2 = 0
            java.lang.String r5 = "fbid_based_auth_layer_vesta_login_init_v2(vesta_init_request:$request)"
            r4 = -588111862(0xffffffffdcf2200a, float:-5.45217373E17)
            X.3lr r8 = r7.getOptionalTreeField(r2, r5, r6, r4)
            if (r8 != 0) goto L_0x0c7c
            java.lang.String r4 = "Malformed init response payload"
            X.N0K r5 = A00(r1, r4)
        L_0x0b5f:
            boolean r4 = r5 instanceof X.N0L
            if (r4 == 0) goto L_0x0e57
            java.lang.Object r4 = r0.A01
            X.OLW r4 = (X.OLW) r4
            X.N0L r5 = (X.N0L) r5
            java.lang.Object r8 = r5.A00
            X.OMt r8 = (X.C70821OMt) r8
            java.lang.String r5 = "VestaBackupRestoreModule"
            X.OWR r11 = r4.A00
            com.facebook.quicklog.LightweightQuickPerformanceLogger r10 = r11.A01
            r9 = 1021649468(0x3ce5223c, float:0.027970426)
            int r6 = r11.A00
            java.lang.String r0 = "init_login_network_end"
            r10.markerPoint(r9, r6, r0)
            java.lang.String r0 = "init_login_network_call_success"
            r10.markerPoint(r9, r6, r0)
            java.lang.Integer r7 = r8.A00
            if (r7 == 0) goto L_0x0b8a
            X.OEl r0 = r4.A01
            r0.A00 = r7
        L_0x0b8a:
            java.lang.Integer r3 = r8.A01
            if (r3 == 0) goto L_0x0b92
            X.OEl r0 = r4.A01
            r0.A01 = r3
        L_0x0b92:
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x0ba9
            java.lang.String r0 = "user_not_registered"
            A04(r10, r0, r9, r6)
            X.OVI r13 = r4.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A1I
            java.lang.String r0 = "Login non-registered vesta account"
            X.Nnp r0 = A02(r1, r0)
        L_0x0ba5:
            X.OEl r12 = r4.A01
            goto L_0x0efc
        L_0x0ba9:
            if (r7 == 0) goto L_0x0bbc
            int r0 = r7.intValue()
            if (r0 != 0) goto L_0x0bbc
            X.OVI r13 = r4.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A05
            java.lang.String r0 = "User password attempts exhausted"
            X.Nnp r0 = A02(r1, r0)
            goto L_0x0ba5
        L_0x0bbc:
            byte[] r0 = r8.A03     // Catch:{ 4zz -> 0x0c4c }
            byte[] r3 = X.C66583MXo.A1b(r0)     // Catch:{ 4zz -> 0x0c4c }
            byte[] r0 = r8.A04     // Catch:{ 4zz -> 0x0c4c }
            byte[] r0 = X.C66583MXo.A1b(r0)     // Catch:{ 4zz -> 0x0c4c }
            boolean r0 = com.facebook.vesta.VestaClient.validateHsmKey(r3, r0)     // Catch:{ 4zz -> 0x0c4c }
            if (r0 != 0) goto L_0x0be9
            java.lang.String r0 = "Failed to validate HSM fleet key"
            X.0KC.A0C(r5, r0)     // Catch:{ 4zz -> 0x0c4c }
            java.lang.String r0 = "invalid_island_rsa_key"
            A04(r10, r0, r9, r6)     // Catch:{ 4zz -> 0x0c4c }
            X.OVI r2 = r4.A02     // Catch:{ 4zz -> 0x0c4c }
            java.lang.Integer r1 = X.AnonymousClass05K.A0j     // Catch:{ 4zz -> 0x0c4c }
            java.lang.String r0 = "Restore Island Public RSA Key Is Invalid"
            X.Nnp r1 = A02(r1, r0)     // Catch:{ 4zz -> 0x0c4c }
            X.OEl r0 = r4.A01     // Catch:{ 4zz -> 0x0c4c }
            X.OVI.A00(r0, r2, r1)     // Catch:{ 4zz -> 0x0c4c }
            goto L_0x0d71
        L_0x0be9:
            java.lang.String r0 = "verified_island_rsa_key"
            r10.markerPoint(r9, r6, r0)     // Catch:{ 4zz -> 0x0c4c }
            byte[] r7 = r8.A07     // Catch:{ 4zz -> 0x0c4c }
            byte[] r0 = r8.A08     // Catch:{ 4zz -> 0x0c4c }
            boolean r0 = com.facebook.vesta.VestaClient.validateHsmKey(r7, r0)     // Catch:{ 4zz -> 0x0c4c }
            if (r0 != 0) goto L_0x0c13
            java.lang.String r0 = "Failed to validate HSM ED25519 public key"
            X.0KC.A0C(r5, r0)     // Catch:{ 4zz -> 0x0c4c }
            java.lang.String r0 = "invalid_island_ed25519_key"
            A04(r10, r0, r9, r6)     // Catch:{ 4zz -> 0x0c4c }
            X.OVI r2 = r4.A02     // Catch:{ 4zz -> 0x0c4c }
            java.lang.Integer r1 = X.AnonymousClass05K.A0u     // Catch:{ 4zz -> 0x0c4c }
            java.lang.String r0 = "Restore Island Public ED25519 Key Is Invalid"
            X.Nnp r1 = A02(r1, r0)     // Catch:{ 4zz -> 0x0c4c }
            X.OEl r0 = r4.A01     // Catch:{ 4zz -> 0x0c4c }
            X.OVI.A00(r0, r2, r1)     // Catch:{ 4zz -> 0x0c4c }
            goto L_0x0d72
        L_0x0c13:
            java.lang.String r0 = "verified_island_ed25519_key"
            r10.markerPoint(r9, r6, r0)     // Catch:{ 4zz -> 0x0c4c }
            byte[] r0 = r8.A05     // Catch:{ 4zz -> 0x0c4c }
            byte[] r3 = X.C66583MXo.A1b(r0)     // Catch:{ 4zz -> 0x0c4c }
            byte[] r0 = r8.A06     // Catch:{ 4zz -> 0x0c4c }
            byte[] r0 = X.C66583MXo.A1b(r0)     // Catch:{ 4zz -> 0x0c4c }
            boolean r0 = com.facebook.vesta.VestaClient.validateHsmKey(r3, r0)     // Catch:{ 4zz -> 0x0c4c }
            if (r0 != 0) goto L_0x0c45
            java.lang.String r0 = "Failed to validate HSM OPAQUE public key"
            X.0KC.A0C(r5, r0)     // Catch:{ 4zz -> 0x0c4c }
            java.lang.String r0 = "invalid_island_opaque_pub_key"
            A04(r10, r0, r9, r6)     // Catch:{ 4zz -> 0x0c4c }
            X.OVI r2 = r4.A02     // Catch:{ 4zz -> 0x0c4c }
            java.lang.Integer r1 = X.AnonymousClass05K.A15     // Catch:{ 4zz -> 0x0c4c }
            java.lang.String r0 = "Restore Island OPAQUE Public Key Is Invalid"
            X.Nnp r1 = A02(r1, r0)     // Catch:{ 4zz -> 0x0c4c }
            X.OEl r0 = r4.A01     // Catch:{ 4zz -> 0x0c4c }
            X.OVI.A00(r0, r2, r1)     // Catch:{ 4zz -> 0x0c4c }
            goto L_0x0d73
        L_0x0c45:
            java.lang.String r0 = "verified_island_opaque_key"
            r10.markerPoint(r9, r6, r0)     // Catch:{ 4zz -> 0x0c4c }
            goto L_0x0d74
        L_0x0c4c:
            r1 = move-exception
            java.lang.String r0 = "Unexpected Vesta client exception on signature validation, error code: "
            java.lang.Integer r3 = r1.A00
            java.lang.String r2 = X.C69741NrQ.A00(r3)
            java.lang.String r0 = X.002.A0R(r0, r2)
            X.0KC.A0F(r5, r0, r1)
            java.lang.String r1 = "VestaClientException: "
            if (r3 == 0) goto L_0x0c79
            java.lang.String r0 = X.C69741NrQ.A00(r3)
        L_0x0c64:
            java.lang.String r1 = X.002.A0R(r1, r0)
            int r0 = r3.intValue()
            r11.A02(r2, r0)
            X.OVI r13 = r4.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            X.Nnp r0 = A02(r0, r1)
            goto L_0x0ba5
        L_0x0c79:
            java.lang.String r0 = "null"
            goto L_0x0c64
        L_0x0c7c:
            java.lang.Class<X.BXu> r6 = X.C42277BXu.class
            java.lang.String r5 = "XFBVestaError"
            r4 = -80783291(0xfffffffffb2f5845, float:-9.104423E35)
            X.3lr r6 = r8.reinterpretIfFulfillsType(r2, r5, r6, r4)
            if (r6 == 0) goto L_0x0c9d
            java.lang.String r4 = "message"
            java.lang.String r5 = r6.A08(r4)
            if (r5 != 0) goto L_0x0c93
            java.lang.String r5 = "Unknown init error message"
        L_0x0c93:
            java.lang.Integer r4 = A03(r6)
            X.N0K r5 = A00(r4, r5)
            goto L_0x0b5f
        L_0x0c9d:
            java.lang.Class<X.QW5> r6 = X.QW5.class
            r7 = 1
            java.lang.String r5 = "XFBVestaInitIqResponseV2"
            r4 = -1985700901(0xffffffff89a49bdb, float:-3.962813E-33)
            X.3lr r6 = r8.reinterpretIfFulfillsType(r7, r5, r6, r4)
            if (r6 != 0) goto L_0x0cb3
            java.lang.String r4 = "Malformed init response inner payload"
            X.N0K r5 = A00(r1, r4)
            goto L_0x0b5f
        L_0x0cb3:
            java.lang.String r4 = "base64url_encoded_island_rsa_pub"
            java.lang.String r14 = r6.A07(r4)
            java.lang.String r5 = "Missing fields in init response inner payload"
            if (r14 != 0) goto L_0x0cc3
            X.N0K r5 = A00(r1, r5)
            goto L_0x0b5f
        L_0x0cc3:
            java.lang.String r4 = "base64url_encoded_island_rsa_pub_signature"
            java.lang.String r13 = r6.getOptionalStringField(r7, r4)
            if (r13 != 0) goto L_0x0cd1
            X.N0K r5 = A00(r1, r5)
            goto L_0x0b5f
        L_0x0cd1:
            java.lang.String r4 = "base64url_encoded_opaque_pub"
            java.lang.String r12 = r6.A09(r4)
            if (r12 != 0) goto L_0x0cdf
            X.N0K r5 = A00(r1, r5)
            goto L_0x0b5f
        L_0x0cdf:
            java.lang.String r4 = "base64url_encoded_opaque_pub_signature"
            java.lang.String r11 = r6.A0A(r4)
            if (r11 != 0) goto L_0x0ced
            X.N0K r5 = A00(r1, r5)
            goto L_0x0b5f
        L_0x0ced:
            java.lang.String r4 = "base64url_encoded_island_ed25519_pub"
            java.lang.String r10 = r6.A0B(r4)
            if (r10 != 0) goto L_0x0cfb
            X.N0K r5 = A00(r1, r5)
            goto L_0x0b5f
        L_0x0cfb:
            java.lang.String r4 = "base64url_encoded_island_ed25519_pub_signature"
            java.lang.String r9 = r6.A0C(r4)
            if (r9 != 0) goto L_0x0d09
            X.N0K r5 = A00(r1, r5)
            goto L_0x0b5f
        L_0x0d09:
            java.lang.String r8 = "is_registered"
            boolean r4 = r6.hasFieldValue(r8)
            if (r4 != 0) goto L_0x0d17
            X.N0K r5 = A00(r1, r5)
            goto L_0x0b5f
        L_0x0d17:
            java.lang.String r7 = "attempts_remaining"
            boolean r4 = r6.hasFieldValue(r7)
            if (r4 != 0) goto L_0x0d25
            X.N0K r5 = A00(r1, r5)
            goto L_0x0b5f
        L_0x0d25:
            r5 = 8
            byte[] r14 = android.util.Base64.decode(r14, r5)
            byte[] r15 = android.util.Base64.decode(r13, r5)
            byte[] r16 = android.util.Base64.decode(r12, r5)
            byte[] r17 = android.util.Base64.decode(r11, r5)
            byte[] r18 = android.util.Base64.decode(r10, r5)
            byte[] r19 = android.util.Base64.decode(r9, r5)
            X.0qQ.A0A(r14)
            X.0qQ.A0A(r15)
            X.0qQ.A0A(r16)
            X.0qQ.A0A(r17)
            r4 = 6
            boolean r20 = r6.getCoercedBooleanField(r4, r8)
            r4 = 7
            java.lang.Integer r12 = X.C41846B3n.A0g(r6, r7, r4)
            r4 = 89
            java.lang.String r4 = X.Pxd.A00(r4)
            java.lang.Integer r13 = X.C41846B3n.A0g(r6, r4, r5)
            X.0qQ.A0A(r18)
            X.0qQ.A0A(r19)
            X.OMt r11 = new X.OMt
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.N0L r5 = new X.N0L
            r5.<init>(r11)
            goto L_0x0b5f
        L_0x0d71:
            return
        L_0x0d72:
            return
        L_0x0d73:
            return
        L_0x0d74:
            X.OEl r12 = r4.A01
            java.lang.String r3 = r4.A03
            java.lang.String r15 = r4.A05
            X.OVI r13 = r4.A02
            java.lang.String r8 = r4.A04
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ 4zz -> 0x0e29 }
            byte[] r3 = r3.getBytes(r0)     // Catch:{ 4zz -> 0x0e29 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ 4zz -> 0x0e29 }
            int r3 = com.facebook.vesta.VestaClient.beginLoginNative(r3, r0)     // Catch:{ 4zz -> 0x0e29 }
            if (r3 != 0) goto L_0x0e23
            byte[][] r0 = com.facebook.vesta.VestaClient.parseNativeResults(r0)     // Catch:{ 4zz -> 0x0e29 }
            r4 = r0[r2]     // Catch:{ 4zz -> 0x0e29 }
            r3 = 1
            r0 = r0[r3]     // Catch:{ 4zz -> 0x0e29 }
            X.OB7 r14 = new X.OB7     // Catch:{ 4zz -> 0x0e29 }
            r14.<init>(r4, r0)     // Catch:{ 4zz -> 0x0e29 }
            java.lang.String r0 = "begin_login_vesta_client"
            r10.markerPoint(r9, r6, r0)     // Catch:{ 4zz -> 0x0e29 }
            java.lang.String r0 = "begin_login_network_start"
            r10.markerPoint(r9, r6, r0)     // Catch:{ 4zz -> 0x0e29 }
            X.OGb r6 = r12.A02     // Catch:{ 4zz -> 0x0e29 }
            java.lang.Integer r0 = r12.A03     // Catch:{ 4zz -> 0x0e29 }
            java.lang.String r0 = X.C69691NqD.A00(r0)     // Catch:{ 4zz -> 0x0e29 }
            byte[] r4 = r14.A01     // Catch:{ 4zz -> 0x0e29 }
            X.OLd r10 = new X.OLd     // Catch:{ 4zz -> 0x0e29 }
            r16 = r8
            r17 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 4zz -> 0x0e29 }
            X.C51972G9s.A1C(r4, r8)     // Catch:{ 4zz -> 0x0e29 }
            X.0Df r7 = X.C66584MXp.A0E(r0, r15)     // Catch:{ 4zz -> 0x0e29 }
            r0 = 8
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r0)     // Catch:{ 4zz -> 0x0e29 }
            java.lang.String r0 = "base64url_encoded_opaque_l1"
            X.0Df.A00(r7, r4, r0)     // Catch:{ 4zz -> 0x0e29 }
            java.lang.String r0 = "request_uuid"
            X.0Df.A00(r7, r8, r0)     // Catch:{ 4zz -> 0x0e29 }
            java.lang.Class<X.OOI> r8 = X.OOI.class
            java.lang.String r4 = "create"
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0e1d }
            java.lang.reflect.Method r4 = r8.getMethod(r4, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0e1d }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0e1d }
            java.lang.Object r4 = r4.invoke(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0e1d }
            X.OnN r4 = (X.C71586OnN) r4     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0e1d }
            X.2IS r1 = r4.A00     // Catch:{ 4zz -> 0x0e29 }
            java.lang.String r0 = "input"
            X.DbW.A18(r7, r1, r0)     // Catch:{ 4zz -> 0x0e29 }
            r4.A01 = r3     // Catch:{ 4zz -> 0x0e29 }
            com.facebook.pando.PandoGraphQLRequest r7 = r4.build()     // Catch:{ 4zz -> 0x0e29 }
            X.0qQ.A07(r7)     // Catch:{ 4zz -> 0x0e29 }
            boolean r0 = r6.A01     // Catch:{ UnsupportedOperationException -> 0x0dfe }
            if (r0 == 0) goto L_0x0dfe
            r0 = 2
            r7.setRequestPurpose(r0)     // Catch:{ UnsupportedOperationException -> 0x0dfe }
        L_0x0dfe:
            boolean r0 = r6.A02     // Catch:{ UnsupportedOperationException -> 0x0e0b }
            if (r0 == 0) goto L_0x0e0b
            X.1Ef r1 = r7.setRetryPolicy(r3)     // Catch:{ UnsupportedOperationException -> 0x0e0b }
            int r0 = r6.A00     // Catch:{ UnsupportedOperationException -> 0x0e0b }
            r1.setNetworkTimeoutSeconds(r0)     // Catch:{ UnsupportedOperationException -> 0x0e0b }
        L_0x0e0b:
            X.1vo r4 = r6.A04     // Catch:{ 4zz -> 0x0e29 }
            X.OnG r3 = new X.OnG     // Catch:{ 4zz -> 0x0e29 }
            r3.<init>(r2, r6, r10)     // Catch:{ 4zz -> 0x0e29 }
            X.On2 r1 = new X.On2     // Catch:{ 4zz -> 0x0e29 }
            r1.<init>(r10, r2)     // Catch:{ 4zz -> 0x0e29 }
            java.util.concurrent.Executor r0 = r6.A05     // Catch:{ 4zz -> 0x0e29 }
            r4.ATM(r1, r3, r7, r0)     // Catch:{ 4zz -> 0x0e29 }
            return
        L_0x0e1d:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)     // Catch:{ 4zz -> 0x0e29 }
            goto L_0x0e28
        L_0x0e23:
            X.4zz r0 = new X.4zz     // Catch:{ 4zz -> 0x0e29 }
            r0.<init>(r3)     // Catch:{ 4zz -> 0x0e29 }
        L_0x0e28:
            throw r0     // Catch:{ 4zz -> 0x0e29 }
        L_0x0e29:
            r1 = move-exception
            java.lang.String r0 = "Unexpected Vesta client exception on beginLogin, error code: "
            java.lang.Integer r3 = r1.A00
            java.lang.String r2 = X.C69741NrQ.A00(r3)
            java.lang.String r0 = X.002.A0R(r0, r2)
            X.0KC.A0F(r5, r0, r1)
            java.lang.String r1 = "VestaClientException: "
            if (r3 == 0) goto L_0x0e54
            java.lang.String r0 = X.C69741NrQ.A00(r3)
        L_0x0e41:
            java.lang.String r1 = X.002.A0R(r1, r0)
            int r0 = r3.intValue()
            r11.A02(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            X.Nnp r0 = A02(r0, r1)
            goto L_0x0efc
        L_0x0e54:
            java.lang.String r0 = "null"
            goto L_0x0e41
        L_0x0e57:
            boolean r1 = r5 instanceof X.N0K
            if (r1 == 0) goto L_0x0e6c
            X.N0K r5 = (X.N0K) r5
            X.Nnm r2 = r5.A00
            java.lang.String r1 = "[INIT] Processing GraphQL response failed"
            X.0KC.A0F(r3, r1, r2)
            java.lang.Object r0 = r0.A01
            X.OLW r0 = (X.OLW) r0
            r0.A00(r2)
            return
        L_0x0e6c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0e71:
            java.lang.String r2 = "[INIT] Missing GraphQL response object"
            X.0KC.A0C(r3, r2)
            java.lang.Object r3 = r0.A01
            X.OLW r3 = (X.OLW) r3
            java.lang.String r2 = "Bad init response received"
            X.Nnm r0 = new X.Nnm
            r0.<init>(r2, r1)
            r3.A00(r0)
            return
        L_0x0e85:
            java.lang.String r5 = "VestaLoginServerProvider"
            X.3lr r4 = X.C41845B3m.A0U(r2)
            if (r4 != 0) goto L_0x0ea2
            java.lang.String r1 = "[FINISH] Missing GraphQL response object"
            X.0KC.A0C(r5, r1)
            java.lang.Object r3 = r0.A01
            X.OL1 r3 = (X.OL1) r3
            java.lang.String r2 = "Bad finish response received"
            r1 = 0
            X.Nnm r0 = new X.Nnm
            r0.<init>(r2, r1)
            r3.A00(r0)
            return
        L_0x0ea2:
            java.lang.Class<X.QW3> r3 = X.QW3.class
            r7 = 0
            java.lang.String r2 = "fbid_based_auth_layer_vesta_finish_login_v2(finish_login_request:$input)"
            r1 = -1758155179(0xffffffff9734ae55, float:-5.8381175E-25)
            X.3lr r4 = r4.getOptionalTreeField(r7, r2, r3, r1)
            r10 = 0
            if (r4 != 0) goto L_0x0faf
            java.lang.String r1 = "Malformed finish response payload"
            X.N0K r2 = A00(r10, r1)
        L_0x0eb7:
            boolean r1 = r2 instanceof X.N0L
            if (r1 == 0) goto L_0x1031
            java.lang.Object r5 = r0.A01
            X.OL1 r5 = (X.OL1) r5
            X.N0L r2 = (X.N0L) r2
            java.lang.Object r2 = r2.A00
            X.OMa r2 = (X.C70805OMa) r2
            X.OWR r6 = r5.A00
            com.facebook.quicklog.LightweightQuickPerformanceLogger r8 = r6.A01
            r3 = 1021649468(0x3ce5223c, float:0.027970426)
            int r4 = r6.A00
            java.lang.String r0 = "finish_login_network_end"
            r8.markerPoint(r3, r4, r0)
            java.lang.String r0 = "finish_login_network_call_success"
            r8.markerPoint(r3, r4, r0)
            java.lang.Integer r1 = r2.A00
            if (r1 == 0) goto L_0x0ee0
            X.OEl r0 = r5.A01
            r0.A00 = r1
        L_0x0ee0:
            boolean r0 = r2.A01
            java.lang.String r9 = "Vesta Server Login Failure"
            if (r0 != 0) goto L_0x0f00
            java.lang.String r0 = "finish_login_failure"
            r8.markerPoint(r3, r0)
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "vesta_service_error"
            r8.markerAnnotate(r3, r4, r1, r0)
            X.OVI r13 = r5.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            X.Nnp r0 = A02(r0, r9)
            X.OEl r12 = r5.A01
        L_0x0efc:
            X.OVI.A00(r12, r13, r0)
            return
        L_0x0f00:
            byte[] r2 = r2.A02
            if (r2 == 0) goto L_0x0f97
            int r1 = r2.length
            byte[] r0 = java.util.Arrays.copyOf(r2, r1)
            if (r0 == 0) goto L_0x0f97
            byte[] r9 = java.util.Arrays.copyOf(r2, r1)     // Catch:{ 4zz -> 0x0f63 }
            X.ODH r0 = r5.A03     // Catch:{ 4zz -> 0x0f63 }
            byte[] r2 = r0.A02     // Catch:{ 4zz -> 0x0f63 }
            byte[] r1 = r0.A00     // Catch:{ 4zz -> 0x0f63 }
            com.facebook.vesta.VestaClient r0 = com.facebook.vesta.VestaClient.$redex_init_class     // Catch:{ 4zz -> 0x0f63 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ 4zz -> 0x0f63 }
            int r1 = com.facebook.vesta.VestaClient.unpackLoginPayloadProtoNative(r9, r2, r1, r0)     // Catch:{ 4zz -> 0x0f63 }
            if (r1 != 0) goto L_0x0f5d
            byte[][] r0 = com.facebook.vesta.VestaClient.parseNativeResults(r0)     // Catch:{ 4zz -> 0x0f63 }
            r1 = r0[r7]     // Catch:{ 4zz -> 0x0f63 }
            java.lang.String r0 = "unpack_login_payload"
            r8.markerPoint(r3, r4, r0)     // Catch:{ 4zz -> 0x0f63 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ 4zz -> 0x0f63 }
            java.lang.String r9 = new java.lang.String     // Catch:{ 4zz -> 0x0f63 }
            r9.<init>(r1, r0)     // Catch:{ 4zz -> 0x0f63 }
            X.OVI r8 = r5.A02     // Catch:{ 4zz -> 0x0f63 }
            X.OWR r7 = r8.A00     // Catch:{ 4zz -> 0x0f63 }
            com.facebook.quicklog.LightweightQuickPerformanceLogger r2 = r7.A01     // Catch:{ 4zz -> 0x0f63 }
            int r1 = r7.A00     // Catch:{ 4zz -> 0x0f63 }
            java.lang.String r0 = "fetch_recovery_code_success"
            r2.markerPoint(r3, r1, r0)     // Catch:{ 4zz -> 0x0f63 }
            X.OAa r4 = new X.OAa     // Catch:{ 4zz -> 0x0f63 }
            r4.<init>()     // Catch:{ 4zz -> 0x0f63 }
            java.lang.String r3 = r8.A03     // Catch:{ 4zz -> 0x0f63 }
            X.OFm r0 = r8.A01     // Catch:{ 4zz -> 0x0f63 }
            X.OOB r1 = r0.A03     // Catch:{ 4zz -> 0x0f63 }
            X.Njv r0 = X.C69356Njv.A09     // Catch:{ 4zz -> 0x0f63 }
            X.ObS r2 = r1.A05(r0, r9, r3)     // Catch:{ 4zz -> 0x0f63 }
            X.ObS r1 = r8.A02     // Catch:{ 4zz -> 0x0f63 }
            X.OmI r0 = new X.OmI     // Catch:{ 4zz -> 0x0f63 }
            r0.<init>(r7, r4, r1, r3)     // Catch:{ 4zz -> 0x0f63 }
            r2.A04(r0)     // Catch:{ 4zz -> 0x0f63 }
            goto L_0x1030
        L_0x0f5d:
            X.4zz r0 = new X.4zz     // Catch:{ 4zz -> 0x0f63 }
            r0.<init>(r1)     // Catch:{ 4zz -> 0x0f63 }
            throw r0     // Catch:{ 4zz -> 0x0f63 }
        L_0x0f63:
            r4 = move-exception
            java.lang.String r0 = "Unexpected Vesta client exception on unpackLoginPayloadProto, error code: "
            java.lang.Integer r3 = r4.A00
            java.lang.String r2 = X.C69741NrQ.A00(r3)
            java.lang.String r1 = X.002.A0R(r0, r2)
            java.lang.String r0 = "VestaBackupRestoreModule"
            X.0KC.A0F(r0, r1, r4)
            java.lang.String r1 = "VestaClientException: "
            if (r3 == 0) goto L_0x0f94
            java.lang.String r0 = X.C69741NrQ.A00(r3)
        L_0x0f7d:
            java.lang.String r1 = X.002.A0R(r1, r0)
            int r0 = r3.intValue()
            r6.A02(r2, r0)
            X.OVI r13 = r5.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            X.Nnp r0 = A02(r0, r1)
            X.OEl r12 = r5.A01
            goto L_0x0efc
        L_0x0f94:
            java.lang.String r0 = "null"
            goto L_0x0f7d
        L_0x0f97:
            java.lang.String r0 = "finish_login_failure"
            r8.markerPoint(r3, r0)
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "vesta_service_error"
            r8.markerAnnotate(r3, r4, r1, r0)
            X.OVI r13 = r5.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            X.Nnp r0 = A02(r0, r9)
            X.OEl r12 = r5.A01
            goto L_0x0efc
        L_0x0faf:
            java.lang.Class<X.BXt> r3 = X.C42276BXt.class
            java.lang.String r2 = "XFBVestaError"
            r1 = 793182893(0x2f4702ad, float:1.8099895E-10)
            X.3lr r3 = r4.reinterpretIfFulfillsType(r7, r2, r3, r1)
            if (r3 == 0) goto L_0x0fd0
            java.lang.String r1 = "message"
            java.lang.String r2 = r3.A08(r1)
            if (r2 != 0) goto L_0x0fc6
            java.lang.String r2 = "Unknown finish error message"
        L_0x0fc6:
            java.lang.Integer r1 = A03(r3)
            X.N0K r2 = A00(r1, r2)
            goto L_0x0eb7
        L_0x0fd0:
            java.lang.Class<X.QW2> r3 = X.QW2.class
            r9 = 1
            java.lang.String r2 = "XFBVestaFinishLoginResponseV2"
            r1 = -1960914842(0xffffffff8b1ed066, float:-3.0586475E-32)
            X.3lr r8 = r4.reinterpretIfFulfillsType(r9, r2, r3, r1)
            if (r8 != 0) goto L_0x0fe6
            java.lang.String r1 = "Malformed finish response inner payload"
            X.N0K r2 = A00(r10, r1)
            goto L_0x0eb7
        L_0x0fe6:
            java.lang.String r1 = "base64url_encoded_login_payload"
            java.lang.String r6 = r8.A07(r1)
            java.lang.String r4 = "Missing fields in finish response inner payload"
            if (r6 != 0) goto L_0x0ff6
            X.N0K r2 = A00(r10, r4)
            goto L_0x0eb7
        L_0x0ff6:
            java.lang.String r3 = "login_success"
            boolean r1 = r8.hasFieldValue(r3)
            if (r1 != 0) goto L_0x1004
            X.N0K r2 = A00(r10, r4)
            goto L_0x0eb7
        L_0x1004:
            java.lang.String r2 = "attempts_remaining"
            boolean r1 = r8.hasFieldValue(r2)
            if (r1 != 0) goto L_0x1012
            X.N0K r2 = A00(r10, r4)
            goto L_0x0eb7
        L_0x1012:
            r1 = 8
            byte[] r4 = android.util.Base64.decode(r6, r1)
            boolean r3 = r8.getCoercedBooleanField(r9, r3)
            int r1 = r8.A00(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            X.OMa r1 = new X.OMa
            r1.<init>(r2, r4, r3)
            X.N0L r2 = new X.N0L
            r2.<init>(r1)
            goto L_0x0eb7
        L_0x1030:
            return
        L_0x1031:
            boolean r1 = r2 instanceof X.N0K
            if (r1 == 0) goto L_0x1046
            X.N0K r2 = (X.N0K) r2
            X.Nnm r2 = r2.A00
            java.lang.String r1 = "[FINISH] Processing GraphQL response failed"
            X.0KC.A0F(r5, r1, r2)
            java.lang.Object r0 = r0.A01
            X.OL1 r0 = (X.OL1) r0
            r0.A00(r2)
            return
        L_0x1046:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x104b:
            java.lang.String r6 = "VestaLoginServerProvider"
            r11 = 0
            if (r27 == 0) goto L_0x124c
            X.3lr r4 = X.C41845B3m.A0U(r2)
            if (r4 == 0) goto L_0x124c
            java.lang.Class<X.QW0> r3 = X.QW0.class
            r12 = 0
            java.lang.String r2 = "fbid_based_auth_layer_vesta_begin_login_v2(begin_login_request:$input)"
            r1 = -2042310221(0xffffffff8644d1b3, float:-3.7017565E-35)
            X.3lr r5 = r4.getOptionalTreeField(r12, r2, r3, r1)
            if (r5 != 0) goto L_0x10ab
            java.lang.String r1 = "Malformed begin response payload"
            X.N0K r2 = A00(r11, r1)
        L_0x106a:
            boolean r1 = r2 instanceof X.N0L
            if (r1 == 0) goto L_0x1232
            java.lang.Object r10 = r0.A01
            X.OLd r10 = (X.C70783OLd) r10
            X.N0L r2 = (X.N0L) r2
            java.lang.Object r5 = r2.A00
            X.OMi r5 = (X.C70813OMi) r5
            X.OWR r7 = r10.A00
            com.facebook.quicklog.LightweightQuickPerformanceLogger r9 = r7.A01
            r8 = 1021649468(0x3ce5223c, float:0.027970426)
            int r1 = r7.A00
            java.lang.String r0 = "begin_login_network_end"
            r9.markerPoint(r8, r1, r0)
            java.lang.String r0 = "begin_login_network_call_success"
            r9.markerPoint(r8, r1, r0)
            java.lang.Integer r2 = r5.A00
            if (r2 == 0) goto L_0x1093
            X.OEl r0 = r10.A01
            r0.A00 = r2
        L_0x1093:
            java.lang.Integer r2 = r5.A01
            if (r2 == 0) goto L_0x109b
            X.OEl r0 = r10.A01
            r0.A01 = r2
        L_0x109b:
            X.OEl r4 = r10.A01
            java.lang.String r6 = r10.A05
            X.OB7 r0 = r10.A03
            byte[] r14 = r0.A00
            byte[] r13 = r10.A06
            X.OVI r3 = r10.A02
            java.lang.String r2 = r10.A04
            goto L_0x113f
        L_0x10ab:
            java.lang.Class<X.BXs> r3 = X.C42275BXs.class
            java.lang.String r2 = "XFBVestaError"
            r1 = -1415172552(0xffffffffaba62e38, float:-1.1807838E-12)
            X.3lr r3 = r5.reinterpretIfFulfillsType(r12, r2, r3, r1)
            if (r3 == 0) goto L_0x10cb
            java.lang.String r1 = "message"
            java.lang.String r2 = r3.A08(r1)
            if (r2 != 0) goto L_0x10c2
            java.lang.String r2 = "Unknown begin error message"
        L_0x10c2:
            java.lang.Integer r1 = A03(r3)
            X.N0K r2 = A00(r1, r2)
            goto L_0x106a
        L_0x10cb:
            java.lang.Class<X.QVz> r3 = X.C7762QVz.class
            r4 = 1
            java.lang.String r2 = "XFBVestaBeginLoginResponseV2"
            r1 = -1434772085(0xffffffffaa7b1d8b, float:-2.2303528E-13)
            X.3lr r7 = r5.reinterpretIfFulfillsType(r4, r2, r3, r1)
            if (r7 != 0) goto L_0x10e0
            java.lang.String r1 = "Malformed begin response inner payload"
            X.N0K r2 = A00(r11, r1)
            goto L_0x106a
        L_0x10e0:
            java.lang.String r1 = "base64url_encoded_opaque_l2"
            java.lang.String r5 = r7.A07(r1)
            java.lang.String r3 = "Missing fields in begin response inner payload"
            if (r5 != 0) goto L_0x10f0
            X.N0K r2 = A00(r11, r3)
            goto L_0x106a
        L_0x10f0:
            java.lang.String r1 = "base64url_encoded_opaque_l2_sig"
            java.lang.String r4 = r7.getOptionalStringField(r4, r1)
            if (r4 != 0) goto L_0x10fe
            X.N0K r2 = A00(r11, r3)
            goto L_0x106a
        L_0x10fe:
            java.lang.String r2 = "attempts_remaining"
            boolean r1 = r7.hasFieldValue(r2)
            if (r1 != 0) goto L_0x110c
            X.N0K r2 = A00(r11, r3)
            goto L_0x106a
        L_0x110c:
            int r3 = r7.A00(r2)
            r2 = 3
            r1 = 89
            java.lang.String r1 = X.Pxd.A00(r1)
            int r2 = r7.getCoercedIntField(r2, r1)
            r1 = 8
            byte[] r5 = android.util.Base64.decode(r5, r1)
            byte[] r4 = android.util.Base64.decode(r4, r1)
            X.0qQ.A0A(r5)
            X.0qQ.A0A(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.OMi r1 = new X.OMi
            r1.<init>(r3, r2, r5, r4)
            X.N0L r2 = new X.N0L
            r2.<init>(r1)
            goto L_0x106a
        L_0x113f:
            byte[] r0 = r5.A02     // Catch:{ 4zz -> 0x11ec }
            byte[] r10 = X.C66583MXo.A1b(r0)     // Catch:{ 4zz -> 0x11ec }
            byte[] r0 = r5.A03     // Catch:{ 4zz -> 0x11ec }
            byte[] r5 = X.C66583MXo.A1b(r0)     // Catch:{ 4zz -> 0x11ec }
            com.facebook.vesta.VestaClient r0 = com.facebook.vesta.VestaClient.$redex_init_class     // Catch:{ 4zz -> 0x11ec }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ 4zz -> 0x11ec }
            int r5 = com.facebook.vesta.VestaClient.finishLoginNative(r10, r5, r13, r14, r0)     // Catch:{ 4zz -> 0x11ec }
            if (r5 != 0) goto L_0x11e6
            byte[][] r0 = com.facebook.vesta.VestaClient.parseNativeResults(r0)     // Catch:{ 4zz -> 0x11ec }
            r15 = r0[r12]     // Catch:{ 4zz -> 0x11ec }
            r10 = 1
            r14 = r0[r10]     // Catch:{ 4zz -> 0x11ec }
            r5 = 2
            r0 = r0[r5]     // Catch:{ 4zz -> 0x11ec }
            X.ODH r13 = new X.ODH     // Catch:{ 4zz -> 0x11ec }
            r13.<init>(r15, r14, r0)     // Catch:{ 4zz -> 0x11ec }
            java.lang.String r0 = "finish_login_vesta_client"
            r9.markerPoint(r8, r1, r0)     // Catch:{ 4zz -> 0x11ec }
            java.lang.String r0 = "finish_login_network_start"
            r9.markerPoint(r8, r1, r0)     // Catch:{ 4zz -> 0x11ec }
            X.OGb r9 = r4.A02     // Catch:{ 4zz -> 0x11ec }
            java.lang.Integer r0 = r4.A03     // Catch:{ 4zz -> 0x11ec }
            java.lang.String r0 = X.C69691NqD.A00(r0)     // Catch:{ 4zz -> 0x11ec }
            byte[] r1 = r13.A01     // Catch:{ 4zz -> 0x11ec }
            X.OL1 r8 = new X.OL1     // Catch:{ 4zz -> 0x11ec }
            r8.<init>(r7, r4, r3, r13)     // Catch:{ 4zz -> 0x11ec }
            X.AnonymousClass7TF.A1D(r1, r5, r2)     // Catch:{ 4zz -> 0x11ec }
            X.0Df r6 = X.C66584MXp.A0E(r0, r6)     // Catch:{ 4zz -> 0x11ec }
            r0 = 8
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ 4zz -> 0x11ec }
            java.lang.String r0 = "base64url_encoded_opaque_l3"
            X.0Df.A00(r6, r1, r0)     // Catch:{ 4zz -> 0x11ec }
            java.lang.String r0 = "request_uuid"
            X.0Df.A00(r6, r2, r0)     // Catch:{ 4zz -> 0x11ec }
            java.lang.Class<X.OOJ> r2 = X.OOJ.class
            java.lang.String r1 = "create"
            java.lang.Class[] r0 = new java.lang.Class[r12]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x11e0 }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x11e0 }
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x11e0 }
            java.lang.Object r2 = r1.invoke(r11, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x11e0 }
            X.OnO r2 = (X.C71587OnO) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x11e0 }
            X.2IS r1 = r2.A00     // Catch:{ 4zz -> 0x11ec }
            java.lang.String r0 = "input"
            X.DbW.A18(r6, r1, r0)     // Catch:{ 4zz -> 0x11ec }
            r2.A01 = r10     // Catch:{ 4zz -> 0x11ec }
            com.facebook.pando.PandoGraphQLRequest r6 = r2.build()     // Catch:{ 4zz -> 0x11ec }
            X.0qQ.A07(r6)     // Catch:{ 4zz -> 0x11ec }
            boolean r0 = r9.A01     // Catch:{ UnsupportedOperationException -> 0x11c1 }
            if (r0 == 0) goto L_0x11c1
            r6.setRequestPurpose(r5)     // Catch:{ UnsupportedOperationException -> 0x11c1 }
        L_0x11c1:
            boolean r0 = r9.A02     // Catch:{ UnsupportedOperationException -> 0x11ce }
            if (r0 == 0) goto L_0x11ce
            X.1Ef r1 = r6.setRetryPolicy(r10)     // Catch:{ UnsupportedOperationException -> 0x11ce }
            int r0 = r9.A00     // Catch:{ UnsupportedOperationException -> 0x11ce }
            r1.setNetworkTimeoutSeconds(r0)     // Catch:{ UnsupportedOperationException -> 0x11ce }
        L_0x11ce:
            X.1vo r5 = r9.A04     // Catch:{ 4zz -> 0x11ec }
            X.OnG r2 = new X.OnG     // Catch:{ 4zz -> 0x11ec }
            r2.<init>(r10, r9, r8)     // Catch:{ 4zz -> 0x11ec }
            X.On2 r1 = new X.On2     // Catch:{ 4zz -> 0x11ec }
            r1.<init>(r8, r10)     // Catch:{ 4zz -> 0x11ec }
            java.util.concurrent.Executor r0 = r9.A05     // Catch:{ 4zz -> 0x11ec }
            r5.ATM(r1, r2, r6, r0)     // Catch:{ 4zz -> 0x11ec }
            return
        L_0x11e0:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)     // Catch:{ 4zz -> 0x11ec }
            goto L_0x11eb
        L_0x11e6:
            X.4zz r0 = new X.4zz     // Catch:{ 4zz -> 0x11ec }
            r0.<init>(r5)     // Catch:{ 4zz -> 0x11ec }
        L_0x11eb:
            throw r0     // Catch:{ 4zz -> 0x11ec }
        L_0x11ec:
            r2 = move-exception
            java.lang.String r0 = "Unexpected Vesta client exception on finishLogin, error code: "
            java.lang.Integer r6 = r2.A00
            java.lang.String r5 = X.C69741NrQ.A00(r6)
            java.lang.String r1 = X.002.A0R(r0, r5)
            java.lang.String r0 = "VestaBackupRestoreModule"
            X.0KC.A0F(r0, r1, r2)
            java.lang.String r0 = "VestaClientException: "
            if (r6 == 0) goto L_0x1225
            java.lang.String r2 = X.C69741NrQ.A00(r6)
        L_0x1206:
            java.lang.String r1 = X.002.A0R(r0, r2)
            int r0 = r6.intValue()
            r7.A02(r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r6 != r0) goto L_0x1228
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            java.lang.String r0 = "VestaClientInvalidPassword: "
            java.lang.String r0 = X.002.A0R(r0, r2)
            X.Nnp r0 = A02(r1, r0)
            X.OVI.A00(r4, r3, r0)
            return
        L_0x1225:
            java.lang.String r2 = "null"
            goto L_0x1206
        L_0x1228:
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            X.Nnp r0 = A02(r0, r1)
            X.OVI.A00(r4, r3, r0)
            return
        L_0x1232:
            boolean r1 = r2 instanceof X.N0K
            if (r1 == 0) goto L_0x1247
            X.N0K r2 = (X.N0K) r2
            X.Nnm r2 = r2.A00
            java.lang.String r1 = "[BEGIN] Processing GraphQL response failed"
            X.0KC.A0F(r6, r1, r2)
            java.lang.Object r0 = r0.A01
            X.OLd r0 = (X.C70783OLd) r0
            r0.A00(r2)
            return
        L_0x1247:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x124c:
            java.lang.String r1 = "[BEGIN] Missing GraphQL response object"
            X.0KC.A0C(r6, r1)
            java.lang.Object r2 = r0.A01
            X.OLd r2 = (X.C70783OLd) r2
            java.lang.String r1 = "Bad begin response received"
            X.Nnm r0 = new X.Nnm
            r0.<init>(r1, r11)
            r2.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71579OnG.invoke(X.3JD):void");
    }

    public static void A04(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, int i, int i2) {
        lightweightQuickPerformanceLogger.markerPoint(i, i2, str);
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, TraceFieldType.FailureReason, str);
    }
}
