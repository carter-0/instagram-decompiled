package X;

import android.content.pm.PackageManager;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;

/* renamed from: X.Ru3  reason: case insensitive filesystem */
public final class C10549Ru3 {
    public final PackageManager A00;
    public final ImmutableSet A01;
    public final ImmutableSetMultimap A02;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r1.A01.isPartialView() == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10549Ru3(android.content.pm.PackageManager r3, X.AnonymousClass42M r4, java.util.Set r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.A00 = r3
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.A03(r5)
            r2.A01 = r0
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0016
            com.google.common.collect.EmptyImmutableSetMultimap r1 = com.google.common.collect.EmptyImmutableSetMultimap.A00
        L_0x0013:
            r2.A02 = r1
            return
        L_0x0016:
            boolean r0 = r4 instanceof com.google.common.collect.ImmutableSetMultimap
            if (r0 == 0) goto L_0x0026
            r1 = r4
            com.google.common.collect.ImmutableSetMultimap r1 = (com.google.common.collect.ImmutableSetMultimap) r1
            com.google.common.collect.ImmutableMap r0 = r1.A01
            boolean r0 = r0.isPartialView()
            if (r0 != 0) goto L_0x0026
            goto L_0x0013
        L_0x0026:
            java.util.Map r0 = r4.ACX()
            java.util.Set r0 = r0.entrySet()
            com.google.common.collect.ImmutableSetMultimap r1 = com.google.common.collect.ImmutableSetMultimap.A00(r0)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10549Ru3.<init>(android.content.pm.PackageManager, X.42M, java.util.Set):void");
    }
}
