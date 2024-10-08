package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.TrackSnippet;

/* renamed from: X.8a0  reason: invalid class name and case insensitive filesystem */
public final class C357878a0 implements C357888a1 {
    public final C357918a4 A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C357758Zn A03;
    public final boolean A04 = true;
    public final boolean A05 = true;
    public final boolean A06 = true;
    public final boolean A07 = true;
    public final boolean A08 = true;
    public final boolean A09 = true;

    public C357878a0(View view, AnonymousClass4DH r19, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C357758Zn r22, C3506785t r23) {
        AnonymousClass4DH r4 = r19;
        this.A01 = r4;
        UserSession userSession2 = userSession;
        this.A02 = userSession2;
        this.A03 = r22;
        View view2 = view;
        View requireViewById = view2.requireViewById(R.id.music_pre_capture_editor_stub);
        0qQ.A07(requireViewById);
        C357918a4 r1 = new C357918a4((ViewStub) requireViewById, new AnonymousClass9I6(view2.getContext().getColor(R.color.black_60_transparent), R.dimen.add_account_icon_circle_radius, 1, 1, false), r4, userSession2, targetViewSizeProvider, this, C3515689j.UNKNOWN, 0, true, false, false, true, false, false);
        this.A00 = r1;
        r1.A0b = r23;
    }

    public final boolean ACI() {
        return true;
    }

    public final int BPD() {
        return 15;
    }

    public final /* synthetic */ void CLM() {
    }

    public final boolean CPG() {
        return false;
    }

    public final /* synthetic */ void Cwe(AnonymousClass8IJ r1, TrackSnippet trackSnippet, boolean z) {
    }

    public final void D9r(AnonymousClass8IJ r7, TrackSnippet trackSnippet, Integer num) {
        AudioOverlayTrack audioOverlayTrack;
        0qQ.A0B(trackSnippet, 1);
        C357918a4 r5 = this.A00;
        MusicAssetModel musicAssetModel = r5.A0P;
        C357758Zn r3 = this.A03;
        if (musicAssetModel != null) {
            audioOverlayTrack = new AudioOverlayTrack(musicAssetModel, trackSnippet.A01, trackSnippet.A00);
        } else {
            audioOverlayTrack = null;
        }
        r3.D9p(audioOverlayTrack, r5.A0E());
    }

    public final /* synthetic */ void DSF(Integer num) {
    }

    public final /* synthetic */ void DSq() {
    }

    public final /* synthetic */ void DSr() {
    }

    public final /* synthetic */ void EuN() {
    }

    public final void ATW() {
        this.A03.CxZ((C349337zz) null);
    }

    public final MusicOverlayStickerModel BUu() {
        return this.A03.BUu();
    }

    public final String BXe(boolean z) {
        Context requireContext = this.A01.requireContext();
        UserSession userSession = this.A02;
        if (z || 1Au.A00(userSession).A01.getInt("music_editor_nux_seen_count", 0) < 3) {
            return null;
        }
        return requireContext.getString(2131967761);
    }

    public final boolean BuA() {
        return false;
    }

    public final boolean CRK() {
        return this.A04;
    }

    public final boolean CRW() {
        return this.A05;
    }

    public final boolean CW3() {
        return this.A06;
    }

    public final boolean CZL() {
        return this.A07;
    }

    public final boolean Cai() {
        return this.A08;
    }

    public final boolean CcC() {
        return false;
    }

    public final boolean CcD() {
        return false;
    }

    public final boolean CcE() {
        return this.A09;
    }

    public final boolean CcY() {
        return false;
    }

    public final boolean CdS() {
        return false;
    }

    public final void Cuw() {
        this.A03.Cuw();
    }

    public final boolean Cxa() {
        this.A03.CxZ(this.A00.A0E());
        return true;
    }

    public final void D89() {
        this.A03.D89();
    }

    public final void DvW(int i) {
        this.A03.DvW(i);
    }

    public final void DvX(int i) {
        this.A03.DvX(i);
    }
}
