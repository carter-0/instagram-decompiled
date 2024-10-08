package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

public final class FKj implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FKj(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void afterTextChanged(Editable editable) {
        ViewGroup viewGroup;
        View findViewById;
        CharSequence A0B;
        ViewGroup viewGroup2;
        View findViewById2;
        switch (this.A00) {
            case 2:
                if (editable == null || (A0B = 00l.A0B(editable)) == null || A0B.length() == 0) {
                    ((View) this.A02).setVisibility(4);
                    C71003OWa oWa = (C71003OWa) this.A01;
                    if (oWa != null && (viewGroup = oWa.A00) != null) {
                        int childCount = viewGroup.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = viewGroup.getChildAt(i);
                            if (!(childAt == null || (findViewById = childAt.findViewById(R.id.instant_reply_text_view)) == null)) {
                                findViewById.setEnabled(true);
                                childAt.setClickable(true);
                            }
                        }
                        return;
                    }
                    return;
                }
                ((View) this.A02).setVisibility(0);
                C71003OWa oWa2 = (C71003OWa) this.A01;
                if (oWa2 != null && (viewGroup2 = oWa2.A00) != null) {
                    int childCount2 = viewGroup2.getChildCount();
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        View childAt2 = viewGroup2.getChildAt(i2);
                        if (!(childAt2 == null || (findViewById2 = childAt2.findViewById(R.id.instant_reply_text_view)) == null)) {
                            findViewById2.setEnabled(false);
                            childAt2.setClickable(false);
                        }
                    }
                    return;
                }
                return;
            case 4:
                0qQ.A0B(editable, 0);
                DbU.A0L((Fragment) this.A02, 2dZ.A0t).A0T();
                ((View) this.A01).setEnabled(AnonymousClass7TF.A1R(00l.A0B(editable).length()));
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        r0 = "bottomInlineErrorMessage";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x004d;
                case 1: goto L_0x002e;
                case 2: goto L_0x0005;
                case 3: goto L_0x0014;
                case 4: goto L_0x0005;
                case 5: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r2 = r3.A01
            X.F2b r2 = (X.C49691F2b) r2
            java.lang.Object r1 = r3.A02
            X.G8C r1 = (X.G8C) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A00(r1, r0)
            return
        L_0x0014:
            java.lang.Object r2 = r3.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r3.A02
            X.Gzk r0 = (X.C54115Gzk) r0
            boolean r0 = r0.A02
            r1 = 1
            if (r0 == 0) goto L_0x0029
            if (r4 == 0) goto L_0x0029
            boolean r0 = X.00l.A0W(r4)
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            r2.setEnabled(r1)
            return
        L_0x002e:
            java.lang.Object r2 = r3.A02
            com.instagram.business.ui.BusinessInfoSectionView r2 = (com.instagram.business.ui.BusinessInfoSectionView) r2
            android.widget.TextView r0 = r2.A04
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "phoneInlineErrorMessage"
            goto L_0x0057
        L_0x0039:
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.A02
            if (r0 == 0) goto L_0x0076
            r0.setVisibility(r1)
            java.lang.Object r0 = r3.A01
            X.G9e r0 = (X.C51958G9e) r0
            r0.DWs()
            return
        L_0x004d:
            java.lang.Object r2 = r3.A02
            com.instagram.business.ui.BusinessInfoSectionView r2 = (com.instagram.business.ui.BusinessInfoSectionView) r2
            android.widget.TextView r0 = r2.A03
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = "emailInlineErrorMessage"
        L_0x0057:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005f:
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.A02
            if (r0 == 0) goto L_0x0076
            r0.setVisibility(r1)
            java.lang.Object r1 = r3.A01
            X.G9e r1 = (X.C51958G9e) r1
            android.widget.EditText r0 = r2.A00
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "emailEditView"
            goto L_0x0057
        L_0x0076:
            java.lang.String r0 = "bottomInlineErrorMessage"
            goto L_0x0057
        L_0x0079:
            boolean r0 = r0.hasFocus()
            r1.DBm(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FKj.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
