package X;

import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicDataSource;
import java.util.List;

/* renamed from: X.Uq6  reason: case insensitive filesystem */
public final class C16181Uq6 extends V2X {
    public AudioPageMetadata A00;
    public final ImageUrl A01;
    public final MusicDataSource A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C16181Uq6) {
                C16181Uq6 uq6 = (C16181Uq6) obj;
                if (!0qQ.A0K(this.A07, uq6.A07) || !0qQ.A0K(this.A09, uq6.A09) || !0qQ.A0K(this.A0A, uq6.A0A) || !0qQ.A0K(this.A0B, uq6.A0B) || !0qQ.A0K(this.A01, uq6.A01) || this.A0E != uq6.A0E || this.A0G != uq6.A0G || !0qQ.A0K(this.A02, uq6.A02) || !0qQ.A0K(this.A0C, uq6.A0C) || !0qQ.A0K(this.A00, uq6.A00) || !0qQ.A0K(this.A04, uq6.A04) || !0qQ.A0K(this.A05, uq6.A05) || !0qQ.A0K(this.A03, uq6.A03) || this.A0D != uq6.A0D || !0qQ.A0K(this.A08, uq6.A08) || !0qQ.A0K(this.A06, uq6.A06) || this.A0F != uq6.A0F) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A09, AnonymousClass7TE.A0O(this.A07));
        int A092 = AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A08(this.A0A, A082) + AnonymousClass7TG.A0E(this.A0B)) * 31)));
        AudioPageMetadata audioPageMetadata = this.A00;
        boolean z = this.A0D;
        return DbS.A06(this.A0F, (((AnonymousClass7TF.A09(z, (((((AnonymousClass7TF.A07(audioPageMetadata, (AnonymousClass7TF.A07(this.A02, A092) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + C41845B3m.A00(this.A06)) * 31);
    }

    public C16181Uq6(AudioPageMetadata audioPageMetadata, ImageUrl imageUrl, MusicDataSource musicDataSource, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass7TG.A1U(str, str2, str3);
        0qQ.A0B(imageUrl, 5);
        this.A07 = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A01 = imageUrl;
        this.A0E = z;
        this.A0G = z2;
        this.A02 = musicDataSource;
        this.A0C = list;
        this.A00 = audioPageMetadata;
        this.A04 = num;
        this.A05 = num2;
        this.A03 = num3;
        this.A0D = z3;
        this.A08 = str5;
        this.A06 = str6;
        this.A0F = z4;
    }
}
