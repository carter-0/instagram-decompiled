package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;

/* renamed from: X.AOb  reason: case insensitive filesystem */
public final class C40019AOb implements View.OnFocusChangeListener, B21, AnonymousClass8Z3 {
    public View A00;
    public EditText A01;
    public ImageView A02;
    public TextView A03;
    public C40594Aei A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final View A08;
    public final ViewStub A09;
    public final AnonymousClass87F A0A;
    public final AnonymousClass80U A0B;
    public final AnonymousClass8MF A0C;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DCS(java.lang.Object r11) {
        /*
            r10 = this;
            r3 = 0
            X.0qQ.A0B(r11, r3)
            X.8UW r11 = (X.AnonymousClass8UW) r11
            X.Aei r0 = r11.A00
            r10.A04 = r0
            android.view.View r0 = r10.A00
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            java.lang.String r9 = "editorFullScreenView"
            if (r0 != 0) goto L_0x005c
            android.view.ViewStub r0 = r10.A09
            android.view.View r1 = r0.inflate()
            r10.A00 = r1
            if (r1 == 0) goto L_0x012c
            r0 = 2131437834(0x7f0b290a, float:1.8497578E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r10.A02 = r0
            android.view.View r1 = r10.A00
            if (r1 == 0) goto L_0x012c
            r0 = 2131437836(0x7f0b290c, float:1.8497582E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.A03 = r0
            android.view.View r1 = r10.A00
            if (r1 == 0) goto L_0x012c
            r0 = 2131437827(0x7f0b2903, float:1.8497564E38)
            android.view.View r2 = r1.requireViewById(r0)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1 = 2
            X.UsV r0 = new X.UsV
            r0.<init>(r2, r1)
            r2.addTextChangedListener(r0)
            r2.setOnFocusChangeListener(r10)
            r10.A01 = r2
            X.87F r1 = r10.A0A
            android.view.View r0 = r10.A00
            if (r0 == 0) goto L_0x012c
            r1.A03(r0)
        L_0x005c:
            X.Aei r0 = r10.A04
            java.lang.String r8 = "imageView"
            r4 = 0
            if (r0 == 0) goto L_0x011d
            com.instagram.common.gallery.Medium r7 = r0.A00
            if (r7 == 0) goto L_0x011d
            float r2 = r7.A00()
            int r0 = r10.A06
            float r1 = (float) r0
            float r1 = r1 / r2
            int r0 = r10.A05
            float r0 = (float) r0
            float r0 = java.lang.Math.min(r1, r0)
            int r6 = X.AnonymousClass1GB.A01(r0)
            float r0 = (float) r6
            int r5 = X.AnonymousClass7TE.A06(r0, r2)
            java.lang.String r2 = r7.A0X
            android.widget.ImageView r1 = r10.A02
            if (r1 == 0) goto L_0x0126
            int r0 = X.C364678lo.A01(r2)
            android.graphics.Bitmap r0 = X.1MF.A0F(r2, r5, r6, r0)
            r1.setImageBitmap(r0)
        L_0x0090:
            android.widget.EditText r1 = r10.A01
            if (r1 == 0) goto L_0x012a
            java.lang.String r0 = ""
            r1.setText(r0)
            X.Aei r0 = r10.A04
            if (r0 == 0) goto L_0x011b
            com.instagram.common.gallery.Medium r0 = r0.A00
            if (r0 == 0) goto L_0x011b
            long r1 = r0.A0D
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r0 == 0) goto L_0x011b
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x011b
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTimeInMillis(r1)
            java.text.DateFormat r5 = java.text.DateFormat.getDateInstance()
            java.util.Date r0 = r0.getTime()
            java.lang.String r5 = r5.format(r0)
            android.content.Context r0 = r10.A07
            java.lang.String r1 = X.C378999Sa.A01(r0, r1)
            java.lang.String r0 = " • "
            java.lang.String r1 = X.002.A0g(r5, r0, r1)
        L_0x00ce:
            java.lang.String r8 = "captionEditText"
            java.lang.String r2 = "timestampView"
            if (r1 == 0) goto L_0x0107
            android.widget.TextView r0 = r10.A03
            if (r0 == 0) goto L_0x0130
            r0.setText(r1)
            android.content.Context r0 = r10.A07
            int r1 = X.AnonymousClass7TG.A03(r0)
            android.widget.EditText r0 = r10.A01
            if (r0 == 0) goto L_0x0126
            X.0nA.A0X(r0, r1)
            android.widget.TextView r1 = r10.A03
            if (r1 == 0) goto L_0x0130
            r0 = 0
        L_0x00ed:
            r1.setVisibility(r0)
            android.view.View r1 = r10.A08
            android.view.View r0 = r10.A00
            if (r0 == 0) goto L_0x012c
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            X.C294975nL.A04(r4, r0, r3)
            X.87F r1 = r10.A0A
            android.widget.EditText r0 = r10.A01
            if (r0 == 0) goto L_0x012a
            r1.A02(r0)
            return
        L_0x0107:
            android.content.Context r0 = r10.A07
            int r1 = X.AnonymousClass7TG.A02(r0)
            android.widget.EditText r0 = r10.A01
            if (r0 == 0) goto L_0x0126
            X.0nA.A0X(r0, r1)
            android.widget.TextView r1 = r10.A03
            if (r1 == 0) goto L_0x0130
            r0 = 8
            goto L_0x00ed
        L_0x011b:
            r1 = r4
            goto L_0x00ce
        L_0x011d:
            android.widget.ImageView r0 = r10.A02
            if (r0 == 0) goto L_0x0126
            r0.setImageBitmap(r4)
            goto L_0x0090
        L_0x0126:
            X.0qQ.A0F(r8)
            goto L_0x0133
        L_0x012a:
            java.lang.String r9 = "captionEditText"
        L_0x012c:
            X.0qQ.A0F(r9)
            goto L_0x0133
        L_0x0130:
            X.0qQ.A0F(r2)
        L_0x0133:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40019AOb.DCS(java.lang.Object):void");
    }

    public final void DzC(int i, int i2) {
    }

    public final void onFocusChange(View view, boolean z) {
        0qQ.A0B(view, 0);
        AnonymousClass87F r0 = this.A0A;
        if (z) {
            r0.A00();
            0nA.A0R(view);
            return;
        }
        r0.A01();
        0nA.A0N(view);
        View view2 = this.A00;
        if (view2 != null) {
            C294975nL.A05(new View[]{this.A08, view2}, false);
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.Aei, X.50v, java.lang.Object] */
    public final void DDW() {
        View view = this.A00;
        if (view != null) {
            C294975nL.A05(new View[]{this.A08, view}, false);
        }
        EditText editText = this.A01;
        Medium medium = null;
        if (editText == null) {
            0qQ.A0F("captionEditText");
            throw AnonymousClass00P.createAndThrow();
        }
        String A0f = AnonymousClass7TF.A0f(editText);
        C40594Aei aei = this.A04;
        if (aei != null) {
            medium = aei.A00;
        }
        ? obj = new Object();
        obj.A00 = medium;
        obj.A01 = A0f;
        this.A0C.Dn8(obj, "polaroid_sticker_bundle_id");
    }

    public final void DMp() {
        EditText editText = this.A01;
        if (editText == null) {
            0qQ.A0F("captionEditText");
            throw AnonymousClass00P.createAndThrow();
        }
        editText.clearFocus();
        this.A0B.E3H(new Object());
    }

    public C40019AOb(View view, AnonymousClass3E6 r5, AnonymousClass80U r6, AnonymousClass8MF r7) {
        this.A0C = r7;
        this.A0B = r6;
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A07 = A0S;
        this.A06 = A0S.getResources().getDimensionPixelSize(R.dimen.browser_error_screen_description_width);
        this.A05 = A0S.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height);
        this.A08 = AnonymousClass7TF.A0G(view, R.id.text_overlay_edit_text_container);
        this.A09 = (ViewStub) AnonymousClass7TF.A0F(view, R.id.polaroid_sticker_editor_stub);
        this.A0A = new AnonymousClass87F(A0S, r5, this);
    }
}
