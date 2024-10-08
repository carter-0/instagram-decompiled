package X;

import android.content.Context;
import android.view.ViewStub;
import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.FQx  reason: case insensitive filesystem */
public final class C50140FQx implements AnonymousClass2gO, CompoundButton.OnCheckedChangeListener {
    public final Context A00;
    public final AnonymousClass07i A01;
    public final AnonymousClass0iw A02;
    public final Reel A03;
    public final VTY A04;
    public final C63951LEt A05;

    public C50140FQx(Context context, ViewStub viewStub, AnonymousClass07Z r5, AnonymousClass07i r6, AnonymousClass0iw r7, UserSession userSession, Reel reel) {
        AnonymousClass7TF.A1E(userSession, 3, viewStub);
        C63951LEt A0V = C249713kF.A00.A0V(userSession);
        0qQ.A07(A0V);
        VTY vty = new VTY(viewStub);
        this.A00 = context;
        this.A02 = r7;
        this.A01 = r6;
        this.A05 = A0V;
        this.A04 = vty;
        this.A03 = reel;
        DbT.A0H(A0V.A01).A06(r5, this);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.A05.A00(this.A00, this.A01, this.A02, (String) null, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r1 == com.instagram.model.reels.ReelType.A0d) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r6 = X.AnonymousClass7TE.A1a(r9)
            X.VTY r7 = r8.A04
            com.instagram.model.reels.Reel r4 = r8.A03
            r1 = 0
            if (r4 == 0) goto L_0x0066
            com.instagram.model.reels.ReelType r2 = r4.A0P
        L_0x000d:
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0b
            r3 = 0
            if (r2 == r0) goto L_0x001b
            if (r4 == 0) goto L_0x0016
            com.instagram.model.reels.ReelType r1 = r4.A0P
        L_0x0016:
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0d
            r2 = 0
            if (r1 != r0) goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131973728(0x7f135660, float:1.95845E38)
            X.GKO r5 = X.DbS.A0Q(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131973727(0x7f13565f, float:1.9584498E38)
            X.GKO r4 = X.DbS.A0Q(r1, r0)
            X.0qQ.A0B(r7, r3)
            if (r2 == 0) goto L_0x0068
            X.3oV r0 = r7.A00
            r0.setVisibility(r3)
            X.0eM r1 = r7.A01
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            java.lang.Object r3 = r0.getTag()
            boolean r0 = r3 instanceof X.Mz1
            if (r0 == 0) goto L_0x0065
            X.Mz1 r3 = (X.Mz1) r3
            if (r3 == 0) goto L_0x0065
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r0)
            java.lang.CharSequence r0 = X.C66909Mes.A00(r2, r5)
            X.PR9 r1 = new X.PR9
            r1.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r8, (java.lang.CharSequence) r0, (boolean) r6)
            java.lang.CharSequence r0 = X.C66909Mes.A00(r2, r4)
            r1.A0A = r0
            r0 = 0
            X.O31.A00(r0, r3, r0, r1)
        L_0x0065:
            return
        L_0x0066:
            r2 = r1
            goto L_0x000d
        L_0x0068:
            X.3oV r1 = r7.A00
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50140FQx.onChanged(java.lang.Object):void");
    }
}
