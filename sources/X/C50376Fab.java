package X;

import android.os.Bundle;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* renamed from: X.Fab  reason: case insensitive filesystem */
public final class C50376Fab implements C51867G5e {
    public final ChannelCreationSource A00;

    public final void Cos(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        bundle.putParcelable("social_channel_creation_source", this.A00);
    }

    public C50376Fab(ChannelCreationSource channelCreationSource) {
        this.A00 = channelCreationSource;
    }
}
