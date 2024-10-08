package X;

import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.HpG  reason: case insensitive filesystem */
public final class C55895HpG {
    public final N49 A00;
    public final OriginalAudioSubtype A01;
    public final MusicAttributionConfig A02;
    public final AudioType A03;
    public final User A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C55895HpG(N49 n49, OriginalAudioSubtype originalAudioSubtype, MusicAttributionConfig musicAttributionConfig, AudioType audioType, User user, Integer num, String str, String str2, String str3, String str4, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(list, 3);
        this.A0E = z;
        this.A03 = audioType;
        this.A0A = list;
        this.A09 = str;
        this.A0D = z2;
        this.A01 = originalAudioSubtype;
        this.A06 = str2;
        this.A07 = str3;
        this.A04 = user;
        this.A0G = z3;
        this.A08 = str4;
        this.A0F = z4;
        this.A05 = num;
        this.A0B = list2;
        this.A02 = musicAttributionConfig;
        this.A0C = list3;
        this.A00 = n49;
    }
}
