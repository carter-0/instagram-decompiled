package X;

import com.instagram.api.schemas.AudioNoteResponseInfo;
import com.instagram.api.schemas.AvatarNoteResponseInfo;
import com.instagram.api.schemas.GIFNoteResponseInfo;
import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.LiveNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.api.schemas.NoteChatResponseInfo;

/* renamed from: X.5y2  reason: invalid class name and case insensitive filesystem */
public final class C300845y2 extends AnonymousClass0T0 implements C300855y3 {
    public final AudioNoteResponseInfo A00;
    public final AvatarNoteResponseInfo A01;
    public final GIFNoteResponseInfo A02;
    public final AnonymousClass605 A03;
    public final ListeningNowResponseInfo A04;
    public final LiveNoteResponseInfo A05;
    public final LocationNoteResponseInfo A06;
    public final MusicNoteResponseInfo A07;
    public final NoteChatResponseInfo A08;
    public final AnonymousClass60C A09;
    public final AnonymousClass60E A0A;
    public final AnonymousClass60F A0B;
    public final AnonymousClass60H A0C;

    public final C300845y2 F6x(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C300845y2) {
                C300845y2 r5 = (C300845y2) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AudioNoteResponseInfo audioNoteResponseInfo = this.A00;
        int i = 0;
        int hashCode = (audioNoteResponseInfo == null ? 0 : audioNoteResponseInfo.hashCode()) * 31;
        AvatarNoteResponseInfo avatarNoteResponseInfo = this.A01;
        int hashCode2 = (hashCode + (avatarNoteResponseInfo == null ? 0 : avatarNoteResponseInfo.hashCode())) * 31;
        GIFNoteResponseInfo gIFNoteResponseInfo = this.A02;
        int hashCode3 = (hashCode2 + (gIFNoteResponseInfo == null ? 0 : gIFNoteResponseInfo.hashCode())) * 31;
        AnonymousClass605 r0 = this.A03;
        int hashCode4 = (hashCode3 + (r0 == null ? 0 : r0.hashCode())) * 31;
        ListeningNowResponseInfo listeningNowResponseInfo = this.A04;
        int hashCode5 = (hashCode4 + (listeningNowResponseInfo == null ? 0 : listeningNowResponseInfo.hashCode())) * 31;
        LiveNoteResponseInfo liveNoteResponseInfo = this.A05;
        int hashCode6 = (hashCode5 + (liveNoteResponseInfo == null ? 0 : liveNoteResponseInfo.hashCode())) * 31;
        LocationNoteResponseInfo locationNoteResponseInfo = this.A06;
        int hashCode7 = (hashCode6 + (locationNoteResponseInfo == null ? 0 : locationNoteResponseInfo.hashCode())) * 31;
        MusicNoteResponseInfo musicNoteResponseInfo = this.A07;
        int hashCode8 = (hashCode7 + (musicNoteResponseInfo == null ? 0 : musicNoteResponseInfo.hashCode())) * 31;
        NoteChatResponseInfo noteChatResponseInfo = this.A08;
        int hashCode9 = (hashCode8 + (noteChatResponseInfo == null ? 0 : noteChatResponseInfo.hashCode())) * 31;
        AnonymousClass60C r02 = this.A09;
        int hashCode10 = (hashCode9 + (r02 == null ? 0 : r02.hashCode())) * 31;
        AnonymousClass60E r03 = this.A0A;
        int hashCode11 = (hashCode10 + (r03 == null ? 0 : r03.hashCode())) * 31;
        AnonymousClass60F r04 = this.A0B;
        int hashCode12 = (hashCode11 + (r04 == null ? 0 : r04.hashCode())) * 31;
        AnonymousClass60H r05 = this.A0C;
        if (r05 != null) {
            i = r05.hashCode();
        }
        return hashCode12 + i;
    }

    public C300845y2(AudioNoteResponseInfo audioNoteResponseInfo, AvatarNoteResponseInfo avatarNoteResponseInfo, GIFNoteResponseInfo gIFNoteResponseInfo, AnonymousClass605 r4, ListeningNowResponseInfo listeningNowResponseInfo, LiveNoteResponseInfo liveNoteResponseInfo, LocationNoteResponseInfo locationNoteResponseInfo, MusicNoteResponseInfo musicNoteResponseInfo, NoteChatResponseInfo noteChatResponseInfo, AnonymousClass60C r10, AnonymousClass60E r11, AnonymousClass60F r12, AnonymousClass60H r13) {
        this.A00 = audioNoteResponseInfo;
        this.A01 = avatarNoteResponseInfo;
        this.A02 = gIFNoteResponseInfo;
        this.A03 = r4;
        this.A04 = listeningNowResponseInfo;
        this.A05 = liveNoteResponseInfo;
        this.A06 = locationNoteResponseInfo;
        this.A07 = musicNoteResponseInfo;
        this.A08 = noteChatResponseInfo;
        this.A09 = r10;
        this.A0A = r11;
        this.A0B = r12;
        this.A0C = r13;
    }
}
