package X;

import com.instagram.creation.fragment.AlbumEditFragment;

/* renamed from: X.KUk  reason: case insensitive filesystem */
public final class C61987KUk extends C65502LuQ {
    public final int A00;
    public final Object A01;

    public C61987KUk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCurrentTrackCompleted() {
        C357318Xk r1;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C59962JcV jcV = (C59962JcV) obj;
            C234502xy r12 = jcV.A0R;
            if (r12 != null) {
                r12.seekTo(0);
            }
            C234502xy r0 = jcV.A0R;
            if (r0 != null) {
                r0.pause();
            }
            r1 = jcV.A0H;
        } else {
            AlbumEditFragment albumEditFragment = (AlbumEditFragment) obj;
            C234502xy r13 = albumEditFragment.A0P;
            if (r13 != null) {
                r13.seekTo(0);
            }
            C234502xy r02 = albumEditFragment.A0P;
            if (r02 != null) {
                r02.pause();
            }
            r1 = albumEditFragment.A0I;
        }
        if (r1 != null) {
            r1.A03(AnonymousClass8ZH.PLAY);
        }
    }

    public final void onCurrentTrackPlaybackStarted() {
    }

    public final void onCurrentTrackStartedPlaying() {
    }

    public final void onCurrentTrackStopped() {
    }

    public final void onCurrentTrackPlayTimeUpdated(int i) {
    }

    public final void onCurrentTrackPrepared(int i) {
    }
}
