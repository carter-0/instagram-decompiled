package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.7E0  reason: invalid class name */
public final class AnonymousClass7E0 extends C232232tF {
    public final AnonymousClass0iw A00;
    public final AnonymousClass7D5 A01;
    public final C332807Wl A02;
    public final AnonymousClass9HC A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater, 1);
        boolean booleanValue = ((Boolean) this.A03.A1O.getValue()).booleanValue();
        int i = R.layout.message_single_reaction_pill;
        if (booleanValue) {
            i = R.layout.message_single_reaction_pill_with_countertextview;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C66869Me5(layoutInflater2, inflate, this.A00, this.A01, this.A02, booleanValue);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (r3 != r2) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r23, X.C249703kE r24) {
        /*
            r22 = this;
            r6 = r24
            r7 = r23
            X.7E5 r7 = (X.AnonymousClass7E5) r7
            X.Me5 r6 = (X.C66869Me5) r6
            r0 = 0
            X.0qQ.A0B(r7, r0)
            r5 = 1
            X.0qQ.A0B(r6, r5)
            X.46u r0 = r7.A06
            r6.A00 = r0
            X.0iw r14 = r6.A08
            X.7E5 r0 = r6.A01
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 != 0) goto L_0x00fa
            X.7E5 r1 = r6.A01
            r4 = 1
            r0 = 0
            if (r1 == 0) goto L_0x002b
            boolean r3 = r7.A0E
            boolean r2 = r1.A0E
            r1 = 1
            if (r3 == r2) goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            r21 = r1 ^ 1
            boolean r1 = r7.A00
            if (r1 == 0) goto L_0x0162
            X.9HC r1 = r7.A05
            if (r1 == 0) goto L_0x0162
            X.0eM r1 = r1.A0r
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0162
        L_0x0044:
            boolean r3 = r7.A0E
            r2 = 0
            if (r3 == 0) goto L_0x015f
            java.lang.String r9 = r7.A0B
        L_0x004b:
            com.instagram.common.session.UserSession r8 = r7.A03
            android.widget.LinearLayout r12 = r6.A04
            android.widget.LinearLayout r13 = r6.A05
            android.view.LayoutInflater r11 = r6.A02
            java.lang.String r1 = r7.A0B
            java.util.List r18 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r18)
            com.instagram.common.typedurl.ImageUrl r1 = r7.A04
            r20 = r4
            r17 = r9
            r19 = r5
            r15 = r8
            r16 = r1
            X.AnonymousClass7CZ.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            android.widget.LinearLayout r1 = r6.A06
            X.0sn r15 = X.0sn.A00
            r13 = r1
            r16 = r4
            X.AnonymousClass7CZ.A03(r11, r12, r13, r14, r15, r16)
            boolean r11 = r6.A0D
            if (r11 == 0) goto L_0x0147
            com.instagram.direct.ui.countertextview.CounterTextView r10 = r6.A0C
            java.lang.String r9 = r7.A0A
            int r8 = r7.A01
            X.0qQ.A0B(r9, r5)
            int r0 = r9.length()
            r1 = 0
            if (r0 <= 0) goto L_0x0141
            if (r10 == 0) goto L_0x009e
            int r0 = r10.getVisibility()
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = r10.A02
            boolean r0 = X.00p.A0h(r9, r0)
            if (r0 != 0) goto L_0x009e
        L_0x0098:
            r10.A06(r8, r9, r4)
        L_0x009b:
            r10.setVisibility(r1)
        L_0x009e:
            java.lang.String r4 = "Required value was null."
            if (r11 == 0) goto L_0x0131
            com.instagram.direct.ui.countertextview.CounterTextView r1 = r6.A0C
            if (r1 == 0) goto L_0x016b
            X.7Kx r8 = r7.A07
            X.0qQ.A0B(r8, r5)
            int r0 = r8.A0C
            r1.setTextColor(r0)
        L_0x00b0:
            X.AnonymousClass7CZ.A04(r12, r8, r3)
            X.7EE r1 = r6.A0A
            android.view.View r0 = r6.A03
            r1.A00 = r0
            X.9HC r0 = r7.A05
            if (r0 == 0) goto L_0x00f8
            X.46u r0 = r6.A00
            if (r0 == 0) goto L_0x00c3
            java.lang.String r2 = r0.A04
        L_0x00c3:
            java.lang.String r0 = "default"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x00f8
            X.46u r10 = r6.A00
            if (r10 == 0) goto L_0x00f8
            X.7Wl r1 = r6.A0B
            r0 = 0
            if (r1 == 0) goto L_0x012f
            X.4kA r9 = r1.AxJ()
        L_0x00d8:
            java.lang.String r8 = r7.A0C
            java.lang.Long r5 = r10.A01
            if (r8 == 0) goto L_0x00f2
            if (r9 == 0) goto L_0x0165
            X.0xa r3 = r9.A00
            java.lang.String r0 = "direct_super_react_last_seen_timestamp_"
            java.lang.String r2 = X.002.A0R(r0, r8)
            r0 = 0
            long r0 = r3.getLong(r2, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x00f2:
            if (r5 != 0) goto L_0x010d
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x011b
        L_0x00f8:
            r6.A01 = r7
        L_0x00fa:
            android.widget.LinearLayout r1 = r6.A04
            X.Mdz r0 = new X.Mdz
            r0.<init>(r7, r6)
            r1.setOnLongClickListener(r0)
            X.Me0 r0 = new X.Me0
            r0.<init>(r7, r6)
            X.AnonymousClass0fU.A00(r0, r1)
            return
        L_0x010d:
            if (r0 == 0) goto L_0x00f8
            long r3 = r0.longValue()
            long r1 = r5.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f8
        L_0x011b:
            android.view.View r1 = r6.itemView
            X.Pc0 r0 = new X.Pc0
            r11 = r0
            r12 = r10
            r13 = r7
            r14 = r6
            r15 = r9
            r16 = r5
            r17 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r1.post(r0)
            goto L_0x00f8
        L_0x012f:
            r9 = r0
            goto L_0x00d8
        L_0x0131:
            android.widget.TextView r1 = r6.A07
            if (r1 == 0) goto L_0x0171
            X.7Kx r8 = r7.A07
            X.0qQ.A0B(r8, r5)
            int r0 = r8.A0C
            r1.setTextColor(r0)
            goto L_0x00b0
        L_0x0141:
            if (r10 == 0) goto L_0x009e
            r1 = 8
            goto L_0x009b
        L_0x0147:
            android.widget.TextView r10 = r6.A07
            java.lang.String r9 = r7.A0A
            int r8 = r7.A01
            X.7E5 r1 = r6.A01
            if (r1 == 0) goto L_0x0153
            int r0 = r1.A01
        L_0x0153:
            if (r8 <= r0) goto L_0x015c
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0157:
            X.AnonymousClass7CZ.A00(r10, r0, r9, r4)
            goto L_0x009e
        L_0x015c:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0157
        L_0x015f:
            r9 = r2
            goto L_0x004b
        L_0x0162:
            r4 = 0
            goto L_0x0044
        L_0x0165:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x016b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0171:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7E0.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return AnonymousClass7E5.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        C66869Me5 me5 = (C66869Me5) r3;
        0qQ.A0B(me5, 0);
        me5.A01 = null;
        me5.A00 = null;
        me5.A0A.A00 = null;
    }

    public AnonymousClass7E0(AnonymousClass0iw r1, AnonymousClass7D5 r2, C332807Wl r3, AnonymousClass9HC r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
