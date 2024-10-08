package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.SmartReelType;
import com.instagram.model.reels.ReelType;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

/* renamed from: X.Jub  reason: case insensitive filesystem */
public final class C60979Jub extends AnonymousClass0T0 {
    public boolean A00;
    public final MediaComposition A01;
    public final ACRType A02;
    public final SmartReelType A03;
    public final DT1 A04;
    public final ReelType A05;
    public final AudioOverlayTrack A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final List A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60979Jub) {
                C60979Jub jub = (C60979Jub) obj;
                if (!0qQ.A0K(this.A08, jub.A08) || this.A02 != jub.A02 || !0qQ.A0K(this.A07, jub.A07) || !0qQ.A0K(this.A0A, jub.A0A) || !0qQ.A0K(this.A0B, jub.A0B) || this.A03 != jub.A03 || this.A05 != jub.A05 || !0qQ.A0K(this.A04, jub.A04) || !0qQ.A0K(this.A09, jub.A09) || !0qQ.A0K(this.A0C, jub.A0C) || !0qQ.A0K(this.A01, jub.A01) || !0qQ.A0K(this.A06, jub.A06) || !0qQ.A0K(this.A0D, jub.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A08)) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A0D);
    }

    public C60979Jub(MediaComposition mediaComposition, ACRType aCRType, SmartReelType smartReelType, DT1 dt1, ReelType reelType, AudioOverlayTrack audioOverlayTrack, String str, String str2, String str3, String str4, String str5, List list, List list2) {
        AnonymousClass7TG.A1O(str, aCRType);
        this.A08 = str;
        this.A02 = aCRType;
        this.A07 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A03 = smartReelType;
        this.A05 = reelType;
        this.A04 = dt1;
        this.A09 = str5;
        this.A0C = list;
        this.A01 = mediaComposition;
        this.A06 = audioOverlayTrack;
        this.A0D = list2;
    }
}
