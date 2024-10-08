package X;

/* renamed from: X.Krd  reason: case insensitive filesystem */
public abstract class C63110Krd {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.KkX} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.K8H A00(X.MTR r5, com.instagram.common.session.UserSession r6, java.util.Map r7) {
        /*
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            X.KhK r1 = X.C62528KhK.SHARE_TO_STORY_BUTTON
            boolean r0 = r7.containsKey(r1)
            r4 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.String r2 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            boolean r0 = r1 instanceof android.os.Parcelable
            if (r0 == 0) goto L_0x0085
            android.os.Parcelable r1 = (android.os.Parcelable) r1
        L_0x001b:
            r3.putParcelable(r2, r1)
        L_0x001e:
            X.KhK r0 = X.C62528KhK.UPPER_RIGHT_CREATE_AUDIENCE_LIST_BUTTON
            X.JTU.A0l(r3, r0, r7)
            X.KhK r0 = X.C62528KhK.BACK_BUTTON_ENABLED
            X.JTU.A0l(r3, r0, r7)
            X.KhK r0 = X.C62528KhK.CAN_SELECT_AUDIENCE_LISTS
            X.JTU.A0l(r3, r0, r7)
            X.KhK r1 = X.C62528KhK.FILTER_AUDIENCE_LISTS
            boolean r0 = r7.containsKey(r1)
            if (r0 == 0) goto L_0x004c
            java.lang.String r2 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x0083
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0083
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r1)
        L_0x0049:
            r3.putStringArrayList(r2, r0)
        L_0x004c:
            X.KhK r0 = X.C62528KhK.SET_TITLE_SHARED_TO
            X.JTU.A0l(r3, r0, r7)
            X.KhK r0 = X.C62528KhK.DELETE_OPTION_ENABLED
            X.JTU.A0l(r3, r0, r7)
            X.KhK r1 = X.C62528KhK.LOGGING_ENTRY_POINT
            boolean r0 = r7.containsKey(r1)
            if (r0 == 0) goto L_0x0070
            java.lang.String r2 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            boolean r0 = r1 instanceof X.C62671KkX
            if (r0 == 0) goto L_0x006d
            r4 = r1
            X.KkX r4 = (X.C62671KkX) r4
        L_0x006d:
            r3.putSerializable(r2, r4)
        L_0x0070:
            X.KhK r0 = X.C62528KhK.IS_FROM_SHARE_SHEET
            X.JTU.A0l(r3, r0, r7)
            X.C227642jf.A04(r3, r6)
            X.K8H r0 = new X.K8H
            r0.<init>()
            r0.setArguments(r3)
            r0.A01 = r5
            return r0
        L_0x0083:
            r0 = r4
            goto L_0x0049
        L_0x0085:
            r1 = r4
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63110Krd.A00(X.MTR, com.instagram.common.session.UserSession, java.util.Map):X.K8H");
    }
}
