package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewStub;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Jpv  reason: case insensitive filesystem */
public final class C60710Jpv extends C249703kE implements C241113Nx {
    public AnonymousClass3BT A00;
    public AnonymousClass5BD A01;
    public C17708Vcd A02;
    public boolean A03 = false;
    public final Context A04;
    public final ViewStub A05;
    public final IgFrameLayout A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final C60005JdE A09;
    public final IgImageView A0A;
    public final AnonymousClass3N8 A0B;
    public final AnonymousClass3N6 A0C;
    public final RecyclerReelAvatarView A0D;

    public final boolean EtJ() {
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60710Jpv(android.view.View r22) {
        /*
            r21 = this;
            r2 = r21
            r5 = r22
            r2.<init>(r5)
            r12 = 0
            r2.A03 = r12
            android.content.Context r6 = r5.getContext()
            r2.A04 = r6
            r0 = 2131428503(0x7f0b0497, float:1.8478652E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView r0 = (com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView) r0
            r2.A0D = r0
            X.3N7 r0 = new X.3N7
            r0.<init>(r5)
            r2.A0B = r0
            android.widget.TextView r1 = r0.A01
            android.graphics.Typeface r0 = X.AnonymousClass7TG.A0N(r6)
            r1.setTypeface(r0)
            X.3N6 r0 = new X.3N6
            r0.<init>(r5)
            r2.A0C = r0
            r0 = 2131428539(0x7f0b04bb, float:1.8478725E38)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = X.DbT.A0b(r5, r0)
            r2.A0A = r1
            r0 = 2131443091(0x7f0b3d93, float:1.850824E38)
            android.view.View r4 = r5.requireViewById(r0)
            com.instagram.common.ui.base.IgFrameLayout r4 = (com.instagram.common.ui.base.IgFrameLayout) r4
            r2.A06 = r4
            r0 = 2131435614(0x7f0b205e, float:1.8493075E38)
            android.view.ViewStub r0 = X.DbU.A0D(r5, r0)
            r2.A05 = r0
            r3 = 15
            X.WBC r0 = new X.WBC
            r0.<init>(r2, r3)
            X.AnonymousClass0fU.A00(r0, r4)
            r3 = 4
            X.LYU r0 = new X.LYU
            r0.<init>(r2, r3)
            r4.setOnLongClickListener(r0)
            r0 = 2131442048(0x7f0b3980, float:1.8506125E38)
            android.view.View r0 = X.DbY.A0F(r5, r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r2.A07 = r0
            r0 = 2131443595(0x7f0b3f8b, float:1.8509263E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r5, r0)
            r2.A08 = r0
            r0 = 6
            X.0nA.A04(r6, r0)
            int r0 = X.C51972G9s.A08(r6)
            float r9 = (float) r0
            r8 = 1056964608(0x3f000000, float:0.5)
            r11 = 1053609165(0x3ecccccd, float:0.4)
            r18 = 1
            r15 = 300(0x12c, double:1.48E-321)
            r7 = 1045220557(0x3e4ccccd, float:0.2)
            X.JdE r5 = new X.JdE
            r10 = r7
            r13 = r12
            r14 = r12
            r17 = r12
            r19 = r12
            r20 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20)
            r2.A09 = r5
            r1.setImageDrawable(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60710Jpv.<init>(android.view.View):void");
    }

    public final AnonymousClass5BD A00() {
        AnonymousClass5BD r1 = this.A01;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass5BD r12 = new AnonymousClass5BD(this.A05.inflate());
        this.A01 = r12;
        return r12;
    }

    /* renamed from: AeG */
    public final RectF AhX() {
        View AeY;
        AnonymousClass3BT r0 = this.A00;
        if (r0 == null || !r0.A03()) {
            AeY = AeY();
        } else {
            AeY = A00().A02;
        }
        return 0nA.A0F(AeY);
    }

    public final View AeH() {
        return this.A0C.A00();
    }

    public final View AeY() {
        return this.A0D.getHolder().A00();
    }

    public final View B8N() {
        return this.A06;
    }

    public final RectF BG0() {
        return 0nA.A0F(this.A06);
    }

    public final View BkN() {
        return this.itemView;
    }

    public final String Bkc() {
        return this.A0C.A01;
    }

    public final GradientSpinner Bkt() {
        return this.A0D.getHolder().A02();
    }

    public final void CI9(float f) {
        this.A0C.A00().setAlpha(1.0f - f);
        this.A0A.setAlpha(0.0f);
    }

    public final void CLE() {
        View AeY;
        AnonymousClass3BT r0 = this.A00;
        if (r0 == null || !r0.A03()) {
            AeY = AeY();
        } else {
            AeY = A00().A02;
        }
        AeY.setVisibility(4);
    }

    public final void Ei5(AnonymousClass6VJ r2) {
        this.A0C.A00 = r2;
    }

    public final void Eu3(AnonymousClass0iw r3) {
        View AeY;
        AnonymousClass3BT r0 = this.A00;
        if (r0 == null || !r0.A03()) {
            AeY = AeY();
        } else {
            AeY = A00().A02;
        }
        AeY.setVisibility(0);
    }
}
