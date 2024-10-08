package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;

/* renamed from: X.PAr  reason: case insensitive filesystem */
public final class C72560PAr implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final AnonymousClass7DT A01;
    public final AnonymousClass7DV A02;
    public final AnonymousClass7DS A03 = new P80(this);
    public final AnonymousClass7XR A04;
    public final AnonymousClass9HC A05;
    public final AnonymousClass7DZ A06;

    /* JADX WARNING: type inference failed for: r2v2, types: [com.instagram.common.ui.text.TightTextView, android.view.View] */
    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        boolean A1U = AnonymousClass7TF.A1U(0, viewGroup2, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup2, R.layout.direct_link_message, false);
        C72579PBk pBk = new C72579PBk(A0D);
        FrameLayout frameLayout = pBk.A04;
        Context A0S = AnonymousClass7TE.A0S(A0D);
        AnonymousClass9HC r3 = this.A05;
        int A022 = DbS.A02(A0S, 12);
        int A023 = DbS.A02(A0S, 10);
        ? r2 = pBk.A07;
        r2.setPadding(A022, A023, A022, A023);
        AnonymousClass7DS r6 = this.A03;
        AnonymousClass7DT r7 = this.A01;
        AnonymousClass7DV r8 = this.A02;
        AnonymousClass7XR r9 = this.A04;
        boolean z = r3.A1X;
        C328067Dh r32 = new C328067Dh(frameLayout, new AnonymousClass7DX((AnonymousClass7XN) r9), r6, r7, r8, (C333107Xr) r9, pBk, z, A1U, AnonymousClass7TF.A1Z(r3.A0g));
        AnonymousClass76R r0 = new AnonymousClass76R(r32, frameLayout, AnonymousClass7TG.A0R(frameLayout, R.id.message_text), z);
        pBk.EdM(r7);
        pBk.A01 = r32;
        r2.setOnTouchListener(r0);
        frameLayout.setOnTouchListener(r32);
        this.A06.A00(pBk);
        return pBk;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r5v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r4v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r11v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r24, X.AnonymousClass7FW r25) {
        /*
            r23 = this;
            r2 = r25
            r3 = r24
            X.PBk r3 = (X.C72579PBk) r3
            X.NYI r2 = (X.NYI) r2
            if (r3 == 0) goto L_0x00e1
            if (r2 == 0) goto L_0x00e1
            X.PGI r6 = new X.PGI
            r6.<init>(r3, r2)
            com.instagram.feed.widget.IgProgressImageView r0 = r3.A08
            r21 = r0
            r1 = 8
            r0.setVisibility(r1)
            com.instagram.common.ui.text.TightTextView r5 = r3.A06
            r5.setVisibility(r1)
            com.instagram.common.ui.text.TightTextView r4 = r3.A05
            r4.setVisibility(r1)
            android.view.View r0 = r3.A03
            r20 = r0
            r0.setVisibility(r1)
            r22 = r23
            r0 = r22
            X.0iw r0 = r0.A00
            r19 = r0
            r0 = r22
            X.7XR r12 = r0.A04
            X.7VM r12 = (X.AnonymousClass7VM) r12
            com.instagram.common.ui.text.TightTextView r11 = r3.A07
            java.lang.CharSequence r1 = r2.A02
            r11.setText(r1)
            X.Nol r9 = r2.A01
            boolean r10 = r9 instanceof X.C68858NZq
            if (r10 == 0) goto L_0x00ab
            r0 = r9
            X.NZq r0 = (X.C68858NZq) r0
            int r0 = r0.A00
        L_0x004b:
            X.0nA.A0X(r11, r0)
            boolean r0 = r1 instanceof android.text.SpannableStringBuilder
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = r2.A03
            r15 = r0
            java.lang.String r0 = "null cannot be cast to non-null type android.text.SpannableStringBuilder"
            X.0qQ.A0C(r1, r0)
            android.text.SpannableStringBuilder r1 = (android.text.SpannableStringBuilder) r1
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r2.BSG()
            java.lang.String r0 = r0.A01
            r18 = r0
            r0 = r12
            X.7XV r0 = (X.AnonymousClass7XV) r0
            r17 = r0
            r8 = 0
            X.0qQ.A0B(r1, r8)
            int r7 = r1.length()
            java.lang.Class<X.3ud> r0 = X.C255733ud.class
            java.lang.Object[] r7 = r1.getSpans(r8, r7, r0)
            X.0qQ.A07(r7)
            X.3ud[] r7 = (X.C255733ud[]) r7
            int r0 = r7.length
            r16 = r0
            r13 = 0
        L_0x0080:
            r0 = r16
            if (r13 >= r0) goto L_0x00b1
            r14 = r7[r13]
            java.lang.Integer r0 = r14.A02
            int r1 = r0.intValue()
            if (r1 == r8) goto L_0x00a1
            r0 = 6
            if (r1 != r0) goto L_0x009e
            r14.A01 = r6
            X.PGH r1 = new X.PGH
            r0 = r18
            r1.<init>(r12, r15, r0)
        L_0x009a:
            X.3ug r1 = (X.C255763ug) r1
            r14.A00 = r1
        L_0x009e:
            int r13 = r13 + 1
            goto L_0x0080
        L_0x00a1:
            r14.A01 = r6
            X.PGA r1 = new X.PGA
            r0 = r17
            r1.<init>(r0)
            goto L_0x009a
        L_0x00ab:
            r0 = r9
            X.NZr r0 = (X.C68859NZr) r0
            int r0 = r0.A00
            goto L_0x004b
        L_0x00b1:
            if (r10 == 0) goto L_0x0164
            r0 = r9
            X.NZq r0 = (X.C68858NZq) r0
            int r0 = r0.A01
        L_0x00b8:
            r11.setTextColor(r0)
            if (r10 == 0) goto L_0x00e2
            r1 = -2
            android.widget.FrameLayout r8 = r3.A04
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r0.width = r1
            r8.setLayoutParams(r0)
        L_0x00c9:
            X.7FE r4 = r2.A00
            boolean r1 = r9 instanceof X.C68859NZr
            android.graphics.drawable.Drawable r0 = r3.A02
            X.C3265577g.A06(r0, r8, r4, r1)
            X.7Dj r0 = r3.A01
            if (r0 == 0) goto L_0x00da
            X.7Di r0 = (X.C328077Di) r0
            r0.A00 = r2
        L_0x00da:
            r0 = r22
            X.7DZ r0 = r0.A06
            r0.A02(r3, r2)
        L_0x00e1:
            return
        L_0x00e2:
            boolean r0 = r9 instanceof X.C68859NZr
            if (r0 == 0) goto L_0x0175
            r0 = r9
            X.NZr r0 = (X.C68859NZr) r0
            X.Nok r11 = r0.A04
            X.Nok r10 = r0.A03
            X.JwA r0 = r0.A02
            r7 = 0
            if (r0 != 0) goto L_0x0131
            r1 = -2
            android.widget.FrameLayout r8 = r3.A04
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r0.width = r1
            r8.setLayoutParams(r0)
        L_0x00fe:
            r0 = r20
            r0.setVisibility(r7)
            boolean r0 = r11 instanceof X.C68856NZo
            if (r0 == 0) goto L_0x011a
            X.NZo r11 = (X.C68856NZo) r11
            int r0 = r11.A00
            X.0nA.A0c(r4, r0)
        L_0x010e:
            boolean r0 = r10 instanceof X.C68856NZo
            if (r0 == 0) goto L_0x014c
            X.NZo r10 = (X.C68856NZo) r10
            int r0 = r10.A00
            X.0nA.A0X(r5, r0)
            goto L_0x00c9
        L_0x011a:
            boolean r0 = r11 instanceof X.C68857NZp
            if (r0 == 0) goto L_0x0170
            X.NZp r11 = (X.C68857NZp) r11
            java.lang.String r1 = r11.A01
            int r0 = r11.A00
            X.0nA.A0c(r4, r7)
            r5.setText(r1)
            r5.setTextColor(r0)
            r5.setVisibility(r7)
            goto L_0x010e
        L_0x0131:
            r20 = r21
            int r1 = r0.A01
            java.lang.Object r6 = r0.A02
            com.instagram.common.typedurl.ImageUrl r6 = (com.instagram.common.typedurl.ImageUrl) r6
            android.widget.FrameLayout r8 = r3.A04
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r0.width = r1
            r8.setLayoutParams(r0)
            r1 = r19
            r0 = r21
            r0.setUrl(r6, r1)
            goto L_0x00fe
        L_0x014c:
            boolean r0 = r10 instanceof X.C68857NZp
            if (r0 == 0) goto L_0x016b
            X.NZp r10 = (X.C68857NZp) r10
            java.lang.String r1 = r10.A01
            int r0 = r10.A00
            X.0nA.A0X(r5, r7)
            r4.setText(r1)
            r4.setTextColor(r0)
            r4.setVisibility(r7)
            goto L_0x00c9
        L_0x0164:
            r0 = r9
            X.NZr r0 = (X.C68859NZr) r0
            int r0 = r0.A01
            goto L_0x00b8
        L_0x016b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0170:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0175:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72560PAr.ADp(X.7Db, X.7FW):void");
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        C72579PBk pBk = (C72579PBk) r3;
        0qQ.A0B(pBk, 0);
        C328087Dj r1 = pBk.A01;
        if (r1 != null) {
            ((C328077Di) r1).A00 = null;
        }
        this.A06.A01(pBk);
    }

    public C72560PAr(AnonymousClass0iw r4, AnonymousClass7XR r5, AnonymousClass9HC r6) {
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r4;
        this.A01 = new AnonymousClass7DT(r5);
        this.A02 = new AnonymousClass7DV((AnonymousClass7XX) r5, r6.A1X);
        this.A06 = new AnonymousClass7DZ(AnonymousClass7TE.A1I(new PBD((AnonymousClass7TJ) r5)));
    }
}
