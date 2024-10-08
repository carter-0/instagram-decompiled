package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.MtL  reason: case insensitive filesystem */
public final class C67707MtL extends 0hp {
    public final HashMap A00 = AnonymousClass7TE.A1E();
    public final /* synthetic */ NJY A01;

    public final int getItemPosition(Object obj) {
        0qQ.A0B(obj, 0);
        int count = getCount();
        for (int i = 0; i < count; i++) {
            if (0qQ.A0K(A01(i), obj)) {
                return i;
            }
        }
        HashMap hashMap = this.A00;
        Iterator A0s = AnonymousClass7TF.A0s(hashMap);
        while (true) {
            if (!A0s.hasNext()) {
                break;
            }
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            long A0R = AnonymousClass7TE.A0R(A1J.getKey());
            if (0qQ.A0K(A1J.getValue(), obj)) {
                hashMap.remove(Long.valueOf(A0R));
                break;
            }
        }
        return -2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67707MtL(0hq r2, NJY njy) {
        super(r2, 1);
        this.A01 = njy;
    }

    public final long A00(int i) {
        return (long) ((C69362Nk2) this.A01.A12.get(i)).ordinal();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        if (r11.A11 == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        if (r0 == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f1, code lost:
        if (r1 != 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f4, code lost:
        if (r11 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f7, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0118, code lost:
        r0 = "threadCapabilities";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0142, code lost:
        r0 = "threadId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0144, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a2, code lost:
        X.AnonymousClass0Dg.A00(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a5, code lost:
        r5.setArguments(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a8, code lost:
        r3.put(java.lang.Long.valueOf(A00(r13)), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b3, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment A01(int r13) {
        /*
            r12 = this;
            X.NJY r7 = r12.A01
            java.util.ArrayList r2 = r7.A12
            int r0 = r2.size()
            if (r13 >= r0) goto L_0x01b6
            java.util.HashMap r3 = r12.A00
            long r0 = r12.A00(r13)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L_0x002c
            long r0 = r12.A00(r13)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r3.get(r0)
            X.0qQ.A0A(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            return r0
        L_0x002c:
            java.lang.Object r0 = r2.get(r13)
            X.Nk2 r0 = (X.C69362Nk2) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x011b;
                case 1: goto L_0x003e;
                case 2: goto L_0x005e;
                case 3: goto L_0x0166;
                case 4: goto L_0x015c;
                case 5: goto L_0x0161;
                case 6: goto L_0x014c;
                default: goto L_0x0039;
            }
        L_0x0039:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x003e:
            X.0eM r0 = r7.A14
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.direct.capabilities.Capabilities r2 = r7.A03
            if (r2 == 0) goto L_0x0118
            X.3t3 r1 = r7.A0c
            if (r1 == 0) goto L_0x0142
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.NJU r5 = new X.NJU
            r5.<init>()
            android.os.Bundle r6 = X.DbV.A0A(r4)
            X.OXL.A01(r6, r2, r1)
            goto L_0x01a5
        L_0x005e:
            X.NJt r5 = new X.NJt
            r5.<init>()
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            X.N4P r11 = r7.A0Z
            com.instagram.direct.capabilities.Capabilities r2 = r7.A03
            if (r2 == 0) goto L_0x0118
            r7.A0N()
            r8 = 1
            r4 = 1
            if (r11 == 0) goto L_0x00f3
            boolean r0 = r11.A0n
            if (r0 == 0) goto L_0x007d
            boolean r0 = r11.A11
            r1 = 1
            if (r0 != 0) goto L_0x007e
        L_0x007d:
            r1 = 0
        L_0x007e:
            X.4li r0 = r11.A0H
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r0.A08
            if (r0 != r8) goto L_0x00e5
        L_0x0086:
            r1 = 0
        L_0x0087:
            boolean r10 = r11.A0B()
            boolean r9 = X.N4P.A05(r11)
            X.0eM r0 = r11.A0c
            java.util.List r0 = X.JTO.A15(r0)
            boolean r0 = X.C66640Ma9.A05(r0, r9)
            if (r10 != 0) goto L_0x009d
            if (r0 == 0) goto L_0x00f7
        L_0x009d:
            X.9Gx r0 = X.C376179Gx.MESSAGE_REPLY
            boolean r0 = r2.A00(r0)
            com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl r2 = new com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl
            r2.<init>(r1, r4, r0)
            X.0eM r0 = r7.A14
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.AnonymousClass0Dg.A00(r6, r0)
            X.3t3 r0 = r7.A0c
            if (r0 == 0) goto L_0x0142
            X.3sy r1 = X.C300965yF.A05(r0)
            java.lang.String r0 = "DirectThreadSharedMediaFragment.DIRECT_THREAD_KEY"
            X.C67002Mga.A01(r6, r1, r0)
            java.lang.String r0 = "DirectThreadSharedMediaFragment.DIRECT_MEDIA_REPLY_ELIGIBILITY_CHECKER"
            r6.putParcelable(r0, r2)
            X.N4P r9 = r7.A0Z
            if (r9 == 0) goto L_0x0109
            java.lang.String r4 = r9.A0P
            if (r4 != 0) goto L_0x00cd
            java.lang.String r4 = ""
        L_0x00cd:
            X.0eM r0 = r9.A0c
            java.util.List r0 = X.JTO.A15(r0)
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00db:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f9
            X.C68303N9q.A00(r2, r1)
            goto L_0x00db
        L_0x00e5:
            if (r1 != 0) goto L_0x0086
            int r0 = r11.A09
            int r1 = r11.A07
            boolean r0 = X.AnonymousClass7LY.A00(r0)
            if (r0 == 0) goto L_0x00f3
            if (r1 != 0) goto L_0x0086
        L_0x00f3:
            r1 = 1
            if (r11 == 0) goto L_0x00f7
            goto L_0x0087
        L_0x00f7:
            r4 = 0
            goto L_0x009d
        L_0x00f9:
            java.util.ArrayList r2 = X.AnonymousClass48M.A01(r2)
            X.3t3 r0 = r9.A0L
            com.instagram.model.direct.DirectShareTarget r1 = new com.instagram.model.direct.DirectShareTarget
            r1.<init>(r0, r4, r2, r8)
            java.lang.String r0 = "DirectThreadSharedMediaFragment.DIRECT_SHARED_MEDID_SHARED_TARGET"
            r6.putParcelable(r0, r1)
        L_0x0109:
            boolean r1 = X.NJY.A0L(r7)
            r0 = 60
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.putBoolean(r0, r1)
            goto L_0x01a5
        L_0x0118:
            java.lang.String r0 = "threadCapabilities"
            goto L_0x0144
        L_0x011b:
            X.0eM r0 = r7.A14
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.3t3 r0 = r7.A0c
            if (r0 == 0) goto L_0x0142
            java.lang.String r2 = X.C66580MXl.A0x(r0)
            com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel r1 = r7.A10
            X.AnonymousClass7TG.A1T(r4, r2, r1)
            X.NId r5 = new X.NId
            r5.<init>()
            android.os.Bundle r6 = X.C66581MXm.A09(r4)
            java.lang.String r0 = "ThreadDetailsCollectionsFragment_threadId"
            r6.putString(r0, r2)
            java.lang.String r0 = "ThreadDetailsCollectionsFragment_collectionsViewModel"
            r6.putParcelable(r0, r1)
            goto L_0x01a5
        L_0x0142:
            java.lang.String r0 = "threadId"
        L_0x0144:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x014c:
            X.E3b r5 = new X.E3b
            r5.<init>()
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            X.0eM r0 = r7.A14
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            goto L_0x01a2
        L_0x015c:
            X.NKQ r5 = X.NJY.A01(r7)
            goto L_0x01a8
        L_0x0161:
            X.NJm r5 = X.NJY.A02(r7)
            goto L_0x01a8
        L_0x0166:
            X.0eM r0 = r7.A14
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.OF3 r0 = r7.A0S
            r1 = 0
            if (r0 == 0) goto L_0x01b4
            com.google.common.collect.ImmutableList r2 = r0.A00
            X.N4P r0 = r0.A01
            if (r0 == 0) goto L_0x018f
            X.0eM r0 = r0.A0c
            java.util.List r0 = X.JTO.A15(r0)
            if (r0 == 0) goto L_0x018f
            java.lang.Object r0 = X.00k.A0J(r0)
            X.N9q r0 = (X.C68303N9q) r0
            if (r0 == 0) goto L_0x018f
            com.instagram.user.model.User r0 = r0.A00
            if (r0 == 0) goto L_0x018f
            java.lang.String r1 = r0.getId()
        L_0x018f:
            android.os.Bundle r6 = X.DbY.A0A(r4)
            X.UZL r5 = new X.UZL
            r5.<init>()
            java.lang.String r0 = "order_list"
            r6.putSerializable(r0, r2)
            java.lang.String r0 = "consumer_id"
            r6.putString(r0, r1)
        L_0x01a2:
            X.AnonymousClass0Dg.A00(r6, r4)
        L_0x01a5:
            r5.setArguments(r6)
        L_0x01a8:
            long r0 = r12.A00(r13)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r0, r5)
            return r5
        L_0x01b4:
            r2 = r1
            goto L_0x018f
        L_0x01b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67707MtL.A01(int):androidx.fragment.app.Fragment");
    }

    public final int getCount() {
        return this.A01.A12.size();
    }
}
