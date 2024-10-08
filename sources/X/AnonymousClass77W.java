package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.77W  reason: invalid class name */
public final class AnonymousClass77W implements AnonymousClass7XB {
    public C249403jg A00;
    public boolean A01;
    public final ArrayList A02 = new ArrayList();
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new AnonymousClass9L4(this, 42));
    public final C62320sa A04;
    public final C62320sa A05;
    public final C249453jo A06;
    public final UserSession A07;
    public final AnonymousClass7SM A08;
    public final AnonymousClass7TK A09;
    public final C332887Wv A0A;

    public AnonymousClass77W(C249453jo r3, UserSession userSession, AnonymousClass7SM r5, AnonymousClass7TK r6, C332887Wv r7, C62320sa r8, C62320sa r9) {
        0qQ.A0B(r5, 2);
        0qQ.A0B(r8, 3);
        0qQ.A0B(r3, 4);
        0qQ.A0B(r7, 6);
        0qQ.A0B(r6, 7);
        this.A07 = userSession;
        this.A08 = r5;
        this.A04 = r8;
        this.A06 = r3;
        this.A05 = r9;
        this.A0A = r7;
        this.A09 = r6;
    }

    public final boolean CRg() {
        return this.A01;
    }

    public final void Cyd(View view) {
        if (view != null && this.A01) {
            this.A02.add(C70866OPf.A01(view, (RecyclerView) this.A03.getValue(), true));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r1 == X.2FW.A17) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Euo(android.view.View r13, X.C254703su r14, com.instagram.model.direct.messageid.MessageIdentifier r15, long r16) {
        /*
            r12 = this;
            java.lang.String r3 = r15.A00()
            if (r3 != 0) goto L_0x0008
            java.lang.String r3 = r15.A01
        L_0x0008:
            r1 = 0
            if (r14 == 0) goto L_0x0162
            X.2FW r2 = r14.A10
        L_0x000d:
            X.2FW r0 = X.2FW.A1g
            if (r2 == r0) goto L_0x0019
            if (r14 == 0) goto L_0x0015
            X.2FW r1 = r14.A10
        L_0x0015:
            X.2FW r0 = X.2FW.A17
            if (r1 != r0) goto L_0x0165
        L_0x0019:
            if (r13 == 0) goto L_0x0165
            X.3jo r0 = r12.A06
            X.2dZ r0 = r0.AYJ()
            r1 = 1057803469(0x3f0ccccd, float:0.55)
            if (r0 == 0) goto L_0x002b
            android.view.ViewGroup r0 = r0.A0P
            r0.setAlpha(r1)
        L_0x002b:
            X.0sa r0 = r12.A05
            java.lang.Object r0 = r0.invoke()
            X.7WY r0 = (X.AnonymousClass7WY) r0
            r0.A01(r1)
            java.lang.String r6 = r14.A1q
            if (r6 != 0) goto L_0x003c
            java.lang.String r6 = ""
        L_0x003c:
            r4 = 1
            r12.A01 = r4
            X.7SM r0 = r12.A08
            java.lang.String r8 = r15.A01
            X.OBY r10 = new X.OBY
            r10.<init>(r13, r12)
            r2 = 0
            X.9H7 r0 = r0.A00
            X.7Hl r5 = r0.A0R
            if (r5 == 0) goto L_0x013e
            X.7Kf r0 = r5.A0d
            X.0eM r0 = r0.A0K
            java.lang.Object r0 = r0.getValue()
            X.OLs r0 = (X.C70797OLs) r0
            r5.A0g = r0
            if (r0 == 0) goto L_0x013e
            X.C329067Hl.A0m(r5, r4, r2)
            X.C329067Hl.A0T(r5)
            X.C329067Hl.A0j(r5, r4)
            X.C329067Hl.A0W(r5)
            X.C329067Hl.A0U(r5)
            X.7H1 r1 = r5.A1w
            boolean r0 = r1 instanceof X.AnonymousClass7H0
            if (r0 == 0) goto L_0x0079
            X.7H0 r1 = (X.AnonymousClass7H0) r1
            r1.A06 = r4
            X.AnonymousClass7H0.A00(r1)
        L_0x0079:
            X.7L0 r0 = r5.A0U
            r0.getClass()
            X.OLs r7 = r5.A0g
            X.7L0 r9 = r5.A0U
            X.0qQ.A0B(r6, r4)
            r0 = 4
            X.0qQ.A0B(r9, r0)
            r7.A02 = r8
            r7.A03 = r6
            r0 = r16
            r7.A00 = r0
            r7.A01 = r10
            X.0eM r10 = r7.A07
            java.lang.Object r11 = r10.getValue()
            android.view.View r11 = (android.view.View) r11
            java.lang.Object r0 = r10.getValue()
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            X.0qQ.A07(r0)
            int r1 = X.0nA.A09(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r11.measure(r1, r0)
            java.lang.Object r1 = r10.getValue()
            android.view.View r1 = (android.view.View) r1
            int r0 = r9.A02
            r1.setBackgroundColor(r0)
            X.0eM r0 = r7.A09
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r9.A0C
            r1.setTextColor(r0)
            X.0eM r0 = r7.A08
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            int r0 = r9.A08
            r1.setBackgroundColor(r0)
            java.lang.Object r0 = r10.getValue()
            android.view.View r0 = (android.view.View) r0
            X.5nL r0 = X.C294975nL.A01(r0, r2)
            r0.A0G()
            X.5nL r9 = r0.A0F(r4)
            java.lang.Object r0 = r10.getValue()
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getMeasuredHeight()
            float r1 = (float) r0
            r0 = 0
            r9.A0T(r1, r0)
            r9.A04 = r2
            r9.A0H()
            X.0eM r0 = r7.A06
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            X.OiS r0 = new X.OiS
            r0.<init>(r7, r8)
            X.AnonymousClass0fU.A00(r0, r1)
            r5.A1C()
            X.7L0 r0 = r5.A0U
            int r0 = r0.A02
            X.C329067Hl.A0e(r5, r0)
            r5.A1B = r4
            r5.A1D()
            X.7Ij r0 = r5.A0b
            r0.A06(r6)
            X.7Ij r0 = r5.A0b
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r0.A0R
            r0 = 0
            r1.setOnFocusChangeListener(r0)
            r1.requestFocus()
            android.view.View$OnFocusChangeListener r0 = r5.A1U
            r1.setOnFocusChangeListener(r0)
            android.view.View r0 = X.C329067Hl.A02(r5)
            r0.setVisibility(r2)
        L_0x013e:
            X.7TK r0 = r12.A09
            r0.ARf(r4)
            X.Mve r0 = new X.Mve
            r0.<init>(r13, r12)
            r12.A00 = r0
            X.0eM r0 = r12.A03
            java.lang.Object r2 = r0.getValue()
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            X.3jg r1 = r12.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.OnScrollListener"
            X.0qQ.A0C(r1, r0)
            r2.A15(r1)
            X.7Wv r0 = r12.A0A
            r0.EKV(r3)
            return
        L_0x0162:
            r2 = r1
            goto L_0x000d
        L_0x0165:
            X.0wj r2 = X.0wj.A01
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "Attempted to edit a non text type message"
            X.0f9 r0 = r2.AEf(r0, r1)
            r0.report()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass77W.Euo(android.view.View, X.3su, com.instagram.model.direct.messageid.MessageIdentifier, long):void");
    }
}
