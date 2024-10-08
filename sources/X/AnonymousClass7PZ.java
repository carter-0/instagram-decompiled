package X;

import android.content.Context;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7PZ  reason: invalid class name */
public final class AnonymousClass7PZ extends C232222tE {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9LX(this, 2));
    public final AnonymousClass7XM A03;
    public final AnonymousClass9HC A04;

    public AnonymousClass7PZ(Context context, UserSession userSession, AnonymousClass7XM r5, AnonymousClass9HC r6) {
        this.A01 = userSession;
        this.A00 = context;
        this.A04 = r6;
        this.A03 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x010d, code lost:
        if (r13 == null) goto L_0x010f;
     */
    /* renamed from: A01 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bind(X.C330987Pa r19, X.AnonymousClass7F4 r20) {
        /*
            r18 = this;
            r11 = 0
            r0 = r20
            X.0qQ.A0B(r0, r11)
            r2 = 1
            r3 = r19
            X.0qQ.A0B(r3, r2)
            java.lang.String r1 = r0.A09
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r1)
            X.9Is r10 = r0.A04
            r1 = r18
            if (r10 == 0) goto L_0x004f
            int r9 = r0.A02
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            android.text.SpannableStringBuilder r5 = r4.append(r13)
            java.lang.String r4 = " "
            android.text.SpannableStringBuilder r4 = r5.append(r4)
            java.lang.String r8 = r10.A03
            android.text.SpannableStringBuilder r7 = r4.append(r8)
            android.content.Context r6 = r1.A00
            X.0qQ.A0A(r7)
            int r4 = r10.A01
            X.0qQ.A0B(r8, r11)
            X.9Is r5 = new X.9Is
            r5.<init>((java.lang.String) r8, (int) r9, (int) r4)
            java.lang.String r4 = r13.toString()
            if (r4 == 0) goto L_0x0168
            int r4 = r4.length()
        L_0x0049:
            int r4 = r4 + 1
            X.C66866Me1.A00(r6, r7, r5, r4)
            r13 = r7
        L_0x004f:
            boolean r4 = r0.A0B
            if (r4 == 0) goto L_0x00d2
            int r14 = r0.A02
            android.content.Context r12 = r1.A00
            r4 = 2131958836(0x7f131c34, float:1.9554295E38)
            java.lang.String r8 = r12.getString(r4)
            X.0qQ.A07(r8)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            android.text.SpannableStringBuilder r4 = r4.append(r13)
            android.text.SpannableStringBuilder r7 = r4.append(r8)
            android.content.res.Resources r5 = r12.getResources()
            r4 = 2131165217(0x7f070021, float:1.7944645E38)
            int r5 = r5.getDimensionPixelSize(r4)
            android.content.res.Resources r6 = r12.getResources()
            r4 = 2131165200(0x7f070010, float:1.794461E38)
            int r10 = r6.getDimensionPixelSize(r4)
            android.content.res.Resources r6 = r12.getResources()
            r4 = 2131165223(0x7f070027, float:1.7944657E38)
            int r11 = r6.getDimensionPixelSize(r4)
            int r9 = r13.length()
            int r8 = r8.length()
            int r8 = r8 + r9
            r6 = 2132017412(0x7f140104, float:1.9673102E38)
            android.text.style.TextAppearanceSpan r4 = new android.text.style.TextAppearanceSpan
            r4.<init>(r12, r6)
            r6 = 33
            r7.setSpan(r4, r9, r8, r6)
            android.content.res.Resources r13 = r12.getResources()
            r4 = 2131165277(0x7f07005d, float:1.7944767E38)
            int r16 = r13.getDimensionPixelSize(r4)
            android.content.res.Resources r12 = r12.getResources()
            r4 = 2131165195(0x7f07000b, float:1.79446E38)
            int r17 = r12.getDimensionPixelSize(r4)
            float r13 = (float) r11
            float r5 = (float) r5
            float r4 = (float) r10
            android.graphics.PointF r12 = new android.graphics.PointF
            r12.<init>(r5, r4)
            X.U2a r11 = new X.U2a
            r15 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7.setSpan(r11, r9, r8, r6)
            java.lang.String r4 = "   "
            r7.append(r4)
            r13 = r7
        L_0x00d2:
            boolean r4 = r0.A0C
            if (r4 != 0) goto L_0x00da
            boolean r4 = r0.A0D
            if (r4 == 0) goto L_0x0110
        L_0x00da:
            com.instagram.model.direct.messageid.MessageIdentifier r6 = r0.A05
            boolean r12 = r0.A0D
            int r11 = r0.A00
            X.7XM r7 = r1.A03
            android.content.Context r8 = r1.A00
            r4 = 2131959745(0x7f131fc1, float:1.955614E38)
            if (r12 == 0) goto L_0x00ec
            r4 = 2131959755(0x7f131fcb, float:1.955616E38)
        L_0x00ec:
            java.lang.String r4 = r8.getString(r4)
            X.0qQ.A07(r4)
            r5 = 2131964456(0x7f133228, float:1.9565694E38)
            java.lang.Object[] r4 = new java.lang.Object[]{r13, r4}
            java.lang.String r4 = r8.getString(r5, r4)
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r4)
            if (r7 == 0) goto L_0x010f
            if (r6 == 0) goto L_0x0166
            java.lang.String r10 = r6.A01
        L_0x0109:
            android.text.Spannable r13 = r7.CnI(r8, r9, r10, r11, r12)
            if (r13 != 0) goto L_0x0110
        L_0x010f:
            r13 = r9
        L_0x0110:
            boolean r4 = r0.A0E
            if (r4 == 0) goto L_0x012b
            X.0eM r4 = r1.A02
            java.lang.Object r12 = r4.getValue()
            X.7AL r12 = (X.AnonymousClass7AL) r12
            com.instagram.common.session.UserSession r14 = r1.A01
            java.lang.String r5 = r0.A07
            java.lang.String r4 = r0.A06
            r15 = r5
            r16 = r4
            r17 = r2
            android.text.Spannable r13 = r12.A00(r13, r14, r15, r16, r17)
        L_0x012b:
            android.widget.TextView r4 = r3.A00
            r4.setText(r13)
            int r2 = r0.A02
            r4.setTextColor(r2)
            int r3 = r0.A01
            r4.setGravity(r3)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r3 != r2) goto L_0x0155
            r2 = 2131165303(0x7f070077, float:1.794482E38)
            android.content.Context r1 = r1.A00
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getDimensionPixelOffset(r2)
            X.0nA.A0d(r4, r1)
        L_0x014f:
            boolean r0 = r0.A0A
            X.C3256573p.A00(r4, r0)
            return
        L_0x0155:
            r2 = 2131165248(0x7f070040, float:1.7944708E38)
            android.content.Context r1 = r1.A00
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getDimensionPixelOffset(r2)
            X.0nA.A0U(r4, r1)
            goto L_0x014f
        L_0x0166:
            r10 = 0
            goto L_0x0109
        L_0x0168:
            r4 = 0
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7PZ.bind(X.7Pa, X.7F4):void");
    }

    /* renamed from: A00 */
    public final C330987Pa createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TextView textView;
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        try {
            View inflate = layoutInflater.inflate(R.layout.thread_message_username, viewGroup, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate;
        } catch (InflateException e) {
            Context context = this.A00;
            2Yn.A03(context, e);
            context.getTheme().applyStyle(2Yn.A00(), true);
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.thread_message_username, viewGroup, false);
            0qQ.A0C(inflate2, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate2;
        }
        return new C330987Pa(textView);
    }

    public final Class modelClass() {
        return AnonymousClass7F4.class;
    }
}
