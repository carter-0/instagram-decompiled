package X;

import android.content.Context;
import android.view.View;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.Obq  reason: case insensitive filesystem */
public final class C71089Obq {
    public ComposerAutoCompleteTextView A00;
    public View A01;
    public View A02;
    public boolean A03;
    public final Context A04;
    public final C74387Pu3 A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public C71089Obq(Context context, C74387Pu3 pu3, boolean z) {
        this.A04 = context;
        this.A05 = pu3;
        this.A06 = null;
        this.A08 = false;
        this.A07 = z;
    }

    public static final void A00(C71089Obq obq) {
        if (obq.A05.Dj2(obq.A02(), obq.A08)) {
            ComposerAutoCompleteTextView composerAutoCompleteTextView = obq.A00;
            if (composerAutoCompleteTextView == null) {
                0qQ.A0F("messageEditText");
                throw AnonymousClass00P.createAndThrow();
            }
            DbS.A1C(composerAutoCompleteTextView);
            A01(obq);
        }
    }

    public final String A02() {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00;
        if (composerAutoCompleteTextView == null) {
            0qQ.A0F("messageEditText");
            throw AnonymousClass00P.createAndThrow();
        }
        String A0f = AnonymousClass7TF.A0f(composerAutoCompleteTextView);
        int length = A0f.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A13 = Dbc.A13(A0f, i2);
            if (z) {
                if (!A13) {
                    break;
                }
                length--;
            } else if (!A13) {
                z = true;
            } else {
                i++;
            }
        }
        return Dba.A0c(A0f, length, i);
    }

    public final void A03() {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00;
        if (composerAutoCompleteTextView == null) {
            0qQ.A0F("messageEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            0nA.A0N(composerAutoCompleteTextView);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C71089Obq r5) {
        /*
            java.lang.String r0 = r5.A02()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x000f
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            java.lang.String r2 = "sendButton"
            if (r0 != 0) goto L_0x0031
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x004f
            r0.setVisibility(r3)
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x004f
            r0.setClickable(r4)
            android.view.View r1 = r5.A02
            if (r1 == 0) goto L_0x004f
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            X.Pu3 r0 = r5.A05
            r0.D5L()
            return
        L_0x0031:
            boolean r0 = r5.A03
            android.view.View r1 = r5.A02
            if (r0 == 0) goto L_0x0047
            if (r1 == 0) goto L_0x004f
            r1.setClickable(r3)
            android.view.View r1 = r5.A02
            if (r1 == 0) goto L_0x004f
            r0 = 1050253722(0x3e99999a, float:0.3)
            r1.setAlpha(r0)
            return
        L_0x0047:
            if (r1 == 0) goto L_0x004f
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x004f:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71089Obq.A01(X.Obq):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(android.view.View r8) {
        /*
            r7 = this;
            r0 = 2131440516(0x7f0b3384, float:1.8503018E38)
            android.view.View r2 = r8.requireViewById(r0)
            r7.A01 = r2
            boolean r0 = r7.A08
            java.lang.String r6 = "messageComposer"
            r5 = 0
            if (r0 == 0) goto L_0x00c5
            if (r2 == 0) goto L_0x00d0
            android.content.Context r1 = r2.getContext()
            r0 = 2131231607(0x7f080377, float:1.80793E38)
        L_0x0019:
            X.DbU.A11(r1, r2, r0)
            r0 = 2131440518(0x7f0b3386, float:1.8503022E38)
            android.view.View r2 = r8.requireViewById(r0)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r2 = (com.instagram.ui.widget.textview.ComposerAutoCompleteTextView) r2
            r7.A00 = r2
            java.lang.String r1 = r7.A06
            java.lang.String r0 = "private_reply_message"
            boolean r0 = r0.equals(r1)
            java.lang.String r6 = "messageEditText"
            if (r0 == 0) goto L_0x00b6
            if (r2 == 0) goto L_0x00d0
            r0 = 2131959817(0x7f132009, float:1.9556285E38)
        L_0x0038:
            r2.setHint(r0)
        L_0x003b:
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r2 = r7.A00
            if (r2 == 0) goto L_0x00d0
            android.content.Context r0 = r7.A04
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131492892(0x7f0c001c, float:1.8609249E38)
            int r1 = r1.getInteger(r0)
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            android.text.InputFilter[] r0 = new android.text.InputFilter[]{r0}
            r2.setFilters(r0)
            boolean r0 = r7.A07
            java.lang.String r4 = "sendButton"
            if (r0 == 0) goto L_0x00ac
            r0 = 2131440509(0x7f0b337d, float:1.8503003E38)
            android.view.View r3 = r8.requireViewById(r0)
            r7.A02 = r3
            if (r3 == 0) goto L_0x00d4
            boolean r0 = r3 instanceof com.instagram.common.ui.base.IgSimpleImageView
            if (r0 == 0) goto L_0x0089
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.graphics.drawable.Drawable r2 = r3.getDrawable()
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r3)
            android.content.res.ColorStateList r0 = X.1QE.A0C(r1, r5)
            int r0 = r0.getDefaultColor()
            r2.setTint(r0)
            android.content.res.ColorStateList r0 = X.1QE.A0B(r1, r5)
            r3.setBackgroundTintList(r0)
        L_0x0089:
            android.view.View r1 = r7.A02
            if (r1 == 0) goto L_0x00d4
            r0 = 29
            X.C71401Ok0.A01(r1, r0, r7)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r7.A00
            if (r1 == 0) goto L_0x00d0
            r0 = 14
            X.C71273OhE.A00(r1, r7, r0)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r2 = r7.A00
            if (r2 == 0) goto L_0x00d0
            r1 = 4
            X.WDC r0 = new X.WDC
            r0.<init>(r7, r1)
            r2.setOnEditorActionListener(r0)
            A01(r7)
            return
        L_0x00ac:
            r0 = 2131440508(0x7f0b337c, float:1.8503001E38)
            android.view.View r0 = r8.requireViewById(r0)
            r7.A02 = r0
            goto L_0x0089
        L_0x00b6:
            java.lang.String r0 = "message_merchant"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003b
            if (r2 == 0) goto L_0x00d0
            r0 = 2131959816(0x7f132008, float:1.9556283E38)
            goto L_0x0038
        L_0x00c5:
            if (r2 == 0) goto L_0x00d0
            android.content.Context r1 = r8.getContext()
            r0 = 2131231606(0x7f080376, float:1.8079298E38)
            goto L_0x0019
        L_0x00d0:
            X.0qQ.A0F(r6)
            goto L_0x00d7
        L_0x00d4:
            X.0qQ.A0F(r4)
        L_0x00d7:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71089Obq.A04(android.view.View):void");
    }

    public C71089Obq(Context context, C74387Pu3 pu3, String str, boolean z, boolean z2) {
        this.A04 = context;
        this.A05 = pu3;
        this.A06 = str;
        this.A08 = z;
        this.A03 = z2;
        this.A07 = false;
    }
}
