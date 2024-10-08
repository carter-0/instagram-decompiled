package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.85s  reason: invalid class name */
public final class AnonymousClass85s implements C3506785t, C315536k3 {
    public boolean A00;
    public boolean A01;
    public int A02;
    public MusicDataSource A03;
    public boolean A04;
    public final C234502xy A05;
    public final AnonymousClass85q A06;
    public final UserSession A07;
    public final AnonymousClass4DU A08;
    public final C234462xu A09;
    public final List A0A = new ArrayList();

    public AnonymousClass85s(Context context, UserSession userSession, AnonymousClass4DU r12, C234462xu r13, AnonymousClass85q r14) {
        0qQ.A0B(userSession, 2);
        this.A07 = userSession;
        this.A09 = r13;
        this.A06 = r14;
        this.A08 = r12;
        Context context2 = context;
        this.A05 = C234472xv.A01(context2, userSession, r12, r13, "MusicOnlySyncController", false, C234472xv.A02(userSession), false, false);
    }

    public final void Cot() {
    }

    public final void Edj(MusicDataSource musicDataSource, boolean z) {
        MusicDataSource musicDataSource2 = musicDataSource;
        boolean z2 = z;
        if (z || !musicDataSource.equals(this.A05.AvO())) {
            this.A05.ETw(musicDataSource2, this, (String) null, 0, -1, -1, z2, false);
        }
    }

    public final void FIf() {
    }

    public final void onResume() {
        MusicDataSource musicDataSource = this.A03;
        if (musicDataSource != null) {
            C234502xy r1 = this.A05;
            r1.ETw(musicDataSource, this, (String) null, 0, -1, -1, false, false);
            this.A03 = null;
            if (this.A04) {
                r1.seekTo(this.A02);
                r1.E2p();
                this.A04 = false;
            }
        }
    }

    public final void A9Q(C357748Zm r3) {
        List list = this.A0A;
        if (!list.contains(r3)) {
            list.add(r3);
        }
    }

    public final void AHl() {
        this.A05.AHY();
    }

    public final MusicDataSource BUq() {
        return this.A05.AvO();
    }

    public final int BUw() {
        return this.A05.getCurrentPositionMs();
    }

    public final int BV1() {
        return this.A06.BV1();
    }

    public final int BV2() {
        return this.A02;
    }

    public final int BV5() {
        return this.A05.AzN();
    }

    public final Integer C9B() {
        C234502xy r1 = this.A05;
        return r1.C9D(r1.AvO());
    }

    public final boolean CKF() {
        return this.A05.CKF();
    }

    public final void EE8(C357748Zm r2) {
        this.A0A.remove(r2);
    }

    public final void Edn(int i) {
        this.A06.Edn(i);
    }

    public final void Edo(int i) {
        this.A02 = i;
        this.A05.seekTo(i);
    }

    public final void Eqq(float f) {
        this.A05.Eqq(f);
    }

    public final boolean isPlaying() {
        return this.A05.isPlaying();
    }

    public final void onCurrentTrackCompleted() {
        List list = this.A0A;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i);
        }
        if (!this.A01) {
            C234502xy r1 = this.A05;
            r1.seekTo(this.A02);
            r1.E2p();
        }
    }

    public final void onCurrentTrackPlayTimeUpdated(int i) {
        if (0mi.A00(((float) (i - this.A02)) / ((float) this.A06.BV1()), 0.0f, 1.0f) == 1.0f) {
            this.A05.seekTo(this.A02);
        }
        List list = this.A0A;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C357748Zm) list.get(i2)).DTI(i);
        }
    }

    public final void onCurrentTrackPlaybackStarted() {
        List list = this.A0A;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C357748Zm) list.get(i)).DTC();
        }
    }

    public final void onCurrentTrackPrepared(int i) {
        List list = this.A0A;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C357748Zm) list.get(i2)).DTD(i, 0);
        }
    }

    public final void onCurrentTrackSeekComplete() {
        List list = this.A0A;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C357748Zm) list.get(i)).DTE();
        }
    }

    public final void onCurrentTrackStartedPlaying() {
        List list = this.A0A;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C357748Zm) list.get(i)).DTG();
        }
    }

    public final void onCurrentTrackStopped() {
        List list = this.A0A;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C357748Zm) list.get(i)).DTH();
        }
    }

    public final void onPause() {
        C234502xy r1 = this.A05;
        if (r1.CKF()) {
            this.A03 = r1.AvO();
            this.A04 = r1.isPlaying();
            r1.release();
            this.A09.A00();
        }
    }

    public final void release() {
        this.A05.release();
        this.A02 = 0;
        this.A03 = null;
        this.A04 = false;
    }

    public final void E2p() {
        int intValue = C9B().intValue();
        if (intValue == 1 || intValue == 2) {
            this.A05.E2p();
        }
    }

    public final void pause() {
        int intValue = C9B().intValue();
        if (intValue == 1 || intValue == 2) {
            C234502xy r1 = this.A05;
            r1.seekTo(this.A02);
            r1.pause();
        }
    }
}
