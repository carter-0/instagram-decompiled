package com.instagram.music.common.model;

import X.0qQ;
import X.17P;
import X.1E6;
import X.1E9;
import X.1aC;
import X.B4Q;
import X.C3035269k;
import X.C3035369s;
import X.C3035469t;
import X.C376379Ht;
import X.C45436CwH;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.ImmutablePandoAudioFilterInfo;
import com.instagram.api.schemas.ImmutablePandoAudioMutingInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.List;

public final class ImmutablePandoMusicConsumptionModel extends 17P implements MusicConsumptionModel {
    public static final C3035269k CREATOR = new C376379Ht(10);
    public User A00;

    public final MusicConsumptionModelImpl FG7(1E6 r4) {
        0qQ.A0B(r4, 0);
        return FG6(new 1E9(r4, 6, false));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final /* synthetic */ C45436CwH AKe() {
        return new C45436CwH(this);
    }

    public final List Adc() {
        return A08(1437867975, ImmutablePandoAudioFilterInfo.class);
    }

    public final AudioMutingInfoIntf Adi() {
        return (AudioMutingInfoIntf) A05(-254007346, ImmutablePandoAudioMutingInfo.class);
    }

    public final List Ay7() {
        return A0p(1557415452, C3035369s.A00);
    }

    public final User BEv() {
        return this.A00;
    }

    public final MusicMuteAudioReason BuG() {
        return (MusicMuteAudioReason) A0N(-880361262, C3035469t.A00);
    }

    public final MusicConsumptionModel EAF(1E9 r3) {
        User user;
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(-383946360, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            user = 1aC.A01(r3, immutablePandoUserDict);
        } else {
            user = null;
        }
        this.A00 = user;
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.music.common.model.MusicConsumptionModel, com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(B4Q.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel] */
    public final Boolean Ab6() {
        return getOptionalBooleanValueByHashCode(1120317563);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel] */
    public final Integer AdU() {
        return getOptionalIntValueByHashCode(-615307517);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel] */
    public final Boolean AqO() {
        return getOptionalBooleanValueByHashCode(79699476);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel] */
    public final Integer BZg() {
        return getOptionalIntValueByHashCode(-1532724339);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel] */
    public final Integer BfI() {
        return getOptionalIntValueByHashCode(-267229226);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel] */
    public final Boolean Bty() {
        return getOptionalBooleanValueByHashCode(930407036);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel] */
    public final Boolean BuU() {
        return getOptionalBooleanValueByHashCode(2063793707);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel] */
    public final Integer C9r() {
        return getOptionalIntValueByHashCode(513375630);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel] */
    public final Boolean CPZ() {
        return getOptionalBooleanValueByHashCode(1033668234);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel] */
    public final Boolean Cde() {
        return getOptionalBooleanValueByHashCode(1915067790);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.music.common.model.MusicConsumptionModelImpl FG6(X.1E9 r26) {
        /*
            r25 = this;
            r1 = 1120317563(0x42c6b07b, float:99.34469)
            r0 = r25
            java.lang.Boolean r8 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -615307517(0xffffffffdb532703, float:-5.9434114E16)
            java.lang.Integer r14 = r0.getOptionalIntValueByHashCode(r1)
            java.util.List r3 = r0.Adc()
            r7 = 0
            if (r3 == 0) goto L_0x003a
            r1 = 10
            int r2 = X.0Yv.A1E(r3, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            java.util.Iterator r3 = r3.iterator()
        L_0x0026:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = r3.next()
            com.instagram.api.schemas.AudioFilterInfoIntf r2 = (com.instagram.api.schemas.AudioFilterInfoIntf) r2
            com.instagram.api.schemas.AudioFilterInfo r2 = r2.F0c()
            r1.add(r2)
            goto L_0x0026
        L_0x003a:
            r1 = r7
        L_0x003b:
            com.instagram.api.schemas.AudioMutingInfoIntf r2 = r0.Adi()
            if (r2 == 0) goto L_0x00cd
            com.instagram.api.schemas.AudioMutingInfo r5 = r2.F0f()
        L_0x0045:
            r2 = 79699476(0x4c01e14, float:4.5166605E-36)
            java.lang.Boolean r9 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = 1911060995(0x71e87a03, float:2.3023368E30)
            java.lang.String r18 = r0.A0j(r2)
            java.util.List r23 = r0.Ay7()
            r2 = 1181455637(0x466b9515, float:15077.2705)
            java.lang.String r19 = r0.A0i(r2)
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r3 = com.instagram.user.model.ImmutablePandoUserDict.class
            r2 = -383946360(0xffffffffe91d7188, float:-1.1896093E25)
            com.facebook.pando.TreeJNI r3 = r0.A05(r2, r3)
            com.instagram.user.model.ImmutablePandoUserDict r3 = (com.instagram.user.model.ImmutablePandoUserDict) r3
            if (r3 == 0) goto L_0x007b
            android.os.Parcelable$Creator r2 = com.instagram.user.model.User.CREATOR
            r4 = r26
            com.instagram.user.model.User r2 = X.1aC.A01(r4, r3)
            if (r2 == 0) goto L_0x007b
            X.17K r7 = r4.A00(r2)
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
        L_0x007b:
            r2 = 1033668234(0x3d9c868a, float:0.07642849)
            java.lang.Boolean r10 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = 1915067790(0x72259d8e, float:3.280352E30)
            java.lang.Boolean r11 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = -1532724339(0xffffffffa4a47b8d, float:-7.1332966E-17)
            java.lang.Integer r15 = r0.getOptionalIntValueByHashCode(r2)
            r2 = 1873272280(0x6fa7ddd8, float:1.0390438E29)
            java.lang.String r20 = r0.A0h(r2)
            r2 = -267229226(0xfffffffff01267d6, float:-1.8124137E29)
            java.lang.Integer r16 = r0.getOptionalIntValueByHashCode(r2)
            r2 = 930407036(0x3774e27c, float:1.4596266E-5)
            java.lang.Boolean r12 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = 1353604156(0x50ae5c3c, float:2.3402242E10)
            boolean r24 = r0.getBooleanValueByHashCode(r2)
            r2 = -567396441(0xffffffffde2e37a7, float:-3.13842153E18)
            java.lang.String r21 = r0.A0h(r2)
            com.instagram.api.schemas.MusicMuteAudioReason r6 = r0.BuG()
            r2 = 2063793707(0x7b02fe2b, float:6.801537E35)
            java.lang.Boolean r13 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = 513375630(0x1e997d8e, float:1.6251433E-20)
            java.lang.Integer r17 = r0.getOptionalIntValueByHashCode(r2)
            com.instagram.music.common.model.MusicConsumptionModelImpl r4 = new com.instagram.music.common.model.MusicConsumptionModelImpl
            r22 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r4
        L_0x00cd:
            r5 = r7
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel.FG6(X.1E9):com.instagram.music.common.model.MusicConsumptionModelImpl");
    }

    public final String getDerivedContentId() {
        return A0j(1911060995);
    }

    public final String getFormattedClipsMediaCount() {
        return A0i(1181455637);
    }

    public final String getPlaceholderProfilePicUrl() {
        return A0h(1873272280);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel] */
    public final boolean getShouldMuteAudio() {
        return getBooleanValueByHashCode(1353604156);
    }

    public final String getShouldMuteAudioReason() {
        return A0h(-567396441);
    }
}
