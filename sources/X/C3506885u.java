package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.85u  reason: invalid class name and case insensitive filesystem */
public final class C3506885u implements C3506785t, C315536k3, C3506985v {
    public C354228Ld A00;
    public AnonymousClass8LW A01;
    public boolean A02;
    public boolean A03;
    public float A04 = 50.0f;
    public int A05;
    public MusicDataSource A06;
    public boolean A07;
    public boolean A08;
    public final C234502xy A09;
    public final C234462xu A0A;
    public final List A0B = new ArrayList();

    public C3506885u(Context context, UserSession userSession, C234462xu r12) {
        0qQ.A0B(userSession, 2);
        this.A0A = r12;
        this.A09 = C234472xv.A01(context, userSession, (AnonymousClass4DU) null, r12, "MusicVideoSyncController", false, C234472xv.A02(userSession), false, false);
    }

    public final boolean AFv(AnonymousClass8LW r3) {
        if (!this.A09.CKF()) {
            return true;
        }
        if (this.A08) {
            this.A08 = false;
            return false;
        } else if (!this.A03) {
            return true;
        } else {
            this.A01 = r3;
            return false;
        }
    }

    public final void DNQ() {
        MusicDataSource musicDataSource = this.A06;
        if (musicDataSource != null) {
            C234502xy r2 = this.A09;
            r2.ETw(musicDataSource, this, (String) null, 0, -1, -1, false, false);
            this.A06 = null;
            int i = this.A05;
            this.A03 = true;
            r2.seekTo(i);
        }
    }

    public final void Djd(int i) {
        this.A02 = true;
    }

    public final /* synthetic */ void Dy0() {
    }

    public final /* synthetic */ void Dy2() {
    }

    public final void Edj(MusicDataSource musicDataSource, boolean z) {
        C234502xy r1 = this.A09;
        MusicDataSource musicDataSource2 = musicDataSource;
        if (!musicDataSource.equals(r1.AvO())) {
            r1.ETw(musicDataSource2, this, (String) null, 0, -1, -1, z, false);
        }
    }

    public final void Edn(int i) {
    }

    public final void onCurrentTrackCompleted() {
    }

    public final void onCurrentTrackStopped() {
    }

    public final void A9Q(C357748Zm r3) {
        List list = this.A0B;
        if (!list.contains(r3)) {
            list.add(r3);
        }
    }

    public final void AHl() {
        this.A09.AHY();
    }

    public final MusicDataSource BUq() {
        return this.A09.AvO();
    }

    public final int BUw() {
        return this.A09.getCurrentPositionMs();
    }

    public final int BV1() {
        C354228Ld r0 = this.A00;
        if (r0 != null) {
            return r0.CDy();
        }
        return 0;
    }

    public final int BV2() {
        return this.A05;
    }

    public final int BV5() {
        return this.A09.AzN();
    }

    public final Integer C9B() {
        C234502xy r1 = this.A09;
        return r1.C9D(r1.AvO());
    }

    public final boolean CKF() {
        return this.A09.CKF();
    }

    public final void Cot() {
        C234502xy r1 = this.A09;
        this.A04 = r1.CFv();
        r1.Eqq(0.0f);
        this.A07 = true;
    }

    public final void DNP() {
        C234502xy r1 = this.A09;
        if (r1.CKF()) {
            this.A08 = !isPlaying();
            this.A06 = r1.AvO();
            r1.release();
            this.A0A.A00();
        }
    }

    public final void Dxa() {
        C234502xy r2 = this.A09;
        if (r2.CKF()) {
            r2.pause();
            int i = this.A05;
            this.A03 = true;
            r2.seekTo(i);
        }
    }

    public final void DyD(int i) {
        C234502xy r2 = this.A09;
        if (r2.CKF()) {
            this.A03 = true;
            r2.seekTo(this.A05 + i);
        }
    }

    public final void DyQ() {
        C234502xy r1 = this.A09;
        if (r1.CKF()) {
            r1.E2p();
        }
    }

    public final void DyY() {
        C234502xy r1 = this.A09;
        if (r1.CKF()) {
            r1.pause();
        }
        List list = this.A0B;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C357748Zm) list.get(i)).DTH();
        }
    }

    public final void E2p() {
        C354228Ld r0 = this.A00;
        if (r0 != null) {
            r0.E2v();
        }
    }

    public final void EE8(C357748Zm r2) {
        this.A0B.remove(r2);
    }

    public final void Edo(int i) {
        this.A05 = i;
        this.A03 = true;
        this.A09.seekTo(i);
    }

    public final void Eqq(float f) {
        this.A09.Eqq(f);
    }

    public final void FIf() {
        if (this.A07) {
            this.A09.Eqq(this.A04);
            this.A07 = false;
        }
    }

    public final boolean isPlaying() {
        C234502xy r1 = this.A09;
        if (!r1.CKF()) {
            return false;
        }
        if (r1.isPlaying() || this.A01 != null) {
            return true;
        }
        return false;
    }

    public final void onCurrentTrackPlayTimeUpdated(int i) {
        List list = this.A0B;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C357748Zm) list.get(i2)).DTI(i);
        }
    }

    public final void onCurrentTrackPlaybackStarted() {
        List list = this.A0B;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C357748Zm) list.get(i)).DTC();
        }
    }

    public final void onCurrentTrackPrepared(int i) {
        C354228Ld r0 = this.A00;
        if (r0 != null) {
            int CDy = r0.CDy();
            List list = this.A0B;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C357748Zm) list.get(i2)).DTD(i, CDy);
            }
        }
    }

    public final void onCurrentTrackSeekComplete() {
        AnonymousClass8LW r2 = this.A01;
        this.A01 = null;
        boolean z = this.A03;
        this.A03 = false;
        if (z && r2 != null) {
            r2.Exk();
        }
    }

    public final void onCurrentTrackStartedPlaying() {
        List list = this.A0B;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C357748Zm) list.get(i)).DTG();
        }
    }

    public final void pause() {
        C354228Ld r0 = this.A00;
        if (r0 != null) {
            r0.E29();
        }
        C234502xy r1 = this.A09;
        if (r1.CKF()) {
            r1.pause();
        }
    }

    public final void release() {
        this.A09.release();
        this.A06 = null;
        this.A05 = 0;
        this.A03 = false;
        this.A08 = false;
    }

    public final void DnX() {
        release();
        this.A02 = false;
    }

    public final void onPause() {
        DNP();
    }

    public final void onResume() {
        DNQ();
    }
}
