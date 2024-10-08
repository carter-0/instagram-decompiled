package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;

/* renamed from: X.PEi  reason: case insensitive filesystem */
public final class C72655PEi implements B2B {
    public final Handler A00;
    public final DirectStickerSuggestionsController A01;
    public final OIA A02;
    public final C62320sa A03;
    public final C62320sa A04;
    public final 0sP A05;
    public final AnonymousClass9JF A06;
    public final C329207Hz A07;
    public final C329187Hx A08;
    public final String A09;
    public final C62320sa A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C72655PEi(Context context, Handler handler, AnonymousClass9JF r21, UserSession userSession, DirectStickerSuggestionsController directStickerSuggestionsController, C329207Hz r24, C331697Sa r25, AnonymousClass7L0 r26, C329187Hx r27, C329067Hl r28, AnonymousClass7I2 r29, String str, String str2, C62320sa r32, C62320sa r33, C62320sa r34, 0sP r35, boolean z, boolean z2, boolean z3) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        C329207Hz r5 = r24;
        Context context2 = context;
        Handler handler2 = handler;
        C51974G9v.A1M(context2, handler2, r5);
        AnonymousClass7I2 r12 = r29;
        C331697Sa r9 = r25;
        AnonymousClass7TF.A1F(r9, 5, r12);
        String str3 = str;
        C329187Hx r4 = r27;
        C51969G9p.A1O(str3, 11, r4);
        this.A00 = handler2;
        this.A07 = r5;
        this.A0B = z;
        this.A0C = z2;
        this.A09 = str3;
        this.A06 = r21;
        this.A08 = r4;
        this.A01 = directStickerSuggestionsController;
        this.A03 = r32;
        this.A04 = r33;
        this.A05 = r35;
        this.A0A = r34;
        AnonymousClass7L0 r10 = r26;
        this.A02 = new OIA((Activity) null, context2, userSession2, r9, r10, r28, r12, AnonymousClass05K.A00, str2, z3, false, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4DH AM6(X.AnonymousClass37D r11) {
        /*
            r10 = this;
            X.9JF r2 = r10.A06
            if (r2 != 0) goto L_0x007f
            X.0sa r0 = r10.A0A
            r0.invoke()
        L_0x0009:
            X.OIA r1 = r10.A02
            X.7Sa r0 = r1.A03
            X.9H7 r8 = r0.A00
            X.7TI r0 = X.AnonymousClass9H7.A01(r8)
            X.7Ue r0 = r0.A0i
            X.7M7 r6 = r0.A07
            com.instagram.common.session.UserSession r0 = r1.A02
            java.lang.String r7 = r10.A09
            r5 = 1
            boolean r4 = X.AnonymousClass7TF.A1V(r2)
            if (r6 != 0) goto L_0x0023
            r5 = 0
        L_0x0023:
            boolean r3 = r10.A0C
            boolean r2 = r10.A0B
            android.os.Bundle r1 = X.DbV.A0A(r0)
            java.lang.String r0 = "param_extra_initial_search_term"
            r1.putString(r0, r7)
            java.lang.String r0 = "param_extra_show_sticker_suggestions"
            r1.putBoolean(r0, r4)
            java.lang.String r0 = "param_extra_is_power_ups_enabled"
            r1.putBoolean(r0, r5)
            java.lang.String r0 = "param_extra_is_msys_thread"
            r1.putBoolean(r0, r3)
            java.lang.String r0 = "param_extra_armadillo_express"
            r1.putBoolean(r0, r2)
            X.NJz r7 = new X.NJz
            r7.<init>()
            r7.setArguments(r1)
            if (r6 == 0) goto L_0x0052
            X.7Hx r0 = r10.A08
            r6.A01 = r0
        L_0x0052:
            X.7Hz r6 = r10.A07
            X.7TI r0 = X.AnonymousClass9H7.A01(r8)
            X.7Ue r0 = r0.A0i
            X.7M7 r5 = r0.A07
            X.O8Y r4 = new X.O8Y
            r4.<init>(r10)
            X.PWK r3 = new X.PWK
            r3.<init>(r10)
            X.PWL r2 = new X.PWL
            r2.<init>(r10)
            r1 = 17
            X.Pcu r0 = new X.Pcu
            r0.<init>((java.lang.Object) r10, (int) r1)
            r7.A0G = r6
            r7.A0H = r5
            r7.A0I = r4
            r7.A0K = r3
            r7.A0L = r2
            r7.A0M = r0
            return r7
        L_0x007f:
            com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r0 = r10.A01
            if (r0 == 0) goto L_0x0009
            java.lang.Object r5 = r2.A02
            X.6o8 r5 = (X.C317966o8) r5
            if (r5 == 0) goto L_0x0009
            X.LeP r3 = r0.A0C
            java.lang.String r4 = r2.A04
            java.lang.String r6 = r0.A04
            java.lang.String r7 = r2.A05
            java.lang.String r0 = r5.A0a
            X.0qQ.A07(r0)
            r1 = 10
            java.lang.Long r0 = X.00y.A0n(r1, r0)
            if (r0 != 0) goto L_0x0105
            java.lang.String r0 = r5.A0S
            X.0qQ.A07(r0)
            java.lang.Long r0 = X.00y.A0n(r1, r0)
            if (r0 != 0) goto L_0x0105
            r8 = 0
        L_0x00ab:
            X.AnonymousClass7TG.A1T(r4, r6, r7)
            X.0wc r1 = r3.A00
            java.lang.String r0 = "avatar_stickers_measurement_typeahead_click"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0009
            X.N0W r5 = new X.N0W
            r5.<init>()
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0 = 346(0x15a, float:4.85E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5.A05(r0, r1)
            java.lang.String r1 = "message_thread"
            r0 = 184(0xb8, float:2.58E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5.A06(r0, r1)
            r0 = 627(0x273, float:8.79E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5.A06(r0, r7)
            r0 = 8
            java.lang.String r0 = X.Pxd.A00(r0)
            r5.A06(r0, r6)
            java.lang.String r0 = "event_data"
            r3.AAK(r5, r0)
            r0 = 555(0x22b, float:7.78E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.AAJ(r0, r4)
            java.lang.String r1 = "typeahead"
            java.lang.String r0 = "product"
            r3.AAJ(r0, r1)
            r3.Cgf()
            goto L_0x0009
        L_0x0105:
            long r8 = r0.longValue()
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72655PEi.AM6(X.37D):X.4DH");
    }

    public final OIA AcR() {
        return this.A02;
    }
}
