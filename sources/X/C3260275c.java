package X;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.75c  reason: invalid class name and case insensitive filesystem */
public final class C3260275c extends Filter {
    public final /* synthetic */ AnonymousClass7H0 A00;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void publishResults(java.lang.CharSequence r13, android.widget.Filter.FilterResults r14) {
        /*
            r12 = this;
            r2 = 1
            X.0qQ.A0B(r14, r2)
            X.7H0 r3 = r12.A00
            r3.A06()
            r0 = 0
            r3.A03 = r0
            java.lang.Object r0 = r14.values
            java.util.List r9 = X.0u4.A01(r0)
            if (r9 != 0) goto L_0x0023
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.A04 = r0
            X.7Gq r0 = r3.A0B
            if (r0 == 0) goto L_0x00fb
            r0.A01()
            return
        L_0x0023:
            r3.A04 = r9
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x002d
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0037
        L_0x002d:
            r1 = 16
            X.PmD r0 = new X.PmD
            r0.<init>(r3, r1)
            X.018.A1A(r9, r0)
        L_0x0037:
            r8 = 0
            java.util.Iterator r1 = r9.iterator()
        L_0x003c:
            boolean r0 = r1.hasNext()
            r7 = 0
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r6 = r1.next()
            boolean r0 = r6 instanceof X.C3260875i
            if (r0 == 0) goto L_0x003c
        L_0x004b:
            X.75i r6 = (X.C3260875i) r6
            boolean r0 = r9 instanceof java.util.Collection
            if (r0 == 0) goto L_0x009a
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x009a
            r5 = 0
        L_0x0058:
            X.N2a r0 = new X.N2a
            if (r6 == 0) goto L_0x0096
            r0.<init>(r6, r7, r5)
        L_0x005f:
            r3.A03 = r0
            X.7Gq r2 = r3.A0B
            if (r2 == 0) goto L_0x00e0
            com.instagram.common.session.UserSession r5 = r3.A0A
            X.0qQ.A0B(r5, r8)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36315795324472875(0x810506000d0e2b, double:3.029593422942468E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00e0
            X.OMu r4 = r2.A01
            if (r4 != 0) goto L_0x008e
            android.view.View r5 = r2.A05
            android.view.View r6 = r2.A04
            androidx.recyclerview.widget.RecyclerView r7 = r2.A06
            java.lang.Integer r11 = r2.A03
            X.7L0 r9 = r2.A00
            X.75e r10 = r2.A02
            X.0iw r8 = r2.A07
            X.OMu r4 = new X.OMu
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
        L_0x008e:
            r2.A01 = r4
            java.util.List r0 = r3.A04
            r4.A01(r0)
            return
        L_0x0096:
            r0.<init>(r7, r7, r8)
            goto L_0x005f
        L_0x009a:
            java.util.Iterator r1 = r9.iterator()
            r5 = 0
        L_0x009f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C3260875i
            if (r0 == 0) goto L_0x009f
            int r5 = r5 + 1
            if (r5 >= 0) goto L_0x009f
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b9:
            if (r5 <= r2) goto L_0x0058
            java.util.Iterator r4 = r9.iterator()
        L_0x00bf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r2 = r4.next()
            boolean r0 = r2 instanceof X.C3260875i
            if (r0 == 0) goto L_0x00bf
            X.75i r2 = (X.C3260875i) r2
            X.7OR r1 = r2.A02()
            X.7OR r0 = X.AnonymousClass7OR.MENTION
            if (r1 != r0) goto L_0x00bf
            X.N2a r0 = new X.N2a
            r0.<init>(r7, r2, r5)
            goto L_0x005f
        L_0x00dd:
            r6 = r7
            goto L_0x004b
        L_0x00e0:
            java.util.Iterator r2 = r9.iterator()
        L_0x00e4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass77I
            if (r0 == 0) goto L_0x00f8
            X.7H2 r0 = r3.A0D
        L_0x00f4:
            r3.A08(r0, r1)
            goto L_0x00e4
        L_0x00f8:
            X.7H3 r0 = r3.A0C
            goto L_0x00f4
        L_0x00fb:
            r3.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3260275c.publishResults(java.lang.CharSequence, android.widget.Filter$FilterResults):void");
    }

    public C3260275c(AnonymousClass7H0 r1) {
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.direct.share.ui.mediacomposer.core.MessagePartial, java.lang.Object, android.text.style.ForegroundColorSpan] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence convertResultToString(java.lang.Object r17) {
        /*
            r16 = this;
            r11 = r17
            r4 = 0
            X.0qQ.A0B(r11, r4)
            boolean r0 = r11 instanceof X.AnonymousClass77I
            r2 = r16
            if (r0 == 0) goto L_0x0088
            X.77I r11 = (X.AnonymousClass77I) r11
            X.7H0 r0 = r2.A00
            int r5 = r0.A00
            X.0qQ.A0B(r11, r4)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            int r15 = r11.A00
            r10 = 1
            if (r15 != 0) goto L_0x0060
            java.lang.String r0 = r11.A0C
            java.lang.String[] r0 = new java.lang.String[]{r0}
        L_0x0025:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r9 = r0.length
            r8 = 0
        L_0x002c:
            r6 = 33
            if (r8 >= r9) goto L_0x00e9
            if (r8 != 0) goto L_0x005d
            r2 = 64
            r1 = r0[r8]
            java.lang.String r1 = X.002.A0D(r1, r2)
        L_0x003a:
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>(r1)
            int r1 = r9 - r10
            if (r8 == r1) goto L_0x0048
            r1 = 32
            r7.append(r1)
        L_0x0048:
            com.instagram.direct.share.ui.mediacomposer.core.MessagePartial r2 = new com.instagram.direct.share.ui.mediacomposer.core.MessagePartial
            r2.<init>(r5)
            int r1 = r7.length()
            r7.setSpan(r2, r4, r1, r6)
            r14.add(r2)
            r3.append(r7)
            int r8 = r8 + 1
            goto L_0x002c
        L_0x005d:
            r1 = r0[r8]
            goto L_0x003a
        L_0x0060:
            java.lang.String r0 = r11.A09
            X.11S r1 = X.LQG.A00
            java.util.List r2 = r1.A03(r0)
            java.lang.String r0 = r11.A0A
            if (r0 == 0) goto L_0x0086
            java.util.List r0 = r1.A03(r0)
        L_0x0070:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r2)
            if (r0 == 0) goto L_0x007d
            r1.addAll(r0)
        L_0x007d:
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            goto L_0x0025
        L_0x0086:
            r0 = 0
            goto L_0x0070
        L_0x0088:
            boolean r0 = r11 instanceof X.C3260875i
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x00f9
            X.75i r11 = (X.C3260875i) r11
            boolean r0 = r11 instanceof X.C3260775h
            if (r0 == 0) goto L_0x00d0
            r0 = r11
            X.75h r0 = (X.C3260775h) r0
            java.lang.String r7 = r0.A05
        L_0x0099:
            X.7H0 r0 = r2.A00
            int r1 = r0.A00
            X.0qQ.A0B(r11, r4)
            r0 = 1
            X.0qQ.A0B(r7, r0)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>(r7)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            com.instagram.direct.share.ui.mediacomposer.core.MessagePartial r5 = new com.instagram.direct.share.ui.mediacomposer.core.MessagePartial
            r5.<init>(r1)
            com.instagram.direct.share.ui.mediacomposer.core.MessagePartial[] r0 = new com.instagram.direct.share.ui.mediacomposer.core.MessagePartial[]{r5}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            X.OCB r2 = new X.OCB
            r2.<init>(r11, r0)
            int r1 = r7.length()
            r0 = 33
            r6.setSpan(r5, r4, r1, r0)
            r3.append(r6)
            r3.setSpan(r2, r4, r1, r0)
            goto L_0x00f9
        L_0x00d0:
            boolean r0 = r11 instanceof X.C3260975j
            if (r0 == 0) goto L_0x00e0
            r1 = r11
            X.75j r1 = (X.C3260975j) r1
            java.lang.Integer r0 = r1.A04
            if (r0 == 0) goto L_0x00e0
            java.lang.String r7 = r1.A07()
            goto L_0x0099
        L_0x00e0:
            boolean r0 = r11 instanceof X.C68976Nc5
            if (r0 == 0) goto L_0x00f9
            X.Nc5 r11 = (X.C68976Nc5) r11
            java.lang.String r3 = r11.A00
            goto L_0x00f9
        L_0x00e9:
            java.lang.String r12 = r11.A07
            java.lang.String r13 = r11.A06
            X.L8A r10 = new X.L8A
            r10.<init>(r11, r12, r13, r14, r15)
            int r0 = r3.length()
            r3.setSpan(r10, r4, r0, r6)
        L_0x00f9:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3260275c.convertResultToString(java.lang.Object):java.lang.CharSequence");
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (!0mp.A0B(charSequence)) {
            AnonymousClass7H4 r1 = this.A00.A0E;
            String valueOf = String.valueOf(charSequence);
            0qQ.A0B(valueOf, 0);
            ArrayList arrayList = new ArrayList();
            Iterator it = r1.A00.iterator();
            0qQ.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                0qQ.A07(next);
                ArrayList arrayList2 = (ArrayList) ((AnonymousClass78N) next).filter(valueOf);
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
            }
            filterResults.count = arrayList.size();
            filterResults.values = arrayList;
        }
        return filterResults;
    }
}
