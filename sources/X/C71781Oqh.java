package X;

import android.content.IntentFilter;
import java.util.ArrayList;

/* renamed from: X.Oqh  reason: case insensitive filesystem */
public final class C71781Oqh implements C59900bo {
    public final /* synthetic */ long A00;
    public final /* synthetic */ OLX A01;

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dbc(android.content.Context r11, android.content.Intent r12, X.C59880bj r13) {
        /*
            r10 = this;
            r8 = 1
            X.0qQ.A0B(r12, r8)
            java.lang.String r0 = "state"
            java.lang.String r1 = r12.getStringExtra(r0)
            java.lang.String r0 = android.telephony.TelephonyManager.EXTRA_STATE_RINGING
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005c
            java.lang.String r1 = "incoming_number"
            boolean r0 = r12.hasExtra(r1)
            if (r0 == 0) goto L_0x005c
            java.lang.String r4 = r12.getStringExtra(r1)
            X.OLX r7 = r10.A01
            long r2 = r10.A00
            java.lang.String r6 = "source"
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x005c
            r5 = 0
            if (r4 != 0) goto L_0x005d
            java.lang.String r9 = "null_number"
        L_0x002d:
            r0 = 0
        L_0x002e:
            X.Npj r8 = r7.A03
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "filter_cli_pass"
            X.0eP r7 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "INCOMING_CALL"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r6, r0)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "start_flashcall_listening_timestamp"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "failure_reason"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r9, r7, r4, r1)
            java.util.LinkedHashMap r1 = X.0Yt.A06(r0)
            X.0qQ.A0B(r1, r5)
            java.lang.String r0 = "client_intercepted_flashcall"
            r8.A00(r0, r1)
        L_0x005c:
            return
        L_0x005d:
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0066
            java.lang.String r9 = "empty_number"
            goto L_0x002d
        L_0x0066:
            java.lang.String r0 = "\\D"
            X.11S r1 = new X.11S
            r1.<init>(r0)
            java.lang.String r0 = ""
            java.lang.String r4 = r1.A00(r4, r0)
            java.util.List r1 = r7.A05
            if (r1 == 0) goto L_0x00a0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00a0
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x008a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x008a
        L_0x0087:
            java.lang.String r9 = "filter_mismatch"
            goto L_0x002d
        L_0x008a:
            java.util.Iterator r1 = r1.iterator()
        L_0x008e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r1.next()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            boolean r0 = X.DbV.A1b(r4, r0)
            if (r0 == 0) goto L_0x008e
        L_0x00a0:
            r7.A01 = r8
            X.ODL r9 = r7.A04
            android.content.Context r1 = r9.A00
            r0 = 4454(0x1166, float:6.241E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = X.02K.A00(r1, r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = "telecom"
            java.lang.Object r1 = r1.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.telecom.TelecomManager"
            X.0qQ.A0C(r1, r0)
            android.telecom.TelecomManager r1 = (android.telecom.TelecomManager) r1
            r1.endCall()
            X.Npj r8 = r9.A01
            java.lang.String r1 = "client_end_flashcall"
            r0 = 0
            r8.A00(r1, r0)
        L_0x00ca:
            X.OBD r8 = r9.A02
            X.6Tl r0 = new X.6Tl
            r0.<init>()
            r0.A03(r4, r5)
            X.6Tm r4 = r0.A00()
            X.4uI r1 = r8.A01
            X.6Rx r0 = r8.A00
            X.C299275ur.A00(r0, r4, r1)
            r7.A00()
            java.lang.String r9 = "null"
            r0 = 1
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71781Oqh.Dbc(android.content.Context, android.content.Intent, X.0bj):void");
    }

    public C71781Oqh(OLX olx, long j) {
        this.A01 = olx;
        this.A00 = j;
    }

    public final ArrayList BIF() {
        return AnonymousClass7TE.A1D(AnonymousClass7TE.A1I(new IntentFilter("android.intent.action.PHONE_STATE")));
    }
}
