package com.instagram.api.schemas;

import X.0qQ;
import X.17P;
import X.C3035269k;
import X.C376379Ht;
import X.C66635Ma4;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class ImmutablePandoTrackData extends 17P implements TrackData {
    public static final C3035269k CREATOR = new C376379Ht(5);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTrackData] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final LyricsIntf BOn() {
        return (LyricsIntf) A05(-1087772684, ImmutablePandoLyrics.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTrackData, com.instagram.api.schemas.TrackData] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C66635Ma4.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String getId() {
        return A0h(3355);
    }

    public final ImageUrl Arq() {
        return A0A(-22609914);
    }

    public final ImageUrl Arr() {
        return A09(-45086183);
    }

    public final String Av6() {
        return A0i(-220872642);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTrackData] */
    public final Integer AzJ() {
        return getOptionalIntValueByHashCode(55068821);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTrackData] */
    public final Boolean BBW() {
        return getOptionalBooleanValueByHashCode(1988432185);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTrackData] */
    public final List BDX() {
        return getOptionalIntListByHashCode(-1755167329);
    }

    public final String Bjs() {
        return A0i(527639047);
    }

    public final String BpH() {
        return A0i(932670004);
    }

    public final String CGG() {
        return A0i(-310659645);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTrackData] */
    public final Boolean CRq() {
        return getOptionalBooleanValueByHashCode(1470663792);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTrackData] */
    public final Boolean CSQ() {
        return getOptionalBooleanValueByHashCode(-512645821);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.api.schemas.TrackDataImpl FCv() {
        /*
            r27 = this;
            r1 = 1545396879(0x5c1ce28f, float:1.76636801E17)
            r0 = r27
            boolean r25 = r0.getBooleanValueByHashCode(r1)
            r1 = 574519571(0x223e7913, float:2.5813898E-18)
            java.lang.String r9 = r0.A0i(r1)
            r1 = -2061768941(0xffffffff851be713, float:-7.3305066E-36)
            java.lang.String r10 = r0.A0i(r1)
            r1 = 1025801609(0x3d247d89, float:0.040158782)
            java.lang.String r11 = r0.A0i(r1)
            r1 = -22609914(0xfffffffffea70006, float:-1.109906E38)
            com.instagram.common.typedurl.ImageUrl r3 = r0.A0A(r1)
            r1 = -45086183(0xfffffffffd500a19, float:-1.7283241E37)
            com.instagram.common.typedurl.ImageUrl r4 = r0.A09(r1)
            r1 = -220872642(0xfffffffff2d5c03e, float:-8.4675473E30)
            java.lang.String r12 = r0.A0i(r1)
            r1 = 1128191036(0x433ed43c, float:190.82904)
            java.lang.String r13 = r0.A0i(r1)
            r1 = 1258734948(0x4b06c564, float:8832356.0)
            java.lang.String r14 = r0.A0i(r1)
            r1 = 55068821(0x3484895, float:5.8858038E-37)
            java.lang.Integer r8 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 682262252(0x28aa7eec, float:1.8928835E-14)
            java.lang.String r15 = r0.A0i(r1)
            r1 = 1988432185(0x76851139, float:1.3494625E33)
            java.lang.Boolean r5 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1755167329(0xffffffff9762459f, float:-7.3112413E-25)
            com.google.common.collect.ImmutableList r24 = r0.getOptionalIntListByHashCode(r1)
            r1 = 3355(0xd1b, float:4.701E-42)
            java.lang.String r16 = r0.A0h(r1)
            r1 = 1357418199(0x50e88ed7, float:3.12134021E10)
            java.lang.String r17 = r0.A0i(r1)
            r1 = 1470663792(0x57a88c70, float:3.70642256E14)
            java.lang.Boolean r6 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -512645821(0xffffffffe171a543, float:-2.7859836E20)
            java.lang.Boolean r7 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1630845353(0x6134b9a9, float:2.0836201E20)
            boolean r26 = r0.getBooleanValueByHashCode(r1)
            com.instagram.api.schemas.LyricsIntf r1 = r0.BOn()
            if (r1 == 0) goto L_0x00b9
            com.instagram.api.schemas.Lyrics r2 = r1.F5h()
        L_0x0089:
            r1 = 1436807532(0x55a3f16c, float:2.25321618E13)
            java.lang.String r18 = r0.A0i(r1)
            r1 = 527639047(0x1f732207, float:5.1485398E-20)
            java.lang.String r19 = r0.A0i(r1)
            r1 = 932670004(0x37976a34, float:1.8050057E-5)
            java.lang.String r20 = r0.A0i(r1)
            r1 = -2060497896(0xffffffff852f4c18, float:-8.242437E-36)
            java.lang.String r21 = r0.A0i(r1)
            r1 = 110371416(0x6942258, float:5.5721876E-35)
            java.lang.String r22 = r0.A0i(r1)
            r1 = -310659645(0xffffffffed7bb5c3, float:-4.8687796E27)
            java.lang.String r23 = r0.A0i(r1)
            com.instagram.api.schemas.TrackDataImpl r1 = new com.instagram.api.schemas.TrackDataImpl
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r1
        L_0x00b9:
            r2 = 0
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.api.schemas.ImmutablePandoTrackData.FCv():com.instagram.api.schemas.TrackDataImpl");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTrackData] */
    public final boolean getAllowsSaving() {
        return getBooleanValueByHashCode(1545396879);
    }

    public final String getArtistId() {
        return A0i(574519571);
    }

    public final String getAudioAssetId() {
        return A0i(-2061768941);
    }

    public final String getAudioClusterId() {
        return A0i(1025801609);
    }

    public final String getDashManifest() {
        return A0i(1128191036);
    }

    public final String getDisplayArtist() {
        return A0i(1258734948);
    }

    public final String getFastStartProgressiveDownloadUrl() {
        return A0i(682262252);
    }

    public final String getIgUsername() {
        return A0i(1357418199);
    }

    public final String getProgressiveDownloadUrl() {
        return A0i(1436807532);
    }

    public final String getSubtitle() {
        return A0i(-2060497896);
    }

    public final String getTitle() {
        return A0i(110371416);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTrackData] */
    public final boolean isExplicit() {
        return getBooleanValueByHashCode(1630845353);
    }
}
