package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.7EG  reason: invalid class name */
public final class AnonymousClass7EG implements C328007Db {
    public Drawable A00;
    public LayerDrawable A01;
    public LinearLayout A02;
    public TextView A03;
    public IgSimpleImageView A04;
    public AnonymousClass7AA A05;
    public final C71662eb A06;
    public final C332807Wl A07;
    public final Context A08;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
        if (r5.contentEquals(r0) == false) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass7AA r14) {
        /*
            r13 = this;
            r4 = 0
            X.2eb r0 = r13.A06
            r0.A01()
            X.7AA r0 = r13.A05
            boolean r0 = X.0qQ.A0K(r0, r14)
            if (r0 != 0) goto L_0x003c
            com.instagram.model.direct.messageid.MessageIdentifier r2 = r14.A02
            r1 = 1
            r3 = 0
            if (r2 == 0) goto L_0x002a
            X.7AA r0 = r13.A05
            if (r0 == 0) goto L_0x0139
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r0.A02
        L_0x001a:
            boolean r0 = r2.equals(r0)
            if (r0 != r1) goto L_0x002a
            X.7AA r0 = r13.A05
            if (r0 == 0) goto L_0x0136
            int r1 = r14.A00
            int r0 = r0.A00
            if (r1 != r0) goto L_0x0136
        L_0x002a:
            r12 = 0
        L_0x002b:
            r13.A05 = r14
            int r10 = r14.A00
            java.lang.String r11 = "commentsMessagePill"
            if (r10 != 0) goto L_0x003d
            android.widget.LinearLayout r1 = r13.A02
            if (r1 == 0) goto L_0x013c
            r0 = 8
            r1.setVisibility(r0)
        L_0x003c:
            return
        L_0x003d:
            android.widget.LinearLayout r0 = r13.A02
            if (r0 == 0) goto L_0x013c
            r0.setVisibility(r4)
            android.content.Context r2 = r13.A08
            android.widget.TextView r7 = r13.A03
            java.lang.String r9 = "countLabelContainer"
            if (r7 == 0) goto L_0x0140
            boolean r6 = r14.A05
            r8 = 0
            X.0qQ.A0B(r2, r4)
            if (r10 < 0) goto L_0x012b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            android.content.res.Resources r0 = r2.getResources()
            X.0qQ.A07(r0)
            java.lang.String r5 = X.C253673rC.A03(r0, r1)
            if (r6 == 0) goto L_0x0074
            android.content.res.Resources r4 = r2.getResources()
            r1 = 2131821029(0x7f1101e5, float:1.927479E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            java.lang.String r5 = r4.getQuantityString(r1, r10, r0)
        L_0x0074:
            int r0 = r7.getVisibility()
            if (r0 != 0) goto L_0x0087
            java.lang.CharSequence r0 = r7.getText()
            X.0qQ.A07(r0)
            boolean r0 = r5.contentEquals(r0)
            if (r0 != 0) goto L_0x0091
        L_0x0087:
            if (r12 == 0) goto L_0x012e
            X.PYM r0 = new X.PYM
            r0.<init>(r7, r5)
            r7.post(r0)
        L_0x0091:
            android.widget.LinearLayout r1 = r13.A02
            if (r1 == 0) goto L_0x013c
            X.ANg r0 = new X.ANg
            r0.<init>(r14, r13)
            X.AnonymousClass0fU.A00(r0, r1)
            java.lang.String r11 = "icon"
            android.widget.TextView r1 = r13.A03
            if (r6 == 0) goto L_0x00e4
            if (r1 == 0) goto L_0x0140
            r0 = 2130970132(0x7f040614, float:1.7548965E38)
            int r0 = X.2Yu.A0H(r2, r0)
            int r0 = r2.getColor(r0)
            r1.setTextColor(r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r13.A04
            if (r1 == 0) goto L_0x013c
            int r0 = X.2Yu.A09(r2)
            int r0 = r2.getColor(r0)
            r1.setColorFilter(r0)
            android.graphics.drawable.Drawable r0 = r13.A00
            if (r0 == 0) goto L_0x00c9
            r0.setColorFilter(r3)
        L_0x00c9:
            X.7Kx r0 = r14.A01
            if (r0 == 0) goto L_0x003c
            int r2 = r0.A06
            android.graphics.drawable.LayerDrawable r1 = r13.A01
            if (r1 == 0) goto L_0x003c
            r0 = 2131436168(0x7f0b2288, float:1.8494199E38)
            android.graphics.drawable.Drawable r1 = r1.findDrawableByLayerId(r0)
            if (r1 == 0) goto L_0x003c
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r2)
            r1.setColorFilter(r0)
            return
        L_0x00e4:
            if (r1 == 0) goto L_0x0140
            r0 = 2130971409(0x7f040b11, float:1.7551556E38)
            int r0 = X.2Yu.A0H(r2, r0)
            int r0 = r2.getColor(r0)
            r1.setTextColor(r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r13.A04
            if (r1 == 0) goto L_0x013c
            int r0 = X.2Yu.A0B(r2)
            int r0 = r2.getColor(r0)
            r1.setColorFilter(r0)
            boolean r1 = r14.A04
            X.7Kx r0 = r14.A01
            if (r1 == 0) goto L_0x0126
            if (r0 == 0) goto L_0x00c9
            int r0 = r0.A06
        L_0x010d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x00c9
            int r3 = r0.intValue()
            android.graphics.drawable.Drawable r2 = r13.A00
            if (r2 == 0) goto L_0x00c9
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r1)
            r2.setColorFilter(r0)
            goto L_0x00c9
        L_0x0126:
            if (r0 == 0) goto L_0x00c9
            int r0 = r0.A07
            goto L_0x010d
        L_0x012b:
            r8 = 8
            goto L_0x0131
        L_0x012e:
            r7.setText(r5)
        L_0x0131:
            r7.setVisibility(r8)
            goto L_0x0091
        L_0x0136:
            r12 = 1
            goto L_0x002b
        L_0x0139:
            r0 = r3
            goto L_0x001a
        L_0x013c:
            X.0qQ.A0F(r11)
            goto L_0x0143
        L_0x0140:
            X.0qQ.A0F(r9)
        L_0x0143:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7EG.A00(X.7AA):void");
    }

    public final View BJd() {
        C71662eb r1 = this.A06;
        if (r1.A00 != null) {
            View A012 = r1.A01();
            0qQ.A07(A012);
            return A012;
        }
        ViewStub viewStub = r1.A01;
        if (viewStub != null) {
            return viewStub;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass7EG(C71662eb r2, C332807Wl r3) {
        this.A06 = r2;
        this.A07 = r3;
        Context context = BJd().getContext();
        0qQ.A07(context);
        this.A08 = context;
        r2.A02 = new AnonymousClass7EH(this);
    }
}
