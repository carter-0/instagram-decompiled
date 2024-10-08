package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.ARAudioEffectData;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.8aC  reason: invalid class name and case insensitive filesystem */
public final class C357998aC {
    public int A00;
    public ARAudioEffectData A01;
    public C353518Hy A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;

    public final void A01(C353518Hy r20, AudioOverlayTrack audioOverlayTrack) {
        AudioOverlayTrack audioOverlayTrack2 = audioOverlayTrack;
        MusicAssetModel musicAssetModel = audioOverlayTrack2.A08;
        C353518Hy r3 = r20;
        if (musicAssetModel == null) {
            this.A03.schedule(new C40277AYs(r3));
            return;
        }
        this.A02 = r3;
        int i = audioOverlayTrack2.A03;
        int i2 = audioOverlayTrack2.A02;
        double d = ((double) i) / 1000.0d;
        String str = musicAssetModel.A0D;
        String str2 = musicAssetModel.A0I;
        String str3 = musicAssetModel.A0B;
        this.A01 = new ARAudioEffectData(str3, str2, str, (List) null, (List) null, 0.0d, ((double) musicAssetModel.A00) / 1000.0d, d, d + (((double) i2) / 1000.0d));
        this.A00 = 0;
        UserSession userSession = this.A04;
        1OC A002 = AnonymousClass9SP.A00(userSession, musicAssetModel.A0E, str3);
        A002.A00 = new AnonymousClass9SW(this);
        String format = String.format(Locale.US, "music/track/%s/beats/", Arrays.copyOf(new Object[]{musicAssetModel.A0B}, 1));
        0qQ.A07(format);
        1NY r32 = new 1NY(userSession, -2);
        r32.A08(AnonymousClass05K.A0N);
        r32.A0E = format;
        r32.A9m("product", C14245TsS.A00(MusicProduct.CLIPS_CAMERA_FORMAT_V2));
        r32.A0O((15p) null, C379119So.class, C379109Sn.class, false);
        r32.A07(AnonymousClass05K.A0Y);
        r32.A0A = format;
        1OC A0M = r32.A0M();
        A0M.A00 = new AnonymousClass9SX(this);
        AnonymousClass4DH r0 = this.A03;
        r0.schedule(A002);
        r0.schedule(A0M);
    }

    public static final void A00(C357998aC r1, ARAudioEffectData aRAudioEffectData) {
        C353518Hy r0 = r1.A02;
        if (r0 != null) {
            r0.Csr(aRAudioEffectData);
        }
        r1.A01 = null;
        r1.A02 = null;
        r1.A00 = 0;
    }

    public C357998aC(AnonymousClass4DH r1, UserSession userSession) {
        this.A04 = userSession;
        this.A03 = r1;
    }
}
