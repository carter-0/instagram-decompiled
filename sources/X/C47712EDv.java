package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* renamed from: X.EDv  reason: case insensitive filesystem */
public final class C47712EDv extends C14097Tpp {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r16, X.C307786Rm r17, X.C276544tV r18, java.lang.Object r19) {
        /*
            r15 = this;
            r14 = r16
            com.instagram.ui.widget.edittext.ConfirmationCodeEditText r14 = (com.instagram.ui.widget.edittext.ConfirmationCodeEditText) r14
            r11 = r17
            r12 = r18
            java.lang.Object r2 = X.C307476Qg.A06(r11, r12)
            X.EtH r2 = (X.EtH) r2
            if (r2 == 0) goto L_0x0099
            java.lang.String r0 = r12.A0I()
            r8 = 0
            if (r0 == 0) goto L_0x0027
            float r0 = X.AnonymousClass6Su.A01(r0)     // Catch:{ 3yO -> 0x0021 }
            int r0 = (int) r0     // Catch:{ 3yO -> 0x0021 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ 3yO -> 0x0021 }
            goto L_0x0028
        L_0x0021:
            r1 = move-exception
            java.lang.String r0 = "ConfirmationCodeTextInputNode"
            X.1Kn.A03(r0, r1)
        L_0x0027:
            r7 = r8
        L_0x0028:
            r0 = 35
            r6 = 1
            int r4 = r12.A03(r0, r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1 = 36
            boolean r0 = r12.A0R(r1, r6)
            r3 = 0
            r14.A05(r7, r5, r0, r3)
            boolean r0 = r12.A0R(r1, r6)
            r14.A04(r4, r0)
            r1 = 33
            r0 = -1
            int r0 = r12.A03(r1, r0)
            r14.setId(r0)
            r0 = 38
            X.4uI r1 = r12.A0A(r0)
            r10 = r15
            if (r1 == 0) goto L_0x0061
            X.ET0 r0 = new X.ET0
            r0.<init>(r15, r11, r12, r1)
            r2.A00 = r0
            r14.addTextChangedListener(r0)
        L_0x0061:
            r0 = 40
            X.4uI r13 = r12.A0A(r0)
            X.FQd r9 = new X.FQd
            r9.<init>(r10, r11, r12, r13, r14)
            r14.setOnEditorActionListener(r9)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            r0 = 202(0xca, float:2.83E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.addAction(r0)
            X.FSt r0 = new X.FSt
            r0.<init>(r2, r15, r14, r4)
            X.0bo[] r0 = new X.C59900bo[]{r0}
            X.0QV r1 = new X.0QV
            r1.<init>(r0)
            android.content.BroadcastReceiver r0 = r14.A05
            if (r0 != 0) goto L_0x0098
            r14.A05 = r1
            android.content.Context r0 = r14.getContext()
            X.0DH.A03(r1, r0, r2, r3)
        L_0x0098:
            return r8
        L_0x0099:
            r0 = 27
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47712EDv.A0K(android.view.View, X.6Rm, X.4tV, java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r5, C276544tV r6, Object obj, Object obj2) {
        ConfirmationCodeEditText confirmationCodeEditText = (ConfirmationCodeEditText) view;
        EtH etH = (EtH) C307476Qg.A06(r5, r6);
        if (etH != null) {
            TextWatcher textWatcher = etH.A00;
            if (textWatcher != null) {
                confirmationCodeEditText.removeTextChangedListener(textWatcher);
                etH.A00 = null;
            }
            DbS.A1C(confirmationCodeEditText);
            confirmationCodeEditText.setOnEditorActionListener((TextView.OnEditorActionListener) null);
            BroadcastReceiver broadcastReceiver = confirmationCodeEditText.A05;
            if (broadcastReceiver != null) {
                confirmationCodeEditText.getContext().unregisterReceiver(broadcastReceiver);
                confirmationCodeEditText.A05 = null;
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A15(Pxd.A00(27));
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        ConfirmationCodeEditText confirmationCodeEditText = new ConfirmationCodeEditText(context);
        confirmationCodeEditText.setOnLongClickListener(new FPV(3, confirmationCodeEditText, confirmationCodeEditText));
        return confirmationCodeEditText;
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C47712EDv(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }
}
