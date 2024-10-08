package X;

import com.instagram.api.schemas.AudioBrowserCategoryType;
import com.instagram.api.schemas.AudioBrowserPlaylistType;

/* renamed from: X.JuI  reason: case insensitive filesystem */
public final class C60960JuI extends AnonymousClass0T0 {
    public final int A00;
    public final AudioBrowserCategoryType A01;
    public final AudioBrowserPlaylistType A02;
    public final C66569MWx A03;
    public final JZC A04;
    public final Integer A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60960JuI) {
                C60960JuI juI = (C60960JuI) obj;
                if (!0qQ.A0K(this.A06, juI.A06) || !0qQ.A0K(this.A07, juI.A07) || this.A02 != juI.A02 || this.A00 != juI.A00 || !0qQ.A0K(this.A04, juI.A04) || !0qQ.A0K(this.A03, juI.A03) || this.A05 != juI.A05 || this.A01 != juI.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        int A0O = AnonymousClass7TE.A0O(this.A06);
        int A072 = (AnonymousClass7TF.A07(this.A04, (((AnonymousClass7TF.A08(this.A07, A0O) + AnonymousClass7TG.A0C(this.A02)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31;
        Integer num = this.A05;
        if (num == null) {
            A0D = 0;
        } else {
            A0D = C51971G9r.A0D(num, C39559A0b.A00(num));
        }
        return ((A072 + A0D) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C60960JuI(AudioBrowserCategoryType audioBrowserCategoryType, AudioBrowserPlaylistType audioBrowserPlaylistType, C66569MWx mWx, JZC jzc, Integer num, String str, String str2, int i) {
        this.A06 = str;
        this.A07 = str2;
        this.A02 = audioBrowserPlaylistType;
        this.A00 = i;
        this.A04 = jzc;
        this.A03 = mWx;
        this.A05 = num;
        this.A01 = audioBrowserCategoryType;
    }
}
