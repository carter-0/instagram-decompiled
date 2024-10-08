package X;

import com.instagram.creation.capture.quickcapture.sundial.widget.durationpickerview.DurationPickerView;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.Lji  reason: case insensitive filesystem */
public final class C64882Lji implements C355238Pf {
    public final /* synthetic */ DurationPickerView A00;

    public final void DNL(float f, float f2) {
    }

    public final void DNO(float f) {
    }

    public C64882Lji(DurationPickerView durationPickerView) {
        this.A00 = durationPickerView;
    }

    public final void Dfw(float f) {
        String str;
        DurationPickerView durationPickerView = this.A00;
        durationPickerView.invalidate();
        MQS mqs = durationPickerView.A03;
        if (mqs != null) {
            int A06 = AnonymousClass7TE.A06(f - durationPickerView.A0D.getLeftTrimmerValue(), (float) durationPickerView.A01) + 0;
            C61430K7f k7f = (C61430K7f) mqs;
            k7f.A00 = A06;
            LCh lCh = k7f.A06;
            if (lCh == null) {
                str = "startTimeHolder";
            } else {
                lCh.A00((float) k7f.A01);
                LCh lCh2 = k7f.A05;
                if (lCh2 == null) {
                    str = "endTimeHolder";
                } else {
                    lCh2.A00((float) (k7f.A01 + A06));
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Dsg() {
        C61430K7f k7f;
        AudioOverlayTrack audioOverlayTrack;
        MusicAssetModel musicAssetModel;
        MQS mqs = this.A00.A03;
        if (mqs != null && (audioOverlayTrack = k7f.A08) != null && (musicAssetModel = audioOverlayTrack.A08) != null) {
            C65504LuS luS = (k7f = (C61430K7f) mqs).A04;
            if (luS == null) {
                0qQ.A0F("player");
                throw AnonymousClass00P.createAndThrow();
            }
            int i = k7f.A01;
            int i2 = k7f.A00;
            int i3 = i2 - 2000;
            int i4 = 0;
            if (0 < i3) {
                i4 = i3;
            }
            luS.A00(audioOverlayTrack, musicAssetModel, i, i2, i4);
        }
    }

    public final void Dsi() {
        String str;
        DurationPickerView durationPickerView = this.A00;
        durationPickerView.invalidate();
        MQS mqs = durationPickerView.A03;
        if (mqs != null) {
            C61430K7f k7f = (C61430K7f) mqs;
            C65504LuS luS = k7f.A04;
            if (luS == null) {
                str = "player";
            } else {
                C234502xy r1 = luS.A02;
                if (r1.isPlaying()) {
                    r1.pause();
                }
                MS8 ms8 = k7f.A07;
                if (ms8 == null) {
                    str = "durationPicker";
                } else {
                    DurationPickerView durationPickerView2 = (DurationPickerView) ms8;
                    if (durationPickerView2.A04) {
                        durationPickerView2.A04 = false;
                        durationPickerView2.A02 = System.currentTimeMillis();
                        durationPickerView2.invalidate();
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
