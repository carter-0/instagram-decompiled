package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.widget.CountdownDurationToggle;
import com.instagram.creation.capture.quickcapture.sundial.widget.durationpickerview.DurationPickerView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.Iterator;

/* renamed from: X.K7f  reason: case insensitive filesystem */
public final class C61430K7f extends AnonymousClass4DH implements C273494mf, MQS {
    public static final String __redex_internal_original_name = "ClipsDurationPickerFragment";
    public int A00;
    public int A01;
    public AnonymousClass8JF A02;
    public C353498Hw A03;
    public C65504LuS A04;
    public LCh A05;
    public LCh A06;
    public MS8 A07;
    public AudioOverlayTrack A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "clips_duration_picker";
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        View view2;
        RelativeLayout.LayoutParams layoutParams;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AOX.A00(AnonymousClass7TF.A0G(view, R.id.set_timer_button), 12, this);
        IgdsButton A0n = JTR.A0n(view, R.id.clear_timer_button);
        A0n.setText(2131955423);
        AOX.A00(A0n, 13, this);
        Bundle bundle2 = this.mArguments;
        AudioOverlayTrack audioOverlayTrack = null;
        if (bundle2 != null) {
            audioOverlayTrack = (AudioOverlayTrack) bundle2.getParcelable(AnonymousClass000.A00(2812));
        }
        this.A08 = audioOverlayTrack;
        Bundle bundle3 = this.mArguments;
        int i2 = 0;
        if (bundle3 != null) {
            i = bundle3.getInt(AnonymousClass000.A00(3845));
        } else {
            i = 0;
        }
        this.A01 = i;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            i2 = bundle4.getInt(AnonymousClass000.A00(3629));
        }
        this.A00 = i2;
        int i3 = this.A01 + i2;
        Context A0S = AnonymousClass7TE.A0S(view);
        AnonymousClass0eM r4 = this.A0A;
        this.A04 = new C65504LuS(A0S, AnonymousClass7TE.A0l(r4), this, JTR.A0p(A0S, r4));
        AnonymousClass8JF r8 = this.A02;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        View A0F = DbY.A0F(view, R.id.countdown_container_stub);
        CountdownDurationToggle countdownDurationToggle = (CountdownDurationToggle) AnonymousClass7TF.A0F(view, R.id.countdown_duration_toggle);
        View A0G = AnonymousClass7TF.A0G(A0F, R.id.countdown_label);
        ViewGroup.LayoutParams layoutParams2 = A0G.getLayoutParams();
        if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.addRule(0, R.id.countdown_duration_toggle);
            A0G.setLayoutParams(layoutParams);
        }
        0qQ.A0B(A0l, 0);
        int A002 = C353608Ij.A00(A0l);
        if (A002 != countdownDurationToggle.A00) {
            countdownDurationToggle.A00 = A002;
            CountdownDurationToggle.A00(countdownDurationToggle);
        }
        countdownDurationToggle.A03 = r8;
        AnonymousClass0fU.A00(LYG.A01(A0l, countdownDurationToggle, 0), countdownDurationToggle);
        LCh lCh = new LCh(AnonymousClass7TG.A0R(view, R.id.start_time));
        this.A06 = lCh;
        lCh.A00((float) this.A01);
        LCh lCh2 = new LCh(AnonymousClass7TG.A0R(view, R.id.end_time));
        this.A05 = lCh2;
        lCh2.A00((float) i3);
        MS8 ms8 = (MS8) view.requireViewById(R.id.duration_picker);
        this.A07 = ms8;
        if (ms8 != null) {
            DurationPickerView durationPickerView = (DurationPickerView) ms8;
            durationPickerView.A03 = this;
            int A0E = ((ClipsCreationViewModel) this.A09.getValue()).A0E();
            int i4 = this.A01;
            int i5 = this.A00;
            0sn r3 = 0sn.A00;
            0qQ.A0B(r3, 4);
            durationPickerView.A01 = A0E;
            C355368Ps r6 = durationPickerView.A0D;
            float f = (float) A0E;
            r6.setMinimumRange(100.0f / f);
            r6.A05(((float) i4) / f, ((float) (i4 + i5)) / f);
            durationPickerView.invalidate();
            durationPickerView.A05 = new float[r3.size()];
            Iterator it = r3.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    0sr.A1T();
                    break;
                }
                durationPickerView.A05[i6] = ((float) AnonymousClass7TE.A0M(next)) / f;
                i6 = i7;
            }
            r6.setSnapValues(durationPickerView.A05);
            MS8 ms82 = this.A07;
            if (ms82 != null) {
                if ((ms82 instanceof View) && (view2 = (View) ms82) != null) {
                    0nA.A0m(view2, view);
                    return;
                }
                return;
            }
        }
        0qQ.A0F("durationPicker");
        throw AnonymousClass00P.createAndThrow();
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
        return DbS.A0T(this.A0A);
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

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final void onBottomSheetClosed() {
        C353498Hw r0 = this.A03;
        if (r0 != null) {
            C353498Hw.A0Z(r0);
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C61430K7f() {
        C41656Ay8 ay8 = new C41656Ay8(this, 44);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C41656Ay8(new C41656Ay8(this, 45), 46));
        this.A09 = DbS.A0I(new C41656Ay8(A002, 47), ay8, C66291MMa.A00((Object) null, A002, 2), DbS.A0z(ClipsCreationViewModel.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-354527127);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_duration_picker, viewGroup, false);
        AnonymousClass0fD.A09(-1311513298, A022);
        return inflate;
    }

    public final void onPause() {
        String str;
        int A022 = AnonymousClass0fD.A02(-536563020);
        C61430K7f.super.onPause();
        C353498Hw r0 = this.A03;
        if (r0 != null) {
            r0.A1T.EvX();
        }
        C65504LuS luS = this.A04;
        if (luS == null) {
            str = "player";
        } else {
            luS.A02.release();
            MS8 ms8 = this.A07;
            if (ms8 == null) {
                str = "durationPicker";
            } else {
                DurationPickerView durationPickerView = (DurationPickerView) ms8;
                if (durationPickerView.A04) {
                    durationPickerView.A04 = false;
                    durationPickerView.A02 = System.currentTimeMillis();
                    durationPickerView.invalidate();
                }
                AnonymousClass0fD.A09(709385938, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        MusicAssetModel musicAssetModel;
        int A022 = AnonymousClass0fD.A02(1567102823);
        super.onResume();
        C353498Hw r0 = this.A03;
        if (r0 != null) {
            r0.A1T.EvI(r0.A11);
        }
        AudioOverlayTrack audioOverlayTrack = this.A08;
        if (!(audioOverlayTrack == null || (musicAssetModel = audioOverlayTrack.A08) == null)) {
            C65504LuS luS = this.A04;
            if (luS == null) {
                0qQ.A0F("player");
                throw AnonymousClass00P.createAndThrow();
            }
            luS.A00(audioOverlayTrack, musicAssetModel, this.A01, this.A00, 0);
        }
        AnonymousClass0fD.A09(365526035, A022);
    }
}
