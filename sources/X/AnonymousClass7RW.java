package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7RW  reason: invalid class name */
public final class AnonymousClass7RW implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass7XR A02;
    public final AnonymousClass9HC A03;
    public final AnonymousClass7DZ A04;
    public final HashMap A05 = new HashMap();

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.direct_visual_message, viewGroup, false);
        0qQ.A0A(inflate);
        C3722390a r1 = new C3722390a(inflate, this.A03, this);
        this.A04.A00(r1);
        return r1;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView, android.view.View] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0324, code lost:
        r3 = r6.getString(r3, new java.lang.Object[]{r0});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x032c, code lost:
        r16 = false;
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03ac, code lost:
        r14 = r9.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03b4, code lost:
        if ("story_camera_reply".equals(r14) != false) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03bc, code lost:
        if ("story_remix_reply".equals(r14) == false) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03c0, code lost:
        if (r1 == 16) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03c4, code lost:
        if (r1 == 17) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03c6, code lost:
        r1 = r6.getString(2131974501);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03cd, code lost:
        if (r16 == false) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03cf, code lost:
        X.0qQ.A07(r1);
        r5 = X.C66852Mdl.A02(r10.A05, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03d8, code lost:
        if (r15 == null) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03da, code lost:
        r4.setText(r5);
        r4.setBackground(r15);
        r4.setTextColor(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03e3, code lost:
        if (r3 == null) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03e9, code lost:
        if (r3.length() == 0) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03eb, code lost:
        r4.setContentDescription(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03ee, code lost:
        r1 = r10.A02;
        r5 = (int) X.0nA.A04(r1, 12);
        r3 = (int) X.0nA.A04(r1, 10);
        r6 = r4.getContext();
        X.0qQ.A07(r6);
        X.0mq.A03(r4, (int) X.0nA.A03(r6, 14.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x040f, code lost:
        if (r13 == null) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0411, code lost:
        r13.mutate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0414, code lost:
        if (r17 != false) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0416, code lost:
        r13.setColorFilter(r12, android.graphics.PorterDuff.Mode.SRC_IN);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x041b, code lost:
        r12 = r1.getResources();
        r6 = r10.A06;
        r6.setImageDrawable(r13);
        r6.setVisibility(0);
        r6.setImageLevel(1);
        r1 = r12.getDimensionPixelSize(com.instagram.android.R.dimen.abc_control_corner_material);
        r0 = r12.getDimensionPixelSize(com.instagram.android.R.dimen.abc_button_padding_horizontal_material);
        X.0nA.A0b(r6, r1);
        X.0nA.A0Z(r6, r0);
        r4.setPaddingRelative((r6.getPaddingStart() + r6.getPaddingEnd()) + r13.getIntrinsicWidth(), r3, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0451, code lost:
        r5 = new android.text.SpannableStringBuilder(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0457, code lost:
        r10.A06.setVisibility(8);
        r4.setPaddingRelative(r5, r3, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x05a0, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bc, code lost:
        if (r14.length() != 0) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00de, code lost:
        if (r14.length() != 0) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0103, code lost:
        if (r14.length() != 0) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0128, code lost:
        if (r14.length() != 0) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0151, code lost:
        if (r0.length() != 0) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x017a, code lost:
        if (r0.length() != 0) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x019c, code lost:
        if (r14.length() != 0) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01bd, code lost:
        if (r14.length() != 0) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01e1, code lost:
        if (r14.length() != 0) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01e4, code lost:
        r3 = 2131976479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0209, code lost:
        if (r14.length() != 0) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x020b, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x020f, code lost:
        r3 = 2131969411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0212, code lost:
        r3 = r6.getString(r3, new java.lang.Object[]{r14});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0240, code lost:
        if (r0.length() != 0) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0244, code lost:
        r3 = r6.getString(2131969501, new java.lang.Object[]{r0});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0276, code lost:
        if (r0.length() != 0) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x027a, code lost:
        r3 = r6.getString(2131976654, new java.lang.Object[]{r0});
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r20, X.AnonymousClass7FW r21) {
        /*
            r19 = this;
            r9 = r21
            r10 = r20
            X.90a r10 = (X.C3722390a) r10
            X.Mdk r9 = (X.C66851Mdk) r9
            r8 = 0
            X.0qQ.A0B(r10, r8)
            r7 = 1
            X.0qQ.A0B(r9, r7)
            r11 = r19
            java.util.HashMap r1 = r11.A05
            boolean r0 = r1.containsKey(r10)
            if (r0 != 0) goto L_0x0023
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r9.BSG()
            java.lang.String r0 = r0.A01
            r1.put(r10, r0)
        L_0x0023:
            android.widget.FrameLayout r0 = r10.A00
            android.content.Context r6 = r0.getContext()
            X.0qQ.A07(r6)
            com.instagram.common.session.UserSession r5 = r11.A01
            X.7FE r0 = r9.A01
            r17 = r0
            X.7L2 r14 = r0.A03
            X.7L1 r13 = r14.A02
            r18 = 4
            r12 = 5
            X.0qQ.A0B(r13, r12)
            com.instagram.common.ui.text.TightTextView r4 = r10.A07
            r0 = 2147483647(0x7fffffff, float:NaN)
            r4.setMaxLines(r0)
            r3 = 0
            r4.setEllipsize(r3)
            X.4iq r15 = r9.A02
            X.7FU r0 = r9.A00
            boolean r2 = r0.CU2()
            java.lang.String r16 = "media in pending inbox does not exist"
            r1 = 0
            if (r2 != 0) goto L_0x0503
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x0503
            if (r15 == 0) goto L_0x0590
            boolean r0 = r15.A0V
            r1 = 4
            if (r0 == 0) goto L_0x0061
            r1 = 5
        L_0x0061:
            X.7Kz r14 = X.AnonymousClass7FB.A04(r14, r2)
            java.lang.String r15 = "line.separator"
            r17 = 0
            r0 = r18
            if (r1 == r0) goto L_0x04b3
            if (r1 == r12) goto L_0x0463
            r16 = 1
            switch(r1) {
                case 12: goto L_0x038f;
                case 13: goto L_0x0371;
                case 14: goto L_0x0353;
                case 15: goto L_0x0335;
                case 16: goto L_0x02d8;
                case 17: goto L_0x0287;
                case 18: goto L_0x0251;
                case 19: goto L_0x021b;
                case 20: goto L_0x01e8;
                case 21: goto L_0x01c0;
                case 22: goto L_0x019f;
                case 23: goto L_0x017e;
                case 24: goto L_0x0155;
                case 25: goto L_0x012c;
                case 26: goto L_0x0107;
                case 27: goto L_0x00e2;
                case 28: goto L_0x00c0;
                case 29: goto L_0x009e;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.String r3 = "VisualContentDefinition"
            java.lang.String r0 = "Default case not allowed for VisualMessageBubbleStyle: "
            java.lang.String r0 = X.002.A0O(r0, r1)
            X.0wb.A03(r3, r0)
        L_0x007f:
            X.7XR r1 = r11.A02
            X.7TJ r1 = (X.AnonymousClass7TJ) r1
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r9.BSG()
            java.lang.String r0 = r0.A00()
            if (r0 == 0) goto L_0x0098
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r9.BSG()
            java.lang.String r0 = r0.A00()
            r1.CjC(r0, r2)
        L_0x0098:
            X.7DZ r0 = r11.A04
            r0.A02(r10, r9)
            return
        L_0x009e:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A08
            android.graphics.drawable.Drawable r13 = X.C66852Mdl.A00(r6, r5)
            r0 = 2131976403(0x7f1360d3, float:1.9589926E38)
            java.lang.String r0 = r6.getString(r0)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r0)
            java.lang.String r14 = r9.A06
            if (r14 == 0) goto L_0x020b
            int r0 = r14.length()
            if (r0 != 0) goto L_0x01e4
            goto L_0x020b
        L_0x00c0:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A08
            android.graphics.drawable.Drawable r13 = X.C66852Mdl.A00(r6, r5)
            r0 = 2131969399(0x7f134577, float:1.957572E38)
            java.lang.String r0 = r6.getString(r0)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r0)
            java.lang.String r14 = r9.A06
            if (r14 == 0) goto L_0x020b
            int r0 = r14.length()
            if (r0 != 0) goto L_0x020f
            goto L_0x020b
        L_0x00e2:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A08
            r0 = 2131239499(0x7f08224b, float:1.8095307E38)
            android.graphics.drawable.Drawable r13 = r6.getDrawable(r0)
            r0 = 2131976403(0x7f1360d3, float:1.9589926E38)
            java.lang.String r0 = r6.getString(r0)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r0)
            java.lang.String r14 = r9.A06
            if (r14 == 0) goto L_0x020b
            int r0 = r14.length()
            if (r0 != 0) goto L_0x01e4
            goto L_0x020b
        L_0x0107:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A08
            r0 = 2131239499(0x7f08224b, float:1.8095307E38)
            android.graphics.drawable.Drawable r13 = r6.getDrawable(r0)
            r0 = 2131969399(0x7f134577, float:1.957572E38)
            java.lang.String r0 = r6.getString(r0)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r0)
            java.lang.String r14 = r9.A06
            if (r14 == 0) goto L_0x020b
            int r0 = r14.length()
            if (r0 != 0) goto L_0x020f
            goto L_0x020b
        L_0x012c:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A04
            r0 = 2131239499(0x7f08224b, float:1.8095307E38)
            android.graphics.drawable.Drawable r13 = r6.getDrawable(r0)
            r0 = 2131976403(0x7f1360d3, float:1.9589926E38)
            java.lang.String r5 = r6.getString(r0)
            X.0qQ.A07(r5)
            android.text.style.StyleSpan r0 = r10.A05
            android.text.SpannableStringBuilder r5 = X.C66852Mdl.A02(r0, r5)
            java.lang.String r0 = r9.A06
            if (r0 == 0) goto L_0x03ac
            int r14 = r0.length()
            if (r14 != 0) goto L_0x0244
            goto L_0x03ac
        L_0x0155:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A04
            r0 = 2131239499(0x7f08224b, float:1.8095307E38)
            android.graphics.drawable.Drawable r13 = r6.getDrawable(r0)
            r0 = 2131969399(0x7f134577, float:1.957572E38)
            java.lang.String r5 = r6.getString(r0)
            X.0qQ.A07(r5)
            android.text.style.StyleSpan r0 = r10.A05
            android.text.SpannableStringBuilder r5 = X.C66852Mdl.A02(r0, r5)
            java.lang.String r0 = r9.A06
            if (r0 == 0) goto L_0x03ac
            int r14 = r0.length()
            if (r14 != 0) goto L_0x027a
            goto L_0x03ac
        L_0x017e:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A08
            android.graphics.drawable.Drawable r13 = X.C66852Mdl.A00(r6, r5)
            r0 = 2131976403(0x7f1360d3, float:1.9589926E38)
            java.lang.String r0 = r6.getString(r0)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r0)
            java.lang.String r14 = r9.A06
            if (r14 == 0) goto L_0x020b
            int r0 = r14.length()
            if (r0 != 0) goto L_0x01e4
            goto L_0x020b
        L_0x019f:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A08
            android.graphics.drawable.Drawable r13 = X.C66852Mdl.A00(r6, r5)
            r0 = 2131969399(0x7f134577, float:1.957572E38)
            java.lang.String r0 = r6.getString(r0)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r0)
            java.lang.String r14 = r9.A06
            if (r14 == 0) goto L_0x020b
            int r0 = r14.length()
            if (r0 != 0) goto L_0x020f
            goto L_0x020b
        L_0x01c0:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A08
            r0 = 2131239499(0x7f08224b, float:1.8095307E38)
            android.graphics.drawable.Drawable r13 = r6.getDrawable(r0)
            r0 = 2131976403(0x7f1360d3, float:1.9589926E38)
            java.lang.String r0 = r6.getString(r0)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r0)
            java.lang.String r14 = r9.A06
            if (r14 == 0) goto L_0x020b
            int r0 = r14.length()
            if (r0 != 0) goto L_0x01e4
            goto L_0x020b
        L_0x01e4:
            r3 = 2131976479(0x7f13611f, float:1.959008E38)
            goto L_0x0212
        L_0x01e8:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A08
            r0 = 2131239499(0x7f08224b, float:1.8095307E38)
            android.graphics.drawable.Drawable r13 = r6.getDrawable(r0)
            r0 = 2131969399(0x7f134577, float:1.957572E38)
            java.lang.String r0 = r6.getString(r0)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r0)
            java.lang.String r14 = r9.A06
            if (r14 == 0) goto L_0x020b
            int r0 = r14.length()
            if (r0 != 0) goto L_0x020f
        L_0x020b:
            r16 = 0
            goto L_0x03ac
        L_0x020f:
            r3 = 2131969411(0x7f134583, float:1.9575744E38)
        L_0x0212:
            java.lang.Object[] r0 = new java.lang.Object[]{r14}
            java.lang.String r3 = r6.getString(r3, r0)
            goto L_0x020b
        L_0x021b:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A04
            r0 = 2131239499(0x7f08224b, float:1.8095307E38)
            android.graphics.drawable.Drawable r13 = r6.getDrawable(r0)
            r0 = 2131976403(0x7f1360d3, float:1.9589926E38)
            java.lang.String r5 = r6.getString(r0)
            X.0qQ.A07(r5)
            android.text.style.StyleSpan r0 = r10.A05
            android.text.SpannableStringBuilder r5 = X.C66852Mdl.A02(r0, r5)
            java.lang.String r0 = r9.A06
            if (r0 == 0) goto L_0x03ac
            int r14 = r0.length()
            if (r14 != 0) goto L_0x0244
            goto L_0x03ac
        L_0x0244:
            r3 = 2131969501(0x7f1345dd, float:1.9575927E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = r6.getString(r3, r0)
            goto L_0x03ac
        L_0x0251:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A04
            r0 = 2131239499(0x7f08224b, float:1.8095307E38)
            android.graphics.drawable.Drawable r13 = r6.getDrawable(r0)
            r0 = 2131969399(0x7f134577, float:1.957572E38)
            java.lang.String r5 = r6.getString(r0)
            X.0qQ.A07(r5)
            android.text.style.StyleSpan r0 = r10.A05
            android.text.SpannableStringBuilder r5 = X.C66852Mdl.A02(r0, r5)
            java.lang.String r0 = r9.A06
            if (r0 == 0) goto L_0x03ac
            int r14 = r0.length()
            if (r14 != 0) goto L_0x027a
            goto L_0x03ac
        L_0x027a:
            r3 = 2131976654(0x7f1361ce, float:1.9590435E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = r6.getString(r3, r0)
            goto L_0x03ac
        L_0x0287:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A04
            r5 = 2131239499(0x7f08224b, float:1.8095307E38)
            int[] r0 = r14.A0C
            android.graphics.drawable.Drawable r13 = r13.A00(r0, r5)
            java.lang.String r5 = r9.A07
            java.lang.String r0 = "story_camera_reply"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02d4
            java.lang.String r0 = "story_remix_reply"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02d4
            boolean r0 = r9.A0B
            r5 = 2131960712(0x7f132388, float:1.95581E38)
            if (r0 == 0) goto L_0x02b2
            r5 = 2131960713(0x7f132389, float:1.9558102E38)
        L_0x02b2:
            java.lang.String r5 = r6.getString(r5)
            X.0qQ.A07(r5)
            android.text.style.StyleSpan r0 = r10.A05
            android.text.SpannableStringBuilder r5 = X.C66852Mdl.A02(r0, r5)
            java.lang.String r0 = r9.A06
            if (r0 == 0) goto L_0x032c
            int r14 = r0.length()
            if (r14 == 0) goto L_0x032c
            boolean r14 = r9.A0B
            r3 = 2131969501(0x7f1345dd, float:1.9575927E38)
            if (r14 == 0) goto L_0x0324
            r3 = 2131969502(0x7f1345de, float:1.9575929E38)
            goto L_0x0324
        L_0x02d4:
            r5 = 2131960711(0x7f132387, float:1.9558098E38)
            goto L_0x02b2
        L_0x02d8:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A04
            r5 = 2131239499(0x7f08224b, float:1.8095307E38)
            int[] r0 = r14.A0C
            android.graphics.drawable.Drawable r13 = r13.A00(r0, r5)
            java.lang.String r5 = r9.A07
            java.lang.String r0 = "story_camera_reply"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0331
            java.lang.String r0 = "story_remix_reply"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0331
            boolean r0 = r9.A0B
            r5 = 2131960709(0x7f132385, float:1.9558094E38)
            if (r0 == 0) goto L_0x0303
            r5 = 2131960710(0x7f132386, float:1.9558096E38)
        L_0x0303:
            java.lang.String r5 = r6.getString(r5)
            X.0qQ.A07(r5)
            android.text.style.StyleSpan r0 = r10.A05
            android.text.SpannableStringBuilder r5 = X.C66852Mdl.A02(r0, r5)
            java.lang.String r0 = r9.A06
            if (r0 == 0) goto L_0x032c
            int r14 = r0.length()
            if (r14 == 0) goto L_0x032c
            boolean r14 = r9.A0B
            r3 = 2131976654(0x7f1361ce, float:1.9590435E38)
            if (r14 == 0) goto L_0x0324
            r3 = 2131976655(0x7f1361cf, float:1.9590437E38)
        L_0x0324:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = r6.getString(r3, r0)
        L_0x032c:
            r16 = 0
            r17 = 1
            goto L_0x03ac
        L_0x0331:
            r5 = 2131960711(0x7f132387, float:1.9558098E38)
            goto L_0x0303
        L_0x0335:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A04
            r0 = 2131239499(0x7f08224b, float:1.8095307E38)
            android.graphics.drawable.Drawable r13 = r6.getDrawable(r0)
            r0 = 2131976403(0x7f1360d3, float:1.9589926E38)
            java.lang.String r5 = r6.getString(r0)
            X.0qQ.A07(r5)
            android.text.style.StyleSpan r0 = r10.A05
            android.text.SpannableStringBuilder r5 = X.C66852Mdl.A02(r0, r5)
            goto L_0x03ac
        L_0x0353:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A04
            r0 = 2131239499(0x7f08224b, float:1.8095307E38)
            android.graphics.drawable.Drawable r13 = r6.getDrawable(r0)
            r0 = 2131969399(0x7f134577, float:1.957572E38)
            java.lang.String r5 = r6.getString(r0)
            X.0qQ.A07(r5)
            android.text.style.StyleSpan r0 = r10.A05
            android.text.SpannableStringBuilder r5 = X.C66852Mdl.A02(r0, r5)
            goto L_0x03ac
        L_0x0371:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A04
            r0 = 2131239499(0x7f08224b, float:1.8095307E38)
            android.graphics.drawable.Drawable r13 = r6.getDrawable(r0)
            r0 = 2131976403(0x7f1360d3, float:1.9589926E38)
            java.lang.String r5 = r6.getString(r0)
            X.0qQ.A07(r5)
            android.text.style.StyleSpan r0 = r10.A05
            android.text.SpannableStringBuilder r5 = X.C66852Mdl.A02(r0, r5)
            goto L_0x03ac
        L_0x038f:
            android.graphics.drawable.Drawable r15 = X.C66852Mdl.A01(r10, r9)
            int r12 = r14.A04
            r0 = 2131239499(0x7f08224b, float:1.8095307E38)
            android.graphics.drawable.Drawable r13 = r6.getDrawable(r0)
            r0 = 2131969399(0x7f134577, float:1.957572E38)
            java.lang.String r5 = r6.getString(r0)
            X.0qQ.A07(r5)
            android.text.style.StyleSpan r0 = r10.A05
            android.text.SpannableStringBuilder r5 = X.C66852Mdl.A02(r0, r5)
        L_0x03ac:
            java.lang.String r14 = r9.A07
            java.lang.String r0 = "story_camera_reply"
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x03be
            java.lang.String r0 = "story_remix_reply"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x03d8
        L_0x03be:
            r0 = 16
            if (r1 == r0) goto L_0x03d8
            r0 = 17
            if (r1 == r0) goto L_0x03d8
            r0 = 2131974501(0x7f135965, float:1.9586068E38)
            java.lang.String r1 = r6.getString(r0)
            if (r16 == 0) goto L_0x0451
            X.0qQ.A07(r1)
            android.text.style.StyleSpan r0 = r10.A05
            android.text.SpannableStringBuilder r5 = X.C66852Mdl.A02(r0, r1)
        L_0x03d8:
            if (r15 == 0) goto L_0x0599
            r4.setText(r5)
            r4.setBackground(r15)
            r4.setTextColor(r12)
            if (r3 == 0) goto L_0x03ee
            int r0 = r3.length()
            if (r0 == 0) goto L_0x03ee
            r4.setContentDescription(r3)
        L_0x03ee:
            android.content.Context r1 = r10.A02
            r0 = 12
            float r0 = X.0nA.A04(r1, r0)
            int r5 = (int) r0
            r0 = 10
            float r0 = X.0nA.A04(r1, r0)
            int r3 = (int) r0
            android.content.Context r6 = r4.getContext()
            X.0qQ.A07(r6)
            r0 = 1096810496(0x41600000, float:14.0)
            float r0 = X.0nA.A03(r6, r0)
            int r0 = (int) r0
            X.0mq.A03(r4, r0)
            if (r13 == 0) goto L_0x0457
            r13.mutate()
            if (r17 != 0) goto L_0x041b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r13.setColorFilter(r12, r0)
        L_0x041b:
            android.content.res.Resources r12 = r1.getResources()
            android.widget.ImageView r6 = r10.A06
            r6.setImageDrawable(r13)
            r6.setVisibility(r8)
            r6.setImageLevel(r7)
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r1 = r12.getDimensionPixelSize(r0)
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r12.getDimensionPixelSize(r0)
            X.0nA.A0b(r6, r1)
            X.0nA.A0Z(r6, r0)
            int r1 = r6.getPaddingStart()
            int r0 = r6.getPaddingEnd()
            int r1 = r1 + r0
            int r0 = r13.getIntrinsicWidth()
            int r1 = r1 + r0
            r4.setPaddingRelative(r1, r3, r5, r3)
            goto L_0x007f
        L_0x0451:
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r1)
            goto L_0x03d8
        L_0x0457:
            android.widget.ImageView r1 = r10.A06
            r0 = 8
            r1.setVisibility(r0)
            r4.setPaddingRelative(r5, r3, r5, r3)
            goto L_0x007f
        L_0x0463:
            r0 = 2131959100(0x7f131d3c, float:1.955483E38)
            java.lang.String r12 = r6.getString(r0)
            X.0qQ.A07(r12)
            r0 = 2131959069(0x7f131d1d, float:1.9554768E38)
            java.lang.String r1 = r6.getString(r0)
            X.0qQ.A07(r1)
            java.lang.String r0 = java.lang.System.getProperty(r15)
            java.lang.String r0 = X.002.A0g(r12, r0, r1)
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r0)
            android.text.style.ForegroundColorSpan r6 = r10.A04
            java.lang.String r1 = r7.toString()
            X.0qQ.A07(r1)
            int r0 = r1.length()
            int r0 = r0 + -1
            int r5 = X.00l.A07(r1, r12, r0)
            int r1 = r12.length()
            int r1 = r1 + r5
            r0 = 33
            r7.setSpan(r6, r5, r1, r0)
            r4.setText(r7)
            android.graphics.drawable.Drawable r0 = X.C66852Mdl.A01(r10, r9)
            r4.setBackground(r0)
            r4.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r3, r3)
            r4.setCompoundDrawablePadding(r8)
            goto L_0x007f
        L_0x04b3:
            r0 = 2131959097(0x7f131d39, float:1.9554825E38)
            java.lang.String r12 = r6.getString(r0)
            X.0qQ.A07(r12)
            r0 = 2131959068(0x7f131d1c, float:1.9554766E38)
            java.lang.String r1 = r6.getString(r0)
            X.0qQ.A07(r1)
            java.lang.String r0 = java.lang.System.getProperty(r15)
            java.lang.String r0 = X.002.A0g(r12, r0, r1)
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r0)
            android.text.style.ForegroundColorSpan r6 = r10.A04
            java.lang.String r1 = r7.toString()
            X.0qQ.A07(r1)
            int r0 = r1.length()
            int r0 = r0 + -1
            int r5 = X.00l.A07(r1, r12, r0)
            int r1 = r12.length()
            int r1 = r1 + r5
            r0 = 33
            r7.setSpan(r6, r5, r1, r0)
            r4.setText(r7)
            android.graphics.drawable.Drawable r0 = X.C66852Mdl.A01(r10, r9)
            r4.setBackground(r0)
            r4.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r3, r3)
            r4.setCompoundDrawablePadding(r8)
            goto L_0x007f
        L_0x0503:
            r0 = r17
            boolean r0 = r0.A06
            r0 = r0 ^ 1
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0560
            if (r15 != 0) goto L_0x054a
            java.lang.Integer r0 = r9.A05
            int r0 = r0.intValue()
            java.lang.String r15 = "pending media does not exist"
            if (r0 == r7) goto L_0x0533
            if (r0 == r8) goto L_0x0523
            java.lang.String r15 = "VisualContentDefinition"
            java.lang.String r0 = "unsupported lifecycle type"
            X.0wb.A03(r15, r0)
            goto L_0x0061
        L_0x0523:
            X.7Qt r0 = r9.A03
            if (r0 == 0) goto L_0x0543
            boolean r0 = r0.A01()
            r1 = 14
            if (r0 == 0) goto L_0x0061
            r1 = 15
            goto L_0x0061
        L_0x0533:
            X.7Qt r0 = r9.A03
            if (r0 == 0) goto L_0x0543
            boolean r0 = r0.A01()
            r1 = 12
            if (r0 == 0) goto L_0x0061
            r1 = 13
            goto L_0x0061
        L_0x0543:
            java.lang.String r0 = "VisualContentDefinition"
            X.0wb.A03(r0, r15)
            goto L_0x0061
        L_0x054a:
            boolean r15 = r15.A0V
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x0558
            r1 = 28
            if (r15 == 0) goto L_0x0061
            r1 = 29
            goto L_0x0061
        L_0x0558:
            r1 = 26
            if (r15 == 0) goto L_0x0061
            r1 = 27
            goto L_0x0061
        L_0x0560:
            if (r15 == 0) goto L_0x0590
            boolean r15 = r15.A0V
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x0570
            r1 = 16
            if (r15 == 0) goto L_0x0061
            r1 = 17
            goto L_0x0061
        L_0x0570:
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x057c
            r1 = 22
            if (r15 == 0) goto L_0x0061
            r1 = 23
            goto L_0x0061
        L_0x057c:
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x0588
            r1 = 18
            if (r15 == 0) goto L_0x0061
            r1 = 19
            goto L_0x0061
        L_0x0588:
            r1 = 20
            if (r15 == 0) goto L_0x0061
            r1 = 21
            goto L_0x0061
        L_0x0590:
            java.lang.String r15 = "VisualContentDefinition"
            r0 = r16
            X.0wb.A03(r15, r0)
            goto L_0x0061
        L_0x0599:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RW.ADp(X.7Db, X.7FW):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.text.TightTextView, android.view.View] */
    public final /* bridge */ /* synthetic */ void FIP(C328007Db r4) {
        C3722390a r42 = (C3722390a) r4;
        0qQ.A0B(r42, 0);
        ? r1 = r42.A07;
        C71392co r0 = C315596kB.A02;
        C294975nL.A01(r1, 0).A0G();
        r1.setTranslationY(0.0f);
        r1.setAlpha(1.0f);
        this.A05.clear();
        this.A04.A01(r42);
    }

    public AnonymousClass7RW(AnonymousClass0iw r4, UserSession userSession, AnonymousClass7XR r6, AnonymousClass9HC r7) {
        this.A02 = r6;
        this.A03 = r7;
        this.A01 = userSession;
        this.A00 = r4;
        List singletonList = Collections.singletonList(C3259074q.A00(new AnonymousClass7DX((AnonymousClass7XN) r6), new AnonymousClass7RX(this), r6, r7));
        0qQ.A07(singletonList);
        this.A04 = new AnonymousClass7DZ(singletonList);
    }
}
