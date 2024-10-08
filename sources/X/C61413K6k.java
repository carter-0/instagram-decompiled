package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.K6k  reason: case insensitive filesystem */
public final class C61413K6k extends AnonymousClass4DH implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "FeedReplaceAudioMusicEditorFragment";
    public AudioOverlayTrack A00;
    public C357918a4 A01;
    public String A02;
    public String A03;
    public AnonymousClass85s A04;
    public boolean A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final C65500LuO A07 = new C65500LuO(this, 2);
    public final AnonymousClass4DS A08 = new C64464LcR(this, 1);

    public final String getModuleName() {
        return "feed_replace_audio_music_editor_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c6, code lost:
        if (X.C253833rU.A02(r2) == false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r13 = 0
            r1 = r21
            X.0qQ.A0B(r1, r13)
            r8 = r20
            r0 = r22
            super.onViewCreated(r1, r0)
            X.0eM r2 = r8.A06
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r2)
            r0 = 2131432806(0x7f0b1566, float:1.848738E38)
            android.view.View r6 = X.AnonymousClass7TE.A0b(r1, r0)
            android.view.ViewStub r6 = (android.view.ViewStub) r6
            r14 = 7
            r10 = 0
            r17 = 1
            X.9I6 r7 = new X.9I6
            r11 = r7
            r12 = r13
            r15 = r17
            r16 = r13
            r11.<init>(r12, r13, r14, r15, r16)
            X.LuO r11 = r8.A07
            X.89j r12 = X.C3515689j.UNKNOWN
            X.8a4 r5 = new X.8a4
            r14 = r13
            r15 = r13
            r18 = r13
            r19 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r8.A01 = r5
            X.85s r0 = r8.A04
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "musicSyncController"
        L_0x0042:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004a:
            r5.A0b = r0
            com.instagram.music.common.model.AudioOverlayTrack r4 = r8.A00
            if (r4 == 0) goto L_0x0073
            com.instagram.music.common.model.MusicAssetModel r3 = r4.A08
            if (r3 == 0) goto L_0x005d
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x006f
            int r0 = r4.A03
            r5.A0K(r3, r0, r13)
        L_0x005d:
            r0 = 2131438124(0x7f0b2a2c, float:1.8498166E38)
            com.instagram.common.ui.widget.imageview.IgImageView r4 = X.JTO.A0Y(r1, r0)
            X.1E8 r2 = X.DbX.A0d(r2)
            java.lang.String r0 = r8.A02
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = "mediaId"
            goto L_0x0042
        L_0x006f:
            r5.A0L(r3, r13)
            goto L_0x005d
        L_0x0073:
            java.lang.String r0 = "audioTrack"
            goto L_0x0042
        L_0x0076:
            X.1Xj r3 = r2.A02(r0)
            if (r3 == 0) goto L_0x008e
            android.net.Uri r2 = r3.A05
            boolean r0 = r3.A4o()
            if (r0 == 0) goto L_0x00b8
            if (r2 == 0) goto L_0x00b8
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.C253833rU.A00(r2, r0, r0)
        L_0x008b:
            r4.setUrl(r2, r8)
        L_0x008e:
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x009e
            r0 = 2131432807(0x7f0b1567, float:1.8487382E38)
            android.view.View r2 = X.JTR.A0V(r1, r0)
            r0 = 15
            X.LYF.A01(r2, r0, r8)
        L_0x009e:
            r0 = 2131427520(0x7f0b00c0, float:1.8476659E38)
            android.view.View r2 = X.AnonymousClass7TE.A0b(r1, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1 = 16
            X.LYF r0 = new X.LYF
            r0.<init>((java.lang.Object) r8, (int) r1)
            X.2dZ r1 = X.2dY.A01(r0, r2)
            X.4DS r0 = r8.A08
            r1.A0X(r0)
            return
        L_0x00b8:
            android.content.Context r0 = r8.requireContext()
            com.instagram.model.mediasize.ExtendedImageUrl r2 = r3.A1n(r0)
            if (r2 == 0) goto L_0x008e
            boolean r0 = X.C253833rU.A02(r2)
            if (r0 != 0) goto L_0x008e
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61413K6k.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(278062651);
        C61413K6k.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable("args_audio_track");
        if (parcelable != null) {
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) parcelable;
            0qQ.A0B(audioOverlayTrack, 0);
            this.A00 = audioOverlayTrack;
            String string = requireArguments.getString("args_media_id");
            if (string != null) {
                this.A02 = string;
                this.A05 = requireArguments.getBoolean("args_has_existing_snippet_selection", false);
                this.A03 = requireArguments.getString("args_music_browse_session_full_id", "");
                Context requireContext = requireContext();
                AnonymousClass0eM r1 = this.A06;
                this.A04 = new AnonymousClass85s(requireContext, AnonymousClass7TE.A0l(r1), this, JTR.A0p(requireContext(), r1), new C65506LuU(this, 4));
                AnonymousClass0fD.A09(1861832406, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -2111075997;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -18736887;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(765772371);
        0qQ.A0B(layoutInflater, 0);
        if (!AnonymousClass1GD.A03()) {
            layoutInflater = JTS.A09(requireContext(), layoutInflater);
        }
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.feed_replace_audio_music_editor, false);
        AnonymousClass0fD.A09(-980829457, A022);
        return A0A;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(917517439);
        C61413K6k.super.onPause();
        AnonymousClass85s r0 = this.A04;
        if (r0 == null) {
            0qQ.A0F("musicSyncController");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.onPause();
        AnonymousClass0fD.A09(1400823693, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1656682704);
        super.onResume();
        AnonymousClass85s r0 = this.A04;
        if (r0 == null) {
            0qQ.A0F("musicSyncController");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.onResume();
        AnonymousClass0fD.A09(93092824, A022);
    }
}
