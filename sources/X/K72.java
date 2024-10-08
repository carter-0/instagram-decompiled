package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.IOException;
import java.io.StringWriter;

public final class K72 extends AnonymousClass4DH implements AnonymousClass4DU, C268594df, C66495MTy {
    public static final String __redex_internal_original_name = "MusicConsumptionSheetFragment";
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public IgImageView A04;
    public Reel A05;
    public C65505LuT A06;
    public C65602Lwc A07;
    public C66408MQo A08;
    public MusicOverlayStickerModel A09;
    public C234462xu A0A;
    public L53 A0B;
    public String A0C;
    public final String A0D = AnonymousClass000.A00(4062);
    public final AnonymousClass0eM A0E = C227642jf.A02(this);
    public final boolean A0F = true;
    public final boolean A0G = true;

    public final int AqL() {
        return -2;
    }

    public final float CMx() {
        return 1.0f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r6 = 0
            X.0qQ.A0B(r9, r6)
            super.onViewCreated(r9, r10)
            r0 = 2131443131(0x7f0b3dbb, float:1.8508321E38)
            android.view.View r3 = X.AnonymousClass7TE.A0b(r9, r0)
            r0 = 2131443132(0x7f0b3dbc, float:1.8508323E38)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = X.JTR.A0i(r9, r0)
            r0 = 2131443133(0x7f0b3dbd, float:1.8508325E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r9, r0)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r1 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r1
            X.Lwc r0 = new X.Lwc
            r0.<init>(r3, r2, r1)
            r8.A07 = r0
            r0 = 2131443141(0x7f0b3dc5, float:1.8508342E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r9, r0)
            r8.A03 = r0
            r0 = 2131428153(0x7f0b0339, float:1.8477942E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.JTO.A0Y(r9, r0)
            r8.A04 = r0
            r0 = 2131428157(0x7f0b033d, float:1.847795E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r9, r0)
            r8.A02 = r0
            r0 = 2131428149(0x7f0b0335, float:1.8477934E38)
            android.view.View r0 = r9.findViewById(r0)
            r8.A00 = r0
            r0 = 2131436712(0x7f0b24a8, float:1.8495302E38)
            android.view.View r0 = r9.findViewById(r0)
            r8.A01 = r0
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = r8.A09
            if (r1 == 0) goto L_0x0074
            boolean r0 = r1.A0t
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = r1.A0m
            if (r0 == 0) goto L_0x006e
            int r0 = r0.length()
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = r1.A0Y
            if (r0 == 0) goto L_0x006e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0074
        L_0x006e:
            r0 = 8
            r8.A00(r0)
            return
        L_0x0074:
            r3 = 0
            r8.A00(r6)
            com.instagram.music.common.model.MusicOverlayStickerModel r7 = r8.A09
            if (r7 == 0) goto L_0x0167
            X.Lwc r0 = r8.A07
            if (r0 == 0) goto L_0x013c
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A01
            com.instagram.common.typedurl.ImageUrl r0 = r7.A04
            X.JYP.A02(r0, r1, r8)
            X.Lwc r0 = r8.A07
            if (r0 == 0) goto L_0x013c
            android.view.View r0 = r0.A00
            X.3NG r1 = X.AnonymousClass7TE.A0m(r0)
            r5 = 1
            r1.A0C = r5
            r1.A07 = r5
            r0 = 32
            X.C61685KHt.A00(r1, r8, r0)
            android.widget.TextView r1 = r8.A03
            if (r1 != 0) goto L_0x00a9
            java.lang.String r7 = "trackTitle"
        L_0x00a1:
            X.0qQ.A0F(r7)
        L_0x00a4:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a9:
            int r0 = X.Dbb.A05(r8)
            X.GVO r4 = new X.GVO
            r4.<init>(r1, r0)
            r4.A00(r5)
            java.lang.String r2 = r7.A0m
            boolean r1 = r7.A0s
            r0 = 0
            X.GVM.A00(r0, r4, r2, r1, r6)
            com.instagram.user.model.User r4 = r7.A05
            java.lang.String r7 = "artistProfilePic"
            java.lang.String r6 = "artistUsername"
            if (r4 == 0) goto L_0x00f6
            java.lang.String r0 = r4.getUsername()
            android.text.SpannableStringBuilder r1 = X.DbS.A0C(r0)
            boolean r0 = r4.isVerified()
            if (r0 == 0) goto L_0x00da
            android.content.Context r0 = r8.requireContext()
            X.C244273av.A08(r0, r1, r5)
        L_0x00da:
            android.widget.TextView r0 = r8.A02
            if (r0 == 0) goto L_0x00f2
            r0.setText(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r8.A04
            if (r1 == 0) goto L_0x00a1
            com.instagram.common.typedurl.ImageUrl r0 = r4.Bh3()
        L_0x00e9:
            r1.setUrl(r0, r8)
        L_0x00ec:
            android.view.View r0 = r8.A00
            if (r0 != 0) goto L_0x0114
            java.lang.String r6 = "artistInfoContainer"
        L_0x00f2:
            X.0qQ.A0F(r6)
            goto L_0x00a4
        L_0x00f6:
            android.widget.TextView r2 = r8.A02
            if (r2 == 0) goto L_0x00f2
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = r8.A09
            if (r1 == 0) goto L_0x0100
            java.lang.String r0 = r1.A0Y
        L_0x0100:
            r2.setText(r0)
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r8.A09
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = r0.A0f
            if (r0 == 0) goto L_0x00ec
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r8.A04
            if (r1 == 0) goto L_0x00a1
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
            goto L_0x00e9
        L_0x0114:
            X.3NG r2 = X.AnonymousClass7TE.A0m(r0)
            r1 = 7
            X.KHu r0 = new X.KHu
            r0.<init>(r1, r8, r4)
            r2.A04 = r0
            r2.A07 = r5
            r2.A00()
            android.content.Context r0 = r8.requireContext()
            X.0eM r1 = r8.A0E
            X.2xu r0 = X.JTR.A0p(r0, r1)
            r8.A0A = r0
            android.view.View r6 = r8.A01
            if (r6 != 0) goto L_0x0140
            java.lang.String r0 = "musicPlayer"
            X.0qQ.A0F(r0)
            goto L_0x00a4
        L_0x013c:
            java.lang.String r7 = "trackCoverReelHolder"
            goto L_0x00a1
        L_0x0140:
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r1)
            X.2xu r10 = r8.A0A
            X.LuT r5 = new X.LuT
            r9 = r8
            r5.<init>(r6, r7, r8, r9, r10)
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = r8.A09
            if (r2 == 0) goto L_0x0161
            com.instagram.music.common.model.MusicAssetModel r1 = com.instagram.music.common.model.MusicAssetModel.A03(r2)
            X.LuG r0 = new X.LuG
            r0.<init>(r2)
            r5.A00 = r1
            r5.A01 = r0
            boolean r3 = X.C65505LuT.A03(r5)
        L_0x0161:
            X.C65505LuT.A02(r5, r3)
            r8.A06 = r5
            return
        L_0x0167:
            java.lang.String r0 = "Music sticker model is not defined"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K72.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00(int i) {
        String str;
        View view = this.A01;
        if (view == null) {
            str = "musicPlayer";
        } else {
            view.setVisibility(i);
            C65602Lwc lwc = this.A07;
            if (lwc == null) {
                str = "trackCoverReelHolder";
            } else {
                lwc.A00.setVisibility(i);
                TextView textView = this.A03;
                if (textView == null) {
                    str = "trackTitle";
                } else {
                    textView.setVisibility(i);
                    View view2 = this.A00;
                    if (view2 == null) {
                        str = "artistInfoContainer";
                    } else {
                        view2.setVisibility(i);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return this.A0F;
    }

    public final /* synthetic */ float CoU() {
        return 1.0f;
    }

    public final void DT9() {
        MusicOverlayStickerModel musicOverlayStickerModel = this.A09;
        if (musicOverlayStickerModel != null) {
            C63978LGs.A00(this, AnonymousClass7TE.A0l(this.A0E), musicOverlayStickerModel, this.A0D, "music_preview_song_play");
        }
    }

    public final void DTA() {
        MusicOverlayStickerModel musicOverlayStickerModel = this.A09;
        if (musicOverlayStickerModel != null) {
            C63978LGs.A00(this, AnonymousClass7TE.A0l(this.A0E), musicOverlayStickerModel, this.A0D, "music_preview_song_pause");
        }
    }

    public final String getModuleName() {
        return this.A0D;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    public final boolean isScrolledToTop() {
        return this.A0G;
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1616765446);
        K72.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString(C273654mx.A00(3047));
            this.A0C = bundle2.getString("source_media_id");
            if (string != null) {
                try {
                    this.A09 = C255673uX.parseFromJson(0c9.A04.A01(AnonymousClass7TE.A0l(this.A0E), string));
                } catch (IOException unused) {
                    0wb.A03(__redex_internal_original_name, "Could not parse json MusicOverlayStickerModel for the Clips consumption sheet");
                    AnonymousClass0fD.A09(-1279039045, A022);
                    return;
                }
            }
            MusicOverlayStickerModel musicOverlayStickerModel = this.A09;
            if (musicOverlayStickerModel != null) {
                0lg A0X = DbT.A0X(this.A0E);
                String str = musicOverlayStickerModel.A0S;
                if (str == null) {
                    str = "";
                }
                1NY A0L = DbZ.A0L(A0X);
                A0L.A0A("music/music_reels_media/");
                try {
                    StringWriter A0v = JTO.A0v();
                    17W A0e = C51970G9q.A0e(A0v);
                    A0e.A0t(str);
                    A0L.A9m("reel_ids", JTS.A0k(A0e, A0v));
                } catch (IOException unused2) {
                    0wb.A03("ReelApiUtil.createReelsTrayRequestTask", "IOException");
                }
                1OC A0S = DbU.A0S(A0L, K18.class, C63990LHi.class);
                A0S.A00 = new KAI(musicOverlayStickerModel.A04, this);
                schedule(A0S);
            }
            AnonymousClass0fD.A09(-1916865932, A022);
            return;
        }
        IllegalStateException A0z = AnonymousClass7TE.A0z("No arguments specified");
        AnonymousClass0fD.A09(555476260, A022);
        throw A0z;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1364031314);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_music_consumption_sheet, false);
        AnonymousClass0fD.A09(732478260, A022);
        return A0D2;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(116081706);
        K72.super.onPause();
        C65505LuT luT = this.A06;
        if (luT != null) {
            luT.A0B.release();
        }
        C234462xu r0 = this.A0A;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass0fD.A09(-1786730514, A022);
    }
}
