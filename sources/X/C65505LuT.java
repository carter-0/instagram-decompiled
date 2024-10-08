package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LuT  reason: case insensitive filesystem */
public final class C65505LuT implements C315536k3, SeekBar.OnSeekBarChangeListener {
    public C2606246k A00;
    public C2606146j A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final View A05;
    public final ImageView A06;
    public final SeekBar A07;
    public final TextView A08;
    public final AnonymousClass3NL A09;
    public final AnonymousClass8ZI A0A;
    public final C234502xy A0B;
    public final int A0C = 60000;
    public final UserSession A0D;
    public final C66495MTy A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H = true;

    public C65505LuT(View view, UserSession userSession, AnonymousClass4DU r20, C66495MTy mTy, C234462xu r22) {
        View view2 = view;
        UserSession userSession2 = userSession;
        AnonymousClass4DU r13 = r20;
        DbZ.A0t(1, view2, userSession2, r13);
        C66495MTy mTy2 = mTy;
        C61686KHu kHu = new C61686KHu(6, this, mTy2);
        this.A09 = kHu;
        Context context = view2.getContext();
        this.A05 = view2;
        this.A0D = userSession2;
        int A042 = C51968G9o.A04(context);
        this.A04 = A042;
        int A012 = DbV.A01(context);
        this.A03 = A012;
        this.A0G = context.getString(2131954050);
        this.A0F = context.getString(2131954049);
        this.A0B = C234472xv.A00(context, userSession2, r13, r22, "BottomSheetMusicPlayerController", C234472xv.A02(userSession2));
        this.A0E = mTy2;
        ImageView A0F2 = DbU.A0F(view2, R.id.preview_button);
        this.A06 = A0F2;
        AnonymousClass8ZG r10 = new AnonymousClass8ZG(AnonymousClass7TE.A0S(A0F2));
        r10.A06 = 0;
        r10.A0C = 0;
        r10.A01 = context.getDrawable(R.drawable.pause);
        r10.A02(context.getResources().getDimensionPixelSize(R.dimen.music_bottom_sheet_preview_button_size));
        r10.A01(A042);
        r10.A05 = Integer.valueOf(A012);
        AnonymousClass8ZI A002 = r10.A00();
        this.A0A = A002;
        A0F2.setImageDrawable(A002);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(A0F2);
        A0m.A07 = true;
        A0m.A04 = kHu;
        A0m.A00();
        SeekBar seekBar = (SeekBar) view2.requireViewById(R.id.track_scrubber);
        this.A07 = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        seekBar.setMax(60000);
        this.A08 = AnonymousClass7TE.A0d(view2, R.id.track_time);
    }

    public final void onCurrentTrackCompleted() {
    }

    public final void onCurrentTrackPlaybackStarted() {
    }

    public final void onCurrentTrackSeekComplete() {
    }

    public final void onCurrentTrackStartedPlaying() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r1 != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C65505LuT r4) {
        /*
            android.view.View r0 = r4.A05
            android.content.Context r3 = r0.getContext()
            X.46j r0 = r4.A01
            r2 = 0
            if (r0 == 0) goto L_0x002e
            r1 = 1
            boolean r0 = r0.Esc()
            if (r0 != r1) goto L_0x002e
            X.46j r0 = r4.A01
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r0.getShouldMuteAudioReason()
            if (r0 == 0) goto L_0x002e
            int r0 = r0.length()
            if (r0 == 0) goto L_0x002e
            X.46j r0 = r4.A01
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = r0.getShouldMuteAudioReason()
        L_0x002a:
            X.C59689JTv.A09(r3, r2)
            return
        L_0x002e:
            X.46k r0 = r4.A00
            if (r0 == 0) goto L_0x003b
            com.instagram.music.common.model.MusicDataSource r1 = r0.BUq()
            r0 = 2131967893(0x7f133f95, float:1.9572665E38)
            if (r1 == 0) goto L_0x003e
        L_0x003b:
            r0 = 2131967873(0x7f133f81, float:1.9572625E38)
        L_0x003e:
            java.lang.String r2 = r3.getString(r0)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65505LuT.A00(X.LuT):void");
    }

    public static final void A02(C65505LuT luT, boolean z) {
        int i;
        C64286LYm lYm;
        int i2;
        luT.A06.setEnabled(z);
        luT.A0A.A02(z);
        SeekBar seekBar = luT.A07;
        Drawable mutate = seekBar.getThumb().mutate();
        if (z) {
            i = luT.A04;
        } else {
            i = luT.A03;
        }
        mutate.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        seekBar.setEnabled(z);
        TextView textView = luT.A08;
        if (textView != null) {
            if (z) {
                i2 = luT.A04;
            } else {
                i2 = luT.A03;
            }
            textView.setTextColor(i2);
        }
        View view = luT.A05;
        if (z) {
            lYm = null;
        } else {
            lYm = new C64286LYm((Object) luT, 24);
        }
        view.setOnTouchListener(lYm);
        if (textView != null) {
            textView.setText(C347917xa.A01(0));
        }
        seekBar.setProgress(0);
        A01(luT, AnonymousClass8ZH.PLAY);
    }

    public static final boolean A03(C65505LuT luT) {
        C2606146j r0;
        C2606246k r2 = luT.A00;
        if (r2 == null || luT.A01 == null || r2.BUq() == null || (r0 = luT.A01) == null || r0.Esc() || !AnonymousClass30D.A08(luT.A0D)) {
            return false;
        }
        return true;
    }

    public final void onCurrentTrackPlayTimeUpdated(int i) {
        SeekBar seekBar = this.A07;
        if (i >= seekBar.getMax()) {
            this.A0B.pause();
            i = 0;
        } else {
            A01(this, AnonymousClass8ZH.STOP);
        }
        seekBar.setProgress(i);
    }

    public final void onCurrentTrackPrepared(int i) {
        if (this.A0H) {
            i = Math.min(i, this.A0C);
        }
        SeekBar seekBar = this.A07;
        if (seekBar.getMax() != i) {
            seekBar.setMax(i);
            seekBar.setProgress(0);
        }
    }

    public final void onCurrentTrackStopped() {
        if (!this.A02) {
            A01(this, AnonymousClass8ZH.PLAY);
            this.A0E.DTA();
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        TextView textView = this.A08;
        if (textView != null) {
            textView.setText(C347917xa.A01(this.A07.getProgress()));
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        C234502xy r1 = this.A0B;
        if (r1.isPlaying()) {
            this.A02 = true;
            r1.pause();
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.A02) {
            C234502xy r1 = this.A0B;
            r1.seekTo(this.A07.getProgress());
            r1.E2p();
        }
        this.A02 = false;
    }

    public static final void A01(C65505LuT luT, AnonymousClass8ZH r4) {
        String str;
        int ordinal = r4.ordinal();
        ImageView imageView = luT.A06;
        if (ordinal != 0) {
            str = luT.A0F;
        } else {
            str = luT.A0G;
        }
        imageView.setContentDescription(str);
        luT.A0A.A01(r4);
    }
}
