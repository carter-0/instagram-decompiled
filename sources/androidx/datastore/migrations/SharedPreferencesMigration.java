package androidx.datastore.migrations;

import X.00k;
import X.0qQ;
import X.0sK;
import X.0sL;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass5KM;
import X.AnonymousClass5KO;
import X.C377609Mm;
import X.C62320sa;
import android.content.Context;
import java.util.Set;

public final class SharedPreferencesMigration implements AnonymousClass5KO {
    public final Context A00;
    public final String A01;
    public final Set A02;
    public final AnonymousClass0eM A03;
    public final 0sL A04;
    public final 0sK A05;

    public SharedPreferencesMigration(Context context, String str, Set set, 0sL r6, 0sK r7) {
        Set A0j;
        0qQ.A0B(set, 3);
        C377609Mm r0 = new C377609Mm(str, context, 0);
        this.A04 = r6;
        this.A05 = r7;
        this.A00 = context;
        this.A01 = str;
        this.A03 = AnonymousClass0eN.A01(r0);
        if (set == AnonymousClass5KM.A00) {
            A0j = null;
        } else {
            A0j = 00k.A0j(set);
        }
        this.A02 = A0j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r0.isEmpty() == false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Esb(java.lang.Object r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 5
            boolean r0 = X.AnonymousClass9JX.A00(r3, r8)
            if (r0 == 0) goto L_0x0081
            r5 = r8
            X.9JX r5 = (X.AnonymousClass9JX) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0081
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r4 = r5.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0070
            if (r0 != r3) goto L_0x0087
            java.lang.Object r2 = r5.A01
            androidx.datastore.migrations.SharedPreferencesMigration r2 = (androidx.datastore.migrations.SharedPreferencesMigration) r2
            X.0eS.A00(r4)
        L_0x0027:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x0057
            java.util.Set r1 = r2.A02
            X.0eM r0 = r2.A03
            java.lang.Object r2 = r0.getValue()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            if (r1 != 0) goto L_0x004d
            java.util.Map r0 = r2.getAll()
            X.0qQ.A07(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0057
        L_0x0048:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
        L_0x004c:
            return r1
        L_0x004d:
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0059
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0059
        L_0x0057:
            r3 = 0
            goto L_0x0048
        L_0x0059:
            java.util.Iterator r1 = r1.iterator()
        L_0x005d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x005d
            goto L_0x0048
        L_0x0070:
            X.0eS.A00(r4)
            X.0sL r0 = r6.A04
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r4 = r0.invoke(r7, r5)
            if (r4 == r1) goto L_0x004c
            r2 = r6
            goto L_0x0027
        L_0x0081:
            X.9JX r5 = new X.9JX
            r5.<init>(r6, r8, r3)
            goto L_0x0015
        L_0x0087:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration.Esb(java.lang.Object, X.4D7):java.lang.Object");
    }

    public SharedPreferencesMigration(Set set, C62320sa r3, 0sL r4, 0sK r5) {
        Set A0j;
        this.A04 = r4;
        this.A05 = r5;
        this.A00 = null;
        this.A01 = null;
        this.A03 = AnonymousClass0eN.A01(r3);
        if (set == AnonymousClass5KM.A00) {
            A0j = null;
        } else {
            A0j = 00k.A0j(set);
        }
        this.A02 = A0j;
    }
}
