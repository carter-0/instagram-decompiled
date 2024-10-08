package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.TrackSnippet;
import java.util.List;

/* renamed from: X.LuN  reason: case insensitive filesystem */
public final class C65499LuN implements C357888a1, C66534MVo {
    public C62642Kk4 A00;
    public C371088xY A01;
    public AudioOverlayTrack A02;
    public AudioOverlayTrack A03;
    public final int A04;
    public final Context A05;
    public final View A06;
    public final C357918a4 A07;
    public final AnonymousClass3Q2 A08;
    public final ImageView A09;
    public final UserSession A0A;
    public final C3499682q A0B;
    public final C267834cI A0C;
    public final String A0D;
    public final 0sP A0E;
    public final boolean A0F;

    public final boolean ACI() {
        return true;
    }

    public final /* synthetic */ void ATW() {
    }

    public final int BPD() {
        return 90;
    }

    public final String BXe(boolean z) {
        return "";
    }

    public final /* synthetic */ void CLM() {
    }

    public final boolean CPG() {
        return false;
    }

    public final /* synthetic */ void Cuw() {
    }

    public final /* synthetic */ void Cwe(AnonymousClass8IJ r1, TrackSnippet trackSnippet, boolean z) {
    }

    public final boolean Cxa() {
        return false;
    }

    public final /* synthetic */ void D89() {
    }

    public final /* synthetic */ void D9r(AnonymousClass8IJ r1, TrackSnippet trackSnippet, Integer num) {
    }

    public final /* synthetic */ void DSF(Integer num) {
    }

    public final /* synthetic */ void DSq() {
    }

    public final /* synthetic */ void DSr() {
    }

    public final /* synthetic */ void EuN() {
    }

    public C65499LuN(Context context, ImageView imageView, AnonymousClass4DH r26, UserSession userSession, C3499682q r28, AnonymousClass3Q2 r29, C267834cI r30, String str, 0sP r32, int i) {
        MusicAttributionConfig musicAttributionConfig;
        C3499682q r1 = r28;
        String str2 = str;
        0qQ.A0B(str2, 4);
        UserSession userSession2 = userSession;
        this.A0A = userSession2;
        Context context2 = context;
        this.A05 = context2;
        this.A0D = str2;
        AnonymousClass3Q2 r3 = r29;
        this.A08 = r3;
        this.A0B = r1;
        this.A09 = imageView;
        this.A0E = r32;
        this.A0C = r30;
        this.A04 = i;
        View inflate = LayoutInflater.from(context2).inflate(R.layout.fragment_creation_edit_music_editor, (ViewGroup) null);
        0qQ.A07(inflate);
        this.A06 = inflate;
        AnonymousClass4DH r11 = r26;
        if (!AnonymousClass1GD.A03() && !JWB.A01(userSession2)) {
            r11.requireActivity().getTheme().applyStyle(R.style.MusicCreationLightOverlayTheme, true);
        }
        C357918a4 r8 = new C357918a4(JTR.A0X(inflate, R.id.music_editor_stub), new AnonymousClass9I6(0, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size, 2, 1, false), r11, userSession2, (TargetViewSizeProvider) null, this, C3515689j.UNKNOWN, 0, false, false, false, true, false, false);
        this.A07 = r8;
        r8.A0b = new AnonymousClass85s(context2, userSession2, (AnonymousClass4DU) null, new C234462xu(context2, userSession2), new C65506LuU(this, 3));
        MediaCaptureConfig mediaCaptureConfig = ((JWE) r1).A01.A09;
        if (!(mediaCaptureConfig == null || (musicAttributionConfig = mediaCaptureConfig.A00) == null || r3.A1J != null)) {
            MusicProduct musicProduct = MusicProduct.MUSIC_IN_FEED;
            MusicAssetModel musicAssetModel = musicAttributionConfig.A02;
            if (musicAssetModel != null) {
                r3.A1J = C59670JTa.A03(musicProduct, musicAssetModel, 30000, Integer.valueOf(musicAttributionConfig.A00), str2);
            } else {
                throw DbU.A0h();
            }
        }
        this.A0F = true;
    }

    private final void A00() {
        Integer num;
        AnonymousClass3Q2 r2 = this.A08;
        MusicOverlayStickerModel musicOverlayStickerModel = r2.A1J;
        if (musicOverlayStickerModel != null) {
            if (DbX.A1a(musicOverlayStickerModel.A0E)) {
                num = musicOverlayStickerModel.A0N;
            } else {
                num = musicOverlayStickerModel.A0O;
            }
            this.A03 = new AudioOverlayTrack(MusicAssetModel.A03(r2.A1J), AnonymousClass7TG.A0A(musicOverlayStickerModel.A0K), C51967G9n.A04(num, 30000));
        }
    }

    private final void A01() {
        Drawable drawable;
        ImageUrl imageUrl;
        Context context = this.A05;
        C267834cI r7 = this.A0C;
        AnonymousClass3Q2 r6 = this.A08;
        UserSession userSession = this.A0A;
        AudioOverlayTrack audioOverlayTrack = this.A03;
        C3499682q r1 = this.A0B;
        C64132LPg.A00(context, userSession, ((JWE) r1).A01.A09, audioOverlayTrack, r6, r7, this.A0D, r1.FN1(), AnonymousClass7TE.A1b(r1.FN1()), true);
        ImageView imageView = this.A09;
        if (imageView != null) {
            MusicOverlayStickerModel musicOverlayStickerModel = r6.A1J;
            if (musicOverlayStickerModel == null || (imageUrl = musicOverlayStickerModel.A03) == null) {
                drawable = context.getDrawable(this.A04);
                if (drawable == null) {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                drawable = C63350KvX.A00(context, imageUrl);
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public final void A02() {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        if (audioOverlayTrack == null) {
            A00();
            audioOverlayTrack = this.A03;
            this.A02 = audioOverlayTrack;
            if (audioOverlayTrack == null) {
                return;
            }
        }
        MusicOverlayStickerModel musicOverlayStickerModel = this.A08.A1J;
        C357918a4 r2 = this.A07;
        if (musicOverlayStickerModel != null) {
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                r2.A0K(musicAssetModel, audioOverlayTrack.A03, false);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        MusicAssetModel musicAssetModel2 = audioOverlayTrack.A08;
        if (musicAssetModel2 != null) {
            r2.A0L(musicAssetModel2, false);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (X.0qQ.A0K(r2, r1) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C66569MWx r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x001f
            com.instagram.music.common.model.AudioOverlayTrack r1 = r4.A03
            r0 = 0
            if (r1 == 0) goto L_0x0025
            java.lang.String r2 = r5.getId()
            com.instagram.music.common.model.AudioOverlayTrack r1 = r4.A03
            if (r1 == 0) goto L_0x0023
            com.instagram.music.common.model.MusicAssetModel r1 = r1.A08
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = r1.A0E
        L_0x0015:
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0025
        L_0x001b:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r4.A03
        L_0x001d:
            r4.A02 = r0
        L_0x001f:
            r4.A02()
            return
        L_0x0023:
            r1 = r0
            goto L_0x0015
        L_0x0025:
            X.3Q2 r3 = r4.A08
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = r3.A1J
            if (r1 == 0) goto L_0x003f
            java.lang.String r2 = r5.getId()
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = r3.A1J
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = r1.A0S
        L_0x0035:
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x003f
            r4.A00()
            goto L_0x001b
        L_0x003f:
            com.instagram.music.common.model.AudioType r1 = com.instagram.music.common.model.AudioType.ORIGINAL_AUDIO
            com.instagram.music.common.model.AudioType r0 = r5.CAc()
            if (r1 != r0) goto L_0x0050
            int r0 = r5.C95()
        L_0x004b:
            com.instagram.music.common.model.AudioOverlayTrack r0 = X.C63347KvU.A00(r5, r0)
            goto L_0x001d
        L_0x0050:
            r0 = 30000(0x7530, float:4.2039E-41)
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65499LuN.A03(X.MWx):void");
    }

    public final MusicOverlayStickerModel BUu() {
        throw AnonymousClass7TE.A0z("The Composer format does not support the sticker in the music editor");
    }

    public final boolean BuA() {
        return false;
    }

    public final boolean CRK() {
        return false;
    }

    public final boolean CRW() {
        return false;
    }

    public final boolean CW3() {
        return false;
    }

    public final boolean CZL() {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        boolean z = true;
        if (audioOverlayTrack == null || audioOverlayTrack.A0E == null) {
            z = false;
        }
        return !z;
    }

    public final boolean Cai() {
        return false;
    }

    public final boolean CcC() {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        boolean z = true;
        if (audioOverlayTrack == null || audioOverlayTrack.A0E == null) {
            z = false;
        }
        return !z;
    }

    public final boolean CcD() {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        boolean z = true;
        if (audioOverlayTrack == null || audioOverlayTrack.A0E == null) {
            z = false;
        }
        return !z;
    }

    public final boolean CcE() {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        boolean z = true;
        if (audioOverlayTrack == null || audioOverlayTrack.A0E == null) {
            z = false;
        }
        return !z;
    }

    public final boolean CcY() {
        return false;
    }

    public final boolean CdS() {
        return this.A0F;
    }

    public final void CuZ(boolean z) {
        String str;
        String str2;
        MusicAssetModel musicAssetModel;
        MusicAssetModel musicAssetModel2;
        27r A012 = 27p.A01(this.A0A);
        if (!z) {
            AudioOverlayTrack audioOverlayTrack = this.A03;
            if (audioOverlayTrack == null || (musicAssetModel2 = audioOverlayTrack.A08) == null) {
                str = null;
            } else {
                str = musicAssetModel2.A0E;
            }
            AudioOverlayTrack audioOverlayTrack2 = this.A02;
            if (audioOverlayTrack2 == null || (musicAssetModel = audioOverlayTrack2.A08) == null) {
                str2 = null;
            } else {
                str2 = musicAssetModel.A0E;
            }
            if (0qQ.A0K(str, str2)) {
                this.A03 = null;
                A01();
            }
            A012.A0t(this.A00, this.A01, C59725JVj.POST_CAPTURE);
            A012.A03.A01();
        } else {
            this.A03 = this.A02;
            C59725JVj jVj = C59725JVj.POST_CAPTURE;
            C371088xY r7 = this.A01;
            C62642Kk4 kk4 = this.A00;
            29R r4 = A012.A09;
            28t r6 = A012.A04.A0A;
            29H r3 = A012.A03;
            r4.A0R(kk4, r6, r7, jVj, (AnonymousClass80P) null, (Boolean) null, (Long) null, (Long) null, "AUDIO_EDITOR_PAGE_DONE_BUTTON", (String) null, r3.A07, (List) null, false, false);
            29Y r62 = A012.A0E;
            C62642Kk4 kk42 = this.A00;
            1Ln A0A2 = 1Ln.A0A(r62.A01);
            if (DbT.A1Y(A0A2)) {
                A0A2.A0M(AnonymousClass80P.MUSIC, "tool_type");
                29Y.A00(A0A2, r62);
                JTQ.A1B(A0A2, r62.A04);
                A0A2.A0d(jVj);
                JTQ.A1A(A0A2);
                A0A2.A0a(C279294yP.FEED);
                A0A2.A0M(kk42, "audio_editor_entry_point");
                JTS.A1E(A0A2);
            }
            r3.A01();
            A01();
        }
        this.A0E.invoke(this.A03);
        this.A02 = null;
        this.A00 = null;
        C357918a4 r0 = this.A07;
        r0.A0G = null;
        r0.A0M();
    }

    public final void DvW(int i) {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        if (audioOverlayTrack != null) {
            audioOverlayTrack.A02 = i;
        }
    }

    public final void DvX(int i) {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        if (audioOverlayTrack != null) {
            audioOverlayTrack.A03 = i;
        }
    }

    public final String getTitle() {
        return AnonymousClass7TE.A16(this.A05, 2131955187);
    }

    public final void onPause() {
        this.A07.A0G();
    }

    public final void onResume() {
        this.A07.A0H();
    }

    public final View AZq(Context context) {
        return this.A06;
    }

    public final /* synthetic */ boolean CIj(View view, MotionEvent motionEvent) {
        return false;
    }

    public final /* synthetic */ boolean CNF(C60060Jeb jeb, PhotoFilter photoFilter) {
        return false;
    }

    public final /* synthetic */ boolean CNG(C60060Jeb jeb, FilterGroupModel filterGroupModel) {
        return false;
    }

    public final /* synthetic */ boolean Dij(View view, ViewGroup viewGroup, C353998Kg r4, FilterGroupModel filterGroupModel) {
        return false;
    }
}
