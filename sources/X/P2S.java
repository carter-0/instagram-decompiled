package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class P2S implements C74394PuA {
    public final Context A00;
    public final View.OnClickListener A01;
    public final UserSession A02;
    public final N4P A03;

    public P2S(Context context, View.OnClickListener onClickListener, UserSession userSession, N4P n4p) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = n4p;
        this.A01 = onClickListener;
    }

    public final List getItems() {
        Context context = this.A00;
        C46448DfA dfA = new C46448DfA((CharSequence) context.getString(2131959338));
        String A16 = AnonymousClass7TE.A16(context, 2131959339);
        return 0sr.A1P(new Object[]{dfA, new OIM(this.A01, (View.OnClickListener) null, (View.OnClickListener) null, (C358618bC) null, C69349Njo.TYPE_CHEVRON, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, A16, (String) null, (String) null, true, true), new FGF((CharSequence) context.getString(2131959336)), new C70944OSr(true)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r7 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r0 = r7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r0.intValue() != 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (X.AnonymousClass9HV.A00(r4).A00(r1.A0L, 40) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r9 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r7.A0H != true) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r8 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        if (r5 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        r0 = r7.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (r0.isEmpty() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        r0 = r7.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        if (r0 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        if (r0.isEmpty() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        if (r6 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0063, code lost:
        if (X.AnonymousClass7K4.A03(r4, false) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0070, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36323144012868510L) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0072, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r0.isEmpty() != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isEnabled() {
        /*
            r10 = this;
            X.N4P r1 = r10.A03
            X.3Te r7 = r1.A0E
            r0 = 0
            if (r7 == 0) goto L_0x0009
            java.lang.String r0 = r7.A07
        L_0x0009:
            com.instagram.common.session.UserSession r4 = r10.A02
            boolean r9 = X.C51966G9m.A1W(r4, r0)
            r3 = 0
            if (r7 == 0) goto L_0x0074
            boolean r6 = r7.A0M
            java.util.List r0 = r7.A0G
            if (r0 == 0) goto L_0x001f
            boolean r0 = r0.isEmpty()
            r8 = 0
            if (r0 == 0) goto L_0x0022
        L_0x001f:
            r8 = 1
            if (r7 == 0) goto L_0x002d
        L_0x0022:
            java.lang.Integer r0 = r7.A06
            if (r0 == 0) goto L_0x002d
            int r0 = r0.intValue()
            r5 = 0
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r5 = 1
        L_0x002e:
            X.9HW r2 = X.AnonymousClass9HV.A00(r4)
            X.3t3 r1 = r1.A0L
            r0 = 40
            boolean r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L_0x0073
            if (r9 == 0) goto L_0x0073
            r1 = 1
            if (r7 == 0) goto L_0x0073
            boolean r0 = r7.A0H
            if (r0 != r1) goto L_0x0073
            if (r8 == 0) goto L_0x0073
            if (r5 == 0) goto L_0x0073
            java.util.List r0 = r7.A0D
            if (r0 == 0) goto L_0x0053
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0073
        L_0x0053:
            java.util.List r0 = r7.A0E
            if (r0 == 0) goto L_0x005d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0073
        L_0x005d:
            if (r6 == 0) goto L_0x0073
            boolean r0 = X.AnonymousClass7K4.A03(r4, r3)
            if (r0 == 0) goto L_0x0073
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323144012868510(0x810bb500032b9e, double:3.0342407630746603E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0073
            r3 = 1
        L_0x0073:
            return r3
        L_0x0074:
            r6 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P2S.isEnabled():boolean");
    }
}
