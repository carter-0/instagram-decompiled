package com.instagram.settings2.extension.customstorage.savestorytogallery;

import X.1Au;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C239793Ih;
import X.C41845B3m;
import X.C61076JwE;
import X.MUA;
import com.instagram.common.session.UserSession;

public final class SaveStoryToGalleryCustomStorageHandler implements MUA {
    public final UserSession A00;
    public final NetworkInteractor A01;

    public final class NetworkInteractor {
        public final UserSession A00;

        /* JADX WARNING: type inference failed for: r4v1, types: [X.MEB, X.4D7] */
        /* JADX WARNING: type inference failed for: r4v4 */
        /* JADX WARNING: type inference failed for: r4v5 */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A00(X.AnonymousClass4D7 r7, boolean r8) {
            /*
                r6 = this;
                r3 = 32
                boolean r0 = X.MEB.A03(r3, r7)
                if (r0 == 0) goto L_0x0077
                r4 = r7
                X.MEB r4 = (X.MEB) r4
                int r2 = r4.A00
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L_0x0077
                int r2 = r2 - r1
                r4.A00 = r2
            L_0x0016:
                java.lang.Object r1 = r4.A01
                X.1Hj r5 = X.1Hj.A02
                int r0 = r4.A00
                r3 = 1
                if (r0 == 0) goto L_0x0044
                if (r0 != r3) goto L_0x007c
                X.0eS.A00(r1)
            L_0x0024:
                X.3Ii r1 = (X.C239803Ii) r1
                boolean r0 = r1 instanceof X.C239793Ih
                if (r0 == 0) goto L_0x003b
                X.3Ih r1 = (X.C239793Ih) r1
                java.lang.Object r0 = r1.A00
                X.XPK r0 = (X.XPK) r0
                X.Jtz r0 = r0.FH3()
                boolean r0 = r0.A02
                X.3Ih r1 = X.JTT.A0j(r0)
            L_0x003a:
                return r1
            L_0x003b:
                boolean r0 = r1 instanceof X.C297815sO
                if (r0 != 0) goto L_0x003a
                X.Wub r0 = X.AnonymousClass7TE.A1K()
                throw r0
            L_0x0044:
                X.0eS.A00(r1)
                com.instagram.common.session.UserSession r0 = r6.A00
                X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
                java.lang.String r0 = "settings/set_bool/"
                r2.A0A(r0)
                java.lang.Class<X.XPK> r1 = X.XPK.class
                java.lang.Class<X.Xdh> r0 = X.C21515Xdh.class
                r2.A0Q(r1, r0)
                com.instagram.api.schemas.RemoteBooleanSettingId r0 = com.instagram.api.schemas.RemoteBooleanSettingId.ARCHIVING_SAVE_STORY_TO_CAMERA_GALLERY
                java.lang.String r1 = r0.A00
                java.lang.String r0 = "setting_id"
                r2.A9m(r0, r1)
                java.lang.String r0 = "value"
                r2.A0H(r0, r8)
                X.1OC r1 = r2.A0M()
                r4.A00 = r3
                r0 = 351963398(0x14fa8906, float:2.5297595E-26)
                java.lang.Object r1 = r1.A00(r0, r4)
                if (r1 != r5) goto L_0x0024
                return r5
            L_0x0077:
                X.MEB r4 = X.MEB.A00(r6, r7, r3)
                goto L_0x0016
            L_0x007c:
                java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler.NetworkInteractor.A00(X.4D7, boolean):java.lang.Object");
        }

        public NetworkInteractor(UserSession userSession) {
            this.A00 = userSession;
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r6, boolean r7) {
        /*
            r5 = this;
            r4 = 3
            boolean r0 = X.C66139MDr.A01(r4, r6)
            if (r0 == 0) goto L_0x0065
            r3 = r6
            X.MDr r3 = (X.C66139MDr) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0065
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r4 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x0053
            if (r0 != r1) goto L_0x006b
            java.lang.Object r3 = r3.A01
            com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler r3 = (com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler) r3
            X.0eS.A00(r4)
        L_0x0027:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x004a
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r2 = r4.A00
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1Av r0 = X.1Au.A00(r0)
            r0.A1F(r1)
            X.JwE r0 = new X.JwE
            r0.<init>((java.lang.Object) r2)
            X.3Ih r4 = X.C41845B3m.A0d(r0)
        L_0x0049:
            return r4
        L_0x004a:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0049
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0053:
            X.0eS.A00(r4)
            com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler$NetworkInteractor r0 = r5.A01
            r3.A01 = r5
            r3.A00 = r1
            java.lang.Object r4 = r0.A00(r3, r7)
            if (r4 != r2) goto L_0x0063
            return r2
        L_0x0063:
            r3 = r5
            goto L_0x0027
        L_0x0065:
            X.MDr r3 = new X.MDr
            r3.<init>(r5, r6, r4)
            goto L_0x0015
        L_0x006b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler.A00(X.4D7, boolean):java.lang.Object");
    }

    public /* synthetic */ SaveStoryToGalleryCustomStorageHandler(UserSession userSession) {
        NetworkInteractor networkInteractor = new NetworkInteractor(userSession);
        this.A00 = userSession;
        this.A01 = networkInteractor;
    }

    public final C239793Ih Bt1(AnonymousClass4D7 r3) {
        return C41845B3m.A0d(new C61076JwE((Object) Boolean.valueOf(1Au.A00(this.A00).A1i())));
    }

    public final /* bridge */ /* synthetic */ Object FLV(Object obj, AnonymousClass4D7 r3) {
        return A00(r3, AnonymousClass7TE.A1a(obj));
    }
}
