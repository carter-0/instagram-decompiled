package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.AOd  reason: case insensitive filesystem */
public final class C40021AOd implements View.OnFocusChangeListener, B21, AnonymousClass8Z3, B20 {
    public View A00;
    public EditText A01;
    public ImageView A02;
    public C40595Aej A03;
    public final Context A04;
    public final View A05;
    public final ViewStub A06;
    public final UserSession A07;
    public final AnonymousClass87F A08;
    public final AnonymousClass80U A09;
    public final AnonymousClass8MF A0A;

    public C40021AOd(View view, UserSession userSession, AnonymousClass3E6 r5, AnonymousClass80U r6, AnonymousClass8MF r7, String str) {
        0qQ.A0B(str, 3);
        this.A07 = userSession;
        this.A0A = r7;
        this.A09 = r6;
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A04 = A0S;
        this.A05 = AnonymousClass7TF.A0G(view, R.id.text_overlay_edit_text_container);
        this.A06 = (ViewStub) AnonymousClass7TF.A0F(view, R.id.secret_sticker_editor_stub);
        this.A08 = new AnonymousClass87F(A0S, r5, this);
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [java.lang.Object, X.Aej] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DCS(java.lang.Object r7) {
        /*
            r6 = this;
            r4 = 0
            X.0qQ.A0B(r7, r4)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r6.A07
            com.instagram.user.model.User r1 = r1.A01(r0)
            boolean r0 = r7 instanceof X.AnonymousClass8UX
            r3 = 0
            if (r0 == 0) goto L_0x0019
            X.8UX r7 = (X.AnonymousClass8UX) r7
            if (r7 == 0) goto L_0x0019
            X.Aej r0 = r7.A00
            if (r0 != 0) goto L_0x0022
        L_0x0019:
            X.Aej r0 = new X.Aej
            r0.<init>()
            r0.A01 = r3
            r0.A00 = r1
        L_0x0022:
            r6.A03 = r0
            android.view.View r0 = r6.A00
            if (r0 != 0) goto L_0x009e
            android.view.ViewStub r0 = r6.A06
            android.view.View r5 = r0.inflate()
            r6.A00 = r5
            X.0qQ.A0A(r5)
            r0 = 2131440887(0x7f0b34f7, float:1.850377E38)
            android.view.View r0 = r5.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.A02 = r0
            r0 = 2131440885(0x7f0b34f5, float:1.8503766E38)
            android.view.View r2 = r5.requireViewById(r0)
            android.widget.EditText r2 = (android.widget.EditText) r2
            X.0qQ.A0A(r2)
            X.9qZ r0 = new X.9qZ
            r0.<init>(r2)
            r2.addTextChangedListener(r0)
            r1 = 3
            X.UsV r0 = new X.UsV
            r0.<init>(r2, r1)
            r2.addTextChangedListener(r0)
            r2.setOnFocusChangeListener(r6)
            r6.A01 = r2
            android.content.Context r0 = r6.A04
            android.content.res.Resources r0 = r0.getResources()
            int r1 = X.AnonymousClass7TE.A0F(r0)
            android.widget.EditText r0 = r6.A01
            if (r0 == 0) goto L_0x00c3
            X.0nA.A0X(r0, r1)
            android.widget.ImageView r1 = r6.A02
            if (r1 != 0) goto L_0x007f
            java.lang.String r0 = "facepileView"
        L_0x0077:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007f:
            r0 = 8
            r1.setVisibility(r0)
            r0 = 2131440880(0x7f0b34f0, float:1.8503756E38)
            android.view.View r2 = r5.requireViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r2)
            X.9ju r0 = new X.9ju
            r0.<init>(r1)
            r2.setImageDrawable(r0)
            X.87F r0 = r6.A08
            r0.A03(r5)
        L_0x009e:
            android.widget.EditText r1 = r6.A01
            if (r1 == 0) goto L_0x00c3
            X.Aej r0 = r6.A03
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = "model"
            goto L_0x0077
        L_0x00a9:
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            android.view.View r1 = r6.A05
            android.view.View r0 = r6.A00
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            X.C294975nL.A04(r3, r0, r4)
            X.87F r1 = r6.A08
            android.widget.EditText r0 = r6.A01
            if (r0 == 0) goto L_0x00c3
            r1.A02(r0)
            return
        L_0x00c3:
            java.lang.String r0 = "titleEditText"
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40021AOd.DCS(java.lang.Object):void");
    }

    public final void DzC(int i, int i2) {
    }

    public final void onFocusChange(View view, boolean z) {
        0qQ.A0B(view, 0);
        AnonymousClass87F r0 = this.A08;
        if (z) {
            r0.A00();
            0nA.A0R(view);
            return;
        }
        r0.A01();
        0nA.A0N(view);
        View view2 = this.A00;
        if (view2 != null) {
            C294975nL.A05(new View[]{this.A05, view2}, false);
        }
    }

    public final View Azx() {
        View view = this.A00;
        if (view != null) {
            return view.requireViewById(R.id.secret_sticker_container);
        }
        return null;
    }

    public final Class Bza() {
        return C346987w5.class;
    }

    public final void DDW() {
        View view = this.A00;
        if (view != null) {
            C294975nL.A05(new View[]{this.A05, view}, false);
        }
        C40595Aej aej = this.A03;
        String str = "model";
        if (aej != null) {
            EditText editText = this.A01;
            if (editText == null) {
                str = "titleEditText";
            } else {
                aej.A01 = AnonymousClass7TF.A0f(editText);
                AnonymousClass8MF r2 = this.A0A;
                C40595Aej aej2 = this.A03;
                if (aej2 != null) {
                    r2.Dn8(aej2, C273654mx.A00(3289));
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DMp() {
        EditText editText = this.A01;
        if (editText == null) {
            0qQ.A0F("titleEditText");
            throw AnonymousClass00P.createAndThrow();
        }
        editText.clearFocus();
        this.A09.E3H(new Object());
    }
}
