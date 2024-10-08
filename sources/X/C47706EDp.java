package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.EDp  reason: case insensitive filesystem */
public final class C47706EDp extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new IgdsBottomButtonLayout(context, (AttributeSet) null, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        if (r7.A0R(36, false) != false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r11, X.C307786Rm r12, X.C276544tV r13, java.lang.Object r14) {
        /*
            r10 = this;
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r11 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r11
            r6 = 0
            X.0qQ.A0B(r11, r6)
            X.AnonymousClass7TG.A1O(r12, r13)
            r5 = 36
            X.4tV r7 = r13.A07(r5)
            r8 = 38
            X.4tV r4 = r13.A07(r8)
            r0 = 35
            java.util.List r0 = r13.A0M(r0)
            X.0qQ.A07(r0)
            X.6TZ r0 = X.AnonymousClass6TV.A01(r12, r13, r0)
            java.lang.CharSequence r0 = r0.A00
            r11.setFooterText(r0)
            r0 = 44
            r9 = 0
            if (r7 == 0) goto L_0x0097
            X.4uI r2 = r7.A0A(r0)
        L_0x0030:
            if (r4 == 0) goto L_0x0095
            X.4uI r3 = r4.A0A(r0)
        L_0x0036:
            if (r7 == 0) goto L_0x0093
            java.lang.String r1 = r7.A0I()
        L_0x003c:
            X.FPH r0 = new X.FPH
            r0.<init>((int) r6, (java.lang.Object) r12, (java.lang.Object) r2, (java.lang.Object) r13)
            r11.setPrimaryAction(r1, r0)
            if (r4 == 0) goto L_0x0091
            java.lang.String r2 = r4.A0I()
        L_0x004a:
            r1 = 1
            X.FPH r0 = new X.FPH
            r0.<init>((int) r1, (java.lang.Object) r12, (java.lang.Object) r3, (java.lang.Object) r13)
            r11.setSecondaryAction(r2, r0)
            r2 = 0
            if (r7 == 0) goto L_0x0064
            boolean r0 = r7.A0R(r8, r6)
            r11.setPrimaryActionIsLoading(r0)
            boolean r1 = r7.A0R(r5, r6)
            r0 = 1
            if (r1 == 0) goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            r11.setPrimaryButtonEnabled(r0)
            if (r4 == 0) goto L_0x0071
            boolean r0 = r4.A0R(r5, r6)
            if (r0 != 0) goto L_0x0071
            r2 = 1
        L_0x0071:
            r11.setSecondaryButtonEnabled(r2)
            java.lang.String r2 = r13.A0E()
            if (r2 == 0) goto L_0x0099
            int r1 = r2.hashCode()
            r0 = 1843117444(0x6ddbbd84, float:8.500791E27)
            if (r1 != r0) goto L_0x0099
            java.lang.String r0 = "on_media"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0099
            X.61w r0 = X.C3021661w.ON_MEDIA
            r11.setButtonType(r0)
            return r9
        L_0x0091:
            r2 = r9
            goto L_0x004a
        L_0x0093:
            r1 = r9
            goto L_0x003c
        L_0x0095:
            r3 = r9
            goto L_0x0036
        L_0x0097:
            r2 = r9
            goto L_0x0030
        L_0x0099:
            X.61w r0 = X.C3021661w.DEFAULT
            r11.setButtonType(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47706EDp.A0K(android.view.View, X.6Rm, X.4tV, java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r4, C276544tV r5, Object obj, Object obj2) {
        C3021461u r3 = (C3021461u) view;
        0qQ.A0B(r3, 0);
        r3.setPrimaryAction((CharSequence) null, (View.OnClickListener) null);
        r3.setSecondaryAction((CharSequence) null, (View.OnClickListener) null);
        r3.setOnClickListener((View.OnClickListener) null);
        r3.setButtonType(C3021661w.DEFAULT);
        r3.setSecondaryButtonEnabled(true);
        r3.setPrimaryButtonEnabled(true);
        r3.setPrimaryActionIsLoading(false);
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C47706EDp(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }
}
