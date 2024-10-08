package com.instagram.igtv.widget;

import X.002;
import X.0mk;
import X.0rN;
import X.1Xj;
import X.2Yu;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C252993q2;
import X.C253003q3;
import X.C253013q4;
import X.C253033q6;
import X.C51965G9l;
import X.C51968G9o;
import X.C61920KRp;
import X.C63724L4i;
import X.C66401MQh;
import X.DbS;
import X.DbT;
import X.DbV;
import X.JTQ;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

public class ExpandableTextView extends IgTextView {
    public int A00 = 2;
    public C66401MQh A01;
    public final C63724L4i A02 = new Object();

    public void setTextLayoutHorizontalPadding(int i) {
        C63724L4i l4i = this.A02;
        l4i.A00 = i;
        l4i.A01 = null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.L4i, java.lang.Object] */
    public ExpandableTextView(Context context) {
        super(context);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [android.widget.TextView, com.instagram.igtv.widget.ExpandableTextView, android.view.View] */
    public void setExpandableText(String str, UserSession userSession, 1Xj r17) {
        StringBuilder A1A;
        DbT.A1H(this);
        C63724L4i l4i = this.A02;
        Context context = getContext();
        0rN r6 = l4i.A01;
        if (r6 == null) {
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            int A04 = C51968G9o.A04(context);
            int color = context.getColor(R.color.text_view_link_color);
            int color2 = context.getColor(2Yu.A0C(context));
            Resources resources = context.getResources();
            TextPaint textPaint = new TextPaint(1);
            textPaint.density = resources.getDisplayMetrics().density;
            textPaint.linkColor = color;
            textPaint.bgColor = color2;
            textPaint.setTextSize(resources.getDimension(R.dimen.abc_text_size_menu_header_material));
            textPaint.setColor(A04);
            r6 = new 0rN(alignment, textPaint, (String) null, 0.0f, 1.0f, AnonymousClass7TF.A0E(context).widthPixels - (l4i.A00 * 2), false);
            l4i.A01 = r6;
        }
        boolean A022 = 0mk.A02(context);
        SpannableStringBuilder A0E = C51965G9l.A0E();
        if (A022) {
            A1A = new StringBuilder("‏‪");
        } else {
            A1A = AnonymousClass7TE.A1A();
        }
        A1A.append(str);
        String string = getResources().getString(2131961851);
        if (A022) {
            string = 002.A0R("‏", string);
        }
        CharSequence A012 = C252993q2.A01(r6, A0E, A1A, string, this.A00, false);
        UserSession userSession2 = userSession;
        1Xj r4 = r17;
        if (JTQ.A1Y(A1A, A012.toString())) {
            String obj = A1A.toString();
            SpannableStringBuilder A0E2 = C51965G9l.A0E();
            A0E2.append(obj);
            A0E = C51965G9l.A0E();
            C253003q3 r2 = new C253003q3(A0E2, userSession2);
            r2.A03(new C253013q4(userSession2, r4, true));
            r2.A02(new C253033q6(userSession2, r4, true));
            A0E.append(r2.A00());
        } else {
            C253003q3 r3 = new C253003q3(DbS.A0C(A012.toString()), userSession2);
            r3.A03(new C253013q4(userSession2, r4, true));
            r3.A02(new C253033q6(userSession2, r4, true));
            A0E.append(r3.A00());
            int length = A0E.length();
            A0E.append(string);
            A0E.setSpan(new C61920KRp((ExpandableTextView) this, DbV.A01(context)), length, A0E.length(), 33);
        }
        setText(A0E);
    }

    public void setExpandListener(C66401MQh mQh) {
        this.A01 = mQh;
    }

    public void setMaxLineCount(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.L4i, java.lang.Object] */
    public ExpandableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.L4i, java.lang.Object] */
    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
