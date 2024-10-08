package com.instagram.music.profile.musiconprofile;

import X.0mp;
import X.0qQ;
import X.15p;
import X.1NY;
import X.1OC;
import X.1P0;
import X.2Fk;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass2Fj;
import X.AnonymousClass4D6;
import X.AnonymousClass9L9;
import X.B5W;
import X.B5X;
import X.C322316vd;
import X.C322326ve;
import X.C43805CDx;
import X.DRH;
import X.JVM;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.music.profile.musiconprofile.repository.MusicOnProfileRepository;
import java.util.LinkedHashMap;
import java.util.Map;

public final class MusicOnProfileProvider {
    public boolean A00;
    public final AnonymousClass2Fj A01 = new 2Fk((Object) null);
    public final UserSession A02;
    public final Map A03 = new LinkedHashMap();
    public final Map A04 = new LinkedHashMap();
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 17));
    public final MusicOnProfileRepository A06;
    public final C322326ve A07;

    public MusicOnProfileProvider(UserSession userSession, MusicOnProfileRepository musicOnProfileRepository) {
        0qQ.A0B(musicOnProfileRepository, 2);
        this.A02 = userSession;
        this.A06 = musicOnProfileRepository;
        this.A07 = C322316vd.A00(userSession);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.JVM r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r4 = 1
            boolean r0 = X.C66138MDq.A02(r4, r9)
            if (r0 == 0) goto L_0x00b7
            r3 = r9
            X.MDq r3 = (X.C66138MDq) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b7
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r3.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            if (r0 == 0) goto L_0x00a4
            if (r0 != r4) goto L_0x00c4
            java.lang.Object r3 = r3.A01
            com.instagram.music.profile.musiconprofile.MusicOnProfileProvider r3 = (com.instagram.music.profile.musiconprofile.MusicOnProfileProvider) r3
            X.0eS.A00(r2)
        L_0x0026:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x009a
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r5 = r2.A00
            X.JVM r5 = (X.JVM) r5
            X.6ve r2 = r3.A07
            com.instagram.common.session.UserSession r6 = r3.A02
            java.lang.String r1 = r6.A06
            java.lang.String r0 = "save_profile_music_successful"
            r2.A08(r1, r0)
            X.0t1 r0 = X.0eE.A00(r6)
            com.instagram.user.model.User r2 = r0.A00()
            X.4Cl r1 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.EYU(r0)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r6)
            X.2Cy r0 = new X.2Cy
            r0.<init>(r2)
            r1.A00(r0)
            X.0eM r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = r2.getId()
            r3.A04(r5, r0)
        L_0x006f:
            X.3Ih r2 = new X.3Ih
            r2.<init>(r5)
        L_0x0074:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0091
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00be
            X.6ve r2 = r3.A07
            com.instagram.common.session.UserSession r0 = r3.A02
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "save_profile_music_error"
            r2.A08(r1, r0)
            r2.A07(r1, r0)
            X.0gF r0 = X.C60340gF.A00
            X.5sO r2 = new X.5sO
            r2.<init>(r0)
        L_0x0091:
            return r2
        L_0x0092:
            r3.A00 = r4
            X.2Fj r0 = r3.A01
            r0.A0A(r5)
            goto L_0x006f
        L_0x009a:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0074
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00a4:
            X.0eS.A00(r2)
            com.instagram.music.profile.musiconprofile.repository.MusicOnProfileRepository r0 = r7.A06
            r3.A01 = r7
            r3.A00 = r4
            java.lang.Object r2 = r0.A00(r8, r3)
            if (r2 != r1) goto L_0x00b4
            return r1
        L_0x00b4:
            r3 = r7
            goto L_0x0026
        L_0x00b7:
            X.MDq r3 = new X.MDq
            r3.<init>(r7, r9, r4)
            goto L_0x0015
        L_0x00be:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00c4:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.profile.musiconprofile.MusicOnProfileProvider.A01(X.JVM, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r8) {
        /*
            r7 = this;
            r6 = 0
            boolean r0 = X.C66138MDq.A02(r6, r8)
            if (r0 == 0) goto L_0x0099
            r3 = r8
            X.MDq r3 = (X.C66138MDq) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0099
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r3.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L_0x0087
            if (r0 != r5) goto L_0x00a6
            java.lang.Object r4 = r3.A01
            com.instagram.music.profile.musiconprofile.MusicOnProfileProvider r4 = (com.instagram.music.profile.musiconprofile.MusicOnProfileProvider) r4
            X.0eS.A00(r2)
        L_0x0027:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x007d
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r3 = r4.A02
            com.instagram.user.model.User r2 = r0.A01(r3)
            X.4Cl r1 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.EYU(r0)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r3)
            X.2Cy r0 = new X.2Cy
            r0.<init>(r2)
            r1.A00(r0)
            X.0eM r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = r2.getId()
            r4.A04(r1, r0)
        L_0x005e:
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r2 = new X.3Ih
            r2.<init>(r0)
        L_0x0065:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0074
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00a0
            X.0gF r0 = X.C60340gF.A00
            X.5sO r2 = new X.5sO
            r2.<init>(r0)
        L_0x0074:
            return r2
        L_0x0075:
            r4.A00 = r5
            X.2Fj r0 = r4.A01
            r0.A0A(r1)
            goto L_0x005e
        L_0x007d:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0065
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0087:
            X.0eS.A00(r2)
            com.instagram.music.profile.musiconprofile.repository.MusicOnProfileRepository r0 = r7.A06
            r3.A01 = r7
            r3.A00 = r5
            java.lang.Object r2 = r0.A01(r3)
            if (r2 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r4 = r7
            goto L_0x0027
        L_0x0099:
            X.MDq r3 = new X.MDq
            r3.<init>(r7, r8, r6)
            goto L_0x0015
        L_0x00a0:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00a6:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.profile.musiconprofile.MusicOnProfileProvider.A02(X.4D7):java.lang.Object");
    }

    public final void A03(1P0 r6, AnonymousClass4D6 r7, String str) {
        1NY r2 = new 1NY(this.A06.A00, -2);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0A(0mp.A06("music/profile/%s/", new Object[]{str}));
        r2.A0O((15p) null, C43805CDx.class, B5W.class, false);
        1OC A0M = r2.A0M();
        A0M.A00 = r6;
        r7.schedule(A0M);
    }

    public static final JVM A00(C43805CDx cDx) {
        DRH drh = cDx.A01;
        if (drh == null) {
            0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw AnonymousClass00P.createAndThrow();
        }
        MusicInfoImpl musicInfoImpl = ((B5X) drh).A00;
        Integer AdU = musicInfoImpl.A01.AdU();
        if (AdU != null) {
            int intValue = AdU.intValue();
            MusicConsumptionModel musicConsumptionModel = musicInfoImpl.A01;
            Integer BZg = musicConsumptionModel.BZg();
            if (BZg != null) {
                int intValue2 = BZg.intValue();
                TrackData trackData = musicInfoImpl.A00;
                if (trackData != null) {
                    MusicAssetModel A012 = MusicAssetModel.A01(trackData, false);
                    String derivedContentId = musicConsumptionModel.getDerivedContentId();
                    if (derivedContentId != null) {
                        return new JVM(A012, derivedContentId, intValue, intValue2);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A04(JVM jvm, String str) {
        this.A03.put(str, Long.valueOf(System.currentTimeMillis()));
        this.A04.put(str, jvm);
    }
}
