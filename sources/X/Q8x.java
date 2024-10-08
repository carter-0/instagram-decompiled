package X;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;

public final class Q8x extends WebView {
    public final C10329RqS A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q8x(Context context, S1X s1x) {
        super(context);
        0qQ.A0B(s1x, 2);
        this.A00 = new C10329RqS(s1x);
        addJavascriptInterface(this, "CheckoutSheetProtocolConsumer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0625, code lost:
        r10.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0628, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x06e0, code lost:
        X.SB0.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x06e3, code lost:
        return;
     */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void postMessage(java.lang.String r17) {
        /*
            r16 = this;
            r4 = 0
            r2 = r17
            X.0qQ.A0B(r2, r4)
            X.TXy r0 = X.C13389TXy.A00
            X.3mC r5 = X.C250863mB.A03
            X.9FC r1 = X.AnonymousClass9FA.A00(r0, r5)
            X.Wsy r0 = X.C20518Wsy.A00
            java.lang.Object r2 = r1.A00(r2, r0)
            X.Vva r2 = (X.C18638Vva) r2
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "init"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
            java.lang.Integer r3 = X.AnonymousClass05K.A00
        L_0x0022:
            r0 = r16
            X.RqS r1 = r0.A00
            java.lang.String r6 = r2.A00
            boolean r2 = X.AnonymousClass7TF.A1U(r4, r3, r6)
            goto L_0x00ab
        L_0x002d:
            java.lang.String r0 = "completed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x0022
        L_0x0038:
            java.lang.String r0 = "stateChange"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0044
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x0022
        L_0x0044:
            java.lang.String r0 = "checkoutStarted"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            goto L_0x0022
        L_0x004f:
            java.lang.String r0 = "error"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005a
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            goto L_0x0022
        L_0x005a:
            java.lang.String r0 = "checkoutBlockingEvent"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0065
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            goto L_0x0022
        L_0x0065:
            java.lang.String r0 = "updatePayButtonState"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0071
            java.lang.Integer r3 = X.AnonymousClass05K.A0u
            goto L_0x0022
        L_0x0071:
            java.lang.String r0 = "updateProgressButton"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
            java.lang.Integer r3 = X.AnonymousClass05K.A15
            goto L_0x0022
        L_0x007d:
            java.lang.String r0 = "locale"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
            goto L_0x0022
        L_0x0088:
            java.lang.String r0 = "interceptXHR"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0093
            java.lang.Integer r3 = X.AnonymousClass05K.A1I
            goto L_0x0022
        L_0x0093:
            java.lang.String r0 = "interceptFetch"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009e
            java.lang.Integer r3 = X.AnonymousClass05K.A02
            goto L_0x0022
        L_0x009e:
            java.lang.String r0 = "monitoredNetworkRequests"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0706
            java.lang.Integer r3 = X.AnonymousClass05K.A03
            goto L_0x0022
        L_0x00ab:
            X.Rij r0 = X.C9870Rij.$redex_init_class     // Catch:{ Exception -> 0x06f0 }
            int r0 = r3.intValue()     // Catch:{ Exception -> 0x06f0 }
            switch(r0) {
                case 0: goto L_0x0422;
                case 1: goto L_0x04f6;
                case 2: goto L_0x0629;
                case 3: goto L_0x0599;
                case 4: goto L_0x0120;
                case 5: goto L_0x037e;
                case 6: goto L_0x0376;
                case 7: goto L_0x02b9;
                case 8: goto L_0x0237;
                case 9: goto L_0x06ea;
                case 10: goto L_0x06e4;
                default: goto L_0x00b4;
            }     // Catch:{ Exception -> 0x06f0 }
        L_0x00b4:
            X.TXz r0 = X.C13390TXz.A00     // Catch:{ Exception -> 0x06f0 }
            X.9FC r2 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x06f0 }
            kotlinx.serialization.json.JsonArraySerializer r0 = kotlinx.serialization.json.JsonArraySerializer.A01     // Catch:{ Exception -> 0x06f0 }
            java.lang.Object r0 = r2.A00(r6, r0)     // Catch:{ Exception -> 0x06f0 }
            kotlinx.serialization.json.JsonArray r0 = (kotlinx.serialization.json.JsonArray) r0     // Catch:{ Exception -> 0x06f0 }
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)     // Catch:{ Exception -> 0x06f0 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x06f0 }
        L_0x00ca:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r3 = r4.next()     // Catch:{ Exception -> 0x06f0 }
            kotlinx.serialization.json.JsonElement r3 = (kotlinx.serialization.json.JsonElement) r3     // Catch:{ Exception -> 0x06f0 }
            X.TY0 r0 = X.TY0.A00     // Catch:{ Exception -> 0x06f0 }
            X.9FC r2 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x06f0 }
            X.3uA[] r0 = com.shopify.checkout.models.NetworkRequestPayload.A06     // Catch:{ Exception -> 0x06f0 }
            X.WtF r0 = X.C20534WtF.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.Object r0 = r2.A01(r0, r3)     // Catch:{ Exception -> 0x06f0 }
            r6.add(r0)     // Catch:{ Exception -> 0x06f0 }
            goto L_0x00ca
        L_0x00e8:
            java.util.List r2 = X.00k.A0a(r6)     // Catch:{ Exception -> 0x06f0 }
            X.S1X r0 = r1.A00     // Catch:{ Exception -> 0x06f0 }
            X.QQ0 r3 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x06f0 }
        L_0x00f4:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0705
            java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x06f0 }
            com.shopify.checkout.models.NetworkRequestPayload r0 = (com.shopify.checkout.models.NetworkRequestPayload) r0     // Catch:{ Exception -> 0x06f0 }
            X.SUF r4 = r3.A01     // Catch:{ Exception -> 0x06f0 }
            if (r4 == 0) goto L_0x00f4
            java.lang.String r5 = r3.A02     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r6 = r0.A04     // Catch:{ Exception -> 0x06f0 }
            if (r6 != 0) goto L_0x010c
            java.lang.String r6 = ""
        L_0x010c:
            java.util.Map r11 = r0.A05     // Catch:{ Exception -> 0x06f0 }
            if (r11 != 0) goto L_0x0114
            X.0sm r11 = X.0Yt.A0E()     // Catch:{ Exception -> 0x06f0 }
        L_0x0114:
            java.lang.String r7 = r0.A02     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r9 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r10 = r0.A03     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r8 = "SHOPIFY_DATA_MIRRORING"
            r4.A0F(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x06f0 }
            goto L_0x00f4
        L_0x0120:
            X.TXz r0 = X.C13390TXz.A00     // Catch:{ Exception -> 0x06f0 }
            X.9FC r3 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x06f0 }
            kotlinx.serialization.json.JsonArraySerializer r0 = kotlinx.serialization.json.JsonArraySerializer.A01     // Catch:{ Exception -> 0x06f0 }
            java.lang.Object r0 = r3.A00(r6, r0)     // Catch:{ Exception -> 0x06f0 }
            kotlinx.serialization.json.JsonArray r0 = (kotlinx.serialization.json.JsonArray) r0     // Catch:{ Exception -> 0x06f0 }
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r0)     // Catch:{ Exception -> 0x06f0 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ Exception -> 0x06f0 }
        L_0x0136:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x022f
            java.lang.Object r9 = r12.next()     // Catch:{ Exception -> 0x06f0 }
            kotlinx.serialization.json.JsonElement r9 = (kotlinx.serialization.json.JsonElement) r9     // Catch:{ Exception -> 0x06f0 }
            kotlinx.serialization.json.JsonObject r3 = X.C271114hv.A03(r9)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r0 = "group"
            java.lang.Object r0 = X.0Yt.A01(r0, r3)     // Catch:{ Exception -> 0x0220 }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ Exception -> 0x0220 }
            kotlinx.serialization.json.JsonPrimitive r0 = X.C271114hv.A06(r0)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r11 = r0.A00()     // Catch:{ Exception -> 0x0220 }
            com.shopify.checkout.models.errors.ErrorGroup[] r10 = com.shopify.checkout.models.errors.ErrorGroup.values()     // Catch:{ Exception -> 0x0220 }
            r7 = 0
            int r6 = r10.length     // Catch:{ Exception -> 0x0220 }
        L_0x015c:
            if (r7 >= r6) goto L_0x0215
            r3 = r10[r7]     // Catch:{ Exception -> 0x0220 }
            java.lang.String r0 = r3.A00     // Catch:{ Exception -> 0x0220 }
            boolean r0 = X.0qQ.A0K(r0, r11)     // Catch:{ Exception -> 0x0220 }
            if (r0 == 0) goto L_0x0175
            int r0 = r3.ordinal()     // Catch:{ Exception -> 0x0220 }
            switch(r0) {
                case 0: goto L_0x01be;
                case 1: goto L_0x0178;
                case 2: goto L_0x01b7;
                case 3: goto L_0x0188;
                case 4: goto L_0x0198;
                case 5: goto L_0x01a8;
                default: goto L_0x016f;
            }     // Catch:{ Exception -> 0x0220 }
        L_0x016f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ Exception -> 0x0220 }
            goto L_0x021f
        L_0x0175:
            int r7 = r7 + 1
            goto L_0x015c
        L_0x0178:
            X.TY0 r0 = X.TY0.A00     // Catch:{ Exception -> 0x0220 }
            X.9FC r3 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x0220 }
            X.WtL r0 = X.C20540WtL.A00     // Catch:{ Exception -> 0x0220 }
            java.lang.Object r7 = r3.A01(r0, r9)     // Catch:{ Exception -> 0x0220 }
            X.X1t r7 = (X.C20867X1t) r7     // Catch:{ Exception -> 0x0220 }
            goto L_0x022a
        L_0x0188:
            X.TY0 r0 = X.TY0.A00     // Catch:{ Exception -> 0x0220 }
            X.9FC r3 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x0220 }
            X.WtP r0 = X.C20544WtP.A00     // Catch:{ Exception -> 0x0220 }
            java.lang.Object r7 = r3.A01(r0, r9)     // Catch:{ Exception -> 0x0220 }
            X.X1t r7 = (X.C20867X1t) r7     // Catch:{ Exception -> 0x0220 }
            goto L_0x022a
        L_0x0198:
            X.TY0 r0 = X.TY0.A00     // Catch:{ Exception -> 0x0220 }
            X.9FC r3 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x0220 }
            X.WtM r0 = X.C20541WtM.A00     // Catch:{ Exception -> 0x0220 }
            java.lang.Object r7 = r3.A01(r0, r9)     // Catch:{ Exception -> 0x0220 }
            X.X1t r7 = (X.C20867X1t) r7     // Catch:{ Exception -> 0x0220 }
            goto L_0x022a
        L_0x01a8:
            X.TY0 r0 = X.TY0.A00     // Catch:{ Exception -> 0x0220 }
            X.9FC r3 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x0220 }
            X.WtO r0 = X.C20543WtO.A00     // Catch:{ Exception -> 0x0220 }
            java.lang.Object r7 = r3.A01(r0, r9)     // Catch:{ Exception -> 0x0220 }
            X.X1t r7 = (X.C20867X1t) r7     // Catch:{ Exception -> 0x0220 }
            goto L_0x022a
        L_0x01b7:
            java.lang.String r0 = "Internal errors should not be decoded"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ Exception -> 0x0220 }
            goto L_0x021f
        L_0x01be:
            kotlinx.serialization.json.JsonObject r3 = X.C271114hv.A03(r9)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r0 = "type"
            java.lang.Object r0 = X.0Yt.A01(r0, r3)     // Catch:{ Exception -> 0x0220 }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ Exception -> 0x0220 }
            kotlinx.serialization.json.JsonPrimitive r0 = X.C271114hv.A06(r0)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r11 = r0.A00()     // Catch:{ Exception -> 0x0220 }
            com.shopify.checkout.models.errors.violations.ViolationErrorType[] r10 = com.shopify.checkout.models.errors.violations.ViolationErrorType.values()     // Catch:{ Exception -> 0x0220 }
            int r7 = r10.length     // Catch:{ Exception -> 0x0220 }
            r6 = 0
        L_0x01d9:
            if (r6 >= r7) goto L_0x020e
            r3 = r10[r6]     // Catch:{ Exception -> 0x0220 }
            java.lang.String r0 = r3.A00     // Catch:{ Exception -> 0x0220 }
            boolean r0 = X.0qQ.A0K(r0, r11)     // Catch:{ Exception -> 0x0220 }
            if (r0 == 0) goto L_0x01ec
            int r0 = r3.ordinal()     // Catch:{ Exception -> 0x0220 }
            if (r0 == r2) goto L_0x01ff
            goto L_0x01ef
        L_0x01ec:
            int r6 = r6 + 1
            goto L_0x01d9
        L_0x01ef:
            if (r0 != r4) goto L_0x01fa
            X.TY0 r0 = X.TY0.A00     // Catch:{ Exception -> 0x0220 }
            X.9FC r3 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x0220 }
            X.WtQ r0 = X.C20545WtQ.A00     // Catch:{ Exception -> 0x0220 }
            goto L_0x0207
        L_0x01fa:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ Exception -> 0x0220 }
            goto L_0x021f
        L_0x01ff:
            X.TY0 r0 = X.TY0.A00     // Catch:{ Exception -> 0x0220 }
            X.9FC r3 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x0220 }
            X.WtR r0 = X.C20546WtR.A00     // Catch:{ Exception -> 0x0220 }
        L_0x0207:
            java.lang.Object r7 = r3.A01(r0, r9)     // Catch:{ Exception -> 0x0220 }
            X.X1t r7 = (X.C20867X1t) r7     // Catch:{ Exception -> 0x0220 }
            goto L_0x022a
        L_0x020e:
            java.lang.String r0 = "Unknown type value: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r11)     // Catch:{ Exception -> 0x0220 }
            goto L_0x021f
        L_0x0215:
            java.lang.String r0 = "InvalidErrorType"
            java.lang.String r0 = X.C66580MXl.A10(r0, r11)     // Catch:{ Exception -> 0x0220 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ Exception -> 0x0220 }
        L_0x021f:
            throw r0     // Catch:{ Exception -> 0x0220 }
        L_0x0220:
            r6 = move-exception
            java.lang.Integer r3 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "fail_to_parse_error_json"
            X.Wgb r7 = new X.Wgb     // Catch:{ Exception -> 0x06f0 }
            r7.<init>(r6, r3, r0)     // Catch:{ Exception -> 0x06f0 }
        L_0x022a:
            r8.add(r7)     // Catch:{ Exception -> 0x06f0 }
            goto L_0x0136
        L_0x022f:
            X.S1X r0 = r1.A00     // Catch:{ Exception -> 0x06f0 }
            X.QQ0 r0 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            r0.A02(r8)     // Catch:{ Exception -> 0x06f0 }
            return
        L_0x0237:
            X.TXz r0 = X.C13390TXz.A00     // Catch:{ Exception -> 0x06f0 }
            X.9FC r0 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x06f0 }
            X.WtD r7 = X.C20532WtD.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.Object r3 = r0.A00(r6, r7)     // Catch:{ Exception -> 0x06f0 }
            com.shopify.checkout.models.LocalePayload r3 = (com.shopify.checkout.models.LocalePayload) r3     // Catch:{ Exception -> 0x06f0 }
            X.S1X r0 = r1.A00     // Catch:{ Exception -> 0x06f0 }
            X.0qQ.A0B(r3, r4)     // Catch:{ Exception -> 0x06f0 }
            X.QQ0 r6 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r5 = r5.A02(r3, r7)     // Catch:{ Exception -> 0x06f0 }
            X.Rqz r0 = r6.A00     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0260
            X.4tV r4 = r0.A01     // Catch:{ Exception -> 0x06f0 }
            X.6Rm r3 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            X.TIB r0 = new X.TIB     // Catch:{ Exception -> 0x06f0 }
            r0.<init>(r3, r4, r5)     // Catch:{ Exception -> 0x06f0 }
            X.SB0.A00(r0)     // Catch:{ Exception -> 0x06f0 }
        L_0x0260:
            X.SUF r9 = r6.A01     // Catch:{ Exception -> 0x06f0 }
            if (r9 == 0) goto L_0x0705
            java.lang.String r8 = r6.A0B     // Catch:{ Exception -> 0x06f0 }
            if (r8 != 0) goto L_0x026a
            java.lang.String r8 = ""
        L_0x026a:
            java.lang.String r11 = r6.A0A     // Catch:{ Exception -> 0x06f0 }
            long r3 = r6.A06     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r13 = r6.A03     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r7 = r6.A09     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r12 = "2024-10"
            java.lang.String r6 = r6.A02     // Catch:{ Exception -> 0x06f0 }
            X.AnonymousClass7TG.A0w(r2, r11, r13, r7)     // Catch:{ Exception -> 0x06f0 }
            X.0Aj r10 = X.SUF.A02(r9)     // Catch:{ Exception -> 0x06f0 }
            boolean r0 = r10.isSampled()     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0705
            X.2M7 r0 = A00(r10, r9, r11)     // Catch:{ Exception -> 0x06f0 }
            X.Pxh.A18(r0, r10)     // Catch:{ Exception -> 0x06f0 }
            X.QIU r11 = new X.QIU     // Catch:{ Exception -> 0x06f0 }
            r11.<init>()     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "handle_locale"
            X.SUF.A09(r11, r9, r0)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "shopify_sdk_payload"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r0, r5)     // Catch:{ Exception -> 0x06f0 }
            X.0eP r2 = X.SUF.A08(r13)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "csp_version"
            X.0eP[] r0 = X.Pxg.A1b(r0, r12, r5, r2)     // Catch:{ Exception -> 0x06f0 }
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)     // Catch:{ Exception -> 0x06f0 }
            X.Pxi.A1B(r10, r11, r0)     // Catch:{ Exception -> 0x06f0 }
            X.QHe r0 = new X.QHe     // Catch:{ Exception -> 0x06f0 }
            r0.<init>()     // Catch:{ Exception -> 0x06f0 }
            X.SUF.A0B(r0, r6, r8, r3)     // Catch:{ Exception -> 0x06f0 }
            X.QKY.A00(r10, r0, r9, r8, r7)     // Catch:{ Exception -> 0x06f0 }
            goto L_0x0625
        L_0x02b9:
            X.TXz r0 = X.C13390TXz.A00     // Catch:{ Exception -> 0x06f0 }
            X.9FC r3 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x06f0 }
            X.WtK r0 = X.C20539WtK.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.Object r0 = r3.A00(r6, r0)     // Catch:{ Exception -> 0x06f0 }
            com.shopify.checkout.models.ProgressButton r0 = (com.shopify.checkout.models.ProgressButton) r0     // Catch:{ Exception -> 0x06f0 }
            X.S1X r5 = r1.A00     // Catch:{ Exception -> 0x06f0 }
            com.shopify.checkout.models.ProgressButtonState r3 = r0.A01     // Catch:{ Exception -> 0x06f0 }
            com.shopify.checkout.models.ProgressButtonStage r0 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            X.0qQ.A0B(r3, r4)     // Catch:{ Exception -> 0x06f0 }
            X.0qQ.A0B(r0, r2)     // Catch:{ Exception -> 0x06f0 }
            X.QQ0 r9 = r5.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r14 = r3.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r11 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            X.Rqz r0 = r9.A00     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x02ef
            X.0qQ.A0B(r14, r4)     // Catch:{ Exception -> 0x06f0 }
            X.0qQ.A0B(r11, r2)     // Catch:{ Exception -> 0x06f0 }
            X.4tV r4 = r0.A01     // Catch:{ Exception -> 0x06f0 }
            X.6Rm r3 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            X.TJW r0 = new X.TJW     // Catch:{ Exception -> 0x06f0 }
            r0.<init>(r3, r4, r11, r14)     // Catch:{ Exception -> 0x06f0 }
            X.SB0.A00(r0)     // Catch:{ Exception -> 0x06f0 }
        L_0x02ef:
            X.SUF r8 = r9.A01     // Catch:{ Exception -> 0x06f0 }
            if (r8 == 0) goto L_0x0705
            java.lang.String r7 = r9.A0B     // Catch:{ Exception -> 0x06f0 }
            if (r7 != 0) goto L_0x02f9
            java.lang.String r7 = ""
        L_0x02f9:
            java.lang.String r3 = r9.A0A     // Catch:{ Exception -> 0x06f0 }
            long r4 = r9.A06     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r13 = r9.A03     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r6 = r9.A09     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r12 = "2024-10"
            java.lang.String r9 = r9.A02     // Catch:{ Exception -> 0x06f0 }
            X.AnonymousClass7TG.A0w(r2, r3, r13, r6)     // Catch:{ Exception -> 0x06f0 }
            X.C51972G9s.A1E(r14, r11)     // Catch:{ Exception -> 0x06f0 }
            X.0Aj r10 = X.SUF.A02(r8)     // Catch:{ Exception -> 0x06f0 }
            boolean r0 = r10.isSampled()     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0705
            java.lang.String r15 = "{\"progressButtonState\":"
            java.lang.String r2 = ",\"progressButtonStage\":"
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = X.002.A0v(r15, r14, r2, r11, r0)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = X.002.A0B(r0)     // Catch:{ Exception -> 0x06f0 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = X.0rw.A0t(r0)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r2 = X.DbV.A12(r0)     // Catch:{ Exception -> 0x06f0 }
            X.2M7 r0 = A00(r10, r8, r3)     // Catch:{ Exception -> 0x06f0 }
            X.Pxh.A18(r0, r10)     // Catch:{ Exception -> 0x06f0 }
            X.QIU r11 = new X.QIU     // Catch:{ Exception -> 0x06f0 }
            r11.<init>()     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "handle_progress_button"
            X.SUF.A09(r11, r8, r0)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "shopify_sdk_payload"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r2)     // Catch:{ Exception -> 0x06f0 }
            X.0eP r2 = X.SUF.A08(r13)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "csp_version"
            X.0eP[] r0 = X.Pxg.A1b(r0, r12, r3, r2)     // Catch:{ Exception -> 0x06f0 }
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)     // Catch:{ Exception -> 0x06f0 }
            X.Pxi.A1B(r10, r11, r0)     // Catch:{ Exception -> 0x06f0 }
            X.QHe r3 = new X.QHe     // Catch:{ Exception -> 0x06f0 }
            r3.<init>()     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "commerce_checkout_session_id"
            r3.A06(r0, r9)     // Catch:{ Exception -> 0x06f0 }
            java.util.List r2 = X.SUF.A07(r4)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "seller_ids"
            r3.A07(r0, r2)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "iaw_session_id"
            r3.A06(r0, r7)     // Catch:{ Exception -> 0x06f0 }
            X.QKY.A00(r10, r3, r8, r7, r6)     // Catch:{ Exception -> 0x06f0 }
            goto L_0x0625
        L_0x0376:
            java.lang.String r2 = "This message was deprecated, use updateProgressButton instead"
            java.io.PrintStream r0 = java.lang.System.out     // Catch:{ Exception -> 0x06f0 }
            r0.print(r2)     // Catch:{ Exception -> 0x06f0 }
            return
        L_0x037e:
            X.TXz r0 = X.C13390TXz.A00     // Catch:{ Exception -> 0x06f0 }
            X.9FC r3 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x06f0 }
            X.40E r0 = X.AnonymousClass40E.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.Object r0 = r3.A00(r6, r0)     // Catch:{ Exception -> 0x06f0 }
            boolean r10 = X.AnonymousClass7TE.A1a(r0)     // Catch:{ Exception -> 0x06f0 }
            X.S1X r0 = r1.A00     // Catch:{ Exception -> 0x06f0 }
            X.QQ0 r9 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            X.SUF r8 = r9.A01     // Catch:{ Exception -> 0x06f0 }
            if (r8 == 0) goto L_0x0413
            java.lang.String r7 = r9.A0B     // Catch:{ Exception -> 0x06f0 }
            if (r7 != 0) goto L_0x039c
            java.lang.String r7 = ""
        L_0x039c:
            java.lang.String r3 = r9.A0A     // Catch:{ Exception -> 0x06f0 }
            long r5 = r9.A06     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r14 = r9.A03     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r4 = r9.A09     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r15 = "2024-10"
            java.lang.String r11 = "{\"should_expand_view\":\""
            java.lang.String r0 = "\"}"
            java.lang.String r13 = X.002.A1B(r11, r0, r10)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r12 = r9.A02     // Catch:{ Exception -> 0x06f0 }
            X.AnonymousClass7TG.A0w(r2, r3, r14, r4)     // Catch:{ Exception -> 0x06f0 }
            r0 = 6
            X.0qQ.A0B(r13, r0)     // Catch:{ Exception -> 0x06f0 }
            X.0Aj r11 = X.SUF.A02(r8)     // Catch:{ Exception -> 0x06f0 }
            boolean r0 = r11.isSampled()     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0413
            X.2M7 r0 = A00(r11, r8, r3)     // Catch:{ Exception -> 0x06f0 }
            X.Pxh.A18(r0, r11)     // Catch:{ Exception -> 0x06f0 }
            X.QIU r3 = new X.QIU     // Catch:{ Exception -> 0x06f0 }
            r3.<init>()     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "on_expand_checkout_view"
            X.SUF.A09(r3, r8, r0)     // Catch:{ Exception -> 0x06f0 }
            X.0eP r14 = X.SUF.A08(r14)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "csp_version"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r15)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "shopify_sdk_payload"
            X.0eP[] r0 = X.Pxg.A1b(r0, r13, r14, r2)     // Catch:{ Exception -> 0x06f0 }
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)     // Catch:{ Exception -> 0x06f0 }
            X.Pxi.A1B(r11, r3, r0)     // Catch:{ Exception -> 0x06f0 }
            X.QHe r3 = new X.QHe     // Catch:{ Exception -> 0x06f0 }
            r3.<init>()     // Catch:{ Exception -> 0x06f0 }
            java.util.List r2 = X.SUF.A07(r5)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "seller_ids"
            r3.A07(r0, r2)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "commerce_checkout_session_id"
            r3.A06(r0, r12)     // Catch:{ Exception -> 0x06f0 }
            r2 = r8
            X.QKY r2 = (X.QKY) r2     // Catch:{ Exception -> 0x06f0 }
            X.QKY.A01(r3, r2)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "iaw_session_id"
            r3.A06(r0, r7)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = r2.A01     // Catch:{ Exception -> 0x06f0 }
            X.SUF.A0A(r3, r8, r0, r7)     // Catch:{ Exception -> 0x06f0 }
            X.Pxj.A1D(r11, r3, r4)     // Catch:{ Exception -> 0x06f0 }
        L_0x0413:
            X.Rqz r0 = r9.A00     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0705
            X.4tV r2 = r0.A01     // Catch:{ Exception -> 0x06f0 }
            X.6Rm r0 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            X.TID r3 = new X.TID     // Catch:{ Exception -> 0x06f0 }
            r3.<init>(r0, r2, r10)     // Catch:{ Exception -> 0x06f0 }
            goto L_0x06e0
        L_0x0422:
            X.TXz r0 = X.C13390TXz.A00     // Catch:{ Exception -> 0x06f0 }
            X.9FC r0 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x06f0 }
            X.WtC r8 = X.C20531WtC.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.Object r9 = r0.A00(r6, r8)     // Catch:{ Exception -> 0x06f0 }
            com.shopify.checkout.models.InitPayload r9 = (com.shopify.checkout.models.InitPayload) r9     // Catch:{ Exception -> 0x06f0 }
            X.S1X r0 = r1.A00     // Catch:{ Exception -> 0x06f0 }
            X.0qQ.A0B(r9, r4)     // Catch:{ Exception -> 0x06f0 }
            X.QQ0 r7 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            com.facebook.quicklog.QuickPerformanceLogger r0 = X.C11401SRw.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.Integer r10 = r7.A08     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r6 = "sdk_on_init"
            X.0qQ.A0B(r10, r4)     // Catch:{ Exception -> 0x06f0 }
            java.lang.Integer r0 = X.C11401SRw.A00(r10)     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0452
            com.facebook.quicklog.QuickPerformanceLogger r3 = X.C11401SRw.A00     // Catch:{ Exception -> 0x06f0 }
            if (r3 == 0) goto L_0x0452
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x06f0 }
            r3.markerPoint(r0, r6)     // Catch:{ Exception -> 0x06f0 }
        L_0x0452:
            java.lang.Integer r0 = X.C11401SRw.A00(r10)     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0464
            com.facebook.quicklog.QuickPerformanceLogger r4 = X.C11401SRw.A00     // Catch:{ Exception -> 0x06f0 }
            if (r4 == 0) goto L_0x0464
            int r3 = r0.intValue()     // Catch:{ Exception -> 0x06f0 }
            r0 = 2
            r4.markerEnd(r3, r0)     // Catch:{ Exception -> 0x06f0 }
        L_0x0464:
            java.lang.String r10 = r5.A02(r9, r8)     // Catch:{ Exception -> 0x06f0 }
            X.SUF r12 = r7.A01     // Catch:{ Exception -> 0x06f0 }
            if (r12 == 0) goto L_0x04e7
            java.lang.String r11 = r7.A0B     // Catch:{ Exception -> 0x06f0 }
            if (r11 != 0) goto L_0x0472
            java.lang.String r11 = ""
        L_0x0472:
            java.lang.String r3 = r7.A0A     // Catch:{ Exception -> 0x06f0 }
            long r4 = r7.A06     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r13 = r7.A03     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r9 = r7.A09     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r14 = "2024-10"
            java.lang.String r8 = r7.A02     // Catch:{ Exception -> 0x06f0 }
            X.AnonymousClass7TG.A0w(r2, r3, r13, r9)     // Catch:{ Exception -> 0x06f0 }
            X.0wc r2 = r12.A0C()     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "client_load_metacheckoutsdk_init"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r2, r0)     // Catch:{ Exception -> 0x06f0 }
            boolean r0 = r6.isSampled()     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x04e7
            X.2M7 r2 = A00(r6, r12, r3)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "product_type"
            r6.A8M(r2, r0)     // Catch:{ Exception -> 0x06f0 }
            X.59v r2 = X.C2818559v.ANDROID     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "platform"
            r6.A8M(r2, r0)     // Catch:{ Exception -> 0x06f0 }
            long r2 = X.AnonymousClass7TG.A0I()     // Catch:{ Exception -> 0x06f0 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "actual_event_time"
            r6.A9F(r0, r2)     // Catch:{ Exception -> 0x06f0 }
            X.QIU r3 = new X.QIU     // Catch:{ Exception -> 0x06f0 }
            r3.<init>()     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "on_init"
            X.SUF.A09(r3, r12, r0)     // Catch:{ Exception -> 0x06f0 }
            X.0eP r13 = X.SUF.A08(r13)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "csp_version"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r14)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "shopify_sdk_payload"
            X.0eP[] r0 = X.Pxg.A1b(r0, r10, r13, r2)     // Catch:{ Exception -> 0x06f0 }
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)     // Catch:{ Exception -> 0x06f0 }
            X.Pxi.A1B(r6, r3, r0)     // Catch:{ Exception -> 0x06f0 }
            X.QHd r3 = new X.QHd     // Catch:{ Exception -> 0x06f0 }
            r3.<init>()     // Catch:{ Exception -> 0x06f0 }
            X.SUF.A0B(r3, r8, r11, r4)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r2 = X.SUF.A05(r12, r11)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "external_session_id"
            r3.A06(r0, r2)     // Catch:{ Exception -> 0x06f0 }
            X.Pxj.A1D(r6, r3, r9)     // Catch:{ Exception -> 0x06f0 }
        L_0x04e7:
            X.Rqz r0 = r7.A00     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0705
            X.4tV r2 = r0.A01     // Catch:{ Exception -> 0x06f0 }
            X.6Rm r0 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            X.TIG r3 = new X.TIG     // Catch:{ Exception -> 0x06f0 }
            r3.<init>(r0, r2, r10)     // Catch:{ Exception -> 0x06f0 }
            goto L_0x06e0
        L_0x04f6:
            X.TXz r0 = X.C13390TXz.A00     // Catch:{ Exception -> 0x06f0 }
            X.9FC r0 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x06f0 }
            X.Wt5 r9 = X.C20524Wt5.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.Object r8 = r0.A00(r6, r9)     // Catch:{ Exception -> 0x06f0 }
            com.shopify.checkout.models.CheckoutCompletedPayload r8 = (com.shopify.checkout.models.CheckoutCompletedPayload) r8     // Catch:{ Exception -> 0x06f0 }
            X.S1X r0 = r1.A00     // Catch:{ Exception -> 0x06f0 }
            X.0qQ.A0B(r8, r4)     // Catch:{ Exception -> 0x06f0 }
            X.QQ0 r7 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            com.facebook.quicklog.QuickPerformanceLogger r0 = X.C11401SRw.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.Integer r0 = r7.A08     // Catch:{ Exception -> 0x06f0 }
            X.0qQ.A0B(r0, r4)     // Catch:{ Exception -> 0x06f0 }
            java.lang.Integer r0 = X.C11401SRw.A01(r0)     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0524
            com.facebook.quicklog.QuickPerformanceLogger r4 = X.C11401SRw.A00     // Catch:{ Exception -> 0x06f0 }
            if (r4 == 0) goto L_0x0524
            int r3 = r0.intValue()     // Catch:{ Exception -> 0x06f0 }
            r0 = 2
            r4.markerEnd(r3, r0)     // Catch:{ Exception -> 0x06f0 }
        L_0x0524:
            java.lang.String r11 = r5.A02(r8, r9)     // Catch:{ Exception -> 0x06f0 }
            X.SUF r10 = r7.A01     // Catch:{ Exception -> 0x06f0 }
            if (r10 == 0) goto L_0x0586
            java.lang.String r9 = r7.A0B     // Catch:{ Exception -> 0x06f0 }
            if (r9 != 0) goto L_0x0532
            java.lang.String r9 = ""
        L_0x0532:
            java.lang.String r13 = r7.A0A     // Catch:{ Exception -> 0x06f0 }
            long r3 = r7.A06     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r14 = r7.A03     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r6 = r7.A09     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r15 = "2024-10"
            java.lang.String r5 = r7.A02     // Catch:{ Exception -> 0x06f0 }
            X.0qQ.A0B(r13, r2)     // Catch:{ Exception -> 0x06f0 }
            r0 = 3
            X.DbW.A1N(r14, r0, r6)     // Catch:{ Exception -> 0x06f0 }
            X.0Aj r12 = X.SUF.A02(r10)     // Catch:{ Exception -> 0x06f0 }
            boolean r0 = r12.isSampled()     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0586
            X.2M7 r0 = A00(r12, r10, r13)     // Catch:{ Exception -> 0x06f0 }
            X.Pxh.A18(r0, r12)     // Catch:{ Exception -> 0x06f0 }
            X.QIU r13 = new X.QIU     // Catch:{ Exception -> 0x06f0 }
            r13.<init>()     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "complete_checkout"
            X.SUF.A09(r13, r10, r0)     // Catch:{ Exception -> 0x06f0 }
            X.0eP r14 = X.SUF.A08(r14)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "csp_version"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r15)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "shopify_sdk_payload"
            X.0eP[] r0 = X.Pxg.A1b(r0, r11, r14, r2)     // Catch:{ Exception -> 0x06f0 }
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)     // Catch:{ Exception -> 0x06f0 }
            X.Pxi.A1B(r12, r13, r0)     // Catch:{ Exception -> 0x06f0 }
            X.QHe r0 = new X.QHe     // Catch:{ Exception -> 0x06f0 }
            r0.<init>()     // Catch:{ Exception -> 0x06f0 }
            X.SUF.A0B(r0, r5, r9, r3)     // Catch:{ Exception -> 0x06f0 }
            X.QKY.A00(r12, r0, r10, r9, r6)     // Catch:{ Exception -> 0x06f0 }
            r12.Cgf()     // Catch:{ Exception -> 0x06f0 }
        L_0x0586:
            java.lang.String r0 = r8.A05     // Catch:{ Exception -> 0x06f0 }
            r7.A00 = r0     // Catch:{ Exception -> 0x06f0 }
            X.Rqz r0 = r7.A00     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0705
            X.4tV r2 = r0.A01     // Catch:{ Exception -> 0x06f0 }
            X.6Rm r0 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            X.TIE r3 = new X.TIE     // Catch:{ Exception -> 0x06f0 }
            r3.<init>(r0, r2, r11)     // Catch:{ Exception -> 0x06f0 }
            goto L_0x06e0
        L_0x0599:
            X.TXz r0 = X.C13390TXz.A00     // Catch:{ Exception -> 0x06f0 }
            X.9FC r3 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x06f0 }
            X.3uA[] r0 = com.shopify.checkout.models.CheckoutStatePayload.A04     // Catch:{ Exception -> 0x06f0 }
            X.Wt7 r9 = X.C20526Wt7.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.Object r8 = r3.A00(r6, r9)     // Catch:{ Exception -> 0x06f0 }
            com.shopify.checkout.models.CheckoutStatePayload r8 = (com.shopify.checkout.models.CheckoutStatePayload) r8     // Catch:{ Exception -> 0x06f0 }
            X.S1X r3 = r1.A00     // Catch:{ Exception -> 0x06f0 }
            X.0qQ.A0B(r8, r4)     // Catch:{ Exception -> 0x06f0 }
            X.QQ0 r6 = r3.A00     // Catch:{ Exception -> 0x06f0 }
            r0 = 15
            X.J6f r7 = new X.J6f     // Catch:{ Exception -> 0x06f0 }
            r7.<init>(r3, r0)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r5 = r5.A02(r8, r9)     // Catch:{ Exception -> 0x06f0 }
            X.Rqz r0 = r6.A00     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x05cb
            X.4tV r4 = r0.A01     // Catch:{ Exception -> 0x06f0 }
            X.6Rm r3 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            X.TIC r0 = new X.TIC     // Catch:{ Exception -> 0x06f0 }
            r0.<init>(r3, r4, r5)     // Catch:{ Exception -> 0x06f0 }
            X.SB0.A00(r0)     // Catch:{ Exception -> 0x06f0 }
        L_0x05cb:
            r6.A04 = r7     // Catch:{ Exception -> 0x06f0 }
            X.SUF r9 = r6.A01     // Catch:{ Exception -> 0x06f0 }
            if (r9 == 0) goto L_0x0705
            java.lang.String r8 = r6.A0B     // Catch:{ Exception -> 0x06f0 }
            if (r8 != 0) goto L_0x05d7
            java.lang.String r8 = ""
        L_0x05d7:
            java.lang.String r11 = r6.A0A     // Catch:{ Exception -> 0x06f0 }
            long r3 = r6.A06     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r13 = r6.A03     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r7 = r6.A09     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r12 = "2024-10"
            java.lang.String r6 = r6.A02     // Catch:{ Exception -> 0x06f0 }
            X.AnonymousClass7TG.A0w(r2, r11, r13, r7)     // Catch:{ Exception -> 0x06f0 }
            X.0Aj r10 = X.SUF.A02(r9)     // Catch:{ Exception -> 0x06f0 }
            boolean r0 = r10.isSampled()     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0705
            X.2M7 r0 = A00(r10, r9, r11)     // Catch:{ Exception -> 0x06f0 }
            X.Pxh.A18(r0, r10)     // Catch:{ Exception -> 0x06f0 }
            X.QIU r11 = new X.QIU     // Catch:{ Exception -> 0x06f0 }
            r11.<init>()     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "on_checkout_started"
            X.SUF.A09(r11, r9, r0)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "shopify_sdk_payload"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r0, r5)     // Catch:{ Exception -> 0x06f0 }
            X.0eP r2 = X.SUF.A08(r13)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "csp_version"
            X.0eP[] r0 = X.Pxg.A1b(r0, r12, r5, r2)     // Catch:{ Exception -> 0x06f0 }
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)     // Catch:{ Exception -> 0x06f0 }
            X.Pxi.A1B(r10, r11, r0)     // Catch:{ Exception -> 0x06f0 }
            X.QHe r0 = new X.QHe     // Catch:{ Exception -> 0x06f0 }
            r0.<init>()     // Catch:{ Exception -> 0x06f0 }
            X.SUF.A0B(r0, r6, r8, r3)     // Catch:{ Exception -> 0x06f0 }
            X.QKY.A00(r10, r0, r9, r8, r7)     // Catch:{ Exception -> 0x06f0 }
        L_0x0625:
            r10.Cgf()     // Catch:{ Exception -> 0x06f0 }
            return
        L_0x0629:
            X.TXz r0 = X.C13390TXz.A00     // Catch:{ Exception -> 0x06f0 }
            X.9FC r3 = X.AnonymousClass9FA.A00(r0, r5)     // Catch:{ Exception -> 0x06f0 }
            X.3uA[] r0 = com.shopify.checkout.models.CheckoutStatePayload.A04     // Catch:{ Exception -> 0x06f0 }
            X.Wt7 r7 = X.C20526Wt7.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.Object r6 = r3.A00(r6, r7)     // Catch:{ Exception -> 0x06f0 }
            com.shopify.checkout.models.CheckoutStatePayload r6 = (com.shopify.checkout.models.CheckoutStatePayload) r6     // Catch:{ Exception -> 0x06f0 }
            X.S1X r0 = r1.A00     // Catch:{ Exception -> 0x06f0 }
            X.0qQ.A0B(r6, r4)     // Catch:{ Exception -> 0x06f0 }
            X.QQ0 r10 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            com.facebook.quicklog.QuickPerformanceLogger r0 = X.C11401SRw.A00     // Catch:{ Exception -> 0x06f0 }
            java.lang.Integer r0 = r10.A08     // Catch:{ Exception -> 0x06f0 }
            X.0qQ.A0B(r0, r4)     // Catch:{ Exception -> 0x06f0 }
            java.lang.Integer r0 = X.C11401SRw.A02(r0)     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x065f
            com.facebook.quicklog.QuickPerformanceLogger r4 = X.C11401SRw.A00     // Catch:{ Exception -> 0x06f0 }
            if (r4 == 0) goto L_0x065f
            int r3 = r0.intValue()     // Catch:{ Exception -> 0x06f0 }
            boolean r0 = r4.isMarkerOn(r3)     // Catch:{ Exception -> 0x06f0 }
            if (r0 != r2) goto L_0x065f
            r0 = 2
            r4.markerEnd(r3, r0)     // Catch:{ Exception -> 0x06f0 }
        L_0x065f:
            java.lang.String r11 = r5.A02(r6, r7)     // Catch:{ Exception -> 0x06f0 }
            X.SUF r9 = r10.A01     // Catch:{ Exception -> 0x06f0 }
            if (r9 == 0) goto L_0x06d3
            java.lang.String r8 = r10.A0B     // Catch:{ Exception -> 0x06f0 }
            if (r8 != 0) goto L_0x066d
            java.lang.String r8 = ""
        L_0x066d:
            java.lang.String r3 = r10.A0A     // Catch:{ Exception -> 0x06f0 }
            long r4 = r10.A06     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r15 = r10.A03     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r7 = r10.A09     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r14 = "2024-10"
            java.lang.String r12 = r10.A02     // Catch:{ Exception -> 0x06f0 }
            X.0qQ.A0B(r3, r2)     // Catch:{ Exception -> 0x06f0 }
            r0 = 3
            X.DbW.A1N(r15, r0, r7)     // Catch:{ Exception -> 0x06f0 }
            X.0Aj r6 = X.SUF.A02(r9)     // Catch:{ Exception -> 0x06f0 }
            boolean r0 = r6.isSampled()     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x06d3
            X.2M7 r0 = A00(r6, r9, r3)     // Catch:{ Exception -> 0x06f0 }
            X.Pxh.A18(r0, r6)     // Catch:{ Exception -> 0x06f0 }
            X.QIU r13 = new X.QIU     // Catch:{ Exception -> 0x06f0 }
            r13.<init>()     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "on_state_change"
            X.SUF.A09(r13, r9, r0)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "shopify_sdk_payload"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r11)     // Catch:{ Exception -> 0x06f0 }
            X.0eP r2 = X.SUF.A08(r15)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "csp_version"
            X.0eP[] r0 = X.Pxg.A1b(r0, r14, r3, r2)     // Catch:{ Exception -> 0x06f0 }
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)     // Catch:{ Exception -> 0x06f0 }
            X.Pxi.A1B(r6, r13, r0)     // Catch:{ Exception -> 0x06f0 }
            X.QHe r3 = new X.QHe     // Catch:{ Exception -> 0x06f0 }
            r3.<init>()     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "commerce_checkout_session_id"
            r3.A06(r0, r12)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "iaw_session_id"
            r3.A06(r0, r8)     // Catch:{ Exception -> 0x06f0 }
            java.util.List r2 = X.SUF.A07(r4)     // Catch:{ Exception -> 0x06f0 }
            java.lang.String r0 = "seller_ids"
            r3.A07(r0, r2)     // Catch:{ Exception -> 0x06f0 }
            X.QKY.A00(r6, r3, r9, r8, r7)     // Catch:{ Exception -> 0x06f0 }
            r6.Cgf()     // Catch:{ Exception -> 0x06f0 }
        L_0x06d3:
            X.Rqz r0 = r10.A00     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0705
            X.4tV r2 = r0.A01     // Catch:{ Exception -> 0x06f0 }
            X.6Rm r0 = r0.A00     // Catch:{ Exception -> 0x06f0 }
            X.TIH r3 = new X.TIH     // Catch:{ Exception -> 0x06f0 }
            r3.<init>(r0, r2, r11)     // Catch:{ Exception -> 0x06f0 }
        L_0x06e0:
            X.SB0.A00(r3)     // Catch:{ Exception -> 0x06f0 }
            return
        L_0x06e4:
            X.S1X r0 = r1.A00     // Catch:{ Exception -> 0x06f0 }
            r0.A00(r6)     // Catch:{ Exception -> 0x06f0 }
            return
        L_0x06ea:
            X.S1X r0 = r1.A00     // Catch:{ Exception -> 0x06f0 }
            r0.A00(r6)     // Catch:{ Exception -> 0x06f0 }
            return
        L_0x06f0:
            r4 = move-exception
            X.S1X r3 = r1.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r1 = "fail_to_parse_message"
            X.Wgb r0 = new X.Wgb
            r0.<init>(r4, r2, r1)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            X.QQ0 r0 = r3.A00
            r0.A02(r1)
        L_0x0705:
            return
        L_0x0706:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q8x.postMessage(java.lang.String):void");
    }

    public static 2M7 A00(0Aj r1, SUF suf, String str) {
        r1.AAJ(AnonymousClass9NE.A00(), str);
        return SUF.A03(suf);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = AnonymousClass0fD.A05(81447498);
        requestDisallowInterceptTouchEvent(true);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(-481901738, A05);
        return onTouchEvent;
    }
}
