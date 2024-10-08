package X;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.AbJ  reason: case insensitive filesystem */
public final class C40386AbJ implements C66567MWv {
    public final AnonymousClass4MM A00;

    public final void ETr(L92 l92, int i) {
        try {
            Uri fromFile = Uri.fromFile(AnonymousClass7TE.A0t(l92.A04));
            AnonymousClass4MM r1 = this.A00;
            r1.ETv(fromFile, (Integer) null, (String) null, C59767JXi.__redex_internal_original_name, true, false);
            r1.E3n((ViewGroup) null, (Integer) null);
            r1.seekTo(i);
        } catch (IOException e) {
            0kD.A07("ClipsReviewPlayer", AnonymousClass7TG.A0m(e, "failed to prepare video for playback: ", AnonymousClass7TE.A1A()), (Throwable) null);
        }
    }

    public final void EcI(C41820B2a b2a) {
        this.A00.A0M = new C390149qo(b2a);
    }

    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    public final boolean isPlaying() {
        return this.A00.A09.A0I.A0J();
    }

    public final void pause() {
        this.A00.pause();
    }

    public final void release() {
        this.A00.ECQ(false);
    }

    public final void reset() {
        this.A00.reset();
    }

    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    public final void setSurface(Surface surface) {
        this.A00.setSurface(surface);
    }

    public final void start() {
        this.A00.start();
    }

    public C40386AbJ(Context context, UserSession userSession) {
        AnonymousClass4MM r1 = new AnonymousClass4MM(context, userSession, "clips_review");
        r1.Eqq(1.0f);
        this.A00 = r1;
    }
}
