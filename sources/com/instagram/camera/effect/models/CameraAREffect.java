package com.instagram.camera.effect.models;

import X.002;
import X.0lg;
import X.0wb;
import X.16P;
import X.1Ng;
import X.2PP;
import X.AnonymousClass05K;
import X.AnonymousClass1Nd;
import X.AnonymousClass518;
import X.AnonymousClass51C;
import X.AnonymousClass51D;
import X.AnonymousClass51F;
import X.C243373Ym;
import X.C2809655h;
import X.C346167ui;
import X.C376419Hx;
import X.C64085LMd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.SparkVisionCapability;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.effect.AREffect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

public class CameraAREffect extends AREffect implements AnonymousClass518 {
    public static final Parcelable.Creator CREATOR = new C376419Hx(62);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public SparkVisionCapability A04 = new SparkVisionCapability();
    public ImageUrl A05;
    public ImageUrl A06 = new SimpleImageUrl("");
    public ImageUrl A07;
    public ImageUrl A08;
    public Integer A09 = AnonymousClass05K.A0N;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public List A0T = Collections.emptyList();
    public List A0U;
    public List A0V = new ArrayList();
    public List A0W = new ArrayList();
    public List A0X = Collections.emptyList();
    public List A0Y = new ArrayList();
    public Map A0Z = new HashMap();
    public Set A0a = new HashSet();
    public Set A0b = new HashSet();
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public volatile JSONObject A0k;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            CameraAREffect cameraAREffect = (CameraAREffect) obj;
            if (!2PP.A00(this.A0J, cameraAREffect.A0J) || !2PP.A00(this.A0M, cameraAREffect.A0M) || !2PP.A00(this.A0K, cameraAREffect.A0K)) {
                return false;
            }
        }
        return true;
    }

    public final ArrayList A0E() {
        ARRequestAsset.CompressionMethod fromString;
        List<C64085LMd> list = this.A0U;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C64085LMd lMd : list) {
            String str = lMd.A01;
            str.getClass();
            String str2 = lMd.A00;
            str2.getClass();
            List list2 = lMd.A03;
            String str3 = lMd.A02;
            str3.getClass();
            String str4 = this.A0H;
            if (str4 == null) {
                fromString = ARRequestAsset.CompressionMethod.ZIP;
            } else {
                fromString = ARRequestAsset.CompressionMethod.fromString(str4);
            }
            arrayList.add(new AREffectAsyncAsset(str, str2, list2, str3, fromString, false));
        }
        return arrayList;
    }

    public final HashMap A0F() {
        HashMap hashMap = new HashMap();
        for (C346167ui r1 : this.A0X) {
            hashMap.put(r1.A02, r1);
        }
        return hashMap;
    }

    public final void A0G() {
        AnonymousClass51D parseFromJson;
        C2809655h r0;
        try {
            String str = this.A0L;
            if (str != null && (parseFromJson = AnonymousClass51C.parseFromJson(16P.A00(str))) != null) {
                for (AnonymousClass51F r2 : parseFromJson.A00) {
                    this.A0Z.put(r2.A01, r2);
                }
                AnonymousClass51F r02 = (AnonymousClass51F) this.A0Z.get("genericML");
                if (r02 != null && (r0 = r02.A00) != null) {
                    this.A04.A00 = r0.A00;
                }
            }
        } catch (IOException e) {
            0wb.A03("CameraAREffect", 002.A0R("Unable to parse effect manifest json: ", e.getLocalizedMessage()));
        }
    }

    public final boolean A0H() {
        if (this.A0Z.get("textCaptions") != null) {
            return true;
        }
        return false;
    }

    public final boolean A0I() {
        if (this.A0Z.get("externalMusicSelection") != null) {
            return true;
        }
        return false;
    }

    public final boolean A0J() {
        Map map = this.A0Z;
        if (map.get("audioAmbient") == null && map.get("audioTriggered") == null && map.get(MediaStreamTrack.AUDIO_TRACK_KIND) == null) {
            return false;
        }
        return true;
    }

    public final boolean A0K() {
        if (!"25025320".equals(this.A0B) || this.A0c) {
            return true;
        }
        return false;
    }

    public final boolean A0L() {
        if (this.A0h || A0N() || "INSTAGRAM_CAMERA".equals(this.A0E)) {
            return true;
        }
        return false;
    }

    public final boolean A0M() {
        if (this.A0Z.get("multipeer") == null || this.A0Z.get("multipeer_messaging") == null) {
            return false;
        }
        return true;
    }

    public final boolean A0N() {
        if (this.A0Y.contains("AVATAR_PRESET")) {
            return true;
        }
        if (this.A0Z.get("avatarSDK") == null || this.A0D == null) {
            return false;
        }
        return true;
    }

    public final C243373Ym BpO() {
        if (this.A01 == 1) {
            return C243373Ym.SAVED;
        }
        return C243373Ym.NOT_SAVED;
    }

    public final String BpP() {
        String str = this.A0K;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final Collection BpQ() {
        return Collections.EMPTY_LIST;
    }

    public final Integer BpT() {
        return AnonymousClass05K.A0N;
    }

    public final boolean CbC() {
        if (this.A01 != 1) {
            return false;
        }
        return true;
    }

    public final void EjB(C243373Ym r3) {
        int i = 0;
        if (r3 == C243373Ym.SAVED) {
            i = 1;
        }
        this.A01 = i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0J, this.A0M, this.A0K});
    }

    public final String toString() {
        return String.format("name=%s id=%s packageId=%s fileId=%s cacheKey=%s", new Object[]{this.A0S, this.A0K, this.A0M, this.A0J, this.A0G});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0S);
        parcel.writeParcelable(this.A07, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A01);
        parcel.writeStringList(this.A0V);
        parcel.writeStringList(this.A0W);
        parcel.writeByte(this.A0g ? (byte) 1 : 0);
        parcel.writeByte(this.A0h ? (byte) 1 : 0);
        parcel.writeByte(this.A0d ? (byte) 1 : 0);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0G);
        parcel.writeByte(this.A0e ? (byte) 1 : 0);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0E);
    }

    public static String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return "FOCUS";
        }
        if (intValue == 4) {
            return "FOCUSV2";
        }
        if (intValue != 1) {
            return "DEFAULT";
        }
        return "SUPERZOOMV3";
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1qK, java.lang.Object, X.8Yi] */
    public final void AE7(0lg r5) {
        C243373Ym r1;
        1Ng A002 = AnonymousClass1Nd.A00(r5);
        String str = this.A0K;
        if (this.A01 == 1) {
            r1 = C243373Ym.SAVED;
        } else {
            r1 = C243373Ym.NOT_SAVED;
        }
        ? obj = new Object();
        obj.A01 = str;
        obj.A00 = r1;
        A002.A00(obj);
    }

    public CameraAREffect(ImageUrl imageUrl, ImageUrl imageUrl2, ImageUrl imageUrl3, ImageUrl imageUrl4, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, List list, List list2, List list3, List list4, List list5, List list6, Set set, Set set2, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A0K = str;
        this.A0M = str2;
        this.A0d = z;
        this.A0g = z2;
        this.A0j = z3;
        this.A0J = str3;
        this.A0G = str4;
        this.A0P = str5;
        this.A0H = str6;
        this.A0S = str7;
        this.A0A = str8;
        this.A0c = z4;
        this.A02 = j;
        this.A03 = j2;
        this.A0U = list;
        this.A07 = imageUrl;
        this.A08 = imageUrl2;
        this.A0X = list2;
        this.A0f = z5;
        this.A0b = set;
        this.A0a = set2;
        this.A0L = str9;
        this.A09 = num;
        A0G();
        this.A0B = str10;
        this.A0C = str11;
        this.A05 = imageUrl3;
        this.A0T = list3;
        this.A01 = i;
        this.A0V = list4;
        this.A0W = list5;
        this.A06 = imageUrl4;
        this.A0I = str12;
        this.A0i = z6;
        this.A00 = i2;
        this.A0e = z7;
        this.A0Y = list6;
        if (this.A0K == null) {
            0wb.A03("CameraAREffect", "mEffectId is null");
        }
        if (this.A0M == null) {
            0wb.A03("CameraAREffect", "mEffectPackageId is null");
        }
        if (this.A0J == null) {
            0wb.A03("CameraAREffect", "mEffectFileId is null");
        }
        if (this.A0G == null) {
            0wb.A03("CameraAREffect", "mCacheKey is null");
        }
        if (this.A0H == null) {
            0wb.A03("CameraAREffect", "mCompressionType is null");
        }
        if (this.A0S == null) {
            0wb.A03("CameraAREffect", "mTitle is null");
        }
        if (this.A0A == null) {
            0wb.A03("CameraAREffect", "mAssetUrl is null");
        }
        if (this.A07 == null) {
            0wb.A03("CameraAREffect", "mThumbnailUrl is null");
        }
        this.A0N = str13;
        this.A0O = str14;
        this.A0D = str15;
        this.A0R = str16;
        this.A0F = str17;
        this.A0E = str18;
    }

    public CameraAREffect() {
    }
}
