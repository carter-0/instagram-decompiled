package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.K9k  reason: case insensitive filesystem */
public final class C61479K9k extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final K6S A02;
    public final boolean A03;

    public final int getViewTypeCount() {
        return 1;
    }

    public C61479K9k(Context context, AnonymousClass0iw r2, K6S k6s, boolean z) {
        this.A00 = context;
        this.A03 = z;
        this.A01 = r2;
        this.A02 = k6s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
        if (r7 != false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r11, android.view.View r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            r10 = this;
            r0 = 1515127135(0x5a4f015f, float:1.45667069E16)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.AnonymousClass7TG.A1O(r12, r13)
            java.lang.Object r0 = r12.getTag()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r6 = r12.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.settings.common.audiencepicker.AudiencePickerViewBinder.Holder"
            X.0qQ.A0C(r6, r0)
            X.L9H r6 = (X.L9H) r6
            X.Jva r13 = (X.C61036Jva) r13
            boolean r5 = r10.A03
            X.0iw r7 = r10.A01
            X.K6S r4 = r10.A02
            r8 = 0
            X.0qQ.A0B(r6, r8)
            r0 = 1
            X.AnonymousClass7TG.A0w(r0, r13, r7, r4)
            com.instagram.user.model.User r3 = r13.A02
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r9 = r6.A04
            com.instagram.common.typedurl.ImageUrl r1 = r3.Bh3()
            r0 = 0
            r9.A0F(r0, r7, r1)
            r7 = 0
            r9.setGradientSpinnerVisible(r8)
            android.widget.TextView r1 = r6.A02
            X.DbU.A1H(r1, r3)
            boolean r0 = r3.isVerified()
            X.C244273av.A0B(r1, r0)
            java.lang.String r1 = r3.B8Q()
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x009d
            android.widget.TextView r0 = r6.A01
            r0.setText(r1)
            r0.setVisibility(r8)
        L_0x0059:
            X.3oV r0 = r6.A03
            android.view.View r1 = r0.getView()
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r13.A01
            r1.setChecked(r0)
            android.view.View r1 = r6.A00
            r0 = 34
            X.LYA.A01(r1, r4, r13, r6, r0)
            if (r5 == 0) goto L_0x0084
            boolean r0 = r3.A2R()
            if (r0 != 0) goto L_0x0083
            X.4Cl r0 = r3.A03
            java.lang.Boolean r0 = r0.Ajy()
            if (r0 == 0) goto L_0x0083
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0084
        L_0x0083:
            r7 = 1
        L_0x0084:
            boolean r0 = r13.A00
            if (r0 == 0) goto L_0x008c
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x008e
        L_0x008c:
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x008e:
            r1.setAlpha(r0)
            boolean r0 = r13.A00
            r1.setEnabled(r0)
        L_0x0096:
            r0 = 517553624(0x1ed93dd8, float:2.3001347E-20)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x009d:
            android.widget.TextView r1 = r6.A01
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61479K9k.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(1920752752);
        View A0D = DbT.A0D(LayoutInflater.from(this.A00), viewGroup, R.layout.selectable_user_row, false);
        A0D.setTag(new L9H(A0D));
        AnonymousClass0fD.A0A(-1674123119, A032);
        return A0D;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
