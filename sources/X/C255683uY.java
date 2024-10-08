package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.MusicOverlayStickerModelIntf;

/* renamed from: X.3uY  reason: invalid class name and case insensitive filesystem */
public final class C255683uY extends AnonymousClass0T0 implements C255693uZ {
    public final OriginalSoundData A00;
    public final StickerTraySurface A01;
    public final SubscriptionStickerDict A02;
    public final MusicOverlayStickerModel A03;
    public final Float A04;
    public final Float A05;
    public final Float A06;
    public final Float A07;
    public final Float A08;
    public final Float A09;
    public final Float A0A;
    public final Float A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;

    public final C255683uY FAZ(1E9 r1) {
        return this;
    }

    public final C255683uY FAa(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C255683uY) {
                C255683uY r5 = (C255683uY) obj;
                if (!0qQ.A0K(this.A0H, r5.A0H) || !0qQ.A0K(this.A0I, r5.A0I) || !0qQ.A0K(this.A0J, r5.A0J) || !0qQ.A0K(this.A0K, r5.A0K) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A0L, r5.A0L) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A0M, r5.A0M) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A02, r5.A02) || this.A01 != r5.A01 || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0B, r5.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A0H;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A0I;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0J;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0K;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f = this.A04;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.A05;
        int hashCode6 = (hashCode5 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str5 = this.A0L;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.A0C;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A0D;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A0E;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A0F;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.A0M;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        MusicOverlayStickerModel musicOverlayStickerModel = this.A03;
        int hashCode13 = (hashCode12 + (musicOverlayStickerModel == null ? 0 : musicOverlayStickerModel.hashCode())) * 31;
        OriginalSoundData originalSoundData = this.A00;
        int hashCode14 = (hashCode13 + (originalSoundData == null ? 0 : originalSoundData.hashCode())) * 31;
        Float f3 = this.A06;
        int hashCode15 = (hashCode14 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.A07;
        int hashCode16 = (hashCode15 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num5 = this.A0G;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        SubscriptionStickerDict subscriptionStickerDict = this.A02;
        int hashCode18 = (hashCode17 + (subscriptionStickerDict == null ? 0 : subscriptionStickerDict.hashCode())) * 31;
        StickerTraySurface stickerTraySurface = this.A01;
        int hashCode19 = (hashCode18 + (stickerTraySurface == null ? 0 : stickerTraySurface.hashCode())) * 31;
        Float f5 = this.A08;
        int hashCode20 = (hashCode19 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.A09;
        int hashCode21 = (hashCode20 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.A0A;
        int hashCode22 = (hashCode21 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f8 = this.A0B;
        if (f8 != null) {
            i = f8.hashCode();
        }
        return hashCode22 + i;
    }

    public final String Ad0() {
        return this.A0H;
    }

    public final String AdC() {
        return this.A0I;
    }

    public final String Auy() {
        return this.A0J;
    }

    public final String AyE() {
        return this.A0K;
    }

    public final Float B1i() {
        return this.A04;
    }

    public final Float BCt() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ MusicOverlayStickerModelIntf BUl() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ OriginalSoundDataIntf BZB() {
        return this.A00;
    }

    public final Float Bof() {
        return this.A06;
    }

    public final Float Byt() {
        return this.A07;
    }

    public final Integer Bzj() {
        return this.A0G;
    }

    public final /* bridge */ /* synthetic */ SubscriptionStickerDictIntf C2V() {
        return this.A02;
    }

    public final StickerTraySurface C3E() {
        return this.A01;
    }

    public final Float CGX() {
        return this.A08;
    }

    public final Float CGt() {
        return this.A09;
    }

    public final Float CHS() {
        return this.A0A;
    }

    public final Float CHZ() {
        return this.A0B;
    }

    public final Integer CTN() {
        return this.A0C;
    }

    public final Integer CUa() {
        return this.A0D;
    }

    public final Integer CZ9() {
        return this.A0E;
    }

    public final Integer CcV() {
        return this.A0F;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryMusicStickerTappableObject", B5P.A00(this));
    }

    public final String getId() {
        return this.A0L;
    }

    public final String getMediaType() {
        return this.A0M;
    }

    public C255683uY(OriginalSoundData originalSoundData, StickerTraySurface stickerTraySurface, SubscriptionStickerDict subscriptionStickerDict, MusicOverlayStickerModel musicOverlayStickerModel, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A0H = str;
        this.A0I = str2;
        this.A0J = str3;
        this.A0K = str4;
        this.A04 = f;
        this.A05 = f2;
        this.A0L = str5;
        this.A0C = num;
        this.A0D = num2;
        this.A0E = num3;
        this.A0F = num4;
        this.A0M = str6;
        this.A03 = musicOverlayStickerModel;
        this.A00 = originalSoundData;
        this.A06 = f3;
        this.A07 = f4;
        this.A0G = num5;
        this.A02 = subscriptionStickerDict;
        this.A01 = stickerTraySurface;
        this.A08 = f5;
        this.A09 = f6;
        this.A0A = f7;
        this.A0B = f8;
    }

    public final C255693uZ E8m(1E9 r1) {
        return this;
    }
}
