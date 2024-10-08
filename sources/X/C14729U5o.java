package X;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.instagram.android.R;

/* renamed from: X.U5o  reason: case insensitive filesystem */
public final class C14729U5o extends QAE implements DialogInterface {
    public final C18743VzO A00 = new C18743VzO(getContext(), getWindow(), this);

    public static int A01(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A00.A0L;
        if (nestedScrollView == null || !nestedScrollView.A0G(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A00.A0L;
        if (nestedScrollView == null || !nestedScrollView.A0G(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public C14729U5o(Context context, int i) {
        super(context, A01(context, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x013c, code lost:
        if (r11.getVisibility() == 8) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0044, code lost:
        if (X.C18743VzO.A01(r12) == false) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            X.VzO r10 = r14.A00
            int r1 = r10.A00
            X.QAE r0 = r10.A0V
            r0.setContentView((int) r1)
            android.view.Window r9 = r10.A0U
            r0 = 2131437453(0x7f0b278d, float:1.8496805E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 2131443049(0x7f0b3d69, float:1.8508155E38)
            r2 = 2131443049(0x7f0b3d69, float:1.8508155E38)
            android.view.View r5 = r1.findViewById(r0)
            r0 = 2131430680(0x7f0b0d18, float:1.8483068E38)
            r7 = 2131430680(0x7f0b0d18, float:1.8483068E38)
            android.view.View r4 = r1.findViewById(r0)
            r0 = 2131429288(0x7f0b07a8, float:1.8480244E38)
            r6 = 2131429288(0x7f0b07a8, float:1.8480244E38)
            android.view.View r3 = r1.findViewById(r0)
            r0 = 2131431162(0x7f0b0efa, float:1.8484045E38)
            android.view.View r8 = r1.findViewById(r0)
            android.view.View r12 = r10.A0C
            r1 = 0
            if (r12 == 0) goto L_0x02db
            r1 = 1
            boolean r0 = X.C18743VzO.A01(r12)
            if (r0 != 0) goto L_0x02ba
        L_0x0046:
            r0 = 131072(0x20000, float:1.83671E-40)
            r9.setFlags(r0, r0)
            if (r1 != 0) goto L_0x02ba
            r0 = 8
            r8.setVisibility(r0)
        L_0x0052:
            android.view.View r2 = r8.findViewById(r2)
            android.view.View r1 = r8.findViewById(r7)
            android.view.View r0 = r8.findViewById(r6)
            android.view.ViewGroup r11 = X.C18743VzO.A00(r2, r5)
            android.view.ViewGroup r7 = X.C18743VzO.A00(r1, r4)
            android.view.ViewGroup r6 = X.C18743VzO.A00(r0, r3)
            r0 = 2131440739(0x7f0b3463, float:1.850347E38)
            android.view.View r0 = r9.findViewById(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r10.A0L = r0
            r5 = 0
            r0.setFocusable(r5)
            androidx.core.widget.NestedScrollView r0 = r10.A0L
            r0.setNestedScrollingEnabled(r5)
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r7, r0)
            r10.A0J = r1
            if (r1 == 0) goto L_0x0090
            java.lang.CharSequence r0 = r10.A0P
            if (r0 == 0) goto L_0x0287
            r1.setText(r0)
        L_0x0090:
            r0 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r10.A0F = r0
            android.view.View$OnClickListener r4 = r10.A0T
            X.AnonymousClass0fU.A00(r4, r0)
            java.lang.CharSequence r0 = r10.A0O
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 1
            r2 = 8
            if (r0 == 0) goto L_0x0278
            android.widget.Button r0 = r10.A0F
            r0.setVisibility(r2)
            r12 = 0
        L_0x00b1:
            r0 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r10.A0D = r0
            X.AnonymousClass0fU.A00(r4, r0)
            java.lang.CharSequence r0 = r10.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0268
            android.widget.Button r0 = r10.A0D
            r0.setVisibility(r2)
        L_0x00cc:
            r0 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r10.A0E = r0
            X.AnonymousClass0fU.A00(r4, r0)
            java.lang.CharSequence r0 = r10.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0258
            android.widget.Button r0 = r10.A0E
            r0.setVisibility(r2)
        L_0x00e7:
            android.content.Context r0 = r10.A0S
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r1 = r0.getTheme()
            r0 = 2130968649(0x7f040049, float:1.7545958E38)
            r1.resolveAttribute(r0, r4, r3)
            int r0 = r4.data
            if (r0 == 0) goto L_0x0251
            if (r12 != r3) goto L_0x0243
            android.widget.Button r3 = r10.A0F
        L_0x0100:
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r0 = 1
            r1.gravity = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.weight = r0
            r3.setLayoutParams(r1)
        L_0x0110:
            r1 = r11
            android.view.View r0 = r10.A0B
            if (r0 == 0) goto L_0x01dc
            r3 = -1
            r0 = -2
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r3, r0)
            android.view.View r0 = r10.A0B
            r11.addView(r0, r5, r1)
            r0 = 2131442897(0x7f0b3cd1, float:1.8507847E38)
            android.view.View r1 = r9.findViewById(r0)
        L_0x0128:
            r1.setVisibility(r2)
        L_0x012b:
            r3 = 1
            r13 = 0
            int r0 = r8.getVisibility()
            boolean r12 = X.JTQ.A1O(r0, r2)
            if (r11 == 0) goto L_0x013e
            int r0 = r11.getVisibility()
            r4 = 1
            if (r0 != r2) goto L_0x013f
        L_0x013e:
            r4 = 0
        L_0x013f:
            int r0 = r6.getVisibility()
            r8 = 1
            if (r0 != r2) goto L_0x014d
            r8 = 0
            r0 = 2131442571(0x7f0b3b8b, float:1.8507186E38)
            X.DbX.A1D(r7, r0, r5)
        L_0x014d:
            if (r4 == 0) goto L_0x01d4
            androidx.core.widget.NestedScrollView r0 = r10.A0L
            if (r0 == 0) goto L_0x0156
            r0.setClipToPadding(r3)
        L_0x0156:
            java.lang.CharSequence r0 = r10.A0P
            if (r0 != 0) goto L_0x015e
            android.widget.ListView r0 = r10.A0I
            if (r0 == 0) goto L_0x016a
        L_0x015e:
            r0 = 2131442866(0x7f0b3cb2, float:1.8507784E38)
            android.view.View r0 = r11.findViewById(r0)
        L_0x0165:
            if (r0 == 0) goto L_0x016a
            r0.setVisibility(r5)
        L_0x016a:
            android.widget.ListView r6 = r10.A0I
            boolean r0 = r6 instanceof androidx.appcompat.app.AlertController$RecycleListView
            if (r0 == 0) goto L_0x018d
            androidx.appcompat.app.AlertController$RecycleListView r6 = (androidx.appcompat.app.AlertController$RecycleListView) r6
            if (r8 == 0) goto L_0x0176
            if (r4 != 0) goto L_0x018d
        L_0x0176:
            int r5 = r6.getPaddingLeft()
            if (r4 == 0) goto L_0x01d1
            int r2 = r6.getPaddingTop()
        L_0x0180:
            int r1 = r6.getPaddingRight()
            if (r8 == 0) goto L_0x01ce
            int r0 = r6.getPaddingBottom()
        L_0x018a:
            r6.setPadding(r5, r2, r1, r0)
        L_0x018d:
            if (r12 != 0) goto L_0x01b7
            android.widget.ListView r5 = r10.A0I
            if (r5 != 0) goto L_0x0197
            androidx.core.widget.NestedScrollView r5 = r10.A0L
            if (r5 == 0) goto L_0x01b7
        L_0x0197:
            if (r8 == 0) goto L_0x019a
            r13 = 2
        L_0x019a:
            r4 = r4 | r13
            r2 = 3
            r0 = 2131440738(0x7f0b3462, float:1.8503468E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 2131440737(0x7f0b3461, float:1.8503466E38)
            android.view.View r0 = r9.findViewById(r0)
            r5.setScrollIndicators(r4, r2)
            if (r1 == 0) goto L_0x01b2
            r7.removeView(r1)
        L_0x01b2:
            if (r0 == 0) goto L_0x01b7
            r7.removeView(r0)
        L_0x01b7:
            android.widget.ListView r2 = r10.A0I
            if (r2 == 0) goto L_0x01cd
            android.widget.ListAdapter r0 = r10.A0H
            if (r0 == 0) goto L_0x01cd
            r2.setAdapter(r0)
            int r1 = r10.A01
            r0 = -1
            if (r1 <= r0) goto L_0x01cd
            r2.setItemChecked(r1, r3)
            r2.setSelection(r1)
        L_0x01cd:
            return
        L_0x01ce:
            int r0 = r6.A00
            goto L_0x018a
        L_0x01d1:
            int r2 = r6.A01
            goto L_0x0180
        L_0x01d4:
            r0 = 2131442572(0x7f0b3b8c, float:1.8507188E38)
            android.view.View r0 = r7.findViewById(r0)
            goto L_0x0165
        L_0x01dc:
            r0 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r10.A0G = r0
            java.lang.CharSequence r0 = r10.A0Q
            boolean r0 = X.C13990Tnq.A1a(r0)
            if (r0 == 0) goto L_0x0232
            boolean r0 = r10.A0R
            if (r0 == 0) goto L_0x0232
            r0 = 2131427981(0x7f0b028d, float:1.8477594E38)
            android.view.View r1 = r9.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r10.A0K = r1
            java.lang.CharSequence r0 = r10.A0Q
            r1.setText(r0)
            android.graphics.drawable.Drawable r1 = r10.A06
            if (r1 == 0) goto L_0x020e
            android.widget.ImageView r0 = r10.A0G
            r0.setImageDrawable(r1)
            goto L_0x012b
        L_0x020e:
            android.widget.TextView r12 = r10.A0K
            android.widget.ImageView r0 = r10.A0G
            int r4 = r0.getPaddingLeft()
            android.widget.ImageView r0 = r10.A0G
            int r3 = r0.getPaddingTop()
            android.widget.ImageView r0 = r10.A0G
            int r1 = r0.getPaddingRight()
            android.widget.ImageView r0 = r10.A0G
            int r0 = r0.getPaddingBottom()
            r12.setPadding(r4, r3, r1, r0)
            android.widget.ImageView r0 = r10.A0G
            r0.setVisibility(r2)
            goto L_0x012b
        L_0x0232:
            r0 = 2131442897(0x7f0b3cd1, float:1.8507847E38)
            android.view.View r0 = r9.findViewById(r0)
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r10.A0G
            r0.setVisibility(r2)
            goto L_0x0128
        L_0x0243:
            r0 = 2
            if (r12 != r0) goto L_0x024a
            android.widget.Button r3 = r10.A0D
            goto L_0x0100
        L_0x024a:
            r0 = 4
            if (r12 != r0) goto L_0x0251
            android.widget.Button r3 = r10.A0E
            goto L_0x0100
        L_0x0251:
            if (r12 != 0) goto L_0x0110
            r6.setVisibility(r2)
            goto L_0x0110
        L_0x0258:
            android.widget.Button r1 = r10.A0E
            java.lang.CharSequence r0 = r10.A0N
            r1.setText(r0)
            android.widget.Button r0 = r10.A0E
            r0.setVisibility(r5)
            r12 = r12 | 4
            goto L_0x00e7
        L_0x0268:
            android.widget.Button r1 = r10.A0D
            java.lang.CharSequence r0 = r10.A0M
            r1.setText(r0)
            android.widget.Button r0 = r10.A0D
            r0.setVisibility(r5)
            r12 = r12 | 2
            goto L_0x00cc
        L_0x0278:
            android.widget.Button r1 = r10.A0F
            java.lang.CharSequence r0 = r10.A0O
            r1.setText(r0)
            android.widget.Button r0 = r10.A0F
            r0.setVisibility(r5)
            r12 = 1
            goto L_0x00b1
        L_0x0287:
            r2 = 8
            r1.setVisibility(r2)
            androidx.core.widget.NestedScrollView r1 = r10.A0L
            android.widget.TextView r0 = r10.A0J
            r1.removeView(r0)
            android.widget.ListView r0 = r10.A0I
            if (r0 == 0) goto L_0x02b5
            androidx.core.widget.NestedScrollView r0 = r10.A0L
            android.view.ViewParent r4 = r0.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            androidx.core.widget.NestedScrollView r0 = r10.A0L
            int r3 = r4.indexOfChild(r0)
            r4.removeViewAt(r3)
            android.widget.ListView r2 = r10.A0I
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r4.addView(r2, r3, r0)
            goto L_0x0090
        L_0x02b5:
            r7.setVisibility(r2)
            goto L_0x0090
        L_0x02ba:
            r0 = 2131431161(0x7f0b0ef9, float:1.8484043E38)
            android.view.View r11 = r9.findViewById(r0)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r11.addView(r12, r0)
            android.widget.ListView r0 = r10.A0I
            if (r0 == 0) goto L_0x0052
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r0 = 0
            r1.weight = r0
            goto L_0x0052
        L_0x02db:
            r12 = 0
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14729U5o.onCreate(android.os.Bundle):void");
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C18743VzO vzO = this.A00;
        vzO.A0Q = charSequence;
        TextView textView = vzO.A0K;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
