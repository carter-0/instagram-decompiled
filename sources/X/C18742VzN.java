package X;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.VzN  reason: case insensitive filesystem */
public final class C18742VzN {
    public int A00;
    public TextWatcher A01;
    public View A02;
    public EditText A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public TextView A06;
    public C363208jL A07;
    public C363208jL A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;
    public final ViewStub A0J;
    public final InputMethodManager A0K;
    public final C263134Hw A0L;
    public final UZ1 A0M;

    public static void A00(C18742VzN vzN, String str) {
        int length;
        EditText editText = vzN.A03;
        editText.getClass();
        editText.removeTextChangedListener(vzN.A01);
        vzN.A03.setText(str);
        Editable text = vzN.A03.getText();
        Matcher matcher = Pattern.compile("\\d\\D*$").matcher(str);
        if (matcher.find()) {
            length = matcher.start() + 1;
        } else {
            length = str.length();
        }
        Selection.setSelection(text, length);
        EditText editText2 = vzN.A03;
        TextWatcher textWatcher = vzN.A01;
        textWatcher.getClass();
        editText2.addTextChangedListener(textWatcher);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.C18742VzN r9) {
        /*
            boolean r0 = r9.A0D
            r2 = 0
            if (r0 == 0) goto L_0x00b8
            android.widget.EditText r0 = r9.A03
            r0.getClass()
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00bc
            android.widget.EditText r0 = r9.A03
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.Long r0 = X.C18237Vo4.A00(r0)
            long r5 = r0.longValue()
            X.4Hw r7 = r9.A0L
            java.lang.Integer r0 = r7.BPX()
            if (r0 == 0) goto L_0x00b9
            java.lang.Integer r0 = r7.BPX()
            int r0 = r0.intValue()
        L_0x0032:
            long r3 = (long) r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bc
            android.content.Context r0 = r9.A0I
            android.content.res.Resources r8 = r0.getResources()
            r6 = 2131962831(0x7f132bcf, float:1.9562398E38)
            r5 = 1
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Integer r0 = r7.BPX()
            if (r0 == 0) goto L_0x010c
            java.lang.Integer r0 = r7.BPX()
        L_0x004d:
            int r0 = r0.intValue()
        L_0x0051:
            double r0 = (double) r0
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            java.util.Locale r1 = X.AnonymousClass1Q2.A02()
            java.lang.String r0 = r7.CCj()
            r0.getClass()
            java.util.Currency r0 = java.util.Currency.getInstance(r0)
            java.lang.String r0 = X.C18237Vo4.A01(r3, r0, r1)
            r4[r2] = r0
            java.lang.String r3 = r8.getString(r6, r4)
            boolean r0 = r9.A0B
            if (r0 != 0) goto L_0x009c
            r9.A0B = r5
            android.widget.LinearLayout r1 = r9.A04
            r1.getClass()
            X.8jL r0 = r9.A08
            r1.setBackgroundDrawable(r0)
            android.widget.TextView r0 = r9.A06
            r0.getClass()
            r0.setText(r3)
            android.widget.TextView r0 = r9.A06
            r0.setVisibility(r2)
            android.widget.TextView r0 = r9.A06
            android.view.ViewTreeObserver r3 = r0.getViewTreeObserver()
            r1 = 10
            X.WC9 r0 = new X.WC9
            r0.<init>(r9, r1)
            r3.addOnGlobalLayoutListener(r0)
        L_0x009c:
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x00b8
            r9.A0C = r2
            X.UZ1 r4 = r9.A0M
            android.widget.TextView r1 = r4.A03
            r1.getClass()
            r0 = 9
            X.WBC.A00(r1, r0, r4)
            android.widget.TextView r3 = r4.A03
            android.content.Context r1 = r4.A00
            r0 = 2131099812(0x7f0600a4, float:1.7811988E38)
            X.DbT.A16(r1, r3, r0)
        L_0x00b8:
            return r2
        L_0x00b9:
            r0 = 0
            goto L_0x0032
        L_0x00bc:
            boolean r0 = r9.A0E
            if (r0 == 0) goto L_0x010f
            android.widget.EditText r0 = r9.A03
            r0.getClass()
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x010f
            android.widget.EditText r0 = r9.A03
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.Long r0 = X.C18237Vo4.A00(r0)
            long r5 = r0.longValue()
            X.4Hw r7 = r9.A0L
            java.lang.Integer r0 = r7.BTO()
            if (r0 == 0) goto L_0x010a
            java.lang.Integer r0 = r7.BTO()
            int r0 = r0.intValue()
        L_0x00ed:
            long r3 = (long) r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x010f
            android.content.Context r0 = r9.A0I
            android.content.res.Resources r8 = r0.getResources()
            r6 = 2131962832(0x7f132bd0, float:1.95624E38)
            r5 = 1
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Integer r0 = r7.BTO()
            if (r0 == 0) goto L_0x010c
            java.lang.Integer r0 = r7.BTO()
            goto L_0x004d
        L_0x010a:
            r0 = 0
            goto L_0x00ed
        L_0x010c:
            r0 = 0
            goto L_0x0051
        L_0x010f:
            int r1 = r9.A00
            r0 = -1
            if (r1 != r0) goto L_0x013f
            android.widget.EditText r0 = r9.A03
            r0.getClass()
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x013f
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x009c
            r9.A0B = r2
            android.widget.LinearLayout r1 = r9.A04
            r1.getClass()
            X.8jL r0 = r9.A07
            r1.setBackgroundDrawable(r0)
            android.widget.TextView r1 = r9.A06
            r1.getClass()
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x009c
        L_0x013f:
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x0159
            r9.A0B = r2
            android.widget.LinearLayout r1 = r9.A04
            r1.getClass()
            X.8jL r0 = r9.A07
            r1.setBackgroundDrawable(r0)
            android.widget.TextView r1 = r9.A06
            r1.getClass()
            r0 = 8
            r1.setVisibility(r0)
        L_0x0159:
            boolean r0 = r9.A0C
            if (r0 != 0) goto L_0x0174
            r0 = 1
            r9.A0C = r0
            X.UZ1 r2 = r9.A0M
            android.widget.TextView r1 = r2.A03
            r1.getClass()
            r0 = 8
            X.WBC.A00(r1, r0, r2)
            android.widget.TextView r1 = r2.A03
            r0 = 2131237351(0x7f0819e7, float:1.809095E38)
            r1.setBackgroundResource(r0)
        L_0x0174:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18742VzN.A01(X.VzN):boolean");
    }

    public C18742VzN(View view, C263134Hw r5, UZ1 uz1, boolean z) {
        this.A0J = DbU.A0D(view, R.id.fundraiser_sticker_currency_amount_selector_stub);
        Context context = view.getContext();
        this.A0I = context;
        Object systemService = context.getSystemService("input_method");
        systemService.getClass();
        this.A0K = (InputMethodManager) systemService;
        this.A0L = r5;
        this.A0M = uz1;
        this.A0D = z;
        this.A0F = context.getResources().getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material);
        this.A0H = C51968G9o.A04(context);
        this.A0G = context.getColor(R.color.default_cta_dominant_color);
    }
}
