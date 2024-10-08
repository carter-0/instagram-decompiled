package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.music.common.model.AudioOverlayTrack;

public final class K7I extends AnonymousClass4DH implements C268594df, C273494mf, C66495MTy {
    public static final String __redex_internal_original_name = "MusicNotesEditorFragment";
    public L1S A00;
    public C67761MuH A01;
    public AudioOverlayTrack A02;
    public C357918a4 A03;
    public Integer A04;
    public boolean A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final int AqL() {
        return -2;
    }

    public final int C8P() {
        return 0;
    }

    public final float CMx() {
        return 1.0f;
    }

    public final boolean CPc() {
        return false;
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

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "music_notes_editor_sheet";
    }

    public final boolean isScrolledToTop() {
        return true;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008a, code lost:
        if (X.182.A06(X.0Tu.A05, X.AnonymousClass7TF.A0L(r9, 0), 36328143354608596L) != false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r28, android.os.Bundle r29) {
        /*
            r27 = this;
            r3 = 0
            r7 = r28
            X.0qQ.A0B(r7, r3)
            r15 = r27
            r0 = r29
            super.onViewCreated(r7, r0)
            android.view.View r1 = r15.requireView()
            r0 = 2131436651(0x7f0b246b, float:1.8495178E38)
            android.view.ViewGroup r2 = X.DbX.A0I(r1, r0)
            r1 = 11
            X.LYE r0 = new X.LYE
            r0.<init>((java.lang.Object) r15, (int) r1)
            X.2dZ r1 = X.2dY.A01(r0, r2)
            r5 = 2
            X.LcR r0 = new X.LcR
            r0.<init>(r15, r5)
            r1.A0X(r0)
            com.instagram.music.common.model.AudioOverlayTrack r2 = r15.A02
            java.lang.String r11 = "currentAudioOverlayTrack"
            if (r2 == 0) goto L_0x00f9
            com.instagram.music.common.model.MusicAssetModel r0 = r2.A08
            java.lang.String r10 = "Required value was null."
            if (r0 == 0) goto L_0x00f4
            int r1 = r0.A00
            r0 = 30000(0x7530, float:4.2039E-41)
            if (r0 <= r1) goto L_0x003f
            r0 = r1
        L_0x003f:
            r2.A02 = r0
            android.content.Context r0 = r15.requireContext()
            android.content.Context r19 = X.DbT.A05(r0)
            X.0eM r9 = r15.A06
            com.instagram.common.session.UserSession r20 = X.AnonymousClass7TE.A0l(r9)
            android.content.Context r0 = r15.requireContext()
            android.content.Context r0 = X.DbT.A05(r0)
            X.2xu r22 = X.JTR.A0p(r0, r9)
            r1 = 5
            X.LuU r0 = new X.LuU
            r0.<init>(r15, r1)
            r17 = 0
            X.85s r2 = new X.85s
            r18 = r2
            r21 = r17
            r23 = r0
            r18.<init>(r19, r20, r21, r22, r23)
            com.instagram.music.common.model.AudioOverlayTrack r0 = r15.A02
            if (r0 == 0) goto L_0x00f9
            com.instagram.music.common.model.MusicAssetModel r0 = r0.A08
            r4 = 1
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r0.A0O
            if (r0 != r4) goto L_0x00dc
            X.0lg r8 = X.AnonymousClass7TF.A0L(r9, r3)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36328143354608596(0x81104100003bd4, double:3.037402366921824E-306)
            boolean r0 = X.182.A06(r6, r8, r0)
            if (r0 == 0) goto L_0x00dc
        L_0x008c:
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r9)
            r0 = 2131436665(0x7f0b2479, float:1.8495207E38)
            android.view.View r13 = X.AnonymousClass7TF.A0G(r7, r0)
            android.view.ViewStub r13 = (android.view.ViewStub) r13
            r20 = 2131165250(0x7f070042, float:1.7944712E38)
            r24 = 1
            X.9I6 r14 = new X.9I6
            r18 = r14
            r19 = r3
            r21 = r5
            r22 = r24
            r23 = r3
            r18.<init>(r19, r20, r21, r22, r23)
            r1 = 3
            X.LuO r0 = new X.LuO
            r0.<init>(r15, r1)
            X.89j r19 = X.C3515689j.UNKNOWN
            X.8a4 r12 = new X.8a4
            r21 = r3
            r22 = r3
            r25 = r3
            r26 = r4
            r18 = r0
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r15.A03 = r12
            r12.A0b = r2
            boolean r0 = r15.A05
            if (r0 == 0) goto L_0x00e3
            com.instagram.music.common.model.AudioOverlayTrack r0 = r15.A02
            if (r0 == 0) goto L_0x00f9
            com.instagram.music.common.model.MusicAssetModel r1 = r0.A08
            if (r1 == 0) goto L_0x00de
            int r0 = r0.A03
            r12.A0K(r1, r0, r4)
            return
        L_0x00dc:
            r4 = 0
            goto L_0x008c
        L_0x00de:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x00e3:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r15.A02
            if (r0 == 0) goto L_0x00f9
            com.instagram.music.common.model.MusicAssetModel r0 = r0.A08
            if (r0 == 0) goto L_0x00ef
            r12.A0L(r0, r4)
            return
        L_0x00ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x00f4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x00f9:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K7I.onViewCreated(android.view.View, android.os.Bundle):void");
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

    public final /* synthetic */ float CoU() {
        return 1.0f;
    }

    public final void DT9() {
        C357918a4 r0 = this.A03;
        if (r0 == null) {
            JTT.A0x();
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A0H();
        }
    }

    public final void DTA() {
        C357918a4 r0 = this.A03;
        if (r0 == null) {
            JTT.A0x();
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A0G();
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final void onBottomSheetClosed() {
        C357918a4 r0 = this.A03;
        if (r0 == null) {
            JTT.A0x();
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A0G();
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        AudioOverlayTrack audioOverlayTrack;
        int A022 = AnonymousClass0fD.A02(-1349369046);
        K7I.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("is_existing_track");
        } else {
            z = false;
        }
        this.A05 = z;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null || (audioOverlayTrack = (AudioOverlayTrack) bundle3.getParcelable("selected_audio_track")) == null) {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(-1777069935, A022);
            throw A0y;
        }
        this.A02 = audioOverlayTrack;
        AnonymousClass0fD.A09(-1724619064, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-560743555);
        0qQ.A0B(layoutInflater, 0);
        boolean A062 = 182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A06, 0), 36328143354608596L);
        int i = R.layout.fragment_profile_music_editor;
        if (A062) {
            i = R.layout.fragment_music_note_editor;
        }
        if (!AnonymousClass1GD.A03()) {
            layoutInflater = JTS.A09(getContext(), layoutInflater);
        }
        View A0A = DbU.A0A(layoutInflater, viewGroup, i, false);
        AnonymousClass0fD.A09(954043366, A022);
        return A0A;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-599945161);
        super.onDestroyView();
        if (182.A06(0Tu.A05, DbY.A0R(this.A06), 36326451137558284L)) {
            C357918a4 r0 = this.A03;
            if (r0 == null) {
                JTT.A0x();
                throw AnonymousClass00P.createAndThrow();
            }
            C3506785t r02 = r0.A0b;
            if (r02 != null) {
                r02.release();
            }
        }
        AnonymousClass0fD.A09(-2015351789, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1307121715);
        K7I.super.onPause();
        C357918a4 r0 = this.A03;
        if (r0 == null) {
            JTT.A0x();
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A0I();
        AnonymousClass0fD.A09(1832624717, A022);
    }
}
