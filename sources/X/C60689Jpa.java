package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Jpa  reason: case insensitive filesystem */
public final class C60689Jpa extends C249703kE {
    public C66500MUe A00;
    public C62947Koz A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgImageView A04;
    public final UserSession A05;
    public final IgSimpleImageView A06;
    public final C60005JdE A07;
    public final Integer A08;
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public final AtomicBoolean A0A = new AtomicBoolean(false);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60689Jpa(android.view.View r19, com.instagram.common.session.UserSession r20, java.lang.Integer r21) {
        /*
            r18 = this;
            r3 = 1
            r4 = r19
            X.0qQ.A0B(r4, r3)
            r5 = r18
            r5.<init>(r4)
            r6 = r21
            r5.A08 = r6
            r0 = r20
            r5.A05 = r0
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r2)
            r5.A09 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r2)
            r5.A0A = r0
            r0 = 2131434580(0x7f0b1c54, float:1.8490978E38)
            com.instagram.common.ui.base.IgSimpleImageView r1 = X.JTP.A0T(r4, r0)
            r5.A06 = r1
            int r6 = r6.intValue()
            switch(r6) {
                case 1: goto L_0x004b;
                default: goto L_0x0032;
            }
        L_0x0032:
            r0 = 2131432253(0x7f0b133d, float:1.8486258E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r4, r0)
            r5.A04 = r0
            switch(r6) {
                case 0: goto L_0x004b;
                case 1: goto L_0x004b;
                case 2: goto L_0x00a3;
                case 3: goto L_0x004b;
                case 4: goto L_0x00a3;
                case 5: goto L_0x00a3;
                default: goto L_0x003e;
            }
        L_0x003e:
            int r6 = 5 - r6
            if (r6 != 0) goto L_0x004b
            r0 = 2131432264(0x7f0b1348, float:1.848628E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r4, r0)
            r5.A03 = r0
        L_0x004b:
            android.content.Context r7 = X.DbS.A07(r5)
            r0 = 6
            float r10 = X.0nA.A04(r7, r0)
            r0 = 2130970270(0x7f04069e, float:1.7549245E38)
            int r14 = X.AnonymousClass7TF.A03(r7, r0)
            r0 = 2130970261(0x7f040695, float:1.7549227E38)
            int r15 = X.AnonymousClass7TF.A03(r7, r0)
            r0 = 2130970252(0x7f04068c, float:1.7549209E38)
            int r13 = X.AnonymousClass7TF.A03(r7, r0)
            r8 = 1056964608(0x3f000000, float:0.5)
            r9 = 1058642330(0x3f19999a, float:0.6)
            r11 = 1045220557(0x3e4ccccd, float:0.2)
            X.JdE r6 = new X.JdE
            r12 = r11
            r17 = r3
            r16 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5.A07 = r6
            X.Lj7 r3 = new X.Lj7
            r3.<init>(r5)
            r6.A02 = r3
            android.graphics.Bitmap r0 = r6.A01
            if (r0 == 0) goto L_0x008b
            r3.CyJ(r0, r6)
        L_0x008b:
            r1.setImageDrawable(r6)
            r0 = 2
            X.C64286LYm.A00(r4, r0, r5)
            r0 = 20
            X.LYC.A00(r4, r0, r5)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A04
            if (r1 == 0) goto L_0x00a2
            X.LjU r0 = new X.LjU
            r0.<init>(r5, r2)
            r1.A0I = r0
        L_0x00a2:
            return
        L_0x00a3:
            r0 = 2131432272(0x7f0b1350, float:1.8486297E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r4, r0)
            r5.A02 = r0
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60689Jpa.<init>(android.view.View, com.instagram.common.session.UserSession, java.lang.Integer):void");
    }

    public static final void A00(C60689Jpa jpa) {
        C62947Koz koz;
        if (jpa.A0A.get() && jpa.A09.get() && (koz = jpa.A01) != null) {
            koz.A09 = true;
            C66500MUe mUe = jpa.A00;
            if (mUe != null) {
                mUe.Cv3(koz);
            }
        }
    }
}
