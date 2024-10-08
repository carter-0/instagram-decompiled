package X;

import android.content.Context;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import java.util.List;

/* renamed from: X.7Sa  reason: invalid class name and case insensitive filesystem */
public final class C331697Sa {
    public final /* synthetic */ AnonymousClass9H7 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        if (((X.AnonymousClass3U9) r0).A01.A0s == null) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.graphics.RectF r12, X.C254933tI r13, java.lang.String r14, int r15) {
        /*
            r11 = this;
            r2 = 0
            X.28D r6 = X.28D.A2S
            X.9H7 r4 = r11.A00
            com.instagram.common.session.UserSession r0 = r4.A10
            X.JVm r1 = X.AnonymousClass9PJ.A00(r0)
            r0 = 1
            r1.A07(r6, r0)
            boolean r0 = X.AnonymousClass48O.A03(r15)
            r5 = r12
            if (r0 == 0) goto L_0x0021
            X.7TI r0 = X.AnonymousClass9H7.A01(r4)
            r1 = 0
            X.7Wl r0 = r0.A0t
            r0.Cq4(r12, r6, r1, r14)
            return
        L_0x0021:
            X.80M r1 = X.AnonymousClass80M.A00
            X.8aL[] r0 = new X.C358088aL[r2]
            com.instagram.creation.cameraconfiguration.CameraConfiguration r7 = X.C358098aM.A00(r1, r0)
            X.7Hl r3 = r4.A0R
            if (r3 == 0) goto L_0x004d
            boolean r0 = r3.A1T()
            r0 = r0 ^ 1
            r7.A02 = r0
            boolean r0 = X.C329067Hl.A0v(r3)
            r2 = 1
            if (r0 == 0) goto L_0x0062
            com.instagram.common.session.UserSession r3 = r3.A1Z
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325742468281522(0x810e12000634b2, double:3.035884036740989E-306)
        L_0x0045:
            boolean r0 = X.182.A06(r2, r3, r0)
            r2 = r0 ^ 1
        L_0x004b:
            r7.A01 = r2
        L_0x004d:
            X.7TI r0 = X.AnonymousClass9H7.A01(r4)
            r9 = 0
            X.7Wl r4 = r0.A0t
            X.7Zg r0 = r0.A08
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "clientInfra"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0062:
            com.instagram.api.schemas.IGAIAgentType r1 = X.C329067Hl.A03(r3)
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A05
            if (r1 != r0) goto L_0x0074
            com.instagram.common.session.UserSession r3 = r3.A1Z
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325742468150448(0x810e12000434b0, double:3.0358840366580975E-306)
            goto L_0x0045
        L_0x0074:
            com.instagram.api.schemas.IGAIAgentType r1 = X.C329067Hl.A03(r3)
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A08
            if (r1 != r0) goto L_0x0086
            com.instagram.common.session.UserSession r3 = r3.A1Z
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325742468412596(0x810e12000834b4, double:3.035884036823881E-306)
            goto L_0x0045
        L_0x0086:
            X.C329067Hl.A03(r3)
            goto L_0x004b
        L_0x008a:
            X.7S7 r0 = r0.C6l()
            X.2Ep r0 = r0.Cms()
            if (r0 == 0) goto L_0x009d
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.3Te r0 = r0.A0s
            r10 = 1
            if (r0 != 0) goto L_0x009e
        L_0x009d:
            r10 = 0
        L_0x009e:
            r8 = r13
            r4.Cpd(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331697Sa.A03(android.graphics.RectF, X.3tI, java.lang.String, int):void");
    }

    public final void A04(C317966o8 r9, C69319NjK njK) {
        if (njK != C69319NjK.MESSAGE_LONG_PRESS_ADD_STICKER) {
            AnonymousClass9H7 r1 = this.A00;
            AnonymousClass7L9 A0K = AnonymousClass9H7.A01(r1).A0K();
            Context context = r1.A02;
            if (context == null) {
                0qQ.A0F("context");
                throw AnonymousClass00P.createAndThrow();
            } else {
                AnonymousClass7L9.A00(A0K, "sendAiStaticSticker", new C58790Ixb(13, r1.A10, (Object) null, r9, context, A0K));
            }
        }
    }

    public final void A05(C317966o8 r9, C69319NjK njK, C254933tI r11) {
        0qQ.A0B(njK, 2);
        if (njK != C69319NjK.MESSAGE_LONG_PRESS_ADD_STICKER) {
            AnonymousClass9H7 r1 = this.A00;
            AnonymousClass7L9 A0K = AnonymousClass9H7.A01(r1).A0K();
            Context context = r1.A02;
            if (context == null) {
                0qQ.A0F("context");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass7L9.A00(A0K, "sendAvatarStaticSticker", new C58790Ixb(12, r1.A10, r11, r9, context, A0K));
        }
    }

    public final void A06(C70766OKm oKm, String str, String str2) {
        String str3 = str;
        0qQ.A0B(str3, 0);
        A09((N49) null, oKm, (C70726OHv) null, (SendMentionData$MentionData) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, str3, str2, (String) null, (String) null, (List) null);
    }

    public final void A07(C254933tI r5, DirectStoreSticker directStoreSticker) {
        0qQ.A0B(directStoreSticker, 0);
        AnonymousClass9H7 r1 = this.A00;
        AnonymousClass7L9 A0K = AnonymousClass9H7.A01(r1).A0K();
        if (r1.A02 == null) {
            0qQ.A0F("context");
            throw AnonymousClass00P.createAndThrow();
        }
        C74188PqU pqU = new C74188PqU(8, (Object) directStoreSticker, (Object) r5, (Object) A0K);
        AnonymousClass7UF r2 = A0K.A01;
        r2.A00();
        pqU.invoke(A0K.A06.invoke());
        r2.A01((C254933tI) null, (Integer) null, 100);
    }

    public final boolean A09(N49 n49, C70766OKm oKm, C70726OHv oHv, SendMentionData$MentionData sendMentionData$MentionData, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, List list) {
        IGFOAMessagingLocalSendSpeedLogger A002;
        String str5 = str;
        0qQ.A0B(str5, 0);
        String str6 = str3;
        if (str5.length() == 0) {
            if (!(str3 == null || (A002 = C328727Fx.A00(this.A00.A10, Integer.valueOf(str6.hashCode()))) == null)) {
                A002.onEndFlowFail("Text is empty");
            }
            return false;
        }
        AnonymousClass9H7 r1 = this.A00;
        AnonymousClass9H7.A06(r1).A00 = 0;
        AnonymousClass7L9 r0 = AnonymousClass9H7.A01(r1).A0j.A03;
        if (r0 != null) {
            return r0.A02(n49, oKm, oHv, sendMentionData$MentionData, num, num2, num3, l, str5, str2, str6, str4, list, false);
        }
        0qQ.A0F("directSendHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public C331697Sa(AnonymousClass9H7 r1) {
        this.A00 = r1;
    }

    public final DirectShareTarget A00() {
        return AnonymousClass9H7.A01(this.A00).A0M();
    }

    public final void A01() {
        ((C332247Uf) AnonymousClass9H7.A01(this.A00).A0i.A0Q.getValue()).Cyg();
    }

    public final void A02() {
        AnonymousClass9H7 r1 = this.A00;
        ((C332247Uf) AnonymousClass9H7.A01(r1).A0i.A0Q.getValue()).Cyt();
        ((C328807Gh) r1.A1Z.getValue()).A04 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r1.A0l != false) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(boolean r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0008
            X.9H7 r1 = r5.A00
            boolean r0 = r1.A0l
            if (r0 == 0) goto L_0x000d
        L_0x0008:
            X.9H7 r1 = r5.A00
            X.AnonymousClass9H7.A0D(r1, r6)
        L_0x000d:
            X.7TI r0 = X.AnonymousClass9H7.A01(r1)
            X.7Yf r0 = r0.A0k
            X.7Yh r4 = r0.A03
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A02
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x003c
            com.instagram.common.session.UserSession r3 = r4.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320824730788740(0x81099900072384, double:3.0327740397484145E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x003c
            X.0sa r0 = r4.A03
            java.lang.Object r1 = r0.invoke()
            X.2Ep r1 = (X.AnonymousClass2Ep) r1
            if (r1 == 0) goto L_0x003c
            X.6oB r0 = r4.A01
            r0.A01(r1)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331697Sa.A08(boolean):void");
    }
}
