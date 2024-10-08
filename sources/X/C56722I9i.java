package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

/* renamed from: X.I9i  reason: case insensitive filesystem */
public final class C56722I9i implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public C56722I9i(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void afterTextChanged(Editable editable) {
        Integer num;
        boolean z;
        C331137Ps r4;
        switch (this.A00) {
            case 0:
                DbS.A1U(this.A01);
                return;
            case 1:
                return;
            case 2:
                H24 h24 = (H24) this.A01;
                EditText editText = h24.A03;
                boolean z2 = false;
                if (editText != null) {
                    String A0f = AnonymousClass7TF.A0f(editText);
                    int length = A0f.length() - 1;
                    int i = 0;
                    boolean z3 = false;
                    while (i <= length) {
                        int i2 = length;
                        if (!z3) {
                            i2 = i;
                        }
                        boolean A13 = Dbc.A13(A0f, i2);
                        if (!z3) {
                            if (!A13) {
                                z3 = true;
                            } else {
                                i++;
                            }
                        } else if (A13) {
                            length--;
                        } else {
                            String A0c = Dba.A0c(A0f, length, i);
                            if (!(A0c == null || A0c.length() == 0)) {
                                z2 = true;
                            }
                        }
                    }
                    String A0c2 = Dba.A0c(A0f, length, i);
                    z2 = true;
                }
                View view = h24.A02;
                if (view != null) {
                    view.setEnabled(z2);
                    return;
                }
                return;
            case 3:
                H25.A01((H25) this.A01);
                return;
            case 4:
                H10.A00((H10) this.A01);
                return;
            case 5:
                0qQ.A0B(editable, 0);
                C54171H1q h1q = (C54171H1q) this.A01;
                String A12 = DbV.A12(editable.toString());
                h1q.A0C = A12;
                if (A12 == null) {
                    0qQ.A0F("newCollectionName");
                    throw AnonymousClass00P.createAndThrow();
                }
                if (A12.length() > 0) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A00;
                }
                C54171H1q.A03(h1q, num);
                return;
            default:
                H27 h27 = (H27) this.A01;
                String trim = editable.toString().trim();
                h27.A0A = trim;
                if (h27.A08 != null) {
                    boolean isEmpty = TextUtils.isEmpty(trim);
                    C55736HmX hmX = h27.A08;
                    C331157Pu r2 = hmX.A01;
                    if (!isEmpty) {
                        z = true;
                        r4 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
                        r4.A06 = hmX.A02;
                        r4.A05 = hmX.A00;
                    } else {
                        z = true;
                        r4 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
                        r4.A06 = hmX.A02;
                        r4.A05 = hmX.A00;
                        r4.A0A = false;
                    }
                    r2.A0K(r4.A00(), z);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007d, code lost:
        if (r1 != true) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 1: goto L_0x006f;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x002e;
                case 6: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r3 = r7.A01
            X.H27 r3 = (X.H27) r3
            android.view.View r6 = r3.A04
            r6.getClass()
            android.widget.EditText r2 = r3.A05
            r2.getClass()
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r2.measure(r1, r0)
            android.widget.EditText r0 = r3.A05
            int r2 = r0.getMeasuredWidth()
            int r0 = r3.A01
            if (r2 >= r0) goto L_0x002b
            r2 = r0
        L_0x002b:
            android.view.View r0 = r3.A04
            goto L_0x0060
        L_0x002e:
            java.lang.Object r5 = r7.A01
            X.H1q r5 = (X.C54171H1q) r5
            X.0eM r4 = r5.A0K
            android.view.View r6 = X.AnonymousClass7TE.A0c(r4)
            X.0eM r3 = r5.A0M
            android.view.View r2 = X.AnonymousClass7TE.A0c(r3)
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r2.measure(r1, r0)
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            int r1 = r0.getMeasuredWidth()
            X.0eM r0 = r5.A0L
            int r0 = X.DbX.A07(r0)
            int r2 = java.lang.Math.min(r1, r0)
            android.view.View r0 = X.AnonymousClass7TE.A0c(r4)
        L_0x0060:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r1 = r0.height
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r2, r1)
            r6.setLayoutParams(r0)
            return
        L_0x006f:
            java.lang.Object r3 = r7.A01
            X.H1O r3 = (X.H1O) r3
            r2 = 1
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r3.A07
            if (r0 == 0) goto L_0x007f
            boolean r1 = r0.isChecked()
            r0 = 1
            if (r1 == r2) goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            X.H1O.A08(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56722I9i.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
