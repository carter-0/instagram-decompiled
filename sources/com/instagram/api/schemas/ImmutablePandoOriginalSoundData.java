package com.instagram.api.schemas;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TH;
import X.B4U;
import X.B6F;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoOriginalSoundData extends 17P implements OriginalSoundDataIntf {
    public static final C3035269k CREATOR = CTB.A00(33);
    public User A00;
    public List A01;
    public List A02;

    public final List Adc() {
        return A08(1437867975, ImmutablePandoAudioFilterInfo.class);
    }

    public final List Adj() {
        List list = this.A01;
        if (list == null) {
            return A0o(781672759, ImmutablePandoOriginalAudioPartMetadata.class);
        }
        return list;
    }

    public final List Adk() {
        List list = this.A02;
        if (list == null) {
            return A08(-1693515944, ImmutablePandoOriginalAudioPartMetadata.class);
        }
        return list;
    }

    public final OriginalSoundConsumptionInfoIntf AqB() {
        return (OriginalSoundConsumptionInfoIntf) A04(-1464257838, ImmutablePandoOriginalSoundConsumptionInfo.class);
    }

    public final User BEv() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'igArtist' field.");
    }

    public final OriginalAudioSubtype BYy() {
        return (OriginalAudioSubtype) A0M(-768306141, B6F.A00);
    }

    public final XpostOriginalSoundFBCreatorInfo CHN() {
        return (XpostOriginalSoundFBCreatorInfo) A05(1647938141, ImmutablePandoXpostOriginalSoundFBCreatorInfo.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData, com.instagram.api.schemas.OriginalSoundDataIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B4U.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final Integer AdU() {
        return getOptionalIntValueByHashCode(-615307517);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final Boolean AkO() {
        return getOptionalBooleanValueByHashCode(-118927619);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final Boolean AkP() {
        return getOptionalBooleanValueByHashCode(645283325);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final Integer AzJ() {
        return getOptionalIntValueByHashCode(55068821);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final Boolean BXg() {
        return getOptionalBooleanValueByHashCode(724501341);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final Integer BZg() {
        return getOptionalIntValueByHashCode(-1532724339);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final Integer BfI() {
        return getOptionalIntValueByHashCode(-267229226);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final Integer C7I() {
        return getOptionalIntValueByHashCode(-630236298);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final Integer C9r() {
        return getOptionalIntValueByHashCode(513375630);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final Boolean CRq() {
        return getOptionalBooleanValueByHashCode(1470663792);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final Boolean CSQ() {
        return getOptionalBooleanValueByHashCode(-512645821);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final Boolean CYh() {
        return getOptionalBooleanValueByHashCode(-1683806324);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final Boolean Caw() {
        return getOptionalBooleanValueByHashCode(1317433244);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final Boolean Cf2() {
        return getOptionalBooleanValueByHashCode(-1021150475);
    }

    public final OriginalSoundDataIntf E7q(1E9 r4) {
        ArrayList arrayList;
        List<OriginalAudioPartMetadataIntf> Adj = Adj();
        ArrayList A0p = AnonymousClass7TF.A0p(Adj);
        for (OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf : Adj) {
            originalAudioPartMetadataIntf.E7p(r4);
            A0p.add(originalAudioPartMetadataIntf);
        }
        this.A01 = A0p;
        List<OriginalAudioPartMetadataIntf> Adk = Adk();
        if (Adk != null) {
            arrayList = AnonymousClass7TF.A0p(Adk);
            for (OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf2 : Adk) {
                originalAudioPartMetadataIntf2.E7p(r4);
                arrayList.add(originalAudioPartMetadataIntf2);
            }
        } else {
            arrayList = null;
        }
        this.A02 = arrayList;
        this.A00 = C41846B3n.A0c(r4, this, -383946360);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.api.schemas.OriginalSoundData F7E(X.1E9 r42) {
        /*
            r41 = this;
            r1 = -664939079(0xffffffffd85dd5b9, float:-9.7564001E14)
            r0 = r41
            boolean r36 = r0.getBooleanValueByHashCode(r1)
            r1 = -2061768941(0xffffffff851be713, float:-7.3305066E-36)
            java.lang.String r26 = r0.A0k(r1)
            r1 = -615307517(0xffffffffdb532703, float:-5.9434114E16)
            java.lang.Integer r20 = r0.getOptionalIntValueByHashCode(r1)
            java.util.List r2 = r0.Adc()
            r7 = 10
            r10 = 0
            if (r2 == 0) goto L_0x0041
            int r1 = X.0Yv.A1E(r2, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x002d:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r2.next()
            com.instagram.api.schemas.AudioFilterInfoIntf r1 = (com.instagram.api.schemas.AudioFilterInfoIntf) r1
            com.instagram.api.schemas.AudioFilterInfo r1 = r1.F0c()
            r6.add(r1)
            goto L_0x002d
        L_0x0041:
            r6 = r10
        L_0x0042:
            java.util.List r2 = r0.Adj()
            int r1 = X.0Yv.A1E(r2, r7)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x0053:
            boolean r1 = r2.hasNext()
            r4 = r42
            if (r1 == 0) goto L_0x0069
            java.lang.Object r1 = r2.next()
            com.instagram.api.schemas.OriginalAudioPartMetadataIntf r1 = (com.instagram.api.schemas.OriginalAudioPartMetadataIntf) r1
            com.instagram.api.schemas.OriginalAudioPartMetadata r1 = r1.F7C(r4)
            r5.add(r1)
            goto L_0x0053
        L_0x0069:
            java.util.List r3 = r0.Adk()
            if (r3 == 0) goto L_0x0090
            int r1 = X.0Yv.A1E(r3, r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x007c:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0091
            java.lang.Object r1 = r3.next()
            com.instagram.api.schemas.OriginalAudioPartMetadataIntf r1 = (com.instagram.api.schemas.OriginalAudioPartMetadataIntf) r1
            com.instagram.api.schemas.OriginalAudioPartMetadata r1 = r1.F7C(r4)
            r2.add(r1)
            goto L_0x007c
        L_0x0090:
            r2 = r10
        L_0x0091:
            r1 = -118927619(0xfffffffff8e94efd, float:-3.7856476E34)
            java.lang.Boolean r12 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 645283325(0x26763dfd, float:8.5432405E-16)
            java.lang.Boolean r13 = r0.getOptionalBooleanValueByHashCode(r1)
            com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf r1 = r0.AqB()
            com.instagram.api.schemas.OriginalSoundConsumptionInfo r9 = r1.F7D()
            r1 = 1128191036(0x433ed43c, float:190.82904)
            java.lang.String r27 = r0.A0h(r1)
            r1 = 55068821(0x3484895, float:5.8858038E-37)
            java.lang.Integer r21 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 1181455637(0x466b9515, float:15077.2705)
            java.lang.String r28 = r0.A0i(r1)
            r1 = 2112323158(0x7de77e56, float:3.8463455E37)
            boolean r37 = r0.getBooleanValueByHashCode(r1)
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r3 = com.instagram.user.model.ImmutablePandoUserDict.class
            r1 = -383946360(0xffffffffe91d7188, float:-1.1896093E25)
            com.facebook.pando.TreeJNI r1 = r0.A04(r1, r3)
            com.instagram.user.model.ImmutablePandoUserDict r1 = (com.instagram.user.model.ImmutablePandoUserDict) r1
            android.os.Parcelable$Creator r3 = com.instagram.user.model.User.CREATOR
            com.instagram.user.model.User r1 = X.1aC.A01(r4, r1)
            X.17K r11 = r4.A00(r1)
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            r1 = -782500510(0xffffffffd15bfd62, float:-5.9053056E10)
            boolean r38 = r0.getBooleanValueByHashCode(r1)
            r1 = 1470663792(0x57a88c70, float:3.70642256E14)
            java.lang.Boolean r14 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -512645821(0xffffffffe171a543, float:-2.7859836E20)
            java.lang.Boolean r15 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1630845353(0x6134b9a9, float:2.0836201E20)
            boolean r39 = r0.getBooleanValueByHashCode(r1)
            r1 = -1683806324(0xffffffff9ba3278c, float:-2.6991645E-22)
            java.lang.Boolean r16 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1317433244(0x4e866f9c, float:1.12773069E9)
            java.lang.Boolean r17 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1021150475(0xffffffffc3227af5, float:-162.4803)
            java.lang.Boolean r18 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1139251232(0x43e79820, float:463.18848)
            java.lang.String r29 = r0.A0j(r1)
            r1 = 724501341(0x2b2f035d, float:6.2177157E-13)
            java.lang.Boolean r19 = r0.getOptionalBooleanValueByHashCode(r1)
            com.instagram.api.schemas.OriginalAudioSubtype r8 = r0.BYy()
            r1 = 2019893057(0x78651f41, float:1.8588592E34)
            java.lang.String r30 = r0.A0h(r1)
            r1 = -1824429564(0xffffffff93416a04, float:-2.4412294E-27)
            java.lang.String r31 = r0.A0k(r1)
            r1 = -1532724339(0xffffffffa4a47b8d, float:-7.1332966E-17)
            java.lang.Integer r22 = r0.getOptionalIntValueByHashCode(r1)
            r1 = -267229226(0xfffffffff01267d6, float:-1.8124137E29)
            java.lang.Integer r23 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 1436807532(0x55a3f16c, float:2.25321618E13)
            java.lang.String r32 = r0.A0h(r1)
            r1 = 1353604156(0x50ae5c3c, float:2.3402242E10)
            boolean r40 = r0.getBooleanValueByHashCode(r1)
            r1 = -630236298(0xffffffffda6f5b76, float:-1.68432704E16)
            java.lang.Integer r24 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 513375630(0x1e997d8e, float:1.6251433E-20)
            java.lang.Integer r25 = r0.getOptionalIntValueByHashCode(r1)
            com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo r0 = r0.CHN()
            if (r0 == 0) goto L_0x015f
            com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfoImpl r10 = r0.FDX()
        L_0x015f:
            com.instagram.api.schemas.OriginalSoundData r7 = new com.instagram.api.schemas.OriginalSoundData
            r33 = r6
            r34 = r5
            r35 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.api.schemas.ImmutablePandoOriginalSoundData.F7E(X.1E9):com.instagram.api.schemas.OriginalSoundData");
    }

    public final OriginalSoundData F7F(1E6 r2) {
        return F7E(C41846B3n.A0S(r2));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final boolean getAllowCreatorToRename() {
        return getBooleanValueByHashCode(-664939079);
    }

    public final String getAudioAssetId() {
        return A0k(-2061768941);
    }

    public final String getDashManifest() {
        return A0h(1128191036);
    }

    public final String getFormattedClipsMediaCount() {
        return A0i(1181455637);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final boolean getHideRemixing() {
        return getBooleanValueByHashCode(2112323158);
    }

    public final String getMusicCanonicalId() {
        return A0j(1139251232);
    }

    public final String getOriginalAudioTitle() {
        return A0h(2019893057);
    }

    public final String getOriginalMediaId() {
        return A0k(-1824429564);
    }

    public final String getProgressiveDownloadUrl() {
        return A0h(1436807532);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final boolean getShouldMuteAudio() {
        return getBooleanValueByHashCode(1353604156);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final boolean isAudioAutomaticallyAttributed() {
        return getBooleanValueByHashCode(-782500510);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final boolean isExplicit() {
        return getBooleanValueByHashCode(1630845353);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundData] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
