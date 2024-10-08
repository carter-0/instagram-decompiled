package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.TrackSnippet;

/* renamed from: X.LuO  reason: case insensitive filesystem */
public final class C65500LuO implements C357888a1, C357908a3, C357898a2 {
    public final int A00;
    public final Object A01;

    public C65500LuO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static boolean A00(C65500LuO luO) {
        AudioOverlayTrack audioOverlayTrack = ((C61412K6j) luO.A01).A01;
        if (audioOverlayTrack == null) {
            0qQ.A0F("audioTrack");
            throw AnonymousClass00P.createAndThrow();
        } else if (audioOverlayTrack.A0E == null) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean ACI() {
        return true;
    }

    public final /* synthetic */ void ATW() {
        switch (this.A00) {
            case 1:
            case 6:
                Intent A09 = DbS.A09();
                A09.putExtra("extra_back_to_search", true);
                Dba.A0k(((Fragment) this.A01).requireActivity(), A09);
                return;
            case 2:
                Dbb.A1S(this.A01);
                return;
            default:
                return;
        }
    }

    public final int BPD() {
        AudioOverlayTrack audioOverlayTrack;
        switch (this.A00) {
            case 0:
                audioOverlayTrack = ((K6x) this.A01).A01;
                break;
            case 3:
                audioOverlayTrack = ((K7I) this.A01).A02;
                break;
            case 4:
                audioOverlayTrack = ((K73) this.A01).A00;
                break;
            case 5:
                audioOverlayTrack = (AudioOverlayTrack) ((K7J) this.A01).A03.getValue();
                break;
            case 6:
                return 15;
            default:
                return 90;
        }
        if (audioOverlayTrack == null) {
            0qQ.A0F("currentAudioOverlayTrack");
            throw AnonymousClass00P.createAndThrow();
        }
        return audioOverlayTrack.A02;
    }

    public final MusicOverlayStickerModel BUu() {
        switch (this.A00) {
            case 0:
                throw AnonymousClass7TE.A0z("This editor does not support adding sticker");
            case 1:
                throw AnonymousClass7TE.A0z("The Composer format does not support the sticker in the music editor");
            case 2:
                throw AnonymousClass7TE.A0z("The Composer format does not support the sticker in the music editor");
            case 3:
                throw AnonymousClass7TE.A0z("Music On Profile does not support the sticker in the music editor");
            case 4:
                throw AnonymousClass7TE.A0z("Music On Profile does not support the sticker in the music editor");
            case 5:
                throw AnonymousClass7TE.A0z("Sticker not supported on wall");
            default:
                throw AnonymousClass7TE.A0z("The clips edit format does not support the sticker in the music editor");
        }
    }

    public final String BXe(boolean z) {
        if (6 - this.A00 != 0) {
            return "";
        }
        return DbT.A08(this.A01).getString(2131955512);
    }

    public final boolean BuA() {
        return false;
    }

    public final /* synthetic */ void CLM() {
    }

    public final boolean CPG() {
        return false;
    }

    public final boolean CRK() {
        switch (this.A00) {
            case 0:
                return true;
            case 6:
                return ((K6e) this.A01).A06;
            default:
                return false;
        }
    }

    public final boolean CRW() {
        switch (this.A00) {
            case 0:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public final boolean CW3() {
        if (6 - this.A00 != 0) {
            return false;
        }
        return true;
    }

    public final boolean CZL() {
        switch (this.A00) {
            case 0:
            case 6:
                return false;
            case 1:
                return !A00(this);
            default:
                return true;
        }
    }

    public final boolean Cai() {
        return false;
    }

    public final boolean CcC() {
        switch (this.A00) {
            case 0:
            case 6:
                return false;
            case 1:
                return !A00(this);
            default:
                return true;
        }
    }

    public final boolean CcD() {
        switch (this.A00) {
            case 1:
                return !A00(this);
            case 2:
                return true;
            default:
                return false;
        }
    }

    public final boolean CcE() {
        switch (this.A00) {
            case 1:
                return !A00(this);
            case 2:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public final boolean CcY() {
        return false;
    }

    public final boolean CdS() {
        return true;
    }

    public final void Cuw() {
        String str;
        switch (this.A00) {
            case 0:
                K6x k6x = (K6x) this.A01;
                C357918a4 r0 = k6x.A02;
                if (r0 == null) {
                    str = "musicOverlayEditController";
                } else {
                    r0.A0G();
                    C3516289p r1 = k6x.A00;
                    if (r1 == null) {
                        str = "delegate";
                    } else {
                        r1.Cxc(false);
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 1:
            case 6:
                Intent A09 = DbS.A09();
                A09.putExtra("extra_back_to_search", true);
                Dba.A0k(((Fragment) this.A01).requireActivity(), A09);
                return;
            case 2:
                Dbb.A1S(this.A01);
                return;
            default:
                return;
        }
    }

    public final boolean Cxa() {
        switch (this.A00) {
            case 0:
                if (((K6x) this.A01).A03) {
                    return false;
                }
                Cuw();
                return true;
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    public final void D89() {
        switch (this.A00) {
            case 0:
                C3516289p r0 = ((K6x) this.A01).A00;
                if (r0 == null) {
                    JTO.A1K();
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    r0.D89();
                    return;
                }
            case 6:
                Dba.A0k(((Fragment) this.A01).requireActivity(), DbS.A09());
                return;
            default:
                return;
        }
    }

    public final void D9r(AnonymousClass8IJ r7, TrackSnippet trackSnippet, Integer num) {
        String str;
        TrackSnippet trackSnippet2 = trackSnippet;
        switch (this.A00) {
            case 0:
                0qQ.A0B(trackSnippet, 1);
                K6x k6x = (K6x) this.A01;
                AudioOverlayTrack audioOverlayTrack = k6x.A01;
                if (audioOverlayTrack == null) {
                    str = "currentAudioOverlayTrack";
                    break;
                } else {
                    MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                    if (musicAssetModel != null) {
                        C3516289p r0 = k6x.A00;
                        if (r0 == null) {
                            str = "delegate";
                            break;
                        } else {
                            r0.D9q((AnonymousClass8IJ) null, musicAssetModel, trackSnippet2, (C349337zz) null, AnonymousClass05K.A0C);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            case 6:
                AnonymousClass7TG.A1O(trackSnippet, num);
                K6e k6e = (K6e) this.A01;
                AudioOverlayTrack audioOverlayTrack2 = k6e.A02;
                if (audioOverlayTrack2 == null) {
                    str = "audioTrack";
                    break;
                } else {
                    Dba.A0k(k6e.requireActivity(), JTV.A00(audioOverlayTrack2, trackSnippet));
                    return;
                }
            default:
                return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void DSF(Integer num) {
        if (3 - this.A00 == 0) {
            0qQ.A0B(num, 0);
            ((K7I) this.A01).A04 = num;
        }
    }

    public final /* synthetic */ void DSq() {
    }

    public final /* synthetic */ void DSr() {
    }

    public final /* synthetic */ void DvW(int i) {
        AudioOverlayTrack audioOverlayTrack;
        switch (this.A00) {
            case 1:
                audioOverlayTrack = ((C61412K6j) this.A01).A01;
                break;
            case 2:
                audioOverlayTrack = ((C61413K6k) this.A01).A00;
                break;
            default:
                return;
        }
        if (audioOverlayTrack != null) {
            audioOverlayTrack.A02 = i;
        } else {
            0qQ.A0F("audioTrack");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DvX(int i) {
        AudioOverlayTrack audioOverlayTrack;
        switch (this.A00) {
            case 3:
                audioOverlayTrack = ((K7I) this.A01).A02;
                break;
            case 4:
                audioOverlayTrack = ((K73) this.A01).A00;
                break;
            case 5:
                audioOverlayTrack = (AudioOverlayTrack) ((K7J) this.A01).A03.getValue();
                break;
            default:
                return;
        }
        if (audioOverlayTrack == null) {
            0qQ.A0F("currentAudioOverlayTrack");
            throw AnonymousClass00P.createAndThrow();
        }
        audioOverlayTrack.A03 = i;
    }

    public final /* synthetic */ void EuN() {
    }

    public final /* synthetic */ void Cwe(AnonymousClass8IJ r1, TrackSnippet trackSnippet, boolean z) {
    }
}
