package com.instagram.direct.messagethread;

import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass5FV;
import X.AnonymousClass5H7;
import X.AnonymousClass79W;
import X.AnonymousClass9HO;
import X.C329987Kz;
import X.C60340gF;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.messagethread.DirectMessageLinkifyHelper$linkifyAsync$1", f = "DirectMessageLinkifyHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DirectMessageLinkifyHelper$linkifyAsync$1 extends AnonymousClass1Ek implements 0sP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass5FV A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass79W A03;
    public final /* synthetic */ AnonymousClass9HO A04;
    public final /* synthetic */ C329987Kz A05;
    public final /* synthetic */ AnonymousClass5H7 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectMessageLinkifyHelper$linkifyAsync$1(Context context, AnonymousClass5FV r3, UserSession userSession, AnonymousClass79W r5, AnonymousClass9HO r6, C329987Kz r7, AnonymousClass5H7 r8, String str, List list, AnonymousClass4D7 r11, boolean z, boolean z2, boolean z3) {
        super(1, r11);
        this.A00 = context;
        this.A02 = userSession;
        this.A07 = str;
        this.A05 = r7;
        this.A06 = r8;
        this.A08 = list;
        this.A09 = z;
        this.A01 = r3;
        this.A0A = z2;
        this.A0B = z3;
        this.A04 = r6;
        this.A03 = r5;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.direct.messagethread.DirectMessageLinkifyHelper$linkifyAsync$1] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r15) {
        Context context = this.A00;
        UserSession userSession = this.A02;
        String str = this.A07;
        C329987Kz r6 = this.A05;
        AnonymousClass5H7 r7 = this.A06;
        List list = this.A08;
        boolean z = this.A09;
        AnonymousClass5FV r2 = this.A01;
        boolean z2 = this.A0A;
        boolean z3 = this.A0B;
        return new DirectMessageLinkifyHelper$linkifyAsync$1(context, r2, userSession, this.A03, this.A04, r6, r7, str, list, r15, z, z2, z3);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((DirectMessageLinkifyHelper$linkifyAsync$1) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        r1 = r3.A0e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.0eS.A00(r11)
            android.content.Context r1 = r10.A00
            com.instagram.common.session.UserSession r3 = r10.A02
            java.lang.String r7 = r10.A07
            X.7Kz r5 = r10.A05
            X.5H7 r6 = r10.A06
            boolean r8 = r10.A09
            X.5FV r2 = r10.A01
            boolean r9 = r10.A0B
            X.9HO r4 = r10.A04
            X.79W r0 = r10.A03
            android.text.SpannableStringBuilder r4 = X.C3270279b.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            X.7LQ r3 = r0.A00
            if (r4 != 0) goto L_0x006d
            java.lang.String r1 = ""
        L_0x0021:
            java.lang.String r0 = r0.A01
            r3.A0L = r1
            r3.A0M = r0
            if (r4 == 0) goto L_0x006a
            r2 = 0
            int r0 = r4.length()
            if (r0 == 0) goto L_0x006a
            int r1 = r4.length()
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r0 = r4.getSpans(r2, r1, r0)
            X.0qQ.A07(r0)
            int r0 = r0.length
            if (r0 == 0) goto L_0x006a
            X.3su r1 = r3.A0e
            X.7Ek r0 = r1.A0L
            if (r0 == 0) goto L_0x006a
            java.lang.String r3 = r1.A0h()
            X.7Ej r2 = r0.A00
            android.view.View r1 = r2.A00
            if (r1 == 0) goto L_0x006a
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x006a
            android.app.Activity r0 = X.C61270mF.A01(r0)
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x006a
            X.Ao3 r0 = new X.Ao3
            r0.<init>(r2, r3)
            r1.post(r0)
        L_0x006a:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x006d:
            r1 = r4
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.messagethread.DirectMessageLinkifyHelper$linkifyAsync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
