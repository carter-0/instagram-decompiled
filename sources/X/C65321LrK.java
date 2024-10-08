package X;

import android.app.Activity;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.urlhandlers.collabs.IgEditCollaboratorsUrlHandlerActivity;

/* renamed from: X.LrK  reason: case insensitive filesystem */
public final class C65321LrK implements G73 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65321LrK(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void DoN(1Xj r15) {
        String str;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r15, 0);
                C66475MTd mTd = (C66475MTd) this.A01;
                C67161s9 A1N = r15.A1N();
                if (A1N == null || !A1N.getMashupsAllowed()) {
                    mTd.D81();
                    return;
                } else {
                    mTd.DdC(r15);
                    return;
                }
            case 1:
                0qQ.A0B(r15, 0);
                IgEditCollaboratorsUrlHandlerActivity.A00((UserSession) this.A01, r15, (IgEditCollaboratorsUrlHandlerActivity) this.A02);
                return;
            default:
                0qQ.A0B(r15, 0);
                K6e k6e = (K6e) this.A02;
                View view = (View) this.A01;
                k6e.A01 = r15;
                AudioOverlayTrack audioOverlayTrack = k6e.A02;
                if (audioOverlayTrack != null) {
                    MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                    if (musicAssetModel != null) {
                        boolean z = k6e.A06;
                        C357918a4 r1 = k6e.A03;
                        if (r1 == null) {
                            str = "musicOverlayEditController";
                        } else if (z) {
                            r1.A0K(musicAssetModel, audioOverlayTrack.A03, true);
                        } else {
                            r1.A0L(musicAssetModel, true);
                        }
                    }
                    C263754Nf r7 = new C263754Nf((Object) r15, 0);
                    k6e.A01().Ech(true);
                    ((AnonymousClass4M1) k6e.A01()).A0Z = true;
                    k6e.A01().E4H(new C263794Nj((SimpleVideoLayout) view.findViewById(R.id.clips_video_player), new C263414Lx(false, false, false, false), r15.CEL(), r7, (String) null, "clips_edit_metadata_preview", 0.0f, -1, k6e.A01().getCurrentPositionMs(), false));
                    return;
                }
                str = "audioTrack";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void onFail(String str) {
        switch (this.A00) {
            case 0:
                ((C66475MTd) this.A01).D81();
                return;
            case 1:
                ((Activity) this.A02).finish();
                return;
            default:
                0wb.A03(K6e.__redex_internal_original_name, 002.A0R("Failed to fetch media: ", str));
                return;
        }
    }
}
