package X;

import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.reels.Reel;
import java.util.List;

public final class P9F implements C332997Xg {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C333037Xk A03;
    public final AnonymousClass0eM A04 = C73923Pm3.A01(this, 43);
    public final AnonymousClass0eM A05 = C73923Pm3.A01(this, 44);
    public final AnonymousClass0eM A06 = C73923Pm3.A01(this, 45);
    public final Fragment A07;
    public final AnonymousClass7TO A08;
    public final C62320sa A09;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (X.0qQ.A0K(X.DbU.A0n(r5, X.AnonymousClass0t1.A01), r2.A01()) == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CpE(android.graphics.RectF r27, X.OMU r28, java.lang.String r29) {
        /*
            r26 = this;
            r6 = 0
            r7 = r27
            r5 = r29
            boolean r4 = X.AnonymousClass7TF.A1U(r6, r5, r7)
            r0 = r26
            X.7TO r1 = r0.A08
            java.util.Map r1 = r1.A01
            java.lang.Object r2 = r1.get(r5)
            com.instagram.direct.model.DirectAREffectShare r2 = (com.instagram.direct.model.DirectAREffectShare) r2
            if (r2 == 0) goto L_0x014e
            X.3HX r8 = r2.A03
            if (r8 == 0) goto L_0x013e
            com.instagram.common.session.UserSession r5 = r0.A02
            X.1Ns r3 = X.AnonymousClass3P9.A01(r5, r8)
            X.0eM r1 = r0.A05
            java.lang.Object r4 = r1.getValue()
            com.instagram.reels.store.ReelStore r4 = (com.instagram.reels.store.ReelStore) r4
            if (r3 == 0) goto L_0x0044
            java.lang.Integer r3 = r3.CAm()
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r3 != r1) goto L_0x0044
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.String r3 = X.DbU.A0n(r5, r1)
            java.lang.String r1 = r2.A01()
            boolean r3 = X.0qQ.A0K(r3, r1)
            r1 = 1
            if (r3 != 0) goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            com.instagram.model.reels.Reel r5 = r4.A0I(r8, r1)
            java.lang.String r14 = r2.A02()
            java.lang.String r15 = r2.A03()
            com.instagram.common.typedurl.ImageUrl r10 = r2.A00()
            java.lang.String r16 = r2.A01()
            java.lang.String r4 = r2.A05
            r3 = r4
            if (r4 != 0) goto L_0x0075
            X.NML r1 = r2.A02
            java.lang.String r4 = ""
            if (r1 == 0) goto L_0x0075
            X.O96 r1 = r1.A00
            if (r1 == 0) goto L_0x0075
            X.OHW r1 = r1.A00
            if (r1 == 0) goto L_0x0075
            X.OEI r1 = r1.A00
            if (r1 == 0) goto L_0x0075
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x0075
            r4 = r1
        L_0x0075:
            com.instagram.common.typedurl.ImageUrl r11 = r2.A00
            if (r11 != 0) goto L_0x0099
            if (r3 != 0) goto L_0x0138
            X.NML r1 = r2.A02
            java.lang.String r8 = ""
            if (r1 == 0) goto L_0x0095
            X.O96 r1 = r1.A00
            if (r1 == 0) goto L_0x0095
            X.OHW r1 = r1.A00
            if (r1 == 0) goto L_0x0095
            X.OEI r1 = r1.A00
            if (r1 == 0) goto L_0x0095
            X.O94 r1 = r1.A00
            if (r1 == 0) goto L_0x0095
            java.lang.String r3 = r1.A00
            if (r3 != 0) goto L_0x0138
        L_0x0095:
            com.instagram.common.typedurl.SimpleImageUrl r11 = X.DbS.A0V(r8)
        L_0x0099:
            r24 = 4
            java.util.List r1 = r2.A09
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x010a
            java.util.List r3 = r2.A09
        L_0x00a5:
            java.util.List r1 = r2.A0A
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00dd
            java.util.List r1 = r2.A0A
        L_0x00af:
            X.0sn r23 = X.0sn.A00
            java.lang.String r18 = X.AnonymousClass7TF.A0b()
            r20 = 0
            com.instagram.model.shopping.ProductAREffectContainer r13 = r2.A04
            X.NML r2 = r2.A02
            r12 = 0
            if (r2 == 0) goto L_0x00c8
            X.O96 r2 = r2.A00
            if (r2 == 0) goto L_0x00c8
            X.OHW r2 = r2.A00
            if (r2 == 0) goto L_0x00c8
            X.Kit r12 = r2.A04
        L_0x00c8:
            java.lang.String r19 = "direct_effect_preview_video"
            com.instagram.model.effect.AttributedAREffect r9 = new com.instagram.model.effect.AttributedAREffect
            r21 = r3
            r22 = r1
            r25 = r6
            r17 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r5.A0G = r9
            A00(r7, r0, r5)
            return
        L_0x00dd:
            X.NML r1 = r2.A02
            if (r1 == 0) goto L_0x0105
            X.O96 r1 = r1.A00
            if (r1 == 0) goto L_0x0105
            X.OHW r1 = r1.A00
            if (r1 == 0) goto L_0x0105
            X.OCR r8 = r1.A01
            if (r8 == 0) goto L_0x0105
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.List r8 = r8.A01
            java.util.Iterator r9 = r8.iterator()
        L_0x00f7:
            boolean r8 = r9.hasNext()
            if (r8 == 0) goto L_0x00af
            java.lang.Object r8 = r9.next()
            X.DbU.A1X(r8, r1)
            goto L_0x00f7
        L_0x0105:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x00af
        L_0x010a:
            X.NML r1 = r2.A02
            if (r1 == 0) goto L_0x0132
            X.O96 r1 = r1.A00
            if (r1 == 0) goto L_0x0132
            X.OHW r1 = r1.A00
            if (r1 == 0) goto L_0x0132
            X.OCR r1 = r1.A01
            if (r1 == 0) goto L_0x0132
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.List r1 = r1.A00
            java.util.Iterator r8 = r1.iterator()
        L_0x0124:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00a5
            java.lang.Object r1 = r8.next()
            X.DbU.A1X(r1, r3)
            goto L_0x0124
        L_0x0132:
            java.util.List r3 = java.util.Collections.emptyList()
            goto L_0x00a5
        L_0x0138:
            com.instagram.common.typedurl.SimpleImageUrl r11 = X.DbS.A0V(r3)
            goto L_0x0099
        L_0x013e:
            X.7Xk r8 = r0.A03
            X.28D r10 = X.28D.A2E
            r11 = 0
            java.lang.String r13 = r2.A02()
            r9 = r7
            r12 = r11
            r14 = r6
            r8.Cpd(r9, r10, r11, r12, r13, r14)
            return
        L_0x014e:
            r9 = r28
            if (r28 == 0) goto L_0x0155
            r9.A01()
        L_0x0155:
            X.0eM r1 = r0.A04
            java.lang.Object r3 = r1.getValue()
            X.LCd r3 = (X.C63917LCd) r3
            r13 = 38
            X.PqV r2 = new X.PqV
            r8 = r2
            r10 = r0
            r11 = r7
            r12 = r5
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.String) r12, (int) r13)
            java.lang.String r0 = "DIRECT"
            X.3Fb r0 = r3.A00(r5, r0)
            X.1OC r1 = r0.A06()
            X.KAe r0 = new X.KAe
            r0.<init>(r4, r3, r2)
            r1.A00 = r0
            X.1ES.A03(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9F.CpE(android.graphics.RectF, X.OMU, java.lang.String):void");
    }

    public static final void A00(RectF rectF, P9F p9f, Reel reel) {
        String str;
        UserSession userSession = p9f.A02;
        AnonymousClass328 r0 = new AnonymousClass328(p9f.A07);
        AnonymousClass0iw r1 = p9f.A01;
        AnonymousClass32A r4 = new AnonymousClass32A(r1, userSession, r0);
        List A1I = AnonymousClass7TE.A1I(reel);
        C16160Upl upl = new C16160Upl(rectF, 2);
        C19518Wb4 wb4 = new C19518Wb4(rectF, 3);
        r4.A0C = ((C230252pH) p9f.A06.getValue()).A04;
        r4.A05 = upl;
        r4.A06(reel, AnonymousClass3BQ.AR_EFFECT_DIRECT, wb4, A1I, A1I, 0);
        String A0r = JTP.A0r(reel);
        C333517Zg A0W = C66580MXl.A0W(p9f.A09);
        if (A0W != null) {
            str = A0W.C6l().C6C();
        } else {
            str = null;
        }
        0xI A002 = 0xI.A00(r1, "direct_thread_tap_ar_effect");
        A002.A0C("effect_id", A0r);
        if (str != null) {
            A002.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        }
        DbU.A1R(A002, userSession);
    }

    public P9F(Context context, Fragment fragment, AnonymousClass0iw r4, UserSession userSession, AnonymousClass7TO r6, C333037Xk r7, C62320sa r8) {
        C51972G9s.A1D(fragment, r4);
        C51972G9s.A1E(r6, r7);
        this.A00 = context;
        this.A02 = userSession;
        this.A07 = fragment;
        this.A01 = r4;
        this.A09 = r8;
        this.A08 = r6;
        this.A03 = r7;
    }
}
