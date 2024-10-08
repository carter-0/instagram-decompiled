package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;

/* renamed from: X.IWe  reason: case insensitive filesystem */
public final class C57295IWe implements G6H {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        AudioPageMetadata audioPageMetadata;
        Uri uri2 = uri;
        0qQ.A0B(uri2, 0);
        String queryParameter = uri2.getQueryParameter("audio_id");
        if (queryParameter != null) {
            audioPageMetadata = new AudioPageMetadata((AudioFilterType) null, (ImageUrl) null, (ImageUrl) null, (MusicAttributionConfig) null, (AudioType) null, (MusicDataSource) null, queryParameter, (String) null, (String) null, queryParameter, (String) null, (String) null, (String) null, (String) null, (String) null, queryParameter, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false);
        } else {
            audioPageMetadata = null;
        }
        UserSession userSession = this.A01;
        Class<ModalActivity> cls = ModalActivity.class;
        String A0j = AnonymousClass7TG.A0j();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("args_audio_model", audioPageMetadata);
        A0a.putString(AnonymousClass000.A00(510), A0j);
        if (queryParameter != null) {
            A0a.putString("audio_id", queryParameter);
        }
        DbU.A0w(this.A00, A0a, userSession, cls, "audio_page");
    }

    public C57295IWe(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }
}
